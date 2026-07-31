package com.onesignal.location.internal.controller.impl;

import android.location.Location;
import com.onesignal.common.events.EventProducer;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.location.internal.controller.ILocationUpdatedHandler;
import com.onesignal.location.internal.controller.impl.GmsLocationController;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: GmsLocationController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.location.internal.controller.impl.GmsLocationController$start$2", f = "GmsLocationController.kt", i = {0, 1}, l = {261, 64}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
final class GmsLocationController$start$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<GmsLocationController> $self;
    final /* synthetic */ Ref.BooleanRef $wasSuccessful;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ GmsLocationController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GmsLocationController$start$2(GmsLocationController gmsLocationController, Ref.BooleanRef booleanRef, Ref.ObjectRef<GmsLocationController> objectRef, Continuation<? super GmsLocationController$start$2> continuation) {
        super(2, continuation);
        this.this$0 = gmsLocationController;
        this.$wasSuccessful = booleanRef;
        this.$self = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GmsLocationController$start$2(this.this$0, this.$wasSuccessful, this.$self, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GmsLocationController$start$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a8, code lost:
    
        if (kotlinx.coroutines.TimeoutKt.withTimeout(r7, r3, r10) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0058, code lost:
    
        if (r11.lock(null, r10) == r0) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v12, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        final GmsLocationController gmsLocationController;
        Ref.BooleanRef booleanRef;
        Ref.ObjectRef<GmsLocationController> objectRef;
        GoogleApiClientCompatProxy googleApiClientCompatProxy;
        Mutex mutex2;
        Location location;
        GmsLocationController.LocationUpdateListener locationUpdateListener;
        EventProducer eventProducer;
        ?? coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                mutex = this.this$0.startStopMutex;
                gmsLocationController = this.this$0;
                booleanRef = this.$wasSuccessful;
                objectRef = this.$self;
                this.L$0 = mutex;
                this.L$1 = gmsLocationController;
                this.L$2 = booleanRef;
                this.L$3 = objectRef;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        coroutine_suspended = mutex2;
                    } catch (TimeoutCancellationException unused) {
                        Logging.warn$default("Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.", null, 2, null);
                        coroutine_suspended = mutex2;
                        Unit unit = Unit.INSTANCE;
                        coroutine_suspended.unlock(null);
                        return Unit.INSTANCE;
                    }
                    Unit unit2 = Unit.INSTANCE;
                    coroutine_suspended.unlock(null);
                    return Unit.INSTANCE;
                }
                objectRef = (Ref.ObjectRef) this.L$3;
                booleanRef = (Ref.BooleanRef) this.L$2;
                gmsLocationController = (GmsLocationController) this.L$1;
                Mutex mutex3 = (Mutex) this.L$0;
                ResultKt.throwOnFailure(obj);
                mutex = mutex3;
            }
            googleApiClientCompatProxy = gmsLocationController.googleApiClient;
            if (googleApiClientCompatProxy != null) {
                location = gmsLocationController.lastLocation;
                if (location != null) {
                    eventProducer = gmsLocationController.event;
                    eventProducer.fire(new Function1<ILocationUpdatedHandler, Unit>() { // from class: com.onesignal.location.internal.controller.impl.GmsLocationController$start$2$1$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ILocationUpdatedHandler iLocationUpdatedHandler) {
                            invoke2(iLocationUpdatedHandler);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(ILocationUpdatedHandler it) {
                            Location location2;
                            Intrinsics.checkNotNullParameter(it, "it");
                            location2 = GmsLocationController.this.lastLocation;
                            Intrinsics.checkNotNull(location2);
                            it.onLocationChanged(location2);
                        }
                    });
                } else {
                    Location lastLocation = gmsLocationController.getLastLocation();
                    if (lastLocation != null) {
                        gmsLocationController.setLocationAndFire(lastLocation);
                    }
                }
                locationUpdateListener = gmsLocationController.locationUpdateListener;
                if (locationUpdateListener != null) {
                    locationUpdateListener.refreshRequest$com_onesignal_location(true);
                }
                booleanRef.element = true;
            } else {
                try {
                    long api_fallback_time = GmsLocationController.INSTANCE.getAPI_FALLBACK_TIME();
                    GmsLocationController$start$2$1$2 gmsLocationController$start$2$1$2 = new GmsLocationController$start$2$1$2(objectRef, gmsLocationController, booleanRef, null);
                    this.L$0 = mutex;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 2;
                } catch (TimeoutCancellationException unused2) {
                    mutex2 = mutex;
                    Logging.warn$default("Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.", null, 2, null);
                    coroutine_suspended = mutex2;
                    Unit unit22 = Unit.INSTANCE;
                    coroutine_suspended.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            coroutine_suspended = mutex;
            Unit unit222 = Unit.INSTANCE;
            coroutine_suspended.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            coroutine_suspended = mutex;
            th = th2;
            coroutine_suspended.unlock(null);
            throw th;
        }
    }
}
