package D0;

import K.C0006b;
import L.j;
import T0.i;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.fortunequest.neontrack.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.datepicker.k;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* loaded from: classes.dex */
public final class e extends C0006b {
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f143e;

    public /* synthetic */ e(int i, Object obj) {
        this.d = i;
        this.f143e = obj;
    }

    @Override // K.C0006b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 1:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f143e).d);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // K.C0006b
    public final void d(View view, j jVar) {
        int i;
        Object obj = this.f143e;
        View.AccessibilityDelegate accessibilityDelegate = this.f594a;
        switch (this.d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = jVar.f696a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                int i2 = MaterialButtonToggleGroup.f2210k;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                materialButtonToggleGroup.getClass();
                if (view instanceof MaterialButton) {
                    int i3 = 0;
                    for (int i4 = 0; i4 < materialButtonToggleGroup.getChildCount(); i4++) {
                        if (materialButtonToggleGroup.getChildAt(i4) == view) {
                            i = i3;
                            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).f2207o));
                            break;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i4) instanceof MaterialButton) && materialButtonToggleGroup.c(i4)) {
                                i3++;
                            }
                        }
                    }
                }
                i = -1;
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).f2207o));
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = jVar.f696a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo2.setCheckable(checkableImageButton.f2324e);
                accessibilityNodeInfo2.setChecked(checkableImageButton.d);
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo3 = jVar.f696a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCheckable(((NavigationMenuItemView) obj).f2334x);
                break;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo4 = jVar.f696a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                jVar.a(1048576);
                accessibilityNodeInfo4.setDismissable(true);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo5 = jVar.f696a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo5);
                k kVar = (k) obj;
                accessibilityNodeInfo5.setHintText(kVar.f2275e0.getVisibility() == 0 ? kVar.C().getResources().getString(R.string.mtrl_picker_toggle_to_year_selection) : kVar.C().getResources().getString(R.string.mtrl_picker_toggle_to_day_selection));
                break;
        }
    }

    @Override // K.C0006b
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.d) {
            case 3:
                if (i != 1048576) {
                    break;
                } else {
                    ((T0.j) ((i) this.f143e)).a(3);
                    break;
                }
        }
        return super.g(view, i, bundle);
    }
}
