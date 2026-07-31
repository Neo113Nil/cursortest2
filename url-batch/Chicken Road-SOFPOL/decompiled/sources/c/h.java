package c;

import c6.m;
import f1.g0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements p6.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1551d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f1552e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1553f;

    public /* synthetic */ h(d dVar, boolean z3) {
        this.f1553f = dVar;
        this.f1552e = z3;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        switch (this.f1551d) {
            case 0:
                d dVar = (d) this.f1553f;
                dVar.e(this.f1552e);
                return new j((j4.d) obj, dVar);
            default:
                ((g0) obj).a(this.f1552e ? 1.0f : ((Number) ((p6.a) this.f1553f).b()).floatValue());
                return m.f1757a;
        }
    }

    public /* synthetic */ h(boolean z3, p6.a aVar) {
        this.f1552e = z3;
        this.f1553f = aVar;
    }
}
