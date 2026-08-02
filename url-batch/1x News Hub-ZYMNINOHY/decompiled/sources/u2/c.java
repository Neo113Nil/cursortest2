package u2;

import A2.e;
import E1.AbstractC0033i;
import android.os.Handler;
import android.os.Looper;
import d2.h;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.j;
import t2.A;
import t2.AbstractC1208s;
import t2.C1209t;
import t2.D;
import t2.U;
import y2.o;

/* loaded from: classes.dex */
public final class c extends AbstractC1208s implements A {

    /* renamed from: c, reason: collision with root package name */
    public final Handler f10526c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10527d;

    /* renamed from: e, reason: collision with root package name */
    public final c f10528e;

    public c(Handler handler, boolean z) {
        this.f10526c = handler;
        this.f10527d = z;
        this.f10528e = z ? this : new c(handler, true);
    }

    @Override // t2.AbstractC1208s
    public final void c(h hVar, Runnable runnable) {
        if (this.f10526c.post(runnable)) {
            return;
        }
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        U u3 = (U) hVar.h(C1209t.f10441b);
        if (u3 != null) {
            u3.b(cancellationException);
        }
        D.f10378b.c(hVar, runnable);
    }

    @Override // t2.AbstractC1208s
    public final boolean d() {
        return (this.f10527d && j.a(Looper.myLooper(), this.f10526c.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return cVar.f10526c == this.f10526c && cVar.f10527d == this.f10527d;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f10526c) ^ (this.f10527d ? 1231 : 1237);
    }

    @Override // t2.AbstractC1208s
    public final String toString() {
        c cVar;
        String str;
        e eVar = D.f10377a;
        c cVar2 = o.f10862a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f10528e;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String handler = this.f10526c.toString();
        return this.f10527d ? AbstractC0033i.s(handler, ".immediate") : handler;
    }
}
