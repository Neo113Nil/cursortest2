package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import java.util.Locale;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ph0 {
    public static final oh0 Companion = new oh0();
    public int BRwzKIf41E4i;
    public long EcgxDIVH5in8;
    public long OPXfSBeufaJ8;
    public final sh0 PxuCJdSBwIXG;
    public ji QrzZRwfaDlRX;
    public boolean RfyTYNmI9Srp;
    public boolean S2OOm9zPNm0h;
    public long S9EYkSpbGuxq;
    public long VhhvGxCb8gfr;
    public final uj XL4ISE6Oc65B;
    public RectF ZbWwgt3aGe7A;
    public Outline a92UlCVFR9N8;
    public r4 cpQdD2nAriOS;
    public th0 dgRBjINgWbAK;
    public j4 gPXPFXrUH4XX;
    public boolean r3s1LDPKFs1S;
    public long rtx2ld2ELZv4;
    public float wdg6QnbFHrFF;
    public yj1 x50lh2ztY7Y5;
    public hy lS5Rgt96tfkO = b51.TSizfFm2Yiuu;
    public cw0 TSizfFm2Yiuu = cw0.rtx2ld2ELZv4;
    public le0 Y1f8riQaR6yg = k1.rZjpSjn4zoMv;
    public final y e9gEMXR7LXtO = new y(12, this);
    public boolean RAsUl2FVSrh6 = true;

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        lowerCase.equals("robolectric");
    }

    public ph0(sh0 sh0Var) {
        this.PxuCJdSBwIXG = sh0Var;
        bf1.Companion.getClass();
        this.rtx2ld2ELZv4 = 0L;
        a62.Companion.getClass();
        this.OPXfSBeufaJ8 = 9205357640488583168L;
        this.XL4ISE6Oc65B = new uj();
        sh0Var.EcgxDIVH5in8(false);
        wq0.Companion.getClass();
        this.EcgxDIVH5in8 = 0L;
        ir0.Companion.getClass();
        this.S9EYkSpbGuxq = 0L;
        this.VhhvGxCb8gfr = 9205357640488583168L;
    }

    public final void PxuCJdSBwIXG() {
        Outline outline;
        if (this.RAsUl2FVSrh6) {
            boolean z = this.S2OOm9zPNm0h;
            Outline outline2 = null;
            sh0 sh0Var = this.PxuCJdSBwIXG;
            if (z || sh0Var.ozEBbv0hFTAB() > 0.0f) {
                yj1 yj1Var = this.x50lh2ztY7Y5;
                if (yj1Var != null) {
                    RectF rectF = this.ZbWwgt3aGe7A;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.ZbWwgt3aGe7A = rectF;
                    }
                    boolean z2 = yj1Var instanceof r4;
                    if (!z2) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    Path path = ((r4) yj1Var).PxuCJdSBwIXG;
                    path.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || path.isConvex()) {
                        outline = this.a92UlCVFR9N8;
                        if (outline == null) {
                            outline = new Outline();
                            this.a92UlCVFR9N8 = outline;
                        }
                        if (i >= 30) {
                            if (!z2) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setPath(path);
                        } else {
                            if (!z2) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(path);
                        }
                        this.r3s1LDPKFs1S = !outline.canClip();
                    } else {
                        Outline outline3 = this.a92UlCVFR9N8;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.r3s1LDPKFs1S = true;
                        outline = null;
                    }
                    this.x50lh2ztY7Y5 = yj1Var;
                    if (outline != null) {
                        outline.setAlpha(sh0Var.PxuCJdSBwIXG());
                        outline2 = outline;
                    }
                    sh0Var.dgRBjINgWbAK(outline2, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                    if (this.r3s1LDPKFs1S && this.S2OOm9zPNm0h) {
                        sh0Var.EcgxDIVH5in8(false);
                        sh0Var.gPXPFXrUH4XX();
                    } else {
                        sh0Var.EcgxDIVH5in8(this.S2OOm9zPNm0h);
                    }
                } else {
                    sh0Var.EcgxDIVH5in8(this.S2OOm9zPNm0h);
                    a62.Companion.getClass();
                    Outline outline4 = this.a92UlCVFR9N8;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.a92UlCVFR9N8 = outline4;
                    }
                    Outline outline5 = outline4;
                    long gGoUzNp9JO5I = kj0.gGoUzNp9JO5I(this.S9EYkSpbGuxq);
                    long j = this.rtx2ld2ELZv4;
                    long j2 = this.OPXfSBeufaJ8;
                    if (j2 != 9205357640488583168L) {
                        gGoUzNp9JO5I = j2;
                    }
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    int i4 = (int) (gGoUzNp9JO5I >> 32);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat((int) (gGoUzNp9JO5I & 4294967295L)) + Float.intBitsToFloat(i3)), this.wdg6QnbFHrFF);
                    outline5.setAlpha(sh0Var.PxuCJdSBwIXG());
                    sh0Var.dgRBjINgWbAK(outline5, (4294967295L & Math.round(Float.intBitsToFloat(r15))) | (Math.round(Float.intBitsToFloat(i4)) << 32));
                }
            } else {
                sh0Var.EcgxDIVH5in8(false);
                ir0.Companion.getClass();
                sh0Var.dgRBjINgWbAK(null, 0L);
            }
        }
        this.RAsUl2FVSrh6 = false;
    }

    public final void TSizfFm2Yiuu(k30 k30Var) {
        uj ujVar = this.XL4ISE6Oc65B;
        ujVar.TSizfFm2Yiuu = (ph0) ujVar.lS5Rgt96tfkO;
        w81 w81Var = (w81) ujVar.Y1f8riQaR6yg;
        if (w81Var != null && w81Var.rtx2ld2ELZv4()) {
            w81 w81Var2 = (w81) ujVar.e9gEMXR7LXtO;
            if (w81Var2 == null) {
                w81 w81Var3 = d02.PxuCJdSBwIXG;
                w81Var2 = new w81();
                ujVar.e9gEMXR7LXtO = w81Var2;
            }
            w81Var2.wdg6QnbFHrFF(w81Var);
            w81Var.lS5Rgt96tfkO();
        }
        ujVar.PxuCJdSBwIXG = true;
        this.Y1f8riQaR6yg.OPXfSBeufaJ8(k30Var);
        ujVar.PxuCJdSBwIXG = false;
        ph0 ph0Var = (ph0) ujVar.TSizfFm2Yiuu;
        if (ph0Var != null) {
            ph0Var.BRwzKIf41E4i--;
            ph0Var.lS5Rgt96tfkO();
        }
        w81 w81Var4 = (w81) ujVar.e9gEMXR7LXtO;
        if (w81Var4 == null || !w81Var4.rtx2ld2ELZv4()) {
            return;
        }
        Object[] objArr = w81Var4.lS5Rgt96tfkO;
        long[] jArr = w81Var4.PxuCJdSBwIXG;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            r9.BRwzKIf41E4i--;
                            ((ph0) objArr[(i << 3) + i3]).lS5Rgt96tfkO();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        w81Var4.lS5Rgt96tfkO();
    }

    public final th0 Y1f8riQaR6yg() {
        th0 xh1Var;
        th0 th0Var = this.dgRBjINgWbAK;
        yj1 yj1Var = this.x50lh2ztY7Y5;
        if (th0Var != null) {
            return th0Var;
        }
        if (yj1Var != null) {
            wh1 wh1Var = new wh1(yj1Var);
            this.dgRBjINgWbAK = wh1Var;
            return wh1Var;
        }
        long gGoUzNp9JO5I = kj0.gGoUzNp9JO5I(this.S9EYkSpbGuxq);
        long j = this.rtx2ld2ELZv4;
        long j2 = this.OPXfSBeufaJ8;
        if (j2 != 9205357640488583168L) {
            gGoUzNp9JO5I = j2;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (gGoUzNp9JO5I >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (gGoUzNp9JO5I & 4294967295L)) + intBitsToFloat2;
        if (this.wdg6QnbFHrFF > 0.0f) {
            xh1Var = new yh1(ki0.a92UlCVFR9N8(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, (Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0))));
        } else {
            xh1Var = new xh1(new qt1(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.dgRBjINgWbAK = xh1Var;
        return xh1Var;
    }

    public final void a92UlCVFR9N8(float f, long j, long j2) {
        if (bf1.lS5Rgt96tfkO(this.rtx2ld2ELZv4, j) && a62.PxuCJdSBwIXG(this.OPXfSBeufaJ8, j2) && this.wdg6QnbFHrFF == f && this.x50lh2ztY7Y5 == null) {
            return;
        }
        e9gEMXR7LXtO();
        this.rtx2ld2ELZv4 = j;
        this.OPXfSBeufaJ8 = j2;
        this.wdg6QnbFHrFF = f;
        PxuCJdSBwIXG();
    }

    public final void e9gEMXR7LXtO() {
        this.dgRBjINgWbAK = null;
        this.x50lh2ztY7Y5 = null;
        a62.Companion.getClass();
        this.OPXfSBeufaJ8 = 9205357640488583168L;
        bf1.Companion.getClass();
        this.rtx2ld2ELZv4 = 0L;
        this.wdg6QnbFHrFF = 0.0f;
        this.RAsUl2FVSrh6 = true;
        this.r3s1LDPKFs1S = false;
    }

    public final void lS5Rgt96tfkO() {
        if (this.RfyTYNmI9Srp && this.BRwzKIf41E4i == 0) {
            uj ujVar = this.XL4ISE6Oc65B;
            ph0 ph0Var = (ph0) ujVar.lS5Rgt96tfkO;
            if (ph0Var != null) {
                ph0Var.BRwzKIf41E4i--;
                ph0Var.lS5Rgt96tfkO();
                ujVar.lS5Rgt96tfkO = null;
            }
            w81 w81Var = (w81) ujVar.Y1f8riQaR6yg;
            if (w81Var != null) {
                Object[] objArr = w81Var.lS5Rgt96tfkO;
                long[] jArr = w81Var.PxuCJdSBwIXG;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    r11.BRwzKIf41E4i--;
                                    ((ph0) objArr[(i << 3) + i3]).lS5Rgt96tfkO();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                w81Var.lS5Rgt96tfkO();
            }
            this.PxuCJdSBwIXG.gPXPFXrUH4XX();
        }
    }
}
