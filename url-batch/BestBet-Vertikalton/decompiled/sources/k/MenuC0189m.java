package k;

import K.T;
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
public class MenuC0189m implements Menu {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f3162y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f3163a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f3164b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3165c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0187k f3166e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3167f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3168g;
    public boolean h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f3169j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3170k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f3172m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f3173n;

    /* renamed from: o, reason: collision with root package name */
    public View f3174o;

    /* renamed from: v, reason: collision with root package name */
    public C0192p f3181v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3183x;

    /* renamed from: l, reason: collision with root package name */
    public int f3171l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3175p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3176q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3177r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3178s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f3179t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f3180u = new CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f3182w = false;

    public MenuC0189m(Context context) {
        boolean z2;
        boolean z3 = false;
        this.f3163a = context;
        Resources resources = context.getResources();
        this.f3164b = resources;
        this.f3167f = new ArrayList();
        this.f3168g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.f3169j = new ArrayList();
        this.f3170k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                z2 = T.b(viewConfiguration);
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

    public final C0192p a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (f3162y[i5] << 16) | (65535 & i3);
        C0192p c0192p = new C0192p(this, i, i2, i3, i6, charSequence, this.f3171l);
        ArrayList arrayList = this.f3167f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((C0192p) arrayList.get(size)).d <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, c0192p);
        p(true);
        return c0192p;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f3163a.getPackageManager();
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
            C0192p a2 = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            a2.setIcon(resolveInfo.loadIcon(packageManager));
            a2.f3196g = intent2;
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

    public final void b(InterfaceC0202z interfaceC0202z, Context context) {
        this.f3180u.add(new WeakReference(interfaceC0202z));
        interfaceC0202z.j(context, this);
        this.f3170k = true;
    }

    public final void c(boolean z2) {
        if (this.f3178s) {
            return;
        }
        this.f3178s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3180u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0202z interfaceC0202z = (InterfaceC0202z) weakReference.get();
            if (interfaceC0202z == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0202z.b(this, z2);
            }
        }
        this.f3178s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C0192p c0192p = this.f3181v;
        if (c0192p != null) {
            d(c0192p);
        }
        this.f3167f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f3173n = null;
        this.f3172m = null;
        this.f3174o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(C0192p c0192p) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3180u;
        boolean z2 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f3181v == c0192p) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0202z interfaceC0202z = (InterfaceC0202z) weakReference.get();
                if (interfaceC0202z == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 = interfaceC0202z.h(c0192p);
                    if (z2) {
                        break;
                    }
                }
            }
            v();
            if (z2) {
                this.f3181v = null;
            }
        }
        return z2;
    }

    public boolean e(MenuC0189m menuC0189m, MenuItem menuItem) {
        InterfaceC0187k interfaceC0187k = this.f3166e;
        return interfaceC0187k != null && interfaceC0187k.g(menuC0189m, menuItem);
    }

    public boolean f(C0192p c0192p) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3180u;
        boolean z2 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0202z interfaceC0202z = (InterfaceC0202z) weakReference.get();
            if (interfaceC0202z == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z2 = interfaceC0202z.d(c0192p);
                if (z2) {
                    break;
                }
            }
        }
        v();
        if (z2) {
            this.f3181v = c0192p;
        }
        return z2;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        ArrayList arrayList = this.f3167f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0192p c0192p = (C0192p) arrayList.get(i2);
            if (c0192p.f3191a == i) {
                return c0192p;
            }
            if (c0192p.hasSubMenu() && (findItem = c0192p.f3202o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final C0192p g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f3179t;
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
            return (C0192p) arrayList.get(0);
        }
        boolean n2 = n();
        for (int i2 = 0; i2 < size; i2++) {
            C0192p c0192p = (C0192p) arrayList.get(i2);
            char c2 = n2 ? c0192p.f3197j : c0192p.h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (n2 && c2 == '\b' && i == 67))) {
                return c0192p;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f3167f.get(i);
    }

    public final void h(ArrayList arrayList, int i, KeyEvent keyEvent) {
        int i2;
        boolean n2 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList2 = this.f3167f;
            int size = arrayList2.size();
            for (0; i2 < size; i2 + 1) {
                C0192p c0192p = (C0192p) arrayList2.get(i2);
                if (c0192p.hasSubMenu()) {
                    c0192p.f3202o.h(arrayList, i, keyEvent);
                }
                char c2 = n2 ? c0192p.f3197j : c0192p.h;
                if ((modifiers & 69647) == ((n2 ? c0192p.f3198k : c0192p.i) & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if (c2 != cArr[0] && c2 != cArr[2]) {
                        if (n2 && c2 == '\b') {
                            i2 = i != 67 ? i2 + 1 : 0;
                        }
                    }
                    if (c0192p.isEnabled()) {
                        arrayList.add(c0192p);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f3183x) {
            return true;
        }
        ArrayList arrayList = this.f3167f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C0192p) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l2 = l();
        if (this.f3170k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f3180u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0202z interfaceC0202z = (InterfaceC0202z) weakReference.get();
                if (interfaceC0202z == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 |= interfaceC0202z.k();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.f3169j;
            if (z2) {
                arrayList.clear();
                arrayList2.clear();
                int size = l2.size();
                for (int i = 0; i < size; i++) {
                    C0192p c0192p = (C0192p) l2.get(i);
                    if (c0192p.f()) {
                        arrayList.add(c0192p);
                    } else {
                        arrayList2.add(c0192p);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f3170k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public MenuC0189m k() {
        return this;
    }

    public final ArrayList l() {
        boolean z2 = this.h;
        ArrayList arrayList = this.f3168g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f3167f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C0192p c0192p = (C0192p) arrayList2.get(i);
            if (c0192p.isVisible()) {
                arrayList.add(c0192p);
            }
        }
        this.h = false;
        this.f3170k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f3182w;
    }

    public boolean n() {
        return this.f3165c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z2) {
        if (this.f3175p) {
            this.f3176q = true;
            if (z2) {
                this.f3177r = true;
                return;
            }
            return;
        }
        if (z2) {
            this.h = true;
            this.f3170k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3180u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0202z interfaceC0202z = (InterfaceC0202z) weakReference.get();
            if (interfaceC0202z == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0202z.c();
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
        C0192p g2 = g(i, keyEvent);
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
    public final boolean q(MenuItem menuItem, InterfaceC0202z interfaceC0202z, int i) {
        boolean z2;
        C0192p c0192p = (C0192p) menuItem;
        if (c0192p == null || !c0192p.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = c0192p.f3203p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(c0192p)) {
            MenuC0189m menuC0189m = c0192p.f3201n;
            if (!menuC0189m.e(menuC0189m, c0192p)) {
                Intent intent = c0192p.f3196g;
                if (intent != null) {
                    try {
                        menuC0189m.f3163a.startActivity(intent);
                    } catch (ActivityNotFoundException e2) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
                    }
                }
                ActionProviderVisibilityListenerC0193q actionProviderVisibilityListenerC0193q = c0192p.f3188A;
                if (actionProviderVisibilityListenerC0193q == null || !actionProviderVisibilityListenerC0193q.f3215b.onPerformDefaultAction()) {
                    z2 = false;
                    ActionProviderVisibilityListenerC0193q actionProviderVisibilityListenerC0193q2 = c0192p.f3188A;
                    boolean z3 = actionProviderVisibilityListenerC0193q2 == null && actionProviderVisibilityListenerC0193q2.f3215b.hasSubMenu();
                    if (!c0192p.e()) {
                        z2 |= c0192p.expandActionView();
                        if (z2) {
                            c(true);
                        }
                    } else if (c0192p.hasSubMenu() || z3) {
                        if ((i & 4) == 0) {
                            c(false);
                        }
                        if (!c0192p.hasSubMenu()) {
                            SubMenuC0176F subMenuC0176F = new SubMenuC0176F(this.f3163a, this, c0192p);
                            c0192p.f3202o = subMenuC0176F;
                            subMenuC0176F.setHeaderTitle(c0192p.f3194e);
                        }
                        SubMenuC0176F subMenuC0176F2 = c0192p.f3202o;
                        if (z3) {
                            actionProviderVisibilityListenerC0193q2.f3216c.getClass();
                            actionProviderVisibilityListenerC0193q2.f3215b.onPrepareSubMenu(subMenuC0176F2);
                        }
                        CopyOnWriteArrayList copyOnWriteArrayList = this.f3180u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            r0 = interfaceC0202z != null ? interfaceC0202z.e(subMenuC0176F2) : false;
                            Iterator it = copyOnWriteArrayList.iterator();
                            while (it.hasNext()) {
                                WeakReference weakReference = (WeakReference) it.next();
                                InterfaceC0202z interfaceC0202z2 = (InterfaceC0202z) weakReference.get();
                                if (interfaceC0202z2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!r0) {
                                    r0 = interfaceC0202z2.e(subMenuC0176F2);
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
        ActionProviderVisibilityListenerC0193q actionProviderVisibilityListenerC0193q22 = c0192p.f3188A;
        if (actionProviderVisibilityListenerC0193q22 == null) {
        }
        if (!c0192p.e()) {
        }
        return z2;
    }

    public final void r(InterfaceC0202z interfaceC0202z) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3180u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0202z interfaceC0202z2 = (InterfaceC0202z) weakReference.get();
            if (interfaceC0202z2 == null || interfaceC0202z2 == interfaceC0202z) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f3167f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((C0192p) arrayList.get(i3)).f3192b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((C0192p) arrayList.get(i3)).f3192b != i) {
                    break;
                }
                if (i3 >= 0) {
                    ArrayList arrayList2 = this.f3167f;
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
        ArrayList arrayList = this.f3167f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C0192p) arrayList.get(i2)).f3191a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            ArrayList arrayList2 = this.f3167f;
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
        int size = this.f3167f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0176F) item.getSubMenu()).s(bundle);
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
        ArrayList arrayList = this.f3167f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0192p c0192p = (C0192p) arrayList.get(i2);
            if (c0192p.f3192b == i) {
                c0192p.f3211x = (c0192p.f3211x & (-5)) | (z3 ? 4 : 0);
                c0192p.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f3182w = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z2) {
        ArrayList arrayList = this.f3167f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0192p c0192p = (C0192p) arrayList.get(i2);
            if (c0192p.f3192b == i) {
                c0192p.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z2) {
        ArrayList arrayList = this.f3167f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0192p c0192p = (C0192p) arrayList.get(i2);
            if (c0192p.f3192b == i) {
                int i3 = c0192p.f3211x;
                int i4 = (i3 & (-9)) | (z2 ? 0 : 8);
                c0192p.f3211x = i4;
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
        this.f3165c = z2;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f3167f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f3167f.size();
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
                ((SubMenuC0176F) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f3174o = view;
            this.f3172m = null;
            this.f3173n = null;
        } else {
            if (i > 0) {
                this.f3172m = this.f3164b.getText(i);
            } else if (charSequence != null) {
                this.f3172m = charSequence;
            }
            if (i2 > 0) {
                this.f3173n = A.a.b(this.f3163a, i2);
            } else if (drawable != null) {
                this.f3173n = drawable;
            }
            this.f3174o = null;
        }
        p(false);
    }

    public final void v() {
        this.f3175p = false;
        if (this.f3176q) {
            this.f3176q = false;
            p(this.f3177r);
        }
    }

    public final void w() {
        if (this.f3175p) {
            return;
        }
        this.f3175p = true;
        this.f3176q = false;
        this.f3177r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.f3164b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f3164b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0192p a2 = a(i, i2, i3, charSequence);
        SubMenuC0176F subMenuC0176F = new SubMenuC0176F(this.f3163a, this, a2);
        a2.f3202o = subMenuC0176F;
        subMenuC0176F.setHeaderTitle(a2.f3194e);
        return subMenuC0176F;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.f3164b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f3164b.getString(i4));
    }
}
