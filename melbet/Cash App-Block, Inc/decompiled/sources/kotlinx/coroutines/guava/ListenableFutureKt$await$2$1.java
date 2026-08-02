package kotlinx.coroutines.guava;

import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final class ListenableFutureKt$await$2$1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ListenableFuture $this_await;

    public /* synthetic */ ListenableFutureKt$await$2$1(ListenableFuture listenableFuture, int i) {
        this.$r8$classId = i;
        this.$this_await = listenableFuture;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        ListenableFuture listenableFuture = this.$this_await;
        switch (i) {
            case 0:
                listenableFuture.cancel(false);
                break;
            default:
                listenableFuture.cancel(false);
                break;
        }
        return Unit.INSTANCE;
    }
}
