package A2;

import C2.b;
import T1.f;
import android.location.Location;
import g2.InterfaceC0391a;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.i;
import z2.InterfaceC0772a;

/* loaded from: classes.dex */
public final class a implements b, InterfaceC0772a {
    private final f _applicationService;
    private final C2.a _controller;
    private final D2.a _prefs;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final InterfaceC0391a _time;
    private boolean locationCoarse;

    public a(f _applicationService, InterfaceC0391a _time, D2.a _prefs, com.onesignal.user.internal.properties.b _propertiesModelStore, C2.a _controller) {
        i.e(_applicationService, "_applicationService");
        i.e(_time, "_time");
        i.e(_prefs, "_prefs");
        i.e(_propertiesModelStore, "_propertiesModelStore");
        i.e(_controller, "_controller");
        this._applicationService = _applicationService;
        this._time = _time;
        this._prefs = _prefs;
        this._propertiesModelStore = _propertiesModelStore;
        this._controller = _controller;
        _controller.subscribe(this);
    }

    private final void capture(Location location) {
        B2.a aVar = new B2.a();
        aVar.setAccuracy(Float.valueOf(location.getAccuracy()));
        aVar.setBg(Boolean.valueOf(!this._applicationService.isInForeground()));
        aVar.setType(getLocationCoarse() ? 0 : 1);
        aVar.setTimeStamp(Long.valueOf(location.getTime()));
        if (getLocationCoarse()) {
            BigDecimal bigDecimal = new BigDecimal(location.getLatitude());
            RoundingMode roundingMode = RoundingMode.HALF_UP;
            aVar.setLat(Double.valueOf(bigDecimal.setScale(7, roundingMode).doubleValue()));
            aVar.setLog(Double.valueOf(new BigDecimal(location.getLongitude()).setScale(7, roundingMode).doubleValue()));
        } else {
            aVar.setLat(Double.valueOf(location.getLatitude()));
            aVar.setLog(Double.valueOf(location.getLongitude()));
        }
        com.onesignal.user.internal.properties.a aVar2 = (com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel();
        aVar2.setLocationLongitude(aVar.getLog());
        aVar2.setLocationLatitude(aVar.getLat());
        aVar2.setLocationAccuracy(aVar.getAccuracy());
        aVar2.setLocationBackground(aVar.getBg());
        aVar2.setLocationType(aVar.getType());
        aVar2.setLocationTimestamp(aVar.getTimeStamp());
        this._prefs.setLastLocationTime(this._time.getCurrentTimeMillis());
    }

    @Override // z2.InterfaceC0772a
    public void captureLastLocation() {
        Location lastLocation = this._controller.getLastLocation();
        if (lastLocation != null) {
            capture(lastLocation);
        } else {
            this._prefs.setLastLocationTime(this._time.getCurrentTimeMillis());
        }
    }

    @Override // z2.InterfaceC0772a
    public boolean getLocationCoarse() {
        return this.locationCoarse;
    }

    @Override // C2.b
    public void onLocationChanged(Location location) {
        i.e(location, "location");
        com.onesignal.debug.internal.logging.b.debug$default("LocationController fireCompleteForLocation with location: " + location, null, 2, null);
        capture(location);
    }

    @Override // z2.InterfaceC0772a
    public void setLocationCoarse(boolean z5) {
        this.locationCoarse = z5;
    }
}
