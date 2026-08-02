package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class foq {

    @Deprecated
    public float a;

    @Deprecated
    public float b;

    @Deprecated
    public float c;

    @Deprecated
    public float d;

    @Deprecated
    public float e;
    public final List f = new ArrayList();
    private final List g = new ArrayList();

    public foq() {
        e(0.0f, 270.0f, 0.0f);
    }

    private final void f(float f) {
        float f2 = this.d;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 <= 180.0f) {
            float f4 = this.b;
            float f5 = this.c;
            fom fomVar = new fom(f4, f5, f4, f5);
            fomVar.e = this.d;
            fomVar.f = f3;
            this.g.add(new fok(fomVar));
            this.d = f;
        }
    }

    final fop a(Matrix matrix) {
        f(this.e);
        return new foj(new ArrayList(this.g), new Matrix(matrix));
    }

    public final void b(fop fopVar, float f, float f2) {
        f(f);
        this.g.add(fopVar);
        this.d = f2;
    }

    public final void c(Matrix matrix, Path path) {
        List list = this.f;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((foo) list.get(i)).a(matrix, path);
        }
    }

    public final void d(float f, float f2) {
        fon fonVar = new fon();
        fonVar.a = f;
        fonVar.b = f2;
        this.f.add(fonVar);
        fol folVar = new fol(fonVar, this.b, this.c);
        b(folVar, folVar.b() + 270.0f, folVar.b() + 270.0f);
        this.b = f;
        this.c = f2;
    }

    public final void e(float f, float f2, float f3) {
        this.a = f;
        this.b = 0.0f;
        this.c = f;
        this.d = f2;
        this.e = (f2 + f3) % 360.0f;
        this.f.clear();
        this.g.clear();
    }
}
