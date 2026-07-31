package m0;

import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m1 implements p6.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n1 f5017d;

    public m1(n1 n1Var) {
        this.f5017d = n1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p6.a
    public final Object b() {
        ArrayList arrayList = this.f5017d.f5022a;
        o.j0 j0Var = new o.j0(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            r0 r0Var = (r0) arrayList.get(i);
            Object obj = r0Var.f5061b;
            int i8 = r0Var.f5060a;
            Object q0Var = obj != null ? new q0(Integer.valueOf(i8), r0Var.f5061b) : Integer.valueOf(i8);
            int f6 = j0Var.f(q0Var);
            boolean z3 = f6 < 0;
            Object obj2 = z3 ? null : j0Var.f5484c[f6];
            if (obj2 != null) {
                if (obj2 instanceof o.e0) {
                    o.e0 e0Var = (o.e0) obj2;
                    e0Var.a(r0Var);
                    r0Var = e0Var;
                } else {
                    Object[] objArr = o.p0.f5518a;
                    o.e0 e0Var2 = new o.e0(2);
                    e0Var2.a(obj2);
                    e0Var2.a(r0Var);
                    r0Var = e0Var2;
                }
            }
            if (z3) {
                int i9 = ~f6;
                j0Var.f5483b[i9] = q0Var;
                j0Var.f5484c[i9] = r0Var;
            } else {
                j0Var.f5484c[f6] = r0Var;
            }
        }
        return new o0.a(j0Var);
    }
}
