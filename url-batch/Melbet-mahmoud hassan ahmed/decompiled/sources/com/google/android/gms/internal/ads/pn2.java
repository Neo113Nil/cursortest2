package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class pn2 implements bd2<m41> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ qn2 f10294a;

    pn2(qn2 qn2Var) {
        this.f10294a = qn2Var;
    }

    @Override // com.google.android.gms.internal.ads.bd2
    public final /* bridge */ /* synthetic */ void a(m41 m41Var) {
        in2 in2Var;
        in2 in2Var2;
        m41 m41Var2 = m41Var;
        synchronized (this.f10294a) {
            m41 m41Var3 = this.f10294a.f10771n;
            if (m41Var3 != null) {
                m41Var3.a();
            }
            qn2 qn2Var = this.f10294a;
            qn2Var.f10771n = m41Var2;
            m41Var2.i(qn2Var);
            in2Var = this.f10294a.f10768k;
            qn2 qn2Var2 = this.f10294a;
            in2Var2 = qn2Var2.f10768k;
            in2Var.e(new n41(m41Var2, qn2Var2, in2Var2));
            m41Var2.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.bd2
    public final void zza() {
        synchronized (this.f10294a) {
            this.f10294a.f10771n = null;
        }
    }
}
