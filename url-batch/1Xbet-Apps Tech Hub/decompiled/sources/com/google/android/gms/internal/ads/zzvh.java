package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzvh implements zzyw, zztz {
    final /* synthetic */ zzvm zza;
    private final Uri zzc;
    private final zzhr zzd;
    private final zzvb zze;
    private final zzach zzf;
    private final zzei zzg;
    private volatile boolean zzi;
    private long zzk;
    private zzadk zzm;
    private boolean zzn;
    private final zzadb zzh = new zzadb();
    private boolean zzj = true;
    private final long zzb = zzub.zza();
    private zzgv zzl = zzi(0);

    public zzvh(zzvm zzvmVar, Uri uri, zzgq zzgqVar, zzvb zzvbVar, zzach zzachVar, zzei zzeiVar) {
        this.zza = zzvmVar;
        this.zzc = uri;
        this.zzd = new zzhr(zzgqVar);
        this.zze = zzvbVar;
        this.zzf = zzachVar;
        this.zzg = zzeiVar;
    }

    static /* bridge */ /* synthetic */ void zzf(zzvh zzvhVar, long j, long j2) {
        zzvhVar.zzh.zza = j;
        zzvhVar.zzk = j2;
        zzvhVar.zzj = true;
        zzvhVar.zzn = false;
    }

    private final zzgv zzi(long j) {
        zzgt zzgtVar = new zzgt();
        zzgtVar.zzd(this.zzc);
        zzgtVar.zzc(j);
        zzgtVar.zza(6);
        zzgtVar.zzb(zzvm.zzb);
        return zzgtVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzyw
    public final void zzg() {
        this.zzi = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082 A[Catch: all -> 0x01ec, TryCatch #7 {all -> 0x01ec, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:14:0x0041, B:18:0x0077, B:20:0x0082, B:21:0x008e, B:23:0x0098, B:24:0x00a4, B:26:0x00ae, B:27:0x00ba, B:29:0x00c4, B:30:0x00d6, B:32:0x00e0, B:34:0x00e6, B:38:0x0116, B:39:0x011d, B:41:0x012a, B:43:0x0132, B:44:0x014f, B:108:0x00f0, B:111:0x0104, B:120:0x004d, B:123:0x0063), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098 A[Catch: all -> 0x01ec, TryCatch #7 {all -> 0x01ec, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:14:0x0041, B:18:0x0077, B:20:0x0082, B:21:0x008e, B:23:0x0098, B:24:0x00a4, B:26:0x00ae, B:27:0x00ba, B:29:0x00c4, B:30:0x00d6, B:32:0x00e0, B:34:0x00e6, B:38:0x0116, B:39:0x011d, B:41:0x012a, B:43:0x0132, B:44:0x014f, B:108:0x00f0, B:111:0x0104, B:120:0x004d, B:123:0x0063), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae A[Catch: all -> 0x01ec, TryCatch #7 {all -> 0x01ec, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:14:0x0041, B:18:0x0077, B:20:0x0082, B:21:0x008e, B:23:0x0098, B:24:0x00a4, B:26:0x00ae, B:27:0x00ba, B:29:0x00c4, B:30:0x00d6, B:32:0x00e0, B:34:0x00e6, B:38:0x0116, B:39:0x011d, B:41:0x012a, B:43:0x0132, B:44:0x014f, B:108:0x00f0, B:111:0x0104, B:120:0x004d, B:123:0x0063), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4 A[Catch: all -> 0x01ec, TryCatch #7 {all -> 0x01ec, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:14:0x0041, B:18:0x0077, B:20:0x0082, B:21:0x008e, B:23:0x0098, B:24:0x00a4, B:26:0x00ae, B:27:0x00ba, B:29:0x00c4, B:30:0x00d6, B:32:0x00e0, B:34:0x00e6, B:38:0x0116, B:39:0x011d, B:41:0x012a, B:43:0x0132, B:44:0x014f, B:108:0x00f0, B:111:0x0104, B:120:0x004d, B:123:0x0063), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0 A[Catch: all -> 0x01ec, TRY_LEAVE, TryCatch #7 {all -> 0x01ec, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:14:0x0041, B:18:0x0077, B:20:0x0082, B:21:0x008e, B:23:0x0098, B:24:0x00a4, B:26:0x00ae, B:27:0x00ba, B:29:0x00c4, B:30:0x00d6, B:32:0x00e0, B:34:0x00e6, B:38:0x0116, B:39:0x011d, B:41:0x012a, B:43:0x0132, B:44:0x014f, B:108:0x00f0, B:111:0x0104, B:120:0x004d, B:123:0x0063), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0116 A[Catch: all -> 0x01ec, TryCatch #7 {all -> 0x01ec, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:14:0x0041, B:18:0x0077, B:20:0x0082, B:21:0x008e, B:23:0x0098, B:24:0x00a4, B:26:0x00ae, B:27:0x00ba, B:29:0x00c4, B:30:0x00d6, B:32:0x00e0, B:34:0x00e6, B:38:0x0116, B:39:0x011d, B:41:0x012a, B:43:0x0132, B:44:0x014f, B:108:0x00f0, B:111:0x0104, B:120:0x004d, B:123:0x0063), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012a A[Catch: all -> 0x01ec, TryCatch #7 {all -> 0x01ec, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:14:0x0041, B:18:0x0077, B:20:0x0082, B:21:0x008e, B:23:0x0098, B:24:0x00a4, B:26:0x00ae, B:27:0x00ba, B:29:0x00c4, B:30:0x00d6, B:32:0x00e0, B:34:0x00e6, B:38:0x0116, B:39:0x011d, B:41:0x012a, B:43:0x0132, B:44:0x014f, B:108:0x00f0, B:111:0x0104, B:120:0x004d, B:123:0x0063), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016a A[Catch: all -> 0x01e9, TryCatch #5 {all -> 0x01e9, blocks: (B:47:0x015f, B:49:0x016a, B:50:0x016f, B:52:0x0173), top: B:46:0x015f }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0173 A[Catch: all -> 0x01e9, TRY_LEAVE, TryCatch #5 {all -> 0x01e9, blocks: (B:47:0x015f, B:49:0x016a, B:50:0x016f, B:52:0x0173), top: B:46:0x015f }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0186 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x020c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[LOOP:0: B:2:0x0004->B:84:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c7 A[EDGE_INSN: B:98:0x01c7->B:76:0x01c7 BREAK  A[LOOP:1: B:57:0x0184->B:68:0x0184], SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzyw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh() throws IOException {
        int i;
        int i2;
        boolean z;
        int i3;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean z2;
        List list5;
        int i4;
        zzhr zzhrVar;
        zzvm zzvmVar;
        zzt zztVar;
        int i5;
        int i6;
        int i7;
        int i8;
        while (!this.zzi) {
            try {
                long j = this.zzh.zza;
                zzgv zzi = zzi(j);
                this.zzl = zzi;
                long zzb = this.zzd.zzb(zzi);
                if (zzb != -1) {
                    zzb += j;
                    zzvm.zzC(this.zza);
                }
                long j2 = zzb;
                zzvm zzvmVar2 = this.zza;
                Map zze = this.zzd.zze();
                List list6 = (List) zze.get("icy-br");
                try {
                    if (list6 != null) {
                        String str4 = (String) list6.get(0);
                        try {
                            i8 = Integer.parseInt(str4) * 1000;
                        } catch (NumberFormatException unused) {
                            i8 = -1;
                        }
                        if (i8 > 0) {
                            i3 = i8;
                            z = true;
                            list = (List) zze.get("icy-genre");
                            if (list != null) {
                                str = (String) list.get(0);
                                z = true;
                            } else {
                                str = null;
                            }
                            list2 = (List) zze.get("icy-name");
                            if (list2 != null) {
                                str2 = (String) list2.get(0);
                                z = true;
                            } else {
                                str2 = null;
                            }
                            list3 = (List) zze.get("icy-url");
                            if (list3 != null) {
                                str3 = (String) list3.get(0);
                                z = true;
                            } else {
                                str3 = null;
                            }
                            list4 = (List) zze.get("icy-pub");
                            if (list4 != null) {
                                z2 = ((String) list4.get(0)).equals("1");
                                z = true;
                            } else {
                                z2 = false;
                            }
                            list5 = (List) zze.get("icy-metaint");
                            if (list5 != null) {
                                String str5 = (String) list5.get(0);
                                try {
                                    i7 = Integer.parseInt(str5);
                                } catch (NumberFormatException unused2) {
                                    i7 = -1;
                                }
                                if (i7 > 0) {
                                    i4 = i7;
                                    z = true;
                                    zzvmVar2.zzs = z ? new zzafk(i3, str, str2, str3, z2, i4) : null;
                                    zzhrVar = this.zzd;
                                    zzvmVar = this.zza;
                                    if (zzvmVar.zzs != null || zzvmVar.zzs.zzf == -1) {
                                        zztVar = zzhrVar;
                                    } else {
                                        zzt zzuaVar = new zzua(zzhrVar, zzvmVar.zzs.zzf, this);
                                        zzadk zzv = this.zza.zzv();
                                        this.zzm = zzv;
                                        zzv.zzl(zzvm.zzc);
                                        zztVar = zzuaVar;
                                    }
                                    this.zze.zzd(zztVar, this.zzc, this.zzd.zze(), j, j2, this.zzf);
                                    if (this.zza.zzs != null) {
                                        this.zze.zzc();
                                    }
                                    if (this.zzj) {
                                        this.zze.zzf(j, this.zzk);
                                        i = 0;
                                        try {
                                            this.zzj = false;
                                        } catch (Throwable th) {
                                            th = th;
                                            i2 = i;
                                            if (i2 != 1) {
                                            }
                                            zzgs.zza(this.zzd);
                                            throw th;
                                        }
                                    } else {
                                        i = 0;
                                    }
                                    long j3 = j;
                                    i5 = i;
                                    while (true) {
                                        if (i5 != 0) {
                                            break;
                                        }
                                        try {
                                            if (this.zzi) {
                                                i5 = i;
                                                break;
                                            }
                                            try {
                                                this.zzg.zza();
                                                i5 = this.zze.zza(this.zzh);
                                                long zzb2 = this.zze.zzb();
                                                if (zzb2 > this.zza.zzj + j3) {
                                                    this.zzg.zzc();
                                                    zzvm zzvmVar3 = this.zza;
                                                    zzvmVar3.zzp.post(zzvmVar3.zzo);
                                                    j3 = zzb2;
                                                }
                                            } catch (InterruptedException unused3) {
                                                throw new InterruptedIOException();
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            i2 = i5;
                                            if (i2 != 1) {
                                                zzvb zzvbVar = this.zze;
                                                if (zzvbVar.zzb() != -1) {
                                                    this.zzh.zza = zzvbVar.zzb();
                                                }
                                            }
                                            zzgs.zza(this.zzd);
                                            throw th;
                                        }
                                    }
                                    if (i5 == 1) {
                                        i6 = i;
                                    } else {
                                        zzvb zzvbVar2 = this.zze;
                                        if (zzvbVar2.zzb() != -1) {
                                            this.zzh.zza = zzvbVar2.zzb();
                                        }
                                        i6 = i5;
                                    }
                                    zzgs.zza(this.zzd);
                                    if (i6 != 0) {
                                        return;
                                    }
                                } else {
                                    try {
                                        zzez.zzf("IcyHeaders", "Invalid metadata interval: " + str5);
                                    } catch (NumberFormatException unused4) {
                                        zzez.zzf("IcyHeaders", "Invalid metadata interval: ".concat(String.valueOf(str5)));
                                        i4 = i7;
                                        zzvmVar2.zzs = z ? new zzafk(i3, str, str2, str3, z2, i4) : null;
                                        zzhrVar = this.zzd;
                                        zzvmVar = this.zza;
                                        if (zzvmVar.zzs != null) {
                                        }
                                        zztVar = zzhrVar;
                                        this.zze.zzd(zztVar, this.zzc, this.zzd.zze(), j, j2, this.zzf);
                                        if (this.zza.zzs != null) {
                                        }
                                        if (this.zzj) {
                                        }
                                        long j32 = j;
                                        i5 = i;
                                        while (true) {
                                            if (i5 != 0) {
                                            }
                                        }
                                        if (i5 == 1) {
                                        }
                                        zzgs.zza(this.zzd);
                                        if (i6 != 0) {
                                        }
                                    }
                                }
                            }
                            i4 = -1;
                            zzvmVar2.zzs = z ? new zzafk(i3, str, str2, str3, z2, i4) : null;
                            zzhrVar = this.zzd;
                            zzvmVar = this.zza;
                            if (zzvmVar.zzs != null) {
                            }
                            zztVar = zzhrVar;
                            this.zze.zzd(zztVar, this.zzc, this.zzd.zze(), j, j2, this.zzf);
                            if (this.zza.zzs != null) {
                            }
                            if (this.zzj) {
                            }
                            long j322 = j;
                            i5 = i;
                            while (true) {
                                if (i5 != 0) {
                                }
                            }
                            if (i5 == 1) {
                            }
                            zzgs.zza(this.zzd);
                            if (i6 != 0) {
                            }
                        } else {
                            try {
                                zzez.zzf("IcyHeaders", "Invalid bitrate: " + str4);
                            } catch (NumberFormatException unused5) {
                                zzez.zzf("IcyHeaders", "Invalid bitrate header: ".concat(String.valueOf(str4)));
                                z = false;
                                i3 = i8;
                                list = (List) zze.get("icy-genre");
                                if (list != null) {
                                }
                                list2 = (List) zze.get("icy-name");
                                if (list2 != null) {
                                }
                                list3 = (List) zze.get("icy-url");
                                if (list3 != null) {
                                }
                                list4 = (List) zze.get("icy-pub");
                                if (list4 != null) {
                                }
                                list5 = (List) zze.get("icy-metaint");
                                if (list5 != null) {
                                }
                                i4 = -1;
                                zzvmVar2.zzs = z ? new zzafk(i3, str, str2, str3, z2, i4) : null;
                                zzhrVar = this.zzd;
                                zzvmVar = this.zza;
                                if (zzvmVar.zzs != null) {
                                }
                                zztVar = zzhrVar;
                                this.zze.zzd(zztVar, this.zzc, this.zzd.zze(), j, j2, this.zzf);
                                if (this.zza.zzs != null) {
                                }
                                if (this.zzj) {
                                }
                                long j3222 = j;
                                i5 = i;
                                while (true) {
                                    if (i5 != 0) {
                                    }
                                }
                                if (i5 == 1) {
                                }
                                zzgs.zza(this.zzd);
                                if (i6 != 0) {
                                }
                            }
                        }
                    }
                    this.zze.zzd(zztVar, this.zzc, this.zzd.zze(), j, j2, this.zzf);
                    if (this.zza.zzs != null) {
                    }
                    if (this.zzj) {
                    }
                    long j32222 = j;
                    i5 = i;
                    while (true) {
                        if (i5 != 0) {
                        }
                    }
                    if (i5 == 1) {
                    }
                    zzgs.zza(this.zzd);
                    if (i6 != 0) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    i = 0;
                }
                z = false;
                i3 = -1;
                list = (List) zze.get("icy-genre");
                if (list != null) {
                }
                list2 = (List) zze.get("icy-name");
                if (list2 != null) {
                }
                list3 = (List) zze.get("icy-url");
                if (list3 != null) {
                }
                list4 = (List) zze.get("icy-pub");
                if (list4 != null) {
                }
                list5 = (List) zze.get("icy-metaint");
                if (list5 != null) {
                }
                i4 = -1;
                zzvmVar2.zzs = z ? new zzafk(i3, str, str2, str3, z2, i4) : null;
                zzhrVar = this.zzd;
                zzvmVar = this.zza;
                if (zzvmVar.zzs != null) {
                }
                zztVar = zzhrVar;
            } catch (Throwable th4) {
                th = th4;
                i = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztz
    public final void zza(zzfj zzfjVar) {
        long max = !this.zzn ? this.zzk : Math.max(zzvm.zzr(this.zza, true), this.zzk);
        int zza = zzfjVar.zza();
        zzadk zzadkVar = this.zzm;
        zzadkVar.getClass();
        zzadi.zzb(zzadkVar, zzfjVar, zza);
        zzadkVar.zzt(max, 1, zza, 0, null);
        this.zzn = true;
    }
}
