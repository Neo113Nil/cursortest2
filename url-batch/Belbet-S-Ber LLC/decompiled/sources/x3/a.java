package x3;

import java.io.IOException;
import t3.o;
import t3.s;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a implements t3.l {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3890a = new a();

    @Override // t3.l
    public final s a(y3.f fVar) {
        i iVar = fVar.f4114a;
        synchronized (iVar) {
            try {
                if (!iVar.f3922q) {
                    throw new IllegalStateException("released");
                }
                if (iVar.f3921p) {
                    throw new IllegalStateException("Check failed.");
                }
                if (iVar.f3920o) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        e eVar = iVar.f3917l;
        i3.d.b(eVar);
        o oVar = iVar.f3913f;
        try {
            d dVar = new d(iVar, eVar, eVar.a(fVar.f4118f, fVar.f4119g, fVar.h, oVar.f3484k, !i3.d.a(fVar.f4117e.f3507b, "GET")).j(oVar, fVar));
            iVar.f3919n = dVar;
            iVar.f3924s = dVar;
            synchronized (iVar) {
                iVar.f3920o = true;
                iVar.f3921p = true;
            }
            if (iVar.f3923r) {
                throw new IOException("Canceled");
            }
            return y3.f.a(fVar, 0, dVar, null, 61).b(fVar.f4117e);
        } catch (IOException e4) {
            eVar.c(e4);
            throw new n(e4);
        } catch (n e5) {
            eVar.c(e5.f3946g);
            throw e5;
        }
    }
}
