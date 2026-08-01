package R0;

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
import com.clutchquizarena.app.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import java.util.Locale;
import l.C0229o;
import l.E0;
import u0.AbstractC0361a;

/* loaded from: classes.dex */
public final class w extends C0229o {

    /* renamed from: e, reason: collision with root package name */
    public final E0 f747e;

    /* renamed from: f, reason: collision with root package name */
    public final AccessibilityManager f748f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f749g;
    public final int h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f750j;

    /* renamed from: k, reason: collision with root package name */
    public int f751k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f752l;

    public w(Context context, AttributeSet attributeSet) {
        super(T0.a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f749g = new Rect();
        Context context2 = getContext();
        TypedArray f2 = I0.k.f(context2, attributeSet, AbstractC0361a.i, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (f2.hasValue(0) && f2.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.h = f2.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.i = f2.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (f2.hasValue(2)) {
            this.f750j = ColorStateList.valueOf(f2.getColor(2, 0));
        }
        this.f751k = f2.getColor(4, 0);
        this.f752l = A.c.H(context2, f2, 5);
        this.f748f = (AccessibilityManager) context2.getSystemService("accessibility");
        E0 e02 = new E0(context2, null, R.attr.listPopupWindowStyle);
        this.f747e = e02;
        e02.f2859y = true;
        e02.f2860z.setFocusable(true);
        e02.f2849o = this;
        e02.f2860z.setInputMethodMode(2);
        e02.n(getAdapter());
        e02.f2850p = new u(0, this);
        if (f2.hasValue(6)) {
            setSimpleItems(f2.getResourceId(6, 0));
        }
        f2.recycle();
    }

    public static void a(w wVar, Object obj) {
        wVar.setText(wVar.convertSelectionToString(obj), false);
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
        AccessibilityManager accessibilityManager = this.f748f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) != null) {
                for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                    if (accessibilityServiceInfo.getSettingsActivityName() == null || !accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (c()) {
            this.f747e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f750j;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b2 = b();
        return (b2 == null || !b2.f1971E) ? super.getHint() : b2.getHint();
    }

    public float getPopupElevation() {
        return this.i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f751k;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f752l;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b2 = b();
        if (b2 != null && b2.f1971E && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f747e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b2 = b();
            int i3 = 0;
            if (adapter != null && b2 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                E0 e02 = this.f747e;
                int min = Math.min(adapter.getCount(), Math.max(0, !e02.f2860z.isShowing() ? -1 : e02.f2840c.getSelectedItemPosition()) + 15);
                View view = null;
                int i4 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i3) {
                        view = null;
                        i3 = itemViewType;
                    }
                    view = adapter.getView(max, view, b2);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 = Math.max(i4, view.getMeasuredWidth());
                }
                Drawable background = e02.f2860z.getBackground();
                if (background != null) {
                    Rect rect = this.f749g;
                    background.getPadding(rect);
                    i4 += rect.left + rect.right;
                }
                i3 = b2.getEndIconView().getMeasuredWidth() + i4;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z2);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t2) {
        super.setAdapter(t2);
        this.f747e.n(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        E0 e02 = this.f747e;
        if (e02 != null) {
            e02.k(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f750j = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof O0.g) {
            ((O0.g) dropDownBackground).j(this.f750j);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f747e.f2851q = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout b2 = b();
        if (b2 != null) {
            b2.s();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f751k = i;
        if (getAdapter() instanceof v) {
            ((v) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f752l = colorStateList;
        if (getAdapter() instanceof v) {
            ((v) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (c()) {
            this.f747e.i();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new v(this, getContext(), this.h, strArr));
    }
}
