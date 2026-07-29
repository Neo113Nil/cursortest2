package com.google.gson.internal.bind;

import com.google.gson.q;
import com.google.gson.t;
import com.google.gson.u;

/* loaded from: classes2.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements u {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.gson.internal.c f6541a;

    public JsonAdapterAnnotationTypeAdapterFactory(com.google.gson.internal.c cVar) {
        this.f6541a = cVar;
    }

    @Override // com.google.gson.u
    public <T> t<T> a(com.google.gson.e eVar, com.google.gson.b.a<T> aVar) {
        com.google.gson.a.b bVar = (com.google.gson.a.b) aVar.getRawType().getAnnotation(com.google.gson.a.b.class);
        if (bVar == null) {
            return null;
        }
        return (t<T>) a(this.f6541a, eVar, aVar, bVar);
    }

    t<?> a(com.google.gson.internal.c cVar, com.google.gson.e eVar, com.google.gson.b.a<?> aVar, com.google.gson.a.b bVar) {
        t<?> treeTypeAdapter;
        Object a2 = cVar.a(com.google.gson.b.a.get((Class) bVar.a())).a();
        if (a2 instanceof t) {
            treeTypeAdapter = (t) a2;
        } else if (a2 instanceof u) {
            treeTypeAdapter = ((u) a2).a(eVar, aVar);
        } else {
            boolean z = a2 instanceof q;
            if (z || (a2 instanceof com.google.gson.i)) {
                treeTypeAdapter = new TreeTypeAdapter<>(z ? (q) a2 : null, a2 instanceof com.google.gson.i ? (com.google.gson.i) a2 : null, eVar, aVar, null);
            } else {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + a2.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
        }
        return (treeTypeAdapter == null || !bVar.b()) ? treeTypeAdapter : treeTypeAdapter.a();
    }
}
