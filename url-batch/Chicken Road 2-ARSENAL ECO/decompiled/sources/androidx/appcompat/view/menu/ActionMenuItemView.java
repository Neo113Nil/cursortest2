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
import g.AbstractC0389a;
import j.AbstractC0432b;
import j.ViewOnTouchListenerC0431a;
import j.i;
import j.j;
import j.k;
import j.q;
import k.C0462v;
import k.InterfaceC0451j;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0462v implements q, View.OnClickListener, InterfaceC0451j {

    /* renamed from: k, reason: collision with root package name */
    public k f3221k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f3222l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f3223m;

    /* renamed from: n, reason: collision with root package name */
    public i f3224n;

    /* renamed from: o, reason: collision with root package name */
    public ViewOnTouchListenerC0431a f3225o;

    /* renamed from: p, reason: collision with root package name */
    public AbstractC0432b f3226p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3227q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3228r;

    /* renamed from: s, reason: collision with root package name */
    public final int f3229s;

    /* renamed from: t, reason: collision with root package name */
    public int f3230t;

    /* renamed from: u, reason: collision with root package name */
    public final int f3231u;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f3227q = d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0389a.f4256c, 0, 0);
        this.f3229s = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f3231u = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f3230t = -1;
        setSaveEnabled(false);
    }

    @Override // j.q
    public final void a(k kVar) {
        this.f3221k = kVar;
        setIcon(kVar.getIcon());
        setTitle(kVar.getTitleCondensed());
        setId(kVar.f4817a);
        setVisibility(kVar.isVisible() ? 0 : 8);
        setEnabled(kVar.isEnabled());
        if (kVar.hasSubMenu() && this.f3225o == null) {
            this.f3225o = new ViewOnTouchListenerC0431a(this);
        }
    }

    @Override // k.InterfaceC0451j
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // k.InterfaceC0451j
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f3221k.getIcon() == null;
    }

    public final boolean d() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i7 = configuration.screenWidthDp;
        int i8 = configuration.screenHeightDp;
        if (i7 < 480) {
            return (i7 >= 640 && i8 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void e() {
        boolean z5 = true;
        boolean z6 = !TextUtils.isEmpty(this.f3222l);
        if (this.f3223m != null && ((this.f3221k.y & 4) != 4 || (!this.f3227q && !this.f3228r))) {
            z5 = false;
        }
        boolean z7 = z6 & z5;
        setText(z7 ? this.f3222l : null);
        CharSequence charSequence = this.f3221k.f4833q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z7 ? null : this.f3221k.f4821e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f3221k.f4834r;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC0676f.t(this, z7 ? null : this.f3221k.f4821e);
        } else {
            AbstractC0676f.t(this, charSequence2);
        }
    }

    @Override // j.q
    public k getItemData() {
        return this.f3221k;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i iVar = this.f3224n;
        if (iVar != null) {
            iVar.a(this.f3221k);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3227q = d();
        e();
    }

    @Override // k.C0462v, android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i9 = this.f3230t) >= 0) {
            super.setPadding(i9, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i7, i8);
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int measuredWidth = getMeasuredWidth();
        int i10 = this.f3229s;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i10) : i10;
        if (mode != 1073741824 && i10 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i8);
        }
        if (!isEmpty || this.f3223m == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f3223m.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewOnTouchListenerC0431a viewOnTouchListenerC0431a;
        if (this.f3221k.hasSubMenu() && (viewOnTouchListenerC0431a = this.f3225o) != null && viewOnTouchListenerC0431a.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z5) {
    }

    public void setChecked(boolean z5) {
    }

    public void setExpandedFormat(boolean z5) {
        if (this.f3228r != z5) {
            this.f3228r = z5;
            k kVar = this.f3221k;
            if (kVar != null) {
                j jVar = kVar.f4830n;
                jVar.f4805k = true;
                jVar.o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f3223m = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i7 = this.f3231u;
            if (intrinsicWidth > i7) {
                intrinsicHeight = (int) (intrinsicHeight * (i7 / intrinsicWidth));
                intrinsicWidth = i7;
            }
            if (intrinsicHeight > i7) {
                intrinsicWidth = (int) (intrinsicWidth * (i7 / intrinsicHeight));
            } else {
                i7 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i7);
        }
        setCompoundDrawables(drawable, null, null, null);
        e();
    }

    public void setItemInvoker(i iVar) {
        this.f3224n = iVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i7, int i8, int i9, int i10) {
        this.f3230t = i7;
        super.setPadding(i7, i8, i9, i10);
    }

    public void setPopupCallback(AbstractC0432b abstractC0432b) {
        this.f3226p = abstractC0432b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f3222l = charSequence;
        e();
    }
}
