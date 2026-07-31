package y2;

import T1.f;
import V1.b;
import g2.InterfaceC0391a;
import k5.v;
import kotlin.jvm.internal.i;
import o5.InterfaceC0564d;
import x2.InterfaceC0728a;
import z2.InterfaceC0772a;

/* renamed from: y2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0761a implements b {
    private final f _applicationService;
    private final InterfaceC0772a _capturer;
    private final InterfaceC0728a _locationManager;
    private final D2.a _prefs;
    private final InterfaceC0391a _time;

    public C0761a(f _applicationService, InterfaceC0728a _locationManager, D2.a _prefs, InterfaceC0772a _capturer, InterfaceC0391a _time) {
        i.e(_applicationService, "_applicationService");
        i.e(_locationManager, "_locationManager");
        i.e(_prefs, "_prefs");
        i.e(_capturer, "_capturer");
        i.e(_time, "_time");
        this._applicationService = _applicationService;
        this._locationManager = _locationManager;
        this._prefs = _prefs;
        this._capturer = _capturer;
        this._time = _time;
    }

    @Override // V1.b
    public Object backgroundRun(InterfaceC0564d interfaceC0564d) {
        this._capturer.captureLastLocation();
        return v.f5219a;
    }

    @Override // V1.b
    public Long getScheduleBackgroundRunIn() {
        if (!this._locationManager.isShared()) {
            com.onesignal.debug.internal.logging.b.debug$default("LocationController scheduleUpdate not possible, location shared not enabled", null, 2, null);
            return null;
        }
        if (B2.b.INSTANCE.hasLocationPermission(this._applicationService.getAppContext())) {
            return Long.valueOf(600000 - (this._time.getCurrentTimeMillis() - this._prefs.getLastLocationTime()));
        }
        com.onesignal.debug.internal.logging.b.debug$default("LocationController scheduleUpdate not possible, location permission not enabled", null, 2, null);
        return null;
    }
}
