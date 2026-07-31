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
import k.a;
import k.b;
import k.h;
import k.i;
import k.p;
import l.j;
import l.j0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class ActionMenuItemView extends j0 implements p, View.OnClickListener, j {

    /* renamed from: k, reason: collision with root package name */
    public k.j f330k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f331l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f332m;

    /* renamed from: n, reason: collision with root package name */
    public h f333n;

    /* renamed from: o, reason: collision with root package name */
    public a f334o;

    /* renamed from: p, reason: collision with root package name */
    public b f335p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f336q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f337r;

    /* renamed from: s, reason: collision with root package name */
    public final int f338s;

    /* renamed from: t, reason: collision with root package name */
    public int f339t;

    /* renamed from: u, reason: collision with root package name */
    public final int f340u;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f336q = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f3051c, 0, 0);
        this.f338s = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f340u = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f339t = -1;
        setSaveEnabled(false);
    }

    @Override // l.j
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // k.p
    public final void b(k.j jVar) {
        this.f330k = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.getTitleCondensed());
        setId(jVar.f4089a);
        setVisibility(jVar.isVisible() ? 0 : 8);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.f334o == null) {
            this.f334o = new a(this);
        }
    }

    @Override // l.j
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f330k.getIcon() == null;
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i8 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i8 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // k.p
    public k.j getItemData() {
        return this.f330k;
    }

    public final void h() {
        boolean z3 = true;
        boolean z7 = !TextUtils.isEmpty(this.f331l);
        if (this.f332m != null && ((this.f330k.f4112y & 4) != 4 || (!this.f336q && !this.f337r))) {
            z3 = false;
        }
        boolean z8 = z7 & z3;
        setText(z8 ? this.f331l : null);
        CharSequence charSequence = this.f330k.f4104q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z8 ? null : this.f330k.f4093e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f330k.f4105r;
        if (TextUtils.isEmpty(charSequence2)) {
            m.a.Q(this, z8 ? null : this.f330k.f4093e);
        } else {
            m.a.Q(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h hVar = this.f333n;
        if (hVar != null) {
            hVar.a(this.f330k);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f336q = g();
        h();
    }

    @Override // l.j0, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i8) {
        int i9;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i9 = this.f339t) >= 0) {
            super.setPadding(i9, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i8);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i10 = this.f338s;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i10) : i10;
        if (mode != 1073741824 && i10 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i8);
        }
        if (!isEmpty || this.f332m == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f332m.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.f330k.hasSubMenu() && (aVar = this.f334o) != null && aVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z3) {
        if (this.f337r != z3) {
            this.f337r = z3;
            k.j jVar = this.f330k;
            if (jVar != null) {
                i iVar = jVar.f4101n;
                iVar.f4079k = true;
                iVar.o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f332m = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f340u;
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

    public void setItemInvoker(h hVar) {
        this.f333n = hVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i8, int i9, int i10) {
        this.f339t = i;
        super.setPadding(i, i8, i9, i10);
    }

    public void setPopupCallback(b bVar) {
        this.f335p = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f331l = charSequence;
        h();
    }

    public void setCheckable(boolean z3) {
    }

    public void setChecked(boolean z3) {
    }
}
