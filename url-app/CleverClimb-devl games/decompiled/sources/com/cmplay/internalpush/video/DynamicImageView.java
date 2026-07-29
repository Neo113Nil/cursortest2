package com.cmplay.internalpush.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.cmplay.internalpush.R;
import com.google.android.gms.common.util.CrashUtils;

/* loaded from: classes.dex */
public class DynamicImageView extends ImageView implements View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    private a f4321a;

    /* renamed from: b, reason: collision with root package name */
    private SensorManager f4322b;

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f4323c;

    /* renamed from: d, reason: collision with root package name */
    private final Matrix f4324d;
    private final Matrix e;
    private final RectF f;
    private final float[] g;
    private float h;

    public DynamicImageView(Context context) {
        this(context, null);
    }

    public DynamicImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DynamicImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes;
        this.f4323c = new Matrix();
        this.f4324d = new Matrix();
        this.e = new Matrix();
        this.f = new RectF();
        this.g = new float[9];
        this.h = 0.0f;
        super.setScaleType(ImageView.ScaleType.MATRIX);
        setOnTouchListener(this);
        Resources.Theme theme = getContext().getTheme();
        if (theme == null || (obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, R.styleable.DynamicImageView, i, 0)) == null) {
            return;
        }
        float f = obtainStyledAttributes.getFloat(R.styleable.DynamicImageView_width_aspect, 0.0f);
        float f2 = obtainStyledAttributes.getFloat(R.styleable.DynamicImageView_height_aspect, 0.0f);
        if (f == 0.0f || f2 == 0.0f) {
            return;
        }
        this.h = f / f2;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.h == 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = measuredWidth;
        float f2 = measuredHeight;
        float f3 = (this.h / (f / f2)) - 1.0f;
        if (Math.abs(f3) <= 0.01d) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if ((mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) || (mode == 1073741824 && mode2 == 1073741824)) {
            if (f3 > 0.0f) {
                measuredHeight = (int) (f / this.h);
            } else {
                measuredWidth = (int) (f2 * this.h);
            }
        } else if (mode == 1073741824 || (mode == Integer.MIN_VALUE && mode2 == 0)) {
            measuredHeight = (int) (f / this.h);
        } else if (mode2 != 1073741824 && (mode2 != Integer.MIN_VALUE || mode != 0)) {
            return;
        } else {
            measuredWidth = (int) (f2 * this.h);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, CrashUtils.ErrorDialogData.SUPPRESSED), View.MeasureSpec.makeMeasureSpec(measuredHeight, CrashUtils.ErrorDialogData.SUPPRESSED));
    }

    private void a() {
        super.setScaleType(ImageView.ScaleType.MATRIX);
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float width = getWidth();
        float height = getHeight();
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        float max = Math.max(getWidth() / intrinsicWidth, getHeight() / intrinsicHeight);
        this.f4323c.reset();
        this.f4323c.postScale(max, max);
        this.f4323c.postTranslate((width - (intrinsicWidth * max)) / 2.0f, (height - (intrinsicHeight * max)) / 2.0f);
        d();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f4321a.a(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(16)
    public void a(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, 16L);
        }
    }

    public final float getScale() {
        this.e.getValues(this.g);
        return this.g[0];
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        a();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        Sensor defaultSensor;
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f4321a = new a();
        this.f4321a.a();
        if (isInEditMode()) {
            return;
        }
        this.f4322b = (SensorManager) getContext().getSystemService(com.umeng.commonsdk.proguard.d.aa);
        if (this.f4322b == null || (defaultSensor = this.f4322b.getDefaultSensor(1)) == null) {
            return;
        }
        this.f4322b.registerListener(this.f4321a, defaultSensor, 2);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (this.f4321a != null) {
            this.f4321a.b();
        }
        if (isInEditMode() || this.f4322b == null) {
            return;
        }
        this.f4322b.unregisterListener(this.f4321a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        c();
        setImageMatrix(getDisplayMatrix());
    }

    private void c() {
        RectF a2 = a(getDisplayMatrix());
        if (a2 == null) {
            return;
        }
        float width = getWidth();
        float height = getHeight();
        float f = a2.top > 0.0f ? -a2.top : 0.0f;
        if (a2.bottom < height) {
            f = height - a2.bottom;
        }
        float f2 = a2.left > 0.0f ? -a2.left : 0.0f;
        if (a2.right < width) {
            f2 = width - a2.right;
        }
        this.e.postTranslate(f2, f);
    }

    private RectF a(Matrix matrix) {
        if (getDrawable() == null) {
            return null;
        }
        this.f.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        matrix.mapRect(this.f);
        return this.f;
    }

    private void d() {
        if (this.e == null) {
            return;
        }
        this.e.reset();
        setImageMatrix(getDisplayMatrix());
    }

    protected Matrix getDisplayMatrix() {
        this.f4324d.set(this.f4323c);
        this.f4324d.postConcat(this.e);
        return this.f4324d;
    }

    private class a implements SensorEventListener {

        /* renamed from: a, reason: collision with root package name */
        RunnableC0332a f4325a;

        /* renamed from: c, reason: collision with root package name */
        private VelocityTracker f4327c;

        /* renamed from: d, reason: collision with root package name */
        private float f4328d;
        private float e;
        private float f;
        private float g;
        private float h;
        private boolean i;

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        private a() {
            this.g = 0.0f;
            this.h = 0.0f;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b9, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean a(MotionEvent motionEvent) {
            int pointerCount = motionEvent.getPointerCount();
            float f = 0.0f;
            float f2 = 0.0f;
            for (int i = 0; i < pointerCount; i++) {
                f += motionEvent.getX(i);
                f2 += motionEvent.getY(i);
            }
            float f3 = pointerCount;
            float f4 = f / f3;
            float f5 = f2 / f3;
            if (f3 != this.f) {
                this.i = false;
                if (this.f4327c != null) {
                    this.f4327c.clear();
                }
                this.f4328d = f4;
                this.e = f5;
            }
            this.f = f3;
            switch (motionEvent.getAction()) {
                case 0:
                    if (this.f4327c == null) {
                        this.f4327c = VelocityTracker.obtain();
                    } else {
                        this.f4327c.clear();
                    }
                    this.f4327c.addMovement(motionEvent);
                    this.f4328d = f4;
                    this.e = f5;
                    this.i = false;
                    break;
                case 1:
                case 3:
                    if (this.i) {
                        this.i = false;
                    } else {
                        DynamicImageView.this.performClick();
                    }
                    this.f = 0.0f;
                    if (this.f4327c != null) {
                        this.f4327c.recycle();
                        this.f4327c = null;
                        break;
                    }
                    break;
                case 2:
                    float f6 = f4 - this.f4328d;
                    float f7 = f5 - this.e;
                    if (!this.i) {
                        this.i = Math.sqrt((double) ((f6 * f6) + (f7 * f7))) > 10.0d;
                    }
                    if (this.i) {
                        if (DynamicImageView.this.getDrawable() != null) {
                            DynamicImageView.this.e.postTranslate(f6, f7);
                            DynamicImageView.this.b();
                        }
                        this.f4328d = f4;
                        this.e = f5;
                        if (this.f4327c != null) {
                            this.f4327c.addMovement(motionEvent);
                            break;
                        }
                    }
                    break;
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            this.g = sensorEvent.values[0];
            this.h = sensorEvent.values[1];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            if (this.f4325a == null) {
                this.f4325a = new RunnableC0332a();
                DynamicImageView.this.a(DynamicImageView.this, this.f4325a);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            if (this.f4325a != null) {
                this.f4325a.a();
                DynamicImageView.this.removeCallbacks(this.f4325a);
                this.f4325a = null;
            }
        }

        /* renamed from: com.cmplay.internalpush.video.DynamicImageView$a$a, reason: collision with other inner class name */
        private class RunnableC0332a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            private float f4330b = 0.0f;

            /* renamed from: c, reason: collision with root package name */
            private float f4331c = 0.0f;

            /* renamed from: d, reason: collision with root package name */
            private boolean f4332d = false;
            private float e = 8.0f;
            private float f = 0.1f;
            private float g = 0.5f;
            private float h = 2.0f;

            public RunnableC0332a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                float f;
                float f2;
                if (this.f4332d) {
                    return;
                }
                if (a.this.g - this.f4330b > this.g) {
                    f = this.e;
                    this.f4330b += this.f;
                } else if (a.this.g - this.f4330b < (-this.g)) {
                    f = -this.e;
                    this.f4330b -= this.f;
                } else {
                    f = 0.0f;
                }
                if (a.this.h - this.f4331c > this.g) {
                    f2 = this.e;
                    this.f4331c += this.f;
                } else if (a.this.h - this.f4331c < (-this.g)) {
                    f2 = -this.e;
                    this.f4331c -= this.f;
                } else {
                    f2 = 0.0f;
                }
                if (f == 0.0f && !a.this.i) {
                    if (a.this.g > this.h) {
                        f = this.e;
                    } else if (a.this.g < (-this.h)) {
                        f = -this.e;
                    }
                }
                if (f2 == 0.0f && !a.this.i) {
                    if (a.this.h > this.h) {
                        f2 = this.e;
                    } else if (a.this.h < (-this.h)) {
                        f2 = -this.e;
                    }
                }
                if (d.c(DynamicImageView.this.getContext())) {
                    float f3 = f2;
                    f2 = f;
                    f = f3;
                }
                DynamicImageView.this.e.postTranslate(f, f2);
                DynamicImageView.this.b();
                DynamicImageView.this.a(DynamicImageView.this, this);
            }

            public void a() {
                this.f4332d = true;
            }
        }
    }
}
