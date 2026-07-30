package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class p72 extends sv1 implements pe0 {
    public final /* synthetic */ q72 QrzZRwfaDlRX;
    public int cpQdD2nAriOS;
    public int dgRBjINgWbAK;
    public /* synthetic */ Object r3s1LDPKFs1S;
    public long[] wdg6QnbFHrFF;
    public int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p72(q72 q72Var, bt btVar) {
        super(2, btVar);
        this.QrzZRwfaDlRX = q72Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00bc -> B:7:0x00be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007e -> B:20:0x0093). Please report as a decompilation issue!!! */
    @Override // defpackage.nc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object RfyTYNmI9Srp(Object obj) {
        y32 y32Var;
        long[] jArr;
        int length;
        int i;
        y32 y32Var2;
        int i2;
        y32 y32Var3;
        int i3;
        q72 q72Var = this.QrzZRwfaDlRX;
        long j = q72Var.rtx2ld2ELZv4;
        long j2 = q72Var.wdg6QnbFHrFF;
        long j3 = q72Var.OPXfSBeufaJ8;
        int i4 = this.cpQdD2nAriOS;
        su suVar = su.rtx2ld2ELZv4;
        if (i4 == 0) {
            ng0.tmVwIGCQF4zR(obj);
            y32Var = (y32) this.r3s1LDPKFs1S;
            jArr = q72Var.dgRBjINgWbAK;
            if (jArr != null) {
                length = jArr.length;
                i = 0;
            }
            if (j3 != 0) {
                y32Var2 = y32Var;
                i2 = 0;
                if (i2 >= 64) {
                }
            }
            if (j != 0) {
            }
            return no2.PxuCJdSBwIXG;
        }
        if (i4 == 1) {
            length = this.x50lh2ztY7Y5;
            int i5 = this.dgRBjINgWbAK;
            jArr = this.wdg6QnbFHrFF;
            y32Var = (y32) this.r3s1LDPKFs1S;
            ng0.tmVwIGCQF4zR(obj);
            i = i5 + 1;
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i6 = this.dgRBjINgWbAK;
                y32Var3 = (y32) this.r3s1LDPKFs1S;
                ng0.tmVwIGCQF4zR(obj);
                i3 = i6 + 1;
                if (i3 < 64) {
                    if (((1 << i3) & j) != 0) {
                        Long l = new Long(j2 + i3 + 64);
                        this.r3s1LDPKFs1S = y32Var3;
                        this.wdg6QnbFHrFF = null;
                        this.dgRBjINgWbAK = i3;
                        this.cpQdD2nAriOS = 3;
                        y32Var3.lS5Rgt96tfkO(l, this);
                        return suVar;
                    }
                    i6 = i3;
                    i3 = i6 + 1;
                    if (i3 < 64) {
                    }
                }
                return no2.PxuCJdSBwIXG;
            }
            i2 = this.dgRBjINgWbAK;
            y32Var2 = (y32) this.r3s1LDPKFs1S;
            ng0.tmVwIGCQF4zR(obj);
            i2++;
            if (i2 >= 64) {
                y32Var = y32Var2;
                if (j != 0) {
                    y32Var3 = y32Var;
                    i3 = 0;
                    if (i3 < 64) {
                    }
                }
                return no2.PxuCJdSBwIXG;
            }
            if ((j3 & (1 << i2)) != 0) {
                Long l2 = new Long(j2 + i2);
                this.r3s1LDPKFs1S = y32Var2;
                this.wdg6QnbFHrFF = null;
                this.dgRBjINgWbAK = i2;
                this.cpQdD2nAriOS = 2;
                y32Var2.lS5Rgt96tfkO(l2, this);
                return suVar;
            }
            i2++;
            if (i2 >= 64) {
            }
        }
        if (i < length) {
            Long l3 = new Long(jArr[i]);
            this.r3s1LDPKFs1S = y32Var;
            this.wdg6QnbFHrFF = jArr;
            this.dgRBjINgWbAK = i;
            this.x50lh2ztY7Y5 = length;
            this.cpQdD2nAriOS = 1;
            y32Var.lS5Rgt96tfkO(l3, this);
            return suVar;
        }
        if (j3 != 0) {
        }
        if (j != 0) {
        }
        return no2.PxuCJdSBwIXG;
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        p72 p72Var = new p72(this.QrzZRwfaDlRX, btVar);
        p72Var.r3s1LDPKFs1S = obj;
        return p72Var;
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        return ((p72) gPXPFXrUH4XX((bt) obj2, (y32) obj)).RfyTYNmI9Srp(no2.PxuCJdSBwIXG);
    }
}
