package l;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: l.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0301z0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G0 f3505a;

    public C0301z0(G0 g02) {
        this.f3505a = g02;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j2) {
        C0289t0 c0289t0;
        if (i == -1 || (c0289t0 = this.f3505a.f3231c) == null) {
            return;
        }
        c0289t0.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
