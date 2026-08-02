package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fcx extends fby {
    private final jll a;

    public fcx(jll jllVar) {
        this.a = jllVar;
    }

    @Override // defpackage.fby
    public final hvi a(IOException iOException, fbz fbzVar) {
        return !(iOException.getCause() instanceof jld) ? hnu.aI(iOException) : hso.g(fbzVar.a(hnu.aJ(this.a)), IOException.class, new doj(iOException, 17), huf.a);
    }
}
