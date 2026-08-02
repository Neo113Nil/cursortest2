package androidx.fragment.app;

import java.util.ArrayList;

/* renamed from: androidx.fragment.app.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0200d0 implements InterfaceC0198c0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4826a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f4827b;

    public C0200d0(f0 f0Var, int i4) {
        this.f4827b = f0Var;
        this.f4826a = i4;
    }

    @Override // androidx.fragment.app.InterfaceC0198c0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        f0 f0Var = this.f4827b;
        F f4 = f0Var.f4868y;
        int i4 = this.f4826a;
        if (f4 == null || i4 >= 0 || !f4.getChildFragmentManager().P()) {
            return f0Var.Q(arrayList, arrayList2, i4, 1);
        }
        return false;
    }
}
