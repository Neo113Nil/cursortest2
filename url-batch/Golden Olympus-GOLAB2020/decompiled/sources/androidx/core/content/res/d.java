package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class d {

    static class a {
        static int a(TypedArray typedArray, int i4) {
            return typedArray.getType(i4);
        }
    }

    public interface b {
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        private final C0093d[] f11732a;

        public c(C0093d[] c0093dArr) {
            this.f11732a = c0093dArr;
        }

        public C0093d[] a() {
            return this.f11732a;
        }
    }

    /* renamed from: androidx.core.content.res.d$d, reason: collision with other inner class name */
    public static final class C0093d {

        /* renamed from: a, reason: collision with root package name */
        private final String f11733a;

        /* renamed from: b, reason: collision with root package name */
        private final int f11734b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f11735c;

        /* renamed from: d, reason: collision with root package name */
        private final String f11736d;

        /* renamed from: e, reason: collision with root package name */
        private final int f11737e;

        /* renamed from: f, reason: collision with root package name */
        private final int f11738f;

        public C0093d(String str, int i4, boolean z4, String str2, int i5, int i6) {
            this.f11733a = str;
            this.f11734b = i4;
            this.f11735c = z4;
            this.f11736d = str2;
            this.f11737e = i5;
            this.f11738f = i6;
        }

        public String a() {
            return this.f11733a;
        }

        public int b() {
            return this.f11738f;
        }

        public int c() {
            return this.f11737e;
        }

        public String d() {
            return this.f11736d;
        }

        public int e() {
            return this.f11734b;
        }

        public boolean f() {
            return this.f11735c;
        }
    }

    public static final class e implements b {

        /* renamed from: a, reason: collision with root package name */
        private final z.e f11739a;

        /* renamed from: b, reason: collision with root package name */
        private final int f11740b;

        /* renamed from: c, reason: collision with root package name */
        private final int f11741c;

        /* renamed from: d, reason: collision with root package name */
        private final String f11742d;

        public e(z.e eVar, int i4, int i5, String str) {
            this.f11739a = eVar;
            this.f11741c = i4;
            this.f11740b = i5;
            this.f11742d = str;
        }

        public int a() {
            return this.f11741c;
        }

        public z.e b() {
            return this.f11739a;
        }

        public String c() {
            return this.f11742d;
        }

        public int d() {
            return this.f11740b;
        }
    }

    private static int a(TypedArray typedArray, int i4) {
        return a.a(typedArray, i4);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List c(Resources resources, int i4) {
        if (i4 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i4);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i5 = 0; i5 < obtainTypedArray.length(); i5++) {
                    int resourceId = obtainTypedArray.getResourceId(i5, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i4)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static b d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), w.d.f46551h);
        String string = obtainAttributes.getString(w.d.f46552i);
        String string2 = obtainAttributes.getString(w.d.f46556m);
        String string3 = obtainAttributes.getString(w.d.f46557n);
        int resourceId = obtainAttributes.getResourceId(w.d.f46553j, 0);
        int integer = obtainAttributes.getInteger(w.d.f46554k, 1);
        int integer2 = obtainAttributes.getInteger(w.d.f46555l, 500);
        String string4 = obtainAttributes.getString(w.d.f46558o);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new e(new z.e(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((C0093d[]) arrayList.toArray(new C0093d[0]));
    }

    private static C0093d f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), w.d.f46559p);
        int i4 = obtainAttributes.getInt(obtainAttributes.hasValue(w.d.f46568y) ? w.d.f46568y : w.d.f46561r, 400);
        boolean z4 = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(w.d.f46566w) ? w.d.f46566w : w.d.f46562s, 0);
        int i5 = obtainAttributes.hasValue(w.d.f46569z) ? w.d.f46569z : w.d.f46563t;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(w.d.f46567x) ? w.d.f46567x : w.d.f46564u);
        int i6 = obtainAttributes.getInt(i5, 0);
        int i7 = obtainAttributes.hasValue(w.d.f46565v) ? w.d.f46565v : w.d.f46560q;
        int resourceId = obtainAttributes.getResourceId(i7, 0);
        String string2 = obtainAttributes.getString(i7);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new C0093d(string2, i4, z4, string, i6, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) {
        int i4 = 1;
        while (i4 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i4++;
            } else if (next == 3) {
                i4--;
            }
        }
    }

    private static List h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
