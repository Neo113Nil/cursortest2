package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eue implements jku {
    private final /* synthetic */ int a;

    public eue(int i) {
        this.a = i;
    }

    @Override // defpackage.jku
    public final /* synthetic */ Object a(int i) {
        int i2 = this.a;
        if (i2 == 0) {
            iac b = iac.b(i);
            return b == null ? iac.UNKNOWN : b;
        }
        if (i2 == 1) {
            iac b2 = iac.b(i);
            return b2 == null ? iac.UNKNOWN : b2;
        }
        if (i2 != 2) {
            ije b3 = ije.b(i);
            return b3 == null ? ije.BADGE_SOURCE_UNDEFINED : b3;
        }
        frs b4 = frs.b(i);
        return b4 == null ? frs.OWNER_USER_TYPE_UNKNOWN : b4;
    }
}
