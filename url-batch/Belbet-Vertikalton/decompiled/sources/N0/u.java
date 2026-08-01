package N0;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public float f964a;

    /* renamed from: b, reason: collision with root package name */
    public float f965b;

    /* renamed from: c, reason: collision with root package name */
    public float f966c;

    /* renamed from: d, reason: collision with root package name */
    public float f967d;
    public float e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f968f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f969g = new ArrayList();

    public u() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f2) {
        float f3 = this.f967d;
        if (f3 == f2) {
            return;
        }
        float f4 = ((f2 - f3) + 360.0f) % 360.0f;
        if (f4 > 180.0f) {
            return;
        }
        float f5 = this.f965b;
        float f6 = this.f966c;
        q qVar = new q(f5, f6, f5, f6);
        qVar.f957f = this.f967d;
        qVar.f958g = f4;
        this.f969g.add(new o(qVar));
        this.f967d = f2;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f968f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((s) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f2, float f3) {
        r rVar = new r();
        rVar.f959b = f2;
        rVar.f960c = f3;
        this.f968f.add(rVar);
        p pVar = new p(rVar, this.f965b, this.f966c);
        float b2 = pVar.b() + 270.0f;
        float b3 = pVar.b() + 270.0f;
        a(b2);
        this.f969g.add(pVar);
        this.f967d = b3;
        this.f965b = f2;
        this.f966c = f3;
    }

    public final void d(float f2, float f3, float f4) {
        this.f964a = f2;
        this.f965b = 0.0f;
        this.f966c = f2;
        this.f967d = f3;
        this.e = (f3 + f4) % 360.0f;
        this.f968f.clear();
        this.f969g.clear();
    }
}
