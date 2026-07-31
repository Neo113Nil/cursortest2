package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;

/* renamed from: io.appmetrica.analytics.impl.a6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2483a6 {

    /* renamed from: a, reason: collision with root package name */
    public final C2818n f38660a;

    /* renamed from: b, reason: collision with root package name */
    public final IReporter f38661b;

    /* renamed from: c, reason: collision with root package name */
    public Context f38662c;

    /* renamed from: d, reason: collision with root package name */
    public final Z5 f38663d;

    public C2483a6(C2818n c2818n) {
        this(c2818n, 0);
    }

    public final synchronized void a(Context context) {
        if (this.f38662c == null) {
            Context applicationContext = context.getApplicationContext();
            this.f38660a.a(applicationContext);
            this.f38660a.registerListener(this.f38663d, ActivityEvent.RESUMED, ActivityEvent.PAUSED);
            this.f38662c = applicationContext;
        }
    }

    public C2483a6(C2818n c2818n, IReporter iReporter) {
        this.f38660a = c2818n;
        this.f38661b = iReporter;
        this.f38663d = new Z5(this);
    }

    public /* synthetic */ C2483a6(C2818n c2818n, int i4) {
        this(c2818n, AbstractC2975t1.a());
    }

    public final synchronized Context a() {
        return this.f38662c;
    }
}
