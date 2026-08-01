package androidx.fragment.app;

import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class u0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f555f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v0 f556g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l f557h;

    public /* synthetic */ u0(l lVar, v0 v0Var, int i) {
        this.f555f = i;
        this.f557h = lVar;
        this.f556g = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f555f) {
            case 0:
                ArrayList arrayList = this.f557h.f466b;
                v0 v0Var = this.f556g;
                if (arrayList.contains(v0Var)) {
                    w0.a(v0Var.f562c.J, v0Var.f560a);
                    break;
                }
                break;
            default:
                l lVar = this.f557h;
                ArrayList arrayList2 = lVar.f466b;
                v0 v0Var2 = this.f556g;
                arrayList2.remove(v0Var2);
                lVar.f467c.remove(v0Var2);
                break;
        }
    }
}
