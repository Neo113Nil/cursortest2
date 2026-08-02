package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import defpackage.em;
import defpackage.fr;
import defpackage.gc;
import defpackage.gf;
import defpackage.gq;
import defpackage.hl;
import defpackage.jt;
import defpackage.kee;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ActionMenuItemView extends AppCompatTextView implements View.OnClickListener, gq, hl {
    public gf a;
    public gc b;
    public kee c;
    private CharSequence d;
    private Drawable e;
    private jt f;
    private boolean g;
    private int h;
    private int i;
    private int j;

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.g = n();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, em.c, i, 0);
        this.h = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.j = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.i = -1;
        setSaveEnabled(false);
    }

    private final void m() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.d);
        if (this.e != null && ((this.a.n & 4) != 4 || !this.g)) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.d : null);
        CharSequence charSequence = this.a.l;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.a.d);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.a.m;
        if (TextUtils.isEmpty(charSequence2)) {
            setTooltipText(z3 ? null : this.a.d);
        } else {
            setTooltipText(charSequence2);
        }
    }

    private final boolean n() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        return i >= 480 || configuration.orientation == 2;
    }

    @Override // defpackage.gq
    public final gf a() {
        return this.a;
    }

    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // defpackage.hl
    public final boolean c() {
        return b();
    }

    @Override // defpackage.hl
    public final boolean d() {
        return b() && this.a.getIcon() == null;
    }

    @Override // defpackage.gq
    public final boolean e() {
        return true;
    }

    @Override // defpackage.gq
    public final void f(gf gfVar) {
        this.a = gfVar;
        Drawable icon = gfVar.getIcon();
        this.e = icon;
        if (icon != null) {
            int intrinsicWidth = icon.getIntrinsicWidth();
            int intrinsicHeight = icon.getIntrinsicHeight();
            int i = this.j;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            icon.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(icon, null, null, null);
        m();
        this.d = gfVar.f(this);
        m();
        setId(gfVar.a);
        setVisibility(true != gfVar.isVisible() ? 8 : 0);
        setEnabled(gfVar.isEnabled());
        if (gfVar.hasSubMenu() && this.f == null) {
            this.f = new fr(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        gc gcVar = this.b;
        if (gcVar != null) {
            gcVar.b(this.a);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.g = n();
        m();
    }

    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        boolean b = b();
        if (b && (i3 = this.i) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.h;
        if (mode == Integer.MIN_VALUE) {
            i4 = Math.min(size, i4);
        }
        if (mode != 1073741824 && this.h > 0 && measuredWidth < i4) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i2);
        }
        if (b || this.e == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.e.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        jt jtVar;
        if (this.a.hasSubMenu() && (jtVar = this.f) != null && jtVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.i = i;
        super.setPadding(i, i2, i3, i4);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }
}
