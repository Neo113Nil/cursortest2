package L;

import K.S;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final P.b f453a;

    public b(P.b bVar) {
        this.f453a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f453a.equals(((b) obj).f453a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f453a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        P0.k kVar = (P0.k) this.f453a.f581a;
        AutoCompleteTextView autoCompleteTextView = kVar.h;
        if (autoCompleteTextView == null || u1.l.M(autoCompleteTextView)) {
            return;
        }
        int i = z2 ? 2 : 1;
        WeakHashMap weakHashMap = S.f351a;
        kVar.d.setImportantForAccessibility(i);
    }
}
