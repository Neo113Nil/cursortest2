package d;

import b.ab;
import b.ad;
import d.b.w;
import d.e;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* compiled from: BuiltInConverters.java */
/* loaded from: classes2.dex */
final class a extends e.a {
    a() {
    }

    @Override // d.e.a
    public d.e<ad, ?> a(Type type, Annotation[] annotationArr, n nVar) {
        if (type == ad.class) {
            if (p.a(annotationArr, (Class<? extends Annotation>) w.class)) {
                return c.f9545a;
            }
            return C0416a.f9536a;
        }
        if (type == Void.class) {
            return e.f9547a;
        }
        return null;
    }

    @Override // d.e.a
    public d.e<?, ab> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, n nVar) {
        if (ab.class.isAssignableFrom(p.a(type))) {
            return b.f9544a;
        }
        return null;
    }

    /* compiled from: BuiltInConverters.java */
    static final class e implements d.e<ad, Void> {

        /* renamed from: a, reason: collision with root package name */
        static final e f9547a = new e();

        e() {
        }

        @Override // d.e
        public Void a(ad adVar) throws IOException {
            adVar.close();
            return null;
        }
    }

    /* compiled from: BuiltInConverters.java */
    static final class b implements d.e<ab, ab> {

        /* renamed from: a, reason: collision with root package name */
        static final b f9544a = new b();

        @Override // d.e
        public ab a(ab abVar) throws IOException {
            return abVar;
        }

        b() {
        }
    }

    /* compiled from: BuiltInConverters.java */
    static final class c implements d.e<ad, ad> {

        /* renamed from: a, reason: collision with root package name */
        static final c f9545a = new c();

        @Override // d.e
        public ad a(ad adVar) throws IOException {
            return adVar;
        }

        c() {
        }
    }

    /* compiled from: BuiltInConverters.java */
    /* renamed from: d.a$a, reason: collision with other inner class name */
    static final class C0416a implements d.e<ad, ad> {

        /* renamed from: a, reason: collision with root package name */
        static final C0416a f9536a = new C0416a();

        C0416a() {
        }

        @Override // d.e
        public ad a(ad adVar) throws IOException {
            try {
                return p.a(adVar);
            } finally {
                adVar.close();
            }
        }
    }

    /* compiled from: BuiltInConverters.java */
    static final class d implements d.e<Object, String> {

        /* renamed from: a, reason: collision with root package name */
        static final d f9546a = new d();

        d() {
        }

        @Override // d.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a(Object obj) {
            return obj.toString();
        }
    }
}
