package a4;

import a2.r;
import androidx.datastore.preferences.protobuf.c1;
import androidx.datastore.preferences.protobuf.i0;
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.t;
import androidx.datastore.preferences.protobuf.t0;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.v0;
import androidx.datastore.preferences.protobuf.w0;
import androidx.datastore.preferences.protobuf.z;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e extends v {
    private static final e DEFAULT_INSTANCE;
    private static volatile r0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private i0 preferences_ = i0.f561e;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        v.j(e.class, eVar);
    }

    public static i0 l(e eVar) {
        i0 i0Var = eVar.preferences_;
        if (!i0Var.f562d) {
            eVar.preferences_ = i0Var.b();
        }
        return eVar.preferences_;
    }

    public static c n() {
        return (c) ((t) DEFAULT_INSTANCE.c(5));
    }

    public static e o(FileInputStream fileInputStream) {
        e eVar = DEFAULT_INSTANCE;
        androidx.datastore.preferences.protobuf.h hVar = new androidx.datastore.preferences.protobuf.h(fileInputStream);
        n a9 = n.a();
        v i3 = eVar.i();
        try {
            t0 t0Var = t0.f636c;
            t0Var.getClass();
            w0 a10 = t0Var.a(i3.getClass());
            androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) hVar.f560e;
            if (jVar == null) {
                jVar = new androidx.datastore.preferences.protobuf.j(hVar);
            }
            a10.g(i3, jVar, a9);
            a10.d(i3);
            if (v.f(i3, true)) {
                return (e) i3;
            }
            throw new z(new c1().getMessage());
        } catch (c1 e2) {
            throw new z(e2.getMessage());
        } catch (z e9) {
            if (e9.f658d) {
                throw new z(e9.getMessage(), e9);
            }
            throw e9;
        } catch (IOException e10) {
            if (e10.getCause() instanceof z) {
                throw ((z) e10.getCause());
            }
            throw new z(e10.getMessage(), e10);
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof z) {
                throw ((z) e11.getCause());
            }
            throw e11;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v
    public final Object c(int i3) {
        r0 r0Var;
        switch (i.b(i3)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new v0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", d.f281a});
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                return new e();
            case j.LONG_FIELD_NUMBER /* 4 */:
                return new c(DEFAULT_INSTANCE);
            case j.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                r0 r0Var2 = PARSER;
                if (r0Var2 != null) {
                    return r0Var2;
                }
                synchronized (e.class) {
                    try {
                        r0Var = PARSER;
                        if (r0Var == null) {
                            r0Var = new u();
                            PARSER = r0Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return r0Var;
            default:
                r.a();
                return null;
        }
    }

    public final Map m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
