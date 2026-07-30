package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class re1 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ ye1 m;

    public re1(ye1 ye1Var) {
        this.m = ye1Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ne0 ne0Var;
        if (i == -1 || (ne0Var = this.m.o) == null) {
            return;
        }
        ne0Var.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
