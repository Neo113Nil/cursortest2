package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eua implements far {
    private final boolean a;

    public eua(boolean z) {
        this.a = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.far
    public final /* bridge */ /* synthetic */ Object a(fym fymVar) {
        InputStream b = fbq.b(fymVar);
        try {
            if (this.a && (b instanceof fay) && ((fay) b).c().length() > 12288) {
                eub c = eub.c(jju.L(b, 4096), true);
                ixf.j(b, null);
                return c;
            }
            eub c2 = eub.c(jju.L(b, 4096), false);
            ixf.j(b, null);
            return c2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ixf.j(b, th);
                throw th2;
            }
        }
    }
}
