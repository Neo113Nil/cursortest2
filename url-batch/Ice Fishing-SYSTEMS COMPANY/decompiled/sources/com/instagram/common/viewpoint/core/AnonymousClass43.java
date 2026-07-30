package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import android.os.IBinder;
import com.anythink.core.common.s.a.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.43, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AnonymousClass43 {
    public static Method A00;
    public static byte[] A01;
    public static String[] A02 = {"rt6CjKtQUOFxarnmkWqgGWje", "3nuh3b0J3kR9pkmWbi6mdwRc069ydG03", "vgqSEb59pwcvKw9WdixQFoz3Va18KFsr", "h35Isj3aZViVWltuKEoucz22tQqncTnx", "yJGJRoZVng69n9xQNPvqaXzNAukE8cwJ", "ZigbL863Rtw4tWoi2mLflUon", "c977rkHkuANnZfYHmbWrwArrI1mgRqhG", "I5ankwGA25juUPMFKSRh1H9yjdqc0trO"};

    public static String A02(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 112);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{107, 92, 71, 77, 69, 76, 124, 93, c.f16475b, 69, 44, 11, 3, 6, 15, 14, 74, 30, 5, 74, 3, 4, 28, 5, 1, 15, 74, 13, 15, 30, 35, 40, 3, 4, 14, 15, 24, 74, 28, 3, 11, 74, 24, 15, 12, 6, 15, 9, 30, 3, 5, 4, 99, 68, 76, 73, c.f16475b, 65, 5, 81, 74, 5, 87, c.f16475b, 81, 87, 76, c.f16475b, 83, c.f16475b, 5, 66, c.f16475b, 81, 108, 103, 76, 75, 65, c.f16475b, 87, 5, 72, c.f16475b, 81, 77, 74, 65, 120, 122, 107, 86, 93, 118, 113, 123, 122, 109};
    }

    static {
        A03();
    }

    public static IBinder A00(Bundle bundle, String str) {
        if (C5C.A02 >= 18) {
            return bundle.getBinder(str);
        }
        IBinder A012 = A01(bundle, str);
        if (A02[7].charAt(19) == 'S') {
            throw new RuntimeException();
        }
        A02[7] = "R1pRDUJQUvAtWdszhYbqbgNcOgXvgcSI";
        return A012;
    }

    public static IBinder A01(Bundle bundle, String str) {
        Method method = A00;
        String A022 = A02(0, 10, 89);
        if (method == null) {
            try {
                Method getIBinder = Bundle.class.getMethod(A02(88, 10, 111), String.class);
                A00 = getIBinder;
                Method getIBinder2 = A00;
                getIBinder2.setAccessible(true);
                method = A00;
            } catch (NoSuchMethodException e6) {
                AbstractC06314g.A09(A022, A02(52, 36, 85), e6);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e9) {
            AbstractC06314g.A09(A022, A02(10, 42, 26), e9);
            return null;
        }
    }
}
