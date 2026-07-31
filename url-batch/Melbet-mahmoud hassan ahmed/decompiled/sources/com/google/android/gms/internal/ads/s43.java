package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class s43 extends x43 {

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ t43 f11664l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s43(t43 t43Var, z43 z43Var, CharSequence charSequence) {
        super(z43Var, charSequence);
        this.f11664l = t43Var;
    }

    @Override // com.google.android.gms.internal.ads.x43
    final int c(int i7) {
        return i7 + 1;
    }

    @Override // com.google.android.gms.internal.ads.x43
    final int d(int i7) {
        b43 b43Var = this.f11664l.f12086a;
        CharSequence charSequence = this.f14034h;
        int length = charSequence.length();
        q43.b(i7, length, "index");
        while (i7 < length) {
            if (b43Var.a(charSequence.charAt(i7))) {
                return i7;
            }
            i7++;
        }
        return -1;
    }
}
