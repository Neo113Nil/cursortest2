package z0;

import A0.p;
import D0.n;
import D0.q;
import I.C0143d;
import R1.y;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.Surface;
import b0.AbstractC0335d;
import b0.C0334c;
import b0.M;
import h2.AbstractC0508a;
import java.util.function.Consumer;
import q2.AbstractC0837y;
import q2.i0;
import q2.m0;
import r0.C0929z;
import t0.b0;
import z.C1252p;

/* loaded from: classes.dex */
public final class f implements ScrollCaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final p f10531a;

    /* renamed from: b, reason: collision with root package name */
    public final O0.i f10532b;

    /* renamed from: c, reason: collision with root package name */
    public final j f10533c;

    /* renamed from: d, reason: collision with root package name */
    public final v2.c f10534d;

    /* renamed from: e, reason: collision with root package name */
    public final q f10535e;

    public f(p pVar, O0.i iVar, v2.c cVar, j jVar) {
        this.f10531a = pVar;
        this.f10532b = iVar;
        this.f10533c = jVar;
        this.f10534d = new v2.c(cVar.f9791d.d(g.f10536d));
        this.f10535e = new q(iVar.a(), new e(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(f fVar, ScrollCaptureSession scrollCaptureSession, O0.i iVar, X1.c cVar) {
        C1261c c1261c;
        W1.a aVar;
        int i3;
        int i4;
        int i5;
        C1262d c1262d;
        V1.i iVar2;
        f fVar2;
        ScrollCaptureSession scrollCaptureSession2;
        int i6;
        int i7;
        int y3;
        int y4;
        Surface surface;
        Surface surface2;
        BlendMode blendMode;
        Surface surface3;
        fVar.getClass();
        if (cVar instanceof C1261c) {
            c1261c = (C1261c) cVar;
            int i8 = c1261c.f10522n;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c1261c.f10522n = i8 - Integer.MIN_VALUE;
                Object obj = c1261c.f10520l;
                aVar = W1.a.f4608d;
                i3 = c1261c.f10522n;
                if (i3 != 0) {
                    R1.a.e(obj);
                    i4 = iVar.f3737b;
                    q qVar = fVar.f10535e;
                    c1261c.f10515g = fVar;
                    c1261c.f10516h = scrollCaptureSession;
                    c1261c.f10517i = iVar;
                    c1261c.f10518j = i4;
                    i5 = iVar.f3739d;
                    c1261c.f10519k = i5;
                    c1261c.f10522n = 1;
                    if (i4 > i5) {
                        qVar.getClass();
                        throw new IllegalArgumentException(("Expected min=" + i4 + " ≤ max=" + i5).toString());
                    }
                    int i9 = i5 - i4;
                    int i10 = qVar.f851a;
                    if (i9 > i10) {
                        throw new IllegalArgumentException(A.k.f(i9, i10, "Expected range (", ") to be ≤ viewportSize=").toString());
                    }
                    float f3 = i4;
                    float f4 = qVar.f852b;
                    Object obj2 = y.f4171a;
                    if (f3 < f4 || i5 > i10 + f4) {
                        Object b3 = qVar.b((f3 < f4 ? i4 : i5 - i10) - f4, c1261c);
                        if (b3 != aVar) {
                            b3 = obj2;
                        }
                        if (b3 == aVar) {
                            obj2 = b3;
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
                        i7 = c1261c.f10519k;
                        i6 = c1261c.f10518j;
                        iVar = c1261c.f10517i;
                        scrollCaptureSession2 = n.b(c1261c.f10516h);
                        fVar2 = c1261c.f10515g;
                        R1.a.e(obj);
                        q qVar2 = fVar2.f10535e;
                        y3 = O2.d.y(i6 - AbstractC0508a.Q(qVar2.f852b), 0, qVar2.f851a);
                        q qVar3 = fVar2.f10535e;
                        y4 = O2.d.y(i7 - AbstractC0508a.Q(qVar3.f852b), 0, qVar3.f851a);
                        int i11 = iVar.f3736a;
                        if (y3 != y4) {
                            return O0.i.f3735e;
                        }
                        b0 c2 = fVar2.f10531a.c();
                        if (c2 == null) {
                            throw new IllegalStateException("Could not find coordinator for semantics node.");
                        }
                        surface = scrollCaptureSession2.getSurface();
                        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                        try {
                            blendMode = BlendMode.CLEAR;
                            lockHardwareCanvas.drawColor(0, blendMode);
                            Canvas canvas = AbstractC0335d.f5408a;
                            C0334c c0334c = new C0334c();
                            c0334c.f5405a = lockHardwareCanvas;
                            c0334c.s(-i11, -y3);
                            c2.C0(c0334c, null);
                            surface3 = scrollCaptureSession2.getSurface();
                            surface3.unlockCanvasAndPost(lockHardwareCanvas);
                            int Q3 = AbstractC0508a.Q(fVar2.f10535e.f852b);
                            return new O0.i(i11, y3 + Q3, iVar.f3738c, y4 + Q3);
                        } catch (Throwable th) {
                            surface2 = scrollCaptureSession2.getSurface();
                            surface2.unlockCanvasAndPost(lockHardwareCanvas);
                            throw th;
                        }
                    }
                    int i12 = c1261c.f10519k;
                    int i13 = c1261c.f10518j;
                    iVar = c1261c.f10517i;
                    ScrollCaptureSession b4 = n.b(c1261c.f10516h);
                    f fVar3 = c1261c.f10515g;
                    R1.a.e(obj);
                    i5 = i12;
                    i4 = i13;
                    scrollCaptureSession = b4;
                    fVar = fVar3;
                }
                c1262d = C1262d.f10523f;
                c1261c.f10515g = fVar;
                c1261c.f10516h = scrollCaptureSession;
                c1261c.f10517i = iVar;
                c1261c.f10518j = i4;
                c1261c.f10519k = i5;
                c1261c.f10522n = 2;
                iVar2 = c1261c.f4642e;
                f2.j.c(iVar2);
                if (C0143d.F(iVar2).n(c1262d, c1261c) != aVar) {
                    return aVar;
                }
                fVar2 = fVar;
                scrollCaptureSession2 = scrollCaptureSession;
                i6 = i4;
                i7 = i5;
                q qVar22 = fVar2.f10535e;
                y3 = O2.d.y(i6 - AbstractC0508a.Q(qVar22.f852b), 0, qVar22.f851a);
                q qVar32 = fVar2.f10535e;
                y4 = O2.d.y(i7 - AbstractC0508a.Q(qVar32.f852b), 0, qVar32.f851a);
                int i112 = iVar.f3736a;
                if (y3 != y4) {
                }
            }
        }
        c1261c = new C1261c(fVar, cVar);
        Object obj3 = c1261c.f10520l;
        aVar = W1.a.f4608d;
        i3 = c1261c.f10522n;
        if (i3 != 0) {
        }
        c1262d = C1262d.f10523f;
        c1261c.f10515g = fVar;
        c1261c.f10516h = scrollCaptureSession;
        c1261c.f10517i = iVar;
        c1261c.f10518j = i4;
        c1261c.f10519k = i5;
        c1261c.f10522n = 2;
        iVar2 = c1261c.f4642e;
        f2.j.c(iVar2);
        if (C0143d.F(iVar2).n(c1262d, c1261c) != aVar) {
        }
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        AbstractC0837y.r(this.f10534d, i0.f7906e, null, new C1259a(this, runnable, null), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        m0 r3 = AbstractC0837y.r(this.f10534d, null, null, new C1260b(this, scrollCaptureSession, rect, consumer, null), 3);
        r3.x(new C0929z(17, cancellationSignal));
        cancellationSignal.setOnCancelListener(new C1252p(1, r3));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(M.A(this.f10532b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f10535e.f852b = 0.0f;
        j jVar = this.f10533c;
        jVar.f10542a.setValue(Boolean.TRUE);
        runnable.run();
    }
}
