package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class b12 extends jc2 implements pe0 {
    public /* synthetic */ long QrzZRwfaDlRX;
    public int cpQdD2nAriOS;
    public final /* synthetic */ d12 r3s1LDPKFs1S;
    public final /* synthetic */ int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b12(d12 d12Var, long j, bt btVar, int i) {
        super(2, btVar);
        this.x50lh2ztY7Y5 = i;
        this.r3s1LDPKFs1S = d12Var;
        this.QrzZRwfaDlRX = j;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        d12 d12Var = this.r3s1LDPKFs1S;
        su suVar = su.rtx2ld2ELZv4;
        switch (i) {
            case 0:
                int i2 = this.cpQdD2nAriOS;
                if (i2 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    l12 l12Var = d12Var.xbgXKYA2cIfu;
                    a12 a12Var = new a12(this.QrzZRwfaDlRX, null);
                    this.cpQdD2nAriOS = 1;
                    if (l12Var.a92UlCVFR9N8(h91.OPXfSBeufaJ8, a12Var, this) == suVar) {
                        break;
                    }
                } else if (i2 != 1) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ng0.tmVwIGCQF4zR(obj);
                    break;
                }
                break;
            case 1:
                int i3 = this.cpQdD2nAriOS;
                if (i3 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    l12 l12Var2 = d12Var.xbgXKYA2cIfu;
                    long j = this.QrzZRwfaDlRX;
                    this.cpQdD2nAriOS = 1;
                    if (l12Var2.lS5Rgt96tfkO(j, false, this) == suVar) {
                        break;
                    }
                } else if (i3 != 1) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ng0.tmVwIGCQF4zR(obj);
                    break;
                }
                break;
            case 2:
                int i4 = this.cpQdD2nAriOS;
                if (i4 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    l12 l12Var3 = d12Var.xbgXKYA2cIfu;
                    long j2 = this.QrzZRwfaDlRX;
                    this.cpQdD2nAriOS = 1;
                    if (l12Var3.lS5Rgt96tfkO(j2, true, this) == suVar) {
                        break;
                    }
                } else if (i4 != 1) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ng0.tmVwIGCQF4zR(obj);
                    break;
                }
                break;
            default:
                int i5 = this.cpQdD2nAriOS;
                if (i5 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    long j3 = this.QrzZRwfaDlRX;
                    l12 l12Var4 = d12Var.xbgXKYA2cIfu;
                    this.cpQdD2nAriOS = 1;
                    Object PxuCJdSBwIXG = x02.PxuCJdSBwIXG(l12Var4, j3, this);
                    if (PxuCJdSBwIXG == suVar) {
                        break;
                    }
                } else if (i5 != 1) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ng0.tmVwIGCQF4zR(obj);
                    break;
                }
                break;
        }
        return suVar;
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        switch (this.x50lh2ztY7Y5) {
            case 0:
                return new b12(this.r3s1LDPKFs1S, this.QrzZRwfaDlRX, btVar, 0);
            case 1:
                return new b12(this.r3s1LDPKFs1S, this.QrzZRwfaDlRX, btVar, 1);
            case 2:
                return new b12(this.r3s1LDPKFs1S, this.QrzZRwfaDlRX, btVar, 2);
            default:
                b12 b12Var = new b12(this.r3s1LDPKFs1S, btVar);
                b12Var.QrzZRwfaDlRX = ((bf1) obj).PxuCJdSBwIXG;
                return b12Var;
        }
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        switch (i) {
            case 0:
                return ((b12) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2Var);
            case 1:
                return ((b12) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2Var);
            case 2:
                return ((b12) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2Var);
            default:
                long j = ((bf1) obj).PxuCJdSBwIXG;
                b12 b12Var = new b12(this.r3s1LDPKFs1S, (bt) obj2);
                b12Var.QrzZRwfaDlRX = j;
                return b12Var.RfyTYNmI9Srp(no2Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b12(d12 d12Var, bt btVar) {
        super(2, btVar);
        this.x50lh2ztY7Y5 = 3;
        this.r3s1LDPKFs1S = d12Var;
    }
}
