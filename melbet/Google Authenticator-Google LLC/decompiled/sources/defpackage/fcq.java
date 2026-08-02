package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fcq implements fbz {
    private final /* synthetic */ int a;
    private final Object b;

    public fcq(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.fbz
    public final hvi a(hvi hviVar) {
        if (this.a != 0) {
            return ((fcn) this.b).f(hviVar);
        }
        Object obj = this.b;
        return hti.g(hviVar, gvx.c(new doj(obj, 10)), ((fcr) obj).b);
    }
}
