package com.bytedance.sdk.openadsdk.core.mw.fs.zmn;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes14.dex */
class zmn extends View {
    private final Path am;
    private final RectF bjh;
    private int btk;
    private com.bytedance.adsdk.ugeno.bvs.hhw.zmn bvs;
    private float[] cn;
    private float cud;
    private float[] cyb;
    private float dgt;
    private float[] doe;
    private final float[] ev;
    private int fb;
    private Paint fkt;
    private int fs;
    private float gn;
    private long hgd;
    private float hhw;
    private ValueAnimator[] iqz;
    private Handler iv;
    private int jy;
    private boolean[] kgc;
    private final RectF kjb;
    private Camera klz;
    private fs[] kra;
    private ValueAnimator[] kw;
    private final Runnable mhu;
    private Matrix mw;
    private C0170zmn[] na;
    private com.bytedance.sdk.openadsdk.core.mw.fs.zmn.fs nps;
    private final AccelerateDecelerateInterpolator nqi;
    private int nu;
    private boolean[] olo;
    private int oub;
    private float[] phc;
    private String[] rc;
    private final RectF rp;
    private String[] rt;
    private final Path so;
    private final float[] tf;
    private float uqd;
    private final RectF uqh;
    private float vlj;
    private int ww;
    private final Path yj;
    private float yof;
    private final Path zak;
    private Paint zg;
    private int zmn;
    private int zn;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    static /* synthetic */ int zmn(zmn zmnVar) {
        int i = zmnVar.zmn;
        zmnVar.zmn = i - 1;
        return i;
    }

    public zmn(Context context) {
        super(context);
        this.iv = new Handler(Looper.getMainLooper());
        this.rc = new String[3];
        this.klz = new Camera();
        this.mw = new Matrix();
        this.rt = new String[3];
        this.cn = new float[3];
        this.cyb = new float[3];
        this.olo = new boolean[3];
        this.kgc = new boolean[3];
        this.kw = new ValueAnimator[3];
        this.iqz = new ValueAnimator[3];
        this.phc = new float[3];
        this.doe = new float[3];
        this.nqi = new AccelerateDecelerateInterpolator();
        this.uqh = new RectF();
        this.bjh = new RectF();
        this.rp = new RectF();
        this.kjb = new RectF();
        this.zak = new Path();
        this.am = new Path();
        this.yj = new Path();
        this.so = new Path();
        this.ev = new float[8];
        this.tf = new float[8];
        this.hgd = 0L;
        this.mhu = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mw.fs.zmn.zmn.1
            @Override // java.lang.Runnable
            public void run() {
                zmn.zmn(zmn.this);
                zmn.this.invalidate();
                if (zmn.this.zmn <= 0) {
                    zmn.this.iv.removeCallbacks(this);
                    zmn.this.fs();
                } else {
                    zmn.this.iv.postDelayed(this, 1000L);
                }
            }
        };
        fb();
        btk();
        zn();
    }

    private void zn() {
        this.kra = new fs[3];
        this.na = new C0170zmn[3];
        for (int i = 0; i < 3; i++) {
            this.kra[i] = new fs(this, i);
            this.na[i] = new C0170zmn(this, i);
        }
    }

    private void fb() {
        Paint paint = new Paint();
        this.zg = paint;
        paint.setColor(this.fs);
        this.zg.setAntiAlias(true);
    }

    public void zmn(int i, int i2, int i3, int i4, int i5, float f) {
        int min = Math.min(i, 360060);
        this.fs = i2;
        this.zn = i3;
        this.fb = i4;
        this.btk = i5;
        this.hhw = f;
        this.zmn = min;
        this.iv.post(this.mhu);
        Paint paint = this.zg;
        if (paint != null) {
            paint.setColor(this.fs);
        }
        float[] fArr = this.ev;
        float f2 = this.hhw;
        fArr[3] = f2;
        fArr[2] = f2;
        fArr[1] = f2;
        fArr[0] = f2;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        fArr[5] = 0.0f;
        fArr[4] = 0.0f;
        float[] fArr2 = this.tf;
        fArr2[3] = 0.0f;
        fArr2[2] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[0] = 0.0f;
        fArr2[7] = f2;
        fArr2[6] = f2;
        fArr2[5] = f2;
        fArr2[4] = f2;
        invalidate();
    }

    private void btk() {
        if (this.bvs == null) {
            com.bytedance.adsdk.ugeno.bvs.hhw.zmn zmnVar = new com.bytedance.adsdk.ugeno.bvs.hhw.zmn(getContext());
            this.bvs = zmnVar;
            this.fkt = zmnVar.getPaint();
        }
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.mw.fs.zmn.fs fsVar) {
        this.nps = fsVar;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        com.bytedance.sdk.openadsdk.core.mw.fs.zmn.fs fsVar = this.nps;
        if (fsVar != null) {
            int[] zmn = fsVar.zmn(i, i2);
            if (this.btk > 0) {
                int mode = View.MeasureSpec.getMode(zmn[1]);
                int size = View.MeasureSpec.getSize(zmn[1]);
                if (mode == 0 || size > this.btk) {
                    zmn[1] = View.MeasureSpec.makeMeasureSpec(this.btk, 1073741824);
                }
            }
            super.onMeasure(zmn[0], zmn[1]);
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    @SuppressLint({"DefaultLocale"})
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.fb <= 0 || this.btk <= 0) {
            return;
        }
        this.uqh.set((getWidth() - this.fb) / 2.0f, (getHeight() - this.btk) / 2.0f, (getWidth() + this.fb) / 2.0f, (getHeight() + this.btk) / 2.0f);
        RectF rectF = this.uqh;
        float f = this.hhw;
        canvas.drawRoundRect(rectF, f, f, this.zg);
        int i = this.zmn;
        this.nu = i / 3600;
        int i2 = i % 3600;
        this.ww = i2;
        this.oub = i2 / 60;
        this.jy = i2 % 60;
        this.vlj = this.fb;
        this.yof = this.btk;
        float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        this.dgt = width;
        float f2 = this.vlj * 3.0f;
        this.cud = f2;
        float f3 = width - f2;
        this.gn = f3;
        this.uqd = f3 > 0.0f ? f3 / 2.0f : 10.0f;
        zmn(this.nu, this.oub, this.jy);
        float paddingLeft = getPaddingLeft();
        float centerY = this.uqh.centerY();
        float f4 = this.yof;
        zmn(canvas, paddingLeft, centerY - (f4 / 2.0f), this.vlj, f4, String.format("%02d", Integer.valueOf(this.nu)), 0);
        float paddingLeft2 = getPaddingLeft() + this.vlj + this.uqd;
        float centerY2 = this.uqh.centerY();
        float f5 = this.yof;
        zmn(canvas, paddingLeft2, centerY2 - (f5 / 2.0f), this.vlj, f5, String.format("%02d", Integer.valueOf(this.oub)), 1);
        float paddingLeft3 = getPaddingLeft() + ((this.vlj + this.uqd) * 2.0f);
        float centerY3 = this.uqh.centerY();
        float f6 = this.yof;
        zmn(canvas, paddingLeft3, centerY3 - (f6 / 2.0f), this.vlj, f6, String.format("%02d", Integer.valueOf(this.jy)), 2);
        zmn(canvas, getPaddingLeft() + this.vlj + (this.uqd / 2.0f), this.uqh.centerY());
        zmn(canvas, getPaddingLeft() + (this.vlj * 2.0f) + ((this.uqd * 3.0f) / 2.0f), this.uqh.centerY());
        com.bytedance.sdk.openadsdk.core.mw.fs.zmn.fs fsVar = this.nps;
        if (fsVar != null) {
            fsVar.zmn(canvas);
        }
    }

    private void zmn(Canvas canvas, float f, float f2, float f3, float f4, String str, int i) {
        this.bjh.set(f, f2, f3 + f, f4 + f2);
        float centerY = this.bjh.centerY();
        float centerY2 = this.bjh.centerY() - ((this.bvs.getPaint().descent() + this.bvs.getPaint().ascent()) / 2.0f);
        RectF rectF = this.rp;
        RectF rectF2 = this.bjh;
        rectF.set(rectF2.left, rectF2.top, rectF2.right, centerY);
        this.zak.reset();
        Path path = this.zak;
        RectF rectF3 = this.rp;
        float[] fArr = this.ev;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF3, fArr, direction);
        this.zg.setColor(this.fs);
        canvas.drawPath(this.zak, this.zg);
        this.fkt.setTextAlign(Paint.Align.CENTER);
        canvas.drawText(str, this.bjh.centerX(), centerY2, this.fkt);
        RectF rectF4 = this.kjb;
        RectF rectF5 = this.bjh;
        rectF4.set(rectF5.left, centerY, rectF5.right, rectF5.bottom);
        this.am.reset();
        this.am.addRoundRect(this.kjb, this.tf, direction);
        this.zg.setColor(this.zn);
        canvas.drawPath(this.am, this.zg);
        canvas.drawText(str, this.bjh.centerX(), centerY2, this.bvs.getPaint());
        boolean z = this.olo[i];
        if (z || this.kgc[i]) {
            if (z) {
                canvas.save();
                this.mw.reset();
                this.klz.save();
                this.klz.rotateX(this.cn[i]);
                this.klz.getMatrix(this.mw);
                this.mw.preTranslate(-this.bjh.centerX(), -centerY);
                this.mw.postTranslate(this.bjh.centerX(), centerY);
                canvas.concat(this.mw);
                this.yj.reset();
                this.yj.addRoundRect(this.rp, this.ev, direction);
                this.zg.setColor(this.fs);
                canvas.drawPath(this.yj, this.zg);
                int alpha = this.fkt.getAlpha();
                this.fkt.setAlpha((int) (this.phc[i] * 255.0f));
                canvas.drawText(this.rc[i], this.bjh.centerX(), centerY2, this.fkt);
                this.fkt.setAlpha(alpha);
                this.klz.restore();
                canvas.restore();
            }
            if (this.kgc[i]) {
                canvas.save();
                this.mw.reset();
                this.klz.save();
                this.klz.rotateX(this.cyb[i]);
                this.klz.getMatrix(this.mw);
                this.mw.preTranslate(-this.bjh.centerX(), -centerY);
                this.mw.postTranslate(this.bjh.centerX(), centerY);
                canvas.concat(this.mw);
                this.so.reset();
                this.so.addRoundRect(this.kjb, this.tf, direction);
                this.zg.setColor(this.zn);
                canvas.drawPath(this.so, this.zg);
                int alpha2 = this.fkt.getAlpha();
                this.fkt.setAlpha((int) (this.doe[i] * 255.0f));
                canvas.drawText(this.rt[i], this.bjh.centerX(), centerY2, this.fkt);
                this.fkt.setAlpha(alpha2);
                this.klz.restore();
                canvas.restore();
            }
        }
    }

    private void zmn(Canvas canvas, float f, float f2) {
        canvas.drawText(":", f, f2 - ((this.fkt.descent() + this.fkt.ascent()) / 2.0f), this.fkt);
    }

    @SuppressLint({"DefaultLocale"})
    private void zmn(int i, int i2, int i3) {
        String str = this.rc[0];
        String format = String.format("%02d", Integer.valueOf(i));
        if (!format.equals(str) && !this.olo[0] && !this.kgc[0] && str != null) {
            zmn(0, str, format);
        }
        String str2 = this.rc[1];
        String format2 = String.format("%02d", Integer.valueOf(i2));
        if (!format2.equals(str2) && !this.olo[1] && !this.kgc[1] && str2 != null) {
            zmn(1, str2, format2);
        }
        String str3 = this.rc[2];
        String format3 = String.format("%02d", Integer.valueOf(i3));
        if (!format3.equals(str3) && !this.olo[2] && !this.kgc[2] && str3 != null) {
            zmn(2, str3, format3);
        }
        String[] strArr = this.rc;
        if (strArr[0] == null) {
            strArr[0] = format;
        }
        if (strArr[1] == null) {
            strArr[1] = format2;
        }
        if (strArr[2] == null) {
            strArr[2] = format3;
        }
    }

    private void zmn(final int i, String str, String str2) {
        this.rc[i] = str;
        this.rt[i] = str2;
        this.olo[i] = true;
        this.kgc[i] = true;
        this.cn[i] = 0.0f;
        this.cyb[i] = 90.0f;
        this.phc[i] = 1.0f;
        this.doe[i] = 0.0f;
        ValueAnimator[] valueAnimatorArr = this.kw;
        ValueAnimator valueAnimator = valueAnimatorArr[i];
        if (valueAnimator == null) {
            valueAnimatorArr[i] = ValueAnimator.ofFloat(0.0f, -90.0f);
            this.kw[i].setDuration(250L);
            this.kw[i].setInterpolator(this.nqi);
            this.kw[i].addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.mw.fs.zmn.zmn$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    zmn.this.fs(i, valueAnimator2);
                }
            });
            this.kw[i].addListener(this.kra[i]);
        } else {
            valueAnimator.setFloatValues(0.0f, -90.0f);
        }
        ValueAnimator[] valueAnimatorArr2 = this.iqz;
        ValueAnimator valueAnimator2 = valueAnimatorArr2[i];
        if (valueAnimator2 == null) {
            valueAnimatorArr2[i] = ValueAnimator.ofFloat(-90.0f, 0.0f);
            this.iqz[i].setDuration(250L);
            this.iqz[i].setInterpolator(this.nqi);
            this.iqz[i].addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.mw.fs.zmn.zmn$$ExternalSyntheticLambda1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    zmn.this.zmn(i, valueAnimator3);
                }
            });
            this.iqz[i].addListener(this.na[i]);
        } else {
            valueAnimator2.setFloatValues(-90.0f, 0.0f);
        }
        if (this.kw[i].isRunning()) {
            this.kw[i].cancel();
        }
        if (this.iqz[i].isRunning()) {
            this.iqz[i].cancel();
        }
        this.kw[i].start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void fs(int i, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.cn[i] = floatValue;
        this.phc[i] = 1.0f - (floatValue / (-90.0f));
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.hgd >= 16) {
            invalidate();
            this.hgd = currentTimeMillis;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zmn(int i, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.cyb[i] = floatValue;
        this.doe[i] = (floatValue + 90.0f) / 90.0f;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.hgd >= 16) {
            invalidate();
            this.hgd = currentTimeMillis;
        }
    }

    public com.bytedance.adsdk.ugeno.bvs.hhw.zmn zmn() {
        return this.bvs;
    }

    public void zmn(com.bytedance.adsdk.ugeno.bvs.hhw.zmn zmnVar) {
        this.bvs = zmnVar;
    }

    public void fs() {
        for (int i = 0; i < 3; i++) {
            ValueAnimator valueAnimator = this.kw[i];
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.kw[i].cancel();
            }
            ValueAnimator valueAnimator2 = this.iqz[i];
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.iqz[i].cancel();
            }
        }
    }

    private static class fs implements Animator.AnimatorListener {
        private final zmn fs;
        private final int zmn;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public fs(zmn zmnVar, int i) {
            this.fs = zmnVar;
            this.zmn = i;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.fs.olo[this.zmn] = false;
            this.fs.iqz[this.zmn].start();
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.mw.fs.zmn.zmn$zmn, reason: collision with other inner class name */
    private static class C0170zmn implements Animator.AnimatorListener {
        private final zmn fs;
        private final int zmn;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public C0170zmn(zmn zmnVar, int i) {
            this.fs = zmnVar;
            this.zmn = i;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.fs.kgc[this.zmn] = false;
            this.fs.rc[this.zmn] = this.fs.rt[this.zmn];
        }
    }
}
