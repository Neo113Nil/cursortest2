package h;

import B0.E;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import i.InterfaceC0165l;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p.AbstractC0215a;
import y.AbstractC0252B;
import y.z;

/* renamed from: h.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC0143j implements Menu {

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f2008u = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f2009a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f2010b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2011c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2012d;

    /* renamed from: e, reason: collision with root package name */
    public E f2013e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2014f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2015g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2016h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f2017i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f2018j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2019k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f2020l;

    /* renamed from: s, reason: collision with root package name */
    public MenuItemC0144k f2027s;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2021m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2022n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2023o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2024p = false;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f2025q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f2026r = new CopyOnWriteArrayList();
    public boolean t = false;

    public MenuC0143j(Context context) {
        boolean z2;
        boolean z3 = false;
        this.f2009a = context;
        Resources resources = context.getResources();
        this.f2010b = resources;
        this.f2014f = new ArrayList();
        this.f2015g = new ArrayList();
        this.f2016h = true;
        this.f2017i = new ArrayList();
        this.f2018j = new ArrayList();
        this.f2019k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = AbstractC0252B.f3101a;
            if (Build.VERSION.SDK_INT >= 28) {
                z2 = z.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z2 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z2) {
                z3 = true;
            }
        }
        this.f2012d = z3;
    }

    public final MenuItemC0144k a(int i2, int i3, int i4, CharSequence charSequence) {
        int i5;
        int i6 = ((-65536) & i4) >> 16;
        if (i6 < 0 || i6 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i7 = (f2008u[i6] << 16) | (65535 & i4);
        MenuItemC0144k menuItemC0144k = new MenuItemC0144k(this, i2, i3, i4, i7, charSequence);
        ArrayList arrayList = this.f2014f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i5 = 0;
                break;
            }
            if (((MenuItemC0144k) arrayList.get(size)).f2033d <= i7) {
                i5 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i5, menuItemC0144k);
        o(true);
        return menuItemC0144k;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.f2009a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItemC0144k a2 = a(i2, i3, i4, resolveInfo.loadLabel(packageManager));
            a2.setIcon(resolveInfo.loadIcon(packageManager));
            a2.f2036g = intent2;
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = a2;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(p pVar, Context context) {
        this.f2026r.add(new WeakReference(pVar));
        pVar.f(context, this);
        this.f2019k = true;
    }

    public final void c(boolean z2) {
        if (this.f2024p) {
            return;
        }
        this.f2024p = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2026r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            p pVar = (p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                pVar.a(this, z2);
            }
        }
        this.f2024p = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        MenuItemC0144k menuItemC0144k = this.f2027s;
        if (menuItemC0144k != null) {
            d(menuItemC0144k);
        }
        this.f2014f.clear();
        o(true);
    }

    public final void clearHeader() {
        this.f2020l = null;
        o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(MenuItemC0144k menuItemC0144k) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2026r;
        boolean z2 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f2027s == menuItemC0144k) {
            s();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                p pVar = (p) weakReference.get();
                if (pVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 = pVar.i(menuItemC0144k);
                    if (z2) {
                        break;
                    }
                }
            }
            r();
            if (z2) {
                this.f2027s = null;
            }
        }
        return z2;
    }

    public boolean e(MenuC0143j menuC0143j, MenuItem menuItem) {
        InterfaceC0165l interfaceC0165l;
        E e2 = this.f2013e;
        if (e2 == null || (interfaceC0165l = ((ActionMenuView) e2.f20f).f1251B) == null) {
            return false;
        }
        ((Toolbar) ((E) interfaceC0165l).f20f).getClass();
        return false;
    }

    public boolean f(MenuItemC0144k menuItemC0144k) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2026r;
        boolean z2 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            p pVar = (p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z2 = pVar.h(menuItemC0144k);
                if (z2) {
                    break;
                }
            }
        }
        r();
        if (z2) {
            this.f2027s = menuItemC0144k;
        }
        return z2;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i2) {
        MenuItem findItem;
        ArrayList arrayList = this.f2014f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemC0144k menuItemC0144k = (MenuItemC0144k) arrayList.get(i3);
            if (menuItemC0144k.f2030a == i2) {
                return menuItemC0144k;
            }
            if (menuItemC0144k.hasSubMenu() && (findItem = menuItemC0144k.f2044o.findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final MenuItemC0144k g(int i2, KeyEvent keyEvent) {
        ArrayList arrayList = this.f2025q;
        arrayList.clear();
        h(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (MenuItemC0144k) arrayList.get(0);
        }
        boolean m2 = m();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemC0144k menuItemC0144k = (MenuItemC0144k) arrayList.get(i3);
            char c2 = m2 ? menuItemC0144k.f2039j : menuItemC0144k.f2037h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (m2 && c2 == '\b' && i2 == 67))) {
                return menuItemC0144k;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i2) {
        return (MenuItem) this.f2014f.get(i2);
    }

    public final void h(List list, int i2, KeyEvent keyEvent) {
        boolean m2 = m();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            ArrayList arrayList = this.f2014f;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                MenuItemC0144k menuItemC0144k = (MenuItemC0144k) arrayList.get(i3);
                if (menuItemC0144k.hasSubMenu()) {
                    menuItemC0144k.f2044o.h(list, i2, keyEvent);
                }
                char c2 = m2 ? menuItemC0144k.f2039j : menuItemC0144k.f2037h;
                if ((modifiers & 69647) == ((m2 ? menuItemC0144k.f2040k : menuItemC0144k.f2038i) & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c2 == cArr[0] || c2 == cArr[2] || (m2 && c2 == '\b' && i2 == 67)) && menuItemC0144k.isEnabled()) {
                        list.add(menuItemC0144k);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f2014f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((MenuItemC0144k) arrayList.get(i2)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList k2 = k();
        if (this.f2019k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f2026r;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                p pVar = (p) weakReference.get();
                if (pVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 |= pVar.g();
                }
            }
            ArrayList arrayList = this.f2017i;
            ArrayList arrayList2 = this.f2018j;
            if (z2) {
                arrayList.clear();
                arrayList2.clear();
                int size = k2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    MenuItemC0144k menuItemC0144k = (MenuItemC0144k) k2.get(i2);
                    if ((menuItemC0144k.f2052x & 32) == 32) {
                        arrayList.add(menuItemC0144k);
                    } else {
                        arrayList2.add(menuItemC0144k);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(k());
            }
            this.f2019k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return g(i2, keyEvent) != null;
    }

    public final ArrayList k() {
        boolean z2 = this.f2016h;
        ArrayList arrayList = this.f2015g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f2014f;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemC0144k menuItemC0144k = (MenuItemC0144k) arrayList2.get(i2);
            if (menuItemC0144k.isVisible()) {
                arrayList.add(menuItemC0144k);
            }
        }
        this.f2016h = false;
        this.f2019k = true;
        return arrayList;
    }

    public boolean l() {
        return this.t;
    }

    public boolean m() {
        return this.f2011c;
    }

    public boolean n() {
        return this.f2012d;
    }

    public final void o(boolean z2) {
        if (this.f2021m) {
            this.f2022n = true;
            if (z2) {
                this.f2023o = true;
                return;
            }
            return;
        }
        if (z2) {
            this.f2016h = true;
            this.f2019k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2026r;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            p pVar = (p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                pVar.d();
            }
        }
        r();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(MenuItem menuItem, l lVar, int i2) {
        boolean z2;
        MenuItemC0144k menuItemC0144k = (MenuItemC0144k) menuItem;
        if (menuItemC0144k == null || !menuItemC0144k.isEnabled()) {
            return false;
        }
        MenuC0143j menuC0143j = menuItemC0144k.f2043n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = menuItemC0144k.f2045p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(menuItemC0144k)) && !menuC0143j.e(menuC0143j, menuItemC0144k)) {
            Intent intent = menuItemC0144k.f2036g;
            if (intent != null) {
                try {
                    menuC0143j.f2009a.startActivity(intent);
                } catch (ActivityNotFoundException e2) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
                }
            }
            z2 = false;
            if ((menuItemC0144k.f2053y & 8) == 0 && menuItemC0144k.f2054z != null) {
                z2 |= menuItemC0144k.expandActionView();
                if (z2) {
                    c(true);
                }
            } else if (!menuItemC0144k.hasSubMenu()) {
                if ((i2 & 4) == 0) {
                    c(false);
                }
                if (!menuItemC0144k.hasSubMenu()) {
                    t tVar = new t(this.f2009a, this, menuItemC0144k);
                    menuItemC0144k.f2044o = tVar;
                    tVar.setHeaderTitle(menuItemC0144k.f2034e);
                }
                t tVar2 = menuItemC0144k.f2044o;
                CopyOnWriteArrayList copyOnWriteArrayList = this.f2026r;
                if (!copyOnWriteArrayList.isEmpty()) {
                    r0 = lVar != null ? lVar.k(tVar2) : false;
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        WeakReference weakReference = (WeakReference) it.next();
                        p pVar = (p) weakReference.get();
                        if (pVar == null) {
                            copyOnWriteArrayList.remove(weakReference);
                        } else if (!r0) {
                            r0 = pVar.k(tVar2);
                        }
                    }
                }
                z2 |= r0;
                if (!z2) {
                    c(true);
                }
            } else if ((i2 & 1) == 0) {
                c(true);
            }
            return z2;
        }
        z2 = true;
        if ((menuItemC0144k.f2053y & 8) == 0) {
        }
        if (!menuItemC0144k.hasSubMenu()) {
        }
        return z2;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i2, int i3) {
        return p(findItem(i2), null, i3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        MenuItemC0144k g2 = g(i2, keyEvent);
        boolean p2 = g2 != null ? p(g2, null, i3) : false;
        if ((i3 & 2) != 0) {
            c(true);
        }
        return p2;
    }

    public final void q(int i2, CharSequence charSequence, int i3, View view) {
        if (view != null) {
            this.f2020l = null;
        } else {
            if (i2 > 0) {
                this.f2020l = this.f2010b.getText(i2);
            } else if (charSequence != null) {
                this.f2020l = charSequence;
            }
            if (i3 > 0) {
                AbstractC0215a.b(this.f2009a, i3);
            }
        }
        o(false);
    }

    public final void r() {
        this.f2021m = false;
        if (this.f2022n) {
            this.f2022n = false;
            o(this.f2023o);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i2) {
        ArrayList arrayList = this.f2014f;
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (((MenuItemC0144k) arrayList.get(i4)).f2031b == i2) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            int size2 = arrayList.size() - i4;
            while (true) {
                int i5 = i3 + 1;
                if (i3 >= size2 || ((MenuItemC0144k) arrayList.get(i4)).f2031b != i2) {
                    break;
                }
                if (i4 >= 0) {
                    ArrayList arrayList2 = this.f2014f;
                    if (i4 < arrayList2.size()) {
                        arrayList2.remove(i4);
                    }
                }
                i3 = i5;
            }
            o(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i2) {
        ArrayList arrayList = this.f2014f;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((MenuItemC0144k) arrayList.get(i3)).f2030a == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            ArrayList arrayList2 = this.f2014f;
            if (i3 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i3);
            o(true);
        }
    }

    public final void s() {
        if (this.f2021m) {
            return;
        }
        this.f2021m = true;
        this.f2022n = false;
        this.f2023o = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i2, boolean z2, boolean z3) {
        ArrayList arrayList = this.f2014f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemC0144k menuItemC0144k = (MenuItemC0144k) arrayList.get(i3);
            if (menuItemC0144k.f2031b == i2) {
                menuItemC0144k.f2052x = (menuItemC0144k.f2052x & (-5)) | (z3 ? 4 : 0);
                menuItemC0144k.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.t = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i2, boolean z2) {
        ArrayList arrayList = this.f2014f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemC0144k menuItemC0144k = (MenuItemC0144k) arrayList.get(i3);
            if (menuItemC0144k.f2031b == i2) {
                menuItemC0144k.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i2, boolean z2) {
        ArrayList arrayList = this.f2014f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemC0144k menuItemC0144k = (MenuItemC0144k) arrayList.get(i3);
            if (menuItemC0144k.f2031b == i2) {
                int i4 = menuItemC0144k.f2052x;
                int i5 = (i4 & (-9)) | (z2 ? 0 : 8);
                menuItemC0144k.f2052x = i5;
                if (i4 != i5) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            o(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f2011c = z2;
        o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f2014f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2) {
        return a(0, 0, 0, this.f2010b.getString(i2));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.f2010b.getString(i2));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        MenuItemC0144k a2 = a(i2, i3, i4, charSequence);
        t tVar = new t(this.f2009a, this, a2);
        a2.f2044o = tVar;
        tVar.setHeaderTitle(a2.f2034e);
        return tVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.f2010b.getString(i5));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.f2010b.getString(i5));
    }

    public MenuC0143j j() {
        return this;
    }
}
