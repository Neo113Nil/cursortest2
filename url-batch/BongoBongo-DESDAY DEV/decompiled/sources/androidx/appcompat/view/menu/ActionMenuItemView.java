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
import f.AbstractC0097a;
import l.AbstractC0159c;
import l.C0158b;
import l.C0171o;
import l.InterfaceC0168l;
import l.InterfaceC0182z;
import l.MenuC0169m;
import m.C0208d0;
import m.InterfaceC0223l;
import m.k1;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0208d0 implements InterfaceC0182z, View.OnClickListener, InterfaceC0223l {

    /* renamed from: h, reason: collision with root package name */
    public C0171o f1307h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f1308j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0168l f1309k;

    /* renamed from: l, reason: collision with root package name */
    public C0158b f1310l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC0159c f1311m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1312n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1313o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1314p;

    /* renamed from: q, reason: collision with root package name */
    public int f1315q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1316r;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f1312n = h();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0097a.f2138c, 0, 0);
        this.f1314p = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f1316r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1315q = -1;
        setSaveEnabled(false);
    }

    @Override // m.InterfaceC0223l
    public final boolean a() {
        return !TextUtils.isEmpty(getText()) && this.f1307h.getIcon() == null;
    }

    @Override // m.InterfaceC0223l
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // l.InterfaceC0182z
    public final void c(C0171o c0171o) {
        this.f1307h = c0171o;
        setIcon(c0171o.getIcon());
        setTitle(c0171o.getTitleCondensed());
        setId(c0171o.f2843a);
        setVisibility(c0171o.isVisible() ? 0 : 8);
        setEnabled(c0171o.isEnabled());
        if (c0171o.hasSubMenu() && this.f1310l == null) {
            this.f1310l = new C0158b(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // l.InterfaceC0182z
    public C0171o getItemData() {
        return this.f1307h;
    }

    public final boolean h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void i() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.i);
        if (this.f1308j != null && ((this.f1307h.f2865y & 4) != 4 || (!this.f1312n && !this.f1313o))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.i : null);
        CharSequence charSequence = this.f1307h.f2857q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.f1307h.f2846e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f1307h.f2858r;
        if (TextUtils.isEmpty(charSequence2)) {
            k1.a(this, z4 ? null : this.f1307h.f2846e);
        } else {
            k1.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0168l interfaceC0168l = this.f1309k;
        if (interfaceC0168l != null) {
            interfaceC0168l.b(this.f1307h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1312n = h();
        i();
    }

    @Override // m.C0208d0, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i3 = this.f1315q) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f1314p;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!isEmpty || this.f1308j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1308j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0158b c0158b;
        if (this.f1307h.hasSubMenu() && (c0158b = this.f1310l) != null && c0158b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f1313o != z2) {
            this.f1313o = z2;
            C0171o c0171o = this.f1307h;
            if (c0171o != null) {
                MenuC0169m menuC0169m = c0171o.f2854n;
                menuC0169m.f2823k = true;
                menuC0169m.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1308j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f1316r;
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

    public void setItemInvoker(InterfaceC0168l interfaceC0168l) {
        this.f1309k = interfaceC0168l;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f1315q = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0159c abstractC0159c) {
        this.f1311m = abstractC0159c;
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        i();
    }
}
