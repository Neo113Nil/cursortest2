package m8;

import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f6592e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Runnable f6593i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l.d f6594r;

    public /* synthetic */ e(g gVar, Runnable runnable, l.d dVar, int i3) {
        this.f6591d = i3;
        this.f6592e = gVar;
        this.f6593i = runnable;
        this.f6594r = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6591d) {
            case 0:
                ExecutorService executorService = this.f6592e.f6599d;
                final int i3 = 0;
                final Runnable runnable = this.f6593i;
                final l.d dVar = this.f6594r;
                executorService.execute(new Runnable() { // from class: m8.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e2) {
                                    ((i) dVar.f5643e).k(e2);
                                    throw e2;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e9) {
                                    ((i) dVar.f5643e).k(e9);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                i iVar = (i) dVar.f5643e;
                                try {
                                    runnable2.run();
                                    iVar.j(null);
                                    return;
                                } catch (Exception e10) {
                                    iVar.k(e10);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ExecutorService executorService2 = this.f6592e.f6599d;
                final int i10 = 2;
                final Runnable runnable2 = this.f6593i;
                final l.d dVar2 = this.f6594r;
                executorService2.execute(new Runnable() { // from class: m8.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((i) dVar2.f5643e).k(e2);
                                    throw e2;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e9) {
                                    ((i) dVar2.f5643e).k(e9);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                i iVar = (i) dVar2.f5643e;
                                try {
                                    runnable22.run();
                                    iVar.j(null);
                                    return;
                                } catch (Exception e10) {
                                    iVar.k(e10);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.f6592e.f6599d;
                final int i11 = 1;
                final Runnable runnable3 = this.f6593i;
                final l.d dVar3 = this.f6594r;
                executorService3.execute(new Runnable() { // from class: m8.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e2) {
                                    ((i) dVar3.f5643e).k(e2);
                                    throw e2;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e9) {
                                    ((i) dVar3.f5643e).k(e9);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                i iVar = (i) dVar3.f5643e;
                                try {
                                    runnable22.run();
                                    iVar.j(null);
                                    return;
                                } catch (Exception e10) {
                                    iVar.k(e10);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
