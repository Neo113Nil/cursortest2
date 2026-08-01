package k;

import K.V;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: k.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC0166m implements Menu {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f2712y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f2713a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f2714b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2715c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0164k f2716e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2717f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2718g;
    public boolean h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f2719j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2720k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f2722m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f2723n;

    /* renamed from: o, reason: collision with root package name */
    public View f2724o;

    /* renamed from: v, reason: collision with root package name */
    public C0168o f2731v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2733x;

    /* renamed from: l, reason: collision with root package name */
    public int f2721l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2725p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2726q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2727r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2728s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f2729t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f2730u = new CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f2732w = false;

    public MenuC0166m(Context context) {
        boolean z2;
        boolean z3 = false;
        this.f2713a = context;
        Resources resources = context.getResources();
        this.f2714b = resources;
        this.f2717f = new ArrayList();
        this.f2718g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.f2719j = new ArrayList();
        this.f2720k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                z2 = V.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z2 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z2) {
                z3 = true;
            }
        }
        this.d = z3;
    }

    public final C0168o a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (f2712y[i5] << 16) | (65535 & i3);
        C0168o c0168o = new C0168o(this, i, i2, i3, i6, charSequence, this.f2721l);
        ArrayList arrayList = this.f2717f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((C0168o) arrayList.get(size)).d <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, c0168o);
        p(true);
        return c0168o;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f2713a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C0168o a2 = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            a2.setIcon(resolveInfo.loadIcon(packageManager));
            a2.f2745g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = a2;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(InterfaceC0178y interfaceC0178y, Context context) {
        this.f2730u.add(new WeakReference(interfaceC0178y));
        interfaceC0178y.j(context, this);
        this.f2720k = true;
    }

    public final void c(boolean z2) {
        if (this.f2728s) {
            return;
        }
        this.f2728s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2730u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0178y interfaceC0178y = (InterfaceC0178y) weakReference.get();
            if (interfaceC0178y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0178y.b(this, z2);
            }
        }
        this.f2728s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C0168o c0168o = this.f2731v;
        if (c0168o != null) {
            d(c0168o);
        }
        this.f2717f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f2723n = null;
        this.f2722m = null;
        this.f2724o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(C0168o c0168o) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2730u;
        boolean z2 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f2731v == c0168o) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0178y interfaceC0178y = (InterfaceC0178y) weakReference.get();
                if (interfaceC0178y == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 = interfaceC0178y.h(c0168o);
                    if (z2) {
                        break;
                    }
                }
            }
            v();
            if (z2) {
                this.f2731v = null;
            }
        }
        return z2;
    }

    public boolean e(MenuC0166m menuC0166m, MenuItem menuItem) {
        InterfaceC0164k interfaceC0164k = this.f2716e;
        return interfaceC0164k != null && interfaceC0164k.r(menuC0166m, menuItem);
    }

    public boolean f(C0168o c0168o) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2730u;
        boolean z2 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0178y interfaceC0178y = (InterfaceC0178y) weakReference.get();
            if (interfaceC0178y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z2 = interfaceC0178y.d(c0168o);
                if (z2) {
                    break;
                }
            }
        }
        v();
        if (z2) {
            this.f2731v = c0168o;
        }
        return z2;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        ArrayList arrayList = this.f2717f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0168o c0168o = (C0168o) arrayList.get(i2);
            if (c0168o.f2740a == i) {
                return c0168o;
            }
            if (c0168o.hasSubMenu() && (findItem = c0168o.f2751o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final C0168o g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f2729t;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C0168o) arrayList.get(0);
        }
        boolean n2 = n();
        for (int i2 = 0; i2 < size; i2++) {
            C0168o c0168o = (C0168o) arrayList.get(i2);
            char c2 = n2 ? c0168o.f2746j : c0168o.h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (n2 && c2 == '\b' && i == 67))) {
                return c0168o;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f2717f.get(i);
    }

    public final void h(ArrayList arrayList, int i, KeyEvent keyEvent) {
        int i2;
        boolean n2 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList2 = this.f2717f;
            int size = arrayList2.size();
            for (0; i2 < size; i2 + 1) {
                C0168o c0168o = (C0168o) arrayList2.get(i2);
                if (c0168o.hasSubMenu()) {
                    c0168o.f2751o.h(arrayList, i, keyEvent);
                }
                char c2 = n2 ? c0168o.f2746j : c0168o.h;
                if ((modifiers & 69647) == ((n2 ? c0168o.f2747k : c0168o.i) & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if (c2 != cArr[0] && c2 != cArr[2]) {
                        if (n2 && c2 == '\b') {
                            i2 = i != 67 ? i2 + 1 : 0;
                        }
                    }
                    if (c0168o.isEnabled()) {
                        arrayList.add(c0168o);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f2733x) {
            return true;
        }
        ArrayList arrayList = this.f2717f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C0168o) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l2 = l();
        if (this.f2720k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f2730u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0178y interfaceC0178y = (InterfaceC0178y) weakReference.get();
                if (interfaceC0178y == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 |= interfaceC0178y.k();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.f2719j;
            if (z2) {
                arrayList.clear();
                arrayList2.clear();
                int size = l2.size();
                for (int i = 0; i < size; i++) {
                    C0168o c0168o = (C0168o) l2.get(i);
                    if (c0168o.f()) {
                        arrayList.add(c0168o);
                    } else {
                        arrayList2.add(c0168o);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f2720k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public MenuC0166m k() {
        return this;
    }

    public final ArrayList l() {
        boolean z2 = this.h;
        ArrayList arrayList = this.f2718g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f2717f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C0168o c0168o = (C0168o) arrayList2.get(i);
            if (c0168o.isVisible()) {
                arrayList.add(c0168o);
            }
        }
        this.h = false;
        this.f2720k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f2732w;
    }

    public boolean n() {
        return this.f2715c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z2) {
        if (this.f2725p) {
            this.f2726q = true;
            if (z2) {
                this.f2727r = true;
                return;
            }
            return;
        }
        if (z2) {
            this.h = true;
            this.f2720k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2730u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0178y interfaceC0178y = (InterfaceC0178y) weakReference.get();
            if (interfaceC0178y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0178y.c();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return q(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0168o g2 = g(i, keyEvent);
        boolean q2 = g2 != null ? q(g2, null, i2) : false;
        if ((i2 & 2) != 0) {
            c(true);
        }
        return q2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(MenuItem menuItem, InterfaceC0178y interfaceC0178y, int i) {
        boolean z2;
        C0168o c0168o = (C0168o) menuItem;
        if (c0168o == null || !c0168o.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = c0168o.f2752p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(c0168o)) {
            MenuC0166m menuC0166m = c0168o.f2750n;
            if (!menuC0166m.e(menuC0166m, c0168o)) {
                Intent intent = c0168o.f2745g;
                if (intent != null) {
                    try {
                        menuC0166m.f2713a.startActivity(intent);
                    } catch (ActivityNotFoundException e2) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
                    }
                }
                ActionProviderVisibilityListenerC0169p actionProviderVisibilityListenerC0169p = c0168o.f2737A;
                if (actionProviderVisibilityListenerC0169p == null || !actionProviderVisibilityListenerC0169p.f2764b.onPerformDefaultAction()) {
                    z2 = false;
                    ActionProviderVisibilityListenerC0169p actionProviderVisibilityListenerC0169p2 = c0168o.f2737A;
                    boolean z3 = actionProviderVisibilityListenerC0169p2 == null && actionProviderVisibilityListenerC0169p2.f2764b.hasSubMenu();
                    if (!c0168o.e()) {
                        z2 |= c0168o.expandActionView();
                        if (z2) {
                            c(true);
                        }
                    } else if (c0168o.hasSubMenu() || z3) {
                        if ((i & 4) == 0) {
                            c(false);
                        }
                        if (!c0168o.hasSubMenu()) {
                            SubMenuC0153E subMenuC0153E = new SubMenuC0153E(this.f2713a, this, c0168o);
                            c0168o.f2751o = subMenuC0153E;
                            subMenuC0153E.setHeaderTitle(c0168o.f2743e);
                        }
                        SubMenuC0153E subMenuC0153E2 = c0168o.f2751o;
                        if (z3) {
                            actionProviderVisibilityListenerC0169p2.f2765c.getClass();
                            actionProviderVisibilityListenerC0169p2.f2764b.onPrepareSubMenu(subMenuC0153E2);
                        }
                        CopyOnWriteArrayList copyOnWriteArrayList = this.f2730u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            r0 = interfaceC0178y != null ? interfaceC0178y.f(subMenuC0153E2) : false;
                            Iterator it = copyOnWriteArrayList.iterator();
                            while (it.hasNext()) {
                                WeakReference weakReference = (WeakReference) it.next();
                                InterfaceC0178y interfaceC0178y2 = (InterfaceC0178y) weakReference.get();
                                if (interfaceC0178y2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!r0) {
                                    r0 = interfaceC0178y2.f(subMenuC0153E2);
                                }
                            }
                        }
                        z2 |= r0;
                        if (!z2) {
                            c(true);
                        }
                    } else if ((i & 1) == 0) {
                        c(true);
                    }
                    return z2;
                }
            }
        }
        z2 = true;
        ActionProviderVisibilityListenerC0169p actionProviderVisibilityListenerC0169p22 = c0168o.f2737A;
        if (actionProviderVisibilityListenerC0169p22 == null) {
        }
        if (!c0168o.e()) {
        }
        return z2;
    }

    public final void r(InterfaceC0178y interfaceC0178y) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2730u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0178y interfaceC0178y2 = (InterfaceC0178y) weakReference.get();
            if (interfaceC0178y2 == null || interfaceC0178y2 == interfaceC0178y) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f2717f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((C0168o) arrayList.get(i3)).f2741b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((C0168o) arrayList.get(i3)).f2741b != i) {
                    break;
                }
                if (i3 >= 0) {
                    ArrayList arrayList2 = this.f2717f;
                    if (i3 < arrayList2.size()) {
                        arrayList2.remove(i3);
                    }
                }
                i2 = i4;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f2717f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C0168o) arrayList.get(i2)).f2740a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            ArrayList arrayList2 = this.f2717f;
            if (i2 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i2);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f2717f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0153E) item.getSubMenu()).s(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z2, boolean z3) {
        ArrayList arrayList = this.f2717f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0168o c0168o = (C0168o) arrayList.get(i2);
            if (c0168o.f2741b == i) {
                c0168o.f2760x = (c0168o.f2760x & (-5)) | (z3 ? 4 : 0);
                c0168o.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f2732w = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z2) {
        ArrayList arrayList = this.f2717f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0168o c0168o = (C0168o) arrayList.get(i2);
            if (c0168o.f2741b == i) {
                c0168o.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z2) {
        ArrayList arrayList = this.f2717f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0168o c0168o = (C0168o) arrayList.get(i2);
            if (c0168o.f2741b == i) {
                int i3 = c0168o.f2760x;
                int i4 = (i3 & (-9)) | (z2 ? 0 : 8);
                c0168o.f2760x = i4;
                if (i3 != i4) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f2715c = z2;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f2717f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f2717f.size();
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
                ((SubMenuC0153E) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f2724o = view;
            this.f2722m = null;
            this.f2723n = null;
        } else {
            if (i > 0) {
                this.f2722m = this.f2714b.getText(i);
            } else if (charSequence != null) {
                this.f2722m = charSequence;
            }
            if (i2 > 0) {
                this.f2723n = A.a.b(this.f2713a, i2);
            } else if (drawable != null) {
                this.f2723n = drawable;
            }
            this.f2724o = null;
        }
        p(false);
    }

    public final void v() {
        this.f2725p = false;
        if (this.f2726q) {
            this.f2726q = false;
            p(this.f2727r);
        }
    }

    public final void w() {
        if (this.f2725p) {
            return;
        }
        this.f2725p = true;
        this.f2726q = false;
        this.f2727r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.f2714b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f2714b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0168o a2 = a(i, i2, i3, charSequence);
        SubMenuC0153E subMenuC0153E = new SubMenuC0153E(this.f2713a, this, a2);
        a2.f2751o = subMenuC0153E;
        subMenuC0153E.setHeaderTitle(a2.f2743e);
        return subMenuC0153E;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.f2714b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f2714b.getString(i4));
    }
}
