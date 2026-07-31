package com.yandex.div.histogram;

import android.os.Handler;
import android.os.Looper;
import com.yandex.div.histogram.DefaultTaskExecutor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class DefaultTaskExecutor implements TaskExecutor {

    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: private */
    public static final void post$lambda$0(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    @Override // com.yandex.div.histogram.TaskExecutor
    public void post(@NotNull final Function0<Unit> task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            task.invoke();
        } else {
            this.handler.post(new Runnable() { // from class: E1.b
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultTaskExecutor.post$lambda$0(Function0.this);
                }
            });
        }
    }
}
