package J0;

import android.graphics.Matrix;
import android.graphics.Path;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public float f397a;

    /* renamed from: b, reason: collision with root package name */
    public float f398b;

    /* renamed from: c, reason: collision with root package name */
    public float f399c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f400e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f401f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f402g = new ArrayList();

    public u() {
        d(RecyclerView.f1530C0, 270.0f, RecyclerView.f1530C0);
    }

    public final void a(float f2) {
        float f3 = this.d;
        if (f3 == f2) {
            return;
        }
        float f4 = ((f2 - f3) + 360.0f) % 360.0f;
        if (f4 > 180.0f) {
            return;
        }
        float f5 = this.f398b;
        float f6 = this.f399c;
        q qVar = new q(f5, f6, f5, f6);
        qVar.f390f = this.d;
        qVar.f391g = f4;
        this.f402g.add(new o(qVar));
        this.d = f2;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f401f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((s) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f2, float f3) {
        r rVar = new r();
        rVar.f392b = f2;
        rVar.f393c = f3;
        this.f401f.add(rVar);
        p pVar = new p(rVar, this.f398b, this.f399c);
        float b2 = pVar.b() + 270.0f;
        float b3 = pVar.b() + 270.0f;
        a(b2);
        this.f402g.add(pVar);
        this.d = b3;
        this.f398b = f2;
        this.f399c = f3;
    }

    public final void d(float f2, float f3, float f4) {
        this.f397a = f2;
        this.f398b = RecyclerView.f1530C0;
        this.f399c = f2;
        this.d = f3;
        this.f400e = (f3 + f4) % 360.0f;
        this.f401f.clear();
        this.f402g.clear();
    }
}
