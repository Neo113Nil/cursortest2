package l0;

import android.util.SparseArray;
import java.util.Iterator;

/* renamed from: l0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0198a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f2772a;

    public C0198a(c cVar) {
        this.f2772a = cVar;
    }

    @Override // l0.b
    public final void b() {
        c cVar = this.f2772a;
        Iterator it = cVar.f2795v.iterator();
        while (it.hasNext()) {
            ((b) it.next()).b();
        }
        io.flutter.plugin.platform.l lVar = cVar.f2793s;
        SparseArray sparseArray = lVar.f2490o;
        while (sparseArray.size() > 0) {
            lVar.f2499y.s(sparseArray.keyAt(0));
        }
        io.flutter.plugin.platform.k kVar = cVar.t;
        SparseArray sparseArray2 = kVar.f2473k;
        while (sparseArray2.size() > 0) {
            kVar.f2479q.s(sparseArray2.keyAt(0));
        }
        cVar.f2785k.f3028b = null;
    }

    @Override // l0.b
    public final void a() {
    }
}
