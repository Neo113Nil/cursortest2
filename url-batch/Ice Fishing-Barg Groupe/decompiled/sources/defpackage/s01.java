package defpackage;

import android.os.Looper;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class s01 {
    public static final q01 Companion = new q01();
    public final l92 OPXfSBeufaJ8;
    public final boolean PxuCJdSBwIXG;
    public final ArrayList RAsUl2FVSrh6;
    public final as2 TSizfFm2Yiuu;
    public int Y1f8riQaR6yg;
    public boolean a92UlCVFR9N8;
    public boolean e9gEMXR7LXtO;
    public m9 lS5Rgt96tfkO;
    public f01 rtx2ld2ELZv4;

    public s01(o01 o01Var, boolean z) {
        new AtomicReference(null);
        this.PxuCJdSBwIXG = z;
        this.lS5Rgt96tfkO = new m9(9);
        this.TSizfFm2Yiuu = new as2(o01Var);
        this.RAsUl2FVSrh6 = new ArrayList();
        f01 f01Var = f01.OPXfSBeufaJ8;
        this.rtx2ld2ELZv4 = f01Var;
        this.OPXfSBeufaJ8 = hq0.RAsUl2FVSrh6(f01Var);
    }

    public final void PxuCJdSBwIXG(n01 n01Var) {
        l01 wwVar;
        r01 r01Var;
        o01 o01Var;
        n01Var.getClass();
        TSizfFm2Yiuu("addObserver");
        f01 f01Var = this.rtx2ld2ELZv4;
        f01 f01Var2 = f01.rtx2ld2ELZv4;
        if (f01Var != f01Var2) {
            f01Var2 = f01.OPXfSBeufaJ8;
        }
        r01 r01Var2 = new r01();
        r01Var2.PxuCJdSBwIXG = f01Var2;
        HashMap hashMap = x01.PxuCJdSBwIXG;
        boolean z = n01Var instanceof l01;
        boolean z2 = n01Var instanceof uw;
        int i = 1;
        if (z && z2) {
            wwVar = new ww((uw) n01Var, (l01) n01Var);
        } else if (z2) {
            wwVar = new ww((uw) n01Var, (l01) null);
        } else if (z) {
            wwVar = (l01) n01Var;
        } else {
            Class<?> cls = n01Var.getClass();
            if (x01.lS5Rgt96tfkO(cls) == 2) {
                Object obj = x01.lS5Rgt96tfkO.get(cls);
                obj.getClass();
                List list = (List) obj;
                if (list.size() == 1) {
                    x01.PxuCJdSBwIXG((Constructor) list.get(0), n01Var);
                    throw null;
                }
                int size = list.size();
                hg0[] hg0VarArr = new hg0[size];
                if (size > 0) {
                    x01.PxuCJdSBwIXG((Constructor) list.get(0), n01Var);
                    throw null;
                }
                wwVar = new bn(i, hg0VarArr);
            } else {
                wwVar = new ww(n01Var);
            }
        }
        r01Var2.lS5Rgt96tfkO = wwVar;
        m9 m9Var = this.lS5Rgt96tfkO;
        m9Var.getClass();
        v81 v81Var = (v81) m9Var.OPXfSBeufaJ8;
        s70 s70Var = (s70) v81Var.RAsUl2FVSrh6(n01Var);
        if (s70Var != null) {
            r01Var = s70Var.OPXfSBeufaJ8;
        } else {
            s70 s70Var2 = new s70(n01Var, r01Var2);
            v81Var.cpQdD2nAriOS(n01Var, s70Var2);
            s70 s70Var3 = (s70) m9Var.dgRBjINgWbAK;
            if (s70Var3 == null) {
                m9Var.wdg6QnbFHrFF = s70Var2;
                m9Var.dgRBjINgWbAK = s70Var2;
            } else {
                s70Var3.wdg6QnbFHrFF = s70Var2;
                s70Var2.dgRBjINgWbAK = s70Var3;
                m9Var.dgRBjINgWbAK = s70Var2;
            }
            r01Var = null;
        }
        if (r01Var == null && (o01Var = (o01) this.TSizfFm2Yiuu.PxuCJdSBwIXG.get()) != null) {
            boolean z3 = this.Y1f8riQaR6yg != 0 || this.e9gEMXR7LXtO;
            f01 lS5Rgt96tfkO = lS5Rgt96tfkO(n01Var);
            this.Y1f8riQaR6yg++;
            while (r01Var2.PxuCJdSBwIXG.compareTo(lS5Rgt96tfkO) < 0) {
                m9 m9Var2 = this.lS5Rgt96tfkO;
                m9Var2.getClass();
                if (!((v81) m9Var2.OPXfSBeufaJ8).TSizfFm2Yiuu(n01Var)) {
                    break;
                }
                f01 f01Var3 = r01Var2.PxuCJdSBwIXG;
                ArrayList arrayList = this.RAsUl2FVSrh6;
                arrayList.add(f01Var3);
                c01 c01Var = e01.Companion;
                f01 f01Var4 = r01Var2.PxuCJdSBwIXG;
                c01Var.getClass();
                f01Var4.getClass();
                int ordinal = f01Var4.ordinal();
                e01 e01Var = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : e01.ON_RESUME : e01.ON_START : e01.ON_CREATE;
                if (e01Var == null) {
                    u9.S2OOm9zPNm0h(r01Var2.PxuCJdSBwIXG, "no event up from ");
                    return;
                } else {
                    r01Var2.PxuCJdSBwIXG(o01Var, e01Var);
                    el.X1HMmH2Ks65g(arrayList);
                    lS5Rgt96tfkO = lS5Rgt96tfkO(n01Var);
                }
            }
            if (!z3) {
                RAsUl2FVSrh6();
            }
            this.Y1f8riQaR6yg--;
        }
    }

    public final void RAsUl2FVSrh6() {
        Object obj = this.TSizfFm2Yiuu.PxuCJdSBwIXG.get();
        if (obj == null) {
            u9.rtx2ld2ELZv4("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        final o01 o01Var = (o01) obj;
        while (true) {
            m9 m9Var = this.lS5Rgt96tfkO;
            final int i = 0;
            if (((v81) m9Var.OPXfSBeufaJ8).e9gEMXR7LXtO == 0) {
                break;
            }
            s70 s70Var = (s70) m9Var.wdg6QnbFHrFF;
            if (s70Var == null) {
                rc1.RAsUl2FVSrh6("Collection is empty.");
                return;
            }
            f01 f01Var = s70Var.OPXfSBeufaJ8.PxuCJdSBwIXG;
            s70 s70Var2 = (s70) m9Var.dgRBjINgWbAK;
            if (s70Var2 == null) {
                rc1.RAsUl2FVSrh6("Collection is empty.");
                return;
            }
            f01 f01Var2 = s70Var2.OPXfSBeufaJ8.PxuCJdSBwIXG;
            if (f01Var == f01Var2 && this.rtx2ld2ELZv4 == f01Var2) {
                break;
            }
            this.a92UlCVFR9N8 = false;
            f01 f01Var3 = this.rtx2ld2ELZv4;
            if (s70Var == null) {
                rc1.RAsUl2FVSrh6("Collection is empty.");
                return;
            }
            if (f01Var3.compareTo(f01Var) < 0) {
                m9 m9Var2 = this.lS5Rgt96tfkO;
                le0 le0Var = new le0(this) { // from class: p01
                    public final /* synthetic */ s01 OPXfSBeufaJ8;

                    {
                        this.OPXfSBeufaJ8 = this;
                    }

                    @Override // defpackage.le0
                    public final Object OPXfSBeufaJ8(Object obj2) {
                        int i2 = i;
                        no2 no2Var = no2.PxuCJdSBwIXG;
                        o01 o01Var2 = o01Var;
                        s01 s01Var = this.OPXfSBeufaJ8;
                        Map.Entry entry = (Map.Entry) obj2;
                        switch (i2) {
                            case 0:
                                entry.getClass();
                                n01 n01Var = (n01) entry.getKey();
                                r01 r01Var = (r01) entry.getValue();
                                while (true) {
                                    f01 f01Var4 = r01Var.PxuCJdSBwIXG;
                                    f01 f01Var5 = s01Var.rtx2ld2ELZv4;
                                    ArrayList arrayList = s01Var.RAsUl2FVSrh6;
                                    if (f01Var4.compareTo(f01Var5) > 0 && !s01Var.a92UlCVFR9N8) {
                                        m9 m9Var3 = s01Var.lS5Rgt96tfkO;
                                        m9Var3.getClass();
                                        n01Var.getClass();
                                        if (!((v81) m9Var3.OPXfSBeufaJ8).TSizfFm2Yiuu(n01Var)) {
                                            break;
                                        } else {
                                            c01 c01Var = e01.Companion;
                                            f01 f01Var6 = r01Var.PxuCJdSBwIXG;
                                            c01Var.getClass();
                                            f01Var6.getClass();
                                            int ordinal = f01Var6.ordinal();
                                            e01 e01Var = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : e01.ON_PAUSE : e01.ON_STOP : e01.ON_DESTROY;
                                            if (e01Var == null) {
                                                rc1.a92UlCVFR9N8(r01Var.PxuCJdSBwIXG, "no event down from ");
                                                break;
                                            } else {
                                                arrayList.add(e01Var.PxuCJdSBwIXG());
                                                r01Var.PxuCJdSBwIXG(o01Var2, e01Var);
                                                el.X1HMmH2Ks65g(arrayList);
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                entry.getClass();
                                n01 n01Var2 = (n01) entry.getKey();
                                r01 r01Var2 = (r01) entry.getValue();
                                while (true) {
                                    f01 f01Var7 = r01Var2.PxuCJdSBwIXG;
                                    f01 f01Var8 = s01Var.rtx2ld2ELZv4;
                                    ArrayList arrayList2 = s01Var.RAsUl2FVSrh6;
                                    if (f01Var7.compareTo(f01Var8) < 0 && !s01Var.a92UlCVFR9N8) {
                                        m9 m9Var4 = s01Var.lS5Rgt96tfkO;
                                        m9Var4.getClass();
                                        n01Var2.getClass();
                                        if (!((v81) m9Var4.OPXfSBeufaJ8).TSizfFm2Yiuu(n01Var2)) {
                                            break;
                                        } else {
                                            arrayList2.add(r01Var2.PxuCJdSBwIXG);
                                            c01 c01Var2 = e01.Companion;
                                            f01 f01Var9 = r01Var2.PxuCJdSBwIXG;
                                            c01Var2.getClass();
                                            f01Var9.getClass();
                                            int ordinal2 = f01Var9.ordinal();
                                            e01 e01Var2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : e01.ON_RESUME : e01.ON_START : e01.ON_CREATE;
                                            if (e01Var2 == null) {
                                                rc1.a92UlCVFR9N8(r01Var2.PxuCJdSBwIXG, "no event up from ");
                                                break;
                                            } else {
                                                r01Var2.PxuCJdSBwIXG(o01Var2, e01Var2);
                                                el.X1HMmH2Ks65g(arrayList2);
                                            }
                                        }
                                    }
                                }
                                break;
                        }
                        return null;
                    }
                };
                m9Var2.getClass();
                for (s70 s70Var3 = (s70) m9Var2.dgRBjINgWbAK; s70Var3 != null; s70Var3 = s70Var3.dgRBjINgWbAK) {
                    if (!s70Var3.x50lh2ztY7Y5) {
                        le0Var.OPXfSBeufaJ8(s70Var3);
                    }
                }
            }
            s70 s70Var4 = (s70) this.lS5Rgt96tfkO.dgRBjINgWbAK;
            if (!this.a92UlCVFR9N8 && s70Var4 != null && this.rtx2ld2ELZv4.compareTo(s70Var4.OPXfSBeufaJ8.PxuCJdSBwIXG) > 0) {
                m9 m9Var3 = this.lS5Rgt96tfkO;
                final int i2 = 1;
                le0 le0Var2 = new le0(this) { // from class: p01
                    public final /* synthetic */ s01 OPXfSBeufaJ8;

                    {
                        this.OPXfSBeufaJ8 = this;
                    }

                    @Override // defpackage.le0
                    public final Object OPXfSBeufaJ8(Object obj2) {
                        int i22 = i2;
                        no2 no2Var = no2.PxuCJdSBwIXG;
                        o01 o01Var2 = o01Var;
                        s01 s01Var = this.OPXfSBeufaJ8;
                        Map.Entry entry = (Map.Entry) obj2;
                        switch (i22) {
                            case 0:
                                entry.getClass();
                                n01 n01Var = (n01) entry.getKey();
                                r01 r01Var = (r01) entry.getValue();
                                while (true) {
                                    f01 f01Var4 = r01Var.PxuCJdSBwIXG;
                                    f01 f01Var5 = s01Var.rtx2ld2ELZv4;
                                    ArrayList arrayList = s01Var.RAsUl2FVSrh6;
                                    if (f01Var4.compareTo(f01Var5) > 0 && !s01Var.a92UlCVFR9N8) {
                                        m9 m9Var32 = s01Var.lS5Rgt96tfkO;
                                        m9Var32.getClass();
                                        n01Var.getClass();
                                        if (!((v81) m9Var32.OPXfSBeufaJ8).TSizfFm2Yiuu(n01Var)) {
                                            break;
                                        } else {
                                            c01 c01Var = e01.Companion;
                                            f01 f01Var6 = r01Var.PxuCJdSBwIXG;
                                            c01Var.getClass();
                                            f01Var6.getClass();
                                            int ordinal = f01Var6.ordinal();
                                            e01 e01Var = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : e01.ON_PAUSE : e01.ON_STOP : e01.ON_DESTROY;
                                            if (e01Var == null) {
                                                rc1.a92UlCVFR9N8(r01Var.PxuCJdSBwIXG, "no event down from ");
                                                break;
                                            } else {
                                                arrayList.add(e01Var.PxuCJdSBwIXG());
                                                r01Var.PxuCJdSBwIXG(o01Var2, e01Var);
                                                el.X1HMmH2Ks65g(arrayList);
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                entry.getClass();
                                n01 n01Var2 = (n01) entry.getKey();
                                r01 r01Var2 = (r01) entry.getValue();
                                while (true) {
                                    f01 f01Var7 = r01Var2.PxuCJdSBwIXG;
                                    f01 f01Var8 = s01Var.rtx2ld2ELZv4;
                                    ArrayList arrayList2 = s01Var.RAsUl2FVSrh6;
                                    if (f01Var7.compareTo(f01Var8) < 0 && !s01Var.a92UlCVFR9N8) {
                                        m9 m9Var4 = s01Var.lS5Rgt96tfkO;
                                        m9Var4.getClass();
                                        n01Var2.getClass();
                                        if (!((v81) m9Var4.OPXfSBeufaJ8).TSizfFm2Yiuu(n01Var2)) {
                                            break;
                                        } else {
                                            arrayList2.add(r01Var2.PxuCJdSBwIXG);
                                            c01 c01Var2 = e01.Companion;
                                            f01 f01Var9 = r01Var2.PxuCJdSBwIXG;
                                            c01Var2.getClass();
                                            f01Var9.getClass();
                                            int ordinal2 = f01Var9.ordinal();
                                            e01 e01Var2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : e01.ON_RESUME : e01.ON_START : e01.ON_CREATE;
                                            if (e01Var2 == null) {
                                                rc1.a92UlCVFR9N8(r01Var2.PxuCJdSBwIXG, "no event up from ");
                                                break;
                                            } else {
                                                r01Var2.PxuCJdSBwIXG(o01Var2, e01Var2);
                                                el.X1HMmH2Ks65g(arrayList2);
                                            }
                                        }
                                    }
                                }
                                break;
                        }
                        return null;
                    }
                };
                m9Var3.getClass();
                for (s70 s70Var5 = (s70) m9Var3.wdg6QnbFHrFF; s70Var5 != null; s70Var5 = s70Var5.wdg6QnbFHrFF) {
                    if (!s70Var5.x50lh2ztY7Y5) {
                        le0Var2.OPXfSBeufaJ8(s70Var5);
                    }
                }
            }
        }
        this.a92UlCVFR9N8 = false;
        this.OPXfSBeufaJ8.rtx2ld2ELZv4(this.rtx2ld2ELZv4);
    }

    public final void TSizfFm2Yiuu(String str) {
        if (this.PxuCJdSBwIXG) {
            t9.bEKsvqmvPh2y().PxuCJdSBwIXG.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            rc1.e9gEMXR7LXtO(o0.x50lh2ztY7Y5("Method ", str, " must be called on the main thread"));
        }
    }

    public final void Y1f8riQaR6yg(e01 e01Var) {
        e01Var.getClass();
        TSizfFm2Yiuu("handleLifecycleEvent");
        e9gEMXR7LXtO(e01Var.PxuCJdSBwIXG());
    }

    public final void a92UlCVFR9N8(n01 n01Var) {
        n01Var.getClass();
        TSizfFm2Yiuu("removeObserver");
        m9 m9Var = this.lS5Rgt96tfkO;
        m9Var.getClass();
        s70 s70Var = (s70) ((v81) m9Var.OPXfSBeufaJ8).dgRBjINgWbAK(n01Var);
        if (s70Var == null) {
            return;
        }
        s70 s70Var2 = s70Var.dgRBjINgWbAK;
        s70 s70Var3 = s70Var.wdg6QnbFHrFF;
        if (s70Var2 == null) {
            m9Var.wdg6QnbFHrFF = s70Var3;
        } else {
            s70Var2.wdg6QnbFHrFF = s70Var3;
        }
        s70 s70Var4 = s70Var.wdg6QnbFHrFF;
        if (s70Var4 == null) {
            m9Var.dgRBjINgWbAK = s70Var2;
        } else {
            s70Var4.dgRBjINgWbAK = s70Var2;
        }
        s70Var.x50lh2ztY7Y5 = true;
    }

    public final void e9gEMXR7LXtO(f01 f01Var) {
        if (this.rtx2ld2ELZv4 == f01Var) {
            return;
        }
        o01 o01Var = (o01) this.TSizfFm2Yiuu.PxuCJdSBwIXG.get();
        f01 f01Var2 = this.rtx2ld2ELZv4;
        f01 f01Var3 = f01.OPXfSBeufaJ8;
        f01 f01Var4 = f01.rtx2ld2ELZv4;
        if (f01Var2 == f01Var3 && f01Var == f01Var4) {
            throw new IllegalStateException(("State must be at least '" + f01.wdg6QnbFHrFF + "' to be moved to '" + f01Var + "' in component " + o01Var).toString());
        }
        if (f01Var2 == f01Var4 && f01Var2 != f01Var) {
            throw new IllegalStateException(("State is '" + f01Var4 + "' and cannot be moved to `" + f01Var + "` in component " + o01Var).toString());
        }
        this.rtx2ld2ELZv4 = f01Var;
        if (this.e9gEMXR7LXtO || this.Y1f8riQaR6yg != 0) {
            this.a92UlCVFR9N8 = true;
            return;
        }
        this.e9gEMXR7LXtO = true;
        RAsUl2FVSrh6();
        this.e9gEMXR7LXtO = false;
        if (this.rtx2ld2ELZv4 == f01Var4) {
            this.lS5Rgt96tfkO = new m9(9);
        }
    }

    public final f01 lS5Rgt96tfkO(n01 n01Var) {
        m9 m9Var = this.lS5Rgt96tfkO;
        m9Var.getClass();
        n01Var.getClass();
        s70 s70Var = (s70) ((v81) m9Var.OPXfSBeufaJ8).RAsUl2FVSrh6(n01Var);
        s70 s70Var2 = s70Var != null ? s70Var.dgRBjINgWbAK : null;
        f01 f01Var = s70Var2 != null ? s70Var2.OPXfSBeufaJ8.PxuCJdSBwIXG : null;
        ArrayList arrayList = this.RAsUl2FVSrh6;
        f01 f01Var2 = arrayList.isEmpty() ? null : (f01) arrayList.get(arrayList.size() - 1);
        f01 f01Var3 = this.rtx2ld2ELZv4;
        if (f01Var == null || f01Var.compareTo(f01Var3) >= 0) {
            f01Var = f01Var3;
        }
        return (f01Var2 == null || f01Var2.compareTo(f01Var) >= 0) ? f01Var : f01Var2;
    }
}
