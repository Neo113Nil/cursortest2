package com.onesignal.core.internal.permissions;

import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferenceOneSignalKeys;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: PermissionsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.core.internal.permissions.PermissionsViewModel$onRequestPermissionsResult$1", f = "PermissionsViewModel.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class PermissionsViewModel$onRequestPermissionsResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int[] $grantResults;
    final /* synthetic */ String[] $permissions;
    final /* synthetic */ boolean $shouldShowRationaleAfter;
    int label;
    final /* synthetic */ PermissionsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PermissionsViewModel$onRequestPermissionsResult$1(String[] strArr, int[] iArr, PermissionsViewModel permissionsViewModel, boolean z, Continuation<? super PermissionsViewModel$onRequestPermissionsResult$1> continuation) {
        super(2, continuation);
        this.$permissions = strArr;
        this.$grantResults = iArr;
        this.this$0 = permissionsViewModel;
        this.$shouldShowRationaleAfter = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PermissionsViewModel$onRequestPermissionsResult$1(this.$permissions, this.$grantResults, this.this$0, this.$shouldShowRationaleAfter, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PermissionsViewModel$onRequestPermissionsResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IPreferencesService preferenceService;
        boolean z;
        IPreferencesService preferenceService2;
        MutableStateFlow mutableStateFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(500L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        String[] strArr = this.$permissions;
        boolean z2 = false;
        if (strArr.length == 0) {
            z = false;
        } else {
            String str = strArr[0];
            int[] iArr = this.$grantResults;
            boolean z3 = !(iArr.length == 0) && iArr[0] == 0;
            if (z3) {
                preferenceService2 = this.this$0.getPreferenceService();
                preferenceService2.saveBool("OneSignal", PreferenceOneSignalKeys.PREFS_OS_USER_RESOLVED_PERMISSION_PREFIX + str, Boxing.boxBoolean(true));
            } else {
                z2 = this.this$0.shouldShowSettings(str, this.$shouldShowRationaleAfter);
            }
            preferenceService = this.this$0.getPreferenceService();
            preferenceService.saveBool("OneSignal", PreferenceOneSignalKeys.PREFS_OS_PROMPTED_PERMISSION_PREFIX + str, Boxing.boxBoolean(true));
            z = z2;
            z2 = z3;
        }
        this.this$0.executeCallback(z2, z);
        mutableStateFlow = this.this$0._shouldFinish;
        mutableStateFlow.setValue(Boxing.boxBoolean(true));
        return Unit.INSTANCE;
    }
}
