package z;

import a0.f0;
import java.util.ArrayList;
import java.util.List;
import o.x;
import u1.d0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final x f9022a;

    /* renamed from: b, reason: collision with root package name */
    public final h f9023b;

    /* renamed from: c, reason: collision with root package name */
    public final f0 f9024c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f0 f9026e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9027f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9028g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y0.d f9029h;
    public final /* synthetic */ int i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f9030j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f9031k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f9032l;

    public i(long j7, h hVar, f0 f0Var, int i, int i8, y0.d dVar, int i9, int i10, long j8, p pVar) {
        this.f9026e = f0Var;
        this.f9027f = i;
        this.f9028g = i8;
        this.f9029h = dVar;
        this.i = i9;
        this.f9030j = i10;
        this.f9031k = j8;
        this.f9032l = pVar;
        x xVar = o.m.f5510a;
        this.f9022a = new x();
        this.f9023b = hVar;
        this.f9024c = f0Var;
        this.f9025d = r2.b.b(Integer.MAX_VALUE, r2.a.g(j7), 5);
    }

    public final l a(int i, long j7) {
        long j8;
        h hVar = this.f9023b;
        Object d8 = hVar.d(i);
        Object b8 = hVar.b(i);
        x xVar = this.f9022a;
        List list = (List) xVar.b(i);
        if (list != null) {
            j8 = j7;
        } else {
            f0 f0Var = this.f9024c;
            h hVar2 = f0Var.f76f;
            x xVar2 = f0Var.f77g;
            List list2 = (List) xVar2.b(i);
            if (list2 == null) {
                Object d9 = hVar2.d(i);
                list2 = f0Var.f75e.z(d9, f0Var.f74d.a(i, d9, hVar2.b(i)));
                xVar2.g(i, list2);
            }
            int size = list2.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i8 = 0; i8 < size; i8++) {
                arrayList.add(((d0) list2.get(i8)).e(j7));
            }
            j8 = j7;
            xVar.g(i, arrayList);
            list = arrayList;
        }
        return new l(i, list, this.f9029h, this.f9026e.f75e.getLayoutDirection(), this.i, this.f9030j, i != this.f9027f + (-1) ? this.f9028g : 0, this.f9031k, d8, b8, this.f9032l.f9089n, j8);
    }
}
