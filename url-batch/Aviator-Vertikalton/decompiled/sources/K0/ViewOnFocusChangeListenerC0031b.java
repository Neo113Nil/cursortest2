package K0;

import android.view.View;

/* renamed from: K0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0031b implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f532a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f533b;

    public /* synthetic */ ViewOnFocusChangeListenerC0031b(r rVar, int i) {
        this.f532a = i;
        this.f533b = rVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        switch (this.f532a) {
            case 0:
                C0034e c0034e = (C0034e) this.f533b;
                c0034e.t(c0034e.u());
                break;
            default:
                l lVar = (l) this.f533b;
                lVar.f557l = z2;
                lVar.q();
                if (!z2) {
                    lVar.t(false);
                    lVar.f558m = false;
                    break;
                }
                break;
        }
    }
}
