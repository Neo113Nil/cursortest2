package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class fv {
    public boolean OPXfSBeufaJ8;
    public final r1 PxuCJdSBwIXG;
    public qt1 QrzZRwfaDlRX;
    public boolean RAsUl2FVSrh6;
    public boolean Y1f8riQaR6yg;
    public boolean a92UlCVFR9N8;
    public ji2 dgRBjINgWbAK;
    public boolean e9gEMXR7LXtO;
    public final m9 lS5Rgt96tfkO;
    public qt1 r3s1LDPKFs1S;
    public boolean rtx2ld2ELZv4;
    public oh2 wdg6QnbFHrFF;
    public df1 x50lh2ztY7Y5;
    public final Object TSizfFm2Yiuu = new Object();
    public le0 cpQdD2nAriOS = k1.ZbWwgt3aGe7A;
    public final CursorAnchorInfo.Builder gPXPFXrUH4XX = new CursorAnchorInfo.Builder();
    public final float[] BRwzKIf41E4i = d51.PxuCJdSBwIXG();
    public final Matrix XL4ISE6Oc65B = new Matrix();

    public fv(r1 r1Var, m9 m9Var) {
        this.PxuCJdSBwIXG = r1Var;
        this.lS5Rgt96tfkO = m9Var;
    }

    public final void PxuCJdSBwIXG() {
        View view;
        EditorBoundsInfo.Builder editorBounds;
        EditorBoundsInfo.Builder handwritingBounds;
        EditorBoundsInfo build;
        m9 m9Var = this.lS5Rgt96tfkO;
        nx0 nx0Var = (nx0) m9Var.wdg6QnbFHrFF;
        InputMethodManager inputMethodManager = (InputMethodManager) nx0Var.getValue();
        View view2 = (View) m9Var.OPXfSBeufaJ8;
        if (inputMethodManager.isActive(view2)) {
            le0 le0Var = this.cpQdD2nAriOS;
            float[] fArr = this.BRwzKIf41E4i;
            le0Var.OPXfSBeufaJ8(new d51(fArr));
            this.PxuCJdSBwIXG.S9EYkSpbGuxq(fArr);
            Matrix matrix = this.XL4ISE6Oc65B;
            fx1.iSxsmagYqzHM(matrix, fArr);
            oh2 oh2Var = this.wdg6QnbFHrFF;
            oh2Var.getClass();
            long j = oh2Var.lS5Rgt96tfkO;
            df1 df1Var = this.x50lh2ztY7Y5;
            df1Var.getClass();
            ji2 ji2Var = this.dgRBjINgWbAK;
            ji2Var.getClass();
            r71 r71Var = ji2Var.lS5Rgt96tfkO;
            qt1 qt1Var = this.r3s1LDPKFs1S;
            qt1Var.getClass();
            float f = qt1Var.Y1f8riQaR6yg;
            float f2 = qt1Var.lS5Rgt96tfkO;
            qt1 qt1Var2 = this.QrzZRwfaDlRX;
            qt1Var2.getClass();
            boolean z = this.a92UlCVFR9N8;
            boolean z2 = this.RAsUl2FVSrh6;
            boolean z3 = this.rtx2ld2ELZv4;
            boolean z4 = this.OPXfSBeufaJ8;
            CursorAnchorInfo.Builder builder = this.gPXPFXrUH4XX;
            builder.reset();
            builder.setMatrix(matrix);
            vi2 vi2Var = oh2Var.TSizfFm2Yiuu;
            int a92UlCVFR9N8 = vi2.a92UlCVFR9N8(j);
            builder.setSelectionRange(a92UlCVFR9N8, vi2.e9gEMXR7LXtO(j));
            iv1 iv1Var = iv1.OPXfSBeufaJ8;
            if (!z || a92UlCVFR9N8 < 0) {
                view = view2;
            } else {
                int lS5Rgt96tfkO = df1Var.lS5Rgt96tfkO(a92UlCVFR9N8);
                qt1 TSizfFm2Yiuu = ji2Var.TSizfFm2Yiuu(lS5Rgt96tfkO);
                view = view2;
                float OPXfSBeufaJ8 = ng0.OPXfSBeufaJ8(TSizfFm2Yiuu.PxuCJdSBwIXG, 0.0f, (int) (ji2Var.TSizfFm2Yiuu >> 32));
                boolean POWyO8hTM6YC = b51.POWyO8hTM6YC(qt1Var, OPXfSBeufaJ8, TSizfFm2Yiuu.lS5Rgt96tfkO);
                boolean POWyO8hTM6YC2 = b51.POWyO8hTM6YC(qt1Var, OPXfSBeufaJ8, TSizfFm2Yiuu.Y1f8riQaR6yg);
                boolean z5 = ji2Var.PxuCJdSBwIXG(lS5Rgt96tfkO) == iv1Var;
                int i = (POWyO8hTM6YC || POWyO8hTM6YC2) ? 1 : 0;
                if (!POWyO8hTM6YC || !POWyO8hTM6YC2) {
                    i |= 2;
                }
                if (z5) {
                    i |= 4;
                }
                float f3 = TSizfFm2Yiuu.lS5Rgt96tfkO;
                float f4 = TSizfFm2Yiuu.Y1f8riQaR6yg;
                builder.setInsertionMarkerLocation(OPXfSBeufaJ8, f3, f4, f4, i);
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
                        float f5 = fArr2[i2];
                        CursorAnchorInfo.Builder builder3 = builder2;
                        float f6 = fArr2[i2 + 1];
                        int i3 = e9gEMXR7LXtO;
                        float f7 = fArr2[i2 + 2];
                        float f8 = fArr2[i2 + 3];
                        int i4 = a92UlCVFR9N82;
                        int i5 = (qt1Var.PxuCJdSBwIXG < f7 ? 1 : 0) & (f5 < qt1Var.TSizfFm2Yiuu ? 1 : 0) & (f2 < f8 ? 1 : 0) & (f6 < f ? 1 : 0);
                        if (!b51.POWyO8hTM6YC(qt1Var, f5, f6) || !b51.POWyO8hTM6YC(qt1Var, f7, f8)) {
                            i5 |= 2;
                        }
                        if (ji2Var.PxuCJdSBwIXG(lS5Rgt96tfkO4) == iv1Var) {
                            i5 |= 4;
                        }
                        builder3.addCharacterBounds(i4, f5, f6, f7, f8, i5);
                        builder2 = builder3;
                        a92UlCVFR9N82 = i4 + 1;
                        e9gEMXR7LXtO = i3;
                    }
                }
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 33 && z3) {
                editorBounds = uy1Qfkdvj4xZ.rtx2ld2ELZv4().setEditorBounds(vi0.JHNfcAUfKc4G(qt1Var2));
                handwritingBounds = editorBounds.setHandwritingBounds(vi0.JHNfcAUfKc4G(qt1Var2));
                build = handwritingBounds.build();
                builder2.setEditorBoundsInfo(build);
            }
            if (i6 >= 34 && z4 && !qt1Var.a92UlCVFR9N8()) {
                int i7 = r71Var.a92UlCVFR9N8 - 1;
                if (i7 < 0) {
                    i7 = 0;
                }
                int wdg6QnbFHrFF = ng0.wdg6QnbFHrFF(r71Var.e9gEMXR7LXtO(f2), 0, i7);
                int wdg6QnbFHrFF2 = ng0.wdg6QnbFHrFF(r71Var.e9gEMXR7LXtO(f), 0, i7);
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
            ((InputMethodManager) nx0Var.getValue()).updateCursorAnchorInfo(view, builder2.build());
            this.e9gEMXR7LXtO = false;
        }
    }
}
