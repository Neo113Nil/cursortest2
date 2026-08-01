package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class n20 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public n20() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f) {
        float f2 = this.d;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.b;
        float f5 = this.c;
        j20 j20Var = new j20(f4, f5, f4, f5);
        j20Var.f = this.d;
        j20Var.g = f3;
        this.g.add(new h20(j20Var));
        this.d = f;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((l20) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f, float f2) {
        k20 k20Var = new k20();
        k20Var.b = f;
        k20Var.c = f2;
        this.f.add(k20Var);
        i20 i20Var = new i20(k20Var, this.b, this.c);
        float b = i20Var.b() + 270.0f;
        float b2 = i20Var.b() + 270.0f;
        a(b);
        this.g.add(i20Var);
        this.d = b2;
        this.b = f;
        this.c = f2;
    }

    public final void d(float f, float f2, float f3) {
        this.a = f;
        this.b = 0.0f;
        this.c = f;
        this.d = f2;
        this.e = (f2 + f3) % 360.0f;
        this.f.clear();
        this.g.clear();
    }
}
