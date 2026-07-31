package k1;

import B.C0014o;
import androidx.datastore.preferences.protobuf.AbstractC0265t;
import androidx.datastore.preferences.protobuf.AbstractC0267v;
import androidx.datastore.preferences.protobuf.C0255i;
import androidx.datastore.preferences.protobuf.C0260n;
import androidx.datastore.preferences.protobuf.C0266u;
import androidx.datastore.preferences.protobuf.C0271z;
import androidx.datastore.preferences.protobuf.K;
import androidx.datastore.preferences.protobuf.U;
import androidx.datastore.preferences.protobuf.W;
import androidx.datastore.preferences.protobuf.Y;
import androidx.datastore.preferences.protobuf.Z;
import androidx.datastore.preferences.protobuf.i0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import m.AbstractC0625j;

/* loaded from: classes.dex */
public final class e extends AbstractC0267v {
    private static final e DEFAULT_INSTANCE;
    private static volatile U PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private K preferences_ = K.f5003e;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        AbstractC0267v.l(e.class, eVar);
    }

    public static K n(e eVar) {
        K k3 = eVar.preferences_;
        if (!k3.f5004d) {
            eVar.preferences_ = k3.b();
        }
        return eVar.preferences_;
    }

    public static C0567c p() {
        return (C0567c) ((AbstractC0265t) DEFAULT_INSTANCE.e(5));
    }

    public static e q(InputStream inputStream) {
        e eVar = DEFAULT_INSTANCE;
        C0255i c0255i = new C0255i(inputStream);
        C0260n a3 = C0260n.a();
        AbstractC0267v k3 = eVar.k();
        try {
            W w2 = W.f5029c;
            w2.getClass();
            Z a4 = w2.a(k3.getClass());
            C0014o c0014o = c0255i.f5090b;
            if (c0014o == null) {
                c0014o = new C0014o(c0255i);
            }
            a4.b(k3, c0014o, a3);
            a4.h(k3);
            if (AbstractC0267v.h(k3, true)) {
                return (e) k3;
            }
            throw new C0271z(new i0().getMessage());
        } catch (i0 e3) {
            throw new C0271z(e3.getMessage());
        } catch (C0271z e4) {
            if (e4.f5137d) {
                throw new C0271z(e4.getMessage(), e4);
            }
            throw e4;
        } catch (IOException e5) {
            if (e5.getCause() instanceof C0271z) {
                throw ((C0271z) e5.getCause());
            }
            throw new C0271z(e5.getMessage(), e5);
        } catch (RuntimeException e6) {
            if (e6.getCause() instanceof C0271z) {
                throw ((C0271z) e6.getCause());
            }
            throw e6;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0267v
    public final Object e(int i3) {
        switch (AbstractC0625j.b(i3)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                return new Y(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", AbstractC0568d.f6418a});
            case i.INTEGER_FIELD_NUMBER /* 3 */:
                return new e();
            case i.LONG_FIELD_NUMBER /* 4 */:
                return new C0567c(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                U u3 = PARSER;
                if (u3 == null) {
                    synchronized (e.class) {
                        try {
                            u3 = PARSER;
                            if (u3 == null) {
                                u3 = new C0266u();
                                PARSER = u3;
                            }
                        } finally {
                        }
                    }
                }
                return u3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map o() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
