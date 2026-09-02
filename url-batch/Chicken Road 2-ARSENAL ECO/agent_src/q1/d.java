package q1;

import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5768f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f5769g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Runnable f5770h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a6.d f5771i;

    public /* synthetic */ d(e eVar, Runnable runnable, a6.d dVar, int i7) {
        this.f5768f = i7;
        this.f5769g = eVar;
        this.f5770h = runnable;
        this.f5771i = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5768f) {
            case 0:
                ExecutorService executorService = this.f5769g.f5772f;
                final int i7 = 0;
                final Runnable runnable = this.f5770h;
                final a6.d dVar = this.f5771i;
                executorService.execute(new Runnable() { // from class: q1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e4) {
                                    dVar.k(e4);
                                    throw e4;
                                }
                            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e7) {
                                    dVar.k(e7);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                a6.d dVar2 = dVar;
                                try {
                                    runnable2.run();
                                    g gVar = (g) dVar2.f3172f;
                                    if (r.h.f5835k.B(gVar, null, r.h.f5836l)) {
                                        r.h.d(gVar);
                                        return;
                                    }
                                    return;
                                } catch (Exception e8) {
                                    dVar2.k(e8);
                                    return;
                                }
                        }
                    }
                });
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ExecutorService executorService2 = this.f5769g.f5772f;
                final int i8 = 2;
                final Runnable runnable2 = this.f5770h;
                final a6.d dVar2 = this.f5771i;
                executorService2.execute(new Runnable() { // from class: q1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i8) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e4) {
                                    dVar2.k(e4);
                                    throw e4;
                                }
                            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e7) {
                                    dVar2.k(e7);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                a6.d dVar22 = dVar2;
                                try {
                                    runnable22.run();
                                    g gVar = (g) dVar22.f3172f;
                                    if (r.h.f5835k.B(gVar, null, r.h.f5836l)) {
                                        r.h.d(gVar);
                                        return;
                                    }
                                    return;
                                } catch (Exception e8) {
                                    dVar22.k(e8);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.f5769g.f5772f;
                final int i9 = 1;
                final Runnable runnable3 = this.f5770h;
                final a6.d dVar3 = this.f5771i;
                executorService3.execute(new Runnable() { // from class: q1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e4) {
                                    dVar3.k(e4);
                                    throw e4;
                                }
                            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e7) {
                                    dVar3.k(e7);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                a6.d dVar22 = dVar3;
                                try {
                                    runnable22.run();
                                    g gVar = (g) dVar22.f3172f;
                                    if (r.h.f5835k.B(gVar, null, r.h.f5836l)) {
                                        r.h.d(gVar);
                                        return;
                                    }
                                    return;
                                } catch (Exception e8) {
                                    dVar22.k(e8);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
