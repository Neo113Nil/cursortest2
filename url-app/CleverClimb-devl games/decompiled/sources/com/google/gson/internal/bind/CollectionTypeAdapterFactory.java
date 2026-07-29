package com.google.gson.internal.bind;

import com.google.gson.t;
import com.google.gson.u;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class CollectionTypeAdapterFactory implements u {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.gson.internal.c f6538a;

    public CollectionTypeAdapterFactory(com.google.gson.internal.c cVar) {
        this.f6538a = cVar;
    }

    @Override // com.google.gson.u
    public <T> t<T> a(com.google.gson.e eVar, com.google.gson.b.a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type a2 = com.google.gson.internal.b.a(type, (Class<?>) rawType);
        return new a(eVar, a2, eVar.a((com.google.gson.b.a) com.google.gson.b.a.get(a2)), this.f6538a.a(aVar));
    }

    private static final class a<E> extends t<Collection<E>> {

        /* renamed from: a, reason: collision with root package name */
        private final t<E> f6539a;

        /* renamed from: b, reason: collision with root package name */
        private final com.google.gson.internal.g<? extends Collection<E>> f6540b;

        public a(com.google.gson.e eVar, Type type, t<E> tVar, com.google.gson.internal.g<? extends Collection<E>> gVar) {
            this.f6539a = new h(eVar, tVar, type);
            this.f6540b = gVar;
        }

        @Override // com.google.gson.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection<E> b(com.google.gson.c.a aVar) throws IOException {
            if (aVar.f() == com.google.gson.c.b.NULL) {
                aVar.j();
                return null;
            }
            Collection<E> a2 = this.f6540b.a();
            aVar.a();
            while (aVar.e()) {
                a2.add(this.f6539a.b(aVar));
            }
            aVar.b();
            return a2;
        }

        @Override // com.google.gson.t
        public void a(com.google.gson.c.c cVar, Collection<E> collection) throws IOException {
            if (collection == null) {
                cVar.f();
                return;
            }
            cVar.b();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f6539a.a(cVar, it.next());
            }
            cVar.c();
        }
    }
}
