package com.google.gson.internal.bind;

import com.google.gson.t;
import com.google.gson.u;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* compiled from: ArrayTypeAdapter.java */
/* loaded from: classes2.dex */
public final class a<E> extends t<Object> {

    /* renamed from: a, reason: collision with root package name */
    public static final u f6583a = new u() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter$1
        @Override // com.google.gson.u
        public <T> t<T> a(com.google.gson.e eVar, com.google.gson.b.a<T> aVar) {
            Type type = aVar.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type g = com.google.gson.internal.b.g(type);
            return new a(eVar, eVar.a((com.google.gson.b.a) com.google.gson.b.a.get(g)), com.google.gson.internal.b.e(g));
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private final Class<E> f6584b;

    /* renamed from: c, reason: collision with root package name */
    private final t<E> f6585c;

    public a(com.google.gson.e eVar, t<E> tVar, Class<E> cls) {
        this.f6585c = new h(eVar, tVar, cls);
        this.f6584b = cls;
    }

    @Override // com.google.gson.t
    public Object b(com.google.gson.c.a aVar) throws IOException {
        if (aVar.f() == com.google.gson.c.b.NULL) {
            aVar.j();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.e()) {
            arrayList.add(this.f6585c.b(aVar));
        }
        aVar.b();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.f6584b, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    @Override // com.google.gson.t
    public void a(com.google.gson.c.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.f();
            return;
        }
        cVar.b();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f6585c.a(cVar, Array.get(obj, i));
        }
        cVar.c();
    }
}
