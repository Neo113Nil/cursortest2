package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.moontiko.really.admiralcasino.R;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class a8 extends y {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a8(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.y
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 2:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.e).i);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // defpackage.y
    public final void d(View view, k0 k0Var) {
        int i;
        int i2 = this.d;
        Object obj = this.e;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        switch (i2) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = k0Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                k0Var.a(1048576);
                accessibilityNodeInfo.setDismissable(true);
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = k0Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                if (((z8) obj).p) {
                    k0Var.a(1048576);
                    accessibilityNodeInfo2.setDismissable(true);
                    break;
                } else {
                    accessibilityNodeInfo2.setDismissable(false);
                    break;
                }
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo3 = k0Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo3.setCheckable(checkableImageButton.j);
                accessibilityNodeInfo3.setChecked(checkableImageButton.i);
                break;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo4 = k0Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i3 = MaterialButtonToggleGroup.x;
                if (view instanceof MaterialButton) {
                    int i4 = 0;
                    for (int i5 = 0; i5 < materialButtonToggleGroup.getChildCount(); i5++) {
                        if (materialButtonToggleGroup.getChildAt(i5) == view) {
                            i = i4;
                            accessibilityNodeInfo4.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).z));
                            break;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i5) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i5).getVisibility() != 8) {
                                i4++;
                            }
                        }
                    }
                }
                i = -1;
                accessibilityNodeInfo4.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).z));
                break;
            case 4:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, k0Var.a);
                pv pvVar = (pv) obj;
                k0Var.b(new e0(pvVar.j0.getVisibility() == 0 ? pvVar.k(R.string.mtrl_picker_toggle_to_year_selection) : pvVar.k(R.string.mtrl_picker_toggle_to_day_selection), 16));
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo5 = k0Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo5);
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) obj;
                accessibilityNodeInfo5.setCheckable(navigationMenuItemView.C);
                accessibilityNodeInfo5.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", navigationMenuItemView.getResources().getString(R.string.item_view_role_description));
                break;
        }
    }

    @Override // defpackage.y
    public boolean g(View view, int i, Bundle bundle) {
        int i2 = this.d;
        Object obj = this.e;
        switch (i2) {
            case 0:
                if (i != 1048576) {
                    break;
                } else {
                    ((y50) ((f8) obj)).a(3);
                    break;
                }
            case 1:
                if (i == 1048576) {
                    z8 z8Var = (z8) obj;
                    if (z8Var.p) {
                        z8Var.cancel();
                        break;
                    }
                }
                break;
        }
        return super.g(view, i, bundle);
    }
}
