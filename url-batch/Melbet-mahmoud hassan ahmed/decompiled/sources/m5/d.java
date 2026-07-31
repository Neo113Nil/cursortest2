package m5;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import m5.c;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final m5.c f19234a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19235b;

    /* renamed from: c, reason: collision with root package name */
    private final l f19236c;

    /* renamed from: d, reason: collision with root package name */
    private final c.InterfaceC0107c f19237d;

    public interface b {
        void a(Object obj);

        void b(String str, String str2, Object obj);

        void c();
    }

    private final class c implements c.a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC0108d f19238a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicReference<b> f19239b = new AtomicReference<>(null);

        private final class a implements b {

            /* renamed from: a, reason: collision with root package name */
            final AtomicBoolean f19241a;

            private a() {
                this.f19241a = new AtomicBoolean(false);
            }

            @Override // m5.d.b
            public void a(Object obj) {
                if (this.f19241a.get() || c.this.f19239b.get() != this) {
                    return;
                }
                d.this.f19234a.e(d.this.f19235b, d.this.f19236c.a(obj));
            }

            @Override // m5.d.b
            public void b(String str, String str2, Object obj) {
                if (this.f19241a.get() || c.this.f19239b.get() != this) {
                    return;
                }
                d.this.f19234a.e(d.this.f19235b, d.this.f19236c.c(str, str2, obj));
            }

            @Override // m5.d.b
            public void c() {
                if (this.f19241a.getAndSet(true) || c.this.f19239b.get() != this) {
                    return;
                }
                d.this.f19234a.e(d.this.f19235b, null);
            }
        }

        c(InterfaceC0108d interfaceC0108d) {
            this.f19238a = interfaceC0108d;
        }

        private void c(Object obj, c.b bVar) {
            ByteBuffer c7;
            if (this.f19239b.getAndSet(null) != null) {
                try {
                    this.f19238a.g(obj);
                    bVar.a(d.this.f19236c.a(null));
                    return;
                } catch (RuntimeException e7) {
                    z4.b.c("EventChannel#" + d.this.f19235b, "Failed to close event stream", e7);
                    c7 = d.this.f19236c.c("error", e7.getMessage(), null);
                }
            } else {
                c7 = d.this.f19236c.c("error", "No active stream to cancel", null);
            }
            bVar.a(c7);
        }

        private void d(Object obj, c.b bVar) {
            a aVar = new a();
            if (this.f19239b.getAndSet(aVar) != null) {
                try {
                    this.f19238a.g(null);
                } catch (RuntimeException e7) {
                    z4.b.c("EventChannel#" + d.this.f19235b, "Failed to close existing event stream", e7);
                }
            }
            try {
                this.f19238a.h(obj, aVar);
                bVar.a(d.this.f19236c.a(null));
            } catch (RuntimeException e8) {
                this.f19239b.set(null);
                z4.b.c("EventChannel#" + d.this.f19235b, "Failed to open event stream", e8);
                bVar.a(d.this.f19236c.c("error", e8.getMessage(), null));
            }
        }

        @Override // m5.c.a
        public void a(ByteBuffer byteBuffer, c.b bVar) {
            j d7 = d.this.f19236c.d(byteBuffer);
            if (d7.f19247a.equals("listen")) {
                d(d7.f19248b, bVar);
            } else if (d7.f19247a.equals("cancel")) {
                c(d7.f19248b, bVar);
            } else {
                bVar.a(null);
            }
        }
    }

    /* renamed from: m5.d$d, reason: collision with other inner class name */
    public interface InterfaceC0108d {
        void g(Object obj);

        void h(Object obj, b bVar);
    }

    public d(m5.c cVar, String str) {
        this(cVar, str, r.f19262b);
    }

    public d(m5.c cVar, String str, l lVar) {
        this(cVar, str, lVar, null);
    }

    public d(m5.c cVar, String str, l lVar, c.InterfaceC0107c interfaceC0107c) {
        this.f19234a = cVar;
        this.f19235b = str;
        this.f19236c = lVar;
        this.f19237d = interfaceC0107c;
    }

    public void d(InterfaceC0108d interfaceC0108d) {
        if (this.f19237d != null) {
            this.f19234a.d(this.f19235b, interfaceC0108d != null ? new c(interfaceC0108d) : null, this.f19237d);
        } else {
            this.f19234a.f(this.f19235b, interfaceC0108d != null ? new c(interfaceC0108d) : null);
        }
    }
}
