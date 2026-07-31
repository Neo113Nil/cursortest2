package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.l11;
import com.yandex.mobile.ads.impl.sj0;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes3.dex */
final class wk2 {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f34104a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f34105b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f34106c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static l11 a(String str) {
        try {
            return b(str);
        } catch (wf1 | NumberFormatException | XmlPullParserException unused) {
            ms0.d("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r7 == (-1)) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static l11 b(String str) {
        long j4;
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!vk2.c(newPullParser, "x:xmpmeta")) {
            throw wf1.a("Couldn't find xmp metadata", (Exception) null);
        }
        sj0<l11.a> h4 = sj0.h();
        long j5 = -9223372036854775807L;
        loop0: do {
            newPullParser.next();
            if (vk2.c(newPullParser, "rdf:Description")) {
                String[] strArr = f34104a;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    if (i5 >= 4) {
                        break loop0;
                    }
                    String a4 = vk2.a(newPullParser, strArr[i5]);
                    if (a4 == null) {
                        i5++;
                    } else if (Integer.parseInt(a4) == 1) {
                        String[] strArr2 = f34105b;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= 4) {
                                break;
                            }
                            String a5 = vk2.a(newPullParser, strArr2[i6]);
                            if (a5 != null) {
                                j4 = Long.parseLong(a5);
                            } else {
                                i6++;
                            }
                        }
                        j4 = -9223372036854775807L;
                        String[] strArr3 = f34106c;
                        while (true) {
                            if (i4 >= 2) {
                                h4 = sj0.h();
                                break;
                            }
                            String a6 = vk2.a(newPullParser, strArr3[i4]);
                            if (a6 != null) {
                                h4 = sj0.a(new l11.a("image/jpeg", 0L, 0L), new l11.a("video/mp4", Long.parseLong(a6), 0L));
                                break;
                            }
                            i4++;
                        }
                        j5 = j4;
                    }
                }
                return null;
            }
            if (vk2.c(newPullParser, "Container:Directory")) {
                h4 = a(newPullParser, "Container", "Item");
            } else if (vk2.c(newPullParser, "GContainer:Directory")) {
                h4 = a(newPullParser, "GContainer", "GContainerItem");
            }
        } while (!vk2.b(newPullParser, "x:xmpmeta"));
        if (h4.isEmpty()) {
            return null;
        }
        return new l11(j5, h4);
    }

    private static sj0<l11.a> a(XmlPullParser xmlPullParser, String str, String str2) {
        int i4 = sj0.f31764d;
        sj0.a aVar = new sj0.a();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (vk2.c(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String a4 = vk2.a(xmlPullParser, concat3);
                String a5 = vk2.a(xmlPullParser, concat4);
                String a6 = vk2.a(xmlPullParser, concat5);
                String a7 = vk2.a(xmlPullParser, concat6);
                if (a4 != null && a5 != null) {
                    aVar.b(new l11.a(a4, a6 != null ? Long.parseLong(a6) : 0L, a7 != null ? Long.parseLong(a7) : 0L));
                } else {
                    return sj0.h();
                }
            }
        } while (!vk2.b(xmlPullParser, concat2));
        return aVar.a();
    }
}
