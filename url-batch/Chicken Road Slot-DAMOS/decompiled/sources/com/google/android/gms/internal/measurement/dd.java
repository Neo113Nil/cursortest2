package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class dd implements f8.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2232a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2233b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2234c;

    public /* synthetic */ dd(int i3, Object obj, Object obj2) {
        this.f2232a = i3;
        this.f2233b = obj;
        this.f2234c = obj2;
    }

    @Override // f8.z
    public final ListenableFuture apply(Object obj) {
        switch (this.f2232a) {
            case 0:
                fd fdVar = (fd) this.f2233b;
                return ((jb) fdVar.f2291d.get()).a(new l5(fdVar, (jd) this.f2234c));
            case 1:
                List list = (List) this.f2233b;
                xe xeVar = (xe) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw v4.a.i(it);
                }
                qe qeVar = new qe(this, arrayList, size);
                int i3 = cg.f2205a;
                int i10 = 4;
                dd ddVar = new dd(i10, mf.a(), qeVar);
                f8.d0 d0Var = f8.d0.f4128d;
                return f8.l0.g(f8.l0.f(f8.l0.g(f8.l0.e(xeVar.f2989a.f2760e.i()), new dd(i10, mf.a(), new dd(3, xeVar, ddVar)), d0Var), new a8.e(), d0Var), new dd(i10, mf.a(), new qe(this, size, arrayList)), d0Var);
            case 2:
                c2.b1 b1Var = (c2.b1) this.f2233b;
                f8.s sVar = (f8.s) this.f2234c;
                b1Var.k((Uri) f8.l0.b((ListenableFuture) b1Var.f1492c), obj);
                synchronized (b1Var.f1497i) {
                    b1Var.f1498k = sVar;
                }
                return f8.l0.d(obj);
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                return ((xe) this.f2233b).f2989a.f2758c.i((dd) this.f2234c, f8.d0.f4128d);
            default:
                bg b10 = mf.b(mf.c(), (bg) this.f2233b);
                try {
                    ListenableFuture apply = ((f8.z) this.f2234c).apply(obj);
                    if (apply != null) {
                        return apply;
                    }
                    throw new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
                } finally {
                }
        }
    }

    public String toString() {
        switch (this.f2232a) {
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                f8.z zVar = (f8.z) this.f2234c;
                StringBuilder sb2 = new StringBuilder(zVar.toString().length() + 14);
                sb2.append("propagating=[");
                sb2.append(zVar);
                sb2.append("]");
                return sb2.toString();
            default:
                return super.toString();
        }
    }
}
