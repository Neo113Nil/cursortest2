package h1;

import androidx.datastore.preferences.protobuf.AbstractC0191b;
import androidx.datastore.preferences.protobuf.AbstractC0209t;
import androidx.datastore.preferences.protobuf.AbstractC0211v;
import androidx.datastore.preferences.protobuf.AbstractC0213x;
import androidx.datastore.preferences.protobuf.C;
import androidx.datastore.preferences.protobuf.C0197g;
import androidx.datastore.preferences.protobuf.C0210u;
import androidx.datastore.preferences.protobuf.InterfaceC0212w;
import androidx.datastore.preferences.protobuf.U;
import androidx.datastore.preferences.protobuf.V;
import androidx.datastore.preferences.protobuf.X;
import androidx.datastore.preferences.protobuf.Y;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import m.AbstractC0600j;

/* renamed from: h1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0436g extends AbstractC0211v {
    private static final C0436g DEFAULT_INSTANCE;
    private static volatile U PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC0212w strings_ = X.f3831g;

    static {
        C0436g c0436g = new C0436g();
        DEFAULT_INSTANCE = c0436g;
        AbstractC0211v.l(C0436g.class, c0436g);
    }

    public static void n(C0436g c0436g, Iterable iterable) {
        InterfaceC0212w interfaceC0212w = c0436g.strings_;
        if (!((AbstractC0191b) interfaceC0212w).f3842d) {
            int size = interfaceC0212w.size();
            c0436g.strings_ = interfaceC0212w.f(size == 0 ? 10 : size * 2);
        }
        List list = c0436g.strings_;
        Charset charset = AbstractC0213x.f3934a;
        iterable.getClass();
        if (iterable instanceof C) {
            List g3 = ((C) iterable).g();
            C c3 = (C) list;
            int size2 = list.size();
            for (Object obj : g3) {
                if (obj == null) {
                    String str = "Element at index " + (c3.size() - size2) + " is null.";
                    for (int size3 = c3.size() - 1; size3 >= size2; size3--) {
                        c3.remove(size3);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof C0197g) {
                    c3.h((C0197g) obj);
                } else {
                    c3.add((String) obj);
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

    public static C0436g o() {
        return DEFAULT_INSTANCE;
    }

    public static C0435f q() {
        return (C0435f) ((AbstractC0209t) DEFAULT_INSTANCE.e(5));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0211v
    public final Object e(int i3) {
        switch (AbstractC0600j.a(i3)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                return new Y(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0436g();
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                return new C0435f(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                U u3 = PARSER;
                if (u3 == null) {
                    synchronized (C0436g.class) {
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

    public final InterfaceC0212w p() {
        return this.strings_;
    }
}
