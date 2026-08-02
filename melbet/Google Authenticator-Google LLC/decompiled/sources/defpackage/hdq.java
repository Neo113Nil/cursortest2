package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hdq extends hds {
    final /* synthetic */ hdt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hdq(hdt hdtVar) {
        super(hdtVar);
        this.a = hdtVar;
    }

    @Override // defpackage.hds
    public final Object a(int i) {
        return this.a.b[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int ag = hnu.ag(obj);
        hdt hdtVar = this.a;
        int c = hdtVar.c(obj, ag);
        if (c == -1) {
            return false;
        }
        hdtVar.d(c, hnu.ag(hdtVar.a[c]), ag);
        return true;
    }
}
