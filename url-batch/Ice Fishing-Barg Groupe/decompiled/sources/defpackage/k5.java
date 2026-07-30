package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class k5 implements Comparator {
    public final /* synthetic */ int PxuCJdSBwIXG;

    public /* synthetic */ k5(int i) {
        this.PxuCJdSBwIXG = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.PxuCJdSBwIXG) {
            case 0:
                return cs0.gPXPFXrUH4XX(((gq1) obj2).PxuCJdSBwIXG, ((gq1) obj).PxuCJdSBwIXG);
            case 1:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 2:
                return cs0.gPXPFXrUH4XX(((ks0) obj).lS5Rgt96tfkO, ((ks0) obj2).lS5Rgt96tfkO);
            case 3:
                br0 br0Var = (br0) obj;
                br0 br0Var2 = (br0) obj2;
                return (br0Var.OPXfSBeufaJ8 - br0Var.rtx2ld2ELZv4) - (br0Var2.OPXfSBeufaJ8 - br0Var2.rtx2ld2ELZv4);
            case 4:
                vw0 vw0Var = (vw0) obj;
                vw0 vw0Var2 = (vw0) obj2;
                float f = vw0Var.ryVscX7ZL4Ux.gPXPFXrUH4XX.nLZGh9p8gVSu;
                float f2 = vw0Var2.ryVscX7ZL4Ux.gPXPFXrUH4XX.nLZGh9p8gVSu;
                return f == f2 ? cs0.gPXPFXrUH4XX(vw0Var.VhhvGxCb8gfr(), vw0Var2.VhhvGxCb8gfr()) : Float.compare(f, f2);
            default:
                return cs0.gPXPFXrUH4XX(((fz0) obj).PxuCJdSBwIXG, ((fz0) obj2).PxuCJdSBwIXG);
        }
    }
}
