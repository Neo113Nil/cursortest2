package a5;

import android.content.res.AssetManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.List;
import m5.c;
import m5.s;

/* loaded from: classes.dex */
public class a implements m5.c {

    /* renamed from: a, reason: collision with root package name */
    private final FlutterJNI f213a;

    /* renamed from: b, reason: collision with root package name */
    private final AssetManager f214b;

    /* renamed from: c, reason: collision with root package name */
    private final a5.c f215c;

    /* renamed from: d, reason: collision with root package name */
    private final m5.c f216d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f217e;

    /* renamed from: f, reason: collision with root package name */
    private String f218f;

    /* renamed from: g, reason: collision with root package name */
    private d f219g;

    /* renamed from: h, reason: collision with root package name */
    private final c.a f220h;

    /* renamed from: a5.a$a, reason: collision with other inner class name */
    class C0002a implements c.a {
        C0002a() {
        }

        @Override // m5.c.a
        public void a(ByteBuffer byteBuffer, c.b bVar) {
            a.this.f218f = s.f19265b.b(byteBuffer);
            if (a.this.f219g != null) {
                a.this.f219g.a(a.this.f218f);
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f222a;

        /* renamed from: b, reason: collision with root package name */
        public final String f223b;

        /* renamed from: c, reason: collision with root package name */
        public final String f224c;

        public b(String str, String str2) {
            this.f222a = str;
            this.f223b = null;
            this.f224c = str2;
        }

        public b(String str, String str2, String str3) {
            this.f222a = str;
            this.f223b = str2;
            this.f224c = str3;
        }

        public static b a() {
            c5.d c7 = z4.a.e().c();
            if (c7.k()) {
                return new b(c7.f(), "main");
            }
            throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f222a.equals(bVar.f222a)) {
                return this.f224c.equals(bVar.f224c);
            }
            return false;
        }

        public int hashCode() {
            return (this.f222a.hashCode() * 31) + this.f224c.hashCode();
        }

        public String toString() {
            return "DartEntrypoint( bundle path: " + this.f222a + ", function: " + this.f224c + " )";
        }
    }

    private static class c implements m5.c {

        /* renamed from: a, reason: collision with root package name */
        private final a5.c f225a;

        private c(a5.c cVar) {
            this.f225a = cVar;
        }

        /* synthetic */ c(a5.c cVar, C0002a c0002a) {
            this(cVar);
        }

        @Override // m5.c
        public c.InterfaceC0107c a(c.d dVar) {
            return this.f225a.a(dVar);
        }

        @Override // m5.c
        public /* synthetic */ c.InterfaceC0107c b() {
            return m5.b.a(this);
        }

        @Override // m5.c
        public void c(String str, ByteBuffer byteBuffer, c.b bVar) {
            this.f225a.c(str, byteBuffer, bVar);
        }

        @Override // m5.c
        public void d(String str, c.a aVar, c.InterfaceC0107c interfaceC0107c) {
            this.f225a.d(str, aVar, interfaceC0107c);
        }

        @Override // m5.c
        public void e(String str, ByteBuffer byteBuffer) {
            this.f225a.c(str, byteBuffer, null);
        }

        @Override // m5.c
        public void f(String str, c.a aVar) {
            this.f225a.f(str, aVar);
        }
    }

    public interface d {
        void a(String str);
    }

    public a(FlutterJNI flutterJNI, AssetManager assetManager) {
        this.f217e = false;
        C0002a c0002a = new C0002a();
        this.f220h = c0002a;
        this.f213a = flutterJNI;
        this.f214b = assetManager;
        a5.c cVar = new a5.c(flutterJNI);
        this.f215c = cVar;
        cVar.f("flutter/isolate", c0002a);
        this.f216d = new c(cVar, null);
        if (flutterJNI.isAttached()) {
            this.f217e = true;
        }
    }

    @Override // m5.c
    @Deprecated
    public c.InterfaceC0107c a(c.d dVar) {
        return this.f216d.a(dVar);
    }

    @Override // m5.c
    public /* synthetic */ c.InterfaceC0107c b() {
        return m5.b.a(this);
    }

    @Override // m5.c
    @Deprecated
    public void c(String str, ByteBuffer byteBuffer, c.b bVar) {
        this.f216d.c(str, byteBuffer, bVar);
    }

    @Override // m5.c
    @Deprecated
    public void d(String str, c.a aVar, c.InterfaceC0107c interfaceC0107c) {
        this.f216d.d(str, aVar, interfaceC0107c);
    }

    @Override // m5.c
    @Deprecated
    public void e(String str, ByteBuffer byteBuffer) {
        this.f216d.e(str, byteBuffer);
    }

    @Override // m5.c
    @Deprecated
    public void f(String str, c.a aVar) {
        this.f216d.f(str, aVar);
    }

    public void j(b bVar) {
        k(bVar, null);
    }

    public void k(b bVar, List<String> list) {
        if (this.f217e) {
            z4.b.f("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        u5.e.a("DartExecutor#executeDartEntrypoint");
        try {
            z4.b.e("DartExecutor", "Executing Dart entrypoint: " + bVar);
            this.f213a.runBundleAndSnapshotFromLibrary(bVar.f222a, bVar.f224c, bVar.f223b, this.f214b, list);
            this.f217e = true;
        } finally {
            u5.e.b();
        }
    }

    public String l() {
        return this.f218f;
    }

    public boolean m() {
        return this.f217e;
    }

    public void n() {
        if (this.f213a.isAttached()) {
            this.f213a.notifyLowMemoryWarning();
        }
    }

    public void o() {
        z4.b.e("DartExecutor", "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        this.f213a.setPlatformMessageHandler(this.f215c);
    }

    public void p() {
        z4.b.e("DartExecutor", "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.f213a.setPlatformMessageHandler(null);
    }
}
