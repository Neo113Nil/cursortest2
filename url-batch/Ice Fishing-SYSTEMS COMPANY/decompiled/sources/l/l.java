package l;

import O.AbstractC0337b0;
import O.Z;
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
public class l implements Menu {

    /* renamed from: R, reason: collision with root package name */
    public static final int[] f38945R = {1, 4, 5, 3, 2, 0};

    /* renamed from: A, reason: collision with root package name */
    public boolean f38946A;

    /* renamed from: B, reason: collision with root package name */
    public final ArrayList f38947B;

    /* renamed from: C, reason: collision with root package name */
    public final ArrayList f38948C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f38949D;

    /* renamed from: F, reason: collision with root package name */
    public CharSequence f38951F;

    /* renamed from: G, reason: collision with root package name */
    public Drawable f38952G;

    /* renamed from: H, reason: collision with root package name */
    public View f38953H;

    /* renamed from: O, reason: collision with root package name */
    public n f38959O;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f38961Q;

    /* renamed from: n, reason: collision with root package name */
    public final Context f38962n;

    /* renamed from: u, reason: collision with root package name */
    public final Resources f38963u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f38964v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f38965w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC4682j f38966x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f38967y;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f38968z;

    /* renamed from: E, reason: collision with root package name */
    public int f38950E = 0;

    /* renamed from: I, reason: collision with root package name */
    public boolean f38954I = false;
    public boolean J = false;

    /* renamed from: K, reason: collision with root package name */
    public boolean f38955K = false;

    /* renamed from: L, reason: collision with root package name */
    public boolean f38956L = false;

    /* renamed from: M, reason: collision with root package name */
    public final ArrayList f38957M = new ArrayList();

    /* renamed from: N, reason: collision with root package name */
    public final CopyOnWriteArrayList f38958N = new CopyOnWriteArrayList();

    /* renamed from: P, reason: collision with root package name */
    public boolean f38960P = false;

    public l(Context context) {
        boolean z8;
        boolean z9 = false;
        this.f38962n = context;
        Resources resources = context.getResources();
        this.f38963u = resources;
        this.f38967y = new ArrayList();
        this.f38968z = new ArrayList();
        this.f38946A = true;
        this.f38947B = new ArrayList();
        this.f38948C = new ArrayList();
        this.f38949D = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = AbstractC0337b0.f2250a;
            if (Build.VERSION.SDK_INT >= 28) {
                z8 = Z.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID);
                z8 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z8) {
                z9 = true;
            }
        }
        this.f38965w = z9;
    }

    public final n a(int i, int i4, int i9, CharSequence charSequence) {
        int i10;
        int i11 = ((-65536) & i9) >> 16;
        if (i11 < 0 || i11 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i12 = (f38945R[i11] << 16) | (65535 & i9);
        n nVar = new n(this, i, i4, i9, i12, charSequence, this.f38950E);
        ArrayList arrayList = this.f38967y;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (((n) arrayList.get(size)).f38996w <= i12) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i10, nVar);
        p(true);
        return nVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i4, int i9, ComponentName componentName, Intent[] intentArr, Intent intent, int i10, MenuItem[] menuItemArr) {
        int i11;
        PackageManager packageManager = this.f38962n.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i10 & 1) == 0) {
            removeGroup(i);
        }
        for (int i12 = 0; i12 < size; i12++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i12);
            int i13 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i13 < 0 ? intent : intentArr[i13]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            n a9 = a(i, i4, i9, resolveInfo.loadLabel(packageManager));
            a9.setIcon(resolveInfo.loadIcon(packageManager));
            a9.f38999z = intent2;
            if (menuItemArr != null && (i11 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i11] = a9;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(x xVar, Context context) {
        this.f38958N.add(new WeakReference(xVar));
        xVar.h(context, this);
        this.f38949D = true;
    }

    public final void c(boolean z8) {
        if (this.f38956L) {
            return;
        }
        this.f38956L = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f38958N;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.e(this, z8);
            }
        }
        this.f38956L = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        n nVar = this.f38959O;
        if (nVar != null) {
            d(nVar);
        }
        this.f38967y.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f38952G = null;
        this.f38951F = null;
        this.f38953H = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(n nVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f38958N;
        boolean z8 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f38959O == nVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                x xVar = (x) weakReference.get();
                if (xVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z8 = xVar.j(nVar);
                    if (z8) {
                        break;
                    }
                }
            }
            v();
            if (z8) {
                this.f38959O = null;
            }
        }
        return z8;
    }

    public boolean e(l lVar, MenuItem menuItem) {
        InterfaceC4682j interfaceC4682j = this.f38966x;
        return interfaceC4682j != null && interfaceC4682j.o(lVar, menuItem);
    }

    public boolean f(n nVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f38958N;
        boolean z8 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z8 = xVar.b(nVar);
                if (z8) {
                    break;
                }
            }
        }
        v();
        if (z8) {
            this.f38959O = nVar;
        }
        return z8;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        ArrayList arrayList = this.f38967y;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            n nVar = (n) arrayList.get(i4);
            if (nVar.f38993n == i) {
                return nVar;
            }
            if (nVar.hasSubMenu() && (findItem = nVar.f38979H.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final n g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f38957M;
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
            return (n) arrayList.get(0);
        }
        boolean n9 = n();
        for (int i4 = 0; i4 < size; i4++) {
            n nVar = (n) arrayList.get(i4);
            char c4 = n9 ? nVar.f38974C : nVar.f38972A;
            char[] cArr = keyData.meta;
            if ((c4 == cArr[0] && (metaState & 2) == 0) || ((c4 == cArr[2] && (metaState & 2) != 0) || (n9 && c4 == '\b' && i == 67))) {
                return nVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f38967y.get(i);
    }

    public final void h(ArrayList arrayList, int i, KeyEvent keyEvent) {
        boolean n9 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList2 = this.f38967y;
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                n nVar = (n) arrayList2.get(i4);
                if (nVar.hasSubMenu()) {
                    nVar.f38979H.h(arrayList, i, keyEvent);
                }
                char c4 = n9 ? nVar.f38974C : nVar.f38972A;
                if ((modifiers & 69647) == ((n9 ? nVar.f38975D : nVar.f38973B) & 69647) && c4 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c4 == cArr[0] || c4 == cArr[2] || (n9 && c4 == '\b' && i == 67)) && nVar.isEnabled()) {
                        arrayList.add(nVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f38961Q) {
            return true;
        }
        ArrayList arrayList = this.f38967y;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((n) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l9 = l();
        if (this.f38949D) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f38958N;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z8 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                x xVar = (x) weakReference.get();
                if (xVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z8 |= xVar.c();
                }
            }
            ArrayList arrayList = this.f38947B;
            ArrayList arrayList2 = this.f38948C;
            if (z8) {
                arrayList.clear();
                arrayList2.clear();
                int size = l9.size();
                for (int i = 0; i < size; i++) {
                    n nVar = (n) l9.get(i);
                    if ((nVar.f38987Q & 32) == 32) {
                        arrayList.add(nVar);
                    } else {
                        arrayList2.add(nVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f38949D = false;
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
        boolean z8 = this.f38946A;
        ArrayList arrayList = this.f38968z;
        if (!z8) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f38967y;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            n nVar = (n) arrayList2.get(i);
            if (nVar.isVisible()) {
                arrayList.add(nVar);
            }
        }
        this.f38946A = false;
        this.f38949D = true;
        return arrayList;
    }

    public boolean m() {
        return this.f38960P;
    }

    public boolean n() {
        return this.f38964v;
    }

    public boolean o() {
        return this.f38965w;
    }

    public final void p(boolean z8) {
        if (this.f38954I) {
            this.J = true;
            if (z8) {
                this.f38955K = true;
                return;
            }
            return;
        }
        if (z8) {
            this.f38946A = true;
            this.f38949D = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f38958N;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.d();
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
        n g9 = g(i, keyEvent);
        boolean q6 = g9 != null ? q(g9, null, i4) : false;
        if ((i4 & 2) != 0) {
            c(true);
        }
        return q6;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(MenuItem menuItem, x xVar, int i) {
        boolean z8;
        n nVar = (n) menuItem;
        if (nVar == null || !nVar.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = nVar.f38980I;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(nVar)) {
            l lVar = nVar.f38978G;
            if (!lVar.e(lVar, nVar)) {
                Intent intent = nVar.f38999z;
                if (intent != null) {
                    try {
                        lVar.f38962n.startActivity(intent);
                    } catch (ActivityNotFoundException e6) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e6);
                    }
                }
                o oVar = nVar.f38990T;
                if (oVar == null || !oVar.f39001b.onPerformDefaultAction()) {
                    z8 = false;
                    o oVar2 = nVar.f38990T;
                    boolean z9 = oVar2 == null && oVar2.f39001b.hasSubMenu();
                    if (!nVar.e()) {
                        z8 |= nVar.expandActionView();
                        if (z8) {
                            c(true);
                        }
                    } else if (nVar.hasSubMenu() || z9) {
                        if ((i & 4) == 0) {
                            c(false);
                        }
                        if (!nVar.hasSubMenu()) {
                            SubMenuC4672D subMenuC4672D = new SubMenuC4672D(this.f38962n, this, nVar);
                            nVar.f38979H = subMenuC4672D;
                            subMenuC4672D.setHeaderTitle(nVar.f38997x);
                        }
                        SubMenuC4672D subMenuC4672D2 = nVar.f38979H;
                        if (z9) {
                            s sVar = oVar2.f39002c;
                            oVar2.f39001b.onPrepareSubMenu(subMenuC4672D2);
                        }
                        CopyOnWriteArrayList copyOnWriteArrayList = this.f38958N;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            r0 = xVar != null ? xVar.i(subMenuC4672D2) : false;
                            Iterator it = copyOnWriteArrayList.iterator();
                            while (it.hasNext()) {
                                WeakReference weakReference = (WeakReference) it.next();
                                x xVar2 = (x) weakReference.get();
                                if (xVar2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!r0) {
                                    r0 = xVar2.i(subMenuC4672D2);
                                }
                            }
                        }
                        z8 |= r0;
                        if (!z8) {
                            c(true);
                        }
                    } else if ((i & 1) == 0) {
                        c(true);
                    }
                    return z8;
                }
            }
        }
        z8 = true;
        o oVar22 = nVar.f38990T;
        if (oVar22 == null) {
        }
        if (!nVar.e()) {
        }
        return z8;
    }

    public final void r(x xVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f38958N;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar2 = (x) weakReference.get();
            if (xVar2 == null || xVar2 == xVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f38967y;
        int size = arrayList.size();
        int i4 = 0;
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                i9 = -1;
                break;
            } else if (((n) arrayList.get(i9)).f38994u == i) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 >= 0) {
            int size2 = arrayList.size() - i9;
            while (true) {
                int i10 = i4 + 1;
                if (i4 >= size2 || ((n) arrayList.get(i9)).f38994u != i) {
                    break;
                }
                if (i9 >= 0) {
                    ArrayList arrayList2 = this.f38967y;
                    if (i9 < arrayList2.size()) {
                        arrayList2.remove(i9);
                    }
                }
                i4 = i10;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f38967y;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (((n) arrayList.get(i4)).f38993n == i) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            ArrayList arrayList2 = this.f38967y;
            if (i4 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i4);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f38967y.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC4672D) item.getSubMenu()).s(bundle);
            }
        }
        int i4 = bundle.getInt("android:menu:expandedactionview");
        if (i4 <= 0 || (findItem = findItem(i4)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z8, boolean z9) {
        ArrayList arrayList = this.f38967y;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            n nVar = (n) arrayList.get(i4);
            if (nVar.f38994u == i) {
                nVar.f38987Q = (nVar.f38987Q & (-5)) | (z9 ? 4 : 0);
                nVar.setCheckable(z8);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z8) {
        this.f38960P = z8;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z8) {
        ArrayList arrayList = this.f38967y;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            n nVar = (n) arrayList.get(i4);
            if (nVar.f38994u == i) {
                nVar.setEnabled(z8);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z8) {
        ArrayList arrayList = this.f38967y;
        int size = arrayList.size();
        boolean z9 = false;
        for (int i4 = 0; i4 < size; i4++) {
            n nVar = (n) arrayList.get(i4);
            if (nVar.f38994u == i) {
                int i9 = nVar.f38987Q;
                int i10 = (i9 & (-9)) | (z8 ? 0 : 8);
                nVar.f38987Q = i10;
                if (i9 != i10) {
                    z9 = true;
                }
            }
        }
        if (z9) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z8) {
        this.f38964v = z8;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f38967y.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f38967y.size();
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
                ((SubMenuC4672D) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i4, Drawable drawable, View view) {
        if (view != null) {
            this.f38953H = view;
            this.f38951F = null;
            this.f38952G = null;
        } else {
            if (i > 0) {
                this.f38951F = this.f38963u.getText(i);
            } else if (charSequence != null) {
                this.f38951F = charSequence;
            }
            if (i4 > 0) {
                this.f38952G = E.a.b(this.f38962n, i4);
            } else if (drawable != null) {
                this.f38952G = drawable;
            }
            this.f38953H = null;
        }
        p(false);
    }

    public final void v() {
        this.f38954I = false;
        if (this.J) {
            this.J = false;
            p(this.f38955K);
        }
    }

    public final void w() {
        if (this.f38954I) {
            return;
        }
        this.f38954I = true;
        this.J = false;
        this.f38955K = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.f38963u.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f38963u.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i4, int i9, CharSequence charSequence) {
        return a(i, i4, i9, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i4, int i9, CharSequence charSequence) {
        n a9 = a(i, i4, i9, charSequence);
        SubMenuC4672D subMenuC4672D = new SubMenuC4672D(this.f38962n, this, a9);
        a9.f38979H = subMenuC4672D;
        subMenuC4672D.setHeaderTitle(a9.f38997x);
        return subMenuC4672D;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i4, int i9, int i10) {
        return a(i, i4, i9, this.f38963u.getString(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i4, int i9, int i10) {
        return addSubMenu(i, i4, i9, this.f38963u.getString(i10));
    }

    public l k() {
        return this;
    }
}
