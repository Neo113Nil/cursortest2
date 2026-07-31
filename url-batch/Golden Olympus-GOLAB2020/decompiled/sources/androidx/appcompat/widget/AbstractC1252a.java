package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC1281a0;
import androidx.core.view.C1301k0;
import androidx.core.view.InterfaceC1303l0;
import e.AbstractC2405a;

/* renamed from: androidx.appcompat.widget.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC1252a extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    protected final C0079a f10861a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f10862b;

    /* renamed from: c, reason: collision with root package name */
    protected ActionMenuView f10863c;

    /* renamed from: d, reason: collision with root package name */
    protected ActionMenuPresenter f10864d;

    /* renamed from: e, reason: collision with root package name */
    protected int f10865e;

    /* renamed from: f, reason: collision with root package name */
    protected C1301k0 f10866f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f10867g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f10868h;

    /* renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    protected class C0079a implements InterfaceC1303l0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f10869a = false;

        /* renamed from: b, reason: collision with root package name */
        int f10870b;

        protected C0079a() {
        }

        @Override // androidx.core.view.InterfaceC1303l0
        public void a(View view) {
            this.f10869a = true;
        }

        @Override // androidx.core.view.InterfaceC1303l0
        public void b(View view) {
            if (this.f10869a) {
                return;
            }
            AbstractC1252a abstractC1252a = AbstractC1252a.this;
            abstractC1252a.f10866f = null;
            AbstractC1252a.super.setVisibility(this.f10870b);
        }

        @Override // androidx.core.view.InterfaceC1303l0
        public void c(View view) {
            AbstractC1252a.super.setVisibility(0);
            this.f10869a = false;
        }

        public C0079a d(C1301k0 c1301k0, int i4) {
            AbstractC1252a.this.f10866f = c1301k0;
            this.f10870b = i4;
            return this;
        }
    }

    AbstractC1252a(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f10861a = new C0079a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(AbstractC2405a.f36187a, typedValue, true) || typedValue.resourceId == 0) {
            this.f10862b = context;
        } else {
            this.f10862b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int d(int i4, int i5, boolean z4) {
        return z4 ? i4 - i5 : i4 + i5;
    }

    protected int c(View view, int i4, int i5, int i6) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i5);
        return Math.max(0, (i4 - view.getMeasuredWidth()) - i6);
    }

    protected int e(View view, int i4, int i5, int i6, boolean z4) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i7 = i5 + ((i6 - measuredHeight) / 2);
        if (z4) {
            view.layout(i4 - measuredWidth, i7, i4, measuredHeight + i7);
        } else {
            view.layout(i4, i7, i4 + measuredWidth, measuredHeight + i7);
        }
        return z4 ? -measuredWidth : measuredWidth;
    }

    public C1301k0 f(int i4, long j4) {
        C1301k0 c1301k0 = this.f10866f;
        if (c1301k0 != null) {
            c1301k0.c();
        }
        if (i4 != 0) {
            C1301k0 b4 = AbstractC1281a0.e(this).b(0.0f);
            b4.e(j4);
            b4.g(this.f10861a.d(b4, i4));
            return b4;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C1301k0 b5 = AbstractC1281a0.e(this).b(1.0f);
        b5.e(j4);
        b5.g(this.f10861a.d(b5, i4));
        return b5;
    }

    public int getAnimatedVisibility() {
        return this.f10866f != null ? this.f10861a.f10870b : getVisibility();
    }

    public int getContentHeight() {
        return this.f10865e;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, e.j.f36470a, AbstractC2405a.f36189c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(e.j.f36515j, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f10864d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f10868h = false;
        }
        if (!this.f10868h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f10868h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f10868h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f10867g = false;
        }
        if (!this.f10867g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f10867g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f10867g = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i4);

    @Override // android.view.View
    public void setVisibility(int i4) {
        if (i4 != getVisibility()) {
            C1301k0 c1301k0 = this.f10866f;
            if (c1301k0 != null) {
                c1301k0.c();
            }
            super.setVisibility(i4);
        }
    }
}
