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
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.I;
import androidx.appcompat.widget.e0;

/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements k.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: a, reason: collision with root package name */
    g f10296a;

    /* renamed from: b, reason: collision with root package name */
    private CharSequence f10297b;

    /* renamed from: c, reason: collision with root package name */
    private Drawable f10298c;

    /* renamed from: d, reason: collision with root package name */
    e.b f10299d;

    /* renamed from: e, reason: collision with root package name */
    private I f10300e;

    /* renamed from: f, reason: collision with root package name */
    b f10301f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f10302g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f10303h;

    /* renamed from: i, reason: collision with root package name */
    private int f10304i;

    /* renamed from: j, reason: collision with root package name */
    private int f10305j;

    /* renamed from: k, reason: collision with root package name */
    private int f10306k;

    private class a extends I {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.I
        public j.e b() {
            b bVar = ActionMenuItemView.this.f10301f;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.I
        protected boolean c() {
            j.e b4;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f10299d;
            return bVar != null && bVar.a(actionMenuItemView.f10296a) && (b4 = b()) != null && b4.isShowing();
        }
    }

    public static abstract class b {
        public abstract j.e a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (i4 < 480) {
            return (i4 >= 640 && i5 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    private void f() {
        boolean z4 = true;
        boolean z5 = !TextUtils.isEmpty(this.f10297b);
        if (this.f10298c != null && (!this.f10296a.B() || (!this.f10302g && !this.f10303h))) {
            z4 = false;
        }
        boolean z6 = z5 & z4;
        setText(z6 ? this.f10297b : null);
        CharSequence contentDescription = this.f10296a.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z6 ? null : this.f10296a.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f10296a.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            e0.a(this, z6 ? null : this.f10296a.getTitle());
        } else {
            e0.a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return d();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return d() && this.f10296a.getIcon() == null;
    }

    public boolean d() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f10296a;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void initialize(g gVar, int i4) {
        this.f10296a = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f10300e == null) {
            this.f10300e = new a();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.f10299d;
        if (bVar != null) {
            bVar.a(this.f10296a);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f10302g = e();
        f();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int i4, int i5) {
        int i6;
        boolean d4 = d();
        if (d4 && (i6 = this.f10305j) >= 0) {
            super.setPadding(i6, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i4, i5);
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f10304i) : this.f10304i;
        if (mode != 1073741824 && this.f10304i > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i5);
        }
        if (d4 || this.f10298c == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f10298c.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        I i4;
        if (this.f10296a.hasSubMenu() && (i4 = this.f10300e) != null && i4.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean prefersCondensedTitle() {
        return true;
    }

    public void setCheckable(boolean z4) {
    }

    public void setChecked(boolean z4) {
    }

    public void setExpandedFormat(boolean z4) {
        if (this.f10303h != z4) {
            this.f10303h = z4;
            g gVar = this.f10296a;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f10298c = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i4 = this.f10306k;
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
        f();
    }

    public void setItemInvoker(e.b bVar) {
        this.f10299d = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i4, int i5, int i6, int i7) {
        this.f10305j = i4;
        super.setPadding(i4, i5, i6, i7);
    }

    public void setPopupCallback(b bVar) {
        this.f10301f = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f10297b = charSequence;
        f();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Resources resources = context.getResources();
        this.f10302g = e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f36575v, i4, 0);
        this.f10304i = obtainStyledAttributes.getDimensionPixelSize(e.j.f36580w, 0);
        obtainStyledAttributes.recycle();
        this.f10306k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f10305j = -1;
        setSaveEnabled(false);
    }
}
