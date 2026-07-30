package com.baidu.ar;

import android.os.Looper;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class f3 implements t5 {

    /* renamed from: a, reason: collision with root package name */
    public List<t5> f2191a = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    public List<t5> f2192b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public d3 f2193c;

    /* renamed from: d, reason: collision with root package name */
    public e3 f2194d;

    public class a implements e3 {
        public a() {
        }

        @Override // com.baidu.ar.e3
        public void a(b3 b3Var) {
            if (f3.this.f2194d != null) {
                f3.this.f2194d.a(b3Var);
            }
        }

        @Override // com.baidu.ar.e3
        public void b(kb kbVar) {
            if (f3.this.f2194d != null) {
                f3.this.f2194d.b(kbVar);
            }
        }

        @Override // com.baidu.ar.e3
        public void a(kb kbVar) {
            if (f3.this.f2194d != null) {
                f3.this.f2194d.a(kbVar);
            }
        }
    }

    public class b implements e3 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e3 f2196a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f2197b;

        public b(e3 e3Var, boolean z7) {
            this.f2196a = e3Var;
            this.f2197b = z7;
        }

        @Override // com.baidu.ar.e3
        public void a(b3 b3Var) {
            if (b3Var == null) {
                h.b("DetectorGroup", "onDetected detectResult is NULLLLLL!!!");
                return;
            }
            if (f3.this.f2192b != null && f3.this.f2192b.size() > 0) {
                t5 t5Var = null;
                for (t5 t5Var2 : f3.this.f2192b) {
                    if (f3.this.a(b3Var, t5Var2) && f3.this.a(b3Var)) {
                        t5Var = t5Var2;
                    }
                }
                if (t5Var != null && f3.this.f2191a != null) {
                    f3.this.f2191a.add(t5Var);
                    f3.this.f2192b.remove(t5Var);
                    h.a("DetectorGroup", "onDetected detector2Add = " + t5Var.getName());
                }
            }
            if (f3.this.f2193c != null) {
                f3.this.f2193c.e(b3Var);
            }
        }

        @Override // com.baidu.ar.e3
        public void b(kb kbVar) {
            if (f3.this.f2193c != null) {
                f3.this.f2193c.c(kbVar);
            }
            e3 e3Var = this.f2196a;
            if (e3Var != null) {
                e3Var.b(kbVar);
            }
        }

        @Override // com.baidu.ar.e3
        public void a(kb kbVar) {
            h.a("DetectorGroup", "setupDetctor result = " + kbVar.a() + " * " + kbVar.b());
            if (f3.this.f2192b != null && f3.this.f2192b.size() > 0 && !kbVar.b()) {
                t5 t5Var = null;
                for (t5 t5Var2 : f3.this.f2192b) {
                    if (kbVar.a() != null && kbVar.a().equals(t5Var2.getName())) {
                        t5Var = t5Var2;
                    }
                }
                if (t5Var != null) {
                    f3.this.f2192b.remove(t5Var);
                    h.a("DetectorGroup", "onSetup detector2Remove = " + t5Var.getName());
                }
            }
            if (f3.this.f2193c != null) {
                f3.this.f2193c.d(kbVar);
            }
            e3 e3Var = this.f2196a;
            if (e3Var == null || !this.f2197b) {
                return;
            }
            e3Var.a(kbVar);
        }
    }

    public f3(Looper looper) {
        this.f2193c = new d3(looper);
    }

    @Override // com.baidu.ar.t5
    public String getName() {
        return "DetectorGroup";
    }

    @Override // com.baidu.ar.t5
    public synchronized void release() {
        try {
            List<t5> list = this.f2191a;
            if (list != null) {
                Iterator<t5> it = list.iterator();
                while (it.hasNext()) {
                    it.next().release();
                }
                this.f2191a.clear();
                this.f2191a = null;
            }
            d3 d3Var = this.f2193c;
            if (d3Var != null) {
                d3Var.c();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.baidu.ar.t5
    public void a(e3 e3Var) {
        this.f2194d = e3Var;
        this.f2193c.a(this.f2191a, new a());
    }

    public void b(t5 t5Var) {
        List<t5> list = this.f2192b;
        if (list == null || !list.contains(t5Var)) {
            List<t5> list2 = this.f2191a;
            if (list2 == null || !list2.contains(t5Var)) {
                return;
            } else {
                this.f2191a.remove(t5Var);
            }
        } else {
            this.f2192b.remove(t5Var);
            h.a("DetectorGroup", "removeDetector detector = " + t5Var.getName());
        }
        t5Var.release();
    }

    public void c(t5 t5Var) {
        if (t5Var != null) {
            List<t5> list = this.f2192b;
            if (list != null) {
                list.remove(t5Var);
            }
            List<t5> list2 = this.f2191a;
            if (list2 != null) {
                list2.remove(t5Var);
            }
            d3 d3Var = this.f2193c;
            if (d3Var != null) {
                d3Var.c(new kb(t5Var.getName(), true));
            }
        }
    }

    public void a(t5 t5Var, e3 e3Var) {
        if (t5Var != null) {
            this.f2192b.add(t5Var);
            h.a("DetectorGroup", "addDetector detector = " + t5Var.getName());
            a(t5Var, e3Var, false);
        }
    }

    public void b(t5 t5Var, e3 e3Var) {
        if (t5Var != null) {
            this.f2192b.add(t5Var);
            a(t5Var, e3Var, true);
        }
    }

    public final void a(t5 t5Var, e3 e3Var, boolean z7) {
        h.a("DetectorGroup", "setupDetctor detector.getName() = " + t5Var.getName());
        b bVar = new b(e3Var, z7);
        if (!z7) {
            t5Var.a(bVar);
        } else if (t5Var instanceof o4) {
            ((o4) t5Var).d(bVar);
            bVar.a(new kb(t5Var.getName(), true));
        }
    }

    public boolean b() {
        List<t5> list;
        List<t5> list2 = this.f2191a;
        return (list2 == null || list2.size() <= 0) && ((list = this.f2192b) == null || list.size() <= 0);
    }

    public boolean a() {
        boolean z7;
        List<t5> list = this.f2191a;
        if (list != null && list.size() > 0) {
            for (t5 t5Var : this.f2191a) {
                if (t5Var == null || !(t5Var instanceof o4) || !((o4) t5Var).c()) {
                    z7 = false;
                    break;
                }
            }
        }
        z7 = true;
        o4.b(z7);
        return z7;
    }

    public final boolean a(b3 b3Var) {
        d3 d3Var = this.f2193c;
        return d3Var != null && d3Var.d(b3Var);
    }

    public final boolean a(b3 b3Var, t5 t5Var) {
        return b3Var.a() != null && b3Var.a().equals(t5Var.getName());
    }

    public boolean a(t5 t5Var) {
        if (t5Var == null) {
            return false;
        }
        List<t5> list = this.f2191a;
        if (list != null && list.contains(t5Var)) {
            return true;
        }
        List<t5> list2 = this.f2192b;
        return list2 != null && list2.contains(t5Var);
    }
}
