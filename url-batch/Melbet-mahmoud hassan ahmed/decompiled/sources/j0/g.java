package j0;

import android.content.Context;

/* loaded from: classes.dex */
public class g {

    /* renamed from: e, reason: collision with root package name */
    private static g f18068e;

    /* renamed from: a, reason: collision with root package name */
    private a f18069a;

    /* renamed from: b, reason: collision with root package name */
    private b f18070b;

    /* renamed from: c, reason: collision with root package name */
    private e f18071c;

    /* renamed from: d, reason: collision with root package name */
    private f f18072d;

    private g(Context context, n0.a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f18069a = new a(applicationContext, aVar);
        this.f18070b = new b(applicationContext, aVar);
        this.f18071c = new e(applicationContext, aVar);
        this.f18072d = new f(applicationContext, aVar);
    }

    public static synchronized g c(Context context, n0.a aVar) {
        g gVar;
        synchronized (g.class) {
            if (f18068e == null) {
                f18068e = new g(context, aVar);
            }
            gVar = f18068e;
        }
        return gVar;
    }

    public a a() {
        return this.f18069a;
    }

    public b b() {
        return this.f18070b;
    }

    public e d() {
        return this.f18071c;
    }

    public f e() {
        return this.f18072d;
    }
}
