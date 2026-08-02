package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kqw extends kqu {
    private final kqn a;
    public transient kqj l;

    public kqw(kqj kqjVar) {
        this(kqjVar, kqjVar != null ? kqjVar.bU() : null);
    }

    @Override // defpackage.kqj
    public kqn bU() {
        kqn kqnVar = this.a;
        kqnVar.getClass();
        return kqnVar;
    }

    @Override // defpackage.kqu
    protected void h() {
        kqj kqjVar = this.l;
        if (kqjVar != null && kqjVar != this) {
            kql kqlVar = bU().get(kqk.b);
            kqlVar.getClass();
            ((kqk) kqlVar).d(kqjVar);
        }
        this.l = kqv.a;
    }

    public kqw(kqj kqjVar, kqn kqnVar) {
        super(kqjVar);
        this.a = kqnVar;
    }
}
