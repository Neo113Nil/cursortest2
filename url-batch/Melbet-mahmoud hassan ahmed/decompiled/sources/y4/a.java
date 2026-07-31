package y4;

import android.content.Context;
import e5.a;
import m5.c;
import m5.k;

/* loaded from: classes.dex */
public class a implements e5.a {

    /* renamed from: f, reason: collision with root package name */
    k f23470f;

    private void a(c cVar, Context context) {
        this.f23470f = new k(cVar, "dev.fluttercommunity.plus/device_info");
        this.f23470f.e(new b(context.getContentResolver(), context.getPackageManager()));
    }

    private void b() {
        this.f23470f.e(null);
        this.f23470f = null;
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
