package com.anythink.basead.exoplayer.e.a;

import android.util.Log;
import com.anythink.basead.exoplayer.g.a;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.k.p;
import com.anythink.basead.exoplayer.k.s;
import com.anythink.core.common.e.a;

/* loaded from: classes.dex */
final class f {

    /* renamed from: F, reason: collision with root package name */
    private static final String f7205F = "und";

    /* renamed from: a, reason: collision with root package name */
    private static final String f7206a = "MetadataUtil";

    /* renamed from: b, reason: collision with root package name */
    private static final int f7207b = af.f("nam");

    /* renamed from: c, reason: collision with root package name */
    private static final int f7208c = af.f("trk");

    /* renamed from: d, reason: collision with root package name */
    private static final int f7209d = af.f("cmt");

    /* renamed from: e, reason: collision with root package name */
    private static final int f7210e = af.f(a.C0076a.f13069k);

    /* renamed from: f, reason: collision with root package name */
    private static final int f7211f = af.f("ART");

    /* renamed from: g, reason: collision with root package name */
    private static final int f7212g = af.f("too");

    /* renamed from: h, reason: collision with root package name */
    private static final int f7213h = af.f("alb");
    private static final int i = af.f("com");

    /* renamed from: j, reason: collision with root package name */
    private static final int f7214j = af.f("wrt");

    /* renamed from: k, reason: collision with root package name */
    private static final int f7215k = af.f("lyr");

    /* renamed from: l, reason: collision with root package name */
    private static final int f7216l = af.f("gen");

    /* renamed from: m, reason: collision with root package name */
    private static final int f7217m = af.f("covr");

    /* renamed from: n, reason: collision with root package name */
    private static final int f7218n = af.f("gnre");

    /* renamed from: o, reason: collision with root package name */
    private static final int f7219o = af.f("grp");

    /* renamed from: p, reason: collision with root package name */
    private static final int f7220p = af.f("disk");

    /* renamed from: q, reason: collision with root package name */
    private static final int f7221q = af.f("trkn");

    /* renamed from: r, reason: collision with root package name */
    private static final int f7222r = af.f("tmpo");

    /* renamed from: s, reason: collision with root package name */
    private static final int f7223s = af.f("cpil");

    /* renamed from: t, reason: collision with root package name */
    private static final int f7224t = af.f("aART");

    /* renamed from: u, reason: collision with root package name */
    private static final int f7225u = af.f("sonm");

    /* renamed from: v, reason: collision with root package name */
    private static final int f7226v = af.f("soal");

    /* renamed from: w, reason: collision with root package name */
    private static final int f7227w = af.f("soar");

    /* renamed from: x, reason: collision with root package name */
    private static final int f7228x = af.f("soaa");

    /* renamed from: y, reason: collision with root package name */
    private static final int f7229y = af.f("soco");

    /* renamed from: z, reason: collision with root package name */
    private static final int f7230z = af.f("rtng");

    /* renamed from: A, reason: collision with root package name */
    private static final int f7200A = af.f("pgap");

    /* renamed from: B, reason: collision with root package name */
    private static final int f7201B = af.f("sosn");

    /* renamed from: C, reason: collision with root package name */
    private static final int f7202C = af.f("tvsh");

    /* renamed from: D, reason: collision with root package name */
    private static final int f7203D = af.f(com.anythink.basead.exoplayer.g.b.i.f7484a);

    /* renamed from: E, reason: collision with root package name */
    private static final String[] f7204E = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    private f() {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:6:0x0021, B:8:0x0026, B:10:0x002c, B:12:0x0031, B:14:0x003b, B:18:0x0042, B:20:0x004b, B:22:0x004f, B:25:0x0059, B:27:0x005d, B:30:0x0067, B:32:0x006c, B:35:0x0076, B:37:0x007a, B:40:0x0084, B:42:0x0088, B:44:0x0094, B:48:0x00ad, B:51:0x00bb, B:56:0x00ce, B:57:0x00d7, B:59:0x00db, B:62:0x00e5, B:64:0x00e9, B:67:0x00f3, B:69:0x00f7, B:72:0x0101, B:74:0x0105, B:77:0x010f, B:79:0x0113, B:82:0x011d, B:84:0x0121, B:87:0x012b, B:89:0x012f, B:92:0x0139, B:94:0x013d, B:97:0x0147, B:99:0x014b, B:102:0x0155, B:104:0x0159, B:107:0x0163, B:109:0x0167, B:112:0x0223, B:116:0x0173, B:118:0x0177, B:120:0x0183, B:123:0x0196, B:124:0x01af, B:126:0x01b3, B:129:0x01b9, B:131:0x01bd, B:134:0x01c3, B:136:0x01c7, B:139:0x01d1, B:141:0x01d5, B:144:0x01df, B:146:0x01e3, B:149:0x01ed, B:151:0x01f1, B:154:0x01fb, B:156:0x01ff, B:159:0x0209, B:161:0x020d, B:164:0x0215, B:166:0x0219, B:169:0x023c, B:172:0x0246), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:6:0x0021, B:8:0x0026, B:10:0x002c, B:12:0x0031, B:14:0x003b, B:18:0x0042, B:20:0x004b, B:22:0x004f, B:25:0x0059, B:27:0x005d, B:30:0x0067, B:32:0x006c, B:35:0x0076, B:37:0x007a, B:40:0x0084, B:42:0x0088, B:44:0x0094, B:48:0x00ad, B:51:0x00bb, B:56:0x00ce, B:57:0x00d7, B:59:0x00db, B:62:0x00e5, B:64:0x00e9, B:67:0x00f3, B:69:0x00f7, B:72:0x0101, B:74:0x0105, B:77:0x010f, B:79:0x0113, B:82:0x011d, B:84:0x0121, B:87:0x012b, B:89:0x012f, B:92:0x0139, B:94:0x013d, B:97:0x0147, B:99:0x014b, B:102:0x0155, B:104:0x0159, B:107:0x0163, B:109:0x0167, B:112:0x0223, B:116:0x0173, B:118:0x0177, B:120:0x0183, B:123:0x0196, B:124:0x01af, B:126:0x01b3, B:129:0x01b9, B:131:0x01bd, B:134:0x01c3, B:136:0x01c7, B:139:0x01d1, B:141:0x01d5, B:144:0x01df, B:146:0x01e3, B:149:0x01ed, B:151:0x01f1, B:154:0x01fb, B:156:0x01ff, B:159:0x0209, B:161:0x020d, B:164:0x0215, B:166:0x0219, B:169:0x023c, B:172:0x0246), top: B:2:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a.InterfaceC0024a a(s sVar) {
        String str;
        int i4 = sVar.i() + sVar.c();
        int i9 = sVar.i();
        int i10 = (i9 >> 24) & p.f8630b;
        com.anythink.basead.exoplayer.g.b.h hVar = null;
        try {
            if (i10 == 169 || i10 == 65533) {
                int i11 = 16777215 & i9;
                if (i11 == f7209d) {
                    int i12 = sVar.i();
                    if (sVar.i() == a.aK) {
                        sVar.d(8);
                        String e6 = sVar.e(i12 - 16);
                        hVar = new com.anythink.basead.exoplayer.g.b.e("und", e6, e6);
                    } else {
                        Log.w(f7206a, "Failed to parse comment attribute: " + a.c(i9));
                    }
                    sVar.c(i4);
                    return hVar;
                }
                if (i11 != f7207b && i11 != f7208c) {
                    if (i11 != i && i11 != f7214j) {
                        if (i11 == f7210e) {
                            com.anythink.basead.exoplayer.g.b.k a9 = a(i9, "TDRC", sVar);
                            sVar.c(i4);
                            return a9;
                        }
                        if (i11 == f7211f) {
                            com.anythink.basead.exoplayer.g.b.k a10 = a(i9, "TPE1", sVar);
                            sVar.c(i4);
                            return a10;
                        }
                        if (i11 == f7212g) {
                            com.anythink.basead.exoplayer.g.b.k a11 = a(i9, "TSSE", sVar);
                            sVar.c(i4);
                            return a11;
                        }
                        if (i11 == f7213h) {
                            com.anythink.basead.exoplayer.g.b.k a12 = a(i9, "TALB", sVar);
                            sVar.c(i4);
                            return a12;
                        }
                        if (i11 == f7215k) {
                            com.anythink.basead.exoplayer.g.b.k a13 = a(i9, "USLT", sVar);
                            sVar.c(i4);
                            return a13;
                        }
                        if (i11 == f7216l) {
                            com.anythink.basead.exoplayer.g.b.k a14 = a(i9, "TCON", sVar);
                            sVar.c(i4);
                            return a14;
                        }
                        if (i11 == f7219o) {
                            com.anythink.basead.exoplayer.g.b.k a15 = a(i9, "TIT1", sVar);
                            sVar.c(i4);
                            return a15;
                        }
                    }
                    com.anythink.basead.exoplayer.g.b.k a16 = a(i9, "TCOM", sVar);
                    sVar.c(i4);
                    return a16;
                }
                com.anythink.basead.exoplayer.g.b.k a17 = a(i9, "TIT2", sVar);
                sVar.c(i4);
                return a17;
            }
            if (i9 == f7218n) {
                int d2 = d(sVar);
                if (d2 > 0) {
                    String[] strArr = f7204E;
                    if (d2 <= strArr.length) {
                        str = strArr[d2 - 1];
                        if (str == null) {
                            hVar = new com.anythink.basead.exoplayer.g.b.k("TCON", null, str);
                        } else {
                            Log.w(f7206a, "Failed to parse standard genre code");
                        }
                        sVar.c(i4);
                        return hVar;
                    }
                }
                str = null;
                if (str == null) {
                }
                sVar.c(i4);
                return hVar;
            }
            if (i9 == f7220p) {
                com.anythink.basead.exoplayer.g.b.k b9 = b(i9, "TPOS", sVar);
                sVar.c(i4);
                return b9;
            }
            if (i9 == f7221q) {
                com.anythink.basead.exoplayer.g.b.k b10 = b(i9, "TRCK", sVar);
                sVar.c(i4);
                return b10;
            }
            if (i9 == f7222r) {
                com.anythink.basead.exoplayer.g.b.h a18 = a(i9, "TBPM", sVar, true, false);
                sVar.c(i4);
                return a18;
            }
            if (i9 == f7223s) {
                com.anythink.basead.exoplayer.g.b.h a19 = a(i9, "TCMP", sVar, true, true);
                sVar.c(i4);
                return a19;
            }
            if (i9 == f7217m) {
                int i13 = sVar.i();
                if (sVar.i() == a.aK) {
                    int b11 = a.b(sVar.i());
                    String str2 = b11 == 13 ? "image/jpeg" : b11 == 14 ? "image/png" : null;
                    if (str2 == null) {
                        Log.w(f7206a, "Unrecognized cover art flags: ".concat(String.valueOf(b11)));
                    } else {
                        sVar.d(4);
                        int i14 = i13 - 16;
                        byte[] bArr = new byte[i14];
                        sVar.a(bArr, 0, i14);
                        hVar = new com.anythink.basead.exoplayer.g.b.a(str2, null, 3, bArr);
                    }
                } else {
                    Log.w(f7206a, "Failed to parse cover art attribute");
                }
                sVar.c(i4);
                return hVar;
            }
            if (i9 == f7224t) {
                com.anythink.basead.exoplayer.g.b.k a20 = a(i9, "TPE2", sVar);
                sVar.c(i4);
                return a20;
            }
            if (i9 == f7225u) {
                com.anythink.basead.exoplayer.g.b.k a21 = a(i9, "TSOT", sVar);
                sVar.c(i4);
                return a21;
            }
            if (i9 == f7226v) {
                com.anythink.basead.exoplayer.g.b.k a22 = a(i9, "TSO2", sVar);
                sVar.c(i4);
                return a22;
            }
            if (i9 == f7227w) {
                com.anythink.basead.exoplayer.g.b.k a23 = a(i9, "TSOA", sVar);
                sVar.c(i4);
                return a23;
            }
            if (i9 == f7228x) {
                com.anythink.basead.exoplayer.g.b.k a24 = a(i9, "TSOP", sVar);
                sVar.c(i4);
                return a24;
            }
            if (i9 == f7229y) {
                com.anythink.basead.exoplayer.g.b.k a25 = a(i9, "TSOC", sVar);
                sVar.c(i4);
                return a25;
            }
            if (i9 == f7230z) {
                com.anythink.basead.exoplayer.g.b.h a26 = a(i9, "ITUNESADVISORY", sVar, false, false);
                sVar.c(i4);
                return a26;
            }
            if (i9 == f7200A) {
                com.anythink.basead.exoplayer.g.b.h a27 = a(i9, "ITUNESGAPLESS", sVar, false, true);
                sVar.c(i4);
                return a27;
            }
            if (i9 == f7201B) {
                com.anythink.basead.exoplayer.g.b.k a28 = a(i9, "TVSHOWSORT", sVar);
                sVar.c(i4);
                return a28;
            }
            if (i9 == f7202C) {
                com.anythink.basead.exoplayer.g.b.k a29 = a(i9, "TVSHOW", sVar);
                sVar.c(i4);
                return a29;
            }
            if (i9 == f7203D) {
                com.anythink.basead.exoplayer.g.b.h a30 = a(sVar, i4);
                sVar.c(i4);
                return a30;
            }
            Log.d(f7206a, "Skipped unknown metadata entry: " + a.c(i9));
            sVar.c(i4);
            return null;
        } catch (Throwable th) {
            sVar.c(i4);
            throw th;
        }
    }

    private static com.anythink.basead.exoplayer.g.b.k b(int i4, String str, s sVar) {
        int i9 = sVar.i();
        if (sVar.i() == a.aK && i9 >= 22) {
            sVar.d(10);
            int e6 = sVar.e();
            if (e6 > 0) {
                String valueOf = String.valueOf(e6);
                int e9 = sVar.e();
                if (e9 > 0) {
                    valueOf = valueOf + "/" + e9;
                }
                return new com.anythink.basead.exoplayer.g.b.k(str, null, valueOf);
            }
        }
        Log.w(f7206a, "Failed to parse index/count attribute: " + a.c(i4));
        return null;
    }

    private static com.anythink.basead.exoplayer.g.b.a c(s sVar) {
        int i4 = sVar.i();
        if (sVar.i() != a.aK) {
            Log.w(f7206a, "Failed to parse cover art attribute");
            return null;
        }
        int b9 = a.b(sVar.i());
        String str = b9 == 13 ? "image/jpeg" : b9 == 14 ? "image/png" : null;
        if (str == null) {
            Log.w(f7206a, "Unrecognized cover art flags: ".concat(String.valueOf(b9)));
            return null;
        }
        sVar.d(4);
        int i9 = i4 - 16;
        byte[] bArr = new byte[i9];
        sVar.a(bArr, 0, i9);
        return new com.anythink.basead.exoplayer.g.b.a(str, null, 3, bArr);
    }

    private static int d(s sVar) {
        sVar.d(4);
        if (sVar.i() == a.aK) {
            sVar.d(8);
            return sVar.d();
        }
        Log.w(f7206a, "Failed to parse uint8 attribute value");
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static com.anythink.basead.exoplayer.g.b.k b(s sVar) {
        String str;
        int d2 = d(sVar);
        if (d2 > 0) {
            String[] strArr = f7204E;
            if (d2 <= strArr.length) {
                str = strArr[d2 - 1];
                if (str == null) {
                    return new com.anythink.basead.exoplayer.g.b.k("TCON", null, str);
                }
                Log.w(f7206a, "Failed to parse standard genre code");
                return null;
            }
        }
        str = null;
        if (str == null) {
        }
    }

    private static com.anythink.basead.exoplayer.g.b.k a(int i4, String str, s sVar) {
        int i9 = sVar.i();
        if (sVar.i() == a.aK) {
            sVar.d(8);
            return new com.anythink.basead.exoplayer.g.b.k(str, null, sVar.e(i9 - 16));
        }
        Log.w(f7206a, "Failed to parse text attribute: " + a.c(i4));
        return null;
    }

    private static com.anythink.basead.exoplayer.g.b.e a(int i4, s sVar) {
        int i9 = sVar.i();
        if (sVar.i() == a.aK) {
            sVar.d(8);
            String e6 = sVar.e(i9 - 16);
            return new com.anythink.basead.exoplayer.g.b.e("und", e6, e6);
        }
        Log.w(f7206a, "Failed to parse comment attribute: " + a.c(i4));
        return null;
    }

    private static com.anythink.basead.exoplayer.g.b.h a(int i4, String str, s sVar, boolean z8, boolean z9) {
        int d2 = d(sVar);
        if (z9) {
            d2 = Math.min(1, d2);
        }
        if (d2 >= 0) {
            if (z8) {
                return new com.anythink.basead.exoplayer.g.b.k(str, null, Integer.toString(d2));
            }
            return new com.anythink.basead.exoplayer.g.b.e("und", str, Integer.toString(d2));
        }
        Log.w(f7206a, "Failed to parse uint8 attribute: " + a.c(i4));
        return null;
    }

    private static com.anythink.basead.exoplayer.g.b.h a(s sVar, int i4) {
        String str = null;
        String str2 = null;
        int i9 = -1;
        int i10 = -1;
        while (sVar.c() < i4) {
            int c4 = sVar.c();
            int i11 = sVar.i();
            int i12 = sVar.i();
            sVar.d(4);
            if (i12 == a.aI) {
                str = sVar.e(i11 - 12);
            } else if (i12 == a.aJ) {
                str2 = sVar.e(i11 - 12);
            } else {
                if (i12 == a.aK) {
                    i9 = c4;
                    i10 = i11;
                }
                sVar.d(i11 - 12);
            }
        }
        if (str == null || str2 == null || i9 == -1) {
            return null;
        }
        sVar.c(i9);
        sVar.d(16);
        return new com.anythink.basead.exoplayer.g.b.i(str, str2, sVar.e(i10 - 16));
    }
}
