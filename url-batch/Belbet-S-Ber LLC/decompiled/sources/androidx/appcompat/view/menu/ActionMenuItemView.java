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
import k.b;
import k.c;
import k.l;
import k.m;
import k.o;
import k.z;
import l.b3;
import l.k;
import l.z0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class ActionMenuItemView extends z0 implements z, View.OnClickListener, k {

    /* renamed from: m, reason: collision with root package name */
    public o f255m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f256n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f257o;

    /* renamed from: p, reason: collision with root package name */
    public l f258p;

    /* renamed from: q, reason: collision with root package name */
    public b f259q;

    /* renamed from: r, reason: collision with root package name */
    public c f260r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f261s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f262t;

    /* renamed from: u, reason: collision with root package name */
    public final int f263u;

    /* renamed from: v, reason: collision with root package name */
    public int f264v;

    /* renamed from: w, reason: collision with root package name */
    public final int f265w;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f261s = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1392c, 0, 0);
        this.f263u = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f265w = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f264v = -1;
        setSaveEnabled(false);
    }

    @Override // l.k
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // k.z
    public final void b(o oVar) {
        this.f255m = oVar;
        setIcon(oVar.getIcon());
        setTitle(oVar.getTitleCondensed());
        setId(oVar.f2234a);
        setVisibility(oVar.isVisible() ? 0 : 8);
        setEnabled(oVar.isEnabled());
        if (oVar.hasSubMenu() && this.f259q == null) {
            this.f259q = new b(this);
        }
    }

    @Override // l.k
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f255m.getIcon() == null;
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i4 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // k.z
    public o getItemData() {
        return this.f255m;
    }

    public final void h() {
        boolean z4 = true;
        boolean z5 = !TextUtils.isEmpty(this.f256n);
        if (this.f257o != null && ((this.f255m.f2255y & 4) != 4 || (!this.f261s && !this.f262t))) {
            z4 = false;
        }
        boolean z6 = z5 & z4;
        setText(z6 ? this.f256n : null);
        CharSequence charSequence = this.f255m.f2247q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z6 ? null : this.f255m.f2237e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f255m.f2248r;
        if (TextUtils.isEmpty(charSequence2)) {
            b3.a(this, z6 ? null : this.f255m.f2237e);
        } else {
            b3.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l lVar = this.f258p;
        if (lVar != null) {
            lVar.a(this.f255m);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f261s = g();
        h();
    }

    @Override // l.z0, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i4) {
        int i5;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i5 = this.f264v) >= 0) {
            super.setPadding(i5, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i4);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i6 = this.f263u;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i6) : i6;
        if (mode != 1073741824 && i6 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i4);
        }
        if (!isEmpty || this.f257o == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f257o.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar;
        if (this.f255m.hasSubMenu() && (bVar = this.f259q) != null && bVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z4) {
        if (this.f262t != z4) {
            this.f262t = z4;
            o oVar = this.f255m;
            if (oVar != null) {
                m mVar = oVar.f2244n;
                mVar.f2218k = true;
                mVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f257o = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f265w;
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

    public void setItemInvoker(l lVar) {
        this.f258p = lVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i4, int i5, int i6) {
        this.f264v = i;
        super.setPadding(i, i4, i5, i6);
    }

    public void setPopupCallback(c cVar) {
        this.f260r = cVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f256n = charSequence;
        h();
    }

    public void setCheckable(boolean z4) {
    }

    public void setChecked(boolean z4) {
    }
}
