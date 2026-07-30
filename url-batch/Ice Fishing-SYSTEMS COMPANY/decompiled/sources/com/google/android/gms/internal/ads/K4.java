package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.anythink.expressad.foundation.d.d;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class K4 {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f25873a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f25874b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str) {
        return com.anythink.basead.exoplayer.k.o.f8602b.equals(j(str));
    }

    public static boolean b(String str) {
        return com.anythink.basead.exoplayer.k.o.f8601a.equals(j(str));
    }

    public static boolean c(String str) {
        return d.c.f18793e.equals(j(str)) || "application/x-image-uri".equals(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean d(String str, String str2) {
        char c4;
        J6.i i;
        int c9;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8578B)) {
                    c4 = '\n';
                    break;
                }
                c4 = 65535;
                break;
            case -1354451219:
                if (str.equals("application/vnd.dvb.ait")) {
                    c4 = 16;
                    break;
                }
                c4 = 65535;
                break;
            case -1348231605:
                if (str.equals("application/x-icy")) {
                    c4 = 15;
                    break;
                }
                c4 = 65535;
                break;
            case -1265048566:
                if (str.equals(com.anythink.basead.exoplayer.k.o.ah)) {
                    c4 = 19;
                    break;
                }
                c4 = 65535;
                break;
            case -1248341703:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8597V)) {
                    c4 = '\f';
                    break;
                }
                c4 = 65535;
                break;
            case -432837260:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8620u)) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case -432837259:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8621v)) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case -53558318:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8617r)) {
                    c4 = 20;
                    break;
                }
                c4 = 65535;
                break;
            case -43764892:
                if (str.equals("application/meta")) {
                    c4 = 17;
                    break;
                }
                c4 = 65535;
                break;
            case 187078296:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8625z)) {
                    c4 = '\b';
                    break;
                }
                c4 = 65535;
                break;
            case 187094639:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8622w)) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            case 469933706:
                if (str.equals("application/x-media3-cues")) {
                    c4 = 11;
                    break;
                }
                c4 = 65535;
                break;
            case 1054472807:
                if (str.equals("application/x-itut-t35")) {
                    c4 = 18;
                    break;
                }
                c4 = 65535;
                break;
            case 1154383568:
                if (str.equals(com.anythink.basead.exoplayer.k.o.ai)) {
                    c4 = '\r';
                    break;
                }
                c4 = 65535;
                break;
            case 1331836563:
                if (str.equals("video/apv")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case 1504578661:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8577A)) {
                    c4 = '\t';
                    break;
                }
                c4 = 65535;
                break;
            case 1504619009:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8586K)) {
                    c4 = 7;
                    break;
                }
                c4 = 65535;
                break;
            case 1504831518:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8619t)) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case 1652648887:
                if (str.equals(com.anythink.basead.exoplayer.k.o.ag)) {
                    c4 = 14;
                    break;
                }
                c4 = 65535;
                break;
            case 1903231877:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8623x)) {
                    c4 = 5;
                    break;
                }
                c4 = 65535;
                break;
            case 1903589369:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8624y)) {
                    c4 = 6;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        switch (c4) {
            case 20:
                if (str2 != null && (i = i(str2)) != null && (c9 = i.c()) != 0 && c9 != 16) {
                }
                break;
        }
        return false;
    }

    public static String e(int i) {
        if (i == 32) {
            return com.anythink.basead.exoplayer.k.o.f8611l;
        }
        if (i == 33) {
            return com.anythink.basead.exoplayer.k.o.f8608h;
        }
        if (i == 35) {
            return com.anythink.basead.exoplayer.k.o.i;
        }
        if (i == 64) {
            return com.anythink.basead.exoplayer.k.o.f8617r;
        }
        if (i == 163) {
            return com.anythink.basead.exoplayer.k.o.f8614o;
        }
        if (i == 177) {
            return com.anythink.basead.exoplayer.k.o.f8610k;
        }
        if (i == 221) {
            return com.anythink.basead.exoplayer.k.o.f8583G;
        }
        if (i == 165) {
            return com.anythink.basead.exoplayer.k.o.f8625z;
        }
        if (i == 166) {
            return com.anythink.basead.exoplayer.k.o.f8577A;
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return com.anythink.basead.exoplayer.k.o.f8613n;
            case 102:
            case 103:
            case 104:
                return com.anythink.basead.exoplayer.k.o.f8617r;
            case 105:
            case 107:
                return com.anythink.basead.exoplayer.k.o.f8619t;
            case 106:
                return com.anythink.basead.exoplayer.k.o.f8612m;
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return com.anythink.basead.exoplayer.k.o.f8580D;
                    case 170:
                    case 171:
                        return com.anythink.basead.exoplayer.k.o.f8581E;
                    case 173:
                        return com.anythink.basead.exoplayer.k.o.f8584H;
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static int f(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (a(str)) {
            return 1;
        }
        if (b(str)) {
            return 2;
        }
        if (com.anythink.basead.exoplayer.k.o.f8603c.equals(j(str)) || "application/x-media3-cues".equals(str) || com.anythink.basead.exoplayer.k.o.f8598W.equals(str) || com.anythink.basead.exoplayer.k.o.f8599X.equals(str) || com.anythink.basead.exoplayer.k.o.ac.equals(str) || com.anythink.basead.exoplayer.k.o.Y.equals(str) || com.anythink.basead.exoplayer.k.o.f8600Z.equals(str) || com.anythink.basead.exoplayer.k.o.aa.equals(str) || com.anythink.basead.exoplayer.k.o.ab.equals(str) || com.anythink.basead.exoplayer.k.o.ad.equals(str) || com.anythink.basead.exoplayer.k.o.ae.equals(str) || com.anythink.basead.exoplayer.k.o.af.equals(str) || com.anythink.basead.exoplayer.k.o.aj.equals(str)) {
            return 3;
        }
        if (c(str)) {
            return 4;
        }
        if (com.anythink.basead.exoplayer.k.o.f8597V.equals(str) || com.anythink.basead.exoplayer.k.o.ai.equals(str) || com.anythink.basead.exoplayer.k.o.ag.equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str) || "application/meta".equals(str) || "application/x-itut-t35".equals(str)) {
            return 5;
        }
        if (com.anythink.basead.exoplayer.k.o.ah.equals(str)) {
            return 6;
        }
        ArrayList arrayList = f25873a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int g(String str, String str2) {
        char c4;
        J6.i i;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8578B)) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            case -1365340241:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8582F)) {
                    c4 = '\b';
                    break;
                }
                c4 = 65535;
                break;
            case -1095064472:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8580D)) {
                    c4 = 6;
                    break;
                }
                c4 = 65535;
                break;
            case -53558318:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8617r)) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case 187078296:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8625z)) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c4 = 5;
                    break;
                }
                c4 = 65535;
                break;
            case 187081724:
                if (str.equals("audio/dsd")) {
                    c4 = '\f';
                    break;
                }
                c4 = 65535;
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    c4 = '\t';
                    break;
                }
                c4 = 65535;
                break;
            case 1504578661:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8577A)) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case 1504831518:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8619t)) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case 1504891608:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8584H)) {
                    c4 = 11;
                    break;
                }
                c4 = 65535;
                break;
            case 1505942594:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8581E)) {
                    c4 = 7;
                    break;
                }
                c4 = 65535;
                break;
            case 1556697186:
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8579C)) {
                    c4 = '\n';
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        switch (c4) {
            case 0:
                return 9;
            case 1:
                if (str2 == null || (i = i(str2)) == null) {
                    return 0;
                }
                return i.c();
            case 2:
                return 5;
            case 3:
                return 6;
            case 4:
                return 18;
            case 5:
                return 17;
            case 6:
                return 7;
            case 7:
            case '\b':
                return 8;
            case '\t':
                return 30;
            case '\n':
                return 14;
            case 11:
                return 20;
            case '\f':
                return 31;
            default:
                return 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String h(String str) {
        char c4;
        if (str == null) {
            return null;
        }
        String f6 = AbstractC3035cL.f(str);
        switch (f6.hashCode()) {
            case -1833600100:
                if (f6.equals("video/x-mvhevc")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case -1007807498:
                if (f6.equals("audio/x-flac")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case -979095690:
                if (f6.equals("application/x-mpegurl")) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            case -586683234:
                if (f6.equals("audio/x-wav")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case -432836268:
                if (f6.equals("audio/mpeg-l1")) {
                    c4 = 5;
                    break;
                }
                c4 = 65535;
                break;
            case -432836267:
                if (f6.equals("audio/mpeg-l2")) {
                    c4 = 6;
                    break;
                }
                c4 = 65535;
                break;
            case 187090231:
                if (f6.equals("audio/mp3")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        switch (c4) {
            case 0:
                return "video/mv-hevc";
            case 1:
                return com.anythink.basead.exoplayer.k.o.f8586K;
            case 2:
                return com.anythink.basead.exoplayer.k.o.f8619t;
            case 3:
                return "audio/wav";
            case 4:
                return com.anythink.basead.exoplayer.k.o.f8595T;
            case 5:
                return com.anythink.basead.exoplayer.k.o.f8620u;
            case 6:
                return com.anythink.basead.exoplayer.k.o.f8621v;
            default:
                return f6;
        }
    }

    public static J6.i i(String str) {
        Matcher matcher = f25874b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            Integer.parseInt(group, 16);
            return new J6.i(group2 != null ? Integer.parseInt(group2) : 0, 2);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String j(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }
}
