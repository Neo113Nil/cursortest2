package androidx.appcompat.view.menu;

import P0.f;
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
import h.AbstractC0454a;
import m.AbstractC0678c;
import m.C0677b;
import m.InterfaceC0672A;
import m.l;
import m.m;
import m.o;
import n.C0703c0;
import n.InterfaceC0718k;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0703c0 implements InterfaceC0672A, View.OnClickListener, InterfaceC0718k {

    /* renamed from: p, reason: collision with root package name */
    public o f3108p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f3109q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f3110r;

    /* renamed from: s, reason: collision with root package name */
    public l f3111s;

    /* renamed from: t, reason: collision with root package name */
    public C0677b f3112t;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC0678c f3113u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3114v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3115w;

    /* renamed from: x, reason: collision with root package name */
    public final int f3116x;

    /* renamed from: y, reason: collision with root package name */
    public int f3117y;

    /* renamed from: z, reason: collision with root package name */
    public final int f3118z;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f3114v = f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0454a.f5039c, 0, 0);
        this.f3116x = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f3118z = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f3117y = -1;
        setSaveEnabled(false);
    }

    @Override // m.InterfaceC0672A
    public final void a(o oVar) {
        this.f3108p = oVar;
        setIcon(oVar.getIcon());
        setTitle(oVar.getTitleCondensed());
        setId(oVar.f6440a);
        setVisibility(oVar.isVisible() ? 0 : 8);
        setEnabled(oVar.isEnabled());
        if (oVar.hasSubMenu() && this.f3112t == null) {
            this.f3112t = new C0677b(this);
        }
    }

    @Override // n.InterfaceC0718k
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // n.InterfaceC0718k
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f3108p.getIcon() == null;
    }

    public final boolean f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (i2 < 480) {
            return (i2 >= 640 && i5 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void g() {
        boolean z7 = true;
        boolean z8 = !TextUtils.isEmpty(this.f3109q);
        if (this.f3110r != null && ((this.f3108p.f6463y & 4) != 4 || (!this.f3114v && !this.f3115w))) {
            z7 = false;
        }
        boolean z9 = z8 & z7;
        setText(z9 ? this.f3109q : null);
        CharSequence charSequence = this.f3108p.f6455q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z9 ? null : this.f3108p.f6444e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f3108p.f6456r;
        if (TextUtils.isEmpty(charSequence2)) {
            f.M(this, z9 ? null : this.f3108p.f6444e);
        } else {
            f.M(this, charSequence2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // m.InterfaceC0672A
    public o getItemData() {
        return this.f3108p;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l lVar = this.f3111s;
        if (lVar != null) {
            lVar.b(this.f3108p);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3114v = f();
        g();
    }

    @Override // n.C0703c0, android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i5) {
        int i7;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i7 = this.f3117y) >= 0) {
            super.setPadding(i7, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i5);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int i8 = this.f3116x;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i8) : i8;
        if (mode != 1073741824 && i8 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i5);
        }
        if (!isEmpty || this.f3110r == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f3110r.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0677b c0677b;
        if (this.f3108p.hasSubMenu() && (c0677b = this.f3112t) != null && c0677b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z7) {
    }

    public void setChecked(boolean z7) {
    }

    public void setExpandedFormat(boolean z7) {
        if (this.f3115w != z7) {
            this.f3115w = z7;
            o oVar = this.f3108p;
            if (oVar != null) {
                m mVar = oVar.f6452n;
                mVar.f6419k = true;
                mVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f3110r = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.f3118z;
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
        g();
    }

    public void setItemInvoker(l lVar) {
        this.f3111s = lVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i2, int i5, int i7, int i8) {
        this.f3117y = i2;
        super.setPadding(i2, i5, i7, i8);
    }

    public void setPopupCallback(AbstractC0678c abstractC0678c) {
        this.f3113u = abstractC0678c;
    }

    public void setTitle(CharSequence charSequence) {
        this.f3109q = charSequence;
        g();
    }
}
