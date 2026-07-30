package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.eE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3137eE {
    public static BF a(C2593Hm c2593Hm, InterfaceC4272zG interfaceC4272zG) {
        C3791qK j9;
        List arrayList;
        HashMap hashMap = new HashMap();
        for (int i = 0; i < ((List) c2593Hm.f25417v).size(); i++) {
            C3838rE t9 = c2593Hm.t(i);
            if (t9.f33996b.equals(C3731pE.f33363v)) {
                XC xc = t9.f33995a;
                if (xc instanceof AbstractC4270zE) {
                    j9 = ((AbstractC4270zE) xc).j();
                } else {
                    if (!(xc instanceof C3085dG)) {
                        String name = xc.getClass().getName();
                        String valueOf = String.valueOf(xc.b());
                        throw new GeneralSecurityException(com.anythink.basead.b.c.i.q(new StringBuilder(name.length() + 59 + valueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", valueOf));
                    }
                    j9 = ((C3085dG) xc).j();
                }
                AF af = new AF((InterfaceC3569mE) interfaceC4272zG.J(t9), t9.f33997c);
                byte[] bArr = j9.f33687a;
                if (bArr.length != 0 && bArr.length != 5) {
                    throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
                }
                if (hashMap.containsKey(j9)) {
                    arrayList = (List) hashMap.get(j9);
                } else {
                    arrayList = new ArrayList();
                    hashMap.put(j9, arrayList);
                }
                arrayList.add(af);
            }
        }
        if (((HashMap) c2593Hm.f25416u).get(AbstractC3194fG.class) != null) {
            throw new ClassCastException();
        }
        c2593Hm.p();
        return new BF(new C3948tG(hashMap));
    }

    public static Object b(Future future) {
        Object obj;
        boolean z8 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z8 = true;
            } catch (Throwable th) {
                if (z8) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static void c(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static byte[] e(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 16) {
            int i4 = i + 1;
            byte b9 = bArr[i];
            byte b10 = (byte) ((b9 + b9) & 254);
            bArr2[i] = b10;
            if (i < 15) {
                bArr2[i] = (byte) (((bArr[i4] >> 7) & 1) | b10);
            }
            i = i4;
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public static void f(EnumC3413jK enumC3413jK) {
        int ordinal = enumC3413jK.ordinal();
        if (ordinal != 2 && ordinal != 3 && ordinal != 4) {
            throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(enumC3413jK.name())));
        }
    }

    public static final void g(SK sk, ArrayDeque arrayDeque) {
        if (!sk.q()) {
            if (!(sk instanceof NL)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(sk.getClass())));
            }
            NL nl = (NL) sk;
            g(nl.f26523w, arrayDeque);
            g(nl.f26524x, arrayDeque);
            return;
        }
        int binarySearch = Arrays.binarySearch(NL.f26521A, sk.f());
        if (binarySearch < 0) {
            binarySearch = (-(binarySearch + 1)) - 1;
        }
        int v6 = NL.v(binarySearch + 1);
        if (arrayDeque.isEmpty() || ((SK) arrayDeque.peek()).f() >= v6) {
            arrayDeque.push(sk);
            return;
        }
        int v9 = NL.v(binarySearch);
        SK sk2 = (SK) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((SK) arrayDeque.peek()).f() < v9) {
            sk2 = new NL((SK) arrayDeque.pop(), sk2);
        }
        NL nl2 = new NL(sk2, sk);
        while (!arrayDeque.isEmpty()) {
            int binarySearch2 = Arrays.binarySearch(NL.f26521A, nl2.f26522v);
            if (binarySearch2 < 0) {
                binarySearch2 = (-(binarySearch2 + 1)) - 1;
            }
            if (((SK) arrayDeque.peek()).f() >= NL.v(binarySearch2 + 1)) {
                break;
            } else {
                nl2 = new NL((SK) arrayDeque.pop(), nl2);
            }
        }
        arrayDeque.push(nl2);
    }

    public static void h(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static void i(int i) {
        if (i < 2048) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size >= 2048-bit is supported", Integer.valueOf(i)));
        }
        if (JF.a() && i != 2048 && i != 3072) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size of 2048- or 3072-bit is supported in FIPS mode.", Integer.valueOf(i)));
        }
    }

    public static void j(Class cls, Object obj) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    public static void k(BigInteger bigInteger) {
        if (!bigInteger.testBit(0)) {
            throw new GeneralSecurityException("Public exponent must be odd.");
        }
        if (bigInteger.compareTo(BigInteger.valueOf(65536L)) <= 0) {
            throw new GeneralSecurityException("Public exponent must be greater than 65536.");
        }
    }
}
