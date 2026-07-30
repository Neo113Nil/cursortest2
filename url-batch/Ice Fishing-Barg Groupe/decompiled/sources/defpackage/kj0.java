package defpackage;

import android.os.Bundle;
import android.view.View;
import com.ice.fishing.grenza.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class kj0 {
    public static final /* synthetic */ int PxuCJdSBwIXG = 0;

    public static final int BRwzKIf41E4i(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            xi1 xi1Var = (xi1) list.get(i3);
            char c = xi1Var.Y1f8riQaR6yg > i ? (char) 1 : xi1Var.e9gEMXR7LXtO <= i ? (char) 65535 : (char) 0;
            if (c < 0) {
                i2 = i3 + 1;
            } else {
                if (c <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final boolean BjEWd04qc7Mw(eh2 eh2Var, boolean z) {
        bw0 TSizfFm2Yiuu;
        yz0 yz0Var = eh2Var.Y1f8riQaR6yg;
        if (yz0Var == null || (TSizfFm2Yiuu = yz0Var.TSizfFm2Yiuu()) == null) {
            return false;
        }
        qt1 ryVscX7ZL4Ux = ng0.ryVscX7ZL4Ux(TSizfFm2Yiuu);
        long x50lh2ztY7Y5 = eh2Var.x50lh2ztY7Y5(z);
        float f = ryVscX7ZL4Ux.PxuCJdSBwIXG;
        float f2 = ryVscX7ZL4Ux.TSizfFm2Yiuu;
        float intBitsToFloat = Float.intBitsToFloat((int) (x50lh2ztY7Y5 >> 32));
        if (f > intBitsToFloat || intBitsToFloat > f2) {
            return false;
        }
        float f3 = ryVscX7ZL4Ux.lS5Rgt96tfkO;
        float f4 = ryVscX7ZL4Ux.Y1f8riQaR6yg;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (x50lh2ztY7Y5 & 4294967295L));
        return f3 <= intBitsToFloat2 && intBitsToFloat2 <= f4;
    }

    public static final int EcgxDIVH5in8(CharSequence charSequence, int i) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    public static final long EpkonXwzFgDB(bw0 bw0Var) {
        bf1.Companion.getClass();
        return bw0Var.TSizfFm2Yiuu(0L);
    }

    public static final pr2 IAToe7bXGz4N(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            pr2 pr2Var = tag instanceof pr2 ? (pr2) tag : null;
            if (pr2Var != null) {
                return pr2Var;
            }
            Object pnx5pC0XzaCw = ni0.pnx5pC0XzaCw(view);
            view = pnx5pC0XzaCw instanceof View ? (View) pnx5pC0XzaCw : null;
        }
        return null;
    }

    public static final long J54yh1s3n4Aq(bw0 bw0Var) {
        bf1.Companion.getClass();
        return bw0Var.Pf0ThKz3j5YS(0L);
    }

    public static final qt1 OPXfSBeufaJ8(bw0 bw0Var) {
        bw0 dgRBjINgWbAK = bw0Var.dgRBjINgWbAK();
        return dgRBjINgWbAK != null ? dgRBjINgWbAK.nLZGh9p8gVSu(bw0Var, true) : new qt1(0.0f, 0.0f, (int) (bw0Var.ryVscX7ZL4Ux() >> 32), (int) (bw0Var.ryVscX7ZL4Ux() & 4294967295L));
    }

    public static final pn2 POWyO8hTM6YC(String str) {
        int i;
        ov2.RfyTYNmI9Srp(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        if (cs0.gPXPFXrUH4XX(charAt, 48) < 0) {
            i = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int i3 = 119304647;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            int i4 = i2 ^ Integer.MIN_VALUE;
            if (Integer.compare(i4, i3 ^ Integer.MIN_VALUE) > 0) {
                if (i3 != 119304647 || Integer.compare(i4, -1717986919) > 0) {
                    return null;
                }
                i3 = 429496729;
            }
            int i5 = i2 * 10;
            int i6 = digit + i5;
            if (Integer.compare(i6 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i++;
            i2 = i6;
        }
        return new pn2(i2);
    }

    public static final tr0 Pf0ThKz3j5YS(SerialDescriptor serialDescriptor) {
        String bEKsvqmvPh2y = pa2.bEKsvqmvPh2y(serialDescriptor.lS5Rgt96tfkO(), "?", "");
        return cs0.wdg6QnbFHrFF(serialDescriptor.TSizfFm2Yiuu(), f42.e9gEMXR7LXtO) ? serialDescriptor.rtx2ld2ELZv4() ? tr0.jyegZNwi31qc : tr0.e6tOsSdd2EFb : bEKsvqmvPh2y.equals("kotlin.Int") ? serialDescriptor.rtx2ld2ELZv4() ? tr0.OPXfSBeufaJ8 : tr0.rtx2ld2ELZv4 : bEKsvqmvPh2y.equals("kotlin.Boolean") ? serialDescriptor.rtx2ld2ELZv4() ? tr0.dgRBjINgWbAK : tr0.wdg6QnbFHrFF : bEKsvqmvPh2y.equals("kotlin.Double") ? serialDescriptor.rtx2ld2ELZv4() ? tr0.cpQdD2nAriOS : tr0.x50lh2ztY7Y5 : bEKsvqmvPh2y.equals("kotlin.Float") ? serialDescriptor.rtx2ld2ELZv4() ? tr0.QrzZRwfaDlRX : tr0.r3s1LDPKFs1S : bEKsvqmvPh2y.equals("kotlin.Long") ? serialDescriptor.rtx2ld2ELZv4() ? tr0.BRwzKIf41E4i : tr0.gPXPFXrUH4XX : bEKsvqmvPh2y.equals("kotlin.String") ? serialDescriptor.rtx2ld2ELZv4() ? tr0.RfyTYNmI9Srp : tr0.XL4ISE6Oc65B : bEKsvqmvPh2y.equals("kotlin.IntArray") ? tr0.EcgxDIVH5in8 : bEKsvqmvPh2y.equals("kotlin.DoubleArray") ? tr0.VhhvGxCb8gfr : bEKsvqmvPh2y.equals("kotlin.BooleanArray") ? tr0.S9EYkSpbGuxq : bEKsvqmvPh2y.equals("kotlin.FloatArray") ? tr0.S2OOm9zPNm0h : bEKsvqmvPh2y.equals("kotlin.LongArray") ? tr0.ZbWwgt3aGe7A : bEKsvqmvPh2y.equals("kotlin.Array") ? tr0.pnx5pC0XzaCw : pa2.yQRudnv4La6p(bEKsvqmvPh2y, "kotlin.collections.ArrayList", false) ? tr0.IAToe7bXGz4N : tr0.aF05bpZJlKEP;
    }

    public static final long PxuCJdSBwIXG(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final int QrzZRwfaDlRX(int i, zy0 zy0Var, Object obj) {
        int lS5Rgt96tfkO;
        return (obj == null || zy0Var.TSizfFm2Yiuu() == 0 || (i < zy0Var.TSizfFm2Yiuu() && obj.equals(zy0Var.Y1f8riQaR6yg(i))) || (lS5Rgt96tfkO = zy0Var.Y1f8riQaR6yg.lS5Rgt96tfkO(obj)) == -1) ? i : lS5Rgt96tfkO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d0, code lost:
    
        if (r15 == r6) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4 A[Catch: CancellationException -> 0x0032, TryCatch #0 {CancellationException -> 0x0032, blocks: (B:12:0x002d, B:13:0x00d3, B:15:0x00db, B:17:0x00e8, B:19:0x00f4, B:21:0x00f7, B:24:0x00fa, B:27:0x00fe, B:35:0x00a0, B:37:0x00a4, B:38:0x00a6, B:40:0x00aa, B:42:0x00ae, B:44:0x00b2, B:46:0x00b6, B:48:0x00ba, B:49:0x00bf, B:58:0x0051, B:60:0x005f, B:61:0x006e, B:64:0x0067), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00aa A[Catch: CancellationException -> 0x0032, TryCatch #0 {CancellationException -> 0x0032, blocks: (B:12:0x002d, B:13:0x00d3, B:15:0x00db, B:17:0x00e8, B:19:0x00f4, B:21:0x00f7, B:24:0x00fa, B:27:0x00fe, B:35:0x00a0, B:37:0x00a4, B:38:0x00a6, B:40:0x00aa, B:42:0x00ae, B:44:0x00b2, B:46:0x00b6, B:48:0x00ba, B:49:0x00bf, B:58:0x0051, B:60:0x005f, B:61:0x006e, B:64:0x0067), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae A[Catch: CancellationException -> 0x0032, TryCatch #0 {CancellationException -> 0x0032, blocks: (B:12:0x002d, B:13:0x00d3, B:15:0x00db, B:17:0x00e8, B:19:0x00f4, B:21:0x00f7, B:24:0x00fa, B:27:0x00fe, B:35:0x00a0, B:37:0x00a4, B:38:0x00a6, B:40:0x00aa, B:42:0x00ae, B:44:0x00b2, B:46:0x00b6, B:48:0x00ba, B:49:0x00bf, B:58:0x0051, B:60:0x005f, B:61:0x006e, B:64:0x0067), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object RAsUl2FVSrh6(oc2 oc2Var, of2 of2Var, qn1 qn1Var, int i, nc ncVar) {
        p22 p22Var;
        int i2;
        long j;
        rc1 rc1Var;
        yt1 yt1Var;
        h10 h10Var;
        try {
            if (ncVar instanceof p22) {
                p22Var = (p22) ncVar;
                int i3 = p22Var.gPXPFXrUH4XX;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    p22Var.gPXPFXrUH4XX = i3 - Integer.MIN_VALUE;
                    Object obj = p22Var.QrzZRwfaDlRX;
                    i2 = p22Var.gPXPFXrUH4XX;
                    no2 no2Var = no2.PxuCJdSBwIXG;
                    int i4 = 2;
                    su suVar = su.rtx2ld2ELZv4;
                    if (i2 != 0) {
                        ng0.tmVwIGCQF4zR(obj);
                        ao1 ao1Var = (ao1) zk.MDTGUQSX7PXD(qn1Var.PxuCJdSBwIXG);
                        j = ao1Var.PxuCJdSBwIXG;
                        long j2 = ao1Var.TSizfFm2Yiuu;
                        if (i > 2) {
                            j22.Companion.getClass();
                            rc1Var = i22.Y1f8riQaR6yg;
                        } else {
                            j22.Companion.getClass();
                            rc1Var = i22.TSizfFm2Yiuu;
                        }
                        of2Var.lS5Rgt96tfkO(j2, rc1Var);
                        yt1Var = new yt1();
                        bf1.Companion.getClass();
                        yt1Var.rtx2ld2ELZv4 = 9205357640488583168L;
                        long TSizfFm2Yiuu = oc2Var.a92UlCVFR9N8().TSizfFm2Yiuu();
                        q22 q22Var = new q22(j, yt1Var, null);
                        p22Var.dgRBjINgWbAK = oc2Var;
                        p22Var.x50lh2ztY7Y5 = of2Var;
                        p22Var.cpQdD2nAriOS = yt1Var;
                        p22Var.r3s1LDPKFs1S = j;
                        p22Var.gPXPFXrUH4XX = 1;
                        obj = oc2Var.x50lh2ztY7Y5(TSizfFm2Yiuu, q22Var, p22Var);
                        if (obj == suVar) {
                            return suVar;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            of2Var = p22Var.x50lh2ztY7Y5;
                            oc2Var = p22Var.dgRBjINgWbAK;
                            ng0.tmVwIGCQF4zR(obj);
                            if (!((Boolean) obj).booleanValue()) {
                                of2Var.onCancel();
                                return no2Var;
                            }
                            List list = oc2Var.cpQdD2nAriOS.IAToe7bXGz4N.PxuCJdSBwIXG;
                            int size = list.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                ao1 ao1Var2 = (ao1) list.get(i5);
                                if (ni0.dgRBjINgWbAK(ao1Var2)) {
                                    ao1Var2.PxuCJdSBwIXG();
                                }
                            }
                            of2Var.PxuCJdSBwIXG();
                            return no2Var;
                        }
                        long j3 = p22Var.r3s1LDPKFs1S;
                        yt1Var = p22Var.cpQdD2nAriOS;
                        of2 of2Var2 = p22Var.x50lh2ztY7Y5;
                        oc2 oc2Var2 = p22Var.dgRBjINgWbAK;
                        try {
                            ng0.tmVwIGCQF4zR(obj);
                            j = j3;
                            of2Var = of2Var2;
                            oc2Var = oc2Var2;
                        } catch (CancellationException e) {
                            e = e;
                            of2Var = of2Var2;
                            of2Var.onCancel();
                            throw e;
                        }
                    }
                    h10Var = (h10) obj;
                    if (h10Var == null) {
                        h10Var = h10.wdg6QnbFHrFF;
                    }
                    if (h10Var != h10.dgRBjINgWbAK) {
                        of2Var.onCancel();
                        return no2Var;
                    }
                    if (h10Var == h10.rtx2ld2ELZv4) {
                        of2Var.PxuCJdSBwIXG();
                        return no2Var;
                    }
                    if (h10Var == h10.OPXfSBeufaJ8) {
                        of2Var.e9gEMXR7LXtO(yt1Var.rtx2ld2ELZv4);
                    }
                    l31 l31Var = new l31(of2Var, i4);
                    p22Var.dgRBjINgWbAK = oc2Var;
                    p22Var.x50lh2ztY7Y5 = of2Var;
                    p22Var.cpQdD2nAriOS = null;
                    p22Var.gPXPFXrUH4XX = 2;
                    obj = n20.Y1f8riQaR6yg(oc2Var, j, l31Var, p22Var);
                }
            }
            if (i2 != 0) {
            }
            h10Var = (h10) obj;
            if (h10Var == null) {
            }
            if (h10Var != h10.dgRBjINgWbAK) {
            }
        } catch (CancellationException e2) {
            e = e2;
        }
        p22Var = new p22(ncVar);
        Object obj2 = p22Var.QrzZRwfaDlRX;
        i2 = p22Var.gPXPFXrUH4XX;
        no2 no2Var2 = no2.PxuCJdSBwIXG;
        int i42 = 2;
        su suVar2 = su.rtx2ld2ELZv4;
    }

    public static final int RfyTYNmI9Srp(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final void S2OOm9zPNm0h(ko1 ko1Var, Encoder encoder, Object obj) {
        ko1Var.getClass();
        obj.getClass();
        k42 PxuCJdSBwIXG2 = encoder.PxuCJdSBwIXG();
        eu0 eu0Var = ko1Var.PxuCJdSBwIXG;
        ((g42) PxuCJdSBwIXG2).getClass();
        eu0Var.getClass();
        ((ck) eu0Var).Y1f8riQaR6yg(obj);
        ck PxuCJdSBwIXG3 = bu1.PxuCJdSBwIXG(obj.getClass());
        String TSizfFm2Yiuu = PxuCJdSBwIXG3.TSizfFm2Yiuu();
        if (TSizfFm2Yiuu == null) {
            TSizfFm2Yiuu = String.valueOf(PxuCJdSBwIXG3);
        }
        ov2.i68hK7ahKtgp(TSizfFm2Yiuu, eu0Var);
        throw null;
    }

    public static final void S9EYkSpbGuxq(ArrayList arrayList, long j, le0 le0Var) {
        int size = arrayList.size();
        for (int gPXPFXrUH4XX = gPXPFXrUH4XX(vi2.a92UlCVFR9N8(j), arrayList); gPXPFXrUH4XX < size; gPXPFXrUH4XX++) {
            xi1 xi1Var = (xi1) arrayList.get(gPXPFXrUH4XX);
            if (xi1Var.lS5Rgt96tfkO >= vi2.e9gEMXR7LXtO(j)) {
                return;
            }
            if (xi1Var.lS5Rgt96tfkO != xi1Var.TSizfFm2Yiuu) {
                le0Var.OPXfSBeufaJ8(xi1Var);
            }
        }
    }

    public static final e0 TSizfFm2Yiuu(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new e0(matcher, charSequence);
        }
        return null;
    }

    public static final void VhhvGxCb8gfr(ko1 ko1Var, op opVar, String str) {
        ko1Var.getClass();
        k42 PxuCJdSBwIXG2 = opVar.PxuCJdSBwIXG();
        eu0 eu0Var = ko1Var.PxuCJdSBwIXG;
        ((g42) PxuCJdSBwIXG2).getClass();
        eu0Var.getClass();
        ov2.i68hK7ahKtgp(str, eu0Var);
        throw null;
    }

    public static final int XL4ISE6Oc65B(ArrayList arrayList, float f) {
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((xi1) zk.kRWHK87H9qm4(arrayList)).RAsUl2FVSrh6) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            xi1 xi1Var = (xi1) arrayList.get(i2);
            char c = xi1Var.a92UlCVFR9N8 > f ? (char) 1 : xi1Var.RAsUl2FVSrh6 <= f ? (char) 65535 : (char) 0;
            if (c < 0) {
                i = i2 + 1;
            } else {
                if (c <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void Y1f8riQaR6yg(Logger logger, td2 td2Var, zd2 zd2Var, String str) {
        logger.fine(zd2Var.lS5Rgt96tfkO + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + td2Var.PxuCJdSBwIXG);
    }

    public static final bw0 ZbWwgt3aGe7A(bw0 bw0Var) {
        bw0 bw0Var2;
        bw0 dgRBjINgWbAK = bw0Var.dgRBjINgWbAK();
        while (true) {
            bw0 bw0Var3 = dgRBjINgWbAK;
            bw0Var2 = bw0Var;
            bw0Var = bw0Var3;
            if (bw0Var == null) {
                break;
            }
            dgRBjINgWbAK = bw0Var.dgRBjINgWbAK();
        }
        pd1 pd1Var = bw0Var2 instanceof pd1 ? (pd1) bw0Var2 : null;
        if (pd1Var == null) {
            return bw0Var2;
        }
        pd1 pd1Var2 = pd1Var.ZbWwgt3aGe7A;
        while (true) {
            pd1 pd1Var3 = pd1Var2;
            pd1 pd1Var4 = pd1Var;
            pd1Var = pd1Var3;
            if (pd1Var == null) {
                return pd1Var4;
            }
            pd1Var2 = pd1Var.ZbWwgt3aGe7A;
        }
    }

    public static final String a92UlCVFR9N8(Object[] objArr, int i, int i2, rZjpSjn4zoMv rzjpsjn4zomv) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == rzjpsjn4zomv) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static final int aF05bpZJlKEP(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                u9.XL4ISE6Oc65B("Step is zero.");
                return 0;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    public static final Object amuv7NJvPxHu(ak2 ak2Var, pe0 pe0Var) {
        Object smVar;
        Object JHNfcAUfKc4G;
        ki0.amuv7NJvPxHu(ak2Var, true, new v00(f2.S9EYkSpbGuxq(ak2Var.cpQdD2nAriOS.e9gEMXR7LXtO()).cpQdD2nAriOS(ak2Var.r3s1LDPKFs1S, ak2Var, ak2Var.x50lh2ztY7Y5)));
        try {
            if (pe0Var instanceof nc) {
                mm2.S9EYkSpbGuxq(2, pe0Var);
                smVar = pe0Var.rtx2ld2ELZv4(ak2Var, ak2Var);
            } else {
                smVar = ng0.amuv7NJvPxHu(pe0Var, ak2Var, ak2Var);
            }
        } catch (Throwable th) {
            smVar = new sm(th, false);
        }
        su suVar = su.rtx2ld2ELZv4;
        if (smVar == suVar || (JHNfcAUfKc4G = ak2Var.JHNfcAUfKc4G(smVar)) == f2.cpQdD2nAriOS) {
            return suVar;
        }
        if (JHNfcAUfKc4G instanceof sm) {
            Throwable th2 = ((sm) JHNfcAUfKc4G).PxuCJdSBwIXG;
            if (!(th2 instanceof zj2)) {
                throw th2;
            }
            if (((zj2) th2).rtx2ld2ELZv4 != ak2Var) {
                throw th2;
            }
            if (smVar instanceof sm) {
                throw ((sm) smVar).PxuCJdSBwIXG;
            }
        } else {
            smVar = f2.gGoUzNp9JO5I(JHNfcAUfKc4G);
        }
        return smVar;
    }

    public static d42 cpQdD2nAriOS(String str, sj0 sj0Var, SerialDescriptor[] serialDescriptorArr) {
        if (ia2.fRTaYY6FBZcX(str)) {
            u9.XL4ISE6Oc65B("Blank serial names are prohibited");
            return null;
        }
        if (sj0Var.equals(wa2.e9gEMXR7LXtO)) {
            u9.XL4ISE6Oc65B("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        dk dkVar = new dk(str);
        return new d42(str, sj0Var, dkVar.TSizfFm2Yiuu.size(), na.OYiFbU3x63rc(serialDescriptorArr), dkVar);
    }

    public static final d42 dgRBjINgWbAK(String str, SerialDescriptor[] serialDescriptorArr, le0 le0Var) {
        if (ia2.fRTaYY6FBZcX(str)) {
            u9.XL4ISE6Oc65B("Blank serial names are prohibited");
            return null;
        }
        dk dkVar = new dk(str);
        le0Var.OPXfSBeufaJ8(dkVar);
        return new d42(str, wa2.e9gEMXR7LXtO, dkVar.TSizfFm2Yiuu.size(), na.OYiFbU3x63rc(serialDescriptorArr), dkVar);
    }

    public static final Class e6tOsSdd2EFb(eu0 eu0Var) {
        eu0Var.getClass();
        Class PxuCJdSBwIXG2 = ((zj) eu0Var).PxuCJdSBwIXG();
        PxuCJdSBwIXG2.getClass();
        return PxuCJdSBwIXG2;
    }

    public static final float e9gEMXR7LXtO(dm1 dm1Var, boolean z, ey1[] ey1VarArr, float f) {
        float f2 = Float.NaN;
        for (ey1 ey1Var : ey1VarArr) {
            float TSizfFm2Yiuu = dm1Var.TSizfFm2Yiuu(ey1Var);
            if (!Float.isNaN(f2)) {
                int i = z != (TSizfFm2Yiuu > f2) ? i + 1 : 0;
            }
            f2 = TSizfFm2Yiuu;
        }
        return Float.isNaN(f2) ? f : f2;
    }

    public static final long gGoUzNp9JO5I(long j) {
        return (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static final int gPXPFXrUH4XX(int i, List list) {
        int i2;
        int i3 = ((xi1) zk.kRWHK87H9qm4(list)).TSizfFm2Yiuu;
        if (i > ((xi1) zk.kRWHK87H9qm4(list)).TSizfFm2Yiuu) {
            fp0.PxuCJdSBwIXG("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            xi1 xi1Var = (xi1) list.get(i2);
            char c = xi1Var.lS5Rgt96tfkO > i ? (char) 1 : xi1Var.TSizfFm2Yiuu <= i ? (char) 65535 : (char) 0;
            if (c >= 0) {
                if (c <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        StringBuilder BRwzKIf41E4i = o0.BRwzKIf41E4i(i2, "Found paragraph index ", " should be in range [0, ");
        BRwzKIf41E4i.append(list.size());
        BRwzKIf41E4i.append(").\nDebug info: index=");
        BRwzKIf41E4i.append(i);
        BRwzKIf41E4i.append(", paragraphs=[");
        BRwzKIf41E4i.append(c21.PxuCJdSBwIXG(list, null, new xy0(8), 31));
        BRwzKIf41E4i.append(']');
        fp0.PxuCJdSBwIXG(BRwzKIf41E4i.toString());
        return i2;
    }

    public static final vn2 i68hK7ahKtgp(String str) {
        str.getClass();
        int i = 10;
        ov2.RfyTYNmI9Srp(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        if (cs0.gPXPFXrUH4XX(charAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        long j = 0;
        long j2 = 512409557603043100L;
        while (i2 < length) {
            int digit = Character.digit((int) str.charAt(i2), i);
            if (digit < 0) {
                return null;
            }
            long j3 = j ^ Long.MIN_VALUE;
            int i3 = length;
            if (Long.compare(j3, j2 ^ Long.MIN_VALUE) > 0) {
                if (j2 != 512409557603043100L || Long.compare(j3, -7378697629483820647L) > 0) {
                    return null;
                }
                j2 = 1844674407370955161L;
            }
            long j4 = j * 10;
            long j5 = (digit & 4294967295L) + j4;
            if (Long.compare(j5 ^ Long.MIN_VALUE, j4 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i2++;
            j = j5;
            length = i3;
            i = 10;
        }
        return new vn2(j);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class jyegZNwi31qc(eu0 eu0Var) {
        eu0Var.getClass();
        Class PxuCJdSBwIXG2 = ((zj) eu0Var).PxuCJdSBwIXG();
        if (PxuCJdSBwIXG2.isPrimitive()) {
            String name = PxuCJdSBwIXG2.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return PxuCJdSBwIXG2;
    }

    public static final void kpCQ9veP6n3I(String str) {
        str.getClass();
        if (str.length() <= 0) {
            u9.XL4ISE6Oc65B("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('!' > charAt || charAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                ov2.RfyTYNmI9Srp(16);
                String num = Integer.toString(charAt, 16);
                num.getClass();
                if (num.length() < 2) {
                    num = "0".concat(num);
                }
                sb.append(num);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in header name: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:10:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object lS5Rgt96tfkO(oc2 oc2Var, nc ncVar) {
        l22 l22Var;
        int i;
        su suVar;
        int size;
        int i2;
        if (ncVar instanceof l22) {
            l22Var = (l22) ncVar;
            int i3 = l22Var.cpQdD2nAriOS;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                l22Var.cpQdD2nAriOS = i3 - Integer.MIN_VALUE;
                Object obj = l22Var.x50lh2ztY7Y5;
                i = l22Var.cpQdD2nAriOS;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    l22Var.dgRBjINgWbAK = oc2Var;
                    l22Var.cpQdD2nAriOS = 1;
                    obj = oc2Var.PxuCJdSBwIXG(rn1.OPXfSBeufaJ8, l22Var);
                    suVar = su.rtx2ld2ELZv4;
                    if (obj == suVar) {
                    }
                    qn1 qn1Var = (qn1) obj;
                    List list = qn1Var.PxuCJdSBwIXG;
                    size = list.size();
                    i2 = 0;
                    while (i2 < size) {
                    }
                    return qn1Var;
                }
                if (i != 1) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oc2Var = l22Var.dgRBjINgWbAK;
                ng0.tmVwIGCQF4zR(obj);
                qn1 qn1Var2 = (qn1) obj;
                List list2 = qn1Var2.PxuCJdSBwIXG;
                size = list2.size();
                i2 = 0;
                while (i2 < size) {
                    if (ni0.OPXfSBeufaJ8((ao1) list2.get(i2))) {
                        i2++;
                    } else {
                        l22Var.dgRBjINgWbAK = oc2Var;
                        l22Var.cpQdD2nAriOS = 1;
                        obj = oc2Var.PxuCJdSBwIXG(rn1.OPXfSBeufaJ8, l22Var);
                        suVar = su.rtx2ld2ELZv4;
                        if (obj == suVar) {
                            return suVar;
                        }
                        qn1 qn1Var22 = (qn1) obj;
                        List list22 = qn1Var22.PxuCJdSBwIXG;
                        size = list22.size();
                        i2 = 0;
                        while (i2 < size) {
                        }
                    }
                }
                return qn1Var22;
            }
        }
        l22Var = new l22(ncVar);
        Object obj2 = l22Var.x50lh2ztY7Y5;
        i = l22Var.cpQdD2nAriOS;
        if (i != 0) {
        }
    }

    public static final void nLZGh9p8gVSu(Bundle bundle, String str, List list) {
        bundle.putStringArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object nxJAScVArhE9(long j, pe0 pe0Var, ct ctVar) {
        bk2 bk2Var;
        int i;
        zt1 zt1Var;
        if (ctVar instanceof bk2) {
            bk2Var = (bk2) ctVar;
            int i2 = bk2Var.cpQdD2nAriOS;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bk2Var.cpQdD2nAriOS = i2 - Integer.MIN_VALUE;
                Object obj = bk2Var.x50lh2ztY7Y5;
                i = bk2Var.cpQdD2nAriOS;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    if (j > 0) {
                        zt1 zt1Var2 = new zt1();
                        try {
                            bk2Var.dgRBjINgWbAK = zt1Var2;
                            bk2Var.cpQdD2nAriOS = 1;
                            ak2 ak2Var = new ak2(j, bk2Var);
                            zt1Var2.rtx2ld2ELZv4 = ak2Var;
                            Object amuv7NJvPxHu = amuv7NJvPxHu(ak2Var, pe0Var);
                            su suVar = su.rtx2ld2ELZv4;
                            return amuv7NJvPxHu == suVar ? suVar : amuv7NJvPxHu;
                        } catch (zj2 e) {
                            e = e;
                            zt1Var = zt1Var2;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zt1Var = bk2Var.dgRBjINgWbAK;
                try {
                    ng0.tmVwIGCQF4zR(obj);
                    return obj;
                } catch (zj2 e2) {
                    e = e2;
                }
                if (e.rtx2ld2ELZv4 != zt1Var.rtx2ld2ELZv4) {
                    throw e;
                }
                return null;
            }
        }
        bk2Var = new bk2(ctVar);
        Object obj2 = bk2Var.x50lh2ztY7Y5;
        i = bk2Var.cpQdD2nAriOS;
        if (i != 0) {
        }
        if (e.rtx2ld2ELZv4 != zt1Var.rtx2ld2ELZv4) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0189, code lost:
    
        if (r4 == r12) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:36:0x004f, B:37:0x00be, B:39:0x00c6, B:41:0x00d2, B:43:0x00de, B:63:0x00a5), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object ozEBbv0hFTAB(oc2 oc2Var, bh2 bh2Var, x3 x3Var, qn1 qn1Var, nc ncVar) {
        n22 n22Var;
        int i;
        rc1 rc1Var;
        boolean z;
        vt1 vt1Var;
        yz0 yz0Var;
        rc1 rc1Var2;
        boolean z2;
        oc2 oc2Var2 = oc2Var;
        bh2 bh2Var2 = bh2Var;
        try {
            try {
                if (ncVar instanceof n22) {
                    n22Var = (n22) ncVar;
                    int i2 = n22Var.QrzZRwfaDlRX;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        n22Var.QrzZRwfaDlRX = i2 - Integer.MIN_VALUE;
                        n22 n22Var2 = n22Var;
                        Object obj = n22Var2.r3s1LDPKFs1S;
                        i = n22Var2.QrzZRwfaDlRX;
                        int i3 = 0;
                        if (i == 0) {
                            if (i == 1) {
                                bh2Var2 = n22Var2.x50lh2ztY7Y5;
                                oc2Var2 = n22Var2.dgRBjINgWbAK;
                                ng0.tmVwIGCQF4zR(obj);
                                if (((Boolean) obj).booleanValue()) {
                                    List list = oc2Var2.cpQdD2nAriOS.IAToe7bXGz4N.PxuCJdSBwIXG;
                                    int size = list.size();
                                    while (i3 < size) {
                                        ao1 ao1Var = (ao1) list.get(i3);
                                        if (ni0.dgRBjINgWbAK(ao1Var)) {
                                            ao1Var.PxuCJdSBwIXG();
                                        }
                                        i3++;
                                    }
                                }
                                return no2.PxuCJdSBwIXG;
                            }
                            if (i != 2) {
                                u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            vt1 vt1Var2 = n22Var2.cpQdD2nAriOS;
                            bh2Var2 = n22Var2.x50lh2ztY7Y5;
                            oc2 oc2Var3 = n22Var2.dgRBjINgWbAK;
                            ng0.tmVwIGCQF4zR(obj);
                            vt1Var = vt1Var2;
                            oc2Var2 = oc2Var3;
                            if (((Boolean) obj).booleanValue() && vt1Var.rtx2ld2ELZv4) {
                                List list2 = oc2Var2.cpQdD2nAriOS.IAToe7bXGz4N.PxuCJdSBwIXG;
                                int size2 = list2.size();
                                while (i3 < size2) {
                                    ao1 ao1Var2 = (ao1) list2.get(i3);
                                    if (ni0.dgRBjINgWbAK(ao1Var2)) {
                                        ao1Var2.PxuCJdSBwIXG();
                                    }
                                    i3++;
                                }
                            }
                            bh2Var2.lS5Rgt96tfkO();
                            return no2.PxuCJdSBwIXG;
                        }
                        ng0.tmVwIGCQF4zR(obj);
                        ao1 ao1Var3 = (ao1) qn1Var.PxuCJdSBwIXG.get(0);
                        int i4 = qn1Var.e9gEMXR7LXtO & 1;
                        su suVar = su.rtx2ld2ELZv4;
                        if (i4 != 0) {
                            long j = ao1Var3.TSizfFm2Yiuu;
                            eh2 eh2Var = (eh2) bh2Var2.TSizfFm2Yiuu;
                            yz0 yz0Var2 = eh2Var.Y1f8riQaR6yg;
                            if (yz0Var2 == null || yz0Var2.Y1f8riQaR6yg() == null || !eh2Var.dgRBjINgWbAK()) {
                                z2 = false;
                            } else {
                                eh2Var.RfyTYNmI9Srp = -1;
                                va0 va0Var = eh2Var.dgRBjINgWbAK;
                                if (va0Var != null) {
                                    va0.PxuCJdSBwIXG(va0Var);
                                }
                                oh2 r3s1LDPKFs1S = eh2Var.r3s1LDPKFs1S();
                                j22.Companion.getClass();
                                bh2Var2.TSizfFm2Yiuu(r3s1LDPKFs1S, j, false, i22.lS5Rgt96tfkO);
                                z2 = true;
                            }
                            if (z2) {
                                ao1Var3.PxuCJdSBwIXG();
                                long j2 = ao1Var3.PxuCJdSBwIXG;
                                xw1 xw1Var = new xw1(4, bh2Var2);
                                n22Var2.dgRBjINgWbAK = oc2Var2;
                                n22Var2.x50lh2ztY7Y5 = bh2Var2;
                                n22Var2.QrzZRwfaDlRX = 1;
                                obj = n20.Y1f8riQaR6yg(oc2Var2, j2, xw1Var, n22Var2);
                                if (obj == suVar) {
                                    return suVar;
                                }
                                if (((Boolean) obj).booleanValue()) {
                                }
                            }
                            return no2.PxuCJdSBwIXG;
                        }
                        int i5 = x3Var.PxuCJdSBwIXG;
                        rc1 rc1Var3 = i22.lS5Rgt96tfkO;
                        if (i5 != 1) {
                            if (i5 != 2) {
                                j22.Companion.getClass();
                                rc1Var2 = i22.Y1f8riQaR6yg;
                            } else {
                                j22.Companion.getClass();
                                rc1Var2 = i22.TSizfFm2Yiuu;
                            }
                            rc1Var = rc1Var2;
                        } else {
                            j22.Companion.getClass();
                            rc1Var = rc1Var3;
                        }
                        long j3 = ao1Var3.TSizfFm2Yiuu;
                        int i6 = x3Var.PxuCJdSBwIXG;
                        eh2 eh2Var2 = (eh2) bh2Var2.TSizfFm2Yiuu;
                        if (!eh2Var2.dgRBjINgWbAK() || eh2Var2.r3s1LDPKFs1S().PxuCJdSBwIXG.OPXfSBeufaJ8.length() == 0 || (yz0Var = eh2Var2.Y1f8riQaR6yg) == null || yz0Var.Y1f8riQaR6yg() == null) {
                            z = false;
                        } else {
                            va0 va0Var2 = eh2Var2.dgRBjINgWbAK;
                            if (va0Var2 != null) {
                                va0.PxuCJdSBwIXG(va0Var2);
                            }
                            eh2Var2.r3s1LDPKFs1S = j3;
                            eh2Var2.RfyTYNmI9Srp = -1;
                            eh2Var2.rtx2ld2ELZv4(true);
                            long TSizfFm2Yiuu = bh2Var2.TSizfFm2Yiuu(eh2Var2.r3s1LDPKFs1S(), eh2Var2.r3s1LDPKFs1S, true, rc1Var);
                            if (i6 >= 2) {
                                bh2Var2.PxuCJdSBwIXG = true;
                                bh2Var2.lS5Rgt96tfkO = new vi2(TSizfFm2Yiuu);
                            }
                            z = true;
                        }
                        if (z) {
                            vt1Var = new vt1();
                            j22.Companion.getClass();
                            vt1Var.rtx2ld2ELZv4 = !rc1Var.equals(rc1Var3);
                            long j4 = ao1Var3.PxuCJdSBwIXG;
                            cd cdVar = new cd(bh2Var2, rc1Var, vt1Var, 9);
                            n22Var2.dgRBjINgWbAK = oc2Var2;
                            n22Var2.x50lh2ztY7Y5 = bh2Var2;
                            n22Var2.cpQdD2nAriOS = vt1Var;
                            n22Var2.QrzZRwfaDlRX = 2;
                            obj = n20.Y1f8riQaR6yg(oc2Var2, j4, cdVar, n22Var2);
                        }
                        return no2.PxuCJdSBwIXG;
                    }
                }
                if (i == 0) {
                }
            } finally {
            }
        } finally {
        }
        n22Var = new n22(ncVar);
        n22 n22Var22 = n22Var;
        Object obj2 = n22Var22.r3s1LDPKFs1S;
        i = n22Var22.QrzZRwfaDlRX;
        int i32 = 0;
    }

    public static final String pnx5pC0XzaCw(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / 1000) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / 1000) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static final void r3s1LDPKFs1S(jd0 jd0Var, String str, String str2) {
        jd0Var.getClass();
        str2.getClass();
        ArrayList arrayList = jd0Var.PxuCJdSBwIXG;
        arrayList.add(str);
        arrayList.add(ia2.GlTbNTgfSMqy(str2).toString());
    }

    public static final void rZjpSjn4zoMv(String str, String str2) {
        str.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                ov2.RfyTYNmI9Srp(16);
                String num = Integer.toString(charAt, 16);
                num.getClass();
                if (num.length() < 2) {
                    num = "0".concat(num);
                }
                sb.append(num);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in ");
                sb.append(str2);
                sb.append(" value");
                sb.append(kv2.wdg6QnbFHrFF(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final int rtx2ld2ELZv4(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void ryVscX7ZL4Ux(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static final void tmVwIGCQF4zR() {
        il1.Companion.getClass();
        hl1 hl1Var = il1.Companion;
    }

    public static final void wLFCmsViZrNT(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            hp0.PxuCJdSBwIXG("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        hp0.PxuCJdSBwIXG("minLines " + i + " must be less than or equal to maxLines " + i2);
    }

    public static final qt1 wdg6QnbFHrFF(bw0 bw0Var, boolean z) {
        bw0 ZbWwgt3aGe7A = ZbWwgt3aGe7A(bw0Var);
        float ryVscX7ZL4Ux = (int) (ZbWwgt3aGe7A.ryVscX7ZL4Ux() >> 32);
        float ryVscX7ZL4Ux2 = (int) (ZbWwgt3aGe7A.ryVscX7ZL4Ux() & 4294967295L);
        qt1 nLZGh9p8gVSu = ZbWwgt3aGe7A.nLZGh9p8gVSu(bw0Var, z);
        float f = nLZGh9p8gVSu.PxuCJdSBwIXG;
        if (z) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > ryVscX7ZL4Ux) {
                f = ryVscX7ZL4Ux;
            }
        }
        float f2 = nLZGh9p8gVSu.lS5Rgt96tfkO;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > ryVscX7ZL4Ux2) {
                f2 = ryVscX7ZL4Ux2;
            }
        }
        float f3 = nLZGh9p8gVSu.TSizfFm2Yiuu;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 <= ryVscX7ZL4Ux) {
                ryVscX7ZL4Ux = f3;
            }
            f3 = ryVscX7ZL4Ux;
        }
        float f4 = nLZGh9p8gVSu.Y1f8riQaR6yg;
        if (z) {
            float f5 = f4 >= 0.0f ? f4 : 0.0f;
            if (f5 <= ryVscX7ZL4Ux2) {
                ryVscX7ZL4Ux2 = f5;
            }
            f4 = ryVscX7ZL4Ux2;
        }
        if (f == f3 || f2 == f4) {
            qt1.Companion.getClass();
            return qt1.e9gEMXR7LXtO;
        }
        long OPXfSBeufaJ8 = ZbWwgt3aGe7A.OPXfSBeufaJ8((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
        long OPXfSBeufaJ82 = ZbWwgt3aGe7A.OPXfSBeufaJ8((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
        long OPXfSBeufaJ83 = ZbWwgt3aGe7A.OPXfSBeufaJ8((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
        long OPXfSBeufaJ84 = ZbWwgt3aGe7A.OPXfSBeufaJ8((Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        float intBitsToFloat = Float.intBitsToFloat((int) (OPXfSBeufaJ8 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (OPXfSBeufaJ82 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (OPXfSBeufaJ84 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (OPXfSBeufaJ83 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (OPXfSBeufaJ8 & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (OPXfSBeufaJ82 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (OPXfSBeufaJ84 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (OPXfSBeufaJ83 & 4294967295L));
        return new qt1(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    public static final d42 x50lh2ztY7Y5(String str, sj0 sj0Var, SerialDescriptor[] serialDescriptorArr, le0 le0Var) {
        if (ia2.fRTaYY6FBZcX(str)) {
            u9.XL4ISE6Oc65B("Blank serial names are prohibited");
            return null;
        }
        if (sj0Var.equals(wa2.e9gEMXR7LXtO)) {
            u9.XL4ISE6Oc65B("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        dk dkVar = new dk(str);
        le0Var.OPXfSBeufaJ8(dkVar);
        return new d42(str, sj0Var, dkVar.TSizfFm2Yiuu.size(), na.OYiFbU3x63rc(serialDescriptorArr), dkVar);
    }

    public static final Object xbgXKYA2cIfu(long j, rtx2ld2ELZv4 rtx2ld2elzv4, mo1 mo1Var) {
        long j2;
        t30 t30Var = u30.Companion;
        boolean z = j > 0;
        if (z) {
            long e9gEMXR7LXtO = u30.e9gEMXR7LXtO(j, mm2.jJwa0q7P5wHq(999999L, x30.NANOSECONDS));
            j2 = ((((int) e9gEMXR7LXtO) & 1) != 1 || u30.Y1f8riQaR6yg(e9gEMXR7LXtO)) ? u30.a92UlCVFR9N8(e9gEMXR7LXtO, x30.MILLISECONDS) : e9gEMXR7LXtO >> 1;
        } else {
            if (z) {
                u9.gPXPFXrUH4XX();
                return null;
            }
            j2 = 0;
        }
        if (j2 > 0) {
            return amuv7NJvPxHu(new ak2(j2, mo1Var), rtx2ld2elzv4);
        }
        throw new zj2("Timed out immediately", null);
    }

    public static final void xfACYKDMU6Dj(e72 e72Var, r9 r9Var, int i) {
        while (true) {
            int i2 = e72Var.VhhvGxCb8gfr;
            if (i > i2 && i < e72Var.S9EYkSpbGuxq) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            e72Var.ryVscX7ZL4Ux();
            if (e72Var.pnx5pC0XzaCw(e72Var.VhhvGxCb8gfr)) {
                r9Var.RfyTYNmI9Srp();
            }
            e72Var.wdg6QnbFHrFF();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009e, code lost:
    
        if (r15 == r6) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067 A[Catch: CancellationException -> 0x0031, TryCatch #0 {CancellationException -> 0x0031, blocks: (B:12:0x002c, B:13:0x00a1, B:15:0x00a9, B:17:0x00b5, B:19:0x00c1, B:21:0x00c4, B:24:0x00c7, B:28:0x00cb, B:32:0x0040, B:34:0x0063, B:36:0x0067, B:40:0x0086, B:45:0x004a), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object zf8DYfih6EZu(oc2 oc2Var, of2 of2Var, qn1 qn1Var, nc ncVar) {
        o22 o22Var;
        int i;
        ao1 ao1Var;
        ao1 ao1Var2;
        try {
            if (ncVar instanceof o22) {
                o22Var = (o22) ncVar;
                int i2 = o22Var.QrzZRwfaDlRX;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    o22Var.QrzZRwfaDlRX = i2 - Integer.MIN_VALUE;
                    Object obj = o22Var.r3s1LDPKFs1S;
                    i = o22Var.QrzZRwfaDlRX;
                    int i3 = 1;
                    su suVar = su.rtx2ld2ELZv4;
                    if (i != 0) {
                        ng0.tmVwIGCQF4zR(obj);
                        ao1Var = (ao1) zk.MDTGUQSX7PXD(qn1Var.PxuCJdSBwIXG);
                        long j = ao1Var.PxuCJdSBwIXG;
                        o22Var.dgRBjINgWbAK = oc2Var;
                        o22Var.x50lh2ztY7Y5 = of2Var;
                        o22Var.cpQdD2nAriOS = ao1Var;
                        o22Var.QrzZRwfaDlRX = 1;
                        obj = n20.lS5Rgt96tfkO(oc2Var, j, o22Var);
                        if (obj == suVar) {
                            return suVar;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            of2Var = o22Var.x50lh2ztY7Y5;
                            oc2Var = o22Var.dgRBjINgWbAK;
                            ng0.tmVwIGCQF4zR(obj);
                            if (((Boolean) obj).booleanValue()) {
                                List list = oc2Var.cpQdD2nAriOS.IAToe7bXGz4N.PxuCJdSBwIXG;
                                int size = list.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    ao1 ao1Var3 = (ao1) list.get(i4);
                                    if (ni0.dgRBjINgWbAK(ao1Var3)) {
                                        ao1Var3.PxuCJdSBwIXG();
                                    }
                                }
                                of2Var.PxuCJdSBwIXG();
                            } else {
                                of2Var.onCancel();
                            }
                            return no2.PxuCJdSBwIXG;
                        }
                        ao1 ao1Var4 = o22Var.cpQdD2nAriOS;
                        of2Var = o22Var.x50lh2ztY7Y5;
                        oc2 oc2Var2 = o22Var.dgRBjINgWbAK;
                        ng0.tmVwIGCQF4zR(obj);
                        ao1Var = ao1Var4;
                        oc2Var = oc2Var2;
                    }
                    ao1Var2 = (ao1) obj;
                    if (ao1Var2 != null) {
                        long j2 = ao1Var2.TSizfFm2Yiuu;
                        if (bf1.TSizfFm2Yiuu(bf1.Y1f8riQaR6yg(ao1Var.TSizfFm2Yiuu, j2)) < n20.a92UlCVFR9N8(oc2Var.a92UlCVFR9N8(), ao1Var.OPXfSBeufaJ8)) {
                            of2Var.lS5Rgt96tfkO(j2, r22.PxuCJdSBwIXG);
                            long j3 = ao1Var2.PxuCJdSBwIXG;
                            l31 l31Var = new l31(of2Var, i3);
                            o22Var.dgRBjINgWbAK = oc2Var;
                            o22Var.x50lh2ztY7Y5 = of2Var;
                            o22Var.cpQdD2nAriOS = null;
                            o22Var.QrzZRwfaDlRX = 2;
                            obj = n20.Y1f8riQaR6yg(oc2Var, j3, l31Var, o22Var);
                        }
                    }
                    return no2.PxuCJdSBwIXG;
                }
            }
            if (i != 0) {
            }
            ao1Var2 = (ao1) obj;
            if (ao1Var2 != null) {
            }
            return no2.PxuCJdSBwIXG;
        } catch (CancellationException e) {
            of2Var.onCancel();
            throw e;
        }
        o22Var = new o22(ncVar);
        Object obj2 = o22Var.r3s1LDPKFs1S;
        i = o22Var.QrzZRwfaDlRX;
        int i32 = 1;
        su suVar2 = su.rtx2ld2ELZv4;
    }
}
