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
import g.AbstractC0328a;
import h.AbstractC0337a;
import java.io.IOException;
import k.MenuC1065j;
import l.AbstractC1103z;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class d extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f9490e;
    public static final Class[] f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f9491a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f9492b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f9493c;

    /* renamed from: d, reason: collision with root package name */
    public Object f9494d;

    static {
        Class[] clsArr = {Context.class};
        f9490e = clsArr;
        f = clsArr;
    }

    public d(Context context) {
        super(context);
        this.f9493c = context;
        Object[] objArr = {context};
        this.f9491a = objArr;
        this.f9492b = objArr;
    }

    public static Object a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0211, code lost:
    
        if (r4 != null) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v58 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        ?? r5;
        int i3;
        XmlResourceParser xmlResourceParser2;
        boolean z;
        ColorStateList colorStateList;
        int resourceId;
        C1050c c1050c = new C1050c(this, menu);
        Menu menu2 = c1050c.f9468a;
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r5 = 1;
            i3 = 2;
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
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        while (!z2) {
            if (eventType == r5) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i3) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z3 && name2.equals(str)) {
                        xmlResourceParser2 = xmlResourceParser;
                        z = r5;
                        z3 = false;
                        str = null;
                        eventType = xmlResourceParser2.next();
                        r5 = z;
                        i3 = 2;
                        z3 = z3;
                    } else if (name2.equals("group")) {
                        c1050c.f9469b = 0;
                        c1050c.f9470c = 0;
                        c1050c.f9471d = 0;
                        c1050c.f9472e = 0;
                        c1050c.f = r5;
                        c1050c.f9473g = r5;
                    } else if (name2.equals("item")) {
                        if (!c1050c.f9474h) {
                            c1050c.f9474h = r5;
                            c1050c.b(menu2.add(c1050c.f9469b, c1050c.f9475i, c1050c.f9476j, c1050c.f9477k));
                        }
                    } else if (name2.equals("menu")) {
                        xmlResourceParser2 = xmlResourceParser;
                        z = r5;
                        z2 = z;
                    }
                }
                xmlResourceParser2 = xmlResourceParser;
                z = r5;
            } else {
                if (!z3) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    d dVar = c1050c.f9467D;
                    if (equals) {
                        TypedArray obtainStyledAttributes = dVar.f9493c.obtainStyledAttributes(attributeSet, AbstractC0328a.f4999l);
                        c1050c.f9469b = obtainStyledAttributes.getResourceId(r5, 0);
                        c1050c.f9470c = obtainStyledAttributes.getInt(3, 0);
                        c1050c.f9471d = obtainStyledAttributes.getInt(4, 0);
                        c1050c.f9472e = obtainStyledAttributes.getInt(5, 0);
                        c1050c.f = obtainStyledAttributes.getBoolean(2, r5);
                        c1050c.f9473g = obtainStyledAttributes.getBoolean(0, r5);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = dVar.f9493c;
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0328a.f5000m);
                            c1050c.f9475i = obtainStyledAttributes2.getResourceId(2, 0);
                            c1050c.f9476j = (obtainStyledAttributes2.getInt(5, c1050c.f9470c) & (-65536)) | (obtainStyledAttributes2.getInt(6, c1050c.f9471d) & 65535);
                            c1050c.f9477k = obtainStyledAttributes2.getText(7);
                            c1050c.f9478l = obtainStyledAttributes2.getText(8);
                            c1050c.f9479m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            c1050c.f9480n = string == null ? (char) 0 : string.charAt(0);
                            c1050c.o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            c1050c.f9481p = string2 == null ? (char) 0 : string2.charAt(0);
                            c1050c.f9482q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                c1050c.f9483r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c1050c.f9483r = c1050c.f9472e;
                            }
                            c1050c.f9484s = obtainStyledAttributes2.getBoolean(3, false);
                            c1050c.f9485t = obtainStyledAttributes2.getBoolean(4, c1050c.f);
                            c1050c.f9486u = obtainStyledAttributes2.getBoolean(1, c1050c.f9473g);
                            c1050c.v = obtainStyledAttributes2.getInt(21, -1);
                            c1050c.f9489y = obtainStyledAttributes2.getString(12);
                            c1050c.f9487w = obtainStyledAttributes2.getResourceId(13, 0);
                            c1050c.f9488x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z4 = string3 != null;
                            if (z4 && c1050c.f9487w == 0 && c1050c.f9488x == null) {
                                if (c1050c.a(string3, f, dVar.f9492b) != null) {
                                    throw new ClassCastException();
                                }
                            } else if (z4) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            c1050c.z = obtainStyledAttributes2.getText(17);
                            c1050c.f9464A = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                c1050c.f9466C = AbstractC1103z.c(obtainStyledAttributes2.getInt(19, -1), c1050c.f9466C);
                            } else {
                                c1050c.f9466C = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (obtainStyledAttributes2.hasValue(18) && (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) != 0) {
                                    Object obj = AbstractC0337a.f5053a;
                                    colorStateList = context.getColorStateList(resourceId);
                                }
                                colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                c1050c.f9465B = colorStateList;
                            } else {
                                c1050c.f9465B = null;
                            }
                            obtainStyledAttributes2.recycle();
                            c1050c.f9474h = false;
                            xmlResourceParser2 = xmlResourceParser;
                            z = true;
                        } else if (name3.equals("menu")) {
                            z = true;
                            c1050c.f9474h = true;
                            SubMenu addSubMenu = menu2.addSubMenu(c1050c.f9469b, c1050c.f9475i, c1050c.f9476j, c1050c.f9477k);
                            c1050c.b(addSubMenu.getItem());
                            xmlResourceParser2 = xmlResourceParser;
                            b(xmlResourceParser2, attributeSet, addSubMenu);
                        } else {
                            xmlResourceParser2 = xmlResourceParser;
                            z = true;
                            str = name3;
                            z3 = true;
                        }
                        eventType = xmlResourceParser2.next();
                        r5 = z;
                        i3 = 2;
                        z3 = z3;
                    }
                }
                xmlResourceParser2 = xmlResourceParser;
                z = r5;
            }
            eventType = xmlResourceParser2.next();
            r5 = z;
            i3 = 2;
            z3 = z3;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i3, Menu menu) {
        if (!(menu instanceof MenuC1065j)) {
            super.inflate(i3, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f9493c.getResources().getLayout(i3);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e3) {
                    throw new InflateException("Error inflating menu XML", e3);
                }
            } catch (XmlPullParserException e4) {
                throw new InflateException("Error inflating menu XML", e4);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
