package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class id0 extends o81 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ tf2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ id0(tf2 tf2Var, int i) {
        super(0);
        this.m = i;
        this.n = tf2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r2 != false) goto L13;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        boolean z;
        boolean z2;
        int i = this.m;
        tf2 tf2Var = this.n;
        switch (i) {
            case 0:
                lq lqVar = tf2Var.G;
                if (lqVar != null) {
                    lqVar.d(wc0.a);
                }
                return Unit.a;
            case 1:
                cg2 cg2Var = tf2Var.P;
                if (!cg2Var.a.b()) {
                    px1 px1Var = cg2Var.b;
                    z = false;
                    if (px1Var == null) {
                        z2 = false;
                        break;
                    } else {
                        z2 = px1Var.g();
                        break;
                    }
                }
                z = true;
                return Boolean.valueOf(!z);
            default:
                tf2Var.O.a = new q70(new at0((ca0) tk3.J(tf2Var, p00.h)));
                return Unit.a;
        }
    }
}
