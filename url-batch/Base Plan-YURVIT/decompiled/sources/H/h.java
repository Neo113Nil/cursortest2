package H;

import androidx.datastore.preferences.protobuf.AbstractC0090b;
import androidx.datastore.preferences.protobuf.AbstractC0108u;
import androidx.datastore.preferences.protobuf.AbstractC0110w;
import androidx.datastore.preferences.protobuf.AbstractC0112y;
import androidx.datastore.preferences.protobuf.C0109v;
import androidx.datastore.preferences.protobuf.InterfaceC0111x;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.U;
import androidx.datastore.preferences.protobuf.V;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public final class h extends AbstractC0110w {
    private static final h DEFAULT_INSTANCE;
    private static volatile S PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC0111x strings_ = U.f1486h;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        AbstractC0110w.j(h.class, hVar);
    }

    public static void l(h hVar, Set set) {
        InterfaceC0111x interfaceC0111x = hVar.strings_;
        if (!((AbstractC0090b) interfaceC0111x).f1509e) {
            U u2 = (U) interfaceC0111x;
            int i2 = u2.f1488g;
            hVar.strings_ = u2.c(i2 == 0 ? 10 : i2 * 2);
        }
        RandomAccess randomAccess = hVar.strings_;
        Charset charset = AbstractC0112y.f1602a;
        set.getClass();
        if (randomAccess instanceof ArrayList) {
            ((ArrayList) randomAccess).ensureCapacity(set.size() + ((U) randomAccess).f1488g);
        }
        U u3 = (U) randomAccess;
        int i3 = u3.f1488g;
        for (Object obj : set) {
            if (obj == null) {
                String str = "Element at index " + (u3.f1488g - i3) + " is null.";
                for (int i4 = u3.f1488g - 1; i4 >= i3; i4--) {
                    u3.remove(i4);
                }
                throw new NullPointerException(str);
            }
            u3.add(obj);
        }
    }

    public static h m() {
        return DEFAULT_INSTANCE;
    }

    public static g o() {
        return (g) ((AbstractC0108u) DEFAULT_INSTANCE.c(5));
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
                return new V(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                return new h();
            case k.LONG_FIELD_NUMBER /* 4 */:
                return new g(DEFAULT_INSTANCE);
            case k.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                S s3 = PARSER;
                if (s3 != null) {
                    return s3;
                }
                synchronized (h.class) {
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

    public final InterfaceC0111x n() {
        return this.strings_;
    }
}
