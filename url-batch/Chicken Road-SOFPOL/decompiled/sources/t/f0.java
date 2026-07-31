package t;

import a0.g1;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f0 extends w1.l implements w1.m {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f6770t = 1;

    /* renamed from: u, reason: collision with root package name */
    public final j f6771u;

    /* renamed from: v, reason: collision with root package name */
    public final a0 f6772v;

    /* renamed from: w, reason: collision with root package name */
    public Object f6773w;

    public f0(q1.s sVar, j jVar, a0 a0Var) {
        this.f6771u = jVar;
        this.f6772v = a0Var;
        r0(sVar);
    }

    public static boolean u0(float f6, EdgeEffect edgeEffect, Canvas canvas) {
        if (f6 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f6);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public static boolean v0(float f6, long j7, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f6);
        canvas.translate(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    @Override // w1.m
    public final void A(w1.h0 h0Var) {
        boolean z3;
        char c8;
        long j7;
        RecordingCanvas beginRecording;
        float f6;
        boolean z7;
        boolean z8;
        j jVar;
        RecordingCanvas recordingCanvas;
        char c9;
        float f8;
        float f9;
        float f10;
        float f11;
        switch (this.f6770t) {
            case 0:
                x.f0 f0Var = (x.f0) this.f6773w;
                h1.b bVar = h0Var.f7680d;
                long c10 = bVar.c();
                j jVar2 = this.f6771u;
                jVar2.i(c10);
                if (e1.e.c(bVar.c())) {
                    h0Var.a();
                    return;
                }
                h0Var.a();
                jVar2.f6789d.getValue();
                Canvas a8 = f1.c.a(bVar.f3075e.m());
                a0 a0Var = this.f6772v;
                if (a0.f(a0Var.f6742f)) {
                    z3 = v0(270.0f, (Float.floatToRawIntBits(h0Var.u(f0Var.d(h0Var.getLayoutDirection()))) & 4294967295L) | (Float.floatToRawIntBits(-Float.intBitsToFloat((int) (bVar.c() & 4294967295L))) << 32), a0Var.c(), a8);
                } else {
                    z3 = false;
                }
                if (a0.f(a0Var.f6740d)) {
                    c8 = ' ';
                    j7 = 4294967295L;
                    z3 = v0(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(h0Var.u(f0Var.c()))) & 4294967295L), a0Var.e(), a8) || z3;
                } else {
                    c8 = ' ';
                    j7 = 4294967295L;
                }
                if (a0.f(a0Var.f6743g)) {
                    z3 = v0(90.0f, (((long) Float.floatToRawIntBits(h0Var.u(f0Var.b(h0Var.getLayoutDirection())) + (-((float) s6.a.B(Float.intBitsToFloat((int) (bVar.c() >> c8))))))) & j7) | (((long) Float.floatToRawIntBits(0.0f)) << c8), a0Var.d(), a8) || z3;
                }
                if (a0.f(a0Var.f6741e)) {
                    z3 = v0(180.0f, (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (bVar.c() & j7))) + h0Var.u(f0Var.a()))) & j7) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (bVar.c() >> c8)))) << c8), a0Var.b(), a8) || z3;
                }
                if (z3) {
                    jVar2.d();
                    return;
                }
                return;
            default:
                h1.b bVar2 = h0Var.f7680d;
                long c11 = bVar2.c();
                j jVar3 = this.f6771u;
                jVar3.i(c11);
                Canvas a9 = f1.c.a(bVar2.f3075e.m());
                jVar3.f6789d.getValue();
                if (e1.e.c(bVar2.c())) {
                    h0Var.a();
                    return;
                }
                boolean isHardwareAccelerated = a9.isHardwareAccelerated();
                a0 a0Var2 = this.f6772v;
                if (!isHardwareAccelerated) {
                    EdgeEffect edgeEffect = a0Var2.f6740d;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = a0Var2.f6741e;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = a0Var2.f6742f;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = a0Var2.f6743g;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = a0Var2.f6744h;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = a0Var2.i;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = a0Var2.f6745j;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = a0Var2.f6746k;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    h0Var.a();
                    return;
                }
                float u7 = h0Var.u(w.f6884a);
                boolean z9 = a0.f(a0Var2.f6740d) || a0.g(a0Var2.f6744h) || a0.f(a0Var2.f6741e) || a0.g(a0Var2.i);
                boolean z10 = a0.f(a0Var2.f6742f) || a0.g(a0Var2.f6745j) || a0.f(a0Var2.f6743g) || a0.g(a0Var2.f6746k);
                if (z9 && z10) {
                    w0().setPosition(0, 0, a9.getWidth(), a9.getHeight());
                } else if (z9) {
                    w0().setPosition(0, 0, (s6.a.B(u7) * 2) + a9.getWidth(), a9.getHeight());
                } else {
                    if (!z10) {
                        h0Var.a();
                        return;
                    }
                    w0().setPosition(0, 0, a9.getWidth(), (s6.a.B(u7) * 2) + a9.getHeight());
                }
                beginRecording = w0().beginRecording();
                boolean g3 = a0.g(a0Var2.f6745j);
                u.j0 j0Var = u.j0.f7028e;
                if (g3) {
                    EdgeEffect edgeEffect9 = a0Var2.f6745j;
                    if (edgeEffect9 == null) {
                        edgeEffect9 = a0Var2.a(j0Var);
                        a0Var2.f6745j = edgeEffect9;
                    }
                    u0(90.0f, edgeEffect9, beginRecording);
                    edgeEffect9.finish();
                }
                if (a0.f(a0Var2.f6742f)) {
                    EdgeEffect c12 = a0Var2.c();
                    z8 = u0(270.0f, c12, beginRecording);
                    if (a0.g(a0Var2.f6742f)) {
                        z7 = z10;
                        float intBitsToFloat = Float.intBitsToFloat((int) (jVar3.c() & 4294967295L));
                        EdgeEffect edgeEffect10 = a0Var2.f6745j;
                        if (edgeEffect10 == null) {
                            edgeEffect10 = a0Var2.a(j0Var);
                            a0Var2.f6745j = edgeEffect10;
                        }
                        int i = Build.VERSION.SDK_INT;
                        float b8 = i >= 31 ? m.b(c12) : 0.0f;
                        f6 = u7;
                        float f12 = 1 - intBitsToFloat;
                        if (i >= 31) {
                            m.c(edgeEffect10, b8, f12);
                        } else {
                            edgeEffect10.onPull(b8, f12);
                        }
                    } else {
                        f6 = u7;
                        z7 = z10;
                    }
                } else {
                    f6 = u7;
                    z7 = z10;
                    z8 = false;
                }
                boolean g7 = a0.g(a0Var2.f6744h);
                u.j0 j0Var2 = u.j0.f7027d;
                if (g7) {
                    EdgeEffect edgeEffect11 = a0Var2.f6744h;
                    if (edgeEffect11 == null) {
                        edgeEffect11 = a0Var2.a(j0Var2);
                        a0Var2.f6744h = edgeEffect11;
                    }
                    u0(180.0f, edgeEffect11, beginRecording);
                    edgeEffect11.finish();
                }
                if (a0.f(a0Var2.f6740d)) {
                    EdgeEffect e8 = a0Var2.e();
                    boolean z11 = u0(0.0f, e8, beginRecording) || z8;
                    if (a0.g(a0Var2.f6740d)) {
                        recordingCanvas = beginRecording;
                        c9 = ' ';
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (jVar3.c() >> 32));
                        EdgeEffect edgeEffect12 = a0Var2.f6744h;
                        if (edgeEffect12 == null) {
                            edgeEffect12 = a0Var2.a(j0Var2);
                            a0Var2.f6744h = edgeEffect12;
                        }
                        int i8 = Build.VERSION.SDK_INT;
                        if (i8 >= 31) {
                            jVar = jVar3;
                            f11 = m.b(e8);
                        } else {
                            jVar = jVar3;
                            f11 = 0.0f;
                        }
                        if (i8 >= 31) {
                            m.c(edgeEffect12, f11, intBitsToFloat2);
                        } else {
                            edgeEffect12.onPull(f11, intBitsToFloat2);
                        }
                    } else {
                        jVar = jVar3;
                        recordingCanvas = beginRecording;
                        c9 = ' ';
                    }
                    z8 = z11;
                } else {
                    jVar = jVar3;
                    recordingCanvas = beginRecording;
                    c9 = ' ';
                }
                if (a0.g(a0Var2.f6746k)) {
                    EdgeEffect edgeEffect13 = a0Var2.f6746k;
                    if (edgeEffect13 == null) {
                        edgeEffect13 = a0Var2.a(j0Var);
                        a0Var2.f6746k = edgeEffect13;
                    }
                    u0(270.0f, edgeEffect13, recordingCanvas);
                    edgeEffect13.finish();
                }
                if (a0.f(a0Var2.f6743g)) {
                    EdgeEffect d8 = a0Var2.d();
                    boolean z12 = u0(90.0f, d8, recordingCanvas) || z8;
                    if (a0.g(a0Var2.f6743g)) {
                        float intBitsToFloat3 = Float.intBitsToFloat((int) (jVar.c() & 4294967295L));
                        EdgeEffect edgeEffect14 = a0Var2.f6746k;
                        if (edgeEffect14 == null) {
                            edgeEffect14 = a0Var2.a(j0Var);
                            a0Var2.f6746k = edgeEffect14;
                        }
                        int i9 = Build.VERSION.SDK_INT;
                        float b9 = i9 >= 31 ? m.b(d8) : 0.0f;
                        if (i9 >= 31) {
                            m.c(edgeEffect14, b9, intBitsToFloat3);
                        } else {
                            edgeEffect14.onPull(b9, intBitsToFloat3);
                        }
                    }
                    z8 = z12;
                }
                if (a0.g(a0Var2.i)) {
                    EdgeEffect edgeEffect15 = a0Var2.i;
                    if (edgeEffect15 == null) {
                        edgeEffect15 = a0Var2.a(j0Var2);
                        a0Var2.i = edgeEffect15;
                    }
                    f8 = 0.0f;
                    u0(0.0f, edgeEffect15, recordingCanvas);
                    edgeEffect15.finish();
                } else {
                    f8 = 0.0f;
                }
                if (a0.f(a0Var2.f6741e)) {
                    EdgeEffect b10 = a0Var2.b();
                    boolean z13 = u0(180.0f, b10, recordingCanvas) || z8;
                    if (a0.g(a0Var2.f6741e)) {
                        float intBitsToFloat4 = Float.intBitsToFloat((int) (jVar.c() >> c9));
                        EdgeEffect edgeEffect16 = a0Var2.i;
                        if (edgeEffect16 == null) {
                            edgeEffect16 = a0Var2.a(j0Var2);
                            a0Var2.i = edgeEffect16;
                        }
                        int i10 = Build.VERSION.SDK_INT;
                        float b11 = i10 >= 31 ? m.b(b10) : f8;
                        float f13 = 1 - intBitsToFloat4;
                        if (i10 >= 31) {
                            m.c(edgeEffect16, b11, f13);
                        } else {
                            edgeEffect16.onPull(b11, f13);
                        }
                    }
                    z8 = z13;
                }
                if (z8) {
                    jVar.d();
                }
                float f14 = z7 ? f8 : f6;
                if (!z9) {
                    f8 = f6;
                }
                r2.l layoutDirection = h0Var.getLayoutDirection();
                f1.b bVar3 = new f1.b();
                bVar3.f2622a = recordingCanvas;
                long c13 = bVar2.c();
                g1 g1Var = bVar2.f3075e;
                h1.a aVar = ((h1.b) g1Var.f86d).f3074d;
                r2.c cVar = aVar.f3070a;
                r2.l lVar = aVar.f3071b;
                f1.q m7 = g1Var.m();
                long u8 = bVar2.f3075e.u();
                g1 g1Var2 = bVar2.f3075e;
                i1.b bVar4 = (i1.b) g1Var2.f85c;
                g1Var2.K(h0Var);
                g1Var2.L(layoutDirection);
                g1Var2.J(bVar3);
                g1Var2.M(c13);
                g1Var2.f85c = null;
                bVar3.h();
                try {
                    ((b1.b) bVar2.f3075e.f84b).x(f14, f8);
                    try {
                        h0Var.a();
                        bVar3.f();
                        g1 g1Var3 = bVar2.f3075e;
                        g1Var3.K(cVar);
                        g1Var3.L(lVar);
                        g1Var3.J(m7);
                        g1Var3.M(u8);
                        g1Var3.f85c = bVar4;
                        w0().endRecording();
                        int save = a9.save();
                        a9.translate(f9, f10);
                        a9.drawRenderNode(w0());
                        a9.restoreToCount(save);
                        return;
                    } finally {
                        ((b1.b) bVar2.f3075e.f84b).x(-f14, -f8);
                    }
                } catch (Throwable th) {
                    bVar3.f();
                    g1 g1Var4 = bVar2.f3075e;
                    g1Var4.K(cVar);
                    g1Var4.L(lVar);
                    g1Var4.J(m7);
                    g1Var4.M(u8);
                    g1Var4.f85c = bVar4;
                    throw th;
                }
        }
    }

    public RenderNode w0() {
        RenderNode renderNode = (RenderNode) this.f6773w;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode a8 = w0.a();
        this.f6773w = a8;
        return a8;
    }

    public f0(q1.s sVar, j jVar, a0 a0Var, x.f0 f0Var) {
        this.f6771u = jVar;
        this.f6772v = a0Var;
        this.f6773w = f0Var;
        r0(sVar);
    }
}
