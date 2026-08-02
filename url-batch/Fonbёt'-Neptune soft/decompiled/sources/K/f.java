package K;

import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.AbstractC0157u;
import androidx.datastore.preferences.protobuf.AbstractC0159w;
import androidx.datastore.preferences.protobuf.C0146i;
import androidx.datastore.preferences.protobuf.C0148k;
import androidx.datastore.preferences.protobuf.C0152o;
import androidx.datastore.preferences.protobuf.C0158v;
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
public final class f extends AbstractC0159w {
    private static final f DEFAULT_INSTANCE;
    private static volatile S PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private I preferences_ = I.f1618f;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC0159w.l(f.class, fVar);
    }

    public static I n(f fVar) {
        I i2 = fVar.preferences_;
        if (!i2.f1619e) {
            fVar.preferences_ = i2.b();
        }
        return fVar.preferences_;
    }

    public static d p() {
        return (d) ((AbstractC0157u) DEFAULT_INSTANCE.e(5));
    }

    public static f q(FileInputStream fileInputStream) {
        f fVar = DEFAULT_INSTANCE;
        C0146i c0146i = new C0146i(fileInputStream);
        C0152o a2 = C0152o.a();
        AbstractC0159w k2 = fVar.k();
        try {
            T t2 = T.f1643c;
            t2.getClass();
            W a3 = t2.a(k2.getClass());
            C0148k c0148k = c0146i.f1707b;
            if (c0148k == null) {
                c0148k = new C0148k(c0146i);
            }
            a3.b(k2, c0148k, a2);
            a3.h(k2);
            if (AbstractC0159w.h(k2, true)) {
                return (f) k2;
            }
            throw new A(new c0().getMessage());
        } catch (A e2) {
            if (e2.f1597e) {
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

    @Override // androidx.datastore.preferences.protobuf.AbstractC0159w
    public final Object e(int i2) {
        switch (j.b(i2)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new V(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", e.f753a});
            case 3:
                return new f();
            case k.LONG_FIELD_NUMBER /* 4 */:
                return new d(DEFAULT_INSTANCE);
            case k.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                S s2 = PARSER;
                if (s2 == null) {
                    synchronized (f.class) {
                        try {
                            s2 = PARSER;
                            if (s2 == null) {
                                s2 = new C0158v();
                                PARSER = s2;
                            }
                        } finally {
                        }
                    }
                }
                return s2;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map o() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
