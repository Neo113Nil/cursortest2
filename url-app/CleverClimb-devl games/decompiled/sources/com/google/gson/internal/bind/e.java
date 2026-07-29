package com.google.gson.internal.bind;

import com.google.gson.t;
import com.google.gson.u;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: ObjectTypeAdapter.java */
/* loaded from: classes2.dex */
public final class e extends t<Object> {

    /* renamed from: a, reason: collision with root package name */
    public static final u f6596a = new u() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter$1
        @Override // com.google.gson.u
        public <T> t<T> a(com.google.gson.e eVar, com.google.gson.b.a<T> aVar) {
            if (aVar.getRawType() == Object.class) {
                return new e(eVar);
            }
            return null;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private final com.google.gson.e f6597b;

    e(com.google.gson.e eVar) {
        this.f6597b = eVar;
    }

    @Override // com.google.gson.t
    public Object b(com.google.gson.c.a aVar) throws IOException {
        switch (aVar.f()) {
            case BEGIN_ARRAY:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.e()) {
                    arrayList.add(b(aVar));
                }
                aVar.b();
                return arrayList;
            case BEGIN_OBJECT:
                com.google.gson.internal.f fVar = new com.google.gson.internal.f();
                aVar.c();
                while (aVar.e()) {
                    fVar.put(aVar.g(), b(aVar));
                }
                aVar.d();
                return fVar;
            case STRING:
                return aVar.h();
            case NUMBER:
                return Double.valueOf(aVar.k());
            case BOOLEAN:
                return Boolean.valueOf(aVar.i());
            case NULL:
                aVar.j();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.t
    public void a(com.google.gson.c.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.f();
            return;
        }
        t a2 = this.f6597b.a((Class) obj.getClass());
        if (a2 instanceof e) {
            cVar.d();
            cVar.e();
        } else {
            a2.a(cVar, obj);
        }
    }
}
