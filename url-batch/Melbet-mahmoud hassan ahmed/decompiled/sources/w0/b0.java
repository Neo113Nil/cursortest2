package w0;

/* loaded from: classes.dex */
public interface b0 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final c0 f22874a;

        /* renamed from: b, reason: collision with root package name */
        public final c0 f22875b;

        public a(c0 c0Var) {
            this(c0Var, c0Var);
        }

        public a(c0 c0Var, c0 c0Var2) {
            this.f22874a = (c0) o2.a.e(c0Var);
            this.f22875b = (c0) o2.a.e(c0Var2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f22874a.equals(aVar.f22874a) && this.f22875b.equals(aVar.f22875b);
        }

        public int hashCode() {
            return (this.f22874a.hashCode() * 31) + this.f22875b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f22874a);
            if (this.f22874a.equals(this.f22875b)) {
                str = "";
            } else {
                str = ", " + this.f22875b;
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }
    }

    public static class b implements b0 {

        /* renamed from: a, reason: collision with root package name */
        private final long f22876a;

        /* renamed from: b, reason: collision with root package name */
        private final a f22877b;

        public b(long j7) {
            this(j7, 0L);
        }

        public b(long j7, long j8) {
            this.f22876a = j7;
            this.f22877b = new a(j8 == 0 ? c0.f22878c : new c0(0L, j8));
        }

        @Override // w0.b0
        public boolean g() {
            return false;
        }

        @Override // w0.b0
        public a i(long j7) {
            return this.f22877b;
        }

        @Override // w0.b0
        public long j() {
            return this.f22876a;
        }
    }

    boolean g();

    a i(long j7);

    long j();
}
