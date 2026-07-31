package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ea1;
import com.google.android.gms.internal.ads.v61;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class eo2<R extends ea1<AdT>, AdT extends v61> implements ep2<R, cu2<R, AdT>> {

    /* renamed from: a, reason: collision with root package name */
    private R f4684a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f4685b = jc3.b();

    @Override // com.google.android.gms.internal.ads.ep2
    public final /* bridge */ /* synthetic */ cc3 a(fp2 fp2Var, dp2 dp2Var, Object obj) {
        return c(fp2Var, dp2Var, null);
    }

    public final R b() {
        return this.f4684a;
    }

    public final cc3<cu2<R, AdT>> c(fp2 fp2Var, dp2<R> dp2Var, R r7) {
        ca1<R> a7 = dp2Var.a(fp2Var.f5172b);
        a7.l(new kp2(true));
        R f7 = a7.f();
        this.f4684a = f7;
        final z71 a8 = f7.a();
        final cu2 cu2Var = new cu2();
        return rb3.m(rb3.n(ib3.E(a8.i()), new xa3() { // from class: com.google.android.gms.internal.ads.do2
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                cu2 cu2Var2 = cu2Var;
                z71 z71Var = a8;
                ds2 ds2Var = (ds2) obj;
                cu2Var2.f3951b = ds2Var;
                Iterator<rr2> it = ds2Var.f4313b.f3933a.iterator();
                boolean z6 = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        Iterator<String> it2 = it.next().f11367a.iterator();
                        while (it2.hasNext()) {
                            if (!it2.next().contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z6 = true;
                        }
                    } else if (z6) {
                        return z71Var.h(rb3.i(ds2Var));
                    }
                }
                return rb3.i(null);
            }
        }, this.f4685b), new e43() { // from class: com.google.android.gms.internal.ads.co2
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj) {
                cu2 cu2Var2 = cu2.this;
                cu2Var2.f3952c = (AdT) obj;
                return cu2Var2;
            }
        }, this.f4685b);
    }

    @Override // com.google.android.gms.internal.ads.ep2
    public final /* synthetic */ Object g() {
        return this.f4684a;
    }
}
