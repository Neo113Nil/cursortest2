package v5;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class k<T> implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final a f22832f = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }
    }

    public static final class b implements Serializable {

        /* renamed from: f, reason: collision with root package name */
        public final Throwable f22833f;

        public b(Throwable th) {
            kotlin.jvm.internal.i.d(th, "exception");
            this.f22833f = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && kotlin.jvm.internal.i.a(this.f22833f, ((b) obj).f22833f);
        }

        public int hashCode() {
            return this.f22833f.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f22833f + ')';
        }
    }

    public static <T> Object a(Object obj) {
        return obj;
    }

    public static final Throwable b(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f22833f;
        }
        return null;
    }

    public static final boolean c(Object obj) {
        return obj instanceof b;
    }

    public static final boolean d(Object obj) {
        return !(obj instanceof b);
    }
}
