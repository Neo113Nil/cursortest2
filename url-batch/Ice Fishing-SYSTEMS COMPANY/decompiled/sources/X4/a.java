package X4;

import c5.InterfaceC0541a;
import com.onesignal.debug.internal.logging.b;
import kotlin.jvm.internal.h;
import q7.v;
import t4.f;
import v4.InterfaceC5127b;
import v7.InterfaceC5133d;

/* loaded from: classes2.dex */
public final class a implements InterfaceC5127b {
    private final f _applicationService;
    private final Y4.a _capturer;
    private final W4.a _locationManager;
    private final InterfaceC0541a _prefs;
    private final G4.a _time;

    public a(f _applicationService, W4.a _locationManager, InterfaceC0541a _prefs, Y4.a _capturer, G4.a _time) {
        h.e(_applicationService, "_applicationService");
        h.e(_locationManager, "_locationManager");
        h.e(_prefs, "_prefs");
        h.e(_capturer, "_capturer");
        h.e(_time, "_time");
        this._applicationService = _applicationService;
        this._locationManager = _locationManager;
        this._prefs = _prefs;
        this._capturer = _capturer;
        this._time = _time;
    }

    @Override // v4.InterfaceC5127b
    public Object backgroundRun(InterfaceC5133d interfaceC5133d) {
        this._capturer.captureLastLocation();
        return v.f40183a;
    }

    @Override // v4.InterfaceC5127b
    public Long getScheduleBackgroundRunIn() {
        if (!this._locationManager.isShared()) {
            b.debug$default("LocationController scheduleUpdate not possible, location shared not enabled", null, 2, null);
            return null;
        }
        if (a5.b.INSTANCE.hasLocationPermission(this._applicationService.getAppContext())) {
            return Long.valueOf(600000 - (this._time.getCurrentTimeMillis() - this._prefs.getLastLocationTime()));
        }
        b.debug$default("LocationController scheduleUpdate not possible, location permission not enabled", null, 2, null);
        return null;
    }
}
