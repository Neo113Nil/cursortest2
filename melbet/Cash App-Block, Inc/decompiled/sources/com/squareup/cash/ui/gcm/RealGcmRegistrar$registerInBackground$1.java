package com.squareup.cash.ui.gcm;

import androidx.camera.camera2.impl.LowLightBoostControl;
import androidx.camera.camera2.impl.State3AControl;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.runtime.Latch$await$2$2;
import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.preferences.KeyValue;
import com.squareup.preferences.StringPreference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import okio.ByteString;
import papa.SafeTrace;
import radiography.internal.RenderTreeStringKt;

/* loaded from: classes4.dex */
public final class RealGcmRegistrar$registerInBackground$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public Object L$0;
    public boolean Z$0;
    public boolean Z$1;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealGcmRegistrar$registerInBackground$1(Continuation continuation, LowLightBoostControl lowLightBoostControl, CompletableDeferredImpl completableDeferredImpl, boolean z, boolean z2) {
        super(2, continuation);
        this.L$0 = lowLightBoostControl;
        this.this$0 = completableDeferredImpl;
        this.Z$0 = z;
        this.Z$1 = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                return new RealGcmRegistrar$registerInBackground$1((RealGcmRegistrar) obj2, continuation);
            case 1:
                return new RealGcmRegistrar$registerInBackground$1(continuation, (LowLightBoostControl) this.L$0, (CompletableDeferredImpl) obj2, this.Z$0, this.Z$1);
            default:
                return new RealGcmRegistrar$registerInBackground$1(this.Z$0, this.Z$1, (RealSheetState) this.L$0, (MutableState) obj2, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealGcmRegistrar$registerInBackground$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a4, code lost:
    
        if (com.squareup.cash.ui.gcm.RealGcmRegistrar.access$registerDevice(r0, r8, r7, r10) == r6) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0156, code lost:
    
        if (r11 == r6) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
    
        if (r1.expand(r10) == r7) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
    
        if (r1.peek(r10) == r7) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0078, code lost:
    
        if (r1.expand(r10) == r7) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0195  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        boolean areNotificationsEnabled;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        int i = 1;
        switch (this.$r8$classId) {
            case 0:
                RealGcmRegistrar realGcmRegistrar = (RealGcmRegistrar) this.this$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ByteString.Companion companion = realGcmRegistrar.firebaseGcm;
                    this.label = 1;
                    obj = companion.getFirebaseToken(this);
                    break;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z2 = this.Z$1;
                        z = this.Z$0;
                        str = (String) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        if (z2 != ((Boolean) obj).booleanValue()) {
                            areNotificationsEnabled = z;
                            z = areNotificationsEnabled;
                            z4 = true;
                        }
                        if (z4) {
                            this.L$0 = null;
                            this.Z$0 = z;
                            this.label = 3;
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                str = (String) obj;
                if (str == null) {
                    return Unit.INSTANCE;
                }
                areNotificationsEnabled = realGcmRegistrar.notificationManager.notificationManagerCompat.areNotificationsEnabled();
                StringPreference stringPreference = realGcmRegistrar.gcmToken;
                if (str.equals(stringPreference.preferences.getString(stringPreference.key, null))) {
                    KeyValue keyValue = realGcmRegistrar.osPushSettingEnabled;
                    this.L$0 = str;
                    this.Z$0 = areNotificationsEnabled;
                    this.Z$1 = areNotificationsEnabled;
                    this.label = 2;
                    Object obj2 = keyValue.get(this);
                    if (obj2 != coroutineSingletons) {
                        z = areNotificationsEnabled;
                        obj = obj2;
                        z2 = z;
                        if (z2 != ((Boolean) obj).booleanValue()) {
                        }
                        if (z4) {
                        }
                        return Unit.INSTANCE;
                    }
                    return coroutineSingletons;
                }
                z = areNotificationsEnabled;
                z4 = true;
                if (z4) {
                }
                return Unit.INSTANCE;
            case 1:
                boolean z5 = this.Z$0;
                CompletableDeferredImpl completableDeferredImpl = (CompletableDeferredImpl) this.this$0;
                LowLightBoostControl lowLightBoostControl = (LowLightBoostControl) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Deferred deferred = lowLightBoostControl.checkFrameRateJob;
                    if (deferred == null) {
                        z3 = false;
                        if (z3) {
                            lowLightBoostControl.isLowLightBoostOn = z5;
                            if (!z5) {
                                lowLightBoostControl.setLiveDataValue(lowLightBoostControl._lowLightBoostState, -1);
                            }
                            if (lowLightBoostControl._requestControl != null) {
                                if (z5) {
                                    lowLightBoostControl.setLiveDataValue(lowLightBoostControl._lowLightBoostState, 0);
                                }
                                boolean z6 = this.Z$1;
                                CompletableDeferredImpl completableDeferredImpl2 = lowLightBoostControl._updateSignal;
                                if (z6) {
                                    if (completableDeferredImpl2 != null) {
                                        CameraState$Type$EnumUnboxingLocalUtility.m("There is a new enableLowLightBoost being set", completableDeferredImpl2);
                                    }
                                    lowLightBoostControl._updateSignal = null;
                                } else if (completableDeferredImpl2 != null) {
                                    RenderTreeStringKt.propagateTo(completableDeferredImpl, completableDeferredImpl2);
                                }
                                lowLightBoostControl._updateSignal = completableDeferredImpl;
                                State3AControl state3AControl = lowLightBoostControl.state3AControl;
                                Integer num = z5 ? new Integer(6) : null;
                                synchronized (state3AControl.lock) {
                                    state3AControl._preferredAeMode = num;
                                }
                                RenderTreeStringKt.propagateTo(state3AControl.update(), completableDeferredImpl);
                                completableDeferredImpl.invokeOnCompletion(new Latch$await$2$2(i, completableDeferredImpl, lowLightBoostControl));
                            } else {
                                CameraState$Type$EnumUnboxingLocalUtility.m("Camera is not active.", completableDeferredImpl);
                            }
                        } else {
                            lowLightBoostControl.setLiveDataValue(lowLightBoostControl._lowLightBoostState, -1);
                            completableDeferredImpl.completeExceptionally(new IllegalStateException("Low Light Boost is disabled when expected frame rate range exceeds 30."));
                        }
                        return Unit.INSTANCE;
                    }
                    this.label = 1;
                    obj = deferred.await(this);
                    if (obj == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                z3 = ((Boolean) obj).booleanValue();
                if (z3) {
                }
                return Unit.INSTANCE;
            default:
                MutableState mutableState = (MutableState) this.this$0;
                RealSheetState realSheetState = (RealSheetState) this.L$0;
                boolean z7 = this.Z$1;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 != 0) {
                    if (i4 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i4 == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i4 == 3) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                if (!this.Z$0 || !z7) {
                    if (!z7 && ((Boolean) mutableState.getValue()).booleanValue()) {
                        this.label = 2;
                        break;
                    } else {
                        if (((Boolean) mutableState.getValue()).booleanValue()) {
                            return Unit.INSTANCE;
                        }
                        if (z7) {
                            this.label = 3;
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    this.label = 1;
                    break;
                }
                return coroutineSingletons3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealGcmRegistrar$registerInBackground$1(RealGcmRegistrar realGcmRegistrar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realGcmRegistrar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealGcmRegistrar$registerInBackground$1(boolean z, boolean z2, RealSheetState realSheetState, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.Z$0 = z;
        this.Z$1 = z2;
        this.L$0 = realSheetState;
        this.this$0 = mutableState;
    }
}
