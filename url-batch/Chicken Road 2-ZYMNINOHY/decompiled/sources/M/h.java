package M;

import androidx.datastore.preferences.protobuf.AbstractC0169b;
import androidx.datastore.preferences.protobuf.AbstractC0187u;
import androidx.datastore.preferences.protobuf.AbstractC0189w;
import androidx.datastore.preferences.protobuf.AbstractC0191y;
import androidx.datastore.preferences.protobuf.C0188v;
import androidx.datastore.preferences.protobuf.InterfaceC0190x;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.U;
import androidx.datastore.preferences.protobuf.V;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public final class h extends AbstractC0189w {
    private static final h DEFAULT_INSTANCE;
    private static volatile S PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC0190x strings_ = U.f4594d;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        AbstractC0189w.j(h.class, hVar);
    }

    public static void l(h hVar, Set set) {
        InterfaceC0190x interfaceC0190x = hVar.strings_;
        if (!((AbstractC0169b) interfaceC0190x).f4617a) {
            U u4 = (U) interfaceC0190x;
            int i4 = u4.f4596c;
            hVar.strings_ = u4.d(i4 == 0 ? 10 : i4 * 2);
        }
        RandomAccess randomAccess = hVar.strings_;
        Charset charset = AbstractC0191y.f4712a;
        set.getClass();
        if (randomAccess instanceof ArrayList) {
            ((ArrayList) randomAccess).ensureCapacity(set.size() + ((U) randomAccess).f4596c);
        }
        U u5 = (U) randomAccess;
        int i5 = u5.f4596c;
        for (Object obj : set) {
            if (obj == null) {
                String str = "Element at index " + (u5.f4596c - i5) + " is null.";
                for (int i6 = u5.f4596c - 1; i6 >= i5; i6--) {
                    u5.remove(i6);
                }
                throw new NullPointerException(str);
            }
            u5.add(obj);
        }
    }

    public static h m() {
        return DEFAULT_INSTANCE;
    }

    public static g o() {
        return (g) ((AbstractC0187u) DEFAULT_INSTANCE.c(5));
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
                return new V(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new h();
            case 4:
                return new g(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                S s5 = PARSER;
                if (s5 != null) {
                    return s5;
                }
                synchronized (h.class) {
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

    public final InterfaceC0190x n() {
        return this.strings_;
    }
}
