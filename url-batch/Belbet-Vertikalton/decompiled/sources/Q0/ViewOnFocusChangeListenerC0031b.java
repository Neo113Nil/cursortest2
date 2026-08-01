package Q0;

import android.view.View;

/* renamed from: Q0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0031b implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f1007b;

    public /* synthetic */ ViewOnFocusChangeListenerC0031b(r rVar, int i) {
        this.f1006a = i;
        this.f1007b = rVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        switch (this.f1006a) {
            case 0:
                C0034e c0034e = (C0034e) this.f1007b;
                c0034e.t(c0034e.u());
                break;
            default:
                l lVar = (l) this.f1007b;
                lVar.f1028l = z2;
                lVar.q();
                if (!z2) {
                    lVar.t(false);
                    lVar.f1029m = false;
                    break;
                }
                break;
        }
    }
}
