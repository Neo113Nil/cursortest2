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
import k.i;
import l.r0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f3517e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f3518f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f3519a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f3520b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f3521c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3522d;

    static {
        Class[] clsArr = {Context.class};
        f3517e = clsArr;
        f3518f = clsArr;
    }

    public d(Context context) {
        super(context);
        this.f3521c = context;
        Object[] objArr = {context};
        this.f3519a = objArr;
        this.f3520b = objArr;
    }

    public static Object a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        int i;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        c cVar = new c(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i = 2;
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
        boolean z3 = false;
        boolean z7 = false;
        String str = null;
        while (!z3) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z7 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z7 = false;
                        str = null;
                        eventType = xmlPullParser2.next();
                        i = 2;
                        z3 = z3;
                        z7 = z7;
                    } else if (name2.equals("group")) {
                        cVar.f3493b = 0;
                        cVar.f3494c = 0;
                        cVar.f3495d = 0;
                        cVar.f3496e = 0;
                        cVar.f3497f = true;
                        cVar.f3498g = true;
                    } else if (name2.equals("item")) {
                        if (!cVar.f3499h) {
                            cVar.f3499h = true;
                            cVar.b(cVar.f3492a.add(cVar.f3493b, cVar.i, cVar.f3500j, cVar.f3501k));
                        }
                    } else if (name2.equals("menu")) {
                        xmlPullParser2 = xmlPullParser;
                        z3 = true;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z3 = z3;
            } else {
                if (!z7) {
                    String name3 = xmlPullParser.getName();
                    boolean equals = name3.equals("group");
                    Context context = this.f3521c;
                    if (equals) {
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f3060m);
                        cVar.f3493b = obtainStyledAttributes.getResourceId(1, 0);
                        cVar.f3494c = obtainStyledAttributes.getInt(3, 0);
                        cVar.f3495d = obtainStyledAttributes.getInt(4, 0);
                        cVar.f3496e = obtainStyledAttributes.getInt(5, 0);
                        cVar.f3497f = obtainStyledAttributes.getBoolean(2, true);
                        cVar.f3498g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, h.a.f3061n);
                            cVar.i = obtainStyledAttributes2.getResourceId(2, 0);
                            cVar.f3500j = (obtainStyledAttributes2.getInt(5, cVar.f3494c) & (-65536)) | (obtainStyledAttributes2.getInt(6, cVar.f3495d) & 65535);
                            cVar.f3501k = obtainStyledAttributes2.getText(7);
                            cVar.f3502l = obtainStyledAttributes2.getText(8);
                            cVar.f3503m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            cVar.f3504n = string == null ? (char) 0 : string.charAt(0);
                            cVar.f3505o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            cVar.f3506p = string2 == null ? (char) 0 : string2.charAt(0);
                            cVar.f3507q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                cVar.f3508r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                cVar.f3508r = cVar.f3496e;
                            }
                            cVar.f3509s = obtainStyledAttributes2.getBoolean(3, false);
                            cVar.f3510t = obtainStyledAttributes2.getBoolean(4, cVar.f3497f);
                            cVar.f3511u = obtainStyledAttributes2.getBoolean(1, cVar.f3498g);
                            cVar.f3512v = obtainStyledAttributes2.getInt(21, -1);
                            cVar.f3515y = obtainStyledAttributes2.getString(12);
                            cVar.f3513w = obtainStyledAttributes2.getResourceId(13, 0);
                            cVar.f3514x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z8 = string3 != null;
                            if (z8 && cVar.f3513w == 0 && cVar.f3514x == null) {
                                if (cVar.a(string3, f3518f, this.f3520b) != null) {
                                    throw new ClassCastException();
                                }
                            } else if (z8) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            cVar.f3516z = obtainStyledAttributes2.getText(17);
                            cVar.A = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                cVar.C = r0.b(obtainStyledAttributes2.getInt(19, -1), cVar.C);
                            } else {
                                cVar.C = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = s6.a.q(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                cVar.B = colorStateList;
                            } else {
                                cVar.B = null;
                            }
                            obtainStyledAttributes2.recycle();
                            cVar.f3499h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            cVar.f3499h = true;
                            SubMenu addSubMenu = cVar.f3492a.addSubMenu(cVar.f3493b, cVar.i, cVar.f3500j, cVar.f3501k);
                            cVar.b(addSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet, addSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z7 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i = 2;
                        z3 = z3;
                        z7 = z7;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z3 = z3;
            }
            eventType = xmlPullParser2.next();
            i = 2;
            z3 = z3;
            z7 = z7;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof i)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z3 = false;
        try {
            try {
                xmlResourceParser = this.f3521c.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof i) {
                    i iVar = (i) menu;
                    if (!iVar.f4081m) {
                        iVar.s();
                        z3 = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z3) {
                    ((i) menu).r();
                }
                xmlResourceParser.close();
            } catch (IOException e8) {
                throw new InflateException("Error inflating menu XML", e8);
            } catch (XmlPullParserException e9) {
                throw new InflateException("Error inflating menu XML", e9);
            }
        } catch (Throwable th) {
            if (z3) {
                ((i) menu).r();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
