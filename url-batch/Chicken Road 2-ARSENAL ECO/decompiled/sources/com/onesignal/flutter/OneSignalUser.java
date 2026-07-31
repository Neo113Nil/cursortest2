package com.onesignal.flutter;

import A.n;
import N3.j;
import O3.i;
import a1.AbstractC0223a;
import k2.AbstractC0467a;
import org.json.JSONException;
import u0.C0675e;
import x3.InterfaceC0730a;
import x3.b;

/* loaded from: classes.dex */
public class OneSignalUser extends AbstractC0467a implements i, InterfaceC0730a {

    /* renamed from: j, reason: collision with root package name */
    public static OneSignalUser f3925j;

    @Override // O3.i
    public final void g(C0675e c0675e, j jVar) {
        h(jVar, new n((AbstractC0467a) this, (Object) c0675e, (Object) jVar, 7));
    }

    @Override // x3.InterfaceC0730a
    public void onUserStateChange(b bVar) {
        try {
            b("OneSignal#onUserStateChange", AbstractC0223a.m(bVar));
        } catch (JSONException e4) {
            e4.getStackTrace();
            com.onesignal.debug.internal.logging.b.error("Encountered an error attempting to convert UserChangedState object to hash map:" + e4.toString(), null);
        }
    }
}
