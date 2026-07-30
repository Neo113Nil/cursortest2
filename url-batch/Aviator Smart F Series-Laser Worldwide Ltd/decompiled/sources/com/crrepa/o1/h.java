package com.crrepa.o1;

import com.crrepa.l1.n;
import com.crrepa.l1.p;
import com.crrepa.l1.u;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes3.dex */
public final class h implements p {

    /* renamed from: a, reason: collision with root package name */
    private final com.crrepa.n1.c f13492a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f13493b;

    private final class a extends n {

        /* renamed from: a, reason: collision with root package name */
        private final n f13494a;

        /* renamed from: b, reason: collision with root package name */
        private final n f13495b;

        /* renamed from: c, reason: collision with root package name */
        private final com.crrepa.n1.g f13496c;

        public a(com.crrepa.l1.e eVar, Type type, n nVar, Type type2, n nVar2, com.crrepa.n1.g gVar) {
            this.f13494a = new l(eVar, nVar, type);
            this.f13495b = new l(eVar, nVar2, type2);
            this.f13496c = gVar;
        }

        private String b(com.crrepa.l1.h hVar) {
            if (!hVar.u()) {
                if (hVar.s()) {
                    return "null";
                }
                throw new AssertionError();
            }
            com.crrepa.l1.k m8 = hVar.m();
            if (m8.x()) {
                return String.valueOf(m8.o());
            }
            if (m8.w()) {
                return Boolean.toString(m8.d());
            }
            if (m8.y()) {
                return m8.q();
            }
            throw new AssertionError();
        }

        @Override // com.crrepa.l1.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map<Object, Object> a(com.crrepa.t1.a aVar) {
            com.crrepa.t1.c t7 = aVar.t();
            if (t7 == com.crrepa.t1.c.NULL) {
                aVar.q();
                return null;
            }
            Map<Object, Object> map = (Map) this.f13496c.a();
            if (t7 == com.crrepa.t1.c.BEGIN_ARRAY) {
                aVar.a();
                while (aVar.i()) {
                    aVar.a();
                    Object a8 = this.f13494a.a(aVar);
                    if (map.put(a8, this.f13495b.a(aVar)) != null) {
                        throw new u("duplicate key: " + a8);
                    }
                    aVar.f();
                }
                aVar.f();
            } else {
                aVar.b();
                while (aVar.i()) {
                    com.crrepa.n1.f.f13429a.a(aVar);
                    Object a9 = this.f13494a.a(aVar);
                    if (map.put(a9, this.f13495b.a(aVar)) != null) {
                        throw new u("duplicate key: " + a9);
                    }
                }
                aVar.g();
            }
            return map;
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, Map<Object, Object> map) {
            if (map == null) {
                bVar.k();
                return;
            }
            if (!h.this.f13493b) {
                bVar.d();
                for (Map.Entry<Object, Object> entry : map.entrySet()) {
                    bVar.b(String.valueOf(entry.getKey()));
                    this.f13495b.a(bVar, entry.getValue());
                }
                bVar.f();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i8 = 0;
            boolean z7 = false;
            for (Map.Entry<Object, Object> entry2 : map.entrySet()) {
                com.crrepa.l1.h b8 = this.f13494a.b(entry2.getKey());
                arrayList.add(b8);
                arrayList2.add(entry2.getValue());
                z7 |= b8.r() || b8.t();
            }
            if (!z7) {
                bVar.d();
                int size = arrayList.size();
                while (i8 < size) {
                    bVar.b(b((com.crrepa.l1.h) arrayList.get(i8)));
                    this.f13495b.a(bVar, arrayList2.get(i8));
                    i8++;
                }
                bVar.f();
                return;
            }
            bVar.c();
            int size2 = arrayList.size();
            while (i8 < size2) {
                bVar.c();
                com.crrepa.n1.l.a((com.crrepa.l1.h) arrayList.get(i8), bVar);
                this.f13495b.a(bVar, arrayList2.get(i8));
                bVar.e();
                i8++;
            }
            bVar.e();
        }
    }

    public h(com.crrepa.n1.c cVar, boolean z7) {
        this.f13492a = cVar;
        this.f13493b = z7;
    }

    @Override // com.crrepa.l1.p
    public <T> n a(com.crrepa.l1.e eVar, com.crrepa.s1.a aVar) {
        Type b8 = aVar.b();
        if (!Map.class.isAssignableFrom(aVar.a())) {
            return null;
        }
        Type[] b9 = com.crrepa.n1.b.b(b8, com.crrepa.n1.b.e(b8));
        return new a(eVar, b9[0], a(eVar, b9[0]), b9[1], eVar.a(com.crrepa.s1.a.a(b9[1])), this.f13492a.a(aVar));
    }

    private n a(com.crrepa.l1.e eVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? m.f13532f : eVar.a(com.crrepa.s1.a.a(type));
    }
}
