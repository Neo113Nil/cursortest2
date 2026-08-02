package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jqo implements jrq {
    private volatile Object a;
    private final Object b = new Object();
    private final kee c;

    public jqo(kee keeVar) {
        this.c = keeVar;
    }

    @Override // defpackage.jrq
    public final Object C() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    kee keeVar = this.c;
                    jsb jsbVar = bof.a;
                    this.a = new bnl(new ikk(keeVar.a));
                }
            }
        }
        return this.a;
    }
}
