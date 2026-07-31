package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class e54 implements k74 {

    /* renamed from: f, reason: collision with root package name */
    protected final k74[] f4499f;

    public e54(k74[] k74VarArr) {
        this.f4499f = k74VarArr;
    }

    @Override // com.google.android.gms.internal.ads.k74
    public final long a() {
        long j7 = Long.MAX_VALUE;
        for (k74 k74Var : this.f4499f) {
            long a7 = k74Var.a();
            if (a7 != Long.MIN_VALUE) {
                j7 = Math.min(j7, a7);
            }
        }
        if (j7 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j7;
    }

    @Override // com.google.android.gms.internal.ads.k74
    public final boolean b(long j7) {
        boolean z6;
        boolean z7 = false;
        do {
            long c7 = c();
            if (c7 == Long.MIN_VALUE) {
                break;
            }
            z6 = false;
            for (k74 k74Var : this.f4499f) {
                long c8 = k74Var.c();
                boolean z8 = c8 != Long.MIN_VALUE && c8 <= j7;
                if (c8 == c7 || z8) {
                    z6 |= k74Var.b(j7);
                }
            }
            z7 |= z6;
        } while (z6);
        return z7;
    }

    @Override // com.google.android.gms.internal.ads.k74
    public final long c() {
        long j7 = Long.MAX_VALUE;
        for (k74 k74Var : this.f4499f) {
            long c7 = k74Var.c();
            if (c7 != Long.MIN_VALUE) {
                j7 = Math.min(j7, c7);
            }
        }
        if (j7 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j7;
    }

    @Override // com.google.android.gms.internal.ads.k74
    public final void f(long j7) {
        for (k74 k74Var : this.f4499f) {
            k74Var.f(j7);
        }
    }

    @Override // com.google.android.gms.internal.ads.k74
    public final boolean n() {
        for (k74 k74Var : this.f4499f) {
            if (k74Var.n()) {
                return true;
            }
        }
        return false;
    }
}
