package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0340m implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f1364a = new HashSet();

    public C0340m(C0390o c0390o) {
        c0390o.registerListener(this, new ActivityEvent[0]);
    }

    public final synchronized void a(InterfaceC0315l interfaceC0315l) {
        this.f1364a.add(interfaceC0315l);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        C0088c4.l().c.a().execute(new RunnableC0289k(this, activity));
    }

    public final void a(Activity activity) {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f1364a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C0103cj) ((InterfaceC0315l) it.next())).a(activity);
        }
    }
}
