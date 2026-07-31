package z5;

import android.view.View;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9180a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f9181b;

    public /* synthetic */ b(p pVar, int i) {
        this.f9180a = i;
        this.f9181b = pVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z3) {
        switch (this.f9180a) {
            case 0:
                e eVar = (e) this.f9181b;
                eVar.s(eVar.t());
                break;
            default:
                k kVar = (k) this.f9181b;
                kVar.f9204l = z3;
                kVar.p();
                if (!z3) {
                    kVar.s(false);
                    kVar.f9205m = false;
                    break;
                }
                break;
        }
    }
}
