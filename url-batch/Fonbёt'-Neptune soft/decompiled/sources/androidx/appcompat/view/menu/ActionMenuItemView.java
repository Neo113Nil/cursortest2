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
import c.AbstractC0165a;
import i.AbstractC0204b;
import i.InterfaceC0210h;
import i.InterfaceC0218p;
import i.MenuC0211i;
import i.MenuItemC0212j;
import i.ViewOnTouchListenerC0203a;
import i1.a;
import j.C0245v;
import j.InterfaceC0234j;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0245v implements InterfaceC0218p, View.OnClickListener, InterfaceC0234j {

    /* renamed from: i, reason: collision with root package name */
    public MenuItemC0212j f1335i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f1336j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f1337k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC0210h f1338l;

    /* renamed from: m, reason: collision with root package name */
    public ViewOnTouchListenerC0203a f1339m;

    /* renamed from: n, reason: collision with root package name */
    public AbstractC0204b f1340n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1341o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1342p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1343q;

    /* renamed from: r, reason: collision with root package name */
    public int f1344r;

    /* renamed from: s, reason: collision with root package name */
    public final int f1345s;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f1341o = e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0165a.f1965c, 0, 0);
        this.f1343q = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f1345s = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1344r = -1;
        setSaveEnabled(false);
    }

    @Override // j.InterfaceC0234j
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // j.InterfaceC0234j
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.f1335i.getIcon() == null;
    }

    @Override // i.InterfaceC0218p
    public final void c(MenuItemC0212j menuItemC0212j) {
        this.f1335i = menuItemC0212j;
        setIcon(menuItemC0212j.getIcon());
        setTitle(menuItemC0212j.getTitleCondensed());
        setId(menuItemC0212j.f2430a);
        setVisibility(menuItemC0212j.isVisible() ? 0 : 8);
        setEnabled(menuItemC0212j.isEnabled());
        if (menuItemC0212j.hasSubMenu() && this.f1339m == null) {
            this.f1339m = new ViewOnTouchListenerC0203a(this);
        }
    }

    public final boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void f() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f1336j);
        if (this.f1337k != null && ((this.f1335i.f2453y & 4) != 4 || (!this.f1341o && !this.f1342p))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.f1336j : null);
        CharSequence charSequence = this.f1335i.f2446q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.f1335i.f2434e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f1335i.f2447r;
        if (TextUtils.isEmpty(charSequence2)) {
            a.z(this, z4 ? null : this.f1335i.f2434e);
        } else {
            a.z(this, charSequence2);
        }
    }

    @Override // i.InterfaceC0218p
    public MenuItemC0212j getItemData() {
        return this.f1335i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0210h interfaceC0210h = this.f1338l;
        if (interfaceC0210h != null) {
            interfaceC0210h.a(this.f1335i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1341o = e();
        f();
    }

    @Override // j.C0245v, android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i4 = this.f1344r) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int i5 = this.f1343q;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i5) : i5;
        if (mode != 1073741824 && i5 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i3);
        }
        if (!isEmpty || this.f1337k == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1337k.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewOnTouchListenerC0203a viewOnTouchListenerC0203a;
        if (this.f1335i.hasSubMenu() && (viewOnTouchListenerC0203a = this.f1339m) != null && viewOnTouchListenerC0203a.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f1342p != z2) {
            this.f1342p = z2;
            MenuItemC0212j menuItemC0212j = this.f1335i;
            if (menuItemC0212j != null) {
                MenuC0211i menuC0211i = menuItemC0212j.f2443n;
                menuC0211i.f2418k = true;
                menuC0211i.o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1337k = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.f1345s;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (intrinsicHeight * (i2 / intrinsicWidth));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
            } else {
                i2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(drawable, null, null, null);
        f();
    }

    public void setItemInvoker(InterfaceC0210h interfaceC0210h) {
        this.f1338l = interfaceC0210h;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i2, int i3, int i4, int i5) {
        this.f1344r = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(AbstractC0204b abstractC0204b) {
        this.f1340n = abstractC0204b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1336j = charSequence;
        f();
    }
}
