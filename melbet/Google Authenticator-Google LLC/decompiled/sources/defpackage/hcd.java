package defpackage;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hcd extends AbstractSet {
    final /* synthetic */ hci a;

    public hcd(hci hciVar) {
        this.a = hciVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        hci hciVar = this.a;
        Map n = hciVar.n();
        if (n != null) {
            return n.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int f = hciVar.f(entry.getKey());
            if (f != -1 && Objects.equals(hciVar.j(f), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.a.k();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int e;
        int ai;
        hci hciVar = this.a;
        Map n = hciVar.n();
        if (n != null) {
            return n.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (hciVar.u() || (ai = hnu.ai(entry.getKey(), entry.getValue(), (e = hciVar.e()), hciVar.i(), hciVar.v(), hciVar.w(), hciVar.x())) == -1) {
            return false;
        }
        hciVar.r(ai, e);
        hciVar.f--;
        hciVar.o();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
