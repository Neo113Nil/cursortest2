package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class hld {
    public static final hld c = new hkz();
    public static final hld d = new hkz();

    protected hld() {
    }

    static hld b(hld hldVar, hld hldVar2) {
        hld hldVar3;
        hld hldVar4;
        if (hldVar != null) {
            if (hldVar2 == null || hldVar == (hldVar3 = c) || hldVar2 == (hldVar4 = d)) {
                return hldVar;
            }
            if (hldVar2 != hldVar3 && hldVar != hldVar4) {
                return new hla(hldVar, hldVar2);
            }
        }
        return hldVar2;
    }

    protected abstract void a();
}
