package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hnh extends hnu {
    public static final hnh a = new hnh(hnw.a);
    public final AtomicReference b;

    public hnh(hnu hnuVar) {
        this.b = new AtomicReference(hnuVar);
    }

    @Override // defpackage.hnu
    public final hob b() {
        return ((hnu) this.b.get()).b();
    }

    @Override // defpackage.hnu
    public final hma bR() {
        return ((hnu) this.b.get()).bR();
    }

    @Override // defpackage.hnu
    public final void c(String str, Level level, boolean z) {
        ((hnu) this.b.get()).c(str, level, z);
    }
}
