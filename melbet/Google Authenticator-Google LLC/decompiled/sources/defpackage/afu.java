package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afu implements AutoCloseable {
    public boolean a;
    public final afr b;
    private final String c;

    public afu(String str, boe boeVar, ael aelVar, Bundle bundle) {
        aelVar.getClass();
        this.c = str;
        this.b = yk.e(boeVar.a(str), bundle);
        a(boeVar, aelVar);
    }

    public final void a(boe boeVar, ael aelVar) {
        if (this.a || aelVar == null) {
            return;
        }
        this.a = true;
        aelVar.a(new nv(this, aelVar, 2, null));
        boeVar.b(this.c, this.b.a());
        aek aekVar = aelVar.c;
        if (aekVar == aek.b || aekVar.a(aek.d)) {
            boeVar.c(aft.class);
        } else {
            aelVar.a(new nv(aelVar, boeVar, 3));
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
