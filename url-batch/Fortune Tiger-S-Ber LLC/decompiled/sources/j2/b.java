package j2;

import android.view.View;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2295a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f2296b;

    public /* synthetic */ b(s sVar, int i4) {
        this.f2295a = i4;
        this.f2296b = sVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z3) {
        switch (this.f2295a) {
            case 0:
                e eVar = (e) this.f2296b;
                eVar.s(eVar.t());
                break;
            default:
                m mVar = (m) this.f2296b;
                mVar.f2323l = z3;
                mVar.p();
                if (!z3) {
                    mVar.s(false);
                    mVar.f2324m = false;
                    break;
                }
                break;
        }
    }
}
