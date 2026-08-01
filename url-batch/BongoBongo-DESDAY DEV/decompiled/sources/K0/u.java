package K0;

import android.graphics.Matrix;
import android.graphics.Path;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public float f464a;

    /* renamed from: b, reason: collision with root package name */
    public float f465b;

    /* renamed from: c, reason: collision with root package name */
    public float f466c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f467e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f468f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f469g = new ArrayList();

    public u() {
        d(RecyclerView.A0, 270.0f, RecyclerView.A0);
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
        float f5 = this.f465b;
        float f6 = this.f466c;
        q qVar = new q(f5, f6, f5, f6);
        qVar.f457f = this.d;
        qVar.f458g = f4;
        this.f469g.add(new o(qVar));
        this.d = f2;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f468f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((s) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f2, float f3) {
        r rVar = new r();
        rVar.f459b = f2;
        rVar.f460c = f3;
        this.f468f.add(rVar);
        p pVar = new p(rVar, this.f465b, this.f466c);
        float b2 = pVar.b() + 270.0f;
        float b3 = pVar.b() + 270.0f;
        a(b2);
        this.f469g.add(pVar);
        this.d = b3;
        this.f465b = f2;
        this.f466c = f3;
    }

    public final void d(float f2, float f3, float f4) {
        this.f464a = f2;
        this.f465b = RecyclerView.A0;
        this.f466c = f2;
        this.d = f3;
        this.f467e = (f3 + f4) % 360.0f;
        this.f468f.clear();
        this.f469g.clear();
    }
}
