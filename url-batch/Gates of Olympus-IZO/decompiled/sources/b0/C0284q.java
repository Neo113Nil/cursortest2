package b0;

import android.graphics.Paint;
import android.graphics.Shader;

/* renamed from: b0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0284q extends AbstractC0259J {

    /* renamed from: e, reason: collision with root package name */
    public Shader f4287e;

    /* renamed from: f, reason: collision with root package name */
    public long f4288f = 9205357640488583168L;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Shader f4289g;

    public C0284q(Shader shader) {
        this.f4289g = shader;
    }

    @Override // b0.AbstractC0259J
    public final void j(float f3, long j3, C0276i c0276i) {
        Shader shader = this.f4287e;
        if (shader == null || !a0.f.a(this.f4288f, j3)) {
            if (a0.f.e(j3)) {
                shader = null;
                this.f4287e = null;
                this.f4288f = 9205357640488583168L;
            } else {
                shader = this.f4289g;
                this.f4287e = shader;
                this.f4288f = j3;
            }
        }
        long b2 = AbstractC0259J.b(((Paint) c0276i.f4273b).getColor());
        long j4 = C0288u.f4292b;
        if (!C0288u.c(b2, j4)) {
            c0276i.e(j4);
        }
        if (!Z1.i.a((Shader) c0276i.f4274c, shader)) {
            c0276i.g(shader);
        }
        if (((Paint) c0276i.f4273b).getAlpha() / 255.0f == f3) {
            return;
        }
        c0276i.c(f3);
    }
}
