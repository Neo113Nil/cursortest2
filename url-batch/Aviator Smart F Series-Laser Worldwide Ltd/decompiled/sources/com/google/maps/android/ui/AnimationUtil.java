package com.google.maps.android.ui;

import android.os.Handler;
import android.os.SystemClock;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;

/* loaded from: classes4.dex */
public class AnimationUtil {

    interface LatLngInterpolator {

        public static class Linear implements LatLngInterpolator {
            @Override // com.google.maps.android.ui.AnimationUtil.LatLngInterpolator
            public LatLng interpolate(float f8, LatLng latLng, LatLng latLng2) {
                double d8 = latLng2.latitude;
                double d9 = latLng.latitude;
                double d10 = f8;
                double d11 = ((d8 - d9) * d10) + d9;
                double d12 = latLng2.longitude - latLng.longitude;
                if (Math.abs(d12) > 180.0d) {
                    d12 -= Math.signum(d12) * 360.0d;
                }
                return new LatLng(d11, (d12 * d10) + latLng.longitude);
            }
        }

        LatLng interpolate(float f8, LatLng latLng, LatLng latLng2);
    }

    public static void animateMarkerTo(final Marker marker, final LatLng latLng) {
        final LatLngInterpolator.Linear linear = new LatLngInterpolator.Linear();
        final LatLng position = marker.getPosition();
        final Handler handler = new Handler();
        final long uptimeMillis = SystemClock.uptimeMillis();
        final AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        handler.post(new Runnable() { // from class: com.google.maps.android.ui.AnimationUtil.1
            long elapsed;

            /* renamed from: t, reason: collision with root package name */
            float f15122t;

            /* renamed from: v, reason: collision with root package name */
            float f15123v;

            @Override // java.lang.Runnable
            public void run() {
                long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
                this.elapsed = uptimeMillis2;
                float f8 = uptimeMillis2 / 2000.0f;
                this.f15122t = f8;
                float interpolation = accelerateDecelerateInterpolator.getInterpolation(f8);
                this.f15123v = interpolation;
                marker.setPosition(linear.interpolate(interpolation, position, latLng));
                if (this.f15122t < 1.0f) {
                    handler.postDelayed(this, 16L);
                }
            }
        });
    }
}
