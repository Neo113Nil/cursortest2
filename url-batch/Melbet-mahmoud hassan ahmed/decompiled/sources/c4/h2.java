package c4;

import android.app.Activity;
import android.app.Application;
import k4.a;

/* loaded from: classes.dex */
final class h2 {

    /* renamed from: a, reason: collision with root package name */
    private final Application f1987a;

    /* renamed from: b, reason: collision with root package name */
    private final b0 f1988b;

    /* renamed from: c, reason: collision with root package name */
    private final m f1989c;

    h2(Application application, b0 b0Var, m mVar) {
        this.f1987a = application;
        this.f1988b = b0Var;
        this.f1989c = mVar;
    }

    final p0 b(Activity activity, k4.d dVar) {
        p0 a7;
        k4.a a8 = dVar.a();
        if (a8 == null) {
            a8 = new a.C0085a(this.f1987a).b();
        }
        a7 = new f2(this, activity, a8, dVar).a();
        return a7;
    }
}
