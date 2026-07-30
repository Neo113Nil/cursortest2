package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wy1 implements om0 {
    public final im2 a;
    public final q80 b;

    public wy1(im2 im2Var, q80 q80Var) {
        this.a = im2Var;
        this.b = q80Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.om0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(yf2 yf2Var, float f, o30 o30Var) {
        vy1 vy1Var;
        int i;
        if (o30Var instanceof vy1) {
            vy1Var = (vy1) o30Var;
            int i2 = vy1Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vy1Var.o = i2 - Integer.MIN_VALUE;
                Object obj = vy1Var.m;
                b50 b50Var = b50.m;
                i = vy1Var.o;
                if (i != 0) {
                    ca2.b(obj);
                    j6 j6Var = new j6(29, this, yf2Var);
                    vy1Var.o = 1;
                    obj = this.a.d(yf2Var, f, j6Var, vy1Var);
                    if (obj == b50Var) {
                        return b50Var;
                    }
                } else {
                    if (i != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return new Float(((Number) obj).floatValue());
            }
        }
        vy1Var = new vy1(this, (r30) o30Var);
        Object obj2 = vy1Var.m;
        b50 b50Var2 = b50.m;
        i = vy1Var.o;
        if (i != 0) {
        }
        return new Float(((Number) obj2).floatValue());
    }
}
