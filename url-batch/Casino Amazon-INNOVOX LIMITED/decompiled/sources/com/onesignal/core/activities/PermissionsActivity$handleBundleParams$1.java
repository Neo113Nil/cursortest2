package com.onesignal.core.activities;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PermissionsActivity.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.core.activities.PermissionsActivity", f = "PermissionsActivity.kt", i = {0, 0}, l = {92}, m = "handleBundleParams", n = {"this", "androidPermissionString"}, s = {"L$0", "L$1"})
/* loaded from: classes2.dex */
final class PermissionsActivity$handleBundleParams$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PermissionsActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PermissionsActivity$handleBundleParams$1(PermissionsActivity permissionsActivity, Continuation<? super PermissionsActivity$handleBundleParams$1> continuation) {
        super(continuation);
        this.this$0 = permissionsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object handleBundleParams;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        handleBundleParams = this.this$0.handleBundleParams(null, this);
        return handleBundleParams;
    }
}
