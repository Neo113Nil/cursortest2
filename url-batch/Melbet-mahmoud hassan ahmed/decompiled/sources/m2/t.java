package m2;

import java.util.List;
import r0.r3;
import r0.s1;
import t1.x;
import t1.x0;

/* loaded from: classes.dex */
public interface t extends w {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final x0 f19075a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f19076b;

        /* renamed from: c, reason: collision with root package name */
        public final int f19077c;

        public a(x0 x0Var, int... iArr) {
            this(x0Var, iArr, 0);
        }

        public a(x0 x0Var, int[] iArr, int i7) {
            if (iArr.length == 0) {
                o2.r.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f19075a = x0Var;
            this.f19076b = iArr;
            this.f19077c = i7;
        }
    }

    public interface b {
        t[] a(a[] aVarArr, n2.f fVar, x.b bVar, r3 r3Var);
    }

    void g();

    boolean h(int i7, long j7);

    boolean i(int i7, long j7);

    void j(boolean z6);

    void k();

    int l(long j7, List<? extends v1.n> list);

    void m(long j7, long j8, long j9, List<? extends v1.n> list, v1.o[] oVarArr);

    boolean n(long j7, v1.f fVar, List<? extends v1.n> list);

    int o();

    s1 p();

    int q();

    int r();

    void s(float f7);

    Object t();

    void u();

    void v();
}
