package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class huw extends hsw {
    private hux a;

    public huw(hux huxVar) {
        this.a = huxVar;
    }

    @Override // defpackage.hsw
    protected final String a() {
        hux huxVar = this.a;
        if (huxVar == null) {
            return null;
        }
        hvi[] hviVarArr = huxVar.d;
        AtomicInteger atomicInteger = huxVar.c;
        return "inputCount=[" + hviVarArr.length + "], remaining=[" + atomicInteger.get() + "]";
    }

    @Override // defpackage.hsw
    protected final void b() {
        this.a = null;
    }

    @Override // defpackage.hsw, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        hux huxVar = this.a;
        if (!super.cancel(z)) {
            return false;
        }
        huxVar.getClass();
        huxVar.a = true;
        if (!z) {
            huxVar.b = false;
        }
        huxVar.a();
        return true;
    }
}
