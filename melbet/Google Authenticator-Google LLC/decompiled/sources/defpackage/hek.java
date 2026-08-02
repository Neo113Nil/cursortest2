package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hek extends hel {
    final transient int a;
    final transient int b;
    final /* synthetic */ hel c;

    public hek(hel helVar, int i, int i2) {
        this.c = helVar;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.hel
    /* renamed from: b */
    public final hel subList(int i, int i2) {
        hoq.G(i, i2, this.b);
        int i3 = this.a;
        return this.c.subList(i + i3, i2 + i3);
    }

    @Override // defpackage.heb
    public final int e() {
        return this.c.f() + this.a + this.b;
    }

    @Override // defpackage.heb
    public final int f() {
        return this.c.f() + this.a;
    }

    @Override // java.util.List
    public final Object get(int i) {
        hoq.O(i, this.b);
        return this.c.get(i + this.a);
    }

    @Override // defpackage.heb
    public final boolean l() {
        return true;
    }

    @Override // defpackage.heb
    public final Object[] m() {
        return this.c.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    @Override // defpackage.hel, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.hel, defpackage.heb
    public Object writeReplace() {
        return super.writeReplace();
    }
}
