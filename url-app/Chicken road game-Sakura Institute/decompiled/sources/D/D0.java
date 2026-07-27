package D;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class D0 extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f1215e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function0 f1216i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D0(boolean z4, Function0 function0, int i2) {
        super(1);
        this.f1214d = i2;
        this.f1215e = z4;
        this.f1216i = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f1214d) {
            case 0:
                ((Z.M) obj).a(this.f1215e ? 1.0f : ((Number) this.f1216i.invoke()).floatValue());
                break;
            default:
                ((Z.M) obj).c(!this.f1215e && ((Boolean) this.f1216i.invoke()).booleanValue());
                break;
        }
        return Unit.f7487a;
    }
}
