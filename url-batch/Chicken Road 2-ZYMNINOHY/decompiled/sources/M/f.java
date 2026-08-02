package M;

import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.AbstractC0187u;
import androidx.datastore.preferences.protobuf.AbstractC0189w;
import androidx.datastore.preferences.protobuf.C0176i;
import androidx.datastore.preferences.protobuf.C0178k;
import androidx.datastore.preferences.protobuf.C0182o;
import androidx.datastore.preferences.protobuf.C0188v;
import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.T;
import androidx.datastore.preferences.protobuf.V;
import androidx.datastore.preferences.protobuf.W;
import androidx.datastore.preferences.protobuf.c0;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class f extends AbstractC0189w {
    private static final f DEFAULT_INSTANCE;
    private static volatile S PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private I preferences_ = I.f4568b;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC0189w.j(f.class, fVar);
    }

    public static I l(f fVar) {
        I i4 = fVar.preferences_;
        if (!i4.f4569a) {
            fVar.preferences_ = i4.b();
        }
        return fVar.preferences_;
    }

    public static d n() {
        return (d) ((AbstractC0187u) DEFAULT_INSTANCE.c(5));
    }

    public static f o(FileInputStream fileInputStream) {
        f fVar = DEFAULT_INSTANCE;
        C0176i c0176i = new C0176i(fileInputStream);
        C0182o a3 = C0182o.a();
        AbstractC0189w i4 = fVar.i();
        try {
            T t4 = T.f4591c;
            t4.getClass();
            W a4 = t4.a(i4.getClass());
            C0178k c0178k = c0176i.f4657b;
            if (c0178k == null) {
                c0178k = new C0178k(c0176i);
            }
            a4.h(i4, c0178k, a3);
            a4.c(i4);
            if (AbstractC0189w.f(i4, true)) {
                return (f) i4;
            }
            throw new A(new c0().getMessage());
        } catch (A e4) {
            if (e4.f4545a) {
                throw new A(e4.getMessage(), e4);
            }
            throw e4;
        } catch (c0 e5) {
            throw new A(e5.getMessage());
        } catch (IOException e6) {
            if (e6.getCause() instanceof A) {
                throw ((A) e6.getCause());
            }
            throw new A(e6.getMessage(), e6);
        } catch (RuntimeException e7) {
            if (e7.getCause() instanceof A) {
                throw ((A) e7.getCause());
            }
            throw e7;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0189w
    public final Object c(int i4) {
        S s4;
        switch (j.b(i4)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new V(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", e.f1691a});
            case 3:
                return new f();
            case 4:
                return new d(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                S s5 = PARSER;
                if (s5 != null) {
                    return s5;
                }
                synchronized (f.class) {
                    try {
                        s4 = PARSER;
                        if (s4 == null) {
                            s4 = new C0188v();
                            PARSER = s4;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return s4;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
