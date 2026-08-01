package m;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class C0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J0 f2912a;

    public C0(J0 j02) {
        this.f2912a = j02;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j2) {
        C0246w0 c0246w0;
        if (i == -1 || (c0246w0 = this.f2912a.f2934c) == null) {
            return;
        }
        c0246w0.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
