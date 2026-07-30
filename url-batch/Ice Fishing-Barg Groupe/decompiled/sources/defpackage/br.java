package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class br {
    public static final ar Companion = new ar();
    public static final br a92UlCVFR9N8;
    public static final br e9gEMXR7LXtO;
    public final boolean PxuCJdSBwIXG;
    public final String[] TSizfFm2Yiuu;
    public final String[] Y1f8riQaR6yg;
    public final boolean lS5Rgt96tfkO;

    static {
        yj yjVar = yj.BRwzKIf41E4i;
        yj yjVar2 = yj.XL4ISE6Oc65B;
        yj yjVar3 = yj.RfyTYNmI9Srp;
        yj yjVar4 = yj.dgRBjINgWbAK;
        yj yjVar5 = yj.cpQdD2nAriOS;
        yj yjVar6 = yj.x50lh2ztY7Y5;
        yj yjVar7 = yj.r3s1LDPKFs1S;
        yj yjVar8 = yj.gPXPFXrUH4XX;
        yj yjVar9 = yj.QrzZRwfaDlRX;
        List D0aTLcX6Uhyo = fx1.D0aTLcX6Uhyo(yjVar, yjVar2, yjVar3, yjVar4, yjVar5, yjVar6, yjVar7, yjVar8, yjVar9);
        List D0aTLcX6Uhyo2 = fx1.D0aTLcX6Uhyo(yjVar, yjVar2, yjVar3, yjVar4, yjVar5, yjVar6, yjVar7, yjVar8, yjVar9, yj.OPXfSBeufaJ8, yj.wdg6QnbFHrFF, yj.RAsUl2FVSrh6, yj.rtx2ld2ELZv4, yj.e9gEMXR7LXtO, yj.a92UlCVFR9N8, yj.Y1f8riQaR6yg);
        zq zqVar = new zq();
        yj[] yjVarArr = (yj[]) D0aTLcX6Uhyo.toArray(new yj[0]);
        zqVar.lS5Rgt96tfkO((yj[]) Arrays.copyOf(yjVarArr, yjVarArr.length));
        dk2 dk2Var = dk2.OPXfSBeufaJ8;
        dk2 dk2Var2 = dk2.wdg6QnbFHrFF;
        zqVar.TSizfFm2Yiuu(dk2Var, dk2Var2);
        zqVar.Y1f8riQaR6yg = true;
        zqVar.PxuCJdSBwIXG();
        zq zqVar2 = new zq();
        yj[] yjVarArr2 = (yj[]) D0aTLcX6Uhyo2.toArray(new yj[0]);
        zqVar2.lS5Rgt96tfkO((yj[]) Arrays.copyOf(yjVarArr2, yjVarArr2.length));
        zqVar2.TSizfFm2Yiuu(dk2Var, dk2Var2);
        zqVar2.Y1f8riQaR6yg = true;
        e9gEMXR7LXtO = zqVar2.PxuCJdSBwIXG();
        zq zqVar3 = new zq();
        yj[] yjVarArr3 = (yj[]) D0aTLcX6Uhyo2.toArray(new yj[0]);
        zqVar3.lS5Rgt96tfkO((yj[]) Arrays.copyOf(yjVarArr3, yjVarArr3.length));
        zqVar3.TSizfFm2Yiuu(dk2Var, dk2Var2, dk2.dgRBjINgWbAK, dk2.x50lh2ztY7Y5);
        zqVar3.Y1f8riQaR6yg = true;
        zqVar3.PxuCJdSBwIXG();
        a92UlCVFR9N8 = new br(false, false, null, null);
    }

    public br(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.PxuCJdSBwIXG = z;
        this.lS5Rgt96tfkO = z2;
        this.TSizfFm2Yiuu = strArr;
        this.Y1f8riQaR6yg = strArr2;
    }

    public final void PxuCJdSBwIXG(SSLSocket sSLSocket, boolean z) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        enabledCipherSuites.getClass();
        String[] strArr = this.TSizfFm2Yiuu;
        if (strArr != null) {
            yj.Companion.getClass();
            enabledCipherSuites = kv2.OPXfSBeufaJ8(strArr, enabledCipherSuites, yj.lS5Rgt96tfkO);
        }
        String[] strArr2 = this.Y1f8riQaR6yg;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            enabledProtocols2.getClass();
            enabledProtocols = kv2.OPXfSBeufaJ8(enabledProtocols2, strArr2, u91.lS5Rgt96tfkO);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        yj.Companion.getClass();
        db0 db0Var = yj.lS5Rgt96tfkO;
        byte[] bArr = kv2.PxuCJdSBwIXG;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (db0Var.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i++;
            }
        }
        if (z && i != -1) {
            String str = supportedCipherSuites[i];
            str.getClass();
            enabledCipherSuites.getClass();
            enabledCipherSuites = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length);
        boolean z2 = this.PxuCJdSBwIXG;
        if (!z2) {
            u9.XL4ISE6Oc65B("no cipher suites for cleartext connections");
            return;
        }
        if (strArr3.length == 0) {
            u9.XL4ISE6Oc65B("At least one cipher suite is required");
            return;
        }
        String[] strArr4 = (String[]) Arrays.copyOf(strArr3, strArr3.length);
        String[] strArr5 = (String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length);
        if (!z2) {
            u9.XL4ISE6Oc65B("no TLS versions for cleartext connections");
            return;
        }
        if (strArr5.length == 0) {
            u9.XL4ISE6Oc65B("At least one TLS version is required");
            return;
        }
        br brVar = new br(z2, this.lS5Rgt96tfkO, strArr4, (String[]) Arrays.copyOf(strArr5, strArr5.length));
        if (brVar.TSizfFm2Yiuu() != null) {
            sSLSocket.setEnabledProtocols(brVar.Y1f8riQaR6yg);
        }
        if (brVar.lS5Rgt96tfkO() != null) {
            sSLSocket.setEnabledCipherSuites(brVar.TSizfFm2Yiuu);
        }
    }

    public final ArrayList TSizfFm2Yiuu() {
        String[] strArr = this.Y1f8riQaR6yg;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            dk2.Companion.getClass();
            arrayList.add(ck2.PxuCJdSBwIXG(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof br)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        br brVar = (br) obj;
        boolean z = brVar.PxuCJdSBwIXG;
        boolean z2 = this.PxuCJdSBwIXG;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.TSizfFm2Yiuu, brVar.TSizfFm2Yiuu) && Arrays.equals(this.Y1f8riQaR6yg, brVar.Y1f8riQaR6yg) && this.lS5Rgt96tfkO == brVar.lS5Rgt96tfkO;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.PxuCJdSBwIXG) {
            return 17;
        }
        String[] strArr = this.TSizfFm2Yiuu;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.Y1f8riQaR6yg;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.lS5Rgt96tfkO ? 1 : 0);
    }

    public final ArrayList lS5Rgt96tfkO() {
        String[] strArr = this.TSizfFm2Yiuu;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(yj.Companion.lS5Rgt96tfkO(str));
        }
        return arrayList;
    }

    public final String toString() {
        if (!this.PxuCJdSBwIXG) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(lS5Rgt96tfkO(), "[all enabled]") + ", tlsVersions=" + Objects.toString(TSizfFm2Yiuu(), "[all enabled]") + ", supportsTlsExtensions=" + this.lS5Rgt96tfkO + ')';
    }
}
