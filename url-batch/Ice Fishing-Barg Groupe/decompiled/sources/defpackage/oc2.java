package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class oc2 implements hy, bt {
    public final bi OPXfSBeufaJ8;
    public final /* synthetic */ pc2 cpQdD2nAriOS;
    public final /* synthetic */ pc2 rtx2ld2ELZv4;
    public bi wdg6QnbFHrFF;
    public rn1 dgRBjINgWbAK = rn1.OPXfSBeufaJ8;
    public final n50 x50lh2ztY7Y5 = n50.rtx2ld2ELZv4;

    public oc2(pc2 pc2Var, bi biVar) {
        this.cpQdD2nAriOS = pc2Var;
        this.rtx2ld2ELZv4 = pc2Var;
        this.OPXfSBeufaJ8 = biVar;
    }

    @Override // defpackage.hy
    public final long IAToe7bXGz4N(long j) {
        return this.rtx2ld2ELZv4.IAToe7bXGz4N(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OPXfSBeufaJ8(long j, pe0 pe0Var, ct ctVar) {
        mc2 mc2Var;
        int i;
        Throwable th;
        z82 z82Var;
        bi biVar;
        if (ctVar instanceof mc2) {
            mc2Var = (mc2) ctVar;
            int i2 = mc2Var.r3s1LDPKFs1S;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mc2Var.r3s1LDPKFs1S = i2 - Integer.MIN_VALUE;
                Object obj = mc2Var.x50lh2ztY7Y5;
                i = mc2Var.r3s1LDPKFs1S;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    if (j <= 0 && (biVar = this.wdg6QnbFHrFF) != null) {
                        biVar.RAsUl2FVSrh6(new uv1(new sn1(j)));
                    }
                    z82 KUoIVIumpKat = fx1.KUoIVIumpKat(this.cpQdD2nAriOS.GlTbNTgfSMqy(), null, new v22(j, this, (bt) null), 3);
                    try {
                        mc2Var.dgRBjINgWbAK = KUoIVIumpKat;
                        mc2Var.r3s1LDPKFs1S = 1;
                        obj = pe0Var.rtx2ld2ELZv4(this, mc2Var);
                        Object obj2 = su.rtx2ld2ELZv4;
                        if (obj == obj2) {
                            return obj2;
                        }
                        z82Var = KUoIVIumpKat;
                    } catch (Throwable th2) {
                        th = th2;
                        z82Var = KUoIVIumpKat;
                        z82Var.a92UlCVFR9N8(yh.OPXfSBeufaJ8);
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z82Var = mc2Var.dgRBjINgWbAK;
                    try {
                        ng0.tmVwIGCQF4zR(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        z82Var.a92UlCVFR9N8(yh.OPXfSBeufaJ8);
                        throw th;
                    }
                }
                z82Var.a92UlCVFR9N8(yh.OPXfSBeufaJ8);
                return obj;
            }
        }
        mc2Var = new mc2(this, ctVar);
        Object obj3 = mc2Var.x50lh2ztY7Y5;
        i = mc2Var.r3s1LDPKFs1S;
        if (i != 0) {
        }
        z82Var.a92UlCVFR9N8(yh.OPXfSBeufaJ8);
        return obj3;
    }

    @Override // defpackage.hy
    public final int POWyO8hTM6YC(float f) {
        return this.rtx2ld2ELZv4.POWyO8hTM6YC(f);
    }

    public final Object PxuCJdSBwIXG(rn1 rn1Var, nc ncVar) {
        bi biVar = new bi(1, ng0.IAToe7bXGz4N(ncVar));
        biVar.ZbWwgt3aGe7A();
        this.dgRBjINgWbAK = rn1Var;
        this.wdg6QnbFHrFF = biVar;
        return biVar.VhhvGxCb8gfr();
    }

    @Override // defpackage.bt
    public final void RAsUl2FVSrh6(Object obj) {
        pc2 pc2Var = this.cpQdD2nAriOS;
        synchronized (pc2Var.jyegZNwi31qc) {
            pc2Var.e6tOsSdd2EFb.wdg6QnbFHrFF(this);
        }
        this.OPXfSBeufaJ8.RAsUl2FVSrh6(obj);
    }

    public final long TSizfFm2Yiuu() {
        pc2 pc2Var = this.cpQdD2nAriOS;
        long bEKsvqmvPh2y = pc2Var.bEKsvqmvPh2y(zv.zf8DYfih6EZu(pc2Var).ozEBbv0hFTAB.RAsUl2FVSrh6());
        long j = pc2Var.rZjpSjn4zoMv;
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (bEKsvqmvPh2y >> 32)) - ((int) (j >> 32))) / 2.0f;
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (bEKsvqmvPh2y & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    public final vq2 a92UlCVFR9N8() {
        return zv.zf8DYfih6EZu(this.cpQdD2nAriOS).ozEBbv0hFTAB;
    }

    @Override // defpackage.hy
    public final long bEKsvqmvPh2y(long j) {
        return this.rtx2ld2ELZv4.bEKsvqmvPh2y(j);
    }

    @Override // defpackage.hy
    public final float e4HgwifUDUCA(int i) {
        return this.rtx2ld2ELZv4.e4HgwifUDUCA(i);
    }

    @Override // defpackage.hy
    public final float e6tOsSdd2EFb(float f) {
        return this.rtx2ld2ELZv4.lS5Rgt96tfkO() * f;
    }

    @Override // defpackage.bt
    public final hu e9gEMXR7LXtO() {
        return this.x50lh2ztY7Y5;
    }

    @Override // defpackage.hy
    public final float lS5Rgt96tfkO() {
        return this.rtx2ld2ELZv4.lS5Rgt96tfkO();
    }

    @Override // defpackage.hy
    public final long pnx5pC0XzaCw(float f) {
        return this.rtx2ld2ELZv4.pnx5pC0XzaCw(f);
    }

    @Override // defpackage.hy
    public final float qudtW7lwm99e(long j) {
        return this.rtx2ld2ELZv4.qudtW7lwm99e(j);
    }

    @Override // defpackage.hy
    public final float r3s1LDPKFs1S() {
        return this.rtx2ld2ELZv4.r3s1LDPKFs1S();
    }

    @Override // defpackage.hy
    public final long uVlwi32qvXeJ(float f) {
        return this.rtx2ld2ELZv4.uVlwi32qvXeJ(f);
    }

    @Override // defpackage.hy
    public final float uy1Qfkdvj4xZ(float f) {
        return f / this.rtx2ld2ELZv4.lS5Rgt96tfkO();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x50lh2ztY7Y5(long j, pe0 pe0Var, ct ctVar) {
        nc2 nc2Var;
        int i;
        try {
            if (ctVar instanceof nc2) {
                nc2Var = (nc2) ctVar;
                int i2 = nc2Var.cpQdD2nAriOS;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    nc2Var.cpQdD2nAriOS = i2 - Integer.MIN_VALUE;
                    Object obj = nc2Var.dgRBjINgWbAK;
                    i = nc2Var.cpQdD2nAriOS;
                    if (i == 0) {
                        if (i == 1) {
                            ng0.tmVwIGCQF4zR(obj);
                            return obj;
                        }
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ng0.tmVwIGCQF4zR(obj);
                    nc2Var.cpQdD2nAriOS = 1;
                    Object OPXfSBeufaJ8 = OPXfSBeufaJ8(j, pe0Var, nc2Var);
                    Object obj2 = su.rtx2ld2ELZv4;
                    return OPXfSBeufaJ8 == obj2 ? obj2 : OPXfSBeufaJ8;
                }
            }
            if (i == 0) {
            }
        } catch (sn1 unused) {
            return null;
        }
        nc2Var = new nc2(this, ctVar);
        Object obj3 = nc2Var.dgRBjINgWbAK;
        i = nc2Var.cpQdD2nAriOS;
    }

    @Override // defpackage.hy
    public final float xfACYKDMU6Dj(long j) {
        return this.rtx2ld2ELZv4.xfACYKDMU6Dj(j);
    }
}
