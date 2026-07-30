package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class x60 implements xm0 {
    public final /* synthetic */ int m;
    public final Object n;

    public /* synthetic */ x60(int i, Object obj) {
        this.m = i;
        this.n = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    @Override // defpackage.xm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ym0 ym0Var, o30 o30Var) {
        f0 f0Var;
        int i;
        vc2 vc2Var;
        Throwable th;
        int i2 = this.m;
        Object obj = this.n;
        switch (i2) {
            case 0:
                Object a = ((fn0) obj).a(new ij(ym0Var, 2), o30Var);
                return a == b50.m ? a : Unit.a;
            case 1:
                Object d = ym0Var.d(obj, o30Var);
                return d == b50.m ? d : Unit.a;
            default:
                if (o30Var instanceof f0) {
                    f0Var = (f0) o30Var;
                    int i3 = f0Var.p;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        f0Var.p = i3 - Integer.MIN_VALUE;
                        Object obj2 = f0Var.n;
                        b50 b50Var = b50.m;
                        i = f0Var.p;
                        if (i != 0) {
                            ca2.b(obj2);
                            vc2 vc2Var2 = new vc2(ym0Var, f0Var.getContext());
                            try {
                                f0Var.m = vc2Var2;
                                f0Var.p = 1;
                                Object invoke = ((Function2) obj).invoke(vc2Var2, f0Var);
                                if (invoke != b50Var) {
                                    invoke = Unit.a;
                                }
                                if (invoke == b50Var) {
                                    return b50Var;
                                }
                                vc2Var = vc2Var2;
                            } catch (Throwable th2) {
                                vc2Var = vc2Var2;
                                th = th2;
                                vc2Var.releaseIntercepted();
                                throw th;
                            }
                        } else {
                            if (i != 1) {
                                lh.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            vc2Var = f0Var.m;
                            try {
                                ca2.b(obj2);
                            } catch (Throwable th3) {
                                th = th3;
                                vc2Var.releaseIntercepted();
                                throw th;
                            }
                        }
                        vc2Var.releaseIntercepted();
                        return Unit.a;
                    }
                }
                f0Var = new f0(this, o30Var);
                Object obj22 = f0Var.n;
                b50 b50Var2 = b50.m;
                i = f0Var.p;
                if (i != 0) {
                }
                vc2Var.releaseIntercepted();
                return Unit.a;
        }
    }
}
