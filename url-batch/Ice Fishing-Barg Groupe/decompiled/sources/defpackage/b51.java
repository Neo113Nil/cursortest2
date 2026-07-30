package defpackage;

import android.R;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public abstract class b51 implements Decoder, op {
    public static final k5 OPXfSBeufaJ8;
    public static final f50 PxuCJdSBwIXG;
    public static final lm2 QrzZRwfaDlRX;
    public static final /* synthetic */ int ZbWwgt3aGe7A = 0;
    public static final f50 cpQdD2nAriOS;
    public static final f50 wdg6QnbFHrFF;
    public static final Object lS5Rgt96tfkO = new Object();
    public static final ly TSizfFm2Yiuu = new ly(1.0f, 1.0f);
    public static final gs2 Y1f8riQaR6yg = new gs2(0.31006f, 0.31616f);
    public static final gs2 e9gEMXR7LXtO = new gs2(0.34567f, 0.3585f);
    public static final gs2 a92UlCVFR9N8 = new gs2(0.32168f, 0.33767f);
    public static final gs2 RAsUl2FVSrh6 = new gs2(0.31271f, 0.32902f);
    public static final float[] rtx2ld2ELZv4 = {0.964212f, 1.0f, 0.825188f};
    public static final StackTraceElement[] dgRBjINgWbAK = new StackTraceElement[0];
    public static final gk0 x50lh2ztY7Y5 = new gk0(2);
    public static final StackTraceElement[] r3s1LDPKFs1S = new StackTraceElement[0];
    public static final lm2 gPXPFXrUH4XX = new lm2(new uk2(4), new uk2(5));
    public static final lm2 BRwzKIf41E4i = new lm2(new uk2(6), new uk2(7));
    public static final lm2 XL4ISE6Oc65B = new lm2(new uk2(8), new uk2(9));
    public static final lm2 RfyTYNmI9Srp = new lm2(new uk2(10), new uk2(11));
    public static final lm2 EcgxDIVH5in8 = new lm2(new uk2(12), new uk2(13));
    public static final lm2 S9EYkSpbGuxq = new lm2(new uk2(14), new uk2(15));
    public static final lm2 VhhvGxCb8gfr = new lm2(new uk2(16), new uk2(17));
    public static final lm2 S2OOm9zPNm0h = new lm2(new uk2(18), new uk2(19));

    static {
        int i = 1;
        PxuCJdSBwIXG = new f50("RESUME_TOKEN", i);
        int i2 = 3;
        OPXfSBeufaJ8 = new k5(i2);
        wdg6QnbFHrFF = new f50("NO_OWNER", i);
        cpQdD2nAriOS = new f50("NO_VALUE", i);
        QrzZRwfaDlRX = new lm2(new uk2(i2), new uk2(20));
    }

    public static final void BjEWd04qc7Mw(final n61 n61Var, final z42 z42Var, final li liVar, final mi miVar, final le leVar, on onVar, hp hpVar, final int i) {
        on onVar2;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(1359693790);
        int i2 = i | (tf0Var.a92UlCVFR9N8(liVar) ? 256 : 128) | (tf0Var.a92UlCVFR9N8(miVar) ? 2048 : 1024) | (tf0Var.a92UlCVFR9N8(leVar) ? 16384 : 8192);
        int i3 = 1;
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (74899 & i2) != 74898)) {
            tf0Var.wLFCmsViZrNT();
            if ((i & 1) != 0 && !tf0Var.pnx5pC0XzaCw()) {
                tf0Var.i68hK7ahKtgp();
            }
            tf0Var.BRwzKIf41E4i();
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            long j = liVar.PxuCJdSBwIXG;
            long j2 = liVar.lS5Rgt96tfkO;
            float f = miVar.PxuCJdSBwIXG;
            tf0Var.IXK6ba3ucyzm(-1763481333);
            tf0Var.IXK6ba3ucyzm(167751211);
            Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
            hp.Companion.getClass();
            if (nLZGh9p8gVSu == fp.lS5Rgt96tfkO) {
                nLZGh9p8gVSu = sj0.tmVwIGCQF4zR(new k10(f));
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
            }
            tf0Var.gPXPFXrUH4XX(false);
            tf0Var.gPXPFXrUH4XX(false);
            float f2 = ((k10) ((d91) nLZGh9p8gVSu).getValue()).rtx2ld2ELZv4;
            onVar2 = onVar;
            on kpCQ9veP6n3I = bs0.kpCQ9veP6n3I(-97109725, new tg(i3, onVar2), tf0Var);
            fq fqVar = ec2.PxuCJdSBwIXG;
            float f3 = ((k10) tf0Var.wdg6QnbFHrFF(fqVar)).rtx2ld2ELZv4 + 0.0f;
            zv.TSizfFm2Yiuu(new ir1[]{zr.PxuCJdSBwIXG.PxuCJdSBwIXG(new hl(j2)), fqVar.PxuCJdSBwIXG(new k10(f3))}, bs0.kpCQ9veP6n3I(421772006, new cc2(n61Var, z42Var, j, f3, leVar, f2, kpCQ9veP6n3I), tf0Var), tf0Var, 56);
        } else {
            onVar2 = onVar;
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            final on onVar3 = onVar2;
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new pe0(z42Var, liVar, miVar, leVar, onVar3, i) { // from class: ni
                public final /* synthetic */ z42 OPXfSBeufaJ8;
                public final /* synthetic */ on cpQdD2nAriOS;
                public final /* synthetic */ mi dgRBjINgWbAK;
                public final /* synthetic */ li wdg6QnbFHrFF;
                public final /* synthetic */ le x50lh2ztY7Y5;

                @Override // defpackage.pe0
                public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int bEKsvqmvPh2y = ki0.bEKsvqmvPh2y(196663);
                    b51.BjEWd04qc7Mw(n61.this, this.OPXfSBeufaJ8, this.wdg6QnbFHrFF, this.dgRBjINgWbAK, this.x50lh2ztY7Y5, this.cpQdD2nAriOS, (hp) obj, bEKsvqmvPh2y);
                    return no2.PxuCJdSBwIXG;
                }
            };
        }
    }

    public static final void EpkonXwzFgDB(twy4zb2fCtqq twy4zb2fctqq, d32 d32Var) {
        if (mm2.gPXPFXrUH4XX(d32Var)) {
            Object RAsUl2FVSrh62 = d32Var.Y1f8riQaR6yg.rtx2ld2ELZv4.RAsUl2FVSrh6(y22.OPXfSBeufaJ8);
            if (RAsUl2FVSrh62 == null) {
                RAsUl2FVSrh62 = null;
            }
            nxJAScVArhE9 nxjascvarhe9 = (nxJAScVArhE9) RAsUl2FVSrh62;
            if (nxjascvarhe9 != null) {
                twy4zb2fctqq.PxuCJdSBwIXG(new cJeY36nTk9tz(null, R.id.accessibilityActionSetProgress, nxjascvarhe9.PxuCJdSBwIXG, null));
            }
        }
    }

    public static int IXK6ba3ucyzm(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        u9.XL4ISE6Oc65B("Cannot round NaN value.");
        return 0;
    }

    public static final void J54yh1s3n4Aq(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static long JHNfcAUfKc4G(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        u9.XL4ISE6Oc65B("Cannot round NaN value.");
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [as1, to] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList KUoIVIumpKat(z62 z62Var, int i, Integer num) {
        Object obj;
        ?? as1Var = new as1(z62Var);
        int BRwzKIf41E4i2 = z62Var.BRwzKIf41E4i(i);
        nf0 PxuCJdSBwIXG2 = z62Var.PxuCJdSBwIXG(i);
        while (i >= 0) {
            if (z62Var.dgRBjINgWbAK(i)) {
                obj = z62Var.gPXPFXrUH4XX(z62Var.lS5Rgt96tfkO, i);
            } else {
                hp.Companion.getClass();
                obj = fp.lS5Rgt96tfkO;
            }
            as1Var.RAsUl2FVSrh6(z62Var.OPXfSBeufaJ8(i), obj, z62Var.PxuCJdSBwIXG.a92UlCVFR9N8(i), num);
            if (BRwzKIf41E4i2 >= 0) {
                nf0 nf0Var = PxuCJdSBwIXG2;
                PxuCJdSBwIXG2 = z62Var.PxuCJdSBwIXG(BRwzKIf41E4i2);
                i = BRwzKIf41E4i2;
                BRwzKIf41E4i2 = z62Var.BRwzKIf41E4i(BRwzKIf41E4i2);
                num = nf0Var;
            } else {
                i = BRwzKIf41E4i2;
                num = PxuCJdSBwIXG2;
            }
        }
        return (ArrayList) as1Var.PxuCJdSBwIXG;
    }

    public static final boolean POWyO8hTM6YC(qt1 qt1Var, float f, float f2) {
        float f3 = qt1Var.PxuCJdSBwIXG;
        if (f > qt1Var.TSizfFm2Yiuu || f3 > f) {
            return false;
        }
        return f2 <= qt1Var.Y1f8riQaR6yg && qt1Var.lS5Rgt96tfkO <= f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [as1, to] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [nf0] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List Pf0ThKz3j5YS(e72 e72Var, Integer num, int i, Integer num2) {
        int i2;
        int RfyTYNmI9Srp2;
        Object obj;
        p81 p81Var;
        if (e72Var.S2OOm9zPNm0h || e72Var.gPXPFXrUH4XX() == 0) {
            return p50.rtx2ld2ELZv4;
        }
        ?? as1Var = new as1(e72Var);
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = e72Var.VhhvGxCb8gfr;
            if (i2 < 0) {
                i2 = e72Var.rZjpSjn4zoMv(e72Var.lS5Rgt96tfkO, i);
            }
        }
        if (num == 0) {
            int amuv7NJvPxHu = e72Var.OPXfSBeufaJ8 - e72Var.amuv7NJvPxHu(e72Var.lS5Rgt96tfkO, e72Var.XL4ISE6Oc65B(i));
            c81 c81Var = e72Var.RfyTYNmI9Srp;
            num = Integer.valueOf(amuv7NJvPxHu + ((c81Var == null || (p81Var = (p81) c81Var.lS5Rgt96tfkO(i)) == null) ? 0 : p81Var.lS5Rgt96tfkO));
        }
        int XL4ISE6Oc65B2 = e72Var.XL4ISE6Oc65B(i) * 5;
        int[] iArr = e72Var.lS5Rgt96tfkO;
        if (XL4ISE6Oc65B2 < iArr.length) {
            RfyTYNmI9Srp2 = e72Var.RfyTYNmI9Srp(i);
        } else {
            int rZjpSjn4zoMv = i2 >= 0 ? e72Var.rZjpSjn4zoMv(iArr, i2) : i2;
            RfyTYNmI9Srp2 = e72Var.RfyTYNmI9Srp(i2);
            int i3 = i2;
            i2 = rZjpSjn4zoMv;
            i = i3;
        }
        while (i >= 0) {
            if ((e72Var.lS5Rgt96tfkO[(e72Var.XL4ISE6Oc65B(i) * 5) + 1] & 536870912) != 0) {
                obj = e72Var.EcgxDIVH5in8(i);
            } else {
                hp.Companion.getClass();
                obj = fp.lS5Rgt96tfkO;
            }
            as1Var.RAsUl2FVSrh6(RfyTYNmI9Srp2, obj, e72Var.Pf0ThKz3j5YS(i), num);
            num = e72Var.lS5Rgt96tfkO(i);
            if (i2 >= 0) {
                int rZjpSjn4zoMv2 = e72Var.rZjpSjn4zoMv(e72Var.lS5Rgt96tfkO, i2);
                RfyTYNmI9Srp2 = e72Var.RfyTYNmI9Srp(i2);
                int i4 = i2;
                i2 = rZjpSjn4zoMv2;
                i = i4;
            } else {
                i = i2;
            }
        }
        return (ArrayList) as1Var.PxuCJdSBwIXG;
    }

    public static final Object amuv7NJvPxHu(tx txVar, ae0 ae0Var, ct ctVar) {
        Object obj;
        pd1 i68hK7ahKtgp;
        Object yQRudnv4La6p;
        kd1 kd1Var;
        if (((m61) txVar).rtx2ld2ELZv4.S9EYkSpbGuxq) {
            m61 m61Var = (m61) txVar;
            if (!m61Var.rtx2ld2ELZv4.S9EYkSpbGuxq) {
                ep0.lS5Rgt96tfkO("visitAncestors called on an unattached node");
            }
            m61 m61Var2 = m61Var.rtx2ld2ELZv4.x50lh2ztY7Y5;
            vw0 zf8DYfih6EZu = zv.zf8DYfih6EZu(txVar);
            loop0: while (true) {
                obj = null;
                if (zf8DYfih6EZu == null) {
                    break;
                }
                if ((zf8DYfih6EZu.nLZGh9p8gVSu.a92UlCVFR9N8.dgRBjINgWbAK & 524288) != 0) {
                    while (m61Var2 != null) {
                        if ((m61Var2.wdg6QnbFHrFF & 524288) != 0) {
                            m61 m61Var3 = m61Var2;
                            f91 f91Var = null;
                            while (m61Var3 != null) {
                                if (m61Var3 instanceof df) {
                                    obj = m61Var3;
                                    break loop0;
                                }
                                if ((m61Var3.wdg6QnbFHrFF & 524288) != 0 && (m61Var3 instanceof ux)) {
                                    int i = 0;
                                    for (m61 m61Var4 = ((ux) m61Var3).S2OOm9zPNm0h; m61Var4 != null; m61Var4 = m61Var4.cpQdD2nAriOS) {
                                        if ((m61Var4.wdg6QnbFHrFF & 524288) != 0) {
                                            i++;
                                            if (i == 1) {
                                                m61Var3 = m61Var4;
                                            } else {
                                                if (f91Var == null) {
                                                    f91Var = new f91(new m61[16]);
                                                }
                                                if (m61Var3 != null) {
                                                    f91Var.lS5Rgt96tfkO(m61Var3);
                                                    m61Var3 = null;
                                                }
                                                f91Var.lS5Rgt96tfkO(m61Var4);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                m61Var3 = zv.dgRBjINgWbAK(f91Var);
                            }
                        }
                        m61Var2 = m61Var2.x50lh2ztY7Y5;
                    }
                }
                zf8DYfih6EZu = zf8DYfih6EZu.S9EYkSpbGuxq();
                m61Var2 = (zf8DYfih6EZu == null || (kd1Var = zf8DYfih6EZu.nLZGh9p8gVSu) == null) ? null : kd1Var.e9gEMXR7LXtO;
            }
            df dfVar = (df) obj;
            if (dfVar != null && (yQRudnv4La6p = dfVar.yQRudnv4La6p((i68hK7ahKtgp = zv.i68hK7ahKtgp(txVar)), new i1(2, ae0Var, i68hK7ahKtgp), ctVar)) == su.rtx2ld2ELZv4) {
                return yQRudnv4La6p;
            }
        }
        return no2.PxuCJdSBwIXG;
    }

    public static final void bEKsvqmvPh2y(twy4zb2fCtqq twy4zb2fctqq, d32 d32Var) {
        Object RAsUl2FVSrh62 = d32Var.dgRBjINgWbAK().rtx2ld2ELZv4.RAsUl2FVSrh6(h32.RAsUl2FVSrh6);
        if (RAsUl2FVSrh62 == null) {
            RAsUl2FVSrh62 = null;
        }
        if (RAsUl2FVSrh62 != null) {
            u9.VhhvGxCb8gfr();
            return;
        }
        d32 x50lh2ztY7Y52 = d32Var.x50lh2ztY7Y5();
        if (x50lh2ztY7Y52 == null) {
            return;
        }
        Object RAsUl2FVSrh63 = x50lh2ztY7Y52.dgRBjINgWbAK().rtx2ld2ELZv4.RAsUl2FVSrh6(h32.e9gEMXR7LXtO);
        if (RAsUl2FVSrh63 == null) {
            RAsUl2FVSrh63 = null;
        }
        if (RAsUl2FVSrh63 != null) {
            Object RAsUl2FVSrh64 = x50lh2ztY7Y52.dgRBjINgWbAK().rtx2ld2ELZv4.RAsUl2FVSrh6(h32.a92UlCVFR9N8);
            wk wkVar = (wk) (RAsUl2FVSrh64 != null ? RAsUl2FVSrh64 : null);
            if (wkVar == null || (wkVar.PxuCJdSBwIXG >= 0 && wkVar.lS5Rgt96tfkO >= 0)) {
                if (d32Var.dgRBjINgWbAK().rtx2ld2ELZv4.TSizfFm2Yiuu(h32.EpkonXwzFgDB)) {
                    ArrayList arrayList = new ArrayList();
                    List wdg6QnbFHrFF2 = d32.wdg6QnbFHrFF(4, x50lh2ztY7Y52);
                    int size = wdg6QnbFHrFF2.size();
                    int i = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        d32 d32Var2 = (d32) wdg6QnbFHrFF2.get(i2);
                        if (d32Var2.dgRBjINgWbAK().rtx2ld2ELZv4.TSizfFm2Yiuu(h32.EpkonXwzFgDB)) {
                            arrayList.add(d32Var2);
                            if (d32Var2.TSizfFm2Yiuu.VhhvGxCb8gfr() < d32Var.TSizfFm2Yiuu.VhhvGxCb8gfr()) {
                                i++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean gGoUzNp9JO5I = gGoUzNp9JO5I(arrayList);
                    int i3 = gGoUzNp9JO5I ? 0 : i;
                    int i4 = gGoUzNp9JO5I ? i : 0;
                    Object RAsUl2FVSrh65 = d32Var.dgRBjINgWbAK().rtx2ld2ELZv4.RAsUl2FVSrh6(h32.EpkonXwzFgDB);
                    if (RAsUl2FVSrh65 == null) {
                        RAsUl2FVSrh65 = Boolean.FALSE;
                    }
                    twy4zb2fctqq.PxuCJdSBwIXG.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i3, 1, i4, 1, false, ((Boolean) RAsUl2FVSrh65).booleanValue()));
                }
            }
        }
    }

    public static final boolean gGoUzNp9JO5I(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = p50.rtx2ld2ELZv4;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i = 0;
                while (i < size) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    d32 d32Var = (d32) obj2;
                    d32 d32Var2 = (d32) obj;
                    float abs = Math.abs(Float.intBitsToFloat((int) (d32Var2.RAsUl2FVSrh6().lS5Rgt96tfkO() >> 32)) - Float.intBitsToFloat((int) (d32Var.RAsUl2FVSrh6().lS5Rgt96tfkO() >> 32)));
                    float abs2 = Math.abs(Float.intBitsToFloat((int) (d32Var2.RAsUl2FVSrh6().lS5Rgt96tfkO() & 4294967295L)) - Float.intBitsToFloat((int) (d32Var.RAsUl2FVSrh6().lS5Rgt96tfkO() & 4294967295L)));
                    arrayList2.add(new bf1((Float.floatToRawIntBits(abs) << 32) | (Float.floatToRawIntBits(abs2) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((bf1) zk.MDTGUQSX7PXD(list)).PxuCJdSBwIXG;
            } else {
                if (list.isEmpty()) {
                    c21.TSizfFm2Yiuu("Empty collection can't be reduced.");
                }
                Object MDTGUQSX7PXD = zk.MDTGUQSX7PXD(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i2 = 1;
                    while (true) {
                        MDTGUQSX7PXD = new bf1(bf1.e9gEMXR7LXtO(((bf1) MDTGUQSX7PXD).PxuCJdSBwIXG, ((bf1) list.get(i2)).PxuCJdSBwIXG));
                        if (i2 == size2) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((bf1) MDTGUQSX7PXD).PxuCJdSBwIXG;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x022c, code lost:
    
        if (r2 == r14) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x024d, code lost:
    
        if (r4 == r14) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02bb, code lost:
    
        if (r2 == r14) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ac, code lost:
    
        if (r5 == r14) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c9, code lost:
    
        if (r15 == r14) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f7, code lost:
    
        if (r2 == r14) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void kpCQ9veP6n3I(gl2 gl2Var, n61 n61Var, le0 le0Var, s sVar, le0 le0Var2, on onVar, hp hpVar, int i) {
        int i2;
        le0 le0Var3;
        tf0 tf0Var;
        Object obj;
        to toVar;
        y7 y7Var;
        d82 d82Var;
        y7 y7Var2;
        n61 n61Var2;
        cl2 cl2Var;
        le0 le0Var4 = le0Var;
        tf0 tf0Var2 = (tf0) hpVar;
        tf0Var2.JHNfcAUfKc4G(511725103);
        if ((i & 6) == 0) {
            i2 = (tf0Var2.a92UlCVFR9N8(gl2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tf0Var2.a92UlCVFR9N8(n61Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tf0Var2.rtx2ld2ELZv4(le0Var4) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tf0Var2.a92UlCVFR9N8(sVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tf0Var2.rtx2ld2ELZv4(le0Var2) ? 16384 : 8192;
        }
        on onVar2 = onVar;
        if ((196608 & i) == 0) {
            i2 |= tf0Var2.rtx2ld2ELZv4(onVar2) ? 131072 : 65536;
        }
        if (tf0Var2.Pf0ThKz3j5YS(i2 & 1, (74899 & i2) != 74898)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object nLZGh9p8gVSu = tf0Var2.nLZGh9p8gVSu();
            Object obj2 = fp.lS5Rgt96tfkO;
            if (!z) {
                hp.Companion.getClass();
            }
            nLZGh9p8gVSu = new y7(gl2Var, sVar);
            tf0Var2.JTxCbbCwomzt(nLZGh9p8gVSu);
            y7 y7Var3 = (y7) nLZGh9p8gVSu;
            boolean z2 = i3 == 4;
            Object nLZGh9p8gVSu2 = tf0Var2.nLZGh9p8gVSu();
            if (!z2) {
                hp.Companion.getClass();
                obj = nLZGh9p8gVSu2;
            }
            Object[] objArr = {gl2Var.PxuCJdSBwIXG.a92UlCVFR9N8()};
            d82 d82Var2 = new d82();
            d82Var2.addAll(na.OYiFbU3x63rc(objArr));
            tf0Var2.JTxCbbCwomzt(d82Var2);
            obj = d82Var2;
            d82 d82Var3 = (d82) obj;
            boolean z3 = i3 == 4;
            Object nLZGh9p8gVSu3 = tf0Var2.nLZGh9p8gVSu();
            if (!z3) {
                hp.Companion.getClass();
            }
            long[] jArr = c02.PxuCJdSBwIXG;
            nLZGh9p8gVSu3 = new v81();
            tf0Var2.JTxCbbCwomzt(nLZGh9p8gVSu3);
            v81 v81Var = (v81) nLZGh9p8gVSu3;
            to toVar2 = gl2Var.PxuCJdSBwIXG;
            mj1 mj1Var = gl2Var.Y1f8riQaR6yg;
            if (!d82Var3.contains(toVar2.a92UlCVFR9N8())) {
                d82Var3.clear();
                d82Var3.add(toVar2.a92UlCVFR9N8());
            }
            if (cs0.wdg6QnbFHrFF(toVar2.a92UlCVFR9N8(), mj1Var.getValue())) {
                if (d82Var3.size() != 1 || !cs0.wdg6QnbFHrFF(d82Var3.get(0), toVar2.a92UlCVFR9N8())) {
                    d82Var3.clear();
                    d82Var3.add(toVar2.a92UlCVFR9N8());
                }
                if (v81Var.e9gEMXR7LXtO != 1 || v81Var.TSizfFm2Yiuu(toVar2.a92UlCVFR9N8())) {
                    v81Var.PxuCJdSBwIXG();
                }
                y7Var3.lS5Rgt96tfkO = sVar;
            }
            if (cs0.wdg6QnbFHrFF(toVar2.a92UlCVFR9N8(), mj1Var.getValue()) || d82Var3.contains(mj1Var.getValue())) {
                toVar = toVar2;
            } else {
                ListIterator listIterator = d82Var3.listIterator();
                int i4 = 0;
                while (true) {
                    xj0 xj0Var = (xj0) listIterator;
                    toVar = toVar2;
                    if (!xj0Var.hasNext()) {
                        i4 = -1;
                        break;
                    } else {
                        if (cs0.wdg6QnbFHrFF(le0Var2.OPXfSBeufaJ8(xj0Var.next()), le0Var2.OPXfSBeufaJ8(mj1Var.getValue()))) {
                            break;
                        }
                        i4++;
                        toVar2 = toVar;
                    }
                }
                if (i4 == -1) {
                    d82Var3.add(mj1Var.getValue());
                } else {
                    d82Var3.set(i4, mj1Var.getValue());
                }
            }
            if (v81Var.TSizfFm2Yiuu(mj1Var.getValue()) && v81Var.TSizfFm2Yiuu(toVar.a92UlCVFR9N8())) {
                tf0Var2.IXK6ba3ucyzm(1968995539);
                tf0Var2.gPXPFXrUH4XX(false);
                le0Var3 = le0Var4;
                y7Var = y7Var3;
            } else {
                tf0Var2.IXK6ba3ucyzm(1966410449);
                v81Var.PxuCJdSBwIXG();
                int size = d82Var3.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj3 = d82Var3.get(i5);
                    v81Var.cpQdD2nAriOS(obj3, bs0.kpCQ9veP6n3I(-23915175, new n7(gl2Var, obj3, le0Var4, y7Var3, d82Var3, onVar2), tf0Var2));
                    i5++;
                    le0Var4 = le0Var4;
                    onVar2 = onVar;
                }
                le0Var3 = le0Var4;
                y7Var = y7Var3;
                tf0Var2.gPXPFXrUH4XX(false);
            }
            boolean a92UlCVFR9N82 = tf0Var2.a92UlCVFR9N8(gl2Var.a92UlCVFR9N8()) | tf0Var2.a92UlCVFR9N8(y7Var);
            Object nLZGh9p8gVSu4 = tf0Var2.nLZGh9p8gVSu();
            if (!a92UlCVFR9N82) {
                hp.Companion.getClass();
            }
            nLZGh9p8gVSu4 = (is) le0Var3.OPXfSBeufaJ8(y7Var);
            tf0Var2.JTxCbbCwomzt(nLZGh9p8gVSu4);
            is isVar = (is) nLZGh9p8gVSu4;
            gl2 gl2Var2 = y7Var.PxuCJdSBwIXG;
            gg1 gg1Var2 = mp.PxuCJdSBwIXG;
            boolean a92UlCVFR9N83 = tf0Var2.a92UlCVFR9N8(y7Var);
            Object nLZGh9p8gVSu5 = tf0Var2.nLZGh9p8gVSu();
            if (!a92UlCVFR9N83) {
                hp.Companion.getClass();
            }
            nLZGh9p8gVSu5 = sj0.tmVwIGCQF4zR(Boolean.FALSE);
            tf0Var2.JTxCbbCwomzt(nLZGh9p8gVSu5);
            d91 d91Var = (d91) nLZGh9p8gVSu5;
            d91 Pf0ThKz3j5YS = sj0.Pf0ThKz3j5YS(isVar.Y1f8riQaR6yg, tf0Var2);
            if (cs0.wdg6QnbFHrFF(gl2Var2.PxuCJdSBwIXG.a92UlCVFR9N8(), gl2Var2.Y1f8riQaR6yg.getValue())) {
                d91Var.setValue(Boolean.FALSE);
            } else if (Pf0ThKz3j5YS.getValue() != null) {
                d91Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) d91Var.getValue()).booleanValue()) {
                tf0Var2.IXK6ba3ucyzm(1353077497);
                y7 y7Var4 = y7Var;
                d82Var = d82Var3;
                y7Var2 = y7Var4;
                tf0Var = tf0Var2;
                cl2Var = bs0.r3s1LDPKFs1S(y7Var4.PxuCJdSBwIXG, VhhvGxCb8gfr, null, tf0Var, 0, 2);
                boolean a92UlCVFR9N84 = tf0Var.a92UlCVFR9N8(cl2Var);
                Object nLZGh9p8gVSu6 = tf0Var.nLZGh9p8gVSu();
                if (!a92UlCVFR9N84) {
                    hp.Companion.getClass();
                }
                nLZGh9p8gVSu6 = hq0.XL4ISE6Oc65B(n61.Companion);
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu6);
                n61Var2 = (n61) nLZGh9p8gVSu6;
                tf0Var.gPXPFXrUH4XX(false);
            } else {
                d82Var = d82Var3;
                tf0Var = tf0Var2;
                y7Var2 = y7Var;
                tf0Var.IXK6ba3ucyzm(1353343539);
                tf0Var.gPXPFXrUH4XX(false);
                n61Var2 = n61.Companion;
                cl2Var = null;
            }
            n61 TSizfFm2Yiuu2 = n61Var.TSizfFm2Yiuu(n61Var2.TSizfFm2Yiuu(new u7(cl2Var, Pf0ThKz3j5YS, y7Var2)));
            Object nLZGh9p8gVSu7 = tf0Var.nLZGh9p8gVSu();
            hp.Companion.getClass();
            if (nLZGh9p8gVSu7 == obj2) {
                nLZGh9p8gVSu7 = new r7(y7Var2);
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu7);
            }
            r7 r7Var = (r7) nLZGh9p8gVSu7;
            int hashCode = Long.hashCode(tf0Var.wLFCmsViZrNT);
            il1 x50lh2ztY7Y52 = tf0Var.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj = ov2.xfACYKDMU6Dj(tf0Var, TSizfFm2Yiuu2);
            yo.Companion.getClass();
            ae0 ae0Var = xo.lS5Rgt96tfkO;
            tf0Var.ngxnMNrpiKat();
            if (tf0Var.zf8DYfih6EZu) {
                tf0Var.dgRBjINgWbAK(ae0Var);
            } else {
                tf0Var.hVNtCUZb4tYH();
            }
            th0.tmVwIGCQF4zR(tf0Var, xo.a92UlCVFR9N8, r7Var);
            th0.tmVwIGCQF4zR(tf0Var, xo.e9gEMXR7LXtO, x50lh2ztY7Y52);
            Object valueOf = Integer.valueOf(hashCode);
            pe0 pe0Var = xo.RAsUl2FVSrh6;
            if (tf0Var.zf8DYfih6EZu) {
                tf0Var.lS5Rgt96tfkO(pe0Var, valueOf);
            }
            th0.kpCQ9veP6n3I(tf0Var, xo.rtx2ld2ELZv4);
            th0.tmVwIGCQF4zR(tf0Var, xo.Y1f8riQaR6yg, xfACYKDMU6Dj);
            tf0Var.IXK6ba3ucyzm(-860173498);
            int size2 = d82Var.size();
            int i6 = 0;
            while (i6 < size2) {
                d82 d82Var4 = d82Var;
                Object obj4 = d82Var4.get(i6);
                Object OPXfSBeufaJ82 = le0Var2.OPXfSBeufaJ8(obj4);
                hi0.Companion.getClass();
                tf0Var.zf8DYfih6EZu(-2026002954, 0, OPXfSBeufaJ82, null);
                pe0 pe0Var2 = (pe0) v81Var.RAsUl2FVSrh6(obj4);
                if (pe0Var2 == null) {
                    tf0Var.IXK6ba3ucyzm(1618454323);
                } else {
                    tf0Var.IXK6ba3ucyzm(-2026001778);
                    pe0Var2.rtx2ld2ELZv4(tf0Var, 0);
                }
                tf0Var.gPXPFXrUH4XX(false);
                tf0Var.gPXPFXrUH4XX(false);
                i6++;
                d82Var = d82Var4;
            }
            tf0Var.gPXPFXrUH4XX(false);
            tf0Var.gPXPFXrUH4XX(true);
            gg1 gg1Var3 = mp.PxuCJdSBwIXG;
        } else {
            le0Var3 = le0Var4;
            tf0Var = tf0Var2;
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new o7(gl2Var, n61Var, le0Var3, sVar, le0Var2, onVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005a -> B:10:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object nLZGh9p8gVSu(oc2 oc2Var, rn1 rn1Var, nc ncVar) {
        ad0 ad0Var;
        int i;
        su suVar;
        int size;
        int i2;
        if (ncVar instanceof ad0) {
            ad0Var = (ad0) ncVar;
            int i3 = ad0Var.r3s1LDPKFs1S;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ad0Var.r3s1LDPKFs1S = i3 - Integer.MIN_VALUE;
                Object obj = ad0Var.cpQdD2nAriOS;
                i = ad0Var.r3s1LDPKFs1S;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    List list = oc2Var.cpQdD2nAriOS.IAToe7bXGz4N.PxuCJdSBwIXG;
                    int size2 = list.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        if (((ao1) list.get(i4)).Y1f8riQaR6yg) {
                            ad0Var.dgRBjINgWbAK = oc2Var;
                            ad0Var.x50lh2ztY7Y5 = rn1Var;
                            ad0Var.r3s1LDPKFs1S = 1;
                            obj = oc2Var.PxuCJdSBwIXG(rn1Var, ad0Var);
                            suVar = su.rtx2ld2ELZv4;
                            if (obj == suVar) {
                            }
                            List list2 = ((qn1) obj).PxuCJdSBwIXG;
                            size = list2.size();
                            i2 = 0;
                            while (i2 < size) {
                            }
                            return no2.PxuCJdSBwIXG;
                        }
                    }
                    return no2.PxuCJdSBwIXG;
                }
                if (i != 1) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rn1 rn1Var2 = ad0Var.x50lh2ztY7Y5;
                oc2 oc2Var2 = ad0Var.dgRBjINgWbAK;
                ng0.tmVwIGCQF4zR(obj);
                rn1Var = rn1Var2;
                oc2Var = oc2Var2;
                List list22 = ((qn1) obj).PxuCJdSBwIXG;
                size = list22.size();
                i2 = 0;
                while (i2 < size) {
                    if (((ao1) list22.get(i2)).Y1f8riQaR6yg) {
                        ad0Var.dgRBjINgWbAK = oc2Var;
                        ad0Var.x50lh2ztY7Y5 = rn1Var;
                        ad0Var.r3s1LDPKFs1S = 1;
                        obj = oc2Var.PxuCJdSBwIXG(rn1Var, ad0Var);
                        suVar = su.rtx2ld2ELZv4;
                        if (obj == suVar) {
                            return suVar;
                        }
                        List list222 = ((qn1) obj).PxuCJdSBwIXG;
                        size = list222.size();
                        i2 = 0;
                        while (i2 < size) {
                        }
                    } else {
                        i2++;
                    }
                }
                return no2.PxuCJdSBwIXG;
            }
        }
        ad0Var = new ad0(ncVar);
        Object obj2 = ad0Var.cpQdD2nAriOS;
        i = ad0Var.r3s1LDPKFs1S;
        if (i != 0) {
        }
    }

    public static w82 ngxnMNrpiKat(float f, float f2, Object obj, int i) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new w82(f, f2, obj);
    }

    public static final n61 nxJAScVArhE9(n61 n61Var, le0 le0Var) {
        return n61Var.TSizfFm2Yiuu(new da0(le0Var));
    }

    public static final void ozEBbv0hFTAB(String str, String str2, String str3, n61 n61Var, hp hpVar, int i) {
        n61 n61Var2;
        str.getClass();
        str2.getClass();
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(-137306926);
        int i2 = i | (tf0Var.a92UlCVFR9N8(str) ? 4 : 2) | (tf0Var.a92UlCVFR9N8(str2) ? 32 : 16) | 3072;
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 1171) != 1170)) {
            k61 k61Var = n61.Companion;
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            n61 BRwzKIf41E4i2 = hq0.BRwzKIf41E4i(f2.rZjpSjn4zoMv(c62.lS5Rgt96tfkO(k61Var, 1.0f), 0.0f, 40.0f, 0.0f, 0.0f, 13), n9.PxuCJdSBwIXG);
            long j = ki0.aF05bpZJlKEP(tf0Var).a92UlCVFR9N8;
            gk0 gk0Var = x50lh2ztY7Y5;
            n61 r3s1LDPKFs1S2 = hq0.r3s1LDPKFs1S(BRwzKIf41E4i2, j, gk0Var);
            s.Companion.getClass();
            j51 Y1f8riQaR6yg2 = xe.Y1f8riQaR6yg(r.lS5Rgt96tfkO, false);
            int hashCode = Long.hashCode(tf0Var.wLFCmsViZrNT);
            il1 x50lh2ztY7Y52 = tf0Var.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj = ov2.xfACYKDMU6Dj(tf0Var, r3s1LDPKFs1S2);
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
            xe.PxuCJdSBwIXG(hq0.r3s1LDPKFs1S(c62.TSizfFm2Yiuu(c62.lS5Rgt96tfkO(jx1.dgRBjINgWbAK.cpQdD2nAriOS(k61Var, r.OPXfSBeufaJ8), 1.0f), 5.0f), hl.lS5Rgt96tfkO(ki0.aF05bpZJlKEP(tf0Var).PxuCJdSBwIXG, 0.2f), gk0Var), tf0Var, 0);
            n61 aF05bpZJlKEP = f2.aF05bpZJlKEP(c62.lS5Rgt96tfkO(k61Var, 1.0f), 24.0f, 32.0f);
            dm PxuCJdSBwIXG2 = bm.PxuCJdSBwIXG(new y9(14.0f, new u9(0)), r.r3s1LDPKFs1S, tf0Var, 54);
            int hashCode2 = Long.hashCode(tf0Var.wLFCmsViZrNT);
            il1 x50lh2ztY7Y53 = tf0Var.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj2 = ov2.xfACYKDMU6Dj(tf0Var, aF05bpZJlKEP);
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
            n61 r3s1LDPKFs1S3 = hq0.r3s1LDPKFs1S(hq0.BRwzKIf41E4i(c62.a92UlCVFR9N8(k61Var, 72.0f), px1.PxuCJdSBwIXG), hl.lS5Rgt96tfkO(ki0.aF05bpZJlKEP(tf0Var).PxuCJdSBwIXG, 0.14f), gk0Var);
            j51 Y1f8riQaR6yg3 = xe.Y1f8riQaR6yg(r.a92UlCVFR9N8, false);
            int hashCode3 = Long.hashCode(tf0Var.wLFCmsViZrNT);
            il1 x50lh2ztY7Y54 = tf0Var.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj3 = ov2.xfACYKDMU6Dj(tf0Var, r3s1LDPKFs1S3);
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
            gi2.lS5Rgt96tfkO(str3, null, ki0.aF05bpZJlKEP(tf0Var).PxuCJdSBwIXG, 0L, 0L, null, 0L, 0, false, 0, 0, ki0.J54yh1s3n4Aq(tf0Var).RAsUl2FVSrh6, tf0Var, 6, 0, 131066);
            tf0Var.gPXPFXrUH4XX(true);
            dj2 dj2Var = ki0.J54yh1s3n4Aq(tf0Var).rtx2ld2ELZv4;
            xc0.Companion.getClass();
            dj2 PxuCJdSBwIXG3 = dj2.PxuCJdSBwIXG(dj2Var, 0L, 0L, xc0.r3s1LDPKFs1S, null, 0L, 0L, null, null, 16777211);
            long j2 = ki0.aF05bpZJlKEP(tf0Var).PxuCJdSBwIXG;
            he2.Companion.getClass();
            gi2.lS5Rgt96tfkO(str, null, j2, 0L, 0L, new he2(3), 0L, 0, false, 0, 0, PxuCJdSBwIXG3, tf0Var, i2 & 14, 0, 130042);
            gi2.lS5Rgt96tfkO(str2, null, hl.lS5Rgt96tfkO(ki0.aF05bpZJlKEP(tf0Var).PxuCJdSBwIXG, 0.75f), 0L, 0L, new he2(3), 0L, 0, false, 0, 0, ki0.J54yh1s3n4Aq(tf0Var).OPXfSBeufaJ8, tf0Var, (i2 >> 3) & 14, 0, 130042);
            tf0Var = tf0Var;
            tf0Var.gPXPFXrUH4XX(true);
            tf0Var.gPXPFXrUH4XX(true);
            n61Var2 = k61Var;
        } else {
            tf0Var.i68hK7ahKtgp();
            n61Var2 = n61Var;
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new bd(str, str2, str3, n61Var2, i);
        }
    }

    public static km2 qudtW7lwm99e(int i, int i2, z30 z30Var) {
        int i3 = (i2 & 2) != 0 ? 0 : 90;
        if ((i2 & 4) != 0) {
            z30Var = a40.PxuCJdSBwIXG;
        }
        return new km2(i, i3, z30Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r5 == r7) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        if (r5 == r7) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d5, code lost:
    
        if (r0 == r7) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f7, code lost:
    
        if (r2 == r7) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x011d, code lost:
    
        if (r0 == r7) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rZjpSjn4zoMv(ae0 ae0Var, hp hpVar, int i) {
        Object obj;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(-361453782);
        int i2 = (tf0Var.rtx2ld2ELZv4(ae0Var) ? 32 : 16) | i;
        int i3 = 0;
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 19) != 18)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            Object PxuCJdSBwIXG2 = g21.PxuCJdSBwIXG(tf0Var);
            if (PxuCJdSBwIXG2 == null) {
                tf0Var.IXK6ba3ucyzm(535274673);
                PxuCJdSBwIXG2 = h21.PxuCJdSBwIXG(tf0Var);
            } else {
                tf0Var.IXK6ba3ucyzm(535271790);
            }
            tf0Var.gPXPFXrUH4XX(false);
            if (PxuCJdSBwIXG2 == null) {
                u9.rtx2ld2ELZv4("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean a92UlCVFR9N82 = tf0Var.a92UlCVFR9N8(PxuCJdSBwIXG2);
            Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
            Object obj2 = fp.lS5Rgt96tfkO;
            if (!a92UlCVFR9N82) {
                hp.Companion.getClass();
            }
            ic1 ic1Var = PxuCJdSBwIXG2 instanceof ic1 ? (ic1) PxuCJdSBwIXG2 : null;
            hc1 PxuCJdSBwIXG3 = ic1Var != null ? ic1Var.PxuCJdSBwIXG() : null;
            vf1 vf1Var = PxuCJdSBwIXG2 instanceof vf1 ? (vf1) PxuCJdSBwIXG2 : null;
            nLZGh9p8gVSu = new cc(PxuCJdSBwIXG3, vf1Var != null ? vf1Var.lS5Rgt96tfkO() : null);
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
            Object obj3 = (cc) nLZGh9p8gVSu;
            long j = tf0Var.wLFCmsViZrNT;
            boolean a92UlCVFR9N83 = tf0Var.a92UlCVFR9N8(obj3) | tf0Var.e9gEMXR7LXtO(j);
            Object nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
            int i4 = 4;
            if (!a92UlCVFR9N83) {
                hp.Companion.getClass();
                obj = nLZGh9p8gVSu2;
            }
            zn znVar = new zn(new dc(j, PxuCJdSBwIXG2));
            znVar.TSizfFm2Yiuu = new kb(i4);
            tf0Var.JTxCbbCwomzt(znVar);
            obj = znVar;
            Object obj4 = (zn) obj;
            tf0Var.IXK6ba3ucyzm(-585307852);
            boolean rtx2ld2ELZv42 = ((i2 & 112) == 32) | tf0Var.rtx2ld2ELZv4(obj4);
            Object nLZGh9p8gVSu3 = tf0Var.nLZGh9p8gVSu();
            int i5 = 2;
            if (!rtx2ld2ELZv42) {
                hp.Companion.getClass();
            }
            nLZGh9p8gVSu3 = new e6(i5, obj4, ae0Var);
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu3);
            mm2.r3s1LDPKFs1S((ae0) nLZGh9p8gVSu3, tf0Var);
            boolean rtx2ld2ELZv43 = tf0Var.rtx2ld2ELZv4(obj4);
            Object nLZGh9p8gVSu4 = tf0Var.nLZGh9p8gVSu();
            if (!rtx2ld2ELZv43) {
                hp.Companion.getClass();
            }
            nLZGh9p8gVSu4 = new r3s1LDPKFs1S(i4, obj4);
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu4);
            vi0.lS5Rgt96tfkO(true, obj4, null, (le0) nLZGh9p8gVSu4, tf0Var, 6);
            boolean rtx2ld2ELZv44 = tf0Var.rtx2ld2ELZv4(obj3) | tf0Var.rtx2ld2ELZv4(obj4);
            Object nLZGh9p8gVSu5 = tf0Var.nLZGh9p8gVSu();
            if (!rtx2ld2ELZv44) {
                hp.Companion.getClass();
            }
            nLZGh9p8gVSu5 = new e9gEMXR7LXtO(i5, obj3, obj4);
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu5);
            mm2.OPXfSBeufaJ8(obj3, obj4, (le0) nLZGh9p8gVSu5, tf0Var);
            tf0Var.gPXPFXrUH4XX(false);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new ec(ae0Var, i, i3);
        }
    }

    public static final Object ryVscX7ZL4Ux(eo1 eo1Var, pe0 pe0Var, bt btVar) {
        Object W7ceZOzvrRuI = ((pc2) eo1Var).W7ceZOzvrRuI(new bd0(btVar.e9gEMXR7LXtO(), pe0Var, null, 0), btVar);
        return W7ceZOzvrRuI == su.rtx2ld2ELZv4 ? W7ceZOzvrRuI : no2.PxuCJdSBwIXG;
    }

    public static h52 tmVwIGCQF4zR(int i, ag agVar) {
        int i2 = (i & 1) != 0 ? 0 : 1;
        int i3 = (i & 2) == 0 ? 16 : 0;
        if (i2 <= 0 && i3 <= 0 && agVar != ag.rtx2ld2ELZv4) {
            rc1.x50lh2ztY7Y5(agVar, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
            return null;
        }
        int i4 = i3 + i2;
        if (i4 < 0) {
            i4 = Integer.MAX_VALUE;
        }
        return new h52(i2, i4, agVar);
    }

    public static final eu0 wLFCmsViZrNT(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (serialDescriptor instanceof ns) {
            return ((ns) serialDescriptor).lS5Rgt96tfkO;
        }
        if (serialDescriptor instanceof c42) {
            return wLFCmsViZrNT(((c42) serialDescriptor).PxuCJdSBwIXG);
        }
        return null;
    }

    public static so0 xbgXKYA2cIfu(km2 km2Var) {
        f92.Companion.getClass();
        return new so0(km2Var);
    }

    public static final Bitmap xfACYKDMU6Dj(ym0 ym0Var) {
        if (ym0Var instanceof w3) {
            return ((w3) ym0Var).PxuCJdSBwIXG;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final Bitmap.Config yQRudnv4La6p(int i) {
        Bitmap.Config config;
        Bitmap.Config config2;
        an0.Companion.getClass();
        if (i == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && i == 3) {
            config2 = Bitmap.Config.RGBA_F16;
            return config2;
        }
        if (i2 < 26 || i != 4) {
            return Bitmap.Config.ARGB_8888;
        }
        config = Bitmap.Config.HARDWARE;
        return config;
    }

    public static final Integer zf8DYfih6EZu(z62 z62Var, up upVar, int i, int i2) {
        Integer zf8DYfih6EZu;
        int[] iArr = z62Var.lS5Rgt96tfkO;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int i3 = iArr[(i * 5) + 3] + i;
            if (z62Var.wdg6QnbFHrFF(i) && z62Var.OPXfSBeufaJ8(i) == 206 && cs0.wdg6QnbFHrFF(z62Var.gPXPFXrUH4XX(iArr, i), mp.e9gEMXR7LXtO)) {
                Object rtx2ld2ELZv42 = z62Var.rtx2ld2ELZv4(i, 0);
                yf0 yf0Var = rtx2ld2ELZv42 instanceof yf0 ? (yf0) rtx2ld2ELZv42 : null;
                Object obj = yf0Var != null ? yf0Var.PxuCJdSBwIXG : null;
                qf0 qf0Var = obj instanceof qf0 ? (qf0) obj : null;
                if (qf0Var != null && qf0Var.rtx2ld2ELZv4 == upVar) {
                    return Integer.valueOf(i);
                }
            }
            if (z62Var.Y1f8riQaR6yg(i) && (zf8DYfih6EZu = zf8DYfih6EZu(z62Var, upVar, i + 1, i3)) != null) {
                return Integer.valueOf(zf8DYfih6EZu.intValue());
            }
            i = i3;
        }
    }

    @Override // defpackage.op
    public float BRwzKIf41E4i(aq1 aq1Var, int i) {
        aq1Var.getClass();
        return jyegZNwi31qc();
    }

    @Override // defpackage.op
    public Object EcgxDIVH5in8(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        serialDescriptor.getClass();
        kSerializer.getClass();
        return x50lh2ztY7Y5(kSerializer);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public short IAToe7bXGz4N() {
        Object i68hK7ahKtgp = i68hK7ahKtgp();
        i68hK7ahKtgp.getClass();
        return ((Short) i68hK7ahKtgp).shortValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public char OPXfSBeufaJ8() {
        Object i68hK7ahKtgp = i68hK7ahKtgp();
        i68hK7ahKtgp.getClass();
        return ((Character) i68hK7ahKtgp).charValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder QrzZRwfaDlRX(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this;
    }

    @Override // defpackage.op
    public String RAsUl2FVSrh6(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return e6tOsSdd2EFb();
    }

    @Override // defpackage.op
    public short S2OOm9zPNm0h(aq1 aq1Var, int i) {
        aq1Var.getClass();
        return IAToe7bXGz4N();
    }

    @Override // defpackage.op
    public byte S9EYkSpbGuxq(aq1 aq1Var, int i) {
        aq1Var.getClass();
        return pnx5pC0XzaCw();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public long TSizfFm2Yiuu() {
        Object i68hK7ahKtgp = i68hK7ahKtgp();
        i68hK7ahKtgp.getClass();
        return ((Long) i68hK7ahKtgp).longValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int VhhvGxCb8gfr() {
        Object i68hK7ahKtgp = i68hK7ahKtgp();
        i68hK7ahKtgp.getClass();
        return ((Integer) i68hK7ahKtgp).intValue();
    }

    @Override // defpackage.op
    public double XL4ISE6Oc65B(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return aF05bpZJlKEP();
    }

    @Override // defpackage.op
    public Decoder Y1f8riQaR6yg(aq1 aq1Var, int i) {
        aq1Var.getClass();
        return QrzZRwfaDlRX(aq1Var.wdg6QnbFHrFF(i));
    }

    @Override // defpackage.op
    public int ZbWwgt3aGe7A(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return VhhvGxCb8gfr();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean a92UlCVFR9N8() {
        Object i68hK7ahKtgp = i68hK7ahKtgp();
        i68hK7ahKtgp.getClass();
        return ((Boolean) i68hK7ahKtgp).booleanValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public double aF05bpZJlKEP() {
        Object i68hK7ahKtgp = i68hK7ahKtgp();
        i68hK7ahKtgp.getClass();
        return ((Double) i68hK7ahKtgp).doubleValue();
    }

    @Override // defpackage.op
    public void cpQdD2nAriOS(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public String e6tOsSdd2EFb() {
        Object i68hK7ahKtgp = i68hK7ahKtgp();
        i68hK7ahKtgp.getClass();
        return (String) i68hK7ahKtgp;
    }

    @Override // defpackage.op
    public boolean e9gEMXR7LXtO(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return a92UlCVFR9N8();
    }

    @Override // defpackage.op
    public long gPXPFXrUH4XX(aq1 aq1Var, int i) {
        aq1Var.getClass();
        return TSizfFm2Yiuu();
    }

    public Object i68hK7ahKtgp() {
        throw new i42(bu1.PxuCJdSBwIXG(getClass()) + " can't retrieve untyped values");
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public float jyegZNwi31qc() {
        Object i68hK7ahKtgp = i68hK7ahKtgp();
        i68hK7ahKtgp.getClass();
        return ((Float) i68hK7ahKtgp).floatValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public op lS5Rgt96tfkO(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public byte pnx5pC0XzaCw() {
        Object i68hK7ahKtgp = i68hK7ahKtgp();
        i68hK7ahKtgp.getClass();
        return ((Byte) i68hK7ahKtgp).byteValue();
    }

    @Override // defpackage.op
    public char r3s1LDPKFs1S(aq1 aq1Var, int i) {
        aq1Var.getClass();
        return OPXfSBeufaJ8();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean rtx2ld2ELZv4() {
        return true;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int wdg6QnbFHrFF(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        Object i68hK7ahKtgp = i68hK7ahKtgp();
        i68hK7ahKtgp.getClass();
        return ((Integer) i68hK7ahKtgp).intValue();
    }
}
