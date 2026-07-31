package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class x43 extends v33<String> {

    /* renamed from: h, reason: collision with root package name */
    final CharSequence f14034h;

    /* renamed from: i, reason: collision with root package name */
    final b43 f14035i;

    /* renamed from: j, reason: collision with root package name */
    int f14036j = 0;

    /* renamed from: k, reason: collision with root package name */
    int f14037k;

    protected x43(z43 z43Var, CharSequence charSequence) {
        b43 b43Var;
        b43Var = z43Var.f14944a;
        this.f14035i = b43Var;
        this.f14037k = Integer.MAX_VALUE;
        this.f14034h = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.v33
    protected final /* bridge */ /* synthetic */ String a() {
        int c7;
        int i7 = this.f14036j;
        while (true) {
            int i8 = this.f14036j;
            if (i8 == -1) {
                b();
                return null;
            }
            int d7 = d(i8);
            if (d7 == -1) {
                d7 = this.f14034h.length();
                this.f14036j = -1;
                c7 = -1;
            } else {
                c7 = c(d7);
                this.f14036j = c7;
            }
            if (c7 != i7) {
                if (i7 < d7) {
                    this.f14034h.charAt(i7);
                }
                if (i7 < d7) {
                    this.f14034h.charAt(d7 - 1);
                }
                int i9 = this.f14037k;
                if (i9 == 1) {
                    d7 = this.f14034h.length();
                    this.f14036j = -1;
                    if (d7 > i7) {
                        this.f14034h.charAt(d7 - 1);
                    }
                } else {
                    this.f14037k = i9 - 1;
                }
                return this.f14034h.subSequence(i7, d7).toString();
            }
            int i10 = c7 + 1;
            this.f14036j = i10;
            if (i10 > this.f14034h.length()) {
                this.f14036j = -1;
            }
        }
    }

    abstract int c(int i7);

    abstract int d(int i7);
}
