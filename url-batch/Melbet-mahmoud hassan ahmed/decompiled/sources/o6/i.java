package o6;

/* loaded from: classes.dex */
public final class i<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f19922a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final c f19923b = new c();

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f19924a;

        public a(Throwable th) {
            this.f19924a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && kotlin.jvm.internal.i.a(this.f19924a, ((a) obj).f19924a);
        }

        public int hashCode() {
            Throwable th = this.f19924a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // o6.i.c
        public String toString() {
            return "Closed(" + this.f19924a + ')';
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final <E> Object a(Throwable th) {
            return i.b(new a(th));
        }

        public final <E> Object b() {
            return i.b(i.f19923b);
        }

        public final <E> Object c(E e7) {
            return i.b(e7);
        }
    }

    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    public static <T> Object b(Object obj) {
        return obj;
    }
}
