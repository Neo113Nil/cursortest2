package kotlinx.coroutines.internal;

import m6.e2;

/* loaded from: classes.dex */
final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final y5.g f18336a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f18337b;

    /* renamed from: c, reason: collision with root package name */
    private final e2<Object>[] f18338c;

    /* renamed from: d, reason: collision with root package name */
    private int f18339d;

    public f0(y5.g gVar, int i7) {
        this.f18336a = gVar;
        this.f18337b = new Object[i7];
        this.f18338c = new e2[i7];
    }

    public final void a(e2<?> e2Var, Object obj) {
        Object[] objArr = this.f18337b;
        int i7 = this.f18339d;
        objArr[i7] = obj;
        e2<Object>[] e2VarArr = this.f18338c;
        this.f18339d = i7 + 1;
        e2VarArr[i7] = e2Var;
    }

    public final void b(y5.g gVar) {
        int length = this.f18338c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i7 = length - 1;
            e2<Object> e2Var = this.f18338c[length];
            kotlin.jvm.internal.i.b(e2Var);
            e2Var.w(gVar, this.f18337b[length]);
            if (i7 < 0) {
                return;
            } else {
                length = i7;
            }
        }
    }
}
