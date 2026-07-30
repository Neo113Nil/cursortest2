package com.drake.net.utils;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.drake.net.scope.AndroidScope;
import com.drake.net.scope.NetCoroutineScope;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class ScopeKt$scopeNetLife$1$1 implements LifecycleEventObserver {
    final /* synthetic */ NetCoroutineScope $coroutineScope;
    final /* synthetic */ Lifecycle.Event $lifeEvent;

    ScopeKt$scopeNetLife$1$1(Lifecycle.Event event, NetCoroutineScope netCoroutineScope) {
        this.$lifeEvent = event;
        this.$coroutineScope = netCoroutineScope;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        s.checkNotNullParameter(source, "source");
        s.checkNotNullParameter(event, "event");
        if (this.$lifeEvent == event) {
            AndroidScope.cancel$default(this.$coroutineScope, null, 1, null);
        }
    }
}
