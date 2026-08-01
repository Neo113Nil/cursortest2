package P0;

import android.view.View;

/* renamed from: P0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0026b implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f590a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f591b;

    public /* synthetic */ ViewOnFocusChangeListenerC0026b(q qVar, int i) {
        this.f590a = i;
        this.f591b = qVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        switch (this.f590a) {
            case 0:
                C0029e c0029e = (C0029e) this.f591b;
                c0029e.t(c0029e.u());
                break;
            default:
                k kVar = (k) this.f591b;
                kVar.f614l = z2;
                kVar.q();
                if (!z2) {
                    kVar.t(false);
                    kVar.f615m = false;
                    break;
                }
                break;
        }
    }
}
