package com.baidu.mapapi.map;

import android.os.Bundle;
import com.arthenica.ffmpegkit.x;
import com.baidu.mapapi.map.GradientLineOptions;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.github.mikephil.charting.utils.i;
import java.util.List;

/* loaded from: classes2.dex */
public class GradientLine extends Overlay {

    /* renamed from: g, reason: collision with root package name */
    List<LatLng> f5793g;

    /* renamed from: h, reason: collision with root package name */
    int[] f5794h;

    /* renamed from: i, reason: collision with root package name */
    int[] f5795i;

    /* renamed from: j, reason: collision with root package name */
    int f5796j = 5;

    /* renamed from: k, reason: collision with root package name */
    GradientLineOptions.LineDirectionCross180 f5797k = GradientLineOptions.LineDirectionCross180.NONE;

    public GradientLine() {
        this.type = com.baidu.mapsdkplatform.comapi.map.d.gradientLine;
    }

    private static void b(int[] iArr, Bundle bundle) {
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        bundle.putIntArray("color_array", iArr);
    }

    @Override // com.baidu.mapapi.map.Overlay
    Bundle a(Bundle bundle) {
        super.a(bundle);
        List<LatLng> list = this.f5793g;
        if (list == null || list.size() < 2) {
            throw new IllegalStateException("BDMapSDKException: when you add GradientLine, you must at least supply 2 points");
        }
        GeoPoint ll2mc = CoordUtil.ll2mc(this.f5793g.get(0));
        bundle.putDouble("location_x", ll2mc.getLongitudeE6());
        bundle.putDouble("location_y", ll2mc.getLatitudeE6());
        bundle.putInt(x.KEY_WIDTH, this.f5796j);
        int[] iArr = this.f5794h;
        if (iArr == null) {
            throw new IllegalStateException("BDMapSDKException: Indexs array can not be null");
        }
        if (iArr.length == 0) {
            throw new IllegalStateException("BDMapSDKException: Indexs array size can not be Equal to zero");
        }
        a(this.f5793g, this.f5797k, bundle);
        a(this.f5794h, bundle);
        int[] iArr2 = this.f5795i;
        if (iArr2 == null) {
            throw new IllegalStateException("BDMapSDKException: colors array can not be null");
        }
        if (iArr2.length == 0) {
            throw new IllegalStateException("BDMapSDKException: colors array size can not be Equal to zero");
        }
        b(iArr2, bundle);
        return bundle;
    }

    public int[] getColors() {
        return this.f5795i;
    }

    public int[] getIndexs() {
        return this.f5794h;
    }

    public GradientLineOptions.LineDirectionCross180 getLineDirectionCross180() {
        return this.f5797k;
    }

    public List<LatLng> getPoints() {
        return this.f5793g;
    }

    public float getWidth() {
        return this.f5796j;
    }

    public void lineDirectionCross180(GradientLineOptions.LineDirectionCross180 lineDirectionCross180) {
        this.f5797k = lineDirectionCross180;
    }

    public void setColorIndex(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("BDMapSDKException: indexList can not empty");
        }
        this.f5794h = iArr;
        this.listener.d(this);
    }

    public void setColorList(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("BDMapSDKException: colorList can not empty");
        }
        this.f5795i = iArr;
        this.listener.d(this);
    }

    public void setPoints(List<LatLng> list) {
        if (list == null) {
            throw new IllegalArgumentException("BDMapSDKException: points list can not be null");
        }
        if (list.size() < 2) {
            throw new IllegalArgumentException("BDMapSDKException: points count can not less than 2");
        }
        if (list.contains(null)) {
            throw new IllegalArgumentException("BDMapSDKException: points list can not contains null");
        }
        this.f5793g = list;
        this.listener.d(this);
    }

    public void setWidth(int i8) {
        if (i8 > 0) {
            this.f5796j = i8;
            this.listener.d(this);
        }
    }

    private static void a(List<LatLng> list, GradientLineOptions.LineDirectionCross180 lineDirectionCross180, Bundle bundle) {
        int size = list.size();
        double[] dArr = new double[size];
        double[] dArr2 = new double[size];
        for (int i8 = 0; i8 < size; i8++) {
            LatLng latLng = list.get(i8);
            GradientLineOptions.LineDirectionCross180 lineDirectionCross1802 = GradientLineOptions.LineDirectionCross180.FROM_EAST_TO_WEST;
            if (lineDirectionCross180 == lineDirectionCross1802 && latLng.longitude < i.DOUBLE_EPSILON) {
                LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude + 360.0d);
                bundle.putInt("lineDirectionCross180", lineDirectionCross1802.ordinal());
                latLng = latLng2;
            } else {
                GradientLineOptions.LineDirectionCross180 lineDirectionCross1803 = GradientLineOptions.LineDirectionCross180.FROM_WEST_TO_EAST;
                if (lineDirectionCross180 == lineDirectionCross1803 && latLng.longitude > i.DOUBLE_EPSILON) {
                    LatLng latLng3 = new LatLng(latLng.latitude, latLng.longitude - 360.0d);
                    bundle.putInt("lineDirectionCross180", lineDirectionCross1803.ordinal());
                    latLng = latLng3;
                } else {
                    bundle.putInt("lineDirectionCross180", GradientLineOptions.LineDirectionCross180.NONE.ordinal());
                }
            }
            GeoPoint ll2mc = CoordUtil.ll2mc(latLng);
            dArr[i8] = ll2mc.getLongitudeE6();
            dArr2[i8] = ll2mc.getLatitudeE6();
        }
        bundle.putDoubleArray("x_array", dArr);
        bundle.putDoubleArray("y_array", dArr2);
    }

    private static void a(int[] iArr, Bundle bundle) {
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        bundle.putIntArray("color_indexs", iArr);
    }
}
