package com.google.maps.android.heatmaps;

import android.graphics.Bitmap;
import android.graphics.Color;
import androidx.collection.LongSparseArray;
import com.github.mikephil.charting.utils.i;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.TileProvider;
import com.google.maps.android.geometry.Bounds;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.quadtree.PointQuadTree;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class HeatmapTileProvider implements TileProvider {
    public static final Gradient DEFAULT_GRADIENT;
    private static final int[] DEFAULT_GRADIENT_COLORS;
    private static final float[] DEFAULT_GRADIENT_START_POINTS;
    private static final int DEFAULT_MAX_ZOOM = 11;
    private static final int DEFAULT_MIN_ZOOM = 5;
    public static final double DEFAULT_OPACITY = 0.7d;
    public static final int DEFAULT_RADIUS = 20;
    private static final int MAX_RADIUS = 50;
    private static final int MAX_ZOOM_LEVEL = 22;
    private static final int MIN_RADIUS = 10;
    private static final int SCREEN_SIZE = 1280;
    private static final int TILE_DIM = 512;
    static final double WORLD_WIDTH = 1.0d;
    private Bounds mBounds;
    private int[] mColorMap;
    private double mCustomMaxIntensity;
    private Collection<WeightedLatLng> mData;
    private Gradient mGradient;
    private double[] mKernel;
    private double[] mMaxIntensity;
    private double mOpacity;
    private int mRadius;
    private PointQuadTree<WeightedLatLng> mTree;

    public static class Builder {
        private Collection<WeightedLatLng> data;
        private int radius = 20;
        private Gradient gradient = HeatmapTileProvider.DEFAULT_GRADIENT;
        private double opacity = 0.7d;
        private double intensity = i.DOUBLE_EPSILON;

        public HeatmapTileProvider build() {
            if (this.data != null) {
                return new HeatmapTileProvider(this);
            }
            throw new IllegalStateException("No input data: you must use either .data or .weightedData before building");
        }

        public Builder data(Collection<LatLng> collection) {
            return weightedData(HeatmapTileProvider.wrapData(collection));
        }

        public Builder gradient(Gradient gradient) {
            this.gradient = gradient;
            return this;
        }

        public Builder maxIntensity(double d8) {
            this.intensity = d8;
            return this;
        }

        public Builder opacity(double d8) {
            this.opacity = d8;
            if (d8 < i.DOUBLE_EPSILON || d8 > 1.0d) {
                throw new IllegalArgumentException("Opacity must be in range [0, 1]");
            }
            return this;
        }

        public Builder radius(int i8) {
            this.radius = i8;
            if (i8 < 10 || i8 > 50) {
                throw new IllegalArgumentException("Radius not within bounds.");
            }
            return this;
        }

        public Builder weightedData(Collection<WeightedLatLng> collection) {
            this.data = collection;
            if (collection.isEmpty()) {
                throw new IllegalArgumentException("No input points.");
            }
            return this;
        }
    }

    static {
        int[] iArr = {Color.rgb(102, 225, 0), Color.rgb(255, 0, 0)};
        DEFAULT_GRADIENT_COLORS = iArr;
        float[] fArr = {0.2f, 1.0f};
        DEFAULT_GRADIENT_START_POINTS = fArr;
        DEFAULT_GRADIENT = new Gradient(iArr, fArr);
    }

    static Bitmap colorize(double[][] dArr, int[] iArr, double d8) {
        int i8 = iArr[iArr.length - 1];
        double length = (iArr.length - 1) / d8;
        int length2 = dArr.length;
        int[] iArr2 = new int[length2 * length2];
        for (int i9 = 0; i9 < length2; i9++) {
            for (int i10 = 0; i10 < length2; i10++) {
                double d9 = dArr[i10][i9];
                int i11 = (i9 * length2) + i10;
                int i12 = (int) (d9 * length);
                if (d9 == i.DOUBLE_EPSILON) {
                    iArr2[i11] = 0;
                } else if (i12 < iArr.length) {
                    iArr2[i11] = iArr[i12];
                } else {
                    iArr2[i11] = i8;
                }
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(length2, length2, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr2, 0, length2, 0, 0, length2, length2);
        return createBitmap;
    }

    private static Tile convertBitmap(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return new Tile(512, 512, byteArrayOutputStream.toByteArray());
    }

    static double[][] convolve(double[][] dArr, double[] dArr2) {
        int floor = (int) Math.floor(dArr2.length / 2.0d);
        int length = dArr.length;
        int i8 = length - (floor * 2);
        int i9 = floor + i8;
        int i10 = i9 - 1;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, length);
        int i11 = 0;
        while (true) {
            double d8 = i.DOUBLE_EPSILON;
            if (i11 >= length) {
                break;
            }
            int i12 = 0;
            while (i12 < length) {
                double d9 = dArr[i11][i12];
                if (d9 != d8) {
                    int i13 = i11 + floor;
                    if (i10 < i13) {
                        i13 = i10;
                    }
                    int i14 = i13 + 1;
                    int i15 = i11 - floor;
                    for (int i16 = floor > i15 ? floor : i15; i16 < i14; i16++) {
                        double[] dArr4 = dArr3[i16];
                        dArr4[i12] = dArr4[i12] + (dArr2[i16 - i15] * d9);
                    }
                }
                i12++;
                d8 = i.DOUBLE_EPSILON;
            }
            i11++;
        }
        double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i8, i8);
        for (int i17 = floor; i17 < i9; i17++) {
            for (int i18 = 0; i18 < length; i18++) {
                double d10 = dArr3[i17][i18];
                if (d10 != i.DOUBLE_EPSILON) {
                    int i19 = i18 + floor;
                    if (i10 < i19) {
                        i19 = i10;
                    }
                    int i20 = i19 + 1;
                    int i21 = i18 - floor;
                    for (int i22 = floor > i21 ? floor : i21; i22 < i20; i22++) {
                        double[] dArr6 = dArr5[i17 - floor];
                        int i23 = i22 - floor;
                        dArr6[i23] = dArr6[i23] + (dArr2[i22 - i21] * d10);
                    }
                }
            }
        }
        return dArr5;
    }

    static double[] generateKernel(int i8, double d8) {
        double[] dArr = new double[(i8 * 2) + 1];
        for (int i9 = -i8; i9 <= i8; i9++) {
            dArr[i9 + i8] = Math.exp(((-i9) * i9) / ((2.0d * d8) * d8));
        }
        return dArr;
    }

    static Bounds getBounds(Collection<WeightedLatLng> collection) {
        Iterator<WeightedLatLng> it = collection.iterator();
        WeightedLatLng next = it.next();
        double d8 = next.getPoint().f15120x;
        double d9 = next.getPoint().f15120x;
        double d10 = d8;
        double d11 = d9;
        double d12 = next.getPoint().f15121y;
        double d13 = next.getPoint().f15121y;
        while (it.hasNext()) {
            WeightedLatLng next2 = it.next();
            double d14 = next2.getPoint().f15120x;
            double d15 = next2.getPoint().f15121y;
            if (d14 < d10) {
                d10 = d14;
            }
            if (d14 > d11) {
                d11 = d14;
            }
            if (d15 < d12) {
                d12 = d15;
            }
            if (d15 > d13) {
                d13 = d15;
            }
        }
        return new Bounds(d10, d11, d12, d13);
    }

    private double[] getMaxIntensities(int i8) {
        int i9;
        double[] dArr = new double[22];
        if (this.mCustomMaxIntensity != i.DOUBLE_EPSILON) {
            for (int i10 = 0; i10 < 22; i10++) {
                dArr[i10] = this.mCustomMaxIntensity;
            }
            return dArr;
        }
        int i11 = 5;
        while (true) {
            if (i11 >= 11) {
                break;
            }
            dArr[i11] = getMaxValue(this.mData, this.mBounds, i8, (int) (Math.pow(2.0d, i11 - 3) * 1280.0d));
            if (i11 == 5) {
                for (int i12 = 0; i12 < i11; i12++) {
                    dArr[i12] = dArr[i11];
                }
            }
            i11++;
        }
        for (i9 = 11; i9 < 22; i9++) {
            dArr[i9] = dArr[10];
        }
        return dArr;
    }

    static double getMaxValue(Collection<WeightedLatLng> collection, Bounds bounds, int i8, int i9) {
        double d8 = bounds.minX;
        double d9 = bounds.maxX;
        double d10 = bounds.minY;
        double d11 = d9 - d8;
        double d12 = bounds.maxY - d10;
        if (d11 <= d12) {
            d11 = d12;
        }
        double d13 = ((int) ((i9 / (i8 * 2)) + 0.5d)) / d11;
        LongSparseArray longSparseArray = new LongSparseArray();
        double d14 = i.DOUBLE_EPSILON;
        for (WeightedLatLng weightedLatLng : collection) {
            double d15 = weightedLatLng.getPoint().f15120x;
            int i10 = (int) ((weightedLatLng.getPoint().f15121y - d10) * d13);
            long j8 = (int) ((d15 - d8) * d13);
            LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(j8);
            if (longSparseArray2 == null) {
                longSparseArray2 = new LongSparseArray();
                longSparseArray.put(j8, longSparseArray2);
            }
            long j9 = i10;
            Double d16 = (Double) longSparseArray2.get(j9);
            if (d16 == null) {
                d16 = Double.valueOf(i.DOUBLE_EPSILON);
            }
            Double valueOf = Double.valueOf(d16.doubleValue() + weightedLatLng.getIntensity());
            longSparseArray2.put(j9, valueOf);
            if (valueOf.doubleValue() > d14) {
                d14 = valueOf.doubleValue();
            }
        }
        return d14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Collection<WeightedLatLng> wrapData(Collection<LatLng> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<LatLng> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new WeightedLatLng(it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00ab  */
    @Override // com.google.android.gms.maps.model.TileProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Tile getTile(int i8, int i9, int i10) {
        double d8;
        double d9;
        Bounds bounds;
        Bounds bounds2;
        double pow = 1.0d / Math.pow(2.0d, i10);
        double d10 = (this.mRadius * pow) / 512.0d;
        double d11 = ((2.0d * d10) + pow) / ((r10 * 2) + 512);
        double d12 = (i8 * pow) - d10;
        double d13 = ((i8 + 1) * pow) + d10;
        double d14 = (i9 * pow) - d10;
        double d15 = ((i9 + 1) * pow) + d10;
        Collection<WeightedLatLng> arrayList = new ArrayList<>();
        if (d12 < i.DOUBLE_EPSILON) {
            arrayList = this.mTree.search(new Bounds(d12 + 1.0d, 1.0d, d14, d15));
            d8 = -1.0d;
        } else {
            d8 = 1.0d;
            if (d13 <= 1.0d) {
                d9 = 0.0d;
                bounds = new Bounds(d12, d13, d14, d15);
                bounds2 = this.mBounds;
                Collection<WeightedLatLng> collection = arrayList;
                if (bounds.intersects(new Bounds(bounds2.minX - d10, bounds2.maxX + d10, bounds2.minY - d10, bounds2.maxY + d10))) {
                    return TileProvider.NO_TILE;
                }
                Collection<WeightedLatLng> search = this.mTree.search(bounds);
                if (search.isEmpty()) {
                    return TileProvider.NO_TILE;
                }
                int i11 = this.mRadius;
                double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, (i11 * 2) + 512, (i11 * 2) + 512);
                for (WeightedLatLng weightedLatLng : search) {
                    Point point = weightedLatLng.getPoint();
                    int i12 = (int) ((point.f15120x - d12) / d11);
                    int i13 = (int) ((point.f15121y - d14) / d11);
                    double[] dArr2 = dArr[i12];
                    dArr2[i13] = dArr2[i13] + weightedLatLng.getIntensity();
                }
                for (WeightedLatLng weightedLatLng2 : collection) {
                    Point point2 = weightedLatLng2.getPoint();
                    int i14 = (int) (((point2.f15120x + d9) - d12) / d11);
                    int i15 = (int) ((point2.f15121y - d14) / d11);
                    double[] dArr3 = dArr[i14];
                    dArr3[i15] = dArr3[i15] + weightedLatLng2.getIntensity();
                }
                return convertBitmap(colorize(convolve(dArr, this.mKernel), this.mColorMap, this.mMaxIntensity[i10]));
            }
            arrayList = this.mTree.search(new Bounds(i.DOUBLE_EPSILON, d13 - 1.0d, d14, d15));
        }
        d9 = d8;
        bounds = new Bounds(d12, d13, d14, d15);
        bounds2 = this.mBounds;
        Collection<WeightedLatLng> collection2 = arrayList;
        if (bounds.intersects(new Bounds(bounds2.minX - d10, bounds2.maxX + d10, bounds2.minY - d10, bounds2.maxY + d10))) {
        }
    }

    public void setData(Collection<LatLng> collection) {
        setWeightedData(wrapData(collection));
    }

    public void setGradient(Gradient gradient) {
        this.mGradient = gradient;
        this.mColorMap = gradient.generateColorMap(this.mOpacity);
    }

    public void setMaxIntensity(double d8) {
        this.mCustomMaxIntensity = d8;
        setWeightedData(this.mData);
    }

    public void setOpacity(double d8) {
        this.mOpacity = d8;
        setGradient(this.mGradient);
    }

    public void setRadius(int i8) {
        this.mRadius = i8;
        this.mKernel = generateKernel(i8, i8 / 3.0d);
        this.mMaxIntensity = getMaxIntensities(this.mRadius);
    }

    public void setWeightedData(Collection<WeightedLatLng> collection) {
        this.mData = collection;
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("No input points.");
        }
        Bounds bounds = getBounds(this.mData);
        this.mBounds = bounds;
        this.mTree = new PointQuadTree<>(bounds);
        Iterator<WeightedLatLng> it = this.mData.iterator();
        while (it.hasNext()) {
            this.mTree.add(it.next());
        }
        this.mMaxIntensity = getMaxIntensities(this.mRadius);
    }

    private HeatmapTileProvider(Builder builder) {
        this.mData = builder.data;
        this.mRadius = builder.radius;
        this.mGradient = builder.gradient;
        this.mOpacity = builder.opacity;
        this.mCustomMaxIntensity = builder.intensity;
        int i8 = this.mRadius;
        this.mKernel = generateKernel(i8, i8 / 3.0d);
        setGradient(this.mGradient);
        setWeightedData(this.mData);
    }
}
