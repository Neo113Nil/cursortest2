package a4;

import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.d1;
import androidx.datastore.preferences.protobuf.j0;
import androidx.datastore.preferences.protobuf.k;
import androidx.datastore.preferences.protobuf.o;
import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.u0;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.w0;
import androidx.datastore.preferences.protobuf.x0;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e extends w {
    private static final e DEFAULT_INSTANCE;
    private static volatile s0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private j0 preferences_ = j0.f708e;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        w.j(e.class, eVar);
    }

    public static j0 l(e eVar) {
        j0 j0Var = eVar.preferences_;
        if (!j0Var.f709d) {
            eVar.preferences_ = j0Var.b();
        }
        return eVar.preferences_;
    }

    public static c n() {
        return (c) ((u) DEFAULT_INSTANCE.c(5));
    }

    public static e o(FileInputStream fileInputStream) {
        e eVar = DEFAULT_INSTANCE;
        androidx.datastore.preferences.protobuf.i iVar = new androidx.datastore.preferences.protobuf.i(fileInputStream);
        o a8 = o.a();
        w i = eVar.i();
        try {
            u0 u0Var = u0.f784c;
            u0Var.getClass();
            x0 a9 = u0Var.a(i.getClass());
            k kVar = (k) iVar.f707e;
            if (kVar == null) {
                kVar = new k(iVar);
            }
            a9.g(i, kVar, a8);
            a9.d(i);
            if (w.f(i, true)) {
                return (e) i;
            }
            throw new a0(new d1().getMessage());
        } catch (a0 e8) {
            if (e8.f645d) {
                throw new a0(e8.getMessage(), e8);
            }
            throw e8;
        } catch (d1 e9) {
            throw new a0(e9.getMessage());
        } catch (IOException e10) {
            if (e10.getCause() instanceof a0) {
                throw ((a0) e10.getCause());
            }
            throw new a0(e10.getMessage(), e10);
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof a0) {
                throw ((a0) e11.getCause());
            }
            throw e11;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.w
    public final Object c(int i) {
        s0 s0Var;
        switch (w2.e.a(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                return new w0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", d.f231a});
            case i.INTEGER_FIELD_NUMBER /* 3 */:
                return new e();
            case i.LONG_FIELD_NUMBER /* 4 */:
                return new c(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                s0 s0Var2 = PARSER;
                if (s0Var2 != null) {
                    return s0Var2;
                }
                synchronized (e.class) {
                    try {
                        s0Var = PARSER;
                        if (s0Var == null) {
                            s0Var = new v();
                            PARSER = s0Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return s0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
