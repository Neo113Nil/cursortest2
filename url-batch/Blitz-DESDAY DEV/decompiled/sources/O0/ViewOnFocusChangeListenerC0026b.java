package O0;

import android.view.View;

/* renamed from: O0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0026b implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f652a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f653b;

    public /* synthetic */ ViewOnFocusChangeListenerC0026b(r rVar, int i) {
        this.f652a = i;
        this.f653b = rVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        switch (this.f652a) {
            case 0:
                C0029e c0029e = (C0029e) this.f653b;
                c0029e.t(c0029e.u());
                break;
            default:
                l lVar = (l) this.f653b;
                lVar.f677l = z2;
                lVar.q();
                if (!z2) {
                    lVar.t(false);
                    lVar.f678m = false;
                    break;
                }
                break;
        }
    }
}
