package u;

import a2.n0;
import a2.o0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g extends wd.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o0[] f9511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f9512e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9513i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9514r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o0[] o0VarArr, h hVar, int i3, int i10) {
        super(1);
        this.f9511d = o0VarArr;
        this.f9512e = hVar;
        this.f9513i = i3;
        this.f9514r = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        n0 n0Var = (n0) obj;
        for (o0 o0Var : this.f9511d) {
            if (o0Var != null) {
                long a9 = this.f9512e.f9515a.f9537b.a((o0Var.f131d << 32) | (o0Var.f132e & 4294967295L), (this.f9513i << 32) | (this.f9514r & 4294967295L), x2.l.f10330d);
                n0Var.h(o0Var, (int) (a9 >> 32), (int) (a9 & 4294967295L), 0.0f);
            }
        }
        return Unit.f5554a;
    }
}
