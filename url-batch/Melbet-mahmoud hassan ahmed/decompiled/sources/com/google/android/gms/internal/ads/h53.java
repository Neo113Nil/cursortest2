package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
final class h53 extends z73 {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ j53 f6080f;

    h53(j53 j53Var) {
        this.f6080f = j53Var;
    }

    @Override // com.google.android.gms.internal.ads.z73, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set entrySet = this.f6080f.f6980h.entrySet();
        Objects.requireNonNull(entrySet);
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.z73
    final Map i() {
        return this.f6080f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return new i53(this.f6080f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        x53.u(this.f6080f.f6981i, entry.getKey());
        return true;
    }
}
