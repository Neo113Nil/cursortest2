package defpackage;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class RAsUl2FVSrh6 extends af0 implements le0 {
    public final /* synthetic */ int QrzZRwfaDlRX;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RAsUl2FVSrh6(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.QrzZRwfaDlRX = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x040c, code lost:
    
        if (defpackage.ou0.PxuCJdSBwIXG(r7, defpackage.ou0.amuv7NJvPxHu) == false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02f8, code lost:
    
        if (defpackage.ou0.PxuCJdSBwIXG(r7, defpackage.ou0.QrzZRwfaDlRX) != false) goto L177;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02d2  */
    @Override // defpackage.le0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OPXfSBeufaJ8(Object obj) {
        wp1 wp1Var;
        Object[] objArr;
        int i;
        Object[] objArr2;
        int i2;
        mm mmVar;
        pu0 pu0Var;
        oh2 oh2Var;
        boolean lS5Rgt96tfkO;
        v8 v8Var;
        lo2 lo2Var;
        boolean z;
        i2 i2Var;
        pu0 pu0Var2;
        pu0 pu0Var3;
        pu0 pu0Var4;
        Integer valueOf;
        int i3 = this.QrzZRwfaDlRX;
        int i4 = 8;
        no2 no2Var = no2.PxuCJdSBwIXG;
        Object obj2 = this.OPXfSBeufaJ8;
        switch (i3) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                kk kkVar = (kk) obj2;
                h81 h81Var = kkVar.EpkonXwzFgDB;
                if (booleanValue) {
                    kkVar.qYgDo2Ye5PY7();
                } else {
                    if (kkVar.ZbWwgt3aGe7A != null) {
                        Object[] objArr3 = h81Var.TSizfFm2Yiuu;
                        long[] jArr = h81Var.PxuCJdSBwIXG;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i5 = 0;
                            while (true) {
                                long j = jArr[i5];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                                    int i7 = 0;
                                    while (i7 < i6) {
                                        if ((255 & j) < 128) {
                                            objArr2 = objArr3;
                                            i2 = i4;
                                            fx1.KUoIVIumpKat(kkVar.GlTbNTgfSMqy(), null, new x50lh2ztY7Y5(kkVar, (wp1) objArr3[(i5 << 3) + i7], null, 0), 3);
                                        } else {
                                            objArr2 = objArr3;
                                            i2 = i4;
                                        }
                                        j >>= i2;
                                        i7++;
                                        objArr3 = objArr2;
                                        i4 = i2;
                                    }
                                    objArr = objArr3;
                                    i = i4;
                                    if (i6 != i) {
                                    }
                                } else {
                                    objArr = objArr3;
                                    i = i4;
                                }
                                if (i5 != length) {
                                    i5++;
                                    i4 = i;
                                    objArr3 = objArr;
                                }
                            }
                        }
                        wp1 wp1Var2 = kkVar.nLZGh9p8gVSu;
                        if (wp1Var2 != null) {
                            wp1Var = null;
                            fx1.KUoIVIumpKat(kkVar.GlTbNTgfSMqy(), null, new x50lh2ztY7Y5(kkVar, wp1Var2, 0 == true ? 1 : 0, 1), 3);
                            h81Var.PxuCJdSBwIXG();
                            kkVar.nLZGh9p8gVSu = wp1Var;
                        }
                    }
                    wp1Var = null;
                    h81Var.PxuCJdSBwIXG();
                    kkVar.nLZGh9p8gVSu = wp1Var;
                }
                return no2Var;
            case 1:
                ((Set) obj).getClass();
                ns0 ns0Var = (ns0) obj2;
                ReentrantLock reentrantLock = ns0Var.Y1f8riQaR6yg;
                reentrantLock.lock();
                try {
                    List i8 = zk.i(ns0Var.TSizfFm2Yiuu.values());
                    reentrantLock.unlock();
                    Iterator it = i8.iterator();
                    if (!it.hasNext()) {
                        return no2Var;
                    }
                    ((ze1) it.next()).getClass();
                    throw null;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 2:
                ((at0) obj2).RfyTYNmI9Srp((Throwable) obj);
                return no2Var;
            case 3:
                long j2 = ((bf1) obj).PxuCJdSBwIXG;
                ve2 ve2Var = (ve2) obj2;
                ve2Var.getClass();
                af2 af2Var = (af2) f2.QrzZRwfaDlRX(ve2Var, bf2.PxuCJdSBwIXG);
                if (af2Var != null) {
                    fx1.KUoIVIumpKat(ve2Var.GlTbNTgfSMqy(), null, new OPXfSBeufaJ8(ve2Var, j2, af2Var, new te2(ve2Var, j2), (bt) null), 3);
                }
                return no2Var;
            case 4:
                ((me2) obj2).lS5Rgt96tfkO.PxuCJdSBwIXG((le0) obj);
                return no2Var;
            default:
                KeyEvent keyEvent = ((qu0) obj).PxuCJdSBwIXG;
                dg2 dg2Var = (dg2) obj2;
                ti2 ti2Var = dg2Var.a92UlCVFR9N8;
                boolean z2 = dg2Var.Y1f8riQaR6yg;
                if (keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar())) {
                    xv xvVar = dg2Var.OPXfSBeufaJ8;
                    xvVar.getClass();
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                        xvVar.PxuCJdSBwIXG = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                        valueOf = null;
                    } else {
                        Integer num = xvVar.PxuCJdSBwIXG;
                        if (num != null) {
                            xvVar.PxuCJdSBwIXG = null;
                            int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                            Integer valueOf2 = Integer.valueOf(deadChar);
                            if (deadChar == 0) {
                                valueOf2 = null;
                            }
                            if (valueOf2 != null) {
                                unicodeChar = valueOf2.intValue();
                            }
                            valueOf = Integer.valueOf(unicodeChar);
                        } else {
                            valueOf = Integer.valueOf(unicodeChar);
                        }
                    }
                    if (valueOf != null) {
                        mmVar = new mm(new StringBuilder().appendCodePoint(valueOf.intValue()).toString(), 1);
                        if (mmVar == null) {
                            if (z2) {
                                dg2Var.PxuCJdSBwIXG(fx1.jJwa0q7P5wHq(mmVar));
                                ti2Var.PxuCJdSBwIXG = null;
                                z = true;
                            }
                            z = false;
                        } else {
                            int S9EYkSpbGuxq = jh0.S9EYkSpbGuxq(keyEvent);
                            su0.Companion.getClass();
                            if (S9EYkSpbGuxq == 2) {
                                dg2Var.wdg6QnbFHrFF.getClass();
                                int S9EYkSpbGuxq2 = th0.S9EYkSpbGuxq(keyEvent);
                                zu0.Companion.getClass();
                                if (S9EYkSpbGuxq2 == zu0.PxuCJdSBwIXG) {
                                    long TSizfFm2Yiuu = ki0.TSizfFm2Yiuu(keyEvent.getKeyCode());
                                    ou0.Companion.getClass();
                                    if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu, ou0.a92UlCVFR9N8)) {
                                        pu0Var = pu0.JHNfcAUfKc4G;
                                    } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu, ou0.RAsUl2FVSrh6)) {
                                        pu0Var = pu0.bEKsvqmvPh2y;
                                    } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu, ou0.Y1f8riQaR6yg)) {
                                        pu0Var = pu0.gGoUzNp9JO5I;
                                    } else {
                                        if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu, ou0.e9gEMXR7LXtO)) {
                                            pu0Var = pu0.POWyO8hTM6YC;
                                        }
                                        pu0Var = null;
                                    }
                                    if (pu0Var == null) {
                                        i2 i2Var2 = xu0.PxuCJdSBwIXG;
                                        int S9EYkSpbGuxq3 = th0.S9EYkSpbGuxq(keyEvent);
                                        long TSizfFm2Yiuu2 = ki0.TSizfFm2Yiuu(keyEvent.getKeyCode());
                                        ou0.Companion.getClass();
                                        boolean PxuCJdSBwIXG = ou0.PxuCJdSBwIXG(TSizfFm2Yiuu2, ou0.RfyTYNmI9Srp);
                                        pu0 pu0Var5 = pu0.yQRudnv4La6p;
                                        pu0 pu0Var6 = pu0.aF05bpZJlKEP;
                                        int i9 = zu0.lS5Rgt96tfkO;
                                        if (PxuCJdSBwIXG) {
                                            zu0.Companion.getClass();
                                            if (S9EYkSpbGuxq3 == 0 || S9EYkSpbGuxq3 == 8 || S9EYkSpbGuxq3 == zu0.TSizfFm2Yiuu) {
                                                i2Var = i2Var2;
                                                pu0Var2 = pu0Var6;
                                            } else {
                                                pu0Var2 = (S9EYkSpbGuxq3 == 2 || S9EYkSpbGuxq3 == i9) ? pu0.rZjpSjn4zoMv : null;
                                                i2Var = i2Var2;
                                            }
                                        } else {
                                            i2Var = i2Var2;
                                            if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu2, ou0.XL4ISE6Oc65B) || ou0.PxuCJdSBwIXG(TSizfFm2Yiuu2, ou0.rZjpSjn4zoMv)) {
                                                zu0.Companion.getClass();
                                                if (S9EYkSpbGuxq3 == 0 || S9EYkSpbGuxq3 == 8 || S9EYkSpbGuxq3 == 2 || S9EYkSpbGuxq3 == i9) {
                                                    pu0Var2 = pu0Var5;
                                                }
                                            }
                                            pu0Var2 = null;
                                        }
                                        if (pu0Var2 != null) {
                                            pu0Var = pu0Var2;
                                        } else {
                                            int S9EYkSpbGuxq4 = th0.S9EYkSpbGuxq(keyEvent);
                                            zu0.Companion.getClass();
                                            pu0 pu0Var7 = pu0.nxJAScVArhE9;
                                            pu0 pu0Var8 = pu0.IXK6ba3ucyzm;
                                            if (S9EYkSpbGuxq4 == i9) {
                                                long TSizfFm2Yiuu3 = ki0.TSizfFm2Yiuu(keyEvent.getKeyCode());
                                                if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu3, ou0.a92UlCVFR9N8) || ou0.PxuCJdSBwIXG(TSizfFm2Yiuu3, ou0.tmVwIGCQF4zR)) {
                                                    pu0Var3 = pu0.i68hK7ahKtgp;
                                                } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu3, ou0.RAsUl2FVSrh6) || ou0.PxuCJdSBwIXG(TSizfFm2Yiuu3, ou0.J54yh1s3n4Aq)) {
                                                    pu0Var3 = pu0.zf8DYfih6EZu;
                                                } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu3, ou0.Y1f8riQaR6yg) || ou0.PxuCJdSBwIXG(TSizfFm2Yiuu3, ou0.BjEWd04qc7Mw)) {
                                                    pu0Var3 = pu0.xbgXKYA2cIfu;
                                                } else {
                                                    if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu3, ou0.e9gEMXR7LXtO) || ou0.PxuCJdSBwIXG(TSizfFm2Yiuu3, ou0.ozEBbv0hFTAB)) {
                                                        pu0Var3 = pu0.wLFCmsViZrNT;
                                                    }
                                                    pu0Var3 = null;
                                                }
                                                if (pu0Var3 == null) {
                                                    Object obj3 = i2Var.OPXfSBeufaJ8;
                                                    int S9EYkSpbGuxq5 = th0.S9EYkSpbGuxq(keyEvent);
                                                    zu0.Companion.getClass();
                                                    pu0 pu0Var9 = pu0.jJwa0q7P5wHq;
                                                    if (S9EYkSpbGuxq5 == 10) {
                                                        long TSizfFm2Yiuu4 = ki0.TSizfFm2Yiuu(keyEvent.getKeyCode());
                                                        ou0.Companion.getClass();
                                                        break;
                                                    } else {
                                                        pu0Var4 = pu0.IAToe7bXGz4N;
                                                        pu0 pu0Var10 = pu0.jyegZNwi31qc;
                                                        pu0 pu0Var11 = pu0.e6tOsSdd2EFb;
                                                        if (S9EYkSpbGuxq5 == 2) {
                                                            long TSizfFm2Yiuu5 = ki0.TSizfFm2Yiuu(keyEvent.getKeyCode());
                                                            ou0.Companion.getClass();
                                                            if (!ou0.PxuCJdSBwIXG(TSizfFm2Yiuu5, ou0.wdg6QnbFHrFF) && !ou0.PxuCJdSBwIXG(TSizfFm2Yiuu5, ou0.ZbWwgt3aGe7A) && !ou0.PxuCJdSBwIXG(TSizfFm2Yiuu5, ou0.amuv7NJvPxHu)) {
                                                                if (!ou0.PxuCJdSBwIXG(TSizfFm2Yiuu5, ou0.x50lh2ztY7Y5)) {
                                                                    if (!ou0.PxuCJdSBwIXG(TSizfFm2Yiuu5, ou0.cpQdD2nAriOS)) {
                                                                        if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu5, ou0.OPXfSBeufaJ8)) {
                                                                            pu0Var4 = pu0.J54yh1s3n4Aq;
                                                                        } else {
                                                                            if (!ou0.PxuCJdSBwIXG(TSizfFm2Yiuu5, ou0.r3s1LDPKFs1S)) {
                                                                                if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu5, ou0.QrzZRwfaDlRX)) {
                                                                                    pu0Var4 = pu0.qudtW7lwm99e;
                                                                                }
                                                                                pu0Var4 = null;
                                                                            }
                                                                            pu0Var4 = pu0Var9;
                                                                        }
                                                                    }
                                                                    pu0Var4 = pu0Var10;
                                                                }
                                                                pu0Var4 = pu0Var11;
                                                            }
                                                        } else if (S9EYkSpbGuxq5 == 8) {
                                                            long TSizfFm2Yiuu6 = ki0.TSizfFm2Yiuu(keyEvent.getKeyCode());
                                                            ou0.Companion.getClass();
                                                            if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu6, ou0.a92UlCVFR9N8) || ou0.PxuCJdSBwIXG(TSizfFm2Yiuu6, ou0.tmVwIGCQF4zR)) {
                                                                pu0Var4 = pu0.EpkonXwzFgDB;
                                                            } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu6, ou0.RAsUl2FVSrh6) || ou0.PxuCJdSBwIXG(TSizfFm2Yiuu6, ou0.J54yh1s3n4Aq)) {
                                                                pu0Var4 = pu0.xfACYKDMU6Dj;
                                                            } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu6, ou0.Y1f8riQaR6yg) || ou0.PxuCJdSBwIXG(TSizfFm2Yiuu6, ou0.BjEWd04qc7Mw)) {
                                                                pu0Var4 = pu0.nLZGh9p8gVSu;
                                                            } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu6, ou0.e9gEMXR7LXtO) || ou0.PxuCJdSBwIXG(TSizfFm2Yiuu6, ou0.ozEBbv0hFTAB)) {
                                                                pu0Var4 = pu0.ryVscX7ZL4Ux;
                                                            } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu6, ou0.aF05bpZJlKEP) || ou0.PxuCJdSBwIXG(TSizfFm2Yiuu6, ou0.nLZGh9p8gVSu)) {
                                                                pu0Var4 = pu0.amuv7NJvPxHu;
                                                            } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu6, ou0.kpCQ9veP6n3I) || ou0.PxuCJdSBwIXG(TSizfFm2Yiuu6, ou0.ryVscX7ZL4Ux)) {
                                                                pu0Var4 = pu0.Pf0ThKz3j5YS;
                                                            } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu6, ou0.VhhvGxCb8gfr) || ou0.PxuCJdSBwIXG(TSizfFm2Yiuu6, ou0.EpkonXwzFgDB)) {
                                                                pu0Var4 = pu0Var7;
                                                            } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu6, ou0.S2OOm9zPNm0h) || ou0.PxuCJdSBwIXG(TSizfFm2Yiuu6, ou0.xfACYKDMU6Dj)) {
                                                                pu0Var4 = pu0Var8;
                                                            } else {
                                                                if (!ou0.PxuCJdSBwIXG(TSizfFm2Yiuu6, ou0.ZbWwgt3aGe7A)) {
                                                                    break;
                                                                }
                                                                pu0Var4 = pu0Var11;
                                                            }
                                                        } else {
                                                            if (S9EYkSpbGuxq5 == 0) {
                                                                long TSizfFm2Yiuu7 = ki0.TSizfFm2Yiuu(keyEvent.getKeyCode());
                                                                ou0.Companion.getClass();
                                                                if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu7, ou0.a92UlCVFR9N8) || ou0.PxuCJdSBwIXG(TSizfFm2Yiuu7, ou0.tmVwIGCQF4zR)) {
                                                                    pu0Var4 = pu0.OPXfSBeufaJ8;
                                                                } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu7, ou0.RAsUl2FVSrh6) || ou0.PxuCJdSBwIXG(TSizfFm2Yiuu7, ou0.J54yh1s3n4Aq)) {
                                                                    pu0Var4 = pu0.wdg6QnbFHrFF;
                                                                } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu7, ou0.Y1f8riQaR6yg) || ou0.PxuCJdSBwIXG(TSizfFm2Yiuu7, ou0.BjEWd04qc7Mw)) {
                                                                    pu0Var4 = pu0.RfyTYNmI9Srp;
                                                                } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu7, ou0.e9gEMXR7LXtO) || ou0.PxuCJdSBwIXG(TSizfFm2Yiuu7, ou0.ozEBbv0hFTAB)) {
                                                                    pu0Var4 = pu0.EcgxDIVH5in8;
                                                                } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu7, ou0.rtx2ld2ELZv4)) {
                                                                    pu0Var4 = pu0.S9EYkSpbGuxq;
                                                                } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu7, ou0.aF05bpZJlKEP) || ou0.PxuCJdSBwIXG(TSizfFm2Yiuu7, ou0.nLZGh9p8gVSu)) {
                                                                    pu0Var4 = pu0.VhhvGxCb8gfr;
                                                                } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu7, ou0.kpCQ9veP6n3I) || ou0.PxuCJdSBwIXG(TSizfFm2Yiuu7, ou0.ryVscX7ZL4Ux)) {
                                                                    pu0Var4 = pu0.S2OOm9zPNm0h;
                                                                } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu7, ou0.VhhvGxCb8gfr) || ou0.PxuCJdSBwIXG(TSizfFm2Yiuu7, ou0.EpkonXwzFgDB)) {
                                                                    pu0Var4 = pu0.QrzZRwfaDlRX;
                                                                } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu7, ou0.S2OOm9zPNm0h) || ou0.PxuCJdSBwIXG(TSizfFm2Yiuu7, ou0.xfACYKDMU6Dj)) {
                                                                    pu0Var4 = pu0.gPXPFXrUH4XX;
                                                                } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu7, ou0.XL4ISE6Oc65B) || ou0.PxuCJdSBwIXG(TSizfFm2Yiuu7, ou0.rZjpSjn4zoMv)) {
                                                                    pu0Var4 = pu0Var5;
                                                                } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu7, ou0.RfyTYNmI9Srp)) {
                                                                    pu0Var4 = pu0Var6;
                                                                } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu7, ou0.EcgxDIVH5in8)) {
                                                                    pu0Var4 = pu0.kpCQ9veP6n3I;
                                                                } else {
                                                                    if (!ou0.PxuCJdSBwIXG(TSizfFm2Yiuu7, ou0.e6tOsSdd2EFb)) {
                                                                        if (!ou0.PxuCJdSBwIXG(TSizfFm2Yiuu7, ou0.pnx5pC0XzaCw)) {
                                                                            if (!ou0.PxuCJdSBwIXG(TSizfFm2Yiuu7, ou0.IAToe7bXGz4N)) {
                                                                                if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu7, ou0.gPXPFXrUH4XX)) {
                                                                                    pu0Var4 = pu0.KUoIVIumpKat;
                                                                                }
                                                                            }
                                                                        }
                                                                        pu0Var4 = pu0Var10;
                                                                    }
                                                                    pu0Var4 = pu0Var11;
                                                                }
                                                            }
                                                            pu0Var4 = null;
                                                        }
                                                    }
                                                    pu0Var = pu0Var4;
                                                } else {
                                                    pu0Var = pu0Var3;
                                                }
                                            } else if (S9EYkSpbGuxq4 == 2) {
                                                long TSizfFm2Yiuu8 = ki0.TSizfFm2Yiuu(keyEvent.getKeyCode());
                                                if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu8, ou0.a92UlCVFR9N8) || ou0.PxuCJdSBwIXG(TSizfFm2Yiuu8, ou0.tmVwIGCQF4zR)) {
                                                    pu0Var3 = pu0.x50lh2ztY7Y5;
                                                } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu8, ou0.RAsUl2FVSrh6) || ou0.PxuCJdSBwIXG(TSizfFm2Yiuu8, ou0.J54yh1s3n4Aq)) {
                                                    pu0Var3 = pu0.dgRBjINgWbAK;
                                                } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu8, ou0.Y1f8riQaR6yg) || ou0.PxuCJdSBwIXG(TSizfFm2Yiuu8, ou0.BjEWd04qc7Mw)) {
                                                    pu0Var3 = pu0.r3s1LDPKFs1S;
                                                } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu8, ou0.e9gEMXR7LXtO) || ou0.PxuCJdSBwIXG(TSizfFm2Yiuu8, ou0.ozEBbv0hFTAB)) {
                                                    pu0Var3 = pu0.cpQdD2nAriOS;
                                                } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu8, ou0.dgRBjINgWbAK)) {
                                                    pu0Var3 = pu0Var6;
                                                } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu8, ou0.EcgxDIVH5in8)) {
                                                    pu0Var3 = pu0.BjEWd04qc7Mw;
                                                } else {
                                                    if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu8, ou0.jyegZNwi31qc)) {
                                                        pu0Var3 = pu0.ngxnMNrpiKat;
                                                    }
                                                    pu0Var3 = null;
                                                }
                                                if (pu0Var3 == null) {
                                                }
                                            } else if (S9EYkSpbGuxq4 == 8) {
                                                long TSizfFm2Yiuu9 = ki0.TSizfFm2Yiuu(keyEvent.getKeyCode());
                                                if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu9, ou0.VhhvGxCb8gfr) || ou0.PxuCJdSBwIXG(TSizfFm2Yiuu9, ou0.EpkonXwzFgDB)) {
                                                    pu0Var3 = pu0Var7;
                                                } else {
                                                    if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu9, ou0.S2OOm9zPNm0h) || ou0.PxuCJdSBwIXG(TSizfFm2Yiuu9, ou0.xfACYKDMU6Dj)) {
                                                        pu0Var3 = pu0Var8;
                                                    }
                                                    pu0Var3 = null;
                                                }
                                                if (pu0Var3 == null) {
                                                }
                                            } else {
                                                if (S9EYkSpbGuxq4 == 1 && ou0.PxuCJdSBwIXG(ki0.TSizfFm2Yiuu(keyEvent.getKeyCode()), ou0.EcgxDIVH5in8)) {
                                                    pu0Var3 = pu0.tmVwIGCQF4zR;
                                                    if (pu0Var3 == null) {
                                                    }
                                                }
                                                pu0Var3 = null;
                                                if (pu0Var3 == null) {
                                                }
                                            }
                                        }
                                    }
                                    if (pu0Var != null && (!pu0Var.rtx2ld2ELZv4 || z2)) {
                                        vt1 vt1Var = new vt1();
                                        vt1Var.rtx2ld2ELZv4 = true;
                                        cd cdVar = new cd(pu0Var, dg2Var, vt1Var, 11);
                                        oh2Var = dg2Var.TSizfFm2Yiuu;
                                        mg2 mg2Var = new mg2(oh2Var, dg2Var.RAsUl2FVSrh6, dg2Var.PxuCJdSBwIXG.Y1f8riQaR6yg(), ti2Var);
                                        cdVar.OPXfSBeufaJ8(mg2Var);
                                        lS5Rgt96tfkO = vi2.lS5Rgt96tfkO(mg2Var.a92UlCVFR9N8, oh2Var.lS5Rgt96tfkO);
                                        v8Var = mg2Var.RAsUl2FVSrh6;
                                        if (lS5Rgt96tfkO || !cs0.wdg6QnbFHrFF(v8Var, oh2Var.PxuCJdSBwIXG)) {
                                            dg2Var.dgRBjINgWbAK.OPXfSBeufaJ8(oh2.PxuCJdSBwIXG(oh2Var, v8Var, mg2Var.a92UlCVFR9N8, 4));
                                        }
                                        lo2Var = dg2Var.rtx2ld2ELZv4;
                                        if (lo2Var != null) {
                                            lo2Var.e9gEMXR7LXtO = true;
                                        }
                                        z = vt1Var.rtx2ld2ELZv4;
                                    }
                                } else {
                                    if (S9EYkSpbGuxq2 == 1) {
                                        long TSizfFm2Yiuu10 = ki0.TSizfFm2Yiuu(keyEvent.getKeyCode());
                                        ou0.Companion.getClass();
                                        if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu10, ou0.a92UlCVFR9N8)) {
                                            pu0Var = pu0.BRwzKIf41E4i;
                                        } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu10, ou0.RAsUl2FVSrh6)) {
                                            pu0Var = pu0.XL4ISE6Oc65B;
                                        } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu10, ou0.Y1f8riQaR6yg)) {
                                            pu0Var = pu0.ZbWwgt3aGe7A;
                                        } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu10, ou0.e9gEMXR7LXtO)) {
                                            pu0Var = pu0.pnx5pC0XzaCw;
                                        } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu10, ou0.RfyTYNmI9Srp)) {
                                            pu0Var = pu0.ozEBbv0hFTAB;
                                        }
                                        if (pu0Var == null) {
                                        }
                                        if (pu0Var != null) {
                                            vt1 vt1Var2 = new vt1();
                                            vt1Var2.rtx2ld2ELZv4 = true;
                                            cd cdVar2 = new cd(pu0Var, dg2Var, vt1Var2, 11);
                                            oh2Var = dg2Var.TSizfFm2Yiuu;
                                            mg2 mg2Var2 = new mg2(oh2Var, dg2Var.RAsUl2FVSrh6, dg2Var.PxuCJdSBwIXG.Y1f8riQaR6yg(), ti2Var);
                                            cdVar2.OPXfSBeufaJ8(mg2Var2);
                                            lS5Rgt96tfkO = vi2.lS5Rgt96tfkO(mg2Var2.a92UlCVFR9N8, oh2Var.lS5Rgt96tfkO);
                                            v8Var = mg2Var2.RAsUl2FVSrh6;
                                            if (lS5Rgt96tfkO) {
                                            }
                                            dg2Var.dgRBjINgWbAK.OPXfSBeufaJ8(oh2.PxuCJdSBwIXG(oh2Var, v8Var, mg2Var2.a92UlCVFR9N8, 4));
                                            lo2Var = dg2Var.rtx2ld2ELZv4;
                                            if (lo2Var != null) {
                                            }
                                            z = vt1Var2.rtx2ld2ELZv4;
                                        }
                                    }
                                    pu0Var = null;
                                    if (pu0Var == null) {
                                    }
                                    if (pu0Var != null) {
                                    }
                                }
                            }
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                }
                mmVar = null;
                if (mmVar == null) {
                }
                return Boolean.valueOf(z);
        }
    }
}
