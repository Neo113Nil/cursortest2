package S;

import androidx.datastore.preferences.protobuf.AbstractC0203t;
import androidx.datastore.preferences.protobuf.AbstractC0205v;
import androidx.datastore.preferences.protobuf.C0193i;
import androidx.datastore.preferences.protobuf.C0194j;
import androidx.datastore.preferences.protobuf.C0198n;
import androidx.datastore.preferences.protobuf.C0204u;
import androidx.datastore.preferences.protobuf.C0209z;
import androidx.datastore.preferences.protobuf.H;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.U;
import androidx.datastore.preferences.protobuf.V;
import androidx.datastore.preferences.protobuf.b0;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class e extends AbstractC0205v {
    private static final e DEFAULT_INSTANCE;
    private static volatile Q PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private H preferences_ = H.f3430e;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        AbstractC0205v.j(e.class, eVar);
    }

    public static H l(e eVar) {
        H h7 = eVar.preferences_;
        if (!h7.f3431d) {
            eVar.preferences_ = h7.b();
        }
        return eVar.preferences_;
    }

    public static c n() {
        return (c) ((AbstractC0203t) DEFAULT_INSTANCE.c(5));
    }

    public static e o(FileInputStream fileInputStream) {
        e eVar = DEFAULT_INSTANCE;
        C0193i c0193i = new C0193i(fileInputStream);
        C0198n a7 = C0198n.a();
        AbstractC0205v i2 = eVar.i();
        try {
            S s7 = S.f3454c;
            s7.getClass();
            V a8 = s7.a(i2.getClass());
            C0194j c0194j = (C0194j) c0193i.f216b;
            if (c0194j == null) {
                c0194j = new C0194j(c0193i);
            }
            a8.g(i2, c0194j, a7);
            a8.d(i2);
            if (AbstractC0205v.f(i2, true)) {
                return (e) i2;
            }
            throw new C0209z(new b0().getMessage());
        } catch (b0 e7) {
            throw new C0209z(e7.getMessage());
        } catch (C0209z e8) {
            if (e8.f3573d) {
                throw new C0209z(e8.getMessage(), e8);
            }
            throw e8;
        } catch (IOException e9) {
            if (e9.getCause() instanceof C0209z) {
                throw ((C0209z) e9.getCause());
            }
            throw new C0209z(e9.getMessage(), e9);
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof C0209z) {
                throw ((C0209z) e10.getCause());
            }
            throw e10;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0205v
    public final Object c(int i2) {
        Q q4;
        switch (i.b(i2)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new U(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", d.f2451a});
            case 3:
                return new e();
            case 4:
                return new c(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q q7 = PARSER;
                if (q7 != null) {
                    return q7;
                }
                synchronized (e.class) {
                    try {
                        q4 = PARSER;
                        if (q4 == null) {
                            q4 = new C0204u();
                            PARSER = q4;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return q4;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
