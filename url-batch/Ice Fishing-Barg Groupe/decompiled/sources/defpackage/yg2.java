package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class yg2 extends jc2 implements pe0 {
    public final /* synthetic */ eh2 cpQdD2nAriOS;
    public final /* synthetic */ boolean r3s1LDPKFs1S;
    public int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg2(eh2 eh2Var, boolean z, bt btVar) {
        super(2, btVar);
        this.cpQdD2nAriOS = eh2Var;
        this.r3s1LDPKFs1S = z;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        qk qkVar;
        int i = this.x50lh2ztY7Y5;
        v8 v8Var = null;
        no2 no2Var = no2.PxuCJdSBwIXG;
        if (i != 0) {
            if (i == 1) {
                ng0.tmVwIGCQF4zR(obj);
                return no2Var;
            }
            u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ng0.tmVwIGCQF4zR(obj);
        eh2 eh2Var = this.cpQdD2nAriOS;
        if (!vi2.TSizfFm2Yiuu(eh2Var.r3s1LDPKFs1S().lS5Rgt96tfkO)) {
            v8Var = sj0.jyegZNwi31qc(eh2Var.r3s1LDPKFs1S());
            if (this.r3s1LDPKFs1S) {
                int e9gEMXR7LXtO = vi2.e9gEMXR7LXtO(eh2Var.r3s1LDPKFs1S().lS5Rgt96tfkO);
                eh2Var.TSizfFm2Yiuu.OPXfSBeufaJ8(eh2.e9gEMXR7LXtO(eh2Var.r3s1LDPKFs1S().PxuCJdSBwIXG, jh0.rtx2ld2ELZv4(e9gEMXR7LXtO, e9gEMXR7LXtO)));
                eh2Var.XL4ISE6Oc65B(mi0.rtx2ld2ELZv4);
            }
        }
        if (v8Var != null && (qkVar = eh2Var.RAsUl2FVSrh6) != null) {
            nk xfACYKDMU6Dj = bs0.xfACYKDMU6Dj(v8Var);
            this.x50lh2ztY7Y5 = 1;
            ((x0) qkVar).PxuCJdSBwIXG(xfACYKDMU6Dj);
            su suVar = su.rtx2ld2ELZv4;
            if (no2Var == suVar) {
                return suVar;
            }
        }
        return no2Var;
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        return new yg2(this.cpQdD2nAriOS, this.r3s1LDPKFs1S, btVar);
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        return ((yg2) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2.PxuCJdSBwIXG);
    }
}
