package com.google.android.gms.internal.play_billing;

import w0.AbstractC1234c;

/* loaded from: classes.dex */
public final class t2 extends r2 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u2 f2935h;

    public t2(u2 u2Var) {
        this.f2935h = u2Var;
    }

    @Override // com.google.android.gms.internal.play_billing.r2
    public final String b() {
        s2 s2Var = (s2) this.f2935h.f2940a.get();
        return s2Var == null ? "Completer object has been garbage collected, future will fail soon" : AbstractC1234c.a("tag=[", String.valueOf(s2Var.f2925a), "]");
    }
}
