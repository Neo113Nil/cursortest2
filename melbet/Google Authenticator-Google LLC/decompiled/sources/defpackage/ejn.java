package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ejn implements ejo {
    final Object a;
    private final /* synthetic */ int b;

    public ejn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ejo
    public final hvi a() {
        return this.b != 0 ? hnu.aJ(new ejm(this, 1)) : hnu.aJ(new ejm(this, 0));
    }
}
