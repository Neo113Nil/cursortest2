package com.baidu.vi;

import android.annotation.SuppressLint;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.github.mikephil.charting.utils.i;
import com.google.android.exoplayer2.C;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class VGps {

    /* renamed from: a, reason: collision with root package name */
    private static int f10704a = 3;

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"HandlerLeak"})
    private static Handler f10705b = new c();

    /* renamed from: c, reason: collision with root package name */
    private GpsStatus.Listener f10706c = new a();

    /* renamed from: d, reason: collision with root package name */
    private LocationListener f10707d = new b();

    /* renamed from: e, reason: collision with root package name */
    private LocationManager f10708e = null;

    /* renamed from: f, reason: collision with root package name */
    private GpsStatus f10709f = null;

    /* renamed from: g, reason: collision with root package name */
    private int f10710g = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f10711h = 0;

    class a implements GpsStatus.Listener {
        a() {
        }

        @Override // android.location.GpsStatus.Listener
        public void onGpsStatusChanged(int i8) {
            if (i8 == 2) {
                VGps.this.updateGps(i.DOUBLE_EPSILON, i.DOUBLE_EPSILON, 0.0f, 0.0f, 0.0f, 0);
                return;
            }
            if (i8 != 4) {
                return;
            }
            if (VGps.this.f10708e != null) {
                if (VGps.this.f10709f == null) {
                    VGps vGps = VGps.this;
                    vGps.f10709f = vGps.f10708e.getGpsStatus(null);
                } else {
                    VGps.this.f10708e.getGpsStatus(VGps.this.f10709f);
                }
            }
            Iterator<GpsSatellite> it = VGps.this.f10709f.getSatellites().iterator();
            int i9 = 0;
            while (it.hasNext()) {
                if (it.next().usedInFix()) {
                    i9++;
                }
            }
            if (i9 < VGps.f10704a && VGps.this.f10710g >= VGps.f10704a) {
                VGps.this.b();
            }
            VGps.this.f10710g = i9;
        }
    }

    class b implements LocationListener {
        b() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            if (location != null) {
                float accuracy = location.hasAccuracy() ? location.getAccuracy() : 0.0f;
                if (VGps.this.f10710g >= VGps.f10704a) {
                    VGps.this.updateGps(location.getLongitude(), location.getLatitude(), (float) (location.getSpeed() * 3.6d), location.getBearing(), accuracy, VGps.this.f10710g);
                } else {
                    VGps.this.b();
                }
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
            VGps.this.updateGps(i.DOUBLE_EPSILON, i.DOUBLE_EPSILON, 0.0f, 0.0f, 0.0f, 0);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i8, Bundle bundle) {
            if (i8 == 0 || i8 == 1) {
                VGps.this.updateGps(i.DOUBLE_EPSILON, i.DOUBLE_EPSILON, 0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    static class c extends Handler {
        c() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            VGps vGps = (VGps) message.obj;
            if (vGps == null) {
                return;
            }
            int i8 = message.what;
            if (i8 == 1) {
                if (vGps.f10710g < VGps.f10704a) {
                    vGps.updateGps(i.DOUBLE_EPSILON, i.DOUBLE_EPSILON, 0.0f, 0.0f, 0.0f, 0);
                }
            } else {
                if (i8 == 2) {
                    if (VIContext.getContext() != null) {
                        vGps.f10708e = (LocationManager) VIContext.getContext().getSystemService("location");
                        vGps.f10708e.addGpsStatusListener(vGps.f10706c);
                        return;
                    }
                    return;
                }
                if (i8 == 3 && vGps.f10708e != null) {
                    vGps.f10708e.removeGpsStatusListener(vGps.f10706c);
                    vGps.f10708e.removeUpdates(vGps.f10707d);
                }
            }
        }
    }

    public int getGpsSatellitesNum() {
        return this.f10710g;
    }

    public boolean init() {
        f10705b.removeMessages(2);
        Handler handler = f10705b;
        handler.sendMessage(handler.obtainMessage(2, this));
        return true;
    }

    public boolean unInit() {
        f10705b.removeMessages(1);
        f10705b.removeMessages(3);
        Handler handler = f10705b;
        handler.sendMessage(handler.obtainMessage(3, this));
        return true;
    }

    public native void updateGps(double d8, double d9, float f8, float f9, float f10, int i8);

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b() {
        if (!f10705b.hasMessages(1)) {
            f10705b.sendMessageDelayed(f10705b.obtainMessage(1, this), C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        }
    }
}
