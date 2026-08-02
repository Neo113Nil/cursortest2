package com.google.android.gms.internal.ads;

import androidx.core.view.ViewCompat;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzain {
    public static zzbj zza(zzek zzekVar) {
        String str;
        zzbj zzafpVar;
        int zzd = zzekVar.zzd() + zzekVar.zzg();
        int zzg = zzekVar.zzg();
        int i = (zzg >> 24) & 255;
        zzbj zzbjVar = null;
        try {
            if (i == 169 || i == 253) {
                int i2 = zzg & ViewCompat.MEASURED_SIZE_MASK;
                if (i2 == 6516084) {
                    int zzg2 = zzekVar.zzg();
                    if (zzekVar.zzg() == 1684108385) {
                        zzekVar.zzL(8);
                        String zzz = zzekVar.zzz(zzg2 - 16);
                        zzbjVar = new zzafx("und", zzz, zzz);
                    } else {
                        zzea.zzf("MetadataUtil", "Failed to parse comment attribute: ".concat(zzahx.zzf(zzg)));
                    }
                } else {
                    if (i2 != 7233901 && i2 != 7631467) {
                        if (i2 != 6516589 && i2 != 7828084) {
                            if (i2 == 6578553) {
                                zzbjVar = zze(zzg, "TDRC", zzekVar);
                            } else if (i2 == 4280916) {
                                zzbjVar = zze(zzg, "TPE1", zzekVar);
                            } else if (i2 == 7630703) {
                                zzbjVar = zze(zzg, "TSSE", zzekVar);
                            } else if (i2 == 6384738) {
                                zzbjVar = zze(zzg, "TALB", zzekVar);
                            } else if (i2 == 7108978) {
                                zzbjVar = zze(zzg, "USLT", zzekVar);
                            } else if (i2 == 6776174) {
                                zzbjVar = zze(zzg, "TCON", zzekVar);
                            } else {
                                if (i2 == 6779504) {
                                    zzbjVar = zze(zzg, "TIT1", zzekVar);
                                }
                                zzea.zzb("MetadataUtil", "Skipped unknown metadata entry: " + zzahx.zzf(zzg));
                            }
                        }
                        zzbjVar = zze(zzg, "TCOM", zzekVar);
                    }
                    zzbjVar = zze(zzg, "TIT2", zzekVar);
                }
            } else if (zzg == 1735291493) {
                String zza = zzage.zza(zzb(zzekVar) - 1);
                if (zza != null) {
                    zzafpVar = new zzagm("TCON", null, zzfxr.zzn(zza));
                    zzbjVar = zzafpVar;
                } else {
                    zzea.zzf("MetadataUtil", "Failed to parse standard genre code");
                }
            } else if (zzg == 1684632427) {
                zzbjVar = zzd(1684632427, "TPOS", zzekVar);
            } else if (zzg == 1953655662) {
                zzbjVar = zzd(1953655662, "TRCK", zzekVar);
            } else if (zzg == 1953329263) {
                zzbjVar = zzc(1953329263, "TBPM", zzekVar, true, false);
            } else if (zzg == 1668311404) {
                zzbjVar = zzc(1668311404, "TCMP", zzekVar, true, true);
            } else if (zzg == 1668249202) {
                int zzg3 = zzekVar.zzg();
                if (zzekVar.zzg() == 1684108385) {
                    int zzg4 = zzekVar.zzg() & ViewCompat.MEASURED_SIZE_MASK;
                    if (zzg4 == 13) {
                        str = "image/jpeg";
                    } else if (zzg4 == 14) {
                        str = "image/png";
                        zzg4 = 14;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        zzea.zzf("MetadataUtil", "Unrecognized cover art flags: " + zzg4);
                    } else {
                        zzekVar.zzL(4);
                        int i3 = zzg3 - 16;
                        byte[] bArr = new byte[i3];
                        zzekVar.zzG(bArr, 0, i3);
                        zzafpVar = new zzafp(str, null, 3, bArr);
                        zzbjVar = zzafpVar;
                    }
                } else {
                    zzea.zzf("MetadataUtil", "Failed to parse cover art attribute");
                }
            } else if (zzg == 1631670868) {
                zzbjVar = zze(1631670868, "TPE2", zzekVar);
            } else if (zzg == 1936682605) {
                zzbjVar = zze(1936682605, "TSOT", zzekVar);
            } else if (zzg == 1936679276) {
                zzbjVar = zze(1936679276, "TSOA", zzekVar);
            } else if (zzg == 1936679282) {
                zzbjVar = zze(1936679282, "TSOP", zzekVar);
            } else if (zzg == 1936679265) {
                zzbjVar = zze(1936679265, "TSO2", zzekVar);
            } else if (zzg == 1936679791) {
                zzbjVar = zze(1936679791, "TSOC", zzekVar);
            } else if (zzg == 1920233063) {
                zzbjVar = zzc(1920233063, "ITUNESADVISORY", zzekVar, false, false);
            } else if (zzg == 1885823344) {
                zzbjVar = zzc(1885823344, "ITUNESGAPLESS", zzekVar, false, true);
            } else if (zzg == 1936683886) {
                zzbjVar = zze(1936683886, "TVSHOWSORT", zzekVar);
            } else if (zzg == 1953919848) {
                zzbjVar = zze(1953919848, "TVSHOW", zzekVar);
            } else {
                if (zzg == 757935405) {
                    String str2 = null;
                    String str3 = null;
                    int i4 = -1;
                    int i5 = -1;
                    while (zzekVar.zzd() < zzd) {
                        int zzd2 = zzekVar.zzd();
                        int zzg5 = zzekVar.zzg();
                        int zzg6 = zzekVar.zzg();
                        zzekVar.zzL(4);
                        if (zzg6 == 1835360622) {
                            str2 = zzekVar.zzz(zzg5 - 12);
                        } else {
                            int i6 = zzg5 - 12;
                            if (zzg6 == 1851878757) {
                                str3 = zzekVar.zzz(i6);
                            } else {
                                if (zzg6 == 1684108385) {
                                    i5 = zzg5;
                                }
                                if (zzg6 == 1684108385) {
                                    i4 = zzd2;
                                }
                                zzekVar.zzL(i6);
                            }
                        }
                    }
                    if (str2 != null && str3 != null && i4 != -1) {
                        zzekVar.zzK(i4);
                        zzekVar.zzL(16);
                        zzbjVar = new zzagg(str2, str3, zzekVar.zzz(i5 - 16));
                    }
                }
                zzea.zzb("MetadataUtil", "Skipped unknown metadata entry: " + zzahx.zzf(zzg));
            }
            return zzbjVar;
        } finally {
            zzekVar.zzK(zzd);
        }
    }

    private static int zzb(zzek zzekVar) {
        int zzg = zzekVar.zzg();
        if (zzekVar.zzg() == 1684108385) {
            zzekVar.zzL(8);
            int i = zzg - 16;
            if (i == 1) {
                return zzekVar.zzm();
            }
            if (i == 2) {
                return zzekVar.zzq();
            }
            if (i == 3) {
                return zzekVar.zzo();
            }
            if (i == 4 && (zzekVar.zzf() & 128) == 0) {
                return zzekVar.zzp();
            }
        }
        zzea.zzf("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static zzagd zzc(int i, String str, zzek zzekVar, boolean z, boolean z2) {
        int zzb = zzb(zzekVar);
        if (z2) {
            zzb = Math.min(1, zzb);
        }
        if (zzb >= 0) {
            return z ? new zzagm(str, null, zzfxr.zzn(Integer.toString(zzb))) : new zzafx("und", str, Integer.toString(zzb));
        }
        zzea.zzf("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzahx.zzf(i)));
        return null;
    }

    private static zzagm zzd(int i, String str, zzek zzekVar) {
        int zzg = zzekVar.zzg();
        if (zzekVar.zzg() == 1684108385 && zzg >= 22) {
            zzekVar.zzL(10);
            int zzq = zzekVar.zzq();
            if (zzq > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(zzq);
                String sb2 = sb.toString();
                int zzq2 = zzekVar.zzq();
                if (zzq2 > 0) {
                    sb2 = sb2 + "/" + zzq2;
                }
                return new zzagm(str, null, zzfxr.zzn(sb2));
            }
        }
        zzea.zzf("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzahx.zzf(i)));
        return null;
    }

    private static zzagm zze(int i, String str, zzek zzekVar) {
        int zzg = zzekVar.zzg();
        if (zzekVar.zzg() == 1684108385) {
            zzekVar.zzL(8);
            return new zzagm(str, null, zzfxr.zzn(zzekVar.zzz(zzg - 16)));
        }
        zzea.zzf("MetadataUtil", "Failed to parse text attribute: ".concat(zzahx.zzf(i)));
        return null;
    }
}
