package j3;

import a0.p;
import androidx.datastore.preferences.protobuf.h1;
import androidx.datastore.preferences.protobuf.k0;
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.t;
import androidx.datastore.preferences.protobuf.t0;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.v0;
import androidx.datastore.preferences.protobuf.x0;
import androidx.datastore.preferences.protobuf.y0;
import androidx.datastore.preferences.protobuf.z;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e extends v {
    private static final e DEFAULT_INSTANCE;
    private static volatile t0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private k0 preferences_ = k0.f852g;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        v.j(e.class, eVar);
    }

    public static k0 l(e eVar) {
        k0 k0Var = eVar.preferences_;
        if (!k0Var.f853f) {
            eVar.preferences_ = k0Var.b();
        }
        return eVar.preferences_;
    }

    public static c n() {
        return (c) ((t) DEFAULT_INSTANCE.c(5));
    }

    public static e o(InputStream inputStream) {
        e eVar = DEFAULT_INSTANCE;
        androidx.datastore.preferences.protobuf.i iVar = new androidx.datastore.preferences.protobuf.i(inputStream);
        n a3 = n.a();
        v i7 = eVar.i();
        try {
            v0 v0Var = v0.f916c;
            v0Var.getClass();
            y0 a9 = v0Var.a(i7.getClass());
            p pVar = iVar.f850b;
            if (pVar == null) {
                pVar = new p(iVar);
            }
            a9.a(i7, pVar, a3);
            a9.e(i7);
            if (v.f(i7, true)) {
                return (e) i7;
            }
            throw new z(new h1().getMessage());
        } catch (h1 e9) {
            throw new z(e9.getMessage());
        } catch (z e10) {
            if (e10.f928f) {
                throw new z(e10.getMessage(), e10);
            }
            throw e10;
        } catch (IOException e11) {
            if (e11.getCause() instanceof z) {
                throw ((z) e11.getCause());
            }
            throw new z(e11.getMessage(), e11);
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof z) {
                throw ((z) e12.getCause());
            }
            throw e12;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v
    public final Object c(int i7) {
        t0 t0Var;
        switch (l.h.d(i7)) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new x0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", d.f4998a});
            case 3:
                return new e();
            case 4:
                return new c(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                t0 t0Var2 = PARSER;
                if (t0Var2 != null) {
                    return t0Var2;
                }
                synchronized (e.class) {
                    try {
                        t0Var = PARSER;
                        if (t0Var == null) {
                            t0Var = new u();
                            PARSER = t0Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return t0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
