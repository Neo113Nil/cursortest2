package io.appmetrica.analytics.impl;

import android.os.HandlerThread;
import io.flutter.plugin.platform.PlatformViewsController;
import o0.C1324c;
import w0.C1496c;

/* loaded from: classes.dex */
public final /* synthetic */ class ap implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11444a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11445b;

    public /* synthetic */ ap(int i4, Object obj) {
        this.f11444a = i4;
        this.f11445b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11444a) {
            case 0:
                ((C1092y0) this.f11445b).o();
                return;
            case 1:
                ((PlatformViewsController) this.f11445b).lambda$onEndFrame$3();
                return;
            case 2:
                j0.g gVar = (j0.g) this.f11445b;
                synchronized (gVar.f13746a) {
                    try {
                        if (gVar.f13758m) {
                            return;
                        }
                        long j4 = gVar.f13757l - 1;
                        gVar.f13757l = j4;
                        if (j4 > 0) {
                            return;
                        }
                        if (j4 >= 0) {
                            gVar.a();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (gVar.f13746a) {
                            gVar.n = illegalStateException;
                        }
                        return;
                    } finally {
                    }
                }
            case 3:
                ((HandlerThread) this.f11445b).quit();
                return;
            case 4:
                ((C1324c) this.f11445b).y();
                return;
            case 5:
                ((N3.A) this.f11445b).getClass();
                return;
            case 6:
                ((C1496c) this.f11445b).f15782h.c();
                return;
            case 7:
                w0.s sVar = (w0.s) this.f11445b;
                sVar.f15893m--;
                return;
            default:
                w0.z zVar = (w0.z) this.f11445b;
                zVar.f15913a.postVsyncCallback(zVar);
                return;
        }
    }
}
