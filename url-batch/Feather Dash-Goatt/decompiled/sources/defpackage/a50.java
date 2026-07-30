package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class a50 extends zq implements gu {
    public final /* synthetic */ int u = 1;
    public final i5 v;
    public final su w;
    public Object x;

    public a50(wf1 wf1Var, i5 i5Var, su suVar, ku0 ku0Var) {
        this.v = i5Var;
        this.w = suVar;
        this.x = ku0Var;
        z0(wf1Var);
    }

    public static boolean C0(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public static boolean D0(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public RenderNode E0() {
        RenderNode renderNode = (RenderNode) this.x;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNode2 = new RenderNode("AndroidEdgeEffectOverscrollEffect");
        this.x = renderNode2;
        return renderNode2;
    }

    @Override // defpackage.gu
    public final void F(ld0 ld0Var) {
        boolean z;
        char c;
        float f;
        boolean z2;
        float f2;
        float f3;
        int i = this.u;
        i5 i5Var = this.v;
        su suVar = this.w;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ku0 ku0Var = (ku0) this.x;
                zf zfVar = ld0Var.d;
                i5Var.i(zfVar.x());
                if (va1.c(zfVar.x())) {
                    ld0Var.a();
                    return;
                }
                ld0Var.a();
                i5Var.d.getValue();
                Canvas a = k3.a(zfVar.e.g());
                if (su.f(suVar.f)) {
                    EdgeEffect c2 = suVar.c();
                    float f4 = -Float.intBitsToFloat((int) (zfVar.x() & 4294967295L));
                    ld0Var.getLayoutDirection();
                    ku0Var.getClass();
                    vc0 vc0Var = vc0.d;
                    z = D0(270.0f, (Float.floatToRawIntBits(ld0Var.s(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32), c2, a);
                } else {
                    z = false;
                }
                if (su.f(suVar.d)) {
                    EdgeEffect e = suVar.e();
                    ku0Var.getClass();
                    z = D0(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(ld0Var.s(0.0f))) & 4294967295L), e, a) || z;
                }
                if (su.f(suVar.g)) {
                    EdgeEffect d = suVar.d();
                    int a2 = pk0.a(Float.intBitsToFloat((int) (zfVar.x() >> 32)));
                    ld0Var.getLayoutDirection();
                    ku0Var.getClass();
                    vc0 vc0Var2 = vc0.d;
                    z = D0(90.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(ld0Var.s(0.0f) + (-((float) a2)))) & 4294967295L), d, a) || z;
                }
                if (su.f(suVar.e)) {
                    EdgeEffect b = suVar.b();
                    ku0Var.getClass();
                    z = D0(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (zfVar.x() >> 32)))) << 32) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (zfVar.x() & 4294967295L))) + ld0Var.s(0.0f))) & 4294967295L), b, a) || z;
                }
                if (z) {
                    i5Var.d();
                    return;
                }
                return;
            default:
                zf zfVar2 = ld0Var.d;
                i5Var.i(zfVar2.x());
                Canvas a3 = k3.a(zfVar2.e.g());
                i5Var.d.getValue();
                if (va1.c(zfVar2.x())) {
                    ld0Var.a();
                    return;
                }
                if (!a3.isHardwareAccelerated()) {
                    EdgeEffect edgeEffect = suVar.d;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = suVar.e;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = suVar.f;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = suVar.g;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = suVar.h;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = suVar.i;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = suVar.j;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = suVar.k;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    ld0Var.a();
                    return;
                }
                float s = ld0Var.s(30.0f);
                boolean z3 = su.f(suVar.d) || su.g(suVar.h) || su.f(suVar.e) || su.g(suVar.i);
                boolean z4 = su.f(suVar.f) || su.g(suVar.j) || su.f(suVar.g) || su.g(suVar.k);
                if (z3 && z4) {
                    c = ' ';
                    E0().setPosition(0, 0, a3.getWidth(), a3.getHeight());
                } else {
                    c = ' ';
                    if (z3) {
                        E0().setPosition(0, 0, (pk0.a(s) * 2) + a3.getWidth(), a3.getHeight());
                    } else {
                        if (!z4) {
                            ld0Var.a();
                            return;
                        }
                        E0().setPosition(0, 0, a3.getWidth(), (pk0.a(s) * 2) + a3.getHeight());
                    }
                }
                RecordingCanvas beginRecording = E0().beginRecording();
                if (su.g(suVar.j)) {
                    EdgeEffect edgeEffect9 = suVar.j;
                    if (edgeEffect9 == null) {
                        edgeEffect9 = suVar.a(et0.e);
                        suVar.j = edgeEffect9;
                    }
                    C0(90.0f, edgeEffect9, beginRecording);
                    edgeEffect9.finish();
                }
                if (su.f(suVar.f)) {
                    EdgeEffect c3 = suVar.c();
                    z2 = C0(270.0f, c3, beginRecording);
                    f = 1.0f;
                    if (su.g(suVar.f)) {
                        float intBitsToFloat = Float.intBitsToFloat((int) (i5Var.c() & 4294967295L));
                        EdgeEffect edgeEffect10 = suVar.j;
                        if (edgeEffect10 == null) {
                            edgeEffect10 = suVar.a(et0.e);
                            suVar.j = edgeEffect10;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        float c4 = i2 >= 31 ? d8.c(c3) : 0.0f;
                        float f5 = 1.0f - intBitsToFloat;
                        if (i2 >= 31) {
                            d8.d(edgeEffect10, c4, f5);
                        } else {
                            edgeEffect10.onPull(c4, f5);
                        }
                    }
                } else {
                    f = 1.0f;
                    z2 = false;
                }
                if (su.g(suVar.h)) {
                    EdgeEffect edgeEffect11 = suVar.h;
                    if (edgeEffect11 == null) {
                        edgeEffect11 = suVar.a(et0.d);
                        suVar.h = edgeEffect11;
                    }
                    C0(180.0f, edgeEffect11, beginRecording);
                    edgeEffect11.finish();
                }
                if (su.f(suVar.d)) {
                    EdgeEffect e2 = suVar.e();
                    z2 = C0(0.0f, e2, beginRecording) || z2;
                    if (su.g(suVar.d)) {
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (i5Var.c() >> c));
                        EdgeEffect edgeEffect12 = suVar.h;
                        if (edgeEffect12 == null) {
                            edgeEffect12 = suVar.a(et0.d);
                            suVar.h = edgeEffect12;
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        float c5 = i3 >= 31 ? d8.c(e2) : 0.0f;
                        if (i3 >= 31) {
                            d8.d(edgeEffect12, c5, intBitsToFloat2);
                        } else {
                            edgeEffect12.onPull(c5, intBitsToFloat2);
                        }
                    }
                }
                if (su.g(suVar.k)) {
                    EdgeEffect edgeEffect13 = suVar.k;
                    if (edgeEffect13 == null) {
                        edgeEffect13 = suVar.a(et0.e);
                        suVar.k = edgeEffect13;
                    }
                    C0(270.0f, edgeEffect13, beginRecording);
                    edgeEffect13.finish();
                }
                if (su.f(suVar.g)) {
                    EdgeEffect d2 = suVar.d();
                    z2 = C0(90.0f, d2, beginRecording) || z2;
                    if (su.g(suVar.g)) {
                        float intBitsToFloat3 = Float.intBitsToFloat((int) (i5Var.c() & 4294967295L));
                        EdgeEffect edgeEffect14 = suVar.k;
                        if (edgeEffect14 == null) {
                            edgeEffect14 = suVar.a(et0.e);
                            suVar.k = edgeEffect14;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        float c6 = i4 >= 31 ? d8.c(d2) : 0.0f;
                        if (i4 >= 31) {
                            d8.d(edgeEffect14, c6, intBitsToFloat3);
                        } else {
                            edgeEffect14.onPull(c6, intBitsToFloat3);
                        }
                    }
                }
                if (su.g(suVar.i)) {
                    EdgeEffect edgeEffect15 = suVar.i;
                    if (edgeEffect15 == null) {
                        edgeEffect15 = suVar.a(et0.d);
                        suVar.i = edgeEffect15;
                    }
                    C0(0.0f, edgeEffect15, beginRecording);
                    edgeEffect15.finish();
                }
                if (su.f(suVar.e)) {
                    EdgeEffect b2 = suVar.b();
                    boolean z5 = C0(180.0f, b2, beginRecording) || z2;
                    if (su.g(suVar.e)) {
                        float intBitsToFloat4 = Float.intBitsToFloat((int) (i5Var.c() >> c));
                        EdgeEffect edgeEffect16 = suVar.i;
                        if (edgeEffect16 == null) {
                            edgeEffect16 = suVar.a(et0.d);
                            suVar.i = edgeEffect16;
                        }
                        int i5 = Build.VERSION.SDK_INT;
                        float c7 = i5 >= 31 ? d8.c(b2) : 0.0f;
                        float f6 = f - intBitsToFloat4;
                        if (i5 >= 31) {
                            d8.d(edgeEffect16, c7, f6);
                        } else {
                            edgeEffect16.onPull(c7, f6);
                        }
                    }
                    z2 = z5;
                }
                if (z2) {
                    i5Var.d();
                }
                float f7 = z4 ? 0.0f : s;
                if (z3) {
                    s = 0.0f;
                }
                vc0 layoutDirection = ld0Var.getLayoutDirection();
                j3 j3Var = new j3();
                j3Var.a = beginRecording;
                long x = zfVar2.x();
                i8 i8Var = zfVar2.e;
                yf yfVar = ((zf) i8Var.h).d;
                nr nrVar = yfVar.a;
                vc0 vc0Var3 = yfVar.b;
                xf g = i8Var.g();
                long i6 = zfVar2.e.i();
                i8 i8Var2 = zfVar2.e;
                l50 l50Var = (l50) i8Var2.g;
                i8Var2.t(ld0Var);
                i8Var2.u(layoutDirection);
                i8Var2.s(j3Var);
                i8Var2.v(x);
                i8Var2.g = null;
                j3Var.k();
                try {
                    ((s40) zfVar2.e.e).A(f7, s);
                    try {
                        ld0Var.a();
                        j3Var.i();
                        i8 i8Var3 = zfVar2.e;
                        i8Var3.t(nrVar);
                        i8Var3.u(vc0Var3);
                        i8Var3.s(g);
                        i8Var3.v(i6);
                        i8Var3.g = l50Var;
                        E0().endRecording();
                        int save = a3.save();
                        a3.translate(f2, f3);
                        a3.drawRenderNode(E0());
                        a3.restoreToCount(save);
                        return;
                    } finally {
                        ((s40) zfVar2.e.e).A(-f7, -s);
                    }
                } catch (Throwable th) {
                    j3Var.i();
                    i8 i8Var4 = zfVar2.e;
                    i8Var4.t(nrVar);
                    i8Var4.u(vc0Var3);
                    i8Var4.s(g);
                    i8Var4.v(i6);
                    i8Var4.g = l50Var;
                    throw th;
                }
        }
    }

    public a50(wf1 wf1Var, i5 i5Var, su suVar) {
        this.v = i5Var;
        this.w = suVar;
        z0(wf1Var);
    }
}
