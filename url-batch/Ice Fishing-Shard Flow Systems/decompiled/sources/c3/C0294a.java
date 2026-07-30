package c3;

import android.location.Location;
import b3.InterfaceC0273a;
import com.onesignal.user.internal.properties.b;
import d3.C0362a;
import e3.InterfaceC0373a;
import e3.InterfaceC0374b;
import f3.InterfaceC0401a;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import v2.f;

/* renamed from: c3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0294a implements InterfaceC0374b, InterfaceC0273a {
    private final f _applicationService;
    private final InterfaceC0373a _controller;
    private final InterfaceC0401a _prefs;
    private final b _propertiesModelStore;
    private final I2.a _time;
    private boolean locationCoarse;

    public C0294a(f _applicationService, I2.a _time, InterfaceC0401a _prefs, b _propertiesModelStore, InterfaceC0373a _controller) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_prefs, "_prefs");
        Intrinsics.checkNotNullParameter(_propertiesModelStore, "_propertiesModelStore");
        Intrinsics.checkNotNullParameter(_controller, "_controller");
        this._applicationService = _applicationService;
        this._time = _time;
        this._prefs = _prefs;
        this._propertiesModelStore = _propertiesModelStore;
        this._controller = _controller;
        _controller.subscribe(this);
    }

    private final void capture(Location location) {
        C0362a c0362a = new C0362a();
        c0362a.setAccuracy(Float.valueOf(location.getAccuracy()));
        c0362a.setBg(Boolean.valueOf(!this._applicationService.isInForeground()));
        c0362a.setType(getLocationCoarse() ? 0 : 1);
        c0362a.setTimeStamp(Long.valueOf(location.getTime()));
        if (getLocationCoarse()) {
            BigDecimal bigDecimal = new BigDecimal(location.getLatitude());
            RoundingMode roundingMode = RoundingMode.HALF_UP;
            c0362a.setLat(Double.valueOf(bigDecimal.setScale(7, roundingMode).doubleValue()));
            c0362a.setLog(Double.valueOf(new BigDecimal(location.getLongitude()).setScale(7, roundingMode).doubleValue()));
        } else {
            c0362a.setLat(Double.valueOf(location.getLatitude()));
            c0362a.setLog(Double.valueOf(location.getLongitude()));
        }
        com.onesignal.user.internal.properties.a aVar = (com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel();
        aVar.setLocationLongitude(c0362a.getLog());
        aVar.setLocationLatitude(c0362a.getLat());
        aVar.setLocationAccuracy(c0362a.getAccuracy());
        aVar.setLocationBackground(c0362a.getBg());
        aVar.setLocationType(c0362a.getType());
        aVar.setLocationTimestamp(c0362a.getTimeStamp());
        this._prefs.setLastLocationTime(this._time.getCurrentTimeMillis());
    }

    @Override // b3.InterfaceC0273a
    public void captureLastLocation() {
        Location lastLocation = this._controller.getLastLocation();
        if (lastLocation != null) {
            capture(lastLocation);
        } else {
            this._prefs.setLastLocationTime(this._time.getCurrentTimeMillis());
        }
    }

    @Override // b3.InterfaceC0273a
    public boolean getLocationCoarse() {
        return this.locationCoarse;
    }

    @Override // e3.InterfaceC0374b
    public void onLocationChanged(Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        com.onesignal.debug.internal.logging.b.debug$default("LocationController fireCompleteForLocation with location: " + location, null, 2, null);
        capture(location);
    }

    @Override // b3.InterfaceC0273a
    public void setLocationCoarse(boolean z7) {
        this.locationCoarse = z7;
    }
}
