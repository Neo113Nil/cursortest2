package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0809m implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f8754a = new HashSet();

    public C0809m(C0861o c0861o) {
        c0861o.registerListener(this, new ActivityEvent[0]);
    }

    public final synchronized void a(InterfaceC0783l interfaceC0783l) {
        this.f8754a.add(interfaceC0783l);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        C0736j4.l().f8484c.a().execute(new RunnableC0757k(this, activity));
    }

    public final void a(Activity activity) {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f8754a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C0674gj) ((InterfaceC0783l) it.next())).a(activity);
        }
    }
}
