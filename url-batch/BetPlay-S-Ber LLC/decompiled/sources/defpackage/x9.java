package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.awerser.monnit.betplay.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class x9 extends w {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.w
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.a) {
            case 0:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.b).i);
                break;
            default:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                break;
        }
    }

    @Override // defpackage.w
    public final void onInitializeAccessibilityNodeInfo(View view, i0 i0Var) {
        int i;
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, i0Var);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                boolean z = checkableImageButton.j;
                AccessibilityNodeInfo accessibilityNodeInfo = i0Var.a;
                accessibilityNodeInfo.setCheckable(z);
                accessibilityNodeInfo.setChecked(checkableImageButton.i);
                break;
            case 1:
                super.onInitializeAccessibilityNodeInfo(view, i0Var);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i3 = MaterialButtonToggleGroup.x;
                if (view instanceof MaterialButton) {
                    int i4 = 0;
                    for (int i5 = 0; i5 < materialButtonToggleGroup.getChildCount(); i5++) {
                        if (materialButtonToggleGroup.getChildAt(i5) == view) {
                            i = i4;
                            i0Var.a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).z));
                            break;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i5) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i5).getVisibility() != 8) {
                                i4++;
                            }
                        }
                    }
                }
                i = -1;
                i0Var.a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).z));
                break;
            case 2:
                super.onInitializeAccessibilityNodeInfo(view, i0Var);
                ct ctVar = (ct) obj;
                i0Var.b(new c0(ctVar.q.getVisibility() == 0 ? ctVar.getString(R.string.mtrl_picker_toggle_to_year_selection) : ctVar.getString(R.string.mtrl_picker_toggle_to_day_selection), 16));
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, i0Var);
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) obj;
                boolean z2 = navigationMenuItemView.C;
                AccessibilityNodeInfo accessibilityNodeInfo2 = i0Var.a;
                accessibilityNodeInfo2.setCheckable(z2);
                accessibilityNodeInfo2.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", navigationMenuItemView.getResources().getString(R.string.item_view_role_description));
                break;
        }
    }
}
