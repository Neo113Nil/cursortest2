package l;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.ActionMenuView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import m.t1;
import o3.d0;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class i implements Menu {

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f5664u = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f5665a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f5666b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5667c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5668d;

    /* renamed from: e, reason: collision with root package name */
    public d f5669e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f5670f;
    public final ArrayList g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5671h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f5672i;
    public final ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5673k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f5674l;

    /* renamed from: s, reason: collision with root package name */
    public j f5681s;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5675m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5676n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5677o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5678p = false;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f5679q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f5680r = new CopyOnWriteArrayList();

    /* renamed from: t, reason: collision with root package name */
    public boolean f5682t = false;

    public i(Context context) {
        boolean z10;
        boolean z11 = false;
        this.f5665a = context;
        Resources resources = context.getResources();
        this.f5666b = resources;
        this.f5670f = new ArrayList();
        this.g = new ArrayList();
        this.f5671h = true;
        this.f5672i = new ArrayList();
        this.j = new ArrayList();
        this.f5673k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = d0.f7385a;
            if (Build.VERSION.SDK_INT >= 28) {
                z10 = e3.k.q(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z10 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z10) {
                z11 = true;
            }
        }
        this.f5668d = z11;
    }

    public final j a(int i3, int i10, int i11, CharSequence charSequence) {
        int i12;
        int i13 = ((-65536) & i11) >> 16;
        if (i13 < 0 || i13 >= 6) {
            a1.e("order does not contain a valid category.");
            return null;
        }
        int i14 = (f5664u[i13] << 16) | (65535 & i11);
        j jVar = new j(this, i3, i10, i11, i14, charSequence);
        ArrayList arrayList = this.f5670f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i12 = 0;
                break;
            }
            if (((j) arrayList.get(size)).f5686d <= i14) {
                i12 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i12, jVar);
        o(true);
        return jVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3) {
        return a(0, 0, 0, this.f5666b.getString(i3));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i3, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        int i13;
        PackageManager packageManager = this.f5665a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i12 & 1) == 0) {
            removeGroup(i3);
        }
        for (int i14 = 0; i14 < size; i14++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i14);
            int i15 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i15 < 0 ? intent : intentArr[i15]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            j a9 = a(i3, i10, i11, resolveInfo.loadLabel(packageManager));
            a9.setIcon(resolveInfo.loadIcon(packageManager));
            a9.g = intent2;
            if (menuItemArr != null && (i13 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i13] = a9;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3, int i10, int i11, CharSequence charSequence) {
        j a9 = a(i3, i10, i11, charSequence);
        s sVar = new s(this.f5665a, this, a9);
        a9.f5695o = sVar;
        sVar.setHeaderTitle(a9.f5687e);
        return sVar;
    }

    public final void b(o oVar, Context context) {
        this.f5680r.add(new WeakReference(oVar));
        oVar.g(context, this);
        this.f5673k = true;
    }

    public final void c(boolean z10) {
        if (this.f5678p) {
            return;
        }
        this.f5678p = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f5680r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            o oVar = (o) weakReference.get();
            if (oVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                oVar.b(this, z10);
            }
        }
        this.f5678p = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        j jVar = this.f5681s;
        if (jVar != null) {
            d(jVar);
        }
        this.f5670f.clear();
        o(true);
    }

    public final void clearHeader() {
        this.f5674l = null;
        o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(j jVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f5680r;
        boolean z10 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f5681s == jVar) {
            s();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                o oVar = (o) weakReference.get();
                if (oVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z10 = oVar.k(jVar);
                    if (z10) {
                        break;
                    }
                }
            }
            r();
            if (z10) {
                this.f5681s = null;
            }
        }
        return z10;
    }

    public boolean e(i iVar, MenuItem menuItem) {
        m.m mVar;
        d dVar = this.f5669e;
        if (dVar == null || (mVar = ((ActionMenuView) dVar.f5643e).M) == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((t1) mVar).f6182a.U.f5643e).iterator();
        if (!it.hasNext()) {
            return false;
        }
        ((f4.h) it.next()).getClass();
        throw null;
    }

    public boolean f(j jVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f5680r;
        boolean z10 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            o oVar = (o) weakReference.get();
            if (oVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z10 = oVar.f(jVar);
                if (z10) {
                    break;
                }
            }
        }
        r();
        if (z10) {
            this.f5681s = jVar;
        }
        return z10;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i3) {
        MenuItem findItem;
        ArrayList arrayList = this.f5670f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            j jVar = (j) arrayList.get(i10);
            if (jVar.f5683a == i3) {
                return jVar;
            }
            if (jVar.hasSubMenu() && (findItem = jVar.f5695o.findItem(i3)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final j g(int i3, KeyEvent keyEvent) {
        ArrayList arrayList = this.f5679q;
        arrayList.clear();
        h(arrayList, i3, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (j) arrayList.get(0);
        }
        boolean m10 = m();
        for (int i10 = 0; i10 < size; i10++) {
            j jVar = (j) arrayList.get(i10);
            char c10 = m10 ? jVar.j : jVar.f5689h;
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (m10 && c10 == '\b' && i3 == 67))) {
                return jVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i3) {
        return (MenuItem) this.f5670f.get(i3);
    }

    public final void h(List list, int i3, KeyEvent keyEvent) {
        boolean m10 = m();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i3 == 67) {
            ArrayList arrayList = this.f5670f;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                j jVar = (j) arrayList.get(i10);
                if (jVar.hasSubMenu()) {
                    jVar.f5695o.h(list, i3, keyEvent);
                }
                char c10 = m10 ? jVar.j : jVar.f5689h;
                if ((modifiers & 69647) == ((m10 ? jVar.f5691k : jVar.f5690i) & 69647) && c10 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c10 == cArr[0] || c10 == cArr[2] || (m10 && c10 == '\b' && i3 == 67)) && jVar.isEnabled()) {
                        list.add(jVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f5670f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((j) arrayList.get(i3)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList k10 = k();
        if (this.f5673k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f5680r;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                o oVar = (o) weakReference.get();
                if (oVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z10 |= oVar.h();
                }
            }
            ArrayList arrayList = this.f5672i;
            ArrayList arrayList2 = this.j;
            if (z10) {
                arrayList.clear();
                arrayList2.clear();
                int size = k10.size();
                for (int i3 = 0; i3 < size; i3++) {
                    j jVar = (j) k10.get(i3);
                    if ((jVar.f5704x & 32) == 32) {
                        arrayList.add(jVar);
                    } else {
                        arrayList2.add(jVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(k());
            }
            this.f5673k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i3, KeyEvent keyEvent) {
        return g(i3, keyEvent) != null;
    }

    public final ArrayList k() {
        boolean z10 = this.f5671h;
        ArrayList arrayList = this.g;
        if (!z10) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f5670f;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            j jVar = (j) arrayList2.get(i3);
            if (jVar.isVisible()) {
                arrayList.add(jVar);
            }
        }
        this.f5671h = false;
        this.f5673k = true;
        return arrayList;
    }

    public boolean l() {
        return this.f5682t;
    }

    public boolean m() {
        return this.f5667c;
    }

    public boolean n() {
        return this.f5668d;
    }

    public final void o(boolean z10) {
        if (this.f5675m) {
            this.f5676n = true;
            if (z10) {
                this.f5677o = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f5671h = true;
            this.f5673k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f5680r;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            o oVar = (o) weakReference.get();
            if (oVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                oVar.c();
            }
        }
        r();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(MenuItem menuItem, k kVar, int i3) {
        boolean z10;
        j jVar = (j) menuItem;
        if (jVar == null || !jVar.isEnabled()) {
            return false;
        }
        i iVar = jVar.f5694n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = jVar.f5696p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(jVar)) && !iVar.e(iVar, jVar)) {
            Intent intent = jVar.g;
            if (intent != null) {
                try {
                    iVar.f5665a.startActivity(intent);
                } catch (ActivityNotFoundException e2) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
                }
            }
            z10 = false;
            if ((jVar.f5705y & 8) == 0 && jVar.f5706z != null) {
                z10 |= jVar.expandActionView();
                if (z10) {
                    c(true);
                }
            } else if (!jVar.hasSubMenu()) {
                if ((i3 & 4) == 0) {
                    c(false);
                }
                if (!jVar.hasSubMenu()) {
                    s sVar = new s(this.f5665a, this, jVar);
                    jVar.f5695o = sVar;
                    sVar.setHeaderTitle(jVar.f5687e);
                }
                s sVar2 = jVar.f5695o;
                CopyOnWriteArrayList copyOnWriteArrayList = this.f5680r;
                if (!copyOnWriteArrayList.isEmpty()) {
                    r0 = kVar != null ? kVar.i(sVar2) : false;
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        WeakReference weakReference = (WeakReference) it.next();
                        o oVar = (o) weakReference.get();
                        if (oVar == null) {
                            copyOnWriteArrayList.remove(weakReference);
                        } else if (!r0) {
                            r0 = oVar.i(sVar2);
                        }
                    }
                }
                z10 |= r0;
                if (!z10) {
                    c(true);
                }
            } else if ((i3 & 1) == 0) {
                c(true);
            }
            return z10;
        }
        z10 = true;
        if ((jVar.f5705y & 8) == 0) {
        }
        if (!jVar.hasSubMenu()) {
        }
        return z10;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i3, int i10) {
        return p(findItem(i3), null, i10);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i3, KeyEvent keyEvent, int i10) {
        j g = g(i3, keyEvent);
        boolean p4 = g != null ? p(g, null, i10) : false;
        if ((i10 & 2) != 0) {
            c(true);
        }
        return p4;
    }

    public final void q(int i3, CharSequence charSequence, int i10, View view) {
        if (view != null) {
            this.f5674l = null;
        } else {
            if (i3 > 0) {
                this.f5674l = this.f5666b.getText(i3);
            } else if (charSequence != null) {
                this.f5674l = charSequence;
            }
            if (i10 > 0) {
                this.f5665a.getDrawable(i10);
            }
        }
        o(false);
    }

    public final void r() {
        this.f5675m = false;
        if (this.f5676n) {
            this.f5676n = false;
            o(this.f5677o);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i3) {
        ArrayList arrayList = this.f5670f;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (((j) arrayList.get(i11)).f5684b == i3) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            int size2 = arrayList.size() - i11;
            while (true) {
                int i12 = i10 + 1;
                if (i10 >= size2 || ((j) arrayList.get(i11)).f5684b != i3) {
                    break;
                }
                if (i11 >= 0 && i11 < arrayList.size()) {
                    arrayList.remove(i11);
                }
                i10 = i12;
            }
            o(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i3) {
        ArrayList arrayList = this.f5670f;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (((j) arrayList.get(i10)).f5683a == i3) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i10);
        o(true);
    }

    public final void s() {
        if (this.f5675m) {
            return;
        }
        this.f5675m = true;
        this.f5676n = false;
        this.f5677o = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i3, boolean z10, boolean z11) {
        ArrayList arrayList = this.f5670f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            j jVar = (j) arrayList.get(i10);
            if (jVar.f5684b == i3) {
                jVar.f5704x = (jVar.f5704x & (-5)) | (z11 ? 4 : 0);
                jVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f5682t = z10;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i3, boolean z10) {
        ArrayList arrayList = this.f5670f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            j jVar = (j) arrayList.get(i10);
            if (jVar.f5684b == i3) {
                jVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i3, boolean z10) {
        ArrayList arrayList = this.f5670f;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            j jVar = (j) arrayList.get(i10);
            if (jVar.f5684b == i3) {
                int i11 = jVar.f5704x;
                int i12 = (i11 & (-9)) | (z10 ? 0 : 8);
                jVar.f5704x = i12;
                if (i11 != i12) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            o(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f5667c = z10;
        o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f5670f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3, int i10, int i11, CharSequence charSequence) {
        return a(i3, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3, int i10, int i11, int i12) {
        return a(i3, i10, i11, this.f5666b.getString(i12));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3) {
        return addSubMenu(0, 0, 0, this.f5666b.getString(i3));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3, int i10, int i11, int i12) {
        return addSubMenu(i3, i10, i11, this.f5666b.getString(i12));
    }

    public i j() {
        return this;
    }
}
