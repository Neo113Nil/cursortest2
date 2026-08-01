package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.p;
import com.bykv.vk.openvk.preload.a.r;
import com.bykv.vk.openvk.preload.a.t;
import com.bykv.vk.openvk.preload.a.u;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: MapTypeAdapterFactory.java */
/* loaded from: classes.dex */
public final class g implements u {
    final boolean a;
    private final com.bykv.vk.openvk.preload.a.b.c b;

    public g(com.bykv.vk.openvk.preload.a.b.c cVar, boolean z) {
        this.b = cVar;
        this.a = z;
    }

    /* compiled from: MapTypeAdapterFactory.java */
    final class a<K, V> extends t<Map<K, V>> {
        private final t<K> b;
        private final t<V> c;
        private final com.bykv.vk.openvk.preload.a.b.i<? extends Map<K, V>> d;

        @Override // com.bykv.vk.openvk.preload.a.t
        public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Object obj) throws IOException {
            String str;
            Map map = (Map) obj;
            if (map == null) {
                cVar.e();
                return;
            }
            if (!g.this.a) {
                cVar.c();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.a(String.valueOf(entry.getKey()));
                    this.c.a(cVar, entry.getValue());
                }
                cVar.d();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i = 0;
            boolean z = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                com.bykv.vk.openvk.preload.a.k a = this.b.a((t<K>) entry2.getKey());
                arrayList.add(a);
                arrayList2.add(entry2.getValue());
                z |= (a instanceof com.bykv.vk.openvk.preload.a.i) || (a instanceof com.bykv.vk.openvk.preload.a.n);
            }
            if (z) {
                cVar.a();
                int size = arrayList.size();
                while (i < size) {
                    cVar.a();
                    com.bykv.vk.openvk.preload.a.b.k.a((com.bykv.vk.openvk.preload.a.k) arrayList.get(i), cVar);
                    this.c.a(cVar, arrayList2.get(i));
                    cVar.b();
                    i++;
                }
                cVar.b();
                return;
            }
            cVar.c();
            int size2 = arrayList.size();
            while (i < size2) {
                com.bykv.vk.openvk.preload.a.k kVar = (com.bykv.vk.openvk.preload.a.k) arrayList.get(i);
                if (kVar instanceof p) {
                    p g = kVar.g();
                    if (g.a instanceof Number) {
                        str = String.valueOf(g.a());
                    } else if (g.a instanceof Boolean) {
                        str = Boolean.toString(g.f());
                    } else if (g.a instanceof String) {
                        str = g.b();
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    if (!(kVar instanceof com.bykv.vk.openvk.preload.a.m)) {
                        throw new AssertionError();
                    }
                    str = AbstractJsonLexerKt.NULL;
                }
                cVar.a(str);
                this.c.a(cVar, arrayList2.get(i));
                i++;
            }
            cVar.d();
        }

        public a(com.bykv.vk.openvk.preload.a.f fVar, Type type, t<K> tVar, Type type2, t<V> tVar2, com.bykv.vk.openvk.preload.a.b.i<? extends Map<K, V>> iVar) {
            this.b = new m(fVar, tVar, type);
            this.c = new m(fVar, tVar2, type2);
            this.d = iVar;
        }

        @Override // com.bykv.vk.openvk.preload.a.t
        public final /* synthetic */ Object a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
            com.bykv.vk.openvk.preload.a.d.b f = aVar.f();
            if (f == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                aVar.k();
                return null;
            }
            Map<K, V> a = this.d.a();
            if (f == com.bykv.vk.openvk.preload.a.d.b.BEGIN_ARRAY) {
                aVar.a();
                while (aVar.e()) {
                    aVar.a();
                    K a2 = this.b.a(aVar);
                    if (a.put(a2, this.c.a(aVar)) != null) {
                        throw new r("duplicate key: ".concat(String.valueOf(a2)));
                    }
                    aVar.b();
                }
                aVar.b();
            } else {
                aVar.c();
                while (aVar.e()) {
                    com.bykv.vk.openvk.preload.a.b.f.a.a(aVar);
                    K a3 = this.b.a(aVar);
                    if (a.put(a3, this.c.a(aVar)) != null) {
                        throw new r("duplicate key: ".concat(String.valueOf(a3)));
                    }
                }
                aVar.d();
            }
            return a;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.u
    public final <T> t<T> a(com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        t<Boolean> tVar;
        Type type = aVar.c;
        if (!Map.class.isAssignableFrom(aVar.b)) {
            return null;
        }
        Type[] b = com.bykv.vk.openvk.preload.a.b.b.b(type, com.bykv.vk.openvk.preload.a.b.b.b(type));
        Type type2 = b[0];
        if (type2 == Boolean.TYPE || type2 == Boolean.class) {
            tVar = n.f;
        } else {
            tVar = fVar.a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(type2));
        }
        t<T> a2 = fVar.a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(b[1]));
        com.bykv.vk.openvk.preload.a.b.i<T> a3 = this.b.a(aVar);
        return new a(fVar, b[0], tVar, b[1], a2, a3);
    }
}
