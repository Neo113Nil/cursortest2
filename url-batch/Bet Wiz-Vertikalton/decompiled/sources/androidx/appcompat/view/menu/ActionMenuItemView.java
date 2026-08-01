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
import k.AbstractC0150c;
import k.C0149b;
import k.C0162o;
import k.InterfaceC0159l;
import k.InterfaceC0173z;
import k.MenuC0160m;
import l.C0210c0;
import l.InterfaceC0227l;
import l.e1;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0210c0 implements InterfaceC0173z, View.OnClickListener, InterfaceC0227l {
    public C0162o h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f1213j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0159l f1214k;

    /* renamed from: l, reason: collision with root package name */
    public C0149b f1215l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC0150c f1216m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1217n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1218o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1219p;

    /* renamed from: q, reason: collision with root package name */
    public int f1220q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1221r;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f1217n = h();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2059c, 0, 0);
        this.f1219p = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f1221r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1220q = -1;
        setSaveEnabled(false);
    }

    @Override // k.InterfaceC0173z
    public final void a(C0162o c0162o) {
        this.h = c0162o;
        setIcon(c0162o.getIcon());
        setTitle(c0162o.getTitleCondensed());
        setId(c0162o.f2688a);
        setVisibility(c0162o.isVisible() ? 0 : 8);
        setEnabled(c0162o.isEnabled());
        if (c0162o.hasSubMenu() && this.f1215l == null) {
            this.f1215l = new C0149b(this);
        }
    }

    @Override // l.InterfaceC0227l
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.h.getIcon() == null;
    }

    @Override // l.InterfaceC0227l
    public final boolean c() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // k.InterfaceC0173z
    public C0162o getItemData() {
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
        if (this.f1213j != null && ((this.h.f2709y & 4) != 4 || (!this.f1217n && !this.f1218o))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.i : null);
        CharSequence charSequence = this.h.f2701q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.h.f2691e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.h.f2702r;
        if (TextUtils.isEmpty(charSequence2)) {
            e1.a(this, z4 ? null : this.h.f2691e);
        } else {
            e1.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0159l interfaceC0159l = this.f1214k;
        if (interfaceC0159l != null) {
            interfaceC0159l.b(this.h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1217n = h();
        i();
    }

    @Override // l.C0210c0, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i3 = this.f1220q) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f1219p;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!isEmpty || this.f1213j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1213j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0149b c0149b;
        if (this.h.hasSubMenu() && (c0149b = this.f1215l) != null && c0149b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f1218o != z2) {
            this.f1218o = z2;
            C0162o c0162o = this.h;
            if (c0162o != null) {
                MenuC0160m menuC0160m = c0162o.f2698n;
                menuC0160m.f2668k = true;
                menuC0160m.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1213j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f1221r;
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

    public void setItemInvoker(InterfaceC0159l interfaceC0159l) {
        this.f1214k = interfaceC0159l;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f1220q = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0150c abstractC0150c) {
        this.f1216m = abstractC0150c;
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        i();
    }
}
