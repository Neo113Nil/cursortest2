package androidx.fragment.app;

import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class j0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f439a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f440b;

    public j0(k0 k0Var, int i) {
        this.f440b = k0Var;
        this.f439a = i;
    }

    @Override // androidx.fragment.app.i0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        k0 k0Var = this.f440b;
        u uVar = k0Var.f461w;
        int i = this.f439a;
        if (uVar == null || i >= 0 || !uVar.g().M(-1, 0)) {
            return k0Var.N(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
