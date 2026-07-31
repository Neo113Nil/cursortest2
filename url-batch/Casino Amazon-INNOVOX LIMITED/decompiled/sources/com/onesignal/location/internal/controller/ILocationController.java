package com.onesignal.location.internal.controller;

import android.location.Location;
import com.facebook.react.uimanager.ViewProps;
import com.onesignal.common.events.IEventNotifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: ILocationController.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b`\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H&J\u000e\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00020\tH¦@¢\u0006\u0002\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/onesignal/location/internal/controller/ILocationController;", "Lcom/onesignal/common/events/IEventNotifier;", "Lcom/onesignal/location/internal/controller/ILocationUpdatedHandler;", "getLastLocation", "Landroid/location/Location;", ViewProps.START, "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stop", "", "com.onesignal.location"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ILocationController extends IEventNotifier<ILocationUpdatedHandler> {
    Location getLastLocation();

    Object start(Continuation<? super Boolean> continuation);

    Object stop(Continuation<? super Unit> continuation);
}
