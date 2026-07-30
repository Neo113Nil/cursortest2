package com.crrepa.o1;

import com.crrepa.l1.n;
import com.crrepa.l1.p;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class b implements p {

    /* renamed from: a, reason: collision with root package name */
    private final com.crrepa.n1.c f13476a;

    public b(com.crrepa.n1.c cVar) {
        this.f13476a = cVar;
    }

    @Override // com.crrepa.l1.p
    public <T> n a(com.crrepa.l1.e eVar, com.crrepa.s1.a aVar) {
        Type b8 = aVar.b();
        Class<Object> a8 = aVar.a();
        if (!Collection.class.isAssignableFrom(a8)) {
            return null;
        }
        Type a9 = com.crrepa.n1.b.a(b8, (Class<?>) a8);
        return new a(eVar, a9, eVar.a(com.crrepa.s1.a.a(a9)), this.f13476a.a(aVar));
    }

    private static final class a extends n {

        /* renamed from: a, reason: collision with root package name */
        private final n f13477a;

        /* renamed from: b, reason: collision with root package name */
        private final com.crrepa.n1.g f13478b;

        public a(com.crrepa.l1.e eVar, Type type, n nVar, com.crrepa.n1.g gVar) {
            this.f13477a = new l(eVar, nVar, type);
            this.f13478b = gVar;
        }

        @Override // com.crrepa.l1.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Collection<Object> a(com.crrepa.t1.a aVar) {
            if (aVar.t() == com.crrepa.t1.c.NULL) {
                aVar.q();
                return null;
            }
            Collection<Object> collection = (Collection) this.f13478b.a();
            aVar.a();
            while (aVar.i()) {
                collection.add(this.f13477a.a(aVar));
            }
            aVar.f();
            return collection;
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, Collection<Object> collection) {
            if (collection == null) {
                bVar.k();
                return;
            }
            bVar.c();
            Iterator<Object> it = collection.iterator();
            while (it.hasNext()) {
                this.f13477a.a(bVar, it.next());
            }
            bVar.e();
        }
    }
}
