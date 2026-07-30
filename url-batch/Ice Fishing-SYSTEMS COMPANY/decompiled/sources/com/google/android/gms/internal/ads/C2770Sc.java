package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Sc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2770Sc extends D2.a {

    /* renamed from: w, reason: collision with root package name */
    public final Object f27574w = new Object();

    /* renamed from: x, reason: collision with root package name */
    public boolean f27575x = false;

    /* renamed from: y, reason: collision with root package name */
    public int f27576y = 0;

    public final C2753Rc s() {
        C2753Rc c2753Rc = new C2753Rc(this);
        t2.C.k("createNewReference: Trying to acquire lock");
        synchronized (this.f27574w) {
            t2.C.k("createNewReference: Lock acquired");
            p(new Rx(this, c2753Rc), new Vx(this, c2753Rc));
            O2.w.k(this.f27576y >= 0);
            this.f27576y++;
        }
        t2.C.k("createNewReference: Lock released");
        return c2753Rc;
    }

    public final void t() {
        t2.C.k("releaseOneReference: Trying to acquire lock");
        synchronized (this.f27574w) {
            t2.C.k("releaseOneReference: Lock acquired");
            O2.w.k(this.f27576y > 0);
            t2.C.k("Releasing 1 reference for JS Engine");
            this.f27576y--;
            v();
        }
        t2.C.k("releaseOneReference: Lock released");
    }

    public final void u() {
        t2.C.k("markAsDestroyable: Trying to acquire lock");
        synchronized (this.f27574w) {
            t2.C.k("markAsDestroyable: Lock acquired");
            O2.w.k(this.f27576y >= 0);
            t2.C.k("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f27575x = true;
            v();
        }
        t2.C.k("markAsDestroyable: Lock released");
    }

    public final void v() {
        t2.C.k("maybeDestroy: Trying to acquire lock");
        synchronized (this.f27574w) {
            try {
                t2.C.k("maybeDestroy: Lock acquired");
                O2.w.k(this.f27576y >= 0);
                if (this.f27575x && this.f27576y == 0) {
                    t2.C.k("No reference is left (including root). Cleaning up engine.");
                    p(new C2837Wb(5), new C2837Wb(20));
                } else {
                    t2.C.k("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        t2.C.k("maybeDestroy: Lock released");
    }
}
