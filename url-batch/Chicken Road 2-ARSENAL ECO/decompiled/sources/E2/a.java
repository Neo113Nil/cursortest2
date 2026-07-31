package E2;

import f2.InterfaceC0365b;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class a implements D2.a {
    private final InterfaceC0365b _prefs;

    public a(InterfaceC0365b _prefs) {
        i.e(_prefs, "_prefs");
        this._prefs = _prefs;
    }

    @Override // D2.a
    public long getLastLocationTime() {
        Long l7 = this._prefs.getLong(com.onesignal.common.threading.a.BASE_THREAD_NAME, "OS_LAST_LOCATION_TIME", -600000L);
        i.b(l7);
        return l7.longValue();
    }

    @Override // D2.a
    public void setLastLocationTime(long j4) {
        this._prefs.saveLong(com.onesignal.common.threading.a.BASE_THREAD_NAME, "OS_LAST_LOCATION_TIME", Long.valueOf(j4));
    }
}
