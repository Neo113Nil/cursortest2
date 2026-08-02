package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0658m implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f7845a = new HashSet();

    public C0658m(C0710o c0710o) {
        c0710o.registerListener(this, new ActivityEvent[0]);
    }

    public final synchronized void a(InterfaceC0632l interfaceC0632l) {
        this.f7845a.add(interfaceC0632l);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        C0585j4.l().f7594c.a().execute(new RunnableC0606k(this, activity));
    }

    public final void a(Activity activity) {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f7845a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C0523gj) ((InterfaceC0632l) it.next())).a(activity);
        }
    }
}
