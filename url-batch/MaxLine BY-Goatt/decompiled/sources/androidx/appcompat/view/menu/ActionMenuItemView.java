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
import defpackage.a3;
import defpackage.b62;
import defpackage.bh;
import defpackage.bl1;
import defpackage.ek1;
import defpackage.f3;
import defpackage.fk1;
import defpackage.lk1;
import defpackage.z2;
import defpackage.zj2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class ActionMenuItemView extends bh implements bl1, View.OnClickListener, f3 {
    public boolean A;
    public final int B;
    public int C;
    public final int D;
    public lk1 t;
    public CharSequence u;
    public Drawable v;
    public ek1 w;
    public z2 x;
    public a3 y;
    public boolean z;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.z = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b62.c, 0, 0);
        this.B = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.D = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.C = -1;
        setSaveEnabled(false);
    }

    @Override // defpackage.bl1
    public final void a(lk1 lk1Var) {
        this.t = lk1Var;
        setIcon(lk1Var.getIcon());
        setTitle(lk1Var.getTitleCondensed());
        setId(lk1Var.a);
        setVisibility(lk1Var.isVisible() ? 0 : 8);
        setEnabled(lk1Var.isEnabled());
        if (lk1Var.hasSubMenu() && this.x == null) {
            this.x = new z2(this);
        }
    }

    @Override // defpackage.f3
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // defpackage.f3
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.t.getIcon() == null;
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

    @Override // defpackage.bl1
    public lk1 getItemData() {
        return this.t;
    }

    public final void h() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.u);
        if (this.v != null && ((this.t.y & 4) != 4 || (!this.z && !this.A))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.u : null);
        CharSequence charSequence = this.t.q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.t.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.t.r;
        if (TextUtils.isEmpty(charSequence2)) {
            zj2.k(this, z3 ? null : this.t.e);
        } else {
            zj2.k(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ek1 ek1Var = this.w;
        if (ek1Var != null) {
            ek1Var.a(this.t);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.z = g();
        h();
    }

    @Override // defpackage.bh, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i3 = this.C) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.B;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!isEmpty || this.v == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.v.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        z2 z2Var;
        if (this.t.hasSubMenu() && (z2Var = this.x) != null && z2Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z) {
        if (this.A != z) {
            this.A = z;
            lk1 lk1Var = this.t;
            if (lk1Var != null) {
                fk1 fk1Var = lk1Var.n;
                fk1Var.k = true;
                fk1Var.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.v = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.D;
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

    public void setItemInvoker(ek1 ek1Var) {
        this.w = ek1Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.C = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(a3 a3Var) {
        this.y = a3Var;
    }

    public void setTitle(CharSequence charSequence) {
        this.u = charSequence;
        h();
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }
}
