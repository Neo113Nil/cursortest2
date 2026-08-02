package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kir extends kaq {
    final /* synthetic */ kis b;

    public kir(kis kisVar) {
        this.b = kisVar;
    }

    @Override // defpackage.kaq
    public final String a() {
        return this.b.b;
    }

    @Override // defpackage.kaq
    public final void d(ixd ixdVar) {
        List list = Collections.EMPTY_LIST;
        jwt jwtVar = jwt.a;
        ixdVar.a(new kao(new kbs(null, Collections.singletonList(new jxx(this.b.a))), jwt.a, null));
    }

    @Override // defpackage.kaq
    public final void c() {
    }
}
