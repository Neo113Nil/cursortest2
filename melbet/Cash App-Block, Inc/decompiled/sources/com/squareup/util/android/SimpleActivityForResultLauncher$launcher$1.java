package com.squareup.util.android;

import androidx.activity.result.ActivityResultCallback;
import kotlin.Function;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.Channel;

/* loaded from: classes.dex */
public final /* synthetic */ class SimpleActivityForResultLauncher$launcher$1 implements ActivityResultCallback, FunctionAdapter {
    public final /* synthetic */ BufferedChannel $tmp0;

    public SimpleActivityForResultLauncher$launcher$1(BufferedChannel bufferedChannel) {
        this.$tmp0 = bufferedChannel;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ActivityResultCallback) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return new AdaptedFunctionReference(1, 8, Channel.class, this.$tmp0, "trySend", "trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object obj) {
        obj.getClass();
        this.$tmp0.mo1159trySendJP2dKIU(obj);
    }
}
