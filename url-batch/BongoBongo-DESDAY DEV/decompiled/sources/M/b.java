package M;

import L.T;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final N0.k f604a;

    public b(N0.k kVar) {
        this.f604a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f604a.equals(((b) obj).f604a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f604a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        N0.l lVar = (N0.l) this.f604a.f657a;
        AutoCompleteTextView autoCompleteTextView = lVar.f661h;
        if (autoCompleteTextView == null || A1.m.I(autoCompleteTextView)) {
            return;
        }
        int i = z2 ? 2 : 1;
        WeakHashMap weakHashMap = T.f490a;
        lVar.d.setImportantForAccessibility(i);
    }
}
