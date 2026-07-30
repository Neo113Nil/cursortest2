package s1;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class x2 implements androidx.lifecycle.t {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h7.c f8465f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g0.i1 f8466g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g0.t1 f8467h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r6.v f8468i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ View f8469j;

    public x2(h7.c cVar, g0.i1 i1Var, g0.t1 t1Var, r6.v vVar, View view) {
        this.f8465f = cVar;
        this.f8466g = i1Var;
        this.f8467h = t1Var;
        this.f8468i = vVar;
        this.f8469j = view;
    }

    @Override // androidx.lifecycle.t
    public final void c(androidx.lifecycle.v vVar, androidx.lifecycle.n nVar) {
        boolean z8;
        int i7 = w2.f8457a[nVar.ordinal()];
        c7.f fVar = null;
        if (i7 == 1) {
            c7.a0.p(this.f8465f, null, c7.y.f1759i, new androidx.lifecycle.i0(this.f8468i, this.f8467h, vVar, this, this.f8469j, (h6.d) null), 1);
            return;
        }
        if (i7 != 2) {
            if (i7 != 3) {
                if (i7 != 4) {
                    return;
                }
                this.f8467h.s();
                return;
            } else {
                g0.t1 t1Var = this.f8467h;
                synchronized (t1Var.f3908b) {
                    t1Var.f3923q = true;
                }
                return;
            }
        }
        g0.i1 i1Var = this.f8466g;
        if (i1Var != null) {
            androidx.room.m mVar = (androidx.room.m) i1Var.f3753h;
            synchronized (mVar.f1094b) {
                try {
                    synchronized (mVar.f1094b) {
                        z8 = mVar.f1093a;
                    }
                    if (!z8) {
                        ArrayList arrayList = (ArrayList) mVar.f1095c;
                        mVar.f1095c = (ArrayList) mVar.f1096d;
                        mVar.f1096d = arrayList;
                        mVar.f1093a = true;
                        int size = arrayList.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            ((h6.d) arrayList.get(i8)).resumeWith(d6.z.f2639a);
                        }
                        arrayList.clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        g0.t1 t1Var2 = this.f8467h;
        synchronized (t1Var2.f3908b) {
            if (t1Var2.f3923q) {
                t1Var2.f3923q = false;
                fVar = t1Var2.t();
            }
        }
        if (fVar != null) {
            ((c7.h) fVar).resumeWith(d6.z.f2639a);
        }
    }
}
