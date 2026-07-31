package com.yandex.mobile.ads.impl;

import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
final class c01 {

    /* renamed from: a, reason: collision with root package name */
    static final String[] f23993a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    private static gq a(int i4, sf1 sf1Var) {
        int h4 = sf1Var.h();
        if (sf1Var.h() == 1684108385) {
            sf1Var.f(8);
            String b4 = sf1Var.b(h4 - 16);
            return new gq("und", b4, b4);
        }
        ms0.d("MetadataUtil", "Failed to parse comment attribute: " + AbstractC2346xg.a(i4));
        return null;
    }

    private static h42 b(int i4, sf1 sf1Var, String str) {
        int h4 = sf1Var.h();
        if (sf1Var.h() == 1684108385) {
            sf1Var.f(8);
            return new h42(str, null, sf1Var.b(h4 - 16));
        }
        ms0.d("MetadataUtil", "Failed to parse text attribute: " + AbstractC2346xg.a(i4));
        return null;
    }

    private static C2320wd a(sf1 sf1Var) {
        String str;
        int h4 = sf1Var.h();
        if (sf1Var.h() == 1684108385) {
            int h5 = sf1Var.h() & 16777215;
            if (h5 == 13) {
                str = "image/jpeg";
            } else {
                str = h5 == 14 ? "image/png" : null;
            }
            if (str == null) {
                fr0.a("Unrecognized cover art flags: ", h5, "MetadataUtil");
                return null;
            }
            sf1Var.f(4);
            int i4 = h4 - 16;
            byte[] bArr = new byte[i4];
            sf1Var.a(bArr, 0, i4);
            return new C2320wd(str, null, 3, bArr);
        }
        ms0.d("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:8:0x002d, B:10:0x0036, B:12:0x004a, B:14:0x0050, B:16:0x0057, B:20:0x005e, B:22:0x0043, B:25:0x006c, B:30:0x007b, B:35:0x008b, B:40:0x009a, B:45:0x00a9, B:50:0x00b6, B:55:0x00c5, B:60:0x00d4, B:65:0x00e3, B:70:0x00f2, B:75:0x0101, B:80:0x0110, B:85:0x011f, B:90:0x012e, B:95:0x013d, B:101:0x0150, B:103:0x0156, B:118:0x016a, B:115:0x0176, B:111:0x0181, B:125:0x018e, B:128:0x0234, B:133:0x01ad, B:146:0x01d2, B:151:0x01e1, B:156:0x01f0, B:161:0x01ff, B:166:0x020e, B:171:0x021d, B:176:0x022a, B:179:0x024b, B:182:0x0255), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:8:0x002d, B:10:0x0036, B:12:0x004a, B:14:0x0050, B:16:0x0057, B:20:0x005e, B:22:0x0043, B:25:0x006c, B:30:0x007b, B:35:0x008b, B:40:0x009a, B:45:0x00a9, B:50:0x00b6, B:55:0x00c5, B:60:0x00d4, B:65:0x00e3, B:70:0x00f2, B:75:0x0101, B:80:0x0110, B:85:0x011f, B:90:0x012e, B:95:0x013d, B:101:0x0150, B:103:0x0156, B:118:0x016a, B:115:0x0176, B:111:0x0181, B:125:0x018e, B:128:0x0234, B:133:0x01ad, B:146:0x01d2, B:151:0x01e1, B:156:0x01f0, B:161:0x01ff, B:166:0x020e, B:171:0x021d, B:176:0x022a, B:179:0x024b, B:182:0x0255), top: B:2:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zh0 b(sf1 sf1Var) {
        String str;
        int h4 = sf1Var.h() + sf1Var.d();
        int h5 = sf1Var.h();
        int i4 = (h5 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
        zh0 zh0Var = null;
        try {
            if (i4 == 169 || i4 == 253) {
                int i5 = 16777215 & h5;
                if (i5 == 6516084) {
                    gq a4 = a(h5, sf1Var);
                    sf1Var.e(h4);
                    return a4;
                }
                if (i5 == 7233901 || i5 == 7631467) {
                    h42 b4 = b(h5, sf1Var, "TIT2");
                    sf1Var.e(h4);
                    return b4;
                }
                if (i5 == 6516589 || i5 == 7828084) {
                    h42 b5 = b(h5, sf1Var, "TCOM");
                    sf1Var.e(h4);
                    return b5;
                }
                if (i5 == 6578553) {
                    h42 b6 = b(h5, sf1Var, "TDRC");
                    sf1Var.e(h4);
                    return b6;
                }
                if (i5 == 4280916) {
                    h42 b7 = b(h5, sf1Var, "TPE1");
                    sf1Var.e(h4);
                    return b7;
                }
                if (i5 == 7630703) {
                    h42 b8 = b(h5, sf1Var, "TSSE");
                    sf1Var.e(h4);
                    return b8;
                }
                if (i5 == 6384738) {
                    h42 b9 = b(h5, sf1Var, "TALB");
                    sf1Var.e(h4);
                    return b9;
                }
                if (i5 == 7108978) {
                    h42 b10 = b(h5, sf1Var, "USLT");
                    sf1Var.e(h4);
                    return b10;
                }
                if (i5 == 6776174) {
                    h42 b11 = b(h5, sf1Var, "TCON");
                    sf1Var.e(h4);
                    return b11;
                }
                if (i5 == 6779504) {
                    h42 b12 = b(h5, sf1Var, "TIT1");
                    sf1Var.e(h4);
                    return b12;
                }
            } else {
                int i6 = -1;
                if (h5 == 1735291493) {
                    sf1Var.f(4);
                    if (sf1Var.h() == 1684108385) {
                        sf1Var.f(8);
                        i6 = sf1Var.t();
                    } else {
                        ms0.d("MetadataUtil", "Failed to parse uint8 attribute value");
                    }
                    if (i6 > 0) {
                        String[] strArr = f23993a;
                        if (i6 <= 192) {
                            str = strArr[i6 - 1];
                            if (str == null) {
                                zh0Var = new h42("TCON", null, str);
                            } else {
                                ms0.d("MetadataUtil", "Failed to parse standard genre code");
                            }
                            sf1Var.e(h4);
                            return zh0Var;
                        }
                    }
                    str = null;
                    if (str == null) {
                    }
                    sf1Var.e(h4);
                    return zh0Var;
                }
                if (h5 == 1684632427) {
                    h42 a5 = a(h5, sf1Var, "TPOS");
                    sf1Var.e(h4);
                    return a5;
                }
                if (h5 == 1953655662) {
                    h42 a6 = a(h5, sf1Var, "TRCK");
                    sf1Var.e(h4);
                    return a6;
                }
                if (h5 == 1953329263) {
                    zh0 a7 = a(h5, "TBPM", sf1Var, true, false);
                    sf1Var.e(h4);
                    return a7;
                }
                if (h5 == 1668311404) {
                    zh0 a8 = a(h5, "TCMP", sf1Var, true, true);
                    sf1Var.e(h4);
                    return a8;
                }
                if (h5 == 1668249202) {
                    C2320wd a9 = a(sf1Var);
                    sf1Var.e(h4);
                    return a9;
                }
                if (h5 == 1631670868) {
                    h42 b13 = b(h5, sf1Var, "TPE2");
                    sf1Var.e(h4);
                    return b13;
                }
                if (h5 == 1936682605) {
                    h42 b14 = b(h5, sf1Var, "TSOT");
                    sf1Var.e(h4);
                    return b14;
                }
                if (h5 == 1936679276) {
                    h42 b15 = b(h5, sf1Var, "TSO2");
                    sf1Var.e(h4);
                    return b15;
                }
                if (h5 == 1936679282) {
                    h42 b16 = b(h5, sf1Var, "TSOA");
                    sf1Var.e(h4);
                    return b16;
                }
                if (h5 == 1936679265) {
                    h42 b17 = b(h5, sf1Var, "TSOP");
                    sf1Var.e(h4);
                    return b17;
                }
                if (h5 == 1936679791) {
                    h42 b18 = b(h5, sf1Var, "TSOC");
                    sf1Var.e(h4);
                    return b18;
                }
                if (h5 == 1920233063) {
                    zh0 a10 = a(h5, "ITUNESADVISORY", sf1Var, false, false);
                    sf1Var.e(h4);
                    return a10;
                }
                if (h5 == 1885823344) {
                    zh0 a11 = a(h5, "ITUNESGAPLESS", sf1Var, false, true);
                    sf1Var.e(h4);
                    return a11;
                }
                if (h5 == 1936683886) {
                    h42 b19 = b(h5, sf1Var, "TVSHOWSORT");
                    sf1Var.e(h4);
                    return b19;
                }
                if (h5 == 1953919848) {
                    h42 b20 = b(h5, sf1Var, "TVSHOW");
                    sf1Var.e(h4);
                    return b20;
                }
                if (h5 == 757935405) {
                    String str2 = null;
                    String str3 = null;
                    int i7 = -1;
                    int i8 = -1;
                    while (sf1Var.d() < h4) {
                        int d4 = sf1Var.d();
                        int h6 = sf1Var.h();
                        int h7 = sf1Var.h();
                        sf1Var.f(4);
                        if (h7 == 1835360622) {
                            str2 = sf1Var.b(h6 - 12);
                        } else if (h7 == 1851878757) {
                            str3 = sf1Var.b(h6 - 12);
                        } else {
                            if (h7 == 1684108385) {
                                i7 = d4;
                                i8 = h6;
                            }
                            sf1Var.f(h6 - 12);
                        }
                    }
                    if (str2 != null && str3 != null && i7 != -1) {
                        sf1Var.e(i7);
                        sf1Var.f(16);
                        zh0Var = new yo0(str2, str3, sf1Var.b(i8 - 16));
                    }
                    return zh0Var;
                }
            }
            ms0.a("MetadataUtil", "Skipped unknown metadata entry: " + AbstractC2346xg.a(h5));
            sf1Var.e(h4);
            return null;
        } finally {
            sf1Var.e(h4);
        }
    }

    private static h42 a(int i4, sf1 sf1Var, String str) {
        int h4 = sf1Var.h();
        if (sf1Var.h() == 1684108385 && h4 >= 22) {
            sf1Var.f(10);
            int z4 = sf1Var.z();
            if (z4 > 0) {
                String a4 = C1877de.a("", z4);
                int z5 = sf1Var.z();
                if (z5 > 0) {
                    a4 = a4 + "/" + z5;
                }
                return new h42(str, null, a4);
            }
        }
        ms0.d("MetadataUtil", "Failed to parse index/count attribute: " + AbstractC2346xg.a(i4));
        return null;
    }

    private static zh0 a(int i4, String str, sf1 sf1Var, boolean z4, boolean z5) {
        int i5;
        sf1Var.f(4);
        if (sf1Var.h() == 1684108385) {
            sf1Var.f(8);
            i5 = sf1Var.t();
        } else {
            ms0.d("MetadataUtil", "Failed to parse uint8 attribute value");
            i5 = -1;
        }
        if (z5) {
            i5 = Math.min(1, i5);
        }
        if (i5 >= 0) {
            if (z4) {
                return new h42(str, null, Integer.toString(i5));
            }
            return new gq("und", str, Integer.toString(i5));
        }
        ms0.d("MetadataUtil", "Failed to parse uint8 attribute: " + AbstractC2346xg.a(i4));
        return null;
    }
}
