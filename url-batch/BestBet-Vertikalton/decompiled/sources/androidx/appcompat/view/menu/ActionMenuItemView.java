package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import f.a;
import k.AbstractC0179c;
import k.C0178b;
import k.C0192p;
import k.InterfaceC0171A;
import k.InterfaceC0188l;
import k.MenuC0189m;
import l.C0223a0;
import l.InterfaceC0244l;
import l.d1;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0223a0 implements InterfaceC0171A, View.OnClickListener, InterfaceC0244l {
    public C0192p h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f1631j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0188l f1632k;

    /* renamed from: l, reason: collision with root package name */
    public C0178b f1633l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC0179c f1634m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1635n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1636o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1637p;

    /* renamed from: q, reason: collision with root package name */
    public int f1638q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1639r;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f1635n = h();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2516c, 0, 0);
        this.f1637p = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f1639r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1638q = -1;
        setSaveEnabled(false);
    }

    @Override // k.InterfaceC0171A
    public final void a(C0192p c0192p) {
        this.h = c0192p;
        setIcon(c0192p.getIcon());
        setTitle(c0192p.getTitleCondensed());
        setId(c0192p.f3191a);
        setVisibility(c0192p.isVisible() ? 0 : 8);
        setEnabled(c0192p.isEnabled());
        if (c0192p.hasSubMenu() && this.f1633l == null) {
            this.f1633l = new C0178b(this);
        }
    }

    @Override // l.InterfaceC0244l
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.h.getIcon() == null;
    }

    @Override // l.InterfaceC0244l
    public final boolean c() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // k.InterfaceC0171A
    public C0192p getItemData() {
        return this.h;
    }

    public final boolean h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void i() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.i);
        if (this.f1631j != null && ((this.h.f3212y & 4) != 4 || (!this.f1635n && !this.f1636o))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.i : null);
        CharSequence charSequence = this.h.f3204q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.h.f3194e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.h.f3205r;
        if (TextUtils.isEmpty(charSequence2)) {
            d1.a(this, z4 ? null : this.h.f3194e);
        } else {
            d1.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0188l interfaceC0188l = this.f1632k;
        if (interfaceC0188l != null) {
            interfaceC0188l.b(this.h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1635n = h();
        i();
    }

    @Override // l.C0223a0, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i3 = this.f1638q) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f1637p;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!isEmpty || this.f1631j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1631j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0178b c0178b;
        if (this.h.hasSubMenu() && (c0178b = this.f1633l) != null && c0178b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f1636o != z2) {
            this.f1636o = z2;
            C0192p c0192p = this.h;
            if (c0192p != null) {
                MenuC0189m menuC0189m = c0192p.f3201n;
                menuC0189m.f3170k = true;
                menuC0189m.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1631j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f1639r;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        i();
    }

    public void setItemInvoker(InterfaceC0188l interfaceC0188l) {
        this.f1632k = interfaceC0188l;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f1638q = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0179c abstractC0179c) {
        this.f1634m = abstractC0179c;
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        i();
    }
}
