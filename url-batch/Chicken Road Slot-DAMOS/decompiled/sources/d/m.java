package d;

import android.content.res.Resources;
import android.os.Trace;
import android.view.View;
import android.view.Window;
import com.google.common.util.concurrent.ListenableFuture;
import com.manholeroboramprush.cardestroy.KitchenDoor;
import f8.x0;
import f8.z0;
import kotlin.collections.j0;
import kotlin.jvm.functions.Function1;
import m2.h0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3257e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3258i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f3259r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f3260s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3261t;

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i3) {
        this.f3256d = i3;
        this.f3257e = obj;
        this.f3258i = obj2;
        this.f3259r = obj3;
        this.f3260s = obj4;
        this.f3261t = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b1.d C;
        int i3 = this.f3256d;
        Object obj = this.f3261t;
        Object obj2 = this.f3260s;
        Object obj3 = this.f3259r;
        Object obj4 = this.f3258i;
        Object obj5 = this.f3257e;
        switch (i3) {
            case 0:
                f0 f0Var = (f0) obj4;
                f0 f0Var2 = (f0) obj3;
                View view = (View) obj;
                Window window = ((KitchenDoor) obj2).getWindow();
                window.getClass();
                Function1 function1 = f0Var.f3230c;
                Resources resources = view.getResources();
                resources.getClass();
                boolean booleanValue = ((Boolean) function1.invoke(resources)).booleanValue();
                Function1 function12 = f0Var2.f3230c;
                Resources resources2 = view.getResources();
                resources2.getClass();
                ((v) obj5).b(f0Var, f0Var2, window, view, booleanValue, ((Boolean) function12.invoke(resources2)).booleanValue());
                return;
            case 1:
                h0 h0Var = (h0) obj5;
                x2.l lVar = (x2.l) obj4;
                String str = (String) obj3;
                x2.c cVar = (x2.c) obj2;
                p2.h hVar = (p2.h) obj;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    b1.i j = b1.r.j();
                    b1.d dVar = j instanceof b1.d ? (b1.d) j : null;
                    if (dVar == null || (C = dVar.C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        b1.i j3 = C.j();
                        try {
                            h0 e2 = m2.z.e(h0Var, lVar);
                            j0 j0Var = j0.f5574d;
                            t2.c cVar2 = new t2.c(str, e2, j0Var, j0Var, hVar, cVar);
                            cVar2.h();
                            cVar2.a();
                            C.w().d();
                            return;
                        } finally {
                            b1.i.q(j3);
                        }
                    } finally {
                    }
                } finally {
                    Trace.endSection();
                }
            default:
                z0 z0Var = (z0) obj5;
                x0 x0Var = (x0) obj4;
                ListenableFuture listenableFuture = (ListenableFuture) obj3;
                ListenableFuture listenableFuture2 = (ListenableFuture) obj2;
                f8.f0 f0Var3 = (f8.f0) obj;
                if (z0Var.isDone()) {
                    x0Var.n(listenableFuture);
                    return;
                } else {
                    if (listenableFuture2.isCancelled()) {
                        int i10 = f8.f0.f4140s;
                        if (f0Var3.compareAndSet(f8.e0.f4132d, f8.e0.f4133e)) {
                            z0Var.cancel(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
        }
    }
}
