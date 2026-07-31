package b6;

import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class i1 implements p6.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q1.o f1344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1345e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p6.c f1346f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f1347g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m0.z0 f1348h;

    public /* synthetic */ i1(q1.o oVar, int i, p6.c cVar, List list, m0.z0 z0Var) {
        this.f1344d = oVar;
        this.f1345e = i;
        this.f1346f = cVar;
        this.f1347g = list;
        this.f1348h = z0Var;
    }

    @Override // p6.a
    public final Object b() {
        float f6 = ((int) (((q1.s) this.f1344d).A >> 32)) * 0.3f;
        m0.z0 z0Var = this.f1348h;
        if (Math.abs(((Number) z0Var.getValue()).floatValue()) > f6) {
            float floatValue = ((Number) z0Var.getValue()).floatValue();
            int i = this.f1345e;
            p6.c cVar = this.f1346f;
            if (floatValue > 0.0f && i > 0) {
                cVar.i(Integer.valueOf(i - 1));
            } else if (((Number) z0Var.getValue()).floatValue() < 0.0f && i < this.f1347g.size() - 1) {
                cVar.i(Integer.valueOf(i + 1));
            }
        }
        z0Var.setValue(Float.valueOf(0.0f));
        return c6.m.f1757a;
    }
}
