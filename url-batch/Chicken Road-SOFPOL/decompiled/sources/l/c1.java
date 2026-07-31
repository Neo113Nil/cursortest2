package l;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c1 implements AdapterView.OnItemSelectedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j1 f4224d;

    public c1(j1 j1Var) {
        this.f4224d = j1Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j7) {
        n1 n1Var;
        if (i == -1 || (n1Var = this.f4224d.f4299f) == null) {
            return;
        }
        n1Var.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
