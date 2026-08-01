package I0;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public float f337a;

    /* renamed from: b, reason: collision with root package name */
    public float f338b;

    /* renamed from: c, reason: collision with root package name */
    public float f339c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f340e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f341f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f342g = new ArrayList();

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
        float f5 = this.f338b;
        float f6 = this.f339c;
        q qVar = new q(f5, f6, f5, f6);
        qVar.f330f = this.d;
        qVar.f331g = f4;
        this.f342g.add(new o(qVar));
        this.d = f2;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f341f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((s) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f2, float f3) {
        r rVar = new r();
        rVar.f332b = f2;
        rVar.f333c = f3;
        this.f341f.add(rVar);
        p pVar = new p(rVar, this.f338b, this.f339c);
        float b2 = pVar.b() + 270.0f;
        float b3 = pVar.b() + 270.0f;
        a(b2);
        this.f342g.add(pVar);
        this.d = b3;
        this.f338b = f2;
        this.f339c = f3;
    }

    public final void d(float f2, float f3, float f4) {
        this.f337a = f2;
        this.f338b = 0.0f;
        this.f339c = f2;
        this.d = f3;
        this.f340e = (f3 + f4) % 360.0f;
        this.f341f.clear();
        this.f342g.clear();
    }
}
