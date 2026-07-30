package okhttp3.internal.concurrent;

import f6.a;

/* loaded from: classes5.dex */
public final class TaskQueue$execute$1 extends Task {
    final /* synthetic */ a $block;
    final /* synthetic */ boolean $cancelable;
    final /* synthetic */ String $name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskQueue$execute$1(String str, boolean z7, a aVar) {
        super(str, z7);
        this.$name = str;
        this.$cancelable = z7;
        this.$block = aVar;
    }

    @Override // okhttp3.internal.concurrent.Task
    public long runOnce() {
        this.$block.invoke();
        return -1L;
    }
}
