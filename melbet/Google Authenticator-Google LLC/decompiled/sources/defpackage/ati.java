package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ati implements ro {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ati(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kqn] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, krx] */
    @Override // defpackage.ro
    public final Object a(rm rmVar) {
        if (this.c != 0) {
            ?? r0 = this.a;
            rmVar.a(new ath((kwu) r0.get(kwu.d), 1), asf.a);
            return ixg.i(kvp.g(r0), null, 1, new asl(this.b, rmVar, null), 1);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        rmVar.a(new ath(atomicBoolean, 0), asf.a);
        this.a.execute(new ajx((Object) atomicBoolean, (Object) rmVar, this.b, 3, (byte[]) null));
        return kow.a;
    }
}
