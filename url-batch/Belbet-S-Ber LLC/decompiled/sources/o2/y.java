package o2;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public float f3017a;

    /* renamed from: b, reason: collision with root package name */
    public float f3018b;

    /* renamed from: c, reason: collision with root package name */
    public float f3019c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3020e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3021f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3022g = new ArrayList();

    public y() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f5) {
        float f6 = this.d;
        if (f6 == f5) {
            return;
        }
        float f7 = ((f5 - f6) + 360.0f) % 360.0f;
        if (f7 > 180.0f) {
            return;
        }
        float f8 = this.f3018b;
        float f9 = this.f3019c;
        u uVar = new u(f8, f9, f8, f9);
        uVar.f3010f = this.d;
        uVar.f3011g = f7;
        this.f3022g.add(new s(uVar));
        this.d = f5;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f3021f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((w) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f5, float f6) {
        v vVar = new v();
        vVar.f3012b = f5;
        vVar.f3013c = f6;
        this.f3021f.add(vVar);
        t tVar = new t(vVar, this.f3018b, this.f3019c);
        float b2 = tVar.b() + 270.0f;
        float b5 = tVar.b() + 270.0f;
        a(b2);
        this.f3022g.add(tVar);
        this.d = b5;
        this.f3018b = f5;
        this.f3019c = f6;
    }

    public final void d(float f5, float f6, float f7) {
        this.f3017a = f5;
        this.f3018b = 0.0f;
        this.f3019c = f5;
        this.d = f6;
        this.f3020e = (f6 + f7) % 360.0f;
        this.f3021f.clear();
        this.f3022g.clear();
    }
}
