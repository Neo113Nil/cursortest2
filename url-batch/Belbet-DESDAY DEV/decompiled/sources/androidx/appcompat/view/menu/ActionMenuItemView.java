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
import k.AbstractC0147c;
import k.C0146b;
import k.C0159o;
import k.InterfaceC0156l;
import k.InterfaceC0170z;
import k.MenuC0157m;
import l.C0229d0;
import l.InterfaceC0246m;
import l.e1;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0229d0 implements InterfaceC0170z, View.OnClickListener, InterfaceC0246m {
    public C0159o h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f1108j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0156l f1109k;

    /* renamed from: l, reason: collision with root package name */
    public C0146b f1110l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC0147c f1111m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1112n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1113o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1114p;

    /* renamed from: q, reason: collision with root package name */
    public int f1115q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1116r;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f1112n = h();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1926c, 0, 0);
        this.f1114p = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f1116r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1115q = -1;
        setSaveEnabled(false);
    }

    @Override // k.InterfaceC0170z
    public final void a(C0159o c0159o) {
        this.h = c0159o;
        setIcon(c0159o.getIcon());
        setTitle(c0159o.getTitleCondensed());
        setId(c0159o.f2713a);
        setVisibility(c0159o.isVisible() ? 0 : 8);
        setEnabled(c0159o.isEnabled());
        if (c0159o.hasSubMenu() && this.f1110l == null) {
            this.f1110l = new C0146b(this);
        }
    }

    @Override // l.InterfaceC0246m
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.h.getIcon() == null;
    }

    @Override // l.InterfaceC0246m
    public final boolean c() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // k.InterfaceC0170z
    public C0159o getItemData() {
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
        if (this.f1108j != null && ((this.h.f2734y & 4) != 4 || (!this.f1112n && !this.f1113o))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.i : null);
        CharSequence charSequence = this.h.f2726q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.h.f2716e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.h.f2727r;
        if (TextUtils.isEmpty(charSequence2)) {
            e1.a(this, z4 ? null : this.h.f2716e);
        } else {
            e1.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0156l interfaceC0156l = this.f1109k;
        if (interfaceC0156l != null) {
            interfaceC0156l.b(this.h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1112n = h();
        i();
    }

    @Override // l.C0229d0, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i3 = this.f1115q) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f1114p;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!isEmpty || this.f1108j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1108j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0146b c0146b;
        if (this.h.hasSubMenu() && (c0146b = this.f1110l) != null && c0146b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f1113o != z2) {
            this.f1113o = z2;
            C0159o c0159o = this.h;
            if (c0159o != null) {
                MenuC0157m menuC0157m = c0159o.f2723n;
                menuC0157m.f2693k = true;
                menuC0157m.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1108j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f1116r;
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

    public void setItemInvoker(InterfaceC0156l interfaceC0156l) {
        this.f1109k = interfaceC0156l;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f1115q = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0147c abstractC0147c) {
        this.f1111m = abstractC0147c;
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        i();
    }
}
