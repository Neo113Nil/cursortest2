package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class T1 implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1052a = new ArrayList();
    public volatile C0672z7 b = null;

    public final void a(C0672z7 c0672z7) {
        ArrayList a2;
        synchronized (this) {
            this.b = c0672z7;
            a2 = a();
        }
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            ((InterfaceC0072be) it.next()).consume(c0672z7);
        }
    }

    public final void b() {
        C0088c4.l().e.registerListener(this, ActivityEvent.CREATED);
    }

    public final void c() {
        C0088c4.l().e.unregisterListener(this, ActivityEvent.CREATED);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        Intent intent = (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new R1());
        String dataString = intent == null ? null : intent.getDataString();
        if (TextUtils.isEmpty(dataString)) {
            return;
        }
        S1 s1 = new S1(dataString);
        synchronized (this) {
            C0672z7 c0672z7 = this.b;
            if (c0672z7 == null) {
                this.f1052a.add(s1);
            } else {
                ((A9) C0088c4.l().c.a()).b.post(new Q1(s1, c0672z7));
            }
        }
    }

    public final synchronized ArrayList a() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.f1052a);
        this.f1052a.clear();
        return arrayList;
    }
}
