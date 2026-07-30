package defpackage;

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
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class fk1 implements Menu {
    public static final int[] y = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public final Resources b;
    public boolean c;
    public final boolean d;
    public dk1 e;
    public final ArrayList f;
    public final ArrayList g;
    public boolean h;
    public final ArrayList i;
    public final ArrayList j;
    public boolean k;
    public CharSequence m;
    public Drawable n;
    public View o;
    public lk1 v;
    public boolean x;
    public int l = 0;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public final ArrayList t = new ArrayList();
    public final CopyOnWriteArrayList u = new CopyOnWriteArrayList();
    public boolean w = false;

    public fk1(Context context) {
        boolean z;
        boolean z2 = false;
        this.a = context;
        Resources resources = context.getResources();
        this.b = resources;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = h53.a;
            if (Build.VERSION.SDK_INT >= 28) {
                z = km.x(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z) {
                z2 = true;
            }
        }
        this.d = z2;
    }

    public final lk1 a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            lh.e("order does not contain a valid category.");
            return null;
        }
        int i6 = (y[i5] << 16) | (65535 & i3);
        lk1 lk1Var = new lk1(this, i, i2, i3, i6, charSequence, this.l);
        ArrayList arrayList = this.f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((lk1) arrayList.get(size)).d <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, lk1Var);
        p(true);
        return lk1Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.a.getPackageManager();
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
            lk1 a = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            a.setIcon(resolveInfo.loadIcon(packageManager));
            a.g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = a;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        lk1 a = a(i, i2, i3, charSequence);
        cq2 cq2Var = new cq2(this.a, this, a);
        a.o = cq2Var;
        cq2Var.setHeaderTitle(a.e);
        return cq2Var;
    }

    public final void b(zk1 zk1Var, Context context) {
        this.u.add(new WeakReference(zk1Var));
        zk1Var.i(context, this);
        this.k = true;
    }

    public final void c(boolean z) {
        if (this.s) {
            return;
        }
        this.s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            zk1 zk1Var = (zk1) weakReference.get();
            if (zk1Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zk1Var.b(this, z);
            }
        }
        this.s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        lk1 lk1Var = this.v;
        if (lk1Var != null) {
            d(lk1Var);
        }
        this.f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.n = null;
        this.m = null;
        this.o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(lk1 lk1Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        boolean z = false;
        if (!copyOnWriteArrayList.isEmpty() && this.v == lk1Var) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                zk1 zk1Var = (zk1) weakReference.get();
                if (zk1Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z = zk1Var.d(lk1Var);
                    if (z) {
                        break;
                    }
                }
            }
            v();
            if (z) {
                this.v = null;
            }
        }
        return z;
    }

    public boolean e(fk1 fk1Var, MenuItem menuItem) {
        dk1 dk1Var = this.e;
        return dk1Var != null && dk1Var.e(fk1Var, menuItem);
    }

    public boolean f(lk1 lk1Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        boolean z = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            zk1 zk1Var = (zk1) weakReference.get();
            if (zk1Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z = zk1Var.f(lk1Var);
                if (z) {
                    break;
                }
            }
        }
        v();
        if (z) {
            this.v = lk1Var;
        }
        return z;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            lk1 lk1Var = (lk1) arrayList.get(i2);
            if (lk1Var.a == i) {
                return lk1Var;
            }
            if (lk1Var.hasSubMenu() && (findItem = lk1Var.o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final lk1 g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.t;
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
            return (lk1) arrayList.get(0);
        }
        boolean n = n();
        for (int i2 = 0; i2 < size; i2++) {
            lk1 lk1Var = (lk1) arrayList.get(i2);
            char c = n ? lk1Var.j : lk1Var.h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (n && c == '\b' && i == 67))) {
                return lk1Var;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f.get(i);
    }

    public final void h(List list, int i, KeyEvent keyEvent) {
        boolean n = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                lk1 lk1Var = (lk1) arrayList.get(i2);
                if (lk1Var.hasSubMenu()) {
                    lk1Var.o.h(list, i, keyEvent);
                }
                char c = n ? lk1Var.j : lk1Var.h;
                if ((modifiers & 69647) == ((n ? lk1Var.k : lk1Var.i) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (n && c == '\b' && i == 67)) && lk1Var.isEnabled()) {
                        list.add(lk1Var);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.x) {
            return true;
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((lk1) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l = l();
        if (this.k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                zk1 zk1Var = (zk1) weakReference.get();
                if (zk1Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z |= zk1Var.k();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.j;
            if (z) {
                arrayList.clear();
                arrayList2.clear();
                int size = l.size();
                for (int i = 0; i < size; i++) {
                    lk1 lk1Var = (lk1) l.get(i);
                    if ((lk1Var.x & 32) == 32) {
                        arrayList.add(lk1Var);
                    } else {
                        arrayList2.add(lk1Var);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z = this.h;
        ArrayList arrayList = this.g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            lk1 lk1Var = (lk1) arrayList2.get(i);
            if (lk1Var.isVisible()) {
                arrayList.add(lk1Var);
            }
        }
        this.h = false;
        this.k = true;
        return arrayList;
    }

    public boolean m() {
        return this.w;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z) {
        if (this.p) {
            this.q = true;
            if (z) {
                this.r = true;
                return;
            }
            return;
        }
        if (z) {
            this.h = true;
            this.k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            zk1 zk1Var = (zk1) weakReference.get();
            if (zk1Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zk1Var.g();
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
        lk1 g = g(i, keyEvent);
        boolean q = g != null ? q(g, null, i2) : false;
        if ((i2 & 2) != 0) {
            c(true);
        }
        return q;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(MenuItem menuItem, zk1 zk1Var, int i) {
        boolean z;
        lk1 lk1Var = (lk1) menuItem;
        if (lk1Var == null || !lk1Var.isEnabled()) {
            return false;
        }
        fk1 fk1Var = lk1Var.n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = lk1Var.p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(lk1Var)) && !fk1Var.e(fk1Var, lk1Var)) {
            Intent intent = lk1Var.g;
            if (intent != null) {
                try {
                    fk1Var.a.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                }
            }
            nk1 nk1Var = lk1Var.A;
            if (nk1Var == null || !nk1Var.b.onPerformDefaultAction()) {
                z = false;
                nk1 nk1Var2 = lk1Var.A;
                boolean z2 = nk1Var2 == null && nk1Var2.b.hasSubMenu();
                if (!lk1Var.e()) {
                    z |= lk1Var.expandActionView();
                    if (z) {
                        c(true);
                    }
                } else if (lk1Var.hasSubMenu() || z2) {
                    if ((i & 4) == 0) {
                        c(false);
                    }
                    if (!lk1Var.hasSubMenu()) {
                        cq2 cq2Var = new cq2(this.a, this, lk1Var);
                        lk1Var.o = cq2Var;
                        cq2Var.setHeaderTitle(lk1Var.e);
                    }
                    cq2 cq2Var2 = lk1Var.o;
                    if (z2) {
                        nk1Var2.b.onPrepareSubMenu(cq2Var2);
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList = this.u;
                    if (!copyOnWriteArrayList.isEmpty()) {
                        r0 = zk1Var != null ? zk1Var.j(cq2Var2) : false;
                        Iterator it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            WeakReference weakReference = (WeakReference) it.next();
                            zk1 zk1Var2 = (zk1) weakReference.get();
                            if (zk1Var2 == null) {
                                copyOnWriteArrayList.remove(weakReference);
                            } else if (!r0) {
                                r0 = zk1Var2.j(cq2Var2);
                            }
                        }
                    }
                    z |= r0;
                    if (!z) {
                        c(true);
                    }
                } else if ((i & 1) == 0) {
                    c(true);
                }
                return z;
            }
        }
        z = true;
        nk1 nk1Var22 = lk1Var.A;
        if (nk1Var22 == null) {
        }
        if (!lk1Var.e()) {
        }
        return z;
    }

    public final void r(zk1 zk1Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            zk1 zk1Var2 = (zk1) weakReference.get();
            if (zk1Var2 == null || zk1Var2 == zk1Var) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((lk1) arrayList.get(i3)).b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((lk1) arrayList.get(i3)).b != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((lk1) arrayList.get(i2)).a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        p(true);
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((cq2) item.getSubMenu()).s(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            lk1 lk1Var = (lk1) arrayList.get(i2);
            if (lk1Var.b == i) {
                lk1Var.x = (lk1Var.x & (-5)) | (z2 ? 4 : 0);
                lk1Var.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.w = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            lk1 lk1Var = (lk1) arrayList.get(i2);
            if (lk1Var.b == i) {
                lk1Var.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            lk1 lk1Var = (lk1) arrayList.get(i2);
            if (lk1Var.b == i) {
                int i3 = lk1Var.x;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                lk1Var.x = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.c = z;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f.size();
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
                ((cq2) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.o = view;
            this.m = null;
            this.n = null;
        } else {
            if (i > 0) {
                this.m = this.b.getText(i);
            } else if (charSequence != null) {
                this.m = charSequence;
            }
            if (i2 > 0) {
                this.n = this.a.getDrawable(i2);
            } else if (drawable != null) {
                this.n = drawable;
            }
            this.o = null;
        }
        p(false);
    }

    public final void v() {
        this.p = false;
        if (this.q) {
            this.q = false;
            p(this.r);
        }
    }

    public final void w() {
        if (this.p) {
            return;
        }
        this.p = true;
        this.q = false;
        this.r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.b.getString(i4));
    }

    public fk1 k() {
        return this;
    }
}
