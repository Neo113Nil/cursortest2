package com.google.android.gms.internal.ads;

import androidx.core.view.ViewCompat;
import com.google.common.net.HttpHeaders;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzaih {
    static final String[] zza = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", HttpHeaders.TRAILER, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    public static final /* synthetic */ int zzb = 0;

    public static zzca zza(zzfj zzfjVar) {
        String str;
        zzca zzafmVar;
        int zzc = zzfjVar.zzc() + zzfjVar.zzf();
        int zzf = zzfjVar.zzf();
        int i = (zzf >> 24) & 255;
        zzca zzcaVar = null;
        try {
            if (i == 169 || i == 253) {
                int i2 = zzf & ViewCompat.MEASURED_SIZE_MASK;
                if (i2 == 6516084) {
                    int zzf2 = zzfjVar.zzf();
                    if (zzfjVar.zzf() == 1684108385) {
                        zzfjVar.zzH(8);
                        String zzx = zzfjVar.zzx(zzf2 - 16);
                        zzcaVar = new zzafu("und", zzx, zzx);
                    } else {
                        zzez.zzf("MetadataUtil", "Failed to parse comment attribute: ".concat(zzahs.zzf(zzf)));
                    }
                } else {
                    if (i2 != 7233901 && i2 != 7631467) {
                        if (i2 != 6516589 && i2 != 7828084) {
                            if (i2 == 6578553) {
                                zzcaVar = zze(zzf, "TDRC", zzfjVar);
                            } else if (i2 == 4280916) {
                                zzcaVar = zze(zzf, "TPE1", zzfjVar);
                            } else if (i2 == 7630703) {
                                zzcaVar = zze(zzf, "TSSE", zzfjVar);
                            } else if (i2 == 6384738) {
                                zzcaVar = zze(zzf, "TALB", zzfjVar);
                            } else if (i2 == 7108978) {
                                zzcaVar = zze(zzf, "USLT", zzfjVar);
                            } else if (i2 == 6776174) {
                                zzcaVar = zze(zzf, "TCON", zzfjVar);
                            } else {
                                if (i2 == 6779504) {
                                    zzcaVar = zze(zzf, "TIT1", zzfjVar);
                                }
                                zzez.zzb("MetadataUtil", "Skipped unknown metadata entry: " + zzahs.zzf(zzf));
                            }
                        }
                        zzcaVar = zze(zzf, "TCOM", zzfjVar);
                    }
                    zzcaVar = zze(zzf, "TIT2", zzfjVar);
                }
            } else if (zzf == 1735291493) {
                int zzb2 = zzb(zzfjVar);
                String str2 = (zzb2 <= 0 || zzb2 > 192) ? null : zza[zzb2 - 1];
                if (str2 != null) {
                    zzafmVar = new zzagj("TCON", null, zzfwu.zzm(str2));
                    zzcaVar = zzafmVar;
                } else {
                    zzez.zzf("MetadataUtil", "Failed to parse standard genre code");
                }
            } else if (zzf == 1684632427) {
                zzcaVar = zzd(1684632427, "TPOS", zzfjVar);
            } else if (zzf == 1953655662) {
                zzcaVar = zzd(1953655662, "TRCK", zzfjVar);
            } else if (zzf == 1953329263) {
                zzcaVar = zzc(1953329263, "TBPM", zzfjVar, true, false);
            } else if (zzf == 1668311404) {
                zzcaVar = zzc(1668311404, "TCMP", zzfjVar, true, true);
            } else if (zzf == 1668249202) {
                int zzf3 = zzfjVar.zzf();
                if (zzfjVar.zzf() == 1684108385) {
                    int zzf4 = zzfjVar.zzf() & ViewCompat.MEASURED_SIZE_MASK;
                    if (zzf4 == 13) {
                        str = "image/jpeg";
                    } else if (zzf4 == 14) {
                        str = "image/png";
                        zzf4 = 14;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        zzez.zzf("MetadataUtil", "Unrecognized cover art flags: " + zzf4);
                    } else {
                        zzfjVar.zzH(4);
                        int i3 = zzf3 - 16;
                        byte[] bArr = new byte[i3];
                        zzfjVar.zzC(bArr, 0, i3);
                        zzafmVar = new zzafm(str, null, 3, bArr);
                        zzcaVar = zzafmVar;
                    }
                } else {
                    zzez.zzf("MetadataUtil", "Failed to parse cover art attribute");
                }
            } else if (zzf == 1631670868) {
                zzcaVar = zze(1631670868, "TPE2", zzfjVar);
            } else if (zzf == 1936682605) {
                zzcaVar = zze(1936682605, "TSOT", zzfjVar);
            } else if (zzf == 1936679276) {
                zzcaVar = zze(1936679276, "TSO2", zzfjVar);
            } else if (zzf == 1936679282) {
                zzcaVar = zze(1936679282, "TSOA", zzfjVar);
            } else if (zzf == 1936679265) {
                zzcaVar = zze(1936679265, "TSOP", zzfjVar);
            } else if (zzf == 1936679791) {
                zzcaVar = zze(1936679791, "TSOC", zzfjVar);
            } else if (zzf == 1920233063) {
                zzcaVar = zzc(1920233063, "ITUNESADVISORY", zzfjVar, false, false);
            } else if (zzf == 1885823344) {
                zzcaVar = zzc(1885823344, "ITUNESGAPLESS", zzfjVar, false, true);
            } else if (zzf == 1936683886) {
                zzcaVar = zze(1936683886, "TVSHOWSORT", zzfjVar);
            } else if (zzf == 1953919848) {
                zzcaVar = zze(1953919848, "TVSHOW", zzfjVar);
            } else {
                if (zzf == 757935405) {
                    int i4 = -1;
                    int i5 = -1;
                    String str3 = null;
                    String str4 = null;
                    while (zzfjVar.zzc() < zzc) {
                        int zzc2 = zzfjVar.zzc();
                        int zzf5 = zzfjVar.zzf();
                        int zzf6 = zzfjVar.zzf();
                        zzfjVar.zzH(4);
                        if (zzf6 == 1835360622) {
                            str3 = zzfjVar.zzx(zzf5 - 12);
                        } else {
                            int i6 = zzf5 - 12;
                            if (zzf6 == 1851878757) {
                                str4 = zzfjVar.zzx(i6);
                            } else {
                                if (zzf6 == 1684108385) {
                                    i5 = zzf5;
                                }
                                if (zzf6 == 1684108385) {
                                    i4 = zzc2;
                                }
                                zzfjVar.zzH(i6);
                            }
                        }
                    }
                    if (str3 != null && str4 != null && i4 != -1) {
                        zzfjVar.zzG(i4);
                        zzfjVar.zzH(16);
                        zzcaVar = new zzagd(str3, str4, zzfjVar.zzx(i5 - 16));
                    }
                }
                zzez.zzb("MetadataUtil", "Skipped unknown metadata entry: " + zzahs.zzf(zzf));
            }
            return zzcaVar;
        } finally {
            zzfjVar.zzG(zzc);
        }
    }

    private static int zzb(zzfj zzfjVar) {
        zzfjVar.zzH(4);
        if (zzfjVar.zzf() == 1684108385) {
            zzfjVar.zzH(8);
            return zzfjVar.zzl();
        }
        zzez.zzf("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    private static zzagb zzc(int i, String str, zzfj zzfjVar, boolean z, boolean z2) {
        int zzb2 = zzb(zzfjVar);
        if (z2) {
            zzb2 = Math.min(1, zzb2);
        }
        if (zzb2 >= 0) {
            return z ? new zzagj(str, null, zzfwu.zzm(Integer.toString(zzb2))) : new zzafu("und", str, Integer.toString(zzb2));
        }
        zzez.zzf("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzahs.zzf(i)));
        return null;
    }

    private static zzagj zzd(int i, String str, zzfj zzfjVar) {
        int zzf = zzfjVar.zzf();
        if (zzfjVar.zzf() == 1684108385 && zzf >= 22) {
            zzfjVar.zzH(10);
            int zzp = zzfjVar.zzp();
            if (zzp > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(zzp);
                String sb2 = sb.toString();
                int zzp2 = zzfjVar.zzp();
                if (zzp2 > 0) {
                    sb2 = sb2 + "/" + zzp2;
                }
                return new zzagj(str, null, zzfwu.zzm(sb2));
            }
        }
        zzez.zzf("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzahs.zzf(i)));
        return null;
    }

    private static zzagj zze(int i, String str, zzfj zzfjVar) {
        int zzf = zzfjVar.zzf();
        if (zzfjVar.zzf() == 1684108385) {
            zzfjVar.zzH(8);
            return new zzagj(str, null, zzfwu.zzm(zzfjVar.zzx(zzf - 16)));
        }
        zzez.zzf("MetadataUtil", "Failed to parse text attribute: ".concat(zzahs.zzf(i)));
        return null;
    }
}
