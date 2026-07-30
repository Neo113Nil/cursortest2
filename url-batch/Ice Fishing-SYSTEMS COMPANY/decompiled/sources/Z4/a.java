package Z4;

import a5.C0430a;
import android.location.Location;
import b5.InterfaceC0528a;
import b5.InterfaceC0529b;
import c5.InterfaceC0541a;
import com.onesignal.user.internal.properties.b;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.h;
import t4.f;

/* loaded from: classes2.dex */
public final class a implements InterfaceC0529b, Y4.a {
    private final f _applicationService;
    private final InterfaceC0528a _controller;
    private final InterfaceC0541a _prefs;
    private final b _propertiesModelStore;
    private final G4.a _time;
    private boolean locationCoarse;

    public a(f _applicationService, G4.a _time, InterfaceC0541a _prefs, b _propertiesModelStore, InterfaceC0528a _controller) {
        h.e(_applicationService, "_applicationService");
        h.e(_time, "_time");
        h.e(_prefs, "_prefs");
        h.e(_propertiesModelStore, "_propertiesModelStore");
        h.e(_controller, "_controller");
        this._applicationService = _applicationService;
        this._time = _time;
        this._prefs = _prefs;
        this._propertiesModelStore = _propertiesModelStore;
        this._controller = _controller;
        _controller.subscribe(this);
    }

    private final void capture(Location location) {
        C0430a c0430a = new C0430a();
        c0430a.setAccuracy(Float.valueOf(location.getAccuracy()));
        c0430a.setBg(Boolean.valueOf(!this._applicationService.isInForeground()));
        c0430a.setType(getLocationCoarse() ? 0 : 1);
        c0430a.setTimeStamp(Long.valueOf(location.getTime()));
        if (getLocationCoarse()) {
            BigDecimal bigDecimal = new BigDecimal(location.getLatitude());
            RoundingMode roundingMode = RoundingMode.HALF_UP;
            c0430a.setLat(Double.valueOf(bigDecimal.setScale(7, roundingMode).doubleValue()));
            c0430a.setLog(Double.valueOf(new BigDecimal(location.getLongitude()).setScale(7, roundingMode).doubleValue()));
        } else {
            c0430a.setLat(Double.valueOf(location.getLatitude()));
            c0430a.setLog(Double.valueOf(location.getLongitude()));
        }
        com.onesignal.user.internal.properties.a aVar = (com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel();
        aVar.setLocationLongitude(c0430a.getLog());
        aVar.setLocationLatitude(c0430a.getLat());
        aVar.setLocationAccuracy(c0430a.getAccuracy());
        aVar.setLocationBackground(c0430a.getBg());
        aVar.setLocationType(c0430a.getType());
        aVar.setLocationTimestamp(c0430a.getTimeStamp());
        this._prefs.setLastLocationTime(this._time.getCurrentTimeMillis());
    }

    @Override // Y4.a
    public void captureLastLocation() {
        Location lastLocation = this._controller.getLastLocation();
        if (lastLocation != null) {
            capture(lastLocation);
        } else {
            this._prefs.setLastLocationTime(this._time.getCurrentTimeMillis());
        }
    }

    @Override // Y4.a
    public boolean getLocationCoarse() {
        return this.locationCoarse;
    }

    @Override // b5.InterfaceC0529b
    public void onLocationChanged(Location location) {
        h.e(location, "location");
        com.onesignal.debug.internal.logging.b.debug$default("LocationController fireCompleteForLocation with location: " + location, null, 2, null);
        capture(location);
    }

    @Override // Y4.a
    public void setLocationCoarse(boolean z8) {
        this.locationCoarse = z8;
    }
}
