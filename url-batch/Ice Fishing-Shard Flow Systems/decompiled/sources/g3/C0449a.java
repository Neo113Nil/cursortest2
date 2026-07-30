package g3;

import H2.b;
import f3.InterfaceC0401a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0449a implements InterfaceC0401a {
    private final b _prefs;

    public C0449a(b _prefs) {
        Intrinsics.checkNotNullParameter(_prefs, "_prefs");
        this._prefs = _prefs;
    }

    @Override // f3.InterfaceC0401a
    public long getLastLocationTime() {
        Long l7 = this._prefs.getLong(com.onesignal.common.threading.a.BASE_THREAD_NAME, "OS_LAST_LOCATION_TIME", -600000L);
        Intrinsics.b(l7);
        return l7.longValue();
    }

    @Override // f3.InterfaceC0401a
    public void setLastLocationTime(long j) {
        this._prefs.saveLong(com.onesignal.common.threading.a.BASE_THREAD_NAME, "OS_LAST_LOCATION_TIME", Long.valueOf(j));
    }
}
