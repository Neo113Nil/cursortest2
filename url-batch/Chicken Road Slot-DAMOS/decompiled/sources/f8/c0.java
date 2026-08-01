package f8;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c0 extends x {
    public static final Logger C = Logger.getLogger(c0.class.getName());
    public final boolean A;
    public b0 B;

    /* renamed from: z, reason: collision with root package name */
    public b8.b f4123z;

    public c0(b8.b bVar, boolean z10) {
        int size = bVar.size();
        this.f4199v = null;
        this.f4200w = size;
        this.f4123z = bVar;
        this.A = z10;
    }

    @Override // f8.r
    public final void c() {
        b8.b bVar = this.f4123z;
        this.f4123z = null;
        this.B = null;
        if ((this.f4174d instanceof d) && (bVar != null)) {
            boolean p4 = p();
            b8.b0 it = bVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(p4);
            }
        }
    }

    @Override // f8.r
    public final void i() {
        b0 b0Var = this.B;
        if (b0Var != null) {
            b0Var.c();
        }
    }

    @Override // f8.r
    public final String j() {
        b8.b bVar = this.f4123z;
        if (bVar == null) {
            return super.j();
        }
        String valueOf = String.valueOf(bVar);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
        sb2.append("futures=");
        sb2.append(valueOf);
        return sb2.toString();
    }

    public final void q(b8.b bVar) {
        int m10 = x.f4197x.m(this);
        i7.a.F("Less than 0 remaining futures", m10 >= 0);
        if (m10 == 0) {
            if (bVar != null) {
                b8.b0 it = bVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        try {
                            l0.b(future);
                        } catch (ExecutionException e2) {
                            r(e2.getCause());
                        } catch (Throwable th) {
                            r(th);
                        }
                    }
                }
            }
            this.f4199v = null;
            b0 b0Var = this.B;
            if (b0Var != null) {
                try {
                    b0Var.f4114i.execute(b0Var);
                } catch (RejectedExecutionException e9) {
                    b0Var.f4115r.m(e9);
                }
            }
            this.f4123z = null;
        }
    }

    public final void r(Throwable th) {
        th.getClass();
        if (this.A && !m(th)) {
            Set set = this.f4199v;
            if (set == null) {
                Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                newSetFromMap.getClass();
                if (!(this.f4174d instanceof d)) {
                    Throwable o6 = o();
                    Objects.requireNonNull(o6);
                    while (o6 != null && newSetFromMap.add(o6)) {
                        o6 = o6.getCause();
                    }
                }
                x.f4197x.k(this, newSetFromMap);
                Set set2 = this.f4199v;
                Objects.requireNonNull(set2);
                set = set2;
            }
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                if (set.add(th2)) {
                }
            }
            C.log(Level.SEVERE, th instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
            return;
        }
        boolean z10 = th instanceof Error;
        if (z10) {
            C.log(Level.SEVERE, z10 ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
        }
    }

    public final void s() {
        Objects.requireNonNull(this.f4123z);
        if (this.f4123z.isEmpty()) {
            b0 b0Var = this.B;
            if (b0Var != null) {
                try {
                    b0Var.f4114i.execute(b0Var);
                    return;
                } catch (RejectedExecutionException e2) {
                    b0Var.f4115r.m(e2);
                    return;
                }
            }
            return;
        }
        boolean z10 = this.A;
        d0 d0Var = d0.f4128d;
        if (!z10) {
            a6.f fVar = new a6.f(9, this, (Object) null);
            b8.b0 it = this.f4123z.iterator();
            while (it.hasNext()) {
                ((ListenableFuture) it.next()).a(fVar, d0Var);
            }
            return;
        }
        b8.b0 it2 = this.f4123z.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            ListenableFuture listenableFuture = (ListenableFuture) it2.next();
            listenableFuture.a(new a6.f(this, listenableFuture, i3), d0Var);
            i3++;
        }
    }
}
