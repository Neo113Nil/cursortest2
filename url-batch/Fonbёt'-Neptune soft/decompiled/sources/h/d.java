package h;

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
import c.AbstractC0165a;
import i.MenuC0211i;
import j.A;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class d extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f2278e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f2279f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2280a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f2281b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2282c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2283d;

    static {
        Class[] clsArr = {Context.class};
        f2278e = clsArr;
        f2279f = clsArr;
    }

    public d(Context context) {
        super(context);
        this.f2282c = context;
        Object[] objArr = {context};
        this.f2280a = objArr;
        this.f2281b = objArr;
    }

    public static Object a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v58 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        ?? r4;
        int i2;
        ColorStateList colorStateList;
        int resourceId;
        C0192c c0192c = new C0192c(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r4 = 1;
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
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        while (!z2) {
            if (eventType == r4) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i2) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z3 && name2.equals(str)) {
                        z3 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        c0192c.f2254b = 0;
                        c0192c.f2255c = 0;
                        c0192c.f2256d = 0;
                        c0192c.f2257e = 0;
                        c0192c.f2258f = r4;
                        c0192c.f2259g = r4;
                    } else if (name2.equals("item")) {
                        if (!c0192c.f2260h) {
                            c0192c.f2260h = r4;
                            c0192c.b(c0192c.f2253a.add(c0192c.f2254b, c0192c.f2261i, c0192c.f2262j, c0192c.f2263k));
                        }
                    } else if (name2.equals("menu")) {
                        z2 = true;
                    }
                    eventType = xmlResourceParser.next();
                    r4 = 1;
                    i2 = 2;
                }
            } else if (!z3) {
                String name3 = xmlResourceParser.getName();
                boolean equals = name3.equals("group");
                d dVar = c0192c.f2252D;
                if (equals) {
                    TypedArray obtainStyledAttributes = dVar.f2282c.obtainStyledAttributes(attributeSet, AbstractC0165a.f1974l);
                    c0192c.f2254b = obtainStyledAttributes.getResourceId(r4, 0);
                    c0192c.f2255c = obtainStyledAttributes.getInt(3, 0);
                    c0192c.f2256d = obtainStyledAttributes.getInt(4, 0);
                    c0192c.f2257e = obtainStyledAttributes.getInt(5, 0);
                    c0192c.f2258f = obtainStyledAttributes.getBoolean(2, r4);
                    c0192c.f2259g = obtainStyledAttributes.getBoolean(0, r4);
                    obtainStyledAttributes.recycle();
                } else if (name3.equals("item")) {
                    Context context = dVar.f2282c;
                    TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0165a.f1975m);
                    c0192c.f2261i = obtainStyledAttributes2.getResourceId(2, 0);
                    c0192c.f2262j = (obtainStyledAttributes2.getInt(5, c0192c.f2255c) & (-65536)) | (obtainStyledAttributes2.getInt(6, c0192c.f2256d) & 65535);
                    c0192c.f2263k = obtainStyledAttributes2.getText(7);
                    c0192c.f2264l = obtainStyledAttributes2.getText(8);
                    c0192c.f2265m = obtainStyledAttributes2.getResourceId(0, 0);
                    String string = obtainStyledAttributes2.getString(9);
                    c0192c.f2266n = string == null ? (char) 0 : string.charAt(0);
                    c0192c.f2267o = obtainStyledAttributes2.getInt(16, 4096);
                    String string2 = obtainStyledAttributes2.getString(10);
                    c0192c.f2268p = string2 == null ? (char) 0 : string2.charAt(0);
                    c0192c.f2269q = obtainStyledAttributes2.getInt(20, 4096);
                    if (obtainStyledAttributes2.hasValue(11)) {
                        c0192c.f2270r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                    } else {
                        c0192c.f2270r = c0192c.f2257e;
                    }
                    c0192c.f2271s = obtainStyledAttributes2.getBoolean(3, false);
                    c0192c.f2272t = obtainStyledAttributes2.getBoolean(4, c0192c.f2258f);
                    c0192c.f2273u = obtainStyledAttributes2.getBoolean(1, c0192c.f2259g);
                    c0192c.v = obtainStyledAttributes2.getInt(21, -1);
                    c0192c.f2276y = obtainStyledAttributes2.getString(12);
                    c0192c.f2274w = obtainStyledAttributes2.getResourceId(13, 0);
                    c0192c.f2275x = obtainStyledAttributes2.getString(15);
                    String string3 = obtainStyledAttributes2.getString(14);
                    boolean z4 = string3 != null;
                    if (z4 && c0192c.f2274w == 0 && c0192c.f2275x == null) {
                        if (c0192c.a(string3, f2279f, dVar.f2281b) != null) {
                            throw new ClassCastException();
                        }
                    } else if (z4) {
                        Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                    }
                    c0192c.f2277z = obtainStyledAttributes2.getText(17);
                    c0192c.f2249A = obtainStyledAttributes2.getText(22);
                    if (obtainStyledAttributes2.hasValue(19)) {
                        c0192c.f2251C = A.d(obtainStyledAttributes2.getInt(19, -1), c0192c.f2251C);
                    } else {
                        c0192c.f2251C = null;
                    }
                    if (obtainStyledAttributes2.hasValue(18)) {
                        if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = d.b.b(context, resourceId)) == null) {
                            colorStateList = obtainStyledAttributes2.getColorStateList(18);
                        }
                        c0192c.f2250B = colorStateList;
                    } else {
                        c0192c.f2250B = null;
                    }
                    obtainStyledAttributes2.recycle();
                    c0192c.f2260h = false;
                } else {
                    if (name3.equals("menu")) {
                        c0192c.f2260h = true;
                        SubMenu addSubMenu = c0192c.f2253a.addSubMenu(c0192c.f2254b, c0192c.f2261i, c0192c.f2262j, c0192c.f2263k);
                        c0192c.b(addSubMenu.getItem());
                        b(xmlResourceParser, attributeSet, addSubMenu);
                    } else {
                        str = name3;
                        z3 = true;
                    }
                    eventType = xmlResourceParser.next();
                    r4 = 1;
                    i2 = 2;
                }
            }
            eventType = xmlResourceParser.next();
            r4 = 1;
            i2 = 2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i2, Menu menu) {
        if (!(menu instanceof MenuC0211i)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f2282c.getResources().getLayout(i2);
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
