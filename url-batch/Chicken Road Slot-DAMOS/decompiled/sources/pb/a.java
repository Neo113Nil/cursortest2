package pb;

import qa.b;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements ob.a {
    private final b _prefs;

    public a(b bVar) {
        bVar.getClass();
        this._prefs = bVar;
    }

    @Override // ob.a
    public long getLastLocationTime() {
        Long l10 = this._prefs.getLong("OneSignal", "OS_LAST_LOCATION_TIME", -600000L);
        l10.getClass();
        return l10.longValue();
    }

    @Override // ob.a
    public void setLastLocationTime(long j) {
        this._prefs.saveLong("OneSignal", "OS_LAST_LOCATION_TIME", Long.valueOf(j));
    }
}
