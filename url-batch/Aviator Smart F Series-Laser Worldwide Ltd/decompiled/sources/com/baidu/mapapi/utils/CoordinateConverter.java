package com.baidu.mapapi.utils;

import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;

/* loaded from: classes2.dex */
public class CoordinateConverter {

    /* renamed from: a, reason: collision with root package name */
    private LatLng f7518a;

    /* renamed from: b, reason: collision with root package name */
    private CoordType f7519b;

    public enum CoordType {
        GPS,
        COMMON,
        BD09LL,
        BD09MC
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7520a;

        static {
            int[] iArr = new int[CoordType.values().length];
            f7520a = iArr;
            try {
                iArr[CoordType.COMMON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7520a[CoordType.GPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7520a[CoordType.BD09LL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7520a[CoordType.BD09MC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static LatLng a(LatLng latLng, String str) {
        if (latLng == null) {
            return null;
        }
        return CoordUtil.Coordinate_encryptEx((float) latLng.longitude, (float) latLng.latitude, str);
    }

    private static LatLng b(LatLng latLng) {
        return a(latLng, "bd09mc");
    }

    private static LatLng c(LatLng latLng) {
        return a(latLng, "gcj02");
    }

    private static LatLng d(LatLng latLng) {
        return a(latLng, "wgs84");
    }

    public LatLng convert() {
        if (this.f7518a == null) {
            return null;
        }
        if (this.f7519b == null) {
            this.f7519b = CoordType.GPS;
        }
        int i8 = a.f7520a[this.f7519b.ordinal()];
        if (i8 == 1) {
            return c(this.f7518a);
        }
        if (i8 == 2) {
            return d(this.f7518a);
        }
        if (i8 == 3) {
            return a(this.f7518a);
        }
        if (i8 != 4) {
            return null;
        }
        return b(this.f7518a);
    }

    public CoordinateConverter coord(LatLng latLng) {
        this.f7518a = latLng;
        return this;
    }

    public CoordinateConverter from(CoordType coordType) {
        this.f7519b = coordType;
        return this;
    }

    private static LatLng a(LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return CoordTrans.baiduToGcj(latLng);
    }
}
