package com.bytedance.adsdk.fs;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.adsdk.fs.nps;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONArray;

/* loaded from: classes9.dex */
public class hhw extends ImageView {
    private static final rc<Throwable> fs = new rc<Throwable>() { // from class: com.bytedance.adsdk.fs.hhw.1
        @Override // com.bytedance.adsdk.fs.rc
        public void zmn(Throwable th) {
            com.bytedance.adsdk.fs.hhw.hhw.zmn(th);
        }
    };
    private static final String zmn = "hhw";
    private fs am;
    private int bjh;
    private rc<Throwable> btk;
    private int bvs;
    private mw<nps> cn;
    private nps cyb;
    private int doe;
    private final rc<Throwable> fb;
    private int hhw;
    private long iqz;
    private boolean iv;
    private int kgc;
    private JSONArray kjb;
    private boolean klz;
    private Handler kw;
    private final Set<fb> mw;
    private final bvs nps;
    private int nqi;
    private final Handler olo;
    private com.bytedance.adsdk.fs.zn.zn.zn phc;
    private boolean rc;
    private String rp;
    private final Set<Object> rt;
    private int uqh;
    private zmn yj;
    private final Runnable zak;
    private String zg;
    private final rc<nps> zn;

    private enum fb {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public interface fs {
    }

    public interface zmn {
    }

    static /* synthetic */ int btk(hhw hhwVar) {
        int i = hhwVar.kgc;
        hhwVar.kgc = i + 1;
        return i;
    }

    static /* synthetic */ int kgc(hhw hhwVar) {
        int i = hhwVar.doe;
        hhwVar.doe = i - 1;
        return i;
    }

    public hhw(Context context) {
        super(context);
        this.zn = new rc<nps>() { // from class: com.bytedance.adsdk.fs.hhw.6
            @Override // com.bytedance.adsdk.fs.rc
            public void zmn(nps npsVar) {
                hhw.this.setComposition(npsVar);
            }
        };
        this.fb = new rc<Throwable>() { // from class: com.bytedance.adsdk.fs.hhw.7
            @Override // com.bytedance.adsdk.fs.rc
            public void zmn(Throwable th) {
                if (hhw.this.hhw != 0) {
                    hhw hhwVar = hhw.this;
                    hhwVar.setImageResource(hhwVar.hhw);
                }
                (hhw.this.btk == null ? hhw.fs : hhw.this.btk).zmn(th);
            }
        };
        this.hhw = 0;
        this.nps = new bvs();
        this.iv = false;
        this.rc = false;
        this.klz = true;
        this.mw = new HashSet();
        this.rt = new HashSet();
        this.olo = new Handler(Looper.getMainLooper());
        this.kgc = 0;
        this.iqz = 0L;
        this.zak = new Runnable() { // from class: com.bytedance.adsdk.fs.hhw.4
            @Override // java.lang.Runnable
            public void run() {
                Log.i("TMe", "--==--- timer callback, timer: " + hhw.this.doe + ", " + hhw.this.nqi);
                if (hhw.this.doe <= hhw.this.nqi) {
                    if (hhw.this.uqh >= 0 && hhw.this.bjh >= 0) {
                        Log.i("TMe", "--==--- timer end, play anim, startframe: " + hhw.this.uqh);
                        hhw.this.zmn();
                        hhw hhwVar = hhw.this;
                        hhwVar.setFrame(hhwVar.uqh);
                        hhw.this.zmn(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.fs.hhw.4.1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                if (hhw.this.getFrame() < hhw.this.bjh - 1 || hhw.this.getFrame() >= hhw.this.bjh + 2) {
                                    return;
                                }
                                Log.i("TMe", "--==--- timer end, play anim, endframe: " + hhw.this.bjh);
                                hhw.this.fs(this);
                                hhw.this.hhw();
                            }
                        });
                    } else {
                        Log.i("TMe", "--==--- timer end, frame invalid: " + hhw.this.uqh + StringUtils.COMMA + hhw.this.bjh);
                    }
                    if ((!TextUtils.isEmpty(hhw.this.rp) || (hhw.this.kjb != null && hhw.this.kjb.length() > 0)) && hhw.this.am != null) {
                        fs unused = hhw.this.am;
                        String unused2 = hhw.this.rp;
                        JSONArray unused3 = hhw.this.kjb;
                        return;
                    }
                    return;
                }
                hhw.kgc(hhw.this);
                com.bytedance.adsdk.fs.zn.zn.zn znVar = hhw.this.phc;
                StringBuilder sb = new StringBuilder();
                sb.append(hhw.this.doe);
                znVar.zmn(sb.toString());
                hhw.this.invalidate();
                hhw.this.cn();
            }
        };
        zg();
    }

    private void zg() {
        setSaveEnabled(false);
        this.klz = true;
        setFallbackResource(0);
        setImageAssetsFolder("");
        zmn(0.0f, false);
        zmn(false, getContext().getApplicationContext());
        setIgnoreDisabledSystemAnimations(false);
        this.nps.zmn(Boolean.valueOf(com.bytedance.adsdk.fs.hhw.hhw.zmn(getContext()) != 0.0f));
        bvs();
        iv();
        klz();
    }

    private void bvs() {
        zmn(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.fs.hhw.8
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                hhw.this.fs(this);
                hhw.this.rt();
                hhw.this.rc();
            }
        });
    }

    private void iv() {
        zmn(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.fs.hhw.9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || ((Float) animatedValue).floatValue() < 0.98f) {
                    return;
                }
                hhw.btk(hhw.this);
                nps.zmn globalConfig = hhw.this.getGlobalConfig();
                if (globalConfig != null && (i = globalConfig.fb) > 0 && i > hhw.this.kgc) {
                    hhw.this.rt();
                    hhw.this.zmn();
                    hhw.this.setProgress(0.0f);
                } else {
                    hhw.this.fs(this);
                    if (hhw.this.yj != null) {
                        zmn unused = hhw.this.yj;
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rc() {
        final nps.zmn globalConfig = getGlobalConfig();
        if (globalConfig == null || globalConfig.btk <= 0) {
            return;
        }
        if (TextUtils.isEmpty(globalConfig.hhw) && globalConfig.nps == null) {
            return;
        }
        int i = globalConfig.btk;
        if (i > getMaxFrame()) {
            i = (int) getMaxFrame();
        }
        final float maxFrame = i / getMaxFrame();
        zmn(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.fs.hhw.10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || ((Float) animatedValue).floatValue() < maxFrame) {
                    return;
                }
                hhw.this.fs(this);
                if (hhw.this.am != null) {
                    fs unused = hhw.this.am;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(long j) {
        Map<String, Object> map;
        nps.zmn globalConfig = getGlobalConfig();
        if (this.yj != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
            if (globalConfig == null || (map = globalConfig.fs) == null || map.isEmpty()) {
                return;
            }
            hashMap.putAll(globalConfig.fs);
        }
    }

    private void klz() {
        zmn(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.fs.hhw.11
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                iqz uqh;
                final long elapsedRealtime = SystemClock.elapsedRealtime() - hhw.this.iqz;
                hhw.this.fs(this);
                String playDelayedELExpressTimeS = hhw.this.getPlayDelayedELExpressTimeS();
                if (!TextUtils.isEmpty(playDelayedELExpressTimeS) && (uqh = hhw.this.nps.uqh()) != null) {
                    try {
                        int parseInt = Integer.parseInt(uqh.zmn(playDelayedELExpressTimeS)) * 1000;
                        if (hhw.this.iqz > 0) {
                            long elapsedRealtime2 = (hhw.this.iqz + parseInt) - SystemClock.elapsedRealtime();
                            Log.i("TMe", "--==-- lottie delayed time: ".concat(String.valueOf(elapsedRealtime2)));
                            if (elapsedRealtime2 > 0) {
                                hhw.this.hhw();
                                hhw.this.setVisibility(8);
                                if (hhw.this.kw == null) {
                                    hhw.this.kw = new Handler(Looper.getMainLooper());
                                }
                                hhw.this.kw.removeCallbacksAndMessages(null);
                                hhw.this.kw.postDelayed(new Runnable() { // from class: com.bytedance.adsdk.fs.hhw.11.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Log.i("TMe", "--==-- lottie real start play");
                                        hhw.this.setVisibility(0);
                                        hhw.this.zmn();
                                        hhw.this.zmn(elapsedRealtime);
                                    }
                                }, elapsedRealtime2);
                                return;
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                hhw.this.zmn(elapsedRealtime);
            }
        });
    }

    public void setView(View view) {
        this.nps.zmn(view);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        mw();
        super.setImageResource(i);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        mw();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        mw();
        super.setImageBitmap(bitmap);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        bvs bvsVar;
        if (!this.iv && drawable == (bvsVar = this.nps) && bvsVar.doe()) {
            hhw();
        } else if (!this.iv && (drawable instanceof bvs)) {
            bvs bvsVar2 = (bvs) drawable;
            if (bvsVar2.doe()) {
                bvsVar2.zak();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof bvs) && ((bvs) drawable).hhw() == kw.SOFTWARE) {
            this.nps.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        bvs bvsVar = this.nps;
        if (drawable2 == bvsVar) {
            super.invalidateDrawable(bvsVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPlayDelayedELExpressTimeS() {
        nps rp;
        bvs bvsVar = this.nps;
        if (bvsVar == null || (rp = bvsVar.rp()) == null) {
            return null;
        }
        return rp.bvs();
    }

    private iv zmn(String str) {
        bvs bvsVar;
        nps rp;
        Map<String, iv> cyb;
        if (TextUtils.isEmpty(str) || (bvsVar = this.nps) == null || (rp = bvsVar.rp()) == null || (cyb = rp.cyb()) == null) {
            return null;
        }
        return cyb.get(str);
    }

    private nps.fs getGlobalEvent() {
        nps rp;
        bvs bvsVar = this.nps;
        if (bvsVar == null || (rp = bvsVar.rp()) == null) {
            return null;
        }
        return rp.iv();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public nps.zmn getGlobalConfig() {
        nps rp;
        bvs bvsVar = this.nps;
        if (bvsVar == null || (rp = bvsVar.rp()) == null) {
            return null;
        }
        return rp.rc();
    }

    private void zmn(int[][] iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        try {
            int[] iArr2 = iArr[0];
            int i = iArr2[0];
            final int i2 = iArr2[1];
            if (i < 0 || i2 < 0) {
                return;
            }
            Log.i("TMe", "--==--- inel enter, play anim, startframe: ".concat(String.valueOf(i)));
            cyb();
            zmn();
            setFrame(i);
            zmn(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.fs.hhw.12
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (hhw.this.getFrame() < i2 - 1 || hhw.this.getFrame() >= i2 + 2) {
                        return;
                    }
                    Log.i("TMe", "--==--- inel enter, play anim end, endframe: " + i2 + ", realFrame: " + hhw.this.getFrame());
                    hhw.this.fs(this);
                    hhw.this.hhw();
                }
            });
        } catch (Throwable unused) {
        }
    }

    private void zmn(String str, String str2, JSONArray jSONArray) {
        nps.fs globalEvent = getGlobalEvent();
        if (globalEvent != null && str != null) {
            if (TextUtils.isEmpty(str2) && !str.contains("CSJNO")) {
                str2 = globalEvent.zmn;
            }
            if ((jSONArray == null || jSONArray.length() <= 0) && !str.contains("CSJLELNO")) {
                jSONArray = globalEvent.zn;
            }
        }
        if (!TextUtils.isEmpty(str2) || jSONArray == null) {
            return;
        }
        jSONArray.length();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int[][] iArr;
        com.bytedance.adsdk.fs.zn.zn.zmn zmn2 = zmn(motionEvent);
        if (zmn2 != null) {
            String bvs = zmn2.bvs();
            if (zmn2 instanceof com.bytedance.adsdk.fs.zn.zn.fs) {
                if (getGlobalConfig() == null || getGlobalConfig().zmn != 1) {
                    return super.onTouchEvent(motionEvent);
                }
                return false;
            }
            if (bvs != null && bvs.startsWith("CSJCLOSE")) {
                cyb();
            }
            iv zmn3 = zmn(zmn2.btk());
            if (zmn3 != null && motionEvent.getAction() == 1) {
                zmn(bvs, zmn3.btk(), zmn3.nps());
                int[][] hhw = zmn3.hhw();
                if (hhw != null) {
                    zmn(hhw);
                } else if (getGlobalEvent() != null && (iArr = getGlobalEvent().fs) != null) {
                    zmn(iArr);
                }
            }
            if (bvs == null || !bvs.startsWith("CSJNTP")) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        if (getGlobalConfig() == null || getGlobalConfig().zmn != 1) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    private com.bytedance.adsdk.fs.zn.zn.zmn zmn(MotionEvent motionEvent) {
        com.bytedance.adsdk.fs.zn.zn.fs fs2;
        bvs bvsVar = this.nps;
        if (bvsVar == null || (fs2 = bvsVar.fs()) == null) {
            return null;
        }
        return zmn(fs2, motionEvent);
    }

    private com.bytedance.adsdk.fs.zn.zn.zmn zmn(com.bytedance.adsdk.fs.zn.zn.fs fsVar, MotionEvent motionEvent) {
        com.bytedance.adsdk.fs.zn.zn.zmn zmn2;
        for (com.bytedance.adsdk.fs.zn.zn.zmn zmnVar : fsVar.klz()) {
            if (zmnVar instanceof com.bytedance.adsdk.fs.zn.zn.fs) {
                if (zmnVar.zg() && zmnVar.hhw() > 0.0f) {
                    RectF rectF = new RectF();
                    zmnVar.zmn(rectF, zmnVar.fb(), true);
                    if (rectF.width() >= 3.0f && rectF.height() >= 3.0f && (zmn2 = zmn((com.bytedance.adsdk.fs.zn.zn.fs) zmnVar, motionEvent)) != null) {
                        return zmn2;
                    }
                }
            } else if (zmnVar.zg() && zmnVar.hhw() > 0.0f) {
                RectF rectF2 = new RectF();
                bvs bvsVar = this.nps;
                if (bvsVar != null && bvsVar.nps()) {
                    zmnVar.zmn(rectF2, zmnVar.fb(), true);
                    RectF yj = this.nps.yj();
                    if (yj != null) {
                        zmn(rectF2, yj);
                    }
                } else {
                    RectF rectF3 = new RectF();
                    zmnVar.zmn(rectF3, zmnVar.fb(), true);
                    fs(rectF2, rectF3);
                }
                if (zmn(motionEvent, rectF2)) {
                    return zmnVar;
                }
            }
        }
        return null;
    }

    private boolean zmn(MotionEvent motionEvent, RectF rectF) {
        if (motionEvent != null && rectF != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (x >= rectF.left && x <= rectF.right && y >= rectF.top && y <= rectF.bottom) {
                return true;
            }
        }
        return false;
    }

    private void zmn(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float width2 = rectF2.width();
        float height2 = rectF2.height();
        if (width == 0.0f || height == 0.0f || width2 == 0.0f || height2 == 0.0f) {
            return;
        }
        Matrix matrix = new Matrix();
        int i = AnonymousClass5.zmn[getScaleType().ordinal()];
        if (i == 1) {
            zmn(matrix, width, height, width2, height2);
        } else if (i == 2) {
            fs(matrix, width, height, width2, height2);
        } else if (i == 3) {
            zn(matrix, width, height, width2, height2);
        } else if (i == 4) {
            fb(matrix, width, height, width2, height2);
        }
        matrix.mapRect(rectF);
    }

    /* renamed from: com.bytedance.adsdk.fs.hhw$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] zmn;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            zmn = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zmn[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zmn[ImageView.ScaleType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zmn[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void fs(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float width2 = this.nps.getBounds().width();
        float height2 = this.nps.getBounds().height();
        if (width == 0.0f || height == 0.0f || width2 == 0.0f || height2 == 0.0f) {
            return;
        }
        Matrix matrix = new Matrix();
        int i = AnonymousClass5.zmn[getScaleType().ordinal()];
        if (i == 1) {
            zmn(matrix, width, height, width2, height2);
        } else if (i == 2) {
            fs(matrix, width, height, width2, height2);
        } else if (i == 3) {
            zn(matrix, width, height, width2, height2);
        } else if (i == 4) {
            fb(matrix, width, height, width2, height2);
        }
        matrix.mapRect(rectF, rectF2);
    }

    private void zmn(Matrix matrix, float f, float f2, float f3, float f4) {
        if (f3 / f4 >= f / f2) {
            float f5 = f2 / f4;
            matrix.preScale(f5, f5);
            matrix.postTranslate(-(((f3 * f5) - f) / 2.0f), 0.0f);
        } else {
            float f6 = f / f3;
            matrix.preScale(f6, f6);
            matrix.postTranslate(0.0f, -(((f4 * f6) - f2) / 2.0f));
        }
    }

    private void fs(Matrix matrix, float f, float f2, float f3, float f4) {
        if (f3 < f && f4 < f2) {
            matrix.postTranslate((f - f3) / 2.0f, (f2 - f4) / 2.0f);
            return;
        }
        if (f3 / f4 >= f / f2) {
            float f5 = f / f3;
            matrix.preScale(f5, f5);
            matrix.postTranslate(0.0f, (f2 - (f4 * f5)) / 2.0f);
        } else {
            float f6 = f2 / f4;
            matrix.preScale(f6, f6);
            matrix.postTranslate((f - (f3 * f6)) / 2.0f, 0.0f);
        }
    }

    private void zn(Matrix matrix, float f, float f2, float f3, float f4) {
        matrix.postTranslate((f - f3) / 2.0f, (f2 - f4) / 2.0f);
    }

    private void fb(Matrix matrix, float f, float f2, float f3, float f4) {
        if (f3 >= f || f4 >= f2) {
            if (f3 / f4 >= f / f2) {
                float f5 = f / f3;
                matrix.preScale(f5, f5);
                matrix.postTranslate(0.0f, (f2 - (f4 * f5)) / 2.0f);
                return;
            } else {
                float f6 = f2 / f4;
                matrix.preScale(f6, f6);
                matrix.postTranslate((f - (f3 * f6)) / 2.0f, 0.0f);
                return;
            }
        }
        if (f3 / f4 >= f / f2) {
            float f7 = f / f3;
            matrix.preScale(f7, f7);
            matrix.postTranslate(0.0f, (f2 - (f4 * f7)) / 2.0f);
        } else {
            float f8 = f2 / f4;
            matrix.preScale(f8, f8);
            matrix.postTranslate((f - (f3 * f8)) / 2.0f, 0.0f);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        zn znVar = new zn(super.onSaveInstanceState());
        znVar.zmn = this.zg;
        znVar.fs = this.bvs;
        znVar.zn = this.nps.am();
        znVar.fb = this.nps.nqi();
        znVar.btk = this.nps.fb();
        znVar.hhw = this.nps.iqz();
        znVar.nps = this.nps.phc();
        return znVar;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof zn)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        zn znVar = (zn) parcelable;
        super.onRestoreInstanceState(znVar.getSuperState());
        this.zg = znVar.zmn;
        Set<fb> set = this.mw;
        fb fbVar = fb.SET_ANIMATION;
        if (!set.contains(fbVar) && !TextUtils.isEmpty(this.zg)) {
            setAnimation(this.zg);
        }
        this.bvs = znVar.fs;
        if (!this.mw.contains(fbVar) && (i = this.bvs) != 0) {
            setAnimation(i);
        }
        if (!this.mw.contains(fb.SET_PROGRESS)) {
            zmn(znVar.zn, false);
        }
        if (!this.mw.contains(fb.PLAY_OPTION) && znVar.fb) {
            zmn();
        }
        if (!this.mw.contains(fb.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(znVar.btk);
        }
        if (!this.mw.contains(fb.SET_REPEAT_MODE)) {
            setRepeatMode(znVar.hhw);
        }
        if (this.mw.contains(fb.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(znVar.nps);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.rc) {
            return;
        }
        this.nps.rc();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cyb();
        Handler handler = this.kw;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        zn();
        fs();
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.nps.nps(z);
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.nps.zg(z);
    }

    public void zmn(boolean z, Context context) {
        this.nps.zmn(z, context);
    }

    public void setClipToCompositionBounds(boolean z) {
        this.nps.zmn(z);
    }

    public boolean getClipToCompositionBounds() {
        return this.nps.zn();
    }

    public void setCacheComposition(boolean z) {
        this.klz = z;
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.nps.fb(z);
    }

    public void setAnimation(int i) {
        this.bvs = i;
        this.zg = null;
        setCompositionTask(zmn(i));
    }

    private mw<nps> zmn(final int i) {
        if (isInEditMode()) {
            return new mw<>(new Callable<klz<nps>>() { // from class: com.bytedance.adsdk.fs.hhw.13
                @Override // java.util.concurrent.Callable
                /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
                public klz<nps> call() throws Exception {
                    return hhw.this.klz ? zg.fs(hhw.this.getContext(), i) : zg.fs(hhw.this.getContext(), i, (String) null);
                }
            }, true);
        }
        return this.klz ? zg.zmn(getContext(), i) : zg.zmn(getContext(), i, (String) null);
    }

    public void setAnimation(String str) {
        this.zg = str;
        this.bvs = 0;
        setCompositionTask(fs(str));
    }

    private mw<nps> fs(final String str) {
        if (isInEditMode()) {
            return new mw<>(new Callable<klz<nps>>() { // from class: com.bytedance.adsdk.fs.hhw.2
                @Override // java.util.concurrent.Callable
                /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
                public klz<nps> call() throws Exception {
                    return hhw.this.klz ? zg.zn(hhw.this.getContext(), str) : zg.zn(hhw.this.getContext(), str, null);
                }
            }, true);
        }
        return this.klz ? zg.fs(getContext(), str) : zg.fs(getContext(), str, (String) null);
    }

    public void setAnimationFromJson(String str) {
        zmn(str, (String) null);
    }

    public void zmn(String str, String str2) {
        zmn(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void zmn(InputStream inputStream, String str) {
        setCompositionTask(zg.zmn(inputStream, str));
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.klz ? zg.zmn(getContext(), str) : zg.zmn(getContext(), str, (String) null));
    }

    public void setFailureListener(rc<Throwable> rcVar) {
        this.btk = rcVar;
    }

    public void setFallbackResource(int i) {
        this.hhw = i;
    }

    private void setCompositionTask(mw<nps> mwVar) {
        this.mw.add(fb.SET_ANIMATION);
        olo();
        mw();
        this.cn = mwVar.zmn(this.zn).zn(this.fb);
    }

    private void mw() {
        mw<nps> mwVar = this.cn;
        if (mwVar != null) {
            mwVar.fs(this.zn);
            this.cn.fb(this.fb);
        }
    }

    private com.bytedance.adsdk.fs.zn.zn.zn zmn(com.bytedance.adsdk.fs.zn.zn.fs fsVar, String str) {
        for (com.bytedance.adsdk.fs.zn.zn.zmn zmnVar : fsVar.klz()) {
            if (zmnVar instanceof com.bytedance.adsdk.fs.zn.zn.fs) {
                com.bytedance.adsdk.fs.zn.zn.zn zmn2 = zmn((com.bytedance.adsdk.fs.zn.zn.fs) zmnVar, str);
                if (zmn2 != null) {
                    return zmn2;
                }
            } else if (TextUtils.equals(str, zmnVar.bvs()) && (zmnVar instanceof com.bytedance.adsdk.fs.zn.zn.zn)) {
                return (com.bytedance.adsdk.fs.zn.zn.zn) zmnVar;
            }
        }
        return null;
    }

    private com.bytedance.adsdk.fs.zn.zn.zn zn(String str) {
        com.bytedance.adsdk.fs.zn.zn.fs fs2;
        bvs bvsVar = this.nps;
        if (bvsVar == null || (fs2 = bvsVar.fs()) == null) {
            return null;
        }
        return zmn(fs2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rt() {
        bvs bvsVar;
        int i;
        int i2;
        final int i3;
        if (this.cyb == null || (bvsVar = this.nps) == null) {
            return;
        }
        iqz uqh = bvsVar.uqh();
        nps.zn zg = this.cyb.zg();
        if (zg == null || uqh == null) {
            return;
        }
        final int i4 = zg.zmn;
        if (i4 < 0) {
            Log.i("TMe", "--==--- timer fail, ke is invalid: ".concat(String.valueOf(i4)));
            return;
        }
        int[] iArr = zg.btk;
        final int i5 = -1;
        if (iArr == null || iArr.length < 2) {
            i = -1;
            i2 = -1;
        } else {
            i2 = iArr[0];
            i = iArr[1];
        }
        String zmn2 = uqh.zmn(zg.zn);
        String zmn3 = uqh.zmn(zg.fb);
        try {
            i3 = Integer.parseInt(zmn2);
            try {
                i5 = Integer.parseInt(zmn3);
            } catch (NumberFormatException unused) {
            }
        } catch (NumberFormatException unused2) {
            i3 = -1;
        }
        Log.i("TMe", "--==--- prepare timer, startS: " + i3 + ", lenS: " + i5);
        if (!TextUtils.isEmpty(zg.fs)) {
            Log.i("TMe", "--==--- timer, id:" + zg.fs);
            com.bytedance.adsdk.fs.zn.zn.zn zn2 = zn(zg.fs);
            if (zn2 != null) {
                Log.i("TMe", "--==--- timer success");
                this.rp = zg.hhw;
                this.kjb = zg.nps;
                this.phc = zn2;
                this.doe = i3;
                this.nqi = i3 - i5;
                this.uqh = i2;
                this.bjh = i;
                StringBuilder sb = new StringBuilder();
                sb.append(this.doe);
                zn2.zmn(sb.toString());
                zmn(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.fs.hhw.3
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (hhw.this.getFrame() < i4 - 1 || hhw.this.getFrame() >= i4 + 2) {
                            return;
                        }
                        Log.i("TMe", "--==--- enter timer point, frame: " + hhw.this.getFrame());
                        hhw.this.fs(this);
                        if (i3 >= 0 && i5 >= 0) {
                            Log.i("TMe", "--==--- enter timer callback, start timer");
                            hhw.this.cn();
                        } else {
                            Log.i("TMe", "--==--- enter timer callback, NOT start timer");
                        }
                        hhw.this.hhw();
                    }
                });
                return;
            }
            return;
        }
        Log.i("TMe", "--==--- timer fail, id is invalid: " + zg.fs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cn() {
        this.olo.postDelayed(this.zak, 1000L);
    }

    private void cyb() {
        this.olo.removeCallbacksAndMessages(null);
    }

    public void setComposition(nps npsVar) {
        if (btk.zmn) {
            Log.v(zmn, "Set Composition \n".concat(String.valueOf(npsVar)));
        }
        this.nps.setCallback(this);
        this.cyb = npsVar;
        this.iv = true;
        boolean zmn2 = this.nps.zmn(npsVar, getContext().getApplicationContext());
        this.iv = false;
        if (getDrawable() != this.nps || zmn2) {
            if (!zmn2) {
                kgc();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<Object> it = this.rt.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public nps getComposition() {
        return this.cyb;
    }

    public void zmn() {
        if (this.iqz == 0) {
            this.iqz = SystemClock.elapsedRealtime();
        }
        this.mw.add(fb.PLAY_OPTION);
        this.nps.rc();
    }

    public void setMinFrame(int i) {
        this.nps.zmn(i);
    }

    public float getMinFrame() {
        return this.nps.rt();
    }

    public void setMinProgress(float f) {
        this.nps.zmn(f);
    }

    public void setMaxFrame(int i) {
        this.nps.fs(i);
    }

    public float getMaxFrame() {
        return this.nps.cn();
    }

    public void setMaxProgress(float f) {
        this.nps.fs(f);
    }

    public void setMinFrame(String str) {
        this.nps.fs(str);
    }

    public void setMaxFrame(String str) {
        this.nps.zn(str);
    }

    public void setMinAndMaxFrame(String str) {
        this.nps.fb(str);
    }

    public void setSpeed(float f) {
        this.nps.zn(f);
    }

    public float getSpeed() {
        return this.nps.cyb();
    }

    public void zmn(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.nps.zmn(animatorUpdateListener);
    }

    public void fs(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.nps.fs(animatorUpdateListener);
    }

    public void fs() {
        this.nps.olo();
    }

    public void zmn(Animator.AnimatorListener animatorListener) {
        this.nps.zmn(animatorListener);
    }

    public void fs(Animator.AnimatorListener animatorListener) {
        this.nps.fs(animatorListener);
    }

    public void zn() {
        this.nps.kgc();
    }

    public void zmn(boolean z) {
        this.nps.btk(z ? -1 : 0);
    }

    public void setRepeatMode(int i) {
        this.mw.add(fb.SET_REPEAT_MODE);
        this.nps.fb(i);
    }

    public int getRepeatMode() {
        return this.nps.iqz();
    }

    public void setRepeatCount(int i) {
        this.mw.add(fb.SET_REPEAT_COUNT);
        this.nps.btk(i);
    }

    public int getRepeatCount() {
        return this.nps.phc();
    }

    public boolean fb() {
        return this.nps.doe();
    }

    public void setImageAssetsFolder(String str) {
        this.nps.zmn(str);
    }

    public String getImageAssetsFolder() {
        return this.nps.fb();
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.nps.fs(z);
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.nps.btk();
    }

    public Bitmap zmn(String str, Bitmap bitmap) {
        return this.nps.zmn(str, bitmap);
    }

    public void setImageAssetDelegate(com.bytedance.adsdk.fs.fb fbVar) {
        this.nps.zmn(fbVar);
    }

    public void setDefaultFontFileExtension(String str) {
        this.nps.nps(str);
    }

    public void setFontAssetDelegate(com.bytedance.adsdk.fs.zn znVar) {
        this.nps.zmn(znVar);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.nps.zmn(map);
    }

    public void setTextDelegate(iqz iqzVar) {
        this.nps.zmn(iqzVar);
    }

    public void btk() {
        this.mw.add(fb.PLAY_OPTION);
        this.nps.kjb();
    }

    public void hhw() {
        this.rc = false;
        this.nps.zak();
    }

    public void setFrame(int i) {
        this.nps.zn(i);
    }

    public int getFrame() {
        return this.nps.kw();
    }

    public void setProgress(float f) {
        zmn(f, true);
    }

    private void zmn(float f, boolean z) {
        if (z) {
            this.mw.add(fb.SET_PROGRESS);
        }
        this.nps.fb(f);
    }

    public float getProgress() {
        return this.nps.am();
    }

    public long getDuration() {
        nps npsVar = this.cyb;
        if (npsVar != null) {
            return (long) npsVar.btk();
        }
        return 0L;
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.nps.zn(z);
    }

    public kgc getPerformanceTracker() {
        return this.nps.zg();
    }

    private void olo() {
        this.cyb = null;
        this.nps.iv();
    }

    public void setSafeMode(boolean z) {
        this.nps.hhw(z);
    }

    public void setRenderMode(kw kwVar) {
        this.nps.zmn(kwVar);
    }

    public kw getRenderMode() {
        return this.nps.hhw();
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.nps.btk(z);
    }

    private void kgc() {
        boolean fb2 = fb();
        setImageDrawable(null);
        setImageDrawable(this.nps);
        if (fb2) {
            this.nps.mw();
        }
    }

    private static class zn extends View.BaseSavedState {
        public static final Parcelable.Creator<zn> CREATOR = new Parcelable.Creator<zn>() { // from class: com.bytedance.adsdk.fs.hhw.zn.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
            public zn createFromParcel(Parcel parcel) {
                return new zn(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
            public zn[] newArray(int i) {
                return new zn[i];
            }
        };
        String btk;
        boolean fb;
        int fs;
        int hhw;
        int nps;
        String zmn;
        float zn;

        zn(Parcelable parcelable) {
            super(parcelable);
        }

        private zn(Parcel parcel) {
            super(parcel);
            this.zmn = parcel.readString();
            this.zn = parcel.readFloat();
            this.fb = parcel.readInt() == 1;
            this.btk = parcel.readString();
            this.hhw = parcel.readInt();
            this.nps = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.zmn);
            parcel.writeFloat(this.zn);
            parcel.writeInt(this.fb ? 1 : 0);
            parcel.writeString(this.btk);
            parcel.writeInt(this.hhw);
            parcel.writeInt(this.nps);
        }
    }

    public void setLottieClicklistener(fs fsVar) {
        this.am = fsVar;
    }

    public void setLottieAnimListener(zmn zmnVar) {
        this.yj = zmnVar;
    }
}
