package m;

import M.S;
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

/* renamed from: m.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC0229m implements Menu {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f3347y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f3348a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f3349b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3350c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3351d;
    public InterfaceC0227k e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3352f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3353g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3354h;
    public final ArrayList i;
    public final ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3355k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f3357m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f3358n;

    /* renamed from: o, reason: collision with root package name */
    public View f3359o;

    /* renamed from: v, reason: collision with root package name */
    public C0231o f3366v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3368x;

    /* renamed from: l, reason: collision with root package name */
    public int f3356l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3360p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3361q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3362r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3363s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f3364t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f3365u = new CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f3367w = false;

    public MenuC0229m(Context context) {
        boolean z2;
        boolean z3 = false;
        this.f3348a = context;
        Resources resources = context.getResources();
        this.f3349b = resources;
        this.f3352f = new ArrayList();
        this.f3353g = new ArrayList();
        this.f3354h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.f3355k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                z2 = S.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z2 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z2) {
                z3 = true;
            }
        }
        this.f3351d = z3;
    }

    public final C0231o a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (f3347y[i5] << 16) | (65535 & i3);
        C0231o c0231o = new C0231o(this, i, i2, i3, i6, charSequence, this.f3356l);
        ArrayList arrayList = this.f3352f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((C0231o) arrayList.get(size)).f3378d <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, c0231o);
        p(true);
        return c0231o;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f3348a.getPackageManager();
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
            C0231o a2 = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            a2.setIcon(resolveInfo.loadIcon(packageManager));
            a2.f3380g = intent2;
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

    public final void b(InterfaceC0241y interfaceC0241y, Context context) {
        this.f3365u.add(new WeakReference(interfaceC0241y));
        interfaceC0241y.f(context, this);
        this.f3355k = true;
    }

    public final void c(boolean z2) {
        if (this.f3363s) {
            return;
        }
        this.f3363s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3365u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0241y interfaceC0241y = (InterfaceC0241y) weakReference.get();
            if (interfaceC0241y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0241y.b(this, z2);
            }
        }
        this.f3363s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C0231o c0231o = this.f3366v;
        if (c0231o != null) {
            d(c0231o);
        }
        this.f3352f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f3358n = null;
        this.f3357m = null;
        this.f3359o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(C0231o c0231o) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3365u;
        boolean z2 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f3366v == c0231o) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0241y interfaceC0241y = (InterfaceC0241y) weakReference.get();
                if (interfaceC0241y == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 = interfaceC0241y.j(c0231o);
                    if (z2) {
                        break;
                    }
                }
            }
            v();
            if (z2) {
                this.f3366v = null;
            }
        }
        return z2;
    }

    public boolean e(MenuC0229m menuC0229m, MenuItem menuItem) {
        InterfaceC0227k interfaceC0227k = this.e;
        return interfaceC0227k != null && interfaceC0227k.c(menuC0229m, menuItem);
    }

    public boolean f(C0231o c0231o) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3365u;
        boolean z2 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0241y interfaceC0241y = (InterfaceC0241y) weakReference.get();
            if (interfaceC0241y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z2 = interfaceC0241y.c(c0231o);
                if (z2) {
                    break;
                }
            }
        }
        v();
        if (z2) {
            this.f3366v = c0231o;
        }
        return z2;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        ArrayList arrayList = this.f3352f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0231o c0231o = (C0231o) arrayList.get(i2);
            if (c0231o.f3375a == i) {
                return c0231o;
            }
            if (c0231o.hasSubMenu() && (findItem = c0231o.f3386o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final C0231o g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f3364t;
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
            return (C0231o) arrayList.get(0);
        }
        boolean n2 = n();
        for (int i2 = 0; i2 < size; i2++) {
            C0231o c0231o = (C0231o) arrayList.get(i2);
            char c2 = n2 ? c0231o.j : c0231o.f3381h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (n2 && c2 == '\b' && i == 67))) {
                return c0231o;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f3352f.get(i);
    }

    public final void h(ArrayList arrayList, int i, KeyEvent keyEvent) {
        int i2;
        boolean n2 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList2 = this.f3352f;
            int size = arrayList2.size();
            for (0; i2 < size; i2 + 1) {
                C0231o c0231o = (C0231o) arrayList2.get(i2);
                if (c0231o.hasSubMenu()) {
                    c0231o.f3386o.h(arrayList, i, keyEvent);
                }
                char c2 = n2 ? c0231o.j : c0231o.f3381h;
                if ((modifiers & 69647) == ((n2 ? c0231o.f3382k : c0231o.i) & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if (c2 != cArr[0] && c2 != cArr[2]) {
                        if (n2 && c2 == '\b') {
                            i2 = i != 67 ? i2 + 1 : 0;
                        }
                    }
                    if (c0231o.isEnabled()) {
                        arrayList.add(c0231o);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f3368x) {
            return true;
        }
        ArrayList arrayList = this.f3352f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C0231o) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l2 = l();
        if (this.f3355k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f3365u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0241y interfaceC0241y = (InterfaceC0241y) weakReference.get();
                if (interfaceC0241y == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 |= interfaceC0241y.g();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.j;
            if (z2) {
                arrayList.clear();
                arrayList2.clear();
                int size = l2.size();
                for (int i = 0; i < size; i++) {
                    C0231o c0231o = (C0231o) l2.get(i);
                    if (c0231o.f()) {
                        arrayList.add(c0231o);
                    } else {
                        arrayList2.add(c0231o);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f3355k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public MenuC0229m k() {
        return this;
    }

    public final ArrayList l() {
        boolean z2 = this.f3354h;
        ArrayList arrayList = this.f3353g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f3352f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C0231o c0231o = (C0231o) arrayList2.get(i);
            if (c0231o.isVisible()) {
                arrayList.add(c0231o);
            }
        }
        this.f3354h = false;
        this.f3355k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f3367w;
    }

    public boolean n() {
        return this.f3350c;
    }

    public boolean o() {
        return this.f3351d;
    }

    public final void p(boolean z2) {
        if (this.f3360p) {
            this.f3361q = true;
            if (z2) {
                this.f3362r = true;
                return;
            }
            return;
        }
        if (z2) {
            this.f3354h = true;
            this.f3355k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3365u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0241y interfaceC0241y = (InterfaceC0241y) weakReference.get();
            if (interfaceC0241y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0241y.d();
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
        C0231o g2 = g(i, keyEvent);
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
    public final boolean q(MenuItem menuItem, InterfaceC0241y interfaceC0241y, int i) {
        boolean z2;
        C0231o c0231o = (C0231o) menuItem;
        if (c0231o == null || !c0231o.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = c0231o.f3387p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(c0231o)) {
            MenuC0229m menuC0229m = c0231o.f3385n;
            if (!menuC0229m.e(menuC0229m, c0231o)) {
                Intent intent = c0231o.f3380g;
                if (intent != null) {
                    try {
                        menuC0229m.f3348a.startActivity(intent);
                    } catch (ActivityNotFoundException e) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                    }
                }
                ActionProviderVisibilityListenerC0232p actionProviderVisibilityListenerC0232p = c0231o.f3372A;
                if (actionProviderVisibilityListenerC0232p == null || !actionProviderVisibilityListenerC0232p.f3399b.onPerformDefaultAction()) {
                    z2 = false;
                    ActionProviderVisibilityListenerC0232p actionProviderVisibilityListenerC0232p2 = c0231o.f3372A;
                    boolean z3 = actionProviderVisibilityListenerC0232p2 == null && actionProviderVisibilityListenerC0232p2.f3399b.hasSubMenu();
                    if (!c0231o.e()) {
                        z2 |= c0231o.expandActionView();
                        if (z2) {
                            c(true);
                        }
                    } else if (c0231o.hasSubMenu() || z3) {
                        if ((i & 4) == 0) {
                            c(false);
                        }
                        if (!c0231o.hasSubMenu()) {
                            SubMenuC0216E subMenuC0216E = new SubMenuC0216E(this.f3348a, this, c0231o);
                            c0231o.f3386o = subMenuC0216E;
                            subMenuC0216E.setHeaderTitle(c0231o.e);
                        }
                        SubMenuC0216E subMenuC0216E2 = c0231o.f3386o;
                        if (z3) {
                            actionProviderVisibilityListenerC0232p2.f3400c.getClass();
                            actionProviderVisibilityListenerC0232p2.f3399b.onPrepareSubMenu(subMenuC0216E2);
                        }
                        CopyOnWriteArrayList copyOnWriteArrayList = this.f3365u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            r0 = interfaceC0241y != null ? interfaceC0241y.k(subMenuC0216E2) : false;
                            Iterator it = copyOnWriteArrayList.iterator();
                            while (it.hasNext()) {
                                WeakReference weakReference = (WeakReference) it.next();
                                InterfaceC0241y interfaceC0241y2 = (InterfaceC0241y) weakReference.get();
                                if (interfaceC0241y2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!r0) {
                                    r0 = interfaceC0241y2.k(subMenuC0216E2);
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
        ActionProviderVisibilityListenerC0232p actionProviderVisibilityListenerC0232p22 = c0231o.f3372A;
        if (actionProviderVisibilityListenerC0232p22 == null) {
        }
        if (!c0231o.e()) {
        }
        return z2;
    }

    public final void r(InterfaceC0241y interfaceC0241y) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3365u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0241y interfaceC0241y2 = (InterfaceC0241y) weakReference.get();
            if (interfaceC0241y2 == null || interfaceC0241y2 == interfaceC0241y) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f3352f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((C0231o) arrayList.get(i3)).f3376b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((C0231o) arrayList.get(i3)).f3376b != i) {
                    break;
                }
                if (i3 >= 0) {
                    ArrayList arrayList2 = this.f3352f;
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
        ArrayList arrayList = this.f3352f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C0231o) arrayList.get(i2)).f3375a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            ArrayList arrayList2 = this.f3352f;
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
        int size = this.f3352f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0216E) item.getSubMenu()).s(bundle);
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
        ArrayList arrayList = this.f3352f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0231o c0231o = (C0231o) arrayList.get(i2);
            if (c0231o.f3376b == i) {
                c0231o.f3395x = (c0231o.f3395x & (-5)) | (z3 ? 4 : 0);
                c0231o.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f3367w = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z2) {
        ArrayList arrayList = this.f3352f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0231o c0231o = (C0231o) arrayList.get(i2);
            if (c0231o.f3376b == i) {
                c0231o.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z2) {
        ArrayList arrayList = this.f3352f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0231o c0231o = (C0231o) arrayList.get(i2);
            if (c0231o.f3376b == i) {
                int i3 = c0231o.f3395x;
                int i4 = (i3 & (-9)) | (z2 ? 0 : 8);
                c0231o.f3395x = i4;
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
        this.f3350c = z2;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f3352f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f3352f.size();
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
                ((SubMenuC0216E) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f3359o = view;
            this.f3357m = null;
            this.f3358n = null;
        } else {
            if (i > 0) {
                this.f3357m = this.f3349b.getText(i);
            } else if (charSequence != null) {
                this.f3357m = charSequence;
            }
            if (i2 > 0) {
                this.f3358n = C.a.b(this.f3348a, i2);
            } else if (drawable != null) {
                this.f3358n = drawable;
            }
            this.f3359o = null;
        }
        p(false);
    }

    public final void v() {
        this.f3360p = false;
        if (this.f3361q) {
            this.f3361q = false;
            p(this.f3362r);
        }
    }

    public final void w() {
        if (this.f3360p) {
            return;
        }
        this.f3360p = true;
        this.f3361q = false;
        this.f3362r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.f3349b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f3349b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0231o a2 = a(i, i2, i3, charSequence);
        SubMenuC0216E subMenuC0216E = new SubMenuC0216E(this.f3348a, this, a2);
        a2.f3386o = subMenuC0216E;
        subMenuC0216E.setHeaderTitle(a2.e);
        return subMenuC0216E;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.f3349b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f3349b.getString(i4));
    }
}
