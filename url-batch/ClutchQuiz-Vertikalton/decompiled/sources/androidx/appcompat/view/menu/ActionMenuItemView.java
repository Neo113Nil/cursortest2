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
import k.AbstractC0157c;
import k.C0156b;
import k.C0169o;
import k.InterfaceC0166l;
import k.InterfaceC0180z;
import k.MenuC0167m;
import l.C0204b0;
import l.InterfaceC0223l;
import l.d1;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0204b0 implements InterfaceC0180z, View.OnClickListener, InterfaceC0223l {
    public C0169o h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f1247j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0166l f1248k;

    /* renamed from: l, reason: collision with root package name */
    public C0156b f1249l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC0157c f1250m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1251n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1252o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1253p;

    /* renamed from: q, reason: collision with root package name */
    public int f1254q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1255r;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f1251n = h();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2111c, 0, 0);
        this.f1253p = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f1255r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1254q = -1;
        setSaveEnabled(false);
    }

    @Override // k.InterfaceC0180z
    public final void a(C0169o c0169o) {
        this.h = c0169o;
        setIcon(c0169o.getIcon());
        setTitle(c0169o.getTitleCondensed());
        setId(c0169o.f2773a);
        setVisibility(c0169o.isVisible() ? 0 : 8);
        setEnabled(c0169o.isEnabled());
        if (c0169o.hasSubMenu() && this.f1249l == null) {
            this.f1249l = new C0156b(this);
        }
    }

    @Override // l.InterfaceC0223l
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.h.getIcon() == null;
    }

    @Override // l.InterfaceC0223l
    public final boolean c() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // k.InterfaceC0180z
    public C0169o getItemData() {
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
        if (this.f1247j != null && ((this.h.f2794y & 4) != 4 || (!this.f1251n && !this.f1252o))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.i : null);
        CharSequence charSequence = this.h.f2786q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.h.f2776e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.h.f2787r;
        if (TextUtils.isEmpty(charSequence2)) {
            d1.a(this, z4 ? null : this.h.f2776e);
        } else {
            d1.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0166l interfaceC0166l = this.f1248k;
        if (interfaceC0166l != null) {
            interfaceC0166l.b(this.h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1251n = h();
        i();
    }

    @Override // l.C0204b0, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i3 = this.f1254q) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f1253p;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!isEmpty || this.f1247j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1247j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0156b c0156b;
        if (this.h.hasSubMenu() && (c0156b = this.f1249l) != null && c0156b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f1252o != z2) {
            this.f1252o = z2;
            C0169o c0169o = this.h;
            if (c0169o != null) {
                MenuC0167m menuC0167m = c0169o.f2783n;
                menuC0167m.f2753k = true;
                menuC0167m.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1247j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f1255r;
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

    public void setItemInvoker(InterfaceC0166l interfaceC0166l) {
        this.f1248k = interfaceC0166l;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f1254q = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0157c abstractC0157c) {
        this.f1250m = abstractC0157c;
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        i();
    }
}
