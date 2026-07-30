package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.Surface;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class tk implements ScrollCaptureCallback {
    public final l81 a;
    public final x90 b;
    public final fg0 c;
    public final d4 d;
    public final cn e;
    public final h21 f;

    public tk(l81 l81Var, x90 x90Var, cn cnVar, fg0 fg0Var, d4 d4Var) {
        this.a = l81Var;
        this.b = x90Var;
        this.c = fg0Var;
        this.d = d4Var;
        this.e = new cn(cnVar.d.i(gs.d));
        this.f = new h21(x90Var.d - x90Var.b, new sk(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a5, code lost:
    
        if (r3 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(tk tkVar, ScrollCaptureSession scrollCaptureSession, x90 x90Var, fn fnVar) {
        rk rkVar;
        tn tnVar;
        int i;
        int i2;
        int i3;
        Object a;
        ScrollCaptureSession scrollCaptureSession2;
        int i4;
        x90 x90Var2;
        int i5;
        y3 y3Var;
        CoroutineContext coroutineContext;
        x90 x90Var3;
        ScrollCaptureSession scrollCaptureSession3;
        int c;
        int c2;
        Surface surface;
        Surface surface2;
        Surface surface3;
        if (fnVar instanceof rk) {
            rkVar = (rk) fnVar;
            int i6 = rkVar.n;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                rkVar.n = i6 - Integer.MIN_VALUE;
                Object obj = rkVar.l;
                tnVar = tn.d;
                i = rkVar.n;
                if (i != 0) {
                    ca0.v(obj);
                    i2 = x90Var.b;
                    i3 = x90Var.d;
                    h21 h21Var = tkVar.f;
                    rkVar.h = scrollCaptureSession;
                    rkVar.i = x90Var;
                    rkVar.j = i2;
                    rkVar.k = i3;
                    rkVar.n = 1;
                    int i7 = h21Var.a;
                    if (i2 > i3) {
                        af.d(i2, i3, " ≤ max=", "Expected min=");
                        return null;
                    }
                    int i8 = i3 - i2;
                    if (i8 > i7) {
                        af.d(i8, i7, ") to be ≤ viewportSize=", "Expected range (");
                        return null;
                    }
                    float f = i2;
                    float f2 = h21Var.c;
                    if (f < f2 || i3 > i7 + f2) {
                        a = h21Var.a((((i8 / 2) + i2) - (i7 / 2)) - f2, rkVar);
                        if (a != tnVar) {
                            a = Unit.a;
                        }
                        if (a != tnVar) {
                            a = Unit.a;
                        }
                    } else {
                        a = Unit.a;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            i4 = rkVar.k;
                            i5 = rkVar.j;
                            x90Var2 = rkVar.i;
                            scrollCaptureSession2 = o3.e(rkVar.h);
                            ca0.v(obj);
                            y3Var = y3.n;
                            rkVar.h = scrollCaptureSession2;
                            rkVar.i = x90Var2;
                            rkVar.j = i5;
                            rkVar.k = i4;
                            rkVar.n = 3;
                            coroutineContext = rkVar.e;
                            coroutineContext.getClass();
                            if (t90.r(coroutineContext).j(y3Var, rkVar) != tnVar) {
                                x90Var3 = x90Var2;
                                scrollCaptureSession3 = scrollCaptureSession2;
                                h21 h21Var2 = tkVar.f;
                                c = b11.c(i5 - pk0.a(h21Var2.c), 0, h21Var2.a);
                                h21 h21Var3 = tkVar.f;
                                c2 = b11.c(i4 - pk0.a(h21Var3.c), 0, h21Var3.a);
                                int i9 = x90Var3.a;
                                int i10 = x90Var3.c;
                                if (c != c2) {
                                }
                            }
                            return tnVar;
                        }
                        if (i != 3) {
                            dd0.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i4 = rkVar.k;
                        i5 = rkVar.j;
                        x90Var3 = rkVar.i;
                        scrollCaptureSession3 = o3.e(rkVar.h);
                        ca0.v(obj);
                        h21 h21Var22 = tkVar.f;
                        c = b11.c(i5 - pk0.a(h21Var22.c), 0, h21Var22.a);
                        h21 h21Var32 = tkVar.f;
                        c2 = b11.c(i4 - pk0.a(h21Var32.c), 0, h21Var32.a);
                        int i92 = x90Var3.a;
                        int i102 = x90Var3.c;
                        if (c != c2) {
                            return x90.e;
                        }
                        surface = scrollCaptureSession3.getSurface();
                        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                        try {
                            lockHardwareCanvas.save();
                            lockHardwareCanvas.translate(-i92, -c);
                            x90 x90Var4 = tkVar.b;
                            lockHardwareCanvas.translate(-x90Var4.a, -x90Var4.b);
                            tkVar.d.getRootView().draw(lockHardwareCanvas);
                            surface3 = scrollCaptureSession3.getSurface();
                            surface3.unlockCanvasAndPost(lockHardwareCanvas);
                            int a2 = pk0.a(tkVar.f.c);
                            return new x90(i92, c + a2, i102, c2 + a2);
                        } catch (Throwable th) {
                            surface2 = scrollCaptureSession3.getSurface();
                            surface2.unlockCanvasAndPost(lockHardwareCanvas);
                            throw th;
                        }
                    }
                    int i11 = rkVar.k;
                    int i12 = rkVar.j;
                    x90 x90Var5 = rkVar.i;
                    ScrollCaptureSession e = o3.e(rkVar.h);
                    ca0.v(obj);
                    i2 = i12;
                    x90Var = x90Var5;
                    i3 = i11;
                    scrollCaptureSession = e;
                }
                scrollCaptureSession2 = scrollCaptureSession;
                i4 = i3;
                x90Var2 = x90Var;
                i5 = i2;
                y3Var = y3.n;
                rkVar.h = scrollCaptureSession2;
                rkVar.i = x90Var2;
                rkVar.j = i5;
                rkVar.k = i4;
                rkVar.n = 3;
                coroutineContext = rkVar.e;
                coroutineContext.getClass();
                if (t90.r(coroutineContext).j(y3Var, rkVar) != tnVar) {
                }
                return tnVar;
            }
        }
        rkVar = new rk(tkVar, fnVar);
        Object obj2 = rkVar.l;
        tnVar = tn.d;
        i = rkVar.n;
        if (i != 0) {
        }
        scrollCaptureSession2 = scrollCaptureSession;
        i4 = i3;
        x90Var2 = x90Var;
        i5 = i2;
        y3Var = y3.n;
        rkVar.h = scrollCaptureSession2;
        rkVar.i = x90Var2;
        rkVar.j = i5;
        rkVar.k = i4;
        rkVar.n = 3;
        coroutineContext = rkVar.e;
        coroutineContext.getClass();
        if (t90.r(coroutineContext).j(y3Var, rkVar) != tnVar) {
        }
        return tnVar;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        uq1.N(this.e, up0.e, new d(this, runnable, (dn) null, 5), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        final rc1 N = uq1.N(this.e, null, new qk(this, scrollCaptureSession, rect, consumer, null, 0), 3);
        N.h(new a3(8, cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: uk
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                rc1.this.a(null);
            }
        });
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(t80.L(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.c = 0.0f;
        this.c.a.setValue(Boolean.TRUE);
        runnable.run();
    }
}
