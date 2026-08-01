package N0;

import android.view.View;

/* renamed from: N0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0029b implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f637a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f638b;

    public /* synthetic */ ViewOnFocusChangeListenerC0029b(r rVar, int i) {
        this.f637a = i;
        this.f638b = rVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        switch (this.f637a) {
            case 0:
                C0032e c0032e = (C0032e) this.f638b;
                c0032e.t(c0032e.u());
                break;
            default:
                l lVar = (l) this.f638b;
                lVar.f664l = z2;
                lVar.q();
                if (!z2) {
                    lVar.t(false);
                    lVar.f665m = false;
                    break;
                }
                break;
        }
    }
}
