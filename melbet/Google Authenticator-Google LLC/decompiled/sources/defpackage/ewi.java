package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewi implements hac {
    boolean a;
    Object b;
    final /* synthetic */ hac c;

    public ewi(hac hacVar) {
        this.c = hacVar;
    }

    @Override // defpackage.hac
    public final Object bB() {
        if (this.a) {
            return this.b;
        }
        Object bB = this.c.bB();
        this.b = bB;
        this.a = true;
        return bB;
    }
}
