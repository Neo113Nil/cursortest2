package q;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p0.InterfaceC0946G;

/* renamed from: q.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1002F extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ I.d f9158e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1002F(int i2, I.d dVar) {
        super(1);
        this.f9157d = i2;
        this.f9158e = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f9157d) {
            case 0:
                I.d dVar = this.f9158e;
                int i2 = dVar.f3332i;
                if (i2 > 0) {
                    Object[] objArr = dVar.f3330d;
                    int i4 = 0;
                    do {
                        ((InterfaceC0946G) objArr[i4]).l();
                        i4++;
                    } while (i4 < i2);
                }
                return Unit.f7487a;
            default:
                this.f9158e.b((S.m) obj);
                return Boolean.TRUE;
        }
    }
}
