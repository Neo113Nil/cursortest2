package com.onesignal.core.internal.background;

import com.onesignal.core.BuildConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: IBackgroundService.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/onesignal/core/internal/background/IBackgroundService;", "", "scheduleBackgroundRunIn", "", "getScheduleBackgroundRunIn", "()Ljava/lang/Long;", "backgroundRun", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface IBackgroundService {
    Object backgroundRun(Continuation<? super Unit> continuation);

    Long getScheduleBackgroundRunIn();
}
