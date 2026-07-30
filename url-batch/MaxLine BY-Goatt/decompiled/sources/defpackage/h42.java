package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class h42 extends vu0 {
    private static final h42 DEFAULT_INSTANCE;
    private static volatile oz1 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private ci1 preferences_ = ci1.n;

    static {
        h42 h42Var = new h42();
        DEFAULT_INSTANCE = h42Var;
        vu0.j(h42.class, h42Var);
    }

    public static ci1 l(h42 h42Var) {
        ci1 ci1Var = h42Var.preferences_;
        if (!ci1Var.m) {
            h42Var.preferences_ = ci1Var.b();
        }
        return h42Var.preferences_;
    }

    public static f42 n() {
        return (f42) ((tu0) DEFAULT_INSTANCE.c(5));
    }

    public static h42 o(FileInputStream fileInputStream) {
        h42 h42Var = DEFAULT_INSTANCE;
        hv hvVar = new hv(fileInputStream);
        wj0 a = wj0.a();
        vu0 i = h42Var.i();
        try {
            q52 q52Var = q52.c;
            q52Var.getClass();
            se2 a2 = q52Var.a(i.getClass());
            gn gnVar = (gn) hvVar.n;
            if (gnVar == null) {
                gnVar = new gn(hvVar);
            }
            a2.e(i, gnVar, a);
            a2.c(i);
            if (vu0.f(i, true)) {
                return (h42) i;
            }
            throw new u41(new a23().getMessage());
        } catch (a23 e) {
            throw new u41(e.getMessage());
        } catch (IOException e2) {
            if (e2.getCause() instanceof u41) {
                throw ((u41) e2.getCause());
            }
            throw new u41(e2.getMessage(), e2);
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof u41) {
                throw ((u41) e3.getCause());
            }
            throw e3;
        } catch (u41 e4) {
            if (e4.m) {
                throw new u41(e4.getMessage(), e4);
            }
            throw e4;
        }
    }

    @Override // defpackage.vu0
    public final Object c(int i) {
        oz1 oz1Var;
        switch (q40.u(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new f62(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", g42.a});
            case 3:
                return new h42();
            case 4:
                return new f42(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                oz1 oz1Var2 = PARSER;
                if (oz1Var2 != null) {
                    return oz1Var2;
                }
                synchronized (h42.class) {
                    try {
                        oz1Var = PARSER;
                        if (oz1Var == null) {
                            oz1Var = new uu0();
                            PARSER = oz1Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return oz1Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
