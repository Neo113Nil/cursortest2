package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* loaded from: classes.dex */
public final class Q1 extends AbstractC0334g1 {
    private static final Q1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private U1 zzh;

    static {
        Q1 q12 = new Q1();
        zzb = q12;
        AbstractC0334g1.k(Q1.class, q12);
    }

    public static Q1 n(byte[] bArr, AbstractC0316a1 abstractC0316a1) {
        AbstractC0334g1 abstractC0334g1 = zzb;
        int length = bArr.length;
        if (length != 0) {
            abstractC0334g1 = (AbstractC0334g1) abstractC0334g1.d(4);
            try {
                D1 a6 = A1.f5019c.a(abstractC0334g1.getClass());
                V0 v02 = new V0();
                abstractC0316a1.getClass();
                a6.b(abstractC0334g1, bArr, 0, length, v02);
                a6.a(abstractC0334g1);
            } catch (G1 e3) {
                throw new C0355n1(e3.getMessage());
            } catch (C0355n1 e6) {
                throw e6;
            } catch (IOException e7) {
                if (e7.getCause() instanceof C0355n1) {
                    throw ((C0355n1) e7.getCause());
                }
                throw new C0355n1(e7.getMessage(), e7);
            } catch (IndexOutOfBoundsException unused) {
                throw new C0355n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        if (abstractC0334g1 == null || AbstractC0334g1.m(abstractC0334g1, true)) {
            return (Q1) abstractC0334g1;
        }
        throw new C0355n1(new G1().getMessage());
    }

    public static /* synthetic */ void o(Q1 q12, U1 u12) {
        q12.zzh = u12;
        q12.zzd |= 2;
    }

    public static /* synthetic */ void p(Q1 q12, e2 e2Var) {
        q12.zzf = e2Var;
        q12.zze = 4;
    }

    public static /* synthetic */ void q(Q1 q12, int i2) {
        q12.zzg = i2 - 1;
        q12.zzd |= 1;
    }

    public static P1 r() {
        return (P1) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0334g1
    public final Object d(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new C1(zzb, "\u0004\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", R0.f5092c, "zzh", e2.class});
        }
        if (i3 == 3) {
            return new Q1();
        }
        if (i3 == 4) {
            return new P1(zzb);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
