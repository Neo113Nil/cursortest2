package com.bytedance.adsdk.fs.zn.zn;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.bytedance.adsdk.fs.zmn.fs.cyb;
import com.bytedance.adsdk.fs.zmn.fs.zmn;
import com.bytedance.adsdk.fs.zn.fs.rt;
import com.bytedance.adsdk.fs.zn.fs.zg;
import com.bytedance.adsdk.fs.zn.zn.btk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes11.dex */
public abstract class zmn implements zmn.InterfaceC0104zmn, com.bytedance.adsdk.fs.zmn.zmn.btk {
    private Paint am;
    private List<zmn> bjh;
    float btk;
    private final RectF cn;
    private final RectF cyb;
    private com.bytedance.adsdk.fs.zmn.fs.fb doe;
    final cyb fb;
    final com.bytedance.adsdk.fs.bvs fs;
    BlurMaskFilter hhw;
    private final String iqz;
    private final RectF kgc;
    private boolean kjb;
    private final Paint klz;
    private final RectF kw;
    private final Paint mw;
    private zmn nqi;
    private final RectF olo;
    private com.bytedance.adsdk.fs.zmn.fs.zg phc;
    private final Paint rc;
    private final List<com.bytedance.adsdk.fs.zmn.fs.zmn<?, ?>> rp;
    private final Paint rt;
    private float so;
    private zmn uqh;
    private final Matrix yj;
    private boolean zak;
    final Matrix zmn;
    final btk zn;
    private final Path nps = new Path();
    private final Matrix zg = new Matrix();
    private final Matrix bvs = new Matrix();
    private final Paint iv = new com.bytedance.adsdk.fs.zmn.zmn(1);

    @Override // com.bytedance.adsdk.fs.zmn.zmn.zn
    public void zmn(List<com.bytedance.adsdk.fs.zmn.zmn.zn> list, List<com.bytedance.adsdk.fs.zmn.zmn.zn> list2) {
    }

    static zmn zmn(fs fsVar, btk btkVar, com.bytedance.adsdk.fs.bvs bvsVar, com.bytedance.adsdk.fs.nps npsVar, Context context) {
        switch (AnonymousClass2.zmn[btkVar.rc().ordinal()]) {
            case 1:
                return new nps(bvsVar, btkVar, fsVar, npsVar);
            case 2:
                return new fs(bvsVar, btkVar, npsVar.fs(btkVar.nps()), npsVar, context);
            case 3:
                return new zg(bvsVar, btkVar);
            case 4:
                if (zmn(bvsVar, btkVar, "text:")) {
                    return new zn(bvsVar, btkVar, context);
                }
                if (zmn(bvsVar, btkVar, "videoview:")) {
                    return new iv(bvsVar, btkVar, context);
                }
                return new fb(bvsVar, btkVar);
            case 5:
                return new hhw(bvsVar, btkVar);
            case 6:
                return new bvs(bvsVar, btkVar);
            default:
                Objects.toString(btkVar.rc());
                return null;
        }
    }

    private static boolean zmn(com.bytedance.adsdk.fs.bvs bvsVar, btk btkVar, String str) {
        com.bytedance.adsdk.fs.iv hhw;
        if (bvsVar == null || btkVar == null || str == null || (hhw = bvsVar.hhw(btkVar.nps())) == null) {
            return false;
        }
        return str.equals(hhw.iv());
    }

    zmn(com.bytedance.adsdk.fs.bvs bvsVar, btk btkVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.rc = new com.bytedance.adsdk.fs.zmn.zmn(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.klz = new com.bytedance.adsdk.fs.zmn.zmn(1, mode2);
        com.bytedance.adsdk.fs.zmn.zmn zmnVar = new com.bytedance.adsdk.fs.zmn.zmn(1);
        this.mw = zmnVar;
        this.rt = new com.bytedance.adsdk.fs.zmn.zmn(PorterDuff.Mode.CLEAR);
        this.cn = new RectF();
        this.cyb = new RectF();
        this.olo = new RectF();
        this.kgc = new RectF();
        this.kw = new RectF();
        this.zmn = new Matrix();
        this.rp = new ArrayList();
        this.kjb = true;
        this.btk = 0.0f;
        this.yj = new Matrix();
        this.so = 1.0f;
        this.fs = bvsVar;
        this.zn = btkVar;
        this.iqz = btkVar.hhw() + "#draw";
        if (btkVar.klz() == btk.fs.INVERT) {
            zmnVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            zmnVar.setXfermode(new PorterDuffXfermode(mode));
        }
        cyb iv = btkVar.cn().iv();
        this.fb = iv;
        iv.zmn((zmn.InterfaceC0104zmn) this);
        if (btkVar.iv() != null && !btkVar.iv().isEmpty()) {
            com.bytedance.adsdk.fs.zmn.fs.zg zgVar = new com.bytedance.adsdk.fs.zmn.fs.zg(btkVar.iv());
            this.phc = zgVar;
            Iterator<com.bytedance.adsdk.fs.zmn.fs.zmn<rt, Path>> it = zgVar.fs().iterator();
            while (it.hasNext()) {
                it.next().zmn(this);
            }
            for (com.bytedance.adsdk.fs.zmn.fs.zmn<Integer, Integer> zmnVar2 : this.phc.zn()) {
                zmn(zmnVar2);
                zmnVar2.zmn(this);
            }
        }
        klz();
    }

    void zmn(boolean z) {
        if (z && this.am == null) {
            this.am = new com.bytedance.adsdk.fs.zmn.zmn();
        }
        this.zak = z;
    }

    @Override // com.bytedance.adsdk.fs.zmn.fs.zmn.InterfaceC0104zmn
    public void zmn() {
        mw();
    }

    btk fs() {
        return this.zn;
    }

    void zmn(zmn zmnVar) {
        this.nqi = zmnVar;
    }

    boolean zn() {
        return this.nqi != null;
    }

    void fs(zmn zmnVar) {
        this.uqh = zmnVar;
    }

    private void klz() {
        if (!this.zn.fb().isEmpty()) {
            com.bytedance.adsdk.fs.zmn.fs.fb fbVar = new com.bytedance.adsdk.fs.zmn.fs.fb(this.zn.fb());
            this.doe = fbVar;
            fbVar.zmn();
            this.doe.zmn(new zmn.InterfaceC0104zmn() { // from class: com.bytedance.adsdk.fs.zn.zn.zmn.1
                @Override // com.bytedance.adsdk.fs.zmn.fs.zmn.InterfaceC0104zmn
                public void zmn() {
                    zmn zmnVar = zmn.this;
                    zmnVar.fs(zmnVar.doe.bvs() == 1.0f);
                }
            });
            fs(this.doe.nps().floatValue() == 1.0f);
            zmn(this.doe);
            return;
        }
        fs(true);
    }

    private void mw() {
        this.fs.invalidateSelf();
    }

    public void zmn(com.bytedance.adsdk.fs.zmn.fs.zmn<?, ?> zmnVar) {
        if (zmnVar == null) {
            return;
        }
        this.rp.add(zmnVar);
    }

    public Matrix fb() {
        return this.yj;
    }

    public String btk() {
        btk btkVar = this.zn;
        if (btkVar != null) {
            return btkVar.nps();
        }
        return null;
    }

    public void zmn(RectF rectF, Matrix matrix, boolean z) {
        this.cn.set(0.0f, 0.0f, 0.0f, 0.0f);
        cn();
        this.zmn.set(matrix);
        if (z) {
            List<zmn> list = this.bjh;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.zmn.preConcat(this.bjh.get(size).fb.fb());
                }
            } else {
                zmn zmnVar = this.uqh;
                if (zmnVar != null) {
                    this.zmn.preConcat(zmnVar.fb.fb());
                }
            }
        }
        this.zmn.preConcat(this.fb.fb());
    }

    @Override // com.bytedance.adsdk.fs.zmn.zmn.btk
    public void zmn(Canvas canvas, Matrix matrix, int i) {
        Paint paint;
        Integer nps;
        com.bytedance.adsdk.fs.btk.zmn(this.iqz);
        if (!this.kjb || this.zn.doe()) {
            com.bytedance.adsdk.fs.btk.fs(this.iqz);
            return;
        }
        cn();
        com.bytedance.adsdk.fs.btk.zmn("Layer#parentMatrix");
        this.yj.set(matrix);
        this.zg.reset();
        this.zg.set(matrix);
        for (int size = this.bjh.size() - 1; size >= 0; size--) {
            this.zg.preConcat(this.bjh.get(size).fb.fb());
        }
        com.bytedance.adsdk.fs.btk.fs("Layer#parentMatrix");
        com.bytedance.adsdk.fs.zmn.fs.zmn<?, Integer> zmn = this.fb.zmn();
        int intValue = (int) ((((i / 255.0f) * ((zmn == null || (nps = zmn.nps()) == null) ? 100 : nps.intValue())) / 100.0f) * 255.0f);
        if (!zn() && !nps()) {
            this.zg.preConcat(this.fb.fb());
            com.bytedance.adsdk.fs.btk.zmn("Layer#drawLayer");
            fs(canvas, this.zg, intValue);
            com.bytedance.adsdk.fs.btk.fs("Layer#drawLayer");
            zn(com.bytedance.adsdk.fs.btk.fs(this.iqz));
            return;
        }
        com.bytedance.adsdk.fs.btk.zmn("Layer#computeBounds");
        zmn(this.cn, this.zg, false);
        fs(this.cn, matrix);
        this.zg.preConcat(this.fb.fb());
        zmn(this.cn, this.zg);
        this.cyb.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.bvs);
        if (!this.bvs.isIdentity()) {
            Matrix matrix2 = this.bvs;
            matrix2.invert(matrix2);
            this.bvs.mapRect(this.cyb);
        }
        if (!this.cn.intersect(this.cyb)) {
            this.cn.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        com.bytedance.adsdk.fs.btk.fs("Layer#computeBounds");
        if (this.cn.width() >= 1.0f && this.cn.height() >= 1.0f) {
            com.bytedance.adsdk.fs.btk.zmn("Layer#saveLayer");
            this.iv.setAlpha(255);
            com.bytedance.adsdk.fs.hhw.hhw.zmn(canvas, this.cn, this.iv);
            com.bytedance.adsdk.fs.btk.fs("Layer#saveLayer");
            zmn(canvas);
            com.bytedance.adsdk.fs.btk.zmn("Layer#drawLayer");
            fs(canvas, this.zg, intValue);
            com.bytedance.adsdk.fs.btk.fs("Layer#drawLayer");
            if (nps()) {
                zmn(canvas, this.zg);
            }
            if (zn()) {
                com.bytedance.adsdk.fs.btk.zmn("Layer#drawMatte");
                com.bytedance.adsdk.fs.btk.zmn("Layer#saveLayer");
                com.bytedance.adsdk.fs.hhw.hhw.zmn(canvas, this.cn, this.mw, 19);
                com.bytedance.adsdk.fs.btk.fs("Layer#saveLayer");
                zmn(canvas);
                this.nqi.zmn(canvas, matrix, intValue);
                com.bytedance.adsdk.fs.btk.zmn("Layer#restoreLayer");
                canvas.restore();
                com.bytedance.adsdk.fs.btk.fs("Layer#restoreLayer");
                com.bytedance.adsdk.fs.btk.fs("Layer#drawMatte");
            }
            com.bytedance.adsdk.fs.btk.zmn("Layer#restoreLayer");
            canvas.restore();
            com.bytedance.adsdk.fs.btk.fs("Layer#restoreLayer");
        }
        if (this.zak && (paint = this.am) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.am.setColor(-251901);
            this.am.setStrokeWidth(4.0f);
            canvas.drawRect(this.cn, this.am);
            this.am.setStyle(Paint.Style.FILL);
            this.am.setColor(1357638635);
            canvas.drawRect(this.cn, this.am);
        }
        zn(com.bytedance.adsdk.fs.btk.fs(this.iqz));
    }

    private void zn(float f) {
        this.fs.rp().zn().zmn(this.zn.hhw(), f);
    }

    private void zmn(Canvas canvas) {
        com.bytedance.adsdk.fs.btk.zmn("Layer#clearLayer");
        RectF rectF = this.cn;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.rt);
        com.bytedance.adsdk.fs.btk.fs("Layer#clearLayer");
    }

    private void zmn(RectF rectF, Matrix matrix) {
        this.olo.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (nps()) {
            int size = this.phc.zmn().size();
            for (int i = 0; i < size; i++) {
                com.bytedance.adsdk.fs.zn.fs.zg zgVar = this.phc.zmn().get(i);
                Path nps = this.phc.fs().get(i).nps();
                if (nps != null) {
                    this.nps.set(nps);
                    this.nps.transform(matrix);
                    int i2 = AnonymousClass2.fs[zgVar.zmn().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        return;
                    }
                    if ((i2 == 3 || i2 == 4) && zgVar.fb()) {
                        return;
                    }
                    this.nps.computeBounds(this.kw, false);
                    if (i == 0) {
                        this.olo.set(this.kw);
                    } else {
                        RectF rectF2 = this.olo;
                        rectF2.set(Math.min(rectF2.left, this.kw.left), Math.min(this.olo.top, this.kw.top), Math.max(this.olo.right, this.kw.right), Math.max(this.olo.bottom, this.kw.bottom));
                    }
                }
            }
            if (rectF.intersect(this.olo)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* renamed from: com.bytedance.adsdk.fs.zn.zn.zmn$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] fs;
        static final /* synthetic */ int[] zmn;

        static {
            int[] iArr = new int[zg.zmn.values().length];
            fs = iArr;
            try {
                iArr[zg.zmn.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                fs[zg.zmn.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                fs[zg.zmn.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                fs[zg.zmn.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[btk.zmn.values().length];
            zmn = iArr2;
            try {
                iArr2[btk.zmn.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                zmn[btk.zmn.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                zmn[btk.zmn.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                zmn[btk.zmn.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                zmn[btk.zmn.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                zmn[btk.zmn.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                zmn[btk.zmn.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private void fs(RectF rectF, Matrix matrix) {
        if (zn() && this.zn.klz() != btk.fs.INVERT) {
            this.kgc.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.nqi.zmn(this.kgc, matrix, true);
            if (rectF.intersect(this.kgc)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public float hhw() {
        return this.so;
    }

    protected void zmn(int i) {
        this.so = ((this.fb.zmn() != null ? this.fb.zmn().nps().intValue() : 100) / 100.0f) * (i / 255.0f);
    }

    public void fs(Canvas canvas, Matrix matrix, int i) {
        zmn(i);
    }

    private void zmn(Canvas canvas, Matrix matrix) {
        com.bytedance.adsdk.fs.btk.zmn("Layer#saveLayer");
        com.bytedance.adsdk.fs.hhw.hhw.zmn(canvas, this.cn, this.rc, 19);
        if (Build.VERSION.SDK_INT < 28) {
            zmn(canvas);
        }
        com.bytedance.adsdk.fs.btk.fs("Layer#saveLayer");
        for (int i = 0; i < this.phc.zmn().size(); i++) {
            com.bytedance.adsdk.fs.zn.fs.zg zgVar = this.phc.zmn().get(i);
            com.bytedance.adsdk.fs.zmn.fs.zmn<rt, Path> zmnVar = this.phc.fs().get(i);
            com.bytedance.adsdk.fs.zmn.fs.zmn<Integer, Integer> zmnVar2 = this.phc.zn().get(i);
            int i2 = AnonymousClass2.fs[zgVar.zmn().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == 0) {
                        this.iv.setColor(-16777216);
                        this.iv.setAlpha(255);
                        canvas.drawRect(this.cn, this.iv);
                    }
                    if (zgVar.fb()) {
                        zn(canvas, matrix, zmnVar, zmnVar2);
                    } else {
                        zmn(canvas, matrix, zmnVar);
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (zgVar.fb()) {
                            fs(canvas, matrix, zmnVar, zmnVar2);
                        } else {
                            zmn(canvas, matrix, zmnVar, zmnVar2);
                        }
                    }
                } else if (zgVar.fb()) {
                    btk(canvas, matrix, zmnVar, zmnVar2);
                } else {
                    fb(canvas, matrix, zmnVar, zmnVar2);
                }
            } else if (rt()) {
                this.iv.setAlpha(255);
                canvas.drawRect(this.cn, this.iv);
            }
        }
        com.bytedance.adsdk.fs.btk.zmn("Layer#restoreLayer");
        canvas.restore();
        com.bytedance.adsdk.fs.btk.fs("Layer#restoreLayer");
    }

    private boolean rt() {
        if (this.phc.fs().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.phc.zmn().size(); i++) {
            if (this.phc.zmn().get(i).zmn() != zg.zmn.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void zmn(Canvas canvas, Matrix matrix, com.bytedance.adsdk.fs.zmn.fs.zmn<rt, Path> zmnVar, com.bytedance.adsdk.fs.zmn.fs.zmn<Integer, Integer> zmnVar2) {
        this.nps.set(zmnVar.nps());
        this.nps.transform(matrix);
        this.iv.setAlpha((int) (zmnVar2.nps().intValue() * 2.55f));
        canvas.drawPath(this.nps, this.iv);
    }

    private void fs(Canvas canvas, Matrix matrix, com.bytedance.adsdk.fs.zmn.fs.zmn<rt, Path> zmnVar, com.bytedance.adsdk.fs.zmn.fs.zmn<Integer, Integer> zmnVar2) {
        com.bytedance.adsdk.fs.hhw.hhw.zmn(canvas, this.cn, this.iv);
        canvas.drawRect(this.cn, this.iv);
        this.nps.set(zmnVar.nps());
        this.nps.transform(matrix);
        this.iv.setAlpha((int) (zmnVar2.nps().intValue() * 2.55f));
        canvas.drawPath(this.nps, this.klz);
        canvas.restore();
    }

    private void zmn(Canvas canvas, Matrix matrix, com.bytedance.adsdk.fs.zmn.fs.zmn<rt, Path> zmnVar) {
        this.nps.set(zmnVar.nps());
        this.nps.transform(matrix);
        canvas.drawPath(this.nps, this.klz);
    }

    private void zn(Canvas canvas, Matrix matrix, com.bytedance.adsdk.fs.zmn.fs.zmn<rt, Path> zmnVar, com.bytedance.adsdk.fs.zmn.fs.zmn<Integer, Integer> zmnVar2) {
        com.bytedance.adsdk.fs.hhw.hhw.zmn(canvas, this.cn, this.klz);
        canvas.drawRect(this.cn, this.iv);
        this.klz.setAlpha((int) (zmnVar2.nps().intValue() * 2.55f));
        this.nps.set(zmnVar.nps());
        this.nps.transform(matrix);
        canvas.drawPath(this.nps, this.klz);
        canvas.restore();
    }

    private void fb(Canvas canvas, Matrix matrix, com.bytedance.adsdk.fs.zmn.fs.zmn<rt, Path> zmnVar, com.bytedance.adsdk.fs.zmn.fs.zmn<Integer, Integer> zmnVar2) {
        com.bytedance.adsdk.fs.hhw.hhw.zmn(canvas, this.cn, this.rc);
        this.nps.set(zmnVar.nps());
        this.nps.transform(matrix);
        this.iv.setAlpha((int) (zmnVar2.nps().intValue() * 2.55f));
        canvas.drawPath(this.nps, this.iv);
        canvas.restore();
    }

    private void btk(Canvas canvas, Matrix matrix, com.bytedance.adsdk.fs.zmn.fs.zmn<rt, Path> zmnVar, com.bytedance.adsdk.fs.zmn.fs.zmn<Integer, Integer> zmnVar2) {
        com.bytedance.adsdk.fs.hhw.hhw.zmn(canvas, this.cn, this.rc);
        canvas.drawRect(this.cn, this.iv);
        this.klz.setAlpha((int) (zmnVar2.nps().intValue() * 2.55f));
        this.nps.set(zmnVar.nps());
        this.nps.transform(matrix);
        canvas.drawPath(this.nps, this.klz);
        canvas.restore();
    }

    boolean nps() {
        com.bytedance.adsdk.fs.zmn.fs.zg zgVar = this.phc;
        return (zgVar == null || zgVar.fs().isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs(boolean z) {
        if (z != this.kjb) {
            this.kjb = z;
            mw();
        }
    }

    public boolean zg() {
        return this.kjb;
    }

    void zmn(float f) {
        this.fb.zmn(f);
        if (this.phc != null) {
            for (int i = 0; i < this.phc.fs().size(); i++) {
                this.phc.fs().get(i).zmn(f);
            }
        }
        com.bytedance.adsdk.fs.zmn.fs.fb fbVar = this.doe;
        if (fbVar != null) {
            fbVar.zmn(f);
        }
        zmn zmnVar = this.nqi;
        if (zmnVar != null) {
            zmnVar.zmn(f);
        }
        for (int i2 = 0; i2 < this.rp.size(); i2++) {
            this.rp.get(i2).zmn(f);
        }
    }

    private void cn() {
        if (this.bjh != null) {
            return;
        }
        if (this.uqh == null) {
            this.bjh = Collections.emptyList();
            return;
        }
        this.bjh = new ArrayList();
        for (zmn zmnVar = this.uqh; zmnVar != null; zmnVar = zmnVar.uqh) {
            this.bjh.add(zmnVar);
        }
    }

    public String bvs() {
        return this.zn.hhw();
    }

    public com.bytedance.adsdk.fs.zn.fs.zmn iv() {
        return this.zn.nqi();
    }

    public BlurMaskFilter fs(float f) {
        if (this.btk == f) {
            return this.hhw;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.hhw = blurMaskFilter;
        this.btk = f;
        return blurMaskFilter;
    }

    public com.bytedance.adsdk.fs.btk.iv rc() {
        return this.zn.uqh();
    }
}
