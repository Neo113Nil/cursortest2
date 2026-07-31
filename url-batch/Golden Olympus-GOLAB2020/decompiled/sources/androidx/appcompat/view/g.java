package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.F;
import androidx.appcompat.widget.Z;
import androidx.core.view.AbstractC1282b;
import androidx.core.view.B;
import e.j;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import x.InterfaceMenuC3510a;

/* loaded from: classes.dex */
public class g extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    static final Class[] f10245e;

    /* renamed from: f, reason: collision with root package name */
    static final Class[] f10246f;

    /* renamed from: a, reason: collision with root package name */
    final Object[] f10247a;

    /* renamed from: b, reason: collision with root package name */
    final Object[] f10248b;

    /* renamed from: c, reason: collision with root package name */
    Context f10249c;

    /* renamed from: d, reason: collision with root package name */
    private Object f10250d;

    private static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c, reason: collision with root package name */
        private static final Class[] f10251c = {MenuItem.class};

        /* renamed from: a, reason: collision with root package name */
        private Object f10252a;

        /* renamed from: b, reason: collision with root package name */
        private Method f10253b;

        public a(Object obj, String str) {
            this.f10252a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f10253b = cls.getMethod(str, f10251c);
            } catch (Exception e4) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e4);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f10253b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f10253b.invoke(this.f10252a, menuItem)).booleanValue();
                }
                this.f10253b.invoke(this.f10252a, menuItem);
                return true;
            } catch (Exception e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    private class b {

        /* renamed from: A, reason: collision with root package name */
        AbstractC1282b f10254A;

        /* renamed from: B, reason: collision with root package name */
        private CharSequence f10255B;

        /* renamed from: C, reason: collision with root package name */
        private CharSequence f10256C;

        /* renamed from: D, reason: collision with root package name */
        private ColorStateList f10257D = null;

        /* renamed from: E, reason: collision with root package name */
        private PorterDuff.Mode f10258E = null;

        /* renamed from: a, reason: collision with root package name */
        private Menu f10260a;

        /* renamed from: b, reason: collision with root package name */
        private int f10261b;

        /* renamed from: c, reason: collision with root package name */
        private int f10262c;

        /* renamed from: d, reason: collision with root package name */
        private int f10263d;

        /* renamed from: e, reason: collision with root package name */
        private int f10264e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f10265f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f10266g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f10267h;

        /* renamed from: i, reason: collision with root package name */
        private int f10268i;

        /* renamed from: j, reason: collision with root package name */
        private int f10269j;

        /* renamed from: k, reason: collision with root package name */
        private CharSequence f10270k;

        /* renamed from: l, reason: collision with root package name */
        private CharSequence f10271l;

        /* renamed from: m, reason: collision with root package name */
        private int f10272m;

        /* renamed from: n, reason: collision with root package name */
        private char f10273n;

        /* renamed from: o, reason: collision with root package name */
        private int f10274o;

        /* renamed from: p, reason: collision with root package name */
        private char f10275p;

        /* renamed from: q, reason: collision with root package name */
        private int f10276q;

        /* renamed from: r, reason: collision with root package name */
        private int f10277r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f10278s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f10279t;

        /* renamed from: u, reason: collision with root package name */
        private boolean f10280u;

        /* renamed from: v, reason: collision with root package name */
        private int f10281v;

        /* renamed from: w, reason: collision with root package name */
        private int f10282w;

        /* renamed from: x, reason: collision with root package name */
        private String f10283x;

        /* renamed from: y, reason: collision with root package name */
        private String f10284y;

        /* renamed from: z, reason: collision with root package name */
        private String f10285z;

        public b(Menu menu) {
            this.f10260a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private Object e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f10249c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e4) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e4);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z4 = false;
            menuItem.setChecked(this.f10278s).setVisible(this.f10279t).setEnabled(this.f10280u).setCheckable(this.f10277r >= 1).setTitleCondensed(this.f10271l).setIcon(this.f10272m);
            int i4 = this.f10281v;
            if (i4 >= 0) {
                menuItem.setShowAsAction(i4);
            }
            if (this.f10285z != null) {
                if (g.this.f10249c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f10285z));
            }
            if (this.f10277r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof j.c) {
                    ((j.c) menuItem).h(true);
                }
            }
            String str = this.f10283x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f10245e, g.this.f10247a));
                z4 = true;
            }
            int i5 = this.f10282w;
            if (i5 > 0) {
                if (z4) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i5);
                }
            }
            AbstractC1282b abstractC1282b = this.f10254A;
            if (abstractC1282b != null) {
                B.a(menuItem, abstractC1282b);
            }
            B.c(menuItem, this.f10255B);
            B.g(menuItem, this.f10256C);
            B.b(menuItem, this.f10273n, this.f10274o);
            B.f(menuItem, this.f10275p, this.f10276q);
            PorterDuff.Mode mode = this.f10258E;
            if (mode != null) {
                B.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f10257D;
            if (colorStateList != null) {
                B.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f10267h = true;
            i(this.f10260a.add(this.f10261b, this.f10268i, this.f10269j, this.f10270k));
        }

        public SubMenu b() {
            this.f10267h = true;
            SubMenu addSubMenu = this.f10260a.addSubMenu(this.f10261b, this.f10268i, this.f10269j, this.f10270k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.f10267h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f10249c.obtainStyledAttributes(attributeSet, j.f36542o1);
            this.f10261b = obtainStyledAttributes.getResourceId(j.f36552q1, 0);
            this.f10262c = obtainStyledAttributes.getInt(j.f36562s1, 0);
            this.f10263d = obtainStyledAttributes.getInt(j.f36567t1, 0);
            this.f10264e = obtainStyledAttributes.getInt(j.f36572u1, 0);
            this.f10265f = obtainStyledAttributes.getBoolean(j.f36557r1, true);
            this.f10266g = obtainStyledAttributes.getBoolean(j.f36547p1, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            Z u4 = Z.u(g.this.f10249c, attributeSet, j.f36577v1);
            this.f10268i = u4.n(j.f36592y1, 0);
            this.f10269j = (u4.k(j.f36367B1, this.f10262c) & (-65536)) | (u4.k(j.f36372C1, this.f10263d) & 65535);
            this.f10270k = u4.p(j.f36377D1);
            this.f10271l = u4.p(j.f36382E1);
            this.f10272m = u4.n(j.f36582w1, 0);
            this.f10273n = c(u4.o(j.f36387F1));
            this.f10274o = u4.k(j.f36416M1, Base64Utils.IO_BUFFER_SIZE);
            this.f10275p = c(u4.o(j.f36392G1));
            this.f10276q = u4.k(j.f36432Q1, Base64Utils.IO_BUFFER_SIZE);
            if (u4.s(j.f36396H1)) {
                this.f10277r = u4.a(j.f36396H1, false) ? 1 : 0;
            } else {
                this.f10277r = this.f10264e;
            }
            this.f10278s = u4.a(j.f36597z1, false);
            this.f10279t = u4.a(j.f36362A1, this.f10265f);
            this.f10280u = u4.a(j.f36587x1, this.f10266g);
            this.f10281v = u4.k(j.f36436R1, -1);
            this.f10285z = u4.o(j.f36400I1);
            this.f10282w = u4.n(j.f36404J1, 0);
            this.f10283x = u4.o(j.f36412L1);
            String o4 = u4.o(j.f36408K1);
            this.f10284y = o4;
            boolean z4 = o4 != null;
            if (z4 && this.f10282w == 0 && this.f10283x == null) {
                this.f10254A = (AbstractC1282b) e(o4, g.f10246f, g.this.f10248b);
            } else {
                if (z4) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f10254A = null;
            }
            this.f10255B = u4.p(j.f36420N1);
            this.f10256C = u4.p(j.f36440S1);
            if (u4.s(j.f36428P1)) {
                this.f10258E = F.e(u4.k(j.f36428P1, -1), this.f10258E);
            } else {
                this.f10258E = null;
            }
            if (u4.s(j.f36424O1)) {
                this.f10257D = u4.c(j.f36424O1);
            } else {
                this.f10257D = null;
            }
            u4.x();
            this.f10267h = false;
        }

        public void h() {
            this.f10261b = 0;
            this.f10262c = 0;
            this.f10263d = 0;
            this.f10264e = 0;
            this.f10265f = true;
            this.f10266g = true;
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f10245e = clsArr;
        f10246f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f10249c = context;
        Object[] objArr = {context};
        this.f10247a = objArr;
        this.f10248b = objArr;
    }

    private Object a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r15 == 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r15 == 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r15.equals(r8) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        r7 = false;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b9, code lost:
    
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r15.equals("group") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        r0.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r15.equals("item") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r0.d() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        r15 = r0.f10254A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        if (r15 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r15.a() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        r0.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        if (r15.equals("menu") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
    
        if (r7 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
    
        if (r15.equals("group") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009b, code lost:
    
        r0.f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
    
        if (r15.equals("item") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a5, code lost:
    
        r0.g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:
    
        if (r15.equals("menu") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00af, code lost:
    
        c(r13, r14, r0.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b7, code lost:
    
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c5, code lost:
    
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        r6 = false;
        r7 = false;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r6 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        if (r15 == 1) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
    }

    Object b() {
        if (this.f10250d == null) {
            this.f10250d = a(this.f10249c);
        }
        return this.f10250d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i4, Menu menu) {
        if (!(menu instanceof InterfaceMenuC3510a)) {
            super.inflate(i4, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z4 = false;
        try {
            try {
                xmlResourceParser = this.f10249c.getResources().getLayout(i4);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof androidx.appcompat.view.menu.e) {
                    androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) menu;
                    if (eVar.isDispatchingItemsChanged()) {
                        eVar.stopDispatchingItemsChanged();
                        z4 = true;
                    }
                }
                c(xmlResourceParser, asAttributeSet, menu);
                if (z4) {
                    ((androidx.appcompat.view.menu.e) menu).startDispatchingItemsChanged();
                }
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
            } catch (IOException e4) {
                throw new InflateException("Error inflating menu XML", e4);
            } catch (XmlPullParserException e5) {
                throw new InflateException("Error inflating menu XML", e5);
            }
        } catch (Throwable th) {
            if (z4) {
                ((androidx.appcompat.view.menu.e) menu).startDispatchingItemsChanged();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
