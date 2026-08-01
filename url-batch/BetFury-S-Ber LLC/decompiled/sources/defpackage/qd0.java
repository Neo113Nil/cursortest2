package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class qd0 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public qd0() {
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
        md0 md0Var = new md0(f4, f5, f4, f5);
        md0Var.f = this.d;
        md0Var.g = f3;
        this.g.add(new kd0(md0Var));
        this.d = f;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((od0) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f, float f2) {
        nd0 nd0Var = new nd0();
        nd0Var.b = f;
        nd0Var.c = f2;
        this.f.add(nd0Var);
        ld0 ld0Var = new ld0(nd0Var, this.b, this.c);
        float b = ld0Var.b() + 270.0f;
        float b2 = ld0Var.b() + 270.0f;
        a(b);
        this.g.add(ld0Var);
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
