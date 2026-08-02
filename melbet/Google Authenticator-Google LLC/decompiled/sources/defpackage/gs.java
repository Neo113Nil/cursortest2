package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class gs extends ft implements Menu {
    private final vn d;

    public gs(Context context, vn vnVar) {
        super(context);
        if (vnVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.d = vnVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(this.d.add(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            for (int i5 = 0; i5 < menuItemArr2.length; i5++) {
                menuItemArr[i5] = a(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return b(this.d.addSubMenu(i));
    }

    @Override // android.view.Menu
    public final void clear() {
        qy qyVar = this.b;
        if (qyVar != null) {
            qyVar.clear();
        }
        qy qyVar2 = this.c;
        if (qyVar2 != null) {
            qyVar2.clear();
        }
        this.d.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.d.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return a(this.d.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return a(this.d.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.d.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.d.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.d.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (this.b != null) {
            int i2 = 0;
            while (true) {
                qy qyVar = this.b;
                if (i2 >= qyVar.d) {
                    break;
                }
                if (((vo) qyVar.c(i2)).getGroupId() == i) {
                    this.b.d(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.d.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (this.b != null) {
            int i2 = 0;
            while (true) {
                qy qyVar = this.b;
                if (i2 >= qyVar.d) {
                    break;
                }
                if (((vo) qyVar.c(i2)).getItemId() == i) {
                    this.b.d(i2);
                    break;
                }
                i2++;
            }
        }
        this.d.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.d.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        this.d.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        this.d.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.d.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.d.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(this.d.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return b(this.d.addSubMenu(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(this.d.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(this.d.add(charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return b(this.d.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return b(this.d.addSubMenu(charSequence));
    }
}
