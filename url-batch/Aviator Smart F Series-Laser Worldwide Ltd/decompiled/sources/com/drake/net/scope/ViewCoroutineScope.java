package com.drake.net.scope;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.t0;

/* loaded from: classes3.dex */
public final class ViewCoroutineScope extends NetCoroutineScope {
    private final View view;

    public /* synthetic */ ViewCoroutineScope(View view, CoroutineDispatcher coroutineDispatcher, int i8, o oVar) {
        this(view, (i8 & 2) != 0 ? t0.getMain() : coroutineDispatcher);
    }

    public final View getView() {
        return this.view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewCoroutineScope(View view, CoroutineDispatcher dispatcher) {
        super(null, null, dispatcher, 3, null);
        Lifecycle lifecycle;
        s.checkNotNullParameter(view, "view");
        s.checkNotNullParameter(dispatcher, "dispatcher");
        this.view = view;
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(view);
        if (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
            return;
        }
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.drake.net.scope.ViewCoroutineScope.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                s.checkNotNullParameter(source, "source");
                s.checkNotNullParameter(event, "event");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    AndroidScope.cancel$default(ViewCoroutineScope.this, null, 1, null);
                }
            }
        });
    }
}
