package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2610f implements A4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f38947a;

    /* renamed from: b, reason: collision with root package name */
    public final Og f38948b;

    public AbstractC2610f(@NonNull Context context, @NonNull Og og) {
        this.f38947a = context.getApplicationContext();
        this.f38948b = og;
        og.a(this);
        Ia.j().m().b(this);
    }

    @Override // io.appmetrica.analytics.impl.A4
    public final void a(@NonNull C2773l6 c2773l6, @NonNull K4 k4) {
        b(c2773l6, k4);
    }

    @NonNull
    public final Og b() {
        return this.f38948b;
    }

    public abstract void b(@NonNull C2773l6 c2773l6, @NonNull K4 k4);

    @NonNull
    public final Context c() {
        return this.f38947a;
    }

    @Override // io.appmetrica.analytics.impl.A4
    public final void a() {
        this.f38948b.b(this);
        Ia.f37730F.l().a(this);
    }
}
