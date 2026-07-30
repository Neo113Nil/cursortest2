package d0;

import android.util.SparseArray;
import java.util.Iterator;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0111a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f1785a;

    public C0111a(c cVar) {
        this.f1785a = cVar;
    }

    @Override // d0.b
    public final void a() {
        c cVar = this.f1785a;
        Iterator it = cVar.f1808v.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
        while (true) {
            io.flutter.plugin.platform.k kVar = cVar.f1805s;
            SparseArray sparseArray = kVar.f2487o;
            if (sparseArray.size() <= 0) {
                break;
            }
            kVar.f2496y.v(sparseArray.keyAt(0));
        }
        while (true) {
            io.flutter.plugin.platform.j jVar = cVar.f1806t;
            SparseArray sparseArray2 = jVar.f2470k;
            if (sparseArray2.size() <= 0) {
                cVar.f1798k.f2748b = null;
                return;
            } else {
                jVar.r.v(sparseArray2.keyAt(0));
            }
        }
    }

    @Override // d0.b
    public final void b() {
    }
}
