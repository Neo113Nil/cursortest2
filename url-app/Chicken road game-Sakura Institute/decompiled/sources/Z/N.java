package Z;

import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class N extends AbstractC0319p {

    /* renamed from: a, reason: collision with root package name */
    public Shader f4486a;

    /* renamed from: b, reason: collision with root package name */
    public long f4487b = 9205357640488583168L;

    @Override // Z.AbstractC0319p
    public final void a(float f4, long j4, C0311h c0311h) {
        Shader shader = this.f4486a;
        if (shader == null || !Y.f.a(this.f4487b, j4)) {
            if (Y.f.e(j4)) {
                shader = null;
                this.f4486a = null;
                this.f4487b = 9205357640488583168L;
            } else {
                shader = b(j4);
                this.f4486a = shader;
                this.f4487b = j4;
            }
        }
        long c4 = K.c(((Paint) c0311h.f4525b).getColor());
        long j5 = C0323u.f4542b;
        if (!C0323u.c(c4, j5)) {
            c0311h.e(j5);
        }
        if (!Intrinsics.a((Shader) c0311h.f4526c, shader)) {
            c0311h.h(shader);
        }
        if (((Paint) c0311h.f4525b).getAlpha() / 255.0f == f4) {
            return;
        }
        c0311h.c(f4);
    }

    public abstract Shader b(long j4);
}
