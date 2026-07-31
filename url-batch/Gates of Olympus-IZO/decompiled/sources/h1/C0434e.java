package h1;

import J.D;
import androidx.datastore.preferences.protobuf.AbstractC0209t;
import androidx.datastore.preferences.protobuf.AbstractC0211v;
import androidx.datastore.preferences.protobuf.C0199i;
import androidx.datastore.preferences.protobuf.C0204n;
import androidx.datastore.preferences.protobuf.C0210u;
import androidx.datastore.preferences.protobuf.C0215z;
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
import m.AbstractC0600j;

/* renamed from: h1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0434e extends AbstractC0211v {
    private static final C0434e DEFAULT_INSTANCE;
    private static volatile U PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private K preferences_ = K.f3803e;

    static {
        C0434e c0434e = new C0434e();
        DEFAULT_INSTANCE = c0434e;
        AbstractC0211v.l(C0434e.class, c0434e);
    }

    public static K n(C0434e c0434e) {
        K k3 = c0434e.preferences_;
        if (!k3.f3804d) {
            c0434e.preferences_ = k3.b();
        }
        return c0434e.preferences_;
    }

    public static C0432c p() {
        return (C0432c) ((AbstractC0209t) DEFAULT_INSTANCE.e(5));
    }

    public static C0434e q(InputStream inputStream) {
        C0434e c0434e = DEFAULT_INSTANCE;
        C0199i c0199i = new C0199i(inputStream);
        C0204n a3 = C0204n.a();
        AbstractC0211v k3 = c0434e.k();
        try {
            W w3 = W.f3828c;
            w3.getClass();
            Z a4 = w3.a(k3.getClass());
            D d3 = c0199i.f3889b;
            if (d3 == null) {
                d3 = new D(c0199i);
            }
            a4.e(k3, d3, a3);
            a4.h(k3);
            if (AbstractC0211v.h(k3, true)) {
                return (C0434e) k3;
            }
            throw new C0215z(new i0().getMessage());
        } catch (i0 e3) {
            throw new C0215z(e3.getMessage());
        } catch (C0215z e4) {
            if (e4.f3936d) {
                throw new C0215z(e4.getMessage(), e4);
            }
            throw e4;
        } catch (IOException e5) {
            if (e5.getCause() instanceof C0215z) {
                throw ((C0215z) e5.getCause());
            }
            throw new C0215z(e5.getMessage(), e5);
        } catch (RuntimeException e6) {
            if (e6.getCause() instanceof C0215z) {
                throw ((C0215z) e6.getCause());
            }
            throw e6;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0211v
    public final Object e(int i3) {
        switch (AbstractC0600j.a(i3)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                return new Y(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", AbstractC0433d.f5055a});
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0434e();
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                return new C0432c(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                U u3 = PARSER;
                if (u3 == null) {
                    synchronized (C0434e.class) {
                        try {
                            u3 = PARSER;
                            if (u3 == null) {
                                u3 = new C0210u();
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
