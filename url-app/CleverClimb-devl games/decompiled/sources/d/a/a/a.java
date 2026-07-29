package d.a.a;

import b.ab;
import b.ad;
import d.e;
import d.n;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* compiled from: GsonConverterFactory.java */
/* loaded from: classes2.dex */
public final class a extends e.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.gson.e f9537a;

    public static a a() {
        return a(new com.google.gson.e());
    }

    public static a a(com.google.gson.e eVar) {
        return new a(eVar);
    }

    private a(com.google.gson.e eVar) {
        if (eVar == null) {
            throw new NullPointerException("gson == null");
        }
        this.f9537a = eVar;
    }

    @Override // d.e.a
    public e<ad, ?> a(Type type, Annotation[] annotationArr, n nVar) {
        return new c(this.f9537a, this.f9537a.a((com.google.gson.b.a) com.google.gson.b.a.get(type)));
    }

    @Override // d.e.a
    public e<?, ab> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, n nVar) {
        return new b(this.f9537a, this.f9537a.a((com.google.gson.b.a) com.google.gson.b.a.get(type)));
    }
}
