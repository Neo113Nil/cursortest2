package androidx.fragment.app;

import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class u0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f663f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v0 f664g;
    public final /* synthetic */ l h;

    public /* synthetic */ u0(l lVar, v0 v0Var, int i) {
        this.f663f = i;
        this.h = lVar;
        this.f664g = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f663f) {
            case 0:
                ArrayList arrayList = this.h.f578b;
                v0 v0Var = this.f664g;
                if (arrayList.contains(v0Var)) {
                    a4.b.a(v0Var.f669c.J, v0Var.f667a);
                    break;
                }
                break;
            default:
                l lVar = this.h;
                ArrayList arrayList2 = lVar.f578b;
                v0 v0Var2 = this.f664g;
                arrayList2.remove(v0Var2);
                lVar.f579c.remove(v0Var2);
                break;
        }
    }
}
