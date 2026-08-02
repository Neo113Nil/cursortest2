package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kra extends kqw implements ksn {
    private final int a;

    public kra(int i, kqj kqjVar) {
        super(kqjVar);
        this.a = i;
    }

    @Override // defpackage.ksn
    public final int i() {
        return this.a;
    }

    @Override // defpackage.kqu
    public final String toString() {
        if (this.k != null) {
            return super.toString();
        }
        String a = ksx.a(this);
        a.getClass();
        return a;
    }
}
