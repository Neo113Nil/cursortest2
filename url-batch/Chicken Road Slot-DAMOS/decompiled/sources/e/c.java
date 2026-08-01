package e;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import n0.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f3740e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ hd.c f3741i;

    public /* synthetic */ c(boolean z10, hd.c cVar, int i3, int i10) {
        this.f3739d = i10;
        this.f3740e = z10;
        this.f3741i = cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3739d) {
            case 0:
                ((Integer) obj2).getClass();
                int z10 = n0.h.z(1);
                k7.e.a(this.f3740e, (Function0) this.f3741i, (i0) obj, z10);
                break;
            default:
                ((Integer) obj2).getClass();
                int z11 = n0.h.z(1);
                a.a.e(this.f3740e, (Function2) this.f3741i, (i0) obj, z11);
                break;
        }
        return Unit.f5554a;
    }
}
