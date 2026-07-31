package w5;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public float f8179a;

    /* renamed from: b, reason: collision with root package name */
    public float f8180b;

    /* renamed from: c, reason: collision with root package name */
    public float f8181c;

    /* renamed from: d, reason: collision with root package name */
    public float f8182d;

    /* renamed from: e, reason: collision with root package name */
    public float f8183e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f8184f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f8185g = new ArrayList();

    public x() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f6) {
        float f8 = this.f8182d;
        if (f8 == f6) {
            return;
        }
        float f9 = ((f6 - f8) + 360.0f) % 360.0f;
        if (f9 > 180.0f) {
            return;
        }
        float f10 = this.f8180b;
        float f11 = this.f8181c;
        t tVar = new t(f10, f11, f10, f11);
        tVar.f8172f = this.f8182d;
        tVar.f8173g = f9;
        this.f8185g.add(new r(tVar));
        this.f8182d = f6;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f8184f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((v) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f6, float f8) {
        u uVar = new u();
        uVar.f8174b = f6;
        uVar.f8175c = f8;
        this.f8184f.add(uVar);
        s sVar = new s(uVar, this.f8180b, this.f8181c);
        float b8 = sVar.b() + 270.0f;
        float b9 = sVar.b() + 270.0f;
        a(b8);
        this.f8185g.add(sVar);
        this.f8182d = b9;
        this.f8180b = f6;
        this.f8181c = f8;
    }

    public final void d(float f6, float f8, float f9) {
        this.f8179a = f6;
        this.f8180b = 0.0f;
        this.f8181c = f6;
        this.f8182d = f8;
        this.f8183e = (f8 + f9) % 360.0f;
        this.f8184f.clear();
        this.f8185g.clear();
    }
}
