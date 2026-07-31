package w4;

import m5.j;
import m5.k;

/* loaded from: classes.dex */
public class e extends w4.a {

    /* renamed from: a, reason: collision with root package name */
    final j f23030a;

    /* renamed from: b, reason: collision with root package name */
    final a f23031b;

    class a implements g {

        /* renamed from: a, reason: collision with root package name */
        final k.d f23032a;

        a(k.d dVar) {
            this.f23032a = dVar;
        }

        @Override // w4.g
        public void a(Object obj) {
            this.f23032a.a(obj);
        }

        @Override // w4.g
        public void b(String str, String str2, Object obj) {
            this.f23032a.b(str, str2, obj);
        }
    }

    public e(j jVar, k.d dVar) {
        this.f23030a = jVar;
        this.f23031b = new a(dVar);
    }

    @Override // w4.f
    public <T> T c(String str) {
        return (T) this.f23030a.a(str);
    }

    @Override // w4.a
    public g k() {
        return this.f23031b;
    }
}
