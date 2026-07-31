package j;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.g;
import x.InterfaceMenuItemC3511b;

/* loaded from: classes.dex */
abstract class b {

    /* renamed from: a, reason: collision with root package name */
    final Context f40831a;

    /* renamed from: b, reason: collision with root package name */
    private g f40832b;

    /* renamed from: c, reason: collision with root package name */
    private g f40833c;

    b(Context context) {
        this.f40831a = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC3511b)) {
            return menuItem;
        }
        InterfaceMenuItemC3511b interfaceMenuItemC3511b = (InterfaceMenuItemC3511b) menuItem;
        if (this.f40832b == null) {
            this.f40832b = new g();
        }
        MenuItem menuItem2 = (MenuItem) this.f40832b.get(interfaceMenuItemC3511b);
        if (menuItem2 != null) {
            return menuItem2;
        }
        c cVar = new c(this.f40831a, interfaceMenuItemC3511b);
        this.f40832b.put(interfaceMenuItemC3511b, cVar);
        return cVar;
    }

    final void e() {
        g gVar = this.f40832b;
        if (gVar != null) {
            gVar.clear();
        }
        g gVar2 = this.f40833c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    final void f(int i4) {
        if (this.f40832b == null) {
            return;
        }
        int i5 = 0;
        while (i5 < this.f40832b.size()) {
            if (((InterfaceMenuItemC3511b) this.f40832b.m(i5)).getGroupId() == i4) {
                this.f40832b.o(i5);
                i5--;
            }
            i5++;
        }
    }

    final void g(int i4) {
        if (this.f40832b == null) {
            return;
        }
        for (int i5 = 0; i5 < this.f40832b.size(); i5++) {
            if (((InterfaceMenuItemC3511b) this.f40832b.m(i5)).getItemId() == i4) {
                this.f40832b.o(i5);
                return;
            }
        }
    }

    final SubMenu d(SubMenu subMenu) {
        return subMenu;
    }
}
