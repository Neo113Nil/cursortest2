package U0;

import android.view.View;

/* renamed from: U0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0032b implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1132a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f1133b;

    public /* synthetic */ ViewOnFocusChangeListenerC0032b(q qVar, int i) {
        this.f1132a = i;
        this.f1133b = qVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        switch (this.f1132a) {
            case 0:
                e eVar = (e) this.f1133b;
                eVar.t(eVar.u());
                break;
            default:
                k kVar = (k) this.f1133b;
                kVar.f1156l = z2;
                kVar.q();
                if (!z2) {
                    kVar.t(false);
                    kVar.f1157m = false;
                    break;
                }
                break;
        }
    }
}
