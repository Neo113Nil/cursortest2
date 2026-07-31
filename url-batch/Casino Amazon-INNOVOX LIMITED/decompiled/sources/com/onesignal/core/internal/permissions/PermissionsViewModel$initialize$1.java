package com.onesignal.core.internal.permissions;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PermissionsViewModel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.core.internal.permissions.PermissionsViewModel", f = "PermissionsViewModel.kt", i = {0, 0, 0}, l = {57}, m = "initialize", n = {"this", "permissionType", "androidPermission"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes3.dex */
final class PermissionsViewModel$initialize$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PermissionsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PermissionsViewModel$initialize$1(PermissionsViewModel permissionsViewModel, Continuation<? super PermissionsViewModel$initialize$1> continuation) {
        super(continuation);
        this.this$0 = permissionsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.initialize(null, null, null, this);
    }
}
