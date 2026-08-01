package s2;

import android.view.View;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3236a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f3237b;

    public /* synthetic */ a(q qVar, int i) {
        this.f3236a = i;
        this.f3237b = qVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        switch (this.f3236a) {
            case 0:
                d dVar = (d) this.f3237b;
                dVar.s(dVar.t());
                break;
            default:
                k kVar = (k) this.f3237b;
                kVar.f3259l = z4;
                kVar.p();
                if (!z4) {
                    kVar.s(false);
                    kVar.f3260m = false;
                    break;
                }
                break;
        }
    }
}
