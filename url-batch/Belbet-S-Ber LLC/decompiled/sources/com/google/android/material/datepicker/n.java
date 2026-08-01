package com.google.android.material.datepicker;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.gdmhkmf.belbet.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class n extends n0.b {
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1081e;

    public /* synthetic */ n(int i, Object obj) {
        this.d = i;
        this.f1081e = obj;
    }

    @Override // n0.b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 1:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f1081e).i);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // n0.b
    public final void d(View view, o0.g gVar) {
        int i = this.d;
        Object obj = this.f1081e;
        View.AccessibilityDelegate accessibilityDelegate = this.f2757a;
        switch (i) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, gVar.f2882a);
                q qVar = (q) obj;
                gVar.b(new o0.c(qVar.f1094k0.getVisibility() == 0 ? qVar.k(R.string.mtrl_picker_toggle_to_year_selection) : qVar.k(R.string.mtrl_picker_toggle_to_day_selection), 16));
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo = gVar.f2882a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f1172j);
                accessibilityNodeInfo.setChecked(checkableImageButton.i);
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo2 = gVar.f2882a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) obj;
                accessibilityNodeInfo2.setCheckable(navigationMenuItemView.C);
                accessibilityNodeInfo2.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", navigationMenuItemView.getResources().getString(R.string.item_view_role_description));
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, gVar.f2882a);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i4 = MaterialButtonToggleGroup.f982x;
                int i5 = -1;
                if (view instanceof MaterialButton) {
                    int i6 = 0;
                    int i7 = 0;
                    while (true) {
                        if (i6 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i6) == view) {
                                i5 = i7;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i6) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i6).getVisibility() != 8) {
                                    i7++;
                                }
                                i6++;
                            }
                        }
                    }
                }
                gVar.i(o0.f.a(((MaterialButton) view).f981z, 0, 1, i5, 1));
                break;
        }
    }
}
