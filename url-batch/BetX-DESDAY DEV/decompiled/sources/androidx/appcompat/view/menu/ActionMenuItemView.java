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
import k.AbstractC0192c;
import k.C0191b;
import k.C0204o;
import k.InterfaceC0201l;
import k.InterfaceC0215z;
import k.MenuC0202m;
import l.C0257d0;
import l.InterfaceC0272l;
import l.e1;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0257d0 implements InterfaceC0215z, View.OnClickListener, InterfaceC0272l {
    public C0204o h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f956j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0201l f957k;

    /* renamed from: l, reason: collision with root package name */
    public C0191b f958l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC0192c f959m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f960n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f961o;

    /* renamed from: p, reason: collision with root package name */
    public final int f962p;

    /* renamed from: q, reason: collision with root package name */
    public int f963q;

    /* renamed from: r, reason: collision with root package name */
    public final int f964r;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f960n = h();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2393c, 0, 0);
        this.f962p = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f964r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f963q = -1;
        setSaveEnabled(false);
    }

    @Override // k.InterfaceC0215z
    public final void a(C0204o c0204o) {
        this.h = c0204o;
        setIcon(c0204o.getIcon());
        setTitle(c0204o.getTitleCondensed());
        setId(c0204o.f3089a);
        setVisibility(c0204o.isVisible() ? 0 : 8);
        setEnabled(c0204o.isEnabled());
        if (c0204o.hasSubMenu() && this.f958l == null) {
            this.f958l = new C0191b(this);
        }
    }

    @Override // l.InterfaceC0272l
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.h.getIcon() == null;
    }

    @Override // l.InterfaceC0272l
    public final boolean c() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // k.InterfaceC0215z
    public C0204o getItemData() {
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
        if (this.f956j != null && ((this.h.f3111y & 4) != 4 || (!this.f960n && !this.f961o))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.i : null);
        CharSequence charSequence = this.h.f3103q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.h.f3093e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.h.f3104r;
        if (TextUtils.isEmpty(charSequence2)) {
            e1.a(this, z4 ? null : this.h.f3093e);
        } else {
            e1.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0201l interfaceC0201l = this.f957k;
        if (interfaceC0201l != null) {
            interfaceC0201l.b(this.h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f960n = h();
        i();
    }

    @Override // l.C0257d0, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i3 = this.f963q) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f962p;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!isEmpty || this.f956j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f956j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0191b c0191b;
        if (this.h.hasSubMenu() && (c0191b = this.f958l) != null && c0191b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f961o != z2) {
            this.f961o = z2;
            C0204o c0204o = this.h;
            if (c0204o != null) {
                MenuC0202m menuC0202m = c0204o.f3100n;
                menuC0202m.f3069k = true;
                menuC0202m.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f956j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f964r;
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

    public void setItemInvoker(InterfaceC0201l interfaceC0201l) {
        this.f957k = interfaceC0201l;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f963q = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0192c abstractC0192c) {
        this.f959m = abstractC0192c;
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        i();
    }
}
