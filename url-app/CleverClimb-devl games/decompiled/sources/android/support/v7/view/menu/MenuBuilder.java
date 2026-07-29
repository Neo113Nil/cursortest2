package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.content.ContextCompat;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.ActionProvider;
import android.support.v7.appcompat.R;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class MenuBuilder implements SupportMenu {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f1743d = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    CharSequence f1744a;

    /* renamed from: b, reason: collision with root package name */
    Drawable f1745b;

    /* renamed from: c, reason: collision with root package name */
    View f1746c;
    private final Context e;
    private final Resources f;
    private boolean g;
    private boolean h;
    private a i;
    private ContextMenu.ContextMenuInfo q;
    private MenuItemImpl y;
    private boolean z;
    private int p = 0;
    private boolean r = false;
    private boolean s = false;
    private boolean t = false;
    private boolean u = false;
    private boolean v = false;
    private ArrayList<MenuItemImpl> w = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<l>> x = new CopyOnWriteArrayList<>();
    private ArrayList<MenuItemImpl> j = new ArrayList<>();
    private ArrayList<MenuItemImpl> k = new ArrayList<>();
    private boolean l = true;
    private ArrayList<MenuItemImpl> m = new ArrayList<>();
    private ArrayList<MenuItemImpl> n = new ArrayList<>();
    private boolean o = true;

    public interface a {
        boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem);

        void onMenuModeChange(MenuBuilder menuBuilder);
    }

    public interface b {
        boolean invokeItem(MenuItemImpl menuItemImpl);
    }

    protected String a() {
        return "android:menu:actionviewstates";
    }

    public MenuBuilder p() {
        return this;
    }

    public MenuBuilder(Context context) {
        this.e = context;
        this.f = context.getResources();
        e(true);
    }

    public MenuBuilder a(int i) {
        this.p = i;
        return this;
    }

    public void a(l lVar) {
        a(lVar, this.e);
    }

    public void a(l lVar, Context context) {
        this.x.add(new WeakReference<>(lVar));
        lVar.initForMenu(context, this);
        this.o = true;
    }

    public void b(l lVar) {
        Iterator<WeakReference<l>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference<l> next = it.next();
            l lVar2 = next.get();
            if (lVar2 == null || lVar2 == lVar) {
                this.x.remove(next);
            }
        }
    }

    private void d(boolean z) {
        if (this.x.isEmpty()) {
            return;
        }
        g();
        Iterator<WeakReference<l>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference<l> next = it.next();
            l lVar = next.get();
            if (lVar == null) {
                this.x.remove(next);
            } else {
                lVar.updateMenuView(z);
            }
        }
        h();
    }

    private boolean a(SubMenuBuilder subMenuBuilder, l lVar) {
        if (this.x.isEmpty()) {
            return false;
        }
        boolean onSubMenuSelected = lVar != null ? lVar.onSubMenuSelected(subMenuBuilder) : false;
        Iterator<WeakReference<l>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference<l> next = it.next();
            l lVar2 = next.get();
            if (lVar2 == null) {
                this.x.remove(next);
            } else if (!onSubMenuSelected) {
                onSubMenuSelected = lVar2.onSubMenuSelected(subMenuBuilder);
            }
        }
        return onSubMenuSelected;
    }

    public void a(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuBuilder) item.getSubMenu()).a(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(a(), sparseArray);
        }
    }

    public void b(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(a());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuBuilder) item.getSubMenu()).b(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public void a(a aVar) {
        this.i = aVar;
    }

    protected MenuItem a(int i, int i2, int i3, CharSequence charSequence) {
        int f = f(i3);
        MenuItemImpl a2 = a(i, i2, i3, f, charSequence, this.p);
        if (this.q != null) {
            a2.a(this.q);
        }
        this.j.add(a(this.j, f), a2);
        b(true);
        return a2;
    }

    private MenuItemImpl a(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new MenuItemImpl(this, i, i2, i3, i4, charSequence, i5);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return a(0, 0, 0, this.f.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.f.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        MenuItemImpl menuItemImpl = (MenuItemImpl) a(i, i2, i3, charSequence);
        SubMenuBuilder subMenuBuilder = new SubMenuBuilder(this.e, this, menuItemImpl);
        menuItemImpl.a(subMenuBuilder);
        return subMenuBuilder;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f.getString(i4));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.e.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        a(b(i), true);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int c2 = c(i);
        if (c2 >= 0) {
            int size = this.j.size() - c2;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.j.get(c2).getGroupId() != i) {
                    break;
                }
                a(c2, false);
                i2 = i3;
            }
            b(true);
        }
    }

    private void a(int i, boolean z) {
        if (i < 0 || i >= this.j.size()) {
            return;
        }
        this.j.remove(i);
        if (z) {
            b(true);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        if (this.y != null) {
            d(this.y);
        }
        this.j.clear();
        b(true);
    }

    void a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.j.size();
        g();
        for (int i = 0; i < size; i++) {
            MenuItemImpl menuItemImpl = this.j.get(i);
            if (menuItemImpl.getGroupId() == groupId && menuItemImpl.f() && menuItemImpl.isCheckable()) {
                menuItemImpl.b(menuItemImpl == menuItem);
            }
        }
        h();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.j.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = this.j.get(i2);
            if (menuItemImpl.getGroupId() == i) {
                menuItemImpl.a(z2);
                menuItemImpl.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.j.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = this.j.get(i2);
            if (menuItemImpl.getGroupId() == i && menuItemImpl.c(z)) {
                z2 = true;
            }
        }
        if (z2) {
            b(true);
        }
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.j.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = this.j.get(i2);
            if (menuItemImpl.getGroupId() == i) {
                menuItemImpl.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.j.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = this.j.get(i2);
            if (menuItemImpl.getItemId() == i) {
                return menuItemImpl;
            }
            if (menuItemImpl.hasSubMenu() && (findItem = menuItemImpl.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public int b(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.j.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    public int c(int i) {
        return a(i, 0);
    }

    public int a(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.j.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public int size() {
        return this.j.size();
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.j.get(i);
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return a(i, keyEvent) != null;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.g = z;
        b(false);
    }

    private static int f(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 < 0 || i2 >= f1743d.length) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        return (i & 65535) | (f1743d[i2] << 16);
    }

    boolean b() {
        return this.g;
    }

    private void e(boolean z) {
        this.h = z && this.f.getConfiguration().keyboard != 1 && this.f.getBoolean(R.bool.abc_config_showMenuShortcutsWhenKeyboardPresent);
    }

    public boolean c() {
        return this.h;
    }

    Resources d() {
        return this.f;
    }

    public Context e() {
        return this.e;
    }

    boolean a(MenuBuilder menuBuilder, MenuItem menuItem) {
        return this.i != null && this.i.onMenuItemSelected(menuBuilder, menuItem);
    }

    public void f() {
        if (this.i != null) {
            this.i.onMenuModeChange(this);
        }
    }

    private static int a(ArrayList<MenuItemImpl> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).b() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        MenuItemImpl a2 = a(i, keyEvent);
        boolean a3 = a2 != null ? a(a2, i2) : false;
        if ((i2 & 2) != 0) {
            a(true);
        }
        return a3;
    }

    void a(List<MenuItemImpl> list, int i, KeyEvent keyEvent) {
        boolean b2 = b();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.j.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItemImpl menuItemImpl = this.j.get(i2);
                if (menuItemImpl.hasSubMenu()) {
                    ((MenuBuilder) menuItemImpl.getSubMenu()).a(list, i, keyEvent);
                }
                char alphabeticShortcut = b2 ? menuItemImpl.getAlphabeticShortcut() : menuItemImpl.getNumericShortcut();
                if (((modifiers & SupportMenu.SUPPORTED_MODIFIERS_MASK) == ((b2 ? menuItemImpl.getAlphabeticModifiers() : menuItemImpl.getNumericModifiers()) & SupportMenu.SUPPORTED_MODIFIERS_MASK)) && alphabeticShortcut != 0 && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (b2 && alphabeticShortcut == '\b' && i == 67)) && menuItemImpl.isEnabled())) {
                    list.add(menuItemImpl);
                }
            }
        }
    }

    MenuItemImpl a(int i, KeyEvent keyEvent) {
        char numericShortcut;
        ArrayList<MenuItemImpl> arrayList = this.w;
        arrayList.clear();
        a(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean b2 = b();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = arrayList.get(i2);
            if (b2) {
                numericShortcut = menuItemImpl.getAlphabeticShortcut();
            } else {
                numericShortcut = menuItemImpl.getNumericShortcut();
            }
            if ((numericShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((numericShortcut == keyData.meta[2] && (metaState & 2) != 0) || (b2 && numericShortcut == '\b' && i == 67))) {
                return menuItemImpl;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return a(findItem(i), i2);
    }

    public boolean a(MenuItem menuItem, int i) {
        return a(menuItem, (l) null, i);
    }

    public boolean a(MenuItem menuItem, l lVar, int i) {
        MenuItemImpl menuItemImpl = (MenuItemImpl) menuItem;
        if (menuItemImpl == null || !menuItemImpl.isEnabled()) {
            return false;
        }
        boolean a2 = menuItemImpl.a();
        ActionProvider supportActionProvider = menuItemImpl.getSupportActionProvider();
        boolean z = supportActionProvider != null && supportActionProvider.hasSubMenu();
        if (menuItemImpl.m()) {
            a2 |= menuItemImpl.expandActionView();
            if (a2) {
                a(true);
            }
        } else if (menuItemImpl.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                a(false);
            }
            if (!menuItemImpl.hasSubMenu()) {
                menuItemImpl.a(new SubMenuBuilder(e(), this, menuItemImpl));
            }
            SubMenuBuilder subMenuBuilder = (SubMenuBuilder) menuItemImpl.getSubMenu();
            if (z) {
                supportActionProvider.onPrepareSubMenu(subMenuBuilder);
            }
            a2 |= a(subMenuBuilder, lVar);
            if (!a2) {
                a(true);
            }
        } else if ((i & 1) == 0) {
            a(true);
        }
        return a2;
    }

    public final void a(boolean z) {
        if (this.v) {
            return;
        }
        this.v = true;
        Iterator<WeakReference<l>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference<l> next = it.next();
            l lVar = next.get();
            if (lVar == null) {
                this.x.remove(next);
            } else {
                lVar.onCloseMenu(this, z);
            }
        }
        this.v = false;
    }

    @Override // android.view.Menu
    public void close() {
        a(true);
    }

    public void b(boolean z) {
        if (!this.r) {
            if (z) {
                this.l = true;
                this.o = true;
            }
            d(z);
            return;
        }
        this.s = true;
        if (z) {
            this.t = true;
        }
    }

    public void g() {
        if (this.r) {
            return;
        }
        this.r = true;
        this.s = false;
        this.t = false;
    }

    public void h() {
        this.r = false;
        if (this.s) {
            this.s = false;
            b(this.t);
        }
    }

    void a(MenuItemImpl menuItemImpl) {
        this.l = true;
        b(true);
    }

    void b(MenuItemImpl menuItemImpl) {
        this.o = true;
        b(true);
    }

    public ArrayList<MenuItemImpl> i() {
        if (!this.l) {
            return this.k;
        }
        this.k.clear();
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            MenuItemImpl menuItemImpl = this.j.get(i);
            if (menuItemImpl.isVisible()) {
                this.k.add(menuItemImpl);
            }
        }
        this.l = false;
        this.o = true;
        return this.k;
    }

    public void j() {
        ArrayList<MenuItemImpl> i = i();
        if (this.o) {
            Iterator<WeakReference<l>> it = this.x.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference<l> next = it.next();
                l lVar = next.get();
                if (lVar == null) {
                    this.x.remove(next);
                } else {
                    z |= lVar.flagActionItems();
                }
            }
            if (z) {
                this.m.clear();
                this.n.clear();
                int size = i.size();
                for (int i2 = 0; i2 < size; i2++) {
                    MenuItemImpl menuItemImpl = i.get(i2);
                    if (menuItemImpl.i()) {
                        this.m.add(menuItemImpl);
                    } else {
                        this.n.add(menuItemImpl);
                    }
                }
            } else {
                this.m.clear();
                this.n.clear();
                this.n.addAll(i());
            }
            this.o = false;
        }
    }

    public ArrayList<MenuItemImpl> k() {
        j();
        return this.m;
    }

    public ArrayList<MenuItemImpl> l() {
        j();
        return this.n;
    }

    public void clearHeader() {
        this.f1745b = null;
        this.f1744a = null;
        this.f1746c = null;
        b(false);
    }

    private void a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources d2 = d();
        if (view != null) {
            this.f1746c = view;
            this.f1744a = null;
            this.f1745b = null;
        } else {
            if (i > 0) {
                this.f1744a = d2.getText(i);
            } else if (charSequence != null) {
                this.f1744a = charSequence;
            }
            if (i2 > 0) {
                this.f1745b = ContextCompat.getDrawable(e(), i2);
            } else if (drawable != null) {
                this.f1745b = drawable;
            }
            this.f1746c = null;
        }
        b(false);
    }

    protected MenuBuilder a(CharSequence charSequence) {
        a(0, charSequence, 0, null, null);
        return this;
    }

    protected MenuBuilder d(int i) {
        a(i, null, 0, null, null);
        return this;
    }

    protected MenuBuilder a(Drawable drawable) {
        a(0, null, 0, drawable, null);
        return this;
    }

    protected MenuBuilder e(int i) {
        a(0, null, i, null, null);
        return this;
    }

    protected MenuBuilder a(View view) {
        a(0, null, 0, null, view);
        return this;
    }

    public CharSequence m() {
        return this.f1744a;
    }

    public Drawable n() {
        return this.f1745b;
    }

    public View o() {
        return this.f1746c;
    }

    boolean q() {
        return this.u;
    }

    public boolean c(MenuItemImpl menuItemImpl) {
        boolean z = false;
        if (this.x.isEmpty()) {
            return false;
        }
        g();
        Iterator<WeakReference<l>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference<l> next = it.next();
            l lVar = next.get();
            if (lVar == null) {
                this.x.remove(next);
            } else {
                z = lVar.expandItemActionView(this, menuItemImpl);
                if (z) {
                    break;
                }
            }
        }
        h();
        if (z) {
            this.y = menuItemImpl;
        }
        return z;
    }

    public boolean d(MenuItemImpl menuItemImpl) {
        boolean z = false;
        if (this.x.isEmpty() || this.y != menuItemImpl) {
            return false;
        }
        g();
        Iterator<WeakReference<l>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference<l> next = it.next();
            l lVar = next.get();
            if (lVar == null) {
                this.x.remove(next);
            } else {
                z = lVar.collapseItemActionView(this, menuItemImpl);
                if (z) {
                    break;
                }
            }
        }
        h();
        if (z) {
            this.y = null;
        }
        return z;
    }

    public MenuItemImpl r() {
        return this.y;
    }

    public void c(boolean z) {
        this.z = z;
    }
}
