package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class rb2 implements bd2<t41> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ sb2 f11099a;

    rb2(sb2 sb2Var) {
        this.f11099a = sb2Var;
    }

    @Override // com.google.android.gms.internal.ads.bd2
    public final /* bridge */ /* synthetic */ void a(t41 t41Var) {
        t41 t41Var2;
        t41 t41Var3;
        t41 t41Var4;
        t41 t41Var5 = t41Var;
        synchronized (this.f11099a) {
            t41Var2 = this.f11099a.f11777l;
            if (t41Var2 != null) {
                t41Var4 = this.f11099a.f11777l;
                t41Var4.a();
            }
            this.f11099a.f11777l = t41Var5;
            t41Var3 = this.f11099a.f11777l;
            t41Var3.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.bd2
    public final void zza() {
        synchronized (this.f11099a) {
            this.f11099a.f11777l = null;
        }
    }
}
