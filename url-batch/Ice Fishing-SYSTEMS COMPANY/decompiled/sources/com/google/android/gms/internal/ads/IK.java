package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public abstract class IK {
    protected transient int zzq;

    public static void e(Iterable iterable, List list) {
        iterable.getClass();
        if (iterable instanceof HL) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof JL) {
                JL jl = (JL) list;
                int i = ((JL) list).f25763v + size;
                int length = jl.f25762u.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = Math.max(((length * 3) / 2) + 1, 10);
                        }
                        jl.f25762u = Arrays.copyOf(jl.f25762u, length);
                    } else {
                        jl.f25762u = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    AbstractC3090dL.l(size2, list);
                    throw null;
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            Object obj2 = list2.get(i4);
            if (obj2 == null) {
                AbstractC3090dL.l(size2, list);
                throw null;
            }
            list.add(obj2);
        }
    }

    public final QK a() {
        try {
            int d2 = ((AbstractC3199fL) this).d(null);
            QK qk = SK.f27529u;
            byte[] bArr = new byte[d2];
            boolean z8 = XK.f28631c;
            VK vk = new VK(bArr, d2);
            ((AbstractC3199fL) this).v(vk);
            vk.l();
            return new QK(bArr);
        } catch (IOException e6) {
            throw new RuntimeException(f("ByteString"), e6);
        }
    }

    public final byte[] b() {
        try {
            int d2 = ((AbstractC3199fL) this).d(null);
            byte[] bArr = new byte[d2];
            boolean z8 = XK.f28631c;
            VK vk = new VK(bArr, d2);
            ((AbstractC3199fL) this).v(vk);
            vk.l();
            return bArr;
        } catch (IOException e6) {
            throw new RuntimeException(f("byte array"), e6);
        }
    }

    public final void c(OutputStream outputStream) {
        AbstractC3199fL abstractC3199fL = (AbstractC3199fL) this;
        int d2 = abstractC3199fL.d(null);
        boolean z8 = XK.f28631c;
        if (d2 > 4096) {
            d2 = 4096;
        }
        WK wk = new WK(outputStream, d2);
        abstractC3199fL.v(wk);
        if (wk.f28382f > 0) {
            wk.L();
        }
    }

    public abstract int d(OL ol);

    public final String f(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(name.length() + 18 + str.length() + 44);
        AbstractC5051n.j(sb, "Serializing ", name, " to a ", str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }
}
