package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* loaded from: classes2.dex */
public abstract class NF {

    /* renamed from: a, reason: collision with root package name */
    public static final long[] f26498a;

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f26499b;

    /* renamed from: c, reason: collision with root package name */
    public static final long[] f26500c;

    /* renamed from: d, reason: collision with root package name */
    public static final KF[][] f26501d;

    /* renamed from: e, reason: collision with root package name */
    public static final KF[] f26502e;

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f26503f;

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f26504g;

    /* renamed from: h, reason: collision with root package name */
    public static final BigInteger f26505h;

    static {
        BigInteger subtract = BigInteger.valueOf(2L).pow(com.anythink.basead.exoplayer.k.p.f8630b).subtract(BigInteger.valueOf(19L));
        f26503f = subtract;
        BigInteger mod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(subtract)).mod(subtract);
        f26504g = mod;
        BigInteger mod2 = BigInteger.valueOf(2L).multiply(mod).mod(subtract);
        f26505h = mod2;
        BigInteger valueOf = BigInteger.valueOf(2L);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger modPow = valueOf.modPow(subtract.subtract(bigInteger).divide(BigInteger.valueOf(4L)), subtract);
        C2593Hm c2593Hm = new C2593Hm(28, false);
        BigInteger mod3 = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(subtract)).mod(subtract);
        c2593Hm.f25416u = mod3;
        BigInteger multiply = mod3.pow(2).subtract(bigInteger).multiply(mod.multiply(mod3.pow(2)).add(bigInteger).modInverse(subtract));
        BigInteger modPow2 = multiply.modPow(subtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), subtract);
        if (!modPow2.pow(2).subtract(multiply).mod(subtract).equals(BigInteger.ZERO)) {
            modPow2 = modPow2.multiply(modPow).mod(subtract);
        }
        if (modPow2.testBit(0)) {
            modPow2 = subtract.subtract(modPow2);
        }
        c2593Hm.f25417v = modPow2;
        f26498a = AbstractC3217fl.b0(b(mod));
        f26499b = AbstractC3217fl.b0(b(mod2));
        f26500c = AbstractC3217fl.b0(b(modPow));
        f26501d = (KF[][]) Array.newInstance((Class<?>) KF.class, 32, 8);
        C2593Hm c2593Hm2 = c2593Hm;
        for (int i = 0; i < 32; i++) {
            C2593Hm c2593Hm3 = c2593Hm2;
            for (int i4 = 0; i4 < 8; i4++) {
                f26501d[i][i4] = c(c2593Hm3);
                c2593Hm3 = a(c2593Hm3, c2593Hm2);
            }
            for (int i9 = 0; i9 < 8; i9++) {
                c2593Hm2 = a(c2593Hm2, c2593Hm2);
            }
        }
        C2593Hm a9 = a(c2593Hm, c2593Hm);
        f26502e = new KF[8];
        for (int i10 = 0; i10 < 8; i10++) {
            f26502e[i10] = c(c2593Hm);
            c2593Hm = a(c2593Hm, a9);
        }
    }

    public static C2593Hm a(C2593Hm c2593Hm, C2593Hm c2593Hm2) {
        C2593Hm c2593Hm3 = new C2593Hm(28, false);
        BigInteger multiply = f26504g.multiply(((BigInteger) c2593Hm.f25417v).multiply((BigInteger) c2593Hm2.f25417v).multiply((BigInteger) c2593Hm.f25416u).multiply((BigInteger) c2593Hm2.f25416u));
        BigInteger bigInteger = f26503f;
        BigInteger mod = multiply.mod(bigInteger);
        BigInteger add = ((BigInteger) c2593Hm.f25417v).multiply((BigInteger) c2593Hm2.f25416u).add(((BigInteger) c2593Hm2.f25417v).multiply((BigInteger) c2593Hm.f25416u));
        BigInteger bigInteger2 = BigInteger.ONE;
        c2593Hm3.f25417v = add.multiply(bigInteger2.add(mod).modInverse(bigInteger)).mod(bigInteger);
        c2593Hm3.f25416u = ((BigInteger) c2593Hm.f25416u).multiply((BigInteger) c2593Hm2.f25416u).add(((BigInteger) c2593Hm.f25417v).multiply((BigInteger) c2593Hm2.f25417v)).multiply(bigInteger2.subtract(mod).modInverse(bigInteger)).mod(bigInteger);
        return c2593Hm3;
    }

    public static byte[] b(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i = 0; i < 16; i++) {
            byte b9 = bArr[i];
            int i4 = 31 - i;
            bArr[i] = bArr[i4];
            bArr[i4] = b9;
        }
        return bArr;
    }

    public static KF c(C2593Hm c2593Hm) {
        BigInteger add = ((BigInteger) c2593Hm.f25416u).add((BigInteger) c2593Hm.f25417v);
        BigInteger bigInteger = f26503f;
        return new KF(AbstractC3217fl.b0(b(add.mod(bigInteger))), AbstractC3217fl.b0(b(((BigInteger) c2593Hm.f25416u).subtract((BigInteger) c2593Hm.f25417v).mod(bigInteger))), AbstractC3217fl.b0(b(f26505h.multiply((BigInteger) c2593Hm.f25417v).multiply((BigInteger) c2593Hm.f25416u).mod(bigInteger))));
    }
}
