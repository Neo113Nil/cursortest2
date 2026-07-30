package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.window.BackEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class th0 {
    public static final /* synthetic */ int PxuCJdSBwIXG = 0;
    public static final /* synthetic */ int lS5Rgt96tfkO = 0;

    public static final qt1 BRwzKIf41E4i(m61 m61Var, boolean z, boolean z2) {
        if (!m61Var.rtx2ld2ELZv4.S9EYkSpbGuxq) {
            qt1.Companion.getClass();
            return qt1.e9gEMXR7LXtO;
        }
        if (z) {
            return zv.POWyO8hTM6YC(m61Var, 8).r();
        }
        pd1 POWyO8hTM6YC = zv.POWyO8hTM6YC(m61Var, 8);
        return kj0.ZbWwgt3aGe7A(POWyO8hTM6YC).nLZGh9p8gVSu(POWyO8hTM6YC, z2);
    }

    public static final void BjEWd04qc7Mw(v81 v81Var, Object obj) {
        boolean z;
        long[] jArr = v81Var.PxuCJdSBwIXG;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = v81Var.lS5Rgt96tfkO[i4];
                        Object obj3 = v81Var.TSizfFm2Yiuu[i4];
                        if (obj3 instanceof w81) {
                            w81 w81Var = (w81) obj3;
                            w81Var.x50lh2ztY7Y5(obj);
                            z = w81Var.RAsUl2FVSrh6();
                        } else {
                            z = obj3 == obj;
                        }
                        if (z) {
                            v81Var.x50lh2ztY7Y5(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final Object EcgxDIVH5in8(e51 e51Var) {
        Object wdg6QnbFHrFF = e51Var.wdg6QnbFHrFF();
        gw0 gw0Var = wdg6QnbFHrFF instanceof gw0 ? (gw0) wdg6QnbFHrFF : null;
        if (gw0Var != null) {
            return gw0Var.VhhvGxCb8gfr;
        }
        return null;
    }

    public static final Object IAToe7bXGz4N(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static void OPXfSBeufaJ8(StringBuilder sb, Object obj, le0 le0Var) {
        if (le0Var != null) {
            sb.append((CharSequence) le0Var.OPXfSBeufaJ8(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static final dr2 Pf0ThKz3j5YS(ck ckVar, pr2 pr2Var, kr2 kr2Var, zu zuVar, hp hpVar) {
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        if (kr2Var == null) {
            kr2Var = ki0.xfACYKDMU6Dj(pr2Var);
        }
        nr2.Companion.getClass();
        kr2Var.getClass();
        zuVar.getClass();
        return new nr2(pr2Var.RAsUl2FVSrh6(), kr2Var, zuVar).PxuCJdSBwIXG(ckVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Iterable] */
    public static final void PxuCJdSBwIXG(qs0 qs0Var, ae0 ae0Var, n61 n61Var, hp hpVar, int i) {
        qs0 qs0Var2;
        n61 n61Var2;
        ?? iSxsmagYqzHM;
        qs0Var.getClass();
        t61 t61Var = qs0Var.RAsUl2FVSrh6;
        ae0Var.getClass();
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(-308154814);
        int i2 = i | (tf0Var.a92UlCVFR9N8(qs0Var) ? 4 : 2) | (tf0Var.rtx2ld2ELZv4(ae0Var) ? 32 : 16) | 384;
        int i3 = 1;
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 147) != 146)) {
            k61 k61Var = n61.Companion;
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            long J54yh1s3n4Aq = ni0.J54yh1s3n4Aq(t61Var);
            String str = qs0Var.lS5Rgt96tfkO;
            String[] strArr = {" "};
            str.getClass();
            String str2 = strArr[0];
            if (str2.length() == 0) {
                List asList = Arrays.asList(strArr);
                asList.getClass();
                un0 un0Var = new un0(i3, new fy(str, new l4(19, asList)));
                iSxsmagYqzHM = new ArrayList(al.KZw9XyiywG4x(un0Var, 10));
                Iterator it = un0Var.iterator();
                while (true) {
                    ey eyVar = (ey) it;
                    if (!eyVar.hasNext()) {
                        break;
                    }
                    br0 br0Var = (br0) eyVar.next();
                    br0Var.getClass();
                    iSxsmagYqzHM.add(str.subSequence(br0Var.rtx2ld2ELZv4, br0Var.OPXfSBeufaJ8 + 1).toString());
                }
            } else {
                iSxsmagYqzHM = ia2.iSxsmagYqzHM(str, str2);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : iSxsmagYqzHM) {
                if (!ia2.fRTaYY6FBZcX((String) obj)) {
                    arrayList.add(obj);
                }
            }
            List e = zk.e(2, arrayList);
            Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
            hp.Companion.getClass();
            if (nLZGh9p8gVSu == fp.lS5Rgt96tfkO) {
                nLZGh9p8gVSu = new wnqUPcAvl7HT(24);
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
            }
            String ctD2u3GUHhtA = zk.ctD2u3GUHhtA(e, "", null, null, (le0) nLZGh9p8gVSu, 30);
            n61 lS5Rgt96tfkO2 = c62.lS5Rgt96tfkO(k61Var, 1.0f);
            ox1 ox1Var = n9.PxuCJdSBwIXG;
            n61 BRwzKIf41E4i = hq0.BRwzKIf41E4i(lS5Rgt96tfkO2, ox1Var);
            gk0 gk0Var = b51.x50lh2ztY7Y5;
            n61 kpCQ9veP6n3I = zv.kpCQ9veP6n3I(1, tf0Var, ae0Var, hq0.r3s1LDPKFs1S(BRwzKIf41E4i, J54yh1s3n4Aq, gk0Var), false);
            s.Companion.getClass();
            j51 Y1f8riQaR6yg = xe.Y1f8riQaR6yg(r.lS5Rgt96tfkO, false);
            gg1 gg1Var2 = mp.PxuCJdSBwIXG;
            int hashCode = Long.hashCode(tf0Var.wLFCmsViZrNT);
            il1 x50lh2ztY7Y5 = tf0Var.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj = ov2.xfACYKDMU6Dj(tf0Var, kpCQ9veP6n3I);
            yo.Companion.getClass();
            dq dqVar = xo.lS5Rgt96tfkO;
            tf0Var.ngxnMNrpiKat();
            if (tf0Var.zf8DYfih6EZu) {
                tf0Var.dgRBjINgWbAK(dqVar);
            } else {
                tf0Var.hVNtCUZb4tYH();
            }
            p7 p7Var = xo.a92UlCVFR9N8;
            tmVwIGCQF4zR(tf0Var, p7Var, Y1f8riQaR6yg);
            p7 p7Var2 = xo.e9gEMXR7LXtO;
            tmVwIGCQF4zR(tf0Var, p7Var2, x50lh2ztY7Y5);
            Integer valueOf = Integer.valueOf(hashCode);
            p7 p7Var3 = xo.RAsUl2FVSrh6;
            tmVwIGCQF4zR(tf0Var, p7Var3, valueOf);
            k1 k1Var = xo.rtx2ld2ELZv4;
            kpCQ9veP6n3I(tf0Var, k1Var);
            p7 p7Var4 = xo.Y1f8riQaR6yg;
            tmVwIGCQF4zR(tf0Var, p7Var4, xfACYKDMU6Dj);
            jx1 jx1Var = jx1.dgRBjINgWbAK;
            k61 k61Var2 = n61.Companion;
            xe.PxuCJdSBwIXG(hq0.r3s1LDPKFs1S(c62.TSizfFm2Yiuu(c62.lS5Rgt96tfkO(jx1Var.cpQdD2nAriOS(k61Var2, r.OPXfSBeufaJ8), 1.0f), 4.0f), hl.lS5Rgt96tfkO(ki0.aF05bpZJlKEP(tf0Var).PxuCJdSBwIXG, 0.18f), gk0Var), tf0Var, 0);
            n61 jyegZNwi31qc = f2.jyegZNwi31qc(c62.lS5Rgt96tfkO(k61Var2, 1.0f), 14.0f);
            by1 PxuCJdSBwIXG2 = ay1.PxuCJdSBwIXG(new y9(12.0f, new u9(0)), r.x50lh2ztY7Y5, tf0Var, 54);
            int hashCode2 = Long.hashCode(tf0Var.wLFCmsViZrNT);
            il1 x50lh2ztY7Y52 = tf0Var.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj2 = ov2.xfACYKDMU6Dj(tf0Var, jyegZNwi31qc);
            tf0Var.ngxnMNrpiKat();
            if (tf0Var.zf8DYfih6EZu) {
                tf0Var.dgRBjINgWbAK(dqVar);
            } else {
                tf0Var.hVNtCUZb4tYH();
            }
            tmVwIGCQF4zR(tf0Var, p7Var, PxuCJdSBwIXG2);
            tmVwIGCQF4zR(tf0Var, p7Var2, x50lh2ztY7Y52);
            o0.EcgxDIVH5in8(hashCode2, tf0Var, p7Var3, tf0Var, k1Var);
            tmVwIGCQF4zR(tf0Var, p7Var4, xfACYKDMU6Dj2);
            n61 r3s1LDPKFs1S = hq0.r3s1LDPKFs1S(hq0.BRwzKIf41E4i(c62.a92UlCVFR9N8(k61Var2, 72.0f), ox1Var), hl.lS5Rgt96tfkO(ki0.aF05bpZJlKEP(tf0Var).PxuCJdSBwIXG, 0.14f), gk0Var);
            pd pdVar = r.a92UlCVFR9N8;
            j51 Y1f8riQaR6yg2 = xe.Y1f8riQaR6yg(pdVar, false);
            int hashCode3 = Long.hashCode(tf0Var.wLFCmsViZrNT);
            il1 x50lh2ztY7Y53 = tf0Var.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj3 = ov2.xfACYKDMU6Dj(tf0Var, r3s1LDPKFs1S);
            tf0Var.ngxnMNrpiKat();
            if (tf0Var.zf8DYfih6EZu) {
                tf0Var.dgRBjINgWbAK(dqVar);
            } else {
                tf0Var.hVNtCUZb4tYH();
            }
            tmVwIGCQF4zR(tf0Var, p7Var, Y1f8riQaR6yg2);
            tmVwIGCQF4zR(tf0Var, p7Var2, x50lh2ztY7Y53);
            o0.EcgxDIVH5in8(hashCode3, tf0Var, p7Var3, tf0Var, k1Var);
            tmVwIGCQF4zR(tf0Var, p7Var4, xfACYKDMU6Dj3);
            gi2.lS5Rgt96tfkO(ctD2u3GUHhtA, null, hl.lS5Rgt96tfkO(ki0.aF05bpZJlKEP(tf0Var).PxuCJdSBwIXG, 0.7f), 0L, 0L, null, 0L, 0, false, 0, 0, ki0.J54yh1s3n4Aq(tf0Var).RAsUl2FVSrh6, tf0Var, 0, 0, 131066);
            tf0Var.gPXPFXrUH4XX(true);
            lx0 lx0Var = new lx0(1.0f, true);
            dm PxuCJdSBwIXG3 = bm.PxuCJdSBwIXG(new y9(4.0f, new u9(0)), r.cpQdD2nAriOS, tf0Var, 6);
            int hashCode4 = Long.hashCode(tf0Var.wLFCmsViZrNT);
            il1 x50lh2ztY7Y54 = tf0Var.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj4 = ov2.xfACYKDMU6Dj(tf0Var, lx0Var);
            tf0Var.ngxnMNrpiKat();
            if (tf0Var.zf8DYfih6EZu) {
                tf0Var.dgRBjINgWbAK(dqVar);
            } else {
                tf0Var.hVNtCUZb4tYH();
            }
            tmVwIGCQF4zR(tf0Var, p7Var, PxuCJdSBwIXG3);
            tmVwIGCQF4zR(tf0Var, p7Var2, x50lh2ztY7Y54);
            o0.EcgxDIVH5in8(hashCode4, tf0Var, p7Var3, tf0Var, k1Var);
            tmVwIGCQF4zR(tf0Var, p7Var4, xfACYKDMU6Dj4);
            String str3 = qs0Var.lS5Rgt96tfkO;
            dj2 dj2Var = ki0.J54yh1s3n4Aq(tf0Var).rtx2ld2ELZv4;
            long j = ki0.aF05bpZJlKEP(tf0Var).PxuCJdSBwIXG;
            si2.Companion.getClass();
            qs0Var2 = qs0Var;
            gi2.lS5Rgt96tfkO(str3, null, j, 0L, 0L, null, 0L, 2, false, 1, 0, dj2Var, tf0Var, 0, 24960, 110586);
            gi2.lS5Rgt96tfkO(qs0Var2.a92UlCVFR9N8.rtx2ld2ELZv4, null, hl.lS5Rgt96tfkO(ki0.aF05bpZJlKEP(tf0Var).PxuCJdSBwIXG, 0.75f), 0L, 0L, null, 0L, 2, false, 1, 0, ki0.J54yh1s3n4Aq(tf0Var).OPXfSBeufaJ8, tf0Var, 0, 24960, 110586);
            gi2.lS5Rgt96tfkO(t61Var.rtx2ld2ELZv4, null, hl.lS5Rgt96tfkO(ki0.aF05bpZJlKEP(tf0Var).PxuCJdSBwIXG, 0.6f), 0L, 0L, null, 0L, 2, false, 1, 0, ki0.J54yh1s3n4Aq(tf0Var).OPXfSBeufaJ8, tf0Var, 0, 24960, 110586);
            tf0Var.gPXPFXrUH4XX(true);
            n61 aF05bpZJlKEP = f2.aF05bpZJlKEP(hq0.r3s1LDPKFs1S(hq0.BRwzKIf41E4i(k61Var2, ox1Var), ki0.aF05bpZJlKEP(tf0Var).PxuCJdSBwIXG, gk0Var), 12.0f, 10.0f);
            j51 Y1f8riQaR6yg3 = xe.Y1f8riQaR6yg(pdVar, false);
            int hashCode5 = Long.hashCode(tf0Var.wLFCmsViZrNT);
            il1 x50lh2ztY7Y55 = tf0Var.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj5 = ov2.xfACYKDMU6Dj(tf0Var, aF05bpZJlKEP);
            tf0Var.ngxnMNrpiKat();
            if (tf0Var.zf8DYfih6EZu) {
                tf0Var.dgRBjINgWbAK(dqVar);
            } else {
                tf0Var.hVNtCUZb4tYH();
            }
            tmVwIGCQF4zR(tf0Var, p7Var, Y1f8riQaR6yg3);
            tmVwIGCQF4zR(tf0Var, p7Var2, x50lh2ztY7Y55);
            o0.EcgxDIVH5in8(hashCode5, tf0Var, p7Var3, tf0Var, k1Var);
            tmVwIGCQF4zR(tf0Var, p7Var4, xfACYKDMU6Dj5);
            gi2.lS5Rgt96tfkO(qs0Var2.TSizfFm2Yiuu + "%", null, ki0.aF05bpZJlKEP(tf0Var).a92UlCVFR9N8, 0L, 0L, null, 0L, 0, false, 0, 0, ki0.J54yh1s3n4Aq(tf0Var).rtx2ld2ELZv4, tf0Var, 0, 0, 131066);
            tf0Var = tf0Var;
            tf0Var.gPXPFXrUH4XX(true);
            tf0Var.gPXPFXrUH4XX(true);
            tf0Var.gPXPFXrUH4XX(true);
            n61Var2 = k61Var;
        } else {
            qs0Var2 = qs0Var;
            tf0Var.i68hK7ahKtgp();
            n61Var2 = n61Var;
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new n6(qs0Var2, ae0Var, n61Var2, i);
        }
    }

    public static String QrzZRwfaDlRX(Parcel parcel, int i) {
        int aF05bpZJlKEP = aF05bpZJlKEP(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (aF05bpZJlKEP == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + aF05bpZJlKEP);
        return readString;
    }

    public static final Object[] RAsUl2FVSrh6(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        na.hVNtCUZb4tYH(objArr, objArr2, 0, i, 6);
        na.VzNxmvWisHL1(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    public static final void S2OOm9zPNm0h(b32 b32Var) {
        zv.zf8DYfih6EZu(b32Var).ozEBbv0hFTAB();
    }

    public static final int S9EYkSpbGuxq(KeyEvent keyEvent) {
        return (keyEvent.isAltPressed() ? 1 : 0) | (keyEvent.isCtrlPressed() ? 2 : 0) | (keyEvent.isMetaPressed() ? 4 : 0) | (keyEvent.isShiftPressed() ? 8 : 0);
    }

    public static final fc1 TSizfFm2Yiuu(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
        return new fc1(swipeEdge, progress, touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static final int VhhvGxCb8gfr(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static void XL4ISE6Oc65B(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new tm(o0.wdg6QnbFHrFF("Overread allowed size end=", i), parcel);
        }
    }

    public static final Object[] Y1f8riQaR6yg(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        na.hVNtCUZb4tYH(objArr, objArr2, 0, i, 6);
        na.VzNxmvWisHL1(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final boolean ZbWwgt3aGe7A(yj1 yj1Var, float f, float f2) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        r4 PxuCJdSBwIXG2 = t4.PxuCJdSBwIXG();
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            t4.lS5Rgt96tfkO("Invalid rectangle, make sure no value is NaN");
        }
        if (PxuCJdSBwIXG2.lS5Rgt96tfkO == null) {
            PxuCJdSBwIXG2.lS5Rgt96tfkO = new RectF();
        }
        RectF rectF = PxuCJdSBwIXG2.lS5Rgt96tfkO;
        rectF.getClass();
        rectF.set(f3, f4, f5, f6);
        Path path = PxuCJdSBwIXG2.PxuCJdSBwIXG;
        RectF rectF2 = PxuCJdSBwIXG2.lS5Rgt96tfkO;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
        r4 PxuCJdSBwIXG3 = t4.PxuCJdSBwIXG();
        zk1.Companion.getClass();
        PxuCJdSBwIXG3.e9gEMXR7LXtO(yj1Var, PxuCJdSBwIXG2, 1);
        boolean isEmpty = PxuCJdSBwIXG3.PxuCJdSBwIXG.isEmpty();
        PxuCJdSBwIXG3.a92UlCVFR9N8();
        PxuCJdSBwIXG2.a92UlCVFR9N8();
        return !isEmpty;
    }

    public static final Object[] a92UlCVFR9N8(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        na.hVNtCUZb4tYH(objArr, objArr2, 0, i, 6);
        na.VzNxmvWisHL1(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    public static int aF05bpZJlKEP(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static int amuv7NJvPxHu(Parcel parcel) {
        int readInt = parcel.readInt();
        int aF05bpZJlKEP = aF05bpZJlKEP(parcel, readInt);
        char c = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new tm("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i = aF05bpZJlKEP + dataPosition;
        if (i < dataPosition || i > parcel.dataSize()) {
            throw new tm(o0.rtx2ld2ELZv4(dataPosition, i, "Size read is invalid start=", " end="), parcel);
        }
        return i;
    }

    public static v81 cpQdD2nAriOS() {
        long[] jArr = c02.PxuCJdSBwIXG;
        return new v81();
    }

    public static final Object dgRBjINgWbAK(ex1 ex1Var, le0 le0Var, bt btVar) {
        rk2 rk2Var;
        if (ex1Var.RAsUl2FVSrh6() && ex1Var.OPXfSBeufaJ8() && ex1Var.rtx2ld2ELZv4()) {
            return le0Var.OPXfSBeufaJ8(btVar);
        }
        if (btVar.e9gEMXR7LXtO().S2OOm9zPNm0h(fi.wdg6QnbFHrFF) == null) {
            return le0Var.OPXfSBeufaJ8(btVar);
        }
        a92UlCVFR9N8 a92ulcvfr9n8 = new a92UlCVFR9N8(le0Var, null, 27);
        qk2 qk2Var = (qk2) btVar.e9gEMXR7LXtO().S2OOm9zPNm0h(qk2.OPXfSBeufaJ8);
        ju juVar = qk2Var != null ? qk2Var.rtx2ld2ELZv4 : null;
        if (juVar != null) {
            return fx1.OYiFbU3x63rc(juVar, a92ulcvfr9n8, btVar);
        }
        bi biVar = new bi(1, ng0.IAToe7bXGz4N(btVar));
        biVar.ZbWwgt3aGe7A();
        try {
            rk2Var = ex1Var.Y1f8riQaR6yg;
        } catch (RejectedExecutionException e) {
            biVar.QrzZRwfaDlRX(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        if (rk2Var != null) {
            rk2Var.execute(new ev1(biVar, ex1Var, a92ulcvfr9n8));
            return biVar.VhhvGxCb8gfr();
        }
        cs0.tmVwIGCQF4zR("internalTransactionExecutor");
        throw null;
    }

    public static boolean e6tOsSdd2EFb(Parcel parcel, int i) {
        gGoUzNp9JO5I(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static final boolean e9gEMXR7LXtO(int i, KeyEvent keyEvent) {
        return ((int) (jh0.XL4ISE6Oc65B(keyEvent) >> 32)) == i;
    }

    public static void gGoUzNp9JO5I(Parcel parcel, int i, int i2) {
        int aF05bpZJlKEP = aF05bpZJlKEP(parcel, i);
        if (aF05bpZJlKEP == i2) {
            return;
        }
        String hexString = Integer.toHexString(aF05bpZJlKEP);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(aF05bpZJlKEP);
        sb.append(" (0x");
        throw new tm(o0.gPXPFXrUH4XX(sb, hexString, ")"), parcel);
    }

    public static Object[] gPXPFXrUH4XX(Parcel parcel, int i, Parcelable.Creator creator) {
        int aF05bpZJlKEP = aF05bpZJlKEP(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (aF05bpZJlKEP == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + aF05bpZJlKEP);
        return createTypedArray;
    }

    public static int jyegZNwi31qc(Parcel parcel, int i) {
        gGoUzNp9JO5I(parcel, i, 4);
        return parcel.readInt();
    }

    public static final void kpCQ9veP6n3I(hp hpVar, le0 le0Var) {
        ((tf0) hpVar).lS5Rgt96tfkO(new l4(23, le0Var), no2.PxuCJdSBwIXG);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x005a, code lost:
    
        if (r6 == defpackage.fp.lS5Rgt96tfkO) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void lS5Rgt96tfkO(on onVar, hp hpVar, int i) {
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(-709502251);
        byte b = 0;
        if (tf0Var.Pf0ThKz3j5YS(i & 1, (i & 3) != 2)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            t92 t92Var = bz1.PxuCJdSBwIXG;
            zy1 zy1Var = (zy1) tf0Var.wdg6QnbFHrFF(t92Var);
            yy1 nLZGh9p8gVSu = ni0.nLZGh9p8gVSu(tf0Var);
            Object[] objArr = {zy1Var};
            nz0.Companion.getClass();
            cr1 cr1Var = new cr1(5, new jm(9, b), new e9gEMXR7LXtO(18, zy1Var, nLZGh9p8gVSu));
            boolean rtx2ld2ELZv4 = tf0Var.rtx2ld2ELZv4(zy1Var) | tf0Var.rtx2ld2ELZv4(nLZGh9p8gVSu);
            Object nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
            if (!rtx2ld2ELZv4) {
                hp.Companion.getClass();
            }
            nLZGh9p8gVSu2 = new e6(16, zy1Var, nLZGh9p8gVSu);
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu2);
            nz0 nz0Var = (nz0) sj0.ryVscX7ZL4Ux(objArr, cr1Var, (ae0) nLZGh9p8gVSu2, tf0Var, 0);
            zv.lS5Rgt96tfkO(t92Var.PxuCJdSBwIXG(nz0Var), bs0.kpCQ9veP6n3I(-412824043, new bf(onVar, nz0Var, 13), tf0Var), tf0Var, 56);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new q90(onVar, i);
        }
    }

    public static final int nLZGh9p8gVSu(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        int i3 = i - i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public static final dj2 ozEBbv0hFTAB(dj2 dj2Var, cw0 cw0Var) {
        int i;
        int i2;
        float f;
        q82 q82Var = dj2Var.PxuCJdSBwIXG;
        rh2 rh2Var = r82.Y1f8riQaR6yg;
        rh2 rh2Var2 = q82Var.PxuCJdSBwIXG;
        if (rh2Var2.equals(qh2.PxuCJdSBwIXG)) {
            rh2Var2 = r82.Y1f8riQaR6yg;
        }
        rh2 rh2Var3 = rh2Var2;
        long j = q82Var.lS5Rgt96tfkO;
        gj2 gj2Var = hj2.Companion;
        if ((j & 1095216660480L) == 0) {
            j = r82.PxuCJdSBwIXG;
        }
        long j2 = j;
        xc0 xc0Var = q82Var.TSizfFm2Yiuu;
        if (xc0Var == null) {
            xc0.Companion.getClass();
            xc0Var = xc0.x50lh2ztY7Y5;
        }
        xc0 xc0Var2 = xc0Var;
        rc0 rc0Var = q82Var.Y1f8riQaR6yg;
        if (rc0Var != null) {
            i = rc0Var.PxuCJdSBwIXG;
        } else {
            rc0.Companion.getClass();
            i = 0;
        }
        rc0 rc0Var2 = new rc0(i);
        tc0 tc0Var = q82Var.e9gEMXR7LXtO;
        if (tc0Var != null) {
            i2 = tc0Var.PxuCJdSBwIXG;
        } else {
            tc0.Companion.getClass();
            i2 = 65535;
        }
        tc0 tc0Var2 = new tc0(i2);
        pb0 pb0Var = q82Var.a92UlCVFR9N8;
        if (pb0Var == null) {
            pb0.Companion.getClass();
            pb0Var = pb0.rtx2ld2ELZv4;
        }
        pb0 pb0Var2 = pb0Var;
        String str = q82Var.RAsUl2FVSrh6;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j3 = q82Var.rtx2ld2ELZv4;
        if ((j3 & 1095216660480L) == 0) {
            j3 = r82.lS5Rgt96tfkO;
        }
        long j4 = j3;
        uc ucVar = q82Var.OPXfSBeufaJ8;
        float f2 = 0.0f;
        if (ucVar != null) {
            f = ucVar.PxuCJdSBwIXG;
        } else {
            uc.Companion.getClass();
            f = 0.0f;
        }
        if (Float.isNaN(f)) {
            uc.Companion.getClass();
        } else {
            f2 = f;
        }
        uc ucVar2 = new uc(f2);
        th2 th2Var = q82Var.wdg6QnbFHrFF;
        if (th2Var == null) {
            th2.Companion.getClass();
            th2Var = th2.TSizfFm2Yiuu;
        }
        th2 th2Var2 = th2Var;
        p21 p21Var = q82Var.dgRBjINgWbAK;
        if (p21Var == null) {
            p21.Companion.getClass();
            p21Var = om1.PxuCJdSBwIXG.EcgxDIVH5in8();
        }
        p21 p21Var2 = p21Var;
        long j5 = q82Var.x50lh2ztY7Y5;
        if (j5 == 16) {
            j5 = r82.TSizfFm2Yiuu;
        }
        long j6 = j5;
        if2 if2Var = q82Var.cpQdD2nAriOS;
        if (if2Var == null) {
            if2.Companion.getClass();
            if2Var = if2.lS5Rgt96tfkO;
        }
        if2 if2Var2 = if2Var;
        w42 w42Var = q82Var.r3s1LDPKFs1S;
        if (w42Var == null) {
            w42.Companion.getClass();
            w42Var = w42.Y1f8riQaR6yg;
        }
        w42 w42Var2 = w42Var;
        gn1 gn1Var = q82Var.QrzZRwfaDlRX;
        l30 l30Var = q82Var.gPXPFXrUH4XX;
        if (l30Var == null) {
            l30Var = u70.PxuCJdSBwIXG;
        }
        q82 q82Var2 = new q82(rh2Var3, j2, xc0Var2, rc0Var2, tc0Var2, pb0Var2, str2, j4, ucVar2, th2Var2, p21Var2, j6, if2Var2, w42Var2, gn1Var, l30Var);
        bj1 bj1Var = dj2Var.lS5Rgt96tfkO;
        int i3 = cj1.lS5Rgt96tfkO;
        int i4 = bj1Var.PxuCJdSBwIXG;
        int i5 = bj1Var.rtx2ld2ELZv4;
        int i6 = bj1Var.RAsUl2FVSrh6;
        he2.Companion.getClass();
        int i7 = 5;
        int i8 = i4 == 0 ? 5 : bj1Var.PxuCJdSBwIXG;
        int i9 = bj1Var.lS5Rgt96tfkO;
        nf2.Companion.getClass();
        if (i9 == 3) {
            int ordinal = cw0Var.ordinal();
            if (ordinal == 0) {
                i7 = 4;
            } else if (ordinal != 1) {
                u9.gPXPFXrUH4XX();
                return null;
            }
        } else if (i9 == 0) {
            int ordinal2 = cw0Var.ordinal();
            if (ordinal2 == 0) {
                i7 = 1;
            } else {
                if (ordinal2 != 1) {
                    u9.gPXPFXrUH4XX();
                    return null;
                }
                i7 = 2;
            }
        } else {
            i7 = i9;
        }
        long j7 = bj1Var.TSizfFm2Yiuu;
        if ((j7 & 1095216660480L) == 0) {
            j7 = cj1.PxuCJdSBwIXG;
        }
        zh2 zh2Var = bj1Var.Y1f8riQaR6yg;
        if (zh2Var == null) {
            zh2.Companion.getClass();
            zh2Var = zh2.TSizfFm2Yiuu;
        }
        xm1 xm1Var = bj1Var.e9gEMXR7LXtO;
        int i10 = 1;
        p11 p11Var = bj1Var.a92UlCVFR9N8;
        g11.Companion.getClass();
        if (i6 == 0) {
            i6 = g11.lS5Rgt96tfkO;
        }
        om0.Companion.getClass();
        if (i5 != 0) {
            i10 = i5;
        }
        qi2 qi2Var = bj1Var.OPXfSBeufaJ8;
        if (qi2Var == null) {
            qi2.Companion.getClass();
            qi2Var = qi2.TSizfFm2Yiuu;
        }
        return new dj2(q82Var2, new bj1(i8, i7, j7, zh2Var, xm1Var, p11Var, i6, i10, qi2Var), dj2Var.TSizfFm2Yiuu);
    }

    public static final boolean pnx5pC0XzaCw(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (intBitsToFloat2 * intBitsToFloat2)) + ((f5 * f5) / (intBitsToFloat * intBitsToFloat)) <= 1.0f;
    }

    public static Parcelable r3s1LDPKFs1S(Parcel parcel, int i, Parcelable.Creator creator) {
        int aF05bpZJlKEP = aF05bpZJlKEP(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (aF05bpZJlKEP == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + aF05bpZJlKEP);
        return parcelable;
    }

    public static final boolean rZjpSjn4zoMv(v81 v81Var, Object obj, Object obj2) {
        Object RAsUl2FVSrh6 = v81Var.RAsUl2FVSrh6(obj);
        if (RAsUl2FVSrh6 == null) {
            return false;
        }
        if (!(RAsUl2FVSrh6 instanceof w81)) {
            if (!RAsUl2FVSrh6.equals(obj2)) {
                return false;
            }
            v81Var.dgRBjINgWbAK(obj);
            return true;
        }
        w81 w81Var = (w81) RAsUl2FVSrh6;
        boolean x50lh2ztY7Y5 = w81Var.x50lh2ztY7Y5(obj2);
        if (x50lh2ztY7Y5 && w81Var.RAsUl2FVSrh6()) {
            v81Var.dgRBjINgWbAK(obj);
        }
        return x50lh2ztY7Y5;
    }

    public static final void rtx2ld2ELZv4(v81 v81Var, Object obj, Object obj2) {
        int a92UlCVFR9N8 = v81Var.a92UlCVFR9N8(obj);
        boolean z = a92UlCVFR9N8 < 0;
        Object obj3 = z ? null : v81Var.TSizfFm2Yiuu[a92UlCVFR9N8];
        if (obj3 != null) {
            if (obj3 instanceof w81) {
                ((w81) obj3).PxuCJdSBwIXG(obj2);
            } else if (obj3 != obj2) {
                w81 w81Var = new w81();
                w81Var.PxuCJdSBwIXG(obj3);
                w81Var.PxuCJdSBwIXG(obj2);
                obj2 = w81Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            v81Var.TSizfFm2Yiuu[a92UlCVFR9N8] = obj2;
            return;
        }
        int i = ~a92UlCVFR9N8;
        v81Var.lS5Rgt96tfkO[i] = obj;
        v81Var.TSizfFm2Yiuu[i] = obj2;
    }

    public static final void ryVscX7ZL4Ux(int i, int i2, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(serialDescriptor.e9gEMXR7LXtO(i4));
            }
            i3 >>>= 1;
        }
        String lS5Rgt96tfkO2 = serialDescriptor.lS5Rgt96tfkO();
        lS5Rgt96tfkO2.getClass();
        throw new j61(arrayList.size() == 1 ? "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + lS5Rgt96tfkO2 + "', but it was missing" : "Fields " + arrayList + " are required for type with serial name '" + lS5Rgt96tfkO2 + "', but they were missing", null, arrayList, lS5Rgt96tfkO2);
    }

    public static final void tmVwIGCQF4zR(hp hpVar, pe0 pe0Var, Object obj) {
        if (((tf0) hpVar).zf8DYfih6EZu || !cs0.wdg6QnbFHrFF(((tf0) hpVar).nLZGh9p8gVSu(), obj)) {
            tf0 tf0Var = (tf0) hpVar;
            tf0Var.JTxCbbCwomzt(obj);
            tf0Var.lS5Rgt96tfkO(pe0Var, obj);
        }
    }

    public static void wdg6QnbFHrFF(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static final void x50lh2ztY7Y5(fb1 fb1Var, ck ckVar, on onVar) {
        vc1 vc1Var = fb1Var.RAsUl2FVSrh6;
        vc1Var.getClass();
        vc1.Companion.getClass();
        fb1Var.OPXfSBeufaJ8.add(new ho((go) vc1Var.lS5Rgt96tfkO(uc1.PxuCJdSBwIXG(go.class)), ckVar, onVar).PxuCJdSBwIXG());
    }

    public static void xfACYKDMU6Dj(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + aF05bpZJlKEP(parcel, i));
    }

    public abstract void EpkonXwzFgDB(boolean z);

    public abstract qt1 RfyTYNmI9Srp();

    public void J54yh1s3n4Aq(boolean z) {
    }
}
