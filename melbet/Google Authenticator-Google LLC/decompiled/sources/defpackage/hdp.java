package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hdp extends hds {
    final /* synthetic */ hdt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hdp(hdt hdtVar) {
        super(hdtVar);
        this.a = hdtVar;
    }

    @Override // defpackage.hds
    public final Object a(int i) {
        return this.a.a[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int ag = hnu.ag(obj);
        hdt hdtVar = this.a;
        int b = hdtVar.b(obj, ag);
        if (b == -1) {
            return false;
        }
        hdtVar.e(b, ag);
        return true;
    }
}
