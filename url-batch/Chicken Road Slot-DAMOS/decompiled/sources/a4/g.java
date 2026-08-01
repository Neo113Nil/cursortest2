package a4;

import a2.r;
import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.t;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.u0;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.v0;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.x;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g extends v {
    private static final g DEFAULT_INSTANCE;
    private static volatile r0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private w strings_ = u0.f639r;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        v.j(g.class, gVar);
    }

    public static void l(g gVar, Iterable iterable) {
        w wVar = gVar.strings_;
        if (!((u0) wVar).f640d) {
            u0 u0Var = (u0) wVar;
            int i3 = u0Var.f642i;
            gVar.strings_ = u0Var.e(i3 == 0 ? 10 : i3 * 2);
        }
        RandomAccess randomAccess = gVar.strings_;
        Charset charset = x.f647a;
        if (iterable instanceof b0) {
            List l10 = ((b0) iterable).l();
            if (randomAccess != null) {
                i0.j();
                return;
            }
            ((u0) randomAccess).getClass();
            Iterator it = l10.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof androidx.datastore.preferences.protobuf.f) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                androidx.datastore.preferences.protobuf.f.e(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof s0) {
            ((u0) randomAccess).addAll((Collection) iterable);
            return;
        }
        if ((randomAccess instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) randomAccess).ensureCapacity(((Collection) iterable).size() + ((u0) randomAccess).f642i);
        }
        u0 u0Var2 = (u0) randomAccess;
        int i10 = u0Var2.f642i;
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (u0Var2.f642i - i10) + " is null.";
                for (int i11 = u0Var2.f642i - 1; i11 >= i10; i11--) {
                    u0Var2.remove(i11);
                }
                r.j(str);
                return;
            }
            u0Var2.add(obj);
        }
    }

    public static g m() {
        return DEFAULT_INSTANCE;
    }

    public static f o() {
        return (f) ((t) DEFAULT_INSTANCE.c(5));
    }

    @Override // androidx.datastore.preferences.protobuf.v
    public final Object c(int i3) {
        r0 r0Var;
        switch (i.b(i3)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new v0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                return new g();
            case j.LONG_FIELD_NUMBER /* 4 */:
                return new f(DEFAULT_INSTANCE);
            case j.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                r0 r0Var2 = PARSER;
                if (r0Var2 != null) {
                    return r0Var2;
                }
                synchronized (g.class) {
                    try {
                        r0Var = PARSER;
                        if (r0Var == null) {
                            r0Var = new u();
                            PARSER = r0Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return r0Var;
            default:
                r.a();
                return null;
        }
    }

    public final w n() {
        return this.strings_;
    }
}
