package com.onesignal.location.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LocationManager.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.location.internal.LocationManager", f = "LocationManager.kt", i = {}, l = {196}, m = "startGetLocation", n = {}, s = {})
/* loaded from: classes3.dex */
final class LocationManager$startGetLocation$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LocationManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LocationManager$startGetLocation$1(LocationManager locationManager, Continuation<? super LocationManager$startGetLocation$1> continuation) {
        super(continuation);
        this.this$0 = locationManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object startGetLocation;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        startGetLocation = this.this$0.startGetLocation(this);
        return startGetLocation;
    }
}
