package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class x81 extends sv1 implements pe0 {
    public long BRwzKIf41E4i;
    public final /* synthetic */ y81 EcgxDIVH5in8;
    public int QrzZRwfaDlRX;
    public /* synthetic */ Object RfyTYNmI9Srp;
    public final /* synthetic */ lg0 S9EYkSpbGuxq;
    public int XL4ISE6Oc65B;
    public int cpQdD2nAriOS;
    public y81 dgRBjINgWbAK;
    public int gPXPFXrUH4XX;
    public int r3s1LDPKFs1S;
    public lg0 wdg6QnbFHrFF;
    public long[] x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x81(y81 y81Var, lg0 lg0Var, bt btVar) {
        super(2, btVar);
        this.EcgxDIVH5in8 = y81Var;
        this.S9EYkSpbGuxq = lg0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:14:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0051 -> B:6:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006d -> B:5:0x0094). Please report as a decompilation issue!!! */
    @Override // defpackage.nc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object RfyTYNmI9Srp(Object obj) {
        y32 y32Var;
        y81 y81Var;
        long[] jArr;
        int length;
        lg0 lg0Var;
        int i;
        long j;
        int i2 = this.XL4ISE6Oc65B;
        if (i2 == 0) {
            ng0.tmVwIGCQF4zR(obj);
            y32Var = (y32) this.RfyTYNmI9Srp;
            y81Var = this.EcgxDIVH5in8;
            jArr = y81Var.OPXfSBeufaJ8.PxuCJdSBwIXG;
            length = jArr.length - 2;
            if (length >= 0) {
                lg0Var = this.S9EYkSpbGuxq;
                i = 0;
                j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i != length) {
                }
            }
            return no2.PxuCJdSBwIXG;
        }
        if (i2 != 1) {
            u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i3 = this.gPXPFXrUH4XX;
        int i4 = this.QrzZRwfaDlRX;
        long j2 = this.BRwzKIf41E4i;
        int i5 = this.r3s1LDPKFs1S;
        int i6 = this.cpQdD2nAriOS;
        long[] jArr2 = this.x50lh2ztY7Y5;
        y81 y81Var2 = this.dgRBjINgWbAK;
        lg0 lg0Var2 = this.wdg6QnbFHrFF;
        y32 y32Var2 = (y32) this.RfyTYNmI9Srp;
        ng0.tmVwIGCQF4zR(obj);
        j2 >>= 8;
        i3++;
        if (i3 < i4) {
            if (i4 == 8) {
                length = i6;
                jArr = jArr2;
                y81Var = y81Var2;
                y32Var = y32Var2;
                i = i5;
                lg0Var = lg0Var2;
                if (i != length) {
                    i++;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        y32Var2 = y32Var;
                        i3 = 0;
                        y81Var2 = y81Var;
                        jArr2 = jArr;
                        i4 = 8 - ((~(i - length)) >>> 31);
                        lg0Var2 = lg0Var;
                        i5 = i;
                        i6 = length;
                        j2 = j;
                        if (i3 < i4) {
                            if ((255 & j2) < 128) {
                                int i7 = (i5 << 3) + i3;
                                lg0Var2.OPXfSBeufaJ8 = i7;
                                Object obj2 = y81Var2.OPXfSBeufaJ8.lS5Rgt96tfkO[i7];
                                this.RfyTYNmI9Srp = y32Var2;
                                this.wdg6QnbFHrFF = lg0Var2;
                                this.dgRBjINgWbAK = y81Var2;
                                this.x50lh2ztY7Y5 = jArr2;
                                this.cpQdD2nAriOS = i6;
                                this.r3s1LDPKFs1S = i5;
                                this.BRwzKIf41E4i = j2;
                                this.QrzZRwfaDlRX = i4;
                                this.gPXPFXrUH4XX = i3;
                                this.XL4ISE6Oc65B = 1;
                                y32Var2.lS5Rgt96tfkO(obj2, this);
                                return su.rtx2ld2ELZv4;
                            }
                            j2 >>= 8;
                            i3++;
                            if (i3 < i4) {
                            }
                        }
                    }
                    if (i != length) {
                    }
                }
            }
            return no2.PxuCJdSBwIXG;
        }
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        x81 x81Var = new x81(this.EcgxDIVH5in8, this.S9EYkSpbGuxq, btVar);
        x81Var.RfyTYNmI9Srp = obj;
        return x81Var;
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        return ((x81) gPXPFXrUH4XX((bt) obj2, (y32) obj)).RfyTYNmI9Srp(no2.PxuCJdSBwIXG);
    }
}
