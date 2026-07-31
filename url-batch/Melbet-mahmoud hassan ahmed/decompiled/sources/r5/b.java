package r5;

import android.content.Context;
import e5.a;
import m5.c;
import m5.k;

/* loaded from: classes.dex */
public class b implements e5.a {

    /* renamed from: f, reason: collision with root package name */
    private k f21376f;

    /* renamed from: g, reason: collision with root package name */
    private a f21377g;

    private void a(c cVar, Context context) {
        this.f21376f = new k(cVar, "plugins.flutter.io/shared_preferences_android");
        a aVar = new a(context);
        this.f21377g = aVar;
        this.f21376f.e(aVar);
    }

    private void b() {
        this.f21377g.f();
        this.f21377g = null;
        this.f21376f.e(null);
        this.f21376f = null;
    }

    @Override // e5.a
    public void f(a.b bVar) {
        a(bVar.b(), bVar.a());
    }

    @Override // e5.a
    public void i(a.b bVar) {
        b();
    }
}
