package H0;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public float f341a;

    /* renamed from: b, reason: collision with root package name */
    public float f342b;

    /* renamed from: c, reason: collision with root package name */
    public float f343c;

    /* renamed from: d, reason: collision with root package name */
    public float f344d;

    /* renamed from: e, reason: collision with root package name */
    public float f345e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f346f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f347g = new ArrayList();

    public u() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f2) {
        float f3 = this.f344d;
        if (f3 == f2) {
            return;
        }
        float f4 = ((f2 - f3) + 360.0f) % 360.0f;
        if (f4 > 180.0f) {
            return;
        }
        float f5 = this.f342b;
        float f6 = this.f343c;
        q qVar = new q(f5, f6, f5, f6);
        qVar.f334f = this.f344d;
        qVar.f335g = f4;
        this.f347g.add(new o(qVar));
        this.f344d = f2;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f346f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((s) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f2, float f3) {
        r rVar = new r();
        rVar.f336b = f2;
        rVar.f337c = f3;
        this.f346f.add(rVar);
        p pVar = new p(rVar, this.f342b, this.f343c);
        float b2 = pVar.b() + 270.0f;
        float b3 = pVar.b() + 270.0f;
        a(b2);
        this.f347g.add(pVar);
        this.f344d = b3;
        this.f342b = f2;
        this.f343c = f3;
    }

    public final void d(float f2, float f3, float f4) {
        this.f341a = f2;
        this.f342b = 0.0f;
        this.f343c = f2;
        this.f344d = f3;
        this.f345e = (f3 + f4) % 360.0f;
        this.f346f.clear();
        this.f347g.clear();
    }
}
