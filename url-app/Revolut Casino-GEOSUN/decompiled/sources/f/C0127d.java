package f;

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
import c.AbstractC0098a;
import d.AbstractC0110a;
import g.j;
import h.AbstractC0171y;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: f.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0127d extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f1917e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f1918f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f1919a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f1920b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f1921c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1922d;

    static {
        Class[] clsArr = {Context.class};
        f1917e = clsArr;
        f1918f = clsArr;
    }

    public C0127d(Context context) {
        super(context);
        this.f1921c = context;
        Object[] objArr = {context};
        this.f1919a = objArr;
        this.f1920b = objArr;
    }

    public static Object a(Context context) {
        return context instanceof Activity ? context : context instanceof ContextWrapper ? a(((ContextWrapper) context).getBaseContext()) : context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0211, code lost:
    
        if (r4 != null) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v58 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        ?? r5;
        int i2;
        boolean z2;
        ColorStateList colorStateList;
        int resourceId;
        C0126c c0126c = new C0126c(this, menu);
        Menu menu2 = c0126c.f1892a;
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r5 = 1;
            i2 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z3 = false;
        boolean z4 = false;
        String str = null;
        while (!z3) {
            if (eventType == r5) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i2) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z4 && name2.equals(str)) {
                        z2 = r5;
                        z4 = false;
                        str = null;
                        eventType = xmlResourceParser.next();
                        r5 = z2;
                        i2 = 2;
                        z4 = z4;
                    } else if (name2.equals("group")) {
                        c0126c.f1893b = 0;
                        c0126c.f1894c = 0;
                        c0126c.f1895d = 0;
                        c0126c.f1896e = 0;
                        c0126c.f1897f = r5;
                        c0126c.f1898g = r5;
                    } else if (name2.equals("item")) {
                        if (!c0126c.f1899h) {
                            c0126c.f1899h = r5;
                            c0126c.b(menu2.add(c0126c.f1893b, c0126c.f1900i, c0126c.f1901j, c0126c.f1902k));
                        }
                    } else if (name2.equals("menu")) {
                        z2 = r5;
                        z3 = z2;
                    }
                }
                z2 = r5;
            } else {
                if (!z4) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    C0127d c0127d = c0126c.f1891D;
                    if (equals) {
                        TypedArray obtainStyledAttributes = c0127d.f1921c.obtainStyledAttributes(attributeSet, AbstractC0098a.f1651l);
                        c0126c.f1893b = obtainStyledAttributes.getResourceId(r5, 0);
                        c0126c.f1894c = obtainStyledAttributes.getInt(3, 0);
                        c0126c.f1895d = obtainStyledAttributes.getInt(4, 0);
                        c0126c.f1896e = obtainStyledAttributes.getInt(5, 0);
                        c0126c.f1897f = obtainStyledAttributes.getBoolean(2, r5);
                        c0126c.f1898g = obtainStyledAttributes.getBoolean(0, r5);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = c0127d.f1921c;
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0098a.f1652m);
                            c0126c.f1900i = obtainStyledAttributes2.getResourceId(2, 0);
                            c0126c.f1901j = (obtainStyledAttributes2.getInt(5, c0126c.f1894c) & (-65536)) | (obtainStyledAttributes2.getInt(6, c0126c.f1895d) & 65535);
                            c0126c.f1902k = obtainStyledAttributes2.getText(7);
                            c0126c.f1903l = obtainStyledAttributes2.getText(8);
                            c0126c.f1904m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            c0126c.f1905n = string == null ? (char) 0 : string.charAt(0);
                            c0126c.f1906o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            c0126c.f1907p = string2 == null ? (char) 0 : string2.charAt(0);
                            c0126c.f1908q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                c0126c.r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c0126c.r = c0126c.f1896e;
                            }
                            c0126c.f1909s = obtainStyledAttributes2.getBoolean(3, false);
                            c0126c.f1910t = obtainStyledAttributes2.getBoolean(4, c0126c.f1897f);
                            c0126c.f1911u = obtainStyledAttributes2.getBoolean(1, c0126c.f1898g);
                            c0126c.f1912v = obtainStyledAttributes2.getInt(21, -1);
                            c0126c.f1915y = obtainStyledAttributes2.getString(12);
                            c0126c.f1913w = obtainStyledAttributes2.getResourceId(13, 0);
                            c0126c.f1914x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z5 = string3 != null;
                            if (z5 && c0126c.f1913w == 0 && c0126c.f1914x == null) {
                                if (c0126c.a(string3, f1918f, c0127d.f1920b) != null) {
                                    throw new ClassCastException();
                                }
                            } else if (z5) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            c0126c.f1916z = obtainStyledAttributes2.getText(17);
                            c0126c.f1888A = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                c0126c.f1890C = AbstractC0171y.c(obtainStyledAttributes2.getInt(19, -1), c0126c.f1890C);
                            } else {
                                c0126c.f1890C = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (obtainStyledAttributes2.hasValue(18) && (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) != 0) {
                                    Object obj = AbstractC0110a.f1784a;
                                    colorStateList = context.getColorStateList(resourceId);
                                }
                                colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                c0126c.f1889B = colorStateList;
                            } else {
                                c0126c.f1889B = null;
                            }
                            obtainStyledAttributes2.recycle();
                            c0126c.f1899h = false;
                            z2 = true;
                        } else if (name3.equals("menu")) {
                            z2 = true;
                            c0126c.f1899h = true;
                            SubMenu addSubMenu = menu2.addSubMenu(c0126c.f1893b, c0126c.f1900i, c0126c.f1901j, c0126c.f1902k);
                            c0126c.b(addSubMenu.getItem());
                            b(xmlResourceParser, attributeSet, addSubMenu);
                        } else {
                            z2 = true;
                            str = name3;
                            z4 = true;
                        }
                        eventType = xmlResourceParser.next();
                        r5 = z2;
                        i2 = 2;
                        z4 = z4;
                    }
                }
                z2 = r5;
            }
            eventType = xmlResourceParser.next();
            r5 = z2;
            i2 = 2;
            z4 = z4;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i2, Menu menu) {
        if (!(menu instanceof j)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f1921c.getResources().getLayout(i2);
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
