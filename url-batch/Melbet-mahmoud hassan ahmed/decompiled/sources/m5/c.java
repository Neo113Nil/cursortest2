package m5;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface c {

    public interface a {
        void a(ByteBuffer byteBuffer, b bVar);
    }

    public interface b {
        void a(ByteBuffer byteBuffer);
    }

    /* renamed from: m5.c$c, reason: collision with other inner class name */
    public interface InterfaceC0107c {
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private boolean f19233a = true;

        public boolean a() {
            return this.f19233a;
        }
    }

    InterfaceC0107c a(d dVar);

    InterfaceC0107c b();

    void c(String str, ByteBuffer byteBuffer, b bVar);

    void d(String str, a aVar, InterfaceC0107c interfaceC0107c);

    void e(String str, ByteBuffer byteBuffer);

    void f(String str, a aVar);
}
