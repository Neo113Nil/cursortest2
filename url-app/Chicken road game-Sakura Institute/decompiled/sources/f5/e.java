package f5;

import a8.m;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.ThreadPoolExecutor;
import l3.n;
import l3.s;
import l3.t;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3383f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3384g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3385h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3386i;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i7) {
        this.f3383f = i7;
        this.f3384g = obj;
        this.f3385h = obj2;
        this.f3386i = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3383f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g gVar = (g) this.f3384g;
                final Runnable runnable = (Runnable) this.f3385h;
                final b6.c cVar = (b6.c) this.f3386i;
                final int i7 = 0;
                gVar.f3390f.execute(new Runnable() { // from class: f5.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e9) {
                                    cVar.z(e9);
                                    throw e9;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    cVar.z(e10);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                b6.c cVar2 = cVar;
                                try {
                                    runnable2.run();
                                    i iVar = (i) cVar2.f1394g;
                                    if (q2.h.f7506k.r(iVar, null, q2.h.f7507l)) {
                                        q2.h.g(iVar);
                                        return;
                                    }
                                    return;
                                } catch (Exception e11) {
                                    cVar2.z(e11);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                g gVar2 = (g) this.f3384g;
                final Runnable runnable2 = (Runnable) this.f3385h;
                final b6.c cVar2 = (b6.c) this.f3386i;
                final int i8 = 2;
                gVar2.f3390f.execute(new Runnable() { // from class: f5.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i8) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e9) {
                                    cVar2.z(e9);
                                    throw e9;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    cVar2.z(e10);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                b6.c cVar22 = cVar2;
                                try {
                                    runnable22.run();
                                    i iVar = (i) cVar22.f1394g;
                                    if (q2.h.f7506k.r(iVar, null, q2.h.f7507l)) {
                                        q2.h.g(iVar);
                                        return;
                                    }
                                    return;
                                } catch (Exception e11) {
                                    cVar22.z(e11);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 2:
                g gVar3 = (g) this.f3384g;
                final Runnable runnable3 = (Runnable) this.f3385h;
                final b6.c cVar3 = (b6.c) this.f3386i;
                final int i9 = 1;
                gVar3.f3390f.execute(new Runnable() { // from class: f5.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e9) {
                                    cVar3.z(e9);
                                    throw e9;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    cVar3.z(e10);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                b6.c cVar22 = cVar3;
                                try {
                                    runnable22.run();
                                    i iVar = (i) cVar22.f1394g;
                                    if (q2.h.f7506k.r(iVar, null, q2.h.f7507l)) {
                                        q2.h.g(iVar);
                                        return;
                                    }
                                    return;
                                } catch (Exception e11) {
                                    cVar22.z(e11);
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                n nVar = (n) this.f3384g;
                m mVar = (m) this.f3385h;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f3386i;
                try {
                    t w4 = a8.d.w(nVar.f5920a);
                    if (w4 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    s sVar = (s) ((l3.j) w4.f5901b);
                    synchronized (sVar.f5928d) {
                        sVar.f5930f = threadPoolExecutor;
                    }
                    ((l3.j) w4.f5901b).a(new l3.m(mVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    mVar.F(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
        }
    }
}
