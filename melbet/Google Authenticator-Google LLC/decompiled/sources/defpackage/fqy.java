package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.google.android.apps.authenticator2.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fqy extends hr {
    public final ki a;
    public final int[] b;
    public final float c;
    public ColorStateList d;
    public final int e;
    public final ColorStateList f;
    private final AccessibilityManager g;
    private final Rect h;
    private final int i;

    public fqy(Context context, AttributeSet attributeSet) {
        super(frj.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, R.attr.autoCompleteTextViewStyle);
        this.b = new int[]{android.R.attr.state_selected};
        this.h = new Rect();
        Context context2 = getContext();
        TypedArray a = fjw.a(context2, attributeSet, fra.a, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (a.hasValue(0) && a.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        int resourceId = a.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.i = resourceId;
        this.c = a.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (a.hasValue(2)) {
            this.d = ColorStateList.valueOf(a.getColor(2, 0));
        }
        this.e = a.getColor(4, 0);
        this.f = fny.e(context2, a, 5);
        this.g = (AccessibilityManager) context2.getSystemService("accessibility");
        ki kiVar = new ki(context2, null, R.attr.listPopupWindowStyle);
        this.a = kiVar;
        kiVar.y();
        kiVar.k = this;
        kiVar.w();
        kiVar.e(getAdapter());
        kiVar.l = new fqw(this, 0);
        if (a.hasValue(6)) {
            setAdapter(new fqx(this, getContext(), resourceId, getResources().getStringArray(a.getResourceId(6, 0))));
        }
        a.recycle();
    }

    private final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.g;
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
            this.a.m();
        } else {
            super.dismissDropDown();
        }
    }

    @Override // android.widget.TextView
    public final CharSequence getHint() {
        TextInputLayout b = b();
        return (b == null || !b.l) ? super.getHint() : b.f();
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean isPopupShowing() {
        ki kiVar = this.a;
        if (kiVar == null || !kiVar.x()) {
            return super.isPopupShowing();
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b = b();
        if (b != null && b.l && super.getHint() == null && fhr.g()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.m();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        TextInputLayout b;
        if (isPopupShowing()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (i != 66) {
            if (i != 23) {
                z = false;
                if (getKeyListener() != null ? !(z || i == 62) : !(z && getMaxLines() == 1)) {
                    return super.onKeyDown(i, keyEvent);
                }
                b = b();
                if (b != null) {
                    b.d().performClick();
                }
                return true;
            }
            i = 23;
        }
        z = true;
        if (getKeyListener() != null) {
            b = b();
            if (b != null) {
            }
            return true;
        }
        b = b();
        if (b != null) {
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b = b();
            int i3 = 0;
            if (adapter != null && b != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                ki kiVar = this.a;
                int min = Math.min(adapter.getCount(), Math.max(0, kiVar.o()) + 15);
                int max = Math.max(0, min - 15);
                View view = null;
                int i4 = 0;
                while (max < min) {
                    int itemViewType = adapter.getItemViewType(max);
                    int i5 = itemViewType != i3 ? itemViewType : i3;
                    if (itemViewType != i3) {
                        view = null;
                    }
                    view = adapter.getView(max, view, b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 = Math.max(i4, view.getMeasuredWidth());
                    max++;
                    i3 = i5;
                }
                Drawable c = kiVar.c();
                if (c != null) {
                    Rect rect = this.h;
                    c.getPadding(rect);
                    i4 += rect.left + rect.right;
                }
                i3 = i4 + b.d().getMeasuredWidth();
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        this.a.e(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        ki kiVar = this.a;
        if (kiVar != null) {
            kiVar.f(drawable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.a.m = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public final void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout b = b();
        if (b != null) {
            b.x();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (c()) {
            this.a.v();
        } else {
            super.showDropDown();
        }
    }
}
