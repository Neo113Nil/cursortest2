package com.google.android.gms.internal.play_billing;

import E.AbstractC0005f;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.play_billing.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0311e0 extends AbstractC0353w0 {
    private static final C0311e0 zzb;
    private A0 zzd = Q0.f5901e;

    static {
        C0311e0 c0311e0 = new C0311e0();
        zzb = c0311e0;
        AbstractC0353w0.k(C0311e0.class, c0311e0);
    }

    public static C0308d0 n() {
        return (C0308d0) zzb.f();
    }

    public static void o(C0311e0 c0311e0, ArrayList arrayList) {
        A0 a02 = c0311e0.zzd;
        if (!((AbstractC0323i0) a02).f5956a) {
            int size = a02.size();
            c0311e0.zzd = a02.a(size + size);
        }
        List list = c0311e0.zzd;
        Charset charset = B0.f5803a;
        int size2 = arrayList.size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size2);
        } else if (list instanceof Q0) {
            Q0 q02 = (Q0) list;
            int i4 = ((Q0) list).f5903c + size2;
            int length = q02.f5902b.length;
            if (i4 > length) {
                if (length != 0) {
                    while (length < i4) {
                        length = Math.max(((length * 3) / 2) + 1, 10);
                    }
                    q02.f5902b = Arrays.copyOf(q02.f5902b, length);
                } else {
                    q02.f5902b = new Object[Math.max(i4, 10)];
                }
            }
        }
        int size3 = list.size();
        int size4 = arrayList.size();
        for (int i5 = 0; i5 < size4; i5++) {
            Object obj = arrayList.get(i5);
            if (obj == null) {
                String k4 = AbstractC0005f.k(list.size() - size3, "Element at index ", " is null.");
                int size5 = list.size();
                while (true) {
                    size5--;
                    if (size5 < size3) {
                        throw new NullPointerException(k4);
                    }
                    list.remove(size5);
                }
            } else {
                list.add(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0353w0
    public final Object d(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new R0(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C0305c0.class});
        }
        if (i5 == 3) {
            return new C0311e0();
        }
        if (i5 == 4) {
            return new C0308d0(zzb);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
