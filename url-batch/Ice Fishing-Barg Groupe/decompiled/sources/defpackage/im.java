package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class im extends jc2 implements pe0 {
    public /* synthetic */ Object BRwzKIf41E4i;
    public final /* synthetic */ w80 EcgxDIVH5in8;
    public int QrzZRwfaDlRX;
    public final /* synthetic */ h90 RfyTYNmI9Srp;
    public final /* synthetic */ v80[] XL4ISE6Oc65B;
    public byte[] cpQdD2nAriOS;
    public int gPXPFXrUH4XX;
    public int r3s1LDPKFs1S;
    public ui x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im(v80[] v80VarArr, h90 h90Var, w80 w80Var, bt btVar) {
        super(2, btVar);
        this.XL4ISE6Oc65B = v80VarArr;
        this.RfyTYNmI9Srp = h90Var;
        this.EcgxDIVH5in8 = w80Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x008c, code lost:
    
        if (r10 == r7) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cf, code lost:
    
        if (r17.RfyTYNmI9Srp.a92UlCVFR9N8(r17.EcgxDIVH5in8, r9, r17) == r7) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        if (r3 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d1, code lost:
    
        return r7;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00cf -> B:10:0x007a). Please report as a decompilation issue!!! */
    @Override // defpackage.nc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object RfyTYNmI9Srp(Object obj) {
        byte[] bArr;
        ui uiVar;
        int i;
        Object[] objArr;
        int i2;
        Object obj2;
        f50 f50Var = fx1.RAsUl2FVSrh6;
        int i3 = this.gPXPFXrUH4XX;
        su suVar = su.rtx2ld2ELZv4;
        if (i3 == 0) {
            ng0.tmVwIGCQF4zR(obj);
            ru ruVar = (ru) this.BRwzKIf41E4i;
            v80[] v80VarArr = this.XL4ISE6Oc65B;
            int length = v80VarArr.length;
            if (length != 0) {
                Object[] objArr2 = new Object[length];
                int i4 = 0;
                na.v6yxfmkxNKhL(0, length, f50Var, objArr2);
                eg PxuCJdSBwIXG = mm2.PxuCJdSBwIXG(length, 6, null);
                AtomicInteger atomicInteger = new AtomicInteger(length);
                int i5 = 0;
                while (i5 < length) {
                    fx1.KUoIVIumpKat(ruVar, null, new hm(v80VarArr, i5, atomicInteger, PxuCJdSBwIXG, null), 3);
                    i5++;
                    i4 = i4;
                }
                int i6 = i4;
                bArr = new byte[length];
                uiVar = PxuCJdSBwIXG;
                i = length;
                objArr = objArr2;
                i2 = i6;
            }
            return no2.PxuCJdSBwIXG;
        }
        if (i3 == 1) {
            i2 = this.QrzZRwfaDlRX;
            i = this.r3s1LDPKFs1S;
            bArr = this.cpQdD2nAriOS;
            uiVar = this.x50lh2ztY7Y5;
            objArr = (Object[]) this.BRwzKIf41E4i;
            ng0.tmVwIGCQF4zR(obj);
            obj2 = ((gj) obj).PxuCJdSBwIXG;
            tn0 tn0Var = (tn0) gj.PxuCJdSBwIXG(obj2);
            if (tn0Var != null) {
                while (true) {
                    int i7 = tn0Var.PxuCJdSBwIXG;
                    Object obj3 = objArr[i7];
                    objArr[i7] = tn0Var.lS5Rgt96tfkO;
                    if (obj3 == f50Var) {
                        i--;
                    }
                    if (bArr[i7] != i2) {
                        bArr[i7] = (byte) i2;
                        tn0Var = (tn0) gj.PxuCJdSBwIXG(uiVar.x50lh2ztY7Y5());
                        if (tn0Var != null) {
                        }
                    }
                    if (i == 0) {
                        this.BRwzKIf41E4i = objArr;
                        this.x50lh2ztY7Y5 = uiVar;
                        this.cpQdD2nAriOS = bArr;
                        this.r3s1LDPKFs1S = i;
                        this.QrzZRwfaDlRX = i2;
                        this.gPXPFXrUH4XX = 2;
                    }
                }
            }
            return no2.PxuCJdSBwIXG;
        }
        if (i3 != 2 && i3 != 3) {
            u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i2 = this.QrzZRwfaDlRX;
        i = this.r3s1LDPKFs1S;
        bArr = this.cpQdD2nAriOS;
        uiVar = this.x50lh2ztY7Y5;
        objArr = (Object[]) this.BRwzKIf41E4i;
        ng0.tmVwIGCQF4zR(obj);
        i2 = (byte) (i2 + 1);
        this.BRwzKIf41E4i = objArr;
        this.x50lh2ztY7Y5 = uiVar;
        this.cpQdD2nAriOS = bArr;
        this.r3s1LDPKFs1S = i;
        this.QrzZRwfaDlRX = i2;
        this.gPXPFXrUH4XX = 1;
        obj2 = uiVar.r3s1LDPKFs1S(this);
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        im imVar = new im(this.XL4ISE6Oc65B, this.RfyTYNmI9Srp, this.EcgxDIVH5in8, btVar);
        imVar.BRwzKIf41E4i = obj;
        return imVar;
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        return ((im) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2.PxuCJdSBwIXG);
    }
}
