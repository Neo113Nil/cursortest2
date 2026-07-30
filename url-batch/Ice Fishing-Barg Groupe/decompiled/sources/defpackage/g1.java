package defpackage;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class g1 extends af0 implements ae0 {
    public final /* synthetic */ int QrzZRwfaDlRX;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.QrzZRwfaDlRX = i4;
    }

    @Override // defpackage.ae0
    public final Object PxuCJdSBwIXG() {
        ContentCaptureSession PxuCJdSBwIXG;
        w81 w81Var;
        kd1 kd1Var;
        int i = this.QrzZRwfaDlRX;
        no2 no2Var = no2.PxuCJdSBwIXG;
        Object obj = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                View view = (View) obj;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30) {
                    hnJvRxDXo0hm.RAsUl2FVSrh6(view);
                }
                if (i2 < 29 || (PxuCJdSBwIXG = yr.PxuCJdSBwIXG(view)) == null) {
                    return null;
                }
                return new op0(PxuCJdSBwIXG, view);
            case 1:
                return ((qe2) obj).uURZJOrwXbxn();
            case 2:
                la0 la0Var = (la0) obj;
                w81 w81Var2 = la0Var.TSizfFm2Yiuu;
                w81 w81Var3 = la0Var.Y1f8riQaR6yg;
                qa0 qa0Var = la0Var.PxuCJdSBwIXG;
                ab0 a92UlCVFR9N8 = qa0Var.a92UlCVFR9N8();
                za0 za0Var = za0.wdg6QnbFHrFF;
                if (a92UlCVFR9N8 == null) {
                    Object[] objArr = w81Var3.lS5Rgt96tfkO;
                    long[] jArr = w81Var3.PxuCJdSBwIXG;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j = jArr[i3];
                            w81Var = w81Var3;
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((j & 255) < 128) {
                                        ((ha0) objArr[(i3 << 3) + i5]).xbgXKYA2cIfu(za0Var);
                                    }
                                    j >>= 8;
                                }
                                if (i4 != 8) {
                                }
                            }
                            if (i3 != length) {
                                i3++;
                                w81Var3 = w81Var;
                            }
                        }
                    } else {
                        w81Var = w81Var3;
                    }
                } else {
                    w81Var = w81Var3;
                    if (a92UlCVFR9N8.S9EYkSpbGuxq) {
                        if (w81Var2.TSizfFm2Yiuu(a92UlCVFR9N8)) {
                            a92UlCVFR9N8.qYgDo2Ye5PY7();
                        }
                        za0 FT2GK7JK5Ma2 = a92UlCVFR9N8.FT2GK7JK5Ma2();
                        if (!a92UlCVFR9N8.rtx2ld2ELZv4.S9EYkSpbGuxq) {
                            ep0.lS5Rgt96tfkO("visitAncestors called on an unattached node");
                        }
                        m61 m61Var = a92UlCVFR9N8.rtx2ld2ELZv4;
                        vw0 zf8DYfih6EZu = zv.zf8DYfih6EZu(a92UlCVFR9N8);
                        int i6 = 0;
                        while (zf8DYfih6EZu != null) {
                            if ((zf8DYfih6EZu.nLZGh9p8gVSu.a92UlCVFR9N8.dgRBjINgWbAK & 5120) != 0) {
                                while (m61Var != null) {
                                    int i7 = m61Var.wdg6QnbFHrFF;
                                    if ((i7 & 5120) != 0) {
                                        if ((i7 & 1024) != 0) {
                                            i6++;
                                        }
                                        if ((m61Var instanceof ha0) && w81Var.TSizfFm2Yiuu(m61Var)) {
                                            if (i6 <= 1) {
                                                ((ha0) m61Var).xbgXKYA2cIfu(FT2GK7JK5Ma2);
                                            } else {
                                                ((ha0) m61Var).xbgXKYA2cIfu(za0.OPXfSBeufaJ8);
                                            }
                                            w81Var.x50lh2ztY7Y5(m61Var);
                                        }
                                    }
                                    m61Var = m61Var.x50lh2ztY7Y5;
                                }
                            }
                            zf8DYfih6EZu = zf8DYfih6EZu.S9EYkSpbGuxq();
                            m61Var = (zf8DYfih6EZu == null || (kd1Var = zf8DYfih6EZu.nLZGh9p8gVSu) == null) ? null : kd1Var.e9gEMXR7LXtO;
                        }
                        Object[] objArr2 = w81Var.lS5Rgt96tfkO;
                        long[] jArr2 = w81Var.PxuCJdSBwIXG;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i8 = 0;
                            while (true) {
                                long j2 = jArr2[i8];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                    for (int i10 = 0; i10 < i9; i10++) {
                                        if ((j2 & 255) < 128) {
                                            ((ha0) objArr2[(i8 << 3) + i10]).xbgXKYA2cIfu(za0Var);
                                        }
                                        j2 >>= 8;
                                    }
                                    if (i9 != 8) {
                                    }
                                }
                                if (i8 != length2) {
                                    i8++;
                                }
                            }
                        }
                    }
                }
                if (qa0Var.a92UlCVFR9N8() == null || qa0Var.TSizfFm2Yiuu.FT2GK7JK5Ma2() == za0Var) {
                    qa0Var.TSizfFm2Yiuu();
                }
                w81Var2.lS5Rgt96tfkO();
                w81Var.lS5Rgt96tfkO();
                la0Var.e9gEMXR7LXtO = false;
                return no2Var;
            case 3:
                return Boolean.valueOf(ab0.i6zQx8Kd7UPU(((hb0) obj).aF05bpZJlKEP));
            default:
                ex1 ex1Var = (ex1) obj;
                at atVar = ex1Var.PxuCJdSBwIXG;
                if (atVar == null) {
                    cs0.tmVwIGCQF4zR("coroutineScope");
                    throw null;
                }
                cs0.x50lh2ztY7Y5(atVar, null);
                ex1Var.Y1f8riQaR6yg();
                bx1 bx1Var = ex1Var.e9gEMXR7LXtO;
                if (bx1Var == null) {
                    cs0.tmVwIGCQF4zR("connectionManager");
                    throw null;
                }
                bx1Var.a92UlCVFR9N8.close();
                tb2 tb2Var = bx1Var.RAsUl2FVSrh6;
                if (tb2Var != null) {
                    tb2Var.close();
                }
                return no2Var;
        }
    }
}
