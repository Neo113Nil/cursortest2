package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.appcompat.R;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.m;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.ForwardingListener;
import android.support.v7.widget.TooltipCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.common.util.CrashUtils;

/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements m.a, ActionMenuView.ActionMenuChildView, View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    MenuItemImpl f1731a;

    /* renamed from: b, reason: collision with root package name */
    MenuBuilder.b f1732b;

    /* renamed from: c, reason: collision with root package name */
    b f1733c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f1734d;
    private Drawable e;
    private ForwardingListener f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private int k;

    public static abstract class b {
        public abstract p getPopup();
    }

    @Override // android.support.v7.view.menu.m.a
    public boolean a() {
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.g = c();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ActionMenuItemView, i, 0);
        this.i = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.j = -1;
        setSaveEnabled(false);
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.g = c();
        d();
    }

    private boolean c() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.j = i;
        super.setPadding(i, i2, i3, i4);
    }

    @Override // android.support.v7.view.menu.m.a
    public MenuItemImpl getItemData() {
        return this.f1731a;
    }

    @Override // android.support.v7.view.menu.m.a
    public void a(MenuItemImpl menuItemImpl, int i) {
        this.f1731a = menuItemImpl;
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.a((m.a) this));
        setId(menuItemImpl.getItemId());
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        setEnabled(menuItemImpl.isEnabled());
        if (menuItemImpl.hasSubMenu() && this.f == null) {
            this.f = new a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f1731a.hasSubMenu() && this.f != null && this.f.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f1732b != null) {
            this.f1732b.invokeItem(this.f1731a);
        }
    }

    public void setItemInvoker(MenuBuilder.b bVar) {
        this.f1732b = bVar;
    }

    public void setPopupCallback(b bVar) {
        this.f1733c = bVar;
    }

    public void setExpandedFormat(boolean z) {
        if (this.h != z) {
            this.h = z;
            if (this.f1731a != null) {
                this.f1731a.g();
            }
        }
    }

    private void d() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1734d);
        if (this.e != null && (!this.f1731a.l() || (!this.g && !this.h))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f1734d : null);
        CharSequence contentDescription = this.f1731a.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z3 ? null : this.f1731a.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f1731a.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            TooltipCompat.setTooltipText(this, z3 ? null : this.f1731a.getTitle());
        } else {
            TooltipCompat.setTooltipText(this, tooltipText);
        }
    }

    public void setIcon(Drawable drawable) {
        this.e = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > this.k) {
                float f = this.k / intrinsicWidth;
                intrinsicWidth = this.k;
                intrinsicHeight = (int) (intrinsicHeight * f);
            }
            if (intrinsicHeight > this.k) {
                float f2 = this.k / intrinsicHeight;
                intrinsicHeight = this.k;
                intrinsicWidth = (int) (intrinsicWidth * f2);
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        d();
    }

    public boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    public void setTitle(CharSequence charSequence) {
        this.f1734d = charSequence;
        d();
    }

    @Override // android.support.v7.widget.ActionMenuView.ActionMenuChildView
    public boolean needsDividerBefore() {
        return b() && this.f1731a.getIcon() == null;
    }

    @Override // android.support.v7.widget.ActionMenuView.ActionMenuChildView
    public boolean needsDividerAfter() {
        return b();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        boolean b2 = b();
        if (b2 && this.j >= 0) {
            super.setPadding(this.j, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.i) : this.i;
        if (mode != 1073741824 && this.i > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, CrashUtils.ErrorDialogData.SUPPRESSED), i2);
        }
        if (b2 || this.e == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.e.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    private class a extends ForwardingListener {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // android.support.v7.widget.ForwardingListener
        public p getPopup() {
            if (ActionMenuItemView.this.f1733c != null) {
                return ActionMenuItemView.this.f1733c.getPopup();
            }
            return null;
        }

        @Override // android.support.v7.widget.ForwardingListener
        protected boolean onForwardingStarted() {
            p popup;
            return ActionMenuItemView.this.f1732b != null && ActionMenuItemView.this.f1732b.invokeItem(ActionMenuItemView.this.f1731a) && (popup = getPopup()) != null && popup.isShowing();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }
}
