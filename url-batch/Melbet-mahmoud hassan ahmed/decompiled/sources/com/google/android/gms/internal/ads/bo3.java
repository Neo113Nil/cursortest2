package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ao3;
import com.google.android.gms.internal.ads.bo3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class bo3<MessageType extends bo3<MessageType, BuilderType>, BuilderType extends ao3<MessageType, BuilderType>> implements kr3 {
    protected int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    protected static <T> void k(Iterable<T> iterable, List<? super T> list) {
        kq3.e(iterable);
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size = list.size();
        for (T t6 : iterable) {
            if (t6 == null) {
                int size2 = list.size();
                StringBuilder sb = new StringBuilder(37);
                sb.append("Element at index ");
                sb.append(size2 - size);
                sb.append(" is null.");
                String sb2 = sb.toString();
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(sb2);
                    }
                    list.remove(size3);
                }
            } else {
                list.add(t6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.kr3
    public final byte[] d() {
        try {
            byte[] bArr = new byte[h()];
            hp3 c7 = hp3.c(bArr);
            e(c7);
            c7.d();
            return bArr;
        } catch (IOException e7) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.kr3
    public final uo3 g() {
        try {
            int h7 = h();
            uo3 uo3Var = uo3.f12885g;
            byte[] bArr = new byte[h7];
            hp3 c7 = hp3.c(bArr);
            e(c7);
            c7.d();
            return new qo3(bArr);
        } catch (IOException e7) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e7);
        }
    }

    int j() {
        throw null;
    }

    void l(int i7) {
        throw null;
    }
}
