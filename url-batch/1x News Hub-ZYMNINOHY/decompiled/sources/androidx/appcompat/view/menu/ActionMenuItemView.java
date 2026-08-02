package androidx.appcompat.view.menu;

import S0.a;
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
import g.AbstractC0328a;
import k.AbstractC1057b;
import k.InterfaceC1064i;
import k.InterfaceC1072q;
import k.MenuC1065j;
import k.MenuItemC1066k;
import k.ViewOnTouchListenerC1056a;
import l.C1098u;
import l.InterfaceC1088j;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C1098u implements InterfaceC1072q, View.OnClickListener, InterfaceC1088j {

    /* renamed from: e, reason: collision with root package name */
    public MenuItemC1066k f1967e;
    public CharSequence f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f1968g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1064i f1969h;

    /* renamed from: i, reason: collision with root package name */
    public ViewOnTouchListenerC1056a f1970i;

    /* renamed from: j, reason: collision with root package name */
    public AbstractC1057b f1971j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1972k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1973l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1974m;

    /* renamed from: n, reason: collision with root package name */
    public int f1975n;
    public final int o;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f1972k = e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0328a.f4991c, 0, 0);
        this.f1974m = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.o = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1975n = -1;
        setSaveEnabled(false);
    }

    @Override // k.InterfaceC1072q
    public final void a(MenuItemC1066k menuItemC1066k) {
        this.f1967e = menuItemC1066k;
        setIcon(menuItemC1066k.getIcon());
        setTitle(menuItemC1066k.getTitleCondensed());
        setId(menuItemC1066k.f9618a);
        setVisibility(menuItemC1066k.isVisible() ? 0 : 8);
        setEnabled(menuItemC1066k.isEnabled());
        if (menuItemC1066k.hasSubMenu() && this.f1970i == null) {
            this.f1970i = new ViewOnTouchListenerC1056a(this);
        }
    }

    @Override // l.InterfaceC1088j
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // l.InterfaceC1088j
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f1967e.getIcon() == null;
    }

    public final boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (i3 < 480) {
            return (i3 >= 640 && i4 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f);
        if (this.f1968g != null && ((this.f1967e.f9639y & 4) != 4 || (!this.f1972k && !this.f1973l))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f : null);
        CharSequence charSequence = this.f1967e.f9632q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.f1967e.f9622e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f1967e.f9633r;
        if (TextUtils.isEmpty(charSequence2)) {
            a.C(z3 ? null : this.f1967e.f9622e, this);
        } else {
            a.C(charSequence2, this);
        }
    }

    @Override // k.InterfaceC1072q
    public MenuItemC1066k getItemData() {
        return this.f1967e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1064i interfaceC1064i = this.f1969h;
        if (interfaceC1064i != null) {
            interfaceC1064i.a(this.f1967e);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1972k = e();
        f();
    }

    @Override // l.C1098u, android.widget.TextView, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i5 = this.f1975n) >= 0) {
            super.setPadding(i5, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i3, i4);
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int measuredWidth = getMeasuredWidth();
        int i6 = this.f1974m;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i6) : i6;
        if (mode != 1073741824 && i6 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i4);
        }
        if (!isEmpty || this.f1968g == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1968g.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewOnTouchListenerC1056a viewOnTouchListenerC1056a;
        if (this.f1967e.hasSubMenu() && (viewOnTouchListenerC1056a = this.f1970i) != null && viewOnTouchListenerC1056a.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f1973l != z) {
            this.f1973l = z;
            MenuItemC1066k menuItemC1066k = this.f1967e;
            if (menuItemC1066k != null) {
                MenuC1065j menuC1065j = menuItemC1066k.f9630n;
                menuC1065j.f9606k = true;
                menuC1065j.o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1968g = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i3 = this.o;
            if (intrinsicWidth > i3) {
                intrinsicHeight = (int) (intrinsicHeight * (i3 / intrinsicWidth));
                intrinsicWidth = i3;
            }
            if (intrinsicHeight > i3) {
                intrinsicWidth = (int) (intrinsicWidth * (i3 / intrinsicHeight));
            } else {
                i3 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i3);
        }
        setCompoundDrawables(drawable, null, null, null);
        f();
    }

    public void setItemInvoker(InterfaceC1064i interfaceC1064i) {
        this.f1969h = interfaceC1064i;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i3, int i4, int i5, int i6) {
        this.f1975n = i3;
        super.setPadding(i3, i4, i5, i6);
    }

    public void setPopupCallback(AbstractC1057b abstractC1057b) {
        this.f1971j = abstractC1057b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f = charSequence;
        f();
    }
}
