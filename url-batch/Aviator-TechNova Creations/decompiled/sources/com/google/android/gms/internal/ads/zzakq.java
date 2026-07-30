package com.google.android.gms.internal.ads;

import androidx.core.view.ViewCompat;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzakq {
    public static void zza(int i, zzap zzapVar, zzt zztVar, zzap zzapVar2, zzap... zzapVarArr) {
        if (zzapVar2 == null) {
            zzapVar2 = new zzap(-9223372036854775807L, new zzao[0]);
        }
        if (zzapVar != null) {
            zzguf zzd = zzapVar.zzd(zzfs.class);
            int size = zzd.size();
            for (int i2 = 0; i2 < size; i2++) {
                zzfs zzfsVar = (zzfs) zzd.get(i2);
                if (!zzfsVar.zza.equals("com.android.capture.fps") || i == 2) {
                    zzapVar2 = zzapVar2.zzg(zzfsVar);
                }
            }
        }
        for (zzap zzapVar3 : zzapVarArr) {
            zzapVar2 = zzapVar2.zzf(zzapVar3);
        }
        if (zzapVar2.zza() > 0) {
            zztVar.zzk(zzapVar2);
        }
    }

    public static void zzb(int i, zzafn zzafnVar, zzt zztVar) {
        if (i == 1 && zzafnVar.zzb()) {
            zztVar.zzH(zzafnVar.zza);
            zztVar.zzI(zzafnVar.zzb);
        }
    }

    public static zzao zzc(zzer zzerVar) {
        String str;
        zzao zzaidVar;
        int zzg = zzerVar.zzg() + zzerVar.zzB();
        int zzB = zzerVar.zzB();
        int i = (zzB >> 24) & 255;
        zzao zzaoVar = null;
        try {
            if (i == 169 || i == 253) {
                int i2 = zzB & ViewCompat.MEASURED_SIZE_MASK;
                if (i2 == 6516084) {
                    int zzB2 = zzerVar.zzB();
                    if (zzerVar.zzB() == 1684108385) {
                        zzerVar.zzk(8);
                        String zzL = zzerVar.zzL(zzB2 - 16);
                        zzaoVar = new zzaih("und", zzL, zzL);
                    } else {
                        zzee.zzc("MetadataUtil", "Failed to parse comment attribute: ".concat(zzfw.zze(zzB)));
                    }
                } else {
                    if (i2 != 7233901 && i2 != 7631467) {
                        if (i2 != 6516589 && i2 != 7828084) {
                            if (i2 == 6578553) {
                                zzaoVar = zzd(zzB, "TDRC", zzerVar);
                            } else if (i2 == 4280916) {
                                zzaoVar = zzd(zzB, "TPE1", zzerVar);
                            } else if (i2 == 7630703) {
                                zzaoVar = zzd(zzB, "TSSE", zzerVar);
                            } else if (i2 == 6384738) {
                                zzaoVar = zzd(zzB, "TALB", zzerVar);
                            } else if (i2 == 7108978) {
                                zzaoVar = zzd(zzB, "USLT", zzerVar);
                            } else if (i2 == 6776174) {
                                zzaoVar = zzd(zzB, "TCON", zzerVar);
                            } else if (i2 == 6779504) {
                                zzaoVar = zzd(zzB, "TIT1", zzerVar);
                            } else if (i2 == 7173742) {
                                zzaoVar = zzd(zzB, "MVNM", zzerVar);
                            } else {
                                if (i2 == 7173737) {
                                    zzaoVar = zze(zzB, "MVIN", zzerVar, true, false);
                                }
                                String zze = zzfw.zze(zzB);
                                StringBuilder sb = new StringBuilder(zze.length() + 32);
                                sb.append("Skipped unknown metadata entry: ");
                                sb.append(zze);
                                zzee.zza("MetadataUtil", sb.toString());
                            }
                        }
                        zzaoVar = zzd(zzB, "TCOM", zzerVar);
                    }
                    zzaoVar = zzd(zzB, "TIT2", zzerVar);
                }
            } else if (zzB == 1735291493) {
                String zza = zzaio.zza(zzf(zzerVar) - 1);
                if (zza != null) {
                    zzaidVar = new zzais("TCON", null, zzguf.zzj(zza));
                    zzaoVar = zzaidVar;
                } else {
                    zzee.zzc("MetadataUtil", "Failed to parse standard genre code");
                }
            } else if (zzB == 1684632427) {
                zzaoVar = zzg(1684632427, "TPOS", zzerVar);
            } else if (zzB == 1953655662) {
                zzaoVar = zzg(1953655662, "TRCK", zzerVar);
            } else if (zzB == 1953329263) {
                zzaoVar = zze(1953329263, "TBPM", zzerVar, true, false);
            } else if (zzB == 1668311404) {
                zzaoVar = zze(1668311404, "TCMP", zzerVar, true, true);
            } else if (zzB == 1668249202) {
                int zzB3 = zzerVar.zzB();
                if (zzerVar.zzB() == 1684108385) {
                    int zzB4 = zzerVar.zzB();
                    int i3 = zzakh.zza;
                    int i4 = zzB4 & ViewCompat.MEASURED_SIZE_MASK;
                    if (i4 == 13) {
                        str = "image/jpeg";
                    } else if (i4 == 14) {
                        str = "image/png";
                        i4 = 14;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 30);
                        sb2.append("Unrecognized cover art flags: ");
                        sb2.append(i4);
                        zzee.zzc("MetadataUtil", sb2.toString());
                    } else {
                        zzerVar.zzk(4);
                        int i5 = zzB3 - 16;
                        byte[] bArr = new byte[i5];
                        zzerVar.zzm(bArr, 0, i5);
                        zzaidVar = new zzaid(str, null, 3, bArr);
                        zzaoVar = zzaidVar;
                    }
                } else {
                    zzee.zzc("MetadataUtil", "Failed to parse cover art attribute");
                }
            } else if (zzB == 1631670868) {
                zzaoVar = zzd(1631670868, "TPE2", zzerVar);
            } else if (zzB == 1936682605) {
                zzaoVar = zzd(1936682605, "TSOT", zzerVar);
            } else if (zzB == 1936679276) {
                zzaoVar = zzd(1936679276, "TSOA", zzerVar);
            } else if (zzB == 1936679282) {
                zzaoVar = zzd(1936679282, "TSOP", zzerVar);
            } else if (zzB == 1936679265) {
                zzaoVar = zzd(1936679265, "TSO2", zzerVar);
            } else if (zzB == 1936679791) {
                zzaoVar = zzd(1936679791, "TSOC", zzerVar);
            } else if (zzB == 1920233063) {
                zzaoVar = zze(1920233063, "ITUNESADVISORY", zzerVar, false, false);
            } else if (zzB == 1885823344) {
                zzaoVar = zze(1885823344, "ITUNESGAPLESS", zzerVar, false, true);
            } else if (zzB == 1936683886) {
                zzaoVar = zzd(1936683886, "TVSHOWSORT", zzerVar);
            } else if (zzB == 1953919848) {
                zzaoVar = zzd(1953919848, "TVSHOW", zzerVar);
            } else {
                if (zzB == 757935405) {
                    int i6 = -1;
                    int i7 = -1;
                    String str2 = null;
                    String str3 = null;
                    while (zzerVar.zzg() < zzg) {
                        int zzg2 = zzerVar.zzg();
                        int zzB5 = zzerVar.zzB();
                        int zzB6 = zzerVar.zzB();
                        zzerVar.zzk(4);
                        if (zzB6 == 1835360622) {
                            str2 = zzerVar.zzL(zzB5 - 12);
                        } else {
                            int i8 = zzB5 - 12;
                            if (zzB6 == 1851878757) {
                                str3 = zzerVar.zzL(i8);
                            } else {
                                if (zzB6 == 1684108385) {
                                    i7 = zzB5;
                                }
                                if (zzB6 == 1684108385) {
                                    i6 = zzg2;
                                }
                                zzerVar.zzk(i8);
                            }
                        }
                    }
                    if (str2 != null && str3 != null && i6 != -1) {
                        zzerVar.zzh(i6);
                        zzerVar.zzk(16);
                        zzaoVar = new zzaip(str2, str3, zzerVar.zzL(i7 - 16));
                    }
                }
                String zze2 = zzfw.zze(zzB);
                StringBuilder sb3 = new StringBuilder(zze2.length() + 32);
                sb3.append("Skipped unknown metadata entry: ");
                sb3.append(zze2);
                zzee.zza("MetadataUtil", sb3.toString());
            }
            return zzaoVar;
        } finally {
            zzerVar.zzh(zzg);
        }
    }

    private static zzais zzd(int i, String str, zzer zzerVar) {
        int zzB = zzerVar.zzB();
        if (zzerVar.zzB() == 1684108385) {
            zzerVar.zzk(8);
            return new zzais(str, null, zzguf.zzj(zzerVar.zzL(zzB - 16)));
        }
        zzee.zzc("MetadataUtil", "Failed to parse text attribute: ".concat(zzfw.zze(i)));
        return null;
    }

    private static zzain zze(int i, String str, zzer zzerVar, boolean z, boolean z2) {
        int zzf = zzf(zzerVar);
        if (z2) {
            zzf = Math.min(1, zzf);
        }
        if (zzf >= 0) {
            return z ? new zzais(str, null, zzguf.zzj(Integer.toString(zzf))) : new zzaih("und", str, Integer.toString(zzf));
        }
        zzee.zzc("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzfw.zze(i)));
        return null;
    }

    private static int zzf(zzer zzerVar) {
        int zzB = zzerVar.zzB();
        if (zzerVar.zzB() == 1684108385) {
            zzerVar.zzk(8);
            int i = zzB - 16;
            if (i == 1) {
                return zzerVar.zzs();
            }
            if (i == 2) {
                return zzerVar.zzt();
            }
            if (i == 3) {
                return zzerVar.zzx();
            }
            if (i == 4 && (zzerVar.zzn() & 128) == 0) {
                return zzerVar.zzH();
            }
        }
        zzee.zzc("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static zzais zzg(int i, String str, zzer zzerVar) {
        int zzB = zzerVar.zzB();
        if (zzerVar.zzB() == 1684108385 && zzB >= 22) {
            zzerVar.zzk(10);
            int zzt = zzerVar.zzt();
            if (zzt > 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(zzt).length());
                sb.append(zzt);
                String sb2 = sb.toString();
                int zzt2 = zzerVar.zzt();
                if (zzt2 > 0) {
                    StringBuilder sb3 = new StringBuilder(sb2.length() + 1 + String.valueOf(zzt2).length());
                    sb3.append(sb2);
                    sb3.append("/");
                    sb3.append(zzt2);
                    sb2 = sb3.toString();
                }
                return new zzais(str, null, zzguf.zzj(sb2));
            }
        }
        zzee.zzc("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzfw.zze(i)));
        return null;
    }
}
