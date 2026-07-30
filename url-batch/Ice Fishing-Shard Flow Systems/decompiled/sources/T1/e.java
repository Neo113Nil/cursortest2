package T1;

import java.util.concurrent.ExecutorService;
import w.AbstractC0987g;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f2583e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Runnable f2584i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ B.f f2585l;

    public /* synthetic */ e(f fVar, Runnable runnable, B.f fVar2, int i2) {
        this.f2582d = i2;
        this.f2583e = fVar;
        this.f2584i = runnable;
        this.f2585l = fVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2582d) {
            case 0:
                ExecutorService executorService = this.f2583e.f2586d;
                final int i2 = 0;
                final Runnable runnable = this.f2584i;
                final B.f fVar = this.f2585l;
                executorService.execute(new Runnable() { // from class: T1.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e7) {
                                    fVar.v(e7);
                                    throw e7;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e8) {
                                    fVar.v(e8);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                B.f fVar2 = fVar;
                                try {
                                    runnable2.run();
                                    h hVar = (h) fVar2.f152e;
                                    if (AbstractC0987g.f8274n.i(hVar, null, AbstractC0987g.f8275o)) {
                                        AbstractC0987g.d(hVar);
                                        return;
                                    }
                                    return;
                                } catch (Exception e9) {
                                    fVar2.v(e9);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ExecutorService executorService2 = this.f2583e.f2586d;
                final int i5 = 2;
                final Runnable runnable2 = this.f2584i;
                final B.f fVar2 = this.f2585l;
                executorService2.execute(new Runnable() { // from class: T1.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i5) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e7) {
                                    fVar2.v(e7);
                                    throw e7;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e8) {
                                    fVar2.v(e8);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                B.f fVar22 = fVar2;
                                try {
                                    runnable22.run();
                                    h hVar = (h) fVar22.f152e;
                                    if (AbstractC0987g.f8274n.i(hVar, null, AbstractC0987g.f8275o)) {
                                        AbstractC0987g.d(hVar);
                                        return;
                                    }
                                    return;
                                } catch (Exception e9) {
                                    fVar22.v(e9);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.f2583e.f2586d;
                final int i7 = 1;
                final Runnable runnable3 = this.f2584i;
                final B.f fVar3 = this.f2585l;
                executorService3.execute(new Runnable() { // from class: T1.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e7) {
                                    fVar3.v(e7);
                                    throw e7;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e8) {
                                    fVar3.v(e8);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                B.f fVar22 = fVar3;
                                try {
                                    runnable22.run();
                                    h hVar = (h) fVar22.f152e;
                                    if (AbstractC0987g.f8274n.i(hVar, null, AbstractC0987g.f8275o)) {
                                        AbstractC0987g.d(hVar);
                                        return;
                                    }
                                    return;
                                } catch (Exception e9) {
                                    fVar22.v(e9);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
