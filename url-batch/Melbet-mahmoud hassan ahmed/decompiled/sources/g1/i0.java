package g1;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public interface i0 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f16366a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16367b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f16368c;

        public a(String str, int i7, byte[] bArr) {
            this.f16366a = str;
            this.f16367b = i7;
            this.f16368c = bArr;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f16369a;

        /* renamed from: b, reason: collision with root package name */
        public final String f16370b;

        /* renamed from: c, reason: collision with root package name */
        public final List<a> f16371c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f16372d;

        public b(int i7, String str, List<a> list, byte[] bArr) {
            this.f16369a = i7;
            this.f16370b = str;
            this.f16371c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.f16372d = bArr;
        }
    }

    public interface c {
        SparseArray<i0> a();

        i0 b(int i7, b bVar);
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f16373a;

        /* renamed from: b, reason: collision with root package name */
        private final int f16374b;

        /* renamed from: c, reason: collision with root package name */
        private final int f16375c;

        /* renamed from: d, reason: collision with root package name */
        private int f16376d;

        /* renamed from: e, reason: collision with root package name */
        private String f16377e;

        public d(int i7, int i8) {
            this(Integer.MIN_VALUE, i7, i8);
        }

        public d(int i7, int i8, int i9) {
            String str;
            if (i7 != Integer.MIN_VALUE) {
                str = i7 + "/";
            } else {
                str = "";
            }
            this.f16373a = str;
            this.f16374b = i8;
            this.f16375c = i9;
            this.f16376d = Integer.MIN_VALUE;
            this.f16377e = "";
        }

        private void d() {
            if (this.f16376d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i7 = this.f16376d;
            this.f16376d = i7 == Integer.MIN_VALUE ? this.f16374b : i7 + this.f16375c;
            this.f16377e = this.f16373a + this.f16376d;
        }

        public String b() {
            d();
            return this.f16377e;
        }

        public int c() {
            d();
            return this.f16376d;
        }
    }

    void a();

    void b(o2.i0 i0Var, w0.n nVar, d dVar);

    void c(o2.a0 a0Var, int i7);
}
