package j;

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
import k.ActionProviderVisibilityListenerC0169p;
import k.MenuC0166m;
import l.AbstractC0224m0;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class h extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f2619e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f2620f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2621a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f2622b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2623c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        f2619e = clsArr;
        f2620f = clsArr;
    }

    public h(Context context) {
        super(context);
        this.f2623c = context;
        Object[] objArr = {context};
        this.f2621a = objArr;
        this.f2622b = objArr;
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
                        gVar.f2597b = 0;
                        gVar.f2598c = 0;
                        gVar.d = 0;
                        gVar.f2599e = 0;
                        gVar.f2600f = r4;
                        gVar.f2601g = r4;
                    } else if (name2.equals("item")) {
                        if (!gVar.h) {
                            ActionProviderVisibilityListenerC0169p actionProviderVisibilityListenerC0169p = gVar.f2618z;
                            if (actionProviderVisibilityListenerC0169p == null || !actionProviderVisibilityListenerC0169p.f2764b.hasSubMenu()) {
                                gVar.h = r4;
                                gVar.b(gVar.f2596a.add(gVar.f2597b, gVar.i, gVar.f2602j, gVar.f2603k));
                            } else {
                                gVar.h = r4;
                                gVar.b(gVar.f2596a.addSubMenu(gVar.f2597b, gVar.i, gVar.f2602j, gVar.f2603k).getItem());
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
                    h hVar = gVar.f2595E;
                    if (equals) {
                        TypedArray obtainStyledAttributes = hVar.f2623c.obtainStyledAttributes(attributeSet, f.a.f2110p);
                        gVar.f2597b = obtainStyledAttributes.getResourceId(r4, 0);
                        gVar.f2598c = obtainStyledAttributes.getInt(3, 0);
                        gVar.d = obtainStyledAttributes.getInt(4, 0);
                        gVar.f2599e = obtainStyledAttributes.getInt(5, 0);
                        gVar.f2600f = obtainStyledAttributes.getBoolean(2, r4);
                        gVar.f2601g = obtainStyledAttributes.getBoolean(0, r4);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = hVar.f2623c;
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f2111q);
                            gVar.i = obtainStyledAttributes2.getResourceId(2, 0);
                            gVar.f2602j = (obtainStyledAttributes2.getInt(5, gVar.f2598c) & (-65536)) | (obtainStyledAttributes2.getInt(6, gVar.d) & 65535);
                            gVar.f2603k = obtainStyledAttributes2.getText(7);
                            gVar.f2604l = obtainStyledAttributes2.getText(8);
                            gVar.f2605m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            gVar.f2606n = string == null ? (char) 0 : string.charAt(0);
                            gVar.f2607o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            gVar.f2608p = string2 == null ? (char) 0 : string2.charAt(0);
                            gVar.f2609q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                gVar.f2610r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                gVar.f2610r = gVar.f2599e;
                            }
                            gVar.f2611s = obtainStyledAttributes2.getBoolean(3, false);
                            gVar.f2612t = obtainStyledAttributes2.getBoolean(4, gVar.f2600f);
                            gVar.f2613u = obtainStyledAttributes2.getBoolean(1, gVar.f2601g);
                            gVar.f2614v = obtainStyledAttributes2.getInt(21, -1);
                            gVar.f2617y = obtainStyledAttributes2.getString(12);
                            gVar.f2615w = obtainStyledAttributes2.getResourceId(13, 0);
                            gVar.f2616x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z5 = string3 != null;
                            if (z5 && gVar.f2615w == 0 && gVar.f2616x == null) {
                                gVar.f2618z = (ActionProviderVisibilityListenerC0169p) gVar.a(string3, f2620f, hVar.f2622b);
                            } else {
                                if (z5) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                gVar.f2618z = null;
                            }
                            gVar.f2591A = obtainStyledAttributes2.getText(17);
                            gVar.f2592B = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                gVar.f2594D = AbstractC0224m0.b(obtainStyledAttributes2.getInt(19, -1), gVar.f2594D);
                            } else {
                                gVar.f2594D = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = z1.d.C(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                gVar.f2593C = colorStateList;
                            } else {
                                gVar.f2593C = null;
                            }
                            obtainStyledAttributes2.recycle();
                            gVar.h = false;
                            z2 = true;
                        } else if (name3.equals("menu")) {
                            z2 = true;
                            gVar.h = true;
                            SubMenu addSubMenu = gVar.f2596a.addSubMenu(gVar.f2597b, gVar.i, gVar.f2602j, gVar.f2603k);
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
        if (!(menu instanceof MenuC0166m)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z2 = false;
        try {
            try {
                xmlResourceParser = this.f2623c.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof MenuC0166m) {
                    MenuC0166m menuC0166m = (MenuC0166m) menu;
                    if (!menuC0166m.f2725p) {
                        menuC0166m.w();
                        z2 = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z2) {
                    ((MenuC0166m) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z2) {
                ((MenuC0166m) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
