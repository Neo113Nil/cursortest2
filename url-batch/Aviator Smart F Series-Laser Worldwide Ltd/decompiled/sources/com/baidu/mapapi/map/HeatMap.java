package com.baidu.mapapi.map;

import android.graphics.Color;
import android.os.Bundle;
import android.util.SparseIntArray;
import androidx.collection.LongSparseArray;
import com.baidu.mapapi.map.HeatMapAnimation;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.util.SysOSUtil;
import com.github.mikephil.charting.utils.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class HeatMap {
    public static final Gradient DEFAULT_GRADIENT;
    public static final int DEFAULT_MAX_HIGH = 0;
    public static final int DEFAULT_MAX_LEVEL = 22;
    public static final int DEFAULT_MIN_LEVEL = 4;
    public static final double DEFAULT_OPACITY = 0.6d;
    public static final int DEFAULT_RADIUS = 12;

    /* renamed from: a, reason: collision with root package name */
    private static final SparseIntArray f5828a;

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f5829b;

    /* renamed from: c, reason: collision with root package name */
    private static final float[] f5830c;

    /* renamed from: d, reason: collision with root package name */
    private static int f5831d;
    private ExecutorService A;
    private HashSet<String> B;
    BaiduMap C;
    private int D;

    /* renamed from: e, reason: collision with root package name */
    private int f5832e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f5833f;

    /* renamed from: g, reason: collision with root package name */
    private int f5834g;

    /* renamed from: h, reason: collision with root package name */
    private int f5835h;

    /* renamed from: i, reason: collision with root package name */
    private e<WeightedLatLng> f5836i;

    /* renamed from: j, reason: collision with root package name */
    private Collection<WeightedLatLng> f5837j;

    /* renamed from: k, reason: collision with root package name */
    private List<List<WeightedLatLng>> f5838k;

    /* renamed from: l, reason: collision with root package name */
    private float f5839l;

    /* renamed from: m, reason: collision with root package name */
    private float f5840m;
    protected boolean mIsSetMaxIntensity;

    /* renamed from: n, reason: collision with root package name */
    private HeatMapAnimation f5841n;

    /* renamed from: o, reason: collision with root package name */
    private HeatMapAnimation f5842o;

    /* renamed from: p, reason: collision with root package name */
    private int f5843p;

    /* renamed from: q, reason: collision with root package name */
    private int f5844q;

    /* renamed from: r, reason: collision with root package name */
    private Gradient f5845r;

    /* renamed from: s, reason: collision with root package name */
    private double f5846s;

    /* renamed from: t, reason: collision with root package name */
    private c f5847t;

    /* renamed from: u, reason: collision with root package name */
    private int[] f5848u;

    /* renamed from: v, reason: collision with root package name */
    private float[] f5849v;

    /* renamed from: w, reason: collision with root package name */
    private double[] f5850w;

    /* renamed from: x, reason: collision with root package name */
    private double[] f5851x;

    /* renamed from: y, reason: collision with root package name */
    private List<double[]> f5852y;

    /* renamed from: z, reason: collision with root package name */
    private HashMap<String, Tile> f5853z;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private Collection<WeightedLatLng> f5854a;

        /* renamed from: b, reason: collision with root package name */
        private List<List<WeightedLatLng>> f5855b;

        /* renamed from: c, reason: collision with root package name */
        private int f5856c = 12;

        /* renamed from: d, reason: collision with root package name */
        private int f5857d = 12;

        /* renamed from: e, reason: collision with root package name */
        private Gradient f5858e = HeatMap.DEFAULT_GRADIENT;

        /* renamed from: f, reason: collision with root package name */
        private double f5859f = 0.6d;

        /* renamed from: g, reason: collision with root package name */
        private int f5860g = 0;

        /* renamed from: h, reason: collision with root package name */
        private boolean f5861h = false;

        /* renamed from: i, reason: collision with root package name */
        private int f5862i = 22;

        /* renamed from: j, reason: collision with root package name */
        private int f5863j = 4;

        /* renamed from: k, reason: collision with root package name */
        private float f5864k = 1.0f;

        /* renamed from: l, reason: collision with root package name */
        private float f5865l = 0.0f;

        /* renamed from: m, reason: collision with root package name */
        private boolean f5866m = false;

        /* renamed from: n, reason: collision with root package name */
        private HeatMapAnimation f5867n;

        /* renamed from: o, reason: collision with root package name */
        private HeatMapAnimation f5868o;

        public Builder() {
            HeatMapAnimation.AnimationType animationType = HeatMapAnimation.AnimationType.Linear;
            this.f5867n = new HeatMapAnimation(false, 100, animationType);
            this.f5868o = new HeatMapAnimation(false, 100, animationType);
        }

        public HeatMap build() {
            if (this.f5854a == null && this.f5855b == null) {
                throw new IllegalStateException("BDMapSDKException: No input data: you must use either .data or .weightedData before building");
            }
            return new HeatMap(this, null);
        }

        public Builder data(Collection<LatLng> collection) {
            if (collection == null || collection.isEmpty()) {
                throw new IllegalArgumentException("BDMapSDKException: No input points.");
            }
            if (collection.contains(null)) {
                throw new IllegalArgumentException("BDMapSDKException: input points can not contain null.");
            }
            return weightedData(HeatMap.d(collection));
        }

        public Builder datas(List<List<LatLng>> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("BDMapSDKException: No input datas.");
            }
            if (list.contains(null)) {
                throw new IllegalArgumentException("BDMapSDKException: input points can not contain null.");
            }
            return weightedDatas(HeatMap.b(list));
        }

        public Builder frameAnimation(HeatMapAnimation heatMapAnimation) {
            this.f5868o = heatMapAnimation;
            return this;
        }

        public Builder gradient(Gradient gradient) {
            if (gradient == null) {
                throw new IllegalArgumentException("BDMapSDKException: gradient can not be null");
            }
            this.f5858e = gradient;
            return this;
        }

        public Builder initAnimation(HeatMapAnimation heatMapAnimation) {
            this.f5867n = heatMapAnimation;
            return this;
        }

        public Builder isRadiusMeter(boolean z7) {
            this.f5861h = z7;
            return this;
        }

        public Builder maxHigh(int i8) {
            if (i8 < 0) {
                return this;
            }
            if (i8 > 200) {
                this.f5860g = 200;
                return this;
            }
            this.f5860g = i8;
            return this;
        }

        public Builder maxIntensity(float f8) {
            if (f8 >= 0.0f && f8 > this.f5865l) {
                this.f5864k = f8;
                this.f5866m = true;
            }
            return this;
        }

        public Builder maxShowLevel(int i8) {
            if (i8 < this.f5863j) {
                return this;
            }
            if (i8 > 22) {
                this.f5862i = 22;
            }
            this.f5862i = i8;
            return this;
        }

        public Builder minIntensity(float f8) {
            if (f8 < 0.0f) {
                this.f5865l = 0.0f;
                return this;
            }
            if (f8 >= this.f5864k) {
                return this;
            }
            this.f5865l = f8;
            return this;
        }

        public Builder minShowLevel(int i8) {
            if (i8 < 4) {
                this.f5863j = 4;
                return this;
            }
            if (i8 > this.f5862i) {
                return this;
            }
            this.f5863j = i8;
            return this;
        }

        public Builder opacity(double d8) {
            if (d8 < i.DOUBLE_EPSILON) {
                this.f5859f = i.DOUBLE_EPSILON;
                return this;
            }
            if (d8 > 1.0d) {
                this.f5859f = 1.0d;
                return this;
            }
            this.f5859f = d8;
            return this;
        }

        public Builder radius(int i8) {
            if (i8 < 10) {
                this.f5856c = 10;
                return this;
            }
            if (i8 > 50) {
                this.f5856c = 50;
                return this;
            }
            this.f5856c = i8;
            return this;
        }

        public Builder radiusMeter(int i8) {
            if (i8 < 10) {
                this.f5857d = 10;
                return this;
            }
            if (i8 > 50) {
                this.f5857d = 50;
                return this;
            }
            this.f5857d = i8;
            return this;
        }

        public Builder weightedData(Collection<WeightedLatLng> collection) {
            if (collection == null || collection.isEmpty()) {
                throw new IllegalArgumentException("BDMapSDKException: No input points.");
            }
            if (collection.contains(null)) {
                throw new IllegalArgumentException("BDMapSDKException: input points can not contain null.");
            }
            this.f5854a = collection;
            return this;
        }

        public Builder weightedDatas(List<List<WeightedLatLng>> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("BDMapSDKException: No input points.");
            }
            if (list.contains(null)) {
                throw new IllegalArgumentException("BDMapSDKException: input points can not contain null.");
            }
            this.f5855b = list;
            return this;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5828a = sparseIntArray;
        sparseIntArray.put(3, 8388608);
        sparseIntArray.put(4, 4194304);
        sparseIntArray.put(5, 2097152);
        sparseIntArray.put(6, 1048576);
        sparseIntArray.put(7, 524288);
        sparseIntArray.put(8, 262144);
        sparseIntArray.put(9, 131072);
        sparseIntArray.put(10, 65536);
        sparseIntArray.put(11, 32768);
        sparseIntArray.put(12, 16384);
        sparseIntArray.put(13, 8192);
        sparseIntArray.put(14, 4096);
        sparseIntArray.put(15, 2048);
        sparseIntArray.put(16, 1024);
        sparseIntArray.put(17, 512);
        sparseIntArray.put(18, 256);
        sparseIntArray.put(19, 128);
        sparseIntArray.put(20, 64);
        int[] iArr = {Color.rgb(0, 0, 200), Color.rgb(0, 225, 0), Color.rgb(255, 0, 0)};
        f5829b = iArr;
        float[] fArr = {0.08f, 0.4f, 1.0f};
        f5830c = fArr;
        DEFAULT_GRADIENT = new Gradient(iArr, fArr);
        f5831d = 0;
    }

    /* synthetic */ HeatMap(Builder builder, d dVar) {
        this(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<List<WeightedLatLng>> b(List<List<LatLng>> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<List<LatLng>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((List) d(it.next()));
        }
        return arrayList;
    }

    private void c(Collection<WeightedLatLng> collection) {
        this.f5837j = collection;
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("BDMapSDKException: No input points.");
        }
        c b8 = b(this.f5837j);
        this.f5847t = b8;
        this.f5836i = new e<>(b8);
        Iterator<WeightedLatLng> it = this.f5837j.iterator();
        while (it.hasNext()) {
            this.f5836i.a(it.next());
        }
        this.f5851x = a(this.f5843p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Collection<WeightedLatLng> d(Collection<LatLng> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<LatLng> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new WeightedLatLng(it.next()));
        }
        return arrayList;
    }

    protected HeatMapData getData(int i8, int i9) {
        List<List<WeightedLatLng>> list;
        if (i9 > 23 || i9 < 4 || ((list = this.f5838k) == null && this.f5837j == null)) {
            return null;
        }
        if (list != null) {
            return a(i8, i9);
        }
        if (this.f5837j != null) {
            return b(i8, i9);
        }
        return null;
    }

    public int getMaxHigh() {
        return this.f5832e;
    }

    public boolean isFrameAnimation() {
        HeatMapAnimation heatMapAnimation = this.f5841n;
        if (heatMapAnimation == null) {
            return false;
        }
        return heatMapAnimation.getIsAnimation();
    }

    public boolean isInitAnimation() {
        HeatMapAnimation heatMapAnimation = this.f5842o;
        if (heatMapAnimation == null) {
            return false;
        }
        return heatMapAnimation.getIsAnimation();
    }

    public void removeHeatMap() {
        BaiduMap baiduMap = this.C;
        if (baiduMap != null) {
            baiduMap.a(this);
        }
        List<List<WeightedLatLng>> list = this.f5838k;
        if (list != null) {
            list.clear();
        }
        Collection<WeightedLatLng> collection = this.f5837j;
        if (collection != null) {
            collection.clear();
        }
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt("grid_size", this.D);
        bundle.putFloat("point_size_meter", this.f5844q * 2);
        bundle.putFloat("point_size", this.f5843p * 2);
        bundle.putFloat("max_hight", this.f5832e);
        bundle.putFloat("alpha", (float) this.f5846s);
        List<List<WeightedLatLng>> list = this.f5838k;
        if (list != null) {
            bundle.putInt("frame_count", list.size());
        } else if (this.f5837j != null) {
            bundle.putInt("frame_count", 1);
        }
        bundle.putIntArray("color_array", this.f5848u);
        bundle.putFloatArray("color_start_points", this.f5849v);
        bundle.putBoolean("is_need_init_animation", this.f5842o.getIsAnimation());
        bundle.putBoolean("is_need_frame_animation", this.f5841n.getIsAnimation());
        bundle.putBoolean("point_size_is_meter", this.f5833f);
        bundle.putInt("init_animation_duration", this.f5842o.getDuration());
        bundle.putInt("init_animation_type", this.f5842o.getAnimationType());
        bundle.putInt("frame_animation_duration", this.f5841n.getDuration());
        bundle.putInt("frame_animation_type", this.f5841n.getAnimationType());
        bundle.putFloat("max_intentity", this.f5839l);
        bundle.putFloat("min_intentity", this.f5840m);
        bundle.putFloat("max_show_level", this.f5834g);
        bundle.putFloat("min_show_level", this.f5835h);
        return bundle;
    }

    public void updateData(Collection<LatLng> collection) {
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException("BDMapSDKException: No input points.");
        }
        if (collection.contains(null)) {
            throw new IllegalArgumentException("BDMapSDKException: input points can not contain null.");
        }
        updateWeightedData(d(collection));
    }

    public void updateDatas(List<List<LatLng>> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("BDMapSDKException: No input datas.");
        }
        if (list.contains(null)) {
            throw new IllegalArgumentException("BDMapSDKException: input points can not contain null.");
        }
        updateWeightedDatas(b(list));
    }

    public void updateFrameAnimation(HeatMapAnimation heatMapAnimation) {
        this.f5841n = heatMapAnimation;
    }

    public void updateGradient(Gradient gradient) {
        if (gradient == null) {
            throw new IllegalArgumentException("BDMapSDKException: gradient can not be null");
        }
        this.f5845r = gradient;
        a(gradient);
    }

    public void updateIsRadiusMeter(boolean z7) {
        this.f5833f = z7;
    }

    public void updateMaxHigh(int i8) {
        if (i8 < 0) {
            return;
        }
        if (i8 > 200) {
            this.f5832e = 200;
        } else {
            this.f5832e = i8;
        }
    }

    public void updateMaxIntensity(float f8) {
        if (f8 < 0.0f || f8 <= this.f5840m) {
            return;
        }
        this.f5839l = f8;
    }

    public void updateMaxShowLevel(int i8) {
        if (i8 < this.f5835h) {
            return;
        }
        if (i8 > 22) {
            this.f5834g = 22;
        } else {
            this.f5834g = i8;
        }
    }

    public void updateMinIntensity(float f8) {
        if (f8 < 0.0f) {
            this.f5840m = 0.0f;
        } else {
            if (f8 >= this.f5839l) {
                return;
            }
            this.f5840m = f8;
        }
    }

    public void updateMinShowLevel(int i8) {
        if (i8 < 4) {
            this.f5835h = 4;
        } else {
            if (i8 > this.f5834g) {
                return;
            }
            this.f5835h = i8;
        }
    }

    public void updateOpacity(double d8) {
        if (d8 < i.DOUBLE_EPSILON) {
            this.f5846s = i.DOUBLE_EPSILON;
        } else if (d8 > 1.0d) {
            this.f5846s = 1.0d;
        } else {
            this.f5846s = d8;
        }
    }

    public void updateRadius(int i8) {
        if (i8 < 10) {
            this.f5843p = 10;
        } else if (i8 > 50) {
            this.f5843p = 50;
        } else {
            this.f5843p = i8;
        }
    }

    public void updateRadiusMeter(int i8) {
        if (i8 < 10) {
            this.f5844q = 10;
        } else if (i8 > 50) {
            this.f5844q = 50;
        } else {
            this.f5844q = i8;
        }
    }

    public void updateWeightedData(Collection<WeightedLatLng> collection) {
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException("BDMapSDKException: No input points.");
        }
        if (collection.contains(null)) {
            throw new IllegalArgumentException("BDMapSDKException: input points can not contain null.");
        }
        this.f5837j = collection;
    }

    public void updateWeightedDatas(List<List<WeightedLatLng>> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("BDMapSDKException: No input points.");
        }
        if (list.contains(null)) {
            throw new IllegalArgumentException("BDMapSDKException: input points can not contain null.");
        }
        this.f5838k = list;
    }

    private HeatMap(Builder builder) {
        this.f5832e = 200;
        this.f5833f = false;
        this.f5834g = 22;
        this.f5835h = 4;
        this.D = SysOSUtil.getInstance().getScreenWidth() / 2;
        this.f5853z = new HashMap<>();
        this.A = Executors.newFixedThreadPool(1);
        this.B = new HashSet<>();
        this.f5838k = builder.f5855b;
        this.f5843p = builder.f5856c;
        this.f5844q = builder.f5857d;
        this.f5833f = builder.f5861h;
        this.f5834g = builder.f5862i;
        this.f5835h = builder.f5863j;
        boolean z7 = builder.f5866m;
        this.mIsSetMaxIntensity = z7;
        if (!z7 && this.f5838k != null) {
            this.f5852y = new ArrayList();
            for (int i8 = 0; i8 < this.f5838k.size(); i8++) {
                List<WeightedLatLng> list = this.f5838k.get(i8);
                this.f5837j = list;
                this.f5847t = b(list);
                this.f5852y.add(a(this.f5843p));
            }
        }
        Collection<WeightedLatLng> collection = builder.f5854a;
        this.f5837j = collection;
        if (!this.mIsSetMaxIntensity && collection != null) {
            c(collection);
        }
        this.f5842o = builder.f5867n;
        this.f5841n = builder.f5868o;
        this.f5832e = builder.f5860g;
        this.f5839l = builder.f5864k;
        this.f5840m = builder.f5865l;
        this.f5845r = builder.f5858e;
        this.f5846s = builder.f5859f;
        int i9 = this.f5843p;
        this.f5850w = a(i9, i9 / 3.0d);
        a(this.f5845r);
    }

    private HeatMapData a(int i8, int i9) {
        List<List<WeightedLatLng>> list = this.f5838k;
        if (list == null || i8 >= list.size()) {
            return null;
        }
        List<WeightedLatLng> list2 = this.f5838k.get(i8);
        List<double[]> list3 = this.f5852y;
        return new HeatMapData(list2, (list3 == null || list3.size() <= i8) ? 0.0f : (float) this.f5852y.get(i8)[i9]);
    }

    private HeatMapData b(int i8, int i9) {
        Collection<WeightedLatLng> collection = this.f5837j;
        if (collection == null) {
            return null;
        }
        double[] dArr = this.f5851x;
        return new HeatMapData(collection, dArr != null ? (float) dArr[i9] : 0.0f);
    }

    private synchronized void b() {
        this.f5853z.clear();
    }

    private static c b(Collection<WeightedLatLng> collection) {
        Iterator<WeightedLatLng> it = collection.iterator();
        WeightedLatLng next = it.next();
        double d8 = next.getPoint().x;
        double d9 = d8;
        double d10 = next.getPoint().x;
        double d11 = next.getPoint().y;
        double d12 = next.getPoint().y;
        while (it.hasNext()) {
            WeightedLatLng next2 = it.next();
            double d13 = next2.getPoint().x;
            double d14 = next2.getPoint().y;
            if (d13 < d9) {
                d9 = d13;
            }
            if (d13 > d10) {
                d10 = d13;
            }
            if (d14 < d11) {
                d11 = d14;
            }
            if (d14 > d12) {
                d12 = d14;
            }
        }
        return new c(d9, d10, d11, d12);
    }

    void c() {
        this.A.shutdownNow();
    }

    void a() {
        b();
    }

    private void a(Gradient gradient) {
        this.f5845r = gradient;
        this.f5848u = gradient.a(this.f5846s);
        this.f5849v = gradient.b();
    }

    private double[] a(int i8) {
        int i9;
        double[] dArr = new double[23];
        int i10 = 4;
        while (true) {
            if (i10 >= 11) {
                break;
            }
            dArr[i10] = a(this.f5837j, this.f5847t, i8, (int) (Math.pow(2.0d, i10 - 3) * 1280.0d));
            if (i10 == 4) {
                for (int i11 = 0; i11 < i10; i11++) {
                    dArr[i11] = dArr[i10];
                }
            }
            i10++;
        }
        for (i9 = 11; i9 < 23; i9++) {
            dArr[i9] = dArr[10];
        }
        return dArr;
    }

    private static double[] a(int i8, double d8) {
        double[] dArr = new double[(i8 * 2) + 1];
        for (int i9 = -i8; i9 <= i8; i9++) {
            dArr[i9 + i8] = Math.exp(((-i9) * i9) / ((2.0d * d8) * d8));
        }
        return dArr;
    }

    private static double a(Collection<WeightedLatLng> collection, c cVar, int i8, int i9) {
        double d8 = cVar.f6493a;
        double d9 = cVar.f6495c;
        double d10 = cVar.f6494b;
        double d11 = d9 - d8;
        double d12 = cVar.f6496d - d10;
        if (d11 <= d12) {
            d11 = d12;
        }
        double d13 = ((int) ((i9 / (i8 * 2)) + 0.5d)) / d11;
        LongSparseArray longSparseArray = new LongSparseArray();
        double d14 = i.DOUBLE_EPSILON;
        for (WeightedLatLng weightedLatLng : collection) {
            int i10 = (int) ((weightedLatLng.getPoint().y - d10) * d13);
            long j8 = (int) ((weightedLatLng.getPoint().x - d8) * d13);
            LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(j8);
            if (longSparseArray2 == null) {
                longSparseArray2 = new LongSparseArray();
                longSparseArray.put(j8, longSparseArray2);
            }
            long j9 = i10;
            Double d15 = (Double) longSparseArray2.get(j9);
            if (d15 == null) {
                d15 = Double.valueOf(i.DOUBLE_EPSILON);
            }
            LongSparseArray longSparseArray3 = longSparseArray;
            double d16 = d8;
            Double valueOf = Double.valueOf(d15.doubleValue() + weightedLatLng.intensity);
            longSparseArray2.put(j9, valueOf);
            if (valueOf.doubleValue() > d14) {
                d14 = valueOf.doubleValue();
            }
            longSparseArray = longSparseArray3;
            d8 = d16;
        }
        return d14;
    }
}
