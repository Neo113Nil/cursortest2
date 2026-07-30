package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class zq {
    public final boolean PxuCJdSBwIXG = true;
    public String[] TSizfFm2Yiuu;
    public boolean Y1f8riQaR6yg;
    public String[] lS5Rgt96tfkO;

    public final br PxuCJdSBwIXG() {
        return new br(this.PxuCJdSBwIXG, this.Y1f8riQaR6yg, this.lS5Rgt96tfkO, this.TSizfFm2Yiuu);
    }

    public final void TSizfFm2Yiuu(dk2... dk2VarArr) {
        boolean z = this.PxuCJdSBwIXG;
        if (!z) {
            u9.XL4ISE6Oc65B("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(dk2VarArr.length);
        for (dk2 dk2Var : dk2VarArr) {
            arrayList.add(dk2Var.rtx2ld2ELZv4);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!z) {
            u9.XL4ISE6Oc65B("no TLS versions for cleartext connections");
        } else if (strArr2.length != 0) {
            this.TSizfFm2Yiuu = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            u9.XL4ISE6Oc65B("At least one TLS version is required");
        }
    }

    public final void lS5Rgt96tfkO(yj... yjVarArr) {
        boolean z = this.PxuCJdSBwIXG;
        if (!z) {
            u9.XL4ISE6Oc65B("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(yjVarArr.length);
        for (yj yjVar : yjVarArr) {
            arrayList.add(yjVar.PxuCJdSBwIXG);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!z) {
            u9.XL4ISE6Oc65B("no cipher suites for cleartext connections");
        } else if (strArr2.length != 0) {
            this.lS5Rgt96tfkO = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            u9.XL4ISE6Oc65B("At least one cipher suite is required");
        }
    }
}
