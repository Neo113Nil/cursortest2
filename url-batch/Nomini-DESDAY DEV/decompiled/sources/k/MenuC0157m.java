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
public class MenuC0157m implements Menu {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f2662y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f2663a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f2664b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2665c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0155k f2666e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2667f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2668g;
    public boolean h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f2669j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2670k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f2672m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f2673n;

    /* renamed from: o, reason: collision with root package name */
    public View f2674o;

    /* renamed from: v, reason: collision with root package name */
    public C0159o f2681v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2683x;

    /* renamed from: l, reason: collision with root package name */
    public int f2671l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2675p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2676q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2677r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2678s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f2679t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f2680u = new CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f2682w = false;

    public MenuC0157m(Context context) {
        boolean z2;
        boolean z3 = false;
        this.f2663a = context;
        Resources resources = context.getResources();
        this.f2664b = resources;
        this.f2667f = new ArrayList();
        this.f2668g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.f2669j = new ArrayList();
        this.f2670k = true;
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

    public final C0159o a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (f2662y[i5] << 16) | (65535 & i3);
        C0159o c0159o = new C0159o(this, i, i2, i3, i6, charSequence, this.f2671l);
        ArrayList arrayList = this.f2667f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((C0159o) arrayList.get(size)).d <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, c0159o);
        p(true);
        return c0159o;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f2663a.getPackageManager();
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
            C0159o a2 = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            a2.setIcon(resolveInfo.loadIcon(packageManager));
            a2.f2695g = intent2;
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

    public final void b(InterfaceC0169y interfaceC0169y, Context context) {
        this.f2680u.add(new WeakReference(interfaceC0169y));
        interfaceC0169y.j(context, this);
        this.f2670k = true;
    }

    public final void c(boolean z2) {
        if (this.f2678s) {
            return;
        }
        this.f2678s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2680u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0169y interfaceC0169y = (InterfaceC0169y) weakReference.get();
            if (interfaceC0169y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0169y.b(this, z2);
            }
        }
        this.f2678s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C0159o c0159o = this.f2681v;
        if (c0159o != null) {
            d(c0159o);
        }
        this.f2667f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f2673n = null;
        this.f2672m = null;
        this.f2674o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(C0159o c0159o) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2680u;
        boolean z2 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f2681v == c0159o) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0169y interfaceC0169y = (InterfaceC0169y) weakReference.get();
                if (interfaceC0169y == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 = interfaceC0169y.h(c0159o);
                    if (z2) {
                        break;
                    }
                }
            }
            v();
            if (z2) {
                this.f2681v = null;
            }
        }
        return z2;
    }

    public boolean e(MenuC0157m menuC0157m, MenuItem menuItem) {
        InterfaceC0155k interfaceC0155k = this.f2666e;
        return interfaceC0155k != null && interfaceC0155k.h(menuC0157m, menuItem);
    }

    public boolean f(C0159o c0159o) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2680u;
        boolean z2 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0169y interfaceC0169y = (InterfaceC0169y) weakReference.get();
            if (interfaceC0169y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z2 = interfaceC0169y.d(c0159o);
                if (z2) {
                    break;
                }
            }
        }
        v();
        if (z2) {
            this.f2681v = c0159o;
        }
        return z2;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        ArrayList arrayList = this.f2667f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0159o c0159o = (C0159o) arrayList.get(i2);
            if (c0159o.f2690a == i) {
                return c0159o;
            }
            if (c0159o.hasSubMenu() && (findItem = c0159o.f2701o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final C0159o g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f2679t;
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
            return (C0159o) arrayList.get(0);
        }
        boolean n2 = n();
        for (int i2 = 0; i2 < size; i2++) {
            C0159o c0159o = (C0159o) arrayList.get(i2);
            char c2 = n2 ? c0159o.f2696j : c0159o.h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (n2 && c2 == '\b' && i == 67))) {
                return c0159o;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f2667f.get(i);
    }

    public final void h(ArrayList arrayList, int i, KeyEvent keyEvent) {
        int i2;
        boolean n2 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList2 = this.f2667f;
            int size = arrayList2.size();
            for (0; i2 < size; i2 + 1) {
                C0159o c0159o = (C0159o) arrayList2.get(i2);
                if (c0159o.hasSubMenu()) {
                    c0159o.f2701o.h(arrayList, i, keyEvent);
                }
                char c2 = n2 ? c0159o.f2696j : c0159o.h;
                if ((modifiers & 69647) == ((n2 ? c0159o.f2697k : c0159o.i) & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if (c2 != cArr[0] && c2 != cArr[2]) {
                        if (n2 && c2 == '\b') {
                            i2 = i != 67 ? i2 + 1 : 0;
                        }
                    }
                    if (c0159o.isEnabled()) {
                        arrayList.add(c0159o);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f2683x) {
            return true;
        }
        ArrayList arrayList = this.f2667f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C0159o) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l2 = l();
        if (this.f2670k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f2680u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0169y interfaceC0169y = (InterfaceC0169y) weakReference.get();
                if (interfaceC0169y == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 |= interfaceC0169y.k();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.f2669j;
            if (z2) {
                arrayList.clear();
                arrayList2.clear();
                int size = l2.size();
                for (int i = 0; i < size; i++) {
                    C0159o c0159o = (C0159o) l2.get(i);
                    if (c0159o.f()) {
                        arrayList.add(c0159o);
                    } else {
                        arrayList2.add(c0159o);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f2670k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public MenuC0157m k() {
        return this;
    }

    public final ArrayList l() {
        boolean z2 = this.h;
        ArrayList arrayList = this.f2668g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f2667f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C0159o c0159o = (C0159o) arrayList2.get(i);
            if (c0159o.isVisible()) {
                arrayList.add(c0159o);
            }
        }
        this.h = false;
        this.f2670k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f2682w;
    }

    public boolean n() {
        return this.f2665c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z2) {
        if (this.f2675p) {
            this.f2676q = true;
            if (z2) {
                this.f2677r = true;
                return;
            }
            return;
        }
        if (z2) {
            this.h = true;
            this.f2670k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2680u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0169y interfaceC0169y = (InterfaceC0169y) weakReference.get();
            if (interfaceC0169y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0169y.c();
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
        C0159o g2 = g(i, keyEvent);
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
    public final boolean q(MenuItem menuItem, InterfaceC0169y interfaceC0169y, int i) {
        boolean z2;
        C0159o c0159o = (C0159o) menuItem;
        if (c0159o == null || !c0159o.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = c0159o.f2702p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(c0159o)) {
            MenuC0157m menuC0157m = c0159o.f2700n;
            if (!menuC0157m.e(menuC0157m, c0159o)) {
                Intent intent = c0159o.f2695g;
                if (intent != null) {
                    try {
                        menuC0157m.f2663a.startActivity(intent);
                    } catch (ActivityNotFoundException e2) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
                    }
                }
                ActionProviderVisibilityListenerC0160p actionProviderVisibilityListenerC0160p = c0159o.f2687A;
                if (actionProviderVisibilityListenerC0160p == null || !actionProviderVisibilityListenerC0160p.f2714b.onPerformDefaultAction()) {
                    z2 = false;
                    ActionProviderVisibilityListenerC0160p actionProviderVisibilityListenerC0160p2 = c0159o.f2687A;
                    boolean z3 = actionProviderVisibilityListenerC0160p2 == null && actionProviderVisibilityListenerC0160p2.f2714b.hasSubMenu();
                    if (!c0159o.e()) {
                        z2 |= c0159o.expandActionView();
                        if (z2) {
                            c(true);
                        }
                    } else if (c0159o.hasSubMenu() || z3) {
                        if ((i & 4) == 0) {
                            c(false);
                        }
                        if (!c0159o.hasSubMenu()) {
                            SubMenuC0144E subMenuC0144E = new SubMenuC0144E(this.f2663a, this, c0159o);
                            c0159o.f2701o = subMenuC0144E;
                            subMenuC0144E.setHeaderTitle(c0159o.f2693e);
                        }
                        SubMenuC0144E subMenuC0144E2 = c0159o.f2701o;
                        if (z3) {
                            actionProviderVisibilityListenerC0160p2.f2715c.getClass();
                            actionProviderVisibilityListenerC0160p2.f2714b.onPrepareSubMenu(subMenuC0144E2);
                        }
                        CopyOnWriteArrayList copyOnWriteArrayList = this.f2680u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            r0 = interfaceC0169y != null ? interfaceC0169y.e(subMenuC0144E2) : false;
                            Iterator it = copyOnWriteArrayList.iterator();
                            while (it.hasNext()) {
                                WeakReference weakReference = (WeakReference) it.next();
                                InterfaceC0169y interfaceC0169y2 = (InterfaceC0169y) weakReference.get();
                                if (interfaceC0169y2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!r0) {
                                    r0 = interfaceC0169y2.e(subMenuC0144E2);
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
        ActionProviderVisibilityListenerC0160p actionProviderVisibilityListenerC0160p22 = c0159o.f2687A;
        if (actionProviderVisibilityListenerC0160p22 == null) {
        }
        if (!c0159o.e()) {
        }
        return z2;
    }

    public final void r(InterfaceC0169y interfaceC0169y) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2680u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0169y interfaceC0169y2 = (InterfaceC0169y) weakReference.get();
            if (interfaceC0169y2 == null || interfaceC0169y2 == interfaceC0169y) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f2667f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((C0159o) arrayList.get(i3)).f2691b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((C0159o) arrayList.get(i3)).f2691b != i) {
                    break;
                }
                if (i3 >= 0) {
                    ArrayList arrayList2 = this.f2667f;
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
        ArrayList arrayList = this.f2667f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C0159o) arrayList.get(i2)).f2690a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            ArrayList arrayList2 = this.f2667f;
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
        int size = this.f2667f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0144E) item.getSubMenu()).s(bundle);
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
        ArrayList arrayList = this.f2667f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0159o c0159o = (C0159o) arrayList.get(i2);
            if (c0159o.f2691b == i) {
                c0159o.f2710x = (c0159o.f2710x & (-5)) | (z3 ? 4 : 0);
                c0159o.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f2682w = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z2) {
        ArrayList arrayList = this.f2667f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0159o c0159o = (C0159o) arrayList.get(i2);
            if (c0159o.f2691b == i) {
                c0159o.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z2) {
        ArrayList arrayList = this.f2667f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0159o c0159o = (C0159o) arrayList.get(i2);
            if (c0159o.f2691b == i) {
                int i3 = c0159o.f2710x;
                int i4 = (i3 & (-9)) | (z2 ? 0 : 8);
                c0159o.f2710x = i4;
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
        this.f2665c = z2;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f2667f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f2667f.size();
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
                ((SubMenuC0144E) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f2674o = view;
            this.f2672m = null;
            this.f2673n = null;
        } else {
            if (i > 0) {
                this.f2672m = this.f2664b.getText(i);
            } else if (charSequence != null) {
                this.f2672m = charSequence;
            }
            if (i2 > 0) {
                this.f2673n = A.a.b(this.f2663a, i2);
            } else if (drawable != null) {
                this.f2673n = drawable;
            }
            this.f2674o = null;
        }
        p(false);
    }

    public final void v() {
        this.f2675p = false;
        if (this.f2676q) {
            this.f2676q = false;
            p(this.f2677r);
        }
    }

    public final void w() {
        if (this.f2675p) {
            return;
        }
        this.f2675p = true;
        this.f2676q = false;
        this.f2677r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.f2664b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f2664b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0159o a2 = a(i, i2, i3, charSequence);
        SubMenuC0144E subMenuC0144E = new SubMenuC0144E(this.f2663a, this, a2);
        a2.f2701o = subMenuC0144E;
        subMenuC0144E.setHeaderTitle(a2.f2693e);
        return subMenuC0144E;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.f2664b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f2664b.getString(i4));
    }
}
