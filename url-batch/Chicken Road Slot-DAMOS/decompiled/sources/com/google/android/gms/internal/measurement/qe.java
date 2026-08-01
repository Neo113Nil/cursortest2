package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class qe implements f8.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2712a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dd f2713b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2714c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2715d;

    public /* synthetic */ qe(dd ddVar, int i3, ArrayList arrayList) {
        this.f2713b = ddVar;
        this.f2715d = i3;
        this.f2714c = arrayList;
    }

    @Override // f8.z
    public final ListenableFuture apply(Object obj) {
        switch (this.f2712a) {
            case 0:
                int i3 = this.f2715d;
                ArrayList arrayList = new ArrayList(i3);
                for (int i10 = 0; i10 < i3; i10++) {
                    if (((Boolean) f8.l0.b((Future) this.f2714c.get(i10))).booleanValue()) {
                        ((List) this.f2713b.f2233b).get(i10).getClass();
                        kotlin.collections.i0.j();
                        return null;
                    }
                }
                b8.g m10 = b8.g.m(arrayList);
                f8.a0 a0Var = new f8.a0();
                f8.c0 c0Var = new f8.c0(m10, true);
                c0Var.B = new f8.b0(c0Var, a0Var);
                c0Var.s();
                return c0Var;
            default:
                ArrayList arrayList2 = this.f2714c;
                b8.g m11 = b8.g.m(arrayList2);
                dd ddVar = this.f2713b;
                l5 a9 = cg.a(new y6.l(ddVar, (o0) obj, this.f2715d, arrayList2));
                Executor executor = (Executor) ddVar.f2234c;
                f8.c0 c0Var2 = new f8.c0(m11, false);
                c0Var2.B = new f8.b0(c0Var2, a9, executor);
                c0Var2.s();
                return c0Var2;
        }
    }

    public /* synthetic */ qe(dd ddVar, ArrayList arrayList, int i3) {
        this.f2713b = ddVar;
        this.f2714c = arrayList;
        this.f2715d = i3;
    }
}
