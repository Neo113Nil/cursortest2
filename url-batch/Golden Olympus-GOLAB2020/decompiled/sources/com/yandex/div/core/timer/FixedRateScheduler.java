package com.yandex.div.core.timer;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class FixedRateScheduler {

    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper());

    public final void cancel() {
        this.handler.removeCallbacksAndMessages(null);
    }

    public final void scheduleAtFixedRate(long j4, final long j5, @NotNull final Function0<Unit> onTick) {
        Intrinsics.checkNotNullParameter(onTick, "onTick");
        this.handler.postDelayed(new Runnable() { // from class: com.yandex.div.core.timer.FixedRateScheduler$scheduleAtFixedRate$1
            @Override // java.lang.Runnable
            public void run() {
                Handler handler;
                handler = FixedRateScheduler.this.handler;
                handler.postDelayed(this, j5);
                onTick.invoke();
            }
        }, j4);
    }
}
