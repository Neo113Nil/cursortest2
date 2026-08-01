package jb;

import ea.f;
import ga.b;
import kotlin.Unit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements b {
    private final f _applicationService;
    private final kb.a _capturer;
    private final ib.a _locationManager;
    private final ob.a _prefs;
    private final sa.a _time;

    public a(f fVar, ib.a aVar, ob.a aVar2, kb.a aVar3, sa.a aVar4) {
        fVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        this._applicationService = fVar;
        this._locationManager = aVar;
        this._prefs = aVar2;
        this._capturer = aVar3;
        this._time = aVar4;
    }

    @Override // ga.b
    public Object backgroundRun(ld.a aVar) {
        this._capturer.captureLastLocation();
        return Unit.f5554a;
    }

    @Override // ga.b
    public Long getScheduleBackgroundRunIn() {
        if (!this._locationManager.isShared()) {
            com.onesignal.debug.internal.logging.b.debug$default("LocationController scheduleUpdate not possible, location shared not enabled", null, 2, null);
            return null;
        }
        if (mb.b.INSTANCE.hasLocationPermission(this._applicationService.getAppContext())) {
            return Long.valueOf(600000 - (this._time.getCurrentTimeMillis() - this._prefs.getLastLocationTime()));
        }
        com.onesignal.debug.internal.logging.b.debug$default("LocationController scheduleUpdate not possible, location permission not enabled", null, 2, null);
        return null;
    }
}
