package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class gd implements vn {
    private static final int[] l = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public gb b;
    public final ArrayList c;
    public final ArrayList d;
    CharSequence e;
    Drawable f;
    View g;
    public gf j;
    public boolean k;
    private final Resources m;
    private boolean n;
    private final boolean o;
    private final ArrayList p;
    private boolean q;
    private final ArrayList r;
    private boolean s;
    private int t = 0;
    public boolean h = false;
    private boolean u = false;
    private boolean v = false;
    private boolean w = false;
    private final ArrayList x = new ArrayList();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    private boolean y = false;

    public gd(Context context) {
        boolean shouldShowMenuShortcutsWhenKeyboardPresent;
        boolean z = false;
        this.a = context;
        Resources resources = context.getResources();
        this.m = resources;
        this.c = new ArrayList();
        this.p = new ArrayList();
        this.q = true;
        this.d = new ArrayList();
        this.r = new ArrayList();
        this.s = true;
        if (resources.getConfiguration().keyboard != 1) {
            shouldShowMenuShortcutsWhenKeyboardPresent = ViewConfiguration.get(context).shouldShowMenuShortcutsWhenKeyboardPresent();
            if (shouldShowMenuShortcutsWhenKeyboardPresent) {
                z = true;
            }
        }
        this.o = z;
    }

    private final void D(int i, boolean z) {
        if (i >= 0) {
            ArrayList arrayList = this.c;
            if (i >= arrayList.size()) {
                return;
            }
            arrayList.remove(i);
            if (z) {
                l(true);
            }
        }
    }

    final void A() {
        this.s = true;
        l(true);
    }

    final void B() {
        this.q = true;
        l(true);
    }

    public final void C() {
        this.t = 1;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return c(0, 0, 0, this.m.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem c = c(i, i2, i3, resolveInfo.loadLabel(packageManager));
            c.setIcon(resolveInfo.loadIcon(packageManager));
            ((gf) c).e = intent2;
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = c;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        gf gfVar = (gf) c(i, i2, i3, charSequence);
        gw gwVar = new gw(this.a, this, gfVar);
        gfVar.l(gwVar);
        return gwVar;
    }

    final gf b(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.x;
        arrayList.clear();
        j(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (gf) arrayList.get(0);
        }
        boolean x = x();
        for (int i2 = 0; i2 < size; i2++) {
            gf gfVar = (gf) arrayList.get(i2);
            char c = x ? gfVar.h : gfVar.f;
            if ((c == keyData.meta[0] && (metaState & 2) == 0) || ((c == keyData.meta[2] && (metaState & 2) != 0) || (x && c == '\b' && i == 67))) {
                return gfVar;
            }
        }
        return null;
    }

    protected final MenuItem c(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = i3 >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (l[i5] << 16) | ((char) i3);
        gf gfVar = new gf(this, i, i2, i3, i6, charSequence, this.t);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((gf) arrayList.get(size)).c <= i6) {
                i4 = size + 1;
                break;
            }
        }
        arrayList.add(i4, gfVar);
        l(true);
        return gfVar;
    }

    @Override // android.view.Menu
    public final void clear() {
        gf gfVar = this.j;
        if (gfVar != null) {
            t(gfVar);
        }
        this.c.clear();
        l(true);
    }

    public final void clearHeader() {
        this.f = null;
        this.e = null;
        this.g = null;
        l(false);
    }

    @Override // android.view.Menu
    public final void close() {
        i(true);
    }

    protected String d() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList e() {
        k();
        return this.r;
    }

    public final ArrayList f() {
        boolean z = this.q;
        ArrayList arrayList = this.p;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.c;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            gf gfVar = (gf) arrayList2.get(i);
            if (gfVar.isVisible()) {
                arrayList.add(gfVar);
            }
        }
        this.q = false;
        this.s = true;
        return arrayList;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            gf gfVar = (gf) this.c.get(i2);
            if (gfVar.a == i) {
                return gfVar;
            }
            if (gfVar.hasSubMenu() && (findItem = gfVar.k.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final void g(gp gpVar) {
        h(gpVar, this.a);
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.c.get(i);
    }

    public final void h(gp gpVar, Context context) {
        this.i.add(new WeakReference(gpVar));
        gpVar.c(context, this);
        this.s = true;
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.k) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((gf) this.c.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i(boolean z) {
        if (this.w) {
            return;
        }
        this.w = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.i;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            gp gpVar = (gp) weakReference.get();
            if (gpVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                gpVar.d(this, z);
            }
        }
        this.w = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return b(i, keyEvent) != null;
    }

    final void j(List list, int i, KeyEvent keyEvent) {
        boolean x = x();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData)) {
            if (i != 67) {
                return;
            } else {
                i = 67;
            }
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            gf gfVar = (gf) arrayList.get(i2);
            if (gfVar.hasSubMenu()) {
                gfVar.k.j(list, i, keyEvent);
            }
            char c = x ? gfVar.h : gfVar.f;
            if ((modifiers & 69647) == ((x ? gfVar.i : gfVar.g) & 69647) && c != 0 && ((c == keyData.meta[0] || c == keyData.meta[2] || (x && c == '\b' && i == 67)) && gfVar.isEnabled())) {
                list.add(gfVar);
            }
        }
    }

    public final void k() {
        ArrayList f = f();
        if (this.s) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.i;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                gp gpVar = (gp) weakReference.get();
                if (gpVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z |= gpVar.f();
                }
            }
            ArrayList arrayList = this.d;
            if (z) {
                arrayList.clear();
                ArrayList arrayList2 = this.r;
                arrayList2.clear();
                int size = f.size();
                for (int i = 0; i < size; i++) {
                    gf gfVar = (gf) f.get(i);
                    if (gfVar.o()) {
                        arrayList.add(gfVar);
                    } else {
                        arrayList2.add(gfVar);
                    }
                }
            } else {
                arrayList.clear();
                ArrayList arrayList3 = this.r;
                arrayList3.clear();
                arrayList3.addAll(f());
            }
            this.s = false;
        }
    }

    public void l(boolean z) {
        if (this.h) {
            this.u = true;
            if (z) {
                this.v = true;
                return;
            }
            return;
        }
        if (z) {
            this.q = true;
            this.s = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.i;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            gp gpVar = (gp) weakReference.get();
            if (gpVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                gpVar.j();
            }
        }
        r();
    }

    public final void m(gp gpVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.i;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            gp gpVar2 = (gp) weakReference.get();
            if (gpVar2 == null || gpVar2 == gpVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    public final void n(Bundle bundle) {
        MenuItem findItem;
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(d());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((gw) item.getSubMenu()).n(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public final void o(Bundle bundle) {
        int size = size();
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
                ((gw) item.getSubMenu()).o(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(d(), sparseArray);
        }
    }

    public void p(gb gbVar) {
        this.b = gbVar;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return z(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        gf b = b(i, keyEvent);
        boolean z = b != null ? z(b, null, i2) : false;
        if ((i2 & 2) != 0) {
            i(true);
        }
        return z;
    }

    public final void q(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.g = view;
            this.e = null;
            this.f = null;
        } else {
            if (i > 0) {
                this.e = this.m.getText(i);
            } else if (charSequence != null) {
                this.e = charSequence;
            }
            if (i2 > 0) {
                this.f = this.a.getDrawable(i2);
            } else if (drawable != null) {
                this.f = drawable;
            }
            this.g = null;
        }
        l(false);
    }

    public final void r() {
        this.h = false;
        if (this.u) {
            this.u = false;
            l(this.v);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((gf) this.c.get(i2)).b == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            ArrayList arrayList = this.c;
            int size2 = arrayList.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size2 || ((gf) arrayList.get(i2)).b != i) {
                    break;
                }
                D(i2, false);
                i3 = i4;
            }
            l(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((gf) this.c.get(i2)).a == i) {
                break;
            } else {
                i2++;
            }
        }
        D(i2, true);
    }

    public final void s() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.u = false;
        this.v = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            gf gfVar = (gf) arrayList.get(i2);
            if (gfVar.b == i) {
                gfVar.j(z2);
                gfVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.y = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            gf gfVar = (gf) arrayList.get(i2);
            if (gfVar.b == i) {
                gfVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            gf gfVar = (gf) arrayList.get(i2);
            if (gfVar.b == i && gfVar.s(z)) {
                z2 = true;
            }
        }
        if (z2) {
            l(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.n = z;
        l(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.c.size();
    }

    public boolean t(gf gfVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.i;
        boolean z = false;
        if (!copyOnWriteArrayList.isEmpty() && this.j == gfVar) {
            s();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                gp gpVar = (gp) weakReference.get();
                if (gpVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z = gpVar.h(gfVar);
                    if (z) {
                        break;
                    }
                }
            }
            r();
            if (z) {
                this.j = null;
            }
        }
        return z;
    }

    public boolean u(gd gdVar, MenuItem menuItem) {
        gb gbVar = this.b;
        return gbVar != null && gbVar.J(gdVar, menuItem);
    }

    public boolean v(gf gfVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.i;
        boolean z = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            gp gpVar = (gp) weakReference.get();
            if (gpVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z = gpVar.i(gfVar);
                if (z) {
                    break;
                }
            }
        }
        r();
        if (z) {
            this.j = gfVar;
        }
        return z;
    }

    public boolean w() {
        return this.y;
    }

    public boolean x() {
        return this.n;
    }

    public boolean y() {
        return this.o;
    }

    public final boolean z(MenuItem menuItem, gp gpVar, int i) {
        boolean g;
        gf gfVar = (gf) menuItem;
        if (gfVar != null && gfVar.isEnabled()) {
            boolean n = gfVar.n();
            tw twVar = gfVar.p;
            boolean z = twVar != null && twVar.c();
            if (gfVar.m()) {
                boolean expandActionView = gfVar.expandActionView() | n;
                if (!expandActionView) {
                    return expandActionView;
                }
                i(true);
                return true;
            }
            if (!gfVar.hasSubMenu() && !z) {
                if ((i & 1) != 0) {
                    return n;
                }
                i(true);
                return n;
            }
            if ((i & 4) == 0) {
                i(false);
            }
            if (!gfVar.hasSubMenu()) {
                gfVar.l(new gw(this.a, this, gfVar));
            }
            gw gwVar = gfVar.k;
            if (z) {
                twVar.b(gwVar);
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.i;
            if (copyOnWriteArrayList.isEmpty()) {
                g = false;
            } else {
                g = gpVar != null ? gpVar.g(gwVar) : false;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    gp gpVar2 = (gp) weakReference.get();
                    if (gpVar2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!g) {
                        g = gpVar2.g(gwVar);
                    }
                }
            }
            boolean z2 = n | g;
            if (z2) {
                return z2;
            }
            i(true);
        }
        return false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return c(i, i2, i3, this.m.getString(i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return c(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return c(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.m.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.m.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public gd a() {
        return this;
    }
}
