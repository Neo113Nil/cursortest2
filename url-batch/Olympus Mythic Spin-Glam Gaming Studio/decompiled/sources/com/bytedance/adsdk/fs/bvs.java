package com.bytedance.adsdk.fs;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
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
import com.bytedance.adsdk.fs.btk.doe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class bvs extends Drawable implements Animatable, Drawable.Callback {
    private Canvas am;
    private kw bjh;
    private final com.bytedance.adsdk.fs.hhw.zn btk;
    private fs bvs;
    private com.bytedance.adsdk.fs.fs.zmn cn;
    private Map<String, Typeface> cyb;
    private boolean doe;
    private Paint ev;
    private nps fb;
    private Rect fkt;
    zn fs;
    private RectF hgd;
    private boolean hhw;
    private com.bytedance.adsdk.fs.zn.zn.fs iqz;
    private final ArrayList<zmn> iv;
    private View jy;
    private boolean kgc;
    private final Matrix kjb;
    private com.bytedance.adsdk.fs.fs.fs klz;
    private boolean kw;
    private String mw;
    private boolean nps;
    private boolean nqi;
    private RectF nu;
    private boolean olo;
    private Matrix oub;
    private int phc;
    private final ValueAnimator.AnimatorUpdateListener rc;
    private boolean rp;
    private fb rt;
    private RectF so;
    private Rect tf;
    private boolean uqh;
    private boolean vlj;
    private Matrix ww;
    private Rect yj;
    private Bitmap zak;
    private boolean zg;
    String zmn;
    iqz zn;

    private enum fs {
        NONE,
        PLAY,
        RESUME
    }

    private interface zmn {
        void zmn(nps npsVar);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public bvs() {
        com.bytedance.adsdk.fs.hhw.zn znVar = new com.bytedance.adsdk.fs.hhw.zn();
        this.btk = znVar;
        this.hhw = true;
        this.nps = false;
        this.zg = false;
        this.bvs = fs.NONE;
        this.iv = new ArrayList<>();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.fs.bvs.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (bvs.this.iqz != null) {
                    bvs.this.iqz.zmn(bvs.this.btk.hhw());
                }
            }
        };
        this.rc = animatorUpdateListener;
        this.kgc = false;
        this.kw = true;
        this.phc = 255;
        this.bjh = kw.AUTOMATIC;
        this.rp = false;
        this.kjb = new Matrix();
        this.vlj = false;
        znVar.addUpdateListener(animatorUpdateListener);
    }

    public void zmn(View view) {
        this.jy = view;
    }

    public View zmn() {
        return this.jy;
    }

    public void zmn(boolean z, Context context) {
        if (this.olo == z) {
            return;
        }
        this.olo = z;
        if (this.fb != null) {
            zmn(context);
        }
    }

    public void zmn(boolean z) {
        if (z != this.kw) {
            this.kw = z;
            com.bytedance.adsdk.fs.zn.zn.fs fsVar = this.iqz;
            if (fsVar != null) {
                fsVar.fs(z);
            }
            invalidateSelf();
        }
    }

    public com.bytedance.adsdk.fs.zn.zn.fs fs() {
        return this.iqz;
    }

    public boolean zn() {
        return this.kw;
    }

    public void zmn(String str) {
        this.mw = str;
    }

    public String fb() {
        return this.mw;
    }

    public void fs(boolean z) {
        this.kgc = z;
    }

    public boolean btk() {
        return this.kgc;
    }

    public boolean zmn(nps npsVar, Context context) {
        if (this.fb == npsVar) {
            return false;
        }
        this.vlj = true;
        iv();
        this.fb = npsVar;
        zmn(context);
        this.btk.zmn(npsVar);
        fb(this.btk.getAnimatedFraction());
        Iterator it = new ArrayList(this.iv).iterator();
        while (it.hasNext()) {
            zmn zmnVar = (zmn) it.next();
            if (zmnVar != null) {
                zmnVar.zmn(npsVar);
            }
            it.remove();
        }
        this.iv.clear();
        npsVar.fs(this.doe);
        so();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void zmn(kw kwVar) {
        this.bjh = kwVar;
        so();
    }

    public kw hhw() {
        return this.rp ? kw.SOFTWARE : kw.HARDWARE;
    }

    private void so() {
        nps npsVar = this.fb;
        if (npsVar == null) {
            return;
        }
        this.rp = this.bjh.zmn(Build.VERSION.SDK_INT, npsVar.zmn(), npsVar.fs());
    }

    public boolean nps() {
        return this.rp;
    }

    public void zn(boolean z) {
        this.doe = z;
        nps npsVar = this.fb;
        if (npsVar != null) {
            npsVar.fs(z);
        }
    }

    public void fb(boolean z) {
        if (this.nqi == z) {
            return;
        }
        this.nqi = z;
        com.bytedance.adsdk.fs.zn.zn.fs fsVar = this.iqz;
        if (fsVar != null) {
            fsVar.zmn(z);
        }
    }

    public kgc zg() {
        nps npsVar = this.fb;
        if (npsVar != null) {
            return npsVar.zn();
        }
        return null;
    }

    public void btk(boolean z) {
        this.uqh = z;
    }

    public boolean bvs() {
        return this.uqh;
    }

    private void zmn(Context context) {
        nps npsVar = this.fb;
        if (npsVar == null) {
            return;
        }
        com.bytedance.adsdk.fs.zn.zn.fs fsVar = new com.bytedance.adsdk.fs.zn.zn.fs(this, doe.zmn(npsVar), npsVar.mw(), npsVar, context);
        this.iqz = fsVar;
        if (this.nqi) {
            fsVar.zmn(true);
        }
        this.iqz.fs(this.kw);
    }

    public void iv() {
        if (this.btk.isRunning()) {
            this.btk.cancel();
            if (!isVisible()) {
                this.bvs = fs.NONE;
            }
        }
        this.fb = null;
        this.iqz = null;
        this.klz = null;
        this.btk.zg();
        invalidateSelf();
    }

    public void hhw(boolean z) {
        this.zg = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.vlj) {
            return;
        }
        this.vlj = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.phc = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.phc;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        btk.zmn("Drawable#draw");
        try {
            if (this.rp) {
                zmn(canvas, this.iqz);
            } else {
                zmn(canvas);
            }
        } catch (Throwable unused) {
        }
        this.vlj = false;
        btk.fs("Drawable#draw");
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        rc();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        klz();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return doe();
    }

    public void rc() {
        if (this.iqz == null) {
            this.iv.add(new zmn() { // from class: com.bytedance.adsdk.fs.bvs.6
                @Override // com.bytedance.adsdk.fs.bvs.zmn
                public void zmn(nps npsVar) {
                    bvs.this.rc();
                }
            });
            return;
        }
        so();
        if (ev() || phc() == 0) {
            if (isVisible()) {
                this.btk.rc();
                this.bvs = fs.NONE;
            } else {
                this.bvs = fs.PLAY;
            }
        }
        if (ev()) {
            return;
        }
        zn((int) (cyb() < 0.0f ? rt() : cn()));
        this.btk.klz();
        if (isVisible()) {
            return;
        }
        this.bvs = fs.NONE;
    }

    public void klz() {
        this.iv.clear();
        this.btk.klz();
        if (isVisible()) {
            return;
        }
        this.bvs = fs.NONE;
    }

    public void mw() {
        if (this.iqz == null) {
            this.iv.add(new zmn() { // from class: com.bytedance.adsdk.fs.bvs.7
                @Override // com.bytedance.adsdk.fs.bvs.zmn
                public void zmn(nps npsVar) {
                    bvs.this.mw();
                }
            });
            return;
        }
        so();
        if (ev() || phc() == 0) {
            if (isVisible()) {
                this.btk.rt();
                this.bvs = fs.NONE;
            } else {
                this.bvs = fs.RESUME;
            }
        }
        if (ev()) {
            return;
        }
        zn((int) (cyb() < 0.0f ? rt() : cn()));
        this.btk.klz();
        if (isVisible()) {
            return;
        }
        this.bvs = fs.NONE;
    }

    public void zmn(final int i) {
        if (this.fb == null) {
            this.iv.add(new zmn() { // from class: com.bytedance.adsdk.fs.bvs.8
                @Override // com.bytedance.adsdk.fs.bvs.zmn
                public void zmn(nps npsVar) {
                    bvs.this.zmn(i);
                }
            });
        } else {
            this.btk.zmn(i);
        }
    }

    public float rt() {
        return this.btk.cn();
    }

    public void zmn(final float f) {
        nps npsVar = this.fb;
        if (npsVar == null) {
            this.iv.add(new zmn() { // from class: com.bytedance.adsdk.fs.bvs.9
                @Override // com.bytedance.adsdk.fs.bvs.zmn
                public void zmn(nps npsVar2) {
                    bvs.this.zmn(f);
                }
            });
        } else {
            zmn((int) com.bytedance.adsdk.fs.hhw.btk.zmn(npsVar.hhw(), this.fb.nps(), f));
        }
    }

    public void fs(final int i) {
        if (this.fb == null) {
            this.iv.add(new zmn() { // from class: com.bytedance.adsdk.fs.bvs.10
                @Override // com.bytedance.adsdk.fs.bvs.zmn
                public void zmn(nps npsVar) {
                    bvs.this.fs(i);
                }
            });
        } else {
            this.btk.fs(i + 0.99f);
        }
    }

    public float cn() {
        return this.btk.cyb();
    }

    public void fs(final float f) {
        nps npsVar = this.fb;
        if (npsVar == null) {
            this.iv.add(new zmn() { // from class: com.bytedance.adsdk.fs.bvs.11
                @Override // com.bytedance.adsdk.fs.bvs.zmn
                public void zmn(nps npsVar2) {
                    bvs.this.fs(f);
                }
            });
        } else {
            this.btk.fs(com.bytedance.adsdk.fs.hhw.btk.zmn(npsVar.hhw(), this.fb.nps(), f));
        }
    }

    public void fs(final String str) {
        nps npsVar = this.fb;
        if (npsVar == null) {
            this.iv.add(new zmn() { // from class: com.bytedance.adsdk.fs.bvs.12
                @Override // com.bytedance.adsdk.fs.bvs.zmn
                public void zmn(nps npsVar2) {
                    bvs.this.fs(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.fs.zn.hhw zn = npsVar.zn(str);
        if (zn == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
        zmn((int) zn.zmn);
    }

    public void zn(final String str) {
        nps npsVar = this.fb;
        if (npsVar == null) {
            this.iv.add(new zmn() { // from class: com.bytedance.adsdk.fs.bvs.13
                @Override // com.bytedance.adsdk.fs.bvs.zmn
                public void zmn(nps npsVar2) {
                    bvs.this.zn(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.fs.zn.hhw zn = npsVar.zn(str);
        if (zn == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
        fs((int) (zn.zmn + zn.fs));
    }

    public void fb(final String str) {
        nps npsVar = this.fb;
        if (npsVar == null) {
            this.iv.add(new zmn() { // from class: com.bytedance.adsdk.fs.bvs.2
                @Override // com.bytedance.adsdk.fs.bvs.zmn
                public void zmn(nps npsVar2) {
                    bvs.this.fb(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.fs.zn.hhw zn = npsVar.zn(str);
        if (zn == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
        int i = (int) zn.zmn;
        zmn(i, ((int) zn.fs) + i);
    }

    public void zmn(final int i, final int i2) {
        if (this.fb == null) {
            this.iv.add(new zmn() { // from class: com.bytedance.adsdk.fs.bvs.3
                @Override // com.bytedance.adsdk.fs.bvs.zmn
                public void zmn(nps npsVar) {
                    bvs.this.zmn(i, i2);
                }
            });
        } else {
            this.btk.zmn(i, i2 + 0.99f);
        }
    }

    public void zn(float f) {
        this.btk.zn(f);
    }

    public float cyb() {
        return this.btk.iv();
    }

    public void zmn(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.btk.addUpdateListener(animatorUpdateListener);
    }

    public void fs(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.btk.removeUpdateListener(animatorUpdateListener);
    }

    public void olo() {
        this.btk.removeAllUpdateListeners();
        this.btk.addUpdateListener(this.rc);
    }

    public void zmn(Animator.AnimatorListener animatorListener) {
        this.btk.addListener(animatorListener);
    }

    public void fs(Animator.AnimatorListener animatorListener) {
        this.btk.removeListener(animatorListener);
    }

    public void kgc() {
        this.btk.removeAllListeners();
    }

    public void zn(final int i) {
        if (this.fb == null) {
            this.iv.add(new zmn() { // from class: com.bytedance.adsdk.fs.bvs.4
                @Override // com.bytedance.adsdk.fs.bvs.zmn
                public void zmn(nps npsVar) {
                    bvs.this.zn(i);
                }
            });
        } else {
            this.btk.zmn(i);
        }
    }

    public int kw() {
        return (int) this.btk.nps();
    }

    public void fb(final float f) {
        if (this.fb == null) {
            this.iv.add(new zmn() { // from class: com.bytedance.adsdk.fs.bvs.5
                @Override // com.bytedance.adsdk.fs.bvs.zmn
                public void zmn(nps npsVar) {
                    bvs.this.fb(f);
                }
            });
            return;
        }
        btk.zmn("Drawable#setProgress");
        this.btk.zmn(this.fb.zmn(f));
        btk.fs("Drawable#setProgress");
    }

    public void fb(int i) {
        this.btk.setRepeatMode(i);
    }

    @SuppressLint({"WrongConstant"})
    public int iqz() {
        return this.btk.getRepeatMode();
    }

    public void btk(int i) {
        this.btk.setRepeatCount(i);
    }

    public int phc() {
        return this.btk.getRepeatCount();
    }

    public boolean doe() {
        com.bytedance.adsdk.fs.hhw.zn znVar = this.btk;
        if (znVar == null) {
            return false;
        }
        return znVar.isRunning();
    }

    boolean nqi() {
        if (isVisible()) {
            return this.btk.isRunning();
        }
        fs fsVar = this.bvs;
        return fsVar == fs.PLAY || fsVar == fs.RESUME;
    }

    private boolean ev() {
        return this.hhw || this.nps;
    }

    public void zmn(Boolean bool) {
        this.hhw = bool.booleanValue();
    }

    public void nps(boolean z) {
        this.nps = z;
    }

    public void zg(boolean z) {
        this.btk.zn(z);
    }

    public void zmn(fb fbVar) {
        this.rt = fbVar;
        com.bytedance.adsdk.fs.fs.fs fsVar = this.klz;
        if (fsVar != null) {
            fsVar.zmn(fbVar);
        }
    }

    public void zmn(zn znVar) {
        this.fs = znVar;
        com.bytedance.adsdk.fs.fs.zmn zmnVar = this.cn;
        if (zmnVar != null) {
            zmnVar.zmn(znVar);
        }
    }

    public void zmn(Map<String, Typeface> map) {
        if (map == this.cyb) {
            return;
        }
        this.cyb = map;
        invalidateSelf();
    }

    public void zmn(iqz iqzVar) {
        this.zn = iqzVar;
    }

    public iqz uqh() {
        return this.zn;
    }

    public boolean bjh() {
        return this.cyb == null && this.zn == null && this.fb.rt().size() > 0;
    }

    public nps rp() {
        return this.fb;
    }

    public void kjb() {
        this.iv.clear();
        this.btk.cancel();
        if (isVisible()) {
            return;
        }
        this.bvs = fs.NONE;
    }

    public void zak() {
        this.iv.clear();
        this.btk.mw();
        if (isVisible()) {
            return;
        }
        this.bvs = fs.NONE;
    }

    public float am() {
        return this.btk.hhw();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        nps npsVar = this.fb;
        if (npsVar == null) {
            return -1;
        }
        return npsVar.fb().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        nps npsVar = this.fb;
        if (npsVar == null) {
            return -1;
        }
        return npsVar.fb().height();
    }

    public Bitmap zmn(String str, Bitmap bitmap) {
        com.bytedance.adsdk.fs.fs.fs tf = tf();
        if (tf == null) {
            return null;
        }
        Bitmap zmn2 = tf.zmn(str, bitmap);
        invalidateSelf();
        return zmn2;
    }

    public Bitmap btk(String str) {
        com.bytedance.adsdk.fs.fs.fs tf = tf();
        if (tf != null) {
            return tf.zmn(str);
        }
        return null;
    }

    public iv hhw(String str) {
        nps npsVar = this.fb;
        if (npsVar == null) {
            return null;
        }
        return npsVar.cyb().get(str);
    }

    private com.bytedance.adsdk.fs.fs.fs tf() {
        com.bytedance.adsdk.fs.fs.fs fsVar = this.klz;
        if (fsVar != null && !fsVar.zmn(hgd())) {
            this.klz = null;
        }
        if (this.klz == null) {
            this.klz = new com.bytedance.adsdk.fs.fs.fs(getCallback(), this.mw, this.rt, this.fb.cyb());
        }
        return this.klz;
    }

    public Typeface zmn(com.bytedance.adsdk.fs.zn.zn znVar) {
        Map<String, Typeface> map = this.cyb;
        if (map != null) {
            String zmn2 = znVar.zmn();
            if (map.containsKey(zmn2)) {
                return map.get(zmn2);
            }
            String fs2 = znVar.fs();
            if (map.containsKey(fs2)) {
                return map.get(fs2);
            }
            String str = znVar.zmn() + "-" + znVar.zn();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        com.bytedance.adsdk.fs.fs.zmn fkt = fkt();
        if (fkt != null) {
            return fkt.zmn(znVar);
        }
        return null;
    }

    private com.bytedance.adsdk.fs.fs.zmn fkt() {
        if (getCallback() == null) {
            return null;
        }
        if (this.cn == null) {
            com.bytedance.adsdk.fs.fs.zmn zmnVar = new com.bytedance.adsdk.fs.fs.zmn(getCallback(), this.fs);
            this.cn = zmnVar;
            String str = this.zmn;
            if (str != null) {
                zmnVar.zmn(str);
            }
        }
        return this.cn;
    }

    public void nps(String str) {
        this.zmn = str;
        com.bytedance.adsdk.fs.fs.zmn fkt = fkt();
        if (fkt != null) {
            fkt.zmn(str);
        }
    }

    private Context hgd() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean isVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            fs fsVar = this.bvs;
            if (fsVar == fs.PLAY) {
                rc();
            } else if (fsVar == fs.RESUME) {
                mw();
            }
        } else if (this.btk.isRunning()) {
            zak();
            this.bvs = fs.RESUME;
        } else if (isVisible) {
            this.bvs = fs.NONE;
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

    private void zmn(Canvas canvas) {
        com.bytedance.adsdk.fs.zn.zn.fs fsVar = this.iqz;
        nps npsVar = this.fb;
        if (fsVar == null || npsVar == null) {
            return;
        }
        this.kjb.reset();
        if (!getBounds().isEmpty()) {
            this.kjb.preScale(r2.width() / npsVar.fb().width(), r2.height() / npsVar.fb().height());
            this.kjb.preTranslate(r2.left, r2.top);
        }
        fsVar.zmn(canvas, this.kjb, this.phc);
    }

    public RectF yj() {
        return this.nu;
    }

    private void zmn(Canvas canvas, com.bytedance.adsdk.fs.zn.zn.fs fsVar) {
        if (this.fb == null || fsVar == null) {
            return;
        }
        nu();
        canvas.getMatrix(this.ww);
        canvas.getClipBounds(this.yj);
        zmn(this.yj, this.so);
        this.ww.mapRect(this.so);
        zmn(this.so, this.yj);
        if (this.kw) {
            this.nu.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            fsVar.zmn(this.nu, (Matrix) null, false);
        }
        this.ww.mapRect(this.nu);
        Rect bounds = getBounds();
        float width = bounds.width() / getIntrinsicWidth();
        float height = bounds.height() / getIntrinsicHeight();
        zmn(this.nu, width, height);
        if (!ww()) {
            RectF rectF = this.nu;
            Rect rect = this.yj;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int ceil = (int) Math.ceil(this.nu.width());
        int ceil2 = (int) Math.ceil(this.nu.height());
        if (ceil == 0 || ceil2 == 0) {
            return;
        }
        fs(ceil, ceil2);
        if (this.vlj) {
            this.kjb.set(this.ww);
            this.kjb.preScale(width, height);
            Matrix matrix = this.kjb;
            RectF rectF2 = this.nu;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.zak.eraseColor(0);
            fsVar.zmn(this.am, this.kjb, this.phc);
            this.ww.invert(this.oub);
            this.oub.mapRect(this.hgd, this.nu);
            zmn(this.hgd, this.fkt);
        }
        this.tf.set(0, 0, ceil, ceil2);
        canvas.drawBitmap(this.zak, this.tf, this.fkt, this.ev);
    }

    private void nu() {
        if (this.am != null) {
            return;
        }
        this.am = new Canvas();
        this.nu = new RectF();
        this.ww = new Matrix();
        this.oub = new Matrix();
        this.yj = new Rect();
        this.so = new RectF();
        this.ev = new com.bytedance.adsdk.fs.zmn.zmn();
        this.tf = new Rect();
        this.fkt = new Rect();
        this.hgd = new RectF();
    }

    private void fs(int i, int i2) {
        Bitmap bitmap = this.zak;
        if (bitmap == null || bitmap.getWidth() < i || this.zak.getHeight() < i2) {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.zak = createBitmap;
            this.am.setBitmap(createBitmap);
            this.vlj = true;
            return;
        }
        if (this.zak.getWidth() > i || this.zak.getHeight() > i2) {
            Bitmap createBitmap2 = Bitmap.createBitmap(this.zak, 0, 0, i, i2);
            this.zak = createBitmap2;
            this.am.setBitmap(createBitmap2);
            this.vlj = true;
        }
    }

    private void zmn(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void zmn(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void zmn(RectF rectF, float f, float f2) {
        rectF.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
    }

    private boolean ww() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        return (parent instanceof ViewGroup) && !((ViewGroup) parent).getClipChildren();
    }
}
