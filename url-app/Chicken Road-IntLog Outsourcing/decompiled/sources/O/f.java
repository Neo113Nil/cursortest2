package O;

import androidx.datastore.preferences.protobuf.AbstractC0224t;
import androidx.datastore.preferences.protobuf.AbstractC0226v;
import androidx.datastore.preferences.protobuf.C0214i;
import androidx.datastore.preferences.protobuf.C0215j;
import androidx.datastore.preferences.protobuf.C0219n;
import androidx.datastore.preferences.protobuf.C0225u;
import androidx.datastore.preferences.protobuf.C0230z;
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
public final class f extends AbstractC0226v {
    private static final f DEFAULT_INSTANCE;
    private static volatile Q PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private H preferences_ = H.f4367b;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC0226v.l(f.class, fVar);
    }

    public static H n(f fVar) {
        H h3 = fVar.preferences_;
        if (!h3.f4368a) {
            fVar.preferences_ = h3.c();
        }
        return fVar.preferences_;
    }

    public static d p() {
        return (d) ((AbstractC0224t) DEFAULT_INSTANCE.e(5));
    }

    public static f q(FileInputStream fileInputStream) {
        f fVar = DEFAULT_INSTANCE;
        C0214i c0214i = new C0214i(fileInputStream);
        C0219n a6 = C0219n.a();
        AbstractC0226v k3 = fVar.k();
        try {
            S s2 = S.f4392c;
            s2.getClass();
            V a7 = s2.a(k3.getClass());
            C0215j c0215j = (C0215j) c0214i.f2677b;
            if (c0215j == null) {
                c0215j = new C0215j(c0214i);
            }
            a7.g(k3, c0215j, a6);
            a7.d(k3);
            if (AbstractC0226v.h(k3, true)) {
                return (f) k3;
            }
            throw new C0230z(new b0().getMessage());
        } catch (b0 e3) {
            throw new C0230z(e3.getMessage());
        } catch (C0230z e6) {
            if (e6.f4510a) {
                throw new C0230z(e6.getMessage(), e6);
            }
            throw e6;
        } catch (IOException e7) {
            if (e7.getCause() instanceof C0230z) {
                throw ((C0230z) e7.getCause());
            }
            throw new C0230z(e7.getMessage(), e7);
        } catch (RuntimeException e8) {
            if (e8.getCause() instanceof C0230z) {
                throw ((C0230z) e8.getCause());
            }
            throw e8;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0226v
    public final Object e(int i2) {
        switch (j.b(i2)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new U(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", e.f2202a});
            case 3:
                return new f();
            case 4:
                return new d(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q q5 = PARSER;
                if (q5 == null) {
                    synchronized (f.class) {
                        try {
                            q5 = PARSER;
                            if (q5 == null) {
                                q5 = new C0225u();
                                PARSER = q5;
                            }
                        } finally {
                        }
                    }
                }
                return q5;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map o() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
