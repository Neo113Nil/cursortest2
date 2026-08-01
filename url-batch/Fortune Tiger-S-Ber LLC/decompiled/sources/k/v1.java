package k;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class v1 implements AdapterView.OnItemSelectedListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c2 f2681f;

    public v1(c2 c2Var) {
        this.f2681f = c2Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i4, long j4) {
        p1 p1Var;
        if (i4 == -1 || (p1Var = this.f2681f.h) == null) {
            return;
        }
        p1Var.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
