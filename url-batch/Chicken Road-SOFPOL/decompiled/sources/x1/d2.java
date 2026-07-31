package x1;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d2 implements androidx.lifecycle.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f7.c f8397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0.j1 f8398e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m0.y1 f8399f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q6.s f8400g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ View f8401h;

    public d2(f7.c cVar, m0.j1 j1Var, m0.y1 y1Var, q6.s sVar, View view) {
        this.f8397d = cVar;
        this.f8398e = j1Var;
        this.f8399f = y1Var;
        this.f8400g = sVar;
        this.f8401h = view;
    }

    @Override // androidx.lifecycle.s
    public final void b(androidx.lifecycle.u uVar, androidx.lifecycle.o oVar) {
        boolean z3;
        a7.f fVar = null;
        switch (b2.f8384a[oVar.ordinal()]) {
            case 1:
                a7.x.n(this.f8397d, null, new r.e(this.f8400g, this.f8399f, uVar, this, this.f8401h, null), 1);
                return;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                m0.j1 j1Var = this.f8398e;
                if (j1Var != null) {
                    a0.f1 f1Var = (a0.f1) j1Var.f4977f;
                    synchronized (f1Var.f79b) {
                        try {
                            synchronized (f1Var.f79b) {
                                z3 = f1Var.f78a;
                            }
                            if (!z3) {
                                ArrayList arrayList = (ArrayList) f1Var.f80c;
                                f1Var.f80c = (ArrayList) f1Var.f81d;
                                f1Var.f81d = arrayList;
                                f1Var.f78a = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((g6.c) arrayList.get(i)).k(c6.m.f1757a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                m0.y1 y1Var = this.f8399f;
                synchronized (y1Var.f5189b) {
                    if (y1Var.f5205s) {
                        y1Var.f5205s = false;
                        fVar = y1Var.w();
                    }
                }
                if (fVar != null) {
                    ((a7.h) fVar).k(c6.m.f1757a);
                    return;
                }
                return;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                m0.y1 y1Var2 = this.f8399f;
                synchronized (y1Var2.f5189b) {
                    y1Var2.f5205s = true;
                }
                return;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                this.f8399f.v();
                return;
            case 5:
            case 6:
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return;
            default:
                throw new a5.c();
        }
    }
}
