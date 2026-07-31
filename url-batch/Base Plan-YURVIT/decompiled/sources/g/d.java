package g;

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
import d.AbstractC0119a;
import e.AbstractC0121a;
import h.MenuC0143j;
import i.AbstractC0178z;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class d extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f1922e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f1923f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f1924a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f1925b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f1926c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1927d;

    static {
        Class[] clsArr = {Context.class};
        f1922e = clsArr;
        f1923f = clsArr;
    }

    public d(Context context) {
        super(context);
        this.f1926c = context;
        Object[] objArr = {context};
        this.f1924a = objArr;
        this.f1925b = objArr;
    }

    public static Object a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0208, code lost:
    
        if (r8 != null) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        int i2;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        c cVar = new c(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i2 = 2;
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
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        while (!z2) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            Menu menu2 = cVar.f1897a;
            if (eventType != i2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z3 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z3 = false;
                        str = null;
                        eventType = xmlPullParser2.next();
                        i2 = 2;
                        z2 = z2;
                        z3 = z3;
                    } else if (name2.equals("group")) {
                        cVar.f1898b = 0;
                        cVar.f1899c = 0;
                        cVar.f1900d = 0;
                        cVar.f1901e = 0;
                        cVar.f1902f = true;
                        cVar.f1903g = true;
                    } else if (name2.equals("item")) {
                        if (!cVar.f1904h) {
                            cVar.f1904h = true;
                            cVar.b(menu2.add(cVar.f1898b, cVar.f1905i, cVar.f1906j, cVar.f1907k));
                        }
                    } else if (name2.equals("menu")) {
                        xmlPullParser2 = xmlPullParser;
                        z2 = true;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z2 = z2;
            } else {
                if (!z3) {
                    String name3 = xmlPullParser.getName();
                    boolean equals = name3.equals("group");
                    Context context = this.f1926c;
                    if (equals) {
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0119a.f1798l);
                        cVar.f1898b = obtainStyledAttributes.getResourceId(1, 0);
                        cVar.f1899c = obtainStyledAttributes.getInt(3, 0);
                        cVar.f1900d = obtainStyledAttributes.getInt(4, 0);
                        cVar.f1901e = obtainStyledAttributes.getInt(5, 0);
                        cVar.f1902f = obtainStyledAttributes.getBoolean(2, true);
                        cVar.f1903g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0119a.f1799m);
                            cVar.f1905i = obtainStyledAttributes2.getResourceId(2, 0);
                            cVar.f1906j = (obtainStyledAttributes2.getInt(5, cVar.f1899c) & (-65536)) | (obtainStyledAttributes2.getInt(6, cVar.f1900d) & 65535);
                            cVar.f1907k = obtainStyledAttributes2.getText(7);
                            cVar.f1908l = obtainStyledAttributes2.getText(8);
                            cVar.f1909m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            cVar.f1910n = string == null ? (char) 0 : string.charAt(0);
                            cVar.f1911o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            cVar.f1912p = string2 == null ? (char) 0 : string2.charAt(0);
                            cVar.f1913q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                cVar.f1914r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                cVar.f1914r = cVar.f1901e;
                            }
                            cVar.f1915s = obtainStyledAttributes2.getBoolean(3, false);
                            cVar.t = obtainStyledAttributes2.getBoolean(4, cVar.f1902f);
                            cVar.f1916u = obtainStyledAttributes2.getBoolean(1, cVar.f1903g);
                            cVar.f1917v = obtainStyledAttributes2.getInt(21, -1);
                            cVar.f1920y = obtainStyledAttributes2.getString(12);
                            cVar.f1918w = obtainStyledAttributes2.getResourceId(13, 0);
                            cVar.f1919x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z4 = string3 != null;
                            if (z4 && cVar.f1918w == 0 && cVar.f1919x == null) {
                                if (cVar.a(string3, f1923f, this.f1925b) != null) {
                                    throw new ClassCastException();
                                }
                            } else if (z4) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            cVar.f1921z = obtainStyledAttributes2.getText(17);
                            cVar.f1893A = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                cVar.f1895C = AbstractC0178z.c(obtainStyledAttributes2.getInt(19, -1), cVar.f1895C);
                            } else {
                                cVar.f1895C = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (obtainStyledAttributes2.hasValue(18) && (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) != 0) {
                                    Object obj = AbstractC0121a.f1852a;
                                    colorStateList = context.getColorStateList(resourceId);
                                }
                                colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                cVar.f1894B = colorStateList;
                            } else {
                                cVar.f1894B = null;
                            }
                            obtainStyledAttributes2.recycle();
                            cVar.f1904h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            cVar.f1904h = true;
                            SubMenu addSubMenu = menu2.addSubMenu(cVar.f1898b, cVar.f1905i, cVar.f1906j, cVar.f1907k);
                            cVar.b(addSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet, addSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z3 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i2 = 2;
                        z2 = z2;
                        z3 = z3;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z2 = z2;
            }
            eventType = xmlPullParser2.next();
            i2 = 2;
            z2 = z2;
            z3 = z3;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i2, Menu menu) {
        if (!(menu instanceof MenuC0143j)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f1926c.getResources().getLayout(i2);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
