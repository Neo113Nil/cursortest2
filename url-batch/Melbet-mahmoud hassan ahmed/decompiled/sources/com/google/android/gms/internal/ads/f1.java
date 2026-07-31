package com.google.android.gms.internal.ads;

import android.util.Log;

/* loaded from: classes.dex */
final class f1 {

    /* renamed from: a, reason: collision with root package name */
    static final String[] f4936a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f4937b = 0;

    public static b81 a(dr2 dr2Var) {
        String str;
        String str2;
        int k7 = dr2Var.k() + dr2Var.m();
        int m7 = dr2Var.m();
        int i7 = (m7 >> 24) & 255;
        b81 b81Var = null;
        try {
            if (i7 == 169 || i7 == 253) {
                int i8 = m7 & 16777215;
                if (i8 == 6516084) {
                    int m8 = dr2Var.m();
                    if (dr2Var.m() == 1684108385) {
                        dr2Var.g(8);
                        String E = dr2Var.E(m8 - 16);
                        b81Var = new pf4("und", E, E);
                    } else {
                        String b7 = q0.b(m7);
                        Log.w("MetadataUtil", b7.length() != 0 ? "Failed to parse comment attribute: ".concat(b7) : new String("Failed to parse comment attribute: "));
                    }
                    return b81Var;
                }
                if (i8 == 7233901 || i8 == 7631467) {
                    return e(m7, "TIT2", dr2Var);
                }
                if (i8 == 6516589 || i8 == 7828084) {
                    return e(m7, "TCOM", dr2Var);
                }
                if (i8 == 6578553) {
                    return e(m7, "TDRC", dr2Var);
                }
                if (i8 == 4280916) {
                    return e(m7, "TPE1", dr2Var);
                }
                if (i8 == 7630703) {
                    return e(m7, "TSSE", dr2Var);
                }
                if (i8 == 6384738) {
                    return e(m7, "TALB", dr2Var);
                }
                if (i8 == 7108978) {
                    return e(m7, "USLT", dr2Var);
                }
                if (i8 == 6776174) {
                    return e(m7, "TCON", dr2Var);
                }
                if (i8 == 6779504) {
                    return e(m7, "TIT1", dr2Var);
                }
            } else {
                if (m7 == 1735291493) {
                    int b8 = b(dr2Var);
                    String str3 = (b8 <= 0 || b8 > 192) ? null : f4936a[b8 - 1];
                    if (str3 != null) {
                        b81Var = new e("TCON", null, str3);
                    } else {
                        Log.w("MetadataUtil", "Failed to parse standard genre code");
                    }
                    return b81Var;
                }
                if (m7 == 1684632427) {
                    return d(1684632427, "TPOS", dr2Var);
                }
                if (m7 == 1953655662) {
                    return d(1953655662, "TRCK", dr2Var);
                }
                if (m7 == 1953329263) {
                    return c(1953329263, "TBPM", dr2Var, true, false);
                }
                if (m7 == 1668311404) {
                    return c(1668311404, "TCMP", dr2Var, true, true);
                }
                if (m7 == 1668249202) {
                    int m9 = dr2Var.m();
                    if (dr2Var.m() == 1684108385) {
                        int m10 = dr2Var.m() & 16777215;
                        if (m10 == 13) {
                            str2 = "image/jpeg";
                        } else if (m10 == 14) {
                            str2 = "image/png";
                            m10 = 14;
                        } else {
                            str2 = null;
                        }
                        if (str2 != null) {
                            dr2Var.g(4);
                            int i9 = m9 - 16;
                            byte[] bArr = new byte[i9];
                            dr2Var.b(bArr, 0, i9);
                            b81Var = new hf4(str2, null, 3, bArr);
                            return b81Var;
                        }
                        StringBuilder sb = new StringBuilder(41);
                        sb.append("Unrecognized cover art flags: ");
                        sb.append(m10);
                        str = sb.toString();
                    } else {
                        str = "Failed to parse cover art attribute";
                    }
                    Log.w("MetadataUtil", str);
                    return b81Var;
                }
                if (m7 == 1631670868) {
                    return e(1631670868, "TPE2", dr2Var);
                }
                if (m7 == 1936682605) {
                    return e(1936682605, "TSOT", dr2Var);
                }
                if (m7 == 1936679276) {
                    return e(1936679276, "TSO2", dr2Var);
                }
                if (m7 == 1936679282) {
                    return e(1936679282, "TSOA", dr2Var);
                }
                if (m7 == 1936679265) {
                    return e(1936679265, "TSOP", dr2Var);
                }
                if (m7 == 1936679791) {
                    return e(1936679791, "TSOC", dr2Var);
                }
                if (m7 == 1920233063) {
                    return c(1920233063, "ITUNESADVISORY", dr2Var, false, false);
                }
                if (m7 == 1885823344) {
                    return c(1885823344, "ITUNESGAPLESS", dr2Var, false, true);
                }
                if (m7 == 1936683886) {
                    return e(1936683886, "TVSHOWSORT", dr2Var);
                }
                if (m7 == 1953919848) {
                    return e(1953919848, "TVSHOW", dr2Var);
                }
                if (m7 == 757935405) {
                    String str4 = null;
                    String str5 = null;
                    int i10 = -1;
                    int i11 = -1;
                    while (dr2Var.k() < k7) {
                        int k8 = dr2Var.k();
                        int m11 = dr2Var.m();
                        int m12 = dr2Var.m();
                        dr2Var.g(4);
                        if (m12 == 1835360622) {
                            str4 = dr2Var.E(m11 - 12);
                        } else if (m12 == 1851878757) {
                            str5 = dr2Var.E(m11 - 12);
                        } else {
                            if (m12 == 1684108385) {
                                i11 = m11;
                            }
                            if (m12 == 1684108385) {
                                i10 = k8;
                            }
                            dr2Var.g(m11 - 12);
                        }
                    }
                    if (str4 != null && str5 != null && i10 != -1) {
                        dr2Var.f(i10);
                        dr2Var.g(16);
                        b81Var = new yf4(str4, str5, dr2Var.E(i11 - 16));
                    }
                    return b81Var;
                }
            }
            String b9 = q0.b(m7);
            Log.d("MetadataUtil", b9.length() != 0 ? "Skipped unknown metadata entry: ".concat(b9) : new String("Skipped unknown metadata entry: "));
            return null;
        } finally {
            dr2Var.f(k7);
        }
    }

    private static int b(dr2 dr2Var) {
        dr2Var.g(4);
        if (dr2Var.m() == 1684108385) {
            dr2Var.g(8);
            return dr2Var.s();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    private static wf4 c(int i7, String str, dr2 dr2Var, boolean z6, boolean z7) {
        int b7 = b(dr2Var);
        if (z7) {
            b7 = Math.min(1, b7);
        }
        if (b7 >= 0) {
            return z6 ? new e(str, null, Integer.toString(b7)) : new pf4("und", str, Integer.toString(b7));
        }
        String b8 = q0.b(i7);
        Log.w("MetadataUtil", b8.length() != 0 ? "Failed to parse uint8 attribute: ".concat(b8) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    private static e d(int i7, String str, dr2 dr2Var) {
        int m7 = dr2Var.m();
        if (dr2Var.m() == 1684108385 && m7 >= 22) {
            dr2Var.g(10);
            int w6 = dr2Var.w();
            if (w6 > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(w6);
                String sb2 = sb.toString();
                int w7 = dr2Var.w();
                if (w7 > 0) {
                    StringBuilder sb3 = new StringBuilder(sb2.length() + 12);
                    sb3.append(sb2);
                    sb3.append("/");
                    sb3.append(w7);
                    sb2 = sb3.toString();
                }
                return new e(str, null, sb2);
            }
        }
        String b7 = q0.b(i7);
        Log.w("MetadataUtil", b7.length() != 0 ? "Failed to parse index/count attribute: ".concat(b7) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    private static e e(int i7, String str, dr2 dr2Var) {
        int m7 = dr2Var.m();
        if (dr2Var.m() == 1684108385) {
            dr2Var.g(8);
            return new e(str, null, dr2Var.E(m7 - 16));
        }
        String b7 = q0.b(i7);
        Log.w("MetadataUtil", b7.length() != 0 ? "Failed to parse text attribute: ".concat(b7) : new String("Failed to parse text attribute: "));
        return null;
    }
}
