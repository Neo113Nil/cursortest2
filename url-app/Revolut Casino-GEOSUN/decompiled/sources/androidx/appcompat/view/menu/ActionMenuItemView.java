package androidx.appcompat.view.menu;

import a.AbstractC0069a;
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
import c.AbstractC0098a;
import g.AbstractC0130b;
import g.ViewOnTouchListenerC0129a;
import g.i;
import g.j;
import g.k;
import g.q;
import h.C0167u;
import h.InterfaceC0157j;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0167u implements q, View.OnClickListener, InterfaceC0157j {

    /* renamed from: i, reason: collision with root package name */
    public k f1087i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f1088j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f1089k;

    /* renamed from: l, reason: collision with root package name */
    public i f1090l;

    /* renamed from: m, reason: collision with root package name */
    public ViewOnTouchListenerC0129a f1091m;

    /* renamed from: n, reason: collision with root package name */
    public AbstractC0130b f1092n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1093o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1094p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1095q;
    public int r;

    /* renamed from: s, reason: collision with root package name */
    public final int f1096s;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f1093o = e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0098a.f1642c, 0, 0);
        this.f1095q = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f1096s = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.r = -1;
        setSaveEnabled(false);
    }

    @Override // h.InterfaceC0157j
    public final boolean a() {
        return !TextUtils.isEmpty(getText()) && this.f1087i.getIcon() == null;
    }

    @Override // h.InterfaceC0157j
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // g.q
    public final void c(k kVar) {
        this.f1087i = kVar;
        setIcon(kVar.getIcon());
        setTitle(kVar.getTitleCondensed());
        setId(kVar.f1997a);
        setVisibility(kVar.isVisible() ? 0 : 8);
        setEnabled(kVar.isEnabled());
        if (kVar.hasSubMenu() && this.f1091m == null) {
            this.f1091m = new ViewOnTouchListenerC0129a(this);
        }
    }

    public final boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void f() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f1088j);
        if (this.f1089k != null && ((this.f1087i.f2020y & 4) != 4 || (!this.f1093o && !this.f1094p))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.f1088j : null);
        CharSequence charSequence = this.f1087i.f2013q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.f1087i.f2001e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f1087i.r;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC0069a.F(this, z4 ? null : this.f1087i.f2001e);
        } else {
            AbstractC0069a.F(this, charSequence2);
        }
    }

    @Override // g.q
    public k getItemData() {
        return this.f1087i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i iVar = this.f1090l;
        if (iVar != null) {
            iVar.a(this.f1087i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1093o = e();
        f();
    }

    @Override // h.C0167u, android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i4 = this.r) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int i5 = this.f1095q;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i5) : i5;
        if (mode != 1073741824 && i5 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i3);
        }
        if (!isEmpty || this.f1089k == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1089k.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewOnTouchListenerC0129a viewOnTouchListenerC0129a;
        if (this.f1087i.hasSubMenu() && (viewOnTouchListenerC0129a = this.f1091m) != null && viewOnTouchListenerC0129a.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f1094p != z2) {
            this.f1094p = z2;
            k kVar = this.f1087i;
            if (kVar != null) {
                j jVar = kVar.f2010n;
                jVar.f1986k = true;
                jVar.o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1089k = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.f1096s;
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

    public void setItemInvoker(i iVar) {
        this.f1090l = iVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i2, int i3, int i4, int i5) {
        this.r = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(AbstractC0130b abstractC0130b) {
        this.f1092n = abstractC0130b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1088j = charSequence;
        f();
    }
}
