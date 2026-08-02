package androidx.appcompat.view.menu;

import a.AbstractC0124a;
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
import f.AbstractC0410a;
import j.AbstractC1169b;
import j.ViewOnTouchListenerC1168a;
import j.i;
import j.j;
import j.k;
import j.q;
import k.C1233t;
import k.InterfaceC1220j;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C1233t implements q, View.OnClickListener, InterfaceC1220j {

    /* renamed from: e, reason: collision with root package name */
    public k f4296e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f4297f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f4298g;

    /* renamed from: h, reason: collision with root package name */
    public i f4299h;

    /* renamed from: i, reason: collision with root package name */
    public ViewOnTouchListenerC1168a f4300i;

    /* renamed from: j, reason: collision with root package name */
    public AbstractC1169b f4301j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4302k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4303l;

    /* renamed from: m, reason: collision with root package name */
    public final int f4304m;
    public int n;
    public final int o;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f4302k = d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0410a.f8472c, 0, 0);
        this.f4304m = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.o = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.n = -1;
        setSaveEnabled(false);
    }

    @Override // k.InterfaceC1220j
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // k.InterfaceC1220j
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.f4296e.getIcon() == null;
    }

    @Override // j.q
    public final void c(k kVar) {
        this.f4296e = kVar;
        setIcon(kVar.getIcon());
        setTitle(kVar.getTitleCondensed());
        setId(kVar.f13668a);
        setVisibility(kVar.isVisible() ? 0 : 8);
        setEnabled(kVar.isEnabled());
        if (kVar.hasSubMenu() && this.f4300i == null) {
            this.f4300i = new ViewOnTouchListenerC1168a(this);
        }
    }

    public final boolean d() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (i4 < 480) {
            return (i4 >= 640 && i5 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void e() {
        boolean z = true;
        boolean z4 = !TextUtils.isEmpty(this.f4297f);
        if (this.f4298g != null && ((this.f4296e.f13689y & 4) != 4 || (!this.f4302k && !this.f4303l))) {
            z = false;
        }
        boolean z5 = z4 & z;
        setText(z5 ? this.f4297f : null);
        CharSequence charSequence = this.f4296e.f13682q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z5 ? null : this.f4296e.f13672e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f4296e.f13683r;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC0124a.O(z5 ? null : this.f4296e.f13672e, this);
        } else {
            AbstractC0124a.O(charSequence2, this);
        }
    }

    @Override // j.q
    public k getItemData() {
        return this.f4296e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i iVar = this.f4299h;
        if (iVar != null) {
            iVar.a(this.f4296e);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f4302k = d();
        e();
    }

    @Override // k.C1233t, android.widget.TextView, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i6 = this.n) >= 0) {
            super.setPadding(i6, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i4, i5);
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int measuredWidth = getMeasuredWidth();
        int i7 = this.f4304m;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i7) : i7;
        if (mode != 1073741824 && i7 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i5);
        }
        if (!isEmpty || this.f4298g == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f4298g.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewOnTouchListenerC1168a viewOnTouchListenerC1168a;
        if (this.f4296e.hasSubMenu() && (viewOnTouchListenerC1168a = this.f4300i) != null && viewOnTouchListenerC1168a.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f4303l != z) {
            this.f4303l = z;
            k kVar = this.f4296e;
            if (kVar != null) {
                j jVar = kVar.n;
                jVar.f13657k = true;
                jVar.o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f4298g = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i4 = this.o;
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
        e();
    }

    public void setItemInvoker(i iVar) {
        this.f4299h = iVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i4, int i5, int i6, int i7) {
        this.n = i4;
        super.setPadding(i4, i5, i6, i7);
    }

    public void setPopupCallback(AbstractC1169b abstractC1169b) {
        this.f4301j = abstractC1169b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f4297f = charSequence;
        e();
    }
}
