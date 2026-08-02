package y3;

import C3.o;
import E.AbstractC0005f;
import E3.e;
import android.os.Handler;
import android.os.Looper;
import f3.InterfaceC0430h;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.i;
import x3.AbstractC1528C;
import x3.AbstractC1558s;
import x3.C1559t;
import x3.InterfaceC1565z;
import x3.T;

/* renamed from: y3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1578c extends AbstractC1558s implements InterfaceC1565z {

    /* renamed from: c, reason: collision with root package name */
    public final Handler f16267c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f16268d;

    /* renamed from: e, reason: collision with root package name */
    public final C1578c f16269e;

    public C1578c(Handler handler, boolean z) {
        this.f16267c = handler;
        this.f16268d = z;
        this.f16269e = z ? this : new C1578c(handler, true);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1578c)) {
            return false;
        }
        C1578c c1578c = (C1578c) obj;
        return c1578c.f16267c == this.f16267c && c1578c.f16268d == this.f16268d;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f16267c) ^ (this.f16268d ? 1231 : 1237);
    }

    @Override // x3.AbstractC1558s
    public final void s(InterfaceC0430h interfaceC0430h, Runnable runnable) {
        if (this.f16267c.post(runnable)) {
            return;
        }
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        T t4 = (T) interfaceC0430h.n(C1559t.f16059b);
        if (t4 != null) {
            t4.b(cancellationException);
        }
        AbstractC1528C.f15990b.s(interfaceC0430h, runnable);
    }

    @Override // x3.AbstractC1558s
    public final boolean t() {
        return (this.f16268d && i.a(Looper.myLooper(), this.f16267c.getLooper())) ? false : true;
    }

    @Override // x3.AbstractC1558s
    public final String toString() {
        C1578c c1578c;
        String str;
        e eVar = AbstractC1528C.f15989a;
        C1578c c1578c2 = o.f314a;
        if (this == c1578c2) {
            str = "Dispatchers.Main";
        } else {
            try {
                c1578c = c1578c2.f16269e;
            } catch (UnsupportedOperationException unused) {
                c1578c = null;
            }
            str = this == c1578c ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String handler = this.f16267c.toString();
        return this.f16268d ? AbstractC0005f.z(handler, ".immediate") : handler;
    }
}
