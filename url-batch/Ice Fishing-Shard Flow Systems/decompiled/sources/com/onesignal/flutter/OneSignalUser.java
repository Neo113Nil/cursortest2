package com.onesignal.flutter;

import M2.a;
import Z3.b;
import org.json.JSONException;
import r4.l;
import s4.n;
import s4.o;
import s4.p;

/* loaded from: classes.dex */
public class OneSignalUser extends a implements o, Z3.a {

    /* renamed from: m, reason: collision with root package name */
    public static OneSignalUser f4552m;

    @Override // s4.o
    public final void onMethodCall(n nVar, p pVar) {
        l lVar = (l) pVar;
        g(lVar, new F.n((a) this, (Object) nVar, (Object) lVar, 8));
    }

    @Override // Z3.a
    public void onUserStateChange(b bVar) {
        try {
            b("OneSignal#onUserStateChange", V6.b.i(bVar));
        } catch (JSONException e7) {
            e7.getStackTrace();
            com.onesignal.debug.internal.logging.b.error("Encountered an error attempting to convert UserChangedState object to hash map:" + e7.toString(), null);
        }
    }
}
