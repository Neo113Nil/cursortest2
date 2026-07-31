package m5;

import java.nio.ByteBuffer;
import m5.c;

/* loaded from: classes.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final m5.c f19223a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19224b;

    /* renamed from: c, reason: collision with root package name */
    private final i<T> f19225c;

    /* renamed from: d, reason: collision with root package name */
    private final c.InterfaceC0107c f19226d;

    private final class b implements c.a {

        /* renamed from: a, reason: collision with root package name */
        private final d<T> f19227a;

        /* renamed from: m5.a$b$a, reason: collision with other inner class name */
        class C0106a implements e<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c.b f19229a;

            C0106a(c.b bVar) {
                this.f19229a = bVar;
            }

            @Override // m5.a.e
            public void a(T t6) {
                this.f19229a.a(a.this.f19225c.a(t6));
            }
        }

        private b(d<T> dVar) {
            this.f19227a = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // m5.c.a
        public void a(ByteBuffer byteBuffer, c.b bVar) {
            try {
                this.f19227a.a(a.this.f19225c.b(byteBuffer), new C0106a(bVar));
            } catch (RuntimeException e7) {
                z4.b.c("BasicMessageChannel#" + a.this.f19224b, "Failed to handle message", e7);
                bVar.a(null);
            }
        }
    }

    private final class c implements c.b {

        /* renamed from: a, reason: collision with root package name */
        private final e<T> f19231a;

        private c(e<T> eVar) {
            this.f19231a = eVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // m5.c.b
        public void a(ByteBuffer byteBuffer) {
            try {
                this.f19231a.a(a.this.f19225c.b(byteBuffer));
            } catch (RuntimeException e7) {
                z4.b.c("BasicMessageChannel#" + a.this.f19224b, "Failed to handle message reply", e7);
            }
        }
    }

    public interface d<T> {
        void a(T t6, e<T> eVar);
    }

    public interface e<T> {
        void a(T t6);
    }

    public a(m5.c cVar, String str, i<T> iVar) {
        this(cVar, str, iVar, null);
    }

    public a(m5.c cVar, String str, i<T> iVar, c.InterfaceC0107c interfaceC0107c) {
        this.f19223a = cVar;
        this.f19224b = str;
        this.f19225c = iVar;
        this.f19226d = interfaceC0107c;
    }

    public void c(T t6) {
        d(t6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d(T t6, e<T> eVar) {
        this.f19223a.c(this.f19224b, this.f19225c.a(t6), eVar != null ? new c(eVar) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [m5.c] */
    /* JADX WARN: Type inference failed for: r1v0, types: [m5.a$a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [m5.c$a] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public void e(d<T> dVar) {
        if (this.f19226d != null) {
            this.f19223a.d(this.f19224b, dVar != null ? new b(dVar) : null, this.f19226d);
        } else {
            this.f19223a.f(this.f19224b, dVar != null ? new b(dVar) : 0);
        }
    }
}
