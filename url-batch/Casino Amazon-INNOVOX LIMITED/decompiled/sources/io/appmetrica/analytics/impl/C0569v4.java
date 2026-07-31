package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;

/* renamed from: io.appmetrica.analytics.impl.v4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0569v4 implements InterfaceC0191g4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1527a;
    public final C0644y4 b;
    public final ResultReceiver c;

    public C0569v4(Context context, C0644y4 c0644y4, C0445q4 c0445q4) {
        this.f1527a = context;
        this.b = c0644y4;
        this.c = c0445q4.c;
        c0644y4.a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0191g4
    public final void a(Q5 q5, C0445q4 c0445q4) {
        this.b.a(c0445q4.b);
        this.b.a(q5, this);
    }

    public final C0644y4 b() {
        return this.b;
    }

    public final Context c() {
        return this.f1527a;
    }

    public final ResultReceiver d() {
        return this.c;
    }

    public final void a(T3 t3) {
        C6.a(this.c, t3);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0191g4
    public final void a() {
        this.b.b(this);
    }
}
