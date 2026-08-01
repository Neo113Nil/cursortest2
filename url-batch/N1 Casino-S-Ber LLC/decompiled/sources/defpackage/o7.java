package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.derinko.gbini.n1casino.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class o7 extends w {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o7(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.w
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

    @Override // defpackage.w
    public final void d(View view, i0 i0Var) {
        int i;
        int i2 = this.d;
        Object obj = this.e;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        switch (i2) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = i0Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                i0Var.a(1048576);
                accessibilityNodeInfo.setDismissable(true);
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = i0Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                if (((l8) obj).p) {
                    i0Var.a(1048576);
                    accessibilityNodeInfo2.setDismissable(true);
                    break;
                } else {
                    accessibilityNodeInfo2.setDismissable(false);
                    break;
                }
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo3 = i0Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo3.setCheckable(checkableImageButton.j);
                accessibilityNodeInfo3.setChecked(checkableImageButton.i);
                break;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo4 = i0Var.a;
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
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, i0Var.a);
                os osVar = (os) obj;
                i0Var.b(new c0(osVar.j0.getVisibility() == 0 ? osVar.l(R.string.mtrl_picker_toggle_to_year_selection) : osVar.l(R.string.mtrl_picker_toggle_to_day_selection), 16));
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo5 = i0Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo5);
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) obj;
                accessibilityNodeInfo5.setCheckable(navigationMenuItemView.C);
                accessibilityNodeInfo5.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", navigationMenuItemView.getResources().getString(R.string.item_view_role_description));
                break;
        }
    }

    @Override // defpackage.w
    public boolean g(View view, int i, Bundle bundle) {
        int i2 = this.d;
        Object obj = this.e;
        switch (i2) {
            case 0:
                if (i != 1048576) {
                    break;
                } else {
                    ((w20) ((s7) obj)).a(3);
                    break;
                }
            case 1:
                if (i == 1048576) {
                    l8 l8Var = (l8) obj;
                    if (l8Var.p) {
                        l8Var.cancel();
                        break;
                    }
                }
                break;
        }
        return super.g(view, i, bundle);
    }
}
