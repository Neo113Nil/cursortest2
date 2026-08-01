package s2;

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
import com.gdmhkmf.belbet.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import java.util.Locale;
import l.c2;
import l.j0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class u extends l.n {

    /* renamed from: j, reason: collision with root package name */
    public final c2 f3325j;

    /* renamed from: k, reason: collision with root package name */
    public final AccessibilityManager f3326k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f3327l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f3328m;

    /* renamed from: n, reason: collision with root package name */
    public final int f3329n;

    /* renamed from: o, reason: collision with root package name */
    public final float f3330o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f3331p;

    /* renamed from: q, reason: collision with root package name */
    public int f3332q;

    /* renamed from: r, reason: collision with root package name */
    public ColorStateList f3333r;

    public u(Context context, AttributeSet attributeSet) {
        super(u2.a.b(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f3327l = new int[]{android.R.attr.state_selected};
        this.f3328m = new Rect();
        Context context2 = getContext();
        TypedArray e4 = i2.o.e(context2, attributeSet, q1.a.f3150n, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (e4.hasValue(0) && e4.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f3329n = e4.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f3330o = e4.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (e4.hasValue(2)) {
            this.f3331p = ColorStateList.valueOf(e4.getColor(2, 0));
        }
        this.f3332q = e4.getColor(4, 0);
        this.f3333r = b4.l.r(context2, e4, 5);
        this.f3326k = (AccessibilityManager) context2.getSystemService("accessibility");
        c2 c2Var = new c2(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f3325j = c2Var;
        c2Var.D = true;
        c2Var.E.setFocusable(true);
        c2Var.f2419t = this;
        c2Var.E.setInputMethodMode(2);
        c2Var.p(getAdapter());
        c2Var.f2420u = new j0(1, this);
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
        AccessibilityManager accessibilityManager = this.f3326k;
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
            this.f3325j.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f3331p;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b2 = b();
        return (b2 == null || !b2.K) ? super.getHint() : b2.getHint();
    }

    public float getPopupElevation() {
        return this.f3330o;
    }

    public int getSimpleItemSelectedColor() {
        return this.f3332q;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f3333r;
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean isPopupShowing() {
        c2 c2Var = this.f3325j;
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
        this.f3325j.dismiss();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isPopupShowing()) {
            return super.onKeyDown(i, keyEvent);
        }
        boolean z4 = i == 66 || i == 23;
        boolean z5 = i == 62;
        if (getKeyListener() == null ? !(z4 || z5) : !(z4 && getMaxLines() == 1)) {
            return super.onKeyDown(i, keyEvent);
        }
        TextInputLayout b2 = b();
        if (b2 != null) {
            b2.getEndIconView().performClick();
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b2 = b();
            int i5 = 0;
            if (adapter != null && b2 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                c2 c2Var = this.f3325j;
                int min = Math.min(adapter.getCount(), Math.max(0, !c2Var.E.isShowing() ? -1 : c2Var.h.getSelectedItemPosition()) + 15);
                View view = null;
                int i6 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i5) {
                        view = null;
                        i5 = itemViewType;
                    }
                    view = adapter.getView(max, view, b2);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i6 = Math.max(i6, view.getMeasuredWidth());
                }
                Drawable background = c2Var.E.getBackground();
                if (background != null) {
                    Rect rect = this.f3328m;
                    background.getPadding(rect);
                    i6 += rect.left + rect.right;
                }
                i5 = b2.getEndIconView().getMeasuredWidth() + i6;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i5), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z4) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z4);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t4) {
        super.setAdapter(t4);
        this.f3325j.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        c2 c2Var = this.f3325j;
        if (c2Var != null) {
            c2Var.i(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f3331p = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof o2.j) {
            ((o2.j) dropDownBackground).r(this.f3331p);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f3325j.f2421v = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout b2 = b();
        if (b2 != null) {
            b2.u();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f3332q = i;
        if (getAdapter() instanceof t) {
            ((t) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f3333r = colorStateList;
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
            this.f3325j.e();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new t(this, getContext(), this.f3329n, strArr));
    }
}
