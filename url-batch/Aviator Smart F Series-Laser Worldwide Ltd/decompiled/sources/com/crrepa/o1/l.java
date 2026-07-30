package com.crrepa.o1;

import com.crrepa.l1.n;
import com.crrepa.o1.k;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* loaded from: classes3.dex */
final class l extends n {

    /* renamed from: a, reason: collision with root package name */
    private final com.crrepa.l1.e f13524a;

    /* renamed from: b, reason: collision with root package name */
    private final n f13525b;

    /* renamed from: c, reason: collision with root package name */
    private final Type f13526c;

    l(com.crrepa.l1.e eVar, n nVar, Type type) {
        this.f13524a = eVar;
        this.f13525b = nVar;
        this.f13526c = type;
    }

    @Override // com.crrepa.l1.n
    public Object a(com.crrepa.t1.a aVar) {
        return this.f13525b.a(aVar);
    }

    private Type a(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    @Override // com.crrepa.l1.n
    public void a(com.crrepa.t1.b bVar, Object obj) {
        n nVar = this.f13525b;
        Type a8 = a(this.f13526c, obj);
        if (a8 != this.f13526c) {
            nVar = this.f13524a.a(com.crrepa.s1.a.a(a8));
            if (nVar instanceof k.b) {
                n nVar2 = this.f13525b;
                if (!(nVar2 instanceof k.b)) {
                    nVar = nVar2;
                }
            }
        }
        nVar.a(bVar, obj);
    }
}
