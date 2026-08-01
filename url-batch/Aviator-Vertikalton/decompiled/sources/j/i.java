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
import k.ActionProviderVisibilityListenerC0203p;
import k.MenuC0200m;
import l.AbstractC0277o0;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class i extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f2854e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f2855f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2856a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f2857b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2858c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2859d;

    static {
        Class[] clsArr = {Context.class};
        f2854e = clsArr;
        f2855f = clsArr;
    }

    public i(Context context) {
        super(context);
        this.f2858c = context;
        Object[] objArr = {context};
        this.f2856a = objArr;
        this.f2857b = objArr;
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
        h hVar = new h(this, menu);
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
                        hVar.f2831b = 0;
                        hVar.f2832c = 0;
                        hVar.f2833d = 0;
                        hVar.f2834e = 0;
                        hVar.f2835f = r4;
                        hVar.f2836g = r4;
                    } else if (name2.equals("item")) {
                        if (!hVar.h) {
                            ActionProviderVisibilityListenerC0203p actionProviderVisibilityListenerC0203p = hVar.f2853z;
                            if (actionProviderVisibilityListenerC0203p == null || !actionProviderVisibilityListenerC0203p.f3110b.hasSubMenu()) {
                                hVar.h = r4;
                                hVar.b(hVar.f2830a.add(hVar.f2831b, hVar.i, hVar.f2837j, hVar.f2838k));
                            } else {
                                hVar.h = r4;
                                hVar.b(hVar.f2830a.addSubMenu(hVar.f2831b, hVar.i, hVar.f2837j, hVar.f2838k).getItem());
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
                    i iVar = hVar.f2829E;
                    if (equals) {
                        TypedArray obtainStyledAttributes = iVar.f2858c.obtainStyledAttributes(attributeSet, f.a.f2400p);
                        hVar.f2831b = obtainStyledAttributes.getResourceId(r4, 0);
                        hVar.f2832c = obtainStyledAttributes.getInt(3, 0);
                        hVar.f2833d = obtainStyledAttributes.getInt(4, 0);
                        hVar.f2834e = obtainStyledAttributes.getInt(5, 0);
                        hVar.f2835f = obtainStyledAttributes.getBoolean(2, r4);
                        hVar.f2836g = obtainStyledAttributes.getBoolean(0, r4);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = iVar.f2858c;
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f2401q);
                            hVar.i = obtainStyledAttributes2.getResourceId(2, 0);
                            hVar.f2837j = (obtainStyledAttributes2.getInt(5, hVar.f2832c) & (-65536)) | (obtainStyledAttributes2.getInt(6, hVar.f2833d) & 65535);
                            hVar.f2838k = obtainStyledAttributes2.getText(7);
                            hVar.f2839l = obtainStyledAttributes2.getText(8);
                            hVar.f2840m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            hVar.f2841n = string == null ? (char) 0 : string.charAt(0);
                            hVar.f2842o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            hVar.f2843p = string2 == null ? (char) 0 : string2.charAt(0);
                            hVar.f2844q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                hVar.f2845r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                hVar.f2845r = hVar.f2834e;
                            }
                            hVar.f2846s = obtainStyledAttributes2.getBoolean(3, false);
                            hVar.f2847t = obtainStyledAttributes2.getBoolean(4, hVar.f2835f);
                            hVar.f2848u = obtainStyledAttributes2.getBoolean(1, hVar.f2836g);
                            hVar.f2849v = obtainStyledAttributes2.getInt(21, -1);
                            hVar.f2852y = obtainStyledAttributes2.getString(12);
                            hVar.f2850w = obtainStyledAttributes2.getResourceId(13, 0);
                            hVar.f2851x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z5 = string3 != null;
                            if (z5 && hVar.f2850w == 0 && hVar.f2851x == null) {
                                hVar.f2853z = (ActionProviderVisibilityListenerC0203p) hVar.a(string3, f2855f, iVar.f2857b);
                            } else {
                                if (z5) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                hVar.f2853z = null;
                            }
                            hVar.f2825A = obtainStyledAttributes2.getText(17);
                            hVar.f2826B = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                hVar.f2828D = AbstractC0277o0.b(obtainStyledAttributes2.getInt(19, -1), hVar.f2828D);
                            } else {
                                hVar.f2828D = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = q1.d.w(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                hVar.f2827C = colorStateList;
                            } else {
                                hVar.f2827C = null;
                            }
                            obtainStyledAttributes2.recycle();
                            hVar.h = false;
                            z2 = true;
                        } else if (name3.equals("menu")) {
                            z2 = true;
                            hVar.h = true;
                            SubMenu addSubMenu = hVar.f2830a.addSubMenu(hVar.f2831b, hVar.i, hVar.f2837j, hVar.f2838k);
                            hVar.b(addSubMenu.getItem());
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
        if (!(menu instanceof MenuC0200m)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z2 = false;
        try {
            try {
                xmlResourceParser = this.f2858c.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof MenuC0200m) {
                    MenuC0200m menuC0200m = (MenuC0200m) menu;
                    if (!menuC0200m.f3070p) {
                        menuC0200m.w();
                        z2 = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z2) {
                    ((MenuC0200m) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z2) {
                ((MenuC0200m) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
