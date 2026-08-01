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
import g.AbstractC0122a;
import java.io.IOException;
import m.ActionProviderVisibilityListenerC0232p;
import m.MenuC0229m;
import n.AbstractC0293p0;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class h extends MenuInflater {
    public static final Class[] e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f3233f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f3234a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f3235b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f3236c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3237d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f3233f = clsArr;
    }

    public h(Context context) {
        super(context);
        this.f3236c = context;
        Object[] objArr = {context};
        this.f3234a = objArr;
        this.f3235b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v60 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        ?? r4;
        int i;
        boolean z2;
        ColorStateList colorStateList;
        int resourceId;
        g gVar = new g(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r4 = 1;
            i = 2;
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
            if (eventType == r4) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z4 && name2.equals(str)) {
                        z2 = r4;
                        z4 = false;
                        str = null;
                        eventType = xmlResourceParser.next();
                        r4 = z2;
                        i = 2;
                        z4 = z4;
                    } else if (name2.equals("group")) {
                        gVar.f3211b = 0;
                        gVar.f3212c = 0;
                        gVar.f3213d = 0;
                        gVar.e = 0;
                        gVar.f3214f = r4;
                        gVar.f3215g = r4;
                    } else if (name2.equals("item")) {
                        if (!gVar.f3216h) {
                            ActionProviderVisibilityListenerC0232p actionProviderVisibilityListenerC0232p = gVar.f3232z;
                            if (actionProviderVisibilityListenerC0232p == null || !actionProviderVisibilityListenerC0232p.f3399b.hasSubMenu()) {
                                gVar.f3216h = r4;
                                gVar.b(gVar.f3210a.add(gVar.f3211b, gVar.i, gVar.j, gVar.f3217k));
                            } else {
                                gVar.f3216h = r4;
                                gVar.b(gVar.f3210a.addSubMenu(gVar.f3211b, gVar.i, gVar.j, gVar.f3217k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z2 = r4;
                        z3 = z2;
                    }
                }
                z2 = r4;
            } else {
                if (!z4) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    h hVar = gVar.f3209E;
                    if (equals) {
                        TypedArray obtainStyledAttributes = hVar.f3236c.obtainStyledAttributes(attributeSet, AbstractC0122a.f2707p);
                        gVar.f3211b = obtainStyledAttributes.getResourceId(r4, 0);
                        gVar.f3212c = obtainStyledAttributes.getInt(3, 0);
                        gVar.f3213d = obtainStyledAttributes.getInt(4, 0);
                        gVar.e = obtainStyledAttributes.getInt(5, 0);
                        gVar.f3214f = obtainStyledAttributes.getBoolean(2, r4);
                        gVar.f3215g = obtainStyledAttributes.getBoolean(0, r4);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = hVar.f3236c;
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0122a.f2708q);
                            gVar.i = obtainStyledAttributes2.getResourceId(2, 0);
                            gVar.j = (obtainStyledAttributes2.getInt(5, gVar.f3212c) & (-65536)) | (obtainStyledAttributes2.getInt(6, gVar.f3213d) & 65535);
                            gVar.f3217k = obtainStyledAttributes2.getText(7);
                            gVar.f3218l = obtainStyledAttributes2.getText(8);
                            gVar.f3219m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            gVar.f3220n = string == null ? (char) 0 : string.charAt(0);
                            gVar.f3221o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            gVar.f3222p = string2 == null ? (char) 0 : string2.charAt(0);
                            gVar.f3223q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                gVar.f3224r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                gVar.f3224r = gVar.e;
                            }
                            gVar.f3225s = obtainStyledAttributes2.getBoolean(3, false);
                            gVar.f3226t = obtainStyledAttributes2.getBoolean(4, gVar.f3214f);
                            gVar.f3227u = obtainStyledAttributes2.getBoolean(1, gVar.f3215g);
                            gVar.f3228v = obtainStyledAttributes2.getInt(21, -1);
                            gVar.f3231y = obtainStyledAttributes2.getString(12);
                            gVar.f3229w = obtainStyledAttributes2.getResourceId(13, 0);
                            gVar.f3230x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z5 = string3 != null;
                            if (z5 && gVar.f3229w == 0 && gVar.f3230x == null) {
                                gVar.f3232z = (ActionProviderVisibilityListenerC0232p) gVar.a(string3, f3233f, hVar.f3235b);
                            } else {
                                if (z5) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                gVar.f3232z = null;
                            }
                            gVar.f3205A = obtainStyledAttributes2.getText(17);
                            gVar.f3206B = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                gVar.f3208D = AbstractC0293p0.c(obtainStyledAttributes2.getInt(19, -1), gVar.f3208D);
                            } else {
                                gVar.f3208D = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = H1.l.v(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                gVar.f3207C = colorStateList;
                            } else {
                                gVar.f3207C = null;
                            }
                            obtainStyledAttributes2.recycle();
                            gVar.f3216h = false;
                            z2 = true;
                        } else if (name3.equals("menu")) {
                            z2 = true;
                            gVar.f3216h = true;
                            SubMenu addSubMenu = gVar.f3210a.addSubMenu(gVar.f3211b, gVar.i, gVar.j, gVar.f3217k);
                            gVar.b(addSubMenu.getItem());
                            b(xmlResourceParser, attributeSet, addSubMenu);
                        } else {
                            z2 = true;
                            str = name3;
                            z4 = true;
                        }
                        eventType = xmlResourceParser.next();
                        r4 = z2;
                        i = 2;
                        z4 = z4;
                    }
                }
                z2 = r4;
            }
            eventType = xmlResourceParser.next();
            r4 = z2;
            i = 2;
            z4 = z4;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof MenuC0229m)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z2 = false;
        try {
            try {
                xmlResourceParser = this.f3236c.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof MenuC0229m) {
                    MenuC0229m menuC0229m = (MenuC0229m) menu;
                    if (!menuC0229m.f3360p) {
                        menuC0229m.w();
                        z2 = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z2) {
                    ((MenuC0229m) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z2) {
                ((MenuC0229m) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
