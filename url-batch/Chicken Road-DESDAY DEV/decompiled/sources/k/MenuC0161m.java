package k;

import K.U;
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
public class MenuC0161m implements Menu {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f2611y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f2612a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f2613b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2614c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0159k f2615e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2616f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2617g;
    public boolean h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f2618j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2619k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f2621m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f2622n;

    /* renamed from: o, reason: collision with root package name */
    public View f2623o;

    /* renamed from: v, reason: collision with root package name */
    public C0163o f2630v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2632x;

    /* renamed from: l, reason: collision with root package name */
    public int f2620l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2624p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2625q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2626r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2627s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f2628t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f2629u = new CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f2631w = false;

    public MenuC0161m(Context context) {
        boolean z2;
        boolean z3 = false;
        this.f2612a = context;
        Resources resources = context.getResources();
        this.f2613b = resources;
        this.f2616f = new ArrayList();
        this.f2617g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.f2618j = new ArrayList();
        this.f2619k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                z2 = U.b(viewConfiguration);
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

    public final C0163o a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (f2611y[i5] << 16) | (65535 & i3);
        C0163o c0163o = new C0163o(this, i, i2, i3, i6, charSequence, this.f2620l);
        ArrayList arrayList = this.f2616f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((C0163o) arrayList.get(size)).d <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, c0163o);
        p(true);
        return c0163o;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f2612a.getPackageManager();
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
            C0163o a2 = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            a2.setIcon(resolveInfo.loadIcon(packageManager));
            a2.f2644g = intent2;
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

    public final void b(InterfaceC0173y interfaceC0173y, Context context) {
        this.f2629u.add(new WeakReference(interfaceC0173y));
        interfaceC0173y.j(context, this);
        this.f2619k = true;
    }

    public final void c(boolean z2) {
        if (this.f2627s) {
            return;
        }
        this.f2627s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2629u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0173y interfaceC0173y = (InterfaceC0173y) weakReference.get();
            if (interfaceC0173y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0173y.b(this, z2);
            }
        }
        this.f2627s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C0163o c0163o = this.f2630v;
        if (c0163o != null) {
            d(c0163o);
        }
        this.f2616f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f2622n = null;
        this.f2621m = null;
        this.f2623o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(C0163o c0163o) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2629u;
        boolean z2 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f2630v == c0163o) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0173y interfaceC0173y = (InterfaceC0173y) weakReference.get();
                if (interfaceC0173y == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 = interfaceC0173y.h(c0163o);
                    if (z2) {
                        break;
                    }
                }
            }
            v();
            if (z2) {
                this.f2630v = null;
            }
        }
        return z2;
    }

    public boolean e(MenuC0161m menuC0161m, MenuItem menuItem) {
        InterfaceC0159k interfaceC0159k = this.f2615e;
        return interfaceC0159k != null && interfaceC0159k.q(menuC0161m, menuItem);
    }

    public boolean f(C0163o c0163o) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2629u;
        boolean z2 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0173y interfaceC0173y = (InterfaceC0173y) weakReference.get();
            if (interfaceC0173y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z2 = interfaceC0173y.d(c0163o);
                if (z2) {
                    break;
                }
            }
        }
        v();
        if (z2) {
            this.f2630v = c0163o;
        }
        return z2;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        ArrayList arrayList = this.f2616f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0163o c0163o = (C0163o) arrayList.get(i2);
            if (c0163o.f2639a == i) {
                return c0163o;
            }
            if (c0163o.hasSubMenu() && (findItem = c0163o.f2650o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final C0163o g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f2628t;
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
            return (C0163o) arrayList.get(0);
        }
        boolean n2 = n();
        for (int i2 = 0; i2 < size; i2++) {
            C0163o c0163o = (C0163o) arrayList.get(i2);
            char c2 = n2 ? c0163o.f2645j : c0163o.h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (n2 && c2 == '\b' && i == 67))) {
                return c0163o;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f2616f.get(i);
    }

    public final void h(ArrayList arrayList, int i, KeyEvent keyEvent) {
        int i2;
        boolean n2 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList2 = this.f2616f;
            int size = arrayList2.size();
            for (0; i2 < size; i2 + 1) {
                C0163o c0163o = (C0163o) arrayList2.get(i2);
                if (c0163o.hasSubMenu()) {
                    c0163o.f2650o.h(arrayList, i, keyEvent);
                }
                char c2 = n2 ? c0163o.f2645j : c0163o.h;
                if ((modifiers & 69647) == ((n2 ? c0163o.f2646k : c0163o.i) & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if (c2 != cArr[0] && c2 != cArr[2]) {
                        if (n2 && c2 == '\b') {
                            i2 = i != 67 ? i2 + 1 : 0;
                        }
                    }
                    if (c0163o.isEnabled()) {
                        arrayList.add(c0163o);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f2632x) {
            return true;
        }
        ArrayList arrayList = this.f2616f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C0163o) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l2 = l();
        if (this.f2619k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f2629u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0173y interfaceC0173y = (InterfaceC0173y) weakReference.get();
                if (interfaceC0173y == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 |= interfaceC0173y.k();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.f2618j;
            if (z2) {
                arrayList.clear();
                arrayList2.clear();
                int size = l2.size();
                for (int i = 0; i < size; i++) {
                    C0163o c0163o = (C0163o) l2.get(i);
                    if (c0163o.f()) {
                        arrayList.add(c0163o);
                    } else {
                        arrayList2.add(c0163o);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f2619k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public MenuC0161m k() {
        return this;
    }

    public final ArrayList l() {
        boolean z2 = this.h;
        ArrayList arrayList = this.f2617g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f2616f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C0163o c0163o = (C0163o) arrayList2.get(i);
            if (c0163o.isVisible()) {
                arrayList.add(c0163o);
            }
        }
        this.h = false;
        this.f2619k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f2631w;
    }

    public boolean n() {
        return this.f2614c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z2) {
        if (this.f2624p) {
            this.f2625q = true;
            if (z2) {
                this.f2626r = true;
                return;
            }
            return;
        }
        if (z2) {
            this.h = true;
            this.f2619k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2629u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0173y interfaceC0173y = (InterfaceC0173y) weakReference.get();
            if (interfaceC0173y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0173y.c();
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
        C0163o g2 = g(i, keyEvent);
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
    public final boolean q(MenuItem menuItem, InterfaceC0173y interfaceC0173y, int i) {
        boolean z2;
        C0163o c0163o = (C0163o) menuItem;
        if (c0163o == null || !c0163o.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = c0163o.f2651p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(c0163o)) {
            MenuC0161m menuC0161m = c0163o.f2649n;
            if (!menuC0161m.e(menuC0161m, c0163o)) {
                Intent intent = c0163o.f2644g;
                if (intent != null) {
                    try {
                        menuC0161m.f2612a.startActivity(intent);
                    } catch (ActivityNotFoundException e2) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
                    }
                }
                ActionProviderVisibilityListenerC0164p actionProviderVisibilityListenerC0164p = c0163o.f2636A;
                if (actionProviderVisibilityListenerC0164p == null || !actionProviderVisibilityListenerC0164p.f2663b.onPerformDefaultAction()) {
                    z2 = false;
                    ActionProviderVisibilityListenerC0164p actionProviderVisibilityListenerC0164p2 = c0163o.f2636A;
                    boolean z3 = actionProviderVisibilityListenerC0164p2 == null && actionProviderVisibilityListenerC0164p2.f2663b.hasSubMenu();
                    if (!c0163o.e()) {
                        z2 |= c0163o.expandActionView();
                        if (z2) {
                            c(true);
                        }
                    } else if (c0163o.hasSubMenu() || z3) {
                        if ((i & 4) == 0) {
                            c(false);
                        }
                        if (!c0163o.hasSubMenu()) {
                            SubMenuC0148E subMenuC0148E = new SubMenuC0148E(this.f2612a, this, c0163o);
                            c0163o.f2650o = subMenuC0148E;
                            subMenuC0148E.setHeaderTitle(c0163o.f2642e);
                        }
                        SubMenuC0148E subMenuC0148E2 = c0163o.f2650o;
                        if (z3) {
                            actionProviderVisibilityListenerC0164p2.f2664c.getClass();
                            actionProviderVisibilityListenerC0164p2.f2663b.onPrepareSubMenu(subMenuC0148E2);
                        }
                        CopyOnWriteArrayList copyOnWriteArrayList = this.f2629u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            r0 = interfaceC0173y != null ? interfaceC0173y.e(subMenuC0148E2) : false;
                            Iterator it = copyOnWriteArrayList.iterator();
                            while (it.hasNext()) {
                                WeakReference weakReference = (WeakReference) it.next();
                                InterfaceC0173y interfaceC0173y2 = (InterfaceC0173y) weakReference.get();
                                if (interfaceC0173y2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!r0) {
                                    r0 = interfaceC0173y2.e(subMenuC0148E2);
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
        ActionProviderVisibilityListenerC0164p actionProviderVisibilityListenerC0164p22 = c0163o.f2636A;
        if (actionProviderVisibilityListenerC0164p22 == null) {
        }
        if (!c0163o.e()) {
        }
        return z2;
    }

    public final void r(InterfaceC0173y interfaceC0173y) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2629u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0173y interfaceC0173y2 = (InterfaceC0173y) weakReference.get();
            if (interfaceC0173y2 == null || interfaceC0173y2 == interfaceC0173y) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f2616f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((C0163o) arrayList.get(i3)).f2640b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((C0163o) arrayList.get(i3)).f2640b != i) {
                    break;
                }
                if (i3 >= 0) {
                    ArrayList arrayList2 = this.f2616f;
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
        ArrayList arrayList = this.f2616f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C0163o) arrayList.get(i2)).f2639a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            ArrayList arrayList2 = this.f2616f;
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
        int size = this.f2616f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0148E) item.getSubMenu()).s(bundle);
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
        ArrayList arrayList = this.f2616f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0163o c0163o = (C0163o) arrayList.get(i2);
            if (c0163o.f2640b == i) {
                c0163o.f2659x = (c0163o.f2659x & (-5)) | (z3 ? 4 : 0);
                c0163o.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f2631w = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z2) {
        ArrayList arrayList = this.f2616f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0163o c0163o = (C0163o) arrayList.get(i2);
            if (c0163o.f2640b == i) {
                c0163o.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z2) {
        ArrayList arrayList = this.f2616f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0163o c0163o = (C0163o) arrayList.get(i2);
            if (c0163o.f2640b == i) {
                int i3 = c0163o.f2659x;
                int i4 = (i3 & (-9)) | (z2 ? 0 : 8);
                c0163o.f2659x = i4;
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
        this.f2614c = z2;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f2616f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f2616f.size();
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
                ((SubMenuC0148E) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f2623o = view;
            this.f2621m = null;
            this.f2622n = null;
        } else {
            if (i > 0) {
                this.f2621m = this.f2613b.getText(i);
            } else if (charSequence != null) {
                this.f2621m = charSequence;
            }
            if (i2 > 0) {
                this.f2622n = A.a.b(this.f2612a, i2);
            } else if (drawable != null) {
                this.f2622n = drawable;
            }
            this.f2623o = null;
        }
        p(false);
    }

    public final void v() {
        this.f2624p = false;
        if (this.f2625q) {
            this.f2625q = false;
            p(this.f2626r);
        }
    }

    public final void w() {
        if (this.f2624p) {
            return;
        }
        this.f2624p = true;
        this.f2625q = false;
        this.f2626r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.f2613b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f2613b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0163o a2 = a(i, i2, i3, charSequence);
        SubMenuC0148E subMenuC0148E = new SubMenuC0148E(this.f2612a, this, a2);
        a2.f2650o = subMenuC0148E;
        subMenuC0148E.setHeaderTitle(a2.f2642e);
        return subMenuC0148E;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.f2613b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f2613b.getString(i4));
    }
}
