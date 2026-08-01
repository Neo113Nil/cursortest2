package U0;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class s extends View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f1196a;

    public s(t tVar) {
        this.f1196a = tVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.f1196a.h.getEditText();
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}
