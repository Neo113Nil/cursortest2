package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class uz0 {
    public boolean OPXfSBeufaJ8;
    public final c4 PxuCJdSBwIXG;
    public boolean RAsUl2FVSrh6;
    public boolean Y1f8riQaR6yg;
    public boolean a92UlCVFR9N8;
    public qt1 cpQdD2nAriOS;
    public ji2 dgRBjINgWbAK;
    public boolean e9gEMXR7LXtO;
    public final op0 lS5Rgt96tfkO;
    public qt1 r3s1LDPKFs1S;
    public boolean rtx2ld2ELZv4;
    public oh2 wdg6QnbFHrFF;
    public df1 x50lh2ztY7Y5;
    public final Object TSizfFm2Yiuu = new Object();
    public final CursorAnchorInfo.Builder QrzZRwfaDlRX = new CursorAnchorInfo.Builder();
    public final float[] gPXPFXrUH4XX = d51.PxuCJdSBwIXG();
    public final Matrix BRwzKIf41E4i = new Matrix();

    public uz0(c4 c4Var, op0 op0Var) {
        this.PxuCJdSBwIXG = c4Var;
        this.lS5Rgt96tfkO = op0Var;
    }

    public final void PxuCJdSBwIXG() {
        float f;
        float f2;
        EditorBoundsInfo.Builder editorBounds;
        EditorBoundsInfo.Builder handwritingBounds;
        EditorBoundsInfo build;
        op0 op0Var = this.lS5Rgt96tfkO;
        InputMethodManager gPXPFXrUH4XX = op0Var.gPXPFXrUH4XX();
        View view = (View) op0Var.OPXfSBeufaJ8;
        if (!gPXPFXrUH4XX.isActive(view) || this.wdg6QnbFHrFF == null || this.x50lh2ztY7Y5 == null || this.dgRBjINgWbAK == null || this.cpQdD2nAriOS == null || this.r3s1LDPKFs1S == null) {
            return;
        }
        float[] fArr = this.gPXPFXrUH4XX;
        d51.Y1f8riQaR6yg(fArr);
        bw0 bw0Var = (bw0) this.PxuCJdSBwIXG.QrzZRwfaDlRX.pnx5pC0XzaCw.getValue();
        if (bw0Var != null) {
            if (!bw0Var.aF05bpZJlKEP()) {
                bw0Var = null;
            }
            if (bw0Var != null) {
                bw0Var.kpCQ9veP6n3I(fArr);
            }
        }
        qt1 qt1Var = this.r3s1LDPKFs1S;
        qt1Var.getClass();
        float f3 = -qt1Var.PxuCJdSBwIXG;
        qt1 qt1Var2 = this.r3s1LDPKFs1S;
        qt1Var2.getClass();
        d51.a92UlCVFR9N8(fArr, f3, -qt1Var2.lS5Rgt96tfkO);
        Matrix matrix = this.BRwzKIf41E4i;
        fx1.iSxsmagYqzHM(matrix, fArr);
        oh2 oh2Var = this.wdg6QnbFHrFF;
        oh2Var.getClass();
        long j = oh2Var.lS5Rgt96tfkO;
        df1 df1Var = this.x50lh2ztY7Y5;
        df1Var.getClass();
        ji2 ji2Var = this.dgRBjINgWbAK;
        ji2Var.getClass();
        r71 r71Var = ji2Var.lS5Rgt96tfkO;
        qt1 qt1Var3 = this.cpQdD2nAriOS;
        qt1Var3.getClass();
        float f4 = qt1Var3.Y1f8riQaR6yg;
        float f5 = qt1Var3.lS5Rgt96tfkO;
        qt1 qt1Var4 = this.r3s1LDPKFs1S;
        qt1Var4.getClass();
        boolean z = this.a92UlCVFR9N8;
        boolean z2 = this.RAsUl2FVSrh6;
        boolean z3 = this.rtx2ld2ELZv4;
        boolean z4 = this.OPXfSBeufaJ8;
        CursorAnchorInfo.Builder builder = this.QrzZRwfaDlRX;
        builder.reset();
        builder.setMatrix(matrix);
        vi2 vi2Var = oh2Var.TSizfFm2Yiuu;
        int a92UlCVFR9N8 = vi2.a92UlCVFR9N8(j);
        builder.setSelectionRange(a92UlCVFR9N8, vi2.e9gEMXR7LXtO(j));
        iv1 iv1Var = iv1.OPXfSBeufaJ8;
        if (!z || a92UlCVFR9N8 < 0) {
            f = f4;
            f2 = f5;
        } else {
            int lS5Rgt96tfkO = df1Var.lS5Rgt96tfkO(a92UlCVFR9N8);
            qt1 TSizfFm2Yiuu = ji2Var.TSizfFm2Yiuu(lS5Rgt96tfkO);
            f = f4;
            f2 = f5;
            float OPXfSBeufaJ8 = ng0.OPXfSBeufaJ8(TSizfFm2Yiuu.PxuCJdSBwIXG, 0.0f, (int) (ji2Var.TSizfFm2Yiuu >> 32));
            boolean S9EYkSpbGuxq = ki0.S9EYkSpbGuxq(qt1Var3, OPXfSBeufaJ8, TSizfFm2Yiuu.lS5Rgt96tfkO);
            boolean S9EYkSpbGuxq2 = ki0.S9EYkSpbGuxq(qt1Var3, OPXfSBeufaJ8, TSizfFm2Yiuu.Y1f8riQaR6yg);
            boolean z5 = ji2Var.PxuCJdSBwIXG(lS5Rgt96tfkO) == iv1Var;
            int i = (S9EYkSpbGuxq || S9EYkSpbGuxq2) ? 1 : 0;
            if (!S9EYkSpbGuxq || !S9EYkSpbGuxq2) {
                i |= 2;
            }
            if (z5) {
                i |= 4;
            }
            float f6 = TSizfFm2Yiuu.lS5Rgt96tfkO;
            float f7 = TSizfFm2Yiuu.Y1f8riQaR6yg;
            builder.setInsertionMarkerLocation(OPXfSBeufaJ8, f6, f7, f7, i);
        }
        CursorAnchorInfo.Builder builder2 = builder;
        if (z2) {
            int a92UlCVFR9N82 = vi2Var != null ? vi2.a92UlCVFR9N8(vi2Var.PxuCJdSBwIXG) : -1;
            int e9gEMXR7LXtO = vi2Var != null ? vi2.e9gEMXR7LXtO(vi2Var.PxuCJdSBwIXG) : -1;
            if (a92UlCVFR9N82 >= 0 && a92UlCVFR9N82 < e9gEMXR7LXtO) {
                builder2.setComposingText(a92UlCVFR9N82, oh2Var.PxuCJdSBwIXG.OPXfSBeufaJ8.subSequence(a92UlCVFR9N82, e9gEMXR7LXtO));
                int lS5Rgt96tfkO2 = df1Var.lS5Rgt96tfkO(a92UlCVFR9N82);
                int lS5Rgt96tfkO3 = df1Var.lS5Rgt96tfkO(e9gEMXR7LXtO);
                float[] fArr2 = new float[(lS5Rgt96tfkO3 - lS5Rgt96tfkO2) * 4];
                r71Var.PxuCJdSBwIXG(jh0.rtx2ld2ELZv4(lS5Rgt96tfkO2, lS5Rgt96tfkO3), fArr2);
                while (a92UlCVFR9N82 < e9gEMXR7LXtO) {
                    int lS5Rgt96tfkO4 = df1Var.lS5Rgt96tfkO(a92UlCVFR9N82);
                    int i2 = (lS5Rgt96tfkO4 - lS5Rgt96tfkO2) * 4;
                    float f8 = fArr2[i2];
                    CursorAnchorInfo.Builder builder3 = builder2;
                    float f9 = fArr2[i2 + 1];
                    int i3 = lS5Rgt96tfkO2;
                    float f10 = fArr2[i2 + 2];
                    float f11 = fArr2[i2 + 3];
                    int i4 = e9gEMXR7LXtO;
                    int i5 = (qt1Var3.PxuCJdSBwIXG < f10 ? 1 : 0) & (f8 < qt1Var3.TSizfFm2Yiuu ? 1 : 0) & (f2 < f11 ? 1 : 0) & (f9 < f ? 1 : 0);
                    if (!ki0.S9EYkSpbGuxq(qt1Var3, f8, f9) || !ki0.S9EYkSpbGuxq(qt1Var3, f10, f11)) {
                        i5 |= 2;
                    }
                    if (ji2Var.PxuCJdSBwIXG(lS5Rgt96tfkO4) == iv1Var) {
                        i5 |= 4;
                    }
                    int i6 = a92UlCVFR9N82;
                    builder3.addCharacterBounds(i6, f8, f9, f10, f11, i5);
                    builder2 = builder3;
                    a92UlCVFR9N82 = i6 + 1;
                    lS5Rgt96tfkO2 = i3;
                    e9gEMXR7LXtO = i4;
                }
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33 && z3) {
            editorBounds = uy1Qfkdvj4xZ.rtx2ld2ELZv4().setEditorBounds(vi0.JHNfcAUfKc4G(qt1Var4));
            handwritingBounds = editorBounds.setHandwritingBounds(vi0.JHNfcAUfKc4G(qt1Var4));
            build = handwritingBounds.build();
            builder2.setEditorBoundsInfo(build);
        }
        if (i7 >= 34 && z4 && !qt1Var3.a92UlCVFR9N8()) {
            int i8 = r71Var.a92UlCVFR9N8 - 1;
            if (i8 < 0) {
                i8 = 0;
            }
            int wdg6QnbFHrFF = ng0.wdg6QnbFHrFF(r71Var.e9gEMXR7LXtO(f2), 0, i8);
            int wdg6QnbFHrFF2 = ng0.wdg6QnbFHrFF(r71Var.e9gEMXR7LXtO(f), 0, i8);
            if (wdg6QnbFHrFF <= wdg6QnbFHrFF2) {
                while (true) {
                    builder2.addVisibleLineBounds(ji2Var.Y1f8riQaR6yg(wdg6QnbFHrFF), r71Var.a92UlCVFR9N8(wdg6QnbFHrFF), ji2Var.e9gEMXR7LXtO(wdg6QnbFHrFF), r71Var.lS5Rgt96tfkO(wdg6QnbFHrFF));
                    if (wdg6QnbFHrFF == wdg6QnbFHrFF2) {
                        break;
                    } else {
                        wdg6QnbFHrFF++;
                    }
                }
            }
        }
        op0Var.gPXPFXrUH4XX().updateCursorAnchorInfo(view, builder2.build());
        this.e9gEMXR7LXtO = false;
    }
}
