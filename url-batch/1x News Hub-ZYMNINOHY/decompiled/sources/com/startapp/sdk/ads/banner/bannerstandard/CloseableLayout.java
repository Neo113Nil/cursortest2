package com.startapp.sdk.ads.banner.bannerstandard;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.startapp.sdk.internal.f3;
import com.startapp.sdk.internal.k2;

/* loaded from: classes.dex */
public class CloseableLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final int f3017a;

    /* renamed from: b, reason: collision with root package name */
    private f3 f3018b;

    /* renamed from: c, reason: collision with root package name */
    private final BitmapDrawable f3019c;

    /* renamed from: d, reason: collision with root package name */
    private ClosePosition f3020d;

    /* renamed from: e, reason: collision with root package name */
    private final int f3021e;
    private final int f;

    /* renamed from: g, reason: collision with root package name */
    private final int f3022g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f3023h;

    /* renamed from: i, reason: collision with root package name */
    private final Rect f3024i;

    /* renamed from: j, reason: collision with root package name */
    private final Rect f3025j;

    /* renamed from: k, reason: collision with root package name */
    private final Rect f3026k;

    /* renamed from: l, reason: collision with root package name */
    private final Rect f3027l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f3028m;

    /* renamed from: n, reason: collision with root package name */
    private f f3029n;

    public CloseableLayout(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f3023h) {
            this.f3023h = false;
            this.f3024i.set(0, 0, getWidth(), getHeight());
            ClosePosition closePosition = this.f3020d;
            Rect rect = this.f3024i;
            Rect rect2 = this.f3025j;
            int i3 = this.f3021e;
            Gravity.apply(closePosition.a(), i3, i3, rect, rect2);
            this.f3027l.set(this.f3025j);
            Rect rect3 = this.f3027l;
            int i4 = this.f3022g;
            rect3.inset(i4, i4);
            ClosePosition closePosition2 = this.f3020d;
            Rect rect4 = this.f3027l;
            Rect rect5 = this.f3026k;
            int i5 = this.f;
            Gravity.apply(closePosition2.a(), i5, i5, rect4, rect5);
            this.f3019c.setBounds(this.f3026k);
        }
        if (this.f3019c.isVisible()) {
            this.f3019c.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        int x3 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        Rect rect = this.f3025j;
        return x3 >= rect.left && y3 >= rect.top && x3 < rect.right && y3 < rect.bottom;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        this.f3023h = true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int x3 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int i3 = this.f3017a;
        Rect rect = this.f3025j;
        if (x3 < rect.left - i3 || y3 < rect.top - i3 || x3 >= rect.right + i3 || y3 >= rect.bottom + i3 || !(this.f3028m || this.f3019c.isVisible())) {
            a(false);
            super.onTouchEvent(motionEvent);
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            a(true);
            return true;
        }
        if (action != 1) {
            if (action == 3) {
                a(false);
                return true;
            }
        } else if (this.f3019c.getState() == FrameLayout.SELECTED_STATE_SET) {
            if (this.f3029n == null) {
                this.f3029n = new f(this);
            }
            postDelayed(this.f3029n, ViewConfiguration.getPressedStateDuration());
            playSoundEffect(0);
            f3 f3Var = this.f3018b;
            if (f3Var != null) {
                f3Var.a();
            }
        }
        return true;
    }

    public void setCloseAlwaysInteractable(boolean z) {
        this.f3028m = z;
    }

    public void setCloseBoundChanged(boolean z) {
        this.f3023h = z;
    }

    public void setCloseBounds(Rect rect) {
        this.f3025j.set(rect);
    }

    public void setClosePosition(ClosePosition closePosition) {
        this.f3020d = closePosition;
        this.f3023h = true;
        invalidate();
    }

    public void setCloseVisible(boolean z) {
        if (this.f3019c.setVisible(z, false)) {
            invalidate(this.f3025j);
        }
    }

    public void setOnCloseListener(f3 f3Var) {
        this.f3018b = f3Var;
    }

    public CloseableLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(ClosePosition closePosition, Rect rect, Rect rect2) {
        int i3 = this.f3021e;
        Gravity.apply(closePosition.a(), i3, i3, rect, rect2);
    }

    public CloseableLayout(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f3024i = new Rect();
        this.f3025j = new Rect();
        this.f3026k = new Rect();
        this.f3027l = new Rect();
        BitmapDrawable a3 = k2.a(context.getResources());
        this.f3019c = a3;
        this.f3020d = ClosePosition.TOP_RIGHT;
        a3.setState(FrameLayout.EMPTY_STATE_SET);
        a3.setCallback(this);
        this.f3017a = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f3021e = Math.round(TypedValue.applyDimension(1, 50, context.getResources().getDisplayMetrics()));
        this.f = Math.round(TypedValue.applyDimension(1, 30, context.getResources().getDisplayMetrics()));
        this.f3022g = Math.round(TypedValue.applyDimension(1, 8, context.getResources().getDisplayMetrics()));
        setWillNotDraw(false);
        this.f3028m = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        int[] state = this.f3019c.getState();
        int[] iArr = FrameLayout.SELECTED_STATE_SET;
        if (z == (state == iArr)) {
            return;
        }
        BitmapDrawable bitmapDrawable = this.f3019c;
        if (!z) {
            iArr = FrameLayout.EMPTY_STATE_SET;
        }
        bitmapDrawable.setState(iArr);
        invalidate(this.f3025j);
    }

    public final boolean a() {
        return this.f3019c.isVisible();
    }

    public enum ClosePosition {
        TOP_LEFT(51),
        TOP_CENTER(49),
        TOP_RIGHT(53),
        CENTER(17),
        BOTTOM_LEFT(83),
        BOTTOM_CENTER(81),
        BOTTOM_RIGHT(85);

        private final int mGravity;

        ClosePosition(int i3) {
            this.mGravity = i3;
        }

        public static ClosePosition a(String str) {
            ClosePosition closePosition = TOP_RIGHT;
            if (!TextUtils.isEmpty(str)) {
                if (str.equals("top-left")) {
                    return TOP_LEFT;
                }
                if (!str.equals("top-right")) {
                    if (str.equals("center")) {
                        return CENTER;
                    }
                    if (str.equals("bottom-left")) {
                        return BOTTOM_LEFT;
                    }
                    if (str.equals("bottom-right")) {
                        return BOTTOM_RIGHT;
                    }
                    if (str.equals("top-center")) {
                        return TOP_CENTER;
                    }
                    if (str.equals("bottom-center")) {
                        return BOTTOM_CENTER;
                    }
                    throw new IllegalArgumentException(str);
                }
            }
            return closePosition;
        }

        public final int a() {
            return this.mGravity;
        }
    }
}
