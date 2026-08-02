package okhttp3.internal.concurrent;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class TaskQueue$execute$1 extends Task {
    public final /* synthetic */ Function0 $block;
    public final /* synthetic */ int $r8$classId = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskQueue$execute$1(String str, Function0 function0) {
        super(str, true);
        this.$block = function0;
    }

    @Override // okhttp3.internal.concurrent.Task
    public final long runOnce() {
        int i = this.$r8$classId;
        Function0 function0 = this.$block;
        switch (i) {
            case 0:
                function0.invoke();
                return -1L;
            default:
                return ((Number) function0.invoke()).longValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskQueue$execute$1(String str, boolean z, Function0 function0) {
        super(str, z);
        this.$block = function0;
    }
}
