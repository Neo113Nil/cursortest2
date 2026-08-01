package m;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c1 f6200d;

    public v0(c1 c1Var) {
        this.f6200d = c1Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i3, long j) {
        g1 g1Var;
        if (i3 == -1 || (g1Var = this.f6200d.f6041i) == null) {
            return;
        }
        g1Var.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
