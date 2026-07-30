package j3;

import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.t;
import androidx.datastore.preferences.protobuf.t0;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.u0;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.w0;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.x0;
import com.android.installreferrer.api.InstallReferrerClient;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g extends v {
    private static final g DEFAULT_INSTANCE;
    private static volatile t0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private w strings_ = w0.f919i;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        v.j(g.class, gVar);
    }

    public static void l(g gVar, Iterable iterable) {
        w wVar = gVar.strings_;
        if (!((androidx.datastore.preferences.protobuf.b) wVar).f794f) {
            int size = wVar.size();
            gVar.strings_ = wVar.e(size == 0 ? 10 : size * 2);
        }
        List list = gVar.strings_;
        Charset charset = x.f922a;
        if (iterable instanceof c0) {
            List q8 = ((c0) iterable).q();
            c0 c0Var = (c0) list;
            int size2 = list.size();
            for (Object obj : q8) {
                if (obj == null) {
                    String str = "Element at index " + (c0Var.size() - size2) + " is null.";
                    for (int size3 = c0Var.size() - 1; size3 >= size2; size3--) {
                        c0Var.remove(size3);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof androidx.datastore.preferences.protobuf.g) {
                    c0Var.h((androidx.datastore.preferences.protobuf.g) obj);
                } else {
                    c0Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof u0) {
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

    public static g m() {
        return DEFAULT_INSTANCE;
    }

    public static f o() {
        return (f) ((t) DEFAULT_INSTANCE.c(5));
    }

    @Override // androidx.datastore.preferences.protobuf.v
    public final Object c(int i7) {
        t0 t0Var;
        switch (l.h.d(i7)) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new x0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new g();
            case 4:
                return new f(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                t0 t0Var2 = PARSER;
                if (t0Var2 != null) {
                    return t0Var2;
                }
                synchronized (g.class) {
                    try {
                        t0Var = PARSER;
                        if (t0Var == null) {
                            t0Var = new u();
                            PARSER = t0Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return t0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final w n() {
        return this.strings_;
    }
}
