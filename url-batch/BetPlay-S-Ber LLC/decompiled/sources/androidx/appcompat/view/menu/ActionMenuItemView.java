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
import defpackage.au;
import defpackage.d1;
import defpackage.e1;
import defpackage.eu;
import defpackage.i6;
import defpackage.l1;
import defpackage.my;
import defpackage.r60;
import defpackage.su;
import defpackage.zt;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class ActionMenuItemView extends i6 implements su, View.OnClickListener, l1 {
    public eu m;
    public CharSequence n;
    public Drawable o;
    public zt p;
    public d1 q;
    public e1 r;
    public boolean s;
    public boolean t;
    public final int u;
    public int v;
    public final int w;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.s = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, my.c, 0, 0);
        this.u = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.w = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.v = -1;
        setSaveEnabled(false);
    }

    @Override // defpackage.l1
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // defpackage.l1
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.m.getIcon() == null;
    }

    @Override // defpackage.su
    public final void c(eu euVar) {
        this.m = euVar;
        setIcon(euVar.getIcon());
        setTitle(euVar.getTitleCondensed());
        setId(euVar.a);
        setVisibility(euVar.isVisible() ? 0 : 8);
        setEnabled(euVar.isEnabled());
        if (euVar.hasSubMenu() && this.q == null) {
            this.q = new d1(this);
        }
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // defpackage.su
    public eu getItemData() {
        return this.m;
    }

    public final void h() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.n);
        if (this.o != null && ((this.m.y & 4) != 4 || (!this.s && !this.t))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.n : null);
        CharSequence charSequence = this.m.q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.m.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.m.r;
        if (TextUtils.isEmpty(charSequence2)) {
            r60.a(this, z3 ? null : this.m.e);
        } else {
            r60.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zt ztVar = this.p;
        if (ztVar != null) {
            ztVar.a(this.m);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.s = g();
        h();
    }

    @Override // defpackage.i6, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i3 = this.v) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.u;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!isEmpty || this.o == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.o.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d1 d1Var;
        if (this.m.hasSubMenu() && (d1Var = this.q) != null && d1Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z) {
        if (this.t != z) {
            this.t = z;
            eu euVar = this.m;
            if (euVar != null) {
                au auVar = euVar.n;
                auVar.k = true;
                auVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.o = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.w;
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
        h();
    }

    public void setItemInvoker(zt ztVar) {
        this.p = ztVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.v = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(e1 e1Var) {
        this.r = e1Var;
    }

    public void setTitle(CharSequence charSequence) {
        this.n = charSequence;
        h();
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }
}
