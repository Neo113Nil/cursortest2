package E3;

import android.util.SparseArray;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f598a;

    public a(c cVar) {
        this.f598a = cVar;
    }

    @Override // E3.b
    public final void b() {
        c cVar = this.f598a;
        Iterator it = cVar.f621v.iterator();
        while (it.hasNext()) {
            ((b) it.next()).b();
        }
        io.flutter.plugin.platform.l lVar = cVar.f618s;
        SparseArray sparseArray = lVar.f4585p;
        while (sparseArray.size() > 0) {
            lVar.f4594z.n(sparseArray.keyAt(0));
        }
        io.flutter.plugin.platform.k kVar = cVar.f619t;
        SparseArray sparseArray2 = kVar.f4567l;
        while (sparseArray2.size() > 0) {
            kVar.f4574s.d(sparseArray2.keyAt(0));
        }
        cVar.f610k.f1724e = null;
    }

    @Override // E3.b
    public final void a() {
    }
}
