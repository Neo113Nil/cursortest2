package L;

import K.S;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final P.b f466a;

    public b(P.b bVar) {
        this.f466a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f466a.equals(((b) obj).f466a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f466a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        R0.k kVar = (R0.k) this.f466a.f595a;
        AutoCompleteTextView autoCompleteTextView = kVar.h;
        if (autoCompleteTextView == null || A.c.b0(autoCompleteTextView)) {
            return;
        }
        int i = z2 ? 2 : 1;
        WeakHashMap weakHashMap = S.f365a;
        kVar.d.setImportantForAccessibility(i);
    }
}
