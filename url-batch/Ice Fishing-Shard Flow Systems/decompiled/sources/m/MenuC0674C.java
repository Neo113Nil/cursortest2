package m;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import i.AbstractC0538y;
import u.C0939j;

/* renamed from: m.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC0674C extends AbstractC0538y implements Menu {

    /* renamed from: c, reason: collision with root package name */
    public final m f6324c;

    public MenuC0674C(Context context, m mVar) {
        super(context);
        if (mVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f6324c = mVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return f(this.f6324c.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i2, int i5, int i7, ComponentName componentName, Intent[] intentArr, Intent intent, int i8, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f6324c.addIntentOptions(i2, i5, i7, componentName, intentArr, intent, i8, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i9 = 0; i9 < length; i9++) {
                menuItemArr[i9] = f(menuItemArr2[i9]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f6324c.addSubMenu(charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        C0939j c0939j = (C0939j) this.f5494b;
        if (c0939j != null) {
            c0939j.clear();
        }
        this.f6324c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f6324c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i2) {
        return f(this.f6324c.findItem(i2));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i2) {
        return f(this.f6324c.getItem(i2));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f6324c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return this.f6324c.isShortcutKey(i2, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i2, int i5) {
        return this.f6324c.performIdentifierAction(i2, i5);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i5) {
        return this.f6324c.performShortcut(i2, keyEvent, i5);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i2) {
        if (((C0939j) this.f5494b) != null) {
            int i5 = 0;
            while (true) {
                C0939j c0939j = (C0939j) this.f5494b;
                if (i5 >= c0939j.f8045i) {
                    break;
                }
                if (((D.a) c0939j.e(i5)).getGroupId() == i2) {
                    ((C0939j) this.f5494b).f(i5);
                    i5--;
                }
                i5++;
            }
        }
        this.f6324c.removeGroup(i2);
    }

    @Override // android.view.Menu
    public final void removeItem(int i2) {
        if (((C0939j) this.f5494b) != null) {
            int i5 = 0;
            while (true) {
                C0939j c0939j = (C0939j) this.f5494b;
                if (i5 >= c0939j.f8045i) {
                    break;
                }
                if (((D.a) c0939j.e(i5)).getItemId() == i2) {
                    ((C0939j) this.f5494b).f(i5);
                    break;
                }
                i5++;
            }
        }
        this.f6324c.removeItem(i2);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i2, boolean z7, boolean z8) {
        this.f6324c.setGroupCheckable(i2, z7, z8);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i2, boolean z7) {
        this.f6324c.setGroupEnabled(i2, z7);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i2, boolean z7) {
        this.f6324c.setGroupVisible(i2, z7);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z7) {
        this.f6324c.setQwertyMode(z7);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f6324c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2) {
        return this.f6324c.addSubMenu(i2);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i5, int i7, CharSequence charSequence) {
        return this.f6324c.addSubMenu(i2, i5, i7, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2) {
        return f(this.f6324c.add(i2));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i5, int i7, int i8) {
        return this.f6324c.addSubMenu(i2, i5, i7, i8);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i5, int i7, CharSequence charSequence) {
        return f(this.f6324c.a(i2, i5, i7, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i5, int i7, int i8) {
        return f(this.f6324c.add(i2, i5, i7, i8));
    }
}
