package retrofit2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final class KotlinExtensions$await$4$1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Call $this_await;

    public /* synthetic */ KotlinExtensions$await$4$1(Call call, int i) {
        this.$r8$classId = i;
        this.$this_await = call;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Call call = this.$this_await;
        switch (i) {
            case 0:
                call.cancel();
                break;
            default:
                call.cancel();
                break;
        }
        return Unit.INSTANCE;
    }
}
