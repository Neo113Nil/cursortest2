package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class r81 extends sv1 implements pe0 {
    public final /* synthetic */ lg0 BRwzKIf41E4i;
    public /* synthetic */ Object QrzZRwfaDlRX;
    public int cpQdD2nAriOS;
    public s81 dgRBjINgWbAK;
    public final /* synthetic */ s81 gPXPFXrUH4XX;
    public int r3s1LDPKFs1S;
    public lg0 wdg6QnbFHrFF;
    public long[] x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r81(s81 s81Var, lg0 lg0Var, bt btVar) {
        super(2, btVar);
        this.gPXPFXrUH4XX = s81Var;
        this.BRwzKIf41E4i = lg0Var;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        y32 y32Var;
        s81 s81Var;
        long[] jArr;
        int i;
        lg0 lg0Var;
        int i2 = this.r3s1LDPKFs1S;
        if (i2 == 0) {
            ng0.tmVwIGCQF4zR(obj);
            y32Var = (y32) this.QrzZRwfaDlRX;
            s81Var = this.gPXPFXrUH4XX;
            q81 q81Var = s81Var.OPXfSBeufaJ8;
            jArr = q81Var.TSizfFm2Yiuu;
            i = q81Var.e9gEMXR7LXtO;
            lg0Var = this.BRwzKIf41E4i;
        } else {
            if (i2 != 1) {
                u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.cpQdD2nAriOS;
            jArr = this.x50lh2ztY7Y5;
            s81Var = this.dgRBjINgWbAK;
            lg0Var = this.wdg6QnbFHrFF;
            y32Var = (y32) this.QrzZRwfaDlRX;
            ng0.tmVwIGCQF4zR(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return no2.PxuCJdSBwIXG;
        }
        int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
        lg0Var.OPXfSBeufaJ8 = i;
        Object obj2 = s81Var.OPXfSBeufaJ8.lS5Rgt96tfkO[i];
        this.QrzZRwfaDlRX = y32Var;
        this.wdg6QnbFHrFF = lg0Var;
        this.dgRBjINgWbAK = s81Var;
        this.x50lh2ztY7Y5 = jArr;
        this.cpQdD2nAriOS = i3;
        this.r3s1LDPKFs1S = 1;
        y32Var.lS5Rgt96tfkO(obj2, this);
        return su.rtx2ld2ELZv4;
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        r81 r81Var = new r81(this.gPXPFXrUH4XX, this.BRwzKIf41E4i, btVar);
        r81Var.QrzZRwfaDlRX = obj;
        return r81Var;
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        return ((r81) gPXPFXrUH4XX((bt) obj2, (y32) obj)).RfyTYNmI9Srp(no2.PxuCJdSBwIXG);
    }
}
