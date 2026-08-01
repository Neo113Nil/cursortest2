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
import e.a;
import j.b;
import j.c;
import j.m;
import j.o;
import j.z;
import k.a3;
import k.l;
import k.z0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class ActionMenuItemView extends z0 implements z, View.OnClickListener, l {

    /* renamed from: m, reason: collision with root package name */
    public o f148m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f149n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f150o;

    /* renamed from: p, reason: collision with root package name */
    public j.l f151p;

    /* renamed from: q, reason: collision with root package name */
    public b f152q;

    /* renamed from: r, reason: collision with root package name */
    public c f153r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f154s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f155t;

    /* renamed from: u, reason: collision with root package name */
    public final int f156u;

    /* renamed from: v, reason: collision with root package name */
    public int f157v;

    /* renamed from: w, reason: collision with root package name */
    public final int f158w;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f154s = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.c, 0, 0);
        this.f156u = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f158w = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f157v = -1;
        setSaveEnabled(false);
    }

    @Override // k.l
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // j.z
    public final void b(o oVar) {
        this.f148m = oVar;
        setIcon(oVar.getIcon());
        setTitle(oVar.getTitleCondensed());
        setId(oVar.f2211a);
        setVisibility(oVar.isVisible() ? 0 : 8);
        setEnabled(oVar.isEnabled());
        if (oVar.hasSubMenu() && this.f152q == null) {
            this.f152q = new b(this);
        }
    }

    @Override // k.l
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f148m.getIcon() == null;
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (i4 < 480) {
            return (i4 >= 640 && i5 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // j.z
    public o getItemData() {
        return this.f148m;
    }

    public final void h() {
        boolean z3 = true;
        boolean z4 = !TextUtils.isEmpty(this.f149n);
        if (this.f150o != null && ((this.f148m.f2232y & 4) != 4 || (!this.f154s && !this.f155t))) {
            z3 = false;
        }
        boolean z5 = z4 & z3;
        setText(z5 ? this.f149n : null);
        CharSequence charSequence = this.f148m.f2224q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z5 ? null : this.f148m.f2214e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f148m.f2225r;
        if (TextUtils.isEmpty(charSequence2)) {
            a3.a(this, z5 ? null : this.f148m.f2214e);
        } else {
            a3.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j.l lVar = this.f151p;
        if (lVar != null) {
            lVar.c(this.f148m);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f154s = g();
        h();
    }

    @Override // k.z0, android.widget.TextView, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i6 = this.f157v) >= 0) {
            super.setPadding(i6, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i4, i5);
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int measuredWidth = getMeasuredWidth();
        int i7 = this.f156u;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i7) : i7;
        if (mode != 1073741824 && i7 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i5);
        }
        if (!isEmpty || this.f150o == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f150o.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar;
        if (this.f148m.hasSubMenu() && (bVar = this.f152q) != null && bVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z3) {
        if (this.f155t != z3) {
            this.f155t = z3;
            o oVar = this.f148m;
            if (oVar != null) {
                m mVar = oVar.f2221n;
                mVar.f2196k = true;
                mVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f150o = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i4 = this.f158w;
            if (intrinsicWidth > i4) {
                intrinsicHeight = (int) (intrinsicHeight * (i4 / intrinsicWidth));
                intrinsicWidth = i4;
            }
            if (intrinsicHeight > i4) {
                intrinsicWidth = (int) (intrinsicWidth * (i4 / intrinsicHeight));
            } else {
                i4 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i4);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(j.l lVar) {
        this.f151p = lVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i4, int i5, int i6, int i7) {
        this.f157v = i4;
        super.setPadding(i4, i5, i6, i7);
    }

    public void setPopupCallback(c cVar) {
        this.f153r = cVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f149n = charSequence;
        h();
    }

    public void setCheckable(boolean z3) {
    }

    public void setChecked(boolean z3) {
    }
}
