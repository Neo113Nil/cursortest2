package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class eh2 extends o81 implements Function0 {
    public final /* synthetic */ gn m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ kl3 p;
    public final /* synthetic */ y91 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh2(gn gnVar, int i, int i2, kl3 kl3Var, y91 y91Var) {
        super(0);
        this.m = gnVar;
        this.n = i;
        this.o = i2;
        this.p = kl3Var;
        this.q = y91Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        gn gnVar = this.m;
        bw2 bw2Var = (bw2) gnVar.e;
        int intValue = ((Number) this.q.getValue()).intValue();
        kl3 kl3Var = this.p;
        boolean z = kl3Var.b;
        boolean z2 = kl3Var.b() == 1;
        int i = this.n;
        long k = bw2Var.k(i);
        int i2 = jw2.c;
        int i3 = (int) (k >> 32);
        int e = bw2Var.e(i3);
        int i4 = bw2Var.b.f;
        if (e != intValue) {
            i3 = intValue >= i4 ? bw2Var.h(i4 - 1) : bw2Var.h(intValue);
        }
        int i5 = (int) (k & 4294967295L);
        if (bw2Var.e(i5) != intValue) {
            i5 = intValue >= i4 ? bw2Var.d(i4 - 1, false) : bw2Var.d(intValue, false);
        }
        int i6 = this.o;
        if (i3 == i6) {
            return gnVar.b(i5);
        }
        if (i5 == i6) {
            return gnVar.b(i3);
        }
        if (!(z ^ z2) ? i >= i3 : i > i5) {
            i3 = i5;
        }
        return gnVar.b(i3);
    }
}
