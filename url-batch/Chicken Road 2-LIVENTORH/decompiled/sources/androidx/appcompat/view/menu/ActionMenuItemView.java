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
import k.o;
import k.z;
import l.c1;
import l.m;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class ActionMenuItemView extends c1 implements z, View.OnClickListener, m {

    /* renamed from: m, reason: collision with root package name */
    public o f122m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f123n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f124o;

    /* renamed from: p, reason: collision with root package name */
    public l f125p;

    /* renamed from: q, reason: collision with root package name */
    public b f126q;

    /* renamed from: r, reason: collision with root package name */
    public c f127r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f128s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f129t;

    /* renamed from: u, reason: collision with root package name */
    public final int f130u;

    /* renamed from: v, reason: collision with root package name */
    public int f131v;

    /* renamed from: w, reason: collision with root package name */
    public final int f132w;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f128s = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1242c, 0, 0);
        this.f130u = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f132w = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f131v = -1;
        setSaveEnabled(false);
    }

    @Override // l.m
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // k.z
    public final void b(o oVar) {
        this.f122m = oVar;
        setIcon(oVar.getIcon());
        setTitle(oVar.getTitleCondensed());
        setId(oVar.f2085a);
        setVisibility(oVar.isVisible() ? 0 : 8);
        setEnabled(oVar.isEnabled());
        if (oVar.hasSubMenu() && this.f126q == null) {
            this.f126q = new b(this);
        }
    }

    @Override // l.m
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f122m.getIcon() == null;
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
        return this.f122m;
    }

    public final void h() {
        boolean z3 = true;
        boolean z4 = !TextUtils.isEmpty(this.f123n);
        if (this.f124o != null && ((this.f122m.f2107y & 4) != 4 || (!this.f128s && !this.f129t))) {
            z3 = false;
        }
        boolean z5 = z4 & z3;
        setText(z5 ? this.f123n : null);
        CharSequence charSequence = this.f122m.f2099q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z5 ? null : this.f122m.f2088e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f122m.f2100r;
        if (TextUtils.isEmpty(charSequence2)) {
            h.a.l0(this, z5 ? null : this.f122m.f2088e);
        } else {
            h.a.l0(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l lVar = this.f125p;
        if (lVar != null) {
            lVar.a(this.f122m);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f128s = g();
        h();
    }

    @Override // l.c1, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i4) {
        int i5;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i5 = this.f131v) >= 0) {
            super.setPadding(i5, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i4);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i6 = this.f130u;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i6) : i6;
        if (mode != 1073741824 && i6 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i4);
        }
        if (!isEmpty || this.f124o == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f124o.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar;
        if (this.f122m.hasSubMenu() && (bVar = this.f126q) != null && bVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z3) {
        if (this.f129t != z3) {
            this.f129t = z3;
            o oVar = this.f122m;
            if (oVar != null) {
                k.m mVar = oVar.f2096n;
                mVar.f2068k = true;
                mVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f124o = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f132w;
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
        this.f125p = lVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i4, int i5, int i6) {
        this.f131v = i;
        super.setPadding(i, i4, i5, i6);
    }

    public void setPopupCallback(c cVar) {
        this.f127r = cVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f123n = charSequence;
        h();
    }

    public void setCheckable(boolean z3) {
    }

    public void setChecked(boolean z3) {
    }
}
