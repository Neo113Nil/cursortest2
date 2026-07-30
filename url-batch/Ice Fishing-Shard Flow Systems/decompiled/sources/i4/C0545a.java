package i4;

import android.util.SparseArray;
import io.flutter.plugin.platform.t;
import io.flutter.plugin.platform.u;
import java.util.Iterator;

/* renamed from: i4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0545a implements InterfaceC0546b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0547c f5498a;

    public C0545a(C0547c c0547c) {
        this.f5498a = c0547c;
    }

    @Override // i4.InterfaceC0546b
    public final void b() {
        C0547c c0547c = this.f5498a;
        Iterator it = c0547c.f5521v.iterator();
        while (it.hasNext()) {
            ((InterfaceC0546b) it.next()).b();
        }
        u uVar = c0547c.f5518s;
        SparseArray sparseArray = uVar.f5764t;
        while (sparseArray.size() > 0) {
            uVar.f5752E.s(sparseArray.keyAt(0));
        }
        t tVar = c0547c.f5519t;
        SparseArray sparseArray2 = tVar.f5738q;
        while (sparseArray2.size() > 0) {
            tVar.f5746y.s(sparseArray2.keyAt(0));
        }
        c0547c.f5510k.f117e = null;
    }

    @Override // i4.InterfaceC0546b
    public final void a() {
    }
}
