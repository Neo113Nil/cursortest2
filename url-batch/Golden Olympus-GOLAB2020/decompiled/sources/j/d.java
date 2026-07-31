package j;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import x.InterfaceMenuC3510a;

/* loaded from: classes.dex */
public class d extends b implements Menu {

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceMenuC3510a f40844d;

    public d(Context context, InterfaceMenuC3510a interfaceMenuC3510a) {
        super(context);
        if (interfaceMenuC3510a == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f40844d = interfaceMenuC3510a;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return c(this.f40844d.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i4, int i5, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f40844d.addIntentOptions(i4, i5, i6, componentName, intentArr, intent, i7, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i8 = 0; i8 < length; i8++) {
                menuItemArr[i8] = c(menuItemArr2[i8]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.f40844d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        e();
        this.f40844d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f40844d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i4) {
        return c(this.f40844d.findItem(i4));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i4) {
        return c(this.f40844d.getItem(i4));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f40844d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i4, KeyEvent keyEvent) {
        return this.f40844d.isShortcutKey(i4, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i4, int i5) {
        return this.f40844d.performIdentifierAction(i4, i5);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i4, KeyEvent keyEvent, int i5) {
        return this.f40844d.performShortcut(i4, keyEvent, i5);
    }

    @Override // android.view.Menu
    public void removeGroup(int i4) {
        f(i4);
        this.f40844d.removeGroup(i4);
    }

    @Override // android.view.Menu
    public void removeItem(int i4) {
        g(i4);
        this.f40844d.removeItem(i4);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i4, boolean z4, boolean z5) {
        this.f40844d.setGroupCheckable(i4, z4, z5);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i4, boolean z4) {
        this.f40844d.setGroupEnabled(i4, z4);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i4, boolean z4) {
        this.f40844d.setGroupVisible(i4, z4);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z4) {
        this.f40844d.setQwertyMode(z4);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f40844d.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i4) {
        return c(this.f40844d.add(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4) {
        return d(this.f40844d.addSubMenu(i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i4, int i5, int i6, CharSequence charSequence) {
        return c(this.f40844d.add(i4, i5, i6, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4, int i5, int i6, CharSequence charSequence) {
        return d(this.f40844d.addSubMenu(i4, i5, i6, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i4, int i5, int i6, int i7) {
        return c(this.f40844d.add(i4, i5, i6, i7));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4, int i5, int i6, int i7) {
        return d(this.f40844d.addSubMenu(i4, i5, i6, i7));
    }
}
