package defpackage;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final /* synthetic */ class bc implements vl {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ bc(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.vl
    public final Object a() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                qf qfVar = new qf();
                ((cc) obj).getNavigationEventDispatcher().a(qfVar);
                return qfVar;
            case 1:
                return new lw(new q1(5, (cc) obj));
            default:
                return new jw((lw) obj);
        }
    }
}
