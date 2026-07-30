package l;

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
import h.AbstractC0454a;
import java.io.IOException;
import m.p;
import n.AbstractC0731q0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class j extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f6251e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f6252f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f6253a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f6254b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f6255c;

    /* renamed from: d, reason: collision with root package name */
    public Object f6256d;

    static {
        Class[] clsArr = {Context.class};
        f6251e = clsArr;
        f6252f = clsArr;
    }

    public j(Context context) {
        super(context);
        this.f6255c = context;
        Object[] objArr = {context};
        this.f6253a = objArr;
        this.f6254b = objArr;
    }

    public static Object a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        int i2;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        C0653i c0653i = new C0653i(this, menu);
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
        boolean z7 = false;
        boolean z8 = false;
        String str = null;
        while (!z7) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z8 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z8 = false;
                        str = null;
                        eventType = xmlPullParser2.next();
                        i2 = 2;
                        z7 = z7;
                        z8 = z8;
                    } else if (name2.equals("group")) {
                        c0653i.f6227b = 0;
                        c0653i.f6228c = 0;
                        c0653i.f6229d = 0;
                        c0653i.f6230e = 0;
                        c0653i.f6231f = true;
                        c0653i.f6232g = true;
                    } else if (name2.equals("item")) {
                        if (!c0653i.f6233h) {
                            p pVar = c0653i.f6250z;
                            if (pVar == null || !pVar.f6465a.hasSubMenu()) {
                                c0653i.f6233h = true;
                                c0653i.b(c0653i.f6226a.add(c0653i.f6227b, c0653i.f6234i, c0653i.j, c0653i.f6235k));
                            } else {
                                c0653i.f6233h = true;
                                c0653i.b(c0653i.f6226a.addSubMenu(c0653i.f6227b, c0653i.f6234i, c0653i.j, c0653i.f6235k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        xmlPullParser2 = xmlPullParser;
                        z7 = true;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z7 = z7;
            } else {
                if (!z8) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        TypedArray obtainStyledAttributes = this.f6255c.obtainStyledAttributes(attributeSet, AbstractC0454a.f5051p);
                        c0653i.f6227b = obtainStyledAttributes.getResourceId(1, 0);
                        c0653i.f6228c = obtainStyledAttributes.getInt(3, 0);
                        c0653i.f6229d = obtainStyledAttributes.getInt(4, 0);
                        c0653i.f6230e = obtainStyledAttributes.getInt(5, 0);
                        c0653i.f6231f = obtainStyledAttributes.getBoolean(i2, true);
                        c0653i.f6232g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            int[] iArr = AbstractC0454a.f5052q;
                            Context context = this.f6255c;
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr);
                            c0653i.f6234i = obtainStyledAttributes2.getResourceId(i2, 0);
                            c0653i.j = (obtainStyledAttributes2.getInt(6, c0653i.f6229d) & 65535) | (obtainStyledAttributes2.getInt(5, c0653i.f6228c) & (-65536));
                            c0653i.f6235k = obtainStyledAttributes2.getText(7);
                            c0653i.f6236l = obtainStyledAttributes2.getText(8);
                            c0653i.f6237m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            c0653i.f6238n = string == null ? (char) 0 : string.charAt(0);
                            c0653i.f6239o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            c0653i.f6240p = string2 == null ? (char) 0 : string2.charAt(0);
                            c0653i.f6241q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                c0653i.f6242r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c0653i.f6242r = c0653i.f6230e;
                            }
                            c0653i.f6243s = obtainStyledAttributes2.getBoolean(3, false);
                            c0653i.f6244t = obtainStyledAttributes2.getBoolean(4, c0653i.f6231f);
                            c0653i.f6245u = obtainStyledAttributes2.getBoolean(1, c0653i.f6232g);
                            c0653i.f6246v = obtainStyledAttributes2.getInt(21, -1);
                            c0653i.f6249y = obtainStyledAttributes2.getString(12);
                            c0653i.f6247w = obtainStyledAttributes2.getResourceId(13, 0);
                            c0653i.f6248x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z9 = string3 != null;
                            if (z9 && c0653i.f6247w == 0 && c0653i.f6248x == null) {
                                c0653i.f6250z = (p) c0653i.a(string3, f6252f, this.f6254b);
                            } else {
                                if (z9) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                c0653i.f6250z = null;
                            }
                            c0653i.f6221A = obtainStyledAttributes2.getText(17);
                            c0653i.f6222B = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                c0653i.f6224D = AbstractC0731q0.c(obtainStyledAttributes2.getInt(19, -1), c0653i.f6224D);
                            } else {
                                c0653i.f6224D = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = O6.g.K(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                c0653i.f6223C = colorStateList;
                            } else {
                                c0653i.f6223C = null;
                            }
                            obtainStyledAttributes2.recycle();
                            c0653i.f6233h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            c0653i.f6233h = true;
                            SubMenu addSubMenu = c0653i.f6226a.addSubMenu(c0653i.f6227b, c0653i.f6234i, c0653i.j, c0653i.f6235k);
                            c0653i.b(addSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet, addSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z8 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i2 = 2;
                        z7 = z7;
                        z8 = z8;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z7 = z7;
            }
            eventType = xmlPullParser2.next();
            i2 = 2;
            z7 = z7;
            z8 = z8;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i2, Menu menu) {
        if (!(menu instanceof m.m)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f6255c.getResources().getLayout(i2);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e7) {
                    throw new InflateException("Error inflating menu XML", e7);
                }
            } catch (XmlPullParserException e8) {
                throw new InflateException("Error inflating menu XML", e8);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
