package e1;

import j1.a;
import o2.a0;
import r0.s1;
import w0.x;

/* loaded from: classes.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    static final String[] f15925a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    private static o1.e a(int i7, a0 a0Var) {
        int m7 = a0Var.m();
        if (a0Var.m() == 1684108385) {
            a0Var.P(8);
            String x6 = a0Var.x(m7 - 16);
            return new o1.e("und", x6, x6);
        }
        o2.r.i("MetadataUtil", "Failed to parse comment attribute: " + a.a(i7));
        return null;
    }

    private static o1.a b(a0 a0Var) {
        String str;
        int m7 = a0Var.m();
        if (a0Var.m() == 1684108385) {
            int b7 = a.b(a0Var.m());
            String str2 = b7 == 13 ? "image/jpeg" : b7 == 14 ? "image/png" : null;
            if (str2 != null) {
                a0Var.P(4);
                int i7 = m7 - 16;
                byte[] bArr = new byte[i7];
                a0Var.j(bArr, 0, i7);
                return new o1.a(str2, null, 3, bArr);
            }
            str = "Unrecognized cover art flags: " + b7;
        } else {
            str = "Failed to parse cover art attribute";
        }
        o2.r.i("MetadataUtil", str);
        return null;
    }

    public static a.b c(a0 a0Var) {
        int e7 = a0Var.e() + a0Var.m();
        int m7 = a0Var.m();
        int i7 = (m7 >> 24) & 255;
        try {
            if (i7 == 169 || i7 == 253) {
                int i8 = 16777215 & m7;
                if (i8 == 6516084) {
                    return a(m7, a0Var);
                }
                if (i8 == 7233901 || i8 == 7631467) {
                    return h(m7, "TIT2", a0Var);
                }
                if (i8 == 6516589 || i8 == 7828084) {
                    return h(m7, "TCOM", a0Var);
                }
                if (i8 == 6578553) {
                    return h(m7, "TDRC", a0Var);
                }
                if (i8 == 4280916) {
                    return h(m7, "TPE1", a0Var);
                }
                if (i8 == 7630703) {
                    return h(m7, "TSSE", a0Var);
                }
                if (i8 == 6384738) {
                    return h(m7, "TALB", a0Var);
                }
                if (i8 == 7108978) {
                    return h(m7, "USLT", a0Var);
                }
                if (i8 == 6776174) {
                    return h(m7, "TCON", a0Var);
                }
                if (i8 == 6779504) {
                    return h(m7, "TIT1", a0Var);
                }
            } else {
                if (m7 == 1735291493) {
                    return g(a0Var);
                }
                if (m7 == 1684632427) {
                    return d(m7, "TPOS", a0Var);
                }
                if (m7 == 1953655662) {
                    return d(m7, "TRCK", a0Var);
                }
                if (m7 == 1953329263) {
                    return i(m7, "TBPM", a0Var, true, false);
                }
                if (m7 == 1668311404) {
                    return i(m7, "TCMP", a0Var, true, true);
                }
                if (m7 == 1668249202) {
                    return b(a0Var);
                }
                if (m7 == 1631670868) {
                    return h(m7, "TPE2", a0Var);
                }
                if (m7 == 1936682605) {
                    return h(m7, "TSOT", a0Var);
                }
                if (m7 == 1936679276) {
                    return h(m7, "TSO2", a0Var);
                }
                if (m7 == 1936679282) {
                    return h(m7, "TSOA", a0Var);
                }
                if (m7 == 1936679265) {
                    return h(m7, "TSOP", a0Var);
                }
                if (m7 == 1936679791) {
                    return h(m7, "TSOC", a0Var);
                }
                if (m7 == 1920233063) {
                    return i(m7, "ITUNESADVISORY", a0Var, false, false);
                }
                if (m7 == 1885823344) {
                    return i(m7, "ITUNESGAPLESS", a0Var, false, true);
                }
                if (m7 == 1936683886) {
                    return h(m7, "TVSHOWSORT", a0Var);
                }
                if (m7 == 1953919848) {
                    return h(m7, "TVSHOW", a0Var);
                }
                if (m7 == 757935405) {
                    return e(a0Var, e7);
                }
            }
            o2.r.b("MetadataUtil", "Skipped unknown metadata entry: " + a.a(m7));
            return null;
        } finally {
            a0Var.O(e7);
        }
    }

    private static o1.m d(int i7, String str, a0 a0Var) {
        int m7 = a0Var.m();
        if (a0Var.m() == 1684108385 && m7 >= 22) {
            a0Var.P(10);
            int I = a0Var.I();
            if (I > 0) {
                String str2 = "" + I;
                int I2 = a0Var.I();
                if (I2 > 0) {
                    str2 = str2 + "/" + I2;
                }
                return new o1.m(str, null, str2);
            }
        }
        o2.r.i("MetadataUtil", "Failed to parse index/count attribute: " + a.a(i7));
        return null;
    }

    private static o1.i e(a0 a0Var, int i7) {
        String str = null;
        String str2 = null;
        int i8 = -1;
        int i9 = -1;
        while (a0Var.e() < i7) {
            int e7 = a0Var.e();
            int m7 = a0Var.m();
            int m8 = a0Var.m();
            a0Var.P(4);
            if (m8 == 1835360622) {
                str = a0Var.x(m7 - 12);
            } else if (m8 == 1851878757) {
                str2 = a0Var.x(m7 - 12);
            } else {
                if (m8 == 1684108385) {
                    i8 = e7;
                    i9 = m7;
                }
                a0Var.P(m7 - 12);
            }
        }
        if (str == null || str2 == null || i8 == -1) {
            return null;
        }
        a0Var.O(i8);
        a0Var.P(16);
        return new o1.j(str, str2, a0Var.x(i9 - 16));
    }

    public static p1.a f(a0 a0Var, int i7, String str) {
        while (true) {
            int e7 = a0Var.e();
            if (e7 >= i7) {
                return null;
            }
            int m7 = a0Var.m();
            if (a0Var.m() == 1684108385) {
                int m8 = a0Var.m();
                int m9 = a0Var.m();
                int i8 = m7 - 16;
                byte[] bArr = new byte[i8];
                a0Var.j(bArr, 0, i8);
                return new p1.a(str, bArr, m9, m8);
            }
            a0Var.O(e7 + m7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static o1.m g(a0 a0Var) {
        String str;
        int j7 = j(a0Var);
        if (j7 > 0) {
            String[] strArr = f15925a;
            if (j7 <= strArr.length) {
                str = strArr[j7 - 1];
                if (str == null) {
                    return new o1.m("TCON", null, str);
                }
                o2.r.i("MetadataUtil", "Failed to parse standard genre code");
                return null;
            }
        }
        str = null;
        if (str == null) {
        }
    }

    private static o1.m h(int i7, String str, a0 a0Var) {
        int m7 = a0Var.m();
        if (a0Var.m() == 1684108385) {
            a0Var.P(8);
            return new o1.m(str, null, a0Var.x(m7 - 16));
        }
        o2.r.i("MetadataUtil", "Failed to parse text attribute: " + a.a(i7));
        return null;
    }

    private static o1.i i(int i7, String str, a0 a0Var, boolean z6, boolean z7) {
        int j7 = j(a0Var);
        if (z7) {
            j7 = Math.min(1, j7);
        }
        if (j7 >= 0) {
            return z6 ? new o1.m(str, null, Integer.toString(j7)) : new o1.e("und", str, Integer.toString(j7));
        }
        o2.r.i("MetadataUtil", "Failed to parse uint8 attribute: " + a.a(i7));
        return null;
    }

    private static int j(a0 a0Var) {
        a0Var.P(4);
        if (a0Var.m() == 1684108385) {
            a0Var.P(8);
            return a0Var.C();
        }
        o2.r.i("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static void k(int i7, x xVar, s1.b bVar) {
        if (i7 == 1 && xVar.a()) {
            bVar.N(xVar.f22982a).O(xVar.f22983b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000b, code lost:
    
        if (r6 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void l(int i7, j1.a aVar, j1.a aVar2, s1.b bVar, j1.a... aVarArr) {
        j1.a aVar3 = new j1.a(new a.b[0]);
        if (i7 != 1) {
            if (i7 == 2 && aVar2 != null) {
                for (int i8 = 0; i8 < aVar2.h(); i8++) {
                    a.b g7 = aVar2.g(i8);
                    if (g7 instanceof p1.a) {
                        p1.a aVar4 = (p1.a) g7;
                        if ("com.android.capture.fps".equals(aVar4.f19955f)) {
                            aVar = new j1.a(aVar4);
                            break;
                        }
                    }
                }
            }
            aVar = aVar3;
        }
        for (j1.a aVar5 : aVarArr) {
            aVar = aVar.c(aVar5);
        }
        if (aVar.h() > 0) {
            bVar.X(aVar);
        }
    }
}
