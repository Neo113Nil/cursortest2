package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zx1 implements nb3<String> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cy1 f15296a;

    zx1(cy1 cy1Var) {
        this.f15296a = cy1Var;
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final /* bridge */ /* synthetic */ void a(String str) {
        long j7;
        Executor executor;
        final String str2 = str;
        synchronized (this) {
            this.f15296a.f3984c = true;
            cy1 cy1Var = this.f15296a;
            long a7 = y2.t.a().a();
            j7 = this.f15296a.f3985d;
            cy1Var.u("com.google.android.gms.ads.MobileAds", true, "", (int) (a7 - j7));
            executor = this.f15296a.f3990i;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.yx1
                @Override // java.lang.Runnable
                public final void run() {
                    zx1 zx1Var = zx1.this;
                    cy1.i(zx1Var.f15296a, str2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final void b(Throwable th) {
        long j7;
        bp0 bp0Var;
        synchronized (this) {
            this.f15296a.f3984c = true;
            cy1 cy1Var = this.f15296a;
            long a7 = y2.t.a().a();
            j7 = this.f15296a.f3985d;
            cy1Var.u("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (a7 - j7));
            bp0Var = this.f15296a.f3986e;
            bp0Var.f(new Exception());
        }
    }
}
