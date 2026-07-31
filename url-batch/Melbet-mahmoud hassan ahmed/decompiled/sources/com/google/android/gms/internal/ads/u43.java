package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class u43 extends x43 {

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ v43 f12633l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u43(v43 v43Var, z43 z43Var, CharSequence charSequence) {
        super(z43Var, charSequence);
        this.f12633l = v43Var;
    }

    @Override // com.google.android.gms.internal.ads.x43
    public final int c(int i7) {
        return i7;
    }

    @Override // com.google.android.gms.internal.ads.x43
    public final int d(int i7) {
        int i8 = i7 + 4000;
        if (i8 < this.f14034h.length()) {
            return i8;
        }
        return -1;
    }
}
