package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class tb1 extends jc2 implements pe0 {
    public final /* synthetic */ go BRwzKIf41E4i;
    public final /* synthetic */ k81 QrzZRwfaDlRX;
    public final /* synthetic */ lb1 cpQdD2nAriOS;
    public final /* synthetic */ i92 gPXPFXrUH4XX;
    public final /* synthetic */ x91 r3s1LDPKFs1S;
    public final /* synthetic */ gl2 x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb1(gl2 gl2Var, lb1 lb1Var, x91 x91Var, k81 k81Var, i92 i92Var, go goVar, bt btVar) {
        super(2, btVar);
        this.x50lh2ztY7Y5 = gl2Var;
        this.cpQdD2nAriOS = lb1Var;
        this.r3s1LDPKFs1S = x91Var;
        this.QrzZRwfaDlRX = k81Var;
        this.gPXPFXrUH4XX = i92Var;
        this.BRwzKIf41E4i = goVar;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        ng0.tmVwIGCQF4zR(obj);
        gl2 gl2Var = this.x50lh2ztY7Y5;
        Object a92UlCVFR9N8 = gl2Var.PxuCJdSBwIXG.a92UlCVFR9N8();
        mj1 mj1Var = gl2Var.Y1f8riQaR6yg;
        if (cs0.wdg6QnbFHrFF(a92UlCVFR9N8, mj1Var.getValue()) && (((x91) this.cpQdD2nAriOS.lS5Rgt96tfkO.a92UlCVFR9N8.RAsUl2FVSrh6()) == null || cs0.wdg6QnbFHrFF(mj1Var.getValue(), this.r3s1LDPKFs1S))) {
            Iterator it = ((List) this.gPXPFXrUH4XX.getValue()).iterator();
            while (it.hasNext()) {
                this.BRwzKIf41E4i.lS5Rgt96tfkO().TSizfFm2Yiuu((x91) it.next());
            }
            k81 k81Var = this.QrzZRwfaDlRX;
            long[] jArr = k81Var.PxuCJdSBwIXG;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((j & 255) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj2 = k81Var.lS5Rgt96tfkO[i4];
                                float f = k81Var.TSizfFm2Yiuu[i4];
                                if (!cs0.wdg6QnbFHrFF((String) obj2, ((x91) mj1Var.getValue()).cpQdD2nAriOS)) {
                                    k81Var.e9gEMXR7LXtO--;
                                    long[] jArr2 = k81Var.PxuCJdSBwIXG;
                                    int i5 = k81Var.Y1f8riQaR6yg;
                                    int i6 = i4 >> 3;
                                    int i7 = (i4 & 7) << 3;
                                    long j2 = (jArr2[i6] & (~(255 << i7))) | (254 << i7);
                                    jArr2[i6] = j2;
                                    jArr2[(((i4 - 7) & i5) + (i5 & 7)) >> 3] = j2;
                                    k81Var.lS5Rgt96tfkO[i4] = null;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return no2.PxuCJdSBwIXG;
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        return new tb1(this.x50lh2ztY7Y5, this.cpQdD2nAriOS, this.r3s1LDPKFs1S, this.QrzZRwfaDlRX, this.gPXPFXrUH4XX, this.BRwzKIf41E4i, btVar);
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        tb1 tb1Var = (tb1) gPXPFXrUH4XX((bt) obj2, (ru) obj);
        no2 no2Var = no2.PxuCJdSBwIXG;
        tb1Var.RfyTYNmI9Srp(no2Var);
        return no2Var;
    }
}
