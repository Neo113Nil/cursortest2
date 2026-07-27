package i1;

import androidx.datastore.preferences.protobuf.AbstractC0436b;
import androidx.datastore.preferences.protobuf.AbstractC0454t;
import androidx.datastore.preferences.protobuf.AbstractC0456v;
import androidx.datastore.preferences.protobuf.AbstractC0458x;
import androidx.datastore.preferences.protobuf.C;
import androidx.datastore.preferences.protobuf.C0442g;
import androidx.datastore.preferences.protobuf.C0455u;
import androidx.datastore.preferences.protobuf.InterfaceC0457w;
import androidx.datastore.preferences.protobuf.U;
import androidx.datastore.preferences.protobuf.V;
import androidx.datastore.preferences.protobuf.X;
import androidx.datastore.preferences.protobuf.Y;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import l.AbstractC0784j;

/* loaded from: classes.dex */
public final class g extends AbstractC0456v {
    private static final g DEFAULT_INSTANCE;
    private static volatile U PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC0457w strings_ = X.f5306j;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC0456v.l(g.class, gVar);
    }

    public static void n(g gVar, Iterable iterable) {
        InterfaceC0457w interfaceC0457w = gVar.strings_;
        if (!((AbstractC0436b) interfaceC0457w).f5317d) {
            int size = interfaceC0457w.size();
            gVar.strings_ = interfaceC0457w.q(size == 0 ? 10 : size * 2);
        }
        List list = gVar.strings_;
        Charset charset = AbstractC0458x.f5409a;
        iterable.getClass();
        if (iterable instanceof C) {
            List r2 = ((C) iterable).r();
            C c4 = (C) list;
            int size2 = list.size();
            for (Object obj : r2) {
                if (obj == null) {
                    String str = "Element at index " + (c4.size() - size2) + " is null.";
                    for (int size3 = c4.size() - 1; size3 >= size2; size3--) {
                        c4.remove(size3);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof C0442g) {
                    c4.v((C0442g) obj);
                } else {
                    c4.add((String) obj);
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
        return (f) ((AbstractC0454t) DEFAULT_INSTANCE.e(5));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0456v
    public final Object e(int i2) {
        switch (AbstractC0784j.d(i2)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new Y(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new g();
            case 4:
                return new f(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                U u4 = PARSER;
                if (u4 == null) {
                    synchronized (g.class) {
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

    public final InterfaceC0457w p() {
        return this.strings_;
    }
}
