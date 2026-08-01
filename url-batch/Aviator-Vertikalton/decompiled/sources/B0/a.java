package B0;

import K.C0002b;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.fortuneink.neonpad.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* loaded from: classes.dex */
public final class a extends C0002b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f61d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f62e;

    public /* synthetic */ a(int i, Object obj) {
        this.f61d = i;
        this.f62e = obj;
    }

    @Override // K.C0002b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f61d) {
            case 0:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f62e).f1939d);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // K.C0002b
    public final void d(View view, L.j jVar) {
        Object obj = this.f62e;
        View.AccessibilityDelegate accessibilityDelegate = this.f426a;
        switch (this.f61d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = jVar.f665a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f1940e);
                accessibilityNodeInfo.setChecked(checkableImageButton.f1939d);
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = jVar.f665a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) obj).f1950x);
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo3 = jVar.f665a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                com.google.android.material.datepicker.k kVar = (com.google.android.material.datepicker.k) obj;
                accessibilityNodeInfo3.setHintText(kVar.f1888e0.getVisibility() == 0 ? kVar.y().getResources().getString(R.string.mtrl_picker_toggle_to_year_selection) : kVar.y().getResources().getString(R.string.mtrl_picker_toggle_to_day_selection));
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, jVar.f665a);
                int i = MaterialButtonToggleGroup.f1821k;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                materialButtonToggleGroup.getClass();
                int i2 = -1;
                if (view instanceof MaterialButton) {
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        if (i3 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i3) == view) {
                                i2 = i4;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i3) instanceof MaterialButton) && materialButtonToggleGroup.c(i3)) {
                                    i4++;
                                }
                                i3++;
                            }
                        }
                    }
                }
                jVar.h(L.i.a(((MaterialButton) view).f1818o, 0, 1, i2, 1));
                break;
        }
    }
}
