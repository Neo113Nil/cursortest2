package O0;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public float f589a;

    /* renamed from: b, reason: collision with root package name */
    public float f590b;

    /* renamed from: c, reason: collision with root package name */
    public float f591c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f592e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f593f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f594g = new ArrayList();

    public u() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f2) {
        float f3 = this.d;
        if (f3 == f2) {
            return;
        }
        float f4 = ((f2 - f3) + 360.0f) % 360.0f;
        if (f4 > 180.0f) {
            return;
        }
        float f5 = this.f590b;
        float f6 = this.f591c;
        q qVar = new q(f5, f6, f5, f6);
        qVar.f582f = this.d;
        qVar.f583g = f4;
        this.f594g.add(new o(qVar));
        this.d = f2;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f593f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((s) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f2, float f3) {
        r rVar = new r();
        rVar.f584b = f2;
        rVar.f585c = f3;
        this.f593f.add(rVar);
        p pVar = new p(rVar, this.f590b, this.f591c);
        float b2 = pVar.b() + 270.0f;
        float b3 = pVar.b() + 270.0f;
        a(b2);
        this.f594g.add(pVar);
        this.d = b3;
        this.f590b = f2;
        this.f591c = f3;
    }

    public final void d(float f2, float f3, float f4) {
        this.f589a = f2;
        this.f590b = 0.0f;
        this.f591c = f2;
        this.d = f3;
        this.f592e = (f3 + f4) % 360.0f;
        this.f593f.clear();
        this.f594g.clear();
    }
}
