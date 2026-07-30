package com.crrepa.o1;

import com.crrepa.l1.n;
import com.crrepa.l1.p;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class a extends n {

    /* renamed from: c, reason: collision with root package name */
    public static final p f13473c = new C0235a();

    /* renamed from: a, reason: collision with root package name */
    private final Class<Object> f13474a;

    /* renamed from: b, reason: collision with root package name */
    private final n f13475b;

    /* renamed from: com.crrepa.o1.a$a, reason: collision with other inner class name */
    class C0235a implements p {
        C0235a() {
        }

        @Override // com.crrepa.l1.p
        public <T> n a(com.crrepa.l1.e eVar, com.crrepa.s1.a aVar) {
            Type b8 = aVar.b();
            if (!(b8 instanceof GenericArrayType) && (!(b8 instanceof Class) || !((Class) b8).isArray())) {
                return null;
            }
            Type d8 = com.crrepa.n1.b.d(b8);
            return new a(eVar, eVar.a(com.crrepa.s1.a.a(d8)), com.crrepa.n1.b.e(d8));
        }
    }

    public a(com.crrepa.l1.e eVar, n nVar, Class<Object> cls) {
        this.f13475b = new l(eVar, nVar, cls);
        this.f13474a = cls;
    }

    @Override // com.crrepa.l1.n
    public Object a(com.crrepa.t1.a aVar) {
        if (aVar.t() == com.crrepa.t1.c.NULL) {
            aVar.q();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.i()) {
            arrayList.add(this.f13475b.a(aVar));
        }
        aVar.f();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.f13474a, size);
        for (int i8 = 0; i8 < size; i8++) {
            Array.set(newInstance, i8, arrayList.get(i8));
        }
        return newInstance;
    }

    @Override // com.crrepa.l1.n
    public void a(com.crrepa.t1.b bVar, Object obj) {
        if (obj == null) {
            bVar.k();
            return;
        }
        bVar.c();
        int length = Array.getLength(obj);
        for (int i8 = 0; i8 < length; i8++) {
            this.f13475b.a(bVar, Array.get(obj, i8));
        }
        bVar.e();
    }
}
