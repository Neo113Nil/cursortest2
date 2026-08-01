package e;

import d.d0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f3737e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d2.b f3738i;

    public /* synthetic */ b(d2.b bVar, boolean z10, int i3) {
        this.f3736d = i3;
        this.f3738i = bVar;
        this.f3737e = z10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3736d) {
            case 0:
                f fVar = (f) this.f3738i;
                d0 d0Var = (d0) fVar.f3336a;
                boolean z10 = this.f3737e;
                d0Var.d(z10);
                ((f.a) fVar.f3337b).f(z10);
                return new d((i4.d) obj, fVar, 0);
            default:
                h hVar = (h) this.f3738i;
                hVar.j(this.f3737e);
                return new d((i4.d) obj, hVar, 1);
        }
    }
}
