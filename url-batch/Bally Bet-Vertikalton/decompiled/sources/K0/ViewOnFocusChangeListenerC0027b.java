package K0;

import android.view.View;

/* renamed from: K0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0027b implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f482a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f483b;

    public /* synthetic */ ViewOnFocusChangeListenerC0027b(r rVar, int i) {
        this.f482a = i;
        this.f483b = rVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        switch (this.f482a) {
            case 0:
                C0030e c0030e = (C0030e) this.f483b;
                c0030e.t(c0030e.u());
                break;
            default:
                l lVar = (l) this.f483b;
                lVar.f507l = z2;
                lVar.q();
                if (!z2) {
                    lVar.t(false);
                    lVar.f508m = false;
                    break;
                }
                break;
        }
    }
}
