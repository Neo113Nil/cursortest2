package l5;

import android.os.Build;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public l.i f6012a;

    /* renamed from: b, reason: collision with root package name */
    public b6.c f6013b;

    /* renamed from: c, reason: collision with root package name */
    public h5.b f6014c;

    /* renamed from: d, reason: collision with root package name */
    public h5.b f6015d;

    /* renamed from: e, reason: collision with root package name */
    public b1.b f6016e;

    /* renamed from: f, reason: collision with root package name */
    public String f6017f;

    /* renamed from: g, reason: collision with root package name */
    public String f6018g;

    /* renamed from: h, reason: collision with root package name */
    public int f6019h;

    /* renamed from: i, reason: collision with root package name */
    public a5.f f6020i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6021j;

    /* renamed from: k, reason: collision with root package name */
    public androidx.room.c f6022k;

    public final b1.b a(String str) {
        return new b1.b(this.f6012a, str, (Object) null, 22);
    }

    public final androidx.room.c b() {
        if (this.f6022k == null) {
            synchronized (this) {
                this.f6022k = new androidx.room.c(this.f6020i);
            }
        }
        return this.f6022k;
    }

    public final void c() {
        if (this.f6012a == null) {
            androidx.room.c b9 = b();
            int i7 = this.f6019h;
            b9.getClass();
            this.f6012a = new l.i(i7);
        }
        b();
        if (this.f6018g == null) {
            b().getClass();
            this.f6018g = "Firebase/5/21.0.0/" + (Build.VERSION.SDK_INT + "/Android");
        }
        if (this.f6013b == null) {
            b().getClass();
            this.f6013b = new b6.c(20);
        }
        if (this.f6016e == null) {
            androidx.room.c cVar = this.f6022k;
            cVar.getClass();
            this.f6016e = new b1.b(cVar, a("RunLoop"));
        }
        if (this.f6017f == null) {
            this.f6017f = "default";
        }
        m4.o.e(this.f6014c, "You must register an authTokenProvider before initializing Context.");
        m4.o.e(this.f6015d, "You must register an appCheckTokenProvider before initializing Context.");
    }

    public final synchronized void d(String str) {
        if (this.f6021j) {
            throw new g5.b("Modifications to DatabaseConfig objects must occur before they are in use");
        }
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Session identifier is not allowed to be empty or null!");
        }
        this.f6017f = str;
    }
}
