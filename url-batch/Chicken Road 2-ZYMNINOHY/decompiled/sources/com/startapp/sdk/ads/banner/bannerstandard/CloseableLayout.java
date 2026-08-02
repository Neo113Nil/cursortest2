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
    private final int f6094a;

    /* renamed from: b, reason: collision with root package name */
    private f3 f6095b;

    /* renamed from: c, reason: collision with root package name */
    private final BitmapDrawable f6096c;

    /* renamed from: d, reason: collision with root package name */
    private ClosePosition f6097d;

    /* renamed from: e, reason: collision with root package name */
    private final int f6098e;

    /* renamed from: f, reason: collision with root package name */
    private final int f6099f;

    /* renamed from: g, reason: collision with root package name */
    private final int f6100g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6101h;

    /* renamed from: i, reason: collision with root package name */
    private final Rect f6102i;

    /* renamed from: j, reason: collision with root package name */
    private final Rect f6103j;

    /* renamed from: k, reason: collision with root package name */
    private final Rect f6104k;

    /* renamed from: l, reason: collision with root package name */
    private final Rect f6105l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f6106m;
    private f n;

    public CloseableLayout(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f6101h) {
            this.f6101h = false;
            this.f6102i.set(0, 0, getWidth(), getHeight());
            ClosePosition closePosition = this.f6097d;
            Rect rect = this.f6102i;
            Rect rect2 = this.f6103j;
            int i4 = this.f6098e;
            Gravity.apply(closePosition.a(), i4, i4, rect, rect2);
            this.f6105l.set(this.f6103j);
            Rect rect3 = this.f6105l;
            int i5 = this.f6100g;
            rect3.inset(i5, i5);
            ClosePosition closePosition2 = this.f6097d;
            Rect rect4 = this.f6105l;
            Rect rect5 = this.f6104k;
            int i6 = this.f6099f;
            Gravity.apply(closePosition2.a(), i6, i6, rect4, rect5);
            this.f6096c.setBounds(this.f6104k);
        }
        if (this.f6096c.isVisible()) {
            this.f6096c.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        int x4 = (int) motionEvent.getX();
        int y4 = (int) motionEvent.getY();
        Rect rect = this.f6103j;
        return x4 >= rect.left && y4 >= rect.top && x4 < rect.right && y4 < rect.bottom;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        this.f6101h = true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int x4 = (int) motionEvent.getX();
        int y4 = (int) motionEvent.getY();
        int i4 = this.f6094a;
        Rect rect = this.f6103j;
        if (x4 < rect.left - i4 || y4 < rect.top - i4 || x4 >= rect.right + i4 || y4 >= rect.bottom + i4 || !(this.f6106m || this.f6096c.isVisible())) {
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
        } else if (this.f6096c.getState() == FrameLayout.SELECTED_STATE_SET) {
            if (this.n == null) {
                this.n = new f(this);
            }
            postDelayed(this.n, ViewConfiguration.getPressedStateDuration());
            playSoundEffect(0);
            f3 f3Var = this.f6095b;
            if (f3Var != null) {
                f3Var.a();
            }
        }
        return true;
    }

    public void setCloseAlwaysInteractable(boolean z) {
        this.f6106m = z;
    }

    public void setCloseBoundChanged(boolean z) {
        this.f6101h = z;
    }

    public void setCloseBounds(Rect rect) {
        this.f6103j.set(rect);
    }

    public void setClosePosition(ClosePosition closePosition) {
        this.f6097d = closePosition;
        this.f6101h = true;
        invalidate();
    }

    public void setCloseVisible(boolean z) {
        if (this.f6096c.setVisible(z, false)) {
            invalidate(this.f6103j);
        }
    }

    public void setOnCloseListener(f3 f3Var) {
        this.f6095b = f3Var;
    }

    public CloseableLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(ClosePosition closePosition, Rect rect, Rect rect2) {
        int i4 = this.f6098e;
        Gravity.apply(closePosition.a(), i4, i4, rect, rect2);
    }

    public CloseableLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f6102i = new Rect();
        this.f6103j = new Rect();
        this.f6104k = new Rect();
        this.f6105l = new Rect();
        BitmapDrawable a3 = k2.a(context.getResources());
        this.f6096c = a3;
        this.f6097d = ClosePosition.TOP_RIGHT;
        a3.setState(FrameLayout.EMPTY_STATE_SET);
        a3.setCallback(this);
        this.f6094a = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f6098e = Math.round(TypedValue.applyDimension(1, 50, context.getResources().getDisplayMetrics()));
        this.f6099f = Math.round(TypedValue.applyDimension(1, 30, context.getResources().getDisplayMetrics()));
        this.f6100g = Math.round(TypedValue.applyDimension(1, 8, context.getResources().getDisplayMetrics()));
        setWillNotDraw(false);
        this.f6106m = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        int[] state = this.f6096c.getState();
        int[] iArr = FrameLayout.SELECTED_STATE_SET;
        if (z == (state == iArr)) {
            return;
        }
        BitmapDrawable bitmapDrawable = this.f6096c;
        if (!z) {
            iArr = FrameLayout.EMPTY_STATE_SET;
        }
        bitmapDrawable.setState(iArr);
        invalidate(this.f6103j);
    }

    public final boolean a() {
        return this.f6096c.isVisible();
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

        ClosePosition(int i4) {
            this.mGravity = i4;
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
