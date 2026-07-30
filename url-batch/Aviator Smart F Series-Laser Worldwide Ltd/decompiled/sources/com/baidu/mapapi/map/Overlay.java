package com.baidu.mapapi.map;

import android.os.Bundle;
import android.util.Log;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.LatLngBounds;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.bmsdk.BmDrawItem;
import com.baidu.platform.comapi.bmsdk.BmLayer;
import com.baidu.platform.comapi.bmsdk.style.BmBitmapResource;
import com.baidu.platform.comapi.bmsdk.style.BmLineStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class Overlay {
    protected static GeoPoint mcLocation;

    /* renamed from: a, reason: collision with root package name */
    String f6117a = System.currentTimeMillis() + "_" + hashCode();

    /* renamed from: b, reason: collision with root package name */
    EncodePointType f6118b;

    /* renamed from: c, reason: collision with root package name */
    int f6119c;

    /* renamed from: d, reason: collision with root package name */
    boolean f6120d;

    /* renamed from: e, reason: collision with root package name */
    Bundle f6121e;

    /* renamed from: f, reason: collision with root package name */
    BmLayer f6122f;
    protected a listener;
    protected BmDrawItem mDrawItem;
    public com.baidu.mapsdkplatform.comapi.map.d type;

    interface a {
        LatLngBounds a(Overlay overlay);

        boolean b(Overlay overlay);

        void c(Overlay overlay);

        void d(Overlay overlay);
    }

    protected Overlay() {
    }

    static void c(List<LatLng> list, Bundle bundle) {
        int size = list.size();
        double[] dArr = new double[size];
        double[] dArr2 = new double[size];
        for (int i8 = 0; i8 < size; i8++) {
            GeoPoint ll2mc = CoordUtil.ll2mc(list.get(i8));
            dArr[i8] = ll2mc.getLongitudeE6();
            dArr2[i8] = ll2mc.getLatitudeE6();
        }
        bundle.putDoubleArray("x_array", dArr);
        bundle.putDoubleArray("y_array", dArr2);
    }

    public static List<List<com.baidu.platform.comapi.bmsdk.b>> circleHoleInfo2BmGeo(List<CircleHoleOptions> list) {
        int size = list.size();
        double[] dArr = new double[size];
        double[] dArr2 = new double[size];
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        for (int i8 = 0; i8 < size; i8++) {
            LatLng holeCenter = list.get(i8).getHoleCenter();
            int holeRadius = list.get(i8).getHoleRadius();
            if (holeCenter == null || holeRadius <= 0) {
                return null;
            }
            int mCDistanceByOneLatLngAndRadius = CoordUtil.getMCDistanceByOneLatLngAndRadius(holeCenter, holeRadius);
            GeoPoint ll2mc = CoordUtil.ll2mc(holeCenter);
            dArr[i8] = ll2mc.getLongitudeE6();
            dArr2[i8] = ll2mc.getLatitudeE6();
            iArr[i8] = mCDistanceByOneLatLngAndRadius;
            iArr2[i8] = i8;
        }
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        while (i9 < size) {
            double d8 = dArr[i9];
            double d9 = dArr2[i9];
            ArrayList arrayList2 = new ArrayList();
            int i10 = 0;
            while (i10 < 360) {
                double d10 = ((i10 * 3.141592653589793d) * 2.0d) / 360;
                arrayList2.add(new com.baidu.platform.comapi.bmsdk.b((Math.cos(d10) * iArr[r20]) + (d8 - mcLocation.getLongitudeE6()) + mcLocation.getLongitudeE6(), (Math.sin(d10) * iArr[r20]) + (d9 - mcLocation.getLatitudeE6()) + mcLocation.getLatitudeE6()));
                i10++;
                i9 = i9;
                size = size;
                dArr = dArr;
            }
            int i11 = size;
            int i12 = i9;
            int i13 = iArr2[i12];
            arrayList.add(arrayList2);
            i9 = i12 + 1;
            size = i11;
        }
        return arrayList;
    }

    static void d(int i8, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putFloat("red", ((i8 >> 16) & 255) / 255.0f);
        bundle2.putFloat("green", ((i8 >> 8) & 255) / 255.0f);
        bundle2.putFloat("blue", (i8 & 255) / 255.0f);
        bundle2.putFloat("alpha", (i8 >>> 24) / 255.0f);
        bundle.putBundle("color", bundle2);
    }

    static void e(int i8, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putFloat("red", ((i8 >> 16) & 255) / 255.0f);
        bundle2.putFloat("green", ((i8 >> 8) & 255) / 255.0f);
        bundle2.putFloat("blue", (i8 & 255) / 255.0f);
        bundle2.putFloat("alpha", (i8 >>> 24) / 255.0f);
        bundle.putBundle("m_sideFaceColor", bundle2);
    }

    static void f(int i8, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putFloat("red", ((i8 >> 16) & 255) / 255.0f);
        bundle2.putFloat("green", ((i8 >> 8) & 255) / 255.0f);
        bundle2.putFloat("blue", (i8 & 255) / 255.0f);
        bundle2.putFloat("alpha", (i8 >>> 24) / 255.0f);
        bundle.putBundle("m_topFaceColor", bundle2);
    }

    public static List<List<com.baidu.platform.comapi.bmsdk.b>> holeInfo2BmGeo(List<HoleOptions> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (HoleOptions holeOptions : list) {
            if (holeOptions instanceof CircleHoleOptions) {
                arrayList2.add((CircleHoleOptions) holeOptions);
            } else if (holeOptions instanceof PolygonHoleOptions) {
                arrayList3.add((PolygonHoleOptions) holeOptions);
            }
        }
        if (arrayList2.size() != 0) {
            arrayList.addAll(circleHoleInfo2BmGeo(arrayList2));
        }
        if (arrayList3.size() != 0) {
            arrayList.addAll(polygonHoleInfo2BmGeo(arrayList3));
        }
        return arrayList;
    }

    public static List<List<com.baidu.platform.comapi.bmsdk.b>> polygonHoleInfo2BmGeo(List<PolygonHoleOptions> list) {
        int size = list.size();
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i8 = 0; i8 < size; i8++) {
            List<LatLng> holePoints = list.get(i8).getHolePoints();
            if (holePoints == null) {
                return null;
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator<LatLng> it = holePoints.iterator();
            while (it.hasNext()) {
                GeoPoint ll2mc = CoordUtil.ll2mc(it.next());
                arrayList3.add(new com.baidu.platform.comapi.bmsdk.b(ll2mc.getLongitudeE6(), ll2mc.getLatitudeE6()));
            }
            arrayList.addAll(holePoints);
            iArr[i8] = holePoints.size();
            iArr2[i8] = i8;
            arrayList2.add(arrayList3);
        }
        return arrayList2;
    }

    Bundle a(Bundle bundle) {
        bundle.putString("id", this.f6117a);
        bundle.putInt("type", this.type.ordinal());
        bundle.putInt("visibility", this.f6120d ? 1 : 0);
        bundle.putInt("z_index", this.f6119c);
        return bundle;
    }

    BmDrawItem b() {
        BmDrawItem bmDrawItem = this.mDrawItem;
        if (bmDrawItem != null) {
            bmDrawItem.c(this.f6120d ? 1 : 0);
            this.mDrawItem.d(this.f6119c);
        }
        return this.mDrawItem;
    }

    public BmLayer getBmLayer() {
        return this.f6122f;
    }

    public BmDrawItem getDrawItem() {
        return this.mDrawItem;
    }

    public Bundle getExtraInfo() {
        return this.f6121e;
    }

    public String getName() {
        return this.f6117a;
    }

    public LatLngBounds getOverlayLatLngBounds() {
        return this.listener.a(this);
    }

    public int getZIndex() {
        return this.f6119c;
    }

    public boolean isRemoved() {
        if (!OverlayUtil.isOverlayUpgrade()) {
            return this.listener.b(this);
        }
        BmLayer bmLayer = this.f6122f;
        return bmLayer == null || bmLayer.a(getName()) == null;
    }

    public boolean isVisible() {
        return this.f6120d;
    }

    public void remove() {
        BmLayer bmLayer;
        BmDrawItem bmDrawItem;
        if (OverlayUtil.isOverlayUpgrade() && (bmLayer = this.f6122f) != null && (bmDrawItem = this.mDrawItem) != null) {
            bmLayer.a(bmDrawItem);
            this.f6122f.b();
            try {
                this.mDrawItem.close();
            } catch (Exception unused) {
                Log.e("DrawItem", "DrawItem close failed");
            }
            this.mDrawItem = null;
        }
        this.listener.c(this);
    }

    public void setBmLayer(BmLayer bmLayer) {
        this.f6122f = bmLayer;
    }

    protected void setDottedBitmapResource(BmLineStyle bmLineStyle, int i8) {
        String str;
        if (bmLineStyle == null) {
            return;
        }
        int i9 = 2;
        if (i8 == 1) {
            str = "CircleDashTexture.png";
        } else {
            str = i8 == 2 ? "lineDash_Rectangle.png" : "lineDashTexture.png";
            i9 = 1;
        }
        bmLineStyle.b(i9);
        BitmapDescriptor fromAsset = BitmapDescriptorFactory.fromAsset(str);
        if (fromAsset != null) {
            bmLineStyle.a(new BmBitmapResource(fromAsset.getBitmap()));
        }
    }

    public void setDrawItem(BmDrawItem bmDrawItem) {
        this.mDrawItem = bmDrawItem;
    }

    public void setExtraInfo(Bundle bundle) {
        this.f6121e = bundle;
    }

    public void setVisible(boolean z7) {
        BmDrawItem bmDrawItem;
        this.f6120d = z7;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
        } else {
            if (this.f6122f == null || (bmDrawItem = this.mDrawItem) == null) {
                return;
            }
            bmDrawItem.c(z7 ? 1 : 0);
            this.f6122f.b();
        }
    }

    public void setZIndex(int i8) {
        this.f6119c = i8;
        this.listener.d(this);
    }

    BmDrawItem toDrawItem() {
        BmDrawItem bmDrawItem = this.mDrawItem;
        if (bmDrawItem == null) {
            return null;
        }
        bmDrawItem.setName(getName());
        this.mDrawItem.c(this.f6120d ? 1 : 0);
        this.mDrawItem.d(this.f6119c);
        return this.mDrawItem;
    }

    static boolean b(List<HoleOptions> list, Bundle bundle) {
        boolean z7;
        boolean z8;
        if (list == null || list.size() == 0) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (HoleOptions holeOptions : list) {
            if (holeOptions instanceof CircleHoleOptions) {
                arrayList.add((CircleHoleOptions) holeOptions);
            } else if (holeOptions instanceof PolygonHoleOptions) {
                arrayList2.add((PolygonHoleOptions) holeOptions);
            }
        }
        if (arrayList.size() != 0) {
            z7 = a(arrayList, bundle);
            bundle.putInt("has_circle_hole", z7 ? 1 : 0);
        } else {
            bundle.putInt("has_circle_hole", 0);
            z7 = false;
        }
        if (arrayList2.size() != 0) {
            z8 = d(arrayList2, bundle);
            bundle.putInt("has_polygon_hole", z8 ? 1 : 0);
        } else {
            bundle.putInt("has_polygon_hole", 0);
            z8 = false;
        }
        return z7 || z8;
    }

    Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("id", this.f6117a);
        bundle.putInt("type", this.type.ordinal());
        return bundle;
    }

    private static boolean d(List<PolygonHoleOptions> list, Bundle bundle) {
        int size = list.size();
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < size; i8++) {
            List<LatLng> holePoints = list.get(i8).getHolePoints();
            if (holePoints == null) {
                return false;
            }
            arrayList.addAll(holePoints);
            iArr[i8] = holePoints.size();
            iArr2[i8] = i8;
        }
        int size2 = arrayList.size();
        if (size2 == 0) {
            return false;
        }
        bundle.putIntArray("polygon_hole_count_array", iArr);
        bundle.putIntArray("polygon_hole_index_array", iArr2);
        double[] dArr = new double[size2];
        double[] dArr2 = new double[size2];
        for (int i9 = 0; i9 < size2; i9++) {
            GeoPoint ll2mc = CoordUtil.ll2mc((LatLng) arrayList.get(i9));
            dArr[i9] = ll2mc.getLongitudeE6();
            dArr2[i9] = ll2mc.getLatitudeE6();
        }
        bundle.putDoubleArray("polygon_hole_x_array", dArr);
        bundle.putDoubleArray("polygon_hole_y_array", dArr2);
        return true;
    }

    private static boolean a(List<CircleHoleOptions> list, Bundle bundle) {
        int size = list.size();
        double[] dArr = new double[size];
        double[] dArr2 = new double[size];
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        for (int i8 = 0; i8 < size; i8++) {
            LatLng holeCenter = list.get(i8).getHoleCenter();
            int holeRadius = list.get(i8).getHoleRadius();
            if (holeCenter == null || holeRadius <= 0) {
                return false;
            }
            GeoPoint ll2mc = CoordUtil.ll2mc(holeCenter);
            dArr[i8] = ll2mc.getLongitudeE6();
            dArr2[i8] = ll2mc.getLatitudeE6();
            iArr[i8] = holeRadius;
            iArr2[i8] = i8;
        }
        bundle.putDoubleArray("circle_hole_x_array", dArr);
        bundle.putDoubleArray("circle_hole_y_array", dArr2);
        bundle.putIntArray("circle_hole_radius_array", iArr);
        bundle.putIntArray("circle_hole_index_array", iArr2);
        return true;
    }

    static void c(int i8, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putFloat("red", ((i8 >> 16) & 255) / 255.0f);
        bundle2.putFloat("green", ((i8 >> 8) & 255) / 255.0f);
        bundle2.putFloat("blue", (i8 & 255) / 255.0f);
        bundle2.putFloat("alpha", (i8 >>> 24) / 255.0f);
        bundle.putBundle("m_side_color", bundle2);
    }

    static void b(int i8, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putFloat("red", ((i8 >> 16) & 255) / 255.0f);
        bundle2.putFloat("green", ((i8 >> 8) & 255) / 255.0f);
        bundle2.putFloat("blue", (i8 & 255) / 255.0f);
        bundle2.putFloat("alpha", (i8 >>> 24) / 255.0f);
        bundle.putBundle("m_center_color", bundle2);
    }

    static void a(int i8, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putFloat("red", ((i8 >> 16) & 255) / 255.0f);
        bundle2.putFloat("green", ((i8 >> 8) & 255) / 255.0f);
        bundle2.putFloat("blue", (i8 & 255) / 255.0f);
        bundle2.putFloat("alpha", (i8 >>> 24) / 255.0f);
        bundle.putBundle("m_floorColor", bundle2);
    }
}
