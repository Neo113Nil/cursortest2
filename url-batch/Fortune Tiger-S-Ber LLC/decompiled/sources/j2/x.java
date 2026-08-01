package j2;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.gglhk.bofio.fortunetiger.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import java.util.Locale;
import k.c2;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class x extends k.o {

    /* renamed from: j, reason: collision with root package name */
    public final c2 f2388j;

    /* renamed from: k, reason: collision with root package name */
    public final AccessibilityManager f2389k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f2390l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f2391m;

    /* renamed from: n, reason: collision with root package name */
    public final int f2392n;

    /* renamed from: o, reason: collision with root package name */
    public final float f2393o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f2394p;

    /* renamed from: q, reason: collision with root package name */
    public int f2395q;

    /* renamed from: r, reason: collision with root package name */
    public ColorStateList f2396r;

    public x(Context context, AttributeSet attributeSet) {
        super(l2.a.b(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f2390l = new int[]{android.R.attr.state_selected};
        this.f2391m = new Rect();
        Context context2 = getContext();
        TypedArray e4 = a2.p.e(context2, attributeSet, l1.a.f2864j, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (e4.hasValue(0) && e4.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f2392n = e4.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f2393o = e4.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (e4.hasValue(2)) {
            this.f2394p = ColorStateList.valueOf(e4.getColor(2, 0));
        }
        this.f2395q = e4.getColor(4, 0);
        this.f2396r = k3.m.u(context2, e4, 5);
        this.f2389k = (AccessibilityManager) context2.getSystemService("accessibility");
        c2 c2Var = new c2(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f2388j = c2Var;
        c2Var.D = true;
        c2Var.E.setFocusable(true);
        c2Var.f2520t = this;
        c2Var.E.setInputMethodMode(2);
        c2Var.p(getAdapter());
        c2Var.f2521u = new v(0, this);
        if (e4.hasValue(6)) {
            setSimpleItems(e4.getResourceId(6, 0));
        }
        e4.recycle();
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
        AccessibilityManager accessibilityManager = this.f2389k;
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
            this.f2388j.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f2394p;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b2 = b();
        return (b2 == null || !b2.K) ? super.getHint() : b2.getHint();
    }

    public float getPopupElevation() {
        return this.f2393o;
    }

    public int getSimpleItemSelectedColor() {
        return this.f2395q;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f2396r;
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean isPopupShowing() {
        c2 c2Var = this.f2388j;
        if (c2Var == null || !c2Var.E.isShowing()) {
            return super.isPopupShowing();
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b2 = b();
        if (b2 != null && b2.K && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2388j.dismiss();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (isPopupShowing()) {
            return super.onKeyDown(i4, keyEvent);
        }
        boolean z3 = i4 == 66 || i4 == 23;
        boolean z4 = i4 == 62;
        if (getKeyListener() == null ? !(z3 || z4) : !(z3 && getMaxLines() == 1)) {
            return super.onKeyDown(i4, keyEvent);
        }
        TextInputLayout b2 = b();
        if (b2 != null) {
            b2.getEndIconView().performClick();
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b2 = b();
            int i6 = 0;
            if (adapter != null && b2 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                c2 c2Var = this.f2388j;
                int min = Math.min(adapter.getCount(), Math.max(0, !c2Var.E.isShowing() ? -1 : c2Var.h.getSelectedItemPosition()) + 15);
                View view = null;
                int i7 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i6) {
                        view = null;
                        i6 = itemViewType;
                    }
                    view = adapter.getView(max, view, b2);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i7 = Math.max(i7, view.getMeasuredWidth());
                }
                Drawable background = c2Var.E.getBackground();
                if (background != null) {
                    Rect rect = this.f2391m;
                    background.getPadding(rect);
                    i7 += rect.left + rect.right;
                }
                i6 = b2.getEndIconView().getMeasuredWidth() + i7;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i6), View.MeasureSpec.getSize(i4)), getMeasuredHeight());
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
    public <T extends ListAdapter & Filterable> void setAdapter(T t3) {
        super.setAdapter(t3);
        this.f2388j.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        c2 c2Var = this.f2388j;
        if (c2Var != null) {
            c2Var.h(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i4) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i4));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f2394p = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof g2.j) {
            ((g2.j) dropDownBackground).q(this.f2394p);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f2388j.f2522v = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i4) {
        super.setRawInputType(i4);
        TextInputLayout b2 = b();
        if (b2 != null) {
            b2.u();
        }
    }

    public void setSimpleItemSelectedColor(int i4) {
        this.f2395q = i4;
        if (getAdapter() instanceof w) {
            ((w) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f2396r = colorStateList;
        if (getAdapter() instanceof w) {
            ((w) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i4) {
        setSimpleItems(getResources().getStringArray(i4));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (c()) {
            this.f2388j.c();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new w(this, getContext(), this.f2392n, strArr));
    }
}
