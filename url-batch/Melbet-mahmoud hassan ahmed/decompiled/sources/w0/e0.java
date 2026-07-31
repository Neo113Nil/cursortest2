package w0;

import java.util.Arrays;
import r0.s1;

/* loaded from: classes.dex */
public interface e0 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f22894a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f22895b;

        /* renamed from: c, reason: collision with root package name */
        public final int f22896c;

        /* renamed from: d, reason: collision with root package name */
        public final int f22897d;

        public a(int i7, byte[] bArr, int i8, int i9) {
            this.f22894a = i7;
            this.f22895b = bArr;
            this.f22896c = i8;
            this.f22897d = i9;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f22894a == aVar.f22894a && this.f22896c == aVar.f22896c && this.f22897d == aVar.f22897d && Arrays.equals(this.f22895b, aVar.f22895b);
        }

        public int hashCode() {
            return (((((this.f22894a * 31) + Arrays.hashCode(this.f22895b)) * 31) + this.f22896c) * 31) + this.f22897d;
        }
    }

    int a(n2.i iVar, int i7, boolean z6);

    void b(long j7, int i7, int i8, int i9, a aVar);

    void c(o2.a0 a0Var, int i7, int i8);

    void d(o2.a0 a0Var, int i7);

    void e(s1 s1Var);

    int f(n2.i iVar, int i7, boolean z6, int i8);
}
