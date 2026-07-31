package ru.rustore.sdk.core.tasks;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes3.dex */
final class TaskThreadHelper$mainHandler$2 extends s implements Function0<Handler> {
    public static final TaskThreadHelper$mainHandler$2 INSTANCE = new TaskThreadHelper$mainHandler$2();

    TaskThreadHelper$mainHandler$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Handler invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
