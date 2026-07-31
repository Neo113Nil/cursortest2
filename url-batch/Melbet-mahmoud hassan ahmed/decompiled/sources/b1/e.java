package b1;

import b1.b;
import java.io.StringReader;
import m4.q;
import o2.n0;
import o2.r;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import r0.n2;

/* loaded from: classes.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f1626a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f1627b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f1628c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static b a(String str) {
        try {
            return b(str);
        } catch (NumberFormatException | XmlPullParserException | n2 unused) {
            r.i("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static b b(String str) {
        String str2;
        String str3;
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!n0.f(newPullParser, "x:xmpmeta")) {
            throw n2.a("Couldn't find xmp metadata", null);
        }
        long j7 = -9223372036854775807L;
        q<b.a> x6 = q.x();
        do {
            newPullParser.next();
            if (!n0.f(newPullParser, "rdf:Description")) {
                if (n0.f(newPullParser, "Container:Directory")) {
                    str2 = "Container";
                    str3 = "Item";
                } else if (n0.f(newPullParser, "GContainer:Directory")) {
                    str2 = "GContainer";
                    str3 = "GContainerItem";
                }
                x6 = f(newPullParser, str2, str3);
            } else {
                if (!d(newPullParser)) {
                    return null;
                }
                j7 = e(newPullParser);
                x6 = c(newPullParser);
            }
        } while (!n0.d(newPullParser, "x:xmpmeta"));
        if (x6.isEmpty()) {
            return null;
        }
        return new b(j7, x6);
    }

    private static q<b.a> c(XmlPullParser xmlPullParser) {
        for (String str : f1628c) {
            String a7 = n0.a(xmlPullParser, str);
            if (a7 != null) {
                return q.z(new b.a("image/jpeg", "Primary", 0L, 0L), new b.a("video/mp4", "MotionPhoto", Long.parseLong(a7), 0L));
            }
        }
        return q.x();
    }

    private static boolean d(XmlPullParser xmlPullParser) {
        for (String str : f1626a) {
            String a7 = n0.a(xmlPullParser, str);
            if (a7 != null) {
                return Integer.parseInt(a7) == 1;
            }
        }
        return false;
    }

    private static long e(XmlPullParser xmlPullParser) {
        for (String str : f1627b) {
            String a7 = n0.a(xmlPullParser, str);
            if (a7 != null) {
                long parseLong = Long.parseLong(a7);
                if (parseLong == -1) {
                    return -9223372036854775807L;
                }
                return parseLong;
            }
        }
        return -9223372036854775807L;
    }

    private static q<b.a> f(XmlPullParser xmlPullParser, String str, String str2) {
        q.a r7 = q.r();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (n0.f(xmlPullParser, str3)) {
                String a7 = n0.a(xmlPullParser, str2 + ":Mime");
                String a8 = n0.a(xmlPullParser, str2 + ":Semantic");
                String a9 = n0.a(xmlPullParser, str2 + ":Length");
                String a10 = n0.a(xmlPullParser, str2 + ":Padding");
                if (a7 == null || a8 == null) {
                    return q.x();
                }
                r7.a(new b.a(a7, a8, a9 != null ? Long.parseLong(a9) : 0L, a10 != null ? Long.parseLong(a10) : 0L));
            }
        } while (!n0.d(xmlPullParser, str4));
        return r7.h();
    }
}
