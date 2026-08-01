package androidx.fragment.app;

import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class u0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f539f;
    public final /* synthetic */ v0 g;
    public final /* synthetic */ l h;

    public /* synthetic */ u0(l lVar, v0 v0Var, int i4) {
        this.f539f = i4;
        this.h = lVar;
        this.g = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f539f) {
            case 0:
                ArrayList arrayList = this.h.f459b;
                v0 v0Var = this.g;
                if (arrayList.contains(v0Var)) {
                    w0.a(v0Var.c.J, v0Var.f542a);
                    break;
                }
                break;
            default:
                l lVar = this.h;
                ArrayList arrayList2 = lVar.f459b;
                v0 v0Var2 = this.g;
                arrayList2.remove(v0Var2);
                lVar.c.remove(v0Var2);
                break;
        }
    }
}
