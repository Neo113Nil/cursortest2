package G0;

import T.G;
import W.AbstractC0108a;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import v2.F;
import v2.I;
import v2.a0;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f830a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f831b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f832c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r6 == (-1)) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c a(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!AbstractC0108a.m(newPullParser, "x:xmpmeta")) {
            throw G.a(null, "Couldn't find xmp metadata");
        }
        v2.G g4 = I.f15571b;
        a0 a0Var = a0.f15605e;
        long j4 = -9223372036854775807L;
        loop0: while (true) {
            newPullParser.next();
            if (AbstractC0108a.m(newPullParser, "rdf:Description")) {
                int i4 = 0;
                while (true) {
                    if (i4 >= 4) {
                        break loop0;
                    }
                    String h2 = AbstractC0108a.h(newPullParser, f830a[i4]);
                    if (h2 == null) {
                        i4++;
                    } else {
                        if (Integer.parseInt(h2) != 1) {
                            break;
                        }
                        int i5 = 0;
                        while (true) {
                            if (i5 >= 4) {
                                break;
                            }
                            String h4 = AbstractC0108a.h(newPullParser, f831b[i5]);
                            if (h4 != null) {
                                j4 = Long.parseLong(h4);
                            } else {
                                i5++;
                            }
                        }
                        j4 = -9223372036854775807L;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= 2) {
                                v2.G g5 = I.f15571b;
                                a0Var = a0.f15605e;
                                break;
                            }
                            String h5 = AbstractC0108a.h(newPullParser, f832c[i6]);
                            if (h5 != null) {
                                a0Var = I.p(new b(0L, 0L, "image/jpeg"), new b(Long.parseLong(h5), 0L, "video/mp4"));
                                break;
                            }
                            i6++;
                        }
                    }
                }
            } else if (AbstractC0108a.m(newPullParser, "Container:Directory")) {
                a0Var = b(newPullParser, "Container", "Item");
            } else if (AbstractC0108a.m(newPullParser, "GContainer:Directory")) {
                a0Var = b(newPullParser, "GContainer", "GContainerItem");
            }
            if (AbstractC0108a.k(newPullParser, "x:xmpmeta")) {
                if (!a0Var.isEmpty()) {
                    return new c(j4, a0Var, 0);
                }
            }
        }
        return null;
    }

    public static a0 b(XmlPullParser xmlPullParser, String str, String str2) {
        F j4 = I.j();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (AbstractC0108a.m(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String h2 = AbstractC0108a.h(xmlPullParser, concat3);
                String h4 = AbstractC0108a.h(xmlPullParser, concat4);
                String h5 = AbstractC0108a.h(xmlPullParser, concat5);
                String h6 = AbstractC0108a.h(xmlPullParser, concat6);
                if (h2 == null || h4 == null) {
                    return a0.f15605e;
                }
                j4.b(new b(h5 != null ? Long.parseLong(h5) : 0L, h6 != null ? Long.parseLong(h6) : 0L, h2));
            }
        } while (!AbstractC0108a.k(xmlPullParser, concat2));
        return j4.f();
    }
}
