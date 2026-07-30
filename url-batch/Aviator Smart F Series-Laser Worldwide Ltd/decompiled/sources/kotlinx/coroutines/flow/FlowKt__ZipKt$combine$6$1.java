package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
final class FlowKt__ZipKt$combine$6$1 extends Lambda implements f6.a {
    final /* synthetic */ e[] $flowArray;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combine$6$1(e[] eVarArr) {
        super(0);
        this.$flowArray = eVarArr;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T[], java.lang.Object[]] */
    @Override // f6.a
    public final T[] invoke() {
        int length = this.$flowArray.length;
        kotlin.jvm.internal.s.reifiedOperationMarker(0, "T?");
        return new Object[length];
    }
}
