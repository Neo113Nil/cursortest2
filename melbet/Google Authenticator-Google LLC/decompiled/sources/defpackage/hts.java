package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hts implements htr {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public hts(guq guqVar, htr htrVar, int i) {
        this.c = i;
        this.a = guqVar;
        this.b = htrVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [guq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [htv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [htt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [htr, java.lang.Object] */
    @Override // defpackage.htr
    public final hvi a(Object obj) {
        htu htuVar;
        htu htuVar2;
        int i = this.c;
        if (i == 0) {
            htuVar = new htu();
            ?? r1 = this.a;
            htuVar2 = ((htz) this.b).c.b;
            try {
                return hnu.aJ(r1.a(htuVar.a, obj));
            } finally {
            }
        }
        if (i != 1) {
            htuVar = new htu();
            ?? r12 = this.a;
            htuVar2 = ((htz) this.b).c.b;
            try {
                htx htxVar = r12.a(htuVar.a, obj).c;
                htxVar.a(htuVar);
                return htxVar.c;
            } finally {
            }
        }
        guq g = gta.g(gta.a(), this.a);
        try {
            hvi a = this.b.a(obj);
            if (a != null) {
                return a;
            }
            throw new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
        } finally {
        }
    }

    public final String toString() {
        int i = this.c;
        if (i == 0) {
            return this.a.toString();
        }
        if (i != 1) {
            return this.a.toString();
        }
        return "propagating=[" + this.b + "]";
    }

    public hts(htz htzVar, Object obj, int i) {
        this.c = i;
        this.a = obj;
        this.b = htzVar;
    }
}
