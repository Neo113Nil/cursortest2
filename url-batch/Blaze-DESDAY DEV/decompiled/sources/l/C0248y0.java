package l;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: l.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0248y0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F0 f3055a;

    public C0248y0(F0 f02) {
        this.f3055a = f02;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j2) {
        C0236s0 c0236s0;
        if (i == -1 || (c0236s0 = this.f3055a.f2810c) == null) {
            return;
        }
        c0236s0.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
