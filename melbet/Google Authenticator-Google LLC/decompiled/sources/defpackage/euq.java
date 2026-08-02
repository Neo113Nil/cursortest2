package defpackage;

import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes2.dex */
class euq extends euv {
    private final eum d;
    private volatile Object e;

    public euq(String str, String str2, evj evjVar, eum eumVar) {
        super(str, str2, evjVar);
        this.d = eumVar;
    }

    @Override // defpackage.eui
    protected final Object b(Object obj) {
        return this.d.a((byte[]) obj);
    }

    @Override // defpackage.eui
    protected final Object c(String str) {
        return this.d.a(Base64.decode(str, 3));
    }

    @Override // defpackage.eul
    public final Object d() {
        return this.e;
    }

    @Override // defpackage.eul
    public final void g(Object obj) {
        this.e = obj;
    }
}
