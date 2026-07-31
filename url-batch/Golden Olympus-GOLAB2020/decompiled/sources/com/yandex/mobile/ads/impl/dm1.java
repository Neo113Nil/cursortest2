package com.yandex.mobile.ads.impl;

import android.opengl.GLES20;
import com.yandex.mobile.ads.impl.bm1;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* loaded from: classes3.dex */
final class dm1 {

    /* renamed from: i, reason: collision with root package name */
    private static final float[] f24686i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: j, reason: collision with root package name */
    private static final float[] f24687j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    private static final float[] f24688k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private int f24689a;

    /* renamed from: b, reason: collision with root package name */
    private a f24690b;

    /* renamed from: c, reason: collision with root package name */
    private ee0 f24691c;

    /* renamed from: d, reason: collision with root package name */
    private int f24692d;

    /* renamed from: e, reason: collision with root package name */
    private int f24693e;

    /* renamed from: f, reason: collision with root package name */
    private int f24694f;

    /* renamed from: g, reason: collision with root package name */
    private int f24695g;

    /* renamed from: h, reason: collision with root package name */
    private int f24696h;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f24697a;

        /* renamed from: b, reason: collision with root package name */
        private final FloatBuffer f24698b;

        /* renamed from: c, reason: collision with root package name */
        private final FloatBuffer f24699c;

        /* renamed from: d, reason: collision with root package name */
        private final int f24700d;

        public a(bm1.b bVar) {
            this.f24697a = bVar.a();
            this.f24698b = fe0.a(bVar.f23868c);
            this.f24699c = fe0.a(bVar.f23869d);
            int i4 = bVar.f23867b;
            if (i4 == 1) {
                this.f24700d = 5;
            } else if (i4 != 2) {
                this.f24700d = 4;
            } else {
                this.f24700d = 6;
            }
        }
    }

    dm1() {
    }

    public final void a(int i4, float[] fArr) {
        a aVar = this.f24690b;
        if (aVar == null) {
            return;
        }
        int i5 = this.f24689a;
        GLES20.glUniformMatrix3fv(this.f24693e, 1, false, i5 == 1 ? f24687j : i5 == 2 ? f24688k : f24686i, 0);
        GLES20.glUniformMatrix4fv(this.f24692d, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i4);
        GLES20.glUniform1i(this.f24696h, 0);
        fe0.a();
        GLES20.glVertexAttribPointer(this.f24694f, 3, 5126, false, 12, (Buffer) aVar.f24698b);
        fe0.a();
        GLES20.glVertexAttribPointer(this.f24695g, 2, 5126, false, 8, (Buffer) aVar.f24699c);
        fe0.a();
        GLES20.glDrawArrays(aVar.f24700d, 0, aVar.f24697a);
        fe0.a();
    }

    public final void a() {
        ee0 ee0Var = new ee0();
        this.f24691c = ee0Var;
        this.f24692d = ee0Var.b("uMvpMatrix");
        this.f24693e = this.f24691c.b("uTexMatrix");
        this.f24694f = this.f24691c.a("aPosition");
        this.f24695g = this.f24691c.a("aTexCoords");
        this.f24696h = this.f24691c.b("uTexture");
    }

    public final void a(bm1 bm1Var) {
        bm1.a aVar = bm1Var.f23861a;
        bm1.a aVar2 = bm1Var.f23862b;
        if (aVar.b() == 1 && aVar.a().f23866a == 0 && aVar2.b() == 1 && aVar2.a().f23866a == 0) {
            this.f24689a = bm1Var.f23863c;
            this.f24690b = new a(bm1Var.f23861a.a());
            if (bm1Var.f23864d) {
                return;
            }
            new a(bm1Var.f23862b.a());
        }
    }
}
