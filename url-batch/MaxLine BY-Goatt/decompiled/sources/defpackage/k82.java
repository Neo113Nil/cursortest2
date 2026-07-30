package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class k82 extends p11 {
    public final transient n11 p;
    public final transient Object[] q;
    public final transient int r;

    public k82(n11 n11Var, Object[] objArr, int i) {
        this.p = n11Var;
        this.q = objArr;
        this.r = i;
    }

    @Override // defpackage.e11
    public final int a(Object[] objArr) {
        return f().a(objArr);
    }

    @Override // defpackage.e11, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.p.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.e11
    /* renamed from: e */
    public final g23 iterator() {
        return f().listIterator(0);
    }

    @Override // defpackage.p11
    public final k11 k() {
        return new j82(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.r;
    }
}
