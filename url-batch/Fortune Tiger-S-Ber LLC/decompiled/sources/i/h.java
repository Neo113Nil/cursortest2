package i;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import j.p;
import java.io.IOException;
import k.j1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class h extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f2066e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f2067f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2068a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f2069b;
    public final Context c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2070d;

    static {
        Class[] clsArr = {Context.class};
        f2066e = clsArr;
        f2067f = clsArr;
    }

    public h(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.f2068a = objArr;
        this.f2069b = objArr;
    }

    public static Object a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        int i4;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        g gVar = new g(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i4 = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z3 = false;
        boolean z4 = false;
        String str = null;
        while (!z3) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i4) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z4 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z4 = false;
                        str = null;
                        eventType = xmlPullParser2.next();
                        i4 = 2;
                        z3 = z3;
                        z4 = z4;
                    } else if (name2.equals("group")) {
                        gVar.f2044b = 0;
                        gVar.c = 0;
                        gVar.f2045d = 0;
                        gVar.f2046e = 0;
                        gVar.f2047f = true;
                        gVar.g = true;
                    } else if (name2.equals("item")) {
                        if (!gVar.h) {
                            p pVar = gVar.f2065z;
                            if (pVar == null || !pVar.f2235b.hasSubMenu()) {
                                gVar.h = true;
                                gVar.b(gVar.f2043a.add(gVar.f2044b, gVar.f2048i, gVar.f2049j, gVar.f2050k));
                            } else {
                                gVar.h = true;
                                gVar.b(gVar.f2043a.addSubMenu(gVar.f2044b, gVar.f2048i, gVar.f2049j, gVar.f2050k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        xmlPullParser2 = xmlPullParser;
                        z3 = true;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z3 = z3;
            } else {
                if (!z4) {
                    String name3 = xmlPullParser.getName();
                    boolean equals = name3.equals("group");
                    Context context = this.c;
                    if (equals) {
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.a.f1507p);
                        gVar.f2044b = obtainStyledAttributes.getResourceId(1, 0);
                        gVar.c = obtainStyledAttributes.getInt(3, 0);
                        gVar.f2045d = obtainStyledAttributes.getInt(4, 0);
                        gVar.f2046e = obtainStyledAttributes.getInt(5, 0);
                        gVar.f2047f = obtainStyledAttributes.getBoolean(2, true);
                        gVar.g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, e.a.f1508q);
                            gVar.f2048i = obtainStyledAttributes2.getResourceId(2, 0);
                            gVar.f2049j = (obtainStyledAttributes2.getInt(5, gVar.c) & (-65536)) | (obtainStyledAttributes2.getInt(6, gVar.f2045d) & 65535);
                            gVar.f2050k = obtainStyledAttributes2.getText(7);
                            gVar.f2051l = obtainStyledAttributes2.getText(8);
                            gVar.f2052m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            gVar.f2053n = string == null ? (char) 0 : string.charAt(0);
                            gVar.f2054o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            gVar.f2055p = string2 == null ? (char) 0 : string2.charAt(0);
                            gVar.f2056q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                gVar.f2057r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                gVar.f2057r = gVar.f2046e;
                            }
                            gVar.f2058s = obtainStyledAttributes2.getBoolean(3, false);
                            gVar.f2059t = obtainStyledAttributes2.getBoolean(4, gVar.f2047f);
                            gVar.f2060u = obtainStyledAttributes2.getBoolean(1, gVar.g);
                            gVar.f2061v = obtainStyledAttributes2.getInt(21, -1);
                            gVar.f2064y = obtainStyledAttributes2.getString(12);
                            gVar.f2062w = obtainStyledAttributes2.getResourceId(13, 0);
                            gVar.f2063x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z5 = string3 != null;
                            if (z5 && gVar.f2062w == 0 && gVar.f2063x == null) {
                                gVar.f2065z = (p) gVar.a(string3, f2067f, this.f2069b);
                            } else {
                                if (z5) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                gVar.f2065z = null;
                            }
                            gVar.A = obtainStyledAttributes2.getText(17);
                            gVar.B = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                gVar.D = j1.b(obtainStyledAttributes2.getInt(19, -1), gVar.D);
                            } else {
                                gVar.D = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = k3.d.D(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                gVar.C = colorStateList;
                            } else {
                                gVar.C = null;
                            }
                            obtainStyledAttributes2.recycle();
                            gVar.h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            gVar.h = true;
                            SubMenu addSubMenu = gVar.f2043a.addSubMenu(gVar.f2044b, gVar.f2048i, gVar.f2049j, gVar.f2050k);
                            gVar.b(addSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet, addSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z4 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i4 = 2;
                        z3 = z3;
                        z4 = z4;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z3 = z3;
            }
            eventType = xmlPullParser2.next();
            i4 = 2;
            z3 = z3;
            z4 = z4;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i4, Menu menu) {
        if (!(menu instanceof j.m)) {
            super.inflate(i4, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z3 = false;
        try {
            try {
                xmlResourceParser = this.c.getResources().getLayout(i4);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof j.m) {
                    j.m mVar = (j.m) menu;
                    if (!mVar.f2201p) {
                        mVar.w();
                        z3 = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z3) {
                    ((j.m) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e4) {
                throw new InflateException("Error inflating menu XML", e4);
            } catch (XmlPullParserException e5) {
                throw new InflateException("Error inflating menu XML", e5);
            }
        } catch (Throwable th) {
            if (z3) {
                ((j.m) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
