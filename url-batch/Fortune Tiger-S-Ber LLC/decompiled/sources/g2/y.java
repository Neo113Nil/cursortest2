package g2;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public float f1916a;

    /* renamed from: b, reason: collision with root package name */
    public float f1917b;
    public float c;

    /* renamed from: d, reason: collision with root package name */
    public float f1918d;

    /* renamed from: e, reason: collision with root package name */
    public float f1919e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f1920f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public y() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f4) {
        float f5 = this.f1918d;
        if (f5 == f4) {
            return;
        }
        float f6 = ((f4 - f5) + 360.0f) % 360.0f;
        if (f6 > 180.0f) {
            return;
        }
        float f7 = this.f1917b;
        float f8 = this.c;
        u uVar = new u(f7, f8, f7, f8);
        uVar.f1911f = this.f1918d;
        uVar.g = f6;
        this.g.add(new s(uVar));
        this.f1918d = f4;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f1920f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((w) arrayList.get(i4)).a(matrix, path);
        }
    }

    public final void c(float f4, float f5) {
        v vVar = new v();
        vVar.f1912b = f4;
        vVar.c = f5;
        this.f1920f.add(vVar);
        t tVar = new t(vVar, this.f1917b, this.c);
        float b2 = tVar.b() + 270.0f;
        float b4 = tVar.b() + 270.0f;
        a(b2);
        this.g.add(tVar);
        this.f1918d = b4;
        this.f1917b = f4;
        this.c = f5;
    }

    public final void d(float f4, float f5, float f6) {
        this.f1916a = f4;
        this.f1917b = 0.0f;
        this.c = f4;
        this.f1918d = f5;
        this.f1919e = (f5 + f6) % 360.0f;
        this.f1920f.clear();
        this.g.clear();
    }
}
