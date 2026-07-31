package e5;

import android.content.Context;
import io.flutter.plugin.platform.f;
import io.flutter.view.d;
import m5.c;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: e5.a$a, reason: collision with other inner class name */
    public interface InterfaceC0059a {
        String a(String str);
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Context f16074a;

        /* renamed from: b, reason: collision with root package name */
        private final io.flutter.embedding.engine.a f16075b;

        /* renamed from: c, reason: collision with root package name */
        private final c f16076c;

        /* renamed from: d, reason: collision with root package name */
        private final d f16077d;

        /* renamed from: e, reason: collision with root package name */
        private final f f16078e;

        /* renamed from: f, reason: collision with root package name */
        private final InterfaceC0059a f16079f;

        public b(Context context, io.flutter.embedding.engine.a aVar, c cVar, d dVar, f fVar, InterfaceC0059a interfaceC0059a) {
            this.f16074a = context;
            this.f16075b = aVar;
            this.f16076c = cVar;
            this.f16077d = dVar;
            this.f16078e = fVar;
            this.f16079f = interfaceC0059a;
        }

        public Context a() {
            return this.f16074a;
        }

        public c b() {
            return this.f16076c;
        }

        public InterfaceC0059a c() {
            return this.f16079f;
        }

        @Deprecated
        public io.flutter.embedding.engine.a d() {
            return this.f16075b;
        }

        public f e() {
            return this.f16078e;
        }

        public d f() {
            return this.f16077d;
        }
    }

    void f(b bVar);

    void i(b bVar);
}
