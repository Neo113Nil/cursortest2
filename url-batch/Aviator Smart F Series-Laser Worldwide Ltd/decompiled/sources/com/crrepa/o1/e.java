package com.crrepa.o1;

import com.crrepa.l1.n;
import com.crrepa.l1.p;

/* loaded from: classes3.dex */
public final class e implements p {

    /* renamed from: a, reason: collision with root package name */
    private final com.crrepa.n1.c f13486a;

    public e(com.crrepa.n1.c cVar) {
        this.f13486a = cVar;
    }

    @Override // com.crrepa.l1.p
    public <T> n a(com.crrepa.l1.e eVar, com.crrepa.s1.a aVar) {
        i4.b bVar = (i4.b) aVar.a().getAnnotation(i4.b.class);
        if (bVar == null) {
            return null;
        }
        return a(this.f13486a, eVar, aVar, bVar);
    }

    n a(com.crrepa.n1.c cVar, com.crrepa.l1.e eVar, com.crrepa.s1.a aVar, i4.b bVar) {
        n a8;
        Object a9 = cVar.a(com.crrepa.s1.a.a(bVar.value())).a();
        if (a9 instanceof n) {
            a8 = (n) a9;
        } else {
            if (!(a9 instanceof p)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + a9.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            a8 = ((p) a9).a(eVar, aVar);
        }
        return (a8 == null || !bVar.nullSafe()) ? a8 : a8.a();
    }
}
