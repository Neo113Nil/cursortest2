package k;

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

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class m implements Menu {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f2210y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f2211a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f2212b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2213c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public k f2214e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2215f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2216g;
    public boolean h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f2217j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2218k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f2220m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f2221n;

    /* renamed from: o, reason: collision with root package name */
    public View f2222o;

    /* renamed from: v, reason: collision with root package name */
    public o f2229v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2231x;

    /* renamed from: l, reason: collision with root package name */
    public int f2219l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2223p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2224q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2225r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2226s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f2227t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f2228u = new CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f2230w = false;

    public m(Context context) {
        boolean z4;
        boolean z5 = false;
        this.f2211a = context;
        Resources resources = context.getResources();
        this.f2212b = resources;
        this.f2215f = new ArrayList();
        this.f2216g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.f2217j = new ArrayList();
        this.f2218k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                z4 = g0.a.i(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z4 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z4) {
                z5 = true;
            }
        }
        this.d = z5;
    }

    public final o a(int i, int i4, int i5, CharSequence charSequence) {
        int i6;
        int i7 = ((-65536) & i5) >> 16;
        if (i7 < 0 || i7 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i8 = (f2210y[i7] << 16) | (65535 & i5);
        o oVar = new o(this, i, i4, i5, i8, charSequence, this.f2219l);
        ArrayList arrayList = this.f2215f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i6 = 0;
                break;
            }
            if (((o) arrayList.get(size)).d <= i8) {
                i6 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i6, oVar);
        p(true);
        return oVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i4, int i5, ComponentName componentName, Intent[] intentArr, Intent intent, int i6, MenuItem[] menuItemArr) {
        int i7;
        PackageManager packageManager = this.f2211a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i6 & 1) == 0) {
            removeGroup(i);
        }
        for (int i8 = 0; i8 < size; i8++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i8);
            int i9 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i9 < 0 ? intent : intentArr[i9]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            o a5 = a(i, i4, i5, resolveInfo.loadLabel(packageManager));
            a5.setIcon(resolveInfo.loadIcon(packageManager));
            a5.f2239g = intent2;
            if (menuItemArr != null && (i7 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i7] = a5;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(y yVar, Context context) {
        this.f2228u.add(new WeakReference(yVar));
        yVar.j(context, this);
        this.f2218k = true;
    }

    public final void c(boolean z4) {
        if (this.f2226s) {
            return;
        }
        this.f2226s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2228u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                yVar.a(this, z4);
            }
        }
        this.f2226s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        o oVar = this.f2229v;
        if (oVar != null) {
            d(oVar);
        }
        this.f2215f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f2221n = null;
        this.f2220m = null;
        this.f2222o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(o oVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2228u;
        boolean z4 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f2229v == oVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z4 = yVar.f(oVar);
                    if (z4) {
                        break;
                    }
                }
            }
            v();
            if (z4) {
                this.f2229v = null;
            }
        }
        return z4;
    }

    public boolean e(m mVar, MenuItem menuItem) {
        k kVar = this.f2214e;
        return kVar != null && kVar.q(mVar, menuItem);
    }

    public boolean f(o oVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2228u;
        boolean z4 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z4 = yVar.c(oVar);
                if (z4) {
                    break;
                }
            }
        }
        v();
        if (z4) {
            this.f2229v = oVar;
        }
        return z4;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        ArrayList arrayList = this.f2215f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            o oVar = (o) arrayList.get(i4);
            if (oVar.f2234a == i) {
                return oVar;
            }
            if (oVar.hasSubMenu() && (findItem = oVar.f2245o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final o g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f2227t;
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
            return (o) arrayList.get(0);
        }
        boolean n4 = n();
        for (int i4 = 0; i4 < size; i4++) {
            o oVar = (o) arrayList.get(i4);
            char c5 = n4 ? oVar.f2240j : oVar.h;
            char[] cArr = keyData.meta;
            if ((c5 == cArr[0] && (metaState & 2) == 0) || ((c5 == cArr[2] && (metaState & 2) != 0) || (n4 && c5 == '\b' && i == 67))) {
                return oVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f2215f.get(i);
    }

    public final void h(List list, int i, KeyEvent keyEvent) {
        boolean n4 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.f2215f;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                o oVar = (o) arrayList.get(i4);
                if (oVar.hasSubMenu()) {
                    oVar.f2245o.h(list, i, keyEvent);
                }
                char c5 = n4 ? oVar.f2240j : oVar.h;
                if ((modifiers & 69647) == ((n4 ? oVar.f2241k : oVar.i) & 69647) && c5 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c5 == cArr[0] || c5 == cArr[2] || (n4 && c5 == '\b' && i == 67)) && oVar.isEnabled()) {
                        list.add(oVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f2231x) {
            return true;
        }
        ArrayList arrayList = this.f2215f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((o) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l4 = l();
        if (this.f2218k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f2228u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z4 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z4 |= yVar.k();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.f2217j;
            if (z4) {
                arrayList.clear();
                arrayList2.clear();
                int size = l4.size();
                for (int i = 0; i < size; i++) {
                    o oVar = (o) l4.get(i);
                    if ((oVar.f2254x & 32) == 32) {
                        arrayList.add(oVar);
                    } else {
                        arrayList2.add(oVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f2218k = false;
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
        boolean z4 = this.h;
        ArrayList arrayList = this.f2216g;
        if (!z4) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f2215f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            o oVar = (o) arrayList2.get(i);
            if (oVar.isVisible()) {
                arrayList.add(oVar);
            }
        }
        this.h = false;
        this.f2218k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f2230w;
    }

    public boolean n() {
        return this.f2213c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z4) {
        if (this.f2223p) {
            this.f2224q = true;
            if (z4) {
                this.f2225r = true;
                return;
            }
            return;
        }
        if (z4) {
            this.h = true;
            this.f2218k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2228u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                yVar.g();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i4) {
        return q(findItem(i), null, i4);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i4) {
        o g3 = g(i, keyEvent);
        boolean q4 = g3 != null ? q(g3, null, i4) : false;
        if ((i4 & 2) != 0) {
            c(true);
        }
        return q4;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(MenuItem menuItem, y yVar, int i) {
        boolean z4;
        o oVar = (o) menuItem;
        if (oVar == null || !oVar.isEnabled()) {
            return false;
        }
        m mVar = oVar.f2244n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = oVar.f2246p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(oVar)) && !mVar.e(mVar, oVar)) {
            Intent intent = oVar.f2239g;
            if (intent != null) {
                try {
                    mVar.f2211a.startActivity(intent);
                } catch (ActivityNotFoundException e4) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e4);
                }
            }
            p pVar = oVar.A;
            if (pVar == null || !pVar.f2258b.onPerformDefaultAction()) {
                z4 = false;
                p pVar2 = oVar.A;
                boolean z5 = pVar2 == null && pVar2.f2258b.hasSubMenu();
                if (!oVar.e()) {
                    z4 |= oVar.expandActionView();
                    if (z4) {
                        c(true);
                    }
                } else if (oVar.hasSubMenu() || z5) {
                    if ((i & 4) == 0) {
                        c(false);
                    }
                    if (!oVar.hasSubMenu()) {
                        e0 e0Var = new e0(this.f2211a, this, oVar);
                        oVar.f2245o = e0Var;
                        e0Var.setHeaderTitle(oVar.f2237e);
                    }
                    e0 e0Var2 = oVar.f2245o;
                    if (z5) {
                        pVar2.f2258b.onPrepareSubMenu(e0Var2);
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f2228u;
                    if (!copyOnWriteArrayList.isEmpty()) {
                        r0 = yVar != null ? yVar.d(e0Var2) : false;
                        Iterator it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            WeakReference weakReference = (WeakReference) it.next();
                            y yVar2 = (y) weakReference.get();
                            if (yVar2 == null) {
                                copyOnWriteArrayList.remove(weakReference);
                            } else if (!r0) {
                                r0 = yVar2.d(e0Var2);
                            }
                        }
                    }
                    z4 |= r0;
                    if (!z4) {
                        c(true);
                    }
                } else if ((i & 1) == 0) {
                    c(true);
                }
                return z4;
            }
        }
        z4 = true;
        p pVar22 = oVar.A;
        if (pVar22 == null) {
        }
        if (!oVar.e()) {
        }
        return z4;
    }

    public final void r(y yVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2228u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar2 = (y) weakReference.get();
            if (yVar2 == null || yVar2 == yVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f2215f;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i5 = -1;
                break;
            } else if (((o) arrayList.get(i5)).f2235b == i) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 >= 0) {
            int size2 = arrayList.size() - i5;
            while (true) {
                int i6 = i4 + 1;
                if (i4 >= size2 || ((o) arrayList.get(i5)).f2235b != i) {
                    break;
                }
                if (i5 >= 0 && i5 < arrayList.size()) {
                    arrayList.remove(i5);
                }
                i4 = i6;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f2215f;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (((o) arrayList.get(i4)).f2234a == i) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 < 0 || i4 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i4);
        p(true);
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f2215f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((e0) item.getSubMenu()).s(bundle);
            }
        }
        int i4 = bundle.getInt("android:menu:expandedactionview");
        if (i4 <= 0 || (findItem = findItem(i4)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z4, boolean z5) {
        ArrayList arrayList = this.f2215f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            o oVar = (o) arrayList.get(i4);
            if (oVar.f2235b == i) {
                oVar.f2254x = (oVar.f2254x & (-5)) | (z5 ? 4 : 0);
                oVar.setCheckable(z4);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z4) {
        this.f2230w = z4;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z4) {
        ArrayList arrayList = this.f2215f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            o oVar = (o) arrayList.get(i4);
            if (oVar.f2235b == i) {
                oVar.setEnabled(z4);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z4) {
        ArrayList arrayList = this.f2215f;
        int size = arrayList.size();
        boolean z5 = false;
        for (int i4 = 0; i4 < size; i4++) {
            o oVar = (o) arrayList.get(i4);
            if (oVar.f2235b == i) {
                int i5 = oVar.f2254x;
                int i6 = (i5 & (-9)) | (z4 ? 0 : 8);
                oVar.f2254x = i6;
                if (i5 != i6) {
                    z5 = true;
                }
            }
        }
        if (z5) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z4) {
        this.f2213c = z4;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f2215f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f2215f.size();
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
                ((e0) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i4, Drawable drawable, View view) {
        if (view != null) {
            this.f2222o = view;
            this.f2220m = null;
            this.f2221n = null;
        } else {
            if (i > 0) {
                this.f2220m = this.f2212b.getText(i);
            } else if (charSequence != null) {
                this.f2220m = charSequence;
            }
            if (i4 > 0) {
                this.f2221n = this.f2211a.getDrawable(i4);
            } else if (drawable != null) {
                this.f2221n = drawable;
            }
            this.f2222o = null;
        }
        p(false);
    }

    public final void v() {
        this.f2223p = false;
        if (this.f2224q) {
            this.f2224q = false;
            p(this.f2225r);
        }
    }

    public final void w() {
        if (this.f2223p) {
            return;
        }
        this.f2223p = true;
        this.f2224q = false;
        this.f2225r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.f2212b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f2212b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i4, int i5, CharSequence charSequence) {
        return a(i, i4, i5, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i4, int i5, CharSequence charSequence) {
        o a5 = a(i, i4, i5, charSequence);
        e0 e0Var = new e0(this.f2211a, this, a5);
        a5.f2245o = e0Var;
        e0Var.setHeaderTitle(a5.f2237e);
        return e0Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i4, int i5, int i6) {
        return a(i, i4, i5, this.f2212b.getString(i6));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i4, int i5, int i6) {
        return addSubMenu(i, i4, i5, this.f2212b.getString(i6));
    }

    public m k() {
        return this;
    }
}
