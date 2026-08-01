package j;

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
import l.j1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class h extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f2115e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f2116f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2117a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f2118b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2119c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        f2115e = clsArr;
        f2116f = clsArr;
    }

    public h(Context context) {
        super(context);
        this.f2119c = context;
        Object[] objArr = {context};
        this.f2117a = objArr;
        this.f2118b = objArr;
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
        boolean z4 = false;
        boolean z5 = false;
        String str = null;
        while (!z4) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z5 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z5 = false;
                        str = null;
                        eventType = xmlPullParser2.next();
                        i = 2;
                        z4 = z4;
                        z5 = z5;
                    } else if (name2.equals("group")) {
                        gVar.f2093b = 0;
                        gVar.f2094c = 0;
                        gVar.d = 0;
                        gVar.f2095e = 0;
                        gVar.f2096f = true;
                        gVar.f2097g = true;
                    } else if (name2.equals("item")) {
                        if (!gVar.h) {
                            p pVar = gVar.f2114z;
                            if (pVar == null || !pVar.f2258b.hasSubMenu()) {
                                gVar.h = true;
                                gVar.b(gVar.f2092a.add(gVar.f2093b, gVar.i, gVar.f2098j, gVar.f2099k));
                            } else {
                                gVar.h = true;
                                gVar.b(gVar.f2092a.addSubMenu(gVar.f2093b, gVar.i, gVar.f2098j, gVar.f2099k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        xmlPullParser2 = xmlPullParser;
                        z4 = true;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z4 = z4;
            } else {
                if (!z5) {
                    String name3 = xmlPullParser.getName();
                    boolean equals = name3.equals("group");
                    Context context = this.f2119c;
                    if (equals) {
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f1402p);
                        gVar.f2093b = obtainStyledAttributes.getResourceId(1, 0);
                        gVar.f2094c = obtainStyledAttributes.getInt(3, 0);
                        gVar.d = obtainStyledAttributes.getInt(4, 0);
                        gVar.f2095e = obtainStyledAttributes.getInt(5, 0);
                        gVar.f2096f = obtainStyledAttributes.getBoolean(2, true);
                        gVar.f2097g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f1403q);
                            gVar.i = obtainStyledAttributes2.getResourceId(2, 0);
                            gVar.f2098j = (obtainStyledAttributes2.getInt(5, gVar.f2094c) & (-65536)) | (obtainStyledAttributes2.getInt(6, gVar.d) & 65535);
                            gVar.f2099k = obtainStyledAttributes2.getText(7);
                            gVar.f2100l = obtainStyledAttributes2.getText(8);
                            gVar.f2101m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            gVar.f2102n = string == null ? (char) 0 : string.charAt(0);
                            gVar.f2103o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            gVar.f2104p = string2 == null ? (char) 0 : string2.charAt(0);
                            gVar.f2105q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                gVar.f2106r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                gVar.f2106r = gVar.f2095e;
                            }
                            gVar.f2107s = obtainStyledAttributes2.getBoolean(3, false);
                            gVar.f2108t = obtainStyledAttributes2.getBoolean(4, gVar.f2096f);
                            gVar.f2109u = obtainStyledAttributes2.getBoolean(1, gVar.f2097g);
                            gVar.f2110v = obtainStyledAttributes2.getInt(21, -1);
                            gVar.f2113y = obtainStyledAttributes2.getString(12);
                            gVar.f2111w = obtainStyledAttributes2.getResourceId(13, 0);
                            gVar.f2112x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z6 = string3 != null;
                            if (z6 && gVar.f2111w == 0 && gVar.f2112x == null) {
                                gVar.f2114z = (p) gVar.a(string3, f2116f, this.f2118b);
                            } else {
                                if (z6) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                gVar.f2114z = null;
                            }
                            gVar.A = obtainStyledAttributes2.getText(17);
                            gVar.B = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                gVar.D = j1.b(obtainStyledAttributes2.getInt(19, -1), gVar.D);
                            } else {
                                gVar.D = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = c0.c.a(context, resourceId)) == null) {
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
                            SubMenu addSubMenu = gVar.f2092a.addSubMenu(gVar.f2093b, gVar.i, gVar.f2098j, gVar.f2099k);
                            gVar.b(addSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet, addSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z5 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i = 2;
                        z4 = z4;
                        z5 = z5;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z4 = z4;
            }
            eventType = xmlPullParser2.next();
            i = 2;
            z4 = z4;
            z5 = z5;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof k.m)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z4 = false;
        try {
            try {
                xmlResourceParser = this.f2119c.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof k.m) {
                    k.m mVar = (k.m) menu;
                    if (!mVar.f2223p) {
                        mVar.w();
                        z4 = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z4) {
                    ((k.m) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e4) {
                throw new InflateException("Error inflating menu XML", e4);
            } catch (XmlPullParserException e5) {
                throw new InflateException("Error inflating menu XML", e5);
            }
        } catch (Throwable th) {
            if (z4) {
                ((k.m) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
