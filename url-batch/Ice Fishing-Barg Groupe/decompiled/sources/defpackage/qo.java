package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.Surface;
import java.util.function.Consumer;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class qo implements ScrollCaptureCallback {
    public final d32 PxuCJdSBwIXG;
    public final i2 TSizfFm2Yiuu;
    public final r1 Y1f8riQaR6yg;
    public final bk0 a92UlCVFR9N8;
    public final at e9gEMXR7LXtO;
    public final dr0 lS5Rgt96tfkO;

    public qo(d32 d32Var, dr0 dr0Var, at atVar, i2 i2Var, r1 r1Var) {
        this.PxuCJdSBwIXG = d32Var;
        this.lS5Rgt96tfkO = dr0Var;
        this.TSizfFm2Yiuu = i2Var;
        this.Y1f8riQaR6yg = r1Var;
        this.e9gEMXR7LXtO = new at(atVar.rtx2ld2ELZv4.RfyTYNmI9Srp(d00.OPXfSBeufaJ8));
        this.a92UlCVFR9N8 = new bk0(dr0Var.Y1f8riQaR6yg - dr0Var.lS5Rgt96tfkO, new po(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x008f, code lost:
    
        if (r9 == r5) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object PxuCJdSBwIXG(qo qoVar, ScrollCaptureSession scrollCaptureSession, dr0 dr0Var, ct ctVar) {
        oo ooVar;
        int i;
        su suVar;
        int i2;
        int i3;
        k1 k1Var;
        hu huVar;
        ScrollCaptureSession scrollCaptureSession2;
        int i4;
        dr0 dr0Var2;
        int i5;
        int wdg6QnbFHrFF;
        int wdg6QnbFHrFF2;
        Surface surface;
        Surface surface2;
        Surface surface3;
        if (ctVar instanceof oo) {
            ooVar = (oo) ctVar;
            int i6 = ooVar.BRwzKIf41E4i;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                ooVar.BRwzKIf41E4i = i6 - Integer.MIN_VALUE;
                Object obj = ooVar.QrzZRwfaDlRX;
                i = ooVar.BRwzKIf41E4i;
                suVar = su.rtx2ld2ELZv4;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    i2 = dr0Var.lS5Rgt96tfkO;
                    i3 = dr0Var.Y1f8riQaR6yg;
                    bk0 bk0Var = qoVar.a92UlCVFR9N8;
                    ooVar.dgRBjINgWbAK = scrollCaptureSession;
                    ooVar.x50lh2ztY7Y5 = dr0Var;
                    ooVar.cpQdD2nAriOS = i2;
                    ooVar.r3s1LDPKFs1S = i3;
                    ooVar.BRwzKIf41E4i = 1;
                    int i7 = bk0Var.PxuCJdSBwIXG;
                    if (i2 > i3) {
                        u9.e9gEMXR7LXtO(o0.rtx2ld2ELZv4(i2, i3, "Expected min=", " ≤ max="));
                        return null;
                    }
                    int i8 = i3 - i2;
                    if (i8 > i7) {
                        u9.e9gEMXR7LXtO(o0.rtx2ld2ELZv4(i8, i7, "Expected range (", ") to be ≤ viewportSize="));
                        return null;
                    }
                    float f = i2;
                    float f2 = bk0Var.lS5Rgt96tfkO;
                    Object obj2 = no2.PxuCJdSBwIXG;
                    if (f < f2 || i3 > i7 + f2) {
                        Object lS5Rgt96tfkO = bk0Var.lS5Rgt96tfkO((((i8 / 2) + i2) - (i7 / 2)) - f2, ooVar);
                        if (lS5Rgt96tfkO != suVar) {
                            lS5Rgt96tfkO = obj2;
                        }
                        if (lS5Rgt96tfkO == suVar) {
                            obj2 = lS5Rgt96tfkO;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i4 = ooVar.r3s1LDPKFs1S;
                        i5 = ooVar.cpQdD2nAriOS;
                        dr0Var2 = ooVar.x50lh2ztY7Y5;
                        scrollCaptureSession2 = b2.rtx2ld2ELZv4(ooVar.dgRBjINgWbAK);
                        ng0.tmVwIGCQF4zR(obj);
                        bk0 bk0Var2 = qoVar.a92UlCVFR9N8;
                        wdg6QnbFHrFF = ng0.wdg6QnbFHrFF(i5 - b51.IXK6ba3ucyzm(bk0Var2.lS5Rgt96tfkO), 0, bk0Var2.PxuCJdSBwIXG);
                        bk0 bk0Var3 = qoVar.a92UlCVFR9N8;
                        wdg6QnbFHrFF2 = ng0.wdg6QnbFHrFF(i4 - b51.IXK6ba3ucyzm(bk0Var3.lS5Rgt96tfkO), 0, bk0Var3.PxuCJdSBwIXG);
                        int i9 = dr0Var2.PxuCJdSBwIXG;
                        int i10 = dr0Var2.TSizfFm2Yiuu;
                        if (wdg6QnbFHrFF != wdg6QnbFHrFF2) {
                            dr0.Companion.getClass();
                            return dr0.e9gEMXR7LXtO;
                        }
                        surface = scrollCaptureSession2.getSurface();
                        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                        try {
                            lockHardwareCanvas.save();
                            lockHardwareCanvas.translate(-i9, -wdg6QnbFHrFF);
                            dr0 dr0Var3 = qoVar.lS5Rgt96tfkO;
                            lockHardwareCanvas.translate(-dr0Var3.PxuCJdSBwIXG, -dr0Var3.lS5Rgt96tfkO);
                            qoVar.Y1f8riQaR6yg.getRootView().draw(lockHardwareCanvas);
                            surface3 = scrollCaptureSession2.getSurface();
                            surface3.unlockCanvasAndPost(lockHardwareCanvas);
                            int IXK6ba3ucyzm = b51.IXK6ba3ucyzm(qoVar.a92UlCVFR9N8.lS5Rgt96tfkO);
                            return new dr0(i9, wdg6QnbFHrFF + IXK6ba3ucyzm, i10, wdg6QnbFHrFF2 + IXK6ba3ucyzm);
                        } catch (Throwable th) {
                            surface2 = scrollCaptureSession2.getSurface();
                            surface2.unlockCanvasAndPost(lockHardwareCanvas);
                            throw th;
                        }
                    }
                    int i11 = ooVar.r3s1LDPKFs1S;
                    int i12 = ooVar.cpQdD2nAriOS;
                    dr0 dr0Var4 = ooVar.x50lh2ztY7Y5;
                    ScrollCaptureSession rtx2ld2ELZv4 = b2.rtx2ld2ELZv4(ooVar.dgRBjINgWbAK);
                    ng0.tmVwIGCQF4zR(obj);
                    i2 = i12;
                    dr0Var = dr0Var4;
                    i3 = i11;
                    scrollCaptureSession = rtx2ld2ELZv4;
                }
                k1Var = k1.EcgxDIVH5in8;
                ooVar.dgRBjINgWbAK = scrollCaptureSession;
                ooVar.x50lh2ztY7Y5 = dr0Var;
                ooVar.cpQdD2nAriOS = i2;
                ooVar.r3s1LDPKFs1S = i3;
                ooVar.BRwzKIf41E4i = 2;
                huVar = ooVar.OPXfSBeufaJ8;
                huVar.getClass();
                if (ki0.BjEWd04qc7Mw(huVar).PxuCJdSBwIXG(ooVar, k1Var) != suVar) {
                    scrollCaptureSession2 = scrollCaptureSession;
                    i4 = i3;
                    dr0Var2 = dr0Var;
                    i5 = i2;
                    bk0 bk0Var22 = qoVar.a92UlCVFR9N8;
                    wdg6QnbFHrFF = ng0.wdg6QnbFHrFF(i5 - b51.IXK6ba3ucyzm(bk0Var22.lS5Rgt96tfkO), 0, bk0Var22.PxuCJdSBwIXG);
                    bk0 bk0Var32 = qoVar.a92UlCVFR9N8;
                    wdg6QnbFHrFF2 = ng0.wdg6QnbFHrFF(i4 - b51.IXK6ba3ucyzm(bk0Var32.lS5Rgt96tfkO), 0, bk0Var32.PxuCJdSBwIXG);
                    int i92 = dr0Var2.PxuCJdSBwIXG;
                    int i102 = dr0Var2.TSizfFm2Yiuu;
                    if (wdg6QnbFHrFF != wdg6QnbFHrFF2) {
                    }
                }
                return suVar;
            }
        }
        ooVar = new oo(qoVar, ctVar);
        Object obj3 = ooVar.QrzZRwfaDlRX;
        i = ooVar.BRwzKIf41E4i;
        suVar = su.rtx2ld2ELZv4;
        if (i != 0) {
        }
        k1Var = k1.EcgxDIVH5in8;
        ooVar.dgRBjINgWbAK = scrollCaptureSession;
        ooVar.x50lh2ztY7Y5 = dr0Var;
        ooVar.cpQdD2nAriOS = i2;
        ooVar.r3s1LDPKFs1S = i3;
        ooVar.BRwzKIf41E4i = 2;
        huVar = ooVar.OPXfSBeufaJ8;
        huVar.getClass();
        if (ki0.BjEWd04qc7Mw(huVar).PxuCJdSBwIXG(ooVar, k1Var) != suVar) {
        }
        return suVar;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        fx1.KUoIVIumpKat(this.e9gEMXR7LXtO, vd1.OPXfSBeufaJ8, new a92UlCVFR9N8(this, runnable, null, 12), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        z82 KUoIVIumpKat = fx1.KUoIVIumpKat(this.e9gEMXR7LXtO, null, new e4(this, scrollCaptureSession, rect, consumer, null, 2), 3);
        KUoIVIumpKat.aF05bpZJlKEP(new y(8, cancellationSignal));
        cancellationSignal.setOnCancelListener(new ro(0, KUoIVIumpKat));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(vi0.IXK6ba3ucyzm(this.lS5Rgt96tfkO));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.a92UlCVFR9N8.lS5Rgt96tfkO = 0.0f;
        ((mj1) this.TSizfFm2Yiuu.OPXfSBeufaJ8).setValue(Boolean.TRUE);
        runnable.run();
    }
}
