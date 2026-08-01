package l;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class A0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H0 f3205a;

    public A0(H0 h02) {
        this.f3205a = h02;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j2) {
        C0289u0 c0289u0;
        if (i == -1 || (c0289u0 = this.f3205a.f3231c) == null) {
            return;
        }
        c0289u0.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
