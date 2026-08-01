package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class er implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ lr f;

    public er(lr lrVar) {
        this.f = lrVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        dg dgVar;
        if (i == -1 || (dgVar = this.f.h) == null) {
            return;
        }
        dgVar.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
