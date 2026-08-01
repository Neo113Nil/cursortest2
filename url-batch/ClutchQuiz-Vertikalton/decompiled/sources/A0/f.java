package A0;

import K.C0001b;
import L.j;
import L.k;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.clutchquizarena.app.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* loaded from: classes.dex */
public final class f extends C0001b {
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f23e;

    public /* synthetic */ f(int i, Object obj) {
        this.d = i;
        this.f23e = obj;
    }

    @Override // K.C0001b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 1:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f23e).d);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // K.C0001b
    public final void d(View view, k kVar) {
        Object obj = this.f23e;
        View.AccessibilityDelegate accessibilityDelegate = this.f377a;
        switch (this.d) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, kVar.f477a);
                int i = MaterialButtonToggleGroup.f1812k;
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
                kVar.h(j.a(((MaterialButton) view).f1809o, 0, 1, i2, 1));
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo = kVar.f477a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f1927e);
                accessibilityNodeInfo.setChecked(checkableImageButton.d);
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo2 = kVar.f477a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) obj).f1937x);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo3 = kVar.f477a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                com.google.android.material.datepicker.k kVar2 = (com.google.android.material.datepicker.k) obj;
                accessibilityNodeInfo3.setHintText(kVar2.f1877e0.getVisibility() == 0 ? kVar2.C().getResources().getString(R.string.mtrl_picker_toggle_to_year_selection) : kVar2.C().getResources().getString(R.string.mtrl_picker_toggle_to_day_selection));
                break;
        }
    }
}
