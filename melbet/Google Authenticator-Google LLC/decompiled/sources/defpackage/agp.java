package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agp extends ago {
    public agp(ago agoVar) {
        agoVar.getClass();
        this.b.putAll(agoVar.b);
    }

    @Override // defpackage.ago
    public final Object a(agn agnVar) {
        agnVar.getClass();
        return this.b.get(agnVar);
    }

    public final void b(agn agnVar, Object obj) {
        this.b.put(agnVar, obj);
    }

    public /* synthetic */ agp() {
        this(agm.a);
    }
}
