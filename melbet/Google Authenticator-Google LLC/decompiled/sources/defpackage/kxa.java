package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kxa implements kwq {
    public final kxg a;
    public final kuh b;
    private final kuk c;
    private final kuk d;

    public kxa(kxg kxgVar, Throwable th) {
        this.a = kxgVar;
        kul kulVar = kul.a;
        this.b = new kuh(false, kulVar);
        this.c = new kuk(th, kulVar);
        this.d = new kuk(null, kulVar);
    }

    @Override // defpackage.kwq
    public final kxg bP() {
        return this.a;
    }

    @Override // defpackage.kwq
    public final boolean bR() {
        return d() == null;
    }

    public final Object c() {
        return this.d.a;
    }

    public final Throwable d() {
        return (Throwable) this.c.a;
    }

    public final void e(Throwable th) {
        Throwable d = d();
        if (d == null) {
            this.c.c(th);
            return;
        }
        if (th == d) {
            return;
        }
        Object c = c();
        if (c == null) {
            f(th);
            return;
        }
        if (!(c instanceof Throwable)) {
            if (c instanceof ArrayList) {
                ((ArrayList) c).add(th);
                return;
            } else {
                Objects.toString(c);
                throw new IllegalStateException("State is ".concat(c.toString()));
            }
        }
        if (th != c) {
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(c);
            arrayList.add(th);
            f(arrayList);
        }
    }

    public final void f(Object obj) {
        this.d.c(obj);
    }

    public final boolean g() {
        return d() != null;
    }

    public final boolean h() {
        return this.b.a();
    }

    public final String toString() {
        return "Finishing[cancelling=" + g() + ", completing=" + h() + ", rootCause=" + d() + ", exceptions=" + c() + ", list=" + this.a + "]";
    }
}
