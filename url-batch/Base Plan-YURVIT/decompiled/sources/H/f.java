package H;

import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.AbstractC0108u;
import androidx.datastore.preferences.protobuf.AbstractC0110w;
import androidx.datastore.preferences.protobuf.C0097i;
import androidx.datastore.preferences.protobuf.C0099k;
import androidx.datastore.preferences.protobuf.C0103o;
import androidx.datastore.preferences.protobuf.C0109v;
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
public final class f extends AbstractC0110w {
    private static final f DEFAULT_INSTANCE;
    private static volatile S PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private I preferences_ = I.f1458f;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC0110w.j(f.class, fVar);
    }

    public static I l(f fVar) {
        I i2 = fVar.preferences_;
        if (!i2.f1459e) {
            fVar.preferences_ = i2.b();
        }
        return fVar.preferences_;
    }

    public static d n() {
        return (d) ((AbstractC0108u) DEFAULT_INSTANCE.c(5));
    }

    public static f o(FileInputStream fileInputStream) {
        f fVar = DEFAULT_INSTANCE;
        C0097i c0097i = new C0097i(fileInputStream);
        C0103o a2 = C0103o.a();
        AbstractC0110w i2 = fVar.i();
        try {
            T t = T.f1483c;
            t.getClass();
            W a3 = t.a(i2.getClass());
            C0099k c0099k = c0097i.f1547b;
            if (c0099k == null) {
                c0099k = new C0099k(c0097i);
            }
            a3.g(i2, c0099k, a2);
            a3.d(i2);
            if (AbstractC0110w.f(i2, true)) {
                return (f) i2;
            }
            throw new A(new c0().getMessage());
        } catch (A e2) {
            if (e2.f1435e) {
                throw new A(e2.getMessage(), e2);
            }
            throw e2;
        } catch (c0 e3) {
            throw new A(e3.getMessage());
        } catch (IOException e4) {
            if (e4.getCause() instanceof A) {
                throw ((A) e4.getCause());
            }
            throw new A(e4.getMessage(), e4);
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof A) {
                throw ((A) e5.getCause());
            }
            throw e5;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0110w
    public final Object c(int i2) {
        S s2;
        switch (j.a(i2)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                return new V(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", e.f509a});
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                return new f();
            case k.LONG_FIELD_NUMBER /* 4 */:
                return new d(DEFAULT_INSTANCE);
            case k.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                S s3 = PARSER;
                if (s3 != null) {
                    return s3;
                }
                synchronized (f.class) {
                    try {
                        s2 = PARSER;
                        if (s2 == null) {
                            s2 = new C0109v();
                            PARSER = s2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return s2;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
