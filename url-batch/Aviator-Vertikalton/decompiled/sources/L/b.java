package L;

import K.X;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final K0.k f653a;

    public b(K0.k kVar) {
        this.f653a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f653a.equals(((b) obj).f653a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f653a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        K0.l lVar = (K0.l) this.f653a.f551a;
        AutoCompleteTextView autoCompleteTextView = lVar.h;
        if (autoCompleteTextView == null || q1.d.J(autoCompleteTextView)) {
            return;
        }
        int i = z2 ? 2 : 1;
        WeakHashMap weakHashMap = X.f418a;
        lVar.f595d.setImportantForAccessibility(i);
    }
}
