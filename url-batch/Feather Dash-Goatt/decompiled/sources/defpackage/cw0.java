package defpackage;

import android.os.Trace;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class cw0 {
    public final tl a;
    public final ml b;
    public final hl c;
    public final Function2 d;
    public final boolean e;
    public final mk1 f;
    public final Object g;
    public final AtomicReference h = new AtomicReference(ew0.g);
    public long i = t90.l();
    public wn0 j;
    public final i21 k;
    public final p11 l;

    public cw0(tl tlVar, ml mlVar, hl hlVar, yn0 yn0Var, Function2 function2, boolean z, mk1 mk1Var, Object obj) {
        this.a = tlVar;
        this.b = mlVar;
        this.c = hlVar;
        this.d = function2;
        this.e = z;
        this.f = mk1Var;
        this.g = obj;
        wn0 wn0Var = r61.a;
        wn0Var.getClass();
        this.j = wn0Var;
        i21 i21Var = new i21();
        i21Var.g(yn0Var, hlVar.z());
        this.k = i21Var;
        this.l = new p11(mk1Var.c);
    }

    public final void a() {
        AtomicReference atomicReference = this.h;
        try {
            switch (((ew0) atomicReference.get()).ordinal()) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case ry0.STRING_FIELD_NUMBER /* 5 */:
                    b();
                    ew0 ew0Var = ew0.j;
                    ew0 ew0Var2 = ew0.k;
                    while (!atomicReference.compareAndSet(ew0Var, ew0Var2)) {
                        if (atomicReference.get() != ew0Var) {
                            cy0.b("Unexpected state change from: " + ew0Var + " to: " + ew0Var2 + '.');
                            return;
                        }
                    }
                    return;
                case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new ip0();
            }
        } catch (Exception e) {
            atomicReference.set(ew0.d);
            throw e;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.g) {
                try {
                    this.l.k(this.f, this.k);
                    this.k.c();
                    this.k.d();
                } finally {
                    this.k.b();
                    this.a.u = null;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final boolean c() {
        return ((ew0) this.h.get()).compareTo(ew0.j) >= 0;
    }

    public final void d() {
        boolean z;
        ew0 ew0Var = ew0.h;
        ew0 ew0Var2 = ew0.j;
        while (true) {
            AtomicReference atomicReference = this.h;
            if (atomicReference.compareAndSet(ew0Var, ew0Var2)) {
                z = true;
                break;
            } else if (atomicReference.get() != ew0Var) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        cy0.b("Unexpected state change from: " + ew0Var + " to: " + ew0Var2 + '.');
    }

    public final boolean e(na1 na1Var) {
        AtomicReference atomicReference = this.h;
        try {
            int ordinal = ((ew0) atomicReference.get()).ordinal();
            tl tlVar = this.a;
            ml mlVar = this.b;
            switch (ordinal) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    hl hlVar = this.c;
                    boolean z = this.e;
                    if (z) {
                        hlVar.z = 100;
                        hlVar.y = true;
                    }
                    try {
                        this.j = mlVar.b(tlVar, na1Var, this.d);
                        ew0 ew0Var = ew0.g;
                        ew0 ew0Var2 = ew0.h;
                        while (true) {
                            if (!atomicReference.compareAndSet(ew0Var, ew0Var2)) {
                                if (atomicReference.get() != ew0Var) {
                                    cy0.b("Unexpected state change from: " + ew0Var + " to: " + ew0Var2 + '.');
                                }
                            }
                        }
                        if (this.j.g()) {
                            d();
                        }
                        return c();
                    } finally {
                        if (z) {
                            hlVar.s();
                        }
                    }
                case 3:
                    ew0 ew0Var3 = ew0.h;
                    ew0 ew0Var4 = ew0.i;
                    while (true) {
                        if (!atomicReference.compareAndSet(ew0Var3, ew0Var4)) {
                            if (atomicReference.get() != ew0Var3) {
                                cy0.b("Unexpected state change from: " + ew0Var3 + " to: " + ew0Var4 + '.');
                            }
                        }
                    }
                    long j = this.i;
                    try {
                        this.i = t90.l();
                        this.j = mlVar.n(tlVar, na1Var, this.j);
                        this.i = j;
                        ew0 ew0Var5 = ew0.i;
                        ew0 ew0Var6 = ew0.h;
                        while (true) {
                            if (!atomicReference.compareAndSet(ew0Var5, ew0Var6)) {
                                if (atomicReference.get() != ew0Var5) {
                                    cy0.b("Unexpected state change from: " + ew0Var5 + " to: " + ew0Var6 + '.');
                                }
                            }
                        }
                        if (this.j.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th) {
                        this.i = j;
                        ew0 ew0Var7 = ew0.i;
                        ew0 ew0Var8 = ew0.h;
                        while (true) {
                            if (!atomicReference.compareAndSet(ew0Var7, ew0Var8)) {
                                if (atomicReference.get() != ew0Var7) {
                                    cy0.b("Unexpected state change from: " + ew0Var7 + " to: " + ew0Var8 + '.');
                                }
                            }
                        }
                        throw th;
                    }
                case 4:
                    kl.b("Recursive call to resume()");
                    throw new kc0();
                case ry0.STRING_FIELD_NUMBER /* 5 */:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new ip0();
            }
        } catch (Exception e) {
            atomicReference.set(ew0.d);
            throw e;
        }
    }
}
