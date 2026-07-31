package T5;

import k5.EnumC0476f;
import m1.AbstractC0521b;

/* renamed from: T5.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0206w implements Q5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2474a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2475b;

    public C0206w() {
        this.f2474a = 1;
        this.f2475b = AbstractC0521b.w(EnumC0476f.f5195f, new Q.m(2, this));
    }

    @Override // Q5.a
    public final void a(V5.s sVar, Object value) {
        switch (this.f2474a) {
            case 0:
                throw new IllegalStateException("unsupported");
            default:
                kotlin.jvm.internal.i.e(value, "value");
                sVar.a(c()).p(c());
                return;
        }
    }

    @Override // Q5.a
    public final Object b(S5.b bVar) {
        switch (this.f2474a) {
            case 0:
                throw new IllegalStateException("unsupported");
            default:
                R5.e c7 = c();
                S5.a w5 = bVar.w(c7);
                int j4 = w5.j(c());
                if (j4 != -1) {
                    throw new Q5.c(W4.o.c("Unexpected index ", j4));
                }
                w5.i(c7);
                return k5.v.f5219a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k5.e] */
    @Override // Q5.a
    public final R5.e c() {
        switch (this.f2474a) {
            case 0:
                throw new IllegalStateException("unsupported");
            default:
                return (R5.e) this.f2475b.getValue();
        }
    }

    public C0206w(Q5.a aVar) {
        this.f2474a = 0;
        this.f2475b = aVar;
    }
}
