package g5;

import a0.m;
import android.text.TextUtils;
import m4.o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final l5.j f4461a;

    /* renamed from: b, reason: collision with root package name */
    public final l5.d f4462b;

    /* renamed from: c, reason: collision with root package name */
    public l5.i f4463c;

    public e(l5.d dVar, l5.j jVar) {
        this.f4461a = jVar;
        this.f4462b = dVar;
    }

    public static e a() {
        e a3;
        a5.f c4 = a5.f.c();
        c4.b();
        String str = c4.f501c.f514c;
        if (str == null) {
            c4.b();
            if (c4.f501c.f518g == null) {
                throw new b("Failed to get FirebaseDatabase instance: Can't determine Firebase Database URL. Be sure to include a Project ID in your configuration.");
            }
            StringBuilder sb = new StringBuilder("https://");
            c4.b();
            str = m.m(sb, c4.f501c.f518g, "-default-rtdb.firebaseio.com");
        }
        synchronized (e.class) {
            if (TextUtils.isEmpty(str)) {
                throw new b("Failed to get FirebaseDatabase instance: Specify DatabaseURL within FirebaseApp or from your getInstance() call.");
            }
            c4.b();
            f fVar = (f) c4.f502d.a(f.class);
            o.e(fVar, "Firebase Database component is not present.");
            o5.g d8 = o5.j.d(str);
            if (!d8.f6850b.isEmpty()) {
                throw new b("Specified Database URL '" + str + "' is invalid. It should point to the root of a Firebase Database but it includes a path: " + d8.f6850b.toString());
            }
            a3 = fVar.a(d8.f6849a);
        }
        return a3;
    }

    public final c b(String str) {
        synchronized (this) {
            if (this.f4463c == null) {
                this.f4461a.getClass();
                this.f4463c = l5.k.a(this.f4462b, this.f4461a);
            }
        }
        if (str == null) {
            throw new NullPointerException("Can't pass null for argument 'pathString' in FirebaseDatabase.getReference()");
        }
        o5.k.b(str);
        return new c(this.f4463c, new l5.f(str));
    }
}
