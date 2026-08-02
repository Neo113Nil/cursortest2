package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0780m implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f12313a = new HashSet();

    public C0780m(C0832o c0832o) {
        c0832o.registerListener(this, new ActivityEvent[0]);
    }

    public final synchronized void a(InterfaceC0754l interfaceC0754l) {
        this.f12313a.add(interfaceC0754l);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        C0501b4.l().f11457c.a().execute(new RunnableC0728k(this, activity));
    }

    public final void a(Activity activity) {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f12313a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C0516bj) ((InterfaceC0754l) it.next())).a(activity);
        }
    }
}
