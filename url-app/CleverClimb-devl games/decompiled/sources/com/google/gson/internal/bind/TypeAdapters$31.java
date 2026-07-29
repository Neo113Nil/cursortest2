package com.google.gson.internal.bind;

import com.google.gson.t;
import com.google.gson.u;

/* loaded from: classes2.dex */
class TypeAdapters$31 implements u {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.gson.b.a f6569a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f6570b;

    @Override // com.google.gson.u
    public <T> t<T> a(com.google.gson.e eVar, com.google.gson.b.a<T> aVar) {
        if (aVar.equals(this.f6569a)) {
            return this.f6570b;
        }
        return null;
    }
}
