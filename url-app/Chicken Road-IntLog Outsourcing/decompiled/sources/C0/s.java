package C0;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class s implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public static final String f355g = s0.s.f("WorkForegroundRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final D0.k f356a = new D0.k();

    /* renamed from: b, reason: collision with root package name */
    public final Context f357b;

    /* renamed from: c, reason: collision with root package name */
    public final B0.q f358c;

    /* renamed from: d, reason: collision with root package name */
    public final s0.r f359d;

    /* renamed from: e, reason: collision with root package name */
    public final u f360e;

    /* renamed from: f, reason: collision with root package name */
    public final B4.i f361f;

    public s(Context context, B0.q qVar, s0.r rVar, u uVar, B4.i iVar) {
        this.f357b = context;
        this.f358c = qVar;
        this.f359d = rVar;
        this.f360e = uVar;
        this.f361f = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f358c.f189q || Build.VERSION.SDK_INT >= 31) {
            this.f356a.k(null);
            return;
        }
        D0.k kVar = new D0.k();
        B4.i iVar = this.f361f;
        ((A.c) iVar.f313d).execute(new B3.c(this, 1, kVar));
        kVar.a(new A0.a(this, 4, kVar), (A.c) iVar.f313d);
    }
}
