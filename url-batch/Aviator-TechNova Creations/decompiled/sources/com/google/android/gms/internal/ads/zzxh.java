package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.facebook.appevents.AppEventsConstants;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzxh implements zzabb, zzvz {
    final /* synthetic */ zzxq zza;
    private final long zzb;
    private final Uri zzc;
    private final zzhy zzd;
    private final zzxd zze;
    private final zzaex zzf;
    private final zzdq zzg;
    private final zzafv zzh;
    private volatile boolean zzi;
    private boolean zzj;
    private long zzk;
    private zzhf zzl;
    private zzagh zzm;
    private boolean zzn;

    public zzxh(zzxq zzxqVar, Uri uri, zzhb zzhbVar, zzxd zzxdVar, zzaex zzaexVar, zzdq zzdqVar) {
        Objects.requireNonNull(zzxqVar);
        this.zza = zzxqVar;
        this.zzc = uri;
        this.zzd = new zzhy(zzhbVar);
        this.zze = zzxdVar;
        this.zzf = zzaexVar;
        this.zzg = zzdqVar;
        this.zzh = new zzafv();
        this.zzj = true;
        this.zzb = zzwb.zza();
        this.zzl = zzi(0L, null);
    }

    private final zzhf zzi(long j, String str) {
        Map map;
        map = zzxq.zzb;
        if (str != null && !str.startsWith("W/")) {
            zzguh zzguhVar = new zzguh();
            zzguhVar.zzb(map.entrySet());
            zzguhVar.zza(HttpHeaders.IF_RANGE, str);
            map = zzguhVar.zzd();
        }
        zzhe zzheVar = new zzhe();
        zzheVar.zza(this.zzc);
        zzheVar.zzc(j);
        zzheVar.zzd(6);
        zzheVar.zzb(map);
        return zzheVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzb() {
        this.zzi = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cd A[Catch: all -> 0x00bc, TryCatch #7 {all -> 0x00bc, blocks: (B:116:0x007a, B:118:0x0080, B:21:0x00c3, B:23:0x00cd, B:24:0x00da, B:26:0x00e4, B:27:0x00f1, B:29:0x00fb, B:30:0x0108, B:32:0x0112, B:33:0x0125, B:35:0x012f, B:37:0x0136, B:41:0x0173, B:42:0x017c, B:44:0x0189, B:46:0x0192, B:47:0x01ad, B:49:0x01c2, B:50:0x01c5, B:52:0x01c9, B:104:0x0140, B:107:0x015e, B:123:0x008c, B:126:0x00aa), top: B:115:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e4 A[Catch: all -> 0x00bc, TryCatch #7 {all -> 0x00bc, blocks: (B:116:0x007a, B:118:0x0080, B:21:0x00c3, B:23:0x00cd, B:24:0x00da, B:26:0x00e4, B:27:0x00f1, B:29:0x00fb, B:30:0x0108, B:32:0x0112, B:33:0x0125, B:35:0x012f, B:37:0x0136, B:41:0x0173, B:42:0x017c, B:44:0x0189, B:46:0x0192, B:47:0x01ad, B:49:0x01c2, B:50:0x01c5, B:52:0x01c9, B:104:0x0140, B:107:0x015e, B:123:0x008c, B:126:0x00aa), top: B:115:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fb A[Catch: all -> 0x00bc, TryCatch #7 {all -> 0x00bc, blocks: (B:116:0x007a, B:118:0x0080, B:21:0x00c3, B:23:0x00cd, B:24:0x00da, B:26:0x00e4, B:27:0x00f1, B:29:0x00fb, B:30:0x0108, B:32:0x0112, B:33:0x0125, B:35:0x012f, B:37:0x0136, B:41:0x0173, B:42:0x017c, B:44:0x0189, B:46:0x0192, B:47:0x01ad, B:49:0x01c2, B:50:0x01c5, B:52:0x01c9, B:104:0x0140, B:107:0x015e, B:123:0x008c, B:126:0x00aa), top: B:115:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0112 A[Catch: all -> 0x00bc, TryCatch #7 {all -> 0x00bc, blocks: (B:116:0x007a, B:118:0x0080, B:21:0x00c3, B:23:0x00cd, B:24:0x00da, B:26:0x00e4, B:27:0x00f1, B:29:0x00fb, B:30:0x0108, B:32:0x0112, B:33:0x0125, B:35:0x012f, B:37:0x0136, B:41:0x0173, B:42:0x017c, B:44:0x0189, B:46:0x0192, B:47:0x01ad, B:49:0x01c2, B:50:0x01c5, B:52:0x01c9, B:104:0x0140, B:107:0x015e, B:123:0x008c, B:126:0x00aa), top: B:115:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012f A[Catch: all -> 0x00bc, TRY_LEAVE, TryCatch #7 {all -> 0x00bc, blocks: (B:116:0x007a, B:118:0x0080, B:21:0x00c3, B:23:0x00cd, B:24:0x00da, B:26:0x00e4, B:27:0x00f1, B:29:0x00fb, B:30:0x0108, B:32:0x0112, B:33:0x0125, B:35:0x012f, B:37:0x0136, B:41:0x0173, B:42:0x017c, B:44:0x0189, B:46:0x0192, B:47:0x01ad, B:49:0x01c2, B:50:0x01c5, B:52:0x01c9, B:104:0x0140, B:107:0x015e, B:123:0x008c, B:126:0x00aa), top: B:115:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0173 A[Catch: all -> 0x00bc, TryCatch #7 {all -> 0x00bc, blocks: (B:116:0x007a, B:118:0x0080, B:21:0x00c3, B:23:0x00cd, B:24:0x00da, B:26:0x00e4, B:27:0x00f1, B:29:0x00fb, B:30:0x0108, B:32:0x0112, B:33:0x0125, B:35:0x012f, B:37:0x0136, B:41:0x0173, B:42:0x017c, B:44:0x0189, B:46:0x0192, B:47:0x01ad, B:49:0x01c2, B:50:0x01c5, B:52:0x01c9, B:104:0x0140, B:107:0x015e, B:123:0x008c, B:126:0x00aa), top: B:115:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0189 A[Catch: all -> 0x00bc, TryCatch #7 {all -> 0x00bc, blocks: (B:116:0x007a, B:118:0x0080, B:21:0x00c3, B:23:0x00cd, B:24:0x00da, B:26:0x00e4, B:27:0x00f1, B:29:0x00fb, B:30:0x0108, B:32:0x0112, B:33:0x0125, B:35:0x012f, B:37:0x0136, B:41:0x0173, B:42:0x017c, B:44:0x0189, B:46:0x0192, B:47:0x01ad, B:49:0x01c2, B:50:0x01c5, B:52:0x01c9, B:104:0x0140, B:107:0x015e, B:123:0x008c, B:126:0x00aa), top: B:115:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c2 A[Catch: all -> 0x00bc, TryCatch #7 {all -> 0x00bc, blocks: (B:116:0x007a, B:118:0x0080, B:21:0x00c3, B:23:0x00cd, B:24:0x00da, B:26:0x00e4, B:27:0x00f1, B:29:0x00fb, B:30:0x0108, B:32:0x0112, B:33:0x0125, B:35:0x012f, B:37:0x0136, B:41:0x0173, B:42:0x017c, B:44:0x0189, B:46:0x0192, B:47:0x01ad, B:49:0x01c2, B:50:0x01c5, B:52:0x01c9, B:104:0x0140, B:107:0x015e, B:123:0x008c, B:126:0x00aa), top: B:115:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c9 A[Catch: all -> 0x00bc, TRY_LEAVE, TryCatch #7 {all -> 0x00bc, blocks: (B:116:0x007a, B:118:0x0080, B:21:0x00c3, B:23:0x00cd, B:24:0x00da, B:26:0x00e4, B:27:0x00f1, B:29:0x00fb, B:30:0x0108, B:32:0x0112, B:33:0x0125, B:35:0x012f, B:37:0x0136, B:41:0x0173, B:42:0x017c, B:44:0x0189, B:46:0x0192, B:47:0x01ad, B:49:0x01c2, B:50:0x01c5, B:52:0x01c9, B:104:0x0140, B:107:0x015e, B:123:0x008c, B:126:0x00aa), top: B:115:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020f A[EDGE_INSN: B:96:0x020f->B:76:0x020f BREAK  A[LOOP:1: B:57:0x01d6->B:68:0x01d6], SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzabb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc() throws IOException {
        int i;
        long j;
        int i2;
        int i3;
        int i4;
        boolean z;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean z2;
        List list5;
        int i5;
        zzhy zzhyVar;
        zzxq zzxqVar;
        zzhb zzhbVar;
        int i6;
        zzv zzvVar;
        int i7;
        int i8 = 0;
        String str4 = null;
        for (int i9 = 0; i9 == 0 && !this.zzi; i9 = i6) {
            try {
                long j2 = this.zzh.zza;
                zzhf zzi = zzi(j2, str4);
                this.zzl = zzi;
                zzhy zzhyVar2 = this.zzd;
                long zzb = zzhyVar2.zzb(zzi);
                if (this.zzi) {
                    zzxd zzxdVar = this.zze;
                    if (zzxdVar.zzd() != -1) {
                        this.zzh.zza = zzxdVar.zzd();
                    }
                    zzhd.zza(this.zzd);
                    return;
                }
                List list6 = (List) zzhyVar2.zzj().get(HttpHeaders.ETAG);
                str4 = (list6 == null || list6.isEmpty()) ? null : (String) list6.get(i8);
                if (zzb != -1) {
                    zzb += j2;
                    this.zza.zzH();
                }
                long j3 = zzb;
                zzxq zzxqVar2 = this.zza;
                Map zzj = zzhyVar2.zzj();
                List list7 = (List) zzj.get("icy-br");
                j = -1;
                if (list7 != null) {
                    try {
                        String str5 = (String) list7.get(i8);
                        try {
                            i3 = Integer.parseInt(str5) * 1000;
                        } catch (NumberFormatException unused) {
                            i3 = -1;
                        }
                        if (i3 > 0) {
                            i4 = i3;
                            z = true;
                            list = (List) zzj.get("icy-genre");
                            if (list != null) {
                                str = (String) list.get(0);
                                z = true;
                            } else {
                                str = null;
                            }
                            list2 = (List) zzj.get("icy-name");
                            if (list2 != null) {
                                str2 = (String) list2.get(0);
                                z = true;
                            } else {
                                str2 = null;
                            }
                            list3 = (List) zzj.get("icy-url");
                            if (list3 != null) {
                                str3 = (String) list3.get(0);
                                z = true;
                            } else {
                                str3 = null;
                            }
                            list4 = (List) zzj.get("icy-pub");
                            if (list4 != null) {
                                z2 = ((String) list4.get(0)).equals(AppEventsConstants.EVENT_PARAM_VALUE_YES);
                                z = true;
                            } else {
                                z2 = false;
                            }
                            list5 = (List) zzj.get("icy-metaint");
                            if (list5 != null) {
                                String str6 = (String) list5.get(0);
                                try {
                                    i7 = Integer.parseInt(str6);
                                } catch (NumberFormatException unused2) {
                                    i7 = -1;
                                }
                                if (i7 > 0) {
                                    i5 = i7;
                                    z = true;
                                    zzxqVar2.zzP(z ? new zzaic(i4, str, str2, str3, z2, i5) : null);
                                    zzhyVar = this.zzd;
                                    zzxqVar = this.zza;
                                    if (zzxqVar.zzO() != null || zzxqVar.zzO().zzf == -1) {
                                        zzhbVar = zzhyVar;
                                    } else {
                                        zzhb zzwaVar = new zzwa(zzhyVar, zzxqVar.zzO().zzf, this);
                                        zzagh zzx = zzxqVar.zzx();
                                        this.zzm = zzx;
                                        zzvVar = zzxq.zzc;
                                        zzx.zzz(zzvVar);
                                        zzhbVar = zzwaVar;
                                    }
                                    zzxd zzxdVar2 = this.zze;
                                    zzxdVar2.zza(zzhbVar, this.zzc, zzhyVar.zzj(), j2, j3, this.zzf);
                                    if (zzxqVar.zzO() != null) {
                                        zzxdVar2.zzc();
                                    }
                                    if (this.zzj) {
                                        zzxdVar2.zze(j2, this.zzk);
                                        i = 0;
                                        try {
                                            this.zzj = false;
                                        } catch (Throwable th) {
                                            th = th;
                                            i2 = i;
                                            if (i2 != 1) {
                                                zzxd zzxdVar3 = this.zze;
                                                if (zzxdVar3.zzd() != j) {
                                                    this.zzh.zza = zzxdVar3.zzd();
                                                }
                                            }
                                            zzhd.zza(this.zzd);
                                            throw th;
                                        }
                                    } else {
                                        i = 0;
                                    }
                                    i6 = i;
                                    while (true) {
                                        if (i6 != 0) {
                                            break;
                                        }
                                        try {
                                            if (this.zzi) {
                                                i6 = i;
                                                break;
                                            }
                                            try {
                                                zzdq zzdqVar = this.zzg;
                                                zzdqVar.zzc();
                                                i6 = zzxdVar2.zzf(this.zzh);
                                                long zzd = zzxdVar2.zzd();
                                                if (zzd > zzxqVar.zzL() + j2) {
                                                    zzdqVar.zzb();
                                                    zzxqVar.zzN().post(zzxqVar.zzM());
                                                    j2 = zzd;
                                                }
                                            } catch (InterruptedException unused3) {
                                                throw new InterruptedIOException();
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            i2 = i6;
                                            if (i2 != 1) {
                                            }
                                            zzhd.zza(this.zzd);
                                            throw th;
                                        }
                                    }
                                    if (i6 == 1) {
                                        i6 = i;
                                    } else if (zzxdVar2.zzd() != -1) {
                                        this.zzh.zza = zzxdVar2.zzd();
                                    }
                                    zzhd.zza(zzhyVar);
                                    i8 = i;
                                } else {
                                    try {
                                        StringBuilder sb = new StringBuilder(String.valueOf(str6).length() + 27);
                                        sb.append("Invalid metadata interval: ");
                                        sb.append(str6);
                                        zzee.zzc("IcyHeaders", sb.toString());
                                    } catch (NumberFormatException unused4) {
                                        String.valueOf(str6);
                                        zzee.zzc("IcyHeaders", "Invalid metadata interval: ".concat(String.valueOf(str6)));
                                        i5 = i7;
                                        zzxqVar2.zzP(z ? new zzaic(i4, str, str2, str3, z2, i5) : null);
                                        zzhyVar = this.zzd;
                                        zzxqVar = this.zza;
                                        if (zzxqVar.zzO() != null) {
                                        }
                                        zzhbVar = zzhyVar;
                                        zzxd zzxdVar22 = this.zze;
                                        zzxdVar22.zza(zzhbVar, this.zzc, zzhyVar.zzj(), j2, j3, this.zzf);
                                        if (zzxqVar.zzO() != null) {
                                        }
                                        if (this.zzj) {
                                        }
                                        i6 = i;
                                        while (true) {
                                            if (i6 != 0) {
                                            }
                                        }
                                        if (i6 == 1) {
                                        }
                                        zzhd.zza(zzhyVar);
                                        i8 = i;
                                    }
                                }
                            }
                            i5 = -1;
                            zzxqVar2.zzP(z ? new zzaic(i4, str, str2, str3, z2, i5) : null);
                            zzhyVar = this.zzd;
                            zzxqVar = this.zza;
                            if (zzxqVar.zzO() != null) {
                            }
                            zzhbVar = zzhyVar;
                            zzxd zzxdVar222 = this.zze;
                            zzxdVar222.zza(zzhbVar, this.zzc, zzhyVar.zzj(), j2, j3, this.zzf);
                            if (zzxqVar.zzO() != null) {
                            }
                            if (this.zzj) {
                            }
                            i6 = i;
                            while (true) {
                                if (i6 != 0) {
                                }
                            }
                            if (i6 == 1) {
                            }
                            zzhd.zza(zzhyVar);
                            i8 = i;
                        } else {
                            try {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 17);
                                sb2.append("Invalid bitrate: ");
                                sb2.append(str5);
                                zzee.zzc("IcyHeaders", sb2.toString());
                            } catch (NumberFormatException unused5) {
                                String.valueOf(str5);
                                zzee.zzc("IcyHeaders", "Invalid bitrate header: ".concat(String.valueOf(str5)));
                                i4 = i3;
                                z = false;
                                list = (List) zzj.get("icy-genre");
                                if (list != null) {
                                }
                                list2 = (List) zzj.get("icy-name");
                                if (list2 != null) {
                                }
                                list3 = (List) zzj.get("icy-url");
                                if (list3 != null) {
                                }
                                list4 = (List) zzj.get("icy-pub");
                                if (list4 != null) {
                                }
                                list5 = (List) zzj.get("icy-metaint");
                                if (list5 != null) {
                                }
                                i5 = -1;
                                zzxqVar2.zzP(z ? new zzaic(i4, str, str2, str3, z2, i5) : null);
                                zzhyVar = this.zzd;
                                zzxqVar = this.zza;
                                if (zzxqVar.zzO() != null) {
                                }
                                zzhbVar = zzhyVar;
                                zzxd zzxdVar2222 = this.zze;
                                zzxdVar2222.zza(zzhbVar, this.zzc, zzhyVar.zzj(), j2, j3, this.zzf);
                                if (zzxqVar.zzO() != null) {
                                }
                                if (this.zzj) {
                                }
                                i6 = i;
                                while (true) {
                                    if (i6 != 0) {
                                    }
                                }
                                if (i6 == 1) {
                                }
                                zzhd.zza(zzhyVar);
                                i8 = i;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        i = 0;
                        i2 = i;
                        if (i2 != 1) {
                        }
                        zzhd.zza(this.zzd);
                        throw th;
                    }
                }
                z = false;
                i4 = -1;
                list = (List) zzj.get("icy-genre");
                if (list != null) {
                }
                list2 = (List) zzj.get("icy-name");
                if (list2 != null) {
                }
                list3 = (List) zzj.get("icy-url");
                if (list3 != null) {
                }
                list4 = (List) zzj.get("icy-pub");
                if (list4 != null) {
                }
                list5 = (List) zzj.get("icy-metaint");
                if (list5 != null) {
                }
                i5 = -1;
                zzxqVar2.zzP(z ? new zzaic(i4, str, str2, str3, z2, i5) : null);
                zzhyVar = this.zzd;
                zzxqVar = this.zza;
                if (zzxqVar.zzO() != null) {
                }
                zzhbVar = zzhyVar;
                zzxd zzxdVar22222 = this.zze;
                zzxdVar22222.zza(zzhbVar, this.zzc, zzhyVar.zzj(), j2, j3, this.zzf);
                if (zzxqVar.zzO() != null) {
                }
                if (this.zzj) {
                }
                i6 = i;
                while (true) {
                    if (i6 != 0) {
                    }
                }
                if (i6 == 1) {
                }
                zzhd.zza(zzhyVar);
                i8 = i;
            } catch (Throwable th4) {
                th = th4;
                i = i8;
                j = -1;
            }
        }
    }

    final /* synthetic */ void zzd(long j, long j2) {
        this.zzh.zza = j;
        this.zzk = j2;
        this.zzj = true;
        this.zzn = false;
    }

    final /* synthetic */ long zze() {
        return this.zzb;
    }

    final /* synthetic */ zzhy zzf() {
        return this.zzd;
    }

    final /* synthetic */ long zzg() {
        return this.zzk;
    }

    final /* synthetic */ zzhf zzh() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzer zzerVar) {
        long max = !this.zzn ? this.zzk : Math.max(this.zza.zzI(true), this.zzk);
        int zzd = zzerVar.zzd();
        zzagh zzaghVar = this.zzm;
        zzaghVar.getClass();
        zzaghVar.zzc(zzerVar, zzd);
        zzaghVar.zze(max, 1, zzd, 0, null);
        this.zzn = true;
    }
}
