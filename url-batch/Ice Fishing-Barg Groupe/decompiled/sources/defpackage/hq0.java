package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Toast;
import com.ice.fishing.grenza.R;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class hq0 {
    public static final f50 BRwzKIf41E4i;
    public static final lj2 EcgxDIVH5in8;
    public static Context PxuCJdSBwIXG;
    public static final uz1 RfyTYNmI9Srp;
    public static final lj2 S9EYkSpbGuxq;
    public static final f50 XL4ISE6Oc65B;
    public static final f50 gPXPFXrUH4XX;
    public static Boolean lS5Rgt96tfkO;
    public static final bt[] TSizfFm2Yiuu = new bt[0];
    public static final on Y1f8riQaR6yg = new on(-851771269, false, new HGgCfDnf0ga9(8));
    public static final ql e9gEMXR7LXtO = ql.x50lh2ztY7Y5;
    public static final ql a92UlCVFR9N8 = ql.wdg6QnbFHrFF;
    public static final float RAsUl2FVSrh6 = 0.1f;
    public static final ql rtx2ld2ELZv4 = ql.dgRBjINgWbAK;
    public static final float OPXfSBeufaJ8 = 0.38f;
    public static final float wdg6QnbFHrFF = 1.0f;
    public static final ql dgRBjINgWbAK = ql.OPXfSBeufaJ8;
    public static final Object x50lh2ztY7Y5 = new Object();
    public static final StackTraceElement[] cpQdD2nAriOS = new StackTraceElement[0];
    public static final byte[] r3s1LDPKFs1S = {112, 114, 111, 0};
    public static final byte[] QrzZRwfaDlRX = {112, 114, 109, 0};

    /* JADX WARN: Type inference failed for: r0v1, types: [lj2] */
    /* JADX WARN: Type inference failed for: r1v17, types: [lj2] */
    static {
        final byte b = 0;
        final int i = 1;
        gPXPFXrUH4XX = new f50("NONE", i);
        BRwzKIf41E4i = new f50("PENDING", i);
        XL4ISE6Oc65B = new f50("NO_THREAD_ELEMENTS", i);
        RfyTYNmI9Srp = new uz1(29, b);
        EcgxDIVH5in8 = new pe0() { // from class: lj2
            @Override // defpackage.pe0
            public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
                switch (b) {
                    case 0:
                        mj2 mj2Var = (mj2) obj;
                        fu fuVar = (fu) obj2;
                        if (mj2Var != null) {
                            return mj2Var;
                        }
                        if (fuVar instanceof mj2) {
                            return (mj2) fuVar;
                        }
                        return null;
                    default:
                        rj2 rj2Var = (rj2) obj;
                        fu fuVar2 = (fu) obj2;
                        if (fuVar2 instanceof mj2) {
                            mj2 mj2Var2 = (mj2) fuVar2;
                            hu huVar = rj2Var.PxuCJdSBwIXG;
                            Object TSizfFm2Yiuu2 = mj2Var2.TSizfFm2Yiuu();
                            Object[] objArr = rj2Var.lS5Rgt96tfkO;
                            int i2 = rj2Var.Y1f8riQaR6yg;
                            objArr[i2] = TSizfFm2Yiuu2;
                            mj2[] mj2VarArr = rj2Var.TSizfFm2Yiuu;
                            rj2Var.Y1f8riQaR6yg = i2 + 1;
                            mj2VarArr[i2] = mj2Var2;
                        }
                        return rj2Var;
                }
            }
        };
        S9EYkSpbGuxq = new pe0() { // from class: lj2
            @Override // defpackage.pe0
            public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        mj2 mj2Var = (mj2) obj;
                        fu fuVar = (fu) obj2;
                        if (mj2Var != null) {
                            return mj2Var;
                        }
                        if (fuVar instanceof mj2) {
                            return (mj2) fuVar;
                        }
                        return null;
                    default:
                        rj2 rj2Var = (rj2) obj;
                        fu fuVar2 = (fu) obj2;
                        if (fuVar2 instanceof mj2) {
                            mj2 mj2Var2 = (mj2) fuVar2;
                            hu huVar = rj2Var.PxuCJdSBwIXG;
                            Object TSizfFm2Yiuu2 = mj2Var2.TSizfFm2Yiuu();
                            Object[] objArr = rj2Var.lS5Rgt96tfkO;
                            int i2 = rj2Var.Y1f8riQaR6yg;
                            objArr[i2] = TSizfFm2Yiuu2;
                            mj2[] mj2VarArr = rj2Var.TSizfFm2Yiuu;
                            rj2Var.Y1f8riQaR6yg = i2 + 1;
                            mj2VarArr[i2] = mj2Var2;
                        }
                        return rj2Var;
                }
            }
        };
    }

    public static final n61 BRwzKIf41E4i(n61 n61Var, z42 z42Var) {
        return zv.e6tOsSdd2EFb(n61Var, 0.0f, 0.0f, 0.0f, z42Var, 518143);
    }

    public static final Object BjEWd04qc7Mw(il1 il1Var, gr1 gr1Var) {
        gr1Var.getClass();
        Object obj = il1Var.get(gr1Var);
        if (obj == null) {
            obj = gr1Var.lS5Rgt96tfkO();
        }
        return ((jp2) obj).PxuCJdSBwIXG(il1Var);
    }

    public static byte[] EcgxDIVH5in8(gz[] gzVarArr, byte[] bArr) {
        int i = 0;
        int i2 = 0;
        for (gz gzVar : gzVarArr) {
            i2 += ((((gzVar.RAsUl2FVSrh6 * 2) + 7) & (-8)) / 8) + (gzVar.e9gEMXR7LXtO * 2) + pnx5pC0XzaCw(gzVar.PxuCJdSBwIXG, gzVar.lS5Rgt96tfkO, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + gzVar.a92UlCVFR9N8;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, bs0.XL4ISE6Oc65B)) {
            int length = gzVarArr.length;
            while (i < length) {
                gz gzVar2 = gzVarArr[i];
                ngxnMNrpiKat(byteArrayOutputStream, gzVar2, pnx5pC0XzaCw(gzVar2.PxuCJdSBwIXG, gzVar2.lS5Rgt96tfkO, bArr));
                bEKsvqmvPh2y(byteArrayOutputStream, gzVar2);
                i++;
            }
        } else {
            for (gz gzVar3 : gzVarArr) {
                ngxnMNrpiKat(byteArrayOutputStream, gzVar3, pnx5pC0XzaCw(gzVar3.PxuCJdSBwIXG, gzVar3.lS5Rgt96tfkO, bArr));
            }
            int length2 = gzVarArr.length;
            while (i < length2) {
                bEKsvqmvPh2y(byteArrayOutputStream, gzVarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    public static gz[] EpkonXwzFgDB(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, gz[] gzVarArr) {
        gz gzVar;
        if (byteArrayInputStream.available() == 0) {
            return new gz[0];
        }
        if (i != gzVarArr.length) {
            u9.rtx2ld2ELZv4("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            fx1.e4HgwifUDUCA(byteArrayInputStream, 2);
            String str = new String(fx1.v6yxfmkxNKhL(byteArrayInputStream, (int) fx1.e4HgwifUDUCA(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long e4HgwifUDUCA = fx1.e4HgwifUDUCA(byteArrayInputStream, 4);
            int e4HgwifUDUCA2 = (int) fx1.e4HgwifUDUCA(byteArrayInputStream, 2);
            if (gzVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                for (int i3 = 0; i3 < gzVarArr.length; i3++) {
                    if (gzVarArr[i3].lS5Rgt96tfkO.equals(substring)) {
                        gzVar = gzVarArr[i3];
                        break;
                    }
                }
            }
            gzVar = null;
            if (gzVar == null) {
                u9.rtx2ld2ELZv4("Missing profile key: ".concat(str));
                return null;
            }
            gzVar.Y1f8riQaR6yg = e4HgwifUDUCA;
            int[] ozEBbv0hFTAB = ozEBbv0hFTAB(byteArrayInputStream, e4HgwifUDUCA2);
            if (Arrays.equals(bArr, bs0.EcgxDIVH5in8)) {
                gzVar.e9gEMXR7LXtO = e4HgwifUDUCA2;
                gzVar.rtx2ld2ELZv4 = ozEBbv0hFTAB;
            }
        }
        return gzVarArr;
    }

    public static final void IAToe7bXGz4N(hu huVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = lu.PxuCJdSBwIXG.iterator();
        while (it.hasNext()) {
            try {
                ((ku) it.next()).ZbWwgt3aGe7A(huVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    f2.RAsUl2FVSrh6(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            f2.RAsUl2FVSrh6(th, new iz(huVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final il1 IXK6ba3ucyzm(ir1[] ir1VarArr, il1 il1Var, il1 il1Var2) {
        kj0.tmVwIGCQF4zR();
        gl1 gl1Var = new gl1(il1.dgRBjINgWbAK);
        for (ir1 ir1Var : ir1VarArr) {
            gr1 gr1Var = ir1Var.PxuCJdSBwIXG;
            if (ir1Var.a92UlCVFR9N8 || !il1Var.containsKey(gr1Var)) {
                gl1Var.put(gr1Var, gr1Var.TSizfFm2Yiuu(ir1Var, (jp2) il1Var2.get(gr1Var)));
            }
        }
        return gl1Var.PxuCJdSBwIXG();
    }

    public static gz[] J54yh1s3n4Aq(ByteArrayInputStream byteArrayInputStream, int i, gz[] gzVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new gz[0];
        }
        if (i != gzVarArr.length) {
            u9.rtx2ld2ELZv4("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int e4HgwifUDUCA = (int) fx1.e4HgwifUDUCA(byteArrayInputStream, 2);
            iArr[i2] = (int) fx1.e4HgwifUDUCA(byteArrayInputStream, 2);
            strArr[i2] = new String(fx1.v6yxfmkxNKhL(byteArrayInputStream, e4HgwifUDUCA), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            gz gzVar = gzVarArr[i3];
            if (!gzVar.lS5Rgt96tfkO.equals(strArr[i3])) {
                u9.rtx2ld2ELZv4("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i4 = iArr[i3];
            gzVar.e9gEMXR7LXtO = i4;
            gzVar.rtx2ld2ELZv4 = ozEBbv0hFTAB(byteArrayInputStream, i4);
        }
        return gzVarArr;
    }

    public static final Object JHNfcAUfKc4G(hu huVar, Object obj) {
        if (obj == null) {
            obj = xbgXKYA2cIfu(huVar);
        }
        if (obj == 0) {
            return XL4ISE6Oc65B;
        }
        if (!(obj instanceof Integer)) {
            return ((mj2) obj).TSizfFm2Yiuu();
        }
        return huVar.IAToe7bXGz4N(S9EYkSpbGuxq, new rj2(((Number) obj).intValue(), huVar));
    }

    public static void KUoIVIumpKat(ByteArrayOutputStream byteArrayOutputStream, gz gzVar) {
        int i = 0;
        for (Map.Entry entry : gzVar.OPXfSBeufaJ8.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                fx1.wnqUPcAvl7HT(byteArrayOutputStream, intValue - i);
                fx1.wnqUPcAvl7HT(byteArrayOutputStream, 0);
                i = intValue;
            }
        }
    }

    public static final void OPXfSBeufaJ8(n61 n61Var, on onVar, hp hpVar, int i) {
        int i2;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(2064964257);
        if ((i & 6) == 0) {
            i2 = (tf0Var.a92UlCVFR9N8(n61Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tf0Var.rtx2ld2ELZv4(onVar) ? 32 : 16;
        }
        int i3 = 0;
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 19) != 18)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            wdg6QnbFHrFF(n61Var, onVar, tf0Var, ((i2 << 3) & 896) | (i2 & 14) | 48);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new l6(n61Var, onVar, i, i3);
        }
    }

    public static void POWyO8hTM6YC(EditorInfo editorInfo, CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            hnJvRxDXo0hm.rtx2ld2ELZv4(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i >= 30) {
            hnJvRxDXo0hm.rtx2ld2ELZv4(editorInfo, charSequence);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = charSequence.length();
        if (i4 < 0 || i2 > length) {
            zf8DYfih6EZu(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            zf8DYfih6EZu(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            zf8DYfih6EZu(editorInfo, charSequence, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int min = Math.min(charSequence.length() - i2, i8 - Math.min(i4, (int) (i8 * 0.8d)));
        int min2 = Math.min(i4, i8 - min);
        int i9 = i4 - min2;
        if (Character.isLowSurrogate(charSequence.charAt(i9))) {
            i9++;
            min2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i2 + min) - 1))) {
            min--;
        }
        int i10 = min2 + i7;
        zf8DYfih6EZu(editorInfo, i7 != i6 ? TextUtils.concat(charSequence.subSequence(i9, i9 + min2), charSequence.subSequence(i2, min + i2)) : charSequence.subSequence(i9, i10 + min + i9), min2, i10);
    }

    public static final void Pf0ThKz3j5YS(hu huVar, Object obj) {
        if (obj == XL4ISE6Oc65B) {
            return;
        }
        if (!(obj instanceof rj2)) {
            Object IAToe7bXGz4N = huVar.IAToe7bXGz4N(EcgxDIVH5in8, null);
            IAToe7bXGz4N.getClass();
            ((mj2) IAToe7bXGz4N).PxuCJdSBwIXG(obj);
            return;
        }
        rj2 rj2Var = (rj2) obj;
        mj2[] mj2VarArr = rj2Var.TSizfFm2Yiuu;
        int length = mj2VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            mj2 mj2Var = mj2VarArr[length];
            mj2Var.getClass();
            mj2Var.PxuCJdSBwIXG(rj2Var.lS5Rgt96tfkO[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    public static final void PxuCJdSBwIXG(n61 n61Var, le0 le0Var, hp hpVar, int i) {
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(-932836462);
        int i2 = 2;
        int i3 = (tf0Var.a92UlCVFR9N8(n61Var) ? 4 : 2) | i | (tf0Var.rtx2ld2ELZv4(le0Var) ? 32 : 16);
        if (tf0Var.Pf0ThKz3j5YS(i3 & 1, (i3 & 19) != 18)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            ki0.wdg6QnbFHrFF(tf0Var, fx1.ozEBbv0hFTAB(n61Var, le0Var));
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new bf(i, i2, n61Var, le0Var);
        }
    }

    public static v80 QrzZRwfaDlRX(v80 v80Var, int i) {
        ag agVar;
        if (i < 0 && i != -2 && i != -1) {
            u9.e9gEMXR7LXtO(o0.wdg6QnbFHrFF("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", i));
            return null;
        }
        if (i == -1) {
            i = 0;
            agVar = ag.OPXfSBeufaJ8;
        } else {
            agVar = ag.rtx2ld2ELZv4;
        }
        boolean z = v80Var instanceof bf0;
        n50 n50Var = n50.rtx2ld2ELZv4;
        return z ? ((bf0) v80Var).lS5Rgt96tfkO(n50Var, i, agVar) : new yi(v80Var, n50Var, i, agVar);
    }

    public static final l92 RAsUl2FVSrh6(Object obj) {
        if (obj == null) {
            obj = fx1.a92UlCVFR9N8;
        }
        return new l92(obj);
    }

    public static final void RfyTYNmI9Srp(int i, int i2) {
        if (i <= i2) {
            return;
        }
        rc1.Y1f8riQaR6yg(i, i2, ") is greater than size (", "toIndex (");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object S2OOm9zPNm0h(v80 v80Var, pe0 pe0Var, ct ctVar) {
        l90 l90Var;
        int i;
        pe0 pe0Var2;
        zt1 zt1Var;
        TSizfFm2Yiuu e;
        x00 x00Var;
        Object obj;
        f50 f50Var = fx1.a92UlCVFR9N8;
        if (ctVar instanceof l90) {
            l90Var = (l90) ctVar;
            int i2 = l90Var.QrzZRwfaDlRX;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l90Var.QrzZRwfaDlRX = i2 - Integer.MIN_VALUE;
                Object obj2 = l90Var.r3s1LDPKFs1S;
                i = l90Var.QrzZRwfaDlRX;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj2);
                    zt1 zt1Var2 = new zt1();
                    zt1Var2.rtx2ld2ELZv4 = f50Var;
                    x00 x00Var2 = new x00(pe0Var, zt1Var2);
                    try {
                        l90Var.dgRBjINgWbAK = (jc2) pe0Var;
                        l90Var.x50lh2ztY7Y5 = zt1Var2;
                        l90Var.cpQdD2nAriOS = x00Var2;
                        l90Var.QrzZRwfaDlRX = 1;
                        Object PxuCJdSBwIXG2 = v80Var.PxuCJdSBwIXG(x00Var2, l90Var);
                        Object obj3 = su.rtx2ld2ELZv4;
                        if (PxuCJdSBwIXG2 == obj3) {
                            return obj3;
                        }
                        pe0Var2 = pe0Var;
                        zt1Var = zt1Var2;
                    } catch (TSizfFm2Yiuu e2) {
                        pe0Var2 = pe0Var;
                        zt1Var = zt1Var2;
                        e = e2;
                        x00Var = x00Var2;
                        if (e.rtx2ld2ELZv4 != x00Var) {
                            throw e;
                        }
                        obj = zt1Var.rtx2ld2ELZv4;
                        if (obj == f50Var) {
                        }
                    }
                } else {
                    if (i != 1) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    x00Var = l90Var.cpQdD2nAriOS;
                    zt1Var = l90Var.x50lh2ztY7Y5;
                    pe0Var2 = (pe0) l90Var.dgRBjINgWbAK;
                    try {
                        ng0.tmVwIGCQF4zR(obj2);
                    } catch (TSizfFm2Yiuu e3) {
                        e = e3;
                        if (e.rtx2ld2ELZv4 != x00Var) {
                        }
                        obj = zt1Var.rtx2ld2ELZv4;
                        if (obj == f50Var) {
                        }
                    }
                }
                obj = zt1Var.rtx2ld2ELZv4;
                if (obj == f50Var) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element matching the predicate " + pe0Var2);
            }
        }
        l90Var = new l90(ctVar);
        Object obj22 = l90Var.r3s1LDPKFs1S;
        i = l90Var.QrzZRwfaDlRX;
        if (i != 0) {
        }
        obj = zt1Var.rtx2ld2ELZv4;
        if (obj == f50Var) {
        }
    }

    public static final qb0 S9EYkSpbGuxq(Context context) {
        return new qb0(new q3(context, 0), new r3(Build.VERSION.SDK_INT >= 31 ? yc0.PxuCJdSBwIXG.PxuCJdSBwIXG(context) : 0));
    }

    public static final void TSizfFm2Yiuu(final int i, final lb1 lb1Var, wy wyVar, hp hpVar, int i2) {
        tf0 tf0Var;
        final wy wyVar2;
        int i3;
        lb1Var.getClass();
        tf0 tf0Var2 = (tf0) hpVar;
        tf0Var2.JHNfcAUfKc4G(-1383467860);
        int i4 = (tf0Var2.Y1f8riQaR6yg(i) ? 4 : 2) | i2 | (tf0Var2.rtx2ld2ELZv4(lb1Var) ? 32 : 16) | 128;
        int i5 = 1;
        if (tf0Var2.Pf0ThKz3j5YS(i4 & 1, (i4 & 147) != 146)) {
            tf0Var2.wLFCmsViZrNT();
            if ((i2 & 1) == 0 || tf0Var2.pnx5pC0XzaCw()) {
                pr2 PxuCJdSBwIXG2 = l21.PxuCJdSBwIXG(tf0Var2);
                if (PxuCJdSBwIXG2 == null) {
                    u9.rtx2ld2ELZv4("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    wyVar2 = (wy) th0.Pf0ThKz3j5YS(bu1.PxuCJdSBwIXG(wy.class), PxuCJdSBwIXG2, sj0.nLZGh9p8gVSu(ki0.xfACYKDMU6Dj(PxuCJdSBwIXG2), tf0Var2), ki0.EpkonXwzFgDB(PxuCJdSBwIXG2), tf0Var2);
                    i3 = i4 & (-897);
                }
            } else {
                tf0Var2.i68hK7ahKtgp();
                i3 = i4 & (-897);
                wyVar2 = wyVar;
            }
            tf0Var2.BRwzKIf41E4i();
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            final d91 QrzZRwfaDlRX2 = sj0.QrzZRwfaDlRX(wyVar2.Y1f8riQaR6yg, tf0Var2);
            Object nLZGh9p8gVSu = tf0Var2.nLZGh9p8gVSu();
            hp.Companion.getClass();
            jx1 jx1Var = fp.lS5Rgt96tfkO;
            if (nLZGh9p8gVSu == jx1Var) {
                nLZGh9p8gVSu = new fj1(0.0f);
                tf0Var2.JTxCbbCwomzt(nLZGh9p8gVSu);
            }
            final fj1 fj1Var = (fj1) nLZGh9p8gVSu;
            final Context context = (Context) tf0Var2.wdg6QnbFHrFF(h2.lS5Rgt96tfkO);
            final Resources resources = (Resources) tf0Var2.wdg6QnbFHrFF(h2.TSizfFm2Yiuu);
            Integer valueOf = Integer.valueOf(i);
            int i6 = i3 & 14;
            boolean rtx2ld2ELZv42 = tf0Var2.rtx2ld2ELZv4(wyVar2) | (i6 == 4);
            Object nLZGh9p8gVSu2 = tf0Var2.nLZGh9p8gVSu();
            bt btVar = null;
            if (rtx2ld2ELZv42 || nLZGh9p8gVSu2 == jx1Var) {
                nLZGh9p8gVSu2 = new ew(wyVar2, i, btVar, i5);
                tf0Var2.JTxCbbCwomzt(nLZGh9p8gVSu2);
            }
            mm2.wdg6QnbFHrFF(tf0Var2, (pe0) nLZGh9p8gVSu2, valueOf);
            qs0 qs0Var = (qs0) QrzZRwfaDlRX2.getValue();
            boolean a92UlCVFR9N82 = tf0Var2.a92UlCVFR9N8(QrzZRwfaDlRX2);
            Object nLZGh9p8gVSu3 = tf0Var2.nLZGh9p8gVSu();
            if (a92UlCVFR9N82 || nLZGh9p8gVSu3 == jx1Var) {
                nLZGh9p8gVSu3 = new gv(QrzZRwfaDlRX2, fj1Var, null);
                tf0Var2.JTxCbbCwomzt(nLZGh9p8gVSu3);
            }
            mm2.wdg6QnbFHrFF(tf0Var2, (pe0) nLZGh9p8gVSu3, qs0Var);
            k61 k61Var = n61.Companion;
            w70 w70Var = c62.TSizfFm2Yiuu;
            k61Var.getClass();
            n61 r3s1LDPKFs1S2 = r3s1LDPKFs1S(w70Var, ((pl) tf0Var2.wdg6QnbFHrFF(rl.PxuCJdSBwIXG)).r3s1LDPKFs1S, b51.x50lh2ztY7Y5);
            ls2 ls2Var = ms2.Companion;
            n61 rZjpSjn4zoMv = f2.rZjpSjn4zoMv(r3s1LDPKFs1S2, 0.0f, ki0.QrzZRwfaDlRX(ni0.IAToe7bXGz4N(tf0Var2), tf0Var2).Y1f8riQaR6yg(), 0.0f, ki0.QrzZRwfaDlRX(ni0.ZbWwgt3aGe7A(tf0Var2), tf0Var2).TSizfFm2Yiuu() + 2.0f, 5);
            y9 y9Var = new y9(14.0f, new u9(0));
            boolean a92UlCVFR9N83 = tf0Var2.a92UlCVFR9N8(QrzZRwfaDlRX2) | tf0Var2.rtx2ld2ELZv4(lb1Var) | tf0Var2.rtx2ld2ELZv4(wyVar2) | (i6 == 4) | tf0Var2.rtx2ld2ELZv4(context) | tf0Var2.rtx2ld2ELZv4(resources);
            Object nLZGh9p8gVSu4 = tf0Var2.nLZGh9p8gVSu();
            if (a92UlCVFR9N83 || nLZGh9p8gVSu4 == jx1Var) {
                le0 le0Var = new le0() { // from class: xy
                    @Override // defpackage.le0
                    public final Object OPXfSBeufaJ8(Object obj) {
                        yy0 yy0Var = (yy0) obj;
                        yy0Var.getClass();
                        final d91 d91Var = d91.this;
                        yy0.PxuCJdSBwIXG(yy0Var, new on(728345345, true, new ws(1, d91Var, lb1Var)));
                        yy0.PxuCJdSBwIXG(yy0Var, new on(2107298232, true, new ai(2, d91Var)));
                        final wy wyVar3 = wyVar2;
                        final int i7 = i;
                        final Context context2 = context;
                        final Resources resources2 = resources;
                        final fj1 fj1Var2 = fj1Var;
                        yy0.PxuCJdSBwIXG(yy0Var, new on(21455417, true, new qe0() { // from class: bz
                            @Override // defpackage.qe0
                            public final Object a92UlCVFR9N8(Object obj2, Object obj3, Object obj4) {
                                boolean z;
                                hp hpVar2 = (hp) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                ((qx0) obj2).getClass();
                                tf0 tf0Var3 = (tf0) hpVar2;
                                if (tf0Var3.Pf0ThKz3j5YS(intValue & 1, (intValue & 17) != 16)) {
                                    gg1 gg1Var2 = mp.PxuCJdSBwIXG;
                                    qs0 qs0Var2 = (qs0) d91.this.getValue();
                                    if (qs0Var2 == null) {
                                        tf0Var3.IXK6ba3ucyzm(-771684680);
                                        tf0Var3.gPXPFXrUH4XX(false);
                                    } else {
                                        String str = qs0Var2.dgRBjINgWbAK;
                                        tf0Var3.IXK6ba3ucyzm(-771684679);
                                        k61 k61Var2 = n61.Companion;
                                        n61 kpCQ9veP6n3I = f2.kpCQ9veP6n3I(k61Var2, 16.0f, 0.0f, 2);
                                        y9 y9Var2 = new y9(14.0f, new u9(0));
                                        s.Companion.getClass();
                                        dm PxuCJdSBwIXG3 = bm.PxuCJdSBwIXG(y9Var2, r.cpQdD2nAriOS, tf0Var3, 6);
                                        int hashCode = Long.hashCode(tf0Var3.wLFCmsViZrNT);
                                        il1 x50lh2ztY7Y52 = tf0Var3.x50lh2ztY7Y5();
                                        n61 xfACYKDMU6Dj = ov2.xfACYKDMU6Dj(tf0Var3, kpCQ9veP6n3I);
                                        yo.Companion.getClass();
                                        ae0 ae0Var = xo.lS5Rgt96tfkO;
                                        tf0Var3.ngxnMNrpiKat();
                                        if (tf0Var3.zf8DYfih6EZu) {
                                            tf0Var3.dgRBjINgWbAK(ae0Var);
                                        } else {
                                            tf0Var3.hVNtCUZb4tYH();
                                        }
                                        p7 p7Var = xo.a92UlCVFR9N8;
                                        th0.tmVwIGCQF4zR(tf0Var3, p7Var, PxuCJdSBwIXG3);
                                        p7 p7Var2 = xo.e9gEMXR7LXtO;
                                        th0.tmVwIGCQF4zR(tf0Var3, p7Var2, x50lh2ztY7Y52);
                                        Integer valueOf2 = Integer.valueOf(hashCode);
                                        p7 p7Var3 = xo.RAsUl2FVSrh6;
                                        th0.tmVwIGCQF4zR(tf0Var3, p7Var3, valueOf2);
                                        k1 k1Var = xo.rtx2ld2ELZv4;
                                        th0.kpCQ9veP6n3I(tf0Var3, k1Var);
                                        p7 p7Var4 = xo.Y1f8riQaR6yg;
                                        th0.tmVwIGCQF4zR(tf0Var3, p7Var4, xfACYKDMU6Dj);
                                        n61 BRwzKIf41E4i2 = hq0.BRwzKIf41E4i(c62.lS5Rgt96tfkO(k61Var2, 1.0f), n9.PxuCJdSBwIXG);
                                        gr1 gr1Var = rl.PxuCJdSBwIXG;
                                        n61 jyegZNwi31qc = f2.jyegZNwi31qc(hq0.r3s1LDPKFs1S(BRwzKIf41E4i2, hl.lS5Rgt96tfkO(((pl) tf0Var3.wdg6QnbFHrFF(gr1Var)).PxuCJdSBwIXG, 0.06f), b51.x50lh2ztY7Y5), 16.0f);
                                        j51 Y1f8riQaR6yg2 = xe.Y1f8riQaR6yg(r.lS5Rgt96tfkO, false);
                                        int hashCode2 = Long.hashCode(tf0Var3.wLFCmsViZrNT);
                                        il1 x50lh2ztY7Y53 = tf0Var3.x50lh2ztY7Y5();
                                        n61 xfACYKDMU6Dj2 = ov2.xfACYKDMU6Dj(tf0Var3, jyegZNwi31qc);
                                        tf0Var3.ngxnMNrpiKat();
                                        if (tf0Var3.zf8DYfih6EZu) {
                                            tf0Var3.dgRBjINgWbAK(ae0Var);
                                        } else {
                                            tf0Var3.hVNtCUZb4tYH();
                                        }
                                        th0.tmVwIGCQF4zR(tf0Var3, p7Var, Y1f8riQaR6yg2);
                                        th0.tmVwIGCQF4zR(tf0Var3, p7Var2, x50lh2ztY7Y53);
                                        o0.EcgxDIVH5in8(hashCode2, tf0Var3, p7Var3, tf0Var3, k1Var);
                                        th0.tmVwIGCQF4zR(tf0Var3, p7Var4, xfACYKDMU6Dj2);
                                        gi2.lS5Rgt96tfkO(qs0Var2.Y1f8riQaR6yg, null, hl.lS5Rgt96tfkO(((pl) tf0Var3.wdg6QnbFHrFF(gr1Var)).PxuCJdSBwIXG, 0.85f), 0L, 0L, null, 0L, 0, false, 0, 0, ((en2) tf0Var3.wdg6QnbFHrFF(fn2.PxuCJdSBwIXG)).OPXfSBeufaJ8, tf0Var3, 0, 0, 131066);
                                        tf0Var3.gPXPFXrUH4XX(true);
                                        s90.PxuCJdSBwIXG(c62.lS5Rgt96tfkO(k61Var2, 1.0f), new y9(8.0f, new u9(0)), new y9(8.0f, new u9(0)), null, 0, 0, bs0.kpCQ9veP6n3I(1226548034, new ai(3, qs0Var2), tf0Var3), tf0Var3, 1573302);
                                        n61 lS5Rgt96tfkO2 = c62.lS5Rgt96tfkO(k61Var2, 1.0f);
                                        by1 PxuCJdSBwIXG4 = ay1.PxuCJdSBwIXG(new y9(10.0f, new u9(0)), r.dgRBjINgWbAK, tf0Var3, 6);
                                        int hashCode3 = Long.hashCode(tf0Var3.wLFCmsViZrNT);
                                        il1 x50lh2ztY7Y54 = tf0Var3.x50lh2ztY7Y5();
                                        n61 xfACYKDMU6Dj3 = ov2.xfACYKDMU6Dj(tf0Var3, lS5Rgt96tfkO2);
                                        tf0Var3.ngxnMNrpiKat();
                                        if (tf0Var3.zf8DYfih6EZu) {
                                            tf0Var3.dgRBjINgWbAK(ae0Var);
                                        } else {
                                            tf0Var3.hVNtCUZb4tYH();
                                        }
                                        th0.tmVwIGCQF4zR(tf0Var3, p7Var, PxuCJdSBwIXG4);
                                        th0.tmVwIGCQF4zR(tf0Var3, p7Var2, x50lh2ztY7Y54);
                                        o0.EcgxDIVH5in8(hashCode3, tf0Var3, p7Var3, tf0Var3, k1Var);
                                        th0.tmVwIGCQF4zR(tf0Var3, p7Var4, xfACYKDMU6Dj3);
                                        hq0.rtx2ld2ELZv4(qs0Var2.e9gEMXR7LXtO + "g", "Protein", mm2.Y1f8riQaR6yg(4294942240L), cy1.PxuCJdSBwIXG(k61Var2), tf0Var3, 432);
                                        hq0.rtx2ld2ELZv4(qs0Var2.rtx2ld2ELZv4 + "g", "Carbs", mm2.Y1f8riQaR6yg(4284142792L), cy1.PxuCJdSBwIXG(k61Var2), tf0Var3, 432);
                                        tf0Var3.gPXPFXrUH4XX(true);
                                        if (ia2.fRTaYY6FBZcX(str)) {
                                            z = false;
                                            tf0Var3.IXK6ba3ucyzm(1429029915);
                                        } else {
                                            tf0Var3.IXK6ba3ucyzm(-92450368);
                                            z = false;
                                            hq0.a92UlCVFR9N8(str, tf0Var3, 0);
                                        }
                                        tf0Var3.gPXPFXrUH4XX(z);
                                        final fj1 fj1Var3 = fj1Var2;
                                        float rtx2ld2ELZv43 = fj1Var3.rtx2ld2ELZv4();
                                        Object nLZGh9p8gVSu5 = tf0Var3.nLZGh9p8gVSu();
                                        hp.Companion.getClass();
                                        Object obj5 = fp.lS5Rgt96tfkO;
                                        if (nLZGh9p8gVSu5 == obj5) {
                                            nLZGh9p8gVSu5 = new r3s1LDPKFs1S(7, fj1Var3);
                                            tf0Var3.JTxCbbCwomzt(nLZGh9p8gVSu5);
                                        }
                                        le0 le0Var2 = (le0) nLZGh9p8gVSu5;
                                        final wy wyVar4 = wyVar3;
                                        boolean rtx2ld2ELZv44 = tf0Var3.rtx2ld2ELZv4(wyVar4);
                                        final int i8 = i7;
                                        boolean Y1f8riQaR6yg3 = rtx2ld2ELZv44 | tf0Var3.Y1f8riQaR6yg(i8);
                                        final Context context3 = context2;
                                        boolean rtx2ld2ELZv45 = Y1f8riQaR6yg3 | tf0Var3.rtx2ld2ELZv4(context3);
                                        final Resources resources3 = resources2;
                                        boolean rtx2ld2ELZv46 = rtx2ld2ELZv45 | tf0Var3.rtx2ld2ELZv4(resources3);
                                        Object nLZGh9p8gVSu6 = tf0Var3.nLZGh9p8gVSu();
                                        if (rtx2ld2ELZv46 || nLZGh9p8gVSu6 == obj5) {
                                            Object obj6 = new ae0() { // from class: cz
                                                @Override // defpackage.ae0
                                                public final Object PxuCJdSBwIXG() {
                                                    int rtx2ld2ELZv47 = (int) fj1Var3.rtx2ld2ELZv4();
                                                    wy wyVar5 = wy.this;
                                                    fx1.KUoIVIumpKat(fx1.nxJAScVArhE9(wyVar5), null, new vy(wyVar5, i8, rtx2ld2ELZv47, null), 3);
                                                    Toast.makeText(context3, resources3.getString(R.string.score_saved, Integer.valueOf(rtx2ld2ELZv47)), 0).show();
                                                    return no2.PxuCJdSBwIXG;
                                                }
                                            };
                                            tf0Var3.JTxCbbCwomzt(obj6);
                                            nLZGh9p8gVSu6 = obj6;
                                        }
                                        hq0.dgRBjINgWbAK(rtx2ld2ELZv43, le0Var2, (ae0) nLZGh9p8gVSu6, tf0Var3, 48);
                                        tf0Var3.gPXPFXrUH4XX(true);
                                        tf0Var3.gPXPFXrUH4XX(false);
                                    }
                                } else {
                                    tf0Var3.i68hK7ahKtgp();
                                }
                                return no2.PxuCJdSBwIXG;
                            }
                        }));
                        return no2.PxuCJdSBwIXG;
                    }
                };
                tf0Var2.JTxCbbCwomzt(le0Var);
                nLZGh9p8gVSu4 = le0Var;
            }
            tf0Var = tf0Var2;
            ni0.PxuCJdSBwIXG(rZjpSjn4zoMv, null, null, y9Var, null, null, false, null, (le0) nLZGh9p8gVSu4, tf0Var, 24576);
        } else {
            tf0Var = tf0Var2;
            tf0Var.i68hK7ahKtgp();
            wyVar2 = wyVar;
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new ln(i, lb1Var, wyVar2, i2);
        }
    }

    public static final v80 VhhvGxCb8gfr(v80 v80Var) {
        return v80Var instanceof j92 ? v80Var : v80Var instanceof y00 ? v80Var : new y00(v80Var);
    }

    public static final n61 XL4ISE6Oc65B(n61 n61Var) {
        return zv.e6tOsSdd2EFb(n61Var, 0.0f, 0.0f, 0.0f, null, 520191);
    }

    public static final void Y1f8riQaR6yg(String str, long j, hp hpVar, int i) {
        tf0 tf0Var;
        tf0 tf0Var2 = (tf0) hpVar;
        tf0Var2.JHNfcAUfKc4G(-128047195);
        int i2 = i | (tf0Var2.a92UlCVFR9N8(str) ? 4 : 2) | (tf0Var2.e9gEMXR7LXtO(j) ? 32 : 16);
        if (tf0Var2.Pf0ThKz3j5YS(i2 & 1, (i2 & 19) != 18)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            n61 aF05bpZJlKEP = f2.aF05bpZJlKEP(r3s1LDPKFs1S(BRwzKIf41E4i(n61.Companion, n9.PxuCJdSBwIXG), j, b51.x50lh2ztY7Y5), 12.0f, 8.0f);
            s.Companion.getClass();
            j51 Y1f8riQaR6yg2 = xe.Y1f8riQaR6yg(r.lS5Rgt96tfkO, false);
            int hashCode = Long.hashCode(tf0Var2.wLFCmsViZrNT);
            il1 x50lh2ztY7Y52 = tf0Var2.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj = ov2.xfACYKDMU6Dj(tf0Var2, aF05bpZJlKEP);
            yo.Companion.getClass();
            dq dqVar = xo.lS5Rgt96tfkO;
            tf0Var2.ngxnMNrpiKat();
            if (tf0Var2.zf8DYfih6EZu) {
                tf0Var2.dgRBjINgWbAK(dqVar);
            } else {
                tf0Var2.hVNtCUZb4tYH();
            }
            th0.tmVwIGCQF4zR(tf0Var2, xo.a92UlCVFR9N8, Y1f8riQaR6yg2);
            th0.tmVwIGCQF4zR(tf0Var2, xo.e9gEMXR7LXtO, x50lh2ztY7Y52);
            th0.tmVwIGCQF4zR(tf0Var2, xo.RAsUl2FVSrh6, Integer.valueOf(hashCode));
            th0.kpCQ9veP6n3I(tf0Var2, xo.rtx2ld2ELZv4);
            th0.tmVwIGCQF4zR(tf0Var2, xo.Y1f8riQaR6yg, xfACYKDMU6Dj);
            gi2.lS5Rgt96tfkO(str, null, ((pl) tf0Var2.wdg6QnbFHrFF(rl.PxuCJdSBwIXG)).PxuCJdSBwIXG, 0L, 0L, null, 0L, 0, false, 0, 0, ((en2) tf0Var2.wdg6QnbFHrFF(fn2.PxuCJdSBwIXG)).OPXfSBeufaJ8, tf0Var2, i2 & 14, 0, 131066);
            tf0Var = tf0Var2;
            tf0Var.gPXPFXrUH4XX(true);
        } else {
            tf0Var = tf0Var2;
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new r2(str, j, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object ZbWwgt3aGe7A(ca0 ca0Var, ct ctVar) {
        k90 k90Var;
        int i;
        zt1 zt1Var;
        TSizfFm2Yiuu e;
        b4 b4Var;
        Object obj;
        f50 f50Var = fx1.a92UlCVFR9N8;
        if (ctVar instanceof k90) {
            k90Var = (k90) ctVar;
            int i2 = k90Var.r3s1LDPKFs1S;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k90Var.r3s1LDPKFs1S = i2 - Integer.MIN_VALUE;
                Object obj2 = k90Var.cpQdD2nAriOS;
                i = k90Var.r3s1LDPKFs1S;
                int i3 = 1;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj2);
                    zt1 zt1Var2 = new zt1();
                    zt1Var2.rtx2ld2ELZv4 = f50Var;
                    b4 b4Var2 = new b4(i3, zt1Var2);
                    try {
                        k90Var.dgRBjINgWbAK = zt1Var2;
                        k90Var.x50lh2ztY7Y5 = b4Var2;
                        k90Var.r3s1LDPKFs1S = 1;
                        Object PxuCJdSBwIXG2 = ca0Var.PxuCJdSBwIXG(b4Var2, k90Var);
                        Object obj3 = su.rtx2ld2ELZv4;
                        if (PxuCJdSBwIXG2 == obj3) {
                            return obj3;
                        }
                        zt1Var = zt1Var2;
                    } catch (TSizfFm2Yiuu e2) {
                        zt1Var = zt1Var2;
                        e = e2;
                        b4Var = b4Var2;
                        if (e.rtx2ld2ELZv4 != b4Var) {
                        }
                        obj = zt1Var.rtx2ld2ELZv4;
                        if (obj == f50Var) {
                        }
                    }
                } else {
                    if (i != 1) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b4Var = k90Var.x50lh2ztY7Y5;
                    zt1Var = k90Var.dgRBjINgWbAK;
                    try {
                        ng0.tmVwIGCQF4zR(obj2);
                    } catch (TSizfFm2Yiuu e3) {
                        e = e3;
                        if (e.rtx2ld2ELZv4 != b4Var) {
                            throw e;
                        }
                        obj = zt1Var.rtx2ld2ELZv4;
                        if (obj == f50Var) {
                        }
                    }
                }
                obj = zt1Var.rtx2ld2ELZv4;
                if (obj == f50Var) {
                    return obj;
                }
                rc1.RAsUl2FVSrh6("Expected at least one element");
                return null;
            }
        }
        k90Var = new k90(ctVar);
        Object obj22 = k90Var.cpQdD2nAriOS;
        i = k90Var.r3s1LDPKFs1S;
        int i32 = 1;
        if (i != 0) {
        }
        obj = zt1Var.rtx2ld2ELZv4;
        if (obj == f50Var) {
        }
    }

    public static final void a92UlCVFR9N8(String str, hp hpVar, int i) {
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(771783490);
        int i2 = (tf0Var.a92UlCVFR9N8(str) ? 4 : 2) | i;
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 3) != 2)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            n61 jyegZNwi31qc = f2.jyegZNwi31qc(r3s1LDPKFs1S(BRwzKIf41E4i(c62.lS5Rgt96tfkO(n61.Companion, 1.0f), n9.PxuCJdSBwIXG), mm2.Y1f8riQaR6yg(4284142792L), b51.x50lh2ztY7Y5), 16.0f);
            s.Companion.getClass();
            j51 Y1f8riQaR6yg2 = xe.Y1f8riQaR6yg(r.lS5Rgt96tfkO, false);
            int hashCode = Long.hashCode(tf0Var.wLFCmsViZrNT);
            il1 x50lh2ztY7Y52 = tf0Var.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj = ov2.xfACYKDMU6Dj(tf0Var, jyegZNwi31qc);
            yo.Companion.getClass();
            dq dqVar = xo.lS5Rgt96tfkO;
            tf0Var.ngxnMNrpiKat();
            if (tf0Var.zf8DYfih6EZu) {
                tf0Var.dgRBjINgWbAK(dqVar);
            } else {
                tf0Var.hVNtCUZb4tYH();
            }
            th0.tmVwIGCQF4zR(tf0Var, xo.a92UlCVFR9N8, Y1f8riQaR6yg2);
            th0.tmVwIGCQF4zR(tf0Var, xo.e9gEMXR7LXtO, x50lh2ztY7Y52);
            th0.tmVwIGCQF4zR(tf0Var, xo.RAsUl2FVSrh6, Integer.valueOf(hashCode));
            th0.kpCQ9veP6n3I(tf0Var, xo.rtx2ld2ELZv4);
            th0.tmVwIGCQF4zR(tf0Var, xo.Y1f8riQaR6yg, xfACYKDMU6Dj);
            dj2 dj2Var = ((en2) tf0Var.wdg6QnbFHrFF(fn2.PxuCJdSBwIXG)).OPXfSBeufaJ8;
            long j = ((pl) tf0Var.wdg6QnbFHrFF(rl.PxuCJdSBwIXG)).PxuCJdSBwIXG;
            he2.Companion.getClass();
            gi2.lS5Rgt96tfkO("“" + str + "”", null, j, 0L, 0L, new he2(5), 0L, 0, false, 0, 0, dj2Var, tf0Var, 0, 0, 130042);
            tf0Var = tf0Var;
            tf0Var.gPXPFXrUH4XX(true);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new zy(i, 0, str);
        }
    }

    public static final n61 aF05bpZJlKEP(n61 n61Var, le0 le0Var) {
        return n61Var.TSizfFm2Yiuu(new uu0(le0Var, null));
    }

    public static final View amuv7NJvPxHu(m61 m61Var) {
        if (!m61Var.rtx2ld2ELZv4.S9EYkSpbGuxq) {
            ep0.lS5Rgt96tfkO("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) yw0.PxuCJdSBwIXG(zv.zf8DYfih6EZu(m61Var));
    }

    public static void bEKsvqmvPh2y(ByteArrayOutputStream byteArrayOutputStream, gz gzVar) {
        KUoIVIumpKat(byteArrayOutputStream, gzVar);
        int i = gzVar.RAsUl2FVSrh6;
        int[] iArr = gzVar.rtx2ld2ELZv4;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            fx1.wnqUPcAvl7HT(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : gzVar.OPXfSBeufaJ8.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i5 = intValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i6 = intValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final n61 cpQdD2nAriOS(n61 n61Var, float f) {
        return f == 1.0f ? n61Var : zv.e6tOsSdd2EFb(n61Var, 0.0f, 0.0f, f, null, 520187);
    }

    public static final void dgRBjINgWbAK(float f, final le0 le0Var, final ae0 ae0Var, hp hpVar, final int i) {
        long j;
        long j2;
        final float f2 = f;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(762778452);
        int i2 = (tf0Var.TSizfFm2Yiuu(f2) ? 4 : 2) | i | (tf0Var.rtx2ld2ELZv4(ae0Var) ? 256 : 128);
        int i3 = 0;
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 147) != 146)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            k61 k61Var = n61.Companion;
            n61 jyegZNwi31qc = f2.jyegZNwi31qc(r3s1LDPKFs1S(BRwzKIf41E4i(c62.lS5Rgt96tfkO(k61Var, 1.0f), n9.PxuCJdSBwIXG), ki0.aF05bpZJlKEP(tf0Var).PxuCJdSBwIXG, b51.x50lh2ztY7Y5), 18.0f);
            s.Companion.getClass();
            j51 Y1f8riQaR6yg2 = xe.Y1f8riQaR6yg(r.lS5Rgt96tfkO, false);
            int hashCode = Long.hashCode(tf0Var.wLFCmsViZrNT);
            il1 x50lh2ztY7Y52 = tf0Var.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj = ov2.xfACYKDMU6Dj(tf0Var, jyegZNwi31qc);
            yo.Companion.getClass();
            dq dqVar = xo.lS5Rgt96tfkO;
            tf0Var.ngxnMNrpiKat();
            if (tf0Var.zf8DYfih6EZu) {
                tf0Var.dgRBjINgWbAK(dqVar);
            } else {
                tf0Var.hVNtCUZb4tYH();
            }
            p7 p7Var = xo.a92UlCVFR9N8;
            th0.tmVwIGCQF4zR(tf0Var, p7Var, Y1f8riQaR6yg2);
            p7 p7Var2 = xo.e9gEMXR7LXtO;
            th0.tmVwIGCQF4zR(tf0Var, p7Var2, x50lh2ztY7Y52);
            Integer valueOf = Integer.valueOf(hashCode);
            p7 p7Var3 = xo.RAsUl2FVSrh6;
            th0.tmVwIGCQF4zR(tf0Var, p7Var3, valueOf);
            k1 k1Var = xo.rtx2ld2ELZv4;
            th0.kpCQ9veP6n3I(tf0Var, k1Var);
            p7 p7Var4 = xo.Y1f8riQaR6yg;
            th0.tmVwIGCQF4zR(tf0Var, p7Var4, xfACYKDMU6Dj);
            dm PxuCJdSBwIXG2 = bm.PxuCJdSBwIXG(new y9(12.0f, new u9(i3)), r.cpQdD2nAriOS, tf0Var, 6);
            int hashCode2 = Long.hashCode(tf0Var.wLFCmsViZrNT);
            il1 x50lh2ztY7Y53 = tf0Var.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj2 = ov2.xfACYKDMU6Dj(tf0Var, k61Var);
            tf0Var.ngxnMNrpiKat();
            if (tf0Var.zf8DYfih6EZu) {
                tf0Var.dgRBjINgWbAK(dqVar);
            } else {
                tf0Var.hVNtCUZb4tYH();
            }
            th0.tmVwIGCQF4zR(tf0Var, p7Var, PxuCJdSBwIXG2);
            th0.tmVwIGCQF4zR(tf0Var, p7Var2, x50lh2ztY7Y53);
            o0.EcgxDIVH5in8(hashCode2, tf0Var, p7Var3, tf0Var, k1Var);
            th0.tmVwIGCQF4zR(tf0Var, p7Var4, xfACYKDMU6Dj2);
            n61 lS5Rgt96tfkO2 = c62.lS5Rgt96tfkO(k61Var, 1.0f);
            by1 PxuCJdSBwIXG3 = ay1.PxuCJdSBwIXG(f2.e9gEMXR7LXtO, r.x50lh2ztY7Y5, tf0Var, 54);
            int hashCode3 = Long.hashCode(tf0Var.wLFCmsViZrNT);
            il1 x50lh2ztY7Y54 = tf0Var.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj3 = ov2.xfACYKDMU6Dj(tf0Var, lS5Rgt96tfkO2);
            tf0Var.ngxnMNrpiKat();
            if (tf0Var.zf8DYfih6EZu) {
                tf0Var.dgRBjINgWbAK(dqVar);
            } else {
                tf0Var.hVNtCUZb4tYH();
            }
            th0.tmVwIGCQF4zR(tf0Var, p7Var, PxuCJdSBwIXG3);
            th0.tmVwIGCQF4zR(tf0Var, p7Var2, x50lh2ztY7Y54);
            o0.EcgxDIVH5in8(hashCode3, tf0Var, p7Var3, tf0Var, k1Var);
            th0.tmVwIGCQF4zR(tf0Var, p7Var4, xfACYKDMU6Dj3);
            gi2.lS5Rgt96tfkO(jh0.BjEWd04qc7Mw(R.string.your_score, tf0Var), null, ki0.aF05bpZJlKEP(tf0Var).r3s1LDPKFs1S, 0L, 0L, null, 0L, 0, false, 0, 0, ki0.J54yh1s3n4Aq(tf0Var).rtx2ld2ELZv4, tf0Var, 0, 0, 131066);
            gi2.lS5Rgt96tfkO(((int) f2) + "%", null, ki0.aF05bpZJlKEP(tf0Var).a92UlCVFR9N8, 0L, 0L, null, 0L, 0, false, 0, 0, ki0.J54yh1s3n4Aq(tf0Var).RAsUl2FVSrh6, tf0Var, 0, 0, 131066);
            tf0Var.gPXPFXrUH4XX(true);
            tk tkVar = new tk(0.0f, 100.0f);
            l62 l62Var = l62.PxuCJdSBwIXG;
            long j3 = ki0.aF05bpZJlKEP(tf0Var).a92UlCVFR9N8;
            long j4 = ki0.aF05bpZJlKEP(tf0Var).a92UlCVFR9N8;
            long lS5Rgt96tfkO3 = hl.lS5Rgt96tfkO(ki0.aF05bpZJlKEP(tf0Var).r3s1LDPKFs1S, 0.25f);
            long j5 = ki0.aF05bpZJlKEP(tf0Var).a92UlCVFR9N8;
            long lS5Rgt96tfkO4 = hl.lS5Rgt96tfkO(ki0.aF05bpZJlKEP(tf0Var).r3s1LDPKFs1S, 0.15f);
            hl.Companion.getClass();
            long j6 = hl.RAsUl2FVSrh6;
            f62 e9gEMXR7LXtO2 = l62.e9gEMXR7LXtO((pl) tf0Var.wdg6QnbFHrFF(rl.PxuCJdSBwIXG));
            if (j3 != 16) {
                j2 = j3;
                j = lS5Rgt96tfkO4;
            } else {
                j = lS5Rgt96tfkO4;
                j2 = e9gEMXR7LXtO2.PxuCJdSBwIXG;
            }
            if (j4 == 16) {
                j4 = e9gEMXR7LXtO2.lS5Rgt96tfkO;
            }
            long j7 = j4;
            if (j5 == 16) {
                j5 = e9gEMXR7LXtO2.TSizfFm2Yiuu;
            }
            long j8 = j5;
            if (lS5Rgt96tfkO3 == 16) {
                lS5Rgt96tfkO3 = e9gEMXR7LXtO2.Y1f8riQaR6yg;
            }
            f2 = f;
            v62.PxuCJdSBwIXG(f2, le0Var, null, false, tkVar, ae0Var, new f62(j2, j7, j8, lS5Rgt96tfkO3, j != 16 ? j : e9gEMXR7LXtO2.e9gEMXR7LXtO, j6 != 16 ? j6 : e9gEMXR7LXtO2.a92UlCVFR9N8, j6 != 16 ? j6 : e9gEMXR7LXtO2.RAsUl2FVSrh6, j6 != 16 ? j6 : e9gEMXR7LXtO2.rtx2ld2ELZv4, j6 != 16 ? j6 : e9gEMXR7LXtO2.OPXfSBeufaJ8, j6 != 16 ? j6 : e9gEMXR7LXtO2.wdg6QnbFHrFF), null, tf0Var, (i2 & 126) | ((i2 << 12) & 3670016));
            tf0Var.gPXPFXrUH4XX(true);
            tf0Var.gPXPFXrUH4XX(true);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new pe0(f2, le0Var, ae0Var, i) { // from class: az
                public final /* synthetic */ le0 OPXfSBeufaJ8;
                public final /* synthetic */ float rtx2ld2ELZv4;
                public final /* synthetic */ ae0 wdg6QnbFHrFF;

                @Override // defpackage.pe0
                public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int bEKsvqmvPh2y = ki0.bEKsvqmvPh2y(49);
                    hq0.dgRBjINgWbAK(this.rtx2ld2ELZv4, this.OPXfSBeufaJ8, this.wdg6QnbFHrFF, (hp) obj, bEKsvqmvPh2y);
                    return no2.PxuCJdSBwIXG;
                }
            };
        }
    }

    public static n61 e6tOsSdd2EFb(n61 n61Var, e81 e81Var) {
        return n61Var.TSizfFm2Yiuu(new lk0(e81Var));
    }

    public static final long e9gEMXR7LXtO(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static n61 gGoUzNp9JO5I(n61 n61Var, jz0 jz0Var, th1 th1Var, k3 k3Var, boolean z, lw lwVar, e81 e81Var) {
        return n61Var.TSizfFm2Yiuu(th1Var == th1.rtx2ld2ELZv4 ? BRwzKIf41E4i(n61.Companion, gk0.TSizfFm2Yiuu) : BRwzKIf41E4i(n61.Companion, gk0.lS5Rgt96tfkO)).TSizfFm2Yiuu(new r02(k3Var, lwVar, e81Var, th1Var, jz0Var, z, false));
    }

    public static void i68hK7ahKtgp(EditorInfo editorInfo, boolean z) {
        if (Build.VERSION.SDK_INT >= 35) {
            p40.PxuCJdSBwIXG(editorInfo, z);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z);
    }

    public static final n61 kpCQ9veP6n3I(n61 n61Var, le0 le0Var) {
        return n61Var.TSizfFm2Yiuu(new uu0(null, le0Var));
    }

    public static final void lS5Rgt96tfkO(qs0 qs0Var, long j, hp hpVar, int i) {
        tf0 tf0Var;
        tf0 tf0Var2 = (tf0) hpVar;
        tf0Var2.JHNfcAUfKc4G(396512161);
        int i2 = i | (tf0Var2.a92UlCVFR9N8(qs0Var) ? 4 : 2) | (tf0Var2.e9gEMXR7LXtO(j) ? 32 : 16);
        if (tf0Var2.Pf0ThKz3j5YS(i2 & 1, (i2 & 19) != 18)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            k61 k61Var = n61.Companion;
            n61 TSizfFm2Yiuu2 = c62.TSizfFm2Yiuu(c62.lS5Rgt96tfkO(k61Var, 1.0f), 248.0f);
            gk0 gk0Var = b51.x50lh2ztY7Y5;
            n61 r3s1LDPKFs1S2 = r3s1LDPKFs1S(TSizfFm2Yiuu2, j, gk0Var);
            s.Companion.getClass();
            pd pdVar = r.lS5Rgt96tfkO;
            j51 Y1f8riQaR6yg2 = xe.Y1f8riQaR6yg(pdVar, false);
            int hashCode = Long.hashCode(tf0Var2.wLFCmsViZrNT);
            il1 x50lh2ztY7Y52 = tf0Var2.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj = ov2.xfACYKDMU6Dj(tf0Var2, r3s1LDPKFs1S2);
            yo.Companion.getClass();
            dq dqVar = xo.lS5Rgt96tfkO;
            tf0Var2.ngxnMNrpiKat();
            if (tf0Var2.zf8DYfih6EZu) {
                tf0Var2.dgRBjINgWbAK(dqVar);
            } else {
                tf0Var2.hVNtCUZb4tYH();
            }
            p7 p7Var = xo.a92UlCVFR9N8;
            th0.tmVwIGCQF4zR(tf0Var2, p7Var, Y1f8riQaR6yg2);
            p7 p7Var2 = xo.e9gEMXR7LXtO;
            th0.tmVwIGCQF4zR(tf0Var2, p7Var2, x50lh2ztY7Y52);
            Integer valueOf = Integer.valueOf(hashCode);
            p7 p7Var3 = xo.RAsUl2FVSrh6;
            th0.tmVwIGCQF4zR(tf0Var2, p7Var3, valueOf);
            k1 k1Var = xo.rtx2ld2ELZv4;
            th0.kpCQ9veP6n3I(tf0Var2, k1Var);
            p7 p7Var4 = xo.Y1f8riQaR6yg;
            th0.tmVwIGCQF4zR(tf0Var2, p7Var4, xfACYKDMU6Dj);
            jx1 jx1Var = jx1.dgRBjINgWbAK;
            n61 cpQdD2nAriOS2 = jx1Var.cpQdD2nAriOS(c62.TSizfFm2Yiuu(c62.lS5Rgt96tfkO(k61Var, 1.0f), 140.0f), r.OPXfSBeufaJ8);
            t92 t92Var = rl.PxuCJdSBwIXG;
            xe.PxuCJdSBwIXG(r3s1LDPKFs1S(cpQdD2nAriOS2, hl.lS5Rgt96tfkO(((pl) tf0Var2.wdg6QnbFHrFF(t92Var)).PxuCJdSBwIXG, 0.72f), gk0Var), tf0Var2, 0);
            n61 jyegZNwi31qc = f2.jyegZNwi31qc(jx1Var.cpQdD2nAriOS(k61Var, r.rtx2ld2ELZv4), 20.0f);
            dm PxuCJdSBwIXG2 = bm.PxuCJdSBwIXG(new y9(6.0f, new u9(0)), r.cpQdD2nAriOS, tf0Var2, 6);
            int hashCode2 = Long.hashCode(tf0Var2.wLFCmsViZrNT);
            il1 x50lh2ztY7Y53 = tf0Var2.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj2 = ov2.xfACYKDMU6Dj(tf0Var2, jyegZNwi31qc);
            tf0Var2.ngxnMNrpiKat();
            if (tf0Var2.zf8DYfih6EZu) {
                tf0Var2.dgRBjINgWbAK(dqVar);
            } else {
                tf0Var2.hVNtCUZb4tYH();
            }
            th0.tmVwIGCQF4zR(tf0Var2, p7Var, PxuCJdSBwIXG2);
            th0.tmVwIGCQF4zR(tf0Var2, p7Var2, x50lh2ztY7Y53);
            o0.EcgxDIVH5in8(hashCode2, tf0Var2, p7Var3, tf0Var2, k1Var);
            th0.tmVwIGCQF4zR(tf0Var2, p7Var4, xfACYKDMU6Dj2);
            uh1 uh1Var = qs0Var.a92UlCVFR9N8;
            int i3 = qs0Var.TSizfFm2Yiuu;
            String str = uh1Var.rtx2ld2ELZv4;
            t92 t92Var2 = fn2.PxuCJdSBwIXG;
            gi2.lS5Rgt96tfkO(str, null, hl.lS5Rgt96tfkO(j, 0.95f), 0L, 0L, null, 0L, 0, false, 0, 0, ((en2) tf0Var2.wdg6QnbFHrFF(t92Var2)).OPXfSBeufaJ8, tf0Var2, 0, 0, 131066);
            tf0Var = tf0Var2;
            tf0Var.gPXPFXrUH4XX(true);
            if (i3 > 0) {
                tf0Var.IXK6ba3ucyzm(74755528);
                n61 aF05bpZJlKEP = f2.aF05bpZJlKEP(r3s1LDPKFs1S(BRwzKIf41E4i(f2.jyegZNwi31qc(jx1Var.cpQdD2nAriOS(k61Var, r.Y1f8riQaR6yg), 16.0f), n9.PxuCJdSBwIXG), ((pl) tf0Var.wdg6QnbFHrFF(t92Var)).a92UlCVFR9N8, gk0Var), 12.0f, 8.0f);
                j51 Y1f8riQaR6yg3 = xe.Y1f8riQaR6yg(pdVar, false);
                int hashCode3 = Long.hashCode(tf0Var.wLFCmsViZrNT);
                il1 x50lh2ztY7Y54 = tf0Var.x50lh2ztY7Y5();
                n61 xfACYKDMU6Dj3 = ov2.xfACYKDMU6Dj(tf0Var, aF05bpZJlKEP);
                tf0Var.ngxnMNrpiKat();
                if (tf0Var.zf8DYfih6EZu) {
                    tf0Var.dgRBjINgWbAK(dqVar);
                } else {
                    tf0Var.hVNtCUZb4tYH();
                }
                th0.tmVwIGCQF4zR(tf0Var, p7Var, Y1f8riQaR6yg3);
                th0.tmVwIGCQF4zR(tf0Var, p7Var2, x50lh2ztY7Y54);
                o0.EcgxDIVH5in8(hashCode3, tf0Var, p7Var3, tf0Var, k1Var);
                th0.tmVwIGCQF4zR(tf0Var, p7Var4, xfACYKDMU6Dj3);
                gi2.lS5Rgt96tfkO(i3 + "%", null, ((pl) tf0Var.wdg6QnbFHrFF(t92Var)).PxuCJdSBwIXG, 0L, 0L, null, 0L, 0, false, 0, 0, ((en2) tf0Var.wdg6QnbFHrFF(t92Var2)).rtx2ld2ELZv4, tf0Var, 0, 0, 131066);
                tf0Var = tf0Var;
                tf0Var.gPXPFXrUH4XX(true);
                tf0Var.gPXPFXrUH4XX(false);
            } else {
                tf0Var.IXK6ba3ucyzm(-1977072153);
                tf0Var.gPXPFXrUH4XX(false);
            }
            tf0Var.gPXPFXrUH4XX(true);
        } else {
            tf0Var = tf0Var2;
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new r2(qs0Var, j, i, 2);
        }
    }

    public static gz[] nLZGh9p8gVSu(ByteArrayInputStream byteArrayInputStream, String str, int i) {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new gz[0];
        }
        gz[] gzVarArr = new gz[i];
        for (int i3 = 0; i3 < i; i3++) {
            int e4HgwifUDUCA = (int) fx1.e4HgwifUDUCA(byteArrayInputStream, 2);
            int e4HgwifUDUCA2 = (int) fx1.e4HgwifUDUCA(byteArrayInputStream, 2);
            gzVarArr[i3] = new gz(str, new String(fx1.v6yxfmkxNKhL(byteArrayInputStream, e4HgwifUDUCA), StandardCharsets.UTF_8), fx1.e4HgwifUDUCA(byteArrayInputStream, 4), e4HgwifUDUCA2, (int) fx1.e4HgwifUDUCA(byteArrayInputStream, 4), (int) fx1.e4HgwifUDUCA(byteArrayInputStream, 4), new int[e4HgwifUDUCA2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            gz gzVar = gzVarArr[i4];
            int available = byteArrayInputStream.available();
            int i5 = gzVar.a92UlCVFR9N8;
            int i6 = gzVar.RAsUl2FVSrh6;
            TreeMap treeMap = gzVar.OPXfSBeufaJ8;
            int i7 = available - i5;
            int i8 = i2;
            while (byteArrayInputStream.available() > i7) {
                i8 += (int) fx1.e4HgwifUDUCA(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i8), 1);
                int e4HgwifUDUCA3 = (int) fx1.e4HgwifUDUCA(byteArrayInputStream, 2);
                while (e4HgwifUDUCA3 > 0) {
                    fx1.e4HgwifUDUCA(byteArrayInputStream, 2);
                    int e4HgwifUDUCA4 = (int) fx1.e4HgwifUDUCA(byteArrayInputStream, 1);
                    if (e4HgwifUDUCA4 != 6 && e4HgwifUDUCA4 != 7) {
                        while (e4HgwifUDUCA4 > 0) {
                            fx1.e4HgwifUDUCA(byteArrayInputStream, 1);
                            int i9 = i2;
                            int i10 = i4;
                            for (int e4HgwifUDUCA5 = (int) fx1.e4HgwifUDUCA(byteArrayInputStream, 1); e4HgwifUDUCA5 > 0; e4HgwifUDUCA5--) {
                                fx1.e4HgwifUDUCA(byteArrayInputStream, 2);
                            }
                            e4HgwifUDUCA4--;
                            i2 = i9;
                            i4 = i10;
                        }
                    }
                    e4HgwifUDUCA3--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i11 = i2;
            int i12 = i4;
            if (byteArrayInputStream.available() != i7) {
                u9.rtx2ld2ELZv4("Read too much data during profile line parse");
                return null;
            }
            gzVar.rtx2ld2ELZv4 = ozEBbv0hFTAB(byteArrayInputStream, gzVar.e9gEMXR7LXtO);
            BitSet valueOf = BitSet.valueOf(fx1.v6yxfmkxNKhL(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i13 = i11; i13 < i6; i13++) {
                int i14 = valueOf.get(i13) ? 2 : i11;
                if (valueOf.get(i13 + i6)) {
                    i14 |= 4;
                }
                if (i14 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i13));
                    if (num == null) {
                        num = Integer.valueOf(i11);
                    }
                    treeMap.put(Integer.valueOf(i13), Integer.valueOf(i14 | num.intValue()));
                }
            }
            i4 = i12 + 1;
            i2 = i11;
        }
        return gzVarArr;
    }

    public static void ngxnMNrpiKat(ByteArrayOutputStream byteArrayOutputStream, gz gzVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        fx1.wnqUPcAvl7HT(byteArrayOutputStream, str.getBytes(charset).length);
        fx1.wnqUPcAvl7HT(byteArrayOutputStream, gzVar.e9gEMXR7LXtO);
        fx1.HGgCfDnf0ga9(byteArrayOutputStream, gzVar.a92UlCVFR9N8, 4);
        fx1.HGgCfDnf0ga9(byteArrayOutputStream, gzVar.TSizfFm2Yiuu, 4);
        fx1.HGgCfDnf0ga9(byteArrayOutputStream, gzVar.RAsUl2FVSrh6, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* JADX WARN: Finally extract failed */
    public static boolean nxJAScVArhE9(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, gz[] gzVarArr) {
        int i;
        long j;
        int length;
        byte[] bArr2 = bs0.EcgxDIVH5in8;
        byte[] bArr3 = bs0.RfyTYNmI9Srp;
        byte[] bArr4 = bs0.gPXPFXrUH4XX;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = bs0.BRwzKIf41E4i;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] EcgxDIVH5in82 = EcgxDIVH5in8(gzVarArr, bArr5);
                fx1.HGgCfDnf0ga9(byteArrayOutputStream, gzVarArr.length, 1);
                fx1.HGgCfDnf0ga9(byteArrayOutputStream, EcgxDIVH5in82.length, 4);
                byte[] aF05bpZJlKEP = fx1.aF05bpZJlKEP(EcgxDIVH5in82);
                fx1.HGgCfDnf0ga9(byteArrayOutputStream, aF05bpZJlKEP.length, 4);
                byteArrayOutputStream.write(aF05bpZJlKEP);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                fx1.HGgCfDnf0ga9(byteArrayOutputStream, gzVarArr.length, 1);
                for (gz gzVar : gzVarArr) {
                    int size = gzVar.OPXfSBeufaJ8.size() * 4;
                    String pnx5pC0XzaCw = pnx5pC0XzaCw(gzVar.PxuCJdSBwIXG, gzVar.lS5Rgt96tfkO, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    fx1.wnqUPcAvl7HT(byteArrayOutputStream, pnx5pC0XzaCw.getBytes(charset).length);
                    fx1.wnqUPcAvl7HT(byteArrayOutputStream, gzVar.rtx2ld2ELZv4.length);
                    fx1.HGgCfDnf0ga9(byteArrayOutputStream, size, 4);
                    fx1.HGgCfDnf0ga9(byteArrayOutputStream, gzVar.TSizfFm2Yiuu, 4);
                    byteArrayOutputStream.write(pnx5pC0XzaCw.getBytes(charset));
                    Iterator it = gzVar.OPXfSBeufaJ8.keySet().iterator();
                    while (it.hasNext()) {
                        fx1.wnqUPcAvl7HT(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        fx1.wnqUPcAvl7HT(byteArrayOutputStream, 0);
                    }
                    for (int i3 : gzVar.rtx2ld2ELZv4) {
                        fx1.wnqUPcAvl7HT(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr6 = bs0.XL4ISE6Oc65B;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] EcgxDIVH5in83 = EcgxDIVH5in8(gzVarArr, bArr6);
                fx1.HGgCfDnf0ga9(byteArrayOutputStream, gzVarArr.length, 1);
                fx1.HGgCfDnf0ga9(byteArrayOutputStream, EcgxDIVH5in83.length, 4);
                byte[] aF05bpZJlKEP2 = fx1.aF05bpZJlKEP(EcgxDIVH5in83);
                fx1.HGgCfDnf0ga9(byteArrayOutputStream, aF05bpZJlKEP2.length, 4);
                byteArrayOutputStream.write(aF05bpZJlKEP2);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            fx1.wnqUPcAvl7HT(byteArrayOutputStream, gzVarArr.length);
            for (gz gzVar2 : gzVarArr) {
                String str = gzVar2.PxuCJdSBwIXG;
                TreeMap treeMap = gzVar2.OPXfSBeufaJ8;
                String pnx5pC0XzaCw2 = pnx5pC0XzaCw(str, gzVar2.lS5Rgt96tfkO, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                fx1.wnqUPcAvl7HT(byteArrayOutputStream, pnx5pC0XzaCw2.getBytes(charset2).length);
                fx1.wnqUPcAvl7HT(byteArrayOutputStream, treeMap.size());
                fx1.wnqUPcAvl7HT(byteArrayOutputStream, gzVar2.rtx2ld2ELZv4.length);
                fx1.HGgCfDnf0ga9(byteArrayOutputStream, gzVar2.TSizfFm2Yiuu, 4);
                byteArrayOutputStream.write(pnx5pC0XzaCw2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    fx1.wnqUPcAvl7HT(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : gzVar2.rtx2ld2ELZv4) {
                    fx1.wnqUPcAvl7HT(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            fx1.wnqUPcAvl7HT(byteArrayOutputStream2, gzVarArr.length);
            int i5 = 2;
            int i6 = 2;
            for (gz gzVar3 : gzVarArr) {
                fx1.HGgCfDnf0ga9(byteArrayOutputStream2, gzVar3.TSizfFm2Yiuu, 4);
                fx1.HGgCfDnf0ga9(byteArrayOutputStream2, gzVar3.Y1f8riQaR6yg, 4);
                fx1.HGgCfDnf0ga9(byteArrayOutputStream2, gzVar3.RAsUl2FVSrh6, 4);
                String pnx5pC0XzaCw3 = pnx5pC0XzaCw(gzVar3.PxuCJdSBwIXG, gzVar3.lS5Rgt96tfkO, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = pnx5pC0XzaCw3.getBytes(charset3).length;
                fx1.wnqUPcAvl7HT(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(pnx5pC0XzaCw3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            ev2 ev2Var = new ev2(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(ev2Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < gzVarArr.length) {
                try {
                    gz gzVar4 = gzVarArr[i7];
                    fx1.wnqUPcAvl7HT(byteArrayOutputStream3, i7);
                    fx1.wnqUPcAvl7HT(byteArrayOutputStream3, gzVar4.e9gEMXR7LXtO);
                    i8 = i8 + 4 + (gzVar4.e9gEMXR7LXtO * i5);
                    int[] iArr = gzVar4.rtx2ld2ELZv4;
                    int length3 = iArr.length;
                    int i9 = i2;
                    while (i2 < length3) {
                        int i10 = iArr[i2];
                        fx1.wnqUPcAvl7HT(byteArrayOutputStream3, i10 - i9);
                        i2++;
                        i5 = i5;
                        i9 = i10;
                    }
                    i7++;
                    i2 = 0;
                } catch (Throwable th) {
                }
            }
            int i11 = i5;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
            }
            ev2 ev2Var2 = new ev2(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(ev2Var2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i12 = 0;
            for (int i13 = 0; i13 < gzVarArr.length; i13++) {
                try {
                    gz gzVar5 = gzVarArr[i13];
                    Iterator it3 = gzVar5.OPXfSBeufaJ8.entrySet().iterator();
                    int i14 = 0;
                    while (it3.hasNext()) {
                        i14 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        yQRudnv4La6p(byteArrayOutputStream4, i14, gzVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            KUoIVIumpKat(byteArrayOutputStream4, gzVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            fx1.wnqUPcAvl7HT(byteArrayOutputStream3, i13);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i15 = i12 + 6;
                            fx1.HGgCfDnf0ga9(byteArrayOutputStream3, length4, 4);
                            fx1.wnqUPcAvl7HT(byteArrayOutputStream3, i14);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i12 = i15 + length4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            ev2 ev2Var3 = new ev2(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList.add(ev2Var3);
            long size2 = 12 + (arrayList.size() * 16);
            fx1.HGgCfDnf0ga9(byteArrayOutputStream, arrayList.size(), 4);
            int i16 = 0;
            while (i16 < arrayList.size()) {
                ev2 ev2Var4 = (ev2) arrayList.get(i16);
                int i17 = ev2Var4.PxuCJdSBwIXG;
                byte[] bArr7 = ev2Var4.lS5Rgt96tfkO;
                if (i17 != 1) {
                    i = i11;
                    if (i17 == i) {
                        j = 1;
                    } else if (i17 == 3) {
                        j = 2;
                    } else if (i17 == 4) {
                        j = 3;
                    } else {
                        if (i17 != 5) {
                            throw null;
                        }
                        j = 4;
                    }
                } else {
                    i = i11;
                    j = 0;
                }
                fx1.HGgCfDnf0ga9(byteArrayOutputStream, j, 4);
                fx1.HGgCfDnf0ga9(byteArrayOutputStream, size2, 4);
                if (ev2Var4.TSizfFm2Yiuu) {
                    long length5 = bArr7.length;
                    byte[] aF05bpZJlKEP3 = fx1.aF05bpZJlKEP(bArr7);
                    arrayList2.add(aF05bpZJlKEP3);
                    fx1.HGgCfDnf0ga9(byteArrayOutputStream, aF05bpZJlKEP3.length, 4);
                    fx1.HGgCfDnf0ga9(byteArrayOutputStream, length5, 4);
                    length = aF05bpZJlKEP3.length;
                } else {
                    arrayList2.add(bArr7);
                    fx1.HGgCfDnf0ga9(byteArrayOutputStream, bArr7.length, 4);
                    fx1.HGgCfDnf0ga9(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i16++;
                i11 = i;
            }
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i18));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static int[] ozEBbv0hFTAB(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += (int) fx1.e4HgwifUDUCA(byteArrayInputStream, 2);
            iArr[i3] = i2;
        }
        return iArr;
    }

    public static String pnx5pC0XzaCw(String str, String str2, byte[] bArr) {
        byte[] bArr2 = bs0.RfyTYNmI9Srp;
        byte[] bArr3 = bs0.EcgxDIVH5in8;
        String str3 = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                return o0.gPXPFXrUH4XX(sb, (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static final int qudtW7lwm99e(float f, float[] fArr, int i) {
        float f2 = f >= 0.0f ? f : 0.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        return !Float.isNaN(f2) ? 1 : 0;
    }

    public static final n61 r3s1LDPKFs1S(n61 n61Var, long j, z42 z42Var) {
        return n61Var.TSizfFm2Yiuu(new kc(j, z42Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (r1 == r2) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r5 == r2) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final k6 rZjpSjn4zoMv(ae0 ae0Var, hp hpVar, int i) {
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        tf0 tf0Var = (tf0) hpVar;
        View view = (View) tf0Var.wdg6QnbFHrFF(h2.a92UlCVFR9N8);
        boolean a92UlCVFR9N82 = tf0Var.a92UlCVFR9N8(view);
        Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
        jx1 jx1Var = fp.lS5Rgt96tfkO;
        if (!a92UlCVFR9N82) {
            hp.Companion.getClass();
        }
        nLZGh9p8gVSu = new k6(view, null, ae0Var);
        tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
        k6 k6Var = (k6) nLZGh9p8gVSu;
        boolean rtx2ld2ELZv42 = tf0Var.rtx2ld2ELZv4(k6Var);
        Object nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
        if (!rtx2ld2ELZv42) {
            hp.Companion.getClass();
        }
        nLZGh9p8gVSu2 = new c6(k6Var, 3);
        tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu2);
        mm2.rtx2ld2ELZv4(k6Var, (le0) nLZGh9p8gVSu2, tf0Var);
        return k6Var;
    }

    public static final void rtx2ld2ELZv4(String str, String str2, long j, n61 n61Var, hp hpVar, int i) {
        tf0 tf0Var;
        tf0 tf0Var2 = (tf0) hpVar;
        tf0Var2.JHNfcAUfKc4G(717849484);
        int i2 = i | (tf0Var2.a92UlCVFR9N8(str) ? 4 : 2) | (tf0Var2.a92UlCVFR9N8(n61Var) ? 2048 : 1024);
        int i3 = 0;
        if (tf0Var2.Pf0ThKz3j5YS(i2 & 1, (i2 & 1171) != 1170)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            n61 jyegZNwi31qc = f2.jyegZNwi31qc(r3s1LDPKFs1S(BRwzKIf41E4i(c62.TSizfFm2Yiuu(n61Var, 88.0f), n9.PxuCJdSBwIXG), j, b51.x50lh2ztY7Y5), 14.0f);
            s.Companion.getClass();
            j51 Y1f8riQaR6yg2 = xe.Y1f8riQaR6yg(r.lS5Rgt96tfkO, false);
            int hashCode = Long.hashCode(tf0Var2.wLFCmsViZrNT);
            il1 x50lh2ztY7Y52 = tf0Var2.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj = ov2.xfACYKDMU6Dj(tf0Var2, jyegZNwi31qc);
            yo.Companion.getClass();
            dq dqVar = xo.lS5Rgt96tfkO;
            tf0Var2.ngxnMNrpiKat();
            if (tf0Var2.zf8DYfih6EZu) {
                tf0Var2.dgRBjINgWbAK(dqVar);
            } else {
                tf0Var2.hVNtCUZb4tYH();
            }
            p7 p7Var = xo.a92UlCVFR9N8;
            th0.tmVwIGCQF4zR(tf0Var2, p7Var, Y1f8riQaR6yg2);
            p7 p7Var2 = xo.e9gEMXR7LXtO;
            th0.tmVwIGCQF4zR(tf0Var2, p7Var2, x50lh2ztY7Y52);
            Integer valueOf = Integer.valueOf(hashCode);
            p7 p7Var3 = xo.RAsUl2FVSrh6;
            th0.tmVwIGCQF4zR(tf0Var2, p7Var3, valueOf);
            k1 k1Var = xo.rtx2ld2ELZv4;
            th0.kpCQ9veP6n3I(tf0Var2, k1Var);
            p7 p7Var4 = xo.Y1f8riQaR6yg;
            th0.tmVwIGCQF4zR(tf0Var2, p7Var4, xfACYKDMU6Dj);
            n61 cpQdD2nAriOS2 = jx1.dgRBjINgWbAK.cpQdD2nAriOS(n61.Companion, r.e9gEMXR7LXtO);
            dm PxuCJdSBwIXG2 = bm.PxuCJdSBwIXG(new y9(4.0f, new u9(i3)), r.cpQdD2nAriOS, tf0Var2, 6);
            int hashCode2 = Long.hashCode(tf0Var2.wLFCmsViZrNT);
            il1 x50lh2ztY7Y53 = tf0Var2.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj2 = ov2.xfACYKDMU6Dj(tf0Var2, cpQdD2nAriOS2);
            tf0Var2.ngxnMNrpiKat();
            if (tf0Var2.zf8DYfih6EZu) {
                tf0Var2.dgRBjINgWbAK(dqVar);
            } else {
                tf0Var2.hVNtCUZb4tYH();
            }
            th0.tmVwIGCQF4zR(tf0Var2, p7Var, PxuCJdSBwIXG2);
            th0.tmVwIGCQF4zR(tf0Var2, p7Var2, x50lh2ztY7Y53);
            o0.EcgxDIVH5in8(hashCode2, tf0Var2, p7Var3, tf0Var2, k1Var);
            th0.tmVwIGCQF4zR(tf0Var2, p7Var4, xfACYKDMU6Dj2);
            t92 t92Var = fn2.PxuCJdSBwIXG;
            dj2 dj2Var = ((en2) tf0Var2.wdg6QnbFHrFF(t92Var)).RAsUl2FVSrh6;
            t92 t92Var2 = rl.PxuCJdSBwIXG;
            gi2.lS5Rgt96tfkO(str, null, ((pl) tf0Var2.wdg6QnbFHrFF(t92Var2)).PxuCJdSBwIXG, 0L, 0L, null, 0L, 0, false, 0, 0, dj2Var, tf0Var2, i2 & 14, 0, 131066);
            tf0Var = tf0Var2;
            gi2.lS5Rgt96tfkO(str2, null, hl.lS5Rgt96tfkO(((pl) tf0Var.wdg6QnbFHrFF(t92Var2)).PxuCJdSBwIXG, 0.75f), 0L, 0L, null, 0L, 0, false, 0, 0, ((en2) tf0Var.wdg6QnbFHrFF(t92Var)).OPXfSBeufaJ8, tf0Var2, 6, 0, 131066);
            tf0Var.gPXPFXrUH4XX(true);
            tf0Var.gPXPFXrUH4XX(true);
        } else {
            tf0Var = tf0Var2;
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new yy(str, str2, j, n61Var, i, 0);
        }
    }

    public static final Object ryVscX7ZL4Ux(Object obj) {
        return obj instanceof sm ? ng0.gPXPFXrUH4XX(((sm) obj).PxuCJdSBwIXG) : obj;
    }

    public static gz[] tmVwIGCQF4zR(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, gz[] gzVarArr) {
        byte[] bArr3 = bs0.S9EYkSpbGuxq;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, bs0.VhhvGxCb8gfr)) {
                u9.rtx2ld2ELZv4("Unsupported meta version");
                return null;
            }
            int e4HgwifUDUCA = (int) fx1.e4HgwifUDUCA(fileInputStream, 2);
            byte[] Nlhe969cAGO8 = fx1.Nlhe969cAGO8(fileInputStream, (int) fx1.e4HgwifUDUCA(fileInputStream, 4), (int) fx1.e4HgwifUDUCA(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                u9.rtx2ld2ELZv4("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Nlhe969cAGO8);
            try {
                gz[] EpkonXwzFgDB = EpkonXwzFgDB(byteArrayInputStream, bArr2, e4HgwifUDUCA, gzVarArr);
                byteArrayInputStream.close();
                return EpkonXwzFgDB;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(bs0.gPXPFXrUH4XX, bArr2)) {
            u9.rtx2ld2ELZv4("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            u9.rtx2ld2ELZv4("Unsupported meta version");
            return null;
        }
        int e4HgwifUDUCA2 = (int) fx1.e4HgwifUDUCA(fileInputStream, 1);
        byte[] Nlhe969cAGO82 = fx1.Nlhe969cAGO8(fileInputStream, (int) fx1.e4HgwifUDUCA(fileInputStream, 4), (int) fx1.e4HgwifUDUCA(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            u9.rtx2ld2ELZv4("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(Nlhe969cAGO82);
        try {
            gz[] J54yh1s3n4Aq = J54yh1s3n4Aq(byteArrayInputStream2, e4HgwifUDUCA2, gzVarArr);
            byteArrayInputStream2.close();
            return J54yh1s3n4Aq;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static final cs1 wLFCmsViZrNT(ny1 ny1Var, at atVar, h92 h92Var, Float f) {
        ui.lS5Rgt96tfkO.getClass();
        ti tiVar = ti.PxuCJdSBwIXG;
        cr1 cr1Var = new cr1(6, ny1Var, n50.rtx2ld2ELZv4);
        l92 RAsUl2FVSrh62 = RAsUl2FVSrh6(f);
        hu huVar = (hu) cr1Var.wdg6QnbFHrFF;
        v80 v80Var = (v80) cr1Var.OPXfSBeufaJ8;
        l52.Companion.getClass();
        fx1.yQRudnv4La6p(atVar, huVar, h92Var.equals(k52.lS5Rgt96tfkO) ? uu.rtx2ld2ELZv4 : uu.dgRBjINgWbAK, new e4(h92Var, v80Var, RAsUl2FVSrh62, f, null, 4));
        return new cs1(RAsUl2FVSrh62);
    }

    public static final void wdg6QnbFHrFF(n61 n61Var, on onVar, hp hpVar, int i) {
        int i2;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(771959668);
        if ((i & 6) == 0) {
            i2 = (tf0Var.a92UlCVFR9N8(n61Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tf0Var.rtx2ld2ELZv4(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tf0Var.rtx2ld2ELZv4(onVar) ? 256 : 128;
        }
        int i3 = 0;
        int i4 = 1;
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 147) != 146)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
            hp.Companion.getClass();
            jx1 jx1Var = fp.lS5Rgt96tfkO;
            if (nLZGh9p8gVSu == jx1Var) {
                mj1 mj1Var = new mj1(null, ih0.EcgxDIVH5in8);
                tf0Var.JTxCbbCwomzt(mj1Var);
                nLZGh9p8gVSu = mj1Var;
            }
            d91 d91Var = (d91) nLZGh9p8gVSu;
            Object nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
            if (nLZGh9p8gVSu2 == jx1Var) {
                nLZGh9p8gVSu2 = new m6(d91Var, i3);
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu2);
            }
            zv.lS5Rgt96tfkO(bf2.lS5Rgt96tfkO.PxuCJdSBwIXG(rZjpSjn4zoMv((ae0) nLZGh9p8gVSu2, tf0Var, 0)), bs0.kpCQ9veP6n3I(-291176396, new n6(n61Var, d91Var, onVar, i3), tf0Var), tf0Var, 56);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new l6(n61Var, onVar, i, i4);
        }
    }

    public static final int x50lh2ztY7Y5(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    public static final Object xbgXKYA2cIfu(hu huVar) {
        Object IAToe7bXGz4N = huVar.IAToe7bXGz4N(RfyTYNmI9Srp, 0);
        IAToe7bXGz4N.getClass();
        return IAToe7bXGz4N;
    }

    public static gz[] xfACYKDMU6Dj(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, bs0.BRwzKIf41E4i)) {
            u9.rtx2ld2ELZv4("Unsupported version");
            return null;
        }
        int e4HgwifUDUCA = (int) fx1.e4HgwifUDUCA(fileInputStream, 1);
        byte[] Nlhe969cAGO8 = fx1.Nlhe969cAGO8(fileInputStream, (int) fx1.e4HgwifUDUCA(fileInputStream, 4), (int) fx1.e4HgwifUDUCA(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            u9.rtx2ld2ELZv4("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Nlhe969cAGO8);
        try {
            gz[] nLZGh9p8gVSu = nLZGh9p8gVSu(byteArrayInputStream, str, e4HgwifUDUCA);
            byteArrayInputStream.close();
            return nLZGh9p8gVSu;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void yQRudnv4La6p(ByteArrayOutputStream byteArrayOutputStream, int i, gz gzVar) {
        int i2 = gzVar.RAsUl2FVSrh6;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : gzVar.OPXfSBeufaJ8.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & intValue2) == i4) {
                        int i5 = (i3 * i2) + intValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void zf8DYfih6EZu(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    public abstract void gPXPFXrUH4XX(int i);

    public abstract void jyegZNwi31qc(int i);
}
