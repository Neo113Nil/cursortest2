package android.support.v7.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.ActionProvider;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.appcompat.R;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.widget.DrawableUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: SupportMenuInflater.java */
/* loaded from: classes.dex */
public class g extends MenuInflater {

    /* renamed from: a, reason: collision with root package name */
    static final Class<?>[] f1709a = {Context.class};

    /* renamed from: b, reason: collision with root package name */
    static final Class<?>[] f1710b = f1709a;

    /* renamed from: c, reason: collision with root package name */
    final Object[] f1711c;

    /* renamed from: d, reason: collision with root package name */
    final Object[] f1712d;
    Context e;
    private Object f;

    public g(Context context) {
        super(context);
        this.e = context;
        this.f1711c = new Object[]{context};
        this.f1712d = this.f1711c;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        XmlResourceParser layout;
        if (!(menu instanceof SupportMenu)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                layout = this.e.getResources().getLayout(i);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        } catch (XmlPullParserException e2) {
            e = e2;
        }
        try {
            a(layout, Xml.asAttributeSet(layout), menu);
            if (layout != null) {
                layout.close();
            }
        } catch (IOException e3) {
            e = e3;
            throw new InflateException("Error inflating menu XML", e);
        } catch (XmlPullParserException e4) {
            e = e4;
            throw new InflateException("Error inflating menu XML", e);
        } catch (Throwable th2) {
            th = th2;
            xmlResourceParser = layout;
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        r4 = r9.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        if (r5 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        if (r4.equals(r6) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        r6 = null;
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00cb, code lost:
    
        r4 = r9.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (r4.equals("group") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if (r4.equals("item") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (r0.d() != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        if (r0.f1716a == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        if (r0.f1716a.hasSubMenu() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        r0.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
    
        r0.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
    
        if (r4.equals("menu") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
    
        if (r5 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0094, code lost:
    
        r4 = r9.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009e, code lost:
    
        if (r4.equals("group") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
    
        r0.a(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00aa, code lost:
    
        if (r4.equals("item") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        r0.b(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b6, code lost:
    
        if (r4.equals("menu") == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b8, code lost:
    
        a(r9, r10, r0.c());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c0, code lost:
    
        r6 = r4;
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ca, code lost:
    
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        r4 = r11;
        r6 = null;
        r11 = false;
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0041, code lost:
    
        if (r11 != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
    
        switch(r4) {
            case 1: goto L57;
            case 2: goto L37;
            case 3: goto L16;
            default: goto L69;
        };
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
    }

    Object a() {
        if (this.f == null) {
            this.f = a(this.e);
        }
        return this.f;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* compiled from: SupportMenuInflater.java */
    private static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        private static final Class<?>[] f1713a = {MenuItem.class};

        /* renamed from: b, reason: collision with root package name */
        private Object f1714b;

        /* renamed from: c, reason: collision with root package name */
        private Method f1715c;

        public a(Object obj, String str) {
            this.f1714b = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f1715c = cls.getMethod(str, f1713a);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f1715c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f1715c.invoke(this.f1714b, menuItem)).booleanValue();
                }
                this.f1715c.invoke(this.f1714b, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* compiled from: SupportMenuInflater.java */
    private class b {
        private String A;
        private String B;
        private CharSequence C;
        private CharSequence D;
        private ColorStateList E = null;
        private PorterDuff.Mode F = null;

        /* renamed from: a, reason: collision with root package name */
        ActionProvider f1716a;

        /* renamed from: c, reason: collision with root package name */
        private Menu f1718c;

        /* renamed from: d, reason: collision with root package name */
        private int f1719d;
        private int e;
        private int f;
        private int g;
        private boolean h;
        private boolean i;
        private boolean j;
        private int k;
        private int l;
        private CharSequence m;
        private CharSequence n;
        private int o;
        private char p;
        private int q;
        private char r;
        private int s;
        private int t;
        private boolean u;
        private boolean v;
        private boolean w;
        private int x;
        private int y;
        private String z;

        public b(Menu menu) {
            this.f1718c = menu;
            a();
        }

        public void a() {
            this.f1719d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = true;
            this.i = true;
        }

        public void a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.e.obtainStyledAttributes(attributeSet, R.styleable.MenuGroup);
            this.f1719d = obtainStyledAttributes.getResourceId(R.styleable.MenuGroup_android_id, 0);
            this.e = obtainStyledAttributes.getInt(R.styleable.MenuGroup_android_menuCategory, 0);
            this.f = obtainStyledAttributes.getInt(R.styleable.MenuGroup_android_orderInCategory, 0);
            this.g = obtainStyledAttributes.getInt(R.styleable.MenuGroup_android_checkableBehavior, 0);
            this.h = obtainStyledAttributes.getBoolean(R.styleable.MenuGroup_android_visible, true);
            this.i = obtainStyledAttributes.getBoolean(R.styleable.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        public void b(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.e.obtainStyledAttributes(attributeSet, R.styleable.MenuItem);
            this.k = obtainStyledAttributes.getResourceId(R.styleable.MenuItem_android_id, 0);
            this.l = (obtainStyledAttributes.getInt(R.styleable.MenuItem_android_menuCategory, this.e) & SupportMenu.CATEGORY_MASK) | (obtainStyledAttributes.getInt(R.styleable.MenuItem_android_orderInCategory, this.f) & 65535);
            this.m = obtainStyledAttributes.getText(R.styleable.MenuItem_android_title);
            this.n = obtainStyledAttributes.getText(R.styleable.MenuItem_android_titleCondensed);
            this.o = obtainStyledAttributes.getResourceId(R.styleable.MenuItem_android_icon, 0);
            this.p = a(obtainStyledAttributes.getString(R.styleable.MenuItem_android_alphabeticShortcut));
            this.q = obtainStyledAttributes.getInt(R.styleable.MenuItem_alphabeticModifiers, 4096);
            this.r = a(obtainStyledAttributes.getString(R.styleable.MenuItem_android_numericShortcut));
            this.s = obtainStyledAttributes.getInt(R.styleable.MenuItem_numericModifiers, 4096);
            if (obtainStyledAttributes.hasValue(R.styleable.MenuItem_android_checkable)) {
                this.t = obtainStyledAttributes.getBoolean(R.styleable.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.t = this.g;
            }
            this.u = obtainStyledAttributes.getBoolean(R.styleable.MenuItem_android_checked, false);
            this.v = obtainStyledAttributes.getBoolean(R.styleable.MenuItem_android_visible, this.h);
            this.w = obtainStyledAttributes.getBoolean(R.styleable.MenuItem_android_enabled, this.i);
            this.x = obtainStyledAttributes.getInt(R.styleable.MenuItem_showAsAction, -1);
            this.B = obtainStyledAttributes.getString(R.styleable.MenuItem_android_onClick);
            this.y = obtainStyledAttributes.getResourceId(R.styleable.MenuItem_actionLayout, 0);
            this.z = obtainStyledAttributes.getString(R.styleable.MenuItem_actionViewClass);
            this.A = obtainStyledAttributes.getString(R.styleable.MenuItem_actionProviderClass);
            boolean z = this.A != null;
            if (z && this.y == 0 && this.z == null) {
                this.f1716a = (ActionProvider) a(this.A, g.f1710b, g.this.f1712d);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f1716a = null;
            }
            this.C = obtainStyledAttributes.getText(R.styleable.MenuItem_contentDescription);
            this.D = obtainStyledAttributes.getText(R.styleable.MenuItem_tooltipText);
            if (obtainStyledAttributes.hasValue(R.styleable.MenuItem_iconTintMode)) {
                this.F = DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(R.styleable.MenuItem_iconTintMode, -1), this.F);
            } else {
                this.F = null;
            }
            if (obtainStyledAttributes.hasValue(R.styleable.MenuItem_iconTint)) {
                this.E = obtainStyledAttributes.getColorStateList(R.styleable.MenuItem_iconTint);
            } else {
                this.E = null;
            }
            obtainStyledAttributes.recycle();
            this.j = false;
        }

        private char a(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private void a(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.u).setVisible(this.v).setEnabled(this.w).setCheckable(this.t >= 1).setTitleCondensed(this.n).setIcon(this.o);
            if (this.x >= 0) {
                menuItem.setShowAsAction(this.x);
            }
            if (this.B != null) {
                if (g.this.e.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.a(), this.B));
            }
            boolean z2 = menuItem instanceof MenuItemImpl;
            if (z2) {
            }
            if (this.t >= 2) {
                if (z2) {
                    ((MenuItemImpl) menuItem).a(true);
                } else if (menuItem instanceof android.support.v7.view.menu.h) {
                    ((android.support.v7.view.menu.h) menuItem).a(true);
                }
            }
            if (this.z != null) {
                menuItem.setActionView((View) a(this.z, g.f1709a, g.this.f1711c));
                z = true;
            }
            if (this.y > 0) {
                if (!z) {
                    menuItem.setActionView(this.y);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            if (this.f1716a != null) {
                MenuItemCompat.setActionProvider(menuItem, this.f1716a);
            }
            MenuItemCompat.setContentDescription(menuItem, this.C);
            MenuItemCompat.setTooltipText(menuItem, this.D);
            MenuItemCompat.setAlphabeticShortcut(menuItem, this.p, this.q);
            MenuItemCompat.setNumericShortcut(menuItem, this.r, this.s);
            if (this.F != null) {
                MenuItemCompat.setIconTintMode(menuItem, this.F);
            }
            if (this.E != null) {
                MenuItemCompat.setIconTintList(menuItem, this.E);
            }
        }

        public void b() {
            this.j = true;
            a(this.f1718c.add(this.f1719d, this.k, this.l, this.m));
        }

        public SubMenu c() {
            this.j = true;
            SubMenu addSubMenu = this.f1718c.addSubMenu(this.f1719d, this.k, this.l, this.m);
            a(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.j;
        }

        private <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = g.this.e.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }
    }
}
