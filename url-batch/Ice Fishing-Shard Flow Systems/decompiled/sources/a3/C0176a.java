package a3;

import b3.InterfaceC0273a;
import f3.InterfaceC0401a;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import v2.f;
import x2.b;

/* renamed from: a3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0176a implements b {
    private final f _applicationService;
    private final InterfaceC0273a _capturer;
    private final Z2.a _locationManager;
    private final InterfaceC0401a _prefs;
    private final I2.a _time;

    public C0176a(f _applicationService, Z2.a _locationManager, InterfaceC0401a _prefs, InterfaceC0273a _capturer, I2.a _time) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_locationManager, "_locationManager");
        Intrinsics.checkNotNullParameter(_prefs, "_prefs");
        Intrinsics.checkNotNullParameter(_capturer, "_capturer");
        Intrinsics.checkNotNullParameter(_time, "_time");
        this._applicationService = _applicationService;
        this._locationManager = _locationManager;
        this._prefs = _prefs;
        this._capturer = _capturer;
        this._time = _time;
    }

    @Override // x2.b
    public Object backgroundRun(V5.b bVar) {
        this._capturer.captureLastLocation();
        return Unit.f6114a;
    }

    @Override // x2.b
    public Long getScheduleBackgroundRunIn() {
        if (!this._locationManager.isShared()) {
            com.onesignal.debug.internal.logging.b.debug$default("LocationController scheduleUpdate not possible, location shared not enabled", null, 2, null);
            return null;
        }
        if (d3.b.INSTANCE.hasLocationPermission(this._applicationService.getAppContext())) {
            return Long.valueOf(600000 - (this._time.getCurrentTimeMillis() - this._prefs.getLastLocationTime()));
        }
        com.onesignal.debug.internal.logging.b.debug$default("LocationController scheduleUpdate not possible, location permission not enabled", null, 2, null);
        return null;
    }
}
