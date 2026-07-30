package com.drake.net.scope;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.drake.net.NetConfig;
import f6.l;
import f6.p;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.i;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.t0;
import y5.w;

/* loaded from: classes3.dex */
public class NetCoroutineScope extends AndroidScope {
    private p preview;
    private boolean previewBreakError;
    private boolean previewBreakLoading;
    private boolean previewEnabled;
    private boolean previewSucceed;

    public NetCoroutineScope() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ AndroidScope preview$default(NetCoroutineScope netCoroutineScope, boolean z7, boolean z8, p pVar, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preview");
        }
        if ((i8 & 1) != 0) {
            z7 = false;
        }
        if ((i8 & 2) != 0) {
            z8 = true;
        }
        return netCoroutineScope.preview(z7, z8, pVar);
    }

    @Override // com.drake.net.scope.AndroidScope
    public void cancel(CancellationException cancellationException) {
        com.drake.net.a.cancelGroup(getScopeGroup());
        super.cancel(cancellationException);
    }

    @Override // com.drake.net.scope.AndroidScope
    /* renamed from: catch */
    protected void mo147catch(Throwable e8) {
        w wVar;
        s.checkNotNullParameter(e8, "e");
        p pVar = getCatch();
        if (pVar != null) {
            pVar.invoke(this, e8);
            wVar = w.INSTANCE;
        } else {
            wVar = null;
        }
        if (wVar != null || getPreviewBreakError()) {
            return;
        }
        handleError(e8);
    }

    protected final p getPreview() {
        return this.preview;
    }

    protected final boolean getPreviewBreakError() {
        if (getPreviewSucceed()) {
            return this.previewBreakError;
        }
        return false;
    }

    protected final boolean getPreviewBreakLoading() {
        return this.previewBreakLoading;
    }

    protected final boolean getPreviewEnabled() {
        return this.previewEnabled;
    }

    protected final boolean getPreviewSucceed() {
        if (this.preview != null) {
            return this.previewSucceed;
        }
        return false;
    }

    @Override // com.drake.net.scope.AndroidScope
    public void handleError(Throwable e8) {
        s.checkNotNullParameter(e8, "e");
        NetConfig.INSTANCE.getErrorHandler().onError(e8);
    }

    public final AndroidScope preview(boolean z7, boolean z8, p block) {
        s.checkNotNullParameter(block, "block");
        this.previewBreakError = z7;
        this.previewBreakLoading = z8;
        this.preview = block;
        return this;
    }

    protected void previewFinish(boolean z7) {
        this.previewEnabled = false;
    }

    protected final void setPreview(p pVar) {
        this.preview = pVar;
    }

    protected final void setPreviewBreakError(boolean z7) {
        this.previewBreakError = z7;
    }

    protected final void setPreviewBreakLoading(boolean z7) {
        this.previewBreakLoading = z7;
    }

    protected final void setPreviewEnabled(boolean z7) {
        this.previewEnabled = z7;
    }

    protected final void setPreviewSucceed(boolean z7) {
        this.previewSucceed = z7;
    }

    protected void start() {
    }

    public /* synthetic */ NetCoroutineScope(LifecycleOwner lifecycleOwner, Lifecycle.Event event, CoroutineDispatcher coroutineDispatcher, int i8, o oVar) {
        this((i8 & 1) != 0 ? null : lifecycleOwner, (i8 & 2) != 0 ? Lifecycle.Event.ON_DESTROY : event, (i8 & 4) != 0 ? t0.getMain() : coroutineDispatcher);
    }

    @Override // com.drake.net.scope.AndroidScope
    public NetCoroutineScope launch(p block) {
        l1 launch$default;
        s.checkNotNullParameter(block, "block");
        launch$default = i.launch$default(this, EmptyCoroutineContext.INSTANCE, null, new NetCoroutineScope$launch$1(this, block, null), 2, null);
        launch$default.invokeOnCompletion(new l() { // from class: com.drake.net.scope.NetCoroutineScope$launch$2
            {
                super(1);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return w.INSTANCE;
            }

            public final void invoke(Throwable th) {
                NetCoroutineScope.this.mo149finally(th);
            }
        });
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetCoroutineScope(LifecycleOwner lifecycleOwner, Lifecycle.Event lifeEvent, CoroutineDispatcher dispatcher) {
        super(lifecycleOwner, lifeEvent, dispatcher);
        s.checkNotNullParameter(lifeEvent, "lifeEvent");
        s.checkNotNullParameter(dispatcher, "dispatcher");
        this.previewEnabled = true;
        this.previewBreakLoading = true;
    }
}
