package y0;

import H2.AbstractC0080b;
import I.C0089d;
import L1.z;
import M1.B;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.Surface;
import b0.AbstractC0259J;
import b0.AbstractC0272e;
import b0.C0271d;
import e2.AbstractC0381e;
import java.util.function.Consumer;
import k2.AbstractC0552y;
import k2.i0;
import k2.m0;
import t.x;
import t0.a0;
import z0.n;

/* loaded from: classes.dex */
public final class f implements ScrollCaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final n f8806a;

    /* renamed from: b, reason: collision with root package name */
    public final M0.h f8807b;

    /* renamed from: c, reason: collision with root package name */
    public final l f8808c;

    /* renamed from: d, reason: collision with root package name */
    public final p2.c f8809d;

    /* renamed from: e, reason: collision with root package name */
    public final j f8810e;

    public f(n nVar, M0.h hVar, p2.c cVar, l lVar) {
        this.f8806a = nVar;
        this.f8807b = hVar;
        this.f8808c = lVar;
        this.f8809d = new p2.c(cVar.f6770d.o(h.f8812d));
        this.f8810e = new j(hVar.f2773d - hVar.f2771b, new e(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(f fVar, ScrollCaptureSession scrollCaptureSession, M0.h hVar, R1.c cVar) {
        c cVar2;
        Q1.a aVar;
        int i3;
        int i4;
        int i5;
        d dVar;
        f fVar2;
        ScrollCaptureSession scrollCaptureSession2;
        int i6;
        int i7;
        int r3;
        int r4;
        Surface surface;
        Surface surface2;
        BlendMode blendMode;
        Surface surface3;
        fVar.getClass();
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i8 = cVar2.f8797k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar2.f8797k = i8 - Integer.MIN_VALUE;
                Object obj = cVar2.f8795i;
                aVar = Q1.a.f3113d;
                i3 = cVar2.f8797k;
                if (i3 != 0) {
                    I2.l.Q(obj);
                    i4 = hVar.f2771b;
                    j jVar = fVar.f8810e;
                    cVar2.f8790d = fVar;
                    cVar2.f8791e = scrollCaptureSession;
                    cVar2.f8792f = hVar;
                    cVar2.f8793g = i4;
                    i5 = hVar.f2773d;
                    cVar2.f8794h = i5;
                    cVar2.f8797k = 1;
                    if (i4 > i5) {
                        jVar.getClass();
                        throw new IllegalArgumentException(("Expected min=" + i4 + " ≤ max=" + i5).toString());
                    }
                    int i9 = i5 - i4;
                    int i10 = jVar.f8817a;
                    if (i9 > i10) {
                        throw new IllegalArgumentException(AbstractC0080b.g(i9, i10, "Expected range (", ") to be ≤ viewportSize=").toString());
                    }
                    float f3 = i4;
                    float f4 = jVar.f8819c;
                    Object obj2 = z.f2729a;
                    if (f3 < f4 || i5 > i10 + f4) {
                        Object a3 = jVar.a((f3 < f4 ? i4 : i5 - i10) - f4, cVar2);
                        if (a3 != aVar) {
                            a3 = obj2;
                        }
                        if (a3 == aVar) {
                            obj2 = a3;
                        }
                    }
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i7 = cVar2.f8794h;
                        i6 = cVar2.f8793g;
                        hVar = cVar2.f8792f;
                        scrollCaptureSession2 = C0.k.b(cVar2.f8791e);
                        fVar2 = cVar2.f8790d;
                        I2.l.Q(obj);
                        j jVar2 = fVar2.f8810e;
                        r3 = AbstractC0381e.r(i6 - B.M(jVar2.f8819c), 0, jVar2.f8817a);
                        j jVar3 = fVar2.f8810e;
                        r4 = AbstractC0381e.r(i7 - B.M(jVar3.f8819c), 0, jVar3.f8817a);
                        int i11 = hVar.f2770a;
                        if (r3 != r4) {
                            return M0.h.f2769e;
                        }
                        a0 c3 = fVar2.f8806a.c();
                        if (c3 == null) {
                            throw new IllegalStateException("Could not find coordinator for semantics node.");
                        }
                        surface = scrollCaptureSession2.getSurface();
                        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                        try {
                            blendMode = BlendMode.CLEAR;
                            lockHardwareCanvas.drawColor(0, blendMode);
                            Canvas canvas = AbstractC0272e.f4266a;
                            C0271d c0271d = new C0271d();
                            c0271d.f4263a = lockHardwareCanvas;
                            c0271d.r(-i11, -r3);
                            c3.t0(c0271d, null);
                            surface3 = scrollCaptureSession2.getSurface();
                            surface3.unlockCanvasAndPost(lockHardwareCanvas);
                            int M3 = B.M(fVar2.f8810e.f8819c);
                            return new M0.h(i11, r3 + M3, hVar.f2772c, r4 + M3);
                        } catch (Throwable th) {
                            surface2 = scrollCaptureSession2.getSurface();
                            surface2.unlockCanvasAndPost(lockHardwareCanvas);
                            throw th;
                        }
                    }
                    int i12 = cVar2.f8794h;
                    int i13 = cVar2.f8793g;
                    hVar = cVar2.f8792f;
                    ScrollCaptureSession b2 = C0.k.b(cVar2.f8791e);
                    f fVar3 = cVar2.f8790d;
                    I2.l.Q(obj);
                    i5 = i12;
                    i4 = i13;
                    scrollCaptureSession = b2;
                    fVar = fVar3;
                }
                dVar = d.f8798f;
                cVar2.f8790d = fVar;
                cVar2.f8791e = scrollCaptureSession;
                cVar2.f8792f = hVar;
                cVar2.f8793g = i4;
                cVar2.f8794h = i5;
                cVar2.f8797k = 2;
                if (C0089d.F(cVar2.getContext()).j(dVar, cVar2) != aVar) {
                    return aVar;
                }
                fVar2 = fVar;
                scrollCaptureSession2 = scrollCaptureSession;
                i6 = i4;
                i7 = i5;
                j jVar22 = fVar2.f8810e;
                r3 = AbstractC0381e.r(i6 - B.M(jVar22.f8819c), 0, jVar22.f8817a);
                j jVar32 = fVar2.f8810e;
                r4 = AbstractC0381e.r(i7 - B.M(jVar32.f8819c), 0, jVar32.f8817a);
                int i112 = hVar.f2770a;
                if (r3 != r4) {
                }
            }
        }
        cVar2 = new c(fVar, cVar);
        Object obj3 = cVar2.f8795i;
        aVar = Q1.a.f3113d;
        i3 = cVar2.f8797k;
        if (i3 != 0) {
        }
        dVar = d.f8798f;
        cVar2.f8790d = fVar;
        cVar2.f8791e = scrollCaptureSession;
        cVar2.f8792f = hVar;
        cVar2.f8793g = i4;
        cVar2.f8794h = i5;
        cVar2.f8797k = 2;
        if (C0089d.F(cVar2.getContext()).j(dVar, cVar2) != aVar) {
        }
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        AbstractC0552y.q(this.f8809d, i0.f5367e, null, new C1061a(this, runnable, null), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        final m0 q2 = AbstractC0552y.q(this.f8809d, null, null, new C1062b(this, scrollCaptureSession, rect, consumer, null), 3);
        q2.L(new x(10, cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: y0.g
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                m0.this.a(null);
            }
        });
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(AbstractC0259J.C(this.f8807b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f8810e.f8819c = 0.0f;
        l lVar = this.f8808c;
        lVar.f8821a.setValue(Boolean.TRUE);
        runnable.run();
    }
}
