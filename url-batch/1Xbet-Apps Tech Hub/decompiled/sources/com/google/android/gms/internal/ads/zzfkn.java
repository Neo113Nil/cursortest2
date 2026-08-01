package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfkn extends zzgwm implements zzgxx {
    private static final zzgws zzb = new zzfkl();
    private static final zzfkn zzd;
    private int zzA;
    private int zzB;
    private long zzC;
    private int zzD;
    private long zzP;
    private int zzQ;
    private int zzR;
    private int zze;
    private int zzf;
    private long zzh;
    private long zzi;
    private long zzj;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private int zzw;
    private String zzg = "";
    private zzgwr zzk = zzaJ();
    private String zzr = "";
    private String zzs = "";
    private String zzt = "";
    private String zzu = "";
    private String zzv = "";
    private String zzx = "";
    private String zzy = "";
    private zzgwu zzz = zzaL();
    private String zzE = "";
    private String zzF = "";
    private String zzG = "";
    private String zzH = "";
    private String zzI = "";
    private String zzJ = "";
    private String zzK = "";
    private String zzL = "";
    private String zzM = "";
    private String zzN = "";
    private String zzO = "";

    static {
        zzfkn zzfknVar = new zzfkn();
        zzd = zzfknVar;
        zzgwm.zzaU(zzfkn.class, zzfknVar);
    }

    private zzfkn() {
    }

    public static zzfkm zza() {
        return (zzfkm) zzd.zzaA();
    }

    static /* synthetic */ void zzd(zzfkn zzfknVar, String str) {
        str.getClass();
        zzfknVar.zzN = str;
    }

    static /* synthetic */ void zze(zzfkn zzfknVar, String str) {
        str.getClass();
        zzfknVar.zzO = str;
    }

    static /* synthetic */ void zzi(zzfkn zzfknVar, String str) {
        str.getClass();
        zzfknVar.zzr = str;
    }

    static /* synthetic */ void zzj(zzfkn zzfknVar, String str) {
        str.getClass();
        zzfknVar.zzu = str;
    }

    static /* synthetic */ void zzk(zzfkn zzfknVar, String str) {
        str.getClass();
        zzfknVar.zzv = str;
    }

    static /* synthetic */ void zzm(zzfkn zzfknVar, Iterable iterable) {
        zzgwu zzgwuVar = zzfknVar.zzz;
        if (!zzgwuVar.zzc()) {
            zzfknVar.zzz = zzgwm.zzaM(zzgwuVar);
        }
        zzgun.zzav(iterable, zzfknVar.zzz);
    }

    static /* synthetic */ void zzp(zzfkn zzfknVar, String str) {
        str.getClass();
        zzfknVar.zzE = str;
    }

    static /* synthetic */ void zzq(zzfkn zzfknVar, String str) {
        str.getClass();
        zzfknVar.zzF = str;
    }

    static /* synthetic */ void zzr(zzfkn zzfknVar, String str) {
        str.getClass();
        zzfknVar.zzJ = str;
    }

    static /* synthetic */ void zzt(zzfkn zzfknVar, String str) {
        str.getClass();
        zzfknVar.zzL = str;
    }

    static /* synthetic */ void zzu(zzfkn zzfknVar, String str) {
        str.getClass();
        zzfknVar.zzM = str;
    }

    static /* synthetic */ void zzx(zzfkn zzfknVar, int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzfknVar.zzA = i - 2;
    }

    static /* synthetic */ void zzy(zzfkn zzfknVar, int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzfknVar.zzD = i - 2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzd, "\u0000(\u0000\u0000\u0001((\u0000\u0002\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019%\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001f\u0002 \u0002!\u0002\"\u0002#\u0002$\u0002%,&\f'\f(\f", new Object[]{"zze", "zzl", "zzm", "zzq", "zzr", "zzu", "zzv", "zzw", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzs", "zzt", "zzx", "zzy", "zzz", "zzG", "zzH", "zzI", "zzP", "zzg", "zzh", "zzi", "zzj", "zzn", "zzo", "zzp", "zzk", "zzQ", "zzR", "zzf"});
        }
        if (i2 == 3) {
            return new zzfkn();
        }
        zzfkl zzfklVar = null;
        if (i2 == 4) {
            return new zzfkm(zzfklVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzd;
    }
}
