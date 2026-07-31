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
import g.AbstractC0389a;
import h.AbstractC0401a;
import j.j;
import java.io.IOException;
import k.AbstractC0441C;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: i.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0417d extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f4389e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f4390f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f4391a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f4392b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f4393c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4394d;

    static {
        Class[] clsArr = {Context.class};
        f4389e = clsArr;
        f4390f = clsArr;
    }

    public C0417d(Context context) {
        super(context);
        this.f4393c = context;
        Object[] objArr = {context};
        this.f4391a = objArr;
        this.f4392b = objArr;
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
        int i7;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        C0416c c0416c = new C0416c(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i7 = 2;
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
        boolean z5 = false;
        boolean z6 = false;
        String str = null;
        while (!z5) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            Menu menu2 = c0416c.f4364a;
            if (eventType != i7) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z6 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z6 = false;
                        str = null;
                        eventType = xmlPullParser2.next();
                        i7 = 2;
                        z5 = z5;
                        z6 = z6;
                    } else if (name2.equals("group")) {
                        c0416c.f4365b = 0;
                        c0416c.f4366c = 0;
                        c0416c.f4367d = 0;
                        c0416c.f4368e = 0;
                        c0416c.f4369f = true;
                        c0416c.f4370g = true;
                    } else if (name2.equals("item")) {
                        if (!c0416c.f4371h) {
                            c0416c.f4371h = true;
                            c0416c.b(menu2.add(c0416c.f4365b, c0416c.f4372i, c0416c.f4373j, c0416c.f4374k));
                        }
                    } else if (name2.equals("menu")) {
                        xmlPullParser2 = xmlPullParser;
                        z5 = true;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z5 = z5;
            } else {
                if (!z6) {
                    String name3 = xmlPullParser.getName();
                    boolean equals = name3.equals("group");
                    Context context = this.f4393c;
                    if (equals) {
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0389a.f4265l);
                        c0416c.f4365b = obtainStyledAttributes.getResourceId(1, 0);
                        c0416c.f4366c = obtainStyledAttributes.getInt(3, 0);
                        c0416c.f4367d = obtainStyledAttributes.getInt(4, 0);
                        c0416c.f4368e = obtainStyledAttributes.getInt(5, 0);
                        c0416c.f4369f = obtainStyledAttributes.getBoolean(2, true);
                        c0416c.f4370g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0389a.f4266m);
                            c0416c.f4372i = obtainStyledAttributes2.getResourceId(2, 0);
                            c0416c.f4373j = (obtainStyledAttributes2.getInt(5, c0416c.f4366c) & (-65536)) | (obtainStyledAttributes2.getInt(6, c0416c.f4367d) & 65535);
                            c0416c.f4374k = obtainStyledAttributes2.getText(7);
                            c0416c.f4375l = obtainStyledAttributes2.getText(8);
                            c0416c.f4376m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            c0416c.f4377n = string == null ? (char) 0 : string.charAt(0);
                            c0416c.f4378o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            c0416c.f4379p = string2 == null ? (char) 0 : string2.charAt(0);
                            c0416c.f4380q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                c0416c.f4381r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c0416c.f4381r = c0416c.f4368e;
                            }
                            c0416c.f4382s = obtainStyledAttributes2.getBoolean(3, false);
                            c0416c.f4383t = obtainStyledAttributes2.getBoolean(4, c0416c.f4369f);
                            c0416c.f4384u = obtainStyledAttributes2.getBoolean(1, c0416c.f4370g);
                            c0416c.f4385v = obtainStyledAttributes2.getInt(21, -1);
                            c0416c.y = obtainStyledAttributes2.getString(12);
                            c0416c.f4386w = obtainStyledAttributes2.getResourceId(13, 0);
                            c0416c.f4387x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z7 = string3 != null;
                            if (z7 && c0416c.f4386w == 0 && c0416c.f4387x == null) {
                                if (c0416c.a(string3, f4390f, this.f4392b) != null) {
                                    throw new ClassCastException();
                                }
                            } else if (z7) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            c0416c.f4388z = obtainStyledAttributes2.getText(17);
                            c0416c.f4360A = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                c0416c.f4362C = AbstractC0441C.b(obtainStyledAttributes2.getInt(19, -1), c0416c.f4362C);
                            } else {
                                c0416c.f4362C = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (obtainStyledAttributes2.hasValue(18) && (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) != 0) {
                                    Object obj = AbstractC0401a.f4318a;
                                    colorStateList = context.getColorStateList(resourceId);
                                }
                                colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                c0416c.f4361B = colorStateList;
                            } else {
                                c0416c.f4361B = null;
                            }
                            obtainStyledAttributes2.recycle();
                            c0416c.f4371h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            c0416c.f4371h = true;
                            SubMenu addSubMenu = menu2.addSubMenu(c0416c.f4365b, c0416c.f4372i, c0416c.f4373j, c0416c.f4374k);
                            c0416c.b(addSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet, addSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z6 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i7 = 2;
                        z5 = z5;
                        z6 = z6;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z5 = z5;
            }
            eventType = xmlPullParser2.next();
            i7 = 2;
            z5 = z5;
            z6 = z6;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i7, Menu menu) {
        if (!(menu instanceof j)) {
            super.inflate(i7, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f4393c.getResources().getLayout(i7);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e4) {
                    throw new InflateException("Error inflating menu XML", e4);
                }
            } catch (XmlPullParserException e7) {
                throw new InflateException("Error inflating menu XML", e7);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
