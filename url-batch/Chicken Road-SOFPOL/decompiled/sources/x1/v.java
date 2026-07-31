package x1;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8591a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8592b;

    public /* synthetic */ v(int i, Object obj) {
        this.f8591a = i;
        this.f8592b = obj;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z3) {
        switch (this.f8591a) {
            case 0:
                a0 a0Var = (a0) this.f8592b;
                a0Var.f8336k = a0Var.f8333g.getEnabledAccessibilityServiceList(-1);
                break;
            default:
                z5.k kVar = (z5.k) this.f8592b;
                AutoCompleteTextView autoCompleteTextView = kVar.f9201h;
                if (autoCompleteTextView != null && autoCompleteTextView.getInputType() == 0) {
                    kVar.f9241d.setImportantForAccessibility(z3 ? 2 : 1);
                    break;
                }
                break;
        }
    }
}
