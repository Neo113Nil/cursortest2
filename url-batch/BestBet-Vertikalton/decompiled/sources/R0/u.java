package R0;

import android.graphics.Matrix;
import android.graphics.Path;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public float f979a;

    /* renamed from: b, reason: collision with root package name */
    public float f980b;

    /* renamed from: c, reason: collision with root package name */
    public float f981c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f982e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f983f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f984g = new ArrayList();

    public u() {
        d(RecyclerView.f1937A0, 270.0f, RecyclerView.f1937A0);
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
        float f5 = this.f980b;
        float f6 = this.f981c;
        q qVar = new q(f5, f6, f5, f6);
        qVar.f972f = this.d;
        qVar.f973g = f4;
        this.f984g.add(new o(qVar));
        this.d = f2;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f983f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((s) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f2, float f3) {
        r rVar = new r();
        rVar.f974b = f2;
        rVar.f975c = f3;
        this.f983f.add(rVar);
        p pVar = new p(rVar, this.f980b, this.f981c);
        float b2 = pVar.b() + 270.0f;
        float b3 = pVar.b() + 270.0f;
        a(b2);
        this.f984g.add(pVar);
        this.d = b3;
        this.f980b = f2;
        this.f981c = f3;
    }

    public final void d(float f2, float f3, float f4) {
        this.f979a = f2;
        this.f980b = RecyclerView.f1937A0;
        this.f981c = f2;
        this.d = f3;
        this.f982e = (f3 + f4) % 360.0f;
        this.f983f.clear();
        this.f984g.clear();
    }
}
