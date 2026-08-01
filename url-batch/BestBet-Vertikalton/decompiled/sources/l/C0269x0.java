package l;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: l.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0269x0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E0 f3501a;

    public C0269x0(E0 e02) {
        this.f3501a = e02;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j2) {
        C0257r0 c0257r0;
        if (i == -1 || (c0257r0 = this.f3501a.f3263c) == null) {
            return;
        }
        c0257r0.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
