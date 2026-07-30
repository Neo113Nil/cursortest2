package x1;

import a0.e0;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.Surface;
import androidx.lifecycle.g0;
import b2.l;
import b2.o;
import c7.a0;
import c7.i1;
import c7.m1;
import d6.z;
import java.util.function.Consumer;
import r1.a1;
import s1.l0;
import y1.m;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e implements ScrollCaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final m f9653a;

    /* renamed from: b, reason: collision with root package name */
    public final m2.i f9654b;

    /* renamed from: c, reason: collision with root package name */
    public final j f9655c;

    /* renamed from: d, reason: collision with root package name */
    public final h7.c f9656d;

    /* renamed from: e, reason: collision with root package name */
    public final o f9657e;

    public e(m mVar, m2.i iVar, h7.c cVar, j jVar) {
        this.f9653a = mVar;
        this.f9654b = iVar;
        this.f9655c = jVar;
        this.f9656d = new h7.c(cVar.f4673f.z(g.f9660f));
        this.f9657e = new o(iVar.f6320d - iVar.f6318b, new d(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x009a, code lost:
    
        if (r9 == r4) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, ScrollCaptureSession scrollCaptureSession, m2.i iVar, j6.c cVar) {
        b bVar;
        int i7;
        i6.a aVar;
        int i8;
        int i9;
        c cVar2;
        e eVar2;
        int i10;
        ScrollCaptureSession scrollCaptureSession2;
        int i11;
        int e9;
        int e10;
        Surface surface;
        Surface surface2;
        Surface surface3;
        BlendMode unused;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i12 = bVar.f9645m;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f9645m = i12 - Integer.MIN_VALUE;
                Object obj = bVar.f9643k;
                i7 = bVar.f9645m;
                aVar = i6.a.f4956f;
                if (i7 != 0) {
                    d6.a.e(obj);
                    i8 = iVar.f6318b;
                    i9 = iVar.f6320d;
                    o oVar = eVar.f9657e;
                    bVar.f9638f = eVar;
                    bVar.f9639g = scrollCaptureSession;
                    bVar.f9640h = iVar;
                    bVar.f9641i = i8;
                    bVar.f9642j = i9;
                    bVar.f9645m = 1;
                    int i13 = oVar.f1289a;
                    if (i8 > i9) {
                        throw new IllegalArgumentException(r6.i.b(i8, i9, "Expected min=", " ≤ max=").toString());
                    }
                    int i14 = i9 - i8;
                    if (i14 > i13) {
                        throw new IllegalArgumentException(r6.i.b(i14, i13, "Expected range (", ") to be ≤ viewportSize=").toString());
                    }
                    float f9 = i8;
                    float f10 = oVar.f1290b;
                    Object obj2 = z.f2639a;
                    if (f9 < f10 || i9 > i13 + f10) {
                        Object b9 = oVar.b((f9 < f10 ? i8 : i9 - i13) - f10, bVar);
                        if (b9 != aVar) {
                            b9 = obj2;
                        }
                        if (b9 == aVar) {
                            obj2 = b9;
                        }
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i10 = bVar.f9642j;
                        i11 = bVar.f9641i;
                        iVar = bVar.f9640h;
                        scrollCaptureSession2 = l.c(bVar.f9639g);
                        eVar2 = bVar.f9638f;
                        d6.a.e(obj);
                        o oVar2 = eVar2.f9657e;
                        e9 = v1.g.e(i11 - t6.a.O(oVar2.f1290b), 0, oVar2.f1289a);
                        o oVar3 = eVar2.f9657e;
                        e10 = v1.g.e(i10 - t6.a.O(oVar3.f1290b), 0, oVar3.f1289a);
                        int i15 = iVar.f6317a;
                        int i16 = iVar.f6319c;
                        if (e9 != e10) {
                            return m2.i.f6316e;
                        }
                        a1 c4 = eVar2.f9653a.c();
                        if (c4 == null) {
                            throw new IllegalStateException("Could not find coordinator for semantics node.");
                        }
                        surface = scrollCaptureSession2.getSurface();
                        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                        try {
                            unused = BlendMode.CLEAR;
                            lockHardwareCanvas.drawColor(0, BlendMode.CLEAR);
                            Canvas canvas = z0.e.f9988a;
                            z0.d dVar = new z0.d();
                            dVar.f9984a = lockHardwareCanvas;
                            dVar.k(-i15, -e9);
                            c4.E0(dVar, null);
                            surface3 = scrollCaptureSession2.getSurface();
                            surface3.unlockCanvasAndPost(lockHardwareCanvas);
                            int O = t6.a.O(eVar2.f9657e.f1290b);
                            return new m2.i(i15, e9 + O, i16, e10 + O);
                        } catch (Throwable th) {
                            surface2 = scrollCaptureSession2.getSurface();
                            surface2.unlockCanvasAndPost(lockHardwareCanvas);
                            throw th;
                        }
                    }
                    int i17 = bVar.f9642j;
                    int i18 = bVar.f9641i;
                    iVar = bVar.f9640h;
                    ScrollCaptureSession c6 = l.c(bVar.f9639g);
                    e eVar3 = bVar.f9638f;
                    d6.a.e(obj);
                    i8 = i18;
                    scrollCaptureSession = c6;
                    i9 = i17;
                    eVar = eVar3;
                }
                cVar2 = c.f9646h;
                bVar.f9638f = eVar;
                bVar.f9639g = scrollCaptureSession;
                bVar.f9640h = iVar;
                bVar.f9641i = i8;
                bVar.f9642j = i9;
                bVar.f9645m = 2;
                if (g0.d.E(bVar.getContext()).t(cVar2, bVar) != aVar) {
                    eVar2 = eVar;
                    i10 = i9;
                    scrollCaptureSession2 = scrollCaptureSession;
                    i11 = i8;
                    o oVar22 = eVar2.f9657e;
                    e9 = v1.g.e(i11 - t6.a.O(oVar22.f1290b), 0, oVar22.f1289a);
                    o oVar32 = eVar2.f9657e;
                    e10 = v1.g.e(i10 - t6.a.O(oVar32.f1290b), 0, oVar32.f1289a);
                    int i152 = iVar.f6317a;
                    int i162 = iVar.f6319c;
                    if (e9 != e10) {
                    }
                }
                return aVar;
            }
        }
        bVar = new b(eVar, cVar);
        Object obj3 = bVar.f9643k;
        i7 = bVar.f9645m;
        aVar = i6.a.f4956f;
        if (i7 != 0) {
        }
        cVar2 = c.f9646h;
        bVar.f9638f = eVar;
        bVar.f9639g = scrollCaptureSession;
        bVar.f9640h = iVar;
        bVar.f9641i = i8;
        bVar.f9642j = i9;
        bVar.f9645m = 2;
        if (g0.d.E(bVar.getContext()).t(cVar2, bVar) != aVar) {
        }
        return aVar;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        a0.p(this.f9656d, i1.f1705g, null, new e0(this, runnable, null, 29), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        m1 p6 = a0.p(this.f9656d, null, null, new g0(this, scrollCaptureSession, rect, consumer, null, 12), 3);
        p6.I(new l0(12, cancellationSignal));
        cancellationSignal.setOnCancelListener(new f(0, p6));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(z0.l0.t(this.f9654b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f9657e.f1290b = 0.0f;
        this.f9655c.f9666a.setValue(Boolean.TRUE);
        runnable.run();
    }
}
