package defpackage;

import com.appsflyer.internal.l;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class p40 implements fe1 {
    public final cm1 a;
    public final ng1 b;

    public p40(cm1 cm1Var, ng1 ng1Var) {
        this.a = cm1Var;
        this.b = ng1Var;
    }

    @Override // defpackage.fe1
    public final boolean a(Exception exc) {
        this.b.b(exc);
        return true;
    }

    @Override // defpackage.fe1
    public final boolean b(wb wbVar) {
        if (wbVar.b == 4 && !this.a.a(wbVar)) {
            String str = wbVar.c;
            if (str != null) {
                this.b.a(new ob(str, wbVar.e, wbVar.f));
                return true;
            }
            l.b("Null token");
        }
        return false;
    }
}
