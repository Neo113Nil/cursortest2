package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;

/* loaded from: classes3.dex */
public final class F5 {

    /* renamed from: a, reason: collision with root package name */
    public final C0390o f839a;
    public final IReporter b;
    public Context c;
    public final E5 d;

    public F5(C0390o c0390o) {
        this(c0390o, 0);
    }

    public final synchronized void a(Context context) {
        if (this.c == null) {
            Context applicationContext = context.getApplicationContext();
            this.f839a.a(applicationContext);
            this.f839a.registerListener(this.d, ActivityEvent.RESUMED, ActivityEvent.PAUSED);
            this.c = applicationContext;
        }
    }

    public F5(C0390o c0390o, IReporter iReporter) {
        this.f839a = c0390o;
        this.b = iReporter;
        this.d = new E5(this);
    }

    public /* synthetic */ F5(C0390o c0390o, int i) {
        this(c0390o, AbstractC0641y1.a());
    }

    public final synchronized Context a() {
        return this.c;
    }
}
