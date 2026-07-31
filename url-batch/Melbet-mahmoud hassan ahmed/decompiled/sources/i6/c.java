package i6;

/* loaded from: classes.dex */
public final class c extends i6.a {

    /* renamed from: j, reason: collision with root package name */
    public static final a f17046j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    private static final c f17047k = new c(1, 0);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final c a() {
            return c.f17047k;
        }
    }

    public c(int i7, int i8) {
        super(i7, i8, 1);
    }

    @Override // i6.a
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (i() != cVar.i() || j() != cVar.j()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // i6.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (i() * 31) + j();
    }

    @Override // i6.a
    public boolean isEmpty() {
        return i() > j();
    }

    public Integer n() {
        return Integer.valueOf(j());
    }

    public Integer o() {
        return Integer.valueOf(i());
    }

    @Override // i6.a
    public String toString() {
        return i() + ".." + j();
    }
}
