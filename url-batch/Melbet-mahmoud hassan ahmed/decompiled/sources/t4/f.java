package t4;

import android.content.Context;
import e5.a;
import io.flutter.embedding.engine.a;
import m5.k;

/* loaded from: classes.dex */
public class f implements e5.a {

    /* renamed from: f, reason: collision with root package name */
    private k f22317f;

    /* renamed from: g, reason: collision with root package name */
    private g f22318g;

    class a implements a.b {
        a() {
        }

        @Override // io.flutter.embedding.engine.a.b
        public void a() {
        }

        @Override // io.flutter.embedding.engine.a.b
        public void b() {
            f.this.f22318g.a();
        }
    }

    @Override // e5.a
    public void f(a.b bVar) {
        Context a7 = bVar.a();
        m5.c b7 = bVar.b();
        this.f22318g = new g(a7, b7);
        k kVar = new k(b7, "com.ryanheise.just_audio.methods");
        this.f22317f = kVar;
        kVar.e(this.f22318g);
        bVar.d().d(new a());
    }

    @Override // e5.a
    public void i(a.b bVar) {
        this.f22318g.a();
        this.f22318g = null;
        this.f22317f.e(null);
    }
}
