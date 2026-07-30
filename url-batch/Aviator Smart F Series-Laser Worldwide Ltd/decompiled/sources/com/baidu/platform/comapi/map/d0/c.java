package com.baidu.platform.comapi.map.d0;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.map.MapController;
import com.baidu.platform.comapi.map.MapViewInterface;
import com.my.lib.data.ErrorCode;
import java.util.IllegalFormatException;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private float f9609a;

    /* renamed from: b, reason: collision with root package name */
    private StringBuffer f9610b = new StringBuffer();

    /* renamed from: c, reason: collision with root package name */
    private StringBuffer f9611c = new StringBuffer();

    /* renamed from: d, reason: collision with root package name */
    private MapController f9612d;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9613a;

        static {
            int[] iArr = new int[b.values().length];
            f9613a = iArr;
            try {
                iArr[b.MOVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9613a[b.FLING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9613a[b.ZOOM_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9613a[b.ZOOM_IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9613a[b.ROTATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9613a[b.DOUBLE_CLICK_ZOOM_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9613a[b.TWO_CLICK_ZOOM_OUT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9613a[b.MOVE_OVERLOOK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    enum b {
        ZOOM_OUT,
        ZOOM_IN,
        FLING,
        MOVE,
        ROTATE,
        DOUBLE_CLICK_ZOOM_IN,
        TWO_CLICK_ZOOM_OUT,
        MOVE_OVERLOOK
    }

    public c(MapController mapController) {
        this.f9612d = mapController;
    }

    private void d(float f8) {
        this.f9609a = f8;
    }

    private boolean e(float f8) {
        return f8 < this.f9609a;
    }

    private boolean f(float f8) {
        return f8 > this.f9609a;
    }

    public void a() {
        a(b.FLING);
    }

    public void b(float f8) {
        a(b.TWO_CLICK_ZOOM_OUT);
        d(f8);
    }

    public void c(float f8) {
        if (f(f8)) {
            a(b.ZOOM_OUT);
        }
        if (e(f8)) {
            a(b.ZOOM_IN);
        }
        d(f8);
    }

    public void a(float f8) {
        a(b.DOUBLE_CLICK_ZOOM_IN);
        d(f8);
    }

    public void d() {
        a(b.MOVE);
    }

    public void b() {
        a(b.MOVE_OVERLOOK);
    }

    private void a(b bVar) {
        MapViewInterface mapView;
        String b8;
        MapController mapController = this.f9612d;
        if (mapController == null || (mapView = mapController.getMapView()) == null) {
            return;
        }
        GeoPoint mapCenter = mapView.getMapCenter();
        try {
            b8 = String.format("(%s,%d,%d,%d,%d)", b(bVar), Double.valueOf(mapCenter.getLongitudeE6()), Double.valueOf(mapCenter.getLatitudeE6()), Integer.valueOf((int) mapView.getZoomLevel()), Long.valueOf(System.currentTimeMillis()));
        } catch (IllegalFormatException unused) {
            b8 = b(bVar);
        }
        StringBuffer stringBuffer = this.f9610b;
        if (stringBuffer == null) {
            return;
        }
        stringBuffer.append(b8);
        StringBuffer stringBuffer2 = this.f9611c;
        if (stringBuffer2 == null) {
            return;
        }
        stringBuffer2.append(b(bVar));
    }

    private String b(b bVar) {
        switch (a.f9613a[bVar.ordinal()]) {
            case 1:
            case 2:
                return "0";
            case 3:
                return "1";
            case 4:
                return "2";
            case 5:
                return ExifInterface.GPS_MEASUREMENT_3D;
            case 6:
                return "4";
            case 7:
                return ErrorCode.PARAMETER_ERROR;
            case 8:
                return "6";
            default:
                return "";
        }
    }

    public void c() {
        a(b.ROTATE);
    }
}
