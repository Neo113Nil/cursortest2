package com.bytedance.adsdk.lottie;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.adsdk.lottie.NB.OT;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: LottieDrawable.java */
/* loaded from: classes.dex */
public class so extends Drawable implements Animatable, Drawable.Callback {
    private final Matrix CvL;
    private Bitmap Gp;
    private Jd IP;
    private sUS Jd;
    private String Ju;
    private icD Mxy;
    private final com.bytedance.adsdk.lottie.sUS.vG NB;
    private boolean OT;
    private boolean OhP;
    private Rect Pj;
    private final ArrayList<pvs> Wyp;
    private boolean ZhG;
    private Canvas ae;
    private com.bytedance.adsdk.lottie.icD.pvs bNS;
    private boolean cR;
    private Rect cRf;
    private boolean dX;
    private Paint dx;
    private cR dyT;
    private Rect gA;
    private RectF gSd;
    vG icD;
    private RectF jlb;
    private com.bytedance.adsdk.lottie.icD.icD kj;
    private Map<String, Typeface> mnm;
    private boolean ny;
    private Matrix od;
    String pvs;
    private Matrix qD;
    private final ValueAnimator.AnimatorUpdateListener qh;
    private int rCZ;
    private RectF sP;
    private boolean sUS;
    private boolean so;
    private com.bytedance.adsdk.lottie.vG.vG.icD uc;
    private boolean vA;
    zM vG;
    private boolean yiw;
    private boolean zM;

    /* compiled from: LottieDrawable.java */
    private enum icD {
        NONE,
        PLAY,
        RESUME
    }

    /* compiled from: LottieDrawable.java */
    private interface pvs {
        void pvs(sUS sus);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public so() {
        com.bytedance.adsdk.lottie.sUS.vG vGVar = new com.bytedance.adsdk.lottie.sUS.vG();
        this.NB = vGVar;
        this.sUS = true;
        this.yiw = false;
        this.so = false;
        this.Mxy = icD.NONE;
        this.Wyp = new ArrayList<>();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.lottie.so.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (so.this.uc != null) {
                    so.this.uc.pvs(so.this.NB.sUS());
                }
            }
        };
        this.qh = animatorUpdateListener;
        this.cR = false;
        this.zM = true;
        this.rCZ = 255;
        this.dyT = cR.AUTOMATIC;
        this.dX = false;
        this.CvL = new Matrix();
        this.OhP = false;
        vGVar.addUpdateListener(animatorUpdateListener);
    }

    public boolean pvs() {
        return this.vA;
    }

    public void pvs(boolean z) {
        if (this.vA == z) {
            return;
        }
        this.vA = z;
        if (this.Jd != null) {
            CvL();
        }
    }

    public void icD(boolean z) {
        if (z != this.zM) {
            this.zM = z;
            com.bytedance.adsdk.lottie.vG.vG.icD icd = this.uc;
            if (icd != null) {
                icd.icD(z);
            }
            invalidateSelf();
        }
    }

    public boolean icD() {
        return this.zM;
    }

    public void pvs(String str) {
        this.Ju = str;
    }

    public String vG() {
        return this.Ju;
    }

    public void vG(boolean z) {
        this.cR = z;
    }

    public boolean Jd() {
        return this.cR;
    }

    public boolean pvs(sUS sus) {
        if (this.Jd == sus) {
            return false;
        }
        this.OhP = true;
        so();
        this.Jd = sus;
        CvL();
        this.NB.pvs(sus);
        Jd(this.NB.getAnimatedFraction());
        Iterator it = new ArrayList(this.Wyp).iterator();
        while (it.hasNext()) {
            pvs pvsVar = (pvs) it.next();
            if (pvsVar != null) {
                pvsVar.pvs(sus);
            }
            it.remove();
        }
        this.Wyp.clear();
        sus.icD(this.OT);
        dX();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void pvs(cR cRVar) {
        this.dyT = cRVar;
        dX();
    }

    public cR NB() {
        return this.dX ? cR.SOFTWARE : cR.HARDWARE;
    }

    private void dX() {
        sUS sus = this.Jd;
        if (sus == null) {
            return;
        }
        this.dX = this.dyT.pvs(Build.VERSION.SDK_INT, sus.pvs(), sus.icD());
    }

    public void Jd(boolean z) {
        this.OT = z;
        sUS sus = this.Jd;
        if (sus != null) {
            sus.icD(z);
        }
    }

    public void NB(boolean z) {
        if (this.ny == z) {
            return;
        }
        this.ny = z;
        com.bytedance.adsdk.lottie.vG.vG.icD icd = this.uc;
        if (icd != null) {
            icd.pvs(z);
        }
    }

    public vA sUS() {
        sUS sus = this.Jd;
        if (sus != null) {
            return sus.vG();
        }
        return null;
    }

    public void sUS(boolean z) {
        this.ZhG = z;
    }

    public boolean yiw() {
        return this.ZhG;
    }

    private void CvL() {
        sUS sus = this.Jd;
        if (sus == null) {
            return;
        }
        com.bytedance.adsdk.lottie.vG.vG.icD icd = new com.bytedance.adsdk.lottie.vG.vG.icD(this, OT.pvs(sus), sus.Mxy(), sus);
        this.uc = icd;
        if (this.ny) {
            icd.pvs(true);
        }
        this.uc.icD(this.zM);
    }

    public void so() {
        if (this.NB.isRunning()) {
            this.NB.cancel();
            if (!isVisible()) {
                this.Mxy = icD.NONE;
            }
        }
        this.Jd = null;
        this.uc = null;
        this.kj = null;
        this.NB.so();
        invalidateSelf();
    }

    public void yiw(boolean z) {
        this.so = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.OhP) {
            return;
        }
        this.OhP = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.rCZ = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.rCZ;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        NB.pvs("Drawable#draw");
        if (this.so) {
            try {
                if (this.dX) {
                    pvs(canvas, this.uc);
                } else {
                    pvs(canvas);
                }
            } catch (Throwable unused) {
            }
        } else if (this.dX) {
            pvs(canvas, this.uc);
        } else {
            pvs(canvas);
        }
        this.OhP = false;
        NB.icD("Drawable#draw");
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        Mxy();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Wyp();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return cR();
    }

    public void Mxy() {
        if (this.uc == null) {
            this.Wyp.add(new pvs() { // from class: com.bytedance.adsdk.lottie.so.6
                @Override // com.bytedance.adsdk.lottie.so.pvs
                public void pvs(sUS sus) {
                    so.this.Mxy();
                }
            });
            return;
        }
        dX();
        if (Gp() || vA() == 0) {
            if (isVisible()) {
                this.NB.qh();
                this.Mxy = icD.NONE;
            } else {
                this.Mxy = icD.PLAY;
            }
        }
        if (Gp()) {
            return;
        }
        vG((int) (IP() < 0.0f ? kj() : Ju()));
        this.NB.kj();
        if (isVisible()) {
            return;
        }
        this.Mxy = icD.NONE;
    }

    public void Wyp() {
        this.Wyp.clear();
        this.NB.kj();
        if (isVisible()) {
            return;
        }
        this.Mxy = icD.NONE;
    }

    public void qh() {
        if (this.uc == null) {
            this.Wyp.add(new pvs() { // from class: com.bytedance.adsdk.lottie.so.7
                @Override // com.bytedance.adsdk.lottie.so.pvs
                public void pvs(sUS sus) {
                    so.this.qh();
                }
            });
            return;
        }
        dX();
        if (Gp() || vA() == 0) {
            if (isVisible()) {
                this.NB.IP();
                this.Mxy = icD.NONE;
            } else {
                this.Mxy = icD.RESUME;
            }
        }
        if (Gp()) {
            return;
        }
        vG((int) (IP() < 0.0f ? kj() : Ju()));
        this.NB.kj();
        if (isVisible()) {
            return;
        }
        this.Mxy = icD.NONE;
    }

    public void pvs(final int i) {
        if (this.Jd == null) {
            this.Wyp.add(new pvs() { // from class: com.bytedance.adsdk.lottie.so.8
                @Override // com.bytedance.adsdk.lottie.so.pvs
                public void pvs(sUS sus) {
                    so.this.pvs(i);
                }
            });
        } else {
            this.NB.pvs(i);
        }
    }

    public float kj() {
        return this.NB.bNS();
    }

    public void pvs(final float f) {
        sUS sus = this.Jd;
        if (sus == null) {
            this.Wyp.add(new pvs() { // from class: com.bytedance.adsdk.lottie.so.9
                @Override // com.bytedance.adsdk.lottie.so.pvs
                public void pvs(sUS sus2) {
                    so.this.pvs(f);
                }
            });
        } else {
            pvs((int) com.bytedance.adsdk.lottie.sUS.NB.pvs(sus.sUS(), this.Jd.yiw(), f));
        }
    }

    public void icD(final int i) {
        if (this.Jd == null) {
            this.Wyp.add(new pvs() { // from class: com.bytedance.adsdk.lottie.so.10
                @Override // com.bytedance.adsdk.lottie.so.pvs
                public void pvs(sUS sus) {
                    so.this.icD(i);
                }
            });
        } else {
            this.NB.icD(i + 0.99f);
        }
    }

    public float Ju() {
        return this.NB.mnm();
    }

    public void icD(final float f) {
        sUS sus = this.Jd;
        if (sus == null) {
            this.Wyp.add(new pvs() { // from class: com.bytedance.adsdk.lottie.so.11
                @Override // com.bytedance.adsdk.lottie.so.pvs
                public void pvs(sUS sus2) {
                    so.this.icD(f);
                }
            });
        } else {
            this.NB.icD(com.bytedance.adsdk.lottie.sUS.NB.pvs(sus.sUS(), this.Jd.yiw(), f));
        }
    }

    public void icD(final String str) {
        sUS sus = this.Jd;
        if (sus == null) {
            this.Wyp.add(new pvs() { // from class: com.bytedance.adsdk.lottie.so.12
                @Override // com.bytedance.adsdk.lottie.so.pvs
                public void pvs(sUS sus2) {
                    so.this.icD(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.lottie.vG.sUS vG = sus.vG(str);
        if (vG == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
        pvs((int) vG.pvs);
    }

    public void vG(final String str) {
        sUS sus = this.Jd;
        if (sus == null) {
            this.Wyp.add(new pvs() { // from class: com.bytedance.adsdk.lottie.so.13
                @Override // com.bytedance.adsdk.lottie.so.pvs
                public void pvs(sUS sus2) {
                    so.this.vG(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.lottie.vG.sUS vG = sus.vG(str);
        if (vG == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
        icD((int) (vG.pvs + vG.icD));
    }

    public void Jd(final String str) {
        sUS sus = this.Jd;
        if (sus == null) {
            this.Wyp.add(new pvs() { // from class: com.bytedance.adsdk.lottie.so.2
                @Override // com.bytedance.adsdk.lottie.so.pvs
                public void pvs(sUS sus2) {
                    so.this.Jd(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.lottie.vG.sUS vG = sus.vG(str);
        if (vG == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
        int i = (int) vG.pvs;
        pvs(i, ((int) vG.icD) + i);
    }

    public void pvs(final int i, final int i2) {
        if (this.Jd == null) {
            this.Wyp.add(new pvs() { // from class: com.bytedance.adsdk.lottie.so.3
                @Override // com.bytedance.adsdk.lottie.so.pvs
                public void pvs(sUS sus) {
                    so.this.pvs(i, i2);
                }
            });
        } else {
            this.NB.pvs(i, i2 + 0.99f);
        }
    }

    public void vG(float f) {
        this.NB.vG(f);
    }

    public float IP() {
        return this.NB.Wyp();
    }

    public void vG(final int i) {
        if (this.Jd == null) {
            this.Wyp.add(new pvs() { // from class: com.bytedance.adsdk.lottie.so.4
                @Override // com.bytedance.adsdk.lottie.so.pvs
                public void pvs(sUS sus) {
                    so.this.vG(i);
                }
            });
        } else {
            this.NB.pvs(i);
        }
    }

    public int bNS() {
        return (int) this.NB.yiw();
    }

    public void Jd(final float f) {
        if (this.Jd == null) {
            this.Wyp.add(new pvs() { // from class: com.bytedance.adsdk.lottie.so.5
                @Override // com.bytedance.adsdk.lottie.so.pvs
                public void pvs(sUS sus) {
                    so.this.Jd(f);
                }
            });
            return;
        }
        NB.pvs("Drawable#setProgress");
        this.NB.pvs(this.Jd.pvs(f));
        NB.icD("Drawable#setProgress");
    }

    public void Jd(int i) {
        this.NB.setRepeatMode(i);
    }

    public int mnm() {
        return this.NB.getRepeatMode();
    }

    public void NB(int i) {
        this.NB.setRepeatCount(i);
    }

    public int vA() {
        return this.NB.getRepeatCount();
    }

    public boolean cR() {
        com.bytedance.adsdk.lottie.sUS.vG vGVar = this.NB;
        if (vGVar == null) {
            return false;
        }
        return vGVar.isRunning();
    }

    boolean zM() {
        if (isVisible()) {
            return this.NB.isRunning();
        }
        return this.Mxy == icD.PLAY || this.Mxy == icD.RESUME;
    }

    private boolean Gp() {
        return this.sUS || this.yiw;
    }

    public void pvs(Boolean bool) {
        this.sUS = bool.booleanValue();
    }

    public void so(boolean z) {
        this.yiw = z;
    }

    public void Mxy(boolean z) {
        this.NB.vG(z);
    }

    public void pvs(Jd jd) {
        this.IP = jd;
        com.bytedance.adsdk.lottie.icD.icD icd = this.kj;
        if (icd != null) {
            icd.pvs(jd);
        }
    }

    public void pvs(vG vGVar) {
        this.icD = vGVar;
        com.bytedance.adsdk.lottie.icD.pvs pvsVar = this.bNS;
        if (pvsVar != null) {
            pvsVar.pvs(vGVar);
        }
    }

    public void pvs(Map<String, Typeface> map) {
        if (map == this.mnm) {
            return;
        }
        this.mnm = map;
        invalidateSelf();
    }

    public void pvs(zM zMVar) {
        this.vG = zMVar;
    }

    public zM uc() {
        return this.vG;
    }

    public boolean rCZ() {
        return this.mnm == null && this.vG == null && this.Jd.Wyp().size() > 0;
    }

    public sUS OT() {
        return this.Jd;
    }

    public void ny() {
        this.Wyp.clear();
        this.NB.cancel();
        if (isVisible()) {
            return;
        }
        this.Mxy = icD.NONE;
    }

    public void ZhG() {
        this.Wyp.clear();
        this.NB.Ju();
        if (isVisible()) {
            return;
        }
        this.Mxy = icD.NONE;
    }

    public float dyT() {
        return this.NB.sUS();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        sUS sus = this.Jd;
        if (sus == null) {
            return -1;
        }
        return sus.Jd().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        sUS sus = this.Jd;
        if (sus == null) {
            return -1;
        }
        return sus.Jd().height();
    }

    public Bitmap pvs(String str, Bitmap bitmap) {
        com.bytedance.adsdk.lottie.icD.icD ae = ae();
        if (ae == null) {
            return null;
        }
        Bitmap pvs2 = ae.pvs(str, bitmap);
        invalidateSelf();
        return pvs2;
    }

    public Bitmap NB(String str) {
        com.bytedance.adsdk.lottie.icD.icD ae = ae();
        if (ae != null) {
            return ae.pvs(str);
        }
        return null;
    }

    public Mxy sUS(String str) {
        sUS sus = this.Jd;
        if (sus == null) {
            return null;
        }
        return sus.kj().get(str);
    }

    private com.bytedance.adsdk.lottie.icD.icD ae() {
        com.bytedance.adsdk.lottie.icD.icD icd = this.kj;
        if (icd != null && !icd.pvs(jlb())) {
            this.kj = null;
        }
        if (this.kj == null) {
            this.kj = new com.bytedance.adsdk.lottie.icD.icD(getCallback(), this.Ju, this.IP, this.Jd.kj());
        }
        return this.kj;
    }

    public Typeface pvs(com.bytedance.adsdk.lottie.vG.vG vGVar) {
        Map<String, Typeface> map = this.mnm;
        if (map != null) {
            String pvs2 = vGVar.pvs();
            if (map.containsKey(pvs2)) {
                return map.get(pvs2);
            }
            String icD2 = vGVar.icD();
            if (map.containsKey(icD2)) {
                return map.get(icD2);
            }
            String str = vGVar.pvs() + "-" + vGVar.vG();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        com.bytedance.adsdk.lottie.icD.pvs gA = gA();
        if (gA != null) {
            return gA.pvs(vGVar);
        }
        return null;
    }

    private com.bytedance.adsdk.lottie.icD.pvs gA() {
        if (getCallback() == null) {
            return null;
        }
        if (this.bNS == null) {
            com.bytedance.adsdk.lottie.icD.pvs pvsVar = new com.bytedance.adsdk.lottie.icD.pvs(getCallback(), this.icD);
            this.bNS = pvsVar;
            String str = this.pvs;
            if (str != null) {
                pvsVar.pvs(str);
            }
        }
        return this.bNS;
    }

    public void yiw(String str) {
        this.pvs = str;
        com.bytedance.adsdk.lottie.icD.pvs gA = gA();
        if (gA != null) {
            gA.pvs(str);
        }
    }

    private Context jlb() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean z3 = !isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            if (this.Mxy == icD.PLAY) {
                Mxy();
            } else if (this.Mxy == icD.RESUME) {
                qh();
            }
        } else if (this.NB.isRunning()) {
            ZhG();
            this.Mxy = icD.RESUME;
        } else if (!z3) {
            this.Mxy = icD.NONE;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    private void pvs(Canvas canvas) {
        com.bytedance.adsdk.lottie.vG.vG.icD icd = this.uc;
        sUS sus = this.Jd;
        if (icd == null || sus == null) {
            return;
        }
        this.CvL.reset();
        if (!getBounds().isEmpty()) {
            this.CvL.preScale(r2.width() / sus.Jd().width(), r2.height() / sus.Jd().height());
            this.CvL.preTranslate(r2.left, r2.top);
        }
        icd.pvs(canvas, this.CvL, this.rCZ);
    }

    private void pvs(Canvas canvas, com.bytedance.adsdk.lottie.vG.vG.icD icd) {
        if (this.Jd == null || icd == null) {
            return;
        }
        dx();
        canvas.getMatrix(this.qD);
        canvas.getClipBounds(this.gA);
        pvs(this.gA, this.jlb);
        this.qD.mapRect(this.jlb);
        pvs(this.jlb, this.gA);
        if (this.zM) {
            this.gSd.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            icd.pvs(this.gSd, (Matrix) null, false);
        }
        this.qD.mapRect(this.gSd);
        Rect bounds = getBounds();
        float width = bounds.width() / getIntrinsicWidth();
        float height = bounds.height() / getIntrinsicHeight();
        pvs(this.gSd, width, height);
        if (!Pj()) {
            this.gSd.intersect(this.gA.left, this.gA.top, this.gA.right, this.gA.bottom);
        }
        int ceil = (int) Math.ceil(this.gSd.width());
        int ceil2 = (int) Math.ceil(this.gSd.height());
        if (ceil == 0 || ceil2 == 0) {
            return;
        }
        icD(ceil, ceil2);
        if (this.OhP) {
            this.CvL.set(this.qD);
            this.CvL.preScale(width, height);
            this.CvL.postTranslate(-this.gSd.left, -this.gSd.top);
            this.Gp.eraseColor(0);
            icd.pvs(this.ae, this.CvL, this.rCZ);
            this.qD.invert(this.od);
            this.od.mapRect(this.sP, this.gSd);
            pvs(this.sP, this.cRf);
        }
        this.Pj.set(0, 0, ceil, ceil2);
        canvas.drawBitmap(this.Gp, this.Pj, this.cRf, this.dx);
    }

    private void dx() {
        if (this.ae != null) {
            return;
        }
        this.ae = new Canvas();
        this.gSd = new RectF();
        this.qD = new Matrix();
        this.od = new Matrix();
        this.gA = new Rect();
        this.jlb = new RectF();
        this.dx = new com.bytedance.adsdk.lottie.pvs.pvs();
        this.Pj = new Rect();
        this.cRf = new Rect();
        this.sP = new RectF();
    }

    private void icD(int i, int i2) {
        Bitmap bitmap = this.Gp;
        if (bitmap == null || bitmap.getWidth() < i || this.Gp.getHeight() < i2) {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.Gp = createBitmap;
            this.ae.setBitmap(createBitmap);
            this.OhP = true;
            return;
        }
        if (this.Gp.getWidth() > i || this.Gp.getHeight() > i2) {
            Bitmap createBitmap2 = Bitmap.createBitmap(this.Gp, 0, 0, i, i2);
            this.Gp = createBitmap2;
            this.ae.setBitmap(createBitmap2);
            this.OhP = true;
        }
    }

    private void pvs(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void pvs(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void pvs(RectF rectF, float f, float f2) {
        rectF.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
    }

    private boolean Pj() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        return (parent instanceof ViewGroup) && !((ViewGroup) parent).getClipChildren();
    }
}
