package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class my0 extends m40 {
    private static final my0 DEFAULT_INSTANCE;
    private static volatile dv0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private ck0 preferences_ = ck0.e;

    static {
        my0 my0Var = new my0();
        DEFAULT_INSTANCE = my0Var;
        m40.j(my0.class, my0Var);
    }

    public static ck0 l(my0 my0Var) {
        ck0 ck0Var = my0Var.preferences_;
        if (!ck0Var.d) {
            my0Var.preferences_ = ck0Var.b();
        }
        return my0Var.preferences_;
    }

    public static ky0 n() {
        return (ky0) ((k40) DEFAULT_INSTANCE.c(5));
    }

    public static my0 o(FileInputStream fileInputStream) {
        my0 my0Var = DEFAULT_INSTANCE;
        sh shVar = new sh(fileInputStream);
        qw a = qw.a();
        m40 i = my0Var.i();
        try {
            i01 i01Var = i01.c;
            i01Var.getClass();
            u61 a2 = i01Var.a(i.getClass());
            uh uhVar = shVar.b;
            if (uhVar == null) {
                uhVar = new uh(shVar);
            }
            a2.h(i, uhVar, a);
            a2.c(i);
            if (m40.f(i, true)) {
                return (my0) i;
            }
            throw new sa0(new bl1().getMessage());
        } catch (bl1 e) {
            throw new sa0(e.getMessage());
        } catch (sa0 e2) {
            if (e2.d) {
                throw new sa0(e2.getMessage(), e2);
            }
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof sa0) {
                throw ((sa0) e3.getCause());
            }
            throw new sa0(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof sa0) {
                throw ((sa0) e4.getCause());
            }
            throw e4;
        }
    }

    @Override // defpackage.m40
    public final Object c(int i) {
        dv0 dv0Var;
        switch (qy0.v(i)) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new c11(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", ly0.a});
            case 3:
                return new my0();
            case 4:
                return new ky0(DEFAULT_INSTANCE);
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                dv0 dv0Var2 = PARSER;
                if (dv0Var2 != null) {
                    return dv0Var2;
                }
                synchronized (my0.class) {
                    try {
                        dv0Var = PARSER;
                        if (dv0Var == null) {
                            dv0Var = new l40();
                            PARSER = dv0Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return dv0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
