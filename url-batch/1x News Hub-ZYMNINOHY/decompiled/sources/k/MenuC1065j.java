package k;

import E.AbstractC0003d;
import E.B;
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
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l.InterfaceC1090l;

/* renamed from: k.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC1065j implements Menu {
    public static final int[] v = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f9597a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f9598b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9599c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9600d;

    /* renamed from: e, reason: collision with root package name */
    public b0.s f9601e;
    public final ArrayList f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f9602g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9603h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f9604i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f9605j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9606k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f9607l;

    /* renamed from: m, reason: collision with root package name */
    public View f9608m;

    /* renamed from: t, reason: collision with root package name */
    public MenuItemC1066k f9614t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9609n = false;
    public boolean o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9610p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9611q = false;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f9612r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final CopyOnWriteArrayList f9613s = new CopyOnWriteArrayList();

    /* renamed from: u, reason: collision with root package name */
    public boolean f9615u = false;

    public MenuC1065j(Context context) {
        boolean z;
        boolean z2 = false;
        this.f9597a = context;
        Resources resources = context.getResources();
        this.f9598b = resources;
        this.f = new ArrayList();
        this.f9602g = new ArrayList();
        this.f9603h = true;
        this.f9604i = new ArrayList();
        this.f9605j = new ArrayList();
        this.f9606k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = B.f245a;
            if (Build.VERSION.SDK_INT >= 28) {
                z = AbstractC0003d.p(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", ConstantDeviceInfo.APP_PLATFORM);
                z = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z) {
                z2 = true;
            }
        }
        this.f9600d = z2;
    }

    public final MenuItemC1066k a(int i3, int i4, int i5, CharSequence charSequence) {
        int i6;
        int i7 = ((-65536) & i5) >> 16;
        if (i7 < 0 || i7 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i8 = (v[i7] << 16) | (65535 & i5);
        MenuItemC1066k menuItemC1066k = new MenuItemC1066k(this, i3, i4, i5, i8, charSequence);
        ArrayList arrayList = this.f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i6 = 0;
                break;
            }
            if (((MenuItemC1066k) arrayList.get(size)).f9621d <= i8) {
                i6 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i6, menuItemC1066k);
        o(true);
        return menuItemC1066k;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i3, int i4, int i5, ComponentName componentName, Intent[] intentArr, Intent intent, int i6, MenuItem[] menuItemArr) {
        int i7;
        PackageManager packageManager = this.f9597a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i6 & 1) == 0) {
            removeGroup(i3);
        }
        for (int i8 = 0; i8 < size; i8++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i8);
            int i9 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i9 < 0 ? intent : intentArr[i9]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItemC1066k a3 = a(i3, i4, i5, resolveInfo.loadLabel(packageManager));
            a3.setIcon(resolveInfo.loadIcon(packageManager));
            a3.f9623g = intent2;
            if (menuItemArr != null && (i7 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i7] = a3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(InterfaceC1071p interfaceC1071p, Context context) {
        this.f9613s.add(new WeakReference(interfaceC1071p));
        interfaceC1071p.i(context, this);
        this.f9606k = true;
    }

    public final void c(boolean z) {
        if (this.f9611q) {
            return;
        }
        this.f9611q = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f9613s;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1071p interfaceC1071p = (InterfaceC1071p) weakReference.get();
            if (interfaceC1071p == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC1071p.a(this, z);
            }
        }
        this.f9611q = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        MenuItemC1066k menuItemC1066k = this.f9614t;
        if (menuItemC1066k != null) {
            d(menuItemC1066k);
        }
        this.f.clear();
        o(true);
    }

    public final void clearHeader() {
        this.f9607l = null;
        o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(MenuItemC1066k menuItemC1066k) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f9613s;
        boolean z = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f9614t == menuItemC1066k) {
            s();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC1071p interfaceC1071p = (InterfaceC1071p) weakReference.get();
                if (interfaceC1071p == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z = interfaceC1071p.e(menuItemC1066k);
                    if (z) {
                        break;
                    }
                }
            }
            r();
            if (z) {
                this.f9614t = null;
            }
        }
        return z;
    }

    public boolean e(MenuC1065j menuC1065j, MenuItem menuItem) {
        InterfaceC1090l interfaceC1090l;
        b0.s sVar = this.f9601e;
        if (sVar == null || (interfaceC1090l = ((ActionMenuView) sVar.f2544a).f2040x) == null) {
            return false;
        }
        ((Toolbar) ((b0.r) interfaceC1090l).f2543a).getClass();
        return false;
    }

    public boolean f(MenuItemC1066k menuItemC1066k) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f9613s;
        boolean z = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1071p interfaceC1071p = (InterfaceC1071p) weakReference.get();
            if (interfaceC1071p == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z = interfaceC1071p.b(menuItemC1066k);
                if (z) {
                    break;
                }
            }
        }
        r();
        if (z) {
            this.f9614t = menuItemC1066k;
        }
        return z;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i3) {
        MenuItem findItem;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItemC1066k menuItemC1066k = (MenuItemC1066k) arrayList.get(i4);
            if (menuItemC1066k.f9618a == i3) {
                return menuItemC1066k;
            }
            if (menuItemC1066k.hasSubMenu() && (findItem = menuItemC1066k.o.findItem(i3)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final MenuItemC1066k g(int i3, KeyEvent keyEvent) {
        ArrayList arrayList = this.f9612r;
        arrayList.clear();
        h(arrayList, i3, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (MenuItemC1066k) arrayList.get(0);
        }
        boolean m3 = m();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItemC1066k menuItemC1066k = (MenuItemC1066k) arrayList.get(i4);
            char c3 = m3 ? menuItemC1066k.f9626j : menuItemC1066k.f9624h;
            char[] cArr = keyData.meta;
            if ((c3 == cArr[0] && (metaState & 2) == 0) || ((c3 == cArr[2] && (metaState & 2) != 0) || (m3 && c3 == '\b' && i3 == 67))) {
                return menuItemC1066k;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i3) {
        return (MenuItem) this.f.get(i3);
    }

    public final void h(ArrayList arrayList, int i3, KeyEvent keyEvent) {
        boolean m3 = m();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i3 == 67) {
            ArrayList arrayList2 = this.f;
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                MenuItemC1066k menuItemC1066k = (MenuItemC1066k) arrayList2.get(i4);
                if (menuItemC1066k.hasSubMenu()) {
                    menuItemC1066k.o.h(arrayList, i3, keyEvent);
                }
                char c3 = m3 ? menuItemC1066k.f9626j : menuItemC1066k.f9624h;
                if ((modifiers & 69647) == ((m3 ? menuItemC1066k.f9627k : menuItemC1066k.f9625i) & 69647) && c3 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c3 == cArr[0] || c3 == cArr[2] || (m3 && c3 == '\b' && i3 == 67)) && menuItemC1066k.isEnabled()) {
                        arrayList.add(menuItemC1066k);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((MenuItemC1066k) arrayList.get(i3)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList k3 = k();
        if (this.f9606k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f9613s;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC1071p interfaceC1071p = (InterfaceC1071p) weakReference.get();
                if (interfaceC1071p == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z |= interfaceC1071p.j();
                }
            }
            ArrayList arrayList = this.f9604i;
            ArrayList arrayList2 = this.f9605j;
            if (z) {
                arrayList.clear();
                arrayList2.clear();
                int size = k3.size();
                for (int i3 = 0; i3 < size; i3++) {
                    MenuItemC1066k menuItemC1066k = (MenuItemC1066k) k3.get(i3);
                    if ((menuItemC1066k.f9638x & 32) == 32) {
                        arrayList.add(menuItemC1066k);
                    } else {
                        arrayList2.add(menuItemC1066k);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(k());
            }
            this.f9606k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i3, KeyEvent keyEvent) {
        return g(i3, keyEvent) != null;
    }

    public final ArrayList k() {
        boolean z = this.f9603h;
        ArrayList arrayList = this.f9602g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemC1066k menuItemC1066k = (MenuItemC1066k) arrayList2.get(i3);
            if (menuItemC1066k.isVisible()) {
                arrayList.add(menuItemC1066k);
            }
        }
        this.f9603h = false;
        this.f9606k = true;
        return arrayList;
    }

    public boolean l() {
        return this.f9615u;
    }

    public boolean m() {
        return this.f9599c;
    }

    public boolean n() {
        return this.f9600d;
    }

    public final void o(boolean z) {
        if (this.f9609n) {
            this.o = true;
            if (z) {
                this.f9610p = true;
                return;
            }
            return;
        }
        if (z) {
            this.f9603h = true;
            this.f9606k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f9613s;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1071p interfaceC1071p = (InterfaceC1071p) weakReference.get();
            if (interfaceC1071p == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC1071p.f();
            }
        }
        r();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(MenuItem menuItem, AbstractC1067l abstractC1067l, int i3) {
        boolean z;
        MenuItemC1066k menuItemC1066k = (MenuItemC1066k) menuItem;
        if (menuItemC1066k == null || !menuItemC1066k.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = menuItemC1066k.f9631p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(menuItemC1066k)) {
            MenuC1065j menuC1065j = menuItemC1066k.f9630n;
            if (!menuC1065j.e(menuC1065j, menuItemC1066k)) {
                Intent intent = menuItemC1066k.f9623g;
                if (intent != null) {
                    try {
                        menuC1065j.f9597a.startActivity(intent);
                    } catch (ActivityNotFoundException e3) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e3);
                    }
                }
                z = false;
                if ((menuItemC1066k.f9639y & 8) == 0 && menuItemC1066k.z != null) {
                    z |= menuItemC1066k.expandActionView();
                    if (z) {
                        c(true);
                    }
                } else if (!menuItemC1066k.hasSubMenu()) {
                    if ((i3 & 4) == 0) {
                        c(false);
                    }
                    if (!menuItemC1066k.hasSubMenu()) {
                        SubMenuC1075t subMenuC1075t = new SubMenuC1075t(this.f9597a, this, menuItemC1066k);
                        menuItemC1066k.o = subMenuC1075t;
                        subMenuC1075t.setHeaderTitle(menuItemC1066k.f9622e);
                    }
                    SubMenuC1075t subMenuC1075t2 = menuItemC1066k.o;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f9613s;
                    if (!copyOnWriteArrayList.isEmpty()) {
                        r0 = abstractC1067l != null ? abstractC1067l.c(subMenuC1075t2) : false;
                        Iterator it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            WeakReference weakReference = (WeakReference) it.next();
                            InterfaceC1071p interfaceC1071p = (InterfaceC1071p) weakReference.get();
                            if (interfaceC1071p == null) {
                                copyOnWriteArrayList.remove(weakReference);
                            } else if (!r0) {
                                r0 = interfaceC1071p.c(subMenuC1075t2);
                            }
                        }
                    }
                    z |= r0;
                    if (!z) {
                        c(true);
                    }
                } else if ((i3 & 1) == 0) {
                    c(true);
                }
                return z;
            }
        }
        z = true;
        if ((menuItemC1066k.f9639y & 8) == 0) {
        }
        if (!menuItemC1066k.hasSubMenu()) {
        }
        return z;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i3, int i4) {
        return p(findItem(i3), null, i4);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i3, KeyEvent keyEvent, int i4) {
        MenuItemC1066k g3 = g(i3, keyEvent);
        boolean p3 = g3 != null ? p(g3, null, i4) : false;
        if ((i4 & 2) != 0) {
            c(true);
        }
        return p3;
    }

    public final void q(int i3, CharSequence charSequence, int i4, View view) {
        if (view != null) {
            this.f9608m = view;
            this.f9607l = null;
        } else {
            if (i3 > 0) {
                this.f9607l = this.f9598b.getText(i3);
            } else if (charSequence != null) {
                this.f9607l = charSequence;
            }
            if (i4 > 0) {
                this.f9597a.getDrawable(i4);
            }
        }
        o(false);
    }

    public final void r() {
        this.f9609n = false;
        if (this.o) {
            this.o = false;
            o(this.f9610p);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i3) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i5 = -1;
                break;
            } else if (((MenuItemC1066k) arrayList.get(i5)).f9619b == i3) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 >= 0) {
            int size2 = arrayList.size() - i5;
            while (true) {
                int i6 = i4 + 1;
                if (i4 >= size2 || ((MenuItemC1066k) arrayList.get(i5)).f9619b != i3) {
                    break;
                }
                if (i5 >= 0) {
                    ArrayList arrayList2 = this.f;
                    if (i5 < arrayList2.size()) {
                        arrayList2.remove(i5);
                    }
                }
                i4 = i6;
            }
            o(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i3) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (((MenuItemC1066k) arrayList.get(i4)).f9618a == i3) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            ArrayList arrayList2 = this.f;
            if (i4 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i4);
            o(true);
        }
    }

    public final void s() {
        if (this.f9609n) {
            return;
        }
        this.f9609n = true;
        this.o = false;
        this.f9610p = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i3, boolean z, boolean z2) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItemC1066k menuItemC1066k = (MenuItemC1066k) arrayList.get(i4);
            if (menuItemC1066k.f9619b == i3) {
                menuItemC1066k.f9638x = (menuItemC1066k.f9638x & (-5)) | (z2 ? 4 : 0);
                menuItemC1066k.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f9615u = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i3, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItemC1066k menuItemC1066k = (MenuItemC1066k) arrayList.get(i4);
            if (menuItemC1066k.f9619b == i3) {
                menuItemC1066k.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i3, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i4 = 0; i4 < size; i4++) {
            MenuItemC1066k menuItemC1066k = (MenuItemC1066k) arrayList.get(i4);
            if (menuItemC1066k.f9619b == i3) {
                int i5 = menuItemC1066k.f9638x;
                int i6 = (i5 & (-9)) | (z ? 0 : 8);
                menuItemC1066k.f9638x = i6;
                if (i5 != i6) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            o(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f9599c = z;
        o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3) {
        return a(0, 0, 0, this.f9598b.getString(i3));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3) {
        return addSubMenu(0, 0, 0, this.f9598b.getString(i3));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3, int i4, int i5, CharSequence charSequence) {
        return a(i3, i4, i5, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3, int i4, int i5, CharSequence charSequence) {
        MenuItemC1066k a3 = a(i3, i4, i5, charSequence);
        SubMenuC1075t subMenuC1075t = new SubMenuC1075t(this.f9597a, this, a3);
        a3.o = subMenuC1075t;
        subMenuC1075t.setHeaderTitle(a3.f9622e);
        return subMenuC1075t;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3, int i4, int i5, int i6) {
        return a(i3, i4, i5, this.f9598b.getString(i6));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3, int i4, int i5, int i6) {
        return addSubMenu(i3, i4, i5, this.f9598b.getString(i6));
    }

    public MenuC1065j j() {
        return this;
    }
}
