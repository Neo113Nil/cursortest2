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
public class MenuC0200m implements Menu {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f3056y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f3057a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f3058b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3059c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3060d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0198k f3061e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3062f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3063g;
    public boolean h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f3064j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3065k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f3067m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f3068n;

    /* renamed from: o, reason: collision with root package name */
    public View f3069o;

    /* renamed from: v, reason: collision with root package name */
    public C0202o f3076v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3078x;

    /* renamed from: l, reason: collision with root package name */
    public int f3066l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3070p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3071q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3072r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3073s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f3074t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f3075u = new CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f3077w = false;

    public MenuC0200m(Context context) {
        boolean z2;
        boolean z3 = false;
        this.f3057a = context;
        Resources resources = context.getResources();
        this.f3058b = resources;
        this.f3062f = new ArrayList();
        this.f3063g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.f3064j = new ArrayList();
        this.f3065k = true;
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
        this.f3060d = z3;
    }

    public final C0202o a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (f3056y[i5] << 16) | (65535 & i3);
        C0202o c0202o = new C0202o(this, i, i2, i3, i6, charSequence, this.f3066l);
        ArrayList arrayList = this.f3062f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((C0202o) arrayList.get(size)).f3088d <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, c0202o);
        p(true);
        return c0202o;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f3057a.getPackageManager();
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
            C0202o a2 = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            a2.setIcon(resolveInfo.loadIcon(packageManager));
            a2.f3091g = intent2;
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

    public final void b(InterfaceC0212y interfaceC0212y, Context context) {
        this.f3075u.add(new WeakReference(interfaceC0212y));
        interfaceC0212y.j(context, this);
        this.f3065k = true;
    }

    public final void c(boolean z2) {
        if (this.f3073s) {
            return;
        }
        this.f3073s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3075u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0212y interfaceC0212y = (InterfaceC0212y) weakReference.get();
            if (interfaceC0212y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0212y.b(this, z2);
            }
        }
        this.f3073s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C0202o c0202o = this.f3076v;
        if (c0202o != null) {
            d(c0202o);
        }
        this.f3062f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f3068n = null;
        this.f3067m = null;
        this.f3069o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(C0202o c0202o) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3075u;
        boolean z2 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f3076v == c0202o) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0212y interfaceC0212y = (InterfaceC0212y) weakReference.get();
                if (interfaceC0212y == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 = interfaceC0212y.h(c0202o);
                    if (z2) {
                        break;
                    }
                }
            }
            v();
            if (z2) {
                this.f3076v = null;
            }
        }
        return z2;
    }

    public boolean e(MenuC0200m menuC0200m, MenuItem menuItem) {
        InterfaceC0198k interfaceC0198k = this.f3061e;
        return interfaceC0198k != null && interfaceC0198k.f(menuC0200m, menuItem);
    }

    public boolean f(C0202o c0202o) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3075u;
        boolean z2 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0212y interfaceC0212y = (InterfaceC0212y) weakReference.get();
            if (interfaceC0212y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z2 = interfaceC0212y.d(c0202o);
                if (z2) {
                    break;
                }
            }
        }
        v();
        if (z2) {
            this.f3076v = c0202o;
        }
        return z2;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        ArrayList arrayList = this.f3062f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0202o c0202o = (C0202o) arrayList.get(i2);
            if (c0202o.f3085a == i) {
                return c0202o;
            }
            if (c0202o.hasSubMenu() && (findItem = c0202o.f3097o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final C0202o g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f3074t;
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
            return (C0202o) arrayList.get(0);
        }
        boolean n2 = n();
        for (int i2 = 0; i2 < size; i2++) {
            C0202o c0202o = (C0202o) arrayList.get(i2);
            char c2 = n2 ? c0202o.f3092j : c0202o.h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (n2 && c2 == '\b' && i == 67))) {
                return c0202o;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f3062f.get(i);
    }

    public final void h(ArrayList arrayList, int i, KeyEvent keyEvent) {
        int i2;
        boolean n2 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList2 = this.f3062f;
            int size = arrayList2.size();
            for (0; i2 < size; i2 + 1) {
                C0202o c0202o = (C0202o) arrayList2.get(i2);
                if (c0202o.hasSubMenu()) {
                    c0202o.f3097o.h(arrayList, i, keyEvent);
                }
                char c2 = n2 ? c0202o.f3092j : c0202o.h;
                if ((modifiers & 69647) == ((n2 ? c0202o.f3093k : c0202o.i) & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if (c2 != cArr[0] && c2 != cArr[2]) {
                        if (n2 && c2 == '\b') {
                            i2 = i != 67 ? i2 + 1 : 0;
                        }
                    }
                    if (c0202o.isEnabled()) {
                        arrayList.add(c0202o);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f3078x) {
            return true;
        }
        ArrayList arrayList = this.f3062f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C0202o) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l2 = l();
        if (this.f3065k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f3075u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0212y interfaceC0212y = (InterfaceC0212y) weakReference.get();
                if (interfaceC0212y == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 |= interfaceC0212y.k();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.f3064j;
            if (z2) {
                arrayList.clear();
                arrayList2.clear();
                int size = l2.size();
                for (int i = 0; i < size; i++) {
                    C0202o c0202o = (C0202o) l2.get(i);
                    if (c0202o.f()) {
                        arrayList.add(c0202o);
                    } else {
                        arrayList2.add(c0202o);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f3065k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public MenuC0200m k() {
        return this;
    }

    public final ArrayList l() {
        boolean z2 = this.h;
        ArrayList arrayList = this.f3063g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f3062f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C0202o c0202o = (C0202o) arrayList2.get(i);
            if (c0202o.isVisible()) {
                arrayList.add(c0202o);
            }
        }
        this.h = false;
        this.f3065k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f3077w;
    }

    public boolean n() {
        return this.f3059c;
    }

    public boolean o() {
        return this.f3060d;
    }

    public final void p(boolean z2) {
        if (this.f3070p) {
            this.f3071q = true;
            if (z2) {
                this.f3072r = true;
                return;
            }
            return;
        }
        if (z2) {
            this.h = true;
            this.f3065k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3075u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0212y interfaceC0212y = (InterfaceC0212y) weakReference.get();
            if (interfaceC0212y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0212y.c();
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
        C0202o g2 = g(i, keyEvent);
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
    public final boolean q(MenuItem menuItem, InterfaceC0212y interfaceC0212y, int i) {
        boolean z2;
        C0202o c0202o = (C0202o) menuItem;
        if (c0202o == null || !c0202o.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = c0202o.f3098p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(c0202o)) {
            MenuC0200m menuC0200m = c0202o.f3096n;
            if (!menuC0200m.e(menuC0200m, c0202o)) {
                Intent intent = c0202o.f3091g;
                if (intent != null) {
                    try {
                        menuC0200m.f3057a.startActivity(intent);
                    } catch (ActivityNotFoundException e2) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
                    }
                }
                ActionProviderVisibilityListenerC0203p actionProviderVisibilityListenerC0203p = c0202o.f3082A;
                if (actionProviderVisibilityListenerC0203p == null || !actionProviderVisibilityListenerC0203p.f3110b.onPerformDefaultAction()) {
                    z2 = false;
                    ActionProviderVisibilityListenerC0203p actionProviderVisibilityListenerC0203p2 = c0202o.f3082A;
                    boolean z3 = actionProviderVisibilityListenerC0203p2 == null && actionProviderVisibilityListenerC0203p2.f3110b.hasSubMenu();
                    if (!c0202o.e()) {
                        z2 |= c0202o.expandActionView();
                        if (z2) {
                            c(true);
                        }
                    } else if (c0202o.hasSubMenu() || z3) {
                        if ((i & 4) == 0) {
                            c(false);
                        }
                        if (!c0202o.hasSubMenu()) {
                            SubMenuC0187E subMenuC0187E = new SubMenuC0187E(this.f3057a, this, c0202o);
                            c0202o.f3097o = subMenuC0187E;
                            subMenuC0187E.setHeaderTitle(c0202o.f3089e);
                        }
                        SubMenuC0187E subMenuC0187E2 = c0202o.f3097o;
                        if (z3) {
                            actionProviderVisibilityListenerC0203p2.f3111c.getClass();
                            actionProviderVisibilityListenerC0203p2.f3110b.onPrepareSubMenu(subMenuC0187E2);
                        }
                        CopyOnWriteArrayList copyOnWriteArrayList = this.f3075u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            r0 = interfaceC0212y != null ? interfaceC0212y.e(subMenuC0187E2) : false;
                            Iterator it = copyOnWriteArrayList.iterator();
                            while (it.hasNext()) {
                                WeakReference weakReference = (WeakReference) it.next();
                                InterfaceC0212y interfaceC0212y2 = (InterfaceC0212y) weakReference.get();
                                if (interfaceC0212y2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!r0) {
                                    r0 = interfaceC0212y2.e(subMenuC0187E2);
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
        ActionProviderVisibilityListenerC0203p actionProviderVisibilityListenerC0203p22 = c0202o.f3082A;
        if (actionProviderVisibilityListenerC0203p22 == null) {
        }
        if (!c0202o.e()) {
        }
        return z2;
    }

    public final void r(InterfaceC0212y interfaceC0212y) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3075u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0212y interfaceC0212y2 = (InterfaceC0212y) weakReference.get();
            if (interfaceC0212y2 == null || interfaceC0212y2 == interfaceC0212y) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f3062f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((C0202o) arrayList.get(i3)).f3086b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((C0202o) arrayList.get(i3)).f3086b != i) {
                    break;
                }
                if (i3 >= 0) {
                    ArrayList arrayList2 = this.f3062f;
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
        ArrayList arrayList = this.f3062f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C0202o) arrayList.get(i2)).f3085a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            ArrayList arrayList2 = this.f3062f;
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
        int size = this.f3062f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0187E) item.getSubMenu()).s(bundle);
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
        ArrayList arrayList = this.f3062f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0202o c0202o = (C0202o) arrayList.get(i2);
            if (c0202o.f3086b == i) {
                c0202o.f3106x = (c0202o.f3106x & (-5)) | (z3 ? 4 : 0);
                c0202o.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f3077w = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z2) {
        ArrayList arrayList = this.f3062f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0202o c0202o = (C0202o) arrayList.get(i2);
            if (c0202o.f3086b == i) {
                c0202o.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z2) {
        ArrayList arrayList = this.f3062f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0202o c0202o = (C0202o) arrayList.get(i2);
            if (c0202o.f3086b == i) {
                int i3 = c0202o.f3106x;
                int i4 = (i3 & (-9)) | (z2 ? 0 : 8);
                c0202o.f3106x = i4;
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
        this.f3059c = z2;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f3062f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f3062f.size();
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
                ((SubMenuC0187E) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f3069o = view;
            this.f3067m = null;
            this.f3068n = null;
        } else {
            if (i > 0) {
                this.f3067m = this.f3058b.getText(i);
            } else if (charSequence != null) {
                this.f3067m = charSequence;
            }
            if (i2 > 0) {
                this.f3068n = A.a.b(this.f3057a, i2);
            } else if (drawable != null) {
                this.f3068n = drawable;
            }
            this.f3069o = null;
        }
        p(false);
    }

    public final void v() {
        this.f3070p = false;
        if (this.f3071q) {
            this.f3071q = false;
            p(this.f3072r);
        }
    }

    public final void w() {
        if (this.f3070p) {
            return;
        }
        this.f3070p = true;
        this.f3071q = false;
        this.f3072r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.f3058b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f3058b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0202o a2 = a(i, i2, i3, charSequence);
        SubMenuC0187E subMenuC0187E = new SubMenuC0187E(this.f3057a, this, a2);
        a2.f3097o = subMenuC0187E;
        subMenuC0187E.setHeaderTitle(a2.f3089e);
        return subMenuC0187E;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.f3058b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f3058b.getString(i4));
    }
}
