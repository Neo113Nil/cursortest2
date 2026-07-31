package a4;

import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.t0;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.v0;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.w0;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.y;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g extends w {
    private static final g DEFAULT_INSTANCE;
    private static volatile s0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private x strings_ = v0.f787g;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        w.j(g.class, gVar);
    }

    public static void l(g gVar, Iterable iterable) {
        x xVar = gVar.strings_;
        if (!((androidx.datastore.preferences.protobuf.b) xVar).f649d) {
            v0 v0Var = (v0) xVar;
            int i = v0Var.f789f;
            gVar.strings_ = v0Var.c(i == 0 ? 10 : i * 2);
        }
        RandomAccess randomAccess = gVar.strings_;
        Charset charset = y.f794a;
        if (iterable instanceof c0) {
            List d8 = ((c0) iterable).d();
            if (randomAccess != null) {
                throw new ClassCastException();
            }
            ((v0) randomAccess).getClass();
            Iterator it = d8.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof androidx.datastore.preferences.protobuf.g) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                androidx.datastore.preferences.protobuf.g.c(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof t0) {
            ((androidx.datastore.preferences.protobuf.b) randomAccess).addAll((Collection) iterable);
            return;
        }
        if ((randomAccess instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) randomAccess).ensureCapacity(((Collection) iterable).size() + ((v0) randomAccess).f789f);
        }
        v0 v0Var2 = (v0) randomAccess;
        int i8 = v0Var2.f789f;
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (v0Var2.f789f - i8) + " is null.";
                for (int i9 = v0Var2.f789f - 1; i9 >= i8; i9--) {
                    v0Var2.remove(i9);
                }
                throw new NullPointerException(str);
            }
            v0Var2.add(obj);
        }
    }

    public static g m() {
        return DEFAULT_INSTANCE;
    }

    public static f o() {
        return (f) ((u) DEFAULT_INSTANCE.c(5));
    }

    @Override // androidx.datastore.preferences.protobuf.w
    public final Object c(int i) {
        s0 s0Var;
        switch (w2.e.a(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                return new w0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case i.INTEGER_FIELD_NUMBER /* 3 */:
                return new g();
            case i.LONG_FIELD_NUMBER /* 4 */:
                return new f(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                s0 s0Var2 = PARSER;
                if (s0Var2 != null) {
                    return s0Var2;
                }
                synchronized (g.class) {
                    try {
                        s0Var = PARSER;
                        if (s0Var == null) {
                            s0Var = new v();
                            PARSER = s0Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return s0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final x n() {
        return this.strings_;
    }
}
