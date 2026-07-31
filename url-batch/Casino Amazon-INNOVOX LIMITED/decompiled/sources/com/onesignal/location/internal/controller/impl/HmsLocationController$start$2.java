package com.onesignal.location.internal.controller.impl;

import android.location.Location;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationServices;
import com.onesignal.common.events.EventProducer;
import com.onesignal.common.threading.WaiterWithValue;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.location.internal.controller.ILocationUpdatedHandler;
import com.onesignal.location.internal.controller.impl.HmsLocationController;
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
import kotlinx.coroutines.sync.Mutex;

/* compiled from: HmsLocationController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.location.internal.controller.impl.HmsLocationController$start$2", f = "HmsLocationController.kt", i = {0, 1}, l = {229, 81}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
final class HmsLocationController$start$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<HmsLocationController> $self;
    final /* synthetic */ Ref.BooleanRef $wasSuccessful;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ HmsLocationController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HmsLocationController$start$2(HmsLocationController hmsLocationController, Ref.BooleanRef booleanRef, Ref.ObjectRef<HmsLocationController> objectRef, Continuation<? super HmsLocationController$start$2> continuation) {
        super(2, continuation);
        this.this$0 = hmsLocationController;
        this.$wasSuccessful = booleanRef;
        this.$self = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HmsLocationController$start$2(this.this$0, this.$wasSuccessful, this.$self, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HmsLocationController$start$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0104 A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x0025, B:8:0x00f8, B:10:0x0104, B:12:0x012a), top: B:6:0x0025 }] */
    /* JADX WARN: Type inference failed for: r7v5, types: [T, com.onesignal.common.threading.WaiterWithValue] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        Ref.BooleanRef booleanRef;
        final HmsLocationController hmsLocationController;
        Ref.ObjectRef<HmsLocationController> objectRef;
        Mutex mutex2;
        Throwable th;
        FusedLocationProviderClient fusedLocationProviderClient;
        IApplicationService iApplicationService;
        Location location;
        FusedLocationProviderClient fusedLocationProviderClient2;
        Ref.ObjectRef<HmsLocationController> objectRef2;
        Ref.BooleanRef booleanRef2;
        Ref.BooleanRef booleanRef3;
        final HmsLocationController hmsLocationController2;
        EventProducer eventProducer;
        EventProducer eventProducer2;
        IApplicationService iApplicationService2;
        FusedLocationProviderClient fusedLocationProviderClient3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                mutex = this.this$0.startStopMutex;
                HmsLocationController hmsLocationController3 = this.this$0;
                Ref.BooleanRef booleanRef4 = this.$wasSuccessful;
                Ref.ObjectRef<HmsLocationController> objectRef3 = this.$self;
                this.L$0 = mutex;
                this.L$1 = hmsLocationController3;
                this.L$2 = booleanRef4;
                this.L$3 = objectRef3;
                this.label = 1;
                if (mutex.lock(null, this) != coroutine_suspended) {
                    booleanRef = booleanRef4;
                    hmsLocationController = hmsLocationController3;
                    objectRef = objectRef3;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanRef2 = (Ref.BooleanRef) this.L$4;
                objectRef2 = (Ref.ObjectRef) this.L$3;
                booleanRef3 = (Ref.BooleanRef) this.L$2;
                hmsLocationController2 = (HmsLocationController) this.L$1;
                mutex2 = (Mutex) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    booleanRef2.element = ((Boolean) obj).booleanValue();
                    if (booleanRef3.element) {
                        eventProducer2 = hmsLocationController2.event;
                        eventProducer2.fire(new Function1<ILocationUpdatedHandler, Unit>() { // from class: com.onesignal.location.internal.controller.impl.HmsLocationController$start$2$1$4
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
                                location2 = HmsLocationController.this.lastLocation;
                                Intrinsics.checkNotNull(location2);
                                it.onLocationChanged(location2);
                            }
                        });
                        HmsLocationController hmsLocationController4 = objectRef2.element;
                        iApplicationService2 = hmsLocationController2._applicationService;
                        fusedLocationProviderClient3 = hmsLocationController2.hmsFusedLocationClient;
                        Intrinsics.checkNotNull(fusedLocationProviderClient3);
                        hmsLocationController2.locationUpdateListener = new HmsLocationController.LocationUpdateListener(hmsLocationController4, iApplicationService2, fusedLocationProviderClient3);
                    }
                    mutex = mutex2;
                    mutex2 = mutex;
                    Unit unit = Unit.INSTANCE;
                    mutex2.unlock(null);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            objectRef = (Ref.ObjectRef) this.L$3;
            booleanRef = (Ref.BooleanRef) this.L$2;
            hmsLocationController = (HmsLocationController) this.L$1;
            Mutex mutex3 = (Mutex) this.L$0;
            ResultKt.throwOnFailure(obj);
            mutex = mutex3;
            fusedLocationProviderClient = hmsLocationController.hmsFusedLocationClient;
            if (fusedLocationProviderClient == null) {
                try {
                    iApplicationService = hmsLocationController._applicationService;
                    hmsLocationController.hmsFusedLocationClient = LocationServices.getFusedLocationProviderClient(iApplicationService.getAppContext());
                } catch (Exception e) {
                    Logging.warn$default("Huawei LocationServices getFusedLocationProviderClient failed! " + e, null, 2, null);
                    booleanRef.element = false;
                }
            }
            location = hmsLocationController.lastLocation;
            if (location != null) {
                eventProducer = hmsLocationController.event;
                eventProducer.fire(new Function1<ILocationUpdatedHandler, Unit>() { // from class: com.onesignal.location.internal.controller.impl.HmsLocationController$start$2$1$1
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
                        location2 = HmsLocationController.this.lastLocation;
                        Intrinsics.checkNotNull(location2);
                        it.onLocationChanged(location2);
                    }
                });
                mutex2 = mutex;
                Unit unit2 = Unit.INSTANCE;
                mutex2.unlock(null);
                return Unit.INSTANCE;
            }
            final Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
            objectRef4.element = new WaiterWithValue();
            fusedLocationProviderClient2 = hmsLocationController.hmsFusedLocationClient;
            Intrinsics.checkNotNull(fusedLocationProviderClient2);
            fusedLocationProviderClient2.getLastLocation().addOnSuccessListener(new OnSuccessListener() { // from class: com.onesignal.location.internal.controller.impl.HmsLocationController$start$2$$ExternalSyntheticLambda0
                public final void onSuccess(Object obj2) {
                    HmsLocationController$start$2.invokeSuspend$lambda$2$lambda$0(Ref.ObjectRef.this, hmsLocationController, (Location) obj2);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: com.onesignal.location.internal.controller.impl.HmsLocationController$start$2$$ExternalSyntheticLambda1
                public final void onFailure(Exception exc) {
                    HmsLocationController$start$2.invokeSuspend$lambda$2$lambda$1(Ref.ObjectRef.this, exc);
                }
            });
            WaiterWithValue waiterWithValue = (WaiterWithValue) objectRef4.element;
            this.L$0 = mutex;
            this.L$1 = hmsLocationController;
            this.L$2 = booleanRef;
            this.L$3 = objectRef;
            this.L$4 = booleanRef;
            this.label = 2;
            Object waitForWake = waiterWithValue.waitForWake(this);
            if (waitForWake != coroutine_suspended) {
                mutex2 = mutex;
                obj = waitForWake;
                objectRef2 = objectRef;
                booleanRef2 = booleanRef;
                booleanRef3 = booleanRef2;
                hmsLocationController2 = hmsLocationController;
                booleanRef2.element = ((Boolean) obj).booleanValue();
                if (booleanRef3.element) {
                }
                mutex = mutex2;
                mutex2 = mutex;
                Unit unit22 = Unit.INSTANCE;
                mutex2.unlock(null);
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.unlock(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void invokeSuspend$lambda$2$lambda$0(Ref.ObjectRef objectRef, HmsLocationController hmsLocationController, Location location) {
        Logging.warn$default("Huawei LocationServices getLastLocation returned location: " + location, null, 2, null);
        if (location != null) {
            hmsLocationController.lastLocation = location;
            ((WaiterWithValue) objectRef.element).wake(true);
        } else {
            ((WaiterWithValue) objectRef.element).wake(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void invokeSuspend$lambda$2$lambda$1(Ref.ObjectRef objectRef, Exception exc) {
        Logging.warn("Huawei LocationServices getLastLocation failed!", exc);
        ((WaiterWithValue) objectRef.element).wake(false);
    }
}
