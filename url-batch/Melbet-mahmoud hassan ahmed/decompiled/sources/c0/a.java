package c0;

import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class a implements c0.e {

    /* renamed from: c, reason: collision with root package name */
    private static final Set<a> f1701c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    private final String f1702a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1703b;

    /* renamed from: c0.a$a, reason: collision with other inner class name */
    private static class C0040a {

        /* renamed from: a, reason: collision with root package name */
        static final Set<String> f1704a = new HashSet(Arrays.asList(k.d().a()));
    }

    public static final class b extends a {
        b(String str, String str2) {
            super(str, str2);
        }

        @Override // c0.a
        public boolean c() {
            return Build.VERSION.SDK_INT >= 23;
        }
    }

    public static final class c extends a {
        c(String str, String str2) {
            super(str, str2);
        }

        @Override // c0.a
        public boolean c() {
            return Build.VERSION.SDK_INT >= 24;
        }
    }

    public static final class d extends a {
        d(String str, String str2) {
            super(str, str2);
        }

        @Override // c0.a
        public boolean c() {
            return false;
        }
    }

    public static final class e extends a {
        e(String str, String str2) {
            super(str, str2);
        }

        @Override // c0.a
        public boolean c() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    public static final class f extends a {
        f(String str, String str2) {
            super(str, str2);
        }

        @Override // c0.a
        public boolean c() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    public static final class g extends a {
        g(String str, String str2) {
            super(str, str2);
        }

        @Override // c0.a
        public boolean c() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    public static final class h extends a {
        h(String str, String str2) {
            super(str, str2);
        }

        @Override // c0.a
        public boolean c() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    a(String str, String str2) {
        this.f1702a = str;
        this.f1703b = str2;
        f1701c.add(this);
    }

    public static Set<a> e() {
        return Collections.unmodifiableSet(f1701c);
    }

    @Override // c0.e
    public String a() {
        return this.f1702a;
    }

    @Override // c0.e
    public boolean b() {
        return c() || d();
    }

    public abstract boolean c();

    public boolean d() {
        return s6.a.b(C0040a.f1704a, this.f1703b);
    }
}
