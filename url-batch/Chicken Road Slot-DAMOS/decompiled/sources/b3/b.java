package b3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends wd.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f1052e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(q qVar, int i3) {
        super(1);
        this.f1051d = i3;
        this.f1052e = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f1051d) {
            case 0:
                q qVar = this.f1052e;
                qVar.show();
                return new a(0, qVar);
            default:
                q qVar2 = this.f1052e;
                if (qVar2.f1086t.f1074a) {
                    qVar2.f1085s.invoke();
                }
                return Unit.f5554a;
        }
    }
}
