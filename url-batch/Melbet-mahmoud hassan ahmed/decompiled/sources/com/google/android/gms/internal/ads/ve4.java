package com.google.android.gms.internal.ads;

import android.util.Log;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
final class ve4 {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f13330a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f13331b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f13332c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static re4 a(String str) {
        String str2;
        String str3;
        long j7;
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new StringReader(str));
            newPullParser.next();
            if (!o23.c(newPullParser, "x:xmpmeta")) {
                throw dz.a("Couldn't find xmp metadata", null);
            }
            e73<qe4> w6 = e73.w();
            long j8 = -9223372036854775807L;
            do {
                newPullParser.next();
                if (o23.c(newPullParser, "rdf:Description")) {
                    String[] strArr = f13330a;
                    int i7 = 0;
                    for (int i8 = 0; i8 < 4; i8++) {
                        String a7 = o23.a(newPullParser, strArr[i8]);
                        if (a7 != null) {
                            if (Integer.parseInt(a7) != 1) {
                                return null;
                            }
                            String[] strArr2 = f13331b;
                            int i9 = 0;
                            while (true) {
                                if (i9 >= 4) {
                                    break;
                                }
                                String a8 = o23.a(newPullParser, strArr2[i9]);
                                if (a8 != null) {
                                    j7 = Long.parseLong(a8);
                                    if (j7 == -1) {
                                    }
                                } else {
                                    i9++;
                                }
                            }
                            j7 = -9223372036854775807L;
                            String[] strArr3 = f13332c;
                            while (true) {
                                if (i7 >= 2) {
                                    w6 = e73.w();
                                    break;
                                }
                                String a9 = o23.a(newPullParser, strArr3[i7]);
                                if (a9 != null) {
                                    w6 = e73.y(new qe4("image/jpeg", "Primary", 0L, 0L), new qe4("video/mp4", "MotionPhoto", Long.parseLong(a9), 0L));
                                    break;
                                }
                                i7++;
                            }
                            j8 = j7;
                        }
                    }
                    return null;
                }
                if (o23.c(newPullParser, "Container:Directory")) {
                    str2 = "Container";
                    str3 = "Item";
                } else if (o23.c(newPullParser, "GContainer:Directory")) {
                    str2 = "GContainer";
                    str3 = "GContainerItem";
                }
                w6 = b(newPullParser, str2, str3);
            } while (!o23.b(newPullParser, "x:xmpmeta"));
            if (w6.isEmpty()) {
                return null;
            }
            return new re4(j8, w6);
        } catch (dz | NumberFormatException | XmlPullParserException unused) {
            Log.w("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static e73<qe4> b(XmlPullParser xmlPullParser, String str, String str2) {
        b73 q7 = e73.q();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (o23.c(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String a7 = o23.a(xmlPullParser, concat3);
                String a8 = o23.a(xmlPullParser, concat4);
                String a9 = o23.a(xmlPullParser, concat5);
                String a10 = o23.a(xmlPullParser, concat6);
                if (a7 == null || a8 == null) {
                    return e73.w();
                }
                q7.f(new qe4(a7, a8, a9 != null ? Long.parseLong(a9) : 0L, a10 != null ? Long.parseLong(a10) : 0L));
            }
        } while (!o23.b(xmlPullParser, concat2));
        return q7.g();
    }
}
