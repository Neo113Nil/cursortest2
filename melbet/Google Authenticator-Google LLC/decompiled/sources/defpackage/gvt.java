package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gvt implements htq {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public gvt(hul hulVar, htq htqVar, int i) {
        this.c = i;
        this.b = hulVar;
        this.a = htqVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [guq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [htq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [htq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [htq, java.lang.Object] */
    @Override // defpackage.htq
    public final hvi a() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                return !((hul) this.b).compareAndSet(huk.a, huk.c) ? hnu.aH() : this.a.a();
            }
            return this.a.a();
        }
        ?? r0 = this.a;
        gun a = gta.a();
        guq g = gta.g(a, r0);
        try {
            hvi a2 = this.b.a();
            gta.g(a, g);
            a2.getClass();
            return a2;
        } finally {
        }
    }

    public final String toString() {
        int i = this.c;
        if (i == 0) {
            return "propagating=[" + this.b + "]";
        }
        Object obj = this.a;
        if (i != 1) {
            return obj.toString();
        }
        Object obj2 = this.b;
        return obj.toString() + ", input=[" + String.valueOf(obj2) + "]";
    }

    public gvt(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
