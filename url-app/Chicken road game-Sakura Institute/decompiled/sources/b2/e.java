package b2;

import A.AbstractC0017m;
import H1.o;
import android.text.TextUtils;
import j2.AbstractC0720j;
import j2.AbstractC0721k;
import j2.C0717g;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final g2.i f5636a;

    /* renamed from: b, reason: collision with root package name */
    public final g2.d f5637b;

    /* renamed from: c, reason: collision with root package name */
    public g2.h f5638c;

    public e(g2.d dVar, g2.i iVar) {
        this.f5636a = iVar;
        this.f5637b = dVar;
    }

    public static e a() {
        e a4;
        V1.f c4 = V1.f.c();
        c4.b();
        String str = c4.f4167c.f4180c;
        if (str == null) {
            c4.b();
            if (c4.f4167c.f4184g == null) {
                throw new C0518b("Failed to get FirebaseDatabase instance: Can't determine Firebase Database URL. Be sure to include a Project ID in your configuration.");
            }
            StringBuilder sb = new StringBuilder("https://");
            c4.b();
            str = AbstractC0017m.n(sb, c4.f4167c.f4184g, "-default-rtdb.firebaseio.com");
        }
        synchronized (e.class) {
            if (TextUtils.isEmpty(str)) {
                throw new C0518b("Failed to get FirebaseDatabase instance: Specify DatabaseURL within FirebaseApp or from your getInstance() call.");
            }
            c4.b();
            f fVar = (f) c4.f4168d.a(f.class);
            o.e(fVar, "Firebase Database component is not present.");
            C0717g d4 = AbstractC0720j.d(str);
            if (!d4.f7163b.isEmpty()) {
                throw new C0518b("Specified Database URL '" + str + "' is invalid. It should point to the root of a Firebase Database but it includes a path: " + d4.f7163b.toString());
            }
            a4 = fVar.a(d4.f7162a);
        }
        return a4;
    }

    public final C0519c b() {
        synchronized (this) {
            if (this.f5638c == null) {
                this.f5636a.getClass();
                this.f5638c = g2.j.a(this.f5637b, this.f5636a);
            }
        }
        AbstractC0721k.b("appConfig");
        return new C0519c(this.f5638c, new g2.e("appConfig"));
    }
}
