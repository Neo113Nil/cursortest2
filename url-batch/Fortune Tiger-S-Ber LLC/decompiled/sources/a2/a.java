package a2;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.gglhk.bofio.fortunetiger.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a extends k0.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4e;

    public /* synthetic */ a(int i4, Object obj) {
        this.f3d = i4;
        this.f4e = obj;
    }

    @Override // k0.b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f3d) {
            case 0:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f4e).f1364i);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // k0.b
    public final void d(View view, l0.e eVar) {
        int i4;
        int i5 = this.f3d;
        Object obj = this.f4e;
        View.AccessibilityDelegate accessibilityDelegate = this.f2714a;
        switch (i5) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = eVar.f2855a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f1365j);
                accessibilityNodeInfo.setChecked(checkableImageButton.f1364i);
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = eVar.f2855a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) obj;
                accessibilityNodeInfo2.setCheckable(navigationMenuItemView.C);
                accessibilityNodeInfo2.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", navigationMenuItemView.getResources().getString(R.string.item_view_role_description));
                break;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, eVar.f2855a);
                com.google.android.material.datepicker.l lVar = (com.google.android.material.datepicker.l) obj;
                eVar.b(new l0.d(lVar.f1299j0.getVisibility() == 0 ? lVar.k(R.string.mtrl_picker_toggle_to_year_selection) : lVar.k(R.string.mtrl_picker_toggle_to_day_selection), 16));
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo3 = eVar.f2855a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i6 = MaterialButtonToggleGroup.f1245x;
                if (view instanceof MaterialButton) {
                    int i7 = 0;
                    for (int i8 = 0; i8 < materialButtonToggleGroup.getChildCount(); i8++) {
                        if (materialButtonToggleGroup.getChildAt(i8) == view) {
                            i4 = i7;
                            accessibilityNodeInfo3.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i4, 1, false, ((MaterialButton) view).f1244z));
                            break;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i8) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i8).getVisibility() != 8) {
                                i7++;
                            }
                        }
                    }
                }
                i4 = -1;
                accessibilityNodeInfo3.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i4, 1, false, ((MaterialButton) view).f1244z));
                break;
        }
    }
}
