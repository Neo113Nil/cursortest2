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
import defpackage.b1;
import defpackage.c1;
import defpackage.du;
import defpackage.i1;
import defpackage.l60;
import defpackage.lt;
import defpackage.mt;
import defpackage.pt;
import defpackage.r5;
import defpackage.wx;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class ActionMenuItemView extends r5 implements du, View.OnClickListener, i1 {
    public pt m;
    public CharSequence n;
    public Drawable o;
    public lt p;
    public b1 q;
    public c1 r;
    public boolean s;
    public boolean t;
    public final int u;
    public int v;
    public final int w;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.s = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wx.c, 0, 0);
        this.u = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.w = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.v = -1;
        setSaveEnabled(false);
    }

    @Override // defpackage.i1
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // defpackage.i1
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.m.getIcon() == null;
    }

    @Override // defpackage.du
    public final void c(pt ptVar) {
        this.m = ptVar;
        setIcon(ptVar.getIcon());
        setTitle(ptVar.getTitleCondensed());
        setId(ptVar.a);
        setVisibility(ptVar.isVisible() ? 0 : 8);
        setEnabled(ptVar.isEnabled());
        if (ptVar.hasSubMenu() && this.q == null) {
            this.q = new b1(this);
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

    @Override // defpackage.du
    public pt getItemData() {
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
            l60.a(this, z3 ? null : this.m.e);
        } else {
            l60.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        lt ltVar = this.p;
        if (ltVar != null) {
            ltVar.a(this.m);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.s = g();
        h();
    }

    @Override // defpackage.r5, android.widget.TextView, android.view.View
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
        b1 b1Var;
        if (this.m.hasSubMenu() && (b1Var = this.q) != null && b1Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z) {
        if (this.t != z) {
            this.t = z;
            pt ptVar = this.m;
            if (ptVar != null) {
                mt mtVar = ptVar.n;
                mtVar.k = true;
                mtVar.p(true);
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

    public void setItemInvoker(lt ltVar) {
        this.p = ltVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.v = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(c1 c1Var) {
        this.r = c1Var;
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
