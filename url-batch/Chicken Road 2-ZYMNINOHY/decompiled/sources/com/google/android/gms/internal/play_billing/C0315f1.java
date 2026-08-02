package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.play_billing.f1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0315f1 extends AbstractC0353w0 {
    private static final C0315f1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private C0327j1 zzh;
    private int zzi;

    static {
        C0315f1 c0315f1 = new C0315f1();
        zzb = c0315f1;
        AbstractC0353w0.k(C0315f1.class, c0315f1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.play_billing.S0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.play_billing.w0, java.lang.Object] */
    public static C0315f1 n(byte[] bArr, AbstractC0340p0 abstractC0340p0) {
        C0315f1 c0315f1 = zzb;
        int length = bArr.length;
        if (length != 0) {
            ?? r22 = (AbstractC0353w0) c0315f1.d(4);
            try {
                ?? a3 = P0.f5897c.a(r22.getClass());
                C0329k0 c0329k0 = new C0329k0();
                abstractC0340p0.getClass();
                a3.h(r22, bArr, 0, length, c0329k0);
                a3.a(r22);
                c0315f1 = r22;
            } catch (D0 e4) {
                throw e4;
            } catch (V0 e5) {
                throw new D0(e5.getMessage());
            } catch (IOException e6) {
                if (e6.getCause() instanceof D0) {
                    throw ((D0) e6.getCause());
                }
                throw new D0(e6.getMessage(), e6);
            } catch (IndexOutOfBoundsException unused) {
                throw new D0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        if (c0315f1 == null || AbstractC0353w0.c(c0315f1, true)) {
            return c0315f1;
        }
        throw new D0(new V0().getMessage());
    }

    public static void p(C0315f1 c0315f1, l1 l1Var) {
        c0315f1.zzi = l1Var.f5976a;
        c0315f1.zzd |= 4;
    }

    public static /* synthetic */ void q(C0315f1 c0315f1, C0327j1 c0327j1) {
        c0315f1.zzh = c0327j1;
        c0315f1.zzd |= 2;
    }

    public static /* synthetic */ void r(C0315f1 c0315f1, r1 r1Var) {
        c0315f1.zzf = r1Var;
        c0315f1.zze = 4;
    }

    public static /* synthetic */ void s(C0315f1 c0315f1, v1 v1Var) {
        c0315f1.zzf = v1Var;
        c0315f1.zze = 7;
    }

    public static /* synthetic */ void t(C0315f1 c0315f1, D1 d12) {
        c0315f1.zzf = d12;
        c0315f1.zze = 6;
    }

    public static /* synthetic */ void u(C0315f1 c0315f1, int i4) {
        c0315f1.zzg = i4 - 1;
        c0315f1.zzd |= 1;
    }

    public static C0312e1 v() {
        return (C0312e1) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0353w0
    public final Object d(int i4) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new R0(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C0317g0.f5947c, "zzh", r1.class, "zzi", C0317g0.f5949e, D1.class, v1.class});
        }
        if (i5 == 3) {
            return new C0315f1();
        }
        if (i5 == 4) {
            return new C0312e1(zzb);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }

    public final v1 o() {
        return this.zze == 7 ? (v1) this.zzf : v1.o();
    }
}
