package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class nu0 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ a50 n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ boolean q;

    public /* synthetic */ nu0(boolean z, Function0 function0, a50 a50Var, q80 q80Var) {
        this.m = 3;
        this.q = z;
        this.o = function0;
        this.n = a50Var;
        this.p = q80Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.m;
        Object obj = this.p;
        a50 a50Var = this.n;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                z71.H(a50Var, null, new qu0((ij1) obj2, (String) obj, this.q, null, 0), 3);
                break;
            case 1:
                z71.H(a50Var, null, new qu0((ij1) obj2, (String) obj, this.q, null, 1), 3);
                break;
            case 2:
                z71.H(a50Var, null, new qu0((ij1) obj2, (String) obj, this.q, null, 2), 3);
                break;
            default:
                Function0 function0 = (Function0) obj2;
                q80 q80Var = (q80) obj;
                if (this.q) {
                    function0.invoke();
                } else {
                    z71.H(a50Var, null, new ei0(q80Var, null, 0), 3);
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ nu0(a50 a50Var, ij1 ij1Var, String str, boolean z, int i) {
        this.m = i;
        this.n = a50Var;
        this.o = ij1Var;
        this.p = str;
        this.q = z;
    }
}
