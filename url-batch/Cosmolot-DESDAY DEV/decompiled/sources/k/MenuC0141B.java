package k;

import X.AbstractC0038g;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: k.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC0141B extends AbstractC0038g implements Menu {

    /* renamed from: c, reason: collision with root package name */
    public final MenuC0157m f2587c;

    public MenuC0141B(Context context, MenuC0157m menuC0157m) {
        super(context);
        if (menuC0157m == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f2587c = menuC0157m;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return g(this.f2587c.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f2587c.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = g(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f2587c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        o.k kVar = (o.k) this.f913b;
        if (kVar != null) {
            kVar.clear();
        }
        this.f2587c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f2587c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return g(this.f2587c.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return g(this.f2587c.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f2587c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f2587c.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.f2587c.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f2587c.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((o.k) this.f913b) != null) {
            int i2 = 0;
            while (true) {
                o.k kVar = (o.k) this.f913b;
                if (i2 >= kVar.f3329c) {
                    break;
                }
                if (((E.a) kVar.h(i2)).getGroupId() == i) {
                    ((o.k) this.f913b).i(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.f2587c.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((o.k) this.f913b) != null) {
            int i2 = 0;
            while (true) {
                o.k kVar = (o.k) this.f913b;
                if (i2 >= kVar.f3329c) {
                    break;
                }
                if (((E.a) kVar.h(i2)).getItemId() == i) {
                    ((o.k) this.f913b).i(i2);
                    break;
                }
                i2++;
            }
        }
        this.f2587c.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z2, boolean z3) {
        this.f2587c.setGroupCheckable(i, z2, z3);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z2) {
        this.f2587c.setGroupEnabled(i, z2);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z2) {
        this.f2587c.setGroupVisible(i, z2);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f2587c.setQwertyMode(z2);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f2587c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.f2587c.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return g(this.f2587c.add(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.f2587c.addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return g(this.f2587c.a(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return this.f2587c.addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return g(this.f2587c.add(i, i2, i3, i4));
    }
}
