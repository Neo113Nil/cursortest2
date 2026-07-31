package com.onesignal.flutter;

import A.n;
import N3.j;
import O3.i;
import a1.AbstractC0223a;
import com.onesignal.debug.internal.logging.b;
import java.util.HashMap;
import k2.AbstractC0467a;
import org.json.JSONException;
import u0.C0675e;
import y3.c;
import y3.f;

/* loaded from: classes.dex */
public class OneSignalPushSubscription extends AbstractC0467a implements i, c {

    /* renamed from: j, reason: collision with root package name */
    public static OneSignalPushSubscription f3924j;

    @Override // O3.i
    public final void g(C0675e c0675e, j jVar) {
        h(jVar, new n((AbstractC0467a) this, (Object) c0675e, (Object) jVar, 6));
    }

    @Override // y3.c
    public void onPushSubscriptionChange(f fVar) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("current", AbstractC0223a.n(fVar.getCurrent()));
            hashMap.put("previous", AbstractC0223a.n(fVar.getPrevious()));
            b("OneSignal#onPushSubscriptionChange", hashMap);
        } catch (JSONException e4) {
            e4.getStackTrace();
            b.error("Encountered an error attempting to convert PushSubscriptionChangedState object to hash map:" + e4.toString(), null);
        }
    }
}
