package defpackage;

import java.util.AbstractList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jkv extends AbstractList {
    private final jkt a;
    private final jku b;

    public jkv(jkt jktVar, jku jkuVar) {
        this.a = jktVar;
        this.b = jkuVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.b.a(this.a.e(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
