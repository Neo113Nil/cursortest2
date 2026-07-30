package S;

import androidx.datastore.preferences.protobuf.AbstractC0186b;
import androidx.datastore.preferences.protobuf.AbstractC0203t;
import androidx.datastore.preferences.protobuf.AbstractC0205v;
import androidx.datastore.preferences.protobuf.AbstractC0207x;
import androidx.datastore.preferences.protobuf.C0204u;
import androidx.datastore.preferences.protobuf.InterfaceC0206w;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.T;
import androidx.datastore.preferences.protobuf.U;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public final class g extends AbstractC0205v {
    private static final g DEFAULT_INSTANCE;
    private static volatile Q PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC0206w strings_ = T.f3457l;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC0205v.j(g.class, gVar);
    }

    public static void l(g gVar, Set set) {
        InterfaceC0206w interfaceC0206w = gVar.strings_;
        if (!((AbstractC0186b) interfaceC0206w).f3482d) {
            T t6 = (T) interfaceC0206w;
            int i2 = t6.f3459i;
            gVar.strings_ = t6.c(i2 == 0 ? 10 : i2 * 2);
        }
        RandomAccess randomAccess = gVar.strings_;
        Charset charset = AbstractC0207x.f3571a;
        set.getClass();
        if (randomAccess instanceof ArrayList) {
            ((ArrayList) randomAccess).ensureCapacity(set.size() + ((T) randomAccess).f3459i);
        }
        T t7 = (T) randomAccess;
        int i5 = t7.f3459i;
        for (Object obj : set) {
            if (obj == null) {
                String str = "Element at index " + (t7.f3459i - i5) + " is null.";
                for (int i7 = t7.f3459i - 1; i7 >= i5; i7--) {
                    t7.remove(i7);
                }
                throw new NullPointerException(str);
            }
            t7.add(obj);
        }
    }

    public static g m() {
        return DEFAULT_INSTANCE;
    }

    public static f o() {
        return (f) ((AbstractC0203t) DEFAULT_INSTANCE.c(5));
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
                return new U(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new g();
            case 4:
                return new f(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q q7 = PARSER;
                if (q7 != null) {
                    return q7;
                }
                synchronized (g.class) {
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

    public final InterfaceC0206w n() {
        return this.strings_;
    }
}
