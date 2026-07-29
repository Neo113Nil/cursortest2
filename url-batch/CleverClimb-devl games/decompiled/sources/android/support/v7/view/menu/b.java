package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.internal.view.SupportSubMenu;
import android.support.v4.util.ArrayMap;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

/* compiled from: BaseMenuWrapper.java */
/* loaded from: classes.dex */
abstract class b<T> extends c<T> {

    /* renamed from: a, reason: collision with root package name */
    final Context f1753a;

    /* renamed from: c, reason: collision with root package name */
    private Map<SupportMenuItem, MenuItem> f1754c;

    /* renamed from: d, reason: collision with root package name */
    private Map<SupportSubMenu, SubMenu> f1755d;

    b(Context context, T t) {
        super(t);
        this.f1753a = context;
    }

    final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof SupportMenuItem)) {
            return menuItem;
        }
        SupportMenuItem supportMenuItem = (SupportMenuItem) menuItem;
        if (this.f1754c == null) {
            this.f1754c = new ArrayMap();
        }
        MenuItem menuItem2 = this.f1754c.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItem a2 = n.a(this.f1753a, supportMenuItem);
        this.f1754c.put(supportMenuItem, a2);
        return a2;
    }

    final SubMenu a(SubMenu subMenu) {
        if (!(subMenu instanceof SupportSubMenu)) {
            return subMenu;
        }
        SupportSubMenu supportSubMenu = (SupportSubMenu) subMenu;
        if (this.f1755d == null) {
            this.f1755d = new ArrayMap();
        }
        SubMenu subMenu2 = this.f1755d.get(supportSubMenu);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenu a2 = n.a(this.f1753a, supportSubMenu);
        this.f1755d.put(supportSubMenu, a2);
        return a2;
    }

    final void a() {
        if (this.f1754c != null) {
            this.f1754c.clear();
        }
        if (this.f1755d != null) {
            this.f1755d.clear();
        }
    }

    final void a(int i) {
        if (this.f1754c == null) {
            return;
        }
        Iterator<SupportMenuItem> it = this.f1754c.keySet().iterator();
        while (it.hasNext()) {
            if (i == it.next().getGroupId()) {
                it.remove();
            }
        }
    }

    final void b(int i) {
        if (this.f1754c == null) {
            return;
        }
        Iterator<SupportMenuItem> it = this.f1754c.keySet().iterator();
        while (it.hasNext()) {
            if (i == it.next().getItemId()) {
                it.remove();
                return;
            }
        }
    }
}
