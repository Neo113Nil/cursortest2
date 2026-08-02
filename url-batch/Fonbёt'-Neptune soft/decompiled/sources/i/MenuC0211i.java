package i;

import A.B;
import A.D;
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
import j.InterfaceC0236l;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import r.AbstractC0288a;

/* renamed from: i.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC0211i implements Menu {

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f2407u = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f2408a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f2409b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2410c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2411d;

    /* renamed from: e, reason: collision with root package name */
    public B.m f2412e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2413f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2414g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2415h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f2416i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f2417j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2418k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f2419l;

    /* renamed from: s, reason: collision with root package name */
    public MenuItemC0212j f2426s;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2420m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2421n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2422o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2423p = false;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f2424q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f2425r = new CopyOnWriteArrayList();

    /* renamed from: t, reason: collision with root package name */
    public boolean f2427t = false;

    public MenuC0211i(Context context) {
        boolean z2;
        boolean z3 = false;
        this.f2408a = context;
        Resources resources = context.getResources();
        this.f2409b = resources;
        this.f2413f = new ArrayList();
        this.f2414g = new ArrayList();
        this.f2415h = true;
        this.f2416i = new ArrayList();
        this.f2417j = new ArrayList();
        this.f2418k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = D.f0a;
            if (Build.VERSION.SDK_INT >= 28) {
                z2 = B.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z2 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z2) {
                z3 = true;
            }
        }
        this.f2411d = z3;
    }

    public final MenuItemC0212j a(int i2, int i3, int i4, CharSequence charSequence) {
        int i5;
        int i6 = ((-65536) & i4) >> 16;
        if (i6 < 0 || i6 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i7 = (f2407u[i6] << 16) | (65535 & i4);
        MenuItemC0212j menuItemC0212j = new MenuItemC0212j(this, i2, i3, i4, i7, charSequence);
        ArrayList arrayList = this.f2413f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i5 = 0;
                break;
            }
            if (((MenuItemC0212j) arrayList.get(size)).f2433d <= i7) {
                i5 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i5, menuItemC0212j);
        o(true);
        return menuItemC0212j;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.f2408a.getPackageManager();
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
            MenuItemC0212j a2 = a(i2, i3, i4, resolveInfo.loadLabel(packageManager));
            a2.setIcon(resolveInfo.loadIcon(packageManager));
            a2.f2436g = intent2;
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

    public final void b(InterfaceC0217o interfaceC0217o, Context context) {
        this.f2425r.add(new WeakReference(interfaceC0217o));
        interfaceC0217o.e(context, this);
        this.f2418k = true;
    }

    public final void c(boolean z2) {
        if (this.f2423p) {
            return;
        }
        this.f2423p = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2425r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0217o interfaceC0217o = (InterfaceC0217o) weakReference.get();
            if (interfaceC0217o == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0217o.a(this, z2);
            }
        }
        this.f2423p = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        MenuItemC0212j menuItemC0212j = this.f2426s;
        if (menuItemC0212j != null) {
            d(menuItemC0212j);
        }
        this.f2413f.clear();
        o(true);
    }

    public final void clearHeader() {
        this.f2419l = null;
        o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(MenuItemC0212j menuItemC0212j) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2425r;
        boolean z2 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f2426s == menuItemC0212j) {
            s();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0217o interfaceC0217o = (InterfaceC0217o) weakReference.get();
                if (interfaceC0217o == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 = interfaceC0217o.b(menuItemC0212j);
                    if (z2) {
                        break;
                    }
                }
            }
            r();
            if (z2) {
                this.f2426s = null;
            }
        }
        return z2;
    }

    public boolean e(MenuC0211i menuC0211i, MenuItem menuItem) {
        InterfaceC0236l interfaceC0236l;
        B.m mVar = this.f2412e;
        if (mVar == null || (interfaceC0236l = ((ActionMenuView) mVar.f78f).f1410B) == null) {
            return false;
        }
        ((Toolbar) ((B.m) interfaceC0236l).f78f).getClass();
        return false;
    }

    public boolean f(MenuItemC0212j menuItemC0212j) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2425r;
        boolean z2 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0217o interfaceC0217o = (InterfaceC0217o) weakReference.get();
            if (interfaceC0217o == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z2 = interfaceC0217o.g(menuItemC0212j);
                if (z2) {
                    break;
                }
            }
        }
        r();
        if (z2) {
            this.f2426s = menuItemC0212j;
        }
        return z2;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i2) {
        MenuItem findItem;
        ArrayList arrayList = this.f2413f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemC0212j menuItemC0212j = (MenuItemC0212j) arrayList.get(i3);
            if (menuItemC0212j.f2430a == i2) {
                return menuItemC0212j;
            }
            if (menuItemC0212j.hasSubMenu() && (findItem = menuItemC0212j.f2444o.findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final MenuItemC0212j g(int i2, KeyEvent keyEvent) {
        ArrayList arrayList = this.f2424q;
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
            return (MenuItemC0212j) arrayList.get(0);
        }
        boolean m2 = m();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemC0212j menuItemC0212j = (MenuItemC0212j) arrayList.get(i3);
            char c2 = m2 ? menuItemC0212j.f2439j : menuItemC0212j.f2437h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (m2 && c2 == '\b' && i2 == 67))) {
                return menuItemC0212j;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i2) {
        return (MenuItem) this.f2413f.get(i2);
    }

    public final void h(ArrayList arrayList, int i2, KeyEvent keyEvent) {
        int i3;
        boolean m2 = m();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            ArrayList arrayList2 = this.f2413f;
            int size = arrayList2.size();
            while (i3 < size) {
                MenuItemC0212j menuItemC0212j = (MenuItemC0212j) arrayList2.get(i3);
                if (menuItemC0212j.hasSubMenu()) {
                    menuItemC0212j.f2444o.h(arrayList, i2, keyEvent);
                }
                char c2 = m2 ? menuItemC0212j.f2439j : menuItemC0212j.f2437h;
                if ((modifiers & 69647) == ((m2 ? menuItemC0212j.f2440k : menuItemC0212j.f2438i) & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if (c2 != cArr[0] && c2 != cArr[2]) {
                        if (m2 && c2 == '\b') {
                            i3 = i2 != 67 ? i3 + 1 : 0;
                        }
                    }
                    if (menuItemC0212j.isEnabled()) {
                        arrayList.add(menuItemC0212j);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f2413f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((MenuItemC0212j) arrayList.get(i2)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList k2 = k();
        if (this.f2418k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f2425r;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0217o interfaceC0217o = (InterfaceC0217o) weakReference.get();
                if (interfaceC0217o == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 |= interfaceC0217o.d();
                }
            }
            ArrayList arrayList = this.f2416i;
            ArrayList arrayList2 = this.f2417j;
            if (z2) {
                arrayList.clear();
                arrayList2.clear();
                int size = k2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    MenuItemC0212j menuItemC0212j = (MenuItemC0212j) k2.get(i2);
                    if (menuItemC0212j.d()) {
                        arrayList.add(menuItemC0212j);
                    } else {
                        arrayList2.add(menuItemC0212j);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(k());
            }
            this.f2418k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return g(i2, keyEvent) != null;
    }

    public final ArrayList k() {
        boolean z2 = this.f2415h;
        ArrayList arrayList = this.f2414g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f2413f;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemC0212j menuItemC0212j = (MenuItemC0212j) arrayList2.get(i2);
            if (menuItemC0212j.isVisible()) {
                arrayList.add(menuItemC0212j);
            }
        }
        this.f2415h = false;
        this.f2418k = true;
        return arrayList;
    }

    public boolean l() {
        return this.f2427t;
    }

    public boolean m() {
        return this.f2410c;
    }

    public boolean n() {
        return this.f2411d;
    }

    public final void o(boolean z2) {
        if (this.f2420m) {
            this.f2421n = true;
            if (z2) {
                this.f2422o = true;
                return;
            }
            return;
        }
        if (z2) {
            this.f2415h = true;
            this.f2418k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2425r;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0217o interfaceC0217o = (InterfaceC0217o) weakReference.get();
            if (interfaceC0217o == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0217o.h();
            }
        }
        r();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(MenuItem menuItem, AbstractC0213k abstractC0213k, int i2) {
        boolean z2;
        MenuItemC0212j menuItemC0212j = (MenuItemC0212j) menuItem;
        if (menuItemC0212j == null || !menuItemC0212j.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = menuItemC0212j.f2445p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(menuItemC0212j)) {
            MenuC0211i menuC0211i = menuItemC0212j.f2443n;
            if (!menuC0211i.e(menuC0211i, menuItemC0212j)) {
                Intent intent = menuItemC0212j.f2436g;
                if (intent != null) {
                    try {
                        menuC0211i.f2408a.startActivity(intent);
                    } catch (ActivityNotFoundException e2) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
                    }
                }
                z2 = false;
                if (!menuItemC0212j.c()) {
                    z2 |= menuItemC0212j.expandActionView();
                    if (z2) {
                        c(true);
                    }
                } else if (menuItemC0212j.hasSubMenu()) {
                    if ((i2 & 4) == 0) {
                        c(false);
                    }
                    if (!menuItemC0212j.hasSubMenu()) {
                        SubMenuC0221s subMenuC0221s = new SubMenuC0221s(this.f2408a, this, menuItemC0212j);
                        menuItemC0212j.f2444o = subMenuC0221s;
                        subMenuC0221s.setHeaderTitle(menuItemC0212j.f2434e);
                    }
                    SubMenuC0221s subMenuC0221s2 = menuItemC0212j.f2444o;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f2425r;
                    if (!copyOnWriteArrayList.isEmpty()) {
                        r0 = abstractC0213k != null ? abstractC0213k.k(subMenuC0221s2) : false;
                        Iterator it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            WeakReference weakReference = (WeakReference) it.next();
                            InterfaceC0217o interfaceC0217o = (InterfaceC0217o) weakReference.get();
                            if (interfaceC0217o == null) {
                                copyOnWriteArrayList.remove(weakReference);
                            } else if (!r0) {
                                r0 = interfaceC0217o.k(subMenuC0221s2);
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
        }
        z2 = true;
        if (!menuItemC0212j.c()) {
        }
        return z2;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i2, int i3) {
        return p(findItem(i2), null, i3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        MenuItemC0212j g2 = g(i2, keyEvent);
        boolean p2 = g2 != null ? p(g2, null, i3) : false;
        if ((i3 & 2) != 0) {
            c(true);
        }
        return p2;
    }

    public final void q(int i2, CharSequence charSequence, int i3, View view) {
        if (view != null) {
            this.f2419l = null;
        } else {
            if (i2 > 0) {
                this.f2419l = this.f2409b.getText(i2);
            } else if (charSequence != null) {
                this.f2419l = charSequence;
            }
            if (i3 > 0) {
                AbstractC0288a.b(this.f2408a, i3);
            }
        }
        o(false);
    }

    public final void r() {
        this.f2420m = false;
        if (this.f2421n) {
            this.f2421n = false;
            o(this.f2422o);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i2) {
        ArrayList arrayList = this.f2413f;
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (((MenuItemC0212j) arrayList.get(i4)).f2431b == i2) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            int size2 = arrayList.size() - i4;
            while (true) {
                int i5 = i3 + 1;
                if (i3 >= size2 || ((MenuItemC0212j) arrayList.get(i4)).f2431b != i2) {
                    break;
                }
                if (i4 >= 0) {
                    ArrayList arrayList2 = this.f2413f;
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
        ArrayList arrayList = this.f2413f;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((MenuItemC0212j) arrayList.get(i3)).f2430a == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            ArrayList arrayList2 = this.f2413f;
            if (i3 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i3);
            o(true);
        }
    }

    public final void s() {
        if (this.f2420m) {
            return;
        }
        this.f2420m = true;
        this.f2421n = false;
        this.f2422o = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i2, boolean z2, boolean z3) {
        ArrayList arrayList = this.f2413f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemC0212j menuItemC0212j = (MenuItemC0212j) arrayList.get(i3);
            if (menuItemC0212j.f2431b == i2) {
                menuItemC0212j.f2452x = (menuItemC0212j.f2452x & (-5)) | (z3 ? 4 : 0);
                menuItemC0212j.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f2427t = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i2, boolean z2) {
        ArrayList arrayList = this.f2413f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemC0212j menuItemC0212j = (MenuItemC0212j) arrayList.get(i3);
            if (menuItemC0212j.f2431b == i2) {
                menuItemC0212j.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i2, boolean z2) {
        ArrayList arrayList = this.f2413f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemC0212j menuItemC0212j = (MenuItemC0212j) arrayList.get(i3);
            if (menuItemC0212j.f2431b == i2) {
                int i4 = menuItemC0212j.f2452x;
                int i5 = (i4 & (-9)) | (z2 ? 0 : 8);
                menuItemC0212j.f2452x = i5;
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
        this.f2410c = z2;
        o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f2413f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2) {
        return a(0, 0, 0, this.f2409b.getString(i2));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.f2409b.getString(i2));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        MenuItemC0212j a2 = a(i2, i3, i4, charSequence);
        SubMenuC0221s subMenuC0221s = new SubMenuC0221s(this.f2408a, this, a2);
        a2.f2444o = subMenuC0221s;
        subMenuC0221s.setHeaderTitle(a2.f2434e);
        return subMenuC0221s;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.f2409b.getString(i5));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.f2409b.getString(i5));
    }

    public MenuC0211i j() {
        return this;
    }
}
