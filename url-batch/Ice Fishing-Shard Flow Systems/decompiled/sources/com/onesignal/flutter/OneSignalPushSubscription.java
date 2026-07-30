package com.onesignal.flutter;

import M2.a;
import V6.b;
import a4.InterfaceC0179c;
import a4.f;
import java.util.HashMap;
import org.json.JSONException;
import r4.l;
import s4.n;
import s4.o;
import s4.p;

/* loaded from: classes.dex */
public class OneSignalPushSubscription extends a implements o, InterfaceC0179c {

    /* renamed from: m, reason: collision with root package name */
    public static OneSignalPushSubscription f4551m;

    @Override // s4.o
    public final void onMethodCall(n nVar, p pVar) {
        l lVar = (l) pVar;
        g(lVar, new F.n((a) this, (Object) nVar, (Object) lVar, 7));
    }

    @Override // a4.InterfaceC0179c
    public void onPushSubscriptionChange(f fVar) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("current", b.j(fVar.getCurrent()));
            hashMap.put("previous", b.j(fVar.getPrevious()));
            b("OneSignal#onPushSubscriptionChange", hashMap);
        } catch (JSONException e7) {
            e7.getStackTrace();
            com.onesignal.debug.internal.logging.b.error("Encountered an error attempting to convert PushSubscriptionChangedState object to hash map:" + e7.toString(), null);
        }
    }
}
