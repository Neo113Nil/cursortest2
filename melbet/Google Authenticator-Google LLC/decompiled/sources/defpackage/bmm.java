package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bmm implements wq {
    private final bml a;
    private final bmo b;
    private final wq c;

    public bmm(wq wqVar, bml bmlVar, bmo bmoVar) {
        this.c = wqVar;
        this.a = bmlVar;
        this.b = bmoVar;
    }

    @Override // defpackage.wq
    public final Object a() {
        Object a = this.c.a();
        if (a == null) {
            a = this.a.a();
        }
        if (a instanceof bmn) {
            ((bmn) a).bp().a = false;
        }
        return a;
    }

    @Override // defpackage.wq
    public final boolean b(Object obj) {
        if (obj instanceof bmn) {
            ((bmn) obj).bp().a = true;
        }
        this.b.a(obj);
        return this.c.b(obj);
    }
}
