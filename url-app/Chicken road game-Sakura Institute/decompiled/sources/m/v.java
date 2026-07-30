package m;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v extends s1.j0 implements w0.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6266c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final f f6267d;

    /* renamed from: e, reason: collision with root package name */
    public final w f6268e;

    /* renamed from: f, reason: collision with root package name */
    public Object f6269f;

    public v(f fVar, w wVar) {
        this.f6267d = fVar;
        this.f6268e = wVar;
    }

    public static boolean C(float f9, EdgeEffect edgeEffect, Canvas canvas) {
        if (f9 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f9);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public static boolean D(float f9, long j8, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f9);
        canvas.translate(y0.c.d(j8), y0.c.e(j8));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public RenderNode E() {
        RenderNode renderNode = (RenderNode) this.f6269f;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode f9 = l1.f.f();
        this.f6269f = f9;
        return f9;
    }

    @Override // w0.e
    public final void c(r1.f0 f0Var) {
        RecordingCanvas beginRecording;
        float f9;
        boolean z8;
        float f10;
        float f11;
        float f12;
        switch (this.f6266c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                q.h0 h0Var = ((u0) this.f6269f).f6265b;
                b1.c cVar = f0Var.f7767f;
                long d8 = cVar.d();
                f fVar = this.f6267d;
                fVar.l(d8);
                if (y0.f.e(cVar.d())) {
                    f0Var.b();
                    return;
                }
                f0Var.b();
                fVar.f6143h.getValue();
                Canvas a3 = z0.e.a(cVar.f1234g.k());
                w wVar = this.f6268e;
                boolean D = w.f(wVar.f6276f) ? D(270.0f, u3.r.a(-y0.f.b(cVar.d()), f0Var.y(h0Var.b(f0Var.getLayoutDirection()))), wVar.c(), a3) : false;
                if (w.f(wVar.f6274d)) {
                    D = D(0.0f, u3.r.a(0.0f, f0Var.y(h0Var.f7286b)), wVar.e(), a3) || D;
                }
                if (w.f(wVar.f6277g)) {
                    D = D(90.0f, u3.r.a(0.0f, f0Var.y(h0Var.c(f0Var.getLayoutDirection())) + (-((float) t6.a.O(y0.f.d(cVar.d()))))), wVar.d(), a3) || D;
                }
                if (w.f(wVar.f6275e)) {
                    D = D(180.0f, u3.r.a(-y0.f.d(cVar.d()), (-y0.f.b(cVar.d())) + f0Var.y(h0Var.f7288d)), wVar.b(), a3) || D;
                }
                if (D) {
                    fVar.g();
                    return;
                }
                return;
            default:
                b1.c cVar2 = f0Var.f7767f;
                long d9 = cVar2.d();
                f fVar2 = this.f6267d;
                fVar2.l(d9);
                if (y0.f.e(cVar2.d())) {
                    f0Var.b();
                    return;
                }
                fVar2.f6143h.getValue();
                float y4 = f0Var.y(s.f6251a);
                Canvas a9 = z0.e.a(cVar2.f1234g.k());
                w wVar2 = this.f6268e;
                boolean z9 = w.f(wVar2.f6274d) || w.g(wVar2.f6278h) || w.f(wVar2.f6275e) || w.g(wVar2.f6279i);
                boolean z10 = w.f(wVar2.f6276f) || w.g(wVar2.f6280j) || w.f(wVar2.f6277g) || w.g(wVar2.f6281k);
                if (z9 && z10) {
                    E().setPosition(0, 0, a9.getWidth(), a9.getHeight());
                } else if (z9) {
                    E().setPosition(0, 0, (t6.a.O(y4) * 2) + a9.getWidth(), a9.getHeight());
                } else {
                    if (!z10) {
                        f0Var.b();
                        return;
                    }
                    E().setPosition(0, 0, a9.getWidth(), (t6.a.O(y4) * 2) + a9.getHeight());
                }
                beginRecording = E().beginRecording();
                if (w.g(wVar2.f6280j)) {
                    EdgeEffect edgeEffect = wVar2.f6280j;
                    if (edgeEffect == null) {
                        edgeEffect = wVar2.a();
                        wVar2.f6280j = edgeEffect;
                    }
                    C(90.0f, edgeEffect, beginRecording);
                    edgeEffect.finish();
                }
                boolean f13 = w.f(wVar2.f6276f);
                g gVar = g.f6157a;
                if (f13) {
                    EdgeEffect c4 = wVar2.c();
                    z8 = C(270.0f, c4, beginRecording);
                    if (w.g(wVar2.f6276f)) {
                        float e9 = y0.c.e(fVar2.f());
                        EdgeEffect edgeEffect2 = wVar2.f6280j;
                        if (edgeEffect2 == null) {
                            edgeEffect2 = wVar2.a();
                            wVar2.f6280j = edgeEffect2;
                        }
                        int i7 = Build.VERSION.SDK_INT;
                        float b9 = i7 >= 31 ? gVar.b(c4) : 0.0f;
                        f9 = y4;
                        float f14 = 1 - e9;
                        if (i7 >= 31) {
                            gVar.c(edgeEffect2, b9, f14);
                        } else {
                            edgeEffect2.onPull(b9, f14);
                        }
                    } else {
                        f9 = y4;
                    }
                } else {
                    f9 = y4;
                    z8 = false;
                }
                if (w.g(wVar2.f6278h)) {
                    EdgeEffect edgeEffect3 = wVar2.f6278h;
                    if (edgeEffect3 == null) {
                        edgeEffect3 = wVar2.a();
                        wVar2.f6278h = edgeEffect3;
                    }
                    C(180.0f, edgeEffect3, beginRecording);
                    edgeEffect3.finish();
                }
                if (w.f(wVar2.f6274d)) {
                    EdgeEffect e10 = wVar2.e();
                    boolean z11 = C(0.0f, e10, beginRecording) || z8;
                    if (w.g(wVar2.f6274d)) {
                        float d10 = y0.c.d(fVar2.f());
                        EdgeEffect edgeEffect4 = wVar2.f6278h;
                        if (edgeEffect4 == null) {
                            edgeEffect4 = wVar2.a();
                            wVar2.f6278h = edgeEffect4;
                        }
                        int i8 = Build.VERSION.SDK_INT;
                        float b10 = i8 >= 31 ? gVar.b(e10) : 0.0f;
                        if (i8 >= 31) {
                            gVar.c(edgeEffect4, b10, d10);
                        } else {
                            edgeEffect4.onPull(b10, d10);
                        }
                    }
                    z8 = z11;
                }
                if (w.g(wVar2.f6281k)) {
                    EdgeEffect edgeEffect5 = wVar2.f6281k;
                    if (edgeEffect5 == null) {
                        edgeEffect5 = wVar2.a();
                        wVar2.f6281k = edgeEffect5;
                    }
                    C(270.0f, edgeEffect5, beginRecording);
                    edgeEffect5.finish();
                }
                if (w.f(wVar2.f6277g)) {
                    EdgeEffect d11 = wVar2.d();
                    boolean z12 = C(90.0f, d11, beginRecording) || z8;
                    if (w.g(wVar2.f6277g)) {
                        float e11 = y0.c.e(fVar2.f());
                        EdgeEffect edgeEffect6 = wVar2.f6281k;
                        if (edgeEffect6 == null) {
                            edgeEffect6 = wVar2.a();
                            wVar2.f6281k = edgeEffect6;
                        }
                        int i9 = Build.VERSION.SDK_INT;
                        float b11 = i9 >= 31 ? gVar.b(d11) : 0.0f;
                        if (i9 >= 31) {
                            gVar.c(edgeEffect6, b11, e11);
                        } else {
                            edgeEffect6.onPull(b11, e11);
                        }
                    }
                    z8 = z12;
                }
                if (w.g(wVar2.f6279i)) {
                    EdgeEffect edgeEffect7 = wVar2.f6279i;
                    if (edgeEffect7 == null) {
                        edgeEffect7 = wVar2.a();
                        wVar2.f6279i = edgeEffect7;
                    }
                    f10 = 0.0f;
                    C(0.0f, edgeEffect7, beginRecording);
                    edgeEffect7.finish();
                } else {
                    f10 = 0.0f;
                }
                if (w.f(wVar2.f6275e)) {
                    EdgeEffect b12 = wVar2.b();
                    boolean z13 = C(180.0f, b12, beginRecording) || z8;
                    if (w.g(wVar2.f6275e)) {
                        float d12 = y0.c.d(fVar2.f());
                        EdgeEffect edgeEffect8 = wVar2.f6279i;
                        if (edgeEffect8 == null) {
                            edgeEffect8 = wVar2.a();
                            wVar2.f6279i = edgeEffect8;
                        }
                        int i10 = Build.VERSION.SDK_INT;
                        float b13 = i10 >= 31 ? gVar.b(b12) : f10;
                        float f15 = 1 - d12;
                        if (i10 >= 31) {
                            gVar.c(edgeEffect8, b13, f15);
                        } else {
                            edgeEffect8.onPull(b13, f15);
                        }
                    }
                    z8 = z13;
                }
                if (z8) {
                    fVar2.g();
                }
                float f16 = z10 ? f10 : f9;
                if (!z9) {
                    f10 = f9;
                }
                m2.k layoutDirection = f0Var.getLayoutDirection();
                z0.d dVar = new z0.d();
                dVar.f9984a = beginRecording;
                long d13 = cVar2.d();
                b1.b bVar = cVar2.f1234g;
                b1.a aVar = ((b1.c) bVar.f1232i).f1233f;
                m2.b bVar2 = aVar.f1225a;
                m2.k kVar = aVar.f1226b;
                z0.r k8 = bVar.k();
                long p6 = cVar2.f1234g.p();
                b1.b bVar3 = cVar2.f1234g;
                c1.c cVar3 = (c1.c) bVar3.f1231h;
                bVar3.A(f0Var);
                bVar3.B(layoutDirection);
                bVar3.z(dVar);
                bVar3.C(d13);
                bVar3.f1231h = null;
                dVar.o();
                try {
                    ((b6.c) cVar2.f1234g.f1230g).B(f16, f10);
                    try {
                        f0Var.b();
                        dVar.n();
                        b1.b bVar4 = cVar2.f1234g;
                        bVar4.A(bVar2);
                        bVar4.B(kVar);
                        bVar4.z(k8);
                        bVar4.C(p6);
                        bVar4.f1231h = cVar3;
                        E().endRecording();
                        int save = a9.save();
                        a9.translate(f11, f12);
                        a9.drawRenderNode(E());
                        a9.restoreToCount(save);
                        return;
                    } finally {
                        ((b6.c) cVar2.f1234g.f1230g).B(-f16, -f10);
                    }
                } catch (Throwable th) {
                    dVar.n();
                    b1.b bVar5 = cVar2.f1234g;
                    bVar5.A(bVar2);
                    bVar5.B(kVar);
                    bVar5.z(k8);
                    bVar5.C(p6);
                    bVar5.f1231h = cVar3;
                    throw th;
                }
        }
    }

    public v(f fVar, w wVar, u0 u0Var) {
        this.f6267d = fVar;
        this.f6268e = wVar;
        this.f6269f = u0Var;
    }
}
