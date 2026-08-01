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
import k.AbstractC0190c;
import k.C0189b;
import k.C0202o;
import k.InterfaceC0199l;
import k.InterfaceC0213z;
import k.MenuC0200m;
import l.C0257e0;
import l.InterfaceC0270l;
import l.f1;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0257e0 implements InterfaceC0213z, View.OnClickListener, InterfaceC0270l {
    public C0202o h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f955j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0199l f956k;

    /* renamed from: l, reason: collision with root package name */
    public C0189b f957l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC0190c f958m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f959n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f960o;

    /* renamed from: p, reason: collision with root package name */
    public final int f961p;

    /* renamed from: q, reason: collision with root package name */
    public int f962q;

    /* renamed from: r, reason: collision with root package name */
    public final int f963r;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f959n = h();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2389c, 0, 0);
        this.f961p = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f963r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f962q = -1;
        setSaveEnabled(false);
    }

    @Override // k.InterfaceC0213z
    public final void a(C0202o c0202o) {
        this.h = c0202o;
        setIcon(c0202o.getIcon());
        setTitle(c0202o.getTitleCondensed());
        setId(c0202o.f3085a);
        setVisibility(c0202o.isVisible() ? 0 : 8);
        setEnabled(c0202o.isEnabled());
        if (c0202o.hasSubMenu() && this.f957l == null) {
            this.f957l = new C0189b(this);
        }
    }

    @Override // l.InterfaceC0270l
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.h.getIcon() == null;
    }

    @Override // l.InterfaceC0270l
    public final boolean c() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // k.InterfaceC0213z
    public C0202o getItemData() {
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
        if (this.f955j != null && ((this.h.f3107y & 4) != 4 || (!this.f959n && !this.f960o))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.i : null);
        CharSequence charSequence = this.h.f3099q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.h.f3089e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.h.f3100r;
        if (TextUtils.isEmpty(charSequence2)) {
            f1.a(this, z4 ? null : this.h.f3089e);
        } else {
            f1.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0199l interfaceC0199l = this.f956k;
        if (interfaceC0199l != null) {
            interfaceC0199l.b(this.h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f959n = h();
        i();
    }

    @Override // l.C0257e0, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i3 = this.f962q) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f961p;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!isEmpty || this.f955j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f955j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0189b c0189b;
        if (this.h.hasSubMenu() && (c0189b = this.f957l) != null && c0189b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f960o != z2) {
            this.f960o = z2;
            C0202o c0202o = this.h;
            if (c0202o != null) {
                MenuC0200m menuC0200m = c0202o.f3096n;
                menuC0200m.f3065k = true;
                menuC0200m.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f955j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f963r;
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

    public void setItemInvoker(InterfaceC0199l interfaceC0199l) {
        this.f956k = interfaceC0199l;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f962q = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0190c abstractC0190c) {
        this.f958m = abstractC0190c;
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        i();
    }
}
