package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kqf implements kqm {
    private final krt a;
    private final kqm b;

    public kqf(kqm kqmVar, krt krtVar) {
        this.a = krtVar;
        this.b = kqmVar instanceof kqf ? ((kqf) kqmVar).b : kqmVar;
    }

    public final kql a(kql kqlVar) {
        return (kql) this.a.a(kqlVar);
    }

    public final boolean b(kqm kqmVar) {
        kqmVar.getClass();
        return kqmVar == this || this.b == kqmVar;
    }

    public kqf() {
        this(kqk.b, new ghz(13));
    }
}
