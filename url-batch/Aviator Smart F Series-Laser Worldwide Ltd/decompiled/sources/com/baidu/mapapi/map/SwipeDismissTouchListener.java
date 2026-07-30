package com.baidu.mapapi.map;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public class SwipeDismissTouchListener implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    private int f6247a;

    /* renamed from: b, reason: collision with root package name */
    private int f6248b;

    /* renamed from: c, reason: collision with root package name */
    private int f6249c;

    /* renamed from: d, reason: collision with root package name */
    private long f6250d;

    /* renamed from: e, reason: collision with root package name */
    private View f6251e;

    /* renamed from: f, reason: collision with root package name */
    private DismissCallbacks f6252f;

    /* renamed from: g, reason: collision with root package name */
    private int f6253g = 1;

    /* renamed from: h, reason: collision with root package name */
    private float f6254h;

    /* renamed from: i, reason: collision with root package name */
    private float f6255i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f6256j;

    /* renamed from: k, reason: collision with root package name */
    private int f6257k;

    /* renamed from: l, reason: collision with root package name */
    private Object f6258l;

    /* renamed from: m, reason: collision with root package name */
    private VelocityTracker f6259m;

    /* renamed from: n, reason: collision with root package name */
    private float f6260n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f6261o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f6262p;

    public interface DismissCallbacks {
        boolean canDismiss(Object obj);

        void onDismiss(View view, Object obj);

        void onNotify();
    }

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SwipeDismissTouchListener.this.a();
        }
    }

    class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup.LayoutParams f6264a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6265b;

        b(ViewGroup.LayoutParams layoutParams, int i8) {
            this.f6264a = layoutParams;
            this.f6265b = i8;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SwipeDismissTouchListener.this.f6252f.onDismiss(SwipeDismissTouchListener.this.f6251e, SwipeDismissTouchListener.this.f6258l);
            SwipeDismissTouchListener.this.f6251e.setTranslationX(0.0f);
            this.f6264a.height = this.f6265b;
            SwipeDismissTouchListener.this.f6251e.setLayoutParams(this.f6264a);
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup.LayoutParams f6267a;

        c(ViewGroup.LayoutParams layoutParams) {
            this.f6267a = layoutParams;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f6267a.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            SwipeDismissTouchListener.this.f6251e.setLayoutParams(this.f6267a);
        }
    }

    public SwipeDismissTouchListener(View view, Object obj, DismissCallbacks dismissCallbacks) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.f6247a = viewConfiguration.getScaledTouchSlop();
        this.f6248b = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f6249c = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f6250d = view.getContext().getResources().getInteger(R.integer.config_shortAnimTime);
        this.f6251e = view;
        view.getContext();
        this.f6258l = obj;
        this.f6252f = dismissCallbacks;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0121, code lost:
    
        if (r10 > 0.0f) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x015c, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015a, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0158, code lost:
    
        if (r9.f6259m.getXVelocity() > 0.0f) goto L73;
     */
    @Override // android.view.View.OnTouchListener
    @TargetApi(12)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z7;
        motionEvent.offsetLocation(this.f6260n, 0.0f);
        if (this.f6253g < 2) {
            this.f6253g = this.f6251e.getWidth();
        }
        int actionMasked = motionEvent.getActionMasked();
        boolean z8 = true;
        if (actionMasked == 0) {
            this.f6254h = motionEvent.getRawX();
            this.f6255i = motionEvent.getRawY();
            if (this.f6252f.canDismiss(this.f6258l)) {
                this.f6261o = false;
                VelocityTracker obtain = VelocityTracker.obtain();
                this.f6259m = obtain;
                obtain.addMovement(motionEvent);
            }
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                VelocityTracker velocityTracker = this.f6259m;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                    float rawX = motionEvent.getRawX() - this.f6254h;
                    float rawY = motionEvent.getRawY() - this.f6255i;
                    if (Math.abs(rawX) > this.f6247a && Math.abs(rawY) < Math.abs(rawX) / 2.0f) {
                        this.f6256j = true;
                        this.f6257k = rawX > 0.0f ? this.f6247a : -this.f6247a;
                        this.f6251e.getParent().requestDisallowInterceptTouchEvent(true);
                        if (!this.f6261o) {
                            this.f6261o = true;
                            this.f6252f.onNotify();
                        }
                        if (Math.abs(rawX) <= this.f6253g / 3) {
                            this.f6262p = false;
                        } else if (!this.f6262p) {
                            this.f6262p = true;
                            this.f6252f.onNotify();
                        }
                        MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                        obtain2.setAction((motionEvent.getActionIndex() << 8) | 3);
                        this.f6251e.onTouchEvent(obtain2);
                        obtain2.recycle();
                    }
                    if (this.f6256j) {
                        this.f6260n = rawX;
                        this.f6251e.setTranslationX(rawX - this.f6257k);
                        return true;
                    }
                }
            } else if (actionMasked == 3 && this.f6259m != null) {
                this.f6251e.animate().translationX(0.0f).setDuration(this.f6250d).setListener(null);
                this.f6259m.recycle();
                this.f6259m = null;
                this.f6260n = 0.0f;
                this.f6254h = 0.0f;
                this.f6255i = 0.0f;
                this.f6256j = false;
            }
        } else if (this.f6259m != null) {
            float rawX2 = motionEvent.getRawX() - this.f6254h;
            this.f6259m.addMovement(motionEvent);
            this.f6259m.computeCurrentVelocity(1000);
            float xVelocity = this.f6259m.getXVelocity();
            float abs = Math.abs(xVelocity);
            float abs2 = Math.abs(this.f6259m.getYVelocity());
            if (Math.abs(rawX2) <= this.f6253g / 3 || !this.f6256j) {
                if (this.f6248b > abs || abs > this.f6249c || abs2 >= abs || abs2 >= abs || !this.f6256j) {
                    z7 = false;
                    z8 = false;
                } else {
                    z8 = ((xVelocity > 0.0f ? 1 : (xVelocity == 0.0f ? 0 : -1)) < 0) == ((rawX2 > 0.0f ? 1 : (rawX2 == 0.0f ? 0 : -1)) < 0);
                }
            }
            if (z8) {
                this.f6251e.animate().translationX(z7 ? this.f6253g : -this.f6253g).setDuration(this.f6250d).setListener(new a());
            } else if (this.f6256j) {
                this.f6251e.animate().translationX(0.0f).setDuration(this.f6250d).setListener(null);
            }
            this.f6259m.recycle();
            this.f6259m = null;
            this.f6260n = 0.0f;
            this.f6254h = 0.0f;
            this.f6255i = 0.0f;
            this.f6256j = false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(11)
    public void a() {
        ViewGroup.LayoutParams layoutParams = this.f6251e.getLayoutParams();
        int height = this.f6251e.getHeight();
        ValueAnimator duration = ValueAnimator.ofInt(height, 1).setDuration(this.f6250d);
        duration.addListener(new b(layoutParams, height));
        duration.addUpdateListener(new c(layoutParams));
        duration.start();
    }
}
