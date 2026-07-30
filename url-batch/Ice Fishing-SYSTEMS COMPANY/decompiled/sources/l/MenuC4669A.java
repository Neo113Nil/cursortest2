package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: l.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC4669A extends D2.a implements Menu {

    /* renamed from: w, reason: collision with root package name */
    public final l f38863w;

    public MenuC4669A(Context context, l lVar) {
        super(7, context);
        if (lVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f38863w = lVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return g(this.f38863w.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i4, int i9, ComponentName componentName, Intent[] intentArr, Intent intent, int i10, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f38863w.addIntentOptions(i, i4, i9, componentName, intentArr, intent, i10, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i11 = 0; i11 < length; i11++) {
                menuItemArr[i11] = g(menuItemArr2[i11]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f38863w.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        s.k kVar = (s.k) this.f684v;
        if (kVar != null) {
            kVar.clear();
        }
        this.f38863w.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f38863w.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return g(this.f38863w.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return g(this.f38863w.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f38863w.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f38863w.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i4) {
        return this.f38863w.performIdentifierAction(i, i4);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i4) {
        return this.f38863w.performShortcut(i, keyEvent, i4);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((s.k) this.f684v) != null) {
            int i4 = 0;
            while (true) {
                s.k kVar = (s.k) this.f684v;
                if (i4 >= kVar.f40409v) {
                    break;
                }
                if (((I.a) kVar.h(i4)).getGroupId() == i) {
                    ((s.k) this.f684v).j(i4);
                    i4--;
                }
                i4++;
            }
        }
        this.f38863w.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((s.k) this.f684v) != null) {
            int i4 = 0;
            while (true) {
                s.k kVar = (s.k) this.f684v;
                if (i4 >= kVar.f40409v) {
                    break;
                }
                if (((I.a) kVar.h(i4)).getItemId() == i) {
                    ((s.k) this.f684v).j(i4);
                    break;
                }
                i4++;
            }
        }
        this.f38863w.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z8, boolean z9) {
        this.f38863w.setGroupCheckable(i, z8, z9);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z8) {
        this.f38863w.setGroupEnabled(i, z8);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z8) {
        this.f38863w.setGroupVisible(i, z8);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z8) {
        this.f38863w.setQwertyMode(z8);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f38863w.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.f38863w.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return g(this.f38863w.add(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i4, int i9, CharSequence charSequence) {
        return this.f38863w.addSubMenu(i, i4, i9, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i4, int i9, CharSequence charSequence) {
        return g(this.f38863w.a(i, i4, i9, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i4, int i9, int i10) {
        return this.f38863w.addSubMenu(i, i4, i9, i10);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i4, int i9, int i10) {
        return g(this.f38863w.add(i, i4, i9, i10));
    }
}
