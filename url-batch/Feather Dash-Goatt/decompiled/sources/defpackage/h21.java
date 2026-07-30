package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class h21 {
    public final int a;
    public final sk b;
    public float c;

    public h21(int i, sk skVar) {
        this.a = i;
        this.b = skVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(float f, fn fnVar) {
        g21 g21Var;
        int i;
        if (fnVar instanceof g21) {
            g21Var = (g21) fnVar;
            int i2 = g21Var.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g21Var.j = i2 - Integer.MIN_VALUE;
                Object obj = g21Var.h;
                tn tnVar = tn.d;
                i = g21Var.j;
                if (i != 0) {
                    ca0.v(obj);
                    Float f2 = new Float(f);
                    g21Var.j = 1;
                    obj = this.b.b(f2, g21Var);
                    if (obj == tnVar) {
                        return tnVar;
                    }
                } else {
                    if (i != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                this.c += ((Number) obj).floatValue();
                return Unit.a;
            }
        }
        g21Var = new g21(this, fnVar);
        Object obj2 = g21Var.h;
        tn tnVar2 = tn.d;
        i = g21Var.j;
        if (i != 0) {
        }
        this.c += ((Number) obj2).floatValue();
        return Unit.a;
    }
}
