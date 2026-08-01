package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class p50 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public p50() {
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
        l50 l50Var = new l50(f4, f5, f4, f5);
        l50Var.f = this.d;
        l50Var.g = f3;
        this.g.add(new j50(l50Var));
        this.d = f;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((n50) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f, float f2) {
        m50 m50Var = new m50();
        m50Var.b = f;
        m50Var.c = f2;
        this.f.add(m50Var);
        k50 k50Var = new k50(m50Var, this.b, this.c);
        float b = k50Var.b() + 270.0f;
        float b2 = k50Var.b() + 270.0f;
        a(b);
        this.g.add(k50Var);
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
