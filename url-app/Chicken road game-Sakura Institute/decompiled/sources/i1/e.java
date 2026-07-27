package i1;

import A.C0020p;
import androidx.datastore.preferences.protobuf.AbstractC0445j;
import androidx.datastore.preferences.protobuf.AbstractC0454t;
import androidx.datastore.preferences.protobuf.AbstractC0456v;
import androidx.datastore.preferences.protobuf.AbstractC0458x;
import androidx.datastore.preferences.protobuf.C0443h;
import androidx.datastore.preferences.protobuf.C0444i;
import androidx.datastore.preferences.protobuf.C0449n;
import androidx.datastore.preferences.protobuf.C0455u;
import androidx.datastore.preferences.protobuf.C0460z;
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
import l.AbstractC0784j;

/* loaded from: classes.dex */
public final class e extends AbstractC0456v {
    private static final e DEFAULT_INSTANCE;
    private static volatile U PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private K preferences_ = K.f5277e;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        AbstractC0456v.l(e.class, eVar);
    }

    public static K n(e eVar) {
        K k4 = eVar.preferences_;
        if (!k4.f5278d) {
            eVar.preferences_ = k4.c();
        }
        return eVar.preferences_;
    }

    public static c p() {
        return (c) ((AbstractC0454t) DEFAULT_INSTANCE.e(5));
    }

    public static e q(InputStream inputStream) {
        AbstractC0445j c0444i;
        e eVar = DEFAULT_INSTANCE;
        if (inputStream == null) {
            byte[] bArr = AbstractC0458x.f5410b;
            int length = bArr.length;
            c0444i = new C0443h(bArr, 0, length, false);
            try {
                c0444i.e(length);
            } catch (C0460z e4) {
                throw new IllegalArgumentException(e4);
            }
        } else {
            c0444i = new C0444i(inputStream);
        }
        C0449n a4 = C0449n.a();
        AbstractC0456v k4 = eVar.k();
        try {
            W w4 = W.f5303c;
            w4.getClass();
            Z a5 = w4.a(k4.getClass());
            C0020p c0020p = c0444i.f5364b;
            if (c0020p == null) {
                c0020p = new C0020p(c0444i);
            }
            a5.e(k4, c0020p, a4);
            a5.h(k4);
            if (AbstractC0456v.h(k4, true)) {
                return (e) k4;
            }
            throw new C0460z(new i0().getMessage());
        } catch (i0 e5) {
            throw new C0460z(e5.getMessage());
        } catch (C0460z e6) {
            if (e6.f5411d) {
                throw new C0460z(e6.getMessage(), e6);
            }
            throw e6;
        } catch (IOException e7) {
            if (e7.getCause() instanceof C0460z) {
                throw ((C0460z) e7.getCause());
            }
            throw new C0460z(e7.getMessage(), e7);
        } catch (RuntimeException e8) {
            if (e8.getCause() instanceof C0460z) {
                throw ((C0460z) e8.getCause());
            }
            throw e8;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0456v
    public final Object e(int i2) {
        switch (AbstractC0784j.d(i2)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new Y(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", d.f7007a});
            case 3:
                return new e();
            case 4:
                return new c(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                U u4 = PARSER;
                if (u4 == null) {
                    synchronized (e.class) {
                        try {
                            u4 = PARSER;
                            if (u4 == null) {
                                u4 = new C0455u();
                                PARSER = u4;
                            }
                        } finally {
                        }
                    }
                }
                return u4;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map o() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
