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
import k7.e;
import l.a;
import l.b;
import l.h;
import l.i;
import l.j;
import l.p;
import m.c0;
import m.k;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class ActionMenuItemView extends c0 implements p, View.OnClickListener, k {
    public b A;
    public boolean B;
    public boolean C;
    public final int D;
    public int E;
    public final int F;

    /* renamed from: v, reason: collision with root package name */
    public j f376v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f377w;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f378x;

    /* renamed from: y, reason: collision with root package name */
    public h f379y;

    /* renamed from: z, reason: collision with root package name */
    public a f380z;

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        Resources resources = context.getResources();
        this.B = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a.f4542c, i3, 0);
        this.D = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.F = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.E = -1;
        setSaveEnabled(false);
    }

    @Override // m.k
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // l.p
    public final void b(j jVar) {
        this.f376v = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.getTitleCondensed());
        setId(jVar.f5683a);
        setVisibility(jVar.isVisible() ? 0 : 8);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.f380z == null) {
            this.f380z = new a(this);
        }
    }

    @Override // m.k
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f376v.getIcon() == null;
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i10 = configuration.screenHeightDp;
        if (i3 < 480) {
            return (i3 >= 640 && i10 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // l.p
    public j getItemData() {
        return this.f376v;
    }

    public final void h() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f377w);
        if (this.f378x != null && ((this.f376v.f5705y & 4) != 4 || (!this.B && !this.C))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f377w : null);
        CharSequence charSequence = this.f376v.f5697q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z12 ? null : this.f376v.f5687e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f376v.f5698r;
        if (TextUtils.isEmpty(charSequence2)) {
            e.R(this, z12 ? null : this.f376v.f5687e);
        } else {
            e.R(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h hVar = this.f379y;
        if (hVar != null) {
            hVar.a(this.f376v);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.B = g();
        h();
    }

    @Override // m.c0, android.widget.TextView, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i11 = this.E) >= 0) {
            super.setPadding(i11, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i3, i10);
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int measuredWidth = getMeasuredWidth();
        int i12 = this.D;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i12) : i12;
        if (mode != 1073741824 && i12 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i10);
        }
        if (!isEmpty || this.f378x == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f378x.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.f376v.hasSubMenu() && (aVar = this.f380z) != null && aVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z10) {
        if (this.C != z10) {
            this.C = z10;
            j jVar = this.f376v;
            if (jVar != null) {
                i iVar = jVar.f5694n;
                iVar.f5673k = true;
                iVar.o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f378x = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i3 = this.F;
            if (intrinsicWidth > i3) {
                intrinsicHeight = (int) (intrinsicHeight * (i3 / intrinsicWidth));
                intrinsicWidth = i3;
            }
            if (intrinsicHeight > i3) {
                intrinsicWidth = (int) (intrinsicWidth * (i3 / intrinsicHeight));
            } else {
                i3 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i3);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(h hVar) {
        this.f379y = hVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i3, int i10, int i11, int i12) {
        this.E = i3;
        super.setPadding(i3, i10, i11, i12);
    }

    public void setPopupCallback(b bVar) {
        this.A = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f377w = charSequence;
        h();
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }
}
