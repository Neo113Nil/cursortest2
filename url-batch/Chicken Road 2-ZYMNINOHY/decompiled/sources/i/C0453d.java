package i;

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
import f.AbstractC0410a;
import g.AbstractC0432a;
import j.j;
import java.io.IOException;
import k.AbstractC1237x;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: i.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0453d extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f9272e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f9273f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f9274a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f9275b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f9276c;

    /* renamed from: d, reason: collision with root package name */
    public Object f9277d;

    static {
        Class[] clsArr = {Context.class};
        f9272e = clsArr;
        f9273f = clsArr;
    }

    public C0453d(Context context) {
        super(context);
        this.f9276c = context;
        Object[] objArr = {context};
        this.f9274a = objArr;
        this.f9275b = objArr;
    }

    public static Object a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0208, code lost:
    
        if (r8 != null) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        int i4;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        C0452c c0452c = new C0452c(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i4 = 2;
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
        boolean z4 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            Menu menu2 = c0452c.f9250a;
            if (eventType != i4) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z4 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z4 = false;
                        str = null;
                        eventType = xmlPullParser2.next();
                        i4 = 2;
                        z = z;
                        z4 = z4;
                    } else if (name2.equals("group")) {
                        c0452c.f9251b = 0;
                        c0452c.f9252c = 0;
                        c0452c.f9253d = 0;
                        c0452c.f9254e = 0;
                        c0452c.f9255f = true;
                        c0452c.f9256g = true;
                    } else if (name2.equals("item")) {
                        if (!c0452c.f9257h) {
                            c0452c.f9257h = true;
                            c0452c.b(menu2.add(c0452c.f9251b, c0452c.f9258i, c0452c.f9259j, c0452c.f9260k));
                        }
                    } else if (name2.equals("menu")) {
                        xmlPullParser2 = xmlPullParser;
                        z = true;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z = z;
            } else {
                if (!z4) {
                    String name3 = xmlPullParser.getName();
                    boolean equals = name3.equals("group");
                    Context context = this.f9276c;
                    if (equals) {
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0410a.f8481l);
                        c0452c.f9251b = obtainStyledAttributes.getResourceId(1, 0);
                        c0452c.f9252c = obtainStyledAttributes.getInt(3, 0);
                        c0452c.f9253d = obtainStyledAttributes.getInt(4, 0);
                        c0452c.f9254e = obtainStyledAttributes.getInt(5, 0);
                        c0452c.f9255f = obtainStyledAttributes.getBoolean(2, true);
                        c0452c.f9256g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0410a.f8482m);
                            c0452c.f9258i = obtainStyledAttributes2.getResourceId(2, 0);
                            c0452c.f9259j = (obtainStyledAttributes2.getInt(5, c0452c.f9252c) & (-65536)) | (obtainStyledAttributes2.getInt(6, c0452c.f9253d) & 65535);
                            c0452c.f9260k = obtainStyledAttributes2.getText(7);
                            c0452c.f9261l = obtainStyledAttributes2.getText(8);
                            c0452c.f9262m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            c0452c.n = string == null ? (char) 0 : string.charAt(0);
                            c0452c.o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            c0452c.f9263p = string2 == null ? (char) 0 : string2.charAt(0);
                            c0452c.f9264q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                c0452c.f9265r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c0452c.f9265r = c0452c.f9254e;
                            }
                            c0452c.f9266s = obtainStyledAttributes2.getBoolean(3, false);
                            c0452c.f9267t = obtainStyledAttributes2.getBoolean(4, c0452c.f9255f);
                            c0452c.f9268u = obtainStyledAttributes2.getBoolean(1, c0452c.f9256g);
                            c0452c.v = obtainStyledAttributes2.getInt(21, -1);
                            c0452c.f9271y = obtainStyledAttributes2.getString(12);
                            c0452c.f9269w = obtainStyledAttributes2.getResourceId(13, 0);
                            c0452c.f9270x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z5 = string3 != null;
                            if (z5 && c0452c.f9269w == 0 && c0452c.f9270x == null) {
                                if (c0452c.a(string3, f9273f, this.f9275b) != null) {
                                    throw new ClassCastException();
                                }
                            } else if (z5) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            c0452c.z = obtainStyledAttributes2.getText(17);
                            c0452c.f9246A = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                c0452c.f9248C = AbstractC1237x.c(obtainStyledAttributes2.getInt(19, -1), c0452c.f9248C);
                            } else {
                                c0452c.f9248C = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (obtainStyledAttributes2.hasValue(18) && (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) != 0) {
                                    Object obj = AbstractC0432a.f8818a;
                                    colorStateList = context.getColorStateList(resourceId);
                                }
                                colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                c0452c.f9247B = colorStateList;
                            } else {
                                c0452c.f9247B = null;
                            }
                            obtainStyledAttributes2.recycle();
                            c0452c.f9257h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            c0452c.f9257h = true;
                            SubMenu addSubMenu = menu2.addSubMenu(c0452c.f9251b, c0452c.f9258i, c0452c.f9259j, c0452c.f9260k);
                            c0452c.b(addSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet, addSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z4 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i4 = 2;
                        z = z;
                        z4 = z4;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z = z;
            }
            eventType = xmlPullParser2.next();
            i4 = 2;
            z = z;
            z4 = z4;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i4, Menu menu) {
        if (!(menu instanceof j)) {
            super.inflate(i4, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f9276c.getResources().getLayout(i4);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e4) {
                    throw new InflateException("Error inflating menu XML", e4);
                }
            } catch (XmlPullParserException e5) {
                throw new InflateException("Error inflating menu XML", e5);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
