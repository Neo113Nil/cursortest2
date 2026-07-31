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
import com.startapp.sdk.internal.a3;
import com.startapp.sdk.internal.e2;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class CloseableLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final int f79a;
    private a3 b;
    private final BitmapDrawable c;
    private ClosePosition d;
    private final int e;
    private final int f;
    private final int g;
    private boolean h;
    private final Rect i;
    private final Rect j;
    private final Rect k;
    private final Rect l;
    private boolean m;
    private e n;

    public CloseableLayout(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.h) {
            this.h = false;
            this.i.set(0, 0, getWidth(), getHeight());
            ClosePosition closePosition = this.d;
            Rect rect = this.i;
            Rect rect2 = this.j;
            int i = this.e;
            Gravity.apply(closePosition.a(), i, i, rect, rect2);
            this.l.set(this.j);
            Rect rect3 = this.l;
            int i2 = this.g;
            rect3.inset(i2, i2);
            ClosePosition closePosition2 = this.d;
            Rect rect4 = this.l;
            Rect rect5 = this.k;
            int i3 = this.f;
            Gravity.apply(closePosition2.a(), i3, i3, rect4, rect5);
            this.c.setBounds(this.k);
        }
        if (this.c.isVisible()) {
            this.c.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        Rect rect = this.j;
        return x >= rect.left && y >= rect.top && x < rect.right && y < rect.bottom;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.h = true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int i = this.f79a;
        Rect rect = this.j;
        if (x < rect.left - i || y < rect.top - i || x >= rect.right + i || y >= rect.bottom + i || !(this.m || this.c.isVisible())) {
            a(false);
            super.onTouchEvent(motionEvent);
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            a(true);
        } else if (action != 1) {
            if (action == 3) {
                a(false);
            }
        } else if (this.c.getState() == FrameLayout.SELECTED_STATE_SET) {
            if (this.n == null) {
                this.n = new e(this);
            }
            postDelayed(this.n, ViewConfiguration.getPressedStateDuration());
            playSoundEffect(0);
            a3 a3Var = this.b;
            if (a3Var != null) {
                a3Var.a();
            }
        }
        return true;
    }

    public void setCloseAlwaysInteractable(boolean z) {
        this.m = z;
    }

    public void setCloseBoundChanged(boolean z) {
        this.h = z;
    }

    public void setCloseBounds(Rect rect) {
        this.j.set(rect);
    }

    public void setClosePosition(ClosePosition closePosition) {
        this.d = closePosition;
        this.h = true;
        invalidate();
    }

    public void setCloseVisible(boolean z) {
        if (this.c.setVisible(z, false)) {
            invalidate(this.j);
        }
    }

    public void setOnCloseListener(a3 a3Var) {
        this.b = a3Var;
    }

    public CloseableLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(ClosePosition closePosition, Rect rect, Rect rect2) {
        int i = this.e;
        Gravity.apply(closePosition.a(), i, i, rect, rect2);
    }

    public CloseableLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new Rect();
        this.j = new Rect();
        this.k = new Rect();
        this.l = new Rect();
        BitmapDrawable a2 = e2.a(context.getResources());
        this.c = a2;
        this.d = ClosePosition.TOP_RIGHT;
        a2.setState(FrameLayout.EMPTY_STATE_SET);
        a2.setCallback(this);
        this.f79a = ViewConfiguration.get(context).getScaledTouchSlop();
        this.e = Math.round(TypedValue.applyDimension(1, 50.0f, context.getResources().getDisplayMetrics()));
        this.f = Math.round(TypedValue.applyDimension(1, 30.0f, context.getResources().getDisplayMetrics()));
        this.g = Math.round(TypedValue.applyDimension(1, 8.0f, context.getResources().getDisplayMetrics()));
        setWillNotDraw(false);
        this.m = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        int[] state = this.c.getState();
        int[] iArr = FrameLayout.SELECTED_STATE_SET;
        if (z == (state == iArr)) {
            return;
        }
        BitmapDrawable bitmapDrawable = this.c;
        if (!z) {
            iArr = FrameLayout.EMPTY_STATE_SET;
        }
        bitmapDrawable.setState(iArr);
        invalidate(this.j);
    }

    public final boolean a() {
        return this.c.isVisible();
    }

    /* compiled from: Sta */
    public enum ClosePosition {
        TOP_LEFT(51),
        TOP_CENTER(49),
        TOP_RIGHT(53),
        CENTER(17),
        BOTTOM_LEFT(83),
        BOTTOM_CENTER(81),
        BOTTOM_RIGHT(85);

        private final int mGravity;

        ClosePosition(int i) {
            this.mGravity = i;
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
