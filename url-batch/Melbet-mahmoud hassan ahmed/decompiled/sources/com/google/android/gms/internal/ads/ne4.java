package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class ne4 {

    /* renamed from: a, reason: collision with root package name */
    protected final td4 f9063a;

    protected ne4(td4 td4Var) {
        this.f9063a = td4Var;
    }

    protected abstract boolean a(dr2 dr2Var);

    protected abstract boolean b(dr2 dr2Var, long j7);

    public final boolean c(dr2 dr2Var, long j7) {
        return a(dr2Var) && b(dr2Var, j7);
    }
}
