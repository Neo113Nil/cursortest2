package p0;

import T.G;
import android.util.Pair;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f14696a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14697b;

    /* renamed from: c, reason: collision with root package name */
    public final d f14698c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedList f14699d = new LinkedList();

    public d(d dVar, String str, String str2) {
        this.f14698c = dVar;
        this.f14696a = str;
        this.f14697b = str2;
    }

    public static int g(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return -1;
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException e4) {
            throw G.b(null, e4);
        }
    }

    public static long h(XmlPullParser xmlPullParser, String str, long j4) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j4;
        }
        try {
            return Long.parseLong(attributeValue);
        } catch (NumberFormatException e4) {
            throw G.b(null, e4);
        }
    }

    public static int i(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            throw new E0.d(str, 1);
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException e4) {
            throw G.b(null, e4);
        }
    }

    public abstract Object b();

    public final Object c(String str) {
        int i4 = 0;
        while (true) {
            LinkedList linkedList = this.f14699d;
            if (i4 >= linkedList.size()) {
                d dVar = this.f14698c;
                if (dVar == null) {
                    return null;
                }
                return dVar.c(str);
            }
            Pair pair = (Pair) linkedList.get(i4);
            if (((String) pair.first).equals(str)) {
                return pair.second;
            }
            i4++;
        }
    }

    public boolean d(String str) {
        return false;
    }

    public final Object e(XmlPullParser xmlPullParser) {
        boolean z = false;
        int i4 = 0;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            d dVar = null;
            if (eventType == 1) {
                return null;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (this.f14697b.equals(name)) {
                    j(xmlPullParser);
                    z = true;
                } else if (z) {
                    if (i4 > 0) {
                        i4++;
                    } else if (d(name)) {
                        j(xmlPullParser);
                    } else {
                        boolean equals = "QualityLevel".equals(name);
                        String str = this.f14696a;
                        if (equals) {
                            dVar = new f(this, str, "QualityLevel");
                        } else if ("Protection".equals(name)) {
                            dVar = new e(this, str, "Protection");
                        } else if ("StreamIndex".equals(name)) {
                            dVar = new h(this, str);
                        }
                        if (dVar == null) {
                            i4 = 1;
                        } else {
                            a(dVar.e(xmlPullParser));
                        }
                    }
                }
            } else if (eventType != 3) {
                if (eventType == 4 && z && i4 == 0) {
                    k(xmlPullParser);
                }
            } else if (!z) {
                continue;
            } else if (i4 > 0) {
                i4--;
            } else {
                String name2 = xmlPullParser.getName();
                f(xmlPullParser);
                if (!d(name2)) {
                    return b();
                }
            }
            xmlPullParser.next();
        }
    }

    public abstract void j(XmlPullParser xmlPullParser);

    public final void l(Object obj, String str) {
        this.f14699d.add(Pair.create(str, obj));
    }

    public void a(Object obj) {
    }

    public void f(XmlPullParser xmlPullParser) {
    }

    public void k(XmlPullParser xmlPullParser) {
    }
}
