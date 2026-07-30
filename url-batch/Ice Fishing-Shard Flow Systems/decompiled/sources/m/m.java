package m;

import I.U;
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

/* loaded from: classes.dex */
public class m implements Menu {

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f6409z = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f6410a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f6411b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6412c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6413d;

    /* renamed from: e, reason: collision with root package name */
    public k f6414e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f6415f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f6416g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6417h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f6418i;
    public final ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6419k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f6421m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f6422n;

    /* renamed from: o, reason: collision with root package name */
    public View f6423o;

    /* renamed from: w, reason: collision with root package name */
    public o f6431w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f6433y;

    /* renamed from: l, reason: collision with root package name */
    public int f6420l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6424p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6425q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6426r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6427s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6428t = false;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f6429u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final CopyOnWriteArrayList f6430v = new CopyOnWriteArrayList();

    /* renamed from: x, reason: collision with root package name */
    public boolean f6432x = false;

    public m(Context context) {
        boolean z7;
        boolean z8 = false;
        this.f6410a = context;
        Resources resources = context.getResources();
        this.f6411b = resources;
        this.f6415f = new ArrayList();
        this.f6416g = new ArrayList();
        this.f6417h = true;
        this.f6418i = new ArrayList();
        this.j = new ArrayList();
        this.f6419k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = U.f1158a;
            if (Build.VERSION.SDK_INT >= 28) {
                z7 = C.b.q(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID);
                z7 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z7) {
                z8 = true;
            }
        }
        this.f6413d = z8;
    }

    public final o a(int i2, int i5, int i7, CharSequence charSequence) {
        int i8;
        int i9 = ((-65536) & i7) >> 16;
        if (i9 < 0 || i9 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i10 = (f6409z[i9] << 16) | (65535 & i7);
        o oVar = new o(this, i2, i5, i7, i10, charSequence, this.f6420l);
        ArrayList arrayList = this.f6415f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i8 = 0;
                break;
            }
            if (((o) arrayList.get(size)).f6443d <= i10) {
                i8 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i8, oVar);
        p(true);
        return oVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i2, int i5, int i7, ComponentName componentName, Intent[] intentArr, Intent intent, int i8, MenuItem[] menuItemArr) {
        int i9;
        PackageManager packageManager = this.f6410a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i8 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i10 = 0; i10 < size; i10++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i10);
            int i11 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i11 < 0 ? intent : intentArr[i11]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            o a7 = a(i2, i5, i7, resolveInfo.loadLabel(packageManager));
            a7.setIcon(resolveInfo.loadIcon(packageManager));
            a7.f6446g = intent2;
            if (menuItemArr != null && (i9 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i9] = a7;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(z zVar, Context context) {
        this.f6430v.add(new WeakReference(zVar));
        zVar.g(context, this);
        this.f6419k = true;
    }

    public final void c(boolean z7) {
        if (this.f6428t) {
            return;
        }
        this.f6428t = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6430v;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            z zVar = (z) weakReference.get();
            if (zVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zVar.a(this, z7);
            }
        }
        this.f6428t = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        o oVar = this.f6431w;
        if (oVar != null) {
            d(oVar);
        }
        this.f6415f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f6422n = null;
        this.f6421m = null;
        this.f6423o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(o oVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6430v;
        boolean z7 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f6431w == oVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                z zVar = (z) weakReference.get();
                if (zVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z7 = zVar.k(oVar);
                    if (z7) {
                        break;
                    }
                }
            }
            v();
            if (z7) {
                this.f6431w = null;
            }
        }
        return z7;
    }

    public boolean e(m mVar, MenuItem menuItem) {
        k kVar = this.f6414e;
        return kVar != null && kVar.d(mVar, menuItem);
    }

    public boolean f(o oVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6430v;
        boolean z7 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            z zVar = (z) weakReference.get();
            if (zVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z7 = zVar.f(oVar);
                if (z7) {
                    break;
                }
            }
        }
        v();
        if (z7) {
            this.f6431w = oVar;
        }
        return z7;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i2) {
        MenuItem findItem;
        ArrayList arrayList = this.f6415f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            o oVar = (o) arrayList.get(i5);
            if (oVar.f6440a == i2) {
                return oVar;
            }
            if (oVar.hasSubMenu() && (findItem = oVar.f6453o.findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final o g(int i2, KeyEvent keyEvent) {
        ArrayList arrayList = this.f6429u;
        arrayList.clear();
        h(arrayList, i2, keyEvent);
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
        boolean n7 = n();
        for (int i5 = 0; i5 < size; i5++) {
            o oVar = (o) arrayList.get(i5);
            char c7 = n7 ? oVar.j : oVar.f6447h;
            char[] cArr = keyData.meta;
            if ((c7 == cArr[0] && (metaState & 2) == 0) || ((c7 == cArr[2] && (metaState & 2) != 0) || (n7 && c7 == '\b' && i2 == 67))) {
                return oVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i2) {
        return (MenuItem) this.f6415f.get(i2);
    }

    public final void h(List list, int i2, KeyEvent keyEvent) {
        boolean n7 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            ArrayList arrayList = this.f6415f;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                o oVar = (o) arrayList.get(i5);
                if (oVar.hasSubMenu()) {
                    oVar.f6453o.h(list, i2, keyEvent);
                }
                char c7 = n7 ? oVar.j : oVar.f6447h;
                if ((modifiers & 69647) == ((n7 ? oVar.f6449k : oVar.f6448i) & 69647) && c7 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c7 == cArr[0] || c7 == cArr[2] || (n7 && c7 == '\b' && i2 == 67)) && oVar.isEnabled()) {
                        list.add(oVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f6433y) {
            return true;
        }
        ArrayList arrayList = this.f6415f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((o) arrayList.get(i2)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l7 = l();
        if (this.f6419k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f6430v;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z7 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                z zVar = (z) weakReference.get();
                if (zVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z7 |= zVar.h();
                }
            }
            ArrayList arrayList = this.f6418i;
            ArrayList arrayList2 = this.j;
            if (z7) {
                arrayList.clear();
                arrayList2.clear();
                int size = l7.size();
                for (int i2 = 0; i2 < size; i2++) {
                    o oVar = (o) l7.get(i2);
                    if ((oVar.f6462x & 32) == 32) {
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
            this.f6419k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return g(i2, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z7 = this.f6417h;
        ArrayList arrayList = this.f6416g;
        if (!z7) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f6415f;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            o oVar = (o) arrayList2.get(i2);
            if (oVar.isVisible()) {
                arrayList.add(oVar);
            }
        }
        this.f6417h = false;
        this.f6419k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f6432x;
    }

    public boolean n() {
        return this.f6412c;
    }

    public boolean o() {
        return this.f6413d;
    }

    public final void p(boolean z7) {
        if (this.f6424p) {
            this.f6425q = true;
            if (z7) {
                this.f6426r = true;
                return;
            }
            return;
        }
        if (z7) {
            this.f6417h = true;
            this.f6419k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6430v;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            z zVar = (z) weakReference.get();
            if (zVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zVar.d();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i2, int i5) {
        return q(findItem(i2), null, i5);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i5) {
        o g7 = g(i2, keyEvent);
        boolean q4 = g7 != null ? q(g7, null, i5) : false;
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
    public final boolean q(MenuItem menuItem, z zVar, int i2) {
        boolean z7;
        o oVar = (o) menuItem;
        if (oVar == null || !oVar.isEnabled()) {
            return false;
        }
        m mVar = oVar.f6452n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = oVar.f6454p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(oVar)) && !mVar.e(mVar, oVar)) {
            Intent intent = oVar.f6446g;
            if (intent != null) {
                try {
                    mVar.f6410a.startActivity(intent);
                } catch (ActivityNotFoundException e7) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e7);
                }
            }
            p pVar = oVar.f6437A;
            if (pVar == null || !pVar.f6465a.onPerformDefaultAction()) {
                z7 = false;
                p pVar2 = oVar.f6437A;
                boolean z8 = pVar2 == null && pVar2.f6465a.hasSubMenu();
                if (!oVar.e()) {
                    z7 |= oVar.expandActionView();
                    if (z7) {
                        c(true);
                    }
                } else if (oVar.hasSubMenu() || z8) {
                    if ((i2 & 4) == 0) {
                        c(false);
                    }
                    if (!oVar.hasSubMenu()) {
                        F f7 = new F(this.f6410a, this, oVar);
                        oVar.f6453o = f7;
                        f7.setHeaderTitle(oVar.f6444e);
                    }
                    F f8 = oVar.f6453o;
                    if (z8) {
                        pVar2.f6465a.onPrepareSubMenu(f8);
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f6430v;
                    if (!copyOnWriteArrayList.isEmpty()) {
                        r0 = zVar != null ? zVar.i(f8) : false;
                        Iterator it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            WeakReference weakReference = (WeakReference) it.next();
                            z zVar2 = (z) weakReference.get();
                            if (zVar2 == null) {
                                copyOnWriteArrayList.remove(weakReference);
                            } else if (!r0) {
                                r0 = zVar2.i(f8);
                            }
                        }
                    }
                    z7 |= r0;
                    if (!z7) {
                        c(true);
                    }
                } else if ((i2 & 1) == 0) {
                    c(true);
                }
                return z7;
            }
        }
        z7 = true;
        p pVar22 = oVar.f6437A;
        if (pVar22 == null) {
        }
        if (!oVar.e()) {
        }
        return z7;
    }

    public final void r(z zVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6430v;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            z zVar2 = (z) weakReference.get();
            if (zVar2 == null || zVar2 == zVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i2) {
        ArrayList arrayList = this.f6415f;
        int size = arrayList.size();
        int i5 = 0;
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            } else if (((o) arrayList.get(i7)).f6441b == i2) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 >= 0) {
            int size2 = arrayList.size() - i7;
            while (true) {
                int i8 = i5 + 1;
                if (i5 >= size2 || ((o) arrayList.get(i7)).f6441b != i2) {
                    break;
                }
                if (i7 >= 0) {
                    ArrayList arrayList2 = this.f6415f;
                    if (i7 < arrayList2.size()) {
                        arrayList2.remove(i7);
                    }
                }
                i5 = i8;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i2) {
        ArrayList arrayList = this.f6415f;
        int size = arrayList.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i5 = -1;
                break;
            } else if (((o) arrayList.get(i5)).f6440a == i2) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 >= 0) {
            ArrayList arrayList2 = this.f6415f;
            if (i5 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i5);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f6415f.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((F) item.getSubMenu()).s(bundle);
            }
        }
        int i5 = bundle.getInt("android:menu:expandedactionview");
        if (i5 <= 0 || (findItem = findItem(i5)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i2, boolean z7, boolean z8) {
        ArrayList arrayList = this.f6415f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            o oVar = (o) arrayList.get(i5);
            if (oVar.f6441b == i2) {
                oVar.f6462x = (oVar.f6462x & (-5)) | (z8 ? 4 : 0);
                oVar.setCheckable(z7);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z7) {
        this.f6432x = z7;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i2, boolean z7) {
        ArrayList arrayList = this.f6415f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            o oVar = (o) arrayList.get(i5);
            if (oVar.f6441b == i2) {
                oVar.setEnabled(z7);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i2, boolean z7) {
        ArrayList arrayList = this.f6415f;
        int size = arrayList.size();
        boolean z8 = false;
        for (int i5 = 0; i5 < size; i5++) {
            o oVar = (o) arrayList.get(i5);
            if (oVar.f6441b == i2) {
                int i7 = oVar.f6462x;
                int i8 = (i7 & (-9)) | (z7 ? 0 : 8);
                oVar.f6462x = i8;
                if (i7 != i8) {
                    z8 = true;
                }
            }
        }
        if (z8) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z7) {
        this.f6412c = z7;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f6415f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f6415f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
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
                ((F) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i2, CharSequence charSequence, int i5, Drawable drawable, View view) {
        if (view != null) {
            this.f6423o = view;
            this.f6421m = null;
            this.f6422n = null;
        } else {
            if (i2 > 0) {
                this.f6421m = this.f6411b.getText(i2);
            } else if (charSequence != null) {
                this.f6421m = charSequence;
            }
            if (i5 > 0) {
                this.f6422n = this.f6410a.getDrawable(i5);
            } else if (drawable != null) {
                this.f6422n = drawable;
            }
            this.f6423o = null;
        }
        p(false);
    }

    public final void v() {
        this.f6424p = false;
        if (this.f6425q) {
            this.f6425q = false;
            p(this.f6426r);
        }
    }

    public final void w() {
        if (this.f6424p) {
            return;
        }
        this.f6424p = true;
        this.f6425q = false;
        this.f6426r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2) {
        return a(0, 0, 0, this.f6411b.getString(i2));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.f6411b.getString(i2));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i5, int i7, CharSequence charSequence) {
        return a(i2, i5, i7, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i5, int i7, CharSequence charSequence) {
        o a7 = a(i2, i5, i7, charSequence);
        F f7 = new F(this.f6410a, this, a7);
        a7.f6453o = f7;
        f7.setHeaderTitle(a7.f6444e);
        return f7;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i5, int i7, int i8) {
        return a(i2, i5, i7, this.f6411b.getString(i8));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i5, int i7, int i8) {
        return addSubMenu(i2, i5, i7, this.f6411b.getString(i8));
    }

    public m k() {
        return this;
    }
}
