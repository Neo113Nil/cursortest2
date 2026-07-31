package q2;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final b f43478b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final c f43479c = new c();

    /* renamed from: a, reason: collision with root package name */
    private final Object f43480a;

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f43481a;

        public a(Throwable th) {
            this.f43481a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && Intrinsics.areEqual(this.f43481a, ((a) obj).f43481a);
        }

        public int hashCode() {
            Throwable th = this.f43481a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // q2.h.c
        public String toString() {
            return "Closed(" + this.f43481a + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Object a(Throwable th) {
            return h.c(new a(th));
        }

        public final Object b() {
            return h.c(h.f43479c);
        }

        public final Object c(Object obj) {
            return h.c(obj);
        }

        private b() {
        }
    }

    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ h(Object obj) {
        this.f43480a = obj;
    }

    public static final /* synthetic */ h b(Object obj) {
        return new h(obj);
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof h) && Intrinsics.areEqual(obj, ((h) obj2).k());
    }

    public static final Throwable e(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f43481a;
        }
        return null;
    }

    public static final Object f(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return obj instanceof a;
    }

    public static final boolean i(Object obj) {
        return !(obj instanceof c);
    }

    public static String j(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f43480a, obj);
    }

    public int hashCode() {
        return g(this.f43480a);
    }

    public final /* synthetic */ Object k() {
        return this.f43480a;
    }

    public String toString() {
        return j(this.f43480a);
    }

    public static Object c(Object obj) {
        return obj;
    }
}
