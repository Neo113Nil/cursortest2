package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class jo extends sv1 implements pe0 {
    public final /* synthetic */ ko QrzZRwfaDlRX;
    public int cpQdD2nAriOS;
    public int dgRBjINgWbAK;
    public /* synthetic */ Object r3s1LDPKFs1S;
    public int wdg6QnbFHrFF;
    public int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo(ko koVar, bt btVar) {
        super(2, btVar);
        this.QrzZRwfaDlRX = koVar;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        y32 y32Var;
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        String str2;
        ko koVar = this.QrzZRwfaDlRX;
        p81 p81Var = koVar.rtx2ld2ELZv4;
        b81 b81Var = koVar.wdg6QnbFHrFF;
        int i6 = this.cpQdD2nAriOS;
        if (i6 == 0) {
            ng0.tmVwIGCQF4zR(obj);
            y32Var = (y32) this.r3s1LDPKFs1S;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (i6 != 1) {
                u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.x50lh2ztY7Y5;
            i2 = this.dgRBjINgWbAK;
            i3 = this.wdg6QnbFHrFF;
            y32Var = (y32) this.r3s1LDPKFs1S;
            ng0.tmVwIGCQF4zR(obj);
        }
        if (i3 >= Math.min(koVar.dgRBjINgWbAK + 10, b81Var.lS5Rgt96tfkO)) {
            return no2.PxuCJdSBwIXG;
        }
        int i7 = i3 + 1;
        int lS5Rgt96tfkO = b81Var.lS5Rgt96tfkO(i3);
        switch (lS5Rgt96tfkO) {
            case 0:
                str = "up";
                break;
            case 1:
                Object a92UlCVFR9N8 = p81Var.a92UlCVFR9N8(i2);
                i2++;
                str = "down " + a92UlCVFR9N8;
                break;
            case 2:
                str = "remove " + b81Var.lS5Rgt96tfkO(i7) + ' ' + b81Var.lS5Rgt96tfkO(i3 + 2);
                i7 = i3 + 3;
                break;
            case 3:
                str = "move " + b81Var.lS5Rgt96tfkO(i7) + ' ' + b81Var.lS5Rgt96tfkO(i3 + 2) + ' ' + b81Var.lS5Rgt96tfkO(i3 + 3);
                i7 = i3 + 4;
                break;
            case 4:
                str = "clear";
                break;
            case 5:
                i4 = i3 + 2;
                int lS5Rgt96tfkO2 = b81Var.lS5Rgt96tfkO(i7);
                i5 = i2 + 1;
                str2 = "insertBottomUp " + lS5Rgt96tfkO2 + ' ' + p81Var.a92UlCVFR9N8(i2);
                int i8 = i4;
                str = str2;
                i7 = i8;
                i2 = i5;
                break;
            case 6:
                i4 = i3 + 2;
                int lS5Rgt96tfkO3 = b81Var.lS5Rgt96tfkO(i7);
                i5 = i2 + 1;
                str2 = "insertTopDown " + lS5Rgt96tfkO3 + ' ' + p81Var.a92UlCVFR9N8(i2);
                int i82 = i4;
                str = str2;
                i7 = i82;
                i2 = i5;
                break;
            case 7:
                Object a92UlCVFR9N82 = p81Var.a92UlCVFR9N8(i2);
                a92UlCVFR9N82.getClass();
                mm2.S9EYkSpbGuxq(2, a92UlCVFR9N82);
                i2 += 2;
                str = "apply " + ((pe0) a92UlCVFR9N82);
                break;
            case 8:
                str = "reuse " + koVar.OPXfSBeufaJ8.a92UlCVFR9N8(i);
                i++;
                break;
            case 9:
                str = "recompose pending";
                break;
            default:
                str = o0.wdg6QnbFHrFF("unknown op: ", lS5Rgt96tfkO);
                break;
        }
        this.r3s1LDPKFs1S = y32Var;
        this.wdg6QnbFHrFF = i7;
        this.dgRBjINgWbAK = i2;
        this.x50lh2ztY7Y5 = i;
        this.cpQdD2nAriOS = 1;
        y32Var.lS5Rgt96tfkO(i3 + ": " + str, this);
        return su.rtx2ld2ELZv4;
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        jo joVar = new jo(this.QrzZRwfaDlRX, btVar);
        joVar.r3s1LDPKFs1S = obj;
        return joVar;
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        return ((jo) gPXPFXrUH4XX((bt) obj2, (y32) obj)).RfyTYNmI9Srp(no2.PxuCJdSBwIXG);
    }
}
