package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kzc implements krt {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public kzc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kqj] */
    /* JADX WARN: Type inference failed for: r3v2, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [hvi, java.lang.Object] */
    @Override // defpackage.krt
    public final /* synthetic */ Object a(Object obj) {
        int i = this.b;
        if (i == 0) {
            ?? r3 = this.a;
            kow kowVar = kow.a;
            r3.ca(kowVar);
            return kowVar;
        }
        if (i != 1) {
            this.a.cancel(false);
            return kow.a;
        }
        this.a.cancel(false);
        return kow.a;
    }
}
