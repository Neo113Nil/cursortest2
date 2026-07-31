package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Map;

/* loaded from: classes.dex */
final class u83 extends e73<Map.Entry> {

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ v83 f12692h;

    u83(v83 v83Var) {
        this.f12692h = v83Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i7) {
        int i8;
        Object[] objArr;
        Object[] objArr2;
        i8 = this.f12692h.f13161j;
        q43.a(i7, i8, "index");
        int i9 = i7 + i7;
        objArr = this.f12692h.f13160i;
        Object obj = objArr[i9];
        obj.getClass();
        objArr2 = this.f12692h.f13160i;
        Object obj2 = objArr2[i9 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.z63
    public final boolean n() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i7;
        i7 = this.f12692h.f13161j;
        return i7;
    }
}
