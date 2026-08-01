package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class x20 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public x20() {
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
        t20 t20Var = new t20(f4, f5, f4, f5);
        t20Var.f = this.d;
        t20Var.g = f3;
        this.g.add(new r20(t20Var));
        this.d = f;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((v20) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f, float f2) {
        u20 u20Var = new u20();
        u20Var.b = f;
        u20Var.c = f2;
        this.f.add(u20Var);
        s20 s20Var = new s20(u20Var, this.b, this.c);
        float b = s20Var.b() + 270.0f;
        float b2 = s20Var.b() + 270.0f;
        a(b);
        this.g.add(s20Var);
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
