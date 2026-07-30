package defpackage;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class zl3 {
    protected int zza;

    public static void c(Iterable iterable, List list) {
        Charset charset = sn3.a;
        iterable.getClass();
        if (iterable instanceof wn3) {
            List zza = ((wn3) iterable).zza();
            if (list != null) {
                b71.o();
                return;
            }
            list.size();
            Iterator it = zza.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof im3) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                im3.d(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof so3) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof vo3) {
                vo3 vo3Var = (vo3) list;
                int i = vo3Var.o + size;
                int length = vo3Var.n.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = Math.max(((length * 3) / 2) + 1, 10);
                        }
                        vo3Var.n = Arrays.copyOf(vo3Var.n, length);
                    } else {
                        vo3Var.n = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    en3.a(size2, list);
                    throw null;
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj2 = list2.get(i2);
            if (obj2 == null) {
                en3.a(size2, list);
                throw null;
            }
            list.add(obj2);
        }
    }

    public final byte[] a() {
        try {
            in3 in3Var = (in3) this;
            int k = in3Var.k();
            byte[] bArr = new byte[k];
            lm3 lm3Var = new lm3(k, bArr);
            in3Var.d(lm3Var);
            if (k - lm3Var.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public abstract int b(yo3 yo3Var);
}
