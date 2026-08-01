package com.google.android.material.datepicker;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.oriondriftchasers.arordrft.R;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class j extends n0.b {
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f918e;

    public /* synthetic */ j(int i, Object obj) {
        this.d = i;
        this.f918e = obj;
    }

    @Override // n0.b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 1:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f918e).i);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // n0.b
    public final void d(View view, o0.e eVar) {
        int i;
        int i4 = this.d;
        Object obj = this.f918e;
        View.AccessibilityDelegate accessibilityDelegate = this.f2714a;
        switch (i4) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, eVar.f2861a);
                m mVar = (m) obj;
                eVar.b(new o0.c(mVar.f930j0.getVisibility() == 0 ? mVar.C().getResources().getString(R.string.mtrl_picker_toggle_to_year_selection) : mVar.C().getResources().getString(R.string.mtrl_picker_toggle_to_day_selection), 16));
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo = eVar.f2861a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f980j);
                accessibilityNodeInfo.setChecked(checkableImageButton.i);
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo2 = eVar.f2861a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) obj).C);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo3 = eVar.f2861a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i5 = MaterialButtonToggleGroup.f865v;
                if (view instanceof MaterialButton) {
                    int i6 = 0;
                    for (int i7 = 0; i7 < materialButtonToggleGroup.getChildCount(); i7++) {
                        if (materialButtonToggleGroup.getChildAt(i7) == view) {
                            i = i6;
                            accessibilityNodeInfo3.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).f858t));
                            break;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i7) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i7).getVisibility() != 8) {
                                i6++;
                            }
                        }
                    }
                }
                i = -1;
                accessibilityNodeInfo3.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).f858t));
                break;
        }
    }
}
