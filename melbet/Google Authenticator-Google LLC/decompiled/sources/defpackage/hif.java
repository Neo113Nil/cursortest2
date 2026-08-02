package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hif extends hjl {
    final /* synthetic */ hbp a;

    public hif(hbp hbpVar) {
        this.a = hbpVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof hid) {
            hid hidVar = (hid) obj;
            if (hidVar.a() > 0 && this.a.b(hidVar.a) == hidVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.a.f();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof hid)) {
            return false;
        }
        hid hidVar = (hid) obj;
        Object obj2 = hidVar.a;
        int a = hidVar.a();
        if (a != 0) {
            return this.a.h(obj2, a);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.c();
    }
}
