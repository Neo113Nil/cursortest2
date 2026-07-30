package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.inputmethod.ExtractedText;
import com.ice.fishing.grenza.presentation.navigation.LaunchRoute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class ki0 {
    public static w3 PxuCJdSBwIXG;
    public static ji TSizfFm2Yiuu;
    public static final /* synthetic */ int Y1f8riQaR6yg = 0;
    public static t0 lS5Rgt96tfkO;

    public static final boolean BRwzKIf41E4i(int i, qt1 qt1Var, qt1 qt1Var2) {
        fa0 fa0Var = ga0.Companion;
        fa0Var.getClass();
        if (i != 3) {
            fa0Var.getClass();
            if (i != 4) {
                fa0Var.getClass();
                if (i != 5) {
                    fa0Var.getClass();
                    if (i != 6) {
                        u9.rtx2ld2ELZv4("This function should only be used for 2-D focus search");
                        return false;
                    }
                }
                return qt1Var.TSizfFm2Yiuu > qt1Var2.PxuCJdSBwIXG && qt1Var.PxuCJdSBwIXG < qt1Var2.TSizfFm2Yiuu;
            }
        }
        return qt1Var.Y1f8riQaR6yg > qt1Var2.lS5Rgt96tfkO && qt1Var.lS5Rgt96tfkO < qt1Var2.Y1f8riQaR6yg;
    }

    public static final x6 BjEWd04qc7Mw(hu huVar) {
        x6 x6Var = (x6) huVar.S2OOm9zPNm0h(jx1.XL4ISE6Oc65B);
        if (x6Var != null) {
            return x6Var;
        }
        u9.rtx2ld2ELZv4("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static int D0aTLcX6Uhyo(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static final void EcgxDIVH5in8(ab0 ab0Var, f91 f91Var) {
        if (!ab0Var.rtx2ld2ELZv4.S9EYkSpbGuxq) {
            ep0.lS5Rgt96tfkO("visitChildren called on an unattached node");
        }
        f91 f91Var2 = new f91(new m61[16]);
        m61 m61Var = ab0Var.rtx2ld2ELZv4;
        m61 m61Var2 = m61Var.cpQdD2nAriOS;
        if (m61Var2 == null) {
            zv.OPXfSBeufaJ8(f91Var2, m61Var);
        } else {
            f91Var2.lS5Rgt96tfkO(m61Var2);
        }
        while (true) {
            int i = f91Var2.wdg6QnbFHrFF;
            if (i == 0) {
                return;
            }
            m61 m61Var3 = (m61) f91Var2.dgRBjINgWbAK(i - 1);
            if ((m61Var3.dgRBjINgWbAK & 1024) == 0) {
                zv.OPXfSBeufaJ8(f91Var2, m61Var3);
            } else {
                while (true) {
                    if (m61Var3 == null) {
                        break;
                    }
                    if ((m61Var3.wdg6QnbFHrFF & 1024) != 0) {
                        f91 f91Var3 = null;
                        while (m61Var3 != null) {
                            if (m61Var3 instanceof ab0) {
                                ab0 ab0Var2 = (ab0) m61Var3;
                                if (ab0Var2.S9EYkSpbGuxq && !zv.zf8DYfih6EZu(ab0Var2).xbgXKYA2cIfu) {
                                    if (ab0Var2.fkblLSN2bAgv().PxuCJdSBwIXG) {
                                        f91Var.lS5Rgt96tfkO(ab0Var2);
                                    } else {
                                        EcgxDIVH5in8(ab0Var2, f91Var);
                                    }
                                }
                            } else if ((m61Var3.wdg6QnbFHrFF & 1024) != 0 && (m61Var3 instanceof ux)) {
                                int i2 = 0;
                                for (m61 m61Var4 = ((ux) m61Var3).S2OOm9zPNm0h; m61Var4 != null; m61Var4 = m61Var4.cpQdD2nAriOS) {
                                    if ((m61Var4.wdg6QnbFHrFF & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            m61Var3 = m61Var4;
                                        } else {
                                            if (f91Var3 == null) {
                                                f91Var3 = new f91(new m61[16]);
                                            }
                                            if (m61Var3 != null) {
                                                f91Var3.lS5Rgt96tfkO(m61Var3);
                                                m61Var3 = null;
                                            }
                                            f91Var3.lS5Rgt96tfkO(m61Var4);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            m61Var3 = zv.dgRBjINgWbAK(f91Var3);
                        }
                    } else {
                        m61Var3 = m61Var3.cpQdD2nAriOS;
                    }
                }
            }
        }
    }

    public static final zu EpkonXwzFgDB(pr2 pr2Var) {
        return pr2Var instanceof bj0 ? ((bj0) pr2Var).a92UlCVFR9N8() : xu.lS5Rgt96tfkO;
    }

    public static final ab0 IAToe7bXGz4N(f91 f91Var, qt1 qt1Var, int i) {
        qt1 rtx2ld2ELZv4;
        ga0.Companion.getClass();
        ab0 ab0Var = null;
        if (i == 3) {
            rtx2ld2ELZv4 = qt1Var.rtx2ld2ELZv4((qt1Var.TSizfFm2Yiuu - qt1Var.PxuCJdSBwIXG) + 1.0f, 0.0f);
        } else if (i == 4) {
            rtx2ld2ELZv4 = qt1Var.rtx2ld2ELZv4(-((qt1Var.TSizfFm2Yiuu - qt1Var.PxuCJdSBwIXG) + 1.0f), 0.0f);
        } else if (i == 5) {
            rtx2ld2ELZv4 = qt1Var.rtx2ld2ELZv4(0.0f, (qt1Var.Y1f8riQaR6yg - qt1Var.lS5Rgt96tfkO) + 1.0f);
        } else {
            if (i != 6) {
                u9.rtx2ld2ELZv4("This function should only be used for 2-D focus search");
                return null;
            }
            rtx2ld2ELZv4 = qt1Var.rtx2ld2ELZv4(0.0f, -((qt1Var.Y1f8riQaR6yg - qt1Var.lS5Rgt96tfkO) + 1.0f));
        }
        Object[] objArr = f91Var.rtx2ld2ELZv4;
        int i2 = f91Var.wdg6QnbFHrFF;
        for (int i3 = 0; i3 < i2; i3++) {
            ab0 ab0Var2 = (ab0) objArr[i3];
            if (zv.BjEWd04qc7Mw(ab0Var2)) {
                qt1 XL4ISE6Oc65B = zv.XL4ISE6Oc65B(ab0Var2);
                if (gGoUzNp9JO5I(XL4ISE6Oc65B, rtx2ld2ELZv4, qt1Var, i)) {
                    ab0Var = ab0Var2;
                    rtx2ld2ELZv4 = XL4ISE6Oc65B;
                }
            }
        }
        return ab0Var;
    }

    public static final String IXK6ba3ucyzm(SerialDescriptor serialDescriptor) {
        return zk.ctD2u3GUHhtA(ng0.nLZGh9p8gVSu(0, serialDescriptor.Y1f8riQaR6yg()), ", ", serialDescriptor.lS5Rgt96tfkO() + '(', ")", new r3s1LDPKFs1S(25, serialDescriptor), 24);
    }

    public static en2 J54yh1s3n4Aq(hp hpVar) {
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        return (en2) ((tf0) hpVar).wdg6QnbFHrFF(fn2.PxuCJdSBwIXG);
    }

    public static final Boolean JHNfcAUfKc4G(int i, l7 l7Var, ab0 ab0Var, qt1 qt1Var) {
        int ordinal = ab0Var.FT2GK7JK5Ma2().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                ab0 EcgxDIVH5in8 = zv.EcgxDIVH5in8(ab0Var);
                if (EcgxDIVH5in8 == null) {
                    u9.rtx2ld2ELZv4("ActiveParent must have a focusedChild");
                    return null;
                }
                int ordinal2 = EcgxDIVH5in8.FT2GK7JK5Ma2().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        Boolean JHNfcAUfKc4G = JHNfcAUfKc4G(i, l7Var, EcgxDIVH5in8, qt1Var);
                        if (!cs0.wdg6QnbFHrFF(JHNfcAUfKc4G, Boolean.FALSE)) {
                            return JHNfcAUfKc4G;
                        }
                        if (qt1Var == null) {
                            if (EcgxDIVH5in8.FT2GK7JK5Ma2() != za0.OPXfSBeufaJ8) {
                                u9.rtx2ld2ELZv4("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            ab0 BRwzKIf41E4i = zv.BRwzKIf41E4i(EcgxDIVH5in8);
                            if (BRwzKIf41E4i == null) {
                                u9.rtx2ld2ELZv4("ActiveParent must have a focusedChild");
                                return null;
                            }
                            qt1Var = zv.XL4ISE6Oc65B(BRwzKIf41E4i);
                        }
                        return Boolean.valueOf(jyegZNwi31qc(i, l7Var, ab0Var, qt1Var));
                    }
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            u9.gPXPFXrUH4XX();
                            return null;
                        }
                        u9.rtx2ld2ELZv4("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (qt1Var == null) {
                    qt1Var = zv.XL4ISE6Oc65B(EcgxDIVH5in8);
                }
                return Boolean.valueOf(jyegZNwi31qc(i, l7Var, ab0Var, qt1Var));
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return ab0Var.fkblLSN2bAgv().PxuCJdSBwIXG ? (Boolean) l7Var.OPXfSBeufaJ8(ab0Var) : qt1Var == null ? Boolean.valueOf(e6tOsSdd2EFb(ab0Var, i, l7Var)) : Boolean.valueOf(xbgXKYA2cIfu(i, l7Var, ab0Var, qt1Var));
                }
                u9.gPXPFXrUH4XX();
                return null;
            }
        }
        return Boolean.valueOf(e6tOsSdd2EFb(ab0Var, i, l7Var));
    }

    public static void JTxCbbCwomzt(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static void KUoIVIumpKat(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int D0aTLcX6Uhyo = D0aTLcX6Uhyo(parcel, i);
        parcel.writeString(str);
        PsecLrZVVK61(parcel, D0aTLcX6Uhyo);
    }

    public static final void OPXfSBeufaJ8(n61 n61Var, on onVar, hp hpVar, int i) {
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(-1854833411);
        int i2 = (tf0Var.a92UlCVFR9N8(n61Var) ? 4 : 2) | i;
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 19) != 18)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
            hp.Companion.getClass();
            if (nLZGh9p8gVSu == fp.lS5Rgt96tfkO) {
                nLZGh9p8gVSu = c3.RAsUl2FVSrh6;
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
            }
            j51 j51Var = (j51) nLZGh9p8gVSu;
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
            th0.tmVwIGCQF4zR(tf0Var, xo.a92UlCVFR9N8, j51Var);
            th0.tmVwIGCQF4zR(tf0Var, xo.e9gEMXR7LXtO, x50lh2ztY7Y5);
            th0.tmVwIGCQF4zR(tf0Var, xo.RAsUl2FVSrh6, Integer.valueOf(hashCode));
            th0.kpCQ9veP6n3I(tf0Var, xo.rtx2ld2ELZv4);
            th0.tmVwIGCQF4zR(tf0Var, xo.Y1f8riQaR6yg, xfACYKDMU6Dj);
            onVar.rtx2ld2ELZv4(tf0Var, 6);
            tf0Var.gPXPFXrUH4XX(true);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new bf(i, 17, n61Var, onVar);
        }
    }

    public static final boolean POWyO8hTM6YC(int i, qt1 qt1Var, qt1 qt1Var2) {
        fa0 fa0Var = ga0.Companion;
        fa0Var.getClass();
        if (i == 3) {
            float f = qt1Var2.TSizfFm2Yiuu;
            float f2 = qt1Var2.PxuCJdSBwIXG;
            float f3 = qt1Var.TSizfFm2Yiuu;
            return (f > f3 || f2 >= f3) && f2 > qt1Var.PxuCJdSBwIXG;
        }
        fa0Var.getClass();
        if (i == 4) {
            float f4 = qt1Var2.PxuCJdSBwIXG;
            float f5 = qt1Var2.TSizfFm2Yiuu;
            float f6 = qt1Var.PxuCJdSBwIXG;
            return (f4 < f6 || f5 <= f6) && f5 < qt1Var.TSizfFm2Yiuu;
        }
        fa0Var.getClass();
        if (i == 5) {
            float f7 = qt1Var2.Y1f8riQaR6yg;
            float f8 = qt1Var2.lS5Rgt96tfkO;
            float f9 = qt1Var.Y1f8riQaR6yg;
            return (f7 > f9 || f8 >= f9) && f8 > qt1Var.lS5Rgt96tfkO;
        }
        fa0Var.getClass();
        if (i != 6) {
            u9.rtx2ld2ELZv4("This function should only be used for 2-D focus search");
            return false;
        }
        float f10 = qt1Var2.lS5Rgt96tfkO;
        float f11 = qt1Var2.Y1f8riQaR6yg;
        float f12 = qt1Var.lS5Rgt96tfkO;
        return (f10 < f12 || f11 <= f12) && f11 < qt1Var.Y1f8riQaR6yg;
    }

    public static final boolean Pf0ThKz3j5YS(hu huVar) {
        xs0 xs0Var = (xs0) huVar.S2OOm9zPNm0h(ih0.BRwzKIf41E4i);
        if (xs0Var != null) {
            return xs0Var.lS5Rgt96tfkO();
        }
        return true;
    }

    public static void PsecLrZVVK61(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* JADX WARN: Code restructure failed: missing block: B:214:0x03d2, code lost:
    
        if (r33 != false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0427, code lost:
    
        if (r7 == r9) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x04ba, code lost:
    
        if (r7 == r9) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0350, code lost:
    
        if (r33 != false) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0320, code lost:
    
        if (r33 != false) goto L214;
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0326  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PxuCJdSBwIXG(final CharSequence charSequence, final pe0 pe0Var, final jg2 jg2Var, final qe0 qe0Var, final pe0 pe0Var2, final boolean z, final e81 e81Var, final mi1 mi1Var, final pf2 pf2Var, final pe0 pe0Var3, hp hpVar, final int i, final int i2) {
        int i3;
        CharSequence charSequence2;
        int i4;
        boolean z2;
        float f;
        int ordinal;
        float f2;
        w82 KUoIVIumpKat;
        w82 KUoIVIumpKat2;
        int ordinal2;
        mj1 mj1Var;
        float f3;
        int ordinal3;
        float f4;
        int ordinal4;
        float f5;
        int ordinal5;
        int[] iArr;
        boolean a92UlCVFR9N8;
        up0 up0Var;
        jx1 jx1Var;
        long j;
        boolean a92UlCVFR9N82;
        jx1 jx1Var2;
        Object nLZGh9p8gVSu;
        tf0 tf0Var;
        boolean z3;
        dj2 dj2Var;
        on onVar;
        Object nLZGh9p8gVSu2;
        on onVar2;
        Object nLZGh9p8gVSu3;
        tf0 tf0Var2 = (tf0) hpVar;
        tf0Var2.JHNfcAUfKc4G(546805032);
        if ((i & 6) == 0) {
            i3 = (tf0Var2.Y1f8riQaR6yg(0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            charSequence2 = charSequence;
            i3 |= tf0Var2.rtx2ld2ELZv4(charSequence2) ? 32 : 16;
        } else {
            charSequence2 = charSequence;
        }
        if ((i & 384) == 0) {
            i3 |= tf0Var2.rtx2ld2ELZv4(pe0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= tf0Var2.a92UlCVFR9N8(jg2Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= tf0Var2.rtx2ld2ELZv4(qe0Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= tf0Var2.rtx2ld2ELZv4(pe0Var2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= tf0Var2.rtx2ld2ELZv4(null) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= tf0Var2.rtx2ld2ELZv4(null) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= tf0Var2.rtx2ld2ELZv4(null) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= tf0Var2.rtx2ld2ELZv4(null) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if ((i2 & 6) == 0) {
            i4 = (tf0Var2.rtx2ld2ELZv4(null) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= tf0Var2.RAsUl2FVSrh6(false) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= tf0Var2.RAsUl2FVSrh6(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= tf0Var2.RAsUl2FVSrh6(false) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= tf0Var2.a92UlCVFR9N8(e81Var) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= tf0Var2.a92UlCVFR9N8(mi1Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= tf0Var2.a92UlCVFR9N8(pf2Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= tf0Var2.rtx2ld2ELZv4(pe0Var3) ? 8388608 : 4194304;
        }
        int i6 = i4;
        if (tf0Var2.Pf0ThKz3j5YS(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 4793491) == 4793490) ? false : true)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            boolean booleanValue = ((Boolean) mm2.e6tOsSdd2EFb(e81Var, tf0Var2, (i6 >> 12) & 14).getValue()).booleanValue();
            up0 up0Var2 = up0.wdg6QnbFHrFF;
            up0 up0Var3 = up0.OPXfSBeufaJ8;
            up0 up0Var4 = up0.rtx2ld2ELZv4;
            up0 up0Var5 = booleanValue ? up0Var4 : charSequence2.length() == 0 ? up0Var3 : up0Var2;
            long j2 = !z ? pf2Var.IAToe7bXGz4N : booleanValue ? pf2Var.ZbWwgt3aGe7A : pf2Var.pnx5pC0XzaCw;
            en2 en2Var = (en2) tf0Var2.wdg6QnbFHrFF(fn2.PxuCJdSBwIXG);
            dj2 dj2Var2 = en2Var.wdg6QnbFHrFF;
            dj2 dj2Var3 = en2Var.x50lh2ztY7Y5;
            long lS5Rgt96tfkO2 = dj2Var2.lS5Rgt96tfkO();
            hl.Companion.getClass();
            long j3 = hl.RAsUl2FVSrh6;
            boolean z4 = (hl.TSizfFm2Yiuu(lS5Rgt96tfkO2, j3) && !hl.TSizfFm2Yiuu(dj2Var3.lS5Rgt96tfkO(), j3)) || (!hl.TSizfFm2Yiuu(dj2Var2.lS5Rgt96tfkO(), j3) && hl.TSizfFm2Yiuu(dj2Var3.lS5Rgt96tfkO(), j3));
            long lS5Rgt96tfkO3 = dj2Var3.lS5Rgt96tfkO();
            if (z4 && lS5Rgt96tfkO3 == 16) {
                lS5Rgt96tfkO3 = j2;
            }
            long lS5Rgt96tfkO4 = dj2Var2.lS5Rgt96tfkO();
            long j4 = (z4 && lS5Rgt96tfkO4 == 16) ? j2 : lS5Rgt96tfkO4;
            boolean z5 = qe0Var != null;
            boolean z6 = z4;
            Object nLZGh9p8gVSu4 = tf0Var2.nLZGh9p8gVSu();
            fp fpVar = hp.Companion;
            fpVar.getClass();
            long j5 = lS5Rgt96tfkO3;
            jx1 jx1Var3 = fp.lS5Rgt96tfkO;
            if (nLZGh9p8gVSu4 == jx1Var3) {
                z2 = z5;
                nLZGh9p8gVSu4 = new gl2(new e91(up0Var5), null, "TextFieldInputState");
                tf0Var2.JTxCbbCwomzt(nLZGh9p8gVSu4);
            } else {
                z2 = z5;
            }
            gl2 gl2Var = (gl2) nLZGh9p8gVSu4;
            gl2Var.PxuCJdSBwIXG(up0Var5, tf0Var2, 48);
            to toVar = gl2Var.PxuCJdSBwIXG;
            mj1 mj1Var2 = gl2Var.Y1f8riQaR6yg;
            Object nLZGh9p8gVSu5 = tf0Var2.nLZGh9p8gVSu();
            if (nLZGh9p8gVSu5 == jx1Var3) {
                nLZGh9p8gVSu5 = new il2(gl2Var, 0);
                tf0Var2.JTxCbbCwomzt(nLZGh9p8gVSu5);
            }
            mm2.rtx2ld2ELZv4(gl2Var, (le0) nLZGh9p8gVSu5, tf0Var2);
            w82 KUoIVIumpKat3 = vi0.KUoIVIumpKat(e71.rtx2ld2ELZv4, tf0Var2);
            lm2 lm2Var = b51.QrzZRwfaDlRX;
            up0 up0Var6 = (up0) toVar.a92UlCVFR9N8();
            tf0Var2.IXK6ba3ucyzm(-1436405362);
            int ordinal6 = up0Var6.ordinal();
            float f6 = 0.0f;
            if (ordinal6 != 0) {
                if (ordinal6 != 1) {
                    if (ordinal6 != 2) {
                        u9.gPXPFXrUH4XX();
                        return;
                    }
                } else if (z2) {
                    f = 0.0f;
                    tf0Var2.gPXPFXrUH4XX(false);
                    Float valueOf = Float.valueOf(f);
                    up0 up0Var7 = (up0) mj1Var2.getValue();
                    tf0Var2.IXK6ba3ucyzm(-1436405362);
                    ordinal = up0Var7.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                u9.gPXPFXrUH4XX();
                                return;
                            }
                        } else if (z2) {
                            f2 = 0.0f;
                            tf0Var2.gPXPFXrUH4XX(false);
                            Float valueOf2 = Float.valueOf(f2);
                            gl2Var.a92UlCVFR9N8();
                            tf0Var2.IXK6ba3ucyzm(-709912974);
                            tf0Var2.gPXPFXrUH4XX(false);
                            fl2 QrzZRwfaDlRX = bs0.QrzZRwfaDlRX(gl2Var, valueOf, valueOf2, KUoIVIumpKat3, lm2Var, tf0Var2);
                            e71 e71Var = e71.OPXfSBeufaJ8;
                            KUoIVIumpKat = vi0.KUoIVIumpKat(e71Var, tf0Var2);
                            KUoIVIumpKat2 = vi0.KUoIVIumpKat(e71.wdg6QnbFHrFF, tf0Var2);
                            up0 up0Var8 = (up0) toVar.a92UlCVFR9N8();
                            tf0Var2.IXK6ba3ucyzm(-1093194547);
                            ordinal2 = up0Var8.ordinal();
                            if (ordinal2 != 0) {
                                mj1Var = mj1Var2;
                                if (ordinal2 != 1) {
                                    if (ordinal2 != 2) {
                                        u9.gPXPFXrUH4XX();
                                        return;
                                    }
                                }
                                f3 = 0.0f;
                                tf0Var2.gPXPFXrUH4XX(false);
                                Float valueOf3 = Float.valueOf(f3);
                                up0 up0Var9 = (up0) mj1Var.getValue();
                                tf0Var2.IXK6ba3ucyzm(-1093194547);
                                ordinal3 = up0Var9.ordinal();
                                if (ordinal3 != 0) {
                                    if (ordinal3 != 1) {
                                        if (ordinal3 != 2) {
                                            u9.gPXPFXrUH4XX();
                                            return;
                                        }
                                    }
                                    f4 = 0.0f;
                                    tf0Var2.gPXPFXrUH4XX(false);
                                    Float valueOf4 = Float.valueOf(f4);
                                    dl2 a92UlCVFR9N83 = gl2Var.a92UlCVFR9N8();
                                    tf0Var2.IXK6ba3ucyzm(-984009111);
                                    w82 w82Var = (!a92UlCVFR9N83.PxuCJdSBwIXG(up0Var4, up0Var3) && (a92UlCVFR9N83.PxuCJdSBwIXG(up0Var3, up0Var4) || a92UlCVFR9N83.PxuCJdSBwIXG(up0Var2, up0Var3))) ? KUoIVIumpKat2 : KUoIVIumpKat;
                                    tf0Var2.gPXPFXrUH4XX(false);
                                    fl2 QrzZRwfaDlRX2 = bs0.QrzZRwfaDlRX(gl2Var, valueOf3, valueOf4, w82Var, lm2Var, tf0Var2);
                                    up0 up0Var10 = (up0) toVar.a92UlCVFR9N8();
                                    tf0Var2.IXK6ba3ucyzm(-1258455321);
                                    ordinal4 = up0Var10.ordinal();
                                    if (ordinal4 != 0) {
                                        if (ordinal4 != 1) {
                                            if (ordinal4 != 2) {
                                                u9.gPXPFXrUH4XX();
                                                return;
                                            }
                                        } else if (z2) {
                                            f5 = 0.0f;
                                            tf0Var2.gPXPFXrUH4XX(false);
                                            Float valueOf5 = Float.valueOf(f5);
                                            up0 up0Var11 = (up0) mj1Var.getValue();
                                            tf0Var2.IXK6ba3ucyzm(-1258455321);
                                            ordinal5 = up0Var11.ordinal();
                                            if (ordinal5 != 0) {
                                                if (ordinal5 != 1) {
                                                    if (ordinal5 != 2) {
                                                        u9.gPXPFXrUH4XX();
                                                        return;
                                                    }
                                                }
                                            }
                                            f6 = 1.0f;
                                            tf0Var2.gPXPFXrUH4XX(false);
                                            Float valueOf6 = Float.valueOf(f6);
                                            gl2Var.a92UlCVFR9N8();
                                            tf0Var2.IXK6ba3ucyzm(2126293195);
                                            tf0Var2.gPXPFXrUH4XX(false);
                                            fl2 QrzZRwfaDlRX3 = bs0.QrzZRwfaDlRX(gl2Var, valueOf5, valueOf6, KUoIVIumpKat, lm2Var, tf0Var2);
                                            w82 KUoIVIumpKat4 = vi0.KUoIVIumpKat(e71Var, tf0Var2);
                                            up0 up0Var12 = (up0) mj1Var.getValue();
                                            tf0Var2.IXK6ba3ucyzm(-12973394);
                                            iArr = bg2.PxuCJdSBwIXG;
                                            long j6 = iArr[up0Var12.ordinal()] == 1 ? j5 : j4;
                                            tf0Var2.gPXPFXrUH4XX(false);
                                            tl a92UlCVFR9N84 = hl.a92UlCVFR9N8(j6);
                                            a92UlCVFR9N8 = tf0Var2.a92UlCVFR9N8(a92UlCVFR9N84);
                                            Object nLZGh9p8gVSu6 = tf0Var2.nLZGh9p8gVSu();
                                            int i7 = 7;
                                            if (!a92UlCVFR9N8) {
                                                fpVar.getClass();
                                            }
                                            lm2 lm2Var2 = new lm2(k1.RfyTYNmI9Srp, new y(i7, a92UlCVFR9N84));
                                            tf0Var2.JTxCbbCwomzt(lm2Var2);
                                            nLZGh9p8gVSu6 = lm2Var2;
                                            lm2 lm2Var3 = (lm2) nLZGh9p8gVSu6;
                                            up0Var = (up0) toVar.a92UlCVFR9N8();
                                            tf0Var2.IXK6ba3ucyzm(-12973394);
                                            if (iArr[up0Var.ordinal()] == 1) {
                                                jx1Var = jx1Var3;
                                                j = j5;
                                            } else {
                                                jx1Var = jx1Var3;
                                                j = j4;
                                            }
                                            tf0Var2.gPXPFXrUH4XX(false);
                                            hl hlVar = new hl(j);
                                            up0 up0Var13 = (up0) mj1Var.getValue();
                                            tf0Var2.IXK6ba3ucyzm(-12973394);
                                            long j7 = iArr[up0Var13.ordinal()] == 1 ? j5 : j4;
                                            tf0Var2.gPXPFXrUH4XX(false);
                                            hl hlVar2 = new hl(j7);
                                            gl2Var.a92UlCVFR9N8();
                                            tf0Var2.IXK6ba3ucyzm(1954111929);
                                            tf0Var2.gPXPFXrUH4XX(false);
                                            fl2 QrzZRwfaDlRX4 = bs0.QrzZRwfaDlRX(gl2Var, hlVar, hlVar2, KUoIVIumpKat4, lm2Var3, tf0Var2);
                                            tf0Var2.IXK6ba3ucyzm(-464752477);
                                            tf0Var2.gPXPFXrUH4XX(false);
                                            tl a92UlCVFR9N85 = hl.a92UlCVFR9N8(j2);
                                            a92UlCVFR9N82 = tf0Var2.a92UlCVFR9N8(a92UlCVFR9N85);
                                            Object nLZGh9p8gVSu7 = tf0Var2.nLZGh9p8gVSu();
                                            if (a92UlCVFR9N82) {
                                                jx1Var2 = jx1Var;
                                            } else {
                                                fpVar.getClass();
                                                jx1Var2 = jx1Var;
                                            }
                                            lm2 lm2Var4 = new lm2(k1.RfyTYNmI9Srp, new y(7, a92UlCVFR9N85));
                                            tf0Var2.JTxCbbCwomzt(lm2Var4);
                                            nLZGh9p8gVSu7 = lm2Var4;
                                            tf0Var2.IXK6ba3ucyzm(-464752477);
                                            tf0Var2.gPXPFXrUH4XX(false);
                                            hl hlVar3 = new hl(j2);
                                            tf0Var2.IXK6ba3ucyzm(-464752477);
                                            tf0Var2.gPXPFXrUH4XX(false);
                                            hl hlVar4 = new hl(j2);
                                            gl2Var.a92UlCVFR9N8();
                                            tf0Var2.IXK6ba3ucyzm(1190923886);
                                            tf0Var2.gPXPFXrUH4XX(false);
                                            fl2 QrzZRwfaDlRX5 = bs0.QrzZRwfaDlRX(gl2Var, hlVar3, hlVar4, KUoIVIumpKat4, (lm2) nLZGh9p8gVSu7, tf0Var2);
                                            nLZGh9p8gVSu = tf0Var2.nLZGh9p8gVSu();
                                            fpVar.getClass();
                                            if (nLZGh9p8gVSu == jx1Var2) {
                                                nLZGh9p8gVSu = new ag2();
                                                tf0Var2.JTxCbbCwomzt(nLZGh9p8gVSu);
                                            }
                                            ag2 ag2Var = (ag2) nLZGh9p8gVSu;
                                            if (qe0Var == null) {
                                                tf0Var2.IXK6ba3ucyzm(-1891724857);
                                                tf0Var2.gPXPFXrUH4XX(false);
                                                tf0Var = tf0Var2;
                                                z3 = false;
                                                onVar = null;
                                                dj2Var = dj2Var2;
                                            } else {
                                                tf0Var2.IXK6ba3ucyzm(-1891724856);
                                                tf0Var = tf0Var2;
                                                z3 = false;
                                                yf2 yf2Var = new yf2(dj2Var2, dj2Var3, QrzZRwfaDlRX, QrzZRwfaDlRX5, z6, QrzZRwfaDlRX4, qe0Var, ag2Var);
                                                dj2Var = dj2Var2;
                                                on kpCQ9veP6n3I = bs0.kpCQ9veP6n3I(-1076580032, yf2Var, tf0Var);
                                                tf0Var.gPXPFXrUH4XX(false);
                                                onVar = kpCQ9veP6n3I;
                                            }
                                            long j8 = !z ? pf2Var.kpCQ9veP6n3I : booleanValue ? pf2Var.jyegZNwi31qc : pf2Var.aF05bpZJlKEP;
                                            nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
                                            int i8 = 3;
                                            if (nLZGh9p8gVSu2 == jx1Var2) {
                                                jx1 jx1Var4 = jx1.S2OOm9zPNm0h;
                                                pb1 pb1Var = new pb1(QrzZRwfaDlRX2, i8);
                                                m9 m9Var = z72.PxuCJdSBwIXG;
                                                ty tyVar = new ty(pb1Var, jx1Var4);
                                                tf0Var.JTxCbbCwomzt(tyVar);
                                                nLZGh9p8gVSu2 = tyVar;
                                            }
                                            i92 i92Var = (i92) nLZGh9p8gVSu2;
                                            if (pe0Var2 == null && charSequence.length() == 0 && ((Boolean) i92Var.getValue()).booleanValue()) {
                                                tf0Var.IXK6ba3ucyzm(-1890614312);
                                                on kpCQ9veP6n3I2 = bs0.kpCQ9veP6n3I(1405547205, new zf2(QrzZRwfaDlRX2, j8, dj2Var, pe0Var2), tf0Var);
                                                tf0Var.gPXPFXrUH4XX(z3);
                                                onVar2 = kpCQ9veP6n3I2;
                                            } else {
                                                tf0Var.IXK6ba3ucyzm(-1890217110);
                                                tf0Var.gPXPFXrUH4XX(z3);
                                                onVar2 = null;
                                            }
                                            nLZGh9p8gVSu3 = tf0Var.nLZGh9p8gVSu();
                                            if (nLZGh9p8gVSu3 == jx1Var2) {
                                                jx1 jx1Var5 = jx1.S2OOm9zPNm0h;
                                                pb1 pb1Var2 = new pb1(QrzZRwfaDlRX3, 4);
                                                m9 m9Var2 = z72.PxuCJdSBwIXG;
                                                ty tyVar2 = new ty(pb1Var2, jx1Var5);
                                                tf0Var.JTxCbbCwomzt(tyVar2);
                                                nLZGh9p8gVSu3 = tyVar2;
                                            }
                                            tf0Var.IXK6ba3ucyzm(-1889500886);
                                            tf0Var.gPXPFXrUH4XX(z3);
                                            tf0Var.IXK6ba3ucyzm(-1888924534);
                                            tf0Var.gPXPFXrUH4XX(z3);
                                            tf0Var.IXK6ba3ucyzm(-1888749663);
                                            tf0Var.gPXPFXrUH4XX(z3);
                                            tf0Var.IXK6ba3ucyzm(-1888469888);
                                            tf0Var.gPXPFXrUH4XX(z3);
                                            tf0Var.IXK6ba3ucyzm(-1888176380);
                                            tf0Var.gPXPFXrUH4XX(z3);
                                            tf0Var.IXK6ba3ucyzm(-1887830698);
                                            tf0 tf0Var3 = tf0Var;
                                            ni0.Y1f8riQaR6yg(n61.Companion, pe0Var, onVar, onVar2, null, null, null, null, jg2Var, new cg2(new az0(0, 3, i92.class, QrzZRwfaDlRX, "value", "getValue()Ljava/lang/Object;")), bs0.kpCQ9veP6n3I(-1729858187, new tg(i8, pe0Var3), tf0Var), null, mi1Var, tf0Var3, ((i5 >> 3) & 112) | 6 | ((i6 << 21) & 234881024) | ((i5 << 18) & 1879048192), ((i6 >> 6) & 7168) | 48);
                                            tf0Var2 = tf0Var3;
                                            tf0Var2.gPXPFXrUH4XX(z3);
                                            gg1 gg1Var2 = mp.PxuCJdSBwIXG;
                                        }
                                    }
                                    f5 = 1.0f;
                                    tf0Var2.gPXPFXrUH4XX(false);
                                    Float valueOf52 = Float.valueOf(f5);
                                    up0 up0Var112 = (up0) mj1Var.getValue();
                                    tf0Var2.IXK6ba3ucyzm(-1258455321);
                                    ordinal5 = up0Var112.ordinal();
                                    if (ordinal5 != 0) {
                                    }
                                    f6 = 1.0f;
                                    tf0Var2.gPXPFXrUH4XX(false);
                                    Float valueOf62 = Float.valueOf(f6);
                                    gl2Var.a92UlCVFR9N8();
                                    tf0Var2.IXK6ba3ucyzm(2126293195);
                                    tf0Var2.gPXPFXrUH4XX(false);
                                    fl2 QrzZRwfaDlRX32 = bs0.QrzZRwfaDlRX(gl2Var, valueOf52, valueOf62, KUoIVIumpKat, lm2Var, tf0Var2);
                                    w82 KUoIVIumpKat42 = vi0.KUoIVIumpKat(e71Var, tf0Var2);
                                    up0 up0Var122 = (up0) mj1Var.getValue();
                                    tf0Var2.IXK6ba3ucyzm(-12973394);
                                    iArr = bg2.PxuCJdSBwIXG;
                                    if (iArr[up0Var122.ordinal()] == 1) {
                                    }
                                    tf0Var2.gPXPFXrUH4XX(false);
                                    tl a92UlCVFR9N842 = hl.a92UlCVFR9N8(j6);
                                    a92UlCVFR9N8 = tf0Var2.a92UlCVFR9N8(a92UlCVFR9N842);
                                    Object nLZGh9p8gVSu62 = tf0Var2.nLZGh9p8gVSu();
                                    int i72 = 7;
                                    if (!a92UlCVFR9N8) {
                                    }
                                    lm2 lm2Var22 = new lm2(k1.RfyTYNmI9Srp, new y(i72, a92UlCVFR9N842));
                                    tf0Var2.JTxCbbCwomzt(lm2Var22);
                                    nLZGh9p8gVSu62 = lm2Var22;
                                    lm2 lm2Var32 = (lm2) nLZGh9p8gVSu62;
                                    up0Var = (up0) toVar.a92UlCVFR9N8();
                                    tf0Var2.IXK6ba3ucyzm(-12973394);
                                    if (iArr[up0Var.ordinal()] == 1) {
                                    }
                                    tf0Var2.gPXPFXrUH4XX(false);
                                    hl hlVar5 = new hl(j);
                                    up0 up0Var132 = (up0) mj1Var.getValue();
                                    tf0Var2.IXK6ba3ucyzm(-12973394);
                                    if (iArr[up0Var132.ordinal()] == 1) {
                                    }
                                    tf0Var2.gPXPFXrUH4XX(false);
                                    hl hlVar22 = new hl(j7);
                                    gl2Var.a92UlCVFR9N8();
                                    tf0Var2.IXK6ba3ucyzm(1954111929);
                                    tf0Var2.gPXPFXrUH4XX(false);
                                    fl2 QrzZRwfaDlRX42 = bs0.QrzZRwfaDlRX(gl2Var, hlVar5, hlVar22, KUoIVIumpKat42, lm2Var32, tf0Var2);
                                    tf0Var2.IXK6ba3ucyzm(-464752477);
                                    tf0Var2.gPXPFXrUH4XX(false);
                                    tl a92UlCVFR9N852 = hl.a92UlCVFR9N8(j2);
                                    a92UlCVFR9N82 = tf0Var2.a92UlCVFR9N8(a92UlCVFR9N852);
                                    Object nLZGh9p8gVSu72 = tf0Var2.nLZGh9p8gVSu();
                                    if (a92UlCVFR9N82) {
                                    }
                                    lm2 lm2Var42 = new lm2(k1.RfyTYNmI9Srp, new y(7, a92UlCVFR9N852));
                                    tf0Var2.JTxCbbCwomzt(lm2Var42);
                                    nLZGh9p8gVSu72 = lm2Var42;
                                    tf0Var2.IXK6ba3ucyzm(-464752477);
                                    tf0Var2.gPXPFXrUH4XX(false);
                                    hl hlVar32 = new hl(j2);
                                    tf0Var2.IXK6ba3ucyzm(-464752477);
                                    tf0Var2.gPXPFXrUH4XX(false);
                                    hl hlVar42 = new hl(j2);
                                    gl2Var.a92UlCVFR9N8();
                                    tf0Var2.IXK6ba3ucyzm(1190923886);
                                    tf0Var2.gPXPFXrUH4XX(false);
                                    fl2 QrzZRwfaDlRX52 = bs0.QrzZRwfaDlRX(gl2Var, hlVar32, hlVar42, KUoIVIumpKat42, (lm2) nLZGh9p8gVSu72, tf0Var2);
                                    nLZGh9p8gVSu = tf0Var2.nLZGh9p8gVSu();
                                    fpVar.getClass();
                                    if (nLZGh9p8gVSu == jx1Var2) {
                                    }
                                    ag2 ag2Var2 = (ag2) nLZGh9p8gVSu;
                                    if (qe0Var == null) {
                                    }
                                    long j82 = !z ? pf2Var.kpCQ9veP6n3I : booleanValue ? pf2Var.jyegZNwi31qc : pf2Var.aF05bpZJlKEP;
                                    nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
                                    int i82 = 3;
                                    if (nLZGh9p8gVSu2 == jx1Var2) {
                                    }
                                    i92 i92Var2 = (i92) nLZGh9p8gVSu2;
                                    if (pe0Var2 == null) {
                                    }
                                    tf0Var.IXK6ba3ucyzm(-1890217110);
                                    tf0Var.gPXPFXrUH4XX(z3);
                                    onVar2 = null;
                                    nLZGh9p8gVSu3 = tf0Var.nLZGh9p8gVSu();
                                    if (nLZGh9p8gVSu3 == jx1Var2) {
                                    }
                                    tf0Var.IXK6ba3ucyzm(-1889500886);
                                    tf0Var.gPXPFXrUH4XX(z3);
                                    tf0Var.IXK6ba3ucyzm(-1888924534);
                                    tf0Var.gPXPFXrUH4XX(z3);
                                    tf0Var.IXK6ba3ucyzm(-1888749663);
                                    tf0Var.gPXPFXrUH4XX(z3);
                                    tf0Var.IXK6ba3ucyzm(-1888469888);
                                    tf0Var.gPXPFXrUH4XX(z3);
                                    tf0Var.IXK6ba3ucyzm(-1888176380);
                                    tf0Var.gPXPFXrUH4XX(z3);
                                    tf0Var.IXK6ba3ucyzm(-1887830698);
                                    tf0 tf0Var32 = tf0Var;
                                    ni0.Y1f8riQaR6yg(n61.Companion, pe0Var, onVar, onVar2, null, null, null, null, jg2Var, new cg2(new az0(0, 3, i92.class, QrzZRwfaDlRX, "value", "getValue()Ljava/lang/Object;")), bs0.kpCQ9veP6n3I(-1729858187, new tg(i82, pe0Var3), tf0Var), null, mi1Var, tf0Var32, ((i5 >> 3) & 112) | 6 | ((i6 << 21) & 234881024) | ((i5 << 18) & 1879048192), ((i6 >> 6) & 7168) | 48);
                                    tf0Var2 = tf0Var32;
                                    tf0Var2.gPXPFXrUH4XX(z3);
                                    gg1 gg1Var22 = mp.PxuCJdSBwIXG;
                                }
                                f4 = 1.0f;
                                tf0Var2.gPXPFXrUH4XX(false);
                                Float valueOf42 = Float.valueOf(f4);
                                dl2 a92UlCVFR9N832 = gl2Var.a92UlCVFR9N8();
                                tf0Var2.IXK6ba3ucyzm(-984009111);
                                if (a92UlCVFR9N832.PxuCJdSBwIXG(up0Var4, up0Var3)) {
                                    tf0Var2.gPXPFXrUH4XX(false);
                                    fl2 QrzZRwfaDlRX22 = bs0.QrzZRwfaDlRX(gl2Var, valueOf3, valueOf42, w82Var, lm2Var, tf0Var2);
                                    up0 up0Var102 = (up0) toVar.a92UlCVFR9N8();
                                    tf0Var2.IXK6ba3ucyzm(-1258455321);
                                    ordinal4 = up0Var102.ordinal();
                                    if (ordinal4 != 0) {
                                    }
                                    f5 = 1.0f;
                                    tf0Var2.gPXPFXrUH4XX(false);
                                    Float valueOf522 = Float.valueOf(f5);
                                    up0 up0Var1122 = (up0) mj1Var.getValue();
                                    tf0Var2.IXK6ba3ucyzm(-1258455321);
                                    ordinal5 = up0Var1122.ordinal();
                                    if (ordinal5 != 0) {
                                    }
                                    f6 = 1.0f;
                                    tf0Var2.gPXPFXrUH4XX(false);
                                    Float valueOf622 = Float.valueOf(f6);
                                    gl2Var.a92UlCVFR9N8();
                                    tf0Var2.IXK6ba3ucyzm(2126293195);
                                    tf0Var2.gPXPFXrUH4XX(false);
                                    fl2 QrzZRwfaDlRX322 = bs0.QrzZRwfaDlRX(gl2Var, valueOf522, valueOf622, KUoIVIumpKat, lm2Var, tf0Var2);
                                    w82 KUoIVIumpKat422 = vi0.KUoIVIumpKat(e71Var, tf0Var2);
                                    up0 up0Var1222 = (up0) mj1Var.getValue();
                                    tf0Var2.IXK6ba3ucyzm(-12973394);
                                    iArr = bg2.PxuCJdSBwIXG;
                                    if (iArr[up0Var1222.ordinal()] == 1) {
                                    }
                                    tf0Var2.gPXPFXrUH4XX(false);
                                    tl a92UlCVFR9N8422 = hl.a92UlCVFR9N8(j6);
                                    a92UlCVFR9N8 = tf0Var2.a92UlCVFR9N8(a92UlCVFR9N8422);
                                    Object nLZGh9p8gVSu622 = tf0Var2.nLZGh9p8gVSu();
                                    int i722 = 7;
                                    if (!a92UlCVFR9N8) {
                                    }
                                    lm2 lm2Var222 = new lm2(k1.RfyTYNmI9Srp, new y(i722, a92UlCVFR9N8422));
                                    tf0Var2.JTxCbbCwomzt(lm2Var222);
                                    nLZGh9p8gVSu622 = lm2Var222;
                                    lm2 lm2Var322 = (lm2) nLZGh9p8gVSu622;
                                    up0Var = (up0) toVar.a92UlCVFR9N8();
                                    tf0Var2.IXK6ba3ucyzm(-12973394);
                                    if (iArr[up0Var.ordinal()] == 1) {
                                    }
                                    tf0Var2.gPXPFXrUH4XX(false);
                                    hl hlVar52 = new hl(j);
                                    up0 up0Var1322 = (up0) mj1Var.getValue();
                                    tf0Var2.IXK6ba3ucyzm(-12973394);
                                    if (iArr[up0Var1322.ordinal()] == 1) {
                                    }
                                    tf0Var2.gPXPFXrUH4XX(false);
                                    hl hlVar222 = new hl(j7);
                                    gl2Var.a92UlCVFR9N8();
                                    tf0Var2.IXK6ba3ucyzm(1954111929);
                                    tf0Var2.gPXPFXrUH4XX(false);
                                    fl2 QrzZRwfaDlRX422 = bs0.QrzZRwfaDlRX(gl2Var, hlVar52, hlVar222, KUoIVIumpKat422, lm2Var322, tf0Var2);
                                    tf0Var2.IXK6ba3ucyzm(-464752477);
                                    tf0Var2.gPXPFXrUH4XX(false);
                                    tl a92UlCVFR9N8522 = hl.a92UlCVFR9N8(j2);
                                    a92UlCVFR9N82 = tf0Var2.a92UlCVFR9N8(a92UlCVFR9N8522);
                                    Object nLZGh9p8gVSu722 = tf0Var2.nLZGh9p8gVSu();
                                    if (a92UlCVFR9N82) {
                                    }
                                    lm2 lm2Var422 = new lm2(k1.RfyTYNmI9Srp, new y(7, a92UlCVFR9N8522));
                                    tf0Var2.JTxCbbCwomzt(lm2Var422);
                                    nLZGh9p8gVSu722 = lm2Var422;
                                    tf0Var2.IXK6ba3ucyzm(-464752477);
                                    tf0Var2.gPXPFXrUH4XX(false);
                                    hl hlVar322 = new hl(j2);
                                    tf0Var2.IXK6ba3ucyzm(-464752477);
                                    tf0Var2.gPXPFXrUH4XX(false);
                                    hl hlVar422 = new hl(j2);
                                    gl2Var.a92UlCVFR9N8();
                                    tf0Var2.IXK6ba3ucyzm(1190923886);
                                    tf0Var2.gPXPFXrUH4XX(false);
                                    fl2 QrzZRwfaDlRX522 = bs0.QrzZRwfaDlRX(gl2Var, hlVar322, hlVar422, KUoIVIumpKat422, (lm2) nLZGh9p8gVSu722, tf0Var2);
                                    nLZGh9p8gVSu = tf0Var2.nLZGh9p8gVSu();
                                    fpVar.getClass();
                                    if (nLZGh9p8gVSu == jx1Var2) {
                                    }
                                    ag2 ag2Var22 = (ag2) nLZGh9p8gVSu;
                                    if (qe0Var == null) {
                                    }
                                    long j822 = !z ? pf2Var.kpCQ9veP6n3I : booleanValue ? pf2Var.jyegZNwi31qc : pf2Var.aF05bpZJlKEP;
                                    nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
                                    int i822 = 3;
                                    if (nLZGh9p8gVSu2 == jx1Var2) {
                                    }
                                    i92 i92Var22 = (i92) nLZGh9p8gVSu2;
                                    if (pe0Var2 == null) {
                                    }
                                    tf0Var.IXK6ba3ucyzm(-1890217110);
                                    tf0Var.gPXPFXrUH4XX(z3);
                                    onVar2 = null;
                                    nLZGh9p8gVSu3 = tf0Var.nLZGh9p8gVSu();
                                    if (nLZGh9p8gVSu3 == jx1Var2) {
                                    }
                                    tf0Var.IXK6ba3ucyzm(-1889500886);
                                    tf0Var.gPXPFXrUH4XX(z3);
                                    tf0Var.IXK6ba3ucyzm(-1888924534);
                                    tf0Var.gPXPFXrUH4XX(z3);
                                    tf0Var.IXK6ba3ucyzm(-1888749663);
                                    tf0Var.gPXPFXrUH4XX(z3);
                                    tf0Var.IXK6ba3ucyzm(-1888469888);
                                    tf0Var.gPXPFXrUH4XX(z3);
                                    tf0Var.IXK6ba3ucyzm(-1888176380);
                                    tf0Var.gPXPFXrUH4XX(z3);
                                    tf0Var.IXK6ba3ucyzm(-1887830698);
                                    tf0 tf0Var322 = tf0Var;
                                    ni0.Y1f8riQaR6yg(n61.Companion, pe0Var, onVar, onVar2, null, null, null, null, jg2Var, new cg2(new az0(0, 3, i92.class, QrzZRwfaDlRX, "value", "getValue()Ljava/lang/Object;")), bs0.kpCQ9veP6n3I(-1729858187, new tg(i822, pe0Var3), tf0Var), null, mi1Var, tf0Var322, ((i5 >> 3) & 112) | 6 | ((i6 << 21) & 234881024) | ((i5 << 18) & 1879048192), ((i6 >> 6) & 7168) | 48);
                                    tf0Var2 = tf0Var322;
                                    tf0Var2.gPXPFXrUH4XX(z3);
                                    gg1 gg1Var222 = mp.PxuCJdSBwIXG;
                                }
                                tf0Var2.gPXPFXrUH4XX(false);
                                fl2 QrzZRwfaDlRX222 = bs0.QrzZRwfaDlRX(gl2Var, valueOf3, valueOf42, w82Var, lm2Var, tf0Var2);
                                up0 up0Var1022 = (up0) toVar.a92UlCVFR9N8();
                                tf0Var2.IXK6ba3ucyzm(-1258455321);
                                ordinal4 = up0Var1022.ordinal();
                                if (ordinal4 != 0) {
                                }
                                f5 = 1.0f;
                                tf0Var2.gPXPFXrUH4XX(false);
                                Float valueOf5222 = Float.valueOf(f5);
                                up0 up0Var11222 = (up0) mj1Var.getValue();
                                tf0Var2.IXK6ba3ucyzm(-1258455321);
                                ordinal5 = up0Var11222.ordinal();
                                if (ordinal5 != 0) {
                                }
                                f6 = 1.0f;
                                tf0Var2.gPXPFXrUH4XX(false);
                                Float valueOf6222 = Float.valueOf(f6);
                                gl2Var.a92UlCVFR9N8();
                                tf0Var2.IXK6ba3ucyzm(2126293195);
                                tf0Var2.gPXPFXrUH4XX(false);
                                fl2 QrzZRwfaDlRX3222 = bs0.QrzZRwfaDlRX(gl2Var, valueOf5222, valueOf6222, KUoIVIumpKat, lm2Var, tf0Var2);
                                w82 KUoIVIumpKat4222 = vi0.KUoIVIumpKat(e71Var, tf0Var2);
                                up0 up0Var12222 = (up0) mj1Var.getValue();
                                tf0Var2.IXK6ba3ucyzm(-12973394);
                                iArr = bg2.PxuCJdSBwIXG;
                                if (iArr[up0Var12222.ordinal()] == 1) {
                                }
                                tf0Var2.gPXPFXrUH4XX(false);
                                tl a92UlCVFR9N84222 = hl.a92UlCVFR9N8(j6);
                                a92UlCVFR9N8 = tf0Var2.a92UlCVFR9N8(a92UlCVFR9N84222);
                                Object nLZGh9p8gVSu6222 = tf0Var2.nLZGh9p8gVSu();
                                int i7222 = 7;
                                if (!a92UlCVFR9N8) {
                                }
                                lm2 lm2Var2222 = new lm2(k1.RfyTYNmI9Srp, new y(i7222, a92UlCVFR9N84222));
                                tf0Var2.JTxCbbCwomzt(lm2Var2222);
                                nLZGh9p8gVSu6222 = lm2Var2222;
                                lm2 lm2Var3222 = (lm2) nLZGh9p8gVSu6222;
                                up0Var = (up0) toVar.a92UlCVFR9N8();
                                tf0Var2.IXK6ba3ucyzm(-12973394);
                                if (iArr[up0Var.ordinal()] == 1) {
                                }
                                tf0Var2.gPXPFXrUH4XX(false);
                                hl hlVar522 = new hl(j);
                                up0 up0Var13222 = (up0) mj1Var.getValue();
                                tf0Var2.IXK6ba3ucyzm(-12973394);
                                if (iArr[up0Var13222.ordinal()] == 1) {
                                }
                                tf0Var2.gPXPFXrUH4XX(false);
                                hl hlVar2222 = new hl(j7);
                                gl2Var.a92UlCVFR9N8();
                                tf0Var2.IXK6ba3ucyzm(1954111929);
                                tf0Var2.gPXPFXrUH4XX(false);
                                fl2 QrzZRwfaDlRX4222 = bs0.QrzZRwfaDlRX(gl2Var, hlVar522, hlVar2222, KUoIVIumpKat4222, lm2Var3222, tf0Var2);
                                tf0Var2.IXK6ba3ucyzm(-464752477);
                                tf0Var2.gPXPFXrUH4XX(false);
                                tl a92UlCVFR9N85222 = hl.a92UlCVFR9N8(j2);
                                a92UlCVFR9N82 = tf0Var2.a92UlCVFR9N8(a92UlCVFR9N85222);
                                Object nLZGh9p8gVSu7222 = tf0Var2.nLZGh9p8gVSu();
                                if (a92UlCVFR9N82) {
                                }
                                lm2 lm2Var4222 = new lm2(k1.RfyTYNmI9Srp, new y(7, a92UlCVFR9N85222));
                                tf0Var2.JTxCbbCwomzt(lm2Var4222);
                                nLZGh9p8gVSu7222 = lm2Var4222;
                                tf0Var2.IXK6ba3ucyzm(-464752477);
                                tf0Var2.gPXPFXrUH4XX(false);
                                hl hlVar3222 = new hl(j2);
                                tf0Var2.IXK6ba3ucyzm(-464752477);
                                tf0Var2.gPXPFXrUH4XX(false);
                                hl hlVar4222 = new hl(j2);
                                gl2Var.a92UlCVFR9N8();
                                tf0Var2.IXK6ba3ucyzm(1190923886);
                                tf0Var2.gPXPFXrUH4XX(false);
                                fl2 QrzZRwfaDlRX5222 = bs0.QrzZRwfaDlRX(gl2Var, hlVar3222, hlVar4222, KUoIVIumpKat4222, (lm2) nLZGh9p8gVSu7222, tf0Var2);
                                nLZGh9p8gVSu = tf0Var2.nLZGh9p8gVSu();
                                fpVar.getClass();
                                if (nLZGh9p8gVSu == jx1Var2) {
                                }
                                ag2 ag2Var222 = (ag2) nLZGh9p8gVSu;
                                if (qe0Var == null) {
                                }
                                long j8222 = !z ? pf2Var.kpCQ9veP6n3I : booleanValue ? pf2Var.jyegZNwi31qc : pf2Var.aF05bpZJlKEP;
                                nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
                                int i8222 = 3;
                                if (nLZGh9p8gVSu2 == jx1Var2) {
                                }
                                i92 i92Var222 = (i92) nLZGh9p8gVSu2;
                                if (pe0Var2 == null) {
                                }
                                tf0Var.IXK6ba3ucyzm(-1890217110);
                                tf0Var.gPXPFXrUH4XX(z3);
                                onVar2 = null;
                                nLZGh9p8gVSu3 = tf0Var.nLZGh9p8gVSu();
                                if (nLZGh9p8gVSu3 == jx1Var2) {
                                }
                                tf0Var.IXK6ba3ucyzm(-1889500886);
                                tf0Var.gPXPFXrUH4XX(z3);
                                tf0Var.IXK6ba3ucyzm(-1888924534);
                                tf0Var.gPXPFXrUH4XX(z3);
                                tf0Var.IXK6ba3ucyzm(-1888749663);
                                tf0Var.gPXPFXrUH4XX(z3);
                                tf0Var.IXK6ba3ucyzm(-1888469888);
                                tf0Var.gPXPFXrUH4XX(z3);
                                tf0Var.IXK6ba3ucyzm(-1888176380);
                                tf0Var.gPXPFXrUH4XX(z3);
                                tf0Var.IXK6ba3ucyzm(-1887830698);
                                tf0 tf0Var3222 = tf0Var;
                                ni0.Y1f8riQaR6yg(n61.Companion, pe0Var, onVar, onVar2, null, null, null, null, jg2Var, new cg2(new az0(0, 3, i92.class, QrzZRwfaDlRX, "value", "getValue()Ljava/lang/Object;")), bs0.kpCQ9veP6n3I(-1729858187, new tg(i8222, pe0Var3), tf0Var), null, mi1Var, tf0Var3222, ((i5 >> 3) & 112) | 6 | ((i6 << 21) & 234881024) | ((i5 << 18) & 1879048192), ((i6 >> 6) & 7168) | 48);
                                tf0Var2 = tf0Var3222;
                                tf0Var2.gPXPFXrUH4XX(z3);
                                gg1 gg1Var2222 = mp.PxuCJdSBwIXG;
                            } else {
                                mj1Var = mj1Var2;
                            }
                            f3 = 1.0f;
                            tf0Var2.gPXPFXrUH4XX(false);
                            Float valueOf32 = Float.valueOf(f3);
                            up0 up0Var92 = (up0) mj1Var.getValue();
                            tf0Var2.IXK6ba3ucyzm(-1093194547);
                            ordinal3 = up0Var92.ordinal();
                            if (ordinal3 != 0) {
                            }
                            f4 = 1.0f;
                            tf0Var2.gPXPFXrUH4XX(false);
                            Float valueOf422 = Float.valueOf(f4);
                            dl2 a92UlCVFR9N8322 = gl2Var.a92UlCVFR9N8();
                            tf0Var2.IXK6ba3ucyzm(-984009111);
                            if (a92UlCVFR9N8322.PxuCJdSBwIXG(up0Var4, up0Var3)) {
                            }
                            tf0Var2.gPXPFXrUH4XX(false);
                            fl2 QrzZRwfaDlRX2222 = bs0.QrzZRwfaDlRX(gl2Var, valueOf32, valueOf422, w82Var, lm2Var, tf0Var2);
                            up0 up0Var10222 = (up0) toVar.a92UlCVFR9N8();
                            tf0Var2.IXK6ba3ucyzm(-1258455321);
                            ordinal4 = up0Var10222.ordinal();
                            if (ordinal4 != 0) {
                            }
                            f5 = 1.0f;
                            tf0Var2.gPXPFXrUH4XX(false);
                            Float valueOf52222 = Float.valueOf(f5);
                            up0 up0Var112222 = (up0) mj1Var.getValue();
                            tf0Var2.IXK6ba3ucyzm(-1258455321);
                            ordinal5 = up0Var112222.ordinal();
                            if (ordinal5 != 0) {
                            }
                            f6 = 1.0f;
                            tf0Var2.gPXPFXrUH4XX(false);
                            Float valueOf62222 = Float.valueOf(f6);
                            gl2Var.a92UlCVFR9N8();
                            tf0Var2.IXK6ba3ucyzm(2126293195);
                            tf0Var2.gPXPFXrUH4XX(false);
                            fl2 QrzZRwfaDlRX32222 = bs0.QrzZRwfaDlRX(gl2Var, valueOf52222, valueOf62222, KUoIVIumpKat, lm2Var, tf0Var2);
                            w82 KUoIVIumpKat42222 = vi0.KUoIVIumpKat(e71Var, tf0Var2);
                            up0 up0Var122222 = (up0) mj1Var.getValue();
                            tf0Var2.IXK6ba3ucyzm(-12973394);
                            iArr = bg2.PxuCJdSBwIXG;
                            if (iArr[up0Var122222.ordinal()] == 1) {
                            }
                            tf0Var2.gPXPFXrUH4XX(false);
                            tl a92UlCVFR9N842222 = hl.a92UlCVFR9N8(j6);
                            a92UlCVFR9N8 = tf0Var2.a92UlCVFR9N8(a92UlCVFR9N842222);
                            Object nLZGh9p8gVSu62222 = tf0Var2.nLZGh9p8gVSu();
                            int i72222 = 7;
                            if (!a92UlCVFR9N8) {
                            }
                            lm2 lm2Var22222 = new lm2(k1.RfyTYNmI9Srp, new y(i72222, a92UlCVFR9N842222));
                            tf0Var2.JTxCbbCwomzt(lm2Var22222);
                            nLZGh9p8gVSu62222 = lm2Var22222;
                            lm2 lm2Var32222 = (lm2) nLZGh9p8gVSu62222;
                            up0Var = (up0) toVar.a92UlCVFR9N8();
                            tf0Var2.IXK6ba3ucyzm(-12973394);
                            if (iArr[up0Var.ordinal()] == 1) {
                            }
                            tf0Var2.gPXPFXrUH4XX(false);
                            hl hlVar5222 = new hl(j);
                            up0 up0Var132222 = (up0) mj1Var.getValue();
                            tf0Var2.IXK6ba3ucyzm(-12973394);
                            if (iArr[up0Var132222.ordinal()] == 1) {
                            }
                            tf0Var2.gPXPFXrUH4XX(false);
                            hl hlVar22222 = new hl(j7);
                            gl2Var.a92UlCVFR9N8();
                            tf0Var2.IXK6ba3ucyzm(1954111929);
                            tf0Var2.gPXPFXrUH4XX(false);
                            fl2 QrzZRwfaDlRX42222 = bs0.QrzZRwfaDlRX(gl2Var, hlVar5222, hlVar22222, KUoIVIumpKat42222, lm2Var32222, tf0Var2);
                            tf0Var2.IXK6ba3ucyzm(-464752477);
                            tf0Var2.gPXPFXrUH4XX(false);
                            tl a92UlCVFR9N852222 = hl.a92UlCVFR9N8(j2);
                            a92UlCVFR9N82 = tf0Var2.a92UlCVFR9N8(a92UlCVFR9N852222);
                            Object nLZGh9p8gVSu72222 = tf0Var2.nLZGh9p8gVSu();
                            if (a92UlCVFR9N82) {
                            }
                            lm2 lm2Var42222 = new lm2(k1.RfyTYNmI9Srp, new y(7, a92UlCVFR9N852222));
                            tf0Var2.JTxCbbCwomzt(lm2Var42222);
                            nLZGh9p8gVSu72222 = lm2Var42222;
                            tf0Var2.IXK6ba3ucyzm(-464752477);
                            tf0Var2.gPXPFXrUH4XX(false);
                            hl hlVar32222 = new hl(j2);
                            tf0Var2.IXK6ba3ucyzm(-464752477);
                            tf0Var2.gPXPFXrUH4XX(false);
                            hl hlVar42222 = new hl(j2);
                            gl2Var.a92UlCVFR9N8();
                            tf0Var2.IXK6ba3ucyzm(1190923886);
                            tf0Var2.gPXPFXrUH4XX(false);
                            fl2 QrzZRwfaDlRX52222 = bs0.QrzZRwfaDlRX(gl2Var, hlVar32222, hlVar42222, KUoIVIumpKat42222, (lm2) nLZGh9p8gVSu72222, tf0Var2);
                            nLZGh9p8gVSu = tf0Var2.nLZGh9p8gVSu();
                            fpVar.getClass();
                            if (nLZGh9p8gVSu == jx1Var2) {
                            }
                            ag2 ag2Var2222 = (ag2) nLZGh9p8gVSu;
                            if (qe0Var == null) {
                            }
                            long j82222 = !z ? pf2Var.kpCQ9veP6n3I : booleanValue ? pf2Var.jyegZNwi31qc : pf2Var.aF05bpZJlKEP;
                            nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
                            int i82222 = 3;
                            if (nLZGh9p8gVSu2 == jx1Var2) {
                            }
                            i92 i92Var2222 = (i92) nLZGh9p8gVSu2;
                            if (pe0Var2 == null) {
                            }
                            tf0Var.IXK6ba3ucyzm(-1890217110);
                            tf0Var.gPXPFXrUH4XX(z3);
                            onVar2 = null;
                            nLZGh9p8gVSu3 = tf0Var.nLZGh9p8gVSu();
                            if (nLZGh9p8gVSu3 == jx1Var2) {
                            }
                            tf0Var.IXK6ba3ucyzm(-1889500886);
                            tf0Var.gPXPFXrUH4XX(z3);
                            tf0Var.IXK6ba3ucyzm(-1888924534);
                            tf0Var.gPXPFXrUH4XX(z3);
                            tf0Var.IXK6ba3ucyzm(-1888749663);
                            tf0Var.gPXPFXrUH4XX(z3);
                            tf0Var.IXK6ba3ucyzm(-1888469888);
                            tf0Var.gPXPFXrUH4XX(z3);
                            tf0Var.IXK6ba3ucyzm(-1888176380);
                            tf0Var.gPXPFXrUH4XX(z3);
                            tf0Var.IXK6ba3ucyzm(-1887830698);
                            tf0 tf0Var32222 = tf0Var;
                            ni0.Y1f8riQaR6yg(n61.Companion, pe0Var, onVar, onVar2, null, null, null, null, jg2Var, new cg2(new az0(0, 3, i92.class, QrzZRwfaDlRX, "value", "getValue()Ljava/lang/Object;")), bs0.kpCQ9veP6n3I(-1729858187, new tg(i82222, pe0Var3), tf0Var), null, mi1Var, tf0Var32222, ((i5 >> 3) & 112) | 6 | ((i6 << 21) & 234881024) | ((i5 << 18) & 1879048192), ((i6 >> 6) & 7168) | 48);
                            tf0Var2 = tf0Var32222;
                            tf0Var2.gPXPFXrUH4XX(z3);
                            gg1 gg1Var22222 = mp.PxuCJdSBwIXG;
                        }
                    }
                    f2 = 1.0f;
                    tf0Var2.gPXPFXrUH4XX(false);
                    Float valueOf22 = Float.valueOf(f2);
                    gl2Var.a92UlCVFR9N8();
                    tf0Var2.IXK6ba3ucyzm(-709912974);
                    tf0Var2.gPXPFXrUH4XX(false);
                    fl2 QrzZRwfaDlRX6 = bs0.QrzZRwfaDlRX(gl2Var, valueOf, valueOf22, KUoIVIumpKat3, lm2Var, tf0Var2);
                    e71 e71Var2 = e71.OPXfSBeufaJ8;
                    KUoIVIumpKat = vi0.KUoIVIumpKat(e71Var2, tf0Var2);
                    KUoIVIumpKat2 = vi0.KUoIVIumpKat(e71.wdg6QnbFHrFF, tf0Var2);
                    up0 up0Var82 = (up0) toVar.a92UlCVFR9N8();
                    tf0Var2.IXK6ba3ucyzm(-1093194547);
                    ordinal2 = up0Var82.ordinal();
                    if (ordinal2 != 0) {
                    }
                    f3 = 1.0f;
                    tf0Var2.gPXPFXrUH4XX(false);
                    Float valueOf322 = Float.valueOf(f3);
                    up0 up0Var922 = (up0) mj1Var.getValue();
                    tf0Var2.IXK6ba3ucyzm(-1093194547);
                    ordinal3 = up0Var922.ordinal();
                    if (ordinal3 != 0) {
                    }
                    f4 = 1.0f;
                    tf0Var2.gPXPFXrUH4XX(false);
                    Float valueOf4222 = Float.valueOf(f4);
                    dl2 a92UlCVFR9N83222 = gl2Var.a92UlCVFR9N8();
                    tf0Var2.IXK6ba3ucyzm(-984009111);
                    if (a92UlCVFR9N83222.PxuCJdSBwIXG(up0Var4, up0Var3)) {
                    }
                    tf0Var2.gPXPFXrUH4XX(false);
                    fl2 QrzZRwfaDlRX22222 = bs0.QrzZRwfaDlRX(gl2Var, valueOf322, valueOf4222, w82Var, lm2Var, tf0Var2);
                    up0 up0Var102222 = (up0) toVar.a92UlCVFR9N8();
                    tf0Var2.IXK6ba3ucyzm(-1258455321);
                    ordinal4 = up0Var102222.ordinal();
                    if (ordinal4 != 0) {
                    }
                    f5 = 1.0f;
                    tf0Var2.gPXPFXrUH4XX(false);
                    Float valueOf522222 = Float.valueOf(f5);
                    up0 up0Var1122222 = (up0) mj1Var.getValue();
                    tf0Var2.IXK6ba3ucyzm(-1258455321);
                    ordinal5 = up0Var1122222.ordinal();
                    if (ordinal5 != 0) {
                    }
                    f6 = 1.0f;
                    tf0Var2.gPXPFXrUH4XX(false);
                    Float valueOf622222 = Float.valueOf(f6);
                    gl2Var.a92UlCVFR9N8();
                    tf0Var2.IXK6ba3ucyzm(2126293195);
                    tf0Var2.gPXPFXrUH4XX(false);
                    fl2 QrzZRwfaDlRX322222 = bs0.QrzZRwfaDlRX(gl2Var, valueOf522222, valueOf622222, KUoIVIumpKat, lm2Var, tf0Var2);
                    w82 KUoIVIumpKat422222 = vi0.KUoIVIumpKat(e71Var2, tf0Var2);
                    up0 up0Var1222222 = (up0) mj1Var.getValue();
                    tf0Var2.IXK6ba3ucyzm(-12973394);
                    iArr = bg2.PxuCJdSBwIXG;
                    if (iArr[up0Var1222222.ordinal()] == 1) {
                    }
                    tf0Var2.gPXPFXrUH4XX(false);
                    tl a92UlCVFR9N8422222 = hl.a92UlCVFR9N8(j6);
                    a92UlCVFR9N8 = tf0Var2.a92UlCVFR9N8(a92UlCVFR9N8422222);
                    Object nLZGh9p8gVSu622222 = tf0Var2.nLZGh9p8gVSu();
                    int i722222 = 7;
                    if (!a92UlCVFR9N8) {
                    }
                    lm2 lm2Var222222 = new lm2(k1.RfyTYNmI9Srp, new y(i722222, a92UlCVFR9N8422222));
                    tf0Var2.JTxCbbCwomzt(lm2Var222222);
                    nLZGh9p8gVSu622222 = lm2Var222222;
                    lm2 lm2Var322222 = (lm2) nLZGh9p8gVSu622222;
                    up0Var = (up0) toVar.a92UlCVFR9N8();
                    tf0Var2.IXK6ba3ucyzm(-12973394);
                    if (iArr[up0Var.ordinal()] == 1) {
                    }
                    tf0Var2.gPXPFXrUH4XX(false);
                    hl hlVar52222 = new hl(j);
                    up0 up0Var1322222 = (up0) mj1Var.getValue();
                    tf0Var2.IXK6ba3ucyzm(-12973394);
                    if (iArr[up0Var1322222.ordinal()] == 1) {
                    }
                    tf0Var2.gPXPFXrUH4XX(false);
                    hl hlVar222222 = new hl(j7);
                    gl2Var.a92UlCVFR9N8();
                    tf0Var2.IXK6ba3ucyzm(1954111929);
                    tf0Var2.gPXPFXrUH4XX(false);
                    fl2 QrzZRwfaDlRX422222 = bs0.QrzZRwfaDlRX(gl2Var, hlVar52222, hlVar222222, KUoIVIumpKat422222, lm2Var322222, tf0Var2);
                    tf0Var2.IXK6ba3ucyzm(-464752477);
                    tf0Var2.gPXPFXrUH4XX(false);
                    tl a92UlCVFR9N8522222 = hl.a92UlCVFR9N8(j2);
                    a92UlCVFR9N82 = tf0Var2.a92UlCVFR9N8(a92UlCVFR9N8522222);
                    Object nLZGh9p8gVSu722222 = tf0Var2.nLZGh9p8gVSu();
                    if (a92UlCVFR9N82) {
                    }
                    lm2 lm2Var422222 = new lm2(k1.RfyTYNmI9Srp, new y(7, a92UlCVFR9N8522222));
                    tf0Var2.JTxCbbCwomzt(lm2Var422222);
                    nLZGh9p8gVSu722222 = lm2Var422222;
                    tf0Var2.IXK6ba3ucyzm(-464752477);
                    tf0Var2.gPXPFXrUH4XX(false);
                    hl hlVar322222 = new hl(j2);
                    tf0Var2.IXK6ba3ucyzm(-464752477);
                    tf0Var2.gPXPFXrUH4XX(false);
                    hl hlVar422222 = new hl(j2);
                    gl2Var.a92UlCVFR9N8();
                    tf0Var2.IXK6ba3ucyzm(1190923886);
                    tf0Var2.gPXPFXrUH4XX(false);
                    fl2 QrzZRwfaDlRX522222 = bs0.QrzZRwfaDlRX(gl2Var, hlVar322222, hlVar422222, KUoIVIumpKat422222, (lm2) nLZGh9p8gVSu722222, tf0Var2);
                    nLZGh9p8gVSu = tf0Var2.nLZGh9p8gVSu();
                    fpVar.getClass();
                    if (nLZGh9p8gVSu == jx1Var2) {
                    }
                    ag2 ag2Var22222 = (ag2) nLZGh9p8gVSu;
                    if (qe0Var == null) {
                    }
                    long j822222 = !z ? pf2Var.kpCQ9veP6n3I : booleanValue ? pf2Var.jyegZNwi31qc : pf2Var.aF05bpZJlKEP;
                    nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
                    int i822222 = 3;
                    if (nLZGh9p8gVSu2 == jx1Var2) {
                    }
                    i92 i92Var22222 = (i92) nLZGh9p8gVSu2;
                    if (pe0Var2 == null) {
                    }
                    tf0Var.IXK6ba3ucyzm(-1890217110);
                    tf0Var.gPXPFXrUH4XX(z3);
                    onVar2 = null;
                    nLZGh9p8gVSu3 = tf0Var.nLZGh9p8gVSu();
                    if (nLZGh9p8gVSu3 == jx1Var2) {
                    }
                    tf0Var.IXK6ba3ucyzm(-1889500886);
                    tf0Var.gPXPFXrUH4XX(z3);
                    tf0Var.IXK6ba3ucyzm(-1888924534);
                    tf0Var.gPXPFXrUH4XX(z3);
                    tf0Var.IXK6ba3ucyzm(-1888749663);
                    tf0Var.gPXPFXrUH4XX(z3);
                    tf0Var.IXK6ba3ucyzm(-1888469888);
                    tf0Var.gPXPFXrUH4XX(z3);
                    tf0Var.IXK6ba3ucyzm(-1888176380);
                    tf0Var.gPXPFXrUH4XX(z3);
                    tf0Var.IXK6ba3ucyzm(-1887830698);
                    tf0 tf0Var322222 = tf0Var;
                    ni0.Y1f8riQaR6yg(n61.Companion, pe0Var, onVar, onVar2, null, null, null, null, jg2Var, new cg2(new az0(0, 3, i92.class, QrzZRwfaDlRX6, "value", "getValue()Ljava/lang/Object;")), bs0.kpCQ9veP6n3I(-1729858187, new tg(i822222, pe0Var3), tf0Var), null, mi1Var, tf0Var322222, ((i5 >> 3) & 112) | 6 | ((i6 << 21) & 234881024) | ((i5 << 18) & 1879048192), ((i6 >> 6) & 7168) | 48);
                    tf0Var2 = tf0Var322222;
                    tf0Var2.gPXPFXrUH4XX(z3);
                    gg1 gg1Var222222 = mp.PxuCJdSBwIXG;
                }
            }
            f = 1.0f;
            tf0Var2.gPXPFXrUH4XX(false);
            Float valueOf7 = Float.valueOf(f);
            up0 up0Var72 = (up0) mj1Var2.getValue();
            tf0Var2.IXK6ba3ucyzm(-1436405362);
            ordinal = up0Var72.ordinal();
            if (ordinal != 0) {
            }
            f2 = 1.0f;
            tf0Var2.gPXPFXrUH4XX(false);
            Float valueOf222 = Float.valueOf(f2);
            gl2Var.a92UlCVFR9N8();
            tf0Var2.IXK6ba3ucyzm(-709912974);
            tf0Var2.gPXPFXrUH4XX(false);
            fl2 QrzZRwfaDlRX62 = bs0.QrzZRwfaDlRX(gl2Var, valueOf7, valueOf222, KUoIVIumpKat3, lm2Var, tf0Var2);
            e71 e71Var22 = e71.OPXfSBeufaJ8;
            KUoIVIumpKat = vi0.KUoIVIumpKat(e71Var22, tf0Var2);
            KUoIVIumpKat2 = vi0.KUoIVIumpKat(e71.wdg6QnbFHrFF, tf0Var2);
            up0 up0Var822 = (up0) toVar.a92UlCVFR9N8();
            tf0Var2.IXK6ba3ucyzm(-1093194547);
            ordinal2 = up0Var822.ordinal();
            if (ordinal2 != 0) {
            }
            f3 = 1.0f;
            tf0Var2.gPXPFXrUH4XX(false);
            Float valueOf3222 = Float.valueOf(f3);
            up0 up0Var9222 = (up0) mj1Var.getValue();
            tf0Var2.IXK6ba3ucyzm(-1093194547);
            ordinal3 = up0Var9222.ordinal();
            if (ordinal3 != 0) {
            }
            f4 = 1.0f;
            tf0Var2.gPXPFXrUH4XX(false);
            Float valueOf42222 = Float.valueOf(f4);
            dl2 a92UlCVFR9N832222 = gl2Var.a92UlCVFR9N8();
            tf0Var2.IXK6ba3ucyzm(-984009111);
            if (a92UlCVFR9N832222.PxuCJdSBwIXG(up0Var4, up0Var3)) {
            }
            tf0Var2.gPXPFXrUH4XX(false);
            fl2 QrzZRwfaDlRX222222 = bs0.QrzZRwfaDlRX(gl2Var, valueOf3222, valueOf42222, w82Var, lm2Var, tf0Var2);
            up0 up0Var1022222 = (up0) toVar.a92UlCVFR9N8();
            tf0Var2.IXK6ba3ucyzm(-1258455321);
            ordinal4 = up0Var1022222.ordinal();
            if (ordinal4 != 0) {
            }
            f5 = 1.0f;
            tf0Var2.gPXPFXrUH4XX(false);
            Float valueOf5222222 = Float.valueOf(f5);
            up0 up0Var11222222 = (up0) mj1Var.getValue();
            tf0Var2.IXK6ba3ucyzm(-1258455321);
            ordinal5 = up0Var11222222.ordinal();
            if (ordinal5 != 0) {
            }
            f6 = 1.0f;
            tf0Var2.gPXPFXrUH4XX(false);
            Float valueOf6222222 = Float.valueOf(f6);
            gl2Var.a92UlCVFR9N8();
            tf0Var2.IXK6ba3ucyzm(2126293195);
            tf0Var2.gPXPFXrUH4XX(false);
            fl2 QrzZRwfaDlRX3222222 = bs0.QrzZRwfaDlRX(gl2Var, valueOf5222222, valueOf6222222, KUoIVIumpKat, lm2Var, tf0Var2);
            w82 KUoIVIumpKat4222222 = vi0.KUoIVIumpKat(e71Var22, tf0Var2);
            up0 up0Var12222222 = (up0) mj1Var.getValue();
            tf0Var2.IXK6ba3ucyzm(-12973394);
            iArr = bg2.PxuCJdSBwIXG;
            if (iArr[up0Var12222222.ordinal()] == 1) {
            }
            tf0Var2.gPXPFXrUH4XX(false);
            tl a92UlCVFR9N84222222 = hl.a92UlCVFR9N8(j6);
            a92UlCVFR9N8 = tf0Var2.a92UlCVFR9N8(a92UlCVFR9N84222222);
            Object nLZGh9p8gVSu6222222 = tf0Var2.nLZGh9p8gVSu();
            int i7222222 = 7;
            if (!a92UlCVFR9N8) {
            }
            lm2 lm2Var2222222 = new lm2(k1.RfyTYNmI9Srp, new y(i7222222, a92UlCVFR9N84222222));
            tf0Var2.JTxCbbCwomzt(lm2Var2222222);
            nLZGh9p8gVSu6222222 = lm2Var2222222;
            lm2 lm2Var3222222 = (lm2) nLZGh9p8gVSu6222222;
            up0Var = (up0) toVar.a92UlCVFR9N8();
            tf0Var2.IXK6ba3ucyzm(-12973394);
            if (iArr[up0Var.ordinal()] == 1) {
            }
            tf0Var2.gPXPFXrUH4XX(false);
            hl hlVar522222 = new hl(j);
            up0 up0Var13222222 = (up0) mj1Var.getValue();
            tf0Var2.IXK6ba3ucyzm(-12973394);
            if (iArr[up0Var13222222.ordinal()] == 1) {
            }
            tf0Var2.gPXPFXrUH4XX(false);
            hl hlVar2222222 = new hl(j7);
            gl2Var.a92UlCVFR9N8();
            tf0Var2.IXK6ba3ucyzm(1954111929);
            tf0Var2.gPXPFXrUH4XX(false);
            fl2 QrzZRwfaDlRX4222222 = bs0.QrzZRwfaDlRX(gl2Var, hlVar522222, hlVar2222222, KUoIVIumpKat4222222, lm2Var3222222, tf0Var2);
            tf0Var2.IXK6ba3ucyzm(-464752477);
            tf0Var2.gPXPFXrUH4XX(false);
            tl a92UlCVFR9N85222222 = hl.a92UlCVFR9N8(j2);
            a92UlCVFR9N82 = tf0Var2.a92UlCVFR9N8(a92UlCVFR9N85222222);
            Object nLZGh9p8gVSu7222222 = tf0Var2.nLZGh9p8gVSu();
            if (a92UlCVFR9N82) {
            }
            lm2 lm2Var4222222 = new lm2(k1.RfyTYNmI9Srp, new y(7, a92UlCVFR9N85222222));
            tf0Var2.JTxCbbCwomzt(lm2Var4222222);
            nLZGh9p8gVSu7222222 = lm2Var4222222;
            tf0Var2.IXK6ba3ucyzm(-464752477);
            tf0Var2.gPXPFXrUH4XX(false);
            hl hlVar3222222 = new hl(j2);
            tf0Var2.IXK6ba3ucyzm(-464752477);
            tf0Var2.gPXPFXrUH4XX(false);
            hl hlVar4222222 = new hl(j2);
            gl2Var.a92UlCVFR9N8();
            tf0Var2.IXK6ba3ucyzm(1190923886);
            tf0Var2.gPXPFXrUH4XX(false);
            fl2 QrzZRwfaDlRX5222222 = bs0.QrzZRwfaDlRX(gl2Var, hlVar3222222, hlVar4222222, KUoIVIumpKat4222222, (lm2) nLZGh9p8gVSu7222222, tf0Var2);
            nLZGh9p8gVSu = tf0Var2.nLZGh9p8gVSu();
            fpVar.getClass();
            if (nLZGh9p8gVSu == jx1Var2) {
            }
            ag2 ag2Var222222 = (ag2) nLZGh9p8gVSu;
            if (qe0Var == null) {
            }
            long j8222222 = !z ? pf2Var.kpCQ9veP6n3I : booleanValue ? pf2Var.jyegZNwi31qc : pf2Var.aF05bpZJlKEP;
            nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
            int i8222222 = 3;
            if (nLZGh9p8gVSu2 == jx1Var2) {
            }
            i92 i92Var222222 = (i92) nLZGh9p8gVSu2;
            if (pe0Var2 == null) {
            }
            tf0Var.IXK6ba3ucyzm(-1890217110);
            tf0Var.gPXPFXrUH4XX(z3);
            onVar2 = null;
            nLZGh9p8gVSu3 = tf0Var.nLZGh9p8gVSu();
            if (nLZGh9p8gVSu3 == jx1Var2) {
            }
            tf0Var.IXK6ba3ucyzm(-1889500886);
            tf0Var.gPXPFXrUH4XX(z3);
            tf0Var.IXK6ba3ucyzm(-1888924534);
            tf0Var.gPXPFXrUH4XX(z3);
            tf0Var.IXK6ba3ucyzm(-1888749663);
            tf0Var.gPXPFXrUH4XX(z3);
            tf0Var.IXK6ba3ucyzm(-1888469888);
            tf0Var.gPXPFXrUH4XX(z3);
            tf0Var.IXK6ba3ucyzm(-1888176380);
            tf0Var.gPXPFXrUH4XX(z3);
            tf0Var.IXK6ba3ucyzm(-1887830698);
            tf0 tf0Var3222222 = tf0Var;
            ni0.Y1f8riQaR6yg(n61.Companion, pe0Var, onVar, onVar2, null, null, null, null, jg2Var, new cg2(new az0(0, 3, i92.class, QrzZRwfaDlRX62, "value", "getValue()Ljava/lang/Object;")), bs0.kpCQ9veP6n3I(-1729858187, new tg(i8222222, pe0Var3), tf0Var), null, mi1Var, tf0Var3222222, ((i5 >> 3) & 112) | 6 | ((i6 << 21) & 234881024) | ((i5 << 18) & 1879048192), ((i6 >> 6) & 7168) | 48);
            tf0Var2 = tf0Var3222222;
            tf0Var2.gPXPFXrUH4XX(z3);
            gg1 gg1Var2222222 = mp.PxuCJdSBwIXG;
        } else {
            tf0Var2.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B = tf0Var2.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new pe0() { // from class: wf2
                @Override // defpackage.pe0
                public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ki0.PxuCJdSBwIXG(charSequence, pe0Var, jg2Var, qe0Var, pe0Var2, z, e81Var, mi1Var, pf2Var, pe0Var3, (hp) obj, ki0.bEKsvqmvPh2y(i | 1), ki0.bEKsvqmvPh2y(i2));
                    return no2.PxuCJdSBwIXG;
                }
            };
        }
    }

    public static final zp0 QrzZRwfaDlRX(c7 c7Var, hp hpVar) {
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        return new zp0(c7Var, (hy) ((tf0) hpVar).wdg6QnbFHrFF(eq.rtx2ld2ELZv4));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RAsUl2FVSrh6(String str, ae0 ae0Var, n61 n61Var, hp hpVar, int i, int i2) {
        n61 n61Var2;
        n61 n61Var3;
        zs1 XL4ISE6Oc65B;
        str.getClass();
        ae0Var.getClass();
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(994096724);
        int i3 = (tf0Var.a92UlCVFR9N8(str) ? 4 : 2) | i | (tf0Var.rtx2ld2ELZv4(ae0Var) ? 32 : 16);
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            n61Var2 = n61Var;
            i3 |= tf0Var.a92UlCVFR9N8(n61Var2) ? 256 : 128;
            int i5 = 0;
            if (tf0Var.Pf0ThKz3j5YS(i3 & 1, (i3 & 147) == 146)) {
                tf0Var.i68hK7ahKtgp();
                n61Var3 = n61Var2;
            } else {
                n61Var3 = i4 != 0 ? n61.Companion : n61Var2;
                gg1 gg1Var = mp.PxuCJdSBwIXG;
                dj2 dj2Var = ((en2) tf0Var.wdg6QnbFHrFF(fn2.PxuCJdSBwIXG)).RAsUl2FVSrh6;
                ln1 ln1Var = new ln1();
                j11.Companion.getClass();
                float f = j11.lS5Rgt96tfkO;
                o11.Companion.getClass();
                dj2 PxuCJdSBwIXG2 = dj2.PxuCJdSBwIXG(dj2Var, 0L, 0L, null, null, 0L, 0L, ln1Var, new p11(f, 17), 15204351);
                n61 lS5Rgt96tfkO2 = c62.lS5Rgt96tfkO(n61Var3, 1.0f);
                s.Companion.getClass();
                by1 PxuCJdSBwIXG3 = ay1.PxuCJdSBwIXG(new y9(4.0f, new u9(i5)), r.x50lh2ztY7Y5, tf0Var, 54);
                int hashCode = Long.hashCode(tf0Var.wLFCmsViZrNT);
                il1 x50lh2ztY7Y5 = tf0Var.x50lh2ztY7Y5();
                n61 xfACYKDMU6Dj = ov2.xfACYKDMU6Dj(tf0Var, lS5Rgt96tfkO2);
                yo.Companion.getClass();
                dq dqVar = xo.lS5Rgt96tfkO;
                tf0Var.ngxnMNrpiKat();
                if (tf0Var.zf8DYfih6EZu) {
                    tf0Var.dgRBjINgWbAK(dqVar);
                } else {
                    tf0Var.hVNtCUZb4tYH();
                }
                p7 p7Var = xo.a92UlCVFR9N8;
                th0.tmVwIGCQF4zR(tf0Var, p7Var, PxuCJdSBwIXG3);
                p7 p7Var2 = xo.e9gEMXR7LXtO;
                th0.tmVwIGCQF4zR(tf0Var, p7Var2, x50lh2ztY7Y5);
                Integer valueOf = Integer.valueOf(hashCode);
                p7 p7Var3 = xo.RAsUl2FVSrh6;
                th0.tmVwIGCQF4zR(tf0Var, p7Var3, valueOf);
                k1 k1Var = xo.rtx2ld2ELZv4;
                th0.kpCQ9veP6n3I(tf0Var, k1Var);
                p7 p7Var4 = xo.Y1f8riQaR6yg;
                th0.tmVwIGCQF4zR(tf0Var, p7Var4, xfACYKDMU6Dj);
                k61 k61Var = n61.Companion;
                int i6 = i3;
                n61 kpCQ9veP6n3I = zv.kpCQ9veP6n3I(1, tf0Var, ae0Var, hq0.BRwzKIf41E4i(c62.a92UlCVFR9N8(k61Var, 48.0f), px1.PxuCJdSBwIXG), false);
                j51 Y1f8riQaR6yg2 = xe.Y1f8riQaR6yg(r.a92UlCVFR9N8, false);
                int hashCode2 = Long.hashCode(tf0Var.wLFCmsViZrNT);
                il1 x50lh2ztY7Y52 = tf0Var.x50lh2ztY7Y5();
                n61 xfACYKDMU6Dj2 = ov2.xfACYKDMU6Dj(tf0Var, kpCQ9veP6n3I);
                tf0Var.ngxnMNrpiKat();
                if (tf0Var.zf8DYfih6EZu) {
                    tf0Var.dgRBjINgWbAK(dqVar);
                } else {
                    tf0Var.hVNtCUZb4tYH();
                }
                th0.tmVwIGCQF4zR(tf0Var, p7Var, Y1f8riQaR6yg2);
                th0.tmVwIGCQF4zR(tf0Var, p7Var2, x50lh2ztY7Y52);
                o0.EcgxDIVH5in8(hashCode2, tf0Var, p7Var3, tf0Var, k1Var);
                th0.tmVwIGCQF4zR(tf0Var, p7Var4, xfACYKDMU6Dj2);
                en0 en0Var = bs0.IAToe7bXGz4N;
                if (en0Var == null) {
                    cn0 cn0Var = new cn0(24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                    int i7 = op2.PxuCJdSBwIXG;
                    hl.Companion.getClass();
                    m82 m82Var = new m82(hl.lS5Rgt96tfkO);
                    ta2.Companion.getClass();
                    va2.Companion.getClass();
                    ArrayList arrayList = new ArrayList(32);
                    arrayList.add(new jk1(20.0f, 11.0f));
                    arrayList.add(new hk1(7.83f));
                    arrayList.add(new qk1(5.59f, -5.59f));
                    arrayList.add(new ik1(12.0f, 4.0f));
                    arrayList.add(new qk1(-8.0f, 8.0f));
                    arrayList.add(new qk1(8.0f, 8.0f));
                    arrayList.add(new qk1(1.41f, -1.41f));
                    arrayList.add(new ik1(7.83f, 13.0f));
                    arrayList.add(new hk1(20.0f));
                    arrayList.add(new vk1(-2.0f));
                    arrayList.add(fk1.TSizfFm2Yiuu);
                    if (cn0Var.dgRBjINgWbAK) {
                        ep0.lS5Rgt96tfkO("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                    }
                    ((bn0) cn0Var.OPXfSBeufaJ8.get(r7.size() - 1)).wdg6QnbFHrFF.add(new rp2("", arrayList, 0, m82Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
                    en0Var = cn0Var.PxuCJdSBwIXG();
                    bs0.IAToe7bXGz4N = en0Var;
                }
                en0 en0Var2 = en0Var;
                t92 t92Var = rl.PxuCJdSBwIXG;
                wm0.PxuCJdSBwIXG(en0Var2, c62.a92UlCVFR9N8(k61Var, 24.0f), ((pl) tf0Var.wdg6QnbFHrFF(t92Var)).PxuCJdSBwIXG, tf0Var, 432);
                tf0Var.gPXPFXrUH4XX(true);
                long j = ((pl) tf0Var.wdg6QnbFHrFF(t92Var)).PxuCJdSBwIXG;
                si2.Companion.getClass();
                gi2.lS5Rgt96tfkO(str, null, j, 0L, 0L, null, 0L, 2, false, 1, 0, PxuCJdSBwIXG2, tf0Var, i6 & 14, 24960, 110586);
                tf0Var = tf0Var;
                tf0Var.gPXPFXrUH4XX(true);
            }
            XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
            if (XL4ISE6Oc65B == null) {
                XL4ISE6Oc65B.Y1f8riQaR6yg = new jy0(str, ae0Var, n61Var3, i, i2);
                return;
            }
            return;
        }
        n61Var2 = n61Var;
        int i52 = 0;
        if (tf0Var.Pf0ThKz3j5YS(i3 & 1, (i3 & 147) == 146)) {
        }
        XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B == null) {
        }
    }

    public static void RfyTYNmI9Srp(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void S2OOm9zPNm0h(k30 k30Var, th0 th0Var, long j) {
        k30.Companion.getClass();
        if (th0Var instanceof xh1) {
            qt1 qt1Var = ((xh1) th0Var).TSizfFm2Yiuu;
            float f = qt1Var.PxuCJdSBwIXG;
            float f2 = qt1Var.lS5Rgt96tfkO;
            long floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
            float f3 = qt1Var.TSizfFm2Yiuu - qt1Var.PxuCJdSBwIXG;
            float f4 = qt1Var.Y1f8riQaR6yg - qt1Var.lS5Rgt96tfkO;
            k30Var.amuv7NJvPxHu(j, floatToRawIntBits, (Float.floatToRawIntBits(f3) << 32) | (4294967295L & Float.floatToRawIntBits(f4)), 3);
            return;
        }
        boolean z = th0Var instanceof yh1;
        u70 u70Var = u70.PxuCJdSBwIXG;
        if (!z) {
            if (th0Var instanceof wh1) {
                k30Var.JHNfcAUfKc4G(((wh1) th0Var).TSizfFm2Yiuu, j, u70Var);
                return;
            } else {
                u9.gPXPFXrUH4XX();
                return;
            }
        }
        yh1 yh1Var = (yh1) th0Var;
        r4 r4Var = yh1Var.Y1f8riQaR6yg;
        if (r4Var != null) {
            k30Var.JHNfcAUfKc4G(r4Var, j, u70Var);
            return;
        }
        mx1 mx1Var = yh1Var.TSizfFm2Yiuu;
        float f5 = mx1Var.lS5Rgt96tfkO;
        float f6 = mx1Var.PxuCJdSBwIXG;
        float intBitsToFloat = Float.intBitsToFloat((int) (mx1Var.rtx2ld2ELZv4 >> 32));
        float f7 = mx1Var.TSizfFm2Yiuu - f6;
        float f8 = mx1Var.Y1f8riQaR6yg - f5;
        k30Var.ZbWwgt3aGe7A(j, (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L), (Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L), (4294967295L & Float.floatToRawIntBits(intBitsToFloat)) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    public static final boolean S9EYkSpbGuxq(qt1 qt1Var, float f, float f2) {
        float f3 = qt1Var.PxuCJdSBwIXG;
        if (f > qt1Var.TSizfFm2Yiuu || f3 > f) {
            return false;
        }
        return f2 <= qt1Var.Y1f8riQaR6yg && qt1Var.lS5Rgt96tfkO <= f2;
    }

    public static final long TSizfFm2Yiuu(int i) {
        long j = i << 32;
        nu0 nu0Var = ou0.Companion;
        return j;
    }

    public static final void VhhvGxCb8gfr(h8 h8Var, long j, float f, e8 e8Var, j8 j8Var, le0 le0Var) {
        long TSizfFm2Yiuu2 = f == 0.0f ? e8Var.TSizfFm2Yiuu() : (long) ((j - h8Var.TSizfFm2Yiuu) / f);
        h8Var.RAsUl2FVSrh6 = j;
        h8Var.e9gEMXR7LXtO.setValue(e8Var.lS5Rgt96tfkO(TSizfFm2Yiuu2));
        h8Var.a92UlCVFR9N8 = e8Var.a92UlCVFR9N8(TSizfFm2Yiuu2);
        if (e8Var.RAsUl2FVSrh6(TSizfFm2Yiuu2)) {
            h8Var.rtx2ld2ELZv4 = h8Var.RAsUl2FVSrh6;
            h8Var.OPXfSBeufaJ8.setValue(Boolean.FALSE);
        }
        ngxnMNrpiKat(h8Var, j8Var);
        le0Var.OPXfSBeufaJ8(h8Var);
    }

    public static final void XL4ISE6Oc65B(hu huVar, CancellationException cancellationException) {
        xs0 xs0Var = (xs0) huVar.S2OOm9zPNm0h(ih0.BRwzKIf41E4i);
        if (xs0Var != null) {
            xs0Var.a92UlCVFR9N8(cancellationException);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        if (r2 == defpackage.fp.lS5Rgt96tfkO) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Y1f8riQaR6yg(lb1 lb1Var, hp hpVar, int i) {
        lb1 lb1Var2;
        lb1Var.getClass();
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(1723138758);
        int i2 = (tf0Var.rtx2ld2ELZv4(lb1Var) ? 4 : 2) | i;
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 3) != 2)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            LaunchRoute launchRoute = LaunchRoute.INSTANCE;
            boolean rtx2ld2ELZv4 = tf0Var.rtx2ld2ELZv4(lb1Var);
            Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
            if (!rtx2ld2ELZv4) {
                hp.Companion.getClass();
            }
            nLZGh9p8gVSu = new r3s1LDPKFs1S(21, lb1Var);
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
            lb1Var2 = lb1Var;
            vi0.e9gEMXR7LXtO(lb1Var2, launchRoute, null, null, null, null, null, null, null, (le0) nLZGh9p8gVSu, tf0Var, (i2 & 14) | 48);
        } else {
            lb1Var2 = lb1Var;
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new l4(i, 11, lb1Var2);
        }
    }

    public static final void ZbWwgt3aGe7A(hu huVar) {
        xs0 xs0Var = (xs0) huVar.S2OOm9zPNm0h(ih0.BRwzKIf41E4i);
        if (xs0Var != null && !xs0Var.lS5Rgt96tfkO()) {
            throw xs0Var.pnx5pC0XzaCw();
        }
    }

    public static final mx1 a92UlCVFR9N8(float f, float f2, float f3, float f4, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2));
        return new mx1(f, f2, f3, f4, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
    }

    public static pl aF05bpZJlKEP(hp hpVar) {
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        return (pl) ((tf0) hpVar).wdg6QnbFHrFF(rl.PxuCJdSBwIXG);
    }

    public static final s00 amuv7NJvPxHu(xs0 xs0Var, boolean z, at0 at0Var) {
        if (xs0Var instanceof et0) {
            return ((et0) xs0Var).nxJAScVArhE9(z, at0Var);
        }
        return xs0Var.ryVscX7ZL4Ux(at0Var.XL4ISE6Oc65B(), z, new RAsUl2FVSrh6(1, at0Var, at0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 2));
    }

    public static final int bEKsvqmvPh2y(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static Object cpQdD2nAriOS(float f, float f2, km2 km2Var, pe0 pe0Var, jc2 jc2Var, int i) {
        e80 e80Var = km2Var;
        if ((i & 8) != 0) {
            e80Var = b51.ngxnMNrpiKat(0.0f, 0.0f, null, 7);
        }
        e80 e80Var2 = e80Var;
        lm2 lm2Var = b51.QrzZRwfaDlRX;
        Float f3 = new Float(f);
        Float f4 = new Float(f2);
        Float f5 = new Float(0.0f);
        le0 le0Var = lm2Var.PxuCJdSBwIXG;
        o8 o8Var = (o8) le0Var.OPXfSBeufaJ8(f5);
        if (o8Var == null) {
            o8Var = ((o8) le0Var.OPXfSBeufaJ8(f3)).TSizfFm2Yiuu();
        }
        o8 o8Var2 = o8Var;
        Object x50lh2ztY7Y5 = x50lh2ztY7Y5(new j8(lm2Var, f3, o8Var2, 56), new sd2(e80Var2, lm2Var, f3, f4, o8Var2), Long.MIN_VALUE, new xw1(9, pe0Var), jc2Var);
        no2 no2Var = no2.PxuCJdSBwIXG;
        su suVar = su.rtx2ld2ELZv4;
        if (x50lh2ztY7Y5 != suVar) {
            x50lh2ztY7Y5 = no2Var;
        }
        return x50lh2ztY7Y5 == suVar ? x50lh2ztY7Y5 : no2Var;
    }

    public static final m61 dgRBjINgWbAK(tx txVar, int i) {
        m61 m61Var = ((m61) txVar).rtx2ld2ELZv4.cpQdD2nAriOS;
        if (m61Var == null || (m61Var.dgRBjINgWbAK & i) == 0) {
            return null;
        }
        while (m61Var != null) {
            int i2 = m61Var.wdg6QnbFHrFF;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return m61Var;
            }
            m61Var = m61Var.cpQdD2nAriOS;
        }
        return null;
    }

    public static final boolean e6tOsSdd2EFb(ab0 ab0Var, int i, le0 le0Var) {
        qt1 qt1Var;
        f91 f91Var = new f91(new ab0[16]);
        EcgxDIVH5in8(ab0Var, f91Var);
        int i2 = f91Var.wdg6QnbFHrFF;
        if (i2 <= 1) {
            ab0 ab0Var2 = (ab0) (i2 == 0 ? null : f91Var.rtx2ld2ELZv4[0]);
            if (ab0Var2 != null) {
                return ((Boolean) le0Var.OPXfSBeufaJ8(ab0Var2)).booleanValue();
            }
        } else {
            ga0.Companion.getClass();
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                qt1 XL4ISE6Oc65B = zv.XL4ISE6Oc65B(ab0Var);
                float f = XL4ISE6Oc65B.PxuCJdSBwIXG;
                float f2 = XL4ISE6Oc65B.lS5Rgt96tfkO;
                qt1Var = new qt1(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    u9.rtx2ld2ELZv4("This function should only be used for 2-D focus search");
                    return false;
                }
                qt1 XL4ISE6Oc65B2 = zv.XL4ISE6Oc65B(ab0Var);
                float f3 = XL4ISE6Oc65B2.TSizfFm2Yiuu;
                float f4 = XL4ISE6Oc65B2.Y1f8riQaR6yg;
                qt1Var = new qt1(f3, f4, f3, f4);
            }
            ab0 IAToe7bXGz4N = IAToe7bXGz4N(f91Var, qt1Var, i);
            if (IAToe7bXGz4N != null) {
                return ((Boolean) le0Var.OPXfSBeufaJ8(IAToe7bXGz4N)).booleanValue();
            }
        }
        return false;
    }

    public static final mx1 e9gEMXR7LXtO(qt1 qt1Var, long j, long j2, long j3, long j4) {
        return new mx1(qt1Var.PxuCJdSBwIXG, qt1Var.lS5Rgt96tfkO, qt1Var.TSizfFm2Yiuu, qt1Var.Y1f8riQaR6yg, j, j2, j3, j4);
    }

    public static final boolean gGoUzNp9JO5I(qt1 qt1Var, qt1 qt1Var2, qt1 qt1Var3, int i) {
        if (!POWyO8hTM6YC(i, qt1Var, qt1Var3)) {
            return false;
        }
        if (POWyO8hTM6YC(i, qt1Var2, qt1Var3) && !gPXPFXrUH4XX(qt1Var3, qt1Var, qt1Var2, i)) {
            return !gPXPFXrUH4XX(qt1Var3, qt1Var2, qt1Var, i) && i68hK7ahKtgp(i, qt1Var3, qt1Var) < i68hK7ahKtgp(i, qt1Var3, qt1Var2);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
    
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0055, code lost:
    
        if (r21 != 3) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
    
        if (r21 != 4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (r21 != 3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        r1 = r11 - r19.TSizfFm2Yiuu;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        if (r1 >= 0.0f) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
    
        if (r21 != 3) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009b, code lost:
    
        if (r11 >= 1.0f) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009d, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:
    
        if (r1 >= r11) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a3, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
    
        if (r21 != 4) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
    
        if (r21 != 5) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
    
        if (r21 != 6) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a4, code lost:
    
        defpackage.u9.rtx2ld2ELZv4("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a7, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0068, code lost:
    
        if (r21 != 4) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006a, code lost:
    
        r1 = r19.PxuCJdSBwIXG - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006e, code lost:
    
        if (r21 != 5) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0070, code lost:
    
        r1 = r9 - r19.Y1f8riQaR6yg;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0075, code lost:
    
        if (r21 != 6) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0077, code lost:
    
        r1 = r19.lS5Rgt96tfkO - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a8, code lost:
    
        defpackage.u9.rtx2ld2ELZv4("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ab, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x005d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0042, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0049, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0050, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00ac, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean gPXPFXrUH4XX(qt1 qt1Var, qt1 qt1Var2, qt1 qt1Var3, int i) {
        boolean BRwzKIf41E4i = BRwzKIf41E4i(i, qt1Var3, qt1Var);
        float f = qt1Var3.lS5Rgt96tfkO;
        float f2 = qt1Var3.Y1f8riQaR6yg;
        float f3 = qt1Var3.PxuCJdSBwIXG;
        float f4 = qt1Var3.TSizfFm2Yiuu;
        float f5 = qt1Var.Y1f8riQaR6yg;
        float f6 = qt1Var.lS5Rgt96tfkO;
        float f7 = qt1Var.TSizfFm2Yiuu;
        float f8 = qt1Var.PxuCJdSBwIXG;
        if (BRwzKIf41E4i || !BRwzKIf41E4i(i, qt1Var2, qt1Var)) {
            return false;
        }
        fa0 fa0Var = ga0.Companion;
        fa0Var.getClass();
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        u9.rtx2ld2ELZv4("This function should only be used for 2-D focus search");
                        return false;
                    }
                }
            }
        }
    }

    public static final long i68hK7ahKtgp(int i, qt1 qt1Var, qt1 qt1Var2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        fa0 fa0Var = ga0.Companion;
        fa0Var.getClass();
        if (i == 3) {
            f = qt1Var.PxuCJdSBwIXG;
            f2 = qt1Var2.TSizfFm2Yiuu;
        } else if (i == 4) {
            f = qt1Var2.PxuCJdSBwIXG;
            f2 = qt1Var.TSizfFm2Yiuu;
        } else if (i == 5) {
            f = qt1Var.lS5Rgt96tfkO;
            f2 = qt1Var2.Y1f8riQaR6yg;
        } else {
            if (i != 6) {
                u9.rtx2ld2ELZv4("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = qt1Var2.lS5Rgt96tfkO;
            f2 = qt1Var.Y1f8riQaR6yg;
        }
        float f6 = f - f2;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        long j = (long) f6;
        fa0Var.getClass();
        if (i == 3 || i == 4) {
            float f7 = qt1Var.lS5Rgt96tfkO;
            f3 = ((qt1Var.Y1f8riQaR6yg - f7) / 2.0f) + f7;
            f4 = qt1Var2.lS5Rgt96tfkO;
            f5 = qt1Var2.Y1f8riQaR6yg;
        } else {
            if (i != 5 && i != 6) {
                u9.rtx2ld2ELZv4("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f8 = qt1Var.PxuCJdSBwIXG;
            f3 = ((qt1Var.TSizfFm2Yiuu - f8) / 2.0f) + f8;
            f4 = qt1Var2.PxuCJdSBwIXG;
            f5 = qt1Var2.TSizfFm2Yiuu;
        }
        long j2 = (long) (f3 - (((f5 - f4) / 2.0f) + f4));
        return (j2 * j2) + (13 * j * j);
    }

    public static void jJwa0q7P5wHq(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int D0aTLcX6Uhyo = D0aTLcX6Uhyo(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        PsecLrZVVK61(parcel, D0aTLcX6Uhyo);
    }

    public static final boolean jyegZNwi31qc(int i, l7 l7Var, ab0 ab0Var, qt1 qt1Var) {
        if (xbgXKYA2cIfu(i, l7Var, ab0Var, qt1Var)) {
            return true;
        }
        Boolean bool = (Boolean) zv.xbgXKYA2cIfu(ab0Var, i, new eg1(((qa0) ((r1) zv.wLFCmsViZrNT(ab0Var)).getFocusOwner()).a92UlCVFR9N8(), ab0Var, qt1Var, i, l7Var, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final float kpCQ9veP6n3I(hu huVar) {
        u61 u61Var = (u61) huVar.S2OOm9zPNm0h(ih0.RfyTYNmI9Srp);
        float rZjpSjn4zoMv = u61Var != null ? u61Var.rZjpSjn4zoMv() : 1.0f;
        if (rZjpSjn4zoMv >= 0.0f) {
            return rZjpSjn4zoMv;
        }
        ip1.lS5Rgt96tfkO("negative scale factor");
        return rZjpSjn4zoMv;
    }

    public static final void lS5Rgt96tfkO(long j, dj2 dj2Var, pe0 pe0Var, hp hpVar, int i) {
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(396611577);
        int i2 = (tf0Var.e9gEMXR7LXtO(j) ? 4 : 2) | i | (tf0Var.a92UlCVFR9N8(dj2Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= tf0Var.rtx2ld2ELZv4(pe0Var) ? 256 : 128;
        }
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 147) != 146)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            sj0.TSizfFm2Yiuu(j, dj2Var, pe0Var, tf0Var, i2 & 1022);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new hr1(j, dj2Var, pe0Var, i, 1);
        }
    }

    public static final int nLZGh9p8gVSu(SerialDescriptor serialDescriptor, SerialDescriptor[] serialDescriptorArr) {
        serialDescriptorArr.getClass();
        int hashCode = (serialDescriptor.lS5Rgt96tfkO().hashCode() * 31) + Arrays.hashCode(serialDescriptorArr);
        int Y1f8riQaR6yg2 = serialDescriptor.Y1f8riQaR6yg();
        int i = 1;
        while (true) {
            int i2 = 0;
            if (!(Y1f8riQaR6yg2 > 0)) {
                break;
            }
            int i3 = Y1f8riQaR6yg2 - 1;
            int i4 = i * 31;
            String lS5Rgt96tfkO2 = serialDescriptor.wdg6QnbFHrFF(serialDescriptor.Y1f8riQaR6yg() - Y1f8riQaR6yg2).lS5Rgt96tfkO();
            if (lS5Rgt96tfkO2 != null) {
                i2 = lS5Rgt96tfkO2.hashCode();
            }
            i = i4 + i2;
            Y1f8riQaR6yg2 = i3;
        }
        int Y1f8riQaR6yg3 = serialDescriptor.Y1f8riQaR6yg();
        int i5 = 1;
        while (true) {
            if (!(Y1f8riQaR6yg3 > 0)) {
                return (((hashCode * 31) + i) * 31) + i5;
            }
            int i6 = Y1f8riQaR6yg3 - 1;
            int i7 = i5 * 31;
            sj0 TSizfFm2Yiuu2 = serialDescriptor.wdg6QnbFHrFF(serialDescriptor.Y1f8riQaR6yg() - Y1f8riQaR6yg3).TSizfFm2Yiuu();
            i5 = i7 + (TSizfFm2Yiuu2 != null ? TSizfFm2Yiuu2.hashCode() : 0);
            Y1f8riQaR6yg3 = i6;
        }
    }

    public static final void ngxnMNrpiKat(h8 h8Var, j8 j8Var) {
        j8Var.OPXfSBeufaJ8.setValue(h8Var.e9gEMXR7LXtO.getValue());
        o8 o8Var = j8Var.wdg6QnbFHrFF;
        o8 o8Var2 = h8Var.a92UlCVFR9N8;
        int lS5Rgt96tfkO2 = o8Var.lS5Rgt96tfkO();
        for (int i = 0; i < lS5Rgt96tfkO2; i++) {
            o8Var.e9gEMXR7LXtO(o8Var2.PxuCJdSBwIXG(i), i);
        }
        j8Var.x50lh2ztY7Y5 = h8Var.rtx2ld2ELZv4;
        j8Var.dgRBjINgWbAK = h8Var.RAsUl2FVSrh6;
        j8Var.cpQdD2nAriOS = ((Boolean) h8Var.OPXfSBeufaJ8.getValue()).booleanValue();
    }

    public static final ExtractedText nxJAScVArhE9(oh2 oh2Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = oh2Var.PxuCJdSBwIXG.OPXfSBeufaJ8;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = oh2Var.lS5Rgt96tfkO;
        extractedText.selectionStart = vi2.a92UlCVFR9N8(j);
        extractedText.selectionEnd = vi2.e9gEMXR7LXtO(j);
        extractedText.flags = !ia2.D0aTLcX6Uhyo(oh2Var.PxuCJdSBwIXG.OPXfSBeufaJ8, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final long ozEBbv0hFTAB(double d) {
        return wLFCmsViZrNT(4294967296L, (float) d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        if (r4 == 5) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long pnx5pC0XzaCw(long j, boolean z, int i, float f) {
        int rtx2ld2ELZv4;
        qr qrVar = rr.Companion;
        if (!z) {
            si2.Companion.getClass();
            if (i != 2) {
                if (i != 4) {
                }
            }
        }
        if (rr.Y1f8riQaR6yg(j)) {
            rtx2ld2ELZv4 = rr.rtx2ld2ELZv4(j);
            if (rr.wdg6QnbFHrFF(j) != rtx2ld2ELZv4) {
                rtx2ld2ELZv4 = ng0.wdg6QnbFHrFF(ng0.RAsUl2FVSrh6(f), rr.wdg6QnbFHrFF(j), rtx2ld2ELZv4);
            }
            int RAsUl2FVSrh6 = rr.RAsUl2FVSrh6(j);
            qrVar.getClass();
            return qr.lS5Rgt96tfkO(0, rtx2ld2ELZv4, 0, RAsUl2FVSrh6);
        }
        rtx2ld2ELZv4 = Integer.MAX_VALUE;
        if (rr.wdg6QnbFHrFF(j) != rtx2ld2ELZv4) {
        }
        int RAsUl2FVSrh62 = rr.RAsUl2FVSrh6(j);
        qrVar.getClass();
        return qr.lS5Rgt96tfkO(0, rtx2ld2ELZv4, 0, RAsUl2FVSrh62);
    }

    public static void qudtW7lwm99e(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int D0aTLcX6Uhyo = D0aTLcX6Uhyo(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        PsecLrZVVK61(parcel, D0aTLcX6Uhyo);
    }

    public static final Object r3s1LDPKFs1S(j8 j8Var, Float f, e80 e80Var, le0 le0Var, jc2 jc2Var) {
        Object x50lh2ztY7Y5 = x50lh2ztY7Y5(j8Var, new sd2(e80Var, j8Var.rtx2ld2ELZv4, j8Var.OPXfSBeufaJ8.getValue(), f, j8Var.wdg6QnbFHrFF), j8Var.dgRBjINgWbAK, le0Var, jc2Var);
        return x50lh2ztY7Y5 == su.rtx2ld2ELZv4 ? x50lh2ztY7Y5 : no2.PxuCJdSBwIXG;
    }

    public static final xs0 rZjpSjn4zoMv(hu huVar) {
        xs0 xs0Var = (xs0) huVar.S2OOm9zPNm0h(ih0.BRwzKIf41E4i);
        if (xs0Var != null) {
            return xs0Var;
        }
        u9.BRwzKIf41E4i(huVar, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final d32 rtx2ld2ELZv4(vw0 vw0Var, boolean z) {
        m61 m61Var = vw0Var.nLZGh9p8gVSu.a92UlCVFR9N8;
        tx txVar = null;
        if ((m61Var.dgRBjINgWbAK & 8) != 0) {
            loop0: while (true) {
                if (m61Var == null) {
                    break;
                }
                if ((m61Var.wdg6QnbFHrFF & 8) != 0) {
                    m61 m61Var2 = m61Var;
                    f91 f91Var = null;
                    while (m61Var2 != null) {
                        if (m61Var2 instanceof b32) {
                            txVar = m61Var2;
                            break loop0;
                        }
                        if ((m61Var2.wdg6QnbFHrFF & 8) != 0 && (m61Var2 instanceof ux)) {
                            int i = 0;
                            for (m61 m61Var3 = ((ux) m61Var2).S2OOm9zPNm0h; m61Var3 != null; m61Var3 = m61Var3.cpQdD2nAriOS) {
                                if ((m61Var3.wdg6QnbFHrFF & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        m61Var2 = m61Var3;
                                    } else {
                                        if (f91Var == null) {
                                            f91Var = new f91(new m61[16]);
                                        }
                                        if (m61Var2 != null) {
                                            f91Var.lS5Rgt96tfkO(m61Var2);
                                            m61Var2 = null;
                                        }
                                        f91Var.lS5Rgt96tfkO(m61Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        m61Var2 = zv.dgRBjINgWbAK(f91Var);
                    }
                }
                if ((m61Var.dgRBjINgWbAK & 8) == 0) {
                    break;
                }
                m61Var = m61Var.cpQdD2nAriOS;
            }
        }
        txVar.getClass();
        m61 m61Var4 = ((m61) ((b32) txVar)).rtx2ld2ELZv4;
        z22 S2OOm9zPNm0h = vw0Var.S2OOm9zPNm0h();
        if (S2OOm9zPNm0h == null) {
            S2OOm9zPNm0h = new z22();
        }
        return new d32(m61Var4, z, vw0Var, S2OOm9zPNm0h);
    }

    public static final int ryVscX7ZL4Ux(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final long tmVwIGCQF4zR(int i) {
        return wLFCmsViZrNT(4294967296L, i);
    }

    public static final long wLFCmsViZrNT(long j, float f) {
        long floatToRawIntBits = j | (Float.floatToRawIntBits(f) & 4294967295L);
        gj2 gj2Var = hj2.Companion;
        return floatToRawIntBits;
    }

    public static final void wdg6QnbFHrFF(hp hpVar, n61 n61Var) {
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        c3 c3Var = c3.rtx2ld2ELZv4;
        int hashCode = Long.hashCode(cs0.VhhvGxCb8gfr(hpVar));
        n61 xfACYKDMU6Dj = ov2.xfACYKDMU6Dj(hpVar, n61Var);
        il1 x50lh2ztY7Y5 = ((tf0) hpVar).x50lh2ztY7Y5();
        yo.Companion.getClass();
        dq dqVar = xo.lS5Rgt96tfkO;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.ngxnMNrpiKat();
        if (tf0Var.zf8DYfih6EZu) {
            tf0Var.dgRBjINgWbAK(dqVar);
        } else {
            tf0Var.hVNtCUZb4tYH();
        }
        th0.tmVwIGCQF4zR(hpVar, xo.a92UlCVFR9N8, c3Var);
        th0.tmVwIGCQF4zR(hpVar, xo.e9gEMXR7LXtO, x50lh2ztY7Y5);
        th0.kpCQ9veP6n3I(hpVar, xo.rtx2ld2ELZv4);
        th0.tmVwIGCQF4zR(hpVar, xo.Y1f8riQaR6yg, xfACYKDMU6Dj);
        th0.tmVwIGCQF4zR(hpVar, xo.RAsUl2FVSrh6, Integer.valueOf(hashCode));
        tf0Var.gPXPFXrUH4XX(true);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(3:(1:(1:11)(2:54|55))(1:56)|12|13)(8:57|(11:67|68|69|70|71|72|73|74|(2:76|(1:78)(2:81|82))(1:83)|(1:80)|29)(7:59|60|61|62|15|16|(7:18|19|20|21|22|23|(1:34)(2:25|(2:31|32)(1:27)))(2:48|49))|66|39|(1:41)|42|(1:46)|47)|14|15|16|(0)(0)))|92|6|7|(0)(0)|14|15|16|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0180, code lost:
    
        if (BjEWd04qc7Mw(r9.e9gEMXR7LXtO()).PxuCJdSBwIXG(r9, r5) == r13) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c4, code lost:
    
        if (BjEWd04qc7Mw(r9.e9gEMXR7LXtO()).PxuCJdSBwIXG(r9, new defpackage.qg0(r5, r11)) == r13) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0189, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x018a, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011e A[Catch: CancellationException -> 0x0189, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x0189, blocks: (B:16:0x0109, B:18:0x011e), top: B:15:0x0109 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object x50lh2ztY7Y5(j8 j8Var, e8 e8Var, long j, final le0 le0Var, ct ctVar) {
        ic2 ic2Var;
        int i;
        final j8 j8Var2;
        zt1 zt1Var;
        j8 j8Var3;
        final float kpCQ9veP6n3I;
        le0 le0Var2;
        Object PxuCJdSBwIXG2;
        le0 le0Var3;
        zt1 zt1Var2;
        zt1 zt1Var3;
        h8 h8Var;
        h8 h8Var2;
        Object obj;
        final le0 le0Var4;
        final zt1 zt1Var4;
        final e8 e8Var2;
        final j8 j8Var4;
        final e8 e8Var3 = e8Var;
        jx1 jx1Var = jx1.gPXPFXrUH4XX;
        if (ctVar instanceof ic2) {
            ic2Var = (ic2) ctVar;
            int i2 = ic2Var.gPXPFXrUH4XX;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ic2Var.gPXPFXrUH4XX = i2 - Integer.MIN_VALUE;
                ic2 ic2Var2 = ic2Var;
                hu huVar = ic2Var2.OPXfSBeufaJ8;
                Object obj2 = ic2Var2.QrzZRwfaDlRX;
                i = ic2Var2.gPXPFXrUH4XX;
                int i3 = 0;
                int i4 = 2;
                su suVar = su.rtx2ld2ELZv4;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj2);
                    final Object lS5Rgt96tfkO2 = e8Var3.lS5Rgt96tfkO(0L);
                    final o8 a92UlCVFR9N8 = e8Var3.a92UlCVFR9N8(0L);
                    final zt1 zt1Var5 = new zt1();
                    if (j == Long.MIN_VALUE) {
                        try {
                            huVar.getClass();
                            kpCQ9veP6n3I = kpCQ9veP6n3I(huVar);
                            j8Var2 = j8Var;
                        } catch (CancellationException e) {
                            e = e;
                            j8Var2 = j8Var;
                        }
                        try {
                            le0Var2 = new le0() { // from class: fc2
                                @Override // defpackage.le0
                                public final Object OPXfSBeufaJ8(Object obj3) {
                                    long longValue = ((Long) obj3).longValue();
                                    e8 e8Var4 = e8Var3;
                                    lm2 Y1f8riQaR6yg2 = e8Var4.Y1f8riQaR6yg();
                                    Object e9gEMXR7LXtO = e8Var4.e9gEMXR7LXtO();
                                    j8 j8Var5 = j8Var2;
                                    h8 h8Var3 = new h8(lS5Rgt96tfkO2, Y1f8riQaR6yg2, a92UlCVFR9N8, longValue, e9gEMXR7LXtO, longValue, new gc2(j8Var5, 1));
                                    ki0.VhhvGxCb8gfr(h8Var3, longValue, kpCQ9veP6n3I, e8Var4, j8Var5, le0Var);
                                    zt1.this.rtx2ld2ELZv4 = h8Var3;
                                    return no2.PxuCJdSBwIXG;
                                }
                            };
                            zt1Var = zt1Var5;
                        } catch (CancellationException e2) {
                            e = e2;
                            zt1Var = zt1Var5;
                            j8Var3 = j8Var2;
                            zt1Var2 = zt1Var;
                            h8Var = (h8) zt1Var2.rtx2ld2ELZv4;
                            if (h8Var != null) {
                            }
                            h8Var2 = (h8) zt1Var2.rtx2ld2ELZv4;
                            if (h8Var2 != null) {
                                j8Var3.cpQdD2nAriOS = false;
                            }
                            throw e;
                        }
                        try {
                            ic2Var2.dgRBjINgWbAK = j8Var2;
                            ic2Var2.x50lh2ztY7Y5 = e8Var3;
                            ic2Var2.cpQdD2nAriOS = le0Var;
                            ic2Var2.r3s1LDPKFs1S = zt1Var;
                            ic2Var2.gPXPFXrUH4XX = 1;
                            if (!e8Var3.PxuCJdSBwIXG()) {
                                PxuCJdSBwIXG2 = BjEWd04qc7Mw(ic2Var2.e9gEMXR7LXtO()).PxuCJdSBwIXG(ic2Var2, new qg0(le0Var2, i4));
                            } else {
                                if (ic2Var2.e9gEMXR7LXtO().S2OOm9zPNm0h(jx1Var) != null) {
                                    throw new ClassCastException();
                                }
                                PxuCJdSBwIXG2 = BjEWd04qc7Mw(ic2Var2.e9gEMXR7LXtO()).PxuCJdSBwIXG(ic2Var2, le0Var2);
                            }
                            if (PxuCJdSBwIXG2 != suVar) {
                                j8Var3 = j8Var2;
                                le0Var3 = le0Var;
                                zt1Var2 = zt1Var;
                            }
                            return suVar;
                        } catch (CancellationException e3) {
                            e = e3;
                            j8Var3 = j8Var2;
                            zt1Var2 = zt1Var;
                            h8Var = (h8) zt1Var2.rtx2ld2ELZv4;
                            if (h8Var != null) {
                            }
                            h8Var2 = (h8) zt1Var2.rtx2ld2ELZv4;
                            if (h8Var2 != null) {
                            }
                            throw e;
                        }
                    }
                    zt1Var = zt1Var5;
                    try {
                        h8 h8Var3 = new h8(lS5Rgt96tfkO2, e8Var3.Y1f8riQaR6yg(), a92UlCVFR9N8, j, e8Var3.e9gEMXR7LXtO(), j, new gc2(j8Var, i3));
                        huVar.getClass();
                        VhhvGxCb8gfr(h8Var3, j, kpCQ9veP6n3I(huVar), e8Var3, j8Var, le0Var);
                        zt1Var.rtx2ld2ELZv4 = h8Var3;
                        j8Var3 = j8Var;
                        e8Var3 = e8Var;
                        le0Var3 = le0Var;
                        zt1Var3 = zt1Var;
                        obj = zt1Var3.rtx2ld2ELZv4;
                        obj.getClass();
                        if (!((Boolean) ((h8) obj).OPXfSBeufaJ8.getValue()).booleanValue()) {
                            return no2.PxuCJdSBwIXG;
                        }
                        try {
                            hu huVar2 = ic2Var2.OPXfSBeufaJ8;
                            huVar2.getClass();
                            final float kpCQ9veP6n3I2 = kpCQ9veP6n3I(huVar2);
                            le0 le0Var5 = new le0() { // from class: hc2
                                @Override // defpackage.le0
                                public final Object OPXfSBeufaJ8(Object obj3) {
                                    long longValue = ((Long) obj3).longValue();
                                    Object obj4 = zt1.this.rtx2ld2ELZv4;
                                    obj4.getClass();
                                    ki0.VhhvGxCb8gfr((h8) obj4, longValue, kpCQ9veP6n3I2, e8Var2, j8Var4, le0Var4);
                                    return no2.PxuCJdSBwIXG;
                                }
                            };
                            zt1Var2 = zt1Var4;
                            e8Var3 = e8Var2;
                            j8Var3 = j8Var4;
                            le0Var3 = le0Var4;
                            ic2Var2.dgRBjINgWbAK = j8Var3;
                            ic2Var2.x50lh2ztY7Y5 = e8Var3;
                            ic2Var2.cpQdD2nAriOS = le0Var3;
                            ic2Var2.r3s1LDPKFs1S = zt1Var2;
                            ic2Var2.gPXPFXrUH4XX = 2;
                            if (!e8Var3.PxuCJdSBwIXG()) {
                            } else if (ic2Var2.e9gEMXR7LXtO().S2OOm9zPNm0h(jx1Var) != null) {
                                throw new ClassCastException();
                            }
                        } catch (CancellationException e4) {
                            e = e4;
                            zt1Var2 = zt1Var4;
                            j8Var3 = j8Var4;
                        }
                        le0Var4 = le0Var3;
                        zt1Var4 = zt1Var3;
                        e8Var2 = e8Var3;
                        j8Var4 = j8Var3;
                    } catch (CancellationException e5) {
                        e = e5;
                        j8Var3 = j8Var;
                    }
                    zt1Var2 = zt1Var;
                    h8Var = (h8) zt1Var2.rtx2ld2ELZv4;
                    if (h8Var != null) {
                        h8Var.OPXfSBeufaJ8.setValue(Boolean.FALSE);
                    }
                    h8Var2 = (h8) zt1Var2.rtx2ld2ELZv4;
                    if (h8Var2 != null && h8Var2.RAsUl2FVSrh6 == j8Var3.dgRBjINgWbAK) {
                        j8Var3.cpQdD2nAriOS = false;
                    }
                    throw e;
                }
                if (i == 1) {
                    zt1Var2 = ic2Var2.r3s1LDPKFs1S;
                    le0Var3 = ic2Var2.cpQdD2nAriOS;
                    e8Var3 = ic2Var2.x50lh2ztY7Y5;
                    j8Var3 = ic2Var2.dgRBjINgWbAK;
                } else {
                    if (i != 2) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zt1Var2 = ic2Var2.r3s1LDPKFs1S;
                    le0Var3 = ic2Var2.cpQdD2nAriOS;
                    e8Var3 = ic2Var2.x50lh2ztY7Y5;
                    j8Var3 = ic2Var2.dgRBjINgWbAK;
                }
                try {
                    ng0.tmVwIGCQF4zR(obj2);
                } catch (CancellationException e6) {
                    e = e6;
                }
                zt1Var3 = zt1Var2;
                obj = zt1Var3.rtx2ld2ELZv4;
                obj.getClass();
                if (!((Boolean) ((h8) obj).OPXfSBeufaJ8.getValue()).booleanValue()) {
                }
            }
        }
        ic2Var = new ic2(ctVar);
        ic2 ic2Var22 = ic2Var;
        hu huVar3 = ic2Var22.OPXfSBeufaJ8;
        Object obj22 = ic2Var22.QrzZRwfaDlRX;
        i = ic2Var22.gPXPFXrUH4XX;
        int i32 = 0;
        int i42 = 2;
        su suVar2 = su.rtx2ld2ELZv4;
        if (i != 0) {
        }
        zt1Var3 = zt1Var2;
        obj = zt1Var3.rtx2ld2ELZv4;
        obj.getClass();
        if (!((Boolean) ((h8) obj).OPXfSBeufaJ8.getValue()).booleanValue()) {
        }
    }

    public static final boolean xbgXKYA2cIfu(int i, l7 l7Var, ab0 ab0Var, qt1 qt1Var) {
        ab0 IAToe7bXGz4N;
        f91 f91Var = new f91(new ab0[16]);
        if (!ab0Var.rtx2ld2ELZv4.S9EYkSpbGuxq) {
            ep0.lS5Rgt96tfkO("visitChildren called on an unattached node");
        }
        f91 f91Var2 = new f91(new m61[16]);
        m61 m61Var = ab0Var.rtx2ld2ELZv4;
        m61 m61Var2 = m61Var.cpQdD2nAriOS;
        if (m61Var2 == null) {
            zv.OPXfSBeufaJ8(f91Var2, m61Var);
        } else {
            f91Var2.lS5Rgt96tfkO(m61Var2);
        }
        while (true) {
            int i2 = f91Var2.wdg6QnbFHrFF;
            if (i2 == 0) {
                break;
            }
            m61 m61Var3 = (m61) f91Var2.dgRBjINgWbAK(i2 - 1);
            if ((m61Var3.dgRBjINgWbAK & 1024) == 0) {
                zv.OPXfSBeufaJ8(f91Var2, m61Var3);
            } else {
                while (true) {
                    if (m61Var3 == null) {
                        break;
                    }
                    if ((m61Var3.wdg6QnbFHrFF & 1024) != 0) {
                        f91 f91Var3 = null;
                        while (m61Var3 != null) {
                            if (m61Var3 instanceof ab0) {
                                ab0 ab0Var2 = (ab0) m61Var3;
                                if (ab0Var2.S9EYkSpbGuxq) {
                                    f91Var.lS5Rgt96tfkO(ab0Var2);
                                }
                            } else if ((m61Var3.wdg6QnbFHrFF & 1024) != 0 && (m61Var3 instanceof ux)) {
                                int i3 = 0;
                                for (m61 m61Var4 = ((ux) m61Var3).S2OOm9zPNm0h; m61Var4 != null; m61Var4 = m61Var4.cpQdD2nAriOS) {
                                    if ((m61Var4.wdg6QnbFHrFF & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            m61Var3 = m61Var4;
                                        } else {
                                            if (f91Var3 == null) {
                                                f91Var3 = new f91(new m61[16]);
                                            }
                                            if (m61Var3 != null) {
                                                f91Var3.lS5Rgt96tfkO(m61Var3);
                                                m61Var3 = null;
                                            }
                                            f91Var3.lS5Rgt96tfkO(m61Var4);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            m61Var3 = zv.dgRBjINgWbAK(f91Var3);
                        }
                    } else {
                        m61Var3 = m61Var3.cpQdD2nAriOS;
                    }
                }
            }
        }
        while (f91Var.wdg6QnbFHrFF != 0 && (IAToe7bXGz4N = IAToe7bXGz4N(f91Var, qt1Var, i)) != null) {
            if (IAToe7bXGz4N.fkblLSN2bAgv().PxuCJdSBwIXG) {
                return ((Boolean) l7Var.OPXfSBeufaJ8(IAToe7bXGz4N)).booleanValue();
            }
            if (jyegZNwi31qc(i, l7Var, IAToe7bXGz4N, qt1Var)) {
                return true;
            }
            f91Var.wdg6QnbFHrFF(IAToe7bXGz4N);
        }
        return false;
    }

    public static final kr2 xfACYKDMU6Dj(pr2 pr2Var) {
        return pr2Var instanceof bj0 ? ((bj0) pr2Var).e9gEMXR7LXtO() : lx.PxuCJdSBwIXG;
    }

    public static void yQRudnv4La6p(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int D0aTLcX6Uhyo = D0aTLcX6Uhyo(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        PsecLrZVVK61(parcel, D0aTLcX6Uhyo);
    }

    public static final boolean zf8DYfih6EZu(mx1 mx1Var) {
        long j = mx1Var.e9gEMXR7LXtO;
        return (j >>> 32) == (4294967295L & j) && j == mx1Var.a92UlCVFR9N8 && j == mx1Var.RAsUl2FVSrh6 && j == mx1Var.rtx2ld2ELZv4;
    }
}
