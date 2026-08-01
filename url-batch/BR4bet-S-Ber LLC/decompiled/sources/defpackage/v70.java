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

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class v70 extends MenuInflater {
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

    public v70(Context context) {
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
        u70 u70Var = new u70(this, menu);
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
            Menu menu2 = u70Var.a;
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
                        u70Var.b = 0;
                        u70Var.c = 0;
                        u70Var.d = 0;
                        u70Var.e = 0;
                        u70Var.f = true;
                        u70Var.g = true;
                    } else if (name2.equals("item")) {
                        if (!u70Var.h) {
                            rw rwVar = u70Var.z;
                            if (rwVar == null || !rwVar.b.hasSubMenu()) {
                                u70Var.h = true;
                                u70Var.b(menu2.add(u70Var.b, u70Var.i, u70Var.j, u70Var.k));
                            } else {
                                u70Var.h = true;
                                u70Var.b(menu2.addSubMenu(u70Var.b, u70Var.i, u70Var.j, u70Var.k).getItem());
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
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z00.p);
                        u70Var.b = obtainStyledAttributes.getResourceId(1, 0);
                        u70Var.c = obtainStyledAttributes.getInt(3, 0);
                        u70Var.d = obtainStyledAttributes.getInt(4, 0);
                        u70Var.e = obtainStyledAttributes.getInt(5, 0);
                        u70Var.f = obtainStyledAttributes.getBoolean(2, true);
                        u70Var.g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, z00.q);
                            u70Var.i = obtainStyledAttributes2.getResourceId(2, 0);
                            u70Var.j = (obtainStyledAttributes2.getInt(5, u70Var.c) & (-65536)) | (obtainStyledAttributes2.getInt(6, u70Var.d) & 65535);
                            u70Var.k = obtainStyledAttributes2.getText(7);
                            u70Var.l = obtainStyledAttributes2.getText(8);
                            u70Var.m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            u70Var.n = string == null ? (char) 0 : string.charAt(0);
                            u70Var.o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            u70Var.p = string2 == null ? (char) 0 : string2.charAt(0);
                            u70Var.q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                u70Var.r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                u70Var.r = u70Var.e;
                            }
                            u70Var.s = obtainStyledAttributes2.getBoolean(3, false);
                            u70Var.t = obtainStyledAttributes2.getBoolean(4, u70Var.f);
                            u70Var.u = obtainStyledAttributes2.getBoolean(1, u70Var.g);
                            u70Var.v = obtainStyledAttributes2.getInt(21, -1);
                            u70Var.y = obtainStyledAttributes2.getString(12);
                            u70Var.w = obtainStyledAttributes2.getResourceId(13, 0);
                            u70Var.x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z3 = string3 != null;
                            if (z3 && u70Var.w == 0 && u70Var.x == null) {
                                u70Var.z = (rw) u70Var.a(string3, f, this.b);
                            } else {
                                if (z3) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                u70Var.z = null;
                            }
                            u70Var.A = obtainStyledAttributes2.getText(17);
                            u70Var.B = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                u70Var.D = gi.b(obtainStyledAttributes2.getInt(19, -1), u70Var.D);
                            } else {
                                u70Var.D = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = la0.w(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                u70Var.C = colorStateList;
                            } else {
                                u70Var.C = null;
                            }
                            obtainStyledAttributes2.recycle();
                            u70Var.h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            u70Var.h = true;
                            SubMenu addSubMenu = menu2.addSubMenu(u70Var.b, u70Var.i, u70Var.j, u70Var.k);
                            u70Var.b(addSubMenu.getItem());
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
        if (!(menu instanceof mw)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z = false;
        try {
            try {
                xmlResourceParser = this.c.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof mw) {
                    mw mwVar = (mw) menu;
                    if (!mwVar.p) {
                        mwVar.w();
                        z = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z) {
                    ((mw) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((mw) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
