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
import k.AbstractC0156c;
import k.C0155b;
import k.C0168o;
import k.InterfaceC0165l;
import k.InterfaceC0179z;
import k.MenuC0166m;
import l.C0204c0;
import l.InterfaceC0221l;
import l.e1;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0204c0 implements InterfaceC0179z, View.OnClickListener, InterfaceC0221l {
    public C0168o h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f1258j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0165l f1259k;

    /* renamed from: l, reason: collision with root package name */
    public C0155b f1260l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC0156c f1261m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1262n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1263o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1264p;

    /* renamed from: q, reason: collision with root package name */
    public int f1265q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1266r;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f1262n = h();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2100c, 0, 0);
        this.f1264p = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f1266r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1265q = -1;
        setSaveEnabled(false);
    }

    @Override // k.InterfaceC0179z
    public final void a(C0168o c0168o) {
        this.h = c0168o;
        setIcon(c0168o.getIcon());
        setTitle(c0168o.getTitleCondensed());
        setId(c0168o.f2740a);
        setVisibility(c0168o.isVisible() ? 0 : 8);
        setEnabled(c0168o.isEnabled());
        if (c0168o.hasSubMenu() && this.f1260l == null) {
            this.f1260l = new C0155b(this);
        }
    }

    @Override // l.InterfaceC0221l
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.h.getIcon() == null;
    }

    @Override // l.InterfaceC0221l
    public final boolean c() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // k.InterfaceC0179z
    public C0168o getItemData() {
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
        if (this.f1258j != null && ((this.h.f2761y & 4) != 4 || (!this.f1262n && !this.f1263o))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.i : null);
        CharSequence charSequence = this.h.f2753q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.h.f2743e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.h.f2754r;
        if (TextUtils.isEmpty(charSequence2)) {
            e1.a(this, z4 ? null : this.h.f2743e);
        } else {
            e1.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0165l interfaceC0165l = this.f1259k;
        if (interfaceC0165l != null) {
            interfaceC0165l.b(this.h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1262n = h();
        i();
    }

    @Override // l.C0204c0, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i3 = this.f1265q) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f1264p;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!isEmpty || this.f1258j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1258j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0155b c0155b;
        if (this.h.hasSubMenu() && (c0155b = this.f1260l) != null && c0155b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f1263o != z2) {
            this.f1263o = z2;
            C0168o c0168o = this.h;
            if (c0168o != null) {
                MenuC0166m menuC0166m = c0168o.f2750n;
                menuC0166m.f2720k = true;
                menuC0166m.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1258j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f1266r;
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

    public void setItemInvoker(InterfaceC0165l interfaceC0165l) {
        this.f1259k = interfaceC0165l;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f1265q = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0156c abstractC0156c) {
        this.f1261m = abstractC0156c;
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        i();
    }
}
