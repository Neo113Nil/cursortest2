package M;

import androidx.datastore.preferences.protobuf.AbstractC0135b;
import androidx.datastore.preferences.protobuf.AbstractC0153u;
import androidx.datastore.preferences.protobuf.AbstractC0155w;
import androidx.datastore.preferences.protobuf.AbstractC0157y;
import androidx.datastore.preferences.protobuf.C0154v;
import androidx.datastore.preferences.protobuf.InterfaceC0156x;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.U;
import androidx.datastore.preferences.protobuf.V;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public final class h extends AbstractC0155w {
    private static final h DEFAULT_INSTANCE;
    private static volatile S PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC0156x strings_ = U.f2256d;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        AbstractC0155w.j(h.class, hVar);
    }

    public static void l(h hVar, Set set) {
        InterfaceC0156x interfaceC0156x = hVar.strings_;
        if (!((AbstractC0135b) interfaceC0156x).f2278a) {
            U u3 = (U) interfaceC0156x;
            int i3 = u3.f2258c;
            hVar.strings_ = u3.d(i3 == 0 ? 10 : i3 * 2);
        }
        RandomAccess randomAccess = hVar.strings_;
        Charset charset = AbstractC0157y.f2364a;
        set.getClass();
        if (randomAccess instanceof ArrayList) {
            ((ArrayList) randomAccess).ensureCapacity(set.size() + ((U) randomAccess).f2258c);
        }
        U u4 = (U) randomAccess;
        int i4 = u4.f2258c;
        for (Object obj : set) {
            if (obj == null) {
                String str = "Element at index " + (u4.f2258c - i4) + " is null.";
                for (int i5 = u4.f2258c - 1; i5 >= i4; i5--) {
                    u4.remove(i5);
                }
                throw new NullPointerException(str);
            }
            u4.add(obj);
        }
    }

    public static h m() {
        return DEFAULT_INSTANCE;
    }

    public static g o() {
        return (g) ((AbstractC0153u) DEFAULT_INSTANCE.c(5));
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
                return new V(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new h();
            case 4:
                return new g(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                S s4 = PARSER;
                if (s4 != null) {
                    return s4;
                }
                synchronized (h.class) {
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

    public final InterfaceC0156x n() {
        return this.strings_;
    }
}
