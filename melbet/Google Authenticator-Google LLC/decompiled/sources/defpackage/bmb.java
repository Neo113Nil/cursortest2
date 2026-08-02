package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bmb implements bmc {
    final /* synthetic */ bmc a;
    private volatile Object b;

    public bmb(bmc bmcVar) {
        this.a = bmcVar;
    }

    @Override // defpackage.bmc
    public final Object a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    Object a = this.a.a();
                    a.v(a, "Argument must not be null");
                    this.b = a;
                }
            }
        }
        return this.b;
    }
}
