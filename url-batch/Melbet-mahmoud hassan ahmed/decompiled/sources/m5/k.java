package m5;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import m5.c;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private final m5.c f19249a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19250b;

    /* renamed from: c, reason: collision with root package name */
    private final l f19251c;

    /* renamed from: d, reason: collision with root package name */
    private final c.InterfaceC0107c f19252d;

    private final class a implements c.a {

        /* renamed from: a, reason: collision with root package name */
        private final c f19253a;

        /* renamed from: m5.k$a$a, reason: collision with other inner class name */
        class C0109a implements d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c.b f19255a;

            C0109a(c.b bVar) {
                this.f19255a = bVar;
            }

            @Override // m5.k.d
            public void a(Object obj) {
                this.f19255a.a(k.this.f19251c.a(obj));
            }

            @Override // m5.k.d
            public void b(String str, String str2, Object obj) {
                this.f19255a.a(k.this.f19251c.c(str, str2, obj));
            }

            @Override // m5.k.d
            public void c() {
                this.f19255a.a(null);
            }
        }

        a(c cVar) {
            this.f19253a = cVar;
        }

        private String b(Exception exc) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.toString();
        }

        @Override // m5.c.a
        public void a(ByteBuffer byteBuffer, c.b bVar) {
            try {
                this.f19253a.C(k.this.f19251c.d(byteBuffer), new C0109a(bVar));
            } catch (RuntimeException e7) {
                z4.b.c("MethodChannel#" + k.this.f19250b, "Failed to handle method call", e7);
                bVar.a(k.this.f19251c.b("error", e7.getMessage(), null, b(e7)));
            }
        }
    }

    private final class b implements c.b {

        /* renamed from: a, reason: collision with root package name */
        private final d f19257a;

        b(d dVar) {
            this.f19257a = dVar;
        }

        @Override // m5.c.b
        public void a(ByteBuffer byteBuffer) {
            try {
                if (byteBuffer == null) {
                    this.f19257a.c();
                } else {
                    try {
                        this.f19257a.a(k.this.f19251c.e(byteBuffer));
                    } catch (e e7) {
                        this.f19257a.b(e7.f19243f, e7.getMessage(), e7.f19244g);
                    }
                }
            } catch (RuntimeException e8) {
                z4.b.c("MethodChannel#" + k.this.f19250b, "Failed to handle method call result", e8);
            }
        }
    }

    public interface c {
        void C(j jVar, d dVar);
    }

    public interface d {
        void a(Object obj);

        void b(String str, String str2, Object obj);

        void c();
    }

    public k(m5.c cVar, String str) {
        this(cVar, str, r.f19262b);
    }

    public k(m5.c cVar, String str, l lVar) {
        this(cVar, str, lVar, null);
    }

    public k(m5.c cVar, String str, l lVar, c.InterfaceC0107c interfaceC0107c) {
        this.f19249a = cVar;
        this.f19250b = str;
        this.f19251c = lVar;
        this.f19252d = interfaceC0107c;
    }

    public void c(String str, Object obj) {
        d(str, obj, null);
    }

    public void d(String str, Object obj, d dVar) {
        this.f19249a.c(this.f19250b, this.f19251c.f(new j(str, obj)), dVar == null ? null : new b(dVar));
    }

    public void e(c cVar) {
        if (this.f19252d != null) {
            this.f19249a.d(this.f19250b, cVar != null ? new a(cVar) : null, this.f19252d);
        } else {
            this.f19249a.f(this.f19250b, cVar != null ? new a(cVar) : null);
        }
    }
}
