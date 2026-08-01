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
import java.io.IOException;
import kotlin.collections.i0;
import l.i;
import m.k0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import z4.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f5286e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f5287f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f5288a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f5289b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f5290c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5291d;

    static {
        Class[] clsArr = {Context.class};
        f5286e = clsArr;
        f5287f = clsArr;
    }

    public c(Context context) {
        super(context);
        this.f5290c = context;
        Object[] objArr = {context};
        this.f5288a = objArr;
        this.f5289b = objArr;
    }

    public static Object a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        int i3;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        b bVar = new b(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i3 = 2;
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
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            Menu menu2 = bVar.f5262a;
            if (eventType != i3) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z11 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z11 = false;
                        str = null;
                        eventType = xmlPullParser2.next();
                        i3 = 2;
                        z10 = z10;
                        z11 = z11;
                    } else if (name2.equals("group")) {
                        bVar.f5263b = 0;
                        bVar.f5264c = 0;
                        bVar.f5265d = 0;
                        bVar.f5266e = 0;
                        bVar.f5267f = true;
                        bVar.g = true;
                    } else if (name2.equals("item")) {
                        if (!bVar.f5268h) {
                            bVar.f5268h = true;
                            bVar.b(menu2.add(bVar.f5263b, bVar.f5269i, bVar.j, bVar.f5270k));
                        }
                    } else if (name2.equals("menu")) {
                        xmlPullParser2 = xmlPullParser;
                        z10 = true;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z10 = z10;
            } else {
                if (!z11) {
                    String name3 = xmlPullParser.getName();
                    boolean equals = name3.equals("group");
                    Context context = this.f5290c;
                    if (equals) {
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a.f4549l);
                        bVar.f5263b = obtainStyledAttributes.getResourceId(1, 0);
                        bVar.f5264c = obtainStyledAttributes.getInt(3, 0);
                        bVar.f5265d = obtainStyledAttributes.getInt(4, 0);
                        bVar.f5266e = obtainStyledAttributes.getInt(5, 0);
                        bVar.f5267f = obtainStyledAttributes.getBoolean(2, true);
                        bVar.g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, i.a.f4550m);
                            bVar.f5269i = obtainStyledAttributes2.getResourceId(2, 0);
                            bVar.j = (obtainStyledAttributes2.getInt(5, bVar.f5264c) & (-65536)) | (obtainStyledAttributes2.getInt(6, bVar.f5265d) & 65535);
                            bVar.f5270k = obtainStyledAttributes2.getText(7);
                            bVar.f5271l = obtainStyledAttributes2.getText(8);
                            bVar.f5272m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            bVar.f5273n = string == null ? (char) 0 : string.charAt(0);
                            bVar.f5274o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            bVar.f5275p = string2 == null ? (char) 0 : string2.charAt(0);
                            bVar.f5276q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                bVar.f5277r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                bVar.f5277r = bVar.f5266e;
                            }
                            bVar.f5278s = obtainStyledAttributes2.getBoolean(3, false);
                            bVar.f5279t = obtainStyledAttributes2.getBoolean(4, bVar.f5267f);
                            bVar.f5280u = obtainStyledAttributes2.getBoolean(1, bVar.g);
                            bVar.f5281v = obtainStyledAttributes2.getInt(21, -1);
                            bVar.f5284y = obtainStyledAttributes2.getString(12);
                            bVar.f5282w = obtainStyledAttributes2.getResourceId(13, 0);
                            bVar.f5283x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z12 = string3 != null;
                            if (z12 && bVar.f5282w == 0 && bVar.f5283x == null) {
                                if (bVar.a(string3, f5287f, this.f5289b) != null) {
                                    i0.j();
                                    return;
                                }
                            } else if (z12) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            bVar.f5285z = obtainStyledAttributes2.getText(17);
                            bVar.A = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                bVar.C = k0.b(obtainStyledAttributes2.getInt(19, -1), bVar.C);
                            } else {
                                bVar.C = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = w.t(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                bVar.B = colorStateList;
                            } else {
                                bVar.B = null;
                            }
                            obtainStyledAttributes2.recycle();
                            bVar.f5268h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            bVar.f5268h = true;
                            SubMenu addSubMenu = menu2.addSubMenu(bVar.f5263b, bVar.f5269i, bVar.j, bVar.f5270k);
                            bVar.b(addSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet, addSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z11 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i3 = 2;
                        z10 = z10;
                        z11 = z11;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z10 = z10;
            }
            eventType = xmlPullParser2.next();
            i3 = 2;
            z10 = z10;
            z11 = z11;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i3, Menu menu) {
        if (!(menu instanceof i)) {
            super.inflate(i3, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z10 = false;
        try {
            try {
                xmlResourceParser = this.f5290c.getResources().getLayout(i3);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                i iVar = (i) menu;
                if (!iVar.f5675m) {
                    iVar.s();
                    z10 = true;
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z10) {
                    ((i) menu).r();
                }
                xmlResourceParser.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e9) {
                throw new InflateException("Error inflating menu XML", e9);
            }
        } catch (Throwable th) {
            if (z10) {
                ((i) menu).r();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
