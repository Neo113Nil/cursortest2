package j;

import a.y;
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
import java.io.IOException;
import k.p;
import l.m1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class h extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f1872e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f1873f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f1874a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f1875b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f1876c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        f1872e = clsArr;
        f1873f = clsArr;
    }

    public h(Context context) {
        super(context);
        this.f1876c = context;
        Object[] objArr = {context};
        this.f1874a = objArr;
        this.f1875b = objArr;
    }

    public static Object a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        int i;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        g gVar = new g(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i = 2;
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
            if (eventType != i) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z4 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z4 = false;
                        str = null;
                        eventType = xmlPullParser2.next();
                        i = 2;
                        z3 = z3;
                        z4 = z4;
                    } else if (name2.equals("group")) {
                        gVar.f1849b = 0;
                        gVar.f1850c = 0;
                        gVar.d = 0;
                        gVar.f1851e = 0;
                        gVar.f1852f = true;
                        gVar.f1853g = true;
                    } else if (name2.equals("item")) {
                        if (!gVar.f1854h) {
                            p pVar = gVar.f1871z;
                            if (pVar == null || !pVar.f2110b.hasSubMenu()) {
                                gVar.f1854h = true;
                                gVar.b(gVar.f1848a.add(gVar.f1849b, gVar.i, gVar.f1855j, gVar.f1856k));
                            } else {
                                gVar.f1854h = true;
                                gVar.b(gVar.f1848a.addSubMenu(gVar.f1849b, gVar.i, gVar.f1855j, gVar.f1856k).getItem());
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
                    Context context = this.f1876c;
                    if (equals) {
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f1253p);
                        gVar.f1849b = obtainStyledAttributes.getResourceId(1, 0);
                        gVar.f1850c = obtainStyledAttributes.getInt(3, 0);
                        gVar.d = obtainStyledAttributes.getInt(4, 0);
                        gVar.f1851e = obtainStyledAttributes.getInt(5, 0);
                        gVar.f1852f = obtainStyledAttributes.getBoolean(2, true);
                        gVar.f1853g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f1254q);
                            gVar.i = obtainStyledAttributes2.getResourceId(2, 0);
                            gVar.f1855j = (obtainStyledAttributes2.getInt(5, gVar.f1850c) & (-65536)) | (obtainStyledAttributes2.getInt(6, gVar.d) & 65535);
                            gVar.f1856k = obtainStyledAttributes2.getText(7);
                            gVar.f1857l = obtainStyledAttributes2.getText(8);
                            gVar.f1858m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            gVar.f1859n = string == null ? (char) 0 : string.charAt(0);
                            gVar.f1860o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            gVar.f1861p = string2 == null ? (char) 0 : string2.charAt(0);
                            gVar.f1862q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                gVar.f1863r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                gVar.f1863r = gVar.f1851e;
                            }
                            gVar.f1864s = obtainStyledAttributes2.getBoolean(3, false);
                            gVar.f1865t = obtainStyledAttributes2.getBoolean(4, gVar.f1852f);
                            gVar.f1866u = obtainStyledAttributes2.getBoolean(1, gVar.f1853g);
                            gVar.f1867v = obtainStyledAttributes2.getInt(21, -1);
                            gVar.f1870y = obtainStyledAttributes2.getString(12);
                            gVar.f1868w = obtainStyledAttributes2.getResourceId(13, 0);
                            gVar.f1869x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z5 = string3 != null;
                            if (z5 && gVar.f1868w == 0 && gVar.f1869x == null) {
                                gVar.f1871z = (p) gVar.a(string3, f1873f, this.f1875b);
                            } else {
                                if (z5) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                gVar.f1871z = null;
                            }
                            gVar.A = obtainStyledAttributes2.getText(17);
                            gVar.B = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                gVar.D = m1.b(obtainStyledAttributes2.getInt(19, -1), gVar.D);
                            } else {
                                gVar.D = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = y.B(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                gVar.C = colorStateList;
                            } else {
                                gVar.C = null;
                            }
                            obtainStyledAttributes2.recycle();
                            gVar.f1854h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            gVar.f1854h = true;
                            SubMenu addSubMenu = gVar.f1848a.addSubMenu(gVar.f1849b, gVar.i, gVar.f1855j, gVar.f1856k);
                            gVar.b(addSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet, addSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z4 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i = 2;
                        z3 = z3;
                        z4 = z4;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z3 = z3;
            }
            eventType = xmlPullParser2.next();
            i = 2;
            z3 = z3;
            z4 = z4;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof k.m)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z3 = false;
        try {
            try {
                xmlResourceParser = this.f1876c.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof k.m) {
                    k.m mVar = (k.m) menu;
                    if (!mVar.f2073p) {
                        mVar.w();
                        z3 = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z3) {
                    ((k.m) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e4) {
                throw new InflateException("Error inflating menu XML", e4);
            } catch (XmlPullParserException e5) {
                throw new InflateException("Error inflating menu XML", e5);
            }
        } catch (Throwable th) {
            if (z3) {
                ((k.m) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
