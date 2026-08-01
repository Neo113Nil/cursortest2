package H0;

import M.C0006b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.winpower.neonfit.R;
import y0.DialogC0426e;

/* loaded from: classes.dex */
public final class a extends C0006b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f459d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(int i, Object obj) {
        this.f459d = i;
        this.e = obj;
    }

    @Override // M.C0006b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f459d) {
            case 0:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.e).f2437d);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // M.C0006b
    public final void d(View view, N.i iVar) {
        Object obj = this.e;
        View.AccessibilityDelegate accessibilityDelegate = this.f728a;
        switch (this.f459d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = iVar.f878a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.e);
                accessibilityNodeInfo.setChecked(checkableImageButton.f2437d);
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = iVar.f878a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) obj).f2448x);
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo3 = iVar.f878a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                com.google.android.material.datepicker.k kVar = (com.google.android.material.datepicker.k) obj;
                accessibilityNodeInfo3.setHintText(kVar.f2388e0.getVisibility() == 0 ? kVar.C().getResources().getString(R.string.mtrl_picker_toggle_to_year_selection) : kVar.C().getResources().getString(R.string.mtrl_picker_toggle_to_day_selection));
                break;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo4 = iVar.f878a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                if (!((DialogC0426e) obj).j) {
                    accessibilityNodeInfo4.setDismissable(false);
                    break;
                } else {
                    iVar.a(1048576);
                    accessibilityNodeInfo4.setDismissable(true);
                    break;
                }
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, iVar.f878a);
                int i = MaterialButtonToggleGroup.f2323k;
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
                iVar.h(N.h.a(((MaterialButton) view).f2320o, 0, 1, i2, 1));
                break;
        }
    }

    @Override // M.C0006b
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.f459d) {
            case 3:
                if (i == 1048576) {
                    DialogC0426e dialogC0426e = (DialogC0426e) this.e;
                    if (dialogC0426e.j) {
                        dialogC0426e.cancel();
                        break;
                    }
                }
                break;
        }
        return super.g(view, i, bundle);
    }
}
