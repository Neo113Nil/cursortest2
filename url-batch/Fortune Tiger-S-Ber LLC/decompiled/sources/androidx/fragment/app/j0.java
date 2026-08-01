package androidx.fragment.app;

import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class j0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f433a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f434b;

    public j0(k0 k0Var, int i4) {
        this.f434b = k0Var;
        this.f433a = i4;
    }

    @Override // androidx.fragment.app.i0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        k0 k0Var = this.f434b;
        u uVar = k0Var.f454w;
        int i4 = this.f433a;
        if (uVar == null || i4 >= 0 || !uVar.g().O(-1, 0)) {
            return k0Var.P(arrayList, arrayList2, i4, 1);
        }
        return false;
    }
}
