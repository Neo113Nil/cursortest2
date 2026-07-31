package l5;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f extends q3.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f4867e;

    public /* synthetic */ f(View view, int i) {
        this.f4866d = i;
        this.f4867e = view;
    }

    @Override // q3.b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f4866d) {
            case 1:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f4867e).f1930g);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // q3.b
    public final void d(View view, r3.f fVar) {
        int i;
        int i8 = this.f4866d;
        View view2 = this.f4867e;
        View.AccessibilityDelegate accessibilityDelegate = this.f6076a;
        switch (i8) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = fVar.f6557a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) view2;
                int i9 = MaterialButtonToggleGroup.f1890t;
                if (view instanceof MaterialButton) {
                    int i10 = 0;
                    for (int i11 = 0; i11 < materialButtonToggleGroup.getChildCount(); i11++) {
                        if (materialButtonToggleGroup.getChildAt(i11) == view) {
                            i = i10;
                            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).f1881r));
                            break;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i11) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i11).getVisibility() != 8) {
                                i10++;
                            }
                        }
                    }
                }
                i = -1;
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).f1881r));
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = fVar.f6557a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                CheckableImageButton checkableImageButton = (CheckableImageButton) view2;
                accessibilityNodeInfo2.setCheckable(checkableImageButton.f1931h);
                accessibilityNodeInfo2.setChecked(checkableImageButton.f1930g);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo3 = fVar.f6557a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCheckable(((NavigationMenuItemView) view2).A);
                break;
        }
    }
}
