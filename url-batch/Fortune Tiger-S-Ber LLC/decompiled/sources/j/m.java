package j;

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

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class m implements Menu {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f2188y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f2189a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f2190b;
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2191d;

    /* renamed from: e, reason: collision with root package name */
    public k f2192e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2193f;
    public final ArrayList g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f2194i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f2195j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2196k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f2198m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f2199n;

    /* renamed from: o, reason: collision with root package name */
    public View f2200o;

    /* renamed from: v, reason: collision with root package name */
    public o f2207v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2209x;

    /* renamed from: l, reason: collision with root package name */
    public int f2197l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2201p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2202q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2203r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2204s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f2205t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f2206u = new CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f2208w = false;

    public m(Context context) {
        boolean z3;
        boolean z4 = false;
        this.f2189a = context;
        Resources resources = context.getResources();
        this.f2190b = resources;
        this.f2193f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.f2194i = new ArrayList();
        this.f2195j = new ArrayList();
        this.f2196k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                z3 = d0.a.i(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z3 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z3) {
                z4 = true;
            }
        }
        this.f2191d = z4;
    }

    public final o a(int i4, int i5, int i6, CharSequence charSequence) {
        int i7;
        int i8 = ((-65536) & i6) >> 16;
        if (i8 < 0 || i8 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i9 = (f2188y[i8] << 16) | (65535 & i6);
        o oVar = new o(this, i4, i5, i6, i9, charSequence, this.f2197l);
        ArrayList arrayList = this.f2193f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i7 = 0;
                break;
            }
            if (((o) arrayList.get(size)).f2213d <= i9) {
                i7 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i7, oVar);
        p(true);
        return oVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i4, int i5, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        int i8;
        PackageManager packageManager = this.f2189a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i7 & 1) == 0) {
            removeGroup(i4);
        }
        for (int i9 = 0; i9 < size; i9++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i9);
            int i10 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i10 < 0 ? intent : intentArr[i10]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            o a4 = a(i4, i5, i6, resolveInfo.loadLabel(packageManager));
            a4.setIcon(resolveInfo.loadIcon(packageManager));
            a4.g = intent2;
            if (menuItemArr != null && (i8 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i8] = a4;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(y yVar, Context context) {
        this.f2206u.add(new WeakReference(yVar));
        yVar.g(context, this);
        this.f2196k = true;
    }

    public final void c(boolean z3) {
        if (this.f2204s) {
            return;
        }
        this.f2204s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2206u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                yVar.a(this, z3);
            }
        }
        this.f2204s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        o oVar = this.f2207v;
        if (oVar != null) {
            d(oVar);
        }
        this.f2193f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f2199n = null;
        this.f2198m = null;
        this.f2200o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(o oVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2206u;
        boolean z3 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f2207v == oVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z3 = yVar.i(oVar);
                    if (z3) {
                        break;
                    }
                }
            }
            v();
            if (z3) {
                this.f2207v = null;
            }
        }
        return z3;
    }

    public boolean e(m mVar, MenuItem menuItem) {
        k kVar = this.f2192e;
        return kVar != null && kVar.l(mVar, menuItem);
    }

    public boolean f(o oVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2206u;
        boolean z3 = false;
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
                z3 = yVar.d(oVar);
                if (z3) {
                    break;
                }
            }
        }
        v();
        if (z3) {
            this.f2207v = oVar;
        }
        return z3;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i4) {
        MenuItem findItem;
        ArrayList arrayList = this.f2193f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            o oVar = (o) arrayList.get(i5);
            if (oVar.f2211a == i4) {
                return oVar;
            }
            if (oVar.hasSubMenu() && (findItem = oVar.f2222o.findItem(i4)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final o g(int i4, KeyEvent keyEvent) {
        ArrayList arrayList = this.f2205t;
        arrayList.clear();
        h(arrayList, i4, keyEvent);
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
        boolean n3 = n();
        for (int i5 = 0; i5 < size; i5++) {
            o oVar = (o) arrayList.get(i5);
            char c = n3 ? oVar.f2217j : oVar.h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (n3 && c == '\b' && i4 == 67))) {
                return oVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i4) {
        return (MenuItem) this.f2193f.get(i4);
    }

    public final void h(List list, int i4, KeyEvent keyEvent) {
        boolean n3 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i4 == 67) {
            ArrayList arrayList = this.f2193f;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                o oVar = (o) arrayList.get(i5);
                if (oVar.hasSubMenu()) {
                    oVar.f2222o.h(list, i4, keyEvent);
                }
                char c = n3 ? oVar.f2217j : oVar.h;
                if ((modifiers & 69647) == ((n3 ? oVar.f2218k : oVar.f2216i) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (n3 && c == '\b' && i4 == 67)) && oVar.isEnabled()) {
                        list.add(oVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f2209x) {
            return true;
        }
        ArrayList arrayList = this.f2193f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (((o) arrayList.get(i4)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l4 = l();
        if (this.f2196k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f2206u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z3 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z3 |= yVar.h();
                }
            }
            ArrayList arrayList = this.f2194i;
            ArrayList arrayList2 = this.f2195j;
            if (z3) {
                arrayList.clear();
                arrayList2.clear();
                int size = l4.size();
                for (int i4 = 0; i4 < size; i4++) {
                    o oVar = (o) l4.get(i4);
                    if ((oVar.f2231x & 32) == 32) {
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
            this.f2196k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i4, KeyEvent keyEvent) {
        return g(i4, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z3 = this.h;
        ArrayList arrayList = this.g;
        if (!z3) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f2193f;
        int size = arrayList2.size();
        for (int i4 = 0; i4 < size; i4++) {
            o oVar = (o) arrayList2.get(i4);
            if (oVar.isVisible()) {
                arrayList.add(oVar);
            }
        }
        this.h = false;
        this.f2196k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f2208w;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.f2191d;
    }

    public final void p(boolean z3) {
        if (this.f2201p) {
            this.f2202q = true;
            if (z3) {
                this.f2203r = true;
                return;
            }
            return;
        }
        if (z3) {
            this.h = true;
            this.f2196k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2206u;
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
                yVar.e();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i4, int i5) {
        return q(findItem(i4), null, i5);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i4, KeyEvent keyEvent, int i5) {
        o g = g(i4, keyEvent);
        boolean q4 = g != null ? q(g, null, i5) : false;
        if ((i5 & 2) != 0) {
            c(true);
        }
        return q4;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(MenuItem menuItem, y yVar, int i4) {
        boolean z3;
        o oVar = (o) menuItem;
        if (oVar == null || !oVar.isEnabled()) {
            return false;
        }
        m mVar = oVar.f2221n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = oVar.f2223p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(oVar)) && !mVar.e(mVar, oVar)) {
            Intent intent = oVar.g;
            if (intent != null) {
                try {
                    mVar.f2189a.startActivity(intent);
                } catch (ActivityNotFoundException e4) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e4);
                }
            }
            p pVar = oVar.A;
            if (pVar == null || !pVar.f2235b.onPerformDefaultAction()) {
                z3 = false;
                p pVar2 = oVar.A;
                boolean z4 = pVar2 == null && pVar2.f2235b.hasSubMenu();
                if (!oVar.e()) {
                    z3 |= oVar.expandActionView();
                    if (z3) {
                        c(true);
                    }
                } else if (oVar.hasSubMenu() || z4) {
                    if ((i4 & 4) == 0) {
                        c(false);
                    }
                    if (!oVar.hasSubMenu()) {
                        e0 e0Var = new e0(this.f2189a, this, oVar);
                        oVar.f2222o = e0Var;
                        e0Var.setHeaderTitle(oVar.f2214e);
                    }
                    e0 e0Var2 = oVar.f2222o;
                    if (z4) {
                        pVar2.f2235b.onPrepareSubMenu(e0Var2);
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f2206u;
                    if (!copyOnWriteArrayList.isEmpty()) {
                        r0 = yVar != null ? yVar.k(e0Var2) : false;
                        Iterator it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            WeakReference weakReference = (WeakReference) it.next();
                            y yVar2 = (y) weakReference.get();
                            if (yVar2 == null) {
                                copyOnWriteArrayList.remove(weakReference);
                            } else if (!r0) {
                                r0 = yVar2.k(e0Var2);
                            }
                        }
                    }
                    z3 |= r0;
                    if (!z3) {
                        c(true);
                    }
                } else if ((i4 & 1) == 0) {
                    c(true);
                }
                return z3;
            }
        }
        z3 = true;
        p pVar22 = oVar.A;
        if (pVar22 == null) {
        }
        if (!oVar.e()) {
        }
        return z3;
    }

    public final void r(y yVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2206u;
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
    public final void removeGroup(int i4) {
        ArrayList arrayList = this.f2193f;
        int size = arrayList.size();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                i6 = -1;
                break;
            } else if (((o) arrayList.get(i6)).f2212b == i4) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 >= 0) {
            int size2 = arrayList.size() - i6;
            while (true) {
                int i7 = i5 + 1;
                if (i5 >= size2 || ((o) arrayList.get(i6)).f2212b != i4) {
                    break;
                }
                if (i6 >= 0 && i6 < arrayList.size()) {
                    arrayList.remove(i6);
                }
                i5 = i7;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i4) {
        ArrayList arrayList = this.f2193f;
        int size = arrayList.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i5 = -1;
                break;
            } else if (((o) arrayList.get(i5)).f2211a == i4) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 < 0 || i5 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i5);
        p(true);
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f2193f.size();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = getItem(i4);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((e0) item.getSubMenu()).s(bundle);
            }
        }
        int i5 = bundle.getInt("android:menu:expandedactionview");
        if (i5 <= 0 || (findItem = findItem(i5)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i4, boolean z3, boolean z4) {
        ArrayList arrayList = this.f2193f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            o oVar = (o) arrayList.get(i5);
            if (oVar.f2212b == i4) {
                oVar.f2231x = (oVar.f2231x & (-5)) | (z4 ? 4 : 0);
                oVar.setCheckable(z3);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z3) {
        this.f2208w = z3;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i4, boolean z3) {
        ArrayList arrayList = this.f2193f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            o oVar = (o) arrayList.get(i5);
            if (oVar.f2212b == i4) {
                oVar.setEnabled(z3);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i4, boolean z3) {
        ArrayList arrayList = this.f2193f;
        int size = arrayList.size();
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            o oVar = (o) arrayList.get(i5);
            if (oVar.f2212b == i4) {
                int i6 = oVar.f2231x;
                int i7 = (i6 & (-9)) | (z3 ? 0 : 8);
                oVar.f2231x = i7;
                if (i6 != i7) {
                    z4 = true;
                }
            }
        }
        if (z4) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z3) {
        this.c = z3;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f2193f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f2193f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = getItem(i4);
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

    public final void u(int i4, CharSequence charSequence, int i5, Drawable drawable, View view) {
        if (view != null) {
            this.f2200o = view;
            this.f2198m = null;
            this.f2199n = null;
        } else {
            if (i4 > 0) {
                this.f2198m = this.f2190b.getText(i4);
            } else if (charSequence != null) {
                this.f2198m = charSequence;
            }
            if (i5 > 0) {
                this.f2199n = this.f2189a.getDrawable(i5);
            } else if (drawable != null) {
                this.f2199n = drawable;
            }
            this.f2200o = null;
        }
        p(false);
    }

    public final void v() {
        this.f2201p = false;
        if (this.f2202q) {
            this.f2202q = false;
            p(this.f2203r);
        }
    }

    public final void w() {
        if (this.f2201p) {
            return;
        }
        this.f2201p = true;
        this.f2202q = false;
        this.f2203r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4) {
        return a(0, 0, 0, this.f2190b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4) {
        return addSubMenu(0, 0, 0, this.f2190b.getString(i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4, int i5, int i6, CharSequence charSequence) {
        return a(i4, i5, i6, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4, int i5, int i6, CharSequence charSequence) {
        o a4 = a(i4, i5, i6, charSequence);
        e0 e0Var = new e0(this.f2189a, this, a4);
        a4.f2222o = e0Var;
        e0Var.setHeaderTitle(a4.f2214e);
        return e0Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4, int i5, int i6, int i7) {
        return a(i4, i5, i6, this.f2190b.getString(i7));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4, int i5, int i6, int i7) {
        return addSubMenu(i4, i5, i6, this.f2190b.getString(i7));
    }

    public m k() {
        return this;
    }
}
