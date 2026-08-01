package androidx.datastore.preferences.protobuf;

import com.appsflyer.attribution.RequestError;
import com.google.android.gms.internal.measurement.b2;
import com.google.android.gms.internal.measurement.c3;
import com.google.android.gms.internal.measurement.l2;
import com.google.android.gms.internal.measurement.o2;
import com.google.android.gms.internal.measurement.t1;
import com.google.android.gms.internal.measurement.u1;
import com.google.android.gms.internal.measurement.v1;
import com.google.android.gms.internal.measurement.z1;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public int f564a;

    /* renamed from: b, reason: collision with root package name */
    public int f565b;

    /* renamed from: c, reason: collision with root package name */
    public int f566c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f567d;

    public j(i iVar) {
        this.f566c = 0;
        Charset charset = x.f647a;
        this.f567d = iVar;
        iVar.f560e = this;
    }

    public static final void V(int i3) {
        if ((i3 & 3) == 0) {
            return;
        }
        a2.r.o("Failed to parse the message.");
    }

    public static final void W(int i3) {
        if ((i3 & 7) == 0) {
            return;
        }
        a2.r.o("Failed to parse the message.");
    }

    public void A(t1 t1Var) {
        int l10;
        int i3;
        com.google.android.gms.internal.measurement.y0 y0Var = (com.google.android.gms.internal.measurement.y0) this.f567d;
        boolean z10 = t1Var instanceof z1;
        int i10 = this.f564a;
        if (z10) {
            z1 z1Var = (z1) t1Var;
            int i11 = i10 & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    a2.r.m();
                    return;
                }
                int e2 = y0Var.e() + y0Var.A();
                do {
                    z1Var.f(y0Var.r());
                } while (y0Var.e() < e2);
                U(e2);
                return;
            }
            do {
                z1Var.f(y0Var.r());
                if (y0Var.d()) {
                    return;
                } else {
                    i3 = y0Var.l();
                }
            } while (i3 == this.f564a);
        } else {
            int i12 = i10 & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    a2.r.m();
                    return;
                }
                int e9 = y0Var.e() + y0Var.A();
                do {
                    t1Var.add(Long.valueOf(y0Var.r()));
                } while (y0Var.e() < e9);
                U(e9);
                return;
            }
            do {
                t1Var.add(Long.valueOf(y0Var.r()));
                if (y0Var.d()) {
                    return;
                } else {
                    l10 = y0Var.l();
                }
            } while (l10 == this.f564a);
            i3 = l10;
        }
        this.f566c = i3;
    }

    public void B(t1 t1Var) {
        int l10;
        int i3;
        com.google.android.gms.internal.measurement.y0 y0Var = (com.google.android.gms.internal.measurement.y0) this.f567d;
        boolean z10 = t1Var instanceof com.google.android.gms.internal.measurement.l1;
        int i10 = this.f564a;
        if (z10) {
            com.google.android.gms.internal.measurement.l1 l1Var = (com.google.android.gms.internal.measurement.l1) t1Var;
            int i11 = i10 & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    a2.r.m();
                    return;
                }
                int e2 = y0Var.e() + y0Var.A();
                do {
                    l1Var.f(y0Var.s());
                } while (y0Var.e() < e2);
                U(e2);
                return;
            }
            do {
                l1Var.f(y0Var.s());
                if (y0Var.d()) {
                    return;
                } else {
                    i3 = y0Var.l();
                }
            } while (i3 == this.f564a);
        } else {
            int i12 = i10 & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    a2.r.m();
                    return;
                }
                int e9 = y0Var.e() + y0Var.A();
                do {
                    t1Var.add(Integer.valueOf(y0Var.s()));
                } while (y0Var.e() < e9);
                U(e9);
                return;
            }
            do {
                t1Var.add(Integer.valueOf(y0Var.s()));
                if (y0Var.d()) {
                    return;
                } else {
                    l10 = y0Var.l();
                }
            } while (l10 == this.f564a);
            i3 = l10;
        }
        this.f566c = i3;
    }

    public void C(t1 t1Var) {
        int l10;
        int i3;
        com.google.android.gms.internal.measurement.y0 y0Var = (com.google.android.gms.internal.measurement.y0) this.f567d;
        boolean z10 = t1Var instanceof z1;
        int i10 = this.f564a;
        if (z10) {
            z1 z1Var = (z1) t1Var;
            int i11 = i10 & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    a2.r.m();
                    return;
                }
                int A = y0Var.A();
                W(A);
                int e2 = y0Var.e() + A;
                do {
                    z1Var.f(y0Var.t());
                } while (y0Var.e() < e2);
                return;
            }
            do {
                z1Var.f(y0Var.t());
                if (y0Var.d()) {
                    return;
                } else {
                    i3 = y0Var.l();
                }
            } while (i3 == this.f564a);
        } else {
            int i12 = i10 & 7;
            if (i12 != 1) {
                if (i12 != 2) {
                    a2.r.m();
                    return;
                }
                int A2 = y0Var.A();
                W(A2);
                int e9 = y0Var.e() + A2;
                do {
                    t1Var.add(Long.valueOf(y0Var.t()));
                } while (y0Var.e() < e9);
                return;
            }
            do {
                t1Var.add(Long.valueOf(y0Var.t()));
                if (y0Var.d()) {
                    return;
                } else {
                    l10 = y0Var.l();
                }
            } while (l10 == this.f564a);
            i3 = l10;
        }
        this.f566c = i3;
    }

    public void D(t1 t1Var) {
        int l10;
        int i3;
        com.google.android.gms.internal.measurement.y0 y0Var = (com.google.android.gms.internal.measurement.y0) this.f567d;
        boolean z10 = t1Var instanceof com.google.android.gms.internal.measurement.l1;
        int i10 = this.f564a;
        if (z10) {
            com.google.android.gms.internal.measurement.l1 l1Var = (com.google.android.gms.internal.measurement.l1) t1Var;
            int i11 = i10 & 7;
            if (i11 == 2) {
                int A = y0Var.A();
                V(A);
                int e2 = y0Var.e() + A;
                do {
                    l1Var.f(y0Var.u());
                } while (y0Var.e() < e2);
                return;
            }
            if (i11 != 5) {
                a2.r.m();
                return;
            }
            do {
                l1Var.f(y0Var.u());
                if (y0Var.d()) {
                    return;
                } else {
                    i3 = y0Var.l();
                }
            } while (i3 == this.f564a);
        } else {
            int i12 = i10 & 7;
            if (i12 == 2) {
                int A2 = y0Var.A();
                V(A2);
                int e9 = y0Var.e() + A2;
                do {
                    t1Var.add(Integer.valueOf(y0Var.u()));
                } while (y0Var.e() < e9);
                return;
            }
            if (i12 != 5) {
                a2.r.m();
                return;
            }
            do {
                t1Var.add(Integer.valueOf(y0Var.u()));
                if (y0Var.d()) {
                    return;
                } else {
                    l10 = y0Var.l();
                }
            } while (l10 == this.f564a);
            i3 = l10;
        }
        this.f566c = i3;
    }

    public void E(t1 t1Var) {
        int l10;
        com.google.android.gms.internal.measurement.y0 y0Var = (com.google.android.gms.internal.measurement.y0) this.f567d;
        int i3 = this.f564a & 7;
        if (i3 == 0) {
            do {
                t1Var.add(Boolean.valueOf(y0Var.v()));
                if (y0Var.d()) {
                    return;
                } else {
                    l10 = y0Var.l();
                }
            } while (l10 == this.f564a);
            this.f566c = l10;
            return;
        }
        if (i3 != 2) {
            a2.r.m();
            return;
        }
        int e2 = y0Var.e() + y0Var.A();
        do {
            t1Var.add(Boolean.valueOf(y0Var.v()));
        } while (y0Var.e() < e2);
        U(e2);
    }

    public void F(t1 t1Var, boolean z10) {
        String w6;
        int l10;
        com.google.android.gms.internal.measurement.y0 y0Var = (com.google.android.gms.internal.measurement.y0) this.f567d;
        if ((this.f564a & 7) != 2) {
            a2.r.m();
            return;
        }
        do {
            if (z10) {
                Q(2);
                w6 = y0Var.x();
            } else {
                Q(2);
                w6 = y0Var.w();
            }
            t1Var.add(w6);
            if (y0Var.d()) {
                return;
            } else {
                l10 = y0Var.l();
            }
        } while (l10 == this.f564a);
        this.f566c = l10;
    }

    public void G(t1 t1Var, o2 o2Var, com.google.android.gms.internal.measurement.c1 c1Var) {
        int l10;
        int i3 = this.f564a;
        if ((i3 & 7) != 2) {
            a2.r.m();
            return;
        }
        do {
            com.google.android.gms.internal.measurement.k1 a9 = o2Var.a();
            R(a9, o2Var, c1Var);
            o2Var.h(a9);
            t1Var.add(a9);
            com.google.android.gms.internal.measurement.y0 y0Var = (com.google.android.gms.internal.measurement.y0) this.f567d;
            if (y0Var.d() || this.f566c != 0) {
                return;
            } else {
                l10 = y0Var.l();
            }
        } while (l10 == i3);
        this.f566c = l10;
    }

    public void H(t1 t1Var, o2 o2Var, com.google.android.gms.internal.measurement.c1 c1Var) {
        int l10;
        int i3 = this.f564a;
        if ((i3 & 7) != 3) {
            a2.r.m();
            return;
        }
        do {
            com.google.android.gms.internal.measurement.k1 a9 = o2Var.a();
            S(a9, o2Var, c1Var);
            o2Var.h(a9);
            t1Var.add(a9);
            com.google.android.gms.internal.measurement.y0 y0Var = (com.google.android.gms.internal.measurement.y0) this.f567d;
            if (y0Var.d() || this.f566c != 0) {
                return;
            } else {
                l10 = y0Var.l();
            }
        } while (l10 == i3);
        this.f566c = l10;
    }

    public void I(t1 t1Var) {
        int l10;
        if ((this.f564a & 7) != 2) {
            a2.r.m();
            return;
        }
        do {
            t1Var.add(Y());
            com.google.android.gms.internal.measurement.y0 y0Var = (com.google.android.gms.internal.measurement.y0) this.f567d;
            if (y0Var.d()) {
                return;
            } else {
                l10 = y0Var.l();
            }
        } while (l10 == this.f564a);
        this.f566c = l10;
    }

    public void J(t1 t1Var) {
        int l10;
        int i3;
        com.google.android.gms.internal.measurement.y0 y0Var = (com.google.android.gms.internal.measurement.y0) this.f567d;
        boolean z10 = t1Var instanceof com.google.android.gms.internal.measurement.l1;
        int i10 = this.f564a;
        if (z10) {
            com.google.android.gms.internal.measurement.l1 l1Var = (com.google.android.gms.internal.measurement.l1) t1Var;
            int i11 = i10 & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    a2.r.m();
                    return;
                }
                int e2 = y0Var.e() + y0Var.A();
                do {
                    l1Var.f(y0Var.A());
                } while (y0Var.e() < e2);
                U(e2);
                return;
            }
            do {
                l1Var.f(y0Var.A());
                if (y0Var.d()) {
                    return;
                } else {
                    i3 = y0Var.l();
                }
            } while (i3 == this.f564a);
        } else {
            int i12 = i10 & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    a2.r.m();
                    return;
                }
                int e9 = y0Var.e() + y0Var.A();
                do {
                    t1Var.add(Integer.valueOf(y0Var.A()));
                } while (y0Var.e() < e9);
                U(e9);
                return;
            }
            do {
                t1Var.add(Integer.valueOf(y0Var.A()));
                if (y0Var.d()) {
                    return;
                } else {
                    l10 = y0Var.l();
                }
            } while (l10 == this.f564a);
            i3 = l10;
        }
        this.f566c = i3;
    }

    public void K(t1 t1Var) {
        int l10;
        int i3;
        com.google.android.gms.internal.measurement.y0 y0Var = (com.google.android.gms.internal.measurement.y0) this.f567d;
        boolean z10 = t1Var instanceof com.google.android.gms.internal.measurement.l1;
        int i10 = this.f564a;
        if (z10) {
            com.google.android.gms.internal.measurement.l1 l1Var = (com.google.android.gms.internal.measurement.l1) t1Var;
            int i11 = i10 & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    a2.r.m();
                    return;
                }
                int e2 = y0Var.e() + y0Var.A();
                do {
                    l1Var.f(y0Var.B());
                } while (y0Var.e() < e2);
                U(e2);
                return;
            }
            do {
                l1Var.f(y0Var.B());
                if (y0Var.d()) {
                    return;
                } else {
                    i3 = y0Var.l();
                }
            } while (i3 == this.f564a);
        } else {
            int i12 = i10 & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    a2.r.m();
                    return;
                }
                int e9 = y0Var.e() + y0Var.A();
                do {
                    t1Var.add(Integer.valueOf(y0Var.B()));
                } while (y0Var.e() < e9);
                U(e9);
                return;
            }
            do {
                t1Var.add(Integer.valueOf(y0Var.B()));
                if (y0Var.d()) {
                    return;
                } else {
                    l10 = y0Var.l();
                }
            } while (l10 == this.f564a);
            i3 = l10;
        }
        this.f566c = i3;
    }

    public void L(t1 t1Var) {
        int l10;
        int i3;
        com.google.android.gms.internal.measurement.y0 y0Var = (com.google.android.gms.internal.measurement.y0) this.f567d;
        boolean z10 = t1Var instanceof com.google.android.gms.internal.measurement.l1;
        int i10 = this.f564a;
        if (z10) {
            com.google.android.gms.internal.measurement.l1 l1Var = (com.google.android.gms.internal.measurement.l1) t1Var;
            int i11 = i10 & 7;
            if (i11 == 2) {
                int A = y0Var.A();
                V(A);
                int e2 = y0Var.e() + A;
                do {
                    l1Var.f(y0Var.C());
                } while (y0Var.e() < e2);
                return;
            }
            if (i11 != 5) {
                a2.r.m();
                return;
            }
            do {
                l1Var.f(y0Var.C());
                if (y0Var.d()) {
                    return;
                } else {
                    i3 = y0Var.l();
                }
            } while (i3 == this.f564a);
        } else {
            int i12 = i10 & 7;
            if (i12 == 2) {
                int A2 = y0Var.A();
                V(A2);
                int e9 = y0Var.e() + A2;
                do {
                    t1Var.add(Integer.valueOf(y0Var.C()));
                } while (y0Var.e() < e9);
                return;
            }
            if (i12 != 5) {
                a2.r.m();
                return;
            }
            do {
                t1Var.add(Integer.valueOf(y0Var.C()));
                if (y0Var.d()) {
                    return;
                } else {
                    l10 = y0Var.l();
                }
            } while (l10 == this.f564a);
            i3 = l10;
        }
        this.f566c = i3;
    }

    public void M(t1 t1Var) {
        int l10;
        int i3;
        com.google.android.gms.internal.measurement.y0 y0Var = (com.google.android.gms.internal.measurement.y0) this.f567d;
        boolean z10 = t1Var instanceof z1;
        int i10 = this.f564a;
        if (z10) {
            z1 z1Var = (z1) t1Var;
            int i11 = i10 & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    a2.r.m();
                    return;
                }
                int A = y0Var.A();
                W(A);
                int e2 = y0Var.e() + A;
                do {
                    z1Var.f(y0Var.D());
                } while (y0Var.e() < e2);
                return;
            }
            do {
                z1Var.f(y0Var.D());
                if (y0Var.d()) {
                    return;
                } else {
                    i3 = y0Var.l();
                }
            } while (i3 == this.f564a);
        } else {
            int i12 = i10 & 7;
            if (i12 != 1) {
                if (i12 != 2) {
                    a2.r.m();
                    return;
                }
                int A2 = y0Var.A();
                W(A2);
                int e9 = y0Var.e() + A2;
                do {
                    t1Var.add(Long.valueOf(y0Var.D()));
                } while (y0Var.e() < e9);
                return;
            }
            do {
                t1Var.add(Long.valueOf(y0Var.D()));
                if (y0Var.d()) {
                    return;
                } else {
                    l10 = y0Var.l();
                }
            } while (l10 == this.f564a);
            i3 = l10;
        }
        this.f566c = i3;
    }

    public void N(t1 t1Var) {
        int l10;
        int i3;
        com.google.android.gms.internal.measurement.y0 y0Var = (com.google.android.gms.internal.measurement.y0) this.f567d;
        boolean z10 = t1Var instanceof com.google.android.gms.internal.measurement.l1;
        int i10 = this.f564a;
        if (z10) {
            com.google.android.gms.internal.measurement.l1 l1Var = (com.google.android.gms.internal.measurement.l1) t1Var;
            int i11 = i10 & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    a2.r.m();
                    return;
                }
                int e2 = y0Var.e() + y0Var.A();
                do {
                    l1Var.f(y0Var.E());
                } while (y0Var.e() < e2);
                U(e2);
                return;
            }
            do {
                l1Var.f(y0Var.E());
                if (y0Var.d()) {
                    return;
                } else {
                    i3 = y0Var.l();
                }
            } while (i3 == this.f564a);
        } else {
            int i12 = i10 & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    a2.r.m();
                    return;
                }
                int e9 = y0Var.e() + y0Var.A();
                do {
                    t1Var.add(Integer.valueOf(y0Var.E()));
                } while (y0Var.e() < e9);
                U(e9);
                return;
            }
            do {
                t1Var.add(Integer.valueOf(y0Var.E()));
                if (y0Var.d()) {
                    return;
                } else {
                    l10 = y0Var.l();
                }
            } while (l10 == this.f564a);
            i3 = l10;
        }
        this.f566c = i3;
    }

    public void O(t1 t1Var) {
        int l10;
        int i3;
        com.google.android.gms.internal.measurement.y0 y0Var = (com.google.android.gms.internal.measurement.y0) this.f567d;
        boolean z10 = t1Var instanceof z1;
        int i10 = this.f564a;
        if (z10) {
            z1 z1Var = (z1) t1Var;
            int i11 = i10 & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    a2.r.m();
                    return;
                }
                int e2 = y0Var.e() + y0Var.A();
                do {
                    z1Var.f(y0Var.F());
                } while (y0Var.e() < e2);
                U(e2);
                return;
            }
            do {
                z1Var.f(y0Var.F());
                if (y0Var.d()) {
                    return;
                } else {
                    i3 = y0Var.l();
                }
            } while (i3 == this.f564a);
        } else {
            int i12 = i10 & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    a2.r.m();
                    return;
                }
                int e9 = y0Var.e() + y0Var.A();
                do {
                    t1Var.add(Long.valueOf(y0Var.F()));
                } while (y0Var.e() < e9);
                U(e9);
                return;
            }
            do {
                t1Var.add(Long.valueOf(y0Var.F()));
                if (y0Var.d()) {
                    return;
                } else {
                    l10 = y0Var.l();
                }
            } while (l10 == this.f564a);
            i3 = l10;
        }
        this.f566c = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x007e, code lost:
    
        r12.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0081, code lost:
    
        r1.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0084, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0042 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void P(b2 b2Var, a1.n nVar, com.google.android.gms.internal.measurement.c1 c1Var) {
        int i3;
        boolean z10;
        int i10;
        Q(2);
        com.google.android.gms.internal.measurement.y0 y0Var = (com.google.android.gms.internal.measurement.y0) this.f567d;
        int a9 = y0Var.a(y0Var.A());
        Object obj = nVar.f42r;
        Object obj2 = "";
        Object obj3 = obj;
        while (true) {
            try {
                int X = X();
                if (X == Integer.MAX_VALUE || y0Var.d()) {
                    break;
                }
                boolean z11 = false;
                if (X == 1) {
                    obj2 = T((c3) nVar.f41i, null, null);
                } else if (X != 2) {
                    try {
                        if (!y0Var.d() && (i10 = this.f564a) != this.f565b) {
                            z10 = y0Var.n(i10);
                            if (z10) {
                                throw new v1("Unable to parse map entry.");
                            }
                        }
                        z10 = false;
                        if (z10) {
                        }
                    } catch (u1 e2) {
                        if (!y0Var.d() && (i3 = this.f564a) != this.f565b) {
                            z11 = y0Var.n(i3);
                        }
                        throw new v1("Unable to parse map entry.", e2);
                    }
                } else {
                    obj3 = T((c3) nVar.f40e, obj.getClass(), c1Var);
                }
            } catch (Throwable th) {
                y0Var.b(a9);
                throw th;
            }
        }
    }

    public void Q(int i3) {
        if ((this.f564a & 7) == i3) {
            return;
        }
        a2.r.m();
    }

    public void R(Object obj, o2 o2Var, com.google.android.gms.internal.measurement.c1 c1Var) {
        com.google.android.gms.internal.measurement.y0 y0Var = (com.google.android.gms.internal.measurement.y0) this.f567d;
        int A = y0Var.A();
        if (y0Var.f2999a + y0Var.f3000b >= 100) {
            a2.r.o("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return;
        }
        int a9 = y0Var.a(A);
        y0Var.f2999a++;
        o2Var.f(obj, this, c1Var);
        y0Var.m(0);
        y0Var.f2999a--;
        y0Var.b(a9);
    }

    public void S(Object obj, o2 o2Var, com.google.android.gms.internal.measurement.c1 c1Var) {
        int i3 = this.f565b;
        this.f565b = ((this.f564a >>> 3) << 3) | 4;
        try {
            o2Var.f(obj, this, c1Var);
            if (this.f564a == this.f565b) {
            } else {
                throw new v1("Failed to parse the message.");
            }
        } finally {
            this.f565b = i3;
        }
    }

    public Object T(c3 c3Var, Class cls, com.google.android.gms.internal.measurement.c1 c1Var) {
        com.google.android.gms.internal.measurement.y0 y0Var = (com.google.android.gms.internal.measurement.y0) this.f567d;
        c3 c3Var2 = c3.f2183i;
        switch (c3Var.ordinal()) {
            case 0:
                Q(1);
                return Double.valueOf(y0Var.o());
            case 1:
                Q(5);
                return Float.valueOf(y0Var.p());
            case 2:
                Q(0);
                return Long.valueOf(y0Var.r());
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                Q(0);
                return Long.valueOf(y0Var.q());
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                Q(0);
                return Integer.valueOf(y0Var.s());
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                Q(1);
                return Long.valueOf(y0Var.t());
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                Q(5);
                return Integer.valueOf(y0Var.u());
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                Q(0);
                return Boolean.valueOf(y0Var.v());
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                Q(2);
                return y0Var.x();
            case 9:
            default:
                te.a1.e("unsupported field type.");
                return null;
            case 10:
                Q(2);
                o2 a9 = l2.f2493c.a(cls);
                com.google.android.gms.internal.measurement.k1 a10 = a9.a();
                R(a10, a9, c1Var);
                a9.h(a10);
                return a10;
            case RequestError.STOP_TRACKING /* 11 */:
                return Y();
            case 12:
                Q(0);
                return Integer.valueOf(y0Var.A());
            case 13:
                Q(0);
                return Integer.valueOf(y0Var.B());
            case 14:
                Q(5);
                return Integer.valueOf(y0Var.C());
            case 15:
                Q(1);
                return Long.valueOf(y0Var.D());
            case 16:
                Q(0);
                return Integer.valueOf(y0Var.E());
            case 17:
                Q(0);
                return Long.valueOf(y0Var.F());
        }
    }

    public void U(int i3) {
        if (((com.google.android.gms.internal.measurement.y0) this.f567d).e() == i3) {
            return;
        }
        a2.r.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public int X() {
        int i3 = this.f566c;
        if (i3 != 0) {
            this.f564a = i3;
            this.f566c = 0;
        } else {
            i3 = ((com.google.android.gms.internal.measurement.y0) this.f567d).l();
            this.f564a = i3;
        }
        if (i3 == 0 || i3 == this.f565b) {
            return Integer.MAX_VALUE;
        }
        return i3 >>> 3;
    }

    public com.google.android.gms.internal.measurement.v0 Y() {
        Q(2);
        return ((com.google.android.gms.internal.measurement.y0) this.f567d).y();
    }

    public void Z(t1 t1Var) {
        int l10;
        com.google.android.gms.internal.measurement.y0 y0Var = (com.google.android.gms.internal.measurement.y0) this.f567d;
        int i3 = this.f564a & 7;
        if (i3 == 1) {
            do {
                t1Var.add(Double.valueOf(y0Var.o()));
                if (y0Var.d()) {
                    return;
                } else {
                    l10 = y0Var.l();
                }
            } while (l10 == this.f564a);
            this.f566c = l10;
            return;
        }
        if (i3 != 2) {
            a2.r.m();
            return;
        }
        int A = y0Var.A();
        W(A);
        int e2 = y0Var.e() + A;
        do {
            t1Var.add(Double.valueOf(y0Var.o()));
        } while (y0Var.e() < e2);
    }

    public int a() {
        int i3 = this.f566c;
        if (i3 != 0) {
            this.f564a = i3;
            this.f566c = 0;
        } else {
            this.f564a = ((i) this.f567d).z();
        }
        int i10 = this.f564a;
        if (i10 == 0 || i10 == this.f565b) {
            return Integer.MAX_VALUE;
        }
        return i10 >>> 3;
    }

    public void a0(t1 t1Var) {
        int l10;
        com.google.android.gms.internal.measurement.y0 y0Var = (com.google.android.gms.internal.measurement.y0) this.f567d;
        int i3 = this.f564a & 7;
        if (i3 == 2) {
            int A = y0Var.A();
            V(A);
            int e2 = y0Var.e() + A;
            do {
                t1Var.add(Float.valueOf(y0Var.p()));
            } while (y0Var.e() < e2);
            return;
        }
        if (i3 != 5) {
            a2.r.m();
            return;
        }
        do {
            t1Var.add(Float.valueOf(y0Var.p()));
            if (y0Var.d()) {
                return;
            } else {
                l10 = y0Var.l();
            }
        } while (l10 == this.f564a);
        this.f566c = l10;
    }

    public int b(int i3) {
        return ((r0.k0) this.f567d).f8115c[this.f565b + i3];
    }

    public void b0(t1 t1Var) {
        int l10;
        int i3;
        com.google.android.gms.internal.measurement.y0 y0Var = (com.google.android.gms.internal.measurement.y0) this.f567d;
        boolean z10 = t1Var instanceof z1;
        int i10 = this.f564a;
        if (z10) {
            z1 z1Var = (z1) t1Var;
            int i11 = i10 & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    a2.r.m();
                    return;
                }
                int e2 = y0Var.e() + y0Var.A();
                do {
                    z1Var.f(y0Var.q());
                } while (y0Var.e() < e2);
                U(e2);
                return;
            }
            do {
                z1Var.f(y0Var.q());
                if (y0Var.d()) {
                    return;
                } else {
                    i3 = y0Var.l();
                }
            } while (i3 == this.f564a);
        } else {
            int i12 = i10 & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    a2.r.m();
                    return;
                }
                int e9 = y0Var.e() + y0Var.A();
                do {
                    t1Var.add(Long.valueOf(y0Var.q()));
                } while (y0Var.e() < e9);
                U(e9);
                return;
            }
            do {
                t1Var.add(Long.valueOf(y0Var.q()));
                if (y0Var.d()) {
                    return;
                } else {
                    l10 = y0Var.l();
                }
            } while (l10 == this.f564a);
            i3 = l10;
        }
        this.f566c = i3;
    }

    public Object c(int i3) {
        return ((r0.k0) this.f567d).f8117e[this.f566c + i3];
    }

    public void d(Object obj, w0 w0Var, n nVar) {
        int i3 = this.f565b;
        this.f565b = ((this.f564a >>> 3) << 3) | 4;
        try {
            w0Var.g(obj, this, nVar);
            if (this.f564a == this.f565b) {
            } else {
                throw new z("Failed to parse the message.");
            }
        } finally {
            this.f565b = i3;
        }
    }

    public void e(Object obj, w0 w0Var, n nVar) {
        i iVar = (i) this.f567d;
        int A = iVar.A();
        if (iVar.f559d >= 100) {
            throw new z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int j = iVar.j(A);
        iVar.f559d++;
        w0Var.g(obj, this, nVar);
        iVar.a(0);
        iVar.f559d--;
        iVar.i(j);
    }

    public void f(w wVar) {
        int z10;
        i iVar = (i) this.f567d;
        int i3 = this.f564a & 7;
        if (i3 == 0) {
            do {
                ((u0) wVar).add(Boolean.valueOf(iVar.k()));
                if (iVar.d()) {
                    return;
                } else {
                    z10 = iVar.z();
                }
            } while (z10 == this.f564a);
            this.f566c = z10;
            return;
        }
        if (i3 != 2) {
            throw z.b();
        }
        int c10 = iVar.c() + iVar.A();
        do {
            ((u0) wVar).add(Boolean.valueOf(iVar.k()));
        } while (iVar.c() < c10);
        x(c10);
    }

    public f g() {
        y(2);
        return ((i) this.f567d).l();
    }

    public void h(w wVar) {
        int z10;
        i iVar = (i) this.f567d;
        if ((this.f564a & 7) != 2) {
            throw z.b();
        }
        do {
            ((u0) wVar).add(g());
            if (iVar.d()) {
                return;
            } else {
                z10 = iVar.z();
            }
        } while (z10 == this.f564a);
        this.f566c = z10;
    }

    public void i(w wVar) {
        int z10;
        i iVar = (i) this.f567d;
        int i3 = this.f564a & 7;
        if (i3 == 1) {
            do {
                ((u0) wVar).add(Double.valueOf(iVar.m()));
                if (iVar.d()) {
                    return;
                } else {
                    z10 = iVar.z();
                }
            } while (z10 == this.f564a);
            this.f566c = z10;
            return;
        }
        if (i3 != 2) {
            throw z.b();
        }
        int A = iVar.A();
        if ((A & 7) != 0) {
            throw new z("Failed to parse the message.");
        }
        int c10 = iVar.c() + A;
        do {
            ((u0) wVar).add(Double.valueOf(iVar.m()));
        } while (iVar.c() < c10);
    }

    public void j(w wVar) {
        int z10;
        i iVar = (i) this.f567d;
        int i3 = this.f564a & 7;
        if (i3 == 0) {
            do {
                ((u0) wVar).add(Integer.valueOf(iVar.n()));
                if (iVar.d()) {
                    return;
                } else {
                    z10 = iVar.z();
                }
            } while (z10 == this.f564a);
            this.f566c = z10;
            return;
        }
        if (i3 != 2) {
            throw z.b();
        }
        int c10 = iVar.c() + iVar.A();
        do {
            ((u0) wVar).add(Integer.valueOf(iVar.n()));
        } while (iVar.c() < c10);
        x(c10);
    }

    public Object k(r1 r1Var, Class cls, n nVar) {
        i iVar = (i) this.f567d;
        switch (r1Var.ordinal()) {
            case 0:
                y(1);
                return Double.valueOf(iVar.m());
            case 1:
                y(5);
                return Float.valueOf(iVar.q());
            case 2:
                y(0);
                return Long.valueOf(iVar.s());
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                y(0);
                return Long.valueOf(iVar.B());
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                y(0);
                return Integer.valueOf(iVar.r());
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                y(1);
                return Long.valueOf(iVar.p());
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                y(5);
                return Integer.valueOf(iVar.o());
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                y(0);
                return Boolean.valueOf(iVar.k());
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                y(2);
                return iVar.y();
            case 9:
            default:
                te.a1.e("unsupported field type.");
                return null;
            case 10:
                y(2);
                w0 a9 = t0.f636c.a(cls);
                v i3 = a9.i();
                e(i3, a9, nVar);
                a9.d(i3);
                return i3;
            case RequestError.STOP_TRACKING /* 11 */:
                return g();
            case 12:
                y(0);
                return Integer.valueOf(iVar.A());
            case 13:
                y(0);
                return Integer.valueOf(iVar.n());
            case 14:
                y(5);
                return Integer.valueOf(iVar.t());
            case 15:
                y(1);
                return Long.valueOf(iVar.u());
            case 16:
                y(0);
                return Integer.valueOf(iVar.v());
            case 17:
                y(0);
                return Long.valueOf(iVar.w());
        }
    }

    public void l(w wVar) {
        int z10;
        i iVar = (i) this.f567d;
        int i3 = this.f564a & 7;
        if (i3 == 2) {
            int A = iVar.A();
            if ((A & 3) != 0) {
                throw new z("Failed to parse the message.");
            }
            int c10 = iVar.c() + A;
            do {
                ((u0) wVar).add(Integer.valueOf(iVar.o()));
            } while (iVar.c() < c10);
            return;
        }
        if (i3 != 5) {
            throw z.b();
        }
        do {
            ((u0) wVar).add(Integer.valueOf(iVar.o()));
            if (iVar.d()) {
                return;
            } else {
                z10 = iVar.z();
            }
        } while (z10 == this.f564a);
        this.f566c = z10;
    }

    public void m(w wVar) {
        int z10;
        i iVar = (i) this.f567d;
        int i3 = this.f564a & 7;
        if (i3 == 1) {
            do {
                ((u0) wVar).add(Long.valueOf(iVar.p()));
                if (iVar.d()) {
                    return;
                } else {
                    z10 = iVar.z();
                }
            } while (z10 == this.f564a);
            this.f566c = z10;
            return;
        }
        if (i3 != 2) {
            throw z.b();
        }
        int A = iVar.A();
        if ((A & 7) != 0) {
            throw new z("Failed to parse the message.");
        }
        int c10 = iVar.c() + A;
        do {
            ((u0) wVar).add(Long.valueOf(iVar.p()));
        } while (iVar.c() < c10);
    }

    public void n(w wVar) {
        int z10;
        i iVar = (i) this.f567d;
        int i3 = this.f564a & 7;
        if (i3 == 2) {
            int A = iVar.A();
            if ((A & 3) != 0) {
                throw new z("Failed to parse the message.");
            }
            int c10 = iVar.c() + A;
            do {
                ((u0) wVar).add(Float.valueOf(iVar.q()));
            } while (iVar.c() < c10);
            return;
        }
        if (i3 != 5) {
            throw z.b();
        }
        do {
            ((u0) wVar).add(Float.valueOf(iVar.q()));
            if (iVar.d()) {
                return;
            } else {
                z10 = iVar.z();
            }
        } while (z10 == this.f564a);
        this.f566c = z10;
    }

    public void o(w wVar) {
        int z10;
        i iVar = (i) this.f567d;
        int i3 = this.f564a & 7;
        if (i3 == 0) {
            do {
                ((u0) wVar).add(Integer.valueOf(iVar.r()));
                if (iVar.d()) {
                    return;
                } else {
                    z10 = iVar.z();
                }
            } while (z10 == this.f564a);
            this.f566c = z10;
            return;
        }
        if (i3 != 2) {
            throw z.b();
        }
        int c10 = iVar.c() + iVar.A();
        do {
            ((u0) wVar).add(Integer.valueOf(iVar.r()));
        } while (iVar.c() < c10);
        x(c10);
    }

    public void p(w wVar) {
        int z10;
        i iVar = (i) this.f567d;
        int i3 = this.f564a & 7;
        if (i3 == 0) {
            do {
                ((u0) wVar).add(Long.valueOf(iVar.s()));
                if (iVar.d()) {
                    return;
                } else {
                    z10 = iVar.z();
                }
            } while (z10 == this.f564a);
            this.f566c = z10;
            return;
        }
        if (i3 != 2) {
            throw z.b();
        }
        int c10 = iVar.c() + iVar.A();
        do {
            ((u0) wVar).add(Long.valueOf(iVar.s()));
        } while (iVar.c() < c10);
        x(c10);
    }

    public void q(w wVar) {
        int z10;
        i iVar = (i) this.f567d;
        int i3 = this.f564a & 7;
        if (i3 == 2) {
            int A = iVar.A();
            if ((A & 3) != 0) {
                throw new z("Failed to parse the message.");
            }
            int c10 = iVar.c() + A;
            do {
                ((u0) wVar).add(Integer.valueOf(iVar.t()));
            } while (iVar.c() < c10);
            return;
        }
        if (i3 != 5) {
            throw z.b();
        }
        do {
            ((u0) wVar).add(Integer.valueOf(iVar.t()));
            if (iVar.d()) {
                return;
            } else {
                z10 = iVar.z();
            }
        } while (z10 == this.f564a);
        this.f566c = z10;
    }

    public void r(w wVar) {
        int z10;
        i iVar = (i) this.f567d;
        int i3 = this.f564a & 7;
        if (i3 == 1) {
            do {
                ((u0) wVar).add(Long.valueOf(iVar.u()));
                if (iVar.d()) {
                    return;
                } else {
                    z10 = iVar.z();
                }
            } while (z10 == this.f564a);
            this.f566c = z10;
            return;
        }
        if (i3 != 2) {
            throw z.b();
        }
        int A = iVar.A();
        if ((A & 7) != 0) {
            throw new z("Failed to parse the message.");
        }
        int c10 = iVar.c() + A;
        do {
            ((u0) wVar).add(Long.valueOf(iVar.u()));
        } while (iVar.c() < c10);
    }

    public void s(w wVar) {
        int z10;
        i iVar = (i) this.f567d;
        int i3 = this.f564a & 7;
        if (i3 == 0) {
            do {
                ((u0) wVar).add(Integer.valueOf(iVar.v()));
                if (iVar.d()) {
                    return;
                } else {
                    z10 = iVar.z();
                }
            } while (z10 == this.f564a);
            this.f566c = z10;
            return;
        }
        if (i3 != 2) {
            throw z.b();
        }
        int c10 = iVar.c() + iVar.A();
        do {
            ((u0) wVar).add(Integer.valueOf(iVar.v()));
        } while (iVar.c() < c10);
        x(c10);
    }

    public void t(w wVar) {
        int z10;
        i iVar = (i) this.f567d;
        int i3 = this.f564a & 7;
        if (i3 == 0) {
            do {
                ((u0) wVar).add(Long.valueOf(iVar.w()));
                if (iVar.d()) {
                    return;
                } else {
                    z10 = iVar.z();
                }
            } while (z10 == this.f564a);
            this.f566c = z10;
            return;
        }
        if (i3 != 2) {
            throw z.b();
        }
        int c10 = iVar.c() + iVar.A();
        do {
            ((u0) wVar).add(Long.valueOf(iVar.w()));
        } while (iVar.c() < c10);
        x(c10);
    }

    public void u(w wVar, boolean z10) {
        String x10;
        int z11;
        i iVar = (i) this.f567d;
        if ((this.f564a & 7) != 2) {
            throw z.b();
        }
        do {
            if (z10) {
                y(2);
                x10 = iVar.y();
            } else {
                y(2);
                x10 = iVar.x();
            }
            ((u0) wVar).add(x10);
            if (iVar.d()) {
                return;
            } else {
                z11 = iVar.z();
            }
        } while (z11 == this.f564a);
        this.f566c = z11;
    }

    public void v(w wVar) {
        int z10;
        i iVar = (i) this.f567d;
        int i3 = this.f564a & 7;
        if (i3 == 0) {
            do {
                ((u0) wVar).add(Integer.valueOf(iVar.A()));
                if (iVar.d()) {
                    return;
                } else {
                    z10 = iVar.z();
                }
            } while (z10 == this.f564a);
            this.f566c = z10;
            return;
        }
        if (i3 != 2) {
            throw z.b();
        }
        int c10 = iVar.c() + iVar.A();
        do {
            ((u0) wVar).add(Integer.valueOf(iVar.A()));
        } while (iVar.c() < c10);
        x(c10);
    }

    public void w(w wVar) {
        int z10;
        i iVar = (i) this.f567d;
        int i3 = this.f564a & 7;
        if (i3 == 0) {
            do {
                ((u0) wVar).add(Long.valueOf(iVar.B()));
                if (iVar.d()) {
                    return;
                } else {
                    z10 = iVar.z();
                }
            } while (z10 == this.f564a);
            this.f566c = z10;
            return;
        }
        if (i3 != 2) {
            throw z.b();
        }
        int c10 = iVar.c() + iVar.A();
        do {
            ((u0) wVar).add(Long.valueOf(iVar.B()));
        } while (iVar.c() < c10);
        x(c10);
    }

    public void x(int i3) {
        if (((i) this.f567d).c() != i3) {
            throw z.e();
        }
    }

    public void y(int i3) {
        if ((this.f564a & 7) != i3) {
            throw z.b();
        }
    }

    public boolean z() {
        int i3;
        i iVar = (i) this.f567d;
        if (iVar.d() || (i3 = this.f564a) == this.f565b) {
            return false;
        }
        return iVar.C(i3);
    }

    public j(com.google.android.gms.internal.measurement.y0 y0Var) {
        this.f566c = 0;
        this.f567d = y0Var;
        y0Var.f3001c = this;
    }

    public j(r0.k0 k0Var) {
        this.f567d = k0Var;
    }
}
