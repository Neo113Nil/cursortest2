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
import g.AbstractC4518a;
import java.io.IOException;
import l.o;
import m.AbstractC4742j0;
import m.Q0;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: k.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4621i extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f38654e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f38655f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f38656a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f38657b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f38658c;

    /* renamed from: d, reason: collision with root package name */
    public Object f38659d;

    static {
        Class[] clsArr = {Context.class};
        f38654e = clsArr;
        f38655f = clsArr;
    }

    public C4621i(Context context) {
        super(context);
        this.f38658c = context;
        Object[] objArr = {context};
        this.f38656a = objArr;
        this.f38657b = objArr;
    }

    public static Object a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v59 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        ?? r42;
        int i;
        XmlResourceParser xmlResourceParser2;
        boolean z8;
        ColorStateList colorStateList;
        C4620h c4620h = new C4620h(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r42 = 1;
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
        boolean z9 = false;
        boolean z10 = false;
        String str = null;
        while (!z9) {
            if (eventType == r42) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z10 && name2.equals(str)) {
                        xmlResourceParser2 = xmlResourceParser;
                        z8 = r42;
                        z10 = false;
                        str = null;
                        eventType = xmlResourceParser2.next();
                        r42 = z8;
                        i = 2;
                        z10 = z10;
                    } else if (name2.equals("group")) {
                        c4620h.f38630b = 0;
                        c4620h.f38631c = 0;
                        c4620h.f38632d = 0;
                        c4620h.f38633e = 0;
                        c4620h.f38634f = r42;
                        c4620h.f38635g = r42;
                    } else if (name2.equals("item")) {
                        if (!c4620h.f38636h) {
                            o oVar = c4620h.f38653z;
                            if (oVar == null || !oVar.f39001b.hasSubMenu()) {
                                c4620h.f38636h = r42;
                                c4620h.b(c4620h.f38629a.add(c4620h.f38630b, c4620h.i, c4620h.f38637j, c4620h.f38638k));
                            } else {
                                c4620h.f38636h = r42;
                                c4620h.b(c4620h.f38629a.addSubMenu(c4620h.f38630b, c4620h.i, c4620h.f38637j, c4620h.f38638k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        xmlResourceParser2 = xmlResourceParser;
                        z8 = r42;
                        z9 = z8;
                    }
                }
                xmlResourceParser2 = xmlResourceParser;
                z8 = r42;
            } else {
                if (!z10) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    C4621i c4621i = c4620h.f38628E;
                    if (equals) {
                        TypedArray obtainStyledAttributes = c4621i.f38658c.obtainStyledAttributes(attributeSet, AbstractC4518a.f37833q);
                        c4620h.f38630b = obtainStyledAttributes.getResourceId(r42, 0);
                        c4620h.f38631c = obtainStyledAttributes.getInt(3, 0);
                        c4620h.f38632d = obtainStyledAttributes.getInt(4, 0);
                        c4620h.f38633e = obtainStyledAttributes.getInt(5, 0);
                        c4620h.f38634f = obtainStyledAttributes.getBoolean(2, r42);
                        c4620h.f38635g = obtainStyledAttributes.getBoolean(0, r42);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Q0 o9 = Q0.o(c4621i.f38658c, attributeSet, AbstractC4518a.f37834r);
                            TypedArray typedArray = (TypedArray) o9.f39326c;
                            c4620h.i = typedArray.getResourceId(2, 0);
                            c4620h.f38637j = (typedArray.getInt(5, c4620h.f38631c) & (-65536)) | (typedArray.getInt(6, c4620h.f38632d) & 65535);
                            c4620h.f38638k = typedArray.getText(7);
                            c4620h.f38639l = typedArray.getText(8);
                            c4620h.f38640m = typedArray.getResourceId(0, 0);
                            String string = typedArray.getString(9);
                            c4620h.f38641n = string == null ? (char) 0 : string.charAt(0);
                            c4620h.f38642o = typedArray.getInt(16, 4096);
                            String string2 = typedArray.getString(10);
                            c4620h.f38643p = string2 == null ? (char) 0 : string2.charAt(0);
                            c4620h.f38644q = typedArray.getInt(20, 4096);
                            if (typedArray.hasValue(11)) {
                                c4620h.f38645r = typedArray.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c4620h.f38645r = c4620h.f38633e;
                            }
                            c4620h.f38646s = typedArray.getBoolean(3, false);
                            c4620h.f38647t = typedArray.getBoolean(4, c4620h.f38634f);
                            c4620h.f38648u = typedArray.getBoolean(1, c4620h.f38635g);
                            c4620h.f38649v = typedArray.getInt(21, -1);
                            c4620h.f38652y = typedArray.getString(12);
                            c4620h.f38650w = typedArray.getResourceId(13, 0);
                            c4620h.f38651x = typedArray.getString(15);
                            String string3 = typedArray.getString(14);
                            boolean z11 = string3 != null;
                            if (z11 && c4620h.f38650w == 0 && c4620h.f38651x == null) {
                                c4620h.f38653z = (o) c4620h.a(string3, f38655f, c4621i.f38657b);
                            } else {
                                if (z11) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                c4620h.f38653z = null;
                            }
                            c4620h.f38624A = typedArray.getText(17);
                            c4620h.f38625B = typedArray.getText(22);
                            if (typedArray.hasValue(19)) {
                                c4620h.f38627D = AbstractC4742j0.b(typedArray.getInt(19, -1), c4620h.f38627D);
                                colorStateList = null;
                            } else {
                                colorStateList = null;
                                c4620h.f38627D = null;
                            }
                            if (typedArray.hasValue(18)) {
                                c4620h.f38626C = o9.f(18);
                            } else {
                                c4620h.f38626C = colorStateList;
                            }
                            o9.q();
                            c4620h.f38636h = false;
                            xmlResourceParser2 = xmlResourceParser;
                            z8 = true;
                        } else if (name3.equals("menu")) {
                            z8 = true;
                            c4620h.f38636h = true;
                            SubMenu addSubMenu = c4620h.f38629a.addSubMenu(c4620h.f38630b, c4620h.i, c4620h.f38637j, c4620h.f38638k);
                            c4620h.b(addSubMenu.getItem());
                            xmlResourceParser2 = xmlResourceParser;
                            b(xmlResourceParser2, attributeSet, addSubMenu);
                        } else {
                            xmlResourceParser2 = xmlResourceParser;
                            z8 = true;
                            str = name3;
                            z10 = true;
                        }
                        eventType = xmlResourceParser2.next();
                        r42 = z8;
                        i = 2;
                        z10 = z10;
                    }
                }
                xmlResourceParser2 = xmlResourceParser;
                z8 = r42;
            }
            eventType = xmlResourceParser2.next();
            r42 = z8;
            i = 2;
            z10 = z10;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof l.l)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z8 = false;
        try {
            try {
                xmlResourceParser = this.f38658c.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof l.l) {
                    l.l lVar = (l.l) menu;
                    if (!lVar.f38954I) {
                        lVar.w();
                        z8 = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z8) {
                    ((l.l) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e6) {
                throw new InflateException("Error inflating menu XML", e6);
            } catch (XmlPullParserException e9) {
                throw new InflateException("Error inflating menu XML", e9);
            }
        } catch (Throwable th) {
            if (z8) {
                ((l.l) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
