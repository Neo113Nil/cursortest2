package c2;

import a0.q;
import a7.d1;
import a7.h1;
import a7.x;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.Surface;
import c6.m;
import d2.n;
import f1.p;
import java.util.function.Consumer;
import r2.o;
import x1.t;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e implements ScrollCaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final n f1592a;

    /* renamed from: b, reason: collision with root package name */
    public final r2.j f1593b;

    /* renamed from: c, reason: collision with root package name */
    public final k f1594c;

    /* renamed from: d, reason: collision with root package name */
    public final t f1595d;

    /* renamed from: e, reason: collision with root package name */
    public final f7.c f1596e;

    /* renamed from: f, reason: collision with root package name */
    public final i f1597f;

    public e(n nVar, r2.j jVar, f7.c cVar, k kVar, t tVar) {
        this.f1592a = nVar;
        this.f1593b = jVar;
        this.f1594c = kVar;
        this.f1595d = tVar;
        this.f1596e = new f7.c(cVar.f2769d.c(g.f1599d));
        this.f1597f = new i(jVar.f6527d - jVar.f6525b, new d(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0094, code lost:
    
        if (r9 == r4) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, ScrollCaptureSession scrollCaptureSession, r2.j jVar, i6.c cVar) {
        b bVar;
        int i;
        h6.a aVar;
        int i8;
        int i9;
        c cVar2;
        g6.h hVar;
        ScrollCaptureSession scrollCaptureSession2;
        int i10;
        r2.j jVar2;
        int i11;
        int t3;
        int t7;
        Surface surface;
        Surface surface2;
        Surface surface3;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i12 = bVar.f1585m;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f1585m = i12 - Integer.MIN_VALUE;
                Object obj = bVar.f1583k;
                i = bVar.f1585m;
                aVar = h6.a.f3204d;
                if (i != 0) {
                    s6.a.K(obj);
                    i8 = jVar.f6525b;
                    i9 = jVar.f6527d;
                    i iVar = eVar.f1597f;
                    bVar.f1580g = scrollCaptureSession;
                    bVar.f1581h = jVar;
                    bVar.i = i8;
                    bVar.f1582j = i9;
                    bVar.f1585m = 1;
                    int i13 = iVar.f1602a;
                    if (i8 > i9) {
                        throw new IllegalArgumentException(q.i("Expected min=", i8, " ≤ max=", i9).toString());
                    }
                    int i14 = i9 - i8;
                    if (i14 > i13) {
                        throw new IllegalArgumentException(q.i("Expected range (", i14, ") to be ≤ viewportSize=", i13).toString());
                    }
                    float f6 = i8;
                    float f8 = iVar.f1604c;
                    Object obj2 = m.f1757a;
                    if (f6 < f8 || i9 > i13 + f8) {
                        Object a8 = iVar.a((f6 < f8 ? i8 : i9 - i13) - f8, bVar);
                        if (a8 != aVar) {
                            a8 = obj2;
                        }
                        if (a8 == aVar) {
                            obj2 = a8;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i10 = bVar.f1582j;
                        i11 = bVar.i;
                        jVar2 = bVar.f1581h;
                        scrollCaptureSession2 = a1.c.l(bVar.f1580g);
                        s6.a.K(obj);
                        i iVar2 = eVar.f1597f;
                        t3 = o.t(i11 - s6.a.B(iVar2.f1604c), 0, iVar2.f1602a);
                        i iVar3 = eVar.f1597f;
                        t7 = o.t(i10 - s6.a.B(iVar3.f1604c), 0, iVar3.f1602a);
                        int i15 = jVar2.f6524a;
                        int i16 = jVar2.f6526c;
                        if (t3 != t7) {
                            return r2.j.f6523e;
                        }
                        surface = scrollCaptureSession2.getSurface();
                        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                        try {
                            lockHardwareCanvas.save();
                            lockHardwareCanvas.translate(-i15, -t3);
                            r2.j jVar3 = eVar.f1593b;
                            lockHardwareCanvas.translate(-jVar3.f6524a, -jVar3.f6525b);
                            eVar.f1595d.getRootView().draw(lockHardwareCanvas);
                            surface3 = scrollCaptureSession2.getSurface();
                            surface3.unlockCanvasAndPost(lockHardwareCanvas);
                            int B = s6.a.B(eVar.f1597f.f1604c);
                            return new r2.j(i15, t3 + B, i16, t7 + B);
                        } catch (Throwable th) {
                            surface2 = scrollCaptureSession2.getSurface();
                            surface2.unlockCanvasAndPost(lockHardwareCanvas);
                            throw th;
                        }
                    }
                    int i17 = bVar.f1582j;
                    int i18 = bVar.i;
                    r2.j jVar4 = bVar.f1581h;
                    ScrollCaptureSession l3 = a1.c.l(bVar.f1580g);
                    s6.a.K(obj);
                    i8 = i18;
                    jVar = jVar4;
                    i9 = i17;
                    scrollCaptureSession = l3;
                }
                cVar2 = c.f1586f;
                bVar.f1580g = scrollCaptureSession;
                bVar.f1581h = jVar;
                bVar.i = i8;
                bVar.f1582j = i9;
                bVar.f1585m = 2;
                hVar = bVar.f3460e;
                q6.i.b(hVar);
                if (m0.b.o(hVar).d(cVar2, bVar) != aVar) {
                    scrollCaptureSession2 = scrollCaptureSession;
                    i10 = i9;
                    jVar2 = jVar;
                    i11 = i8;
                    i iVar22 = eVar.f1597f;
                    t3 = o.t(i11 - s6.a.B(iVar22.f1604c), 0, iVar22.f1602a);
                    i iVar32 = eVar.f1597f;
                    t7 = o.t(i10 - s6.a.B(iVar32.f1604c), 0, iVar32.f1602a);
                    int i152 = jVar2.f6524a;
                    int i162 = jVar2.f6526c;
                    if (t3 != t7) {
                    }
                }
                return aVar;
            }
        }
        bVar = new b(eVar, cVar);
        Object obj3 = bVar.f1583k;
        i = bVar.f1585m;
        aVar = h6.a.f3204d;
        if (i != 0) {
        }
        cVar2 = c.f1586f;
        bVar.f1580g = scrollCaptureSession;
        bVar.f1581h = jVar;
        bVar.i = i8;
        bVar.f1582j = i9;
        bVar.f1585m = 2;
        hVar = bVar.f3460e;
        q6.i.b(hVar);
        if (m0.b.o(hVar).d(cVar2, bVar) != aVar) {
        }
        return aVar;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        x.n(this.f1596e, d1.f250e, new b0.d(this, runnable, null, 2), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        final h1 n6 = x.n(this.f1596e, null, new a(this, scrollCaptureSession, rect, consumer, null, 0), 3);
        n6.w(new b1.e(2, cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: c2.f
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                h1.this.a(null);
            }
        });
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(p.t(this.f1593b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f1597f.f1604c = 0.0f;
        this.f1594c.f1605a.setValue(Boolean.TRUE);
        runnable.run();
    }
}
