package n2;

import java.io.FileNotFoundException;
import java.io.IOException;
import n2.g0;
import n2.h0;
import r0.n2;

/* loaded from: classes.dex */
public class x implements g0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f19601a;

    public x() {
        this(-1);
    }

    public x(int i7) {
        this.f19601a = i7;
    }

    @Override // n2.g0
    public /* synthetic */ void a(long j7) {
        f0.a(this, j7);
    }

    @Override // n2.g0
    public g0.b b(g0.a aVar, g0.c cVar) {
        if (!e(cVar.f19426c)) {
            return null;
        }
        if (aVar.a(1)) {
            return new g0.b(1, 300000L);
        }
        if (aVar.a(2)) {
            return new g0.b(2, 60000L);
        }
        return null;
    }

    @Override // n2.g0
    public long c(g0.c cVar) {
        IOException iOException = cVar.f19426c;
        if ((iOException instanceof n2) || (iOException instanceof FileNotFoundException) || (iOException instanceof z) || (iOException instanceof h0.h) || m.a(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((cVar.f19427d - 1) * 1000, 5000);
    }

    @Override // n2.g0
    public int d(int i7) {
        int i8 = this.f19601a;
        return i8 == -1 ? i7 == 7 ? 6 : 3 : i8;
    }

    protected boolean e(IOException iOException) {
        if (!(iOException instanceof c0)) {
            return false;
        }
        int i7 = ((c0) iOException).f19398i;
        return i7 == 403 || i7 == 404 || i7 == 410 || i7 == 416 || i7 == 500 || i7 == 503;
    }
}
