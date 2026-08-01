package k;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class b0 extends androidx.fragment.app.j implements Menu {

    /* renamed from: c, reason: collision with root package name */
    public final m f1999c;

    public b0(Context context, m mVar) {
        super(context);
        if (mVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f1999c = mVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return g(this.f1999c.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i4, int i5, ComponentName componentName, Intent[] intentArr, Intent intent, int i6, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f1999c.addIntentOptions(i, i4, i5, componentName, intentArr, intent, i6, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i7 = 0; i7 < length; i7++) {
                menuItemArr[i7] = g(menuItemArr2[i7]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f1999c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        q.j jVar = (q.j) this.f438b;
        if (jVar != null) {
            jVar.clear();
        }
        this.f1999c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f1999c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return g(this.f1999c.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return g(this.f1999c.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f1999c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f1999c.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i4) {
        return this.f1999c.performIdentifierAction(i, i4);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i4) {
        return this.f1999c.performShortcut(i, keyEvent, i4);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((q.j) this.f438b) != null) {
            int i4 = 0;
            while (true) {
                q.j jVar = (q.j) this.f438b;
                if (i4 >= jVar.f3036h) {
                    break;
                }
                if (((h0.a) jVar.f(i4)).getGroupId() == i) {
                    ((q.j) this.f438b).g(i4);
                    i4--;
                }
                i4++;
            }
        }
        this.f1999c.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((q.j) this.f438b) != null) {
            int i4 = 0;
            while (true) {
                q.j jVar = (q.j) this.f438b;
                if (i4 >= jVar.f3036h) {
                    break;
                }
                if (((h0.a) jVar.f(i4)).getItemId() == i) {
                    ((q.j) this.f438b).g(i4);
                    break;
                }
                i4++;
            }
        }
        this.f1999c.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z3, boolean z4) {
        this.f1999c.setGroupCheckable(i, z3, z4);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z3) {
        this.f1999c.setGroupEnabled(i, z3);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z3) {
        this.f1999c.setGroupVisible(i, z3);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z3) {
        this.f1999c.setQwertyMode(z3);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f1999c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.f1999c.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return g(this.f1999c.add(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i4, int i5, CharSequence charSequence) {
        return this.f1999c.addSubMenu(i, i4, i5, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i4, int i5, CharSequence charSequence) {
        return g(this.f1999c.a(i, i4, i5, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i4, int i5, int i6) {
        return this.f1999c.addSubMenu(i, i4, i5, i6);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i4, int i5, int i6) {
        return g(this.f1999c.add(i, i4, i5, i6));
    }
}
