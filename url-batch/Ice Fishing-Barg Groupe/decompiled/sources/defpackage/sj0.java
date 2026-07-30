package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.database.SQLException;
import android.os.Build;
import android.os.Trace;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import com.ice.fishing.grenza.R;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class sj0 {
    public static long TSizfFm2Yiuu;
    public static Method Y1f8riQaR6yg;
    public static final /* synthetic */ int lS5Rgt96tfkO = 0;
    public final /* synthetic */ int PxuCJdSBwIXG = 18;

    public static dr2 BRwzKIf41E4i(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object newInstance = declaredConstructor.newInstance(null);
                newInstance.getClass();
                return (dr2) newInstance;
            } catch (IllegalAccessException e) {
                rc1.dgRBjINgWbAK("Cannot create an instance of ", cls, e);
                return null;
            } catch (InstantiationException e2) {
                rc1.dgRBjINgWbAK("Cannot create an instance of ", cls, e2);
                return null;
            }
        } catch (NoSuchMethodException e3) {
            rc1.dgRBjINgWbAK("Cannot create an instance of ", cls, e3);
            return null;
        }
    }

    public static boolean BjEWd04qc7Mw() {
        if (Build.VERSION.SDK_INT >= 29) {
            return jk2.PxuCJdSBwIXG();
        }
        try {
            if (Y1f8riQaR6yg == null) {
                TSizfFm2Yiuu = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Y1f8riQaR6yg = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) Y1f8riQaR6yg.invoke(null, Long.valueOf(TSizfFm2Yiuu))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final float EcgxDIVH5in8(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final long EpkonXwzFgDB(go0 go0Var, th1 th1Var, do0 do0Var, boolean z) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long j;
        long j2 = go0Var.RAsUl2FVSrh6;
        if (th1Var != null) {
            do0.Companion.getClass();
            int i = do0Var.PxuCJdSBwIXG;
            if (i == 1) {
                intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            } else if (i == 2) {
                intBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
            }
            if (th1Var == th1.OPXfSBeufaJ8) {
                long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
                floatToRawIntBits = Float.floatToRawIntBits(0.0f);
                j = floatToRawIntBits2 << 32;
            } else {
                long floatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
                j = floatToRawIntBits3 << 32;
            }
            j2 = j | (floatToRawIntBits & 4294967295L);
        }
        long Y1f8riQaR6yg2 = bf1.Y1f8riQaR6yg(xfACYKDMU6Dj(go0Var, th1Var, do0Var), j2);
        if (z || !go0Var.OPXfSBeufaJ8) {
            return Y1f8riQaR6yg2;
        }
        bf1.Companion.getClass();
        return 0L;
    }

    public static final x40 IAToe7bXGz4N() {
        if (!x40.Y1f8riQaR6yg()) {
            return null;
        }
        x40 PxuCJdSBwIXG = x40.PxuCJdSBwIXG();
        if (PxuCJdSBwIXG.TSizfFm2Yiuu() == 1) {
            return PxuCJdSBwIXG;
        }
        return null;
    }

    public static final void J54yh1s3n4Aq(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            ep0.PxuCJdSBwIXG("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float EcgxDIVH5in8 = EcgxDIVH5in8(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * EcgxDIVH5in8);
                }
            }
            float sqrt = (float) Math.sqrt(EcgxDIVH5in8(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f = 1.0f / sqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? 0.0f : EcgxDIVH5in8(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float EcgxDIVH5in82 = EcgxDIVH5in8(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    EcgxDIVH5in82 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = EcgxDIVH5in82 / fArr11[i14];
        }
    }

    public static final void OPXfSBeufaJ8(b42 b42Var, ao1 ao1Var, long j) {
        jx jxVar = (jx) b42Var.OPXfSBeufaJ8;
        jxVar.getClass();
        aq2 aq2Var = jxVar.lS5Rgt96tfkO;
        aq2 aq2Var2 = jxVar.PxuCJdSBwIXG;
        boolean wdg6QnbFHrFF = ni0.wdg6QnbFHrFF(ao1Var);
        long j2 = ao1Var.lS5Rgt96tfkO;
        if (wdg6QnbFHrFF) {
            na.v6yxfmkxNKhL(0, r6.length, null, aq2Var2.Y1f8riQaR6yg);
            aq2Var2.e9gEMXR7LXtO = 0;
            na.v6yxfmkxNKhL(0, r6.length, null, aq2Var.Y1f8riQaR6yg);
            aq2Var.e9gEMXR7LXtO = 0;
            jxVar.TSizfFm2Yiuu = 0L;
        }
        if (!ni0.x50lh2ztY7Y5(ao1Var)) {
            List list = ao1Var.cpQdD2nAriOS;
            if (list == null) {
                list = p50.rtx2ld2ELZv4;
            }
            int i = 0;
            for (int size = list.size(); i < size; size = size) {
                vj0 vj0Var = (vj0) list.get(i);
                jxVar.PxuCJdSBwIXG(vj0Var.PxuCJdSBwIXG, bf1.e9gEMXR7LXtO(vj0Var.e9gEMXR7LXtO, j));
                i++;
            }
            jxVar.PxuCJdSBwIXG(j2, bf1.e9gEMXR7LXtO(ao1Var.r3s1LDPKFs1S, j));
        }
        if (ni0.x50lh2ztY7Y5(ao1Var) && j2 - jxVar.TSizfFm2Yiuu > 40) {
            na.v6yxfmkxNKhL(0, r0.length, null, aq2Var2.Y1f8riQaR6yg);
            aq2Var2.e9gEMXR7LXtO = 0;
            na.v6yxfmkxNKhL(0, r2.length, null, aq2Var.Y1f8riQaR6yg);
            aq2Var.e9gEMXR7LXtO = 0;
            jxVar.TSizfFm2Yiuu = 0L;
        }
        jxVar.TSizfFm2Yiuu = j2;
    }

    public static final void POWyO8hTM6YC(ph1 ph1Var, int i, Object obj, int i2, Object obj2) {
        int i3 = ph1Var.rtx2ld2ELZv4 - ph1Var.TSizfFm2Yiuu[ph1Var.Y1f8riQaR6yg - 1].lS5Rgt96tfkO;
        Object[] objArr = ph1Var.RAsUl2FVSrh6;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    public static final d91 Pf0ThKz3j5YS(Object obj, hp hpVar) {
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        tf0 tf0Var = (tf0) hpVar;
        Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
        hp.Companion.getClass();
        if (nLZGh9p8gVSu == fp.lS5Rgt96tfkO) {
            nLZGh9p8gVSu = tmVwIGCQF4zR(obj);
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
        }
        d91 d91Var = (d91) nLZGh9p8gVSu;
        d91Var.setValue(obj);
        return d91Var;
    }

    public static final void PxuCJdSBwIXG(ae0 ae0Var, n61 n61Var, ny0 ny0Var, dz0 dz0Var, hp hpVar, int i) {
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(1055276397);
        int i2 = (tf0Var.rtx2ld2ELZv4(ae0Var) ? 4 : 2) | i | (tf0Var.a92UlCVFR9N8(n61Var) ? 32 : 16) | (tf0Var.a92UlCVFR9N8(ny0Var) ? 256 : 128) | (tf0Var.a92UlCVFR9N8(dz0Var) ? 2048 : 1024);
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 1171) != 1170)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            th0.lS5Rgt96tfkO(bs0.kpCQ9veP6n3I(-933153643, new ey0(ny0Var, n61Var, dz0Var, Pf0ThKz3j5YS(ae0Var, tf0Var), 0), tf0Var), tf0Var, 6);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new bd(ae0Var, n61Var, ny0Var, dz0Var, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (r3 == r5) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final d91 QrzZRwfaDlRX(j92 j92Var, hp hpVar) {
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        Object value = j92Var.getValue();
        tf0 tf0Var = (tf0) hpVar;
        n50 n50Var = n50.rtx2ld2ELZv4;
        boolean rtx2ld2ELZv4 = tf0Var.rtx2ld2ELZv4(n50Var) | tf0Var.rtx2ld2ELZv4(j92Var);
        Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
        bt btVar = null;
        jx1 jx1Var = fp.lS5Rgt96tfkO;
        if (!rtx2ld2ELZv4) {
            hp.Companion.getClass();
        }
        nLZGh9p8gVSu = new rtx2ld2ELZv4(n50Var, j92Var, btVar, 18);
        tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
        pe0 pe0Var = (pe0) nLZGh9p8gVSu;
        Object nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
        hp.Companion.getClass();
        if (nLZGh9p8gVSu2 == jx1Var) {
            nLZGh9p8gVSu2 = tmVwIGCQF4zR(value);
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu2);
        }
        d91 d91Var = (d91) nLZGh9p8gVSu2;
        boolean rtx2ld2ELZv42 = tf0Var.rtx2ld2ELZv4(pe0Var);
        Object nLZGh9p8gVSu3 = tf0Var.nLZGh9p8gVSu();
        if (rtx2ld2ELZv42 || nLZGh9p8gVSu3 == jx1Var) {
            nLZGh9p8gVSu3 = new a82(pe0Var, d91Var, btVar, 1);
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu3);
        }
        mm2.dgRBjINgWbAK(j92Var, n50Var, (pe0) nLZGh9p8gVSu3, tf0Var);
        return d91Var;
    }

    public static final int RAsUl2FVSrh6(u31 u31Var, u uVar) {
        u31 mFd1aGiJX24N = u31Var.mFd1aGiJX24N();
        if (mFd1aGiJX24N == null) {
            ep0.lS5Rgt96tfkO("Child of " + u31Var + " cannot be null when calculating alignment line");
        }
        if (u31Var.IxJ9cAW40yOk().PxuCJdSBwIXG().containsKey(uVar)) {
            Integer num = (Integer) u31Var.IxJ9cAW40yOk().PxuCJdSBwIXG().get(uVar);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int yQRudnv4La6p = mFd1aGiJX24N.yQRudnv4La6p(uVar);
            if (yQRudnv4La6p != Integer.MIN_VALUE) {
                mFd1aGiJX24N.BRwzKIf41E4i = true;
                u31Var.XL4ISE6Oc65B = true;
                u31Var.EP3hG58ROvHh();
                mFd1aGiJX24N.BRwzKIf41E4i = false;
                u31Var.XL4ISE6Oc65B = false;
                return yQRudnv4La6p + ((int) (uVar instanceof ak0 ? mFd1aGiJX24N.wnqUPcAvl7HT() & 4294967295L : mFd1aGiJX24N.wnqUPcAvl7HT() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final ty RfyTYNmI9Srp(ae0 ae0Var) {
        m9 m9Var = z72.PxuCJdSBwIXG;
        return new ty(ae0Var, null);
    }

    public static final int S2OOm9zPNm0h(String str, int i) {
        x40 IAToe7bXGz4N = IAToe7bXGz4N();
        Integer num = null;
        if (IAToe7bXGz4N != null) {
            Integer valueOf = Integer.valueOf(IAToe7bXGz4N.lS5Rgt96tfkO(str, Math.max(0, i - 1)));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static final void S9EYkSpbGuxq(fy1 fy1Var, String str) {
        fy1Var.getClass();
        hy1 amuv7NJvPxHu = fy1Var.amuv7NJvPxHu(str);
        try {
            amuv7NJvPxHu.tmVwIGCQF4zR();
            cs0.r3s1LDPKFs1S(amuv7NJvPxHu, null);
        } finally {
        }
    }

    public static final void TSizfFm2Yiuu(long j, dj2 dj2Var, pe0 pe0Var, hp hpVar, int i) {
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(-684938728);
        int i2 = (tf0Var.e9gEMXR7LXtO(j) ? 4 : 2) | i | (tf0Var.a92UlCVFR9N8(dj2Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= tf0Var.rtx2ld2ELZv4(pe0Var) ? 256 : 128;
        }
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 147) != 146)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            fq fqVar = gi2.PxuCJdSBwIXG;
            zv.TSizfFm2Yiuu(new ir1[]{zr.PxuCJdSBwIXG.PxuCJdSBwIXG(new hl(j)), fqVar.PxuCJdSBwIXG(((dj2) tf0Var.wdg6QnbFHrFF(fqVar)).Y1f8riQaR6yg(dj2Var))}, pe0Var, tf0Var, ((i2 >> 3) & 112) | 8);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new hr1(j, dj2Var, pe0Var, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int VhhvGxCb8gfr(String str, int i) {
        String str2;
        int i2;
        x40 IAToe7bXGz4N = IAToe7bXGz4N();
        Integer num = null;
        if (IAToe7bXGz4N != null) {
            if (!(IAToe7bXGz4N.TSizfFm2Yiuu() == 1)) {
                u9.rtx2ld2ELZv4("Not initialized yet");
                return 0;
            }
            ki0.RfyTYNmI9Srp(str, "charSequence cannot be null");
            m9 m9Var = IAToe7bXGz4N.e9gEMXR7LXtO.lS5Rgt96tfkO;
            m9Var.getClass();
            if (i < 0 || i >= str.length()) {
                str2 = str;
                i2 = -1;
            } else {
                if (str instanceof Spanned) {
                    Spanned spanned = (Spanned) str;
                    ym2[] ym2VarArr = (ym2[]) spanned.getSpans(i, i + 1, ym2.class);
                    if (ym2VarArr.length > 0) {
                        i2 = spanned.getSpanEnd(ym2VarArr[0]);
                        str2 = str;
                    }
                }
                str2 = str;
                i2 = ((e50) m9Var.e6tOsSdd2EFb(str2, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new e50(i))).wdg6QnbFHrFF;
            }
            Integer valueOf = Integer.valueOf(i2);
            if (i2 != -1) {
                num = valueOf;
            }
        } else {
            str2 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str2);
        return characterInstance.following(i);
    }

    public static final f91 XL4ISE6Oc65B() {
        m9 m9Var = z72.lS5Rgt96tfkO;
        f91 f91Var = (f91) m9Var.QrzZRwfaDlRX();
        if (f91Var != null) {
            return f91Var;
        }
        f91 f91Var2 = new f91(new sf0[0]);
        m9Var.aF05bpZJlKEP(f91Var2);
        return f91Var2;
    }

    public static final void Y1f8riQaR6yg(n61 n61Var, on onVar, hp hpVar, int i) {
        int i2;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(155925518);
        if ((i & 6) == 0) {
            i2 = (tf0Var.a92UlCVFR9N8(n61Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tf0Var.rtx2ld2ELZv4(onVar) ? 32 : 16;
        }
        int i3 = 3;
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 19) != 18)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            boolean z = tf0Var.wdg6QnbFHrFF(bf2.PxuCJdSBwIXG) != null;
            boolean z2 = tf0Var.wdg6QnbFHrFF(bf2.lS5Rgt96tfkO) != null;
            if (z && z2) {
                tf0Var.IXK6ba3ucyzm(-1977187922);
                s.Companion.getClass();
                j51 Y1f8riQaR6yg2 = xe.Y1f8riQaR6yg(r.lS5Rgt96tfkO, true);
                int hashCode = Long.hashCode(tf0Var.wLFCmsViZrNT);
                il1 x50lh2ztY7Y5 = tf0Var.x50lh2ztY7Y5();
                n61 xfACYKDMU6Dj = ov2.xfACYKDMU6Dj(tf0Var, n61Var);
                yo.Companion.getClass();
                dq dqVar = xo.lS5Rgt96tfkO;
                tf0Var.ngxnMNrpiKat();
                if (tf0Var.zf8DYfih6EZu) {
                    tf0Var.dgRBjINgWbAK(dqVar);
                } else {
                    tf0Var.hVNtCUZb4tYH();
                }
                th0.tmVwIGCQF4zR(tf0Var, xo.a92UlCVFR9N8, Y1f8riQaR6yg2);
                th0.tmVwIGCQF4zR(tf0Var, xo.e9gEMXR7LXtO, x50lh2ztY7Y5);
                th0.tmVwIGCQF4zR(tf0Var, xo.RAsUl2FVSrh6, Integer.valueOf(hashCode));
                th0.kpCQ9veP6n3I(tf0Var, xo.rtx2ld2ELZv4);
                th0.tmVwIGCQF4zR(tf0Var, xo.Y1f8riQaR6yg, xfACYKDMU6Dj);
                onVar.rtx2ld2ELZv4(tf0Var, Integer.valueOf((i2 >> 3) & 14));
                tf0Var.gPXPFXrUH4XX(true);
                tf0Var.gPXPFXrUH4XX(false);
            } else if (z) {
                tf0Var.IXK6ba3ucyzm(-1976997706);
                hq0.OPXfSBeufaJ8(n61Var, onVar, tf0Var, i2 & 126);
                tf0Var.gPXPFXrUH4XX(false);
            } else if (z2) {
                tf0Var.IXK6ba3ucyzm(-1976846922);
                hx.Y1f8riQaR6yg(n61Var, onVar, tf0Var, i2 & 126);
                tf0Var.gPXPFXrUH4XX(false);
            } else {
                tf0Var.IXK6ba3ucyzm(-1976716505);
                lS5Rgt96tfkO(n61Var, onVar, tf0Var, i2 & 126);
                tf0Var.gPXPFXrUH4XX(false);
            }
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new l6(n61Var, onVar, i, i3);
        }
    }

    public static final String ZbWwgt3aGe7A(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final int a92UlCVFR9N8(int i, f91 f91Var) {
        int i2 = f91Var.wdg6QnbFHrFF - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = f91Var.rtx2ld2ELZv4;
            int i5 = ((ur0) objArr[i4]).PxuCJdSBwIXG;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((ur0) objArr[i3]).PxuCJdSBwIXG) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    public static final v8 aF05bpZJlKEP(oh2 oh2Var, int i) {
        v8 v8Var = oh2Var.PxuCJdSBwIXG;
        v8 v8Var2 = oh2Var.PxuCJdSBwIXG;
        long j = oh2Var.lS5Rgt96tfkO;
        int e9gEMXR7LXtO = vi2.e9gEMXR7LXtO(j);
        int e9gEMXR7LXtO2 = vi2.e9gEMXR7LXtO(j);
        int i2 = e9gEMXR7LXtO2 + i;
        if (((i ^ i2) & (e9gEMXR7LXtO2 ^ i2)) < 0) {
            i2 = v8Var2.OPXfSBeufaJ8.length();
        }
        return v8Var.subSequence(e9gEMXR7LXtO, Math.min(i2, v8Var2.OPXfSBeufaJ8.length()));
    }

    public static final Object amuv7NJvPxHu(Object[] objArr, tz1 tz1Var, ae0 ae0Var, hp hpVar, int i, int i2) {
        Object[] objArr2;
        tz1 tz1Var2;
        final Object obj;
        Object a92UlCVFR9N8;
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        long VhhvGxCb8gfr = cs0.VhhvGxCb8gfr(hpVar);
        ov2.RfyTYNmI9Srp(36);
        final String l = Long.toString(VhhvGxCb8gfr, 36);
        l.getClass();
        tz1Var.getClass();
        tf0 tf0Var = (tf0) hpVar;
        final zy1 zy1Var = (zy1) tf0Var.wdg6QnbFHrFF(bz1.PxuCJdSBwIXG);
        Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
        hp.Companion.getClass();
        jx1 jx1Var = fp.lS5Rgt96tfkO;
        if (nLZGh9p8gVSu == jx1Var) {
            Object TSizfFm2Yiuu2 = (zy1Var == null || (a92UlCVFR9N8 = zy1Var.a92UlCVFR9N8(l)) == null) ? null : tz1Var.TSizfFm2Yiuu(a92UlCVFR9N8);
            if (TSizfFm2Yiuu2 == null) {
                TSizfFm2Yiuu2 = ae0Var.PxuCJdSBwIXG();
            }
            objArr2 = objArr;
            tz1Var2 = tz1Var;
            vy1 vy1Var = new vy1(tz1Var2, zy1Var, l, TSizfFm2Yiuu2, objArr2);
            tf0Var.JTxCbbCwomzt(vy1Var);
            nLZGh9p8gVSu = vy1Var;
        } else {
            objArr2 = objArr;
            tz1Var2 = tz1Var;
        }
        final vy1 vy1Var2 = (vy1) nLZGh9p8gVSu;
        Object obj2 = Arrays.equals(objArr2, vy1Var2.x50lh2ztY7Y5) ? vy1Var2.dgRBjINgWbAK : null;
        if (obj2 == null) {
            obj2 = ae0Var.PxuCJdSBwIXG();
        }
        boolean rtx2ld2ELZv4 = tf0Var.rtx2ld2ELZv4(vy1Var2) | ((((i & 112) ^ 48) > 32 && tf0Var.rtx2ld2ELZv4(tz1Var2)) || (i & 48) == 32) | tf0Var.rtx2ld2ELZv4(zy1Var) | tf0Var.a92UlCVFR9N8(l) | tf0Var.rtx2ld2ELZv4(obj2) | tf0Var.rtx2ld2ELZv4(objArr2);
        Object nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
        if (rtx2ld2ELZv4 || nLZGh9p8gVSu2 == jx1Var) {
            final Object[] objArr3 = objArr2;
            obj = obj2;
            final tz1 tz1Var3 = tz1Var2;
            ae0 ae0Var2 = new ae0() { // from class: lu1
                @Override // defpackage.ae0
                public final Object PxuCJdSBwIXG() {
                    boolean z;
                    vy1 vy1Var3 = vy1.this;
                    zy1 zy1Var2 = vy1Var3.OPXfSBeufaJ8;
                    zy1 zy1Var3 = zy1Var;
                    boolean z2 = true;
                    if (zy1Var2 != zy1Var3) {
                        vy1Var3.OPXfSBeufaJ8 = zy1Var3;
                        z = true;
                    } else {
                        z = false;
                    }
                    String str = vy1Var3.wdg6QnbFHrFF;
                    String str2 = l;
                    if (cs0.wdg6QnbFHrFF(str, str2)) {
                        z2 = z;
                    } else {
                        vy1Var3.wdg6QnbFHrFF = str2;
                    }
                    vy1Var3.rtx2ld2ELZv4 = tz1Var3;
                    vy1Var3.dgRBjINgWbAK = obj;
                    vy1Var3.x50lh2ztY7Y5 = objArr3;
                    m9 m9Var = vy1Var3.cpQdD2nAriOS;
                    if (m9Var != null && z2) {
                        m9Var.tmVwIGCQF4zR();
                        vy1Var3.cpQdD2nAriOS = null;
                        vy1Var3.lS5Rgt96tfkO();
                    }
                    return no2.PxuCJdSBwIXG;
                }
            };
            tf0Var.JTxCbbCwomzt(ae0Var2);
            nLZGh9p8gVSu2 = ae0Var2;
        } else {
            obj = obj2;
        }
        mm2.r3s1LDPKFs1S((ae0) nLZGh9p8gVSu2, tf0Var);
        return obj;
    }

    public static final void cpQdD2nAriOS(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(o0.rtx2ld2ELZv4(i, i2, "index: ", ", size: "));
        }
    }

    public static final boolean dgRBjINgWbAK(go0 go0Var) {
        return !go0Var.rtx2ld2ELZv4 && go0Var.Y1f8riQaR6yg;
    }

    public static final wo1 e6tOsSdd2EFb(View view) {
        wo1 wo1Var = (wo1) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (wo1Var != null) {
            return wo1Var;
        }
        wo1 wo1Var2 = new wo1();
        view.setTag(R.id.pooling_container_listener_holder_tag, wo1Var2);
        return wo1Var2;
    }

    public static final void e9gEMXR7LXtO(b42 b42Var, go0 go0Var, th1 th1Var, do0 do0Var, po0 po0Var, long j) {
        float intBitsToFloat;
        p81 p81Var = po0Var.lS5Rgt96tfkO;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (go0Var.TSizfFm2Yiuu >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (go0Var.TSizfFm2Yiuu & 4294967295L));
        if (dgRBjINgWbAK(go0Var)) {
            po0Var.PxuCJdSBwIXG = 0;
            p81Var.Y1f8riQaR6yg();
        }
        if (!rtx2ld2ELZv4(go0Var) && !dgRBjINgWbAK(go0Var)) {
            if (p81Var.lS5Rgt96tfkO == 3) {
                int i = po0Var.PxuCJdSBwIXG;
                po0Var.PxuCJdSBwIXG = i + 1;
                p81Var.r3s1LDPKFs1S(i, go0Var);
            } else {
                p81Var.PxuCJdSBwIXG(go0Var);
            }
            if (po0Var.PxuCJdSBwIXG == 3) {
                po0Var.PxuCJdSBwIXG = 0;
            }
            Object[] objArr = p81Var.PxuCJdSBwIXG;
            int i2 = p81Var.lS5Rgt96tfkO;
            float f = 0.0f;
            for (int i3 = 0; i3 < i2; i3++) {
                f += Float.intBitsToFloat((int) (((go0) objArr[i3]).TSizfFm2Yiuu >> 32));
            }
            int i4 = p81Var.lS5Rgt96tfkO;
            intBitsToFloat2 = f / i4;
            Object[] objArr2 = p81Var.PxuCJdSBwIXG;
            float f2 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                f2 += Float.intBitsToFloat((int) (((go0) objArr2[i5]).TSizfFm2Yiuu & 4294967295L));
            }
            intBitsToFloat3 = f2 / p81Var.lS5Rgt96tfkO;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L);
        if (th1Var != null) {
            do0.Companion.getClass();
            int i6 = do0Var.PxuCJdSBwIXG;
            if (i6 == 1) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            } else if (i6 == 2) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            }
            floatToRawIntBits = th1Var == th1.OPXfSBeufaJ8 ? (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L) : (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
        }
        ((jx) b42Var.OPXfSBeufaJ8).PxuCJdSBwIXG(go0Var.lS5Rgt96tfkO, bf1.e9gEMXR7LXtO(floatToRawIntBits, j));
    }

    public static final void gGoUzNp9JO5I(ph1 ph1Var, int i, Object obj) {
        ph1Var.RAsUl2FVSrh6[(ph1Var.rtx2ld2ELZv4 - ph1Var.TSizfFm2Yiuu[ph1Var.Y1f8riQaR6yg - 1].lS5Rgt96tfkO) + i] = obj;
    }

    public static final pe2 gPXPFXrUH4XX(tx txVar) {
        cf2 cf2Var;
        me2 me2Var = new me2();
        jh0.tmVwIGCQF4zR(txVar, re2.PxuCJdSBwIXG, new xw1(new xw1(11, me2Var), new RAsUl2FVSrh6(1, me2Var, me2.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, 0, 4)));
        p81 p81Var = new p81();
        p81 p81Var2 = me2Var.PxuCJdSBwIXG;
        Object[] objArr = p81Var2.PxuCJdSBwIXG;
        int i = p81Var2.lS5Rgt96tfkO;
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        ne2 ne2Var = null;
        while (true) {
            cf2Var = cf2.lS5Rgt96tfkO;
            if (i3 >= i) {
                break;
            }
            ne2 ne2Var2 = (ne2) objArr[i3];
            if (!z || ne2Var2 != cf2Var) {
                if (ne2Var2 != cf2Var || ne2Var != cf2Var) {
                    if (ne2Var2 != cf2Var) {
                        p81 p81Var3 = me2Var.lS5Rgt96tfkO;
                        Object[] objArr2 = p81Var3.PxuCJdSBwIXG;
                        int i4 = p81Var3.lS5Rgt96tfkO;
                        for (int i5 = 0; i5 < i4; i5++) {
                            if (((Boolean) ((le0) objArr2[i5]).OPXfSBeufaJ8(ne2Var2)).booleanValue()) {
                            }
                        }
                    }
                    p81Var.PxuCJdSBwIXG(ne2Var2);
                    z = false;
                    ne2Var = ne2Var2;
                }
                z = false;
                break;
            }
            i3++;
        }
        if (((ne2) (p81Var.rtx2ld2ELZv4() ? null : p81Var.PxuCJdSBwIXG[p81Var.lS5Rgt96tfkO - 1])) == cf2Var) {
            p81Var.dgRBjINgWbAK(p81Var.lS5Rgt96tfkO - 1);
        }
        n81 n81Var = p81Var.TSizfFm2Yiuu;
        if (n81Var == null) {
            n81Var = new n81(i2, p81Var);
            p81Var.TSizfFm2Yiuu = n81Var;
        }
        return new pe2(n81Var);
    }

    public static final Object i68hK7ahKtgp(f02 f02Var, f02 f02Var2, pe0 pe0Var) {
        Object smVar;
        Object JHNfcAUfKc4G;
        try {
            mm2.S9EYkSpbGuxq(2, pe0Var);
            smVar = pe0Var.rtx2ld2ELZv4(f02Var2, f02Var);
        } catch (Throwable th) {
            smVar = new sm(th, false);
        }
        su suVar = su.rtx2ld2ELZv4;
        if (smVar == suVar || (JHNfcAUfKc4G = f02Var.JHNfcAUfKc4G(smVar)) == f2.cpQdD2nAriOS) {
            return suVar;
        }
        if (JHNfcAUfKc4G instanceof sm) {
            throw ((sm) JHNfcAUfKc4G).PxuCJdSBwIXG;
        }
        return f2.gGoUzNp9JO5I(JHNfcAUfKc4G);
    }

    public static final v8 jyegZNwi31qc(oh2 oh2Var) {
        v8 v8Var = oh2Var.PxuCJdSBwIXG;
        long j = oh2Var.lS5Rgt96tfkO;
        v8Var.getClass();
        return v8Var.subSequence(vi2.a92UlCVFR9N8(j), vi2.e9gEMXR7LXtO(j));
    }

    public static final v8 kpCQ9veP6n3I(oh2 oh2Var, int i) {
        v8 v8Var = oh2Var.PxuCJdSBwIXG;
        long j = oh2Var.lS5Rgt96tfkO;
        int a92UlCVFR9N8 = vi2.a92UlCVFR9N8(j);
        int i2 = a92UlCVFR9N8 - i;
        if (((a92UlCVFR9N8 ^ i2) & (i ^ a92UlCVFR9N8)) < 0) {
            i2 = 0;
        }
        return v8Var.subSequence(Math.max(0, i2), vi2.a92UlCVFR9N8(j));
    }

    public static final void lS5Rgt96tfkO(n61 n61Var, on onVar, hp hpVar, int i) {
        int i2;
        final n61 n61Var2;
        final on onVar2;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(790527681);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (tf0Var.a92UlCVFR9N8(n61Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tf0Var.rtx2ld2ELZv4(onVar) ? 32 : 16;
        }
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 19) != 18)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
            hp.Companion.getClass();
            jx1 jx1Var = fp.lS5Rgt96tfkO;
            if (nLZGh9p8gVSu == jx1Var) {
                mj1 mj1Var = new mj1(null, ih0.EcgxDIVH5in8);
                tf0Var.JTxCbbCwomzt(mj1Var);
                nLZGh9p8gVSu = mj1Var;
            }
            final d91 d91Var = (d91) nLZGh9p8gVSu;
            Object nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
            if (nLZGh9p8gVSu2 == jx1Var) {
                nLZGh9p8gVSu2 = new m6(d91Var, 5);
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu2);
            }
            final ae0 ae0Var = (ae0) nLZGh9p8gVSu2;
            ep1 ep1Var = hx.PxuCJdSBwIXG;
            final ad EcgxDIVH5in8 = mm2.EcgxDIVH5in8(f2.RAsUl2FVSrh6, tf0Var, 6);
            n61Var2 = n61Var;
            onVar2 = onVar;
            zv.TSizfFm2Yiuu(new ir1[]{bf2.lS5Rgt96tfkO.PxuCJdSBwIXG(hq0.rZjpSjn4zoMv(ae0Var, tf0Var, 2)), bf2.PxuCJdSBwIXG.PxuCJdSBwIXG(EcgxDIVH5in8)}, bs0.kpCQ9veP6n3I(1070596993, new pe0() { // from class: lm1
                @Override // defpackage.pe0
                public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
                    hp hpVar2 = (hp) obj;
                    int intValue = ((Integer) obj2).intValue();
                    tf0 tf0Var2 = (tf0) hpVar2;
                    if (tf0Var2.Pf0ThKz3j5YS(intValue & 1, (intValue & 3) != 2)) {
                        gg1 gg1Var2 = mp.PxuCJdSBwIXG;
                        Object nLZGh9p8gVSu3 = tf0Var2.nLZGh9p8gVSu();
                        hp.Companion.getClass();
                        if (nLZGh9p8gVSu3 == fp.lS5Rgt96tfkO) {
                            nLZGh9p8gVSu3 = new o6(d91Var, 2);
                            tf0Var2.JTxCbbCwomzt(nLZGh9p8gVSu3);
                        }
                        n61 nxJAScVArhE9 = mm2.nxJAScVArhE9(n61.this, (le0) nLZGh9p8gVSu3);
                        s.Companion.getClass();
                        j51 Y1f8riQaR6yg2 = xe.Y1f8riQaR6yg(r.lS5Rgt96tfkO, true);
                        int hashCode = Long.hashCode(tf0Var2.wLFCmsViZrNT);
                        il1 x50lh2ztY7Y5 = tf0Var2.x50lh2ztY7Y5();
                        n61 xfACYKDMU6Dj = ov2.xfACYKDMU6Dj(tf0Var2, nxJAScVArhE9);
                        yo.Companion.getClass();
                        dq dqVar = xo.lS5Rgt96tfkO;
                        tf0Var2.ngxnMNrpiKat();
                        if (tf0Var2.zf8DYfih6EZu) {
                            tf0Var2.dgRBjINgWbAK(dqVar);
                        } else {
                            tf0Var2.hVNtCUZb4tYH();
                        }
                        th0.tmVwIGCQF4zR(tf0Var2, xo.a92UlCVFR9N8, Y1f8riQaR6yg2);
                        th0.tmVwIGCQF4zR(tf0Var2, xo.e9gEMXR7LXtO, x50lh2ztY7Y5);
                        th0.tmVwIGCQF4zR(tf0Var2, xo.RAsUl2FVSrh6, Integer.valueOf(hashCode));
                        th0.kpCQ9veP6n3I(tf0Var2, xo.rtx2ld2ELZv4);
                        th0.tmVwIGCQF4zR(tf0Var2, xo.Y1f8riQaR6yg, xfACYKDMU6Dj);
                        onVar2.rtx2ld2ELZv4(tf0Var2, 0);
                        EcgxDIVH5in8.lS5Rgt96tfkO(ae0Var, tf0Var2, 6);
                        tf0Var2.gPXPFXrUH4XX(true);
                    } else {
                        tf0Var2.i68hK7ahKtgp();
                    }
                    return no2.PxuCJdSBwIXG;
                }
            }, tf0Var), tf0Var, 56);
        } else {
            n61Var2 = n61Var;
            onVar2 = onVar;
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new l6(n61Var2, onVar2, i, i3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (r2 == defpackage.fp.lS5Rgt96tfkO) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final kr2 nLZGh9p8gVSu(kr2 kr2Var, hp hpVar) {
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        tf0 tf0Var = (tf0) hpVar;
        Context context = (Context) tf0Var.wdg6QnbFHrFF(h2.lS5Rgt96tfkO);
        boolean a92UlCVFR9N8 = tf0Var.a92UlCVFR9N8(context) | tf0Var.a92UlCVFR9N8(kr2Var);
        Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
        if (!a92UlCVFR9N8) {
            hp.Companion.getClass();
        }
        context.getClass();
        kr2Var.getClass();
        while (context instanceof ContextWrapper) {
            if (context instanceof hn) {
                nLZGh9p8gVSu = rj0.Y1f8riQaR6yg((hn) context, kr2Var);
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
                kr2 kr2Var2 = (kr2) nLZGh9p8gVSu;
                gg1 gg1Var2 = mp.PxuCJdSBwIXG;
                return kr2Var2;
            }
            context = ((ContextWrapper) context).getBaseContext();
            context.getClass();
        }
        u9.EcgxDIVH5in8(context, "Expected an activity context for creating a HiltViewModelFactory but instead found: ");
        return null;
    }

    public static final ArrayList ozEBbv0hFTAB(Map map, le0 le0Var) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            v91 v91Var = (v91) entry.getValue();
            Boolean valueOf = v91Var != null ? Boolean.valueOf(v91Var.lS5Rgt96tfkO) : null;
            valueOf.getClass();
            if (!valueOf.booleanValue() && !v91Var.TSizfFm2Yiuu) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Boolean) le0Var.OPXfSBeufaJ8((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final Class pnx5pC0XzaCw(SerialDescriptor serialDescriptor) {
        String bEKsvqmvPh2y = pa2.bEKsvqmvPh2y(serialDescriptor.lS5Rgt96tfkO(), "?", "");
        try {
            return Class.forName(bEKsvqmvPh2y);
        } catch (ClassNotFoundException unused) {
            if (ia2.jJwa0q7P5wHq(bEKsvqmvPh2y, ".", false)) {
                Pattern compile = Pattern.compile("(\\.+)(?!.*\\.)");
                compile.getClass();
                String replaceAll = compile.matcher(bEKsvqmvPh2y).replaceAll("\\$");
                replaceAll.getClass();
                return Class.forName(replaceAll);
            }
            String str = "Cannot find class with name \"" + serialDescriptor.lS5Rgt96tfkO() + "\". Ensure that the serialName for this argument is the default fully qualified name";
            if (serialDescriptor.TSizfFm2Yiuu() instanceof f42) {
                str = str.concat(".\nIf the build is minified, try annotating the Enum class with \"androidx.annotation.Keep\" to ensure the Enum is not removed.");
            }
            u9.XL4ISE6Oc65B(str);
            return null;
        }
    }

    public static final void r3s1LDPKFs1S(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
                return;
            }
            u9.XL4ISE6Oc65B(o0.rtx2ld2ELZv4(i, i2, "fromIndex: ", " > toIndex: "));
        } else {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        }
    }

    public static final iv1 rZjpSjn4zoMv(ji2 ji2Var, int i) {
        ii2 ii2Var = ji2Var.PxuCJdSBwIXG;
        r71 r71Var = ji2Var.lS5Rgt96tfkO;
        if (ii2Var.PxuCJdSBwIXG.OPXfSBeufaJ8.length() != 0) {
            int Y1f8riQaR6yg2 = r71Var.Y1f8riQaR6yg(i);
            if ((i != 0 && Y1f8riQaR6yg2 == r71Var.Y1f8riQaR6yg(i - 1)) || (i != ii2Var.PxuCJdSBwIXG.OPXfSBeufaJ8.length() && Y1f8riQaR6yg2 == r71Var.Y1f8riQaR6yg(i + 1))) {
                return ji2Var.PxuCJdSBwIXG(i);
            }
        }
        return ji2Var.RAsUl2FVSrh6(i);
    }

    public static final boolean rtx2ld2ELZv4(go0 go0Var) {
        return go0Var.rtx2ld2ELZv4 && !go0Var.Y1f8riQaR6yg;
    }

    public static final Object ryVscX7ZL4Ux(Object[] objArr, tz1 tz1Var, ae0 ae0Var, hp hpVar, int i) {
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        return amuv7NJvPxHu(Arrays.copyOf(objArr, objArr.length), tz1Var, ae0Var, hpVar, 384 | ((i << 3) & 7168), 0);
    }

    public static mj1 tmVwIGCQF4zR(Object obj) {
        return new mj1(obj, jx1.S2OOm9zPNm0h);
    }

    public static void wLFCmsViZrNT(xf xfVar, byte[] bArr) {
        long j;
        xfVar.getClass();
        bArr.getClass();
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = xfVar.x50lh2ztY7Y5;
            int i2 = xfVar.cpQdD2nAriOS;
            int i3 = xfVar.r3s1LDPKFs1S;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            long j2 = xfVar.dgRBjINgWbAK;
            yf yfVar = xfVar.rtx2ld2ELZv4;
            yfVar.getClass();
            if (j2 == yfVar.OPXfSBeufaJ8) {
                u9.rtx2ld2ELZv4("no more bytes");
                return;
            }
            j = xfVar.dgRBjINgWbAK;
        } while (xfVar.a92UlCVFR9N8(j == -1 ? 0L : j + (xfVar.r3s1LDPKFs1S - xfVar.cpQdD2nAriOS)) != -1);
    }

    public static void wdg6QnbFHrFF(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static final void x50lh2ztY7Y5(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(o0.rtx2ld2ELZv4(i, i2, "index: ", ", size: "));
        }
    }

    public static final long xfACYKDMU6Dj(go0 go0Var, th1 th1Var, do0 do0Var) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long j;
        if (th1Var == null) {
            return go0Var.TSizfFm2Yiuu;
        }
        do0.Companion.getClass();
        int i = do0Var.PxuCJdSBwIXG;
        if (i == 1) {
            intBitsToFloat = Float.intBitsToFloat((int) (go0Var.TSizfFm2Yiuu >> 32));
        } else {
            if (i != 2) {
                return go0Var.TSizfFm2Yiuu;
            }
            intBitsToFloat = Float.intBitsToFloat((int) (go0Var.TSizfFm2Yiuu & 4294967295L));
        }
        if (th1Var == th1.OPXfSBeufaJ8) {
            long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
            floatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = floatToRawIntBits2 << 32;
        } else {
            long floatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
            j = floatToRawIntBits3 << 32;
        }
        return j | (4294967295L & floatToRawIntBits);
    }

    public static final void zf8DYfih6EZu(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i);
        sb.append(", message: ".concat(str));
        throw new SQLException(sb.toString());
    }

    public int hashCode() {
        switch (this.PxuCJdSBwIXG) {
            case 18:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.PxuCJdSBwIXG) {
            case 18:
                String TSizfFm2Yiuu2 = bu1.PxuCJdSBwIXG(getClass()).TSizfFm2Yiuu();
                TSizfFm2Yiuu2.getClass();
                return TSizfFm2Yiuu2;
            default:
                return super.toString();
        }
    }
}
