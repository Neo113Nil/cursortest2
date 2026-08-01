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
import g.AbstractC0122a;
import m.AbstractC0219c;
import m.C0218b;
import m.C0231o;
import m.InterfaceC0228l;
import m.InterfaceC0242z;
import m.MenuC0229m;
import n.C0267c0;
import n.InterfaceC0284l;
import n.j1;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0267c0 implements InterfaceC0242z, View.OnClickListener, InterfaceC0284l {

    /* renamed from: h, reason: collision with root package name */
    public C0231o f1676h;
    public CharSequence i;
    public Drawable j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0228l f1677k;

    /* renamed from: l, reason: collision with root package name */
    public C0218b f1678l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC0219c f1679m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1680n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1681o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1682p;

    /* renamed from: q, reason: collision with root package name */
    public int f1683q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1684r;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f1680n = h();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0122a.f2697c, 0, 0);
        this.f1682p = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f1684r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1683q = -1;
        setSaveEnabled(false);
    }

    @Override // m.InterfaceC0242z
    public final void a(C0231o c0231o) {
        this.f1676h = c0231o;
        setIcon(c0231o.getIcon());
        setTitle(c0231o.getTitleCondensed());
        setId(c0231o.f3375a);
        setVisibility(c0231o.isVisible() ? 0 : 8);
        setEnabled(c0231o.isEnabled());
        if (c0231o.hasSubMenu() && this.f1678l == null) {
            this.f1678l = new C0218b(this);
        }
    }

    @Override // n.InterfaceC0284l
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.f1676h.getIcon() == null;
    }

    @Override // n.InterfaceC0284l
    public final boolean c() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // m.InterfaceC0242z
    public C0231o getItemData() {
        return this.f1676h;
    }

    public final boolean h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void i() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.i);
        if (this.j != null && ((this.f1676h.f3396y & 4) != 4 || (!this.f1680n && !this.f1681o))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.i : null);
        CharSequence charSequence = this.f1676h.f3388q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.f1676h.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f1676h.f3389r;
        if (TextUtils.isEmpty(charSequence2)) {
            j1.a(this, z4 ? null : this.f1676h.e);
        } else {
            j1.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0228l interfaceC0228l = this.f1677k;
        if (interfaceC0228l != null) {
            interfaceC0228l.c(this.f1676h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1680n = h();
        i();
    }

    @Override // n.C0267c0, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i3 = this.f1683q) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f1682p;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!isEmpty || this.j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0218b c0218b;
        if (this.f1676h.hasSubMenu() && (c0218b = this.f1678l) != null && c0218b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f1681o != z2) {
            this.f1681o = z2;
            C0231o c0231o = this.f1676h;
            if (c0231o != null) {
                MenuC0229m menuC0229m = c0231o.f3385n;
                menuC0229m.f3355k = true;
                menuC0229m.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f1684r;
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

    public void setItemInvoker(InterfaceC0228l interfaceC0228l) {
        this.f1677k = interfaceC0228l;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f1683q = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0219c abstractC0219c) {
        this.f1679m = abstractC0219c;
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        i();
    }
}
