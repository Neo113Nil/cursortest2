package e1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o2.a0;

/* loaded from: classes.dex */
abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f15838a;

    /* renamed from: e1.a$a, reason: collision with other inner class name */
    static final class C0056a extends a {

        /* renamed from: b, reason: collision with root package name */
        public final long f15839b;

        /* renamed from: c, reason: collision with root package name */
        public final List<b> f15840c;

        /* renamed from: d, reason: collision with root package name */
        public final List<C0056a> f15841d;

        public C0056a(int i7, long j7) {
            super(i7);
            this.f15839b = j7;
            this.f15840c = new ArrayList();
            this.f15841d = new ArrayList();
        }

        public void d(C0056a c0056a) {
            this.f15841d.add(c0056a);
        }

        public void e(b bVar) {
            this.f15840c.add(bVar);
        }

        public C0056a f(int i7) {
            int size = this.f15841d.size();
            for (int i8 = 0; i8 < size; i8++) {
                C0056a c0056a = this.f15841d.get(i8);
                if (c0056a.f15838a == i7) {
                    return c0056a;
                }
            }
            return null;
        }

        public b g(int i7) {
            int size = this.f15840c.size();
            for (int i8 = 0; i8 < size; i8++) {
                b bVar = this.f15840c.get(i8);
                if (bVar.f15838a == i7) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // e1.a
        public String toString() {
            return a.a(this.f15838a) + " leaves: " + Arrays.toString(this.f15840c.toArray()) + " containers: " + Arrays.toString(this.f15841d.toArray());
        }
    }

    static final class b extends a {

        /* renamed from: b, reason: collision with root package name */
        public final a0 f15842b;

        public b(int i7, a0 a0Var) {
            super(i7);
            this.f15842b = a0Var;
        }
    }

    public a(int i7) {
        this.f15838a = i7;
    }

    public static String a(int i7) {
        return "" + ((char) ((i7 >> 24) & 255)) + ((char) ((i7 >> 16) & 255)) + ((char) ((i7 >> 8) & 255)) + ((char) (i7 & 255));
    }

    public static int b(int i7) {
        return i7 & 16777215;
    }

    public static int c(int i7) {
        return (i7 >> 24) & 255;
    }

    public String toString() {
        return a(this.f15838a);
    }
}
