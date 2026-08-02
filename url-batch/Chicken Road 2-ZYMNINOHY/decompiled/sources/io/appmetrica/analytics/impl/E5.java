package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;

/* loaded from: classes.dex */
public final class E5 {

    /* renamed from: a, reason: collision with root package name */
    public final C0832o f10237a;

    /* renamed from: b, reason: collision with root package name */
    public final IReporter f10238b;

    /* renamed from: c, reason: collision with root package name */
    public Context f10239c;

    /* renamed from: d, reason: collision with root package name */
    public final D5 f10240d;

    public E5(C0832o c0832o) {
        this(c0832o, 0);
    }

    public final synchronized void a(Context context) {
        if (this.f10239c == null) {
            Context applicationContext = context.getApplicationContext();
            this.f10237a.a(applicationContext);
            this.f10237a.registerListener(this.f10240d, ActivityEvent.RESUMED, ActivityEvent.PAUSED);
            this.f10239c = applicationContext;
        }
    }

    public E5(C0832o c0832o, IReporter iReporter) {
        this.f10237a = c0832o;
        this.f10238b = iReporter;
        this.f10240d = new D5(this);
    }

    public /* synthetic */ E5(C0832o c0832o, int i4) {
        this(c0832o, AbstractC1067x1.a());
    }

    public final synchronized Context a() {
        return this.f10239c;
    }
}
