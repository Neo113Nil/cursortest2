package R0;

import android.view.View;

/* renamed from: R0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0026b implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f652a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f653b;

    public /* synthetic */ ViewOnFocusChangeListenerC0026b(q qVar, int i) {
        this.f652a = i;
        this.f653b = qVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        switch (this.f652a) {
            case 0:
                e eVar = (e) this.f653b;
                eVar.t(eVar.u());
                break;
            default:
                k kVar = (k) this.f653b;
                kVar.f676l = z2;
                kVar.q();
                if (!z2) {
                    kVar.t(false);
                    kVar.f677m = false;
                    break;
                }
                break;
        }
    }
}
