package d.a.a;

import b.ab;
import b.v;
import com.google.gson.t;
import d.e;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

/* compiled from: GsonRequestBodyConverter.java */
/* loaded from: classes2.dex */
final class b<T> implements e<T, ab> {

    /* renamed from: a, reason: collision with root package name */
    private static final v f9538a = v.a("application/json; charset=UTF-8");

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f9539b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    private final com.google.gson.e f9540c;

    /* renamed from: d, reason: collision with root package name */
    private final t<T> f9541d;

    b(com.google.gson.e eVar, t<T> tVar) {
        this.f9540c = eVar;
        this.f9541d = tVar;
    }

    @Override // d.e
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ab a(T t) throws IOException {
        c.c cVar = new c.c();
        com.google.gson.c.c a2 = this.f9540c.a((Writer) new OutputStreamWriter(cVar.d(), f9539b));
        this.f9541d.a(a2, t);
        a2.close();
        return ab.a(f9538a, cVar.o());
    }
}
