package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class j42 extends vu0 {
    private static final j42 DEFAULT_INSTANCE;
    private static volatile oz1 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private e41 strings_ = r52.p;

    static {
        j42 j42Var = new j42();
        DEFAULT_INSTANCE = j42Var;
        vu0.j(j42.class, j42Var);
    }

    public static void l(j42 j42Var, Iterable iterable) {
        e41 e41Var = j42Var.strings_;
        if (!((r52) e41Var).m) {
            r52 r52Var = (r52) e41Var;
            int i = r52Var.o;
            j42Var.strings_ = r52Var.c(i == 0 ? 10 : i * 2);
        }
        RandomAccess randomAccess = j42Var.strings_;
        Charset charset = f41.a;
        if (iterable instanceof jc1) {
            List i2 = ((jc1) iterable).i();
            if (randomAccess != null) {
                b71.o();
                return;
            }
            ((r52) randomAccess).getClass();
            Iterator it = i2.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof er) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                er.c(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof x42) {
            ((r52) randomAccess).addAll((Collection) iterable);
            return;
        }
        if ((randomAccess instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) randomAccess).ensureCapacity(((Collection) iterable).size() + ((r52) randomAccess).o);
        }
        r52 r52Var2 = (r52) randomAccess;
        int i3 = r52Var2.o;
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (r52Var2.o - i3) + " is null.";
                for (int i4 = r52Var2.o - 1; i4 >= i3; i4--) {
                    r52Var2.remove(i4);
                }
                ch2.l(str);
                return;
            }
            r52Var2.add(obj);
        }
    }

    public static j42 m() {
        return DEFAULT_INSTANCE;
    }

    public static i42 o() {
        return (i42) ((tu0) DEFAULT_INSTANCE.c(5));
    }

    @Override // defpackage.vu0
    public final Object c(int i) {
        oz1 oz1Var;
        switch (q40.u(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new f62(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new j42();
            case 4:
                return new i42(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                oz1 oz1Var2 = PARSER;
                if (oz1Var2 != null) {
                    return oz1Var2;
                }
                synchronized (j42.class) {
                    try {
                        oz1Var = PARSER;
                        if (oz1Var == null) {
                            oz1Var = new uu0();
                            PARSER = oz1Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return oz1Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final e41 n() {
        return this.strings_;
    }
}
