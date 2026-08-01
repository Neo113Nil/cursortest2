package E0;

import L.C0002b;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.winfour.winrandom.R;

/* loaded from: classes.dex */
public final class a extends C0002b {
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f140e;

    public /* synthetic */ a(int i, Object obj) {
        this.d = i;
        this.f140e = obj;
    }

    @Override // L.C0002b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 0:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f140e).d);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // L.C0002b
    public final void d(View view, M.j jVar) {
        int i;
        Object obj = this.f140e;
        View.AccessibilityDelegate accessibilityDelegate = this.f506a;
        switch (this.d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = jVar.f615a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f1943e);
                accessibilityNodeInfo.setChecked(checkableImageButton.d);
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = jVar.f615a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) obj).f1953x);
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo3 = jVar.f615a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                com.google.android.material.datepicker.k kVar = (com.google.android.material.datepicker.k) obj;
                accessibilityNodeInfo3.setHintText(kVar.f1895e0.getVisibility() == 0 ? kVar.C().getResources().getString(R.string.mtrl_picker_toggle_to_year_selection) : kVar.C().getResources().getString(R.string.mtrl_picker_toggle_to_day_selection));
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo4 = jVar.f615a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                int i2 = MaterialButtonToggleGroup.f1827k;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                materialButtonToggleGroup.getClass();
                if (view instanceof MaterialButton) {
                    int i3 = 0;
                    for (int i4 = 0; i4 < materialButtonToggleGroup.getChildCount(); i4++) {
                        if (materialButtonToggleGroup.getChildAt(i4) == view) {
                            i = i3;
                            accessibilityNodeInfo4.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).f1824o));
                            break;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i4) instanceof MaterialButton) && materialButtonToggleGroup.c(i4)) {
                                i3++;
                            }
                        }
                    }
                }
                i = -1;
                accessibilityNodeInfo4.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).f1824o));
                break;
        }
    }
}
