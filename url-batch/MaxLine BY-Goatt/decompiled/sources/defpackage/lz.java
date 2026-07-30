package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lz implements ScrollCaptureCallback {
    public final ai2 a;
    public final u31 b;
    public final j20 c;
    public final t7 d;
    public final m30 e;
    public final yx0 f;

    public lz(ai2 ai2Var, u31 u31Var, m30 m30Var, j20 j20Var, t7 t7Var) {
        this.a = ai2Var;
        this.b = u31Var;
        this.c = j20Var;
        this.d = t7Var;
        this.e = new m30(m30Var.m.p(kb0.m));
        this.f = new yx0(u31Var.d - u31Var.b, new lx2(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0092, code lost:
    
        if (r3 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(lz lzVar, ScrollCaptureSession scrollCaptureSession, u31 u31Var, r30 r30Var) {
        kz kzVar;
        b50 b50Var;
        int i;
        int i2;
        int i3;
        Object b;
        o3 o3Var;
        ScrollCaptureSession scrollCaptureSession2;
        u31 u31Var2;
        int i4;
        int i5;
        int c;
        int c2;
        if (r30Var instanceof kz) {
            kzVar = (kz) r30Var;
            int i6 = kzVar.s;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                kzVar.s = i6 - Integer.MIN_VALUE;
                Object obj = kzVar.q;
                b50Var = b50.m;
                i = kzVar.s;
                if (i != 0) {
                    ca2.b(obj);
                    i2 = u31Var.b;
                    i3 = u31Var.d;
                    yx0 yx0Var = lzVar.f;
                    kzVar.m = scrollCaptureSession;
                    kzVar.n = u31Var;
                    kzVar.o = i2;
                    kzVar.p = i3;
                    kzVar.s = 1;
                    int i7 = yx0Var.a;
                    if (i2 > i3) {
                        lh.c(q40.j("Expected min=", i2, i3, " ≤ max="));
                        return null;
                    }
                    int i8 = i3 - i2;
                    if (i8 > i7) {
                        lh.c(q40.j("Expected range (", i8, i7, ") to be ≤ viewportSize="));
                        return null;
                    }
                    float f = i2;
                    float f2 = yx0Var.b;
                    if (f < f2 || i3 > i7 + f2) {
                        b = yx0Var.b((f < f2 ? i2 : i3 - i7) - f2, kzVar);
                        if (b != b50Var) {
                            b = Unit.a;
                        }
                        if (b != b50Var) {
                            b = Unit.a;
                        }
                    } else {
                        b = Unit.a;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i5 = kzVar.p;
                        i4 = kzVar.o;
                        u31Var2 = kzVar.n;
                        scrollCaptureSession2 = (ScrollCaptureSession) kzVar.m;
                        ca2.b(obj);
                        yx0 yx0Var2 = lzVar.f;
                        c = d.c(i4 - si1.b(yx0Var2.b), 0, yx0Var2.a);
                        yx0 yx0Var3 = lzVar.f;
                        c2 = d.c(i5 - si1.b(yx0Var3.b), 0, yx0Var3.a);
                        int i9 = u31Var2.a;
                        int i10 = u31Var2.c;
                        if (c != c2) {
                            return u31.e;
                        }
                        Canvas lockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
                        try {
                            lockHardwareCanvas.save();
                            lockHardwareCanvas.translate(-i9, -c);
                            u31 u31Var3 = lzVar.b;
                            lockHardwareCanvas.translate(-u31Var3.a, -u31Var3.b);
                            lzVar.d.getRootView().draw(lockHardwareCanvas);
                            scrollCaptureSession2.getSurface().unlockCanvasAndPost(lockHardwareCanvas);
                            int b2 = si1.b(lzVar.f.b);
                            return new u31(i9, c + b2, i10, c2 + b2);
                        } catch (Throwable th) {
                            scrollCaptureSession2.getSurface().unlockCanvasAndPost(lockHardwareCanvas);
                            throw th;
                        }
                    }
                    int i11 = kzVar.p;
                    int i12 = kzVar.o;
                    u31 u31Var4 = kzVar.n;
                    ScrollCaptureSession scrollCaptureSession3 = (ScrollCaptureSession) kzVar.m;
                    ca2.b(obj);
                    i2 = i12;
                    u31Var = u31Var4;
                    i3 = i11;
                    scrollCaptureSession = scrollCaptureSession3;
                }
                o3Var = o3.G;
                kzVar.m = scrollCaptureSession;
                kzVar.n = u31Var;
                kzVar.o = i2;
                kzVar.p = i3;
                kzVar.s = 2;
                if (iv1.F(kzVar.getContext()).B(o3Var, kzVar) != b50Var) {
                    scrollCaptureSession2 = scrollCaptureSession;
                    u31Var2 = u31Var;
                    i4 = i2;
                    i5 = i3;
                    yx0 yx0Var22 = lzVar.f;
                    c = d.c(i4 - si1.b(yx0Var22.b), 0, yx0Var22.a);
                    yx0 yx0Var32 = lzVar.f;
                    c2 = d.c(i5 - si1.b(yx0Var32.b), 0, yx0Var32.a);
                    int i92 = u31Var2.a;
                    int i102 = u31Var2.c;
                    if (c != c2) {
                    }
                }
                return b50Var;
            }
        }
        kzVar = new kz(lzVar, r30Var);
        Object obj2 = kzVar.q;
        b50Var = b50.m;
        i = kzVar.s;
        if (i != 0) {
        }
        o3Var = o3.G;
        kzVar.m = scrollCaptureSession;
        kzVar.n = u31Var;
        kzVar.o = i2;
        kzVar.p = i3;
        kzVar.s = 2;
        if (iv1.F(kzVar.getContext()).B(o3Var, kzVar) != b50Var) {
        }
        return b50Var;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        z71.H(this.e, qs1.n, new v(this, runnable, null, 13), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        jo2 H = z71.H(this.e, null, new j5(this, scrollCaptureSession, rect, consumer, null, 3), 3);
        H.o(new j6(11, cancellationSignal));
        cancellationSignal.setOnCancelListener(new mz(0, H));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(bd3.H(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.b = 0.0f;
        ((lz1) this.c.b).setValue(Boolean.TRUE);
        runnable.run();
    }
}
