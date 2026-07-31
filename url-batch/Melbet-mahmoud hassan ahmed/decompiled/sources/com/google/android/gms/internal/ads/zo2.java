package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ea1;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zo2<R extends ea1<? extends v61>> {

    /* renamed from: a, reason: collision with root package name */
    private final tt2 f15212a;

    /* renamed from: b, reason: collision with root package name */
    private final R f15213b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f15214c;

    /* renamed from: d, reason: collision with root package name */
    private yo2 f15215d;

    public zo2(tt2 tt2Var, R r7, Executor executor) {
        this.f15212a = tt2Var;
        this.f15213b = r7;
        this.f15214c = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final du2 e() {
        ks2 e7 = this.f15213b.e();
        return this.f15212a.b(e7.f7618d, e7.f7620f, e7.f7624j);
    }

    public final cc3<yo2> c() {
        cc3 f7;
        yo2 yo2Var = this.f15215d;
        if (yo2Var != null) {
            return rb3.i(yo2Var);
        }
        if (h30.f6054a.e().booleanValue()) {
            f7 = rb3.f(rb3.m(ib3.E(this.f15213b.a().e(this.f15212a.zza())), new wo2(this), this.f15214c), k12.class, new vo2(this), this.f15214c);
        } else {
            yo2 yo2Var2 = new yo2(null, e(), null);
            this.f15215d = yo2Var2;
            f7 = rb3.i(yo2Var2);
        }
        return rb3.m(f7, new e43() { // from class: com.google.android.gms.internal.ads.uo2
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj) {
                return (yo2) obj;
            }
        }, this.f15214c);
    }
}
