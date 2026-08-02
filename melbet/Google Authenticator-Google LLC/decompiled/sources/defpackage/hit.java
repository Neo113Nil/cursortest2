package defpackage;

import java.util.AbstractMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hit extends hel {
    final /* synthetic */ hiu a;

    public hit(hiu hiuVar) {
        this.a = hiuVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        hiu hiuVar = this.a;
        hoq.O(i, hiuVar.c);
        Object[] objArr = hiuVar.a;
        int i2 = i + i;
        int i3 = hiuVar.b;
        Object obj = objArr[i2 + i3];
        obj.getClass();
        Object obj2 = objArr[i2 + (i3 ^ 1)];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // defpackage.heb
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.c;
    }

    @Override // defpackage.hel, defpackage.heb
    public Object writeReplace() {
        return super.writeReplace();
    }
}
