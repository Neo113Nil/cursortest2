package l0;

/* loaded from: classes.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.room.h f18468a;

    /* renamed from: b, reason: collision with root package name */
    private final t.a<m> f18469b;

    /* renamed from: c, reason: collision with root package name */
    private final t.d f18470c;

    /* renamed from: d, reason: collision with root package name */
    private final t.d f18471d;

    class a extends t.a<m> {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t.d
        public String d() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // t.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(w.f fVar, m mVar) {
            String str = mVar.f18466a;
            if (str == null) {
                fVar.o(1);
            } else {
                fVar.l(1, str);
            }
            byte[] k7 = androidx.work.b.k(mVar.f18467b);
            if (k7 == null) {
                fVar.o(2);
            } else {
                fVar.F(2, k7);
            }
        }
    }

    class b extends t.d {
        b(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t.d
        public String d() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    class c extends t.d {
        c(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t.d
        public String d() {
            return "DELETE FROM WorkProgress";
        }
    }

    public o(androidx.room.h hVar) {
        this.f18468a = hVar;
        this.f18469b = new a(hVar);
        this.f18470c = new b(hVar);
        this.f18471d = new c(hVar);
    }

    @Override // l0.n
    public void a(String str) {
        this.f18468a.b();
        w.f a7 = this.f18470c.a();
        if (str == null) {
            a7.o(1);
        } else {
            a7.l(1, str);
        }
        this.f18468a.c();
        try {
            a7.m();
            this.f18468a.r();
        } finally {
            this.f18468a.g();
            this.f18470c.f(a7);
        }
    }

    @Override // l0.n
    public void b(m mVar) {
        this.f18468a.b();
        this.f18468a.c();
        try {
            this.f18469b.h(mVar);
            this.f18468a.r();
        } finally {
            this.f18468a.g();
        }
    }

    @Override // l0.n
    public void c() {
        this.f18468a.b();
        w.f a7 = this.f18471d.a();
        this.f18468a.c();
        try {
            a7.m();
            this.f18468a.r();
        } finally {
            this.f18468a.g();
            this.f18471d.f(a7);
        }
    }
}
