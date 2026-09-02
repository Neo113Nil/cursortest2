package o2;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import com.oriondriftchasers.arordrft.R;
import java.util.List;
import java.util.Locale;
import l.f2;
import l.m0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class u extends l.p {

    /* renamed from: j, reason: collision with root package name */
    public final f2 f2966j;

    /* renamed from: k, reason: collision with root package name */
    public final AccessibilityManager f2967k;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f2968l;

    /* renamed from: m, reason: collision with root package name */
    public final int f2969m;

    /* renamed from: n, reason: collision with root package name */
    public final float f2970n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f2971o;

    /* renamed from: p, reason: collision with root package name */
    public int f2972p;

    /* renamed from: q, reason: collision with root package name */
    public ColorStateList f2973q;

    public u(Context context, AttributeSet attributeSet) {
        super(q2.a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f2968l = new Rect();
        Context context2 = getContext();
        TypedArray f2 = e2.o.f(context2, attributeSet, n1.a.f2818k, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (f2.hasValue(0) && f2.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f2969m = f2.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f2970n = f2.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (f2.hasValue(2)) {
            this.f2971o = ColorStateList.valueOf(f2.getColor(2, 0));
        }
        this.f2972p = f2.getColor(4, 0);
        this.f2973q = h.a.t(context2, f2, 5);
        this.f2967k = (AccessibilityManager) context2.getSystemService("accessibility");
        f2 f2Var = new f2(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f2966j = f2Var;
        f2Var.D = true;
        f2Var.E.setFocusable(true);
        f2Var.f2297t = this;
        f2Var.E.setInputMethodMode(2);
        f2Var.o(getAdapter());
        f2Var.f2298u = new m0(1, this);
        if (f2.hasValue(6)) {
            setSimpleItems(f2.getResourceId(6, 0));
        }
        f2.recycle();
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f2967k;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (c()) {
            this.f2966j.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f2971o;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b4 = b();
        return (b4 == null || !b4.K) ? super.getHint() : b4.getHint();
    }

    public float getPopupElevation() {
        return this.f2970n;
    }

    public int getSimpleItemSelectedColor() {
        return this.f2972p;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f2973q;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b4 = b();
        if (b4 != null && b4.K && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2966j.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b4 = b();
            int i5 = 0;
            if (adapter != null && b4 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                f2 f2Var = this.f2966j;
                int min = Math.min(adapter.getCount(), Math.max(0, !f2Var.E.isShowing() ? -1 : f2Var.f2286h.getSelectedItemPosition()) + 15);
                View view = null;
                int i6 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i5) {
                        view = null;
                        i5 = itemViewType;
                    }
                    view = adapter.getView(max, view, b4);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i6 = Math.max(i6, view.getMeasuredWidth());
                }
                Drawable background = f2Var.E.getBackground();
                if (background != null) {
                    Rect rect = this.f2968l;
                    background.getPadding(rect);
                    i6 += rect.left + rect.right;
                }
                i5 = b4.getEndIconView().getMeasuredWidth() + i6;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i5), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z3);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t2) {
        super.setAdapter(t2);
        this.f2966j.o(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        f2 f2Var = this.f2966j;
        if (f2Var != null) {
            f2Var.m(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f2971o = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof l2.j) {
            ((l2.j) dropDownBackground).q(this.f2971o);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f2966j.f2299v = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout b4 = b();
        if (b4 != null) {
            b4.u();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f2972p = i;
        if (getAdapter() instanceof t) {
            ((t) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f2973q = colorStateList;
        if (getAdapter() instanceof t) {
            ((t) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (c()) {
            this.f2966j.f();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new t(this, getContext(), this.f2969m, strArr));
    }
}
