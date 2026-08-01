package l;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: l.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0254y0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F0 f3091a;

    public C0254y0(F0 f02) {
        this.f3091a = f02;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j2) {
        C0242s0 c0242s0;
        if (i == -1 || (c0242s0 = this.f3091a.f2846c) == null) {
            return;
        }
        c0242s0.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
