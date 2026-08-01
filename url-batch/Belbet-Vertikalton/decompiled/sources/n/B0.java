package n;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class B0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I0 f3438a;

    public B0(I0 i02) {
        this.f3438a = i02;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C0305v0 c0305v0;
        if (i == -1 || (c0305v0 = this.f3438a.f3462c) == null) {
            return;
        }
        c0305v0.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
