package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.internal.l;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class oy0 extends m40 {
    private static final oy0 DEFAULT_INSTANCE;
    private static volatile dv0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private ha0 strings_ = j01.h;

    static {
        oy0 oy0Var = new oy0();
        DEFAULT_INSTANCE = oy0Var;
        m40.j(oy0.class, oy0Var);
    }

    public static void l(oy0 oy0Var, Iterable iterable) {
        ha0 ha0Var = oy0Var.strings_;
        if (!((j01) ha0Var).d) {
            j01 j01Var = (j01) ha0Var;
            int i = j01Var.g;
            oy0Var.strings_ = j01Var.d(i == 0 ? 10 : i * 2);
        }
        RandomAccess randomAccess = oy0Var.strings_;
        Charset charset = ia0.a;
        if (iterable instanceof cg0) {
            List c = ((cg0) iterable).c();
            if (randomAccess != null) {
                af.c();
                return;
            }
            ((j01) randomAccess).getClass();
            Iterator it = c.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof ff) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                ff.d(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof cz0) {
            ((j01) randomAccess).addAll((Collection) iterable);
            return;
        }
        if ((randomAccess instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) randomAccess).ensureCapacity(((Collection) iterable).size() + ((j01) randomAccess).g);
        }
        j01 j01Var2 = (j01) randomAccess;
        int i2 = j01Var2.g;
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (j01Var2.g - i2) + " is null.";
                for (int i3 = j01Var2.g - 1; i3 >= i2; i3--) {
                    j01Var2.remove(i3);
                }
                l.b(str);
                return;
            }
            j01Var2.add(obj);
        }
    }

    public static oy0 m() {
        return DEFAULT_INSTANCE;
    }

    public static ny0 o() {
        return (ny0) ((k40) DEFAULT_INSTANCE.c(5));
    }

    @Override // defpackage.m40
    public final Object c(int i) {
        dv0 dv0Var;
        switch (qy0.v(i)) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new c11(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new oy0();
            case 4:
                return new ny0(DEFAULT_INSTANCE);
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                dv0 dv0Var2 = PARSER;
                if (dv0Var2 != null) {
                    return dv0Var2;
                }
                synchronized (oy0.class) {
                    try {
                        dv0Var = PARSER;
                        if (dv0Var == null) {
                            dv0Var = new l40();
                            PARSER = dv0Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return dv0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final ha0 n() {
        return this.strings_;
    }
}
