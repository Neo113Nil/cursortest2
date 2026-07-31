package u0;

import a0.z0;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import m0.a2;
import m0.b2;
import o.j0;
import o.k0;
import o.s0;
import r2.o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public Set f7154a;

    /* renamed from: b, reason: collision with root package name */
    public x0.b f7155b;

    /* renamed from: c, reason: collision with root package name */
    public final o0.e f7156c;

    /* renamed from: d, reason: collision with root package name */
    public k0 f7157d;

    /* renamed from: e, reason: collision with root package name */
    public o0.e f7158e;

    /* renamed from: f, reason: collision with root package name */
    public final o0.e f7159f;

    /* renamed from: g, reason: collision with root package name */
    public final o0.e f7160g;

    /* renamed from: h, reason: collision with root package name */
    public k0 f7161h;
    public j0 i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f7162j;

    /* renamed from: k, reason: collision with root package name */
    public k0 f7163k;

    public i() {
        o0.e eVar = new o0.e(new b2[16]);
        this.f7156c = eVar;
        k0 k0Var = s0.f5536a;
        this.f7157d = new k0();
        this.f7158e = eVar;
        this.f7159f = new o0.e(new Object[16]);
        this.f7160g = new o0.e(new p6.a[16]);
    }

    public static final boolean f(b2 b2Var, o0.e eVar) {
        Object[] objArr = eVar.f5578d;
        int i = eVar.f5580f;
        for (int i8 = 0; i8 < i; i8++) {
            a2 a2Var = ((b2) objArr[i8]).f4881a;
            if (a2Var instanceof e) {
                o0.e eVar2 = ((e) a2Var).f7145e;
                if (eVar2.j(b2Var) || f(b2Var, eVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a() {
        this.f7154a = null;
        this.f7155b = null;
        o0.e eVar = this.f7156c;
        eVar.g();
        this.f7157d.b();
        this.f7158e = eVar;
        this.f7159f.g();
        this.f7160g.g();
        this.f7161h = null;
        this.i = null;
        this.f7162j = null;
    }

    public final void b() {
        Set set = this.f7154a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                a2 a2Var = (a2) it.next();
                it.remove();
                a2Var.f();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void c() {
        Set set = this.f7154a;
        if (set == null) {
            return;
        }
        this.f7163k = null;
        o0.e eVar = this.f7159f;
        if (eVar.f5580f != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                k0 k0Var = this.f7161h;
                int i = eVar.f5580f;
                while (true) {
                    i--;
                    if (-1 >= i) {
                        break;
                    }
                    Object obj = eVar.f5578d[i];
                    try {
                        if (obj instanceof b2) {
                            a2 a2Var = ((b2) obj).f4881a;
                            set.remove(a2Var);
                            a2Var.i();
                        }
                        if (obj instanceof m0.j) {
                            if (k0Var == null || !k0Var.c(obj)) {
                                ((m0.j) obj).b();
                            } else {
                                ((m0.j) obj).a();
                            }
                        }
                    } catch (Throwable th) {
                        x0.b bVar = this.f7155b;
                        if (bVar != null) {
                            o.t0(th, new z0(10, bVar, obj));
                        }
                        throw th;
                    }
                }
            } finally {
            }
        }
        o0.e eVar2 = this.f7156c;
        if (eVar2.f5580f != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = this.f7154a;
                if (set2 != null) {
                    Object[] objArr = eVar2.f5578d;
                    int i8 = eVar2.f5580f;
                    for (int i9 = 0; i9 < i8; i9++) {
                        b2 b2Var = (b2) objArr[i9];
                        a2 a2Var2 = b2Var.f4881a;
                        set2.remove(a2Var2);
                        try {
                            a2Var2.e();
                        } catch (Throwable th2) {
                            x0.b bVar2 = this.f7155b;
                            if (bVar2 != null) {
                                o.t0(th2, new z0(10, bVar2, b2Var));
                            }
                            throw th2;
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void d() {
        o0.e eVar = this.f7160g;
        if (eVar.f5580f != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = eVar.f5578d;
                int i = eVar.f5580f;
                for (int i8 = 0; i8 < i; i8++) {
                    ((p6.a) objArr[i8]).b();
                }
                eVar.g();
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    public final void e(b2 b2Var) {
        if (this.f7157d.c(b2Var)) {
            this.f7157d.l(b2Var);
            if (!this.f7158e.j(b2Var)) {
                o0.e eVar = this.f7156c;
                if (!eVar.j(b2Var)) {
                    f(b2Var, eVar);
                }
            }
            Set set = this.f7154a;
            if (set == null) {
                return;
            } else {
                set.add(b2Var.f4881a);
            }
        }
        k0 k0Var = this.f7163k;
        if (k0Var == null || !k0Var.c(b2Var)) {
            this.f7159f.b(b2Var);
        }
    }

    public final void g(Set set, x0.b bVar) {
        a();
        this.f7154a = set;
        this.f7155b = bVar;
    }
}
