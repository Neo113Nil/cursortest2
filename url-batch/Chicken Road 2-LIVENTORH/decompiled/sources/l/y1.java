package l;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class y1 implements AdapterView.OnItemSelectedListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f2 f2520f;

    public y1(f2 f2Var) {
        this.f2520f = f2Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j4) {
        s1 s1Var;
        if (i == -1 || (s1Var = this.f2520f.f2286h) == null) {
            return;
        }
        s1Var.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
