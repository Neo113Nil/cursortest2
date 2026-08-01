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

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class eg0 extends MenuInflater {
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

    public eg0(Context context) {
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
        dg0 dg0Var = new dg0(this, menu);
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
            Menu menu2 = dg0Var.a;
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
                        dg0Var.b = 0;
                        dg0Var.c = 0;
                        dg0Var.d = 0;
                        dg0Var.e = 0;
                        dg0Var.f = true;
                        dg0Var.g = true;
                    } else if (name2.equals("item")) {
                        if (!dg0Var.h) {
                            v10 v10Var = dg0Var.z;
                            if (v10Var == null || !v10Var.b.hasSubMenu()) {
                                dg0Var.h = true;
                                dg0Var.b(menu2.add(dg0Var.b, dg0Var.i, dg0Var.j, dg0Var.k));
                            } else {
                                dg0Var.h = true;
                                dg0Var.b(menu2.addSubMenu(dg0Var.b, dg0Var.i, dg0Var.j, dg0Var.k).getItem());
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
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d70.p);
                        dg0Var.b = obtainStyledAttributes.getResourceId(1, 0);
                        dg0Var.c = obtainStyledAttributes.getInt(3, 0);
                        dg0Var.d = obtainStyledAttributes.getInt(4, 0);
                        dg0Var.e = obtainStyledAttributes.getInt(5, 0);
                        dg0Var.f = obtainStyledAttributes.getBoolean(2, true);
                        dg0Var.g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, d70.q);
                            dg0Var.i = obtainStyledAttributes2.getResourceId(2, 0);
                            dg0Var.j = (obtainStyledAttributes2.getInt(5, dg0Var.c) & (-65536)) | (obtainStyledAttributes2.getInt(6, dg0Var.d) & 65535);
                            dg0Var.k = obtainStyledAttributes2.getText(7);
                            dg0Var.l = obtainStyledAttributes2.getText(8);
                            dg0Var.m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            dg0Var.n = string == null ? (char) 0 : string.charAt(0);
                            dg0Var.o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            dg0Var.p = string2 == null ? (char) 0 : string2.charAt(0);
                            dg0Var.q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                dg0Var.r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                dg0Var.r = dg0Var.e;
                            }
                            dg0Var.s = obtainStyledAttributes2.getBoolean(3, false);
                            dg0Var.t = obtainStyledAttributes2.getBoolean(4, dg0Var.f);
                            dg0Var.u = obtainStyledAttributes2.getBoolean(1, dg0Var.g);
                            dg0Var.v = obtainStyledAttributes2.getInt(21, -1);
                            dg0Var.y = obtainStyledAttributes2.getString(12);
                            dg0Var.w = obtainStyledAttributes2.getResourceId(13, 0);
                            dg0Var.x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z3 = string3 != null;
                            if (z3 && dg0Var.w == 0 && dg0Var.x == null) {
                                dg0Var.z = (v10) dg0Var.a(string3, f, this.b);
                            } else {
                                if (z3) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                dg0Var.z = null;
                            }
                            dg0Var.A = obtainStyledAttributes2.getText(17);
                            dg0Var.B = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                dg0Var.D = rk.b(obtainStyledAttributes2.getInt(19, -1), dg0Var.D);
                            } else {
                                dg0Var.D = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = bi.A(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                dg0Var.C = colorStateList;
                            } else {
                                dg0Var.C = null;
                            }
                            obtainStyledAttributes2.recycle();
                            dg0Var.h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            dg0Var.h = true;
                            SubMenu addSubMenu = menu2.addSubMenu(dg0Var.b, dg0Var.i, dg0Var.j, dg0Var.k);
                            dg0Var.b(addSubMenu.getItem());
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
        if (!(menu instanceof r10)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z = false;
        try {
            try {
                xmlResourceParser = this.c.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof r10) {
                    r10 r10Var = (r10) menu;
                    if (!r10Var.p) {
                        r10Var.w();
                        z = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z) {
                    ((r10) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((r10) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
