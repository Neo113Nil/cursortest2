package k1;

import androidx.datastore.preferences.protobuf.AbstractC0247b;
import androidx.datastore.preferences.protobuf.AbstractC0265t;
import androidx.datastore.preferences.protobuf.AbstractC0267v;
import androidx.datastore.preferences.protobuf.AbstractC0269x;
import androidx.datastore.preferences.protobuf.C;
import androidx.datastore.preferences.protobuf.C0253g;
import androidx.datastore.preferences.protobuf.C0266u;
import androidx.datastore.preferences.protobuf.InterfaceC0268w;
import androidx.datastore.preferences.protobuf.U;
import androidx.datastore.preferences.protobuf.V;
import androidx.datastore.preferences.protobuf.X;
import androidx.datastore.preferences.protobuf.Y;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import m.AbstractC0625j;

/* loaded from: classes.dex */
public final class g extends AbstractC0267v {
    private static final g DEFAULT_INSTANCE;
    private static volatile U PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC0268w strings_ = X.f5032g;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC0267v.l(g.class, gVar);
    }

    public static void n(g gVar, Iterable iterable) {
        InterfaceC0268w interfaceC0268w = gVar.strings_;
        if (!((AbstractC0247b) interfaceC0268w).f5043d) {
            int size = interfaceC0268w.size();
            gVar.strings_ = interfaceC0268w.f(size == 0 ? 10 : size * 2);
        }
        List list = gVar.strings_;
        Charset charset = AbstractC0269x.f5135a;
        iterable.getClass();
        if (iterable instanceof C) {
            List g3 = ((C) iterable).g();
            C c2 = (C) list;
            int size2 = list.size();
            for (Object obj : g3) {
                if (obj == null) {
                    String str = "Element at index " + (c2.size() - size2) + " is null.";
                    for (int size3 = c2.size() - 1; size3 >= size2; size3--) {
                        c2.remove(size3);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof C0253g) {
                    c2.h((C0253g) obj);
                } else {
                    c2.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof V) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size4 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size4) + " is null.";
                for (int size5 = list.size() - 1; size5 >= size4; size5--) {
                    list.remove(size5);
                }
                throw new NullPointerException(str2);
            }
            list.add(obj2);
        }
    }

    public static g o() {
        return DEFAULT_INSTANCE;
    }

    public static f q() {
        return (f) ((AbstractC0265t) DEFAULT_INSTANCE.e(5));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0267v
    public final Object e(int i3) {
        switch (AbstractC0625j.b(i3)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                return new Y(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case i.INTEGER_FIELD_NUMBER /* 3 */:
                return new g();
            case i.LONG_FIELD_NUMBER /* 4 */:
                return new f(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                U u3 = PARSER;
                if (u3 == null) {
                    synchronized (g.class) {
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

    public final InterfaceC0268w p() {
        return this.strings_;
    }
}
