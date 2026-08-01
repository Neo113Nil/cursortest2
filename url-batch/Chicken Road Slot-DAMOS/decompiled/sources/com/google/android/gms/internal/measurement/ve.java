package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class ve implements f8.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c2.b1 f2895e;

    public /* synthetic */ ve(c2.b1 b1Var, int i3) {
        this.f2894d = i3;
        this.f2895e = b1Var;
    }

    @Override // f8.y
    public final ListenableFuture call() {
        ListenableFuture a9;
        int i3 = this.f2894d;
        c2.b1 b1Var = this.f2895e;
        int i10 = 4;
        switch (i3) {
            case 0:
                f8.w0 w0Var = (f8.w0) b1Var.f1494e;
                try {
                    return f8.l0.d(b1Var.j((Uri) f8.l0.b((ListenableFuture) b1Var.f1492c)));
                } catch (IOException e2) {
                    a8.i iVar = (a8.i) b1Var.g;
                    iVar.getClass();
                    if ((e2 instanceof ge) || (e2.getCause() instanceof ge)) {
                        return f8.l0.c(e2);
                    }
                    ye yeVar = (ye) iVar.f345d;
                    yeVar.getClass();
                    if (e2.getCause() instanceof v1) {
                        f8.o0 d10 = f8.l0.d(yeVar.f3017a);
                        ue ueVar = new ue(b1Var, 2);
                        int i11 = cg.f2205a;
                        a9 = f8.l0.a(f8.l0.g(d10, new dd(i10, mf.a(), ueVar), w0Var), IOException.class, new qc(5, e2), f8.d0.f4128d);
                    } else {
                        a9 = f8.l0.c(e2);
                    }
                    ue ueVar2 = new ue(b1Var, 1);
                    int i12 = cg.f2205a;
                    return f8.l0.g(a9, new dd(i10, mf.a(), ueVar2), w0Var);
                }
            default:
                ue ueVar3 = new ue(b1Var, 3);
                int i13 = cg.f2205a;
                return f8.l0.e(f8.l0.g((ListenableFuture) b1Var.f1492c, new dd(i10, mf.a(), ueVar3), (f8.w0) b1Var.f1494e));
        }
    }
}
