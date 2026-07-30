package defpackage;

import defpackage.aa2;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qm implements tl1 {
    public boolean a;
    public yc2 b;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(r30 r30Var) {
        pm pmVar;
        int i;
        yc2 yc2Var;
        if (r30Var instanceof pm) {
            pmVar = (pm) r30Var;
            int i2 = pmVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pmVar.p = i2 - Integer.MIN_VALUE;
                Object obj = pmVar.n;
                b50 b50Var = b50.m;
                i = pmVar.p;
                if (i != 0) {
                    ca2.b(obj);
                    if (!this.a) {
                        yc2 yc2Var2 = this.b;
                        pmVar.m = yc2Var2;
                        pmVar.p = 1;
                        o30 b = q41.b(pmVar);
                        b.getClass();
                        yc2 yc2Var3 = new yc2(b, b50.n);
                        this.b = yc2Var3;
                        if (yc2Var3.a() == b50Var) {
                            return b50Var;
                        }
                        yc2Var = yc2Var2;
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yc2Var = pmVar.m;
                ca2.b(obj);
                if (yc2Var != null) {
                    aa2.a aVar = aa2.m;
                    yc2Var.resumeWith(Unit.a);
                }
                return Unit.a;
            }
        }
        pmVar = new pm(this, r30Var);
        Object obj2 = pmVar.n;
        b50 b50Var2 = b50.m;
        i = pmVar.p;
        if (i != 0) {
        }
        if (yc2Var != null) {
        }
        return Unit.a;
    }
}
