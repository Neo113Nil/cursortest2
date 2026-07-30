package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class bk0 {
    public int PxuCJdSBwIXG;
    public final Object TSizfFm2Yiuu;
    public float lS5Rgt96tfkO;

    public bk0(hi2 hi2Var) {
        this.TSizfFm2Yiuu = hi2Var;
        this.PxuCJdSBwIXG = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float PxuCJdSBwIXG(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        int i2;
        hi2 hi2Var = (hi2) this.TSizfFm2Yiuu;
        int i3 = 1;
        if (z) {
            int rZjpSjn4zoMv = xi0.rZjpSjn4zoMv(hi2Var.a92UlCVFR9N8, i, z);
            int lineStart = hi2Var.a92UlCVFR9N8.getLineStart(rZjpSjn4zoMv);
            int a92UlCVFR9N8 = hi2Var.a92UlCVFR9N8(rZjpSjn4zoMv);
            if (i == lineStart || i == a92UlCVFR9N8) {
                z4 = true;
                int i4 = i * 4;
                if (z3) {
                    i3 = z4 ? 2 : 3;
                } else if (z4) {
                    i3 = 0;
                }
                i2 = i4 + i3;
                if (this.PxuCJdSBwIXG != i2) {
                    return this.lS5Rgt96tfkO;
                }
                float OPXfSBeufaJ8 = z3 ? hi2Var.OPXfSBeufaJ8(i, z) : hi2Var.wdg6QnbFHrFF(i, z);
                if (z2) {
                    this.PxuCJdSBwIXG = i2;
                    this.lS5Rgt96tfkO = OPXfSBeufaJ8;
                }
                return OPXfSBeufaJ8;
            }
        }
        z4 = false;
        int i42 = i * 4;
        if (z3) {
        }
        i2 = i42 + i3;
        if (this.PxuCJdSBwIXG != i2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object lS5Rgt96tfkO(float f, ct ctVar) {
        iu1 iu1Var;
        int i;
        if (ctVar instanceof iu1) {
            iu1Var = (iu1) ctVar;
            int i2 = iu1Var.cpQdD2nAriOS;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iu1Var.cpQdD2nAriOS = i2 - Integer.MIN_VALUE;
                Object obj = iu1Var.dgRBjINgWbAK;
                i = iu1Var.cpQdD2nAriOS;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    po poVar = (po) this.TSizfFm2Yiuu;
                    Float f2 = new Float(f);
                    iu1Var.cpQdD2nAriOS = 1;
                    obj = poVar.rtx2ld2ELZv4(f2, iu1Var);
                    su suVar = su.rtx2ld2ELZv4;
                    if (obj == suVar) {
                        return suVar;
                    }
                } else {
                    if (i != 1) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ng0.tmVwIGCQF4zR(obj);
                }
                this.lS5Rgt96tfkO += ((Number) obj).floatValue();
                return no2.PxuCJdSBwIXG;
            }
        }
        iu1Var = new iu1(this, ctVar);
        Object obj2 = iu1Var.dgRBjINgWbAK;
        i = iu1Var.cpQdD2nAriOS;
        if (i != 0) {
        }
        this.lS5Rgt96tfkO += ((Number) obj2).floatValue();
        return no2.PxuCJdSBwIXG;
    }

    public bk0(int i, po poVar) {
        this.PxuCJdSBwIXG = i;
        this.TSizfFm2Yiuu = poVar;
    }
}
