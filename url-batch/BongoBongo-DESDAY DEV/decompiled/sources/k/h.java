package k;

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
import f.AbstractC0097a;
import java.io.IOException;
import l.ActionProviderVisibilityListenerC0172p;
import l.MenuC0169m;
import m.AbstractC0234q0;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class h extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f2718e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f2719f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2720a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f2721b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2722c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        f2718e = clsArr;
        f2719f = clsArr;
    }

    public h(Context context) {
        super(context);
        this.f2722c = context;
        Object[] objArr = {context};
        this.f2720a = objArr;
        this.f2721b = objArr;
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
                        gVar.f2695b = 0;
                        gVar.f2696c = 0;
                        gVar.d = 0;
                        gVar.f2697e = 0;
                        gVar.f2698f = r4;
                        gVar.f2699g = r4;
                    } else if (name2.equals("item")) {
                        if (!gVar.f2700h) {
                            ActionProviderVisibilityListenerC0172p actionProviderVisibilityListenerC0172p = gVar.f2717z;
                            if (actionProviderVisibilityListenerC0172p == null || !actionProviderVisibilityListenerC0172p.f2868b.hasSubMenu()) {
                                gVar.f2700h = r4;
                                gVar.b(gVar.f2694a.add(gVar.f2695b, gVar.i, gVar.f2701j, gVar.f2702k));
                            } else {
                                gVar.f2700h = r4;
                                gVar.b(gVar.f2694a.addSubMenu(gVar.f2695b, gVar.i, gVar.f2701j, gVar.f2702k).getItem());
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
                    h hVar = gVar.f2693E;
                    if (equals) {
                        TypedArray obtainStyledAttributes = hVar.f2722c.obtainStyledAttributes(attributeSet, AbstractC0097a.f2149p);
                        gVar.f2695b = obtainStyledAttributes.getResourceId(r4, 0);
                        gVar.f2696c = obtainStyledAttributes.getInt(3, 0);
                        gVar.d = obtainStyledAttributes.getInt(4, 0);
                        gVar.f2697e = obtainStyledAttributes.getInt(5, 0);
                        gVar.f2698f = obtainStyledAttributes.getBoolean(2, r4);
                        gVar.f2699g = obtainStyledAttributes.getBoolean(0, r4);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = hVar.f2722c;
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0097a.f2150q);
                            gVar.i = obtainStyledAttributes2.getResourceId(2, 0);
                            gVar.f2701j = (obtainStyledAttributes2.getInt(5, gVar.f2696c) & (-65536)) | (obtainStyledAttributes2.getInt(6, gVar.d) & 65535);
                            gVar.f2702k = obtainStyledAttributes2.getText(7);
                            gVar.f2703l = obtainStyledAttributes2.getText(8);
                            gVar.f2704m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            gVar.f2705n = string == null ? (char) 0 : string.charAt(0);
                            gVar.f2706o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            gVar.f2707p = string2 == null ? (char) 0 : string2.charAt(0);
                            gVar.f2708q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                gVar.f2709r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                gVar.f2709r = gVar.f2697e;
                            }
                            gVar.f2710s = obtainStyledAttributes2.getBoolean(3, false);
                            gVar.f2711t = obtainStyledAttributes2.getBoolean(4, gVar.f2698f);
                            gVar.f2712u = obtainStyledAttributes2.getBoolean(1, gVar.f2699g);
                            gVar.f2713v = obtainStyledAttributes2.getInt(21, -1);
                            gVar.f2716y = obtainStyledAttributes2.getString(12);
                            gVar.f2714w = obtainStyledAttributes2.getResourceId(13, 0);
                            gVar.f2715x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z5 = string3 != null;
                            if (z5 && gVar.f2714w == 0 && gVar.f2715x == null) {
                                gVar.f2717z = (ActionProviderVisibilityListenerC0172p) gVar.a(string3, f2719f, hVar.f2721b);
                            } else {
                                if (z5) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                gVar.f2717z = null;
                            }
                            gVar.f2689A = obtainStyledAttributes2.getText(17);
                            gVar.f2690B = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                gVar.f2692D = AbstractC0234q0.c(obtainStyledAttributes2.getInt(19, -1), gVar.f2692D);
                            } else {
                                gVar.f2692D = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = A1.m.s(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                gVar.f2691C = colorStateList;
                            } else {
                                gVar.f2691C = null;
                            }
                            obtainStyledAttributes2.recycle();
                            gVar.f2700h = false;
                            z2 = true;
                        } else if (name3.equals("menu")) {
                            z2 = true;
                            gVar.f2700h = true;
                            SubMenu addSubMenu = gVar.f2694a.addSubMenu(gVar.f2695b, gVar.i, gVar.f2701j, gVar.f2702k);
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
        if (!(menu instanceof MenuC0169m)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z2 = false;
        try {
            try {
                xmlResourceParser = this.f2722c.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof MenuC0169m) {
                    MenuC0169m menuC0169m = (MenuC0169m) menu;
                    if (!menuC0169m.f2828p) {
                        menuC0169m.w();
                        z2 = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z2) {
                    ((MenuC0169m) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z2) {
                ((MenuC0169m) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
