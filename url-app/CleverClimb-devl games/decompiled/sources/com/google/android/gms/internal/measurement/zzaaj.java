package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes2.dex */
final class zzaaj<K, V> implements Iterator<Map.Entry<K, V>> {
    private int pos;
    private final /* synthetic */ zzaad zzbwq;
    private boolean zzbwr;
    private Iterator<Map.Entry<K, V>> zzbws;

    private zzaaj(zzaad zzaadVar) {
        this.zzbwq = zzaadVar;
        this.pos = -1;
    }

    /* synthetic */ zzaaj(zzaad zzaadVar, zzaae zzaaeVar) {
        this(zzaadVar);
    }

    private final Iterator<Map.Entry<K, V>> zzvh() {
        Map map;
        if (this.zzbws == null) {
            map = this.zzbwq.zzbwk;
            this.zzbws = map.entrySet().iterator();
        }
        return this.zzbws;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.pos + 1;
        list = this.zzbwq.zzbwj;
        if (i >= list.size()) {
            map = this.zzbwq.zzbwk;
            if (map.isEmpty() || !zzvh().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        Map.Entry<K, V> next;
        List list2;
        this.zzbwr = true;
        int i = this.pos + 1;
        this.pos = i;
        list = this.zzbwq.zzbwj;
        if (i < list.size()) {
            list2 = this.zzbwq.zzbwj;
            next = (Map.Entry<K, V>) list2.get(this.pos);
        } else {
            next = zzvh().next();
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.zzbwr) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzbwr = false;
        this.zzbwq.zzvd();
        int i = this.pos;
        list = this.zzbwq.zzbwj;
        if (i >= list.size()) {
            zzvh().remove();
            return;
        }
        zzaad zzaadVar = this.zzbwq;
        int i2 = this.pos;
        this.pos = i2 - 1;
        zzaadVar.zzak(i2);
    }
}
