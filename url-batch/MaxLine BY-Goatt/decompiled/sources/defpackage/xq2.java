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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xq2 extends MenuInflater {
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

    public xq2(Context context) {
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
        wq2 wq2Var = new wq2(this, menu);
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
            Menu menu2 = wq2Var.a;
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
                        wq2Var.b = 0;
                        wq2Var.c = 0;
                        wq2Var.d = 0;
                        wq2Var.e = 0;
                        wq2Var.f = true;
                        wq2Var.g = true;
                    } else if (name2.equals("item")) {
                        if (!wq2Var.h) {
                            nk1 nk1Var = wq2Var.z;
                            if (nk1Var == null || !nk1Var.b.hasSubMenu()) {
                                wq2Var.h = true;
                                wq2Var.b(menu2.add(wq2Var.b, wq2Var.i, wq2Var.j, wq2Var.k));
                            } else {
                                wq2Var.h = true;
                                wq2Var.b(menu2.addSubMenu(wq2Var.b, wq2Var.i, wq2Var.j, wq2Var.k).getItem());
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
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b62.p);
                        wq2Var.b = obtainStyledAttributes.getResourceId(1, 0);
                        wq2Var.c = obtainStyledAttributes.getInt(3, 0);
                        wq2Var.d = obtainStyledAttributes.getInt(4, 0);
                        wq2Var.e = obtainStyledAttributes.getInt(5, 0);
                        wq2Var.f = obtainStyledAttributes.getBoolean(2, true);
                        wq2Var.g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, b62.q);
                            wq2Var.i = obtainStyledAttributes2.getResourceId(2, 0);
                            wq2Var.j = (obtainStyledAttributes2.getInt(5, wq2Var.c) & (-65536)) | (obtainStyledAttributes2.getInt(6, wq2Var.d) & 65535);
                            wq2Var.k = obtainStyledAttributes2.getText(7);
                            wq2Var.l = obtainStyledAttributes2.getText(8);
                            wq2Var.m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            wq2Var.n = string == null ? (char) 0 : string.charAt(0);
                            wq2Var.o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            wq2Var.p = string2 == null ? (char) 0 : string2.charAt(0);
                            wq2Var.q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                wq2Var.r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                wq2Var.r = wq2Var.e;
                            }
                            wq2Var.s = obtainStyledAttributes2.getBoolean(3, false);
                            wq2Var.t = obtainStyledAttributes2.getBoolean(4, wq2Var.f);
                            wq2Var.u = obtainStyledAttributes2.getBoolean(1, wq2Var.g);
                            wq2Var.v = obtainStyledAttributes2.getInt(21, -1);
                            wq2Var.y = obtainStyledAttributes2.getString(12);
                            wq2Var.w = obtainStyledAttributes2.getResourceId(13, 0);
                            wq2Var.x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z3 = string3 != null;
                            if (z3 && wq2Var.w == 0 && wq2Var.x == null) {
                                wq2Var.z = (nk1) wq2Var.a(string3, f, this.b);
                            } else {
                                if (z3) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                wq2Var.z = null;
                            }
                            wq2Var.A = obtainStyledAttributes2.getText(17);
                            wq2Var.B = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                wq2Var.D = he0.b(obtainStyledAttributes2.getInt(19, -1), wq2Var.D);
                            } else {
                                wq2Var.D = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = j8.D(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                wq2Var.C = colorStateList;
                            } else {
                                wq2Var.C = null;
                            }
                            obtainStyledAttributes2.recycle();
                            wq2Var.h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            wq2Var.h = true;
                            SubMenu addSubMenu = menu2.addSubMenu(wq2Var.b, wq2Var.i, wq2Var.j, wq2Var.k);
                            wq2Var.b(addSubMenu.getItem());
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
        if (!(menu instanceof fk1)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z = false;
        try {
            try {
                xmlResourceParser = this.c.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof fk1) {
                    fk1 fk1Var = (fk1) menu;
                    if (!fk1Var.p) {
                        fk1Var.w();
                        z = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z) {
                    ((fk1) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((fk1) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
