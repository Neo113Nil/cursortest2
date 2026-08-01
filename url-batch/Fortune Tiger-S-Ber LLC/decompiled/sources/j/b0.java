package j;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class b0 extends androidx.fragment.app.j implements Menu {
    public final m c;

    public b0(Context context, m mVar) {
        super(context);
        if (mVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.c = mVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return g(this.c.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i4, int i5, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.c.addIntentOptions(i4, i5, i6, componentName, intentArr, intent, i7, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i8 = 0; i8 < length; i8++) {
                menuItemArr[i8] = g(menuItemArr2[i8]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        n.j jVar = (n.j) this.f432b;
        if (jVar != null) {
            jVar.clear();
        }
        this.c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i4) {
        return g(this.c.findItem(i4));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i4) {
        return g(this.c.getItem(i4));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i4, KeyEvent keyEvent) {
        return this.c.isShortcutKey(i4, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i4, int i5) {
        return this.c.performIdentifierAction(i4, i5);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i4, KeyEvent keyEvent, int i5) {
        return this.c.performShortcut(i4, keyEvent, i5);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i4) {
        if (((n.j) this.f432b) != null) {
            int i5 = 0;
            while (true) {
                n.j jVar = (n.j) this.f432b;
                if (i5 >= jVar.h) {
                    break;
                }
                if (((e0.a) jVar.f(i5)).getGroupId() == i4) {
                    ((n.j) this.f432b).g(i5);
                    i5--;
                }
                i5++;
            }
        }
        this.c.removeGroup(i4);
    }

    @Override // android.view.Menu
    public final void removeItem(int i4) {
        if (((n.j) this.f432b) != null) {
            int i5 = 0;
            while (true) {
                n.j jVar = (n.j) this.f432b;
                if (i5 >= jVar.h) {
                    break;
                }
                if (((e0.a) jVar.f(i5)).getItemId() == i4) {
                    ((n.j) this.f432b).g(i5);
                    break;
                }
                i5++;
            }
        }
        this.c.removeItem(i4);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i4, boolean z3, boolean z4) {
        this.c.setGroupCheckable(i4, z3, z4);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i4, boolean z3) {
        this.c.setGroupEnabled(i4, z3);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i4, boolean z3) {
        this.c.setGroupVisible(i4, z3);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z3) {
        this.c.setQwertyMode(z3);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4) {
        return this.c.addSubMenu(i4);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4) {
        return g(this.c.add(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4, int i5, int i6, CharSequence charSequence) {
        return this.c.addSubMenu(i4, i5, i6, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4, int i5, int i6, CharSequence charSequence) {
        return g(this.c.a(i4, i5, i6, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4, int i5, int i6, int i7) {
        return this.c.addSubMenu(i4, i5, i6, i7);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4, int i5, int i6, int i7) {
        return g(this.c.add(i4, i5, i6, i7));
    }
}
