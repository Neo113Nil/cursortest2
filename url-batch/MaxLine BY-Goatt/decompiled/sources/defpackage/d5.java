package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class d5 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ a50 n;
    public final /* synthetic */ ij1 o;
    public final /* synthetic */ long p;
    public final /* synthetic */ Object q;

    public /* synthetic */ d5(a50 a50Var, ij1 ij1Var, long j, Object obj, int i) {
        this.m = i;
        this.n = a50Var;
        this.o = ij1Var;
        this.p = j;
        this.q = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.m;
        Object obj = this.q;
        a50 a50Var = this.n;
        switch (i) {
            case 0:
                z71.H(a50Var, null, new i5(this.o, this.p, (Function0) obj, null, 0), 3);
                break;
            default:
                z71.H(a50Var, null, new i5(this.o, this.p, (a61) obj, null, 1), 3);
                break;
        }
        return Unit.a;
    }
}
