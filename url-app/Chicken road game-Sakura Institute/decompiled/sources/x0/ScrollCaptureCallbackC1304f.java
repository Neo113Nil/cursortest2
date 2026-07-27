package x0;

import B0.m;
import B0.p;
import G.C0192d;
import W2.n0;
import W2.r0;
import Z.AbstractC0307d;
import Z.C0306c;
import Z.K;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.Surface;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import r0.B;
import r0.a0;
import s0.C1160o0;
import y0.n;
import y2.AbstractC1343r;

/* renamed from: x0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ScrollCaptureCallbackC1304f implements ScrollCaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final n f11426a;

    /* renamed from: b, reason: collision with root package name */
    public final M0.i f11427b;

    /* renamed from: c, reason: collision with root package name */
    public final k f11428c;

    /* renamed from: d, reason: collision with root package name */
    public final b3.c f11429d;

    /* renamed from: e, reason: collision with root package name */
    public final p f11430e;

    public ScrollCaptureCallbackC1304f(n nVar, M0.i iVar, b3.c cVar, k kVar) {
        this.f11426a = nVar;
        this.f11427b = iVar;
        this.f11428c = kVar;
        this.f11429d = new b3.c(cVar.f5651d.s(C1306h.f11433d));
        this.f11430e = new p(iVar.f3553d - iVar.f3551b, new C1303e(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ScrollCaptureCallbackC1304f scrollCaptureCallbackC1304f, ScrollCaptureSession scrollCaptureSession, M0.i iVar, E2.c cVar) {
        C1301c c1301c;
        D2.a aVar;
        int i2;
        int i4;
        int i5;
        Object b4;
        C1302d c1302d;
        CoroutineContext coroutineContext;
        ScrollCaptureCallbackC1304f scrollCaptureCallbackC1304f2;
        ScrollCaptureSession scrollCaptureSession2;
        int i6;
        int i7;
        int e4;
        int e5;
        Surface surface;
        Surface surface2;
        BlendMode blendMode;
        Surface surface3;
        scrollCaptureCallbackC1304f.getClass();
        if (cVar instanceof C1301c) {
            c1301c = (C1301c) cVar;
            int i8 = c1301c.f11417q;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c1301c.f11417q = i8 - Integer.MIN_VALUE;
                Object obj = c1301c.f11415o;
                aVar = D2.a.f2163d;
                i2 = c1301c.f11417q;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    i4 = iVar.f3551b;
                    p pVar = scrollCaptureCallbackC1304f.f11430e;
                    c1301c.f11410j = scrollCaptureCallbackC1304f;
                    c1301c.f11411k = scrollCaptureSession;
                    c1301c.f11412l = iVar;
                    c1301c.f11413m = i4;
                    i5 = iVar.f3553d;
                    c1301c.f11414n = i5;
                    c1301c.f11417q = 1;
                    if (i4 > i5) {
                        pVar.getClass();
                        throw new IllegalArgumentException(("Expected min=" + i4 + " ≤ max=" + i5).toString());
                    }
                    int i9 = i5 - i4;
                    int i10 = pVar.f929a;
                    if (i9 > i10) {
                        throw new IllegalArgumentException(B.b(i9, i10, "Expected range (", ") to be ≤ viewportSize=").toString());
                    }
                    float f4 = i4;
                    float f5 = pVar.f930b;
                    if (f4 < f5 || i5 > i10 + f5) {
                        b4 = pVar.b((f4 < f5 ? i4 : i5 - i10) - f5, c1301c);
                        if (b4 != aVar) {
                            b4 = Unit.f7487a;
                        }
                        if (b4 != aVar) {
                            b4 = Unit.f7487a;
                        }
                    } else {
                        b4 = Unit.f7487a;
                    }
                    if (b4 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i7 = c1301c.f11414n;
                        i6 = c1301c.f11413m;
                        iVar = c1301c.f11412l;
                        scrollCaptureSession2 = m.d(c1301c.f11411k);
                        scrollCaptureCallbackC1304f2 = c1301c.f11410j;
                        AbstractC1343r.b(obj);
                        p pVar2 = scrollCaptureCallbackC1304f2.f11430e;
                        e4 = kotlin.ranges.b.e(i6 - O2.c.a(pVar2.f930b), 0, pVar2.f929a);
                        p pVar3 = scrollCaptureCallbackC1304f2.f11430e;
                        e5 = kotlin.ranges.b.e(i7 - O2.c.a(pVar3.f930b), 0, pVar3.f929a);
                        int i11 = iVar.f3550a;
                        if (e4 != e5) {
                            return M0.i.f3549e;
                        }
                        a0 c4 = scrollCaptureCallbackC1304f2.f11426a.c();
                        if (c4 == null) {
                            throw new IllegalStateException("Could not find coordinator for semantics node.");
                        }
                        surface = scrollCaptureSession2.getSurface();
                        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                        try {
                            blendMode = BlendMode.CLEAR;
                            lockHardwareCanvas.drawColor(0, blendMode);
                            Canvas canvas = AbstractC0307d.f4518a;
                            C0306c c0306c = new C0306c();
                            c0306c.f4515a = lockHardwareCanvas;
                            c0306c.q(-i11, -e4);
                            c4.G0(c0306c, null);
                            surface3 = scrollCaptureSession2.getSurface();
                            surface3.unlockCanvasAndPost(lockHardwareCanvas);
                            int a4 = O2.c.a(scrollCaptureCallbackC1304f2.f11430e.f930b);
                            return new M0.i(i11, e4 + a4, iVar.f3552c, e5 + a4);
                        } catch (Throwable th) {
                            surface2 = scrollCaptureSession2.getSurface();
                            surface2.unlockCanvasAndPost(lockHardwareCanvas);
                            throw th;
                        }
                    }
                    int i12 = c1301c.f11414n;
                    int i13 = c1301c.f11413m;
                    iVar = c1301c.f11412l;
                    ScrollCaptureSession d4 = m.d(c1301c.f11411k);
                    ScrollCaptureCallbackC1304f scrollCaptureCallbackC1304f3 = c1301c.f11410j;
                    AbstractC1343r.b(obj);
                    i5 = i12;
                    i4 = i13;
                    scrollCaptureSession = d4;
                    scrollCaptureCallbackC1304f = scrollCaptureCallbackC1304f3;
                }
                c1302d = C1302d.f11418e;
                c1301c.f11410j = scrollCaptureCallbackC1304f;
                c1301c.f11411k = scrollCaptureSession;
                c1301c.f11412l = iVar;
                c1301c.f11413m = i4;
                c1301c.f11414n = i5;
                c1301c.f11417q = 2;
                coroutineContext = c1301c.f2311e;
                Intrinsics.c(coroutineContext);
                if (C0192d.F(coroutineContext).f(c1302d, c1301c) != aVar) {
                    return aVar;
                }
                scrollCaptureCallbackC1304f2 = scrollCaptureCallbackC1304f;
                scrollCaptureSession2 = scrollCaptureSession;
                i6 = i4;
                i7 = i5;
                p pVar22 = scrollCaptureCallbackC1304f2.f11430e;
                e4 = kotlin.ranges.b.e(i6 - O2.c.a(pVar22.f930b), 0, pVar22.f929a);
                p pVar32 = scrollCaptureCallbackC1304f2.f11430e;
                e5 = kotlin.ranges.b.e(i7 - O2.c.a(pVar32.f930b), 0, pVar32.f929a);
                int i112 = iVar.f3550a;
                if (e4 != e5) {
                }
            }
        }
        c1301c = new C1301c(scrollCaptureCallbackC1304f, cVar);
        Object obj2 = c1301c.f11415o;
        aVar = D2.a.f2163d;
        i2 = c1301c.f11417q;
        if (i2 != 0) {
        }
        c1302d = C1302d.f11418e;
        c1301c.f11410j = scrollCaptureCallbackC1304f;
        c1301c.f11411k = scrollCaptureSession;
        c1301c.f11412l = iVar;
        c1301c.f11413m = i4;
        c1301c.f11414n = i5;
        c1301c.f11417q = 2;
        coroutineContext = c1301c.f2311e;
        Intrinsics.c(coroutineContext);
        if (C0192d.F(coroutineContext).f(c1302d, c1301c) != aVar) {
        }
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        W2.B.m(this.f11429d, n0.f4283e, null, new C1299a(this, runnable, null), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        r0 m4 = W2.B.m(this.f11429d, null, null, new C1300b(this, scrollCaptureSession, rect, consumer, null), 3);
        m4.r(new C1160o0(10, cancellationSignal));
        cancellationSignal.setOnCancelListener(new C1305g(0, m4));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(K.A(this.f11427b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f11430e.f930b = 0.0f;
        k kVar = this.f11428c;
        kVar.f11439a.setValue(Boolean.TRUE);
        runnable.run();
    }
}
