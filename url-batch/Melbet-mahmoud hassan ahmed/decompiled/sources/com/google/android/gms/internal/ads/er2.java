package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class er2 implements cd2<hs1> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4722a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f4723b;

    /* renamed from: c, reason: collision with root package name */
    private final bw0 f4724c;

    /* renamed from: d, reason: collision with root package name */
    private final tq2 f4725d;

    /* renamed from: e, reason: collision with root package name */
    private final ep2<ms1, hs1> f4726e;

    /* renamed from: f, reason: collision with root package name */
    private final fs2 f4727f;

    /* renamed from: g, reason: collision with root package name */
    private final qx2 f4728g;

    /* renamed from: h, reason: collision with root package name */
    private final is2 f4729h;

    /* renamed from: i, reason: collision with root package name */
    private cc3<hs1> f4730i;

    public er2(Context context, Executor executor, bw0 bw0Var, ep2<ms1, hs1> ep2Var, tq2 tq2Var, is2 is2Var, fs2 fs2Var) {
        this.f4722a = context;
        this.f4723b = executor;
        this.f4724c = bw0Var;
        this.f4726e = ep2Var;
        this.f4725d = tq2Var;
        this.f4729h = is2Var;
        this.f4727f = fs2Var;
        this.f4728g = bw0Var.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ls1 j(cp2 cp2Var) {
        ls1 p7 = this.f4724c.p();
        fa1 fa1Var = new fa1();
        fa1Var.c(this.f4722a);
        fa1Var.f(((cr2) cp2Var).f3927a);
        fa1Var.e(this.f4727f);
        p7.a(fa1Var.g());
        p7.c(new mg1().q());
        return p7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (r5 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (r5 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
    
        r6 = r4.f4728g;
        r5.g(false);
        r6.a(r5.i());
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        return false;
     */
    @Override // com.google.android.gms.internal.ads.cd2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(kv kvVar, String str, ad2 ad2Var, bd2<? super hs1> bd2Var) {
        tj0 tj0Var = new tj0(kvVar, str);
        ox2 p7 = ox2.p(this.f4722a, 7, 5, tj0Var.f12234f);
        if (tj0Var.f12235g == null) {
            io0.d("Ad unit ID should not be null for rewarded video ad.");
            this.f4723b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.xq2
                @Override // java.lang.Runnable
                public final void run() {
                    er2.this.h();
                }
            });
        } else {
            cc3<hs1> cc3Var = this.f4730i;
            if (cc3Var == null || cc3Var.isDone()) {
                zs2.a(this.f4722a, tj0Var.f12234f.f7648k);
                if (((Boolean) sw.c().b(m10.A6)).booleanValue() && tj0Var.f12234f.f7648k) {
                    this.f4724c.s().l(true);
                }
                is2 is2Var = this.f4729h;
                is2Var.H(tj0Var.f12235g);
                is2Var.G(pv.i());
                is2Var.d(tj0Var.f12234f);
                ks2 f7 = is2Var.f();
                cr2 cr2Var = new cr2(null);
                cr2Var.f3927a = f7;
                cr2Var.f3928b = null;
                cc3<hs1> a7 = this.f4726e.a(new fp2(cr2Var, null), new dp2() { // from class: com.google.android.gms.internal.ads.wq2
                    @Override // com.google.android.gms.internal.ads.dp2
                    public final ca1 a(cp2 cp2Var) {
                        ls1 j7;
                        j7 = er2.this.j(cp2Var);
                        return j7;
                    }
                }, null);
                this.f4730i = a7;
                rb3.r(a7, new ar2(this, bd2Var, p7, cr2Var), this.f4723b);
                return true;
            }
        }
    }

    final /* synthetic */ void h() {
        this.f4725d.d(dt2.d(6, null, null));
    }

    final void i(int i7) {
        this.f4729h.D().a(i7);
    }

    @Override // com.google.android.gms.internal.ads.cd2
    public final boolean zza() {
        throw null;
    }
}
