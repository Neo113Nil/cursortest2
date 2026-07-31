package j;

import D.E;
import D.G;
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
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k.InterfaceC0453l;
import u.AbstractC0666a;

/* loaded from: classes.dex */
public class j implements Menu {

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f4794u = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f4795a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f4796b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4797c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4798d;

    /* renamed from: e, reason: collision with root package name */
    public V5.g f4799e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f4800f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f4801g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4802h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f4803i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f4804j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4805k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f4806l;

    /* renamed from: s, reason: collision with root package name */
    public k f4813s;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4807m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4808n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4809o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4810p = false;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f4811q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f4812r = new CopyOnWriteArrayList();

    /* renamed from: t, reason: collision with root package name */
    public boolean f4814t = false;

    public j(Context context) {
        boolean z5;
        boolean z6 = false;
        this.f4795a = context;
        Resources resources = context.getResources();
        this.f4796b = resources;
        this.f4800f = new ArrayList();
        this.f4801g = new ArrayList();
        this.f4802h = true;
        this.f4803i = new ArrayList();
        this.f4804j = new ArrayList();
        this.f4805k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i7 = G.f242a;
            if (Build.VERSION.SDK_INT >= 28) {
                z5 = E.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID);
                z5 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z5) {
                z6 = true;
            }
        }
        this.f4798d = z6;
    }

    public final k a(int i7, int i8, int i9, CharSequence charSequence) {
        int i10;
        int i11 = ((-65536) & i9) >> 16;
        if (i11 < 0 || i11 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i12 = (f4794u[i11] << 16) | (65535 & i9);
        k kVar = new k(this, i7, i8, i9, i12, charSequence);
        ArrayList arrayList = this.f4800f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (((k) arrayList.get(size)).f4820d <= i12) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i10, kVar);
        o(true);
        return kVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i7, int i8, int i9, ComponentName componentName, Intent[] intentArr, Intent intent, int i10, MenuItem[] menuItemArr) {
        int i11;
        PackageManager packageManager = this.f4795a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i10 & 1) == 0) {
            removeGroup(i7);
        }
        for (int i12 = 0; i12 < size; i12++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i12);
            int i13 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i13 < 0 ? intent : intentArr[i13]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            k a7 = a(i7, i8, i9, resolveInfo.loadLabel(packageManager));
            a7.setIcon(resolveInfo.loadIcon(packageManager));
            a7.f4823g = intent2;
            if (menuItemArr != null && (i11 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i11] = a7;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(p pVar, Context context) {
        this.f4812r.add(new WeakReference(pVar));
        pVar.f(context, this);
        this.f4805k = true;
    }

    public final void c(boolean z5) {
        if (this.f4810p) {
            return;
        }
        this.f4810p = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4812r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            p pVar = (p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                pVar.a(this, z5);
            }
        }
        this.f4810p = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        k kVar = this.f4813s;
        if (kVar != null) {
            d(kVar);
        }
        this.f4800f.clear();
        o(true);
    }

    public final void clearHeader() {
        this.f4806l = null;
        o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(k kVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4812r;
        boolean z5 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f4813s == kVar) {
            s();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                p pVar = (p) weakReference.get();
                if (pVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z5 = pVar.i(kVar);
                    if (z5) {
                        break;
                    }
                }
            }
            r();
            if (z5) {
                this.f4813s = null;
            }
        }
        return z5;
    }

    public boolean e(j jVar, MenuItem menuItem) {
        InterfaceC0453l interfaceC0453l;
        V5.g gVar = this.f4799e;
        if (gVar == null || (interfaceC0453l = ((ActionMenuView) gVar.f2734g).f3297C) == null) {
            return false;
        }
        ((Toolbar) ((a6.d) interfaceC0453l).f3172f).getClass();
        return false;
    }

    public boolean f(k kVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4812r;
        boolean z5 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            p pVar = (p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z5 = pVar.c(kVar);
                if (z5) {
                    break;
                }
            }
        }
        r();
        if (z5) {
            this.f4813s = kVar;
        }
        return z5;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i7) {
        MenuItem findItem;
        ArrayList arrayList = this.f4800f;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            k kVar = (k) arrayList.get(i8);
            if (kVar.f4817a == i7) {
                return kVar;
            }
            if (kVar.hasSubMenu() && (findItem = kVar.f4831o.findItem(i7)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final k g(int i7, KeyEvent keyEvent) {
        ArrayList arrayList = this.f4811q;
        arrayList.clear();
        h(arrayList, i7, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (k) arrayList.get(0);
        }
        boolean m4 = m();
        for (int i8 = 0; i8 < size; i8++) {
            k kVar = (k) arrayList.get(i8);
            char c7 = m4 ? kVar.f4826j : kVar.f4824h;
            char[] cArr = keyData.meta;
            if ((c7 == cArr[0] && (metaState & 2) == 0) || ((c7 == cArr[2] && (metaState & 2) != 0) || (m4 && c7 == '\b' && i7 == 67))) {
                return kVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i7) {
        return (MenuItem) this.f4800f.get(i7);
    }

    public final void h(List list, int i7, KeyEvent keyEvent) {
        boolean m4 = m();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i7 == 67) {
            ArrayList arrayList = this.f4800f;
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                k kVar = (k) arrayList.get(i8);
                if (kVar.hasSubMenu()) {
                    kVar.f4831o.h(list, i7, keyEvent);
                }
                char c7 = m4 ? kVar.f4826j : kVar.f4824h;
                if ((modifiers & 69647) == ((m4 ? kVar.f4827k : kVar.f4825i) & 69647) && c7 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c7 == cArr[0] || c7 == cArr[2] || (m4 && c7 == '\b' && i7 == 67)) && kVar.isEnabled()) {
                        list.add(kVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f4800f;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((k) arrayList.get(i7)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList k4 = k();
        if (this.f4805k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f4812r;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z5 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                p pVar = (p) weakReference.get();
                if (pVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z5 |= pVar.g();
                }
            }
            ArrayList arrayList = this.f4803i;
            ArrayList arrayList2 = this.f4804j;
            if (z5) {
                arrayList.clear();
                arrayList2.clear();
                int size = k4.size();
                for (int i7 = 0; i7 < size; i7++) {
                    k kVar = (k) k4.get(i7);
                    if ((kVar.f4840x & 32) == 32) {
                        arrayList.add(kVar);
                    } else {
                        arrayList2.add(kVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(k());
            }
            this.f4805k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i7, KeyEvent keyEvent) {
        return g(i7, keyEvent) != null;
    }

    public final ArrayList k() {
        boolean z5 = this.f4802h;
        ArrayList arrayList = this.f4801g;
        if (!z5) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f4800f;
        int size = arrayList2.size();
        for (int i7 = 0; i7 < size; i7++) {
            k kVar = (k) arrayList2.get(i7);
            if (kVar.isVisible()) {
                arrayList.add(kVar);
            }
        }
        this.f4802h = false;
        this.f4805k = true;
        return arrayList;
    }

    public boolean l() {
        return this.f4814t;
    }

    public boolean m() {
        return this.f4797c;
    }

    public boolean n() {
        return this.f4798d;
    }

    public final void o(boolean z5) {
        if (this.f4807m) {
            this.f4808n = true;
            if (z5) {
                this.f4809o = true;
                return;
            }
            return;
        }
        if (z5) {
            this.f4802h = true;
            this.f4805k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4812r;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            p pVar = (p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                pVar.d();
            }
        }
        r();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(MenuItem menuItem, l lVar, int i7) {
        boolean z5;
        k kVar = (k) menuItem;
        if (kVar == null || !kVar.isEnabled()) {
            return false;
        }
        j jVar = kVar.f4830n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = kVar.f4832p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(kVar)) && !jVar.e(jVar, kVar)) {
            Intent intent = kVar.f4823g;
            if (intent != null) {
                try {
                    jVar.f4795a.startActivity(intent);
                } catch (ActivityNotFoundException e4) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e4);
                }
            }
            z5 = false;
            if ((kVar.y & 8) == 0 && kVar.f4841z != null) {
                z5 |= kVar.expandActionView();
                if (z5) {
                    c(true);
                }
            } else if (!kVar.hasSubMenu()) {
                if ((i7 & 4) == 0) {
                    c(false);
                }
                if (!kVar.hasSubMenu()) {
                    t tVar = new t(this.f4795a, this, kVar);
                    kVar.f4831o = tVar;
                    tVar.setHeaderTitle(kVar.f4821e);
                }
                t tVar2 = kVar.f4831o;
                CopyOnWriteArrayList copyOnWriteArrayList = this.f4812r;
                if (!copyOnWriteArrayList.isEmpty()) {
                    r0 = lVar != null ? lVar.k(tVar2) : false;
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        WeakReference weakReference = (WeakReference) it.next();
                        p pVar = (p) weakReference.get();
                        if (pVar == null) {
                            copyOnWriteArrayList.remove(weakReference);
                        } else if (!r0) {
                            r0 = pVar.k(tVar2);
                        }
                    }
                }
                z5 |= r0;
                if (!z5) {
                    c(true);
                }
            } else if ((i7 & 1) == 0) {
                c(true);
            }
            return z5;
        }
        z5 = true;
        if ((kVar.y & 8) == 0) {
        }
        if (!kVar.hasSubMenu()) {
        }
        return z5;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i7, int i8) {
        return p(findItem(i7), null, i8);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i7, KeyEvent keyEvent, int i8) {
        k g7 = g(i7, keyEvent);
        boolean p4 = g7 != null ? p(g7, null, i8) : false;
        if ((i8 & 2) != 0) {
            c(true);
        }
        return p4;
    }

    public final void q(int i7, CharSequence charSequence, int i8, View view) {
        if (view != null) {
            this.f4806l = null;
        } else {
            if (i7 > 0) {
                this.f4806l = this.f4796b.getText(i7);
            } else if (charSequence != null) {
                this.f4806l = charSequence;
            }
            if (i8 > 0) {
                AbstractC0666a.b(this.f4795a, i8);
            }
        }
        o(false);
    }

    public final void r() {
        this.f4807m = false;
        if (this.f4808n) {
            this.f4808n = false;
            o(this.f4809o);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i7) {
        ArrayList arrayList = this.f4800f;
        int size = arrayList.size();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                i9 = -1;
                break;
            } else if (((k) arrayList.get(i9)).f4818b == i7) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 >= 0) {
            int size2 = arrayList.size() - i9;
            while (true) {
                int i10 = i8 + 1;
                if (i8 >= size2 || ((k) arrayList.get(i9)).f4818b != i7) {
                    break;
                }
                if (i9 >= 0) {
                    ArrayList arrayList2 = this.f4800f;
                    if (i9 < arrayList2.size()) {
                        arrayList2.remove(i9);
                    }
                }
                i8 = i10;
            }
            o(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i7) {
        ArrayList arrayList = this.f4800f;
        int size = arrayList.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                i8 = -1;
                break;
            } else if (((k) arrayList.get(i8)).f4817a == i7) {
                break;
            } else {
                i8++;
            }
        }
        if (i8 >= 0) {
            ArrayList arrayList2 = this.f4800f;
            if (i8 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i8);
            o(true);
        }
    }

    public final void s() {
        if (this.f4807m) {
            return;
        }
        this.f4807m = true;
        this.f4808n = false;
        this.f4809o = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i7, boolean z5, boolean z6) {
        ArrayList arrayList = this.f4800f;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            k kVar = (k) arrayList.get(i8);
            if (kVar.f4818b == i7) {
                kVar.f4840x = (kVar.f4840x & (-5)) | (z6 ? 4 : 0);
                kVar.setCheckable(z5);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z5) {
        this.f4814t = z5;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i7, boolean z5) {
        ArrayList arrayList = this.f4800f;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            k kVar = (k) arrayList.get(i8);
            if (kVar.f4818b == i7) {
                kVar.setEnabled(z5);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i7, boolean z5) {
        ArrayList arrayList = this.f4800f;
        int size = arrayList.size();
        boolean z6 = false;
        for (int i8 = 0; i8 < size; i8++) {
            k kVar = (k) arrayList.get(i8);
            if (kVar.f4818b == i7) {
                int i9 = kVar.f4840x;
                int i10 = (i9 & (-9)) | (z5 ? 0 : 8);
                kVar.f4840x = i10;
                if (i9 != i10) {
                    z6 = true;
                }
            }
        }
        if (z6) {
            o(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z5) {
        this.f4797c = z5;
        o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f4800f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7) {
        return a(0, 0, 0, this.f4796b.getString(i7));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7) {
        return addSubMenu(0, 0, 0, this.f4796b.getString(i7));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i8, int i9, CharSequence charSequence) {
        return a(i7, i8, i9, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i8, int i9, CharSequence charSequence) {
        k a7 = a(i7, i8, i9, charSequence);
        t tVar = new t(this.f4795a, this, a7);
        a7.f4831o = tVar;
        tVar.setHeaderTitle(a7.f4821e);
        return tVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i8, int i9, int i10) {
        return a(i7, i8, i9, this.f4796b.getString(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i8, int i9, int i10) {
        return addSubMenu(i7, i8, i9, this.f4796b.getString(i10));
    }

    public j j() {
        return this;
    }
}
