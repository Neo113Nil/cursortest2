package io.appmetrica.analytics.impl;

import android.app.Activity;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2766l implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f39364a = new HashSet();

    public C2766l(@NonNull C2818n c2818n) {
        c2818n.registerListener(this, new ActivityEvent[0]);
    }

    public final synchronized void a(@NonNull InterfaceC2740k interfaceC2740k) {
        this.f39364a.add(interfaceC2740k);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(@NonNull Activity activity, @NonNull ActivityEvent activityEvent) {
        C3082x4.l().f40118c.a().execute(new RunnableC2714j(this, activity));
    }

    public final void a(@NonNull Activity activity) {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f39364a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C2864oj) ((InterfaceC2740k) it.next())).a(activity);
        }
    }
}
