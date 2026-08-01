package lb;

import android.location.Location;
import ea.f;
import java.math.BigDecimal;
import java.math.RoundingMode;
import nb.b;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements b, kb.a {
    private final f _applicationService;
    private final nb.a _controller;
    private final ob.a _prefs;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final sa.a _time;
    private boolean locationCoarse;

    public a(f fVar, sa.a aVar, ob.a aVar2, com.onesignal.user.internal.properties.b bVar, nb.a aVar3) {
        fVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        bVar.getClass();
        aVar3.getClass();
        this._applicationService = fVar;
        this._time = aVar;
        this._prefs = aVar2;
        this._propertiesModelStore = bVar;
        this._controller = aVar3;
        aVar3.subscribe(this);
    }

    private final void capture(Location location) {
        mb.a aVar = new mb.a();
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

    @Override // kb.a
    public void captureLastLocation() {
        Location lastLocation = this._controller.getLastLocation();
        if (lastLocation != null) {
            capture(lastLocation);
        } else {
            this._prefs.setLastLocationTime(this._time.getCurrentTimeMillis());
        }
    }

    @Override // kb.a
    public boolean getLocationCoarse() {
        return this.locationCoarse;
    }

    @Override // nb.b
    public void onLocationChanged(Location location) {
        location.getClass();
        com.onesignal.debug.internal.logging.b.debug$default("LocationController fireCompleteForLocation with location: " + location, null, 2, null);
        capture(location);
    }

    @Override // kb.a
    public void setLocationCoarse(boolean z10) {
        this.locationCoarse = z10;
    }
}
