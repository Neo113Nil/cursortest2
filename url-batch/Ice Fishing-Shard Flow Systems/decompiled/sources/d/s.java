package d;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0349A f4600e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(C0349A c0349a, int i2) {
        super(0);
        this.f4599d = i2;
        this.f4600e = c0349a;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4599d) {
            case 0:
                this.f4600e.b();
                break;
            case 1:
                this.f4600e.a();
                break;
            default:
                this.f4600e.b();
                break;
        }
        return Unit.f6114a;
    }
}
