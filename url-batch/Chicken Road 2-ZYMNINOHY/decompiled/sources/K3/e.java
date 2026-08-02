package K3;

import G3.x;
import N3.C0077a;
import N3.E;
import N3.EnumC0078b;
import java.io.IOException;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final i f1545a;

    /* renamed from: b, reason: collision with root package name */
    public final f f1546b;

    /* renamed from: c, reason: collision with root package name */
    public final L3.e f1547c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1548d;

    /* renamed from: e, reason: collision with root package name */
    public final k f1549e;

    public e(i iVar, f finder, L3.e eVar) {
        kotlin.jvm.internal.i.e(finder, "finder");
        this.f1545a = iVar;
        this.f1546b = finder;
        this.f1547c = eVar;
        this.f1549e = eVar.c();
    }

    public final IOException a(boolean z, boolean z4, IOException iOException) {
        if (iOException != null) {
            c(iOException);
        }
        return this.f1545a.f(this, z4, z, iOException);
    }

    public final x b(boolean z) {
        try {
            x b4 = this.f1547c.b(z);
            if (b4 == null) {
                return b4;
            }
            b4.f1032m = this;
            return b4;
        } catch (IOException e4) {
            c(e4);
            throw e4;
        }
    }

    public final void c(IOException iOException) {
        this.f1548d = true;
        this.f1546b.e(iOException);
        k c4 = this.f1547c.c();
        i iVar = this.f1545a;
        synchronized (c4) {
            try {
                if (!(iOException instanceof E)) {
                    if (!(c4.f1580g != null) || (iOException instanceof C0077a)) {
                        c4.f1583j = true;
                        if (c4.f1586m == 0) {
                            k.d(iVar.f1561a, c4.f1575b, iOException);
                            c4.f1585l++;
                        }
                    }
                } else if (((E) iOException).f1819a == EnumC0078b.REFUSED_STREAM) {
                    int i4 = c4.n + 1;
                    c4.n = i4;
                    if (i4 > 1) {
                        c4.f1583j = true;
                        c4.f1585l++;
                    }
                } else if (((E) iOException).f1819a != EnumC0078b.CANCEL || !iVar.f1573m) {
                    c4.f1583j = true;
                    c4.f1585l++;
                }
            } finally {
            }
        }
    }
}
