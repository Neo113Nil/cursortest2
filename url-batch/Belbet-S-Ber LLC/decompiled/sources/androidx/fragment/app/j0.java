package androidx.fragment.app;

import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class j0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f552a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f553b;

    public j0(k0 k0Var, int i) {
        this.f553b = k0Var;
        this.f552a = i;
    }

    @Override // androidx.fragment.app.i0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        k0 k0Var = this.f553b;
        u uVar = k0Var.f573w;
        int i = this.f552a;
        if (uVar == null || i >= 0 || !uVar.g().P(-1, 0)) {
            return k0Var.Q(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
