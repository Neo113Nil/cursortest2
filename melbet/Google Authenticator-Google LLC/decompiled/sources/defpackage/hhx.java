package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hhx extends hhr {
    public final hhu a;

    public hhx(hhu hhuVar) {
        this.a = hhuVar;
    }

    @Override // defpackage.hhr
    public final Set b() {
        return new hhw(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        hgu hguVar = (hgu) this.a;
        hguVar.a = null;
        hguVar.b = null;
        hguVar.d.clear();
        hguVar.e = 0;
        hguVar.f++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.m(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (containsKey(obj)) {
            return new hgm((hgu) this.a, obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return ((hgu) this.a).a == null;
    }

    @Override // defpackage.hhr, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.a.q();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object remove(Object obj) {
        if (containsKey(obj)) {
            return ((hgu) this.a).f(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.q().size();
    }
}
