package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.y0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4405y0 extends AbstractC4368o2 {
    private static final C4405y0 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private long zzg;

    static {
        C4405y0 c4405y0 = new C4405y0();
        zzb = c4405y0;
        AbstractC4368o2.l(C4405y0.class, c4405y0);
    }

    public static C4401x0 m() {
        return (C4401x0) zzb.g();
    }

    public static /* synthetic */ void n(C4405y0 c4405y0, String str) {
        c4405y0.zzd |= 2;
        c4405y0.zzf = str;
    }

    public static /* synthetic */ void o(C4405y0 c4405y0, long j9) {
        c4405y0.zzd |= 4;
        c4405y0.zzg = j9;
    }

    public static /* synthetic */ void p(C4405y0 c4405y0, int i) {
        c4405y0.zze = i - 2;
        c4405y0.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4368o2
    public final Object f(int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new H2(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ဂ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i4 == 3) {
            return new C4405y0();
        }
        if (i4 == 4) {
            return new C4401x0(zzb);
        }
        if (i4 == 5) {
            return zzb;
        }
        throw null;
    }
}
