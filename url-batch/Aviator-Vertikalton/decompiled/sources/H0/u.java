package H0;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public float f342a;

    /* renamed from: b, reason: collision with root package name */
    public float f343b;

    /* renamed from: c, reason: collision with root package name */
    public float f344c;

    /* renamed from: d, reason: collision with root package name */
    public float f345d;

    /* renamed from: e, reason: collision with root package name */
    public float f346e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f347f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f348g = new ArrayList();

    public u() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f2) {
        float f3 = this.f345d;
        if (f3 == f2) {
            return;
        }
        float f4 = ((f2 - f3) + 360.0f) % 360.0f;
        if (f4 > 180.0f) {
            return;
        }
        float f5 = this.f343b;
        float f6 = this.f344c;
        q qVar = new q(f5, f6, f5, f6);
        qVar.f335f = this.f345d;
        qVar.f336g = f4;
        this.f348g.add(new o(qVar));
        this.f345d = f2;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f347f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((s) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f2, float f3) {
        r rVar = new r();
        rVar.f337b = f2;
        rVar.f338c = f3;
        this.f347f.add(rVar);
        p pVar = new p(rVar, this.f343b, this.f344c);
        float b2 = pVar.b() + 270.0f;
        float b3 = pVar.b() + 270.0f;
        a(b2);
        this.f348g.add(pVar);
        this.f345d = b3;
        this.f343b = f2;
        this.f344c = f3;
    }

    public final void d(float f2, float f3, float f4) {
        this.f342a = f2;
        this.f343b = 0.0f;
        this.f344c = f2;
        this.f345d = f3;
        this.f346e = (f3 + f4) % 360.0f;
        this.f347f.clear();
        this.f348g.clear();
    }
}
