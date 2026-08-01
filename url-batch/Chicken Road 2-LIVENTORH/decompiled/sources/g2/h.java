package g2;

import android.view.MenuItem;
import android.view.SubMenu;
import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final k.m f1748a;

    /* renamed from: c, reason: collision with root package name */
    public int f1750c = 0;
    public int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f1751e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1749b = new ArrayList();

    public h(k.m mVar) {
        this.f1748a = mVar;
        b();
    }

    public final MenuItem a(int i) {
        return (MenuItem) this.f1749b.get(i);
    }

    public final void b() {
        ArrayList arrayList = this.f1749b;
        arrayList.clear();
        this.f1750c = 0;
        this.d = 0;
        this.f1751e = 0;
        int i = 0;
        while (true) {
            k.m mVar = this.f1748a;
            if (i >= mVar.f2064f.size()) {
                break;
            }
            MenuItem item = mVar.getItem(i);
            if (item.hasSubMenu()) {
                if (!arrayList.isEmpty() && !(arrayList.get(arrayList.size() - 1) instanceof a) && item.isVisible()) {
                    arrayList.add(new a());
                }
                arrayList.add(item);
                SubMenu subMenu = item.getSubMenu();
                for (int i4 = 0; i4 < subMenu.size(); i4++) {
                    MenuItem item2 = subMenu.getItem(i4);
                    if (!item.isVisible()) {
                        item2.setVisible(false);
                    }
                    arrayList.add(item2);
                    this.f1750c++;
                    if (item2.isVisible()) {
                        this.d++;
                    }
                }
                arrayList.add(new a());
            } else {
                arrayList.add(item);
                this.f1750c++;
                if (item.isVisible()) {
                    this.d++;
                    this.f1751e++;
                }
            }
            i++;
        }
        if (arrayList.isEmpty() || !(arrayList.get(arrayList.size() - 1) instanceof a)) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }
}
