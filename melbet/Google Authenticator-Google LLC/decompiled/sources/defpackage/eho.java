package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eho extends dja {
    final /* synthetic */ boolean a;
    final /* synthetic */ kri b;
    final /* synthetic */ kzd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eho(boolean z, kzd kzdVar, kri kriVar) {
        super(null);
        this.a = z;
        this.d = kzdVar;
        this.b = kriVar;
    }

    @Override // defpackage.dja
    public final void h(hel helVar) {
        helVar.getClass();
        if (this.a) {
            this.d.j(this.b.a());
        }
    }

    @Override // defpackage.dja
    public final void j(Object obj) {
        this.d.j(this.b.a());
    }
}
