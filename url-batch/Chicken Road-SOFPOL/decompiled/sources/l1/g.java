package l1;

import android.graphics.Path;
import f1.k0;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g extends t {

    /* renamed from: b, reason: collision with root package name */
    public k0 f4771b;

    /* renamed from: c, reason: collision with root package name */
    public List f4772c;

    /* renamed from: d, reason: collision with root package name */
    public float f4773d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4774e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4775f;

    /* renamed from: g, reason: collision with root package name */
    public final f1.j f4776g;

    /* renamed from: h, reason: collision with root package name */
    public f1.j f4777h;
    public final Object i;

    public g() {
        int i = y.f4827a;
        this.f4772c = d6.u.f2326d;
        this.f4773d = 1.0f;
        this.f4774e = true;
        f1.j a8 = f1.l.a();
        this.f4776g = a8;
        this.f4777h = a8;
        this.i = a.a.q(c6.e.f1745d, f.f4768f);
    }

    @Override // l1.t
    public final void a(h1.d dVar) {
        if (this.f4774e) {
            h0.a.W(this.f4772c, this.f4776g);
            e();
        } else if (this.f4775f) {
            e();
        }
        this.f4774e = false;
        this.f4775f = false;
        k0 k0Var = this.f4771b;
        if (k0Var != null) {
            h1.d.l(dVar, this.f4777h, k0Var, 1.0f, null, 56);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [c6.d, java.lang.Object] */
    public final void e() {
        float f6 = this.f4773d;
        f1.j jVar = this.f4776g;
        if (f6 == 1.0f) {
            this.f4777h = jVar;
            return;
        }
        if (q6.i.a(this.f4777h, jVar)) {
            this.f4777h = f1.l.a();
        } else {
            Path.FillType fillType = this.f4777h.f2669a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z3 = fillType == fillType2;
            this.f4777h.f2669a.rewind();
            Path path = this.f4777h.f2669a;
            if (!z3) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        }
        ?? r02 = this.i;
        ((f1.k) r02.getValue()).f2681a.setPath(jVar != null ? jVar.f2669a : null, false);
        float length = ((f1.k) r02.getValue()).f2681a.getLength();
        float f8 = 0.0f * length;
        float f9 = ((this.f4773d + 0.0f) % 1.0f) * length;
        if (f8 <= f9) {
            ((f1.k) r02.getValue()).a(f8, f9, this.f4777h);
        } else {
            ((f1.k) r02.getValue()).a(f8, length, this.f4777h);
            ((f1.k) r02.getValue()).a(0.0f, f9, this.f4777h);
        }
    }

    public final String toString() {
        return this.f4776g.toString();
    }
}
