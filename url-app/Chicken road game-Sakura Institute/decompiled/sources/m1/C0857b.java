package m1;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import z2.C1400D;
import z2.C1403G;

/* renamed from: m1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0857b {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f8253a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f8254b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f8255c;

    public C0857b(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f8253a = container;
        this.f8254b = new ArrayList();
        this.f8255c = new ArrayList();
    }

    public final void a(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            p pVar = (p) arrayList.get(i2);
            if (!pVar.f8298a) {
                pVar.f8298a = true;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((p) it.next()).getClass();
            C1400D.j(null, arrayList2);
        }
        List H3 = C1403G.H(C1403G.K(arrayList2));
        int size2 = H3.size();
        for (int i4 = 0; i4 < size2; i4++) {
            o oVar = (o) H3.get(i4);
            oVar.getClass();
            ViewGroup container = this.f8253a;
            Intrinsics.checkNotNullParameter(container, "container");
            if (!oVar.f8297a) {
                oVar.b(container);
            }
            oVar.f8297a = true;
        }
    }
}
