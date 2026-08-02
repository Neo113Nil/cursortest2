package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gjk implements grn {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public gjk(gka gkaVar, String str, int i) {
        this.c = i;
        this.b = gkaVar;
        this.a = str;
    }

    @Override // defpackage.grn
    public final hvi a(hvi hviVar, Duration duration) {
        int i = this.c;
        if (i == 0) {
            duration.getClass();
            return ((gka) this.b).b(hviVar, (String) this.a, 1, duration);
        }
        if (i == 1) {
            return hve.a;
        }
        if (i != 2) {
            return i != 3 ? hve.a : hve.a;
        }
        duration.getClass();
        return ((gka) this.b).b(hviVar, (String) this.a, 2, duration);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [htr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [htr, java.lang.Object] */
    @Override // defpackage.grn
    public final hvi b() {
        int i = this.c;
        if (i == 0) {
            return ((gka) this.b).c((String) this.a, 1);
        }
        if (i == 1) {
            return this.a.a(this.b);
        }
        if (i == 2) {
            return ((gka) this.b).c((String) this.a, 2);
        }
        ?? r1 = this.a;
        Object obj = this.b;
        return i != 3 ? r1.a(obj) : r1.a(obj);
    }

    public gjk(htr htrVar, Object obj, int i) {
        this.c = i;
        this.a = htrVar;
        this.b = obj;
    }
}
