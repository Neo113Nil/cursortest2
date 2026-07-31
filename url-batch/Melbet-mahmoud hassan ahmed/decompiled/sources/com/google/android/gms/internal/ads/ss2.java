package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class ss2 implements nb3<String> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ eu0 f11954a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cy2 f11955b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ o42 f11956c;

    ss2(eu0 eu0Var, cy2 cy2Var, o42 o42Var) {
        this.f11954a = eu0Var;
        this.f11955b = cy2Var;
        this.f11956c = o42Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
    
        if (r8.f11954a.A().P != false) goto L12;
     */
    @Override // com.google.android.gms.internal.ads.nb3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void a(String str) {
        String str2 = str;
        if (!this.f11954a.A().f11380g0) {
            this.f11955b.b(str2);
            return;
        }
        long b7 = y2.t.a().b();
        String str3 = this.f11954a.D().f12947b;
        y2.t.q();
        int i7 = 1;
        if (!a3.g2.j(this.f11954a.getContext())) {
            if (((Boolean) sw.c().b(m10.J4)).booleanValue()) {
            }
            this.f11956c.i(new q42(b7, str3, str2, i7));
        }
        i7 = 2;
        this.f11956c.i(new q42(b7, str3, str2, i7));
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final void b(Throwable th) {
    }
}
