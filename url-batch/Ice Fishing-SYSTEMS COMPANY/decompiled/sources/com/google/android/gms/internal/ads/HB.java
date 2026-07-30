package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class HB extends AbstractSet {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f25318n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ JB f25319u;

    public /* synthetic */ HB(JB jb, int i) {
        this.f25318n = i;
        this.f25319u = jb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f25318n) {
            case 0:
                this.f25319u.clear();
                break;
            default:
                this.f25319u.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f25318n) {
            case 0:
                JB jb = this.f25319u;
                Map f6 = jb.f();
                if (f6 != null) {
                    return f6.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int j9 = jb.j(entry.getKey());
                    if (j9 != -1 && Objects.equals(jb.d()[j9], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f25319u.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f25318n) {
            case 0:
                JB jb = this.f25319u;
                Map f6 = jb.f();
                return f6 != null ? f6.entrySet().iterator() : new GB(jb, 1);
            default:
                JB jb2 = this.f25319u;
                Map f9 = jb2.f();
                return f9 != null ? f9.keySet().iterator() : new GB(jb2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f25318n) {
            case 0:
                JB jb = this.f25319u;
                Map f6 = jb.f();
                if (f6 != null) {
                    return f6.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!jb.e()) {
                        int h9 = jb.h();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = jb.f25741n;
                        Objects.requireNonNull(obj2);
                        int Q3 = AbstractC3217fl.Q(key, value, h9, obj2, jb.a(), jb.c(), jb.d());
                        if (Q3 != -1) {
                            jb.g(Q3, h9);
                            jb.f25746y--;
                            jb.f25745x += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                JB jb2 = this.f25319u;
                Map f9 = jb2.f();
                return f9 != null ? f9.keySet().remove(obj) : jb2.k(obj) != JB.f25738C;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f25318n) {
        }
        return this.f25319u.size();
    }
}
