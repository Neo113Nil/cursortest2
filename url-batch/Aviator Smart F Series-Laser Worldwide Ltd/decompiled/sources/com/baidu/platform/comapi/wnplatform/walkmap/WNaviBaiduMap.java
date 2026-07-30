package com.baidu.platform.comapi.wnplatform.walkmap;

import android.graphics.Point;
import android.os.Bundle;
import com.arthenica.ffmpegkit.x;
import com.baidu.mapapi.map.Marker;
import com.baidu.mapapi.map.Overlay;
import com.baidu.platform.comjni.map.basemap.NABaseMap;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.gms.common.util.GmsVersion;

/* loaded from: classes2.dex */
public class WNaviBaiduMap {

    /* renamed from: a, reason: collision with root package name */
    private static long f10541a;

    /* renamed from: b, reason: collision with root package name */
    private static WNaviBaiduMap f10542b;

    /* renamed from: c, reason: collision with root package name */
    private NABaseMap f10543c = new NABaseMap();

    public static void clearOverlay(Overlay overlay) {
        if (overlay instanceof Marker) {
            overlay.remove();
        }
    }

    public static void clearOverlays() {
    }

    public static long getId() {
        return f10541a;
    }

    public static synchronized WNaviBaiduMap getInstance() {
        WNaviBaiduMap wNaviBaiduMap;
        synchronized (WNaviBaiduMap.class) {
            try {
                if (f10542b == null) {
                    f10542b = new WNaviBaiduMap();
                }
                wNaviBaiduMap = f10542b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wNaviBaiduMap;
    }

    public static int getScaleDis(int i8) {
        switch (i8) {
            case 1:
                return 10000000;
            case 2:
                return GmsVersion.VERSION_LONGHORN;
            case 3:
                return 2000000;
            case 4:
                return 1000000;
            case 5:
                return 500000;
            case 6:
                return 200000;
            case 7:
                return AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND;
            case 8:
                return 50000;
            case 9:
                return 25000;
            case 10:
                return 20000;
            case 11:
                return 10000;
            case 12:
                return 5000;
            case 13:
                return 2000;
            case 14:
                return 1000;
            case 15:
                return 500;
            case 16:
                return 200;
            case 17:
                return 100;
            case 18:
                return 50;
            case 19:
                return 20;
            case 20:
                return 10;
            case 21:
                return 5;
            case 22:
                return 2;
            default:
                return 0;
        }
    }

    public static void setCompassPosition(Point point) {
    }

    public static void showMapPoi(boolean z7) {
    }

    public void SetStyleMode(int i8) {
    }

    public float getZoomLevel() {
        return 3.0f;
    }

    public float getZoomToBound(Bundle bundle, int i8, int i9) {
        bundle.putInt("hasHW", 1);
        bundle.putInt(x.KEY_WIDTH, i8);
        bundle.putInt(x.KEY_HEIGHT, i9);
        return this.f10543c.getZoomToBound(f10541a, bundle, i8, i9);
    }

    public double getZoomUnitsInMeter() {
        return Math.pow(2.0d, 18.0f - getZoomLevel());
    }

    public void setId(long j8) {
        f10541a = j8;
    }

    public void setSatellite(boolean z7) {
    }
}
