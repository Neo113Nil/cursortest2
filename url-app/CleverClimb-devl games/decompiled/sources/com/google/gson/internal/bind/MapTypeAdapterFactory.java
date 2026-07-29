package com.google.gson.internal.bind;

import com.google.gson.j;
import com.google.gson.o;
import com.google.gson.r;
import com.google.gson.t;
import com.google.gson.u;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public final class MapTypeAdapterFactory implements u {

    /* renamed from: a, reason: collision with root package name */
    final boolean f6542a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.gson.internal.c f6543b;

    public MapTypeAdapterFactory(com.google.gson.internal.c cVar, boolean z) {
        this.f6543b = cVar;
        this.f6542a = z;
    }

    @Override // com.google.gson.u
    public <T> t<T> a(com.google.gson.e eVar, com.google.gson.b.a<T> aVar) {
        Type type = aVar.getType();
        if (!Map.class.isAssignableFrom(aVar.getRawType())) {
            return null;
        }
        Type[] b2 = com.google.gson.internal.b.b(type, com.google.gson.internal.b.e(type));
        return new a(eVar, b2[0], a(eVar, b2[0]), b2[1], eVar.a((com.google.gson.b.a) com.google.gson.b.a.get(b2[1])), this.f6543b.a(aVar));
    }

    private t<?> a(com.google.gson.e eVar, Type type) {
        if (type == Boolean.TYPE || type == Boolean.class) {
            return i.f;
        }
        return eVar.a((com.google.gson.b.a) com.google.gson.b.a.get(type));
    }

    private final class a<K, V> extends t<Map<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        private final t<K> f6545b;

        /* renamed from: c, reason: collision with root package name */
        private final t<V> f6546c;

        /* renamed from: d, reason: collision with root package name */
        private final com.google.gson.internal.g<? extends Map<K, V>> f6547d;

        public a(com.google.gson.e eVar, Type type, t<K> tVar, Type type2, t<V> tVar2, com.google.gson.internal.g<? extends Map<K, V>> gVar) {
            this.f6545b = new h(eVar, tVar, type);
            this.f6546c = new h(eVar, tVar2, type2);
            this.f6547d = gVar;
        }

        @Override // com.google.gson.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<K, V> b(com.google.gson.c.a aVar) throws IOException {
            com.google.gson.c.b f = aVar.f();
            if (f == com.google.gson.c.b.NULL) {
                aVar.j();
                return null;
            }
            Map<K, V> a2 = this.f6547d.a();
            if (f == com.google.gson.c.b.BEGIN_ARRAY) {
                aVar.a();
                while (aVar.e()) {
                    aVar.a();
                    K b2 = this.f6545b.b(aVar);
                    if (a2.put(b2, this.f6546c.b(aVar)) != null) {
                        throw new r("duplicate key: " + b2);
                    }
                    aVar.b();
                }
                aVar.b();
            } else {
                aVar.c();
                while (aVar.e()) {
                    com.google.gson.internal.d.f6638a.a(aVar);
                    K b3 = this.f6545b.b(aVar);
                    if (a2.put(b3, this.f6546c.b(aVar)) != null) {
                        throw new r("duplicate key: " + b3);
                    }
                }
                aVar.d();
            }
            return a2;
        }

        @Override // com.google.gson.t
        public void a(com.google.gson.c.c cVar, Map<K, V> map) throws IOException {
            if (map == null) {
                cVar.f();
                return;
            }
            if (!MapTypeAdapterFactory.this.f6542a) {
                cVar.d();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.a(String.valueOf(entry.getKey()));
                    this.f6546c.a(cVar, entry.getValue());
                }
                cVar.e();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i = 0;
            boolean z = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                j a2 = this.f6545b.a(entry2.getKey());
                arrayList.add(a2);
                arrayList2.add(entry2.getValue());
                z |= a2.i() || a2.j();
            }
            if (z) {
                cVar.b();
                int size = arrayList.size();
                while (i < size) {
                    cVar.b();
                    com.google.gson.internal.j.a((j) arrayList.get(i), cVar);
                    this.f6546c.a(cVar, arrayList2.get(i));
                    cVar.c();
                    i++;
                }
                cVar.c();
                return;
            }
            cVar.d();
            int size2 = arrayList.size();
            while (i < size2) {
                cVar.a(a((j) arrayList.get(i)));
                this.f6546c.a(cVar, arrayList2.get(i));
                i++;
            }
            cVar.e();
        }

        private String a(j jVar) {
            if (jVar.k()) {
                o o = jVar.o();
                if (o.q()) {
                    return String.valueOf(o.b());
                }
                if (o.a()) {
                    return Boolean.toString(o.h());
                }
                if (o.r()) {
                    return o.c();
                }
                throw new AssertionError();
            }
            if (jVar.l()) {
                return "null";
            }
            throw new AssertionError();
        }
    }
}
