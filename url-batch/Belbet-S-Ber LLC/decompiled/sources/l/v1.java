package l;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class v1 implements AdapterView.OnItemSelectedListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c2 f2597f;

    public v1(c2 c2Var) {
        this.f2597f = c2Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j2) {
        p1 p1Var;
        if (i == -1 || (p1Var = this.f2597f.h) == null) {
            return;
        }
        p1Var.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
