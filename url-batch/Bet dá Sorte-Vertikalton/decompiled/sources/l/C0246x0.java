package l;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: l.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0246x0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E0 f3067a;

    public C0246x0(E0 e02) {
        this.f3067a = e02;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j2) {
        C0234r0 c0234r0;
        if (i == -1 || (c0234r0 = this.f3067a.f2825c) == null) {
            return;
        }
        c0234r0.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
