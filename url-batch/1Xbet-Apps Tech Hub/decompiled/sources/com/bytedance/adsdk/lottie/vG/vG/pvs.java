package com.bytedance.adsdk.lottie.vG.vG;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.lottie.NB.Wyp;
import com.bytedance.adsdk.lottie.pvs.icD.mnm;
import com.bytedance.adsdk.lottie.pvs.icD.pvs;
import com.bytedance.adsdk.lottie.vG.icD.IP;
import com.bytedance.adsdk.lottie.vG.icD.so;
import com.bytedance.adsdk.lottie.vG.vG.Jd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: BaseLayer.java */
/* loaded from: classes.dex */
public abstract class pvs implements pvs.InterfaceC0030pvs, com.bytedance.adsdk.lottie.pvs.pvs.NB {
    private boolean CvL;
    private boolean Gp;
    private final Paint IP;
    final mnm Jd;
    private final Paint Ju;
    float NB;
    private com.bytedance.adsdk.lottie.pvs.icD.Jd OT;
    private pvs ZhG;
    private Paint ae;
    private final RectF bNS;
    private final RectF cR;
    private final List<com.bytedance.adsdk.lottie.pvs.icD.pvs<?, ?>> dX;
    private List<pvs> dyT;
    final com.bytedance.adsdk.lottie.so icD;
    private final RectF mnm;
    private pvs ny;
    final Matrix pvs;
    private com.bytedance.adsdk.lottie.pvs.icD.so rCZ;
    BlurMaskFilter sUS;
    private final String uc;
    private final RectF vA;
    final Jd vG;
    private final RectF zM;
    private final Path yiw = new Path();
    private final Matrix so = new Matrix();
    private final Matrix Mxy = new Matrix();
    private final Paint Wyp = new com.bytedance.adsdk.lottie.pvs.pvs(1);
    private final Paint qh = new com.bytedance.adsdk.lottie.pvs.pvs(1, PorterDuff.Mode.DST_IN);
    private final Paint kj = new com.bytedance.adsdk.lottie.pvs.pvs(1, PorterDuff.Mode.DST_OUT);

    abstract void icD(Canvas canvas, Matrix matrix, int i);

    @Override // com.bytedance.adsdk.lottie.pvs.pvs.vG
    public void pvs(List<com.bytedance.adsdk.lottie.pvs.pvs.vG> list, List<com.bytedance.adsdk.lottie.pvs.pvs.vG> list2) {
    }

    static pvs pvs(icD icd, Jd jd, com.bytedance.adsdk.lottie.so soVar, com.bytedance.adsdk.lottie.sUS sus) {
        switch (AnonymousClass2.pvs[jd.qh().ordinal()]) {
            case 1:
                return new sUS(soVar, jd, icd, sus);
            case 2:
                return new icD(soVar, jd, sus.icD(jd.yiw()), sus);
            case 3:
                return new yiw(soVar, jd);
            case 4:
                return new vG(soVar, jd);
            case 5:
                return new NB(soVar, jd);
            case 6:
                return new so(soVar, jd);
            default:
                new StringBuilder("Unknown layer type ").append(jd.qh());
                return null;
        }
    }

    pvs(com.bytedance.adsdk.lottie.so soVar, Jd jd) {
        com.bytedance.adsdk.lottie.pvs.pvs pvsVar = new com.bytedance.adsdk.lottie.pvs.pvs(1);
        this.Ju = pvsVar;
        this.IP = new com.bytedance.adsdk.lottie.pvs.pvs(PorterDuff.Mode.CLEAR);
        this.bNS = new RectF();
        this.mnm = new RectF();
        this.vA = new RectF();
        this.cR = new RectF();
        this.zM = new RectF();
        this.pvs = new Matrix();
        this.dX = new ArrayList();
        this.CvL = true;
        this.NB = 0.0f;
        this.icD = soVar;
        this.vG = jd;
        this.uc = jd.sUS() + "#draw";
        if (jd.kj() == Jd.icD.INVERT) {
            pvsVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            pvsVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        mnm Wyp = jd.bNS().Wyp();
        this.Jd = Wyp;
        Wyp.pvs((pvs.InterfaceC0030pvs) this);
        if (jd.Wyp() != null && !jd.Wyp().isEmpty()) {
            com.bytedance.adsdk.lottie.pvs.icD.so soVar2 = new com.bytedance.adsdk.lottie.pvs.icD.so(jd.Wyp());
            this.rCZ = soVar2;
            Iterator<com.bytedance.adsdk.lottie.pvs.icD.pvs<IP, Path>> it = soVar2.icD().iterator();
            while (it.hasNext()) {
                it.next().pvs(this);
            }
            for (com.bytedance.adsdk.lottie.pvs.icD.pvs<Integer, Integer> pvsVar2 : this.rCZ.vG()) {
                pvs(pvsVar2);
                pvsVar2.pvs(this);
            }
        }
        so();
    }

    void pvs(boolean z) {
        if (z && this.ae == null) {
            this.ae = new com.bytedance.adsdk.lottie.pvs.pvs();
        }
        this.Gp = z;
    }

    @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs.InterfaceC0030pvs
    public void pvs() {
        Mxy();
    }

    Jd icD() {
        return this.vG;
    }

    void pvs(pvs pvsVar) {
        this.ny = pvsVar;
    }

    boolean vG() {
        return this.ny != null;
    }

    void icD(pvs pvsVar) {
        this.ZhG = pvsVar;
    }

    private void so() {
        if (!this.vG.Jd().isEmpty()) {
            com.bytedance.adsdk.lottie.pvs.icD.Jd jd = new com.bytedance.adsdk.lottie.pvs.icD.Jd(this.vG.Jd());
            this.OT = jd;
            jd.pvs();
            this.OT.pvs(new pvs.InterfaceC0030pvs() { // from class: com.bytedance.adsdk.lottie.vG.vG.pvs.1
                @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs.InterfaceC0030pvs
                public void pvs() {
                    pvs pvsVar = pvs.this;
                    pvsVar.icD(pvsVar.OT.Mxy() == 1.0f);
                }
            });
            icD(this.OT.yiw().floatValue() == 1.0f);
            pvs(this.OT);
            return;
        }
        icD(true);
    }

    private void Mxy() {
        this.icD.invalidateSelf();
    }

    public void pvs(com.bytedance.adsdk.lottie.pvs.icD.pvs<?, ?> pvsVar) {
        if (pvsVar == null) {
            return;
        }
        this.dX.add(pvsVar);
    }

    public void pvs(RectF rectF, Matrix matrix, boolean z) {
        this.bNS.set(0.0f, 0.0f, 0.0f, 0.0f);
        qh();
        this.pvs.set(matrix);
        if (z) {
            List<pvs> list = this.dyT;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.pvs.preConcat(this.dyT.get(size).Jd.Jd());
                }
            } else {
                pvs pvsVar = this.ZhG;
                if (pvsVar != null) {
                    this.pvs.preConcat(pvsVar.Jd.Jd());
                }
            }
        }
        this.pvs.preConcat(this.Jd.Jd());
    }

    @Override // com.bytedance.adsdk.lottie.pvs.pvs.NB
    public void pvs(Canvas canvas, Matrix matrix, int i) {
        Paint paint;
        Integer yiw;
        com.bytedance.adsdk.lottie.NB.pvs(this.uc);
        if (!this.CvL || this.vG.OT()) {
            com.bytedance.adsdk.lottie.NB.icD(this.uc);
            return;
        }
        qh();
        com.bytedance.adsdk.lottie.NB.pvs("Layer#parentMatrix");
        this.so.reset();
        this.so.set(matrix);
        for (int size = this.dyT.size() - 1; size >= 0; size--) {
            this.so.preConcat(this.dyT.get(size).Jd.Jd());
        }
        com.bytedance.adsdk.lottie.NB.icD("Layer#parentMatrix");
        com.bytedance.adsdk.lottie.pvs.icD.pvs<?, Integer> pvs = this.Jd.pvs();
        int intValue = (int) ((((i / 255.0f) * ((pvs == null || (yiw = pvs.yiw()) == null) ? 100 : yiw.intValue())) / 100.0f) * 255.0f);
        if (!vG() && !Jd()) {
            this.so.preConcat(this.Jd.Jd());
            com.bytedance.adsdk.lottie.NB.pvs("Layer#drawLayer");
            icD(canvas, this.so, intValue);
            com.bytedance.adsdk.lottie.NB.icD("Layer#drawLayer");
            vG(com.bytedance.adsdk.lottie.NB.icD(this.uc));
            return;
        }
        com.bytedance.adsdk.lottie.NB.pvs("Layer#computeBounds");
        pvs(this.bNS, this.so, false);
        icD(this.bNS, matrix);
        this.so.preConcat(this.Jd.Jd());
        pvs(this.bNS, this.so);
        this.mnm.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.Mxy);
        if (!this.Mxy.isIdentity()) {
            Matrix matrix2 = this.Mxy;
            matrix2.invert(matrix2);
            this.Mxy.mapRect(this.mnm);
        }
        if (!this.bNS.intersect(this.mnm)) {
            this.bNS.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        com.bytedance.adsdk.lottie.NB.icD("Layer#computeBounds");
        if (this.bNS.width() >= 1.0f && this.bNS.height() >= 1.0f) {
            com.bytedance.adsdk.lottie.NB.pvs("Layer#saveLayer");
            this.Wyp.setAlpha(255);
            com.bytedance.adsdk.lottie.sUS.sUS.pvs(canvas, this.bNS, this.Wyp);
            com.bytedance.adsdk.lottie.NB.icD("Layer#saveLayer");
            pvs(canvas);
            com.bytedance.adsdk.lottie.NB.pvs("Layer#drawLayer");
            icD(canvas, this.so, intValue);
            com.bytedance.adsdk.lottie.NB.icD("Layer#drawLayer");
            if (Jd()) {
                pvs(canvas, this.so);
            }
            if (vG()) {
                com.bytedance.adsdk.lottie.NB.pvs("Layer#drawMatte");
                com.bytedance.adsdk.lottie.NB.pvs("Layer#saveLayer");
                com.bytedance.adsdk.lottie.sUS.sUS.pvs(canvas, this.bNS, this.Ju, 19);
                com.bytedance.adsdk.lottie.NB.icD("Layer#saveLayer");
                pvs(canvas);
                this.ny.pvs(canvas, matrix, intValue);
                com.bytedance.adsdk.lottie.NB.pvs("Layer#restoreLayer");
                canvas.restore();
                com.bytedance.adsdk.lottie.NB.icD("Layer#restoreLayer");
                com.bytedance.adsdk.lottie.NB.icD("Layer#drawMatte");
            }
            com.bytedance.adsdk.lottie.NB.pvs("Layer#restoreLayer");
            canvas.restore();
            com.bytedance.adsdk.lottie.NB.icD("Layer#restoreLayer");
        }
        if (this.Gp && (paint = this.ae) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.ae.setColor(-251901);
            this.ae.setStrokeWidth(4.0f);
            canvas.drawRect(this.bNS, this.ae);
            this.ae.setStyle(Paint.Style.FILL);
            this.ae.setColor(1357638635);
            canvas.drawRect(this.bNS, this.ae);
        }
        vG(com.bytedance.adsdk.lottie.NB.icD(this.uc));
    }

    private void vG(float f) {
        this.icD.OT().vG().pvs(this.vG.sUS(), f);
    }

    private void pvs(Canvas canvas) {
        com.bytedance.adsdk.lottie.NB.pvs("Layer#clearLayer");
        canvas.drawRect(this.bNS.left - 1.0f, this.bNS.top - 1.0f, this.bNS.right + 1.0f, this.bNS.bottom + 1.0f, this.IP);
        com.bytedance.adsdk.lottie.NB.icD("Layer#clearLayer");
    }

    private void pvs(RectF rectF, Matrix matrix) {
        this.vA.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (Jd()) {
            int size = this.rCZ.pvs().size();
            for (int i = 0; i < size; i++) {
                com.bytedance.adsdk.lottie.vG.icD.so soVar = this.rCZ.pvs().get(i);
                Path yiw = this.rCZ.icD().get(i).yiw();
                if (yiw != null) {
                    this.yiw.set(yiw);
                    this.yiw.transform(matrix);
                    int i2 = AnonymousClass2.icD[soVar.pvs().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        return;
                    }
                    if ((i2 == 3 || i2 == 4) && soVar.Jd()) {
                        return;
                    }
                    this.yiw.computeBounds(this.zM, false);
                    if (i == 0) {
                        this.vA.set(this.zM);
                    } else {
                        RectF rectF2 = this.vA;
                        rectF2.set(Math.min(rectF2.left, this.zM.left), Math.min(this.vA.top, this.zM.top), Math.max(this.vA.right, this.zM.right), Math.max(this.vA.bottom, this.zM.bottom));
                    }
                }
            }
            if (rectF.intersect(this.vA)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* compiled from: BaseLayer.java */
    /* renamed from: com.bytedance.adsdk.lottie.vG.vG.pvs$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] icD;
        static final /* synthetic */ int[] pvs;

        static {
            int[] iArr = new int[so.pvs.values().length];
            icD = iArr;
            try {
                iArr[so.pvs.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                icD[so.pvs.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                icD[so.pvs.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                icD[so.pvs.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Jd.pvs.values().length];
            pvs = iArr2;
            try {
                iArr2[Jd.pvs.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                pvs[Jd.pvs.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                pvs[Jd.pvs.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                pvs[Jd.pvs.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                pvs[Jd.pvs.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                pvs[Jd.pvs.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                pvs[Jd.pvs.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private void icD(RectF rectF, Matrix matrix) {
        if (vG() && this.vG.kj() != Jd.icD.INVERT) {
            this.cR.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.ny.pvs(this.cR, matrix, true);
            if (rectF.intersect(this.cR)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void pvs(Canvas canvas, Matrix matrix) {
        com.bytedance.adsdk.lottie.NB.pvs("Layer#saveLayer");
        com.bytedance.adsdk.lottie.sUS.sUS.pvs(canvas, this.bNS, this.qh, 19);
        if (Build.VERSION.SDK_INT < 28) {
            pvs(canvas);
        }
        com.bytedance.adsdk.lottie.NB.icD("Layer#saveLayer");
        for (int i = 0; i < this.rCZ.pvs().size(); i++) {
            com.bytedance.adsdk.lottie.vG.icD.so soVar = this.rCZ.pvs().get(i);
            com.bytedance.adsdk.lottie.pvs.icD.pvs<IP, Path> pvsVar = this.rCZ.icD().get(i);
            com.bytedance.adsdk.lottie.pvs.icD.pvs<Integer, Integer> pvsVar2 = this.rCZ.vG().get(i);
            int i2 = AnonymousClass2.icD[soVar.pvs().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == 0) {
                        this.Wyp.setColor(ViewCompat.MEASURED_STATE_MASK);
                        this.Wyp.setAlpha(255);
                        canvas.drawRect(this.bNS, this.Wyp);
                    }
                    if (soVar.Jd()) {
                        vG(canvas, matrix, pvsVar, pvsVar2);
                    } else {
                        pvs(canvas, matrix, pvsVar);
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (soVar.Jd()) {
                            icD(canvas, matrix, pvsVar, pvsVar2);
                        } else {
                            pvs(canvas, matrix, pvsVar, pvsVar2);
                        }
                    }
                } else if (soVar.Jd()) {
                    NB(canvas, matrix, pvsVar, pvsVar2);
                } else {
                    Jd(canvas, matrix, pvsVar, pvsVar2);
                }
            } else if (Wyp()) {
                this.Wyp.setAlpha(255);
                canvas.drawRect(this.bNS, this.Wyp);
            }
        }
        com.bytedance.adsdk.lottie.NB.pvs("Layer#restoreLayer");
        canvas.restore();
        com.bytedance.adsdk.lottie.NB.icD("Layer#restoreLayer");
    }

    private boolean Wyp() {
        if (this.rCZ.icD().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.rCZ.pvs().size(); i++) {
            if (this.rCZ.pvs().get(i).pvs() != so.pvs.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void pvs(Canvas canvas, Matrix matrix, com.bytedance.adsdk.lottie.pvs.icD.pvs<IP, Path> pvsVar, com.bytedance.adsdk.lottie.pvs.icD.pvs<Integer, Integer> pvsVar2) {
        this.yiw.set(pvsVar.yiw());
        this.yiw.transform(matrix);
        this.Wyp.setAlpha((int) (pvsVar2.yiw().intValue() * 2.55f));
        canvas.drawPath(this.yiw, this.Wyp);
    }

    private void icD(Canvas canvas, Matrix matrix, com.bytedance.adsdk.lottie.pvs.icD.pvs<IP, Path> pvsVar, com.bytedance.adsdk.lottie.pvs.icD.pvs<Integer, Integer> pvsVar2) {
        com.bytedance.adsdk.lottie.sUS.sUS.pvs(canvas, this.bNS, this.Wyp);
        canvas.drawRect(this.bNS, this.Wyp);
        this.yiw.set(pvsVar.yiw());
        this.yiw.transform(matrix);
        this.Wyp.setAlpha((int) (pvsVar2.yiw().intValue() * 2.55f));
        canvas.drawPath(this.yiw, this.kj);
        canvas.restore();
    }

    private void pvs(Canvas canvas, Matrix matrix, com.bytedance.adsdk.lottie.pvs.icD.pvs<IP, Path> pvsVar) {
        this.yiw.set(pvsVar.yiw());
        this.yiw.transform(matrix);
        canvas.drawPath(this.yiw, this.kj);
    }

    private void vG(Canvas canvas, Matrix matrix, com.bytedance.adsdk.lottie.pvs.icD.pvs<IP, Path> pvsVar, com.bytedance.adsdk.lottie.pvs.icD.pvs<Integer, Integer> pvsVar2) {
        com.bytedance.adsdk.lottie.sUS.sUS.pvs(canvas, this.bNS, this.kj);
        canvas.drawRect(this.bNS, this.Wyp);
        this.kj.setAlpha((int) (pvsVar2.yiw().intValue() * 2.55f));
        this.yiw.set(pvsVar.yiw());
        this.yiw.transform(matrix);
        canvas.drawPath(this.yiw, this.kj);
        canvas.restore();
    }

    private void Jd(Canvas canvas, Matrix matrix, com.bytedance.adsdk.lottie.pvs.icD.pvs<IP, Path> pvsVar, com.bytedance.adsdk.lottie.pvs.icD.pvs<Integer, Integer> pvsVar2) {
        com.bytedance.adsdk.lottie.sUS.sUS.pvs(canvas, this.bNS, this.qh);
        this.yiw.set(pvsVar.yiw());
        this.yiw.transform(matrix);
        this.Wyp.setAlpha((int) (pvsVar2.yiw().intValue() * 2.55f));
        canvas.drawPath(this.yiw, this.Wyp);
        canvas.restore();
    }

    private void NB(Canvas canvas, Matrix matrix, com.bytedance.adsdk.lottie.pvs.icD.pvs<IP, Path> pvsVar, com.bytedance.adsdk.lottie.pvs.icD.pvs<Integer, Integer> pvsVar2) {
        com.bytedance.adsdk.lottie.sUS.sUS.pvs(canvas, this.bNS, this.qh);
        canvas.drawRect(this.bNS, this.Wyp);
        this.kj.setAlpha((int) (pvsVar2.yiw().intValue() * 2.55f));
        this.yiw.set(pvsVar.yiw());
        this.yiw.transform(matrix);
        canvas.drawPath(this.yiw, this.kj);
        canvas.restore();
    }

    boolean Jd() {
        com.bytedance.adsdk.lottie.pvs.icD.so soVar = this.rCZ;
        return (soVar == null || soVar.icD().isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD(boolean z) {
        if (z != this.CvL) {
            this.CvL = z;
            Mxy();
        }
    }

    void pvs(float f) {
        this.Jd.pvs(f);
        if (this.rCZ != null) {
            for (int i = 0; i < this.rCZ.icD().size(); i++) {
                this.rCZ.icD().get(i).pvs(f);
            }
        }
        com.bytedance.adsdk.lottie.pvs.icD.Jd jd = this.OT;
        if (jd != null) {
            jd.pvs(f);
        }
        pvs pvsVar = this.ny;
        if (pvsVar != null) {
            pvsVar.pvs(f);
        }
        for (int i2 = 0; i2 < this.dX.size(); i2++) {
            this.dX.get(i2).pvs(f);
        }
    }

    private void qh() {
        if (this.dyT != null) {
            return;
        }
        if (this.ZhG == null) {
            this.dyT = Collections.emptyList();
            return;
        }
        this.dyT = new ArrayList();
        for (pvs pvsVar = this.ZhG; pvsVar != null; pvsVar = pvsVar.ZhG) {
            this.dyT.add(pvsVar);
        }
    }

    public String NB() {
        return this.vG.sUS();
    }

    public com.bytedance.adsdk.lottie.vG.icD.pvs sUS() {
        return this.vG.ny();
    }

    public BlurMaskFilter icD(float f) {
        if (this.NB == f) {
            return this.sUS;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.sUS = blurMaskFilter;
        this.NB = f;
        return blurMaskFilter;
    }

    public Wyp yiw() {
        return this.vG.ZhG();
    }
}
