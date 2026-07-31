package b0;

import a0.C0241f;
import android.graphics.Paint;
import android.graphics.Shader;

/* renamed from: b0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0348q extends AbstractC0347p {

    /* renamed from: a, reason: collision with root package name */
    public Shader f5429a;

    /* renamed from: b, reason: collision with root package name */
    public long f5430b = 9205357640488583168L;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Shader f5431c;

    public C0348q(Shader shader) {
        this.f5431c = shader;
    }

    @Override // b0.AbstractC0347p
    public final void a(float f3, long j3, C0339h c0339h) {
        Shader shader = this.f5429a;
        if (shader == null || !C0241f.a(this.f5430b, j3)) {
            if (C0241f.e(j3)) {
                shader = null;
                this.f5429a = null;
                this.f5430b = 9205357640488583168L;
            } else {
                shader = this.f5431c;
                this.f5429a = shader;
                this.f5430b = j3;
            }
        }
        long c2 = M.c(((Paint) c0339h.f5415b).getColor());
        long j4 = C0352v.f5434b;
        if (!C0352v.c(c2, j4)) {
            c0339h.e(j4);
        }
        if (!f2.j.a((Shader) c0339h.f5416c, shader)) {
            c0339h.f5416c = shader;
            ((Paint) c0339h.f5415b).setShader(shader);
        }
        if (((Paint) c0339h.f5415b).getAlpha() / 255.0f == f3) {
            return;
        }
        c0339h.c(f3);
    }
}
