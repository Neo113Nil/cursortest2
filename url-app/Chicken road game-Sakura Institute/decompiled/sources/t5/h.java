package t5;

import java.util.ArrayList;
import java.util.Stack;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public int f8901d;

    /* renamed from: h, reason: collision with root package name */
    public final o5.f f8905h;

    /* renamed from: a, reason: collision with root package name */
    public StringBuilder f8898a = null;

    /* renamed from: b, reason: collision with root package name */
    public final Stack f8899b = new Stack();

    /* renamed from: c, reason: collision with root package name */
    public int f8900c = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8902e = true;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f8903f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f8904g = new ArrayList();

    public h(o5.f fVar) {
        this.f8905h = fVar;
    }

    public final l5.f a(int i7) {
        c[] cVarArr = new c[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            cVarArr[i8] = (c) this.f8899b.get(i8);
        }
        return new l5.f(cVarArr);
    }

    public final void b() {
        o5.j.b("Can't end range without starting a range!", this.f8898a != null);
        for (int i7 = 0; i7 < this.f8901d; i7++) {
            this.f8898a.append(")");
        }
        this.f8898a.append(")");
        l5.f a3 = a(this.f8900c);
        this.f8904g.add(o5.j.e(this.f8898a.toString()));
        this.f8903f.add(a3);
        this.f8898a = null;
    }

    public final void c() {
        if (this.f8898a != null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        this.f8898a = sb;
        sb.append("(");
        i5.l lVar = new i5.l(a(this.f8901d));
        while (lVar.hasNext()) {
            this.f8898a.append(o5.j.f(((c) lVar.next()).f8889f));
            this.f8898a.append(":(");
        }
        this.f8902e = false;
    }
}
