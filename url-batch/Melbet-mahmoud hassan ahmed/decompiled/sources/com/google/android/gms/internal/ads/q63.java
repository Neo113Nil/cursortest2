package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
final class q63 extends t63 {
    q63() {
        super(null);
    }

    static final t63 j(int i7) {
        t63 t63Var;
        t63 t63Var2;
        t63 t63Var3;
        if (i7 < 0) {
            t63Var3 = t63.f12105b;
            return t63Var3;
        }
        if (i7 > 0) {
            t63Var2 = t63.f12106c;
            return t63Var2;
        }
        t63Var = t63.f12104a;
        return t63Var;
    }

    @Override // com.google.android.gms.internal.ads.t63
    public final int a() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.t63
    public final t63 b(int i7, int i8) {
        return j(i7 < i8 ? -1 : i7 > i8 ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.t63
    public final <T> t63 c(T t6, T t7, Comparator<T> comparator) {
        return j(comparator.compare(t6, t7));
    }

    @Override // com.google.android.gms.internal.ads.t63
    public final t63 d(boolean z6, boolean z7) {
        return j(m93.a(z6, z7));
    }

    @Override // com.google.android.gms.internal.ads.t63
    public final t63 e(boolean z6, boolean z7) {
        return j(m93.a(false, false));
    }
}
