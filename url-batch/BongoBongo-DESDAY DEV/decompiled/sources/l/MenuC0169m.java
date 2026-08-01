package l;

import L.V;
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

/* renamed from: l.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC0169m implements Menu {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f2814y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f2815a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f2816b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2817c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0167k f2818e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2819f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2820g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2821h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f2822j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2823k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f2825m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f2826n;

    /* renamed from: o, reason: collision with root package name */
    public View f2827o;

    /* renamed from: v, reason: collision with root package name */
    public C0171o f2834v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2836x;

    /* renamed from: l, reason: collision with root package name */
    public int f2824l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2828p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2829q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2830r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2831s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f2832t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f2833u = new CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f2835w = false;

    public MenuC0169m(Context context) {
        boolean z2;
        boolean z3 = false;
        this.f2815a = context;
        Resources resources = context.getResources();
        this.f2816b = resources;
        this.f2819f = new ArrayList();
        this.f2820g = new ArrayList();
        this.f2821h = true;
        this.i = new ArrayList();
        this.f2822j = new ArrayList();
        this.f2823k = true;
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

    public final C0171o a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (f2814y[i5] << 16) | (65535 & i3);
        C0171o c0171o = new C0171o(this, i, i2, i3, i6, charSequence, this.f2824l);
        ArrayList arrayList = this.f2819f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((C0171o) arrayList.get(size)).d <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, c0171o);
        p(true);
        return c0171o;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f2815a.getPackageManager();
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
            C0171o a2 = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            a2.setIcon(resolveInfo.loadIcon(packageManager));
            a2.f2848g = intent2;
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

    public final void b(InterfaceC0181y interfaceC0181y, Context context) {
        this.f2833u.add(new WeakReference(interfaceC0181y));
        interfaceC0181y.d(context, this);
        this.f2823k = true;
    }

    public final void c(boolean z2) {
        if (this.f2831s) {
            return;
        }
        this.f2831s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2833u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0181y interfaceC0181y = (InterfaceC0181y) weakReference.get();
            if (interfaceC0181y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0181y.b(this, z2);
            }
        }
        this.f2831s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C0171o c0171o = this.f2834v;
        if (c0171o != null) {
            d(c0171o);
        }
        this.f2819f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f2826n = null;
        this.f2825m = null;
        this.f2827o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(C0171o c0171o) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2833u;
        boolean z2 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f2834v == c0171o) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0181y interfaceC0181y = (InterfaceC0181y) weakReference.get();
                if (interfaceC0181y == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 = interfaceC0181y.k(c0171o);
                    if (z2) {
                        break;
                    }
                }
            }
            v();
            if (z2) {
                this.f2834v = null;
            }
        }
        return z2;
    }

    public boolean e(MenuC0169m menuC0169m, MenuItem menuItem) {
        InterfaceC0167k interfaceC0167k = this.f2818e;
        return interfaceC0167k != null && interfaceC0167k.o(menuC0169m, menuItem);
    }

    public boolean f(C0171o c0171o) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2833u;
        boolean z2 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0181y interfaceC0181y = (InterfaceC0181y) weakReference.get();
            if (interfaceC0181y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z2 = interfaceC0181y.h(c0171o);
                if (z2) {
                    break;
                }
            }
        }
        v();
        if (z2) {
            this.f2834v = c0171o;
        }
        return z2;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        ArrayList arrayList = this.f2819f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0171o c0171o = (C0171o) arrayList.get(i2);
            if (c0171o.f2843a == i) {
                return c0171o;
            }
            if (c0171o.hasSubMenu() && (findItem = c0171o.f2855o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final C0171o g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f2832t;
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
            return (C0171o) arrayList.get(0);
        }
        boolean n2 = n();
        for (int i2 = 0; i2 < size; i2++) {
            C0171o c0171o = (C0171o) arrayList.get(i2);
            char c2 = n2 ? c0171o.f2850j : c0171o.f2849h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (n2 && c2 == '\b' && i == 67))) {
                return c0171o;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f2819f.get(i);
    }

    public final void h(ArrayList arrayList, int i, KeyEvent keyEvent) {
        int i2;
        boolean n2 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList2 = this.f2819f;
            int size = arrayList2.size();
            for (0; i2 < size; i2 + 1) {
                C0171o c0171o = (C0171o) arrayList2.get(i2);
                if (c0171o.hasSubMenu()) {
                    c0171o.f2855o.h(arrayList, i, keyEvent);
                }
                char c2 = n2 ? c0171o.f2850j : c0171o.f2849h;
                if ((modifiers & 69647) == ((n2 ? c0171o.f2851k : c0171o.i) & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if (c2 != cArr[0] && c2 != cArr[2]) {
                        if (n2 && c2 == '\b') {
                            i2 = i != 67 ? i2 + 1 : 0;
                        }
                    }
                    if (c0171o.isEnabled()) {
                        arrayList.add(c0171o);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f2836x) {
            return true;
        }
        ArrayList arrayList = this.f2819f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C0171o) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l2 = l();
        if (this.f2823k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f2833u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0181y interfaceC0181y = (InterfaceC0181y) weakReference.get();
                if (interfaceC0181y == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 |= interfaceC0181y.i();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.f2822j;
            if (z2) {
                arrayList.clear();
                arrayList2.clear();
                int size = l2.size();
                for (int i = 0; i < size; i++) {
                    C0171o c0171o = (C0171o) l2.get(i);
                    if (c0171o.f()) {
                        arrayList.add(c0171o);
                    } else {
                        arrayList2.add(c0171o);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f2823k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public MenuC0169m k() {
        return this;
    }

    public final ArrayList l() {
        boolean z2 = this.f2821h;
        ArrayList arrayList = this.f2820g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f2819f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C0171o c0171o = (C0171o) arrayList2.get(i);
            if (c0171o.isVisible()) {
                arrayList.add(c0171o);
            }
        }
        this.f2821h = false;
        this.f2823k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f2835w;
    }

    public boolean n() {
        return this.f2817c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z2) {
        if (this.f2828p) {
            this.f2829q = true;
            if (z2) {
                this.f2830r = true;
                return;
            }
            return;
        }
        if (z2) {
            this.f2821h = true;
            this.f2823k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2833u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0181y interfaceC0181y = (InterfaceC0181y) weakReference.get();
            if (interfaceC0181y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0181y.c();
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
        C0171o g2 = g(i, keyEvent);
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
    public final boolean q(MenuItem menuItem, InterfaceC0181y interfaceC0181y, int i) {
        boolean z2;
        C0171o c0171o = (C0171o) menuItem;
        if (c0171o == null || !c0171o.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = c0171o.f2856p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(c0171o)) {
            MenuC0169m menuC0169m = c0171o.f2854n;
            if (!menuC0169m.e(menuC0169m, c0171o)) {
                Intent intent = c0171o.f2848g;
                if (intent != null) {
                    try {
                        menuC0169m.f2815a.startActivity(intent);
                    } catch (ActivityNotFoundException e2) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
                    }
                }
                ActionProviderVisibilityListenerC0172p actionProviderVisibilityListenerC0172p = c0171o.f2840A;
                if (actionProviderVisibilityListenerC0172p == null || !actionProviderVisibilityListenerC0172p.f2868b.onPerformDefaultAction()) {
                    z2 = false;
                    ActionProviderVisibilityListenerC0172p actionProviderVisibilityListenerC0172p2 = c0171o.f2840A;
                    boolean z3 = actionProviderVisibilityListenerC0172p2 == null && actionProviderVisibilityListenerC0172p2.f2868b.hasSubMenu();
                    if (!c0171o.e()) {
                        z2 |= c0171o.expandActionView();
                        if (z2) {
                            c(true);
                        }
                    } else if (c0171o.hasSubMenu() || z3) {
                        if ((i & 4) == 0) {
                            c(false);
                        }
                        if (!c0171o.hasSubMenu()) {
                            SubMenuC0156E subMenuC0156E = new SubMenuC0156E(this.f2815a, this, c0171o);
                            c0171o.f2855o = subMenuC0156E;
                            subMenuC0156E.setHeaderTitle(c0171o.f2846e);
                        }
                        SubMenuC0156E subMenuC0156E2 = c0171o.f2855o;
                        if (z3) {
                            actionProviderVisibilityListenerC0172p2.f2869c.getClass();
                            actionProviderVisibilityListenerC0172p2.f2868b.onPrepareSubMenu(subMenuC0156E2);
                        }
                        CopyOnWriteArrayList copyOnWriteArrayList = this.f2833u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            r0 = interfaceC0181y != null ? interfaceC0181y.e(subMenuC0156E2) : false;
                            Iterator it = copyOnWriteArrayList.iterator();
                            while (it.hasNext()) {
                                WeakReference weakReference = (WeakReference) it.next();
                                InterfaceC0181y interfaceC0181y2 = (InterfaceC0181y) weakReference.get();
                                if (interfaceC0181y2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!r0) {
                                    r0 = interfaceC0181y2.e(subMenuC0156E2);
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
        ActionProviderVisibilityListenerC0172p actionProviderVisibilityListenerC0172p22 = c0171o.f2840A;
        if (actionProviderVisibilityListenerC0172p22 == null) {
        }
        if (!c0171o.e()) {
        }
        return z2;
    }

    public final void r(InterfaceC0181y interfaceC0181y) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2833u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0181y interfaceC0181y2 = (InterfaceC0181y) weakReference.get();
            if (interfaceC0181y2 == null || interfaceC0181y2 == interfaceC0181y) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f2819f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((C0171o) arrayList.get(i3)).f2844b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((C0171o) arrayList.get(i3)).f2844b != i) {
                    break;
                }
                if (i3 >= 0) {
                    ArrayList arrayList2 = this.f2819f;
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
        ArrayList arrayList = this.f2819f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C0171o) arrayList.get(i2)).f2843a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            ArrayList arrayList2 = this.f2819f;
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
        int size = this.f2819f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0156E) item.getSubMenu()).s(bundle);
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
        ArrayList arrayList = this.f2819f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0171o c0171o = (C0171o) arrayList.get(i2);
            if (c0171o.f2844b == i) {
                c0171o.f2864x = (c0171o.f2864x & (-5)) | (z3 ? 4 : 0);
                c0171o.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f2835w = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z2) {
        ArrayList arrayList = this.f2819f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0171o c0171o = (C0171o) arrayList.get(i2);
            if (c0171o.f2844b == i) {
                c0171o.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z2) {
        ArrayList arrayList = this.f2819f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0171o c0171o = (C0171o) arrayList.get(i2);
            if (c0171o.f2844b == i) {
                int i3 = c0171o.f2864x;
                int i4 = (i3 & (-9)) | (z2 ? 0 : 8);
                c0171o.f2864x = i4;
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
        this.f2817c = z2;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f2819f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f2819f.size();
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
                ((SubMenuC0156E) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f2827o = view;
            this.f2825m = null;
            this.f2826n = null;
        } else {
            if (i > 0) {
                this.f2825m = this.f2816b.getText(i);
            } else if (charSequence != null) {
                this.f2825m = charSequence;
            }
            if (i2 > 0) {
                this.f2826n = B.a.b(this.f2815a, i2);
            } else if (drawable != null) {
                this.f2826n = drawable;
            }
            this.f2827o = null;
        }
        p(false);
    }

    public final void v() {
        this.f2828p = false;
        if (this.f2829q) {
            this.f2829q = false;
            p(this.f2830r);
        }
    }

    public final void w() {
        if (this.f2828p) {
            return;
        }
        this.f2828p = true;
        this.f2829q = false;
        this.f2830r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.f2816b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f2816b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0171o a2 = a(i, i2, i3, charSequence);
        SubMenuC0156E subMenuC0156E = new SubMenuC0156E(this.f2815a, this, a2);
        a2.f2855o = subMenuC0156E;
        subMenuC0156E.setHeaderTitle(a2.f2846e);
        return subMenuC0156E;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.f2816b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f2816b.getString(i4));
    }
}
