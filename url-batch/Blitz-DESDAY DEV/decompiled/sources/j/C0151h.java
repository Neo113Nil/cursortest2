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
import f.AbstractC0084a;
import java.io.IOException;
import k.p;
import l.AbstractC0202n0;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: j.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0151h extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f2665e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f2666f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2667a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f2668b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2669c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        f2665e = clsArr;
        f2666f = clsArr;
    }

    public C0151h(Context context) {
        super(context);
        this.f2669c = context;
        Object[] objArr = {context};
        this.f2667a = objArr;
        this.f2668b = objArr;
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
        C0150g c0150g = new C0150g(this, menu);
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
                        c0150g.f2643b = 0;
                        c0150g.f2644c = 0;
                        c0150g.d = 0;
                        c0150g.f2645e = 0;
                        c0150g.f2646f = r4;
                        c0150g.f2647g = r4;
                    } else if (name2.equals("item")) {
                        if (!c0150g.h) {
                            p pVar = c0150g.f2664z;
                            if (pVar == null || !pVar.f2816b.hasSubMenu()) {
                                c0150g.h = r4;
                                c0150g.b(c0150g.f2642a.add(c0150g.f2643b, c0150g.i, c0150g.f2648j, c0150g.f2649k));
                            } else {
                                c0150g.h = r4;
                                c0150g.b(c0150g.f2642a.addSubMenu(c0150g.f2643b, c0150g.i, c0150g.f2648j, c0150g.f2649k).getItem());
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
                    C0151h c0151h = c0150g.f2641E;
                    if (equals) {
                        TypedArray obtainStyledAttributes = c0151h.f2669c.obtainStyledAttributes(attributeSet, AbstractC0084a.f2139p);
                        c0150g.f2643b = obtainStyledAttributes.getResourceId(r4, 0);
                        c0150g.f2644c = obtainStyledAttributes.getInt(3, 0);
                        c0150g.d = obtainStyledAttributes.getInt(4, 0);
                        c0150g.f2645e = obtainStyledAttributes.getInt(5, 0);
                        c0150g.f2646f = obtainStyledAttributes.getBoolean(2, r4);
                        c0150g.f2647g = obtainStyledAttributes.getBoolean(0, r4);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = c0151h.f2669c;
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0084a.f2140q);
                            c0150g.i = obtainStyledAttributes2.getResourceId(2, 0);
                            c0150g.f2648j = (obtainStyledAttributes2.getInt(5, c0150g.f2644c) & (-65536)) | (obtainStyledAttributes2.getInt(6, c0150g.d) & 65535);
                            c0150g.f2649k = obtainStyledAttributes2.getText(7);
                            c0150g.f2650l = obtainStyledAttributes2.getText(8);
                            c0150g.f2651m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            c0150g.f2652n = string == null ? (char) 0 : string.charAt(0);
                            c0150g.f2653o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            c0150g.f2654p = string2 == null ? (char) 0 : string2.charAt(0);
                            c0150g.f2655q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                c0150g.f2656r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c0150g.f2656r = c0150g.f2645e;
                            }
                            c0150g.f2657s = obtainStyledAttributes2.getBoolean(3, false);
                            c0150g.f2658t = obtainStyledAttributes2.getBoolean(4, c0150g.f2646f);
                            c0150g.f2659u = obtainStyledAttributes2.getBoolean(1, c0150g.f2647g);
                            c0150g.f2660v = obtainStyledAttributes2.getInt(21, -1);
                            c0150g.f2663y = obtainStyledAttributes2.getString(12);
                            c0150g.f2661w = obtainStyledAttributes2.getResourceId(13, 0);
                            c0150g.f2662x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z5 = string3 != null;
                            if (z5 && c0150g.f2661w == 0 && c0150g.f2662x == null) {
                                c0150g.f2664z = (p) c0150g.a(string3, f2666f, c0151h.f2668b);
                            } else {
                                if (z5) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                c0150g.f2664z = null;
                            }
                            c0150g.f2637A = obtainStyledAttributes2.getText(17);
                            c0150g.f2638B = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                c0150g.f2640D = AbstractC0202n0.b(obtainStyledAttributes2.getInt(19, -1), c0150g.f2640D);
                            } else {
                                c0150g.f2640D = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = z1.l.D(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                c0150g.f2639C = colorStateList;
                            } else {
                                c0150g.f2639C = null;
                            }
                            obtainStyledAttributes2.recycle();
                            c0150g.h = false;
                            z2 = true;
                        } else if (name3.equals("menu")) {
                            z2 = true;
                            c0150g.h = true;
                            SubMenu addSubMenu = c0150g.f2642a.addSubMenu(c0150g.f2643b, c0150g.i, c0150g.f2648j, c0150g.f2649k);
                            c0150g.b(addSubMenu.getItem());
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
        if (!(menu instanceof k.m)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z2 = false;
        try {
            try {
                xmlResourceParser = this.f2669c.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof k.m) {
                    k.m mVar = (k.m) menu;
                    if (!mVar.f2777p) {
                        mVar.w();
                        z2 = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z2) {
                    ((k.m) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z2) {
                ((k.m) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
