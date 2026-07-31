package k;

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
import l.a2;
import q3.l0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class i implements Menu {

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f4069u = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f4070a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f4071b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4072c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4073d;

    /* renamed from: e, reason: collision with root package name */
    public b1.b f4074e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f4075f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f4076g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4077h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f4078j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4079k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f4080l;

    /* renamed from: s, reason: collision with root package name */
    public j f4087s;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4081m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4082n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4083o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4084p = false;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f4085q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f4086r = new CopyOnWriteArrayList();

    /* renamed from: t, reason: collision with root package name */
    public boolean f4088t = false;

    public i(Context context) {
        boolean z3;
        boolean z7 = false;
        this.f4070a = context;
        Resources resources = context.getResources();
        this.f4071b = resources;
        this.f4075f = new ArrayList();
        this.f4076g = new ArrayList();
        this.f4077h = true;
        this.i = new ArrayList();
        this.f4078j = new ArrayList();
        this.f4079k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = l0.f6125a;
            if (Build.VERSION.SDK_INT >= 28) {
                z3 = j3.a.l(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z3 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z3) {
                z7 = true;
            }
        }
        this.f4073d = z7;
    }

    public final j a(int i, int i8, int i9, CharSequence charSequence) {
        int i10;
        int i11 = ((-65536) & i9) >> 16;
        if (i11 < 0 || i11 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i12 = (f4069u[i11] << 16) | (65535 & i9);
        j jVar = new j(this, i, i8, i9, i12, charSequence);
        ArrayList arrayList = this.f4075f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (((j) arrayList.get(size)).f4092d <= i12) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i10, jVar);
        o(true);
        return jVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i8, int i9, ComponentName componentName, Intent[] intentArr, Intent intent, int i10, MenuItem[] menuItemArr) {
        int i11;
        PackageManager packageManager = this.f4070a.getPackageManager();
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
            j a8 = a(i, i8, i9, resolveInfo.loadLabel(packageManager));
            a8.setIcon(resolveInfo.loadIcon(packageManager));
            a8.f4095g = intent2;
            if (menuItemArr != null && (i11 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i11] = a8;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(o oVar, Context context) {
        this.f4086r.add(new WeakReference(oVar));
        oVar.i(context, this);
        this.f4079k = true;
    }

    public final void c(boolean z3) {
        if (this.f4084p) {
            return;
        }
        this.f4084p = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4086r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            o oVar = (o) weakReference.get();
            if (oVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                oVar.a(this, z3);
            }
        }
        this.f4084p = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        j jVar = this.f4087s;
        if (jVar != null) {
            d(jVar);
        }
        this.f4075f.clear();
        o(true);
    }

    public final void clearHeader() {
        this.f4080l = null;
        o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(j jVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4086r;
        boolean z3 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f4087s == jVar) {
            s();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                o oVar = (o) weakReference.get();
                if (oVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z3 = oVar.e(jVar);
                    if (z3) {
                        break;
                    }
                }
            }
            r();
            if (z3) {
                this.f4087s = null;
            }
        }
        return z3;
    }

    public boolean e(i iVar, MenuItem menuItem) {
        l.l lVar;
        b1.b bVar = this.f4074e;
        if (bVar == null || (lVar = ((ActionMenuView) bVar.f1050e).B) == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((a2) lVar).f4201a.J.f6119e).iterator();
        if (!it.hasNext()) {
            return false;
        }
        ((h4.h) it.next()).getClass();
        throw null;
    }

    public boolean f(j jVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4086r;
        boolean z3 = false;
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
                z3 = oVar.b(jVar);
                if (z3) {
                    break;
                }
            }
        }
        r();
        if (z3) {
            this.f4087s = jVar;
        }
        return z3;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        ArrayList arrayList = this.f4075f;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            j jVar = (j) arrayList.get(i8);
            if (jVar.f4089a == i) {
                return jVar;
            }
            if (jVar.hasSubMenu() && (findItem = jVar.f4102o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final j g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f4085q;
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
            return (j) arrayList.get(0);
        }
        boolean m7 = m();
        for (int i8 = 0; i8 < size; i8++) {
            j jVar = (j) arrayList.get(i8);
            char c8 = m7 ? jVar.f4097j : jVar.f4096h;
            char[] cArr = keyData.meta;
            if ((c8 == cArr[0] && (metaState & 2) == 0) || ((c8 == cArr[2] && (metaState & 2) != 0) || (m7 && c8 == '\b' && i == 67))) {
                return jVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f4075f.get(i);
    }

    public final void h(List list, int i, KeyEvent keyEvent) {
        boolean m7 = m();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.f4075f;
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                j jVar = (j) arrayList.get(i8);
                if (jVar.hasSubMenu()) {
                    jVar.f4102o.h(list, i, keyEvent);
                }
                char c8 = m7 ? jVar.f4097j : jVar.f4096h;
                if ((modifiers & 69647) == ((m7 ? jVar.f4098k : jVar.i) & 69647) && c8 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c8 == cArr[0] || c8 == cArr[2] || (m7 && c8 == '\b' && i == 67)) && jVar.isEnabled()) {
                        list.add(jVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f4075f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((j) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList k3 = k();
        if (this.f4079k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f4086r;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z3 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                o oVar = (o) weakReference.get();
                if (oVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z3 |= oVar.j();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.f4078j;
            if (z3) {
                arrayList.clear();
                arrayList2.clear();
                int size = k3.size();
                for (int i = 0; i < size; i++) {
                    j jVar = (j) k3.get(i);
                    if ((jVar.f4111x & 32) == 32) {
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
            this.f4079k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public final ArrayList k() {
        boolean z3 = this.f4077h;
        ArrayList arrayList = this.f4076g;
        if (!z3) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f4075f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            j jVar = (j) arrayList2.get(i);
            if (jVar.isVisible()) {
                arrayList.add(jVar);
            }
        }
        this.f4077h = false;
        this.f4079k = true;
        return arrayList;
    }

    public boolean l() {
        return this.f4088t;
    }

    public boolean m() {
        return this.f4072c;
    }

    public boolean n() {
        return this.f4073d;
    }

    public final void o(boolean z3) {
        if (this.f4081m) {
            this.f4082n = true;
            if (z3) {
                this.f4083o = true;
                return;
            }
            return;
        }
        if (z3) {
            this.f4077h = true;
            this.f4079k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4086r;
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
                oVar.f();
            }
        }
        r();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(MenuItem menuItem, k kVar, int i) {
        boolean z3;
        j jVar = (j) menuItem;
        if (jVar == null || !jVar.isEnabled()) {
            return false;
        }
        i iVar = jVar.f4101n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = jVar.f4103p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(jVar)) && !iVar.e(iVar, jVar)) {
            Intent intent = jVar.f4095g;
            if (intent != null) {
                try {
                    iVar.f4070a.startActivity(intent);
                } catch (ActivityNotFoundException e8) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e8);
                }
            }
            z3 = false;
            if ((jVar.f4112y & 8) == 0 && jVar.f4113z != null) {
                z3 |= jVar.expandActionView();
                if (z3) {
                    c(true);
                }
            } else if (!jVar.hasSubMenu()) {
                if ((i & 4) == 0) {
                    c(false);
                }
                if (!jVar.hasSubMenu()) {
                    s sVar = new s(this.f4070a, this, jVar);
                    jVar.f4102o = sVar;
                    sVar.setHeaderTitle(jVar.f4093e);
                }
                s sVar2 = jVar.f4102o;
                CopyOnWriteArrayList copyOnWriteArrayList = this.f4086r;
                if (!copyOnWriteArrayList.isEmpty()) {
                    r0 = kVar != null ? kVar.c(sVar2) : false;
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        WeakReference weakReference = (WeakReference) it.next();
                        o oVar = (o) weakReference.get();
                        if (oVar == null) {
                            copyOnWriteArrayList.remove(weakReference);
                        } else if (!r0) {
                            r0 = oVar.c(sVar2);
                        }
                    }
                }
                z3 |= r0;
                if (!z3) {
                    c(true);
                }
            } else if ((i & 1) == 0) {
                c(true);
            }
            return z3;
        }
        z3 = true;
        if ((jVar.f4112y & 8) == 0) {
        }
        if (!jVar.hasSubMenu()) {
        }
        return z3;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i8) {
        return p(findItem(i), null, i8);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i8) {
        j g3 = g(i, keyEvent);
        boolean p7 = g3 != null ? p(g3, null, i8) : false;
        if ((i8 & 2) != 0) {
            c(true);
        }
        return p7;
    }

    public final void q(int i, CharSequence charSequence, int i8, View view) {
        if (view != null) {
            this.f4080l = null;
        } else {
            if (i > 0) {
                this.f4080l = this.f4071b.getText(i);
            } else if (charSequence != null) {
                this.f4080l = charSequence;
            }
            if (i8 > 0) {
                this.f4070a.getDrawable(i8);
            }
        }
        o(false);
    }

    public final void r() {
        this.f4081m = false;
        if (this.f4082n) {
            this.f4082n = false;
            o(this.f4083o);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f4075f;
        int size = arrayList.size();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                i9 = -1;
                break;
            } else if (((j) arrayList.get(i9)).f4090b == i) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 >= 0) {
            int size2 = arrayList.size() - i9;
            while (true) {
                int i10 = i8 + 1;
                if (i8 >= size2 || ((j) arrayList.get(i9)).f4090b != i) {
                    break;
                }
                if (i9 >= 0 && i9 < arrayList.size()) {
                    arrayList.remove(i9);
                }
                i8 = i10;
            }
            o(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f4075f;
        int size = arrayList.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                i8 = -1;
                break;
            } else if (((j) arrayList.get(i8)).f4089a == i) {
                break;
            } else {
                i8++;
            }
        }
        if (i8 < 0 || i8 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i8);
        o(true);
    }

    public final void s() {
        if (this.f4081m) {
            return;
        }
        this.f4081m = true;
        this.f4082n = false;
        this.f4083o = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z3, boolean z7) {
        ArrayList arrayList = this.f4075f;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            j jVar = (j) arrayList.get(i8);
            if (jVar.f4090b == i) {
                jVar.f4111x = (jVar.f4111x & (-5)) | (z7 ? 4 : 0);
                jVar.setCheckable(z3);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z3) {
        this.f4088t = z3;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z3) {
        ArrayList arrayList = this.f4075f;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            j jVar = (j) arrayList.get(i8);
            if (jVar.f4090b == i) {
                jVar.setEnabled(z3);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z3) {
        ArrayList arrayList = this.f4075f;
        int size = arrayList.size();
        boolean z7 = false;
        for (int i8 = 0; i8 < size; i8++) {
            j jVar = (j) arrayList.get(i8);
            if (jVar.f4090b == i) {
                int i9 = jVar.f4111x;
                int i10 = (i9 & (-9)) | (z3 ? 0 : 8);
                jVar.f4111x = i10;
                if (i9 != i10) {
                    z7 = true;
                }
            }
        }
        if (z7) {
            o(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z3) {
        this.f4072c = z3;
        o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f4075f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.f4071b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f4071b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i8, int i9, CharSequence charSequence) {
        return a(i, i8, i9, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i8, int i9, CharSequence charSequence) {
        j a8 = a(i, i8, i9, charSequence);
        s sVar = new s(this.f4070a, this, a8);
        a8.f4102o = sVar;
        sVar.setHeaderTitle(a8.f4093e);
        return sVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i8, int i9, int i10) {
        return a(i, i8, i9, this.f4071b.getString(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i8, int i9, int i10) {
        return addSubMenu(i, i8, i9, this.f4071b.getString(i10));
    }

    public i j() {
        return this;
    }
}
