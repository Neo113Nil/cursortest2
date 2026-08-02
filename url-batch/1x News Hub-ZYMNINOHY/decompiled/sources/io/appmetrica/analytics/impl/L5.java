package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;

/* loaded from: classes.dex */
public final class L5 {

    /* renamed from: a, reason: collision with root package name */
    public final C0710o f6255a;

    /* renamed from: b, reason: collision with root package name */
    public final IReporter f6256b;

    /* renamed from: c, reason: collision with root package name */
    public Context f6257c;

    /* renamed from: d, reason: collision with root package name */
    public final K5 f6258d;

    public L5(C0710o c0710o) {
        this(c0710o, 0);
    }

    public final synchronized void a(Context context) {
        if (this.f6257c == null) {
            Context applicationContext = context.getApplicationContext();
            this.f6255a.a(applicationContext);
            this.f6255a.registerListener(this.f6258d, ActivityEvent.RESUMED, ActivityEvent.PAUSED);
            this.f6257c = applicationContext;
        }
    }

    public L5(C0710o c0710o, IReporter iReporter) {
        this.f6255a = c0710o;
        this.f6256b = iReporter;
        this.f6258d = new K5(this);
    }

    public /* synthetic */ L5(C0710o c0710o, int i3) {
        this(c0710o, AbstractC0919w1.a());
    }

    public final synchronized Context a() {
        return this.f6257c;
    }
}
