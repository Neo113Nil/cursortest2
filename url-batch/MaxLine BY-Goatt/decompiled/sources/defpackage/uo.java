package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class uo extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ long n;
    public final /* synthetic */ long o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uo(Object obj, long j, long j2, Object obj2, int i) {
        super(1);
        this.m = i;
        this.p = obj;
        this.n = j;
        this.o = j2;
        this.q = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        Object obj2 = this.q;
        Object obj3 = this.p;
        switch (i) {
            case 0:
                k91 k91Var = (k91) obj;
                k91Var.a();
                yd0.W(k91Var, (cq) obj3, this.n, this.o, 0.0f, (ae0) obj2, 104);
                break;
            default:
                m12 m12Var = (m12) obj;
                n12 n12Var = (n12) obj3;
                long j = this.n;
                long j2 = this.o;
                m12Var.getClass();
                m12.a(m12Var, n12Var);
                n12Var.i0(s31.c(((((int) (j >> 32)) + ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L))) & 4294967295L), n12Var.q), 0.0f, (oc) obj2);
                break;
        }
        return Unit.a;
    }
}
