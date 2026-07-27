package O;

import androidx.datastore.preferences.protobuf.AbstractC0207b;
import androidx.datastore.preferences.protobuf.AbstractC0224t;
import androidx.datastore.preferences.protobuf.AbstractC0226v;
import androidx.datastore.preferences.protobuf.AbstractC0228x;
import androidx.datastore.preferences.protobuf.C0225u;
import androidx.datastore.preferences.protobuf.InterfaceC0227w;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.T;
import androidx.datastore.preferences.protobuf.U;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public final class h extends AbstractC0226v {
    private static final h DEFAULT_INSTANCE;
    private static volatile Q PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC0227w strings_ = T.f4395d;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        AbstractC0226v.l(h.class, hVar);
    }

    public static void n(h hVar, Set set) {
        InterfaceC0227w interfaceC0227w = hVar.strings_;
        if (!((AbstractC0207b) interfaceC0227w).f4419a) {
            T t5 = (T) interfaceC0227w;
            int i2 = t5.f4397c;
            hVar.strings_ = t5.d(i2 == 0 ? 10 : i2 * 2);
        }
        RandomAccess randomAccess = hVar.strings_;
        Charset charset = AbstractC0228x.f4508a;
        set.getClass();
        if (randomAccess instanceof ArrayList) {
            ((ArrayList) randomAccess).ensureCapacity(set.size() + ((T) randomAccess).f4397c);
        }
        T t6 = (T) randomAccess;
        int i3 = t6.f4397c;
        for (Object obj : set) {
            if (obj == null) {
                String str = "Element at index " + (t6.f4397c - i3) + " is null.";
                for (int i6 = t6.f4397c - 1; i6 >= i3; i6--) {
                    t6.remove(i6);
                }
                throw new NullPointerException(str);
            }
            t6.add(obj);
        }
    }

    public static h o() {
        return DEFAULT_INSTANCE;
    }

    public static g q() {
        return (g) ((AbstractC0224t) DEFAULT_INSTANCE.e(5));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0226v
    public final Object e(int i2) {
        switch (j.b(i2)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new U(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new h();
            case 4:
                return new g(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q q5 = PARSER;
                if (q5 == null) {
                    synchronized (h.class) {
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

    public final InterfaceC0227w p() {
        return this.strings_;
    }
}
