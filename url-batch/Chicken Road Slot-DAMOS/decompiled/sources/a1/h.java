package a1;

import androidx.lifecycle.u;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import n0.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f24e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f25i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f26r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ hd.c f27s;

    public /* synthetic */ h(x0.d dVar, Object obj, Object obj2, int i3) {
        this.f23d = 2;
        this.f27s = dVar;
        this.f26r = obj;
        this.f25i = obj2;
        this.f24e = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23d) {
            case 0:
                ((Integer) obj2).getClass();
                int z10 = n0.h.z(this.f24e | 1);
                ((j) this.f25i).a(this.f26r, (x0.d) this.f27s, (i0) obj, z10);
                break;
            case 1:
                ((Integer) obj2).intValue();
                cf.c.g((u) this.f25i, (i4.d) this.f26r, (Function1) this.f27s, (i0) obj, n0.h.z(this.f24e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int z11 = n0.h.z(this.f24e) | 1;
                ((x0.d) this.f27s).d(this.f26r, this.f25i, (i0) obj, z11);
                break;
        }
        return Unit.f5554a;
    }

    public /* synthetic */ h(Object obj, Object obj2, hd.c cVar, int i3, int i10) {
        this.f23d = i10;
        this.f25i = obj;
        this.f26r = obj2;
        this.f27s = cVar;
        this.f24e = i3;
    }
}
