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
import k.AbstractC0151c;
import k.C0150b;
import k.C0163o;
import k.InterfaceC0160l;
import k.InterfaceC0174z;
import k.MenuC0161m;
import l.C0213d0;
import l.InterfaceC0228l;
import l.f1;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0213d0 implements InterfaceC0174z, View.OnClickListener, InterfaceC0228l {
    public C0163o h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f1168j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0160l f1169k;

    /* renamed from: l, reason: collision with root package name */
    public C0150b f1170l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC0151c f1171m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1172n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1173o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1174p;

    /* renamed from: q, reason: collision with root package name */
    public int f1175q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1176r;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f1172n = h();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1992c, 0, 0);
        this.f1174p = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f1176r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1175q = -1;
        setSaveEnabled(false);
    }

    @Override // k.InterfaceC0174z
    public final void a(C0163o c0163o) {
        this.h = c0163o;
        setIcon(c0163o.getIcon());
        setTitle(c0163o.getTitleCondensed());
        setId(c0163o.f2639a);
        setVisibility(c0163o.isVisible() ? 0 : 8);
        setEnabled(c0163o.isEnabled());
        if (c0163o.hasSubMenu() && this.f1170l == null) {
            this.f1170l = new C0150b(this);
        }
    }

    @Override // l.InterfaceC0228l
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.h.getIcon() == null;
    }

    @Override // l.InterfaceC0228l
    public final boolean c() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // k.InterfaceC0174z
    public C0163o getItemData() {
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
        if (this.f1168j != null && ((this.h.f2660y & 4) != 4 || (!this.f1172n && !this.f1173o))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.i : null);
        CharSequence charSequence = this.h.f2652q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.h.f2642e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.h.f2653r;
        if (TextUtils.isEmpty(charSequence2)) {
            f1.a(this, z4 ? null : this.h.f2642e);
        } else {
            f1.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0160l interfaceC0160l = this.f1169k;
        if (interfaceC0160l != null) {
            interfaceC0160l.b(this.h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1172n = h();
        i();
    }

    @Override // l.C0213d0, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i3 = this.f1175q) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f1174p;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!isEmpty || this.f1168j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1168j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0150b c0150b;
        if (this.h.hasSubMenu() && (c0150b = this.f1170l) != null && c0150b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f1173o != z2) {
            this.f1173o = z2;
            C0163o c0163o = this.h;
            if (c0163o != null) {
                MenuC0161m menuC0161m = c0163o.f2649n;
                menuC0161m.f2619k = true;
                menuC0161m.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1168j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f1176r;
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

    public void setItemInvoker(InterfaceC0160l interfaceC0160l) {
        this.f1169k = interfaceC0160l;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f1175q = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0151c abstractC0151c) {
        this.f1171m = abstractC0151c;
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        i();
    }
}
