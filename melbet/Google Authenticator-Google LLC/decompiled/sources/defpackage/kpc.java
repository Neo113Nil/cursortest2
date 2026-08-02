package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kpc extends kpd implements RandomAccess {
    private final kpd a;
    private final int b;
    private final int c;

    public kpc(kpd kpdVar, int i, int i2) {
        this.a = kpdVar;
        this.b = i;
        ixc.V(i, i2, kpdVar.a());
        this.c = i2 - i;
    }

    @Override // defpackage.koz
    public final int a() {
        return this.c;
    }

    @Override // defpackage.kpd, java.util.List
    public final Object get(int i) {
        ixc.T(i, this.c);
        return this.a.get(this.b + i);
    }

    @Override // defpackage.kpd, java.util.List
    public final List subList(int i, int i2) {
        ixc.V(i, i2, this.c);
        int i3 = this.b;
        return new kpc(this.a, i + i3, i3 + i2);
    }
}
