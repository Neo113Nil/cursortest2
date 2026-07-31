package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class P4 implements A4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f38113a;

    /* renamed from: b, reason: collision with root package name */
    public final S4 f38114b;

    /* renamed from: c, reason: collision with root package name */
    public final ResultReceiver f38115c;

    public P4(@NonNull Context context, @NonNull S4 s4, @NonNull K4 k4) {
        this.f38113a = context;
        this.f38114b = s4;
        this.f38115c = k4.f37863c;
        s4.a(this);
    }

    @Override // io.appmetrica.analytics.impl.A4
    public final void a(@NonNull C2773l6 c2773l6, @NonNull K4 k4) {
        this.f38114b.a(k4.f37862b);
        this.f38114b.a(c2773l6, this);
    }

    @NonNull
    public final S4 b() {
        return this.f38114b;
    }

    @NonNull
    public final Context c() {
        return this.f38113a;
    }

    @NonNull
    public final ResultReceiver d() {
        return this.f38115c;
    }

    public final void a(@NonNull C2849o4 c2849o4) {
        W6.a(this.f38115c, c2849o4);
    }

    @Override // io.appmetrica.analytics.impl.A4
    public final void a() {
        this.f38114b.b(this);
    }
}
