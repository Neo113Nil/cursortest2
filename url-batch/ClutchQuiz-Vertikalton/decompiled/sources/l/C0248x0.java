package l;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: l.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0248x0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E0 f3082a;

    public C0248x0(E0 e02) {
        this.f3082a = e02;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j2) {
        C0236r0 c0236r0;
        if (i == -1 || (c0236r0 = this.f3082a.f2840c) == null) {
            return;
        }
        c0236r0.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
