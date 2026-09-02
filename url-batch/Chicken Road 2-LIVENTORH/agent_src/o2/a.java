package o2;

import android.view.View;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2873a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f2874b;

    public /* synthetic */ a(p pVar, int i) {
        this.f2873a = i;
        this.f2874b = pVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z3) {
        switch (this.f2873a) {
            case 0:
                d dVar = (d) this.f2874b;
                dVar.s(dVar.t());
                break;
            default:
                k kVar = (k) this.f2874b;
                kVar.f2899l = z3;
                kVar.p();
                if (!z3) {
                    kVar.s(false);
                    kVar.f2900m = false;
                    break;
                }
                break;
        }
    }
}
