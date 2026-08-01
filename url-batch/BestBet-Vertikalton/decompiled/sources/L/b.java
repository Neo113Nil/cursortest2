package L;

import K.Q;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final P.b f686a;

    public b(P.b bVar) {
        this.f686a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f686a.equals(((b) obj).f686a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f686a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        U0.k kVar = (U0.k) this.f686a.f857a;
        AutoCompleteTextView autoCompleteTextView = kVar.h;
        if (autoCompleteTextView == null || H1.l.N(autoCompleteTextView)) {
            return;
        }
        int i = z2 ? 2 : 1;
        WeakHashMap weakHashMap = Q.f578a;
        kVar.d.setImportantForAccessibility(i);
    }
}
