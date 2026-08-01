package N;

import M.P;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Q0.k f867a;

    public b(Q0.k kVar) {
        this.f867a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f867a.equals(((b) obj).f867a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f867a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        Q0.l lVar = (Q0.l) this.f867a.f1023a;
        AutoCompleteTextView autoCompleteTextView = lVar.f1026h;
        if (autoCompleteTextView == null || H1.d.O(autoCompleteTextView)) {
            return;
        }
        int i = z2 ? 2 : 1;
        WeakHashMap weakHashMap = P.f711a;
        lVar.f1065d.setImportantForAccessibility(i);
    }
}
