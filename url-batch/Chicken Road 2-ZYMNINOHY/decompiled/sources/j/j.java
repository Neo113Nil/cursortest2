package j;

import E.AbstractC0003d;
import E.I;
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
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k.InterfaceC1224l;

/* loaded from: classes.dex */
public class j implements Menu {
    public static final int[] v = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f13647a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f13648b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13649c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13650d;

    /* renamed from: e, reason: collision with root package name */
    public e0.t f13651e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f13652f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f13653g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13654h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f13655i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f13656j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f13657k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f13658l;

    /* renamed from: m, reason: collision with root package name */
    public View f13659m;

    /* renamed from: t, reason: collision with root package name */
    public k f13664t;
    public boolean n = false;
    public boolean o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f13660p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f13661q = false;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f13662r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final CopyOnWriteArrayList f13663s = new CopyOnWriteArrayList();

    /* renamed from: u, reason: collision with root package name */
    public boolean f13665u = false;

    public j(Context context) {
        boolean z;
        boolean z4 = false;
        this.f13647a = context;
        Resources resources = context.getResources();
        this.f13648b = resources;
        this.f13652f = new ArrayList();
        this.f13653g = new ArrayList();
        this.f13654h = true;
        this.f13655i = new ArrayList();
        this.f13656j = new ArrayList();
        this.f13657k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = I.f377a;
            if (Build.VERSION.SDK_INT >= 28) {
                z = AbstractC0003d.p(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", ConstantDeviceInfo.APP_PLATFORM);
                z = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z) {
                z4 = true;
            }
        }
        this.f13650d = z4;
    }

    public final k a(int i4, int i5, int i6, CharSequence charSequence) {
        int i7;
        int i8 = ((-65536) & i6) >> 16;
        if (i8 < 0 || i8 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i9 = (v[i8] << 16) | (65535 & i6);
        k kVar = new k(this, i4, i5, i6, i9, charSequence);
        ArrayList arrayList = this.f13652f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i7 = 0;
                break;
            }
            if (((k) arrayList.get(size)).f13671d <= i9) {
                i7 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i7, kVar);
        o(true);
        return kVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i4, int i5, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        int i8;
        PackageManager packageManager = this.f13647a.getPackageManager();
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
            k a3 = a(i4, i5, i6, resolveInfo.loadLabel(packageManager));
            a3.setIcon(resolveInfo.loadIcon(packageManager));
            a3.f13674g = intent2;
            if (menuItemArr != null && (i8 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i8] = a3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(p pVar, Context context) {
        this.f13663s.add(new WeakReference(pVar));
        pVar.i(context, this);
        this.f13657k = true;
    }

    public final void c(boolean z) {
        if (this.f13661q) {
            return;
        }
        this.f13661q = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13663s;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            p pVar = (p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                pVar.d(this, z);
            }
        }
        this.f13661q = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        k kVar = this.f13664t;
        if (kVar != null) {
            d(kVar);
        }
        this.f13652f.clear();
        o(true);
    }

    public final void clearHeader() {
        this.f13658l = null;
        o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(k kVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13663s;
        boolean z = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f13664t == kVar) {
            s();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                p pVar = (p) weakReference.get();
                if (pVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z = pVar.j(kVar);
                    if (z) {
                        break;
                    }
                }
            }
            r();
            if (z) {
                this.f13664t = null;
            }
        }
        return z;
    }

    public boolean e(j jVar, MenuItem menuItem) {
        InterfaceC1224l interfaceC1224l;
        e0.t tVar = this.f13651e;
        if (tVar == null || (interfaceC1224l = ((ActionMenuView) tVar.f8416a).f4371x) == null) {
            return false;
        }
        ((Toolbar) ((e0.t) interfaceC1224l).f8416a).getClass();
        return false;
    }

    public boolean f(k kVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13663s;
        boolean z = false;
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
                z = pVar.a(kVar);
                if (z) {
                    break;
                }
            }
        }
        r();
        if (z) {
            this.f13664t = kVar;
        }
        return z;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i4) {
        MenuItem findItem;
        ArrayList arrayList = this.f13652f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            k kVar = (k) arrayList.get(i5);
            if (kVar.f13668a == i4) {
                return kVar;
            }
            if (kVar.hasSubMenu() && (findItem = kVar.o.findItem(i4)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final k g(int i4, KeyEvent keyEvent) {
        ArrayList arrayList = this.f13662r;
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
            return (k) arrayList.get(0);
        }
        boolean m4 = m();
        for (int i5 = 0; i5 < size; i5++) {
            k kVar = (k) arrayList.get(i5);
            char c4 = m4 ? kVar.f13677j : kVar.f13675h;
            char[] cArr = keyData.meta;
            if ((c4 == cArr[0] && (metaState & 2) == 0) || ((c4 == cArr[2] && (metaState & 2) != 0) || (m4 && c4 == '\b' && i4 == 67))) {
                return kVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i4) {
        return (MenuItem) this.f13652f.get(i4);
    }

    public final void h(List list, int i4, KeyEvent keyEvent) {
        boolean m4 = m();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i4 == 67) {
            ArrayList arrayList = this.f13652f;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                k kVar = (k) arrayList.get(i5);
                if (kVar.hasSubMenu()) {
                    kVar.o.h(list, i4, keyEvent);
                }
                char c4 = m4 ? kVar.f13677j : kVar.f13675h;
                if ((modifiers & 69647) == ((m4 ? kVar.f13678k : kVar.f13676i) & 69647) && c4 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c4 == cArr[0] || c4 == cArr[2] || (m4 && c4 == '\b' && i4 == 67)) && kVar.isEnabled()) {
                        list.add(kVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f13652f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (((k) arrayList.get(i4)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList k4 = k();
        if (this.f13657k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f13663s;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                p pVar = (p) weakReference.get();
                if (pVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z |= pVar.b();
                }
            }
            ArrayList arrayList = this.f13655i;
            ArrayList arrayList2 = this.f13656j;
            if (z) {
                arrayList.clear();
                arrayList2.clear();
                int size = k4.size();
                for (int i4 = 0; i4 < size; i4++) {
                    k kVar = (k) k4.get(i4);
                    if ((kVar.f13688x & 32) == 32) {
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
            this.f13657k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i4, KeyEvent keyEvent) {
        return g(i4, keyEvent) != null;
    }

    public final ArrayList k() {
        boolean z = this.f13654h;
        ArrayList arrayList = this.f13653g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f13652f;
        int size = arrayList2.size();
        for (int i4 = 0; i4 < size; i4++) {
            k kVar = (k) arrayList2.get(i4);
            if (kVar.isVisible()) {
                arrayList.add(kVar);
            }
        }
        this.f13654h = false;
        this.f13657k = true;
        return arrayList;
    }

    public boolean l() {
        return this.f13665u;
    }

    public boolean m() {
        return this.f13649c;
    }

    public boolean n() {
        return this.f13650d;
    }

    public final void o(boolean z) {
        if (this.n) {
            this.o = true;
            if (z) {
                this.f13660p = true;
                return;
            }
            return;
        }
        if (z) {
            this.f13654h = true;
            this.f13657k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13663s;
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
                pVar.g();
            }
        }
        r();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(MenuItem menuItem, l lVar, int i4) {
        boolean z;
        k kVar = (k) menuItem;
        if (kVar == null || !kVar.isEnabled()) {
            return false;
        }
        j jVar = kVar.n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = kVar.f13681p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(kVar)) && !jVar.e(jVar, kVar)) {
            Intent intent = kVar.f13674g;
            if (intent != null) {
                try {
                    jVar.f13647a.startActivity(intent);
                } catch (ActivityNotFoundException e4) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e4);
                }
            }
            z = false;
            if ((kVar.f13689y & 8) == 0 && kVar.z != null) {
                z |= kVar.expandActionView();
                if (z) {
                    c(true);
                }
            } else if (!kVar.hasSubMenu()) {
                if ((i4 & 4) == 0) {
                    c(false);
                }
                if (!kVar.hasSubMenu()) {
                    t tVar = new t(this.f13647a, this, kVar);
                    kVar.o = tVar;
                    tVar.setHeaderTitle(kVar.f13672e);
                }
                t tVar2 = kVar.o;
                CopyOnWriteArrayList copyOnWriteArrayList = this.f13663s;
                if (!copyOnWriteArrayList.isEmpty()) {
                    r0 = lVar != null ? lVar.f(tVar2) : false;
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        WeakReference weakReference = (WeakReference) it.next();
                        p pVar = (p) weakReference.get();
                        if (pVar == null) {
                            copyOnWriteArrayList.remove(weakReference);
                        } else if (!r0) {
                            r0 = pVar.f(tVar2);
                        }
                    }
                }
                z |= r0;
                if (!z) {
                    c(true);
                }
            } else if ((i4 & 1) == 0) {
                c(true);
            }
            return z;
        }
        z = true;
        if ((kVar.f13689y & 8) == 0) {
        }
        if (!kVar.hasSubMenu()) {
        }
        return z;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i4, int i5) {
        return p(findItem(i4), null, i5);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i4, KeyEvent keyEvent, int i5) {
        k g4 = g(i4, keyEvent);
        boolean p2 = g4 != null ? p(g4, null, i5) : false;
        if ((i5 & 2) != 0) {
            c(true);
        }
        return p2;
    }

    public final void q(int i4, CharSequence charSequence, int i5, View view) {
        if (view != null) {
            this.f13659m = view;
            this.f13658l = null;
        } else {
            if (i4 > 0) {
                this.f13658l = this.f13648b.getText(i4);
            } else if (charSequence != null) {
                this.f13658l = charSequence;
            }
            if (i5 > 0) {
                this.f13647a.getDrawable(i5);
            }
        }
        o(false);
    }

    public final void r() {
        this.n = false;
        if (this.o) {
            this.o = false;
            o(this.f13660p);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i4) {
        ArrayList arrayList = this.f13652f;
        int size = arrayList.size();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                i6 = -1;
                break;
            } else if (((k) arrayList.get(i6)).f13669b == i4) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 >= 0) {
            int size2 = arrayList.size() - i6;
            while (true) {
                int i7 = i5 + 1;
                if (i5 >= size2 || ((k) arrayList.get(i6)).f13669b != i4) {
                    break;
                }
                if (i6 >= 0) {
                    ArrayList arrayList2 = this.f13652f;
                    if (i6 < arrayList2.size()) {
                        arrayList2.remove(i6);
                    }
                }
                i5 = i7;
            }
            o(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i4) {
        ArrayList arrayList = this.f13652f;
        int size = arrayList.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i5 = -1;
                break;
            } else if (((k) arrayList.get(i5)).f13668a == i4) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 >= 0) {
            ArrayList arrayList2 = this.f13652f;
            if (i5 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i5);
            o(true);
        }
    }

    public final void s() {
        if (this.n) {
            return;
        }
        this.n = true;
        this.o = false;
        this.f13660p = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i4, boolean z, boolean z4) {
        ArrayList arrayList = this.f13652f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            k kVar = (k) arrayList.get(i5);
            if (kVar.f13669b == i4) {
                kVar.f13688x = (kVar.f13688x & (-5)) | (z4 ? 4 : 0);
                kVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f13665u = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i4, boolean z) {
        ArrayList arrayList = this.f13652f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            k kVar = (k) arrayList.get(i5);
            if (kVar.f13669b == i4) {
                kVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i4, boolean z) {
        ArrayList arrayList = this.f13652f;
        int size = arrayList.size();
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            k kVar = (k) arrayList.get(i5);
            if (kVar.f13669b == i4) {
                int i6 = kVar.f13688x;
                int i7 = (i6 & (-9)) | (z ? 0 : 8);
                kVar.f13688x = i7;
                if (i6 != i7) {
                    z4 = true;
                }
            }
        }
        if (z4) {
            o(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f13649c = z;
        o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f13652f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4) {
        return a(0, 0, 0, this.f13648b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4) {
        return addSubMenu(0, 0, 0, this.f13648b.getString(i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4, int i5, int i6, CharSequence charSequence) {
        return a(i4, i5, i6, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4, int i5, int i6, CharSequence charSequence) {
        k a3 = a(i4, i5, i6, charSequence);
        t tVar = new t(this.f13647a, this, a3);
        a3.o = tVar;
        tVar.setHeaderTitle(a3.f13672e);
        return tVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4, int i5, int i6, int i7) {
        return a(i4, i5, i6, this.f13648b.getString(i7));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4, int i5, int i6, int i7) {
        return addSubMenu(i4, i5, i6, this.f13648b.getString(i7));
    }

    public j j() {
        return this;
    }
}
