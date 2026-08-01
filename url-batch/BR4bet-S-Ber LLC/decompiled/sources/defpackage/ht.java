package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ht implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ pt f;

    public ht(pt ptVar) {
        this.f = ptVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        mi miVar;
        if (i == -1 || (miVar = this.f.h) == null) {
            return;
        }
        miVar.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
