package d;

import d.c;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* compiled from: DefaultCallAdapterFactory.java */
/* loaded from: classes2.dex */
final class f extends c.a {

    /* renamed from: a, reason: collision with root package name */
    static final c.a f9548a = new f();

    f() {
    }

    @Override // d.c.a
    public c<?, ?> a(Type type, Annotation[] annotationArr, n nVar) {
        if (a(type) != b.class) {
            return null;
        }
        final Type e = p.e(type);
        return new c<Object, b<?>>() { // from class: d.f.1
            @Override // d.c
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b<Object> a(b<Object> bVar) {
                return bVar;
            }

            @Override // d.c
            public Type a() {
                return e;
            }
        };
    }
}
