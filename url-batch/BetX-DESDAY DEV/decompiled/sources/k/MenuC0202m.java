package k;

import K.Z;
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
public class MenuC0202m implements Menu {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f3060y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f3061a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f3062b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3063c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3064d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0200k f3065e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3066f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3067g;
    public boolean h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f3068j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3069k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f3071m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f3072n;

    /* renamed from: o, reason: collision with root package name */
    public View f3073o;

    /* renamed from: v, reason: collision with root package name */
    public C0204o f3080v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3082x;

    /* renamed from: l, reason: collision with root package name */
    public int f3070l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3074p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3075q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3076r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3077s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f3078t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f3079u = new CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f3081w = false;

    public MenuC0202m(Context context) {
        boolean z2;
        boolean z3 = false;
        this.f3061a = context;
        Resources resources = context.getResources();
        this.f3062b = resources;
        this.f3066f = new ArrayList();
        this.f3067g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.f3068j = new ArrayList();
        this.f3069k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                z2 = Z.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z2 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z2) {
                z3 = true;
            }
        }
        this.f3064d = z3;
    }

    public final C0204o a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (f3060y[i5] << 16) | (65535 & i3);
        C0204o c0204o = new C0204o(this, i, i2, i3, i6, charSequence, this.f3070l);
        ArrayList arrayList = this.f3066f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((C0204o) arrayList.get(size)).f3092d <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, c0204o);
        p(true);
        return c0204o;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f3061a.getPackageManager();
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
            C0204o a2 = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            a2.setIcon(resolveInfo.loadIcon(packageManager));
            a2.f3095g = intent2;
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

    public final void b(InterfaceC0214y interfaceC0214y, Context context) {
        this.f3079u.add(new WeakReference(interfaceC0214y));
        interfaceC0214y.j(context, this);
        this.f3069k = true;
    }

    public final void c(boolean z2) {
        if (this.f3077s) {
            return;
        }
        this.f3077s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3079u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0214y interfaceC0214y = (InterfaceC0214y) weakReference.get();
            if (interfaceC0214y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0214y.b(this, z2);
            }
        }
        this.f3077s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C0204o c0204o = this.f3080v;
        if (c0204o != null) {
            d(c0204o);
        }
        this.f3066f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f3072n = null;
        this.f3071m = null;
        this.f3073o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(C0204o c0204o) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3079u;
        boolean z2 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f3080v == c0204o) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0214y interfaceC0214y = (InterfaceC0214y) weakReference.get();
                if (interfaceC0214y == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 = interfaceC0214y.h(c0204o);
                    if (z2) {
                        break;
                    }
                }
            }
            v();
            if (z2) {
                this.f3080v = null;
            }
        }
        return z2;
    }

    public boolean e(MenuC0202m menuC0202m, MenuItem menuItem) {
        InterfaceC0200k interfaceC0200k = this.f3065e;
        return interfaceC0200k != null && interfaceC0200k.r(menuC0202m, menuItem);
    }

    public boolean f(C0204o c0204o) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3079u;
        boolean z2 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0214y interfaceC0214y = (InterfaceC0214y) weakReference.get();
            if (interfaceC0214y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z2 = interfaceC0214y.d(c0204o);
                if (z2) {
                    break;
                }
            }
        }
        v();
        if (z2) {
            this.f3080v = c0204o;
        }
        return z2;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        ArrayList arrayList = this.f3066f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0204o c0204o = (C0204o) arrayList.get(i2);
            if (c0204o.f3089a == i) {
                return c0204o;
            }
            if (c0204o.hasSubMenu() && (findItem = c0204o.f3101o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final C0204o g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f3078t;
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
            return (C0204o) arrayList.get(0);
        }
        boolean n2 = n();
        for (int i2 = 0; i2 < size; i2++) {
            C0204o c0204o = (C0204o) arrayList.get(i2);
            char c2 = n2 ? c0204o.f3096j : c0204o.h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (n2 && c2 == '\b' && i == 67))) {
                return c0204o;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f3066f.get(i);
    }

    public final void h(ArrayList arrayList, int i, KeyEvent keyEvent) {
        int i2;
        boolean n2 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList2 = this.f3066f;
            int size = arrayList2.size();
            for (0; i2 < size; i2 + 1) {
                C0204o c0204o = (C0204o) arrayList2.get(i2);
                if (c0204o.hasSubMenu()) {
                    c0204o.f3101o.h(arrayList, i, keyEvent);
                }
                char c2 = n2 ? c0204o.f3096j : c0204o.h;
                if ((modifiers & 69647) == ((n2 ? c0204o.f3097k : c0204o.i) & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if (c2 != cArr[0] && c2 != cArr[2]) {
                        if (n2 && c2 == '\b') {
                            i2 = i != 67 ? i2 + 1 : 0;
                        }
                    }
                    if (c0204o.isEnabled()) {
                        arrayList.add(c0204o);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f3082x) {
            return true;
        }
        ArrayList arrayList = this.f3066f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C0204o) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l2 = l();
        if (this.f3069k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f3079u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0214y interfaceC0214y = (InterfaceC0214y) weakReference.get();
                if (interfaceC0214y == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 |= interfaceC0214y.k();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.f3068j;
            if (z2) {
                arrayList.clear();
                arrayList2.clear();
                int size = l2.size();
                for (int i = 0; i < size; i++) {
                    C0204o c0204o = (C0204o) l2.get(i);
                    if (c0204o.f()) {
                        arrayList.add(c0204o);
                    } else {
                        arrayList2.add(c0204o);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f3069k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public MenuC0202m k() {
        return this;
    }

    public final ArrayList l() {
        boolean z2 = this.h;
        ArrayList arrayList = this.f3067g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f3066f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C0204o c0204o = (C0204o) arrayList2.get(i);
            if (c0204o.isVisible()) {
                arrayList.add(c0204o);
            }
        }
        this.h = false;
        this.f3069k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f3081w;
    }

    public boolean n() {
        return this.f3063c;
    }

    public boolean o() {
        return this.f3064d;
    }

    public final void p(boolean z2) {
        if (this.f3074p) {
            this.f3075q = true;
            if (z2) {
                this.f3076r = true;
                return;
            }
            return;
        }
        if (z2) {
            this.h = true;
            this.f3069k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3079u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0214y interfaceC0214y = (InterfaceC0214y) weakReference.get();
            if (interfaceC0214y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0214y.c();
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
        C0204o g2 = g(i, keyEvent);
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
    public final boolean q(MenuItem menuItem, InterfaceC0214y interfaceC0214y, int i) {
        boolean z2;
        C0204o c0204o = (C0204o) menuItem;
        if (c0204o == null || !c0204o.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = c0204o.f3102p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(c0204o)) {
            MenuC0202m menuC0202m = c0204o.f3100n;
            if (!menuC0202m.e(menuC0202m, c0204o)) {
                Intent intent = c0204o.f3095g;
                if (intent != null) {
                    try {
                        menuC0202m.f3061a.startActivity(intent);
                    } catch (ActivityNotFoundException e2) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
                    }
                }
                ActionProviderVisibilityListenerC0205p actionProviderVisibilityListenerC0205p = c0204o.f3086A;
                if (actionProviderVisibilityListenerC0205p == null || !actionProviderVisibilityListenerC0205p.f3114b.onPerformDefaultAction()) {
                    z2 = false;
                    ActionProviderVisibilityListenerC0205p actionProviderVisibilityListenerC0205p2 = c0204o.f3086A;
                    boolean z3 = actionProviderVisibilityListenerC0205p2 == null && actionProviderVisibilityListenerC0205p2.f3114b.hasSubMenu();
                    if (!c0204o.e()) {
                        z2 |= c0204o.expandActionView();
                        if (z2) {
                            c(true);
                        }
                    } else if (c0204o.hasSubMenu() || z3) {
                        if ((i & 4) == 0) {
                            c(false);
                        }
                        if (!c0204o.hasSubMenu()) {
                            SubMenuC0189E subMenuC0189E = new SubMenuC0189E(this.f3061a, this, c0204o);
                            c0204o.f3101o = subMenuC0189E;
                            subMenuC0189E.setHeaderTitle(c0204o.f3093e);
                        }
                        SubMenuC0189E subMenuC0189E2 = c0204o.f3101o;
                        if (z3) {
                            actionProviderVisibilityListenerC0205p2.f3115c.getClass();
                            actionProviderVisibilityListenerC0205p2.f3114b.onPrepareSubMenu(subMenuC0189E2);
                        }
                        CopyOnWriteArrayList copyOnWriteArrayList = this.f3079u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            r0 = interfaceC0214y != null ? interfaceC0214y.f(subMenuC0189E2) : false;
                            Iterator it = copyOnWriteArrayList.iterator();
                            while (it.hasNext()) {
                                WeakReference weakReference = (WeakReference) it.next();
                                InterfaceC0214y interfaceC0214y2 = (InterfaceC0214y) weakReference.get();
                                if (interfaceC0214y2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!r0) {
                                    r0 = interfaceC0214y2.f(subMenuC0189E2);
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
        ActionProviderVisibilityListenerC0205p actionProviderVisibilityListenerC0205p22 = c0204o.f3086A;
        if (actionProviderVisibilityListenerC0205p22 == null) {
        }
        if (!c0204o.e()) {
        }
        return z2;
    }

    public final void r(InterfaceC0214y interfaceC0214y) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3079u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0214y interfaceC0214y2 = (InterfaceC0214y) weakReference.get();
            if (interfaceC0214y2 == null || interfaceC0214y2 == interfaceC0214y) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f3066f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((C0204o) arrayList.get(i3)).f3090b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((C0204o) arrayList.get(i3)).f3090b != i) {
                    break;
                }
                if (i3 >= 0) {
                    ArrayList arrayList2 = this.f3066f;
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
        ArrayList arrayList = this.f3066f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C0204o) arrayList.get(i2)).f3089a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            ArrayList arrayList2 = this.f3066f;
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
        int size = this.f3066f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0189E) item.getSubMenu()).s(bundle);
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
        ArrayList arrayList = this.f3066f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0204o c0204o = (C0204o) arrayList.get(i2);
            if (c0204o.f3090b == i) {
                c0204o.f3110x = (c0204o.f3110x & (-5)) | (z3 ? 4 : 0);
                c0204o.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f3081w = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z2) {
        ArrayList arrayList = this.f3066f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0204o c0204o = (C0204o) arrayList.get(i2);
            if (c0204o.f3090b == i) {
                c0204o.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z2) {
        ArrayList arrayList = this.f3066f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0204o c0204o = (C0204o) arrayList.get(i2);
            if (c0204o.f3090b == i) {
                int i3 = c0204o.f3110x;
                int i4 = (i3 & (-9)) | (z2 ? 0 : 8);
                c0204o.f3110x = i4;
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
        this.f3063c = z2;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f3066f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f3066f.size();
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
                ((SubMenuC0189E) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f3073o = view;
            this.f3071m = null;
            this.f3072n = null;
        } else {
            if (i > 0) {
                this.f3071m = this.f3062b.getText(i);
            } else if (charSequence != null) {
                this.f3071m = charSequence;
            }
            if (i2 > 0) {
                this.f3072n = A.a.b(this.f3061a, i2);
            } else if (drawable != null) {
                this.f3072n = drawable;
            }
            this.f3073o = null;
        }
        p(false);
    }

    public final void v() {
        this.f3074p = false;
        if (this.f3075q) {
            this.f3075q = false;
            p(this.f3076r);
        }
    }

    public final void w() {
        if (this.f3074p) {
            return;
        }
        this.f3074p = true;
        this.f3075q = false;
        this.f3076r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.f3062b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f3062b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0204o a2 = a(i, i2, i3, charSequence);
        SubMenuC0189E subMenuC0189E = new SubMenuC0189E(this.f3061a, this, a2);
        a2.f3101o = subMenuC0189E;
        subMenuC0189E.setHeaderTitle(a2.f3093e);
        return subMenuC0189E;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.f3062b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f3062b.getString(i4));
    }
}
