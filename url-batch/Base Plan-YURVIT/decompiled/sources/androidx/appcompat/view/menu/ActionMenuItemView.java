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
import androidx.datastore.preferences.protobuf.k0;
import d.AbstractC0119a;
import h.AbstractC0135b;
import h.InterfaceC0142i;
import h.MenuC0143j;
import h.MenuItemC0144k;
import h.ViewOnTouchListenerC0134a;
import h.q;
import i.C0174v;
import i.InterfaceC0163j;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0174v implements q, View.OnClickListener, InterfaceC0163j {

    /* renamed from: i, reason: collision with root package name */
    public MenuItemC0144k f1177i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f1178j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f1179k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC0142i f1180l;

    /* renamed from: m, reason: collision with root package name */
    public ViewOnTouchListenerC0134a f1181m;

    /* renamed from: n, reason: collision with root package name */
    public AbstractC0135b f1182n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1183o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1184p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1185q;

    /* renamed from: r, reason: collision with root package name */
    public int f1186r;

    /* renamed from: s, reason: collision with root package name */
    public final int f1187s;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f1183o = d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0119a.f1789c, 0, 0);
        this.f1185q = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f1187s = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1186r = -1;
        setSaveEnabled(false);
    }

    @Override // h.q
    public final void a(MenuItemC0144k menuItemC0144k) {
        this.f1177i = menuItemC0144k;
        setIcon(menuItemC0144k.getIcon());
        setTitle(menuItemC0144k.getTitleCondensed());
        setId(menuItemC0144k.f2030a);
        setVisibility(menuItemC0144k.isVisible() ? 0 : 8);
        setEnabled(menuItemC0144k.isEnabled());
        if (menuItemC0144k.hasSubMenu() && this.f1181m == null) {
            this.f1181m = new ViewOnTouchListenerC0134a(this);
        }
    }

    @Override // i.InterfaceC0163j
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // i.InterfaceC0163j
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f1177i.getIcon() == null;
    }

    public final boolean d() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (i2 < 480) {
            return (i2 >= 640 && i3 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void e() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f1178j);
        if (this.f1179k != null && ((this.f1177i.f2053y & 4) != 4 || (!this.f1183o && !this.f1184p))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.f1178j : null);
        CharSequence charSequence = this.f1177i.f2046q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.f1177i.f2034e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f1177i.f2047r;
        if (TextUtils.isEmpty(charSequence2)) {
            k0.F(this, z4 ? null : this.f1177i.f2034e);
        } else {
            k0.F(this, charSequence2);
        }
    }

    @Override // h.q
    public MenuItemC0144k getItemData() {
        return this.f1177i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0142i interfaceC0142i = this.f1180l;
        if (interfaceC0142i != null) {
            interfaceC0142i.a(this.f1177i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1183o = d();
        e();
    }

    @Override // i.C0174v, android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i4 = this.f1186r) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int i5 = this.f1185q;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i5) : i5;
        if (mode != 1073741824 && i5 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i3);
        }
        if (!isEmpty || this.f1179k == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1179k.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewOnTouchListenerC0134a viewOnTouchListenerC0134a;
        if (this.f1177i.hasSubMenu() && (viewOnTouchListenerC0134a = this.f1181m) != null && viewOnTouchListenerC0134a.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f1184p != z2) {
            this.f1184p = z2;
            MenuItemC0144k menuItemC0144k = this.f1177i;
            if (menuItemC0144k != null) {
                MenuC0143j menuC0143j = menuItemC0144k.f2043n;
                menuC0143j.f2019k = true;
                menuC0143j.o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1179k = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.f1187s;
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
        e();
    }

    public void setItemInvoker(InterfaceC0142i interfaceC0142i) {
        this.f1180l = interfaceC0142i;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i2, int i3, int i4, int i5) {
        this.f1186r = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(AbstractC0135b abstractC0135b) {
        this.f1182n = abstractC0135b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1178j = charSequence;
        e();
    }
}
