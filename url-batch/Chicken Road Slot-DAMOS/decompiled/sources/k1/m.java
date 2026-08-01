package k1;

import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m extends v {

    /* renamed from: f, reason: collision with root package name */
    public d9.c f5333f;
    public long g = 9205357640488583168L;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Shader f5334h;

    public m(Shader shader) {
        this.f5334h = shader;
    }

    @Override // k1.v
    public final void f(float f3, long j, y6.l lVar) {
        Paint paint = (Paint) lVar.f10660e;
        d9.c cVar = this.f5333f;
        if (cVar == null || !j1.e.a(this.g, j)) {
            if (j1.e.c(j)) {
                this.f5333f = null;
                this.g = 9205357640488583168L;
                cVar = null;
            } else {
                cVar = this.f5333f;
                if (cVar == null) {
                    cVar = new d9.c(28, false);
                    this.f5333f = cVar;
                }
                cVar.f3701e = this.f5334h;
                this.f5333f = cVar;
                this.g = j;
            }
        }
        long b10 = v.b(paint.getColor());
        long j3 = p.f5336b;
        if (!p.c(b10, j3)) {
            lVar.h(j3);
        }
        if (!Intrinsics.a((Shader) lVar.f10661i, cVar != null ? (Shader) cVar.f3701e : null)) {
            Shader shader = cVar != null ? (Shader) cVar.f3701e : null;
            lVar.f10661i = shader;
            paint.setShader(shader);
        }
        if (paint.getAlpha() / 255.0f == f3) {
            return;
        }
        lVar.f(f3);
    }
}
