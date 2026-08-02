package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fm extends MenuInflater {
    static final Class[] a;
    static final Class[] b;
    final Object[] c;
    final Object[] d;
    final Context e;
    public Object f;

    static {
        Class[] clsArr = {Context.class};
        a = clsArr;
        b = clsArr;
    }

    public fm(Context context) {
        super(context);
        this.e = context;
        Object[] objArr = {context};
        this.c = objArr;
        this.d = objArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        int i;
        XmlPullParser xmlPullParser2;
        fl flVar = new fl(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(String.valueOf(name)));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            boolean z3 = z2;
            if (eventType != i) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (!z2) {
                        z3 = false;
                    } else if (name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        str = null;
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (name2.equals("group")) {
                        flVar.c();
                        z3 = z3;
                    } else if (name2.equals("item")) {
                        z3 = z3;
                        if (!flVar.h) {
                            tw twVar = flVar.F;
                            if (twVar == null || !twVar.c()) {
                                flVar.h = true;
                                flVar.d(flVar.a.add(flVar.b, flVar.i, flVar.j, flVar.k));
                                z3 = z3;
                            } else {
                                flVar.a();
                                z3 = z3;
                            }
                        }
                    } else {
                        z3 = z3;
                        if (name2.equals("menu")) {
                            xmlPullParser2 = xmlPullParser;
                            z = true;
                        }
                    }
                }
                xmlPullParser2 = xmlPullParser;
            } else {
                if (z2) {
                    xmlPullParser2 = xmlPullParser;
                } else {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        TypedArray obtainStyledAttributes = flVar.E.e.obtainStyledAttributes(attributeSet, em.q);
                        flVar.b = obtainStyledAttributes.getResourceId(1, 0);
                        flVar.c = obtainStyledAttributes.getInt(3, 0);
                        flVar.d = obtainStyledAttributes.getInt(4, 0);
                        flVar.e = obtainStyledAttributes.getInt(5, 0);
                        flVar.f = obtainStyledAttributes.getBoolean(i, true);
                        flVar.g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        fm fmVar = flVar.E;
                        byo t = byo.t(fmVar.e, attributeSet, em.r);
                        flVar.i = t.h(i, 0);
                        flVar.j = ((char) t.e(6, flVar.d)) | (t.e(5, flVar.c) & (-65536));
                        flVar.k = t.l(7);
                        flVar.l = t.l(8);
                        flVar.m = t.h(0, 0);
                        flVar.n = fl.e(t.m(9));
                        flVar.o = t.e(16, 4096);
                        flVar.p = fl.e(t.m(10));
                        flVar.q = t.e(20, 4096);
                        if (t.p(11)) {
                            flVar.r = t.o(11, false) ? 1 : 0;
                        } else {
                            flVar.r = flVar.e;
                        }
                        flVar.s = t.o(3, false);
                        flVar.t = t.o(4, flVar.f);
                        flVar.u = t.o(1, flVar.g);
                        flVar.v = t.e(21, -1);
                        flVar.z = t.m(12);
                        flVar.w = t.h(13, 0);
                        flVar.x = t.m(15);
                        flVar.y = t.m(14);
                        String str2 = flVar.y;
                        if (str2 != null) {
                            if (flVar.w == 0 && flVar.x == null) {
                                flVar.F = (tw) flVar.b(str2, b, fmVar.d);
                                flVar.A = t.l(17);
                                flVar.B = t.l(22);
                                if (t.p(19)) {
                                    flVar.D = null;
                                } else {
                                    int e = t.e(19, -1);
                                    PorterDuff.Mode mode = flVar.D;
                                    Rect rect = jl.a;
                                    flVar.D = a.q(e, mode);
                                }
                                if (t.p(18)) {
                                    flVar.C = null;
                                } else {
                                    flVar.C = t.i(18);
                                }
                                t.n();
                                flVar.h = false;
                            } else {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                        }
                        flVar.F = null;
                        flVar.A = t.l(17);
                        flVar.B = t.l(22);
                        if (t.p(19)) {
                        }
                        if (t.p(18)) {
                        }
                        t.n();
                        flVar.h = false;
                    } else if (name3.equals("menu")) {
                        xmlPullParser2 = xmlPullParser;
                        b(xmlPullParser2, attributeSet, flVar.a());
                        z3 = false;
                    } else {
                        xmlPullParser2 = xmlPullParser;
                        str = name3;
                    }
                    xmlPullParser2 = xmlPullParser;
                    z3 = false;
                }
                z3 = true;
            }
            eventType = xmlPullParser2.next();
            i = 2;
            z = z;
            z2 = z3;
        }
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof vn)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z = false;
        try {
            try {
                xmlResourceParser = this.e.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof gd) {
                    gd gdVar = (gd) menu;
                    if (!gdVar.h) {
                        gdVar.s();
                        z = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } finally {
            if (z) {
                ((gd) menu).r();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
