package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gco implements jrw {
    private final jsb a;

    public gco(jsb jsbVar) {
        this.a = jsbVar;
    }

    @Override // defpackage.koe, defpackage.kod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gcr b() {
        gcr gcrVar;
        int ordinal = ((gdd) this.a).b().ordinal();
        if (ordinal == 0) {
            gcrVar = gcr.a;
        } else if (ordinal == 1) {
            gcrVar = gcr.b;
        } else {
            if (ordinal != 2 && ordinal != 3 && ordinal != 4) {
                throw new RuntimeException(null, null);
            }
            gcrVar = gcr.a;
        }
        gcrVar.getClass();
        return gcrVar;
    }
}
