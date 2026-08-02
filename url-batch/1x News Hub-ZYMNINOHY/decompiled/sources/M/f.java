package M;

import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.AbstractC0153u;
import androidx.datastore.preferences.protobuf.AbstractC0155w;
import androidx.datastore.preferences.protobuf.C0142i;
import androidx.datastore.preferences.protobuf.C0144k;
import androidx.datastore.preferences.protobuf.C0148o;
import androidx.datastore.preferences.protobuf.C0154v;
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
public final class f extends AbstractC0155w {
    private static final f DEFAULT_INSTANCE;
    private static volatile S PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private I preferences_ = I.f2230b;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC0155w.j(f.class, fVar);
    }

    public static I l(f fVar) {
        I i3 = fVar.preferences_;
        if (!i3.f2231a) {
            fVar.preferences_ = i3.b();
        }
        return fVar.preferences_;
    }

    public static d n() {
        return (d) ((AbstractC0153u) DEFAULT_INSTANCE.c(5));
    }

    public static f o(FileInputStream fileInputStream) {
        f fVar = DEFAULT_INSTANCE;
        C0142i c0142i = new C0142i(fileInputStream);
        C0148o a3 = C0148o.a();
        AbstractC0155w i3 = fVar.i();
        try {
            T t3 = T.f2253c;
            t3.getClass();
            W a4 = t3.a(i3.getClass());
            C0144k c0144k = c0142i.f2314b;
            if (c0144k == null) {
                c0144k = new C0144k(c0142i);
            }
            a4.g(i3, c0144k, a3);
            a4.d(i3);
            if (AbstractC0155w.f(i3, true)) {
                return (f) i3;
            }
            throw new A(new c0().getMessage());
        } catch (A e3) {
            if (e3.f2210a) {
                throw new A(e3.getMessage(), e3);
            }
            throw e3;
        } catch (c0 e4) {
            throw new A(e4.getMessage());
        } catch (IOException e5) {
            if (e5.getCause() instanceof A) {
                throw ((A) e5.getCause());
            }
            throw new A(e5.getMessage(), e5);
        } catch (RuntimeException e6) {
            if (e6.getCause() instanceof A) {
                throw ((A) e6.getCause());
            }
            throw e6;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0155w
    public final Object c(int i3) {
        S s3;
        switch (j.b(i3)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new V(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", e.f898a});
            case 3:
                return new f();
            case 4:
                return new d(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                S s4 = PARSER;
                if (s4 != null) {
                    return s4;
                }
                synchronized (f.class) {
                    try {
                        s3 = PARSER;
                        if (s3 == null) {
                            s3 = new C0154v();
                            PARSER = s3;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return s3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
