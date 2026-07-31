package com.onesignal.location;

import com.onesignal.core.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ILocationManager.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0007\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\bR\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/onesignal/location/ILocationManager;", "", "isShared", "", "()Z", "setShared", "(Z)V", "requestPermission", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ILocationManager {
    boolean isShared();

    Object requestPermission(Continuation<? super Boolean> continuation);

    void setShared(boolean z);
}
