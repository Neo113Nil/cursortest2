package l2;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public float f2664a;

    /* renamed from: b, reason: collision with root package name */
    public float f2665b;

    /* renamed from: c, reason: collision with root package name */
    public float f2666c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f2667e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2668f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2669g = new ArrayList();

    public x() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f2) {
        float f4 = this.d;
        if (f4 == f2) {
            return;
        }
        float f5 = ((f2 - f4) + 360.0f) % 360.0f;
        if (f5 > 180.0f) {
            return;
        }
        float f6 = this.f2665b;
        float f7 = this.f2666c;
        t tVar = new t(f6, f7, f6, f7);
        tVar.f2657f = this.d;
        tVar.f2658g = f5;
        this.f2669g.add(new r(tVar));
        this.d = f2;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f2668f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((v) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f2, float f4) {
        u uVar = new u();
        uVar.f2659b = f2;
        uVar.f2660c = f4;
        this.f2668f.add(uVar);
        s sVar = new s(uVar, this.f2665b, this.f2666c);
        float b4 = sVar.b() + 270.0f;
        float b5 = sVar.b() + 270.0f;
        a(b4);
        this.f2669g.add(sVar);
        this.d = b5;
        this.f2665b = f2;
        this.f2666c = f4;
    }

    public final void d(float f2, float f4, float f5) {
        this.f2664a = f2;
        this.f2665b = 0.0f;
        this.f2666c = f2;
        this.d = f4;
        this.f2667e = (f4 + f5) % 360.0f;
        this.f2668f.clear();
        this.f2669g.clear();
    }
}
