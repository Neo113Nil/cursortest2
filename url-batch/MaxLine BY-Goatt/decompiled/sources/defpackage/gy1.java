package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gy1 extends o81 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ q80 n;
    public final /* synthetic */ a50 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gy1(q80 q80Var, a50 a50Var, int i) {
        super(0);
        this.m = i;
        this.n = q80Var;
        this.o = a50Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.m;
        boolean z = false;
        a50 a50Var = this.o;
        q80 q80Var = this.n;
        switch (i) {
            case 0:
                if (q80Var.a()) {
                    z71.H(a50Var, null, new ei0(q80Var, null, 1), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                if (q80Var.c()) {
                    z71.H(a50Var, null, new ei0(q80Var, null, 2), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                if (q80Var.a()) {
                    z71.H(a50Var, null, new ei0(q80Var, null, 1), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                if (q80Var.c()) {
                    z71.H(a50Var, null, new ei0(q80Var, null, 2), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
