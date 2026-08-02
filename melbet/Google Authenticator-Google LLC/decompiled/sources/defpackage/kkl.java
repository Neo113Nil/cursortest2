package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kkl implements kkq {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public kkl(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, jxe] */
    @Override // defpackage.kkq
    public final void a(kkw kkwVar) {
        int i = this.b;
        if (i == 0) {
            kkwVar.a.p((jxs) this.a);
        } else if (i != 1) {
            kkwVar.a.q((jxv) this.a);
        } else {
            kkwVar.a.h(this.a);
        }
    }
}
