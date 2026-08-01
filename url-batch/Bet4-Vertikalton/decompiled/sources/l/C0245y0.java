package l;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: l.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0245y0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F0 f3028a;

    public C0245y0(F0 f02) {
        this.f3028a = f02;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j2) {
        C0233s0 c0233s0;
        if (i == -1 || (c0233s0 = this.f3028a.f2784c) == null) {
            return;
        }
        c0233s0.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
