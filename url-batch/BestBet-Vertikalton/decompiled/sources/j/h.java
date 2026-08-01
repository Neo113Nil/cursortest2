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
import k.ActionProviderVisibilityListenerC0193q;
import k.MenuC0189m;
import l.AbstractC0245l0;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class h extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f3063e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f3064f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f3065a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f3066b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f3067c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        f3063e = clsArr;
        f3064f = clsArr;
    }

    public h(Context context) {
        super(context);
        this.f3067c = context;
        Object[] objArr = {context};
        this.f3065a = objArr;
        this.f3066b = objArr;
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
                        gVar.f3041b = 0;
                        gVar.f3042c = 0;
                        gVar.d = 0;
                        gVar.f3043e = 0;
                        gVar.f3044f = r4;
                        gVar.f3045g = r4;
                    } else if (name2.equals("item")) {
                        if (!gVar.h) {
                            ActionProviderVisibilityListenerC0193q actionProviderVisibilityListenerC0193q = gVar.f3062z;
                            if (actionProviderVisibilityListenerC0193q == null || !actionProviderVisibilityListenerC0193q.f3215b.hasSubMenu()) {
                                gVar.h = r4;
                                gVar.b(gVar.f3040a.add(gVar.f3041b, gVar.i, gVar.f3046j, gVar.f3047k));
                            } else {
                                gVar.h = r4;
                                gVar.b(gVar.f3040a.addSubMenu(gVar.f3041b, gVar.i, gVar.f3046j, gVar.f3047k).getItem());
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
                    h hVar = gVar.f3039E;
                    if (equals) {
                        TypedArray obtainStyledAttributes = hVar.f3067c.obtainStyledAttributes(attributeSet, f.a.f2526p);
                        gVar.f3041b = obtainStyledAttributes.getResourceId(r4, 0);
                        gVar.f3042c = obtainStyledAttributes.getInt(3, 0);
                        gVar.d = obtainStyledAttributes.getInt(4, 0);
                        gVar.f3043e = obtainStyledAttributes.getInt(5, 0);
                        gVar.f3044f = obtainStyledAttributes.getBoolean(2, r4);
                        gVar.f3045g = obtainStyledAttributes.getBoolean(0, r4);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = hVar.f3067c;
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f2527q);
                            gVar.i = obtainStyledAttributes2.getResourceId(2, 0);
                            gVar.f3046j = (obtainStyledAttributes2.getInt(5, gVar.f3042c) & (-65536)) | (obtainStyledAttributes2.getInt(6, gVar.d) & 65535);
                            gVar.f3047k = obtainStyledAttributes2.getText(7);
                            gVar.f3048l = obtainStyledAttributes2.getText(8);
                            gVar.f3049m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            gVar.f3050n = string == null ? (char) 0 : string.charAt(0);
                            gVar.f3051o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            gVar.f3052p = string2 == null ? (char) 0 : string2.charAt(0);
                            gVar.f3053q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                gVar.f3054r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                gVar.f3054r = gVar.f3043e;
                            }
                            gVar.f3055s = obtainStyledAttributes2.getBoolean(3, false);
                            gVar.f3056t = obtainStyledAttributes2.getBoolean(4, gVar.f3044f);
                            gVar.f3057u = obtainStyledAttributes2.getBoolean(1, gVar.f3045g);
                            gVar.f3058v = obtainStyledAttributes2.getInt(21, -1);
                            gVar.f3061y = obtainStyledAttributes2.getString(12);
                            gVar.f3059w = obtainStyledAttributes2.getResourceId(13, 0);
                            gVar.f3060x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z5 = string3 != null;
                            if (z5 && gVar.f3059w == 0 && gVar.f3060x == null) {
                                gVar.f3062z = (ActionProviderVisibilityListenerC0193q) gVar.a(string3, f3064f, hVar.f3066b);
                            } else {
                                if (z5) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                gVar.f3062z = null;
                            }
                            gVar.f3035A = obtainStyledAttributes2.getText(17);
                            gVar.f3036B = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                gVar.f3038D = AbstractC0245l0.b(obtainStyledAttributes2.getInt(19, -1), gVar.f3038D);
                            } else {
                                gVar.f3038D = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = H1.d.z(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                gVar.f3037C = colorStateList;
                            } else {
                                gVar.f3037C = null;
                            }
                            obtainStyledAttributes2.recycle();
                            gVar.h = false;
                            z2 = true;
                        } else if (name3.equals("menu")) {
                            z2 = true;
                            gVar.h = true;
                            SubMenu addSubMenu = gVar.f3040a.addSubMenu(gVar.f3041b, gVar.i, gVar.f3046j, gVar.f3047k);
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
        if (!(menu instanceof MenuC0189m)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z2 = false;
        try {
            try {
                xmlResourceParser = this.f3067c.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof MenuC0189m) {
                    MenuC0189m menuC0189m = (MenuC0189m) menu;
                    if (!menuC0189m.f3175p) {
                        menuC0189m.w();
                        z2 = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z2) {
                    ((MenuC0189m) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z2) {
                ((MenuC0189m) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
