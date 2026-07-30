package com.drake.net.scope;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.drake.net.NetConfig;
import com.drake.statelayout.StateLayout;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.t0;

/* loaded from: classes3.dex */
public final class StateCoroutineScope extends NetCoroutineScope {
    private final StateLayout state;

    public /* synthetic */ StateCoroutineScope(StateLayout stateLayout, CoroutineDispatcher coroutineDispatcher, int i8, o oVar) {
        this(stateLayout, (i8 & 2) != 0 ? t0.getMain() : coroutineDispatcher);
    }

    @Override // com.drake.net.scope.NetCoroutineScope, com.drake.net.scope.AndroidScope
    /* renamed from: catch */
    protected void mo147catch(Throwable e8) {
        s.checkNotNullParameter(e8, "e");
        super.mo147catch(e8);
        if (getPreviewSucceed()) {
            return;
        }
        this.state.showError(e8);
    }

    @Override // com.drake.net.scope.AndroidScope
    /* renamed from: finally */
    protected void mo149finally(Throwable th) {
        super.mo149finally(th);
        if (th == null || (th instanceof CancellationException)) {
            StateLayout.showContent$default(this.state, (Object) null, 1, (Object) null);
        }
        this.state.trigger();
    }

    public final StateLayout getState() {
        return this.state;
    }

    @Override // com.drake.net.scope.NetCoroutineScope, com.drake.net.scope.AndroidScope
    public void handleError(Throwable e8) {
        s.checkNotNullParameter(e8, "e");
        NetConfig.INSTANCE.getErrorHandler().onStateError(e8, (View) this.state);
    }

    @Override // com.drake.net.scope.NetCoroutineScope
    protected void previewFinish(boolean z7) {
        super.previewFinish(z7);
        if (z7) {
            StateLayout.showContent$default(this.state, (Object) null, 1, (Object) null);
        }
    }

    @Override // com.drake.net.scope.NetCoroutineScope
    protected void start() {
        setPreviewEnabled(!this.state.getLoaded());
        this.state.trigger();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateCoroutineScope(StateLayout state, CoroutineDispatcher dispatcher) {
        super(null, null, dispatcher, 3, null);
        Lifecycle lifecycle;
        s.checkNotNullParameter(state, "state");
        s.checkNotNullParameter(dispatcher, "dispatcher");
        this.state = state;
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get((View) state);
        if (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
            return;
        }
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.drake.net.scope.StateCoroutineScope.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                s.checkNotNullParameter(source, "source");
                s.checkNotNullParameter(event, "event");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    AndroidScope.cancel$default(StateCoroutineScope.this, null, 1, null);
                }
            }
        });
    }
}
