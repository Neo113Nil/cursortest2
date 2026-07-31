package io.flutter.plugins.webviewflutter;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import e5.a;
import io.flutter.plugins.webviewflutter.e;
import io.flutter.plugins.webviewflutter.h;
import io.flutter.plugins.webviewflutter.i2;
import io.flutter.plugins.webviewflutter.o2;
import io.flutter.plugins.webviewflutter.q3;
import io.flutter.plugins.webviewflutter.s2;
import io.flutter.plugins.webviewflutter.v2;
import io.flutter.plugins.webviewflutter.w2;
import io.flutter.plugins.webviewflutter.y2;

/* loaded from: classes.dex */
public class o3 implements e5.a, f5.a {

    /* renamed from: f, reason: collision with root package name */
    private i2 f17752f;

    /* renamed from: g, reason: collision with root package name */
    private a.b f17753g;

    /* renamed from: h, reason: collision with root package name */
    private q3 f17754h;

    /* renamed from: i, reason: collision with root package name */
    private o2 f17755i;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(long j7) {
    }

    private void h(m5.c cVar, io.flutter.plugin.platform.f fVar, Context context, View view, h hVar) {
        i2 i7 = i2.i(new i2.a() { // from class: io.flutter.plugins.webviewflutter.n3
            @Override // io.flutter.plugins.webviewflutter.i2.a
            public final void a(long j7) {
                o3.g(j7);
            }
        });
        this.f17752f = i7;
        fVar.a("plugins.flutter.io/webview", new j(i7));
        this.f17754h = new q3(this.f17752f, new q3.d(), context, view);
        this.f17755i = new o2(this.f17752f, new o2.a(), new n2(cVar, this.f17752f), new Handler(context.getMainLooper()));
        f2.d0(cVar, this.f17754h);
        y.d(cVar, this.f17755i);
        d1.d(cVar, new y2(this.f17752f, new y2.c(), new x2(cVar, this.f17752f)));
        c0.d(cVar, new s2(this.f17752f, new s2.a(), new r2(cVar, this.f17752f)));
        r.d(cVar, new e(this.f17752f, new e.a(), new d(cVar, this.f17752f)));
        r0.D(cVar, new v2(this.f17752f, new v2.a()));
        u.f(cVar, new i(hVar));
        n.f(cVar, new b());
        u0.f(cVar, new w2(this.f17752f, new w2.a()));
    }

    private void j(Context context) {
        this.f17754h.B(context);
        this.f17755i.b(new Handler(context.getMainLooper()));
    }

    @Override // f5.a
    public void a(f5.c cVar) {
        j(cVar.d());
    }

    @Override // f5.a
    public void b(f5.c cVar) {
        j(cVar.d());
    }

    @Override // f5.a
    public void c() {
        j(this.f17753g.a());
    }

    @Override // f5.a
    public void e() {
        j(this.f17753g.a());
    }

    @Override // e5.a
    public void f(a.b bVar) {
        this.f17753g = bVar;
        h(bVar.b(), bVar.e(), bVar.a(), null, new h.a(bVar.a().getAssets(), bVar.c()));
    }

    @Override // e5.a
    public void i(a.b bVar) {
        this.f17752f.e();
    }
}
