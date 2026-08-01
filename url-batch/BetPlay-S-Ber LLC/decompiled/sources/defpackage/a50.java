package defpackage;

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
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class a50 extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public a50(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        int i;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        z40 z40Var = new z40(this, menu);
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
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            Menu menu2 = z40Var.a;
            if (eventType != i) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z2 = false;
                        str = null;
                        eventType = xmlPullParser2.next();
                        i = 2;
                        z = z;
                        z2 = z2;
                    } else if (name2.equals("group")) {
                        z40Var.b = 0;
                        z40Var.c = 0;
                        z40Var.d = 0;
                        z40Var.e = 0;
                        z40Var.f = true;
                        z40Var.g = true;
                    } else if (name2.equals("item")) {
                        if (!z40Var.h) {
                            fu fuVar = z40Var.z;
                            if (fuVar == null || !fuVar.b.hasSubMenu()) {
                                z40Var.h = true;
                                z40Var.b(menu2.add(z40Var.b, z40Var.i, z40Var.j, z40Var.k));
                            } else {
                                z40Var.h = true;
                                z40Var.b(menu2.addSubMenu(z40Var.b, z40Var.i, z40Var.j, z40Var.k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        xmlPullParser2 = xmlPullParser;
                        z = true;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z = z;
            } else {
                if (!z2) {
                    String name3 = xmlPullParser.getName();
                    boolean equals = name3.equals("group");
                    Context context = this.c;
                    if (equals) {
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, my.p);
                        z40Var.b = obtainStyledAttributes.getResourceId(1, 0);
                        z40Var.c = obtainStyledAttributes.getInt(3, 0);
                        z40Var.d = obtainStyledAttributes.getInt(4, 0);
                        z40Var.e = obtainStyledAttributes.getInt(5, 0);
                        z40Var.f = obtainStyledAttributes.getBoolean(2, true);
                        z40Var.g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, my.q);
                            z40Var.i = obtainStyledAttributes2.getResourceId(2, 0);
                            z40Var.j = (obtainStyledAttributes2.getInt(5, z40Var.c) & (-65536)) | (obtainStyledAttributes2.getInt(6, z40Var.d) & 65535);
                            z40Var.k = obtainStyledAttributes2.getText(7);
                            z40Var.l = obtainStyledAttributes2.getText(8);
                            z40Var.m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            z40Var.n = string == null ? (char) 0 : string.charAt(0);
                            z40Var.o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            z40Var.p = string2 == null ? (char) 0 : string2.charAt(0);
                            z40Var.q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                z40Var.r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                z40Var.r = z40Var.e;
                            }
                            z40Var.s = obtainStyledAttributes2.getBoolean(3, false);
                            z40Var.t = obtainStyledAttributes2.getBoolean(4, z40Var.f);
                            z40Var.u = obtainStyledAttributes2.getBoolean(1, z40Var.g);
                            z40Var.v = obtainStyledAttributes2.getInt(21, -1);
                            z40Var.y = obtainStyledAttributes2.getString(12);
                            z40Var.w = obtainStyledAttributes2.getResourceId(13, 0);
                            z40Var.x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z3 = string3 != null;
                            if (z3 && z40Var.w == 0 && z40Var.x == null) {
                                z40Var.z = (fu) z40Var.a(string3, f, this.b);
                            } else {
                                if (z3) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                z40Var.z = null;
                            }
                            z40Var.A = obtainStyledAttributes2.getText(17);
                            z40Var.B = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                z40Var.D = xf.b(obtainStyledAttributes2.getInt(19, -1), z40Var.D);
                            } else {
                                z40Var.D = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = j8.q(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                z40Var.C = colorStateList;
                            } else {
                                z40Var.C = null;
                            }
                            obtainStyledAttributes2.recycle();
                            z40Var.h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            z40Var.h = true;
                            SubMenu addSubMenu = menu2.addSubMenu(z40Var.b, z40Var.i, z40Var.j, z40Var.k);
                            z40Var.b(addSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet, addSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z2 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i = 2;
                        z = z;
                        z2 = z2;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z = z;
            }
            eventType = xmlPullParser2.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof au)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z = false;
        try {
            try {
                xmlResourceParser = this.c.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof au) {
                    au auVar = (au) menu;
                    if (!auVar.p) {
                        auVar.w();
                        z = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z) {
                    ((au) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((au) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
