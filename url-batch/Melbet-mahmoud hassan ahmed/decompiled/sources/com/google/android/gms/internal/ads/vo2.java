package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class vo2 implements e43<k12, yo2> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ zo2 f13468a;

    vo2(zo2 zo2Var) {
        this.f13468a = zo2Var;
    }

    @Override // com.google.android.gms.internal.ads.e43
    public final /* bridge */ /* synthetic */ yo2 apply(k12 k12Var) {
        du2 e7;
        yo2 yo2Var;
        io0.e("", k12Var);
        a3.r1.k("Failed to get a cache key, reverting to legacy flow.");
        zo2 zo2Var = this.f13468a;
        e7 = zo2Var.e();
        zo2Var.f15215d = new yo2(null, e7, null);
        yo2Var = this.f13468a.f15215d;
        return yo2Var;
    }
}
