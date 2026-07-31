package com.google.android.gms.internal.ads;

import android.util.Log;

/* loaded from: classes.dex */
final class ni {

    /* renamed from: a, reason: collision with root package name */
    private static final int f9096a = zm.g("nam");

    /* renamed from: b, reason: collision with root package name */
    private static final int f9097b = zm.g("trk");

    /* renamed from: c, reason: collision with root package name */
    private static final int f9098c = zm.g("cmt");

    /* renamed from: d, reason: collision with root package name */
    private static final int f9099d = zm.g("day");

    /* renamed from: e, reason: collision with root package name */
    private static final int f9100e = zm.g("ART");

    /* renamed from: f, reason: collision with root package name */
    private static final int f9101f = zm.g("too");

    /* renamed from: g, reason: collision with root package name */
    private static final int f9102g = zm.g("alb");

    /* renamed from: h, reason: collision with root package name */
    private static final int f9103h = zm.g("com");

    /* renamed from: i, reason: collision with root package name */
    private static final int f9104i = zm.g("wrt");

    /* renamed from: j, reason: collision with root package name */
    private static final int f9105j = zm.g("lyr");

    /* renamed from: k, reason: collision with root package name */
    private static final int f9106k = zm.g("gen");

    /* renamed from: l, reason: collision with root package name */
    private static final int f9107l = zm.g("covr");

    /* renamed from: m, reason: collision with root package name */
    private static final int f9108m = zm.g("gnre");

    /* renamed from: n, reason: collision with root package name */
    private static final int f9109n = zm.g("grp");

    /* renamed from: o, reason: collision with root package name */
    private static final int f9110o = zm.g("disk");

    /* renamed from: p, reason: collision with root package name */
    private static final int f9111p = zm.g("trkn");

    /* renamed from: q, reason: collision with root package name */
    private static final int f9112q = zm.g("tmpo");

    /* renamed from: r, reason: collision with root package name */
    private static final int f9113r = zm.g("cpil");

    /* renamed from: s, reason: collision with root package name */
    private static final int f9114s = zm.g("aART");

    /* renamed from: t, reason: collision with root package name */
    private static final int f9115t = zm.g("sonm");

    /* renamed from: u, reason: collision with root package name */
    private static final int f9116u = zm.g("soal");

    /* renamed from: v, reason: collision with root package name */
    private static final int f9117v = zm.g("soar");

    /* renamed from: w, reason: collision with root package name */
    private static final int f9118w = zm.g("soaa");

    /* renamed from: x, reason: collision with root package name */
    private static final int f9119x = zm.g("soco");

    /* renamed from: y, reason: collision with root package name */
    private static final int f9120y = zm.g("rtng");

    /* renamed from: z, reason: collision with root package name */
    private static final int f9121z = zm.g("pgap");
    private static final int A = zm.g("sosn");
    private static final int B = zm.g("tvsh");
    private static final int C = zm.g("----");
    private static final String[] D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035 A[Catch: all -> 0x01d3, TryCatch #0 {all -> 0x01d3, blocks: (B:4:0x001c, B:6:0x0021, B:8:0x0027, B:10:0x002e, B:12:0x0035, B:16:0x003c, B:18:0x0045, B:20:0x0049, B:23:0x0053, B:25:0x0057, B:28:0x0061, B:30:0x0067, B:33:0x0071, B:35:0x0075, B:38:0x007f, B:40:0x0084, B:42:0x0090, B:46:0x00ab, B:47:0x00be, B:50:0x00c2, B:55:0x00db, B:57:0x00df, B:60:0x00e9, B:62:0x00ed, B:65:0x00f7, B:67:0x00fb, B:70:0x0105, B:72:0x0109, B:75:0x0113, B:77:0x0117, B:80:0x0121, B:82:0x0125, B:85:0x012f, B:87:0x0133, B:90:0x013d, B:92:0x0141, B:95:0x014b, B:97:0x014f, B:100:0x0159, B:102:0x015d, B:105:0x0167, B:108:0x016f, B:110:0x0175, B:129:0x0188, B:113:0x018f, B:126:0x0193, B:116:0x019a, B:121:0x01a3, B:132:0x01a9, B:134:0x01b1, B:138:0x01bc, B:141:0x028c, B:143:0x0298, B:144:0x02a2, B:147:0x029d, B:149:0x01da, B:151:0x01de, B:153:0x01ea, B:156:0x01fb, B:158:0x0207, B:159:0x0211, B:160:0x020c, B:161:0x0218, B:163:0x021c, B:166:0x0222, B:168:0x0226, B:171:0x022c, B:173:0x0230, B:176:0x023a, B:178:0x023e, B:181:0x0248, B:183:0x024c, B:186:0x0256, B:188:0x025a, B:191:0x0264, B:193:0x0268, B:196:0x0272, B:198:0x0276, B:201:0x027e, B:203:0x0282, B:206:0x02a9, B:209:0x02b3), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c A[Catch: all -> 0x01d3, TRY_LEAVE, TryCatch #0 {all -> 0x01d3, blocks: (B:4:0x001c, B:6:0x0021, B:8:0x0027, B:10:0x002e, B:12:0x0035, B:16:0x003c, B:18:0x0045, B:20:0x0049, B:23:0x0053, B:25:0x0057, B:28:0x0061, B:30:0x0067, B:33:0x0071, B:35:0x0075, B:38:0x007f, B:40:0x0084, B:42:0x0090, B:46:0x00ab, B:47:0x00be, B:50:0x00c2, B:55:0x00db, B:57:0x00df, B:60:0x00e9, B:62:0x00ed, B:65:0x00f7, B:67:0x00fb, B:70:0x0105, B:72:0x0109, B:75:0x0113, B:77:0x0117, B:80:0x0121, B:82:0x0125, B:85:0x012f, B:87:0x0133, B:90:0x013d, B:92:0x0141, B:95:0x014b, B:97:0x014f, B:100:0x0159, B:102:0x015d, B:105:0x0167, B:108:0x016f, B:110:0x0175, B:129:0x0188, B:113:0x018f, B:126:0x0193, B:116:0x019a, B:121:0x01a3, B:132:0x01a9, B:134:0x01b1, B:138:0x01bc, B:141:0x028c, B:143:0x0298, B:144:0x02a2, B:147:0x029d, B:149:0x01da, B:151:0x01de, B:153:0x01ea, B:156:0x01fb, B:158:0x0207, B:159:0x0211, B:160:0x020c, B:161:0x0218, B:163:0x021c, B:166:0x0222, B:168:0x0226, B:171:0x022c, B:173:0x0230, B:176:0x023a, B:178:0x023e, B:181:0x0248, B:183:0x024c, B:186:0x0256, B:188:0x025a, B:191:0x0264, B:193:0x0268, B:196:0x0272, B:198:0x0276, B:201:0x027e, B:203:0x0282, B:206:0x02a9, B:209:0x02b3), top: B:2:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static lj a(rm rmVar) {
        String str;
        String str2;
        String str3;
        int c7 = rmVar.c() + rmVar.e();
        int e7 = rmVar.e();
        sj sjVar = null;
        try {
            if (((e7 >> 24) & 255) == 169) {
                int i7 = 16777215 & e7;
                if (i7 == f9098c) {
                    int e8 = rmVar.e();
                    if (rmVar.e() == ai.F0) {
                        rmVar.w(8);
                        String o7 = rmVar.o(e8 - 16);
                        sjVar = new qj("und", o7, o7);
                    } else {
                        String c8 = ai.c(e7);
                        Log.w("MetadataUtil", c8.length() != 0 ? "Failed to parse comment attribute: ".concat(c8) : new String("Failed to parse comment attribute: "));
                    }
                    return sjVar;
                }
                if (i7 != f9096a && i7 != f9097b) {
                    if (i7 != f9103h && i7 != f9104i) {
                        if (i7 == f9099d) {
                            return e(e7, "TDRC", rmVar);
                        }
                        if (i7 == f9100e) {
                            return e(e7, "TPE1", rmVar);
                        }
                        if (i7 == f9101f) {
                            return e(e7, "TSSE", rmVar);
                        }
                        if (i7 == f9102g) {
                            return e(e7, "TALB", rmVar);
                        }
                        if (i7 == f9105j) {
                            return e(e7, "USLT", rmVar);
                        }
                        if (i7 == f9106k) {
                            return e(e7, "TCON", rmVar);
                        }
                        if (i7 == f9109n) {
                            return e(e7, "TIT1", rmVar);
                        }
                    }
                    return e(e7, "TCOM", rmVar);
                }
                return e(e7, "TIT2", rmVar);
            }
            if (e7 == f9108m) {
                int b7 = b(rmVar);
                if (b7 > 0) {
                    String[] strArr = D;
                    int length = strArr.length;
                    if (b7 <= 148) {
                        str3 = strArr[b7 - 1];
                        if (str3 == null) {
                            sjVar = new uj("TCON", null, str3);
                        } else {
                            Log.w("MetadataUtil", "Failed to parse standard genre code");
                        }
                        return sjVar;
                    }
                }
                str3 = null;
                if (str3 == null) {
                }
                return sjVar;
            }
            if (e7 == f9110o) {
                return d(e7, "TPOS", rmVar);
            }
            if (e7 == f9111p) {
                return d(e7, "TRCK", rmVar);
            }
            if (e7 == f9112q) {
                return c(e7, "TBPM", rmVar, true, false);
            }
            if (e7 == f9113r) {
                return c(e7, "TCMP", rmVar, true, true);
            }
            if (e7 == f9107l) {
                int e9 = rmVar.e();
                if (rmVar.e() == ai.F0) {
                    int a7 = ai.a(rmVar.e());
                    if (a7 == 13) {
                        str2 = "image/jpeg";
                    } else if (a7 == 14) {
                        str2 = "image/png";
                        a7 = 14;
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        rmVar.w(4);
                        int i8 = e9 - 16;
                        byte[] bArr = new byte[i8];
                        rmVar.q(bArr, 0, i8);
                        sjVar = new oj(str2, null, 3, bArr);
                        return sjVar;
                    }
                    StringBuilder sb = new StringBuilder(41);
                    sb.append("Unrecognized cover art flags: ");
                    sb.append(a7);
                    str = sb.toString();
                } else {
                    str = "Failed to parse cover art attribute";
                }
                Log.w("MetadataUtil", str);
                return sjVar;
            }
            if (e7 == f9114s) {
                return e(e7, "TPE2", rmVar);
            }
            if (e7 == f9115t) {
                return e(e7, "TSOT", rmVar);
            }
            if (e7 == f9116u) {
                return e(e7, "TSO2", rmVar);
            }
            if (e7 == f9117v) {
                return e(e7, "TSOA", rmVar);
            }
            if (e7 == f9118w) {
                return e(e7, "TSOP", rmVar);
            }
            if (e7 == f9119x) {
                return e(e7, "TSOC", rmVar);
            }
            if (e7 == f9120y) {
                return c(e7, "ITUNESADVISORY", rmVar, false, false);
            }
            if (e7 == f9121z) {
                return c(e7, "ITUNESGAPLESS", rmVar, false, true);
            }
            if (e7 == A) {
                return e(e7, "TVSHOWSORT", rmVar);
            }
            if (e7 == B) {
                return e(e7, "TVSHOW", rmVar);
            }
            if (e7 == C) {
                String str4 = null;
                String str5 = null;
                int i9 = -1;
                int i10 = -1;
                while (rmVar.c() < c7) {
                    int c9 = rmVar.c();
                    int e10 = rmVar.e();
                    int e11 = rmVar.e();
                    rmVar.w(4);
                    if (e11 == ai.D0) {
                        str4 = rmVar.o(e10 - 12);
                    } else if (e11 == ai.E0) {
                        str5 = rmVar.o(e10 - 12);
                    } else {
                        int i11 = ai.F0;
                        if (e11 == i11) {
                            i10 = e10;
                        }
                        if (e11 == i11) {
                            i9 = c9;
                        }
                        rmVar.w(e10 - 12);
                    }
                }
                if ("com.apple.iTunes".equals(str4) && "iTunSMPB".equals(str5) && i9 != -1) {
                    rmVar.v(i9);
                    rmVar.w(16);
                    sjVar = new qj("und", str5, rmVar.o(i10 - 16));
                }
                return sjVar;
            }
            String c10 = ai.c(e7);
            Log.d("MetadataUtil", c10.length() != 0 ? "Skipped unknown metadata entry: ".concat(c10) : new String("Skipped unknown metadata entry: "));
            return null;
        } finally {
            rmVar.v(c7);
        }
    }

    private static int b(rm rmVar) {
        rmVar.w(4);
        if (rmVar.e() == ai.F0) {
            rmVar.w(8);
            return rmVar.g();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    private static sj c(int i7, String str, rm rmVar, boolean z6, boolean z7) {
        int b7 = b(rmVar);
        if (z7) {
            b7 = Math.min(1, b7);
        }
        if (b7 >= 0) {
            return z6 ? new uj(str, null, Integer.toString(b7)) : new qj("und", str, Integer.toString(b7));
        }
        String c7 = ai.c(i7);
        Log.w("MetadataUtil", c7.length() != 0 ? "Failed to parse uint8 attribute: ".concat(c7) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    private static uj d(int i7, String str, rm rmVar) {
        int e7 = rmVar.e();
        if (rmVar.e() == ai.F0 && e7 >= 22) {
            rmVar.w(10);
            int j7 = rmVar.j();
            if (j7 > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(j7);
                String sb2 = sb.toString();
                int j8 = rmVar.j();
                if (j8 > 0) {
                    StringBuilder sb3 = new StringBuilder(sb2.length() + 12);
                    sb3.append(sb2);
                    sb3.append("/");
                    sb3.append(j8);
                    sb2 = sb3.toString();
                }
                return new uj(str, null, sb2);
            }
        }
        String c7 = ai.c(i7);
        Log.w("MetadataUtil", c7.length() != 0 ? "Failed to parse index/count attribute: ".concat(c7) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    private static uj e(int i7, String str, rm rmVar) {
        int e7 = rmVar.e();
        if (rmVar.e() == ai.F0) {
            rmVar.w(8);
            return new uj(str, null, rmVar.o(e7 - 16));
        }
        String c7 = ai.c(i7);
        Log.w("MetadataUtil", c7.length() != 0 ? "Failed to parse text attribute: ".concat(c7) : new String("Failed to parse text attribute: "));
        return null;
    }
}
