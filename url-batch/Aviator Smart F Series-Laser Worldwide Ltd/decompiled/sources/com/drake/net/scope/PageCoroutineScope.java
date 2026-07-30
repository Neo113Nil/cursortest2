package com.drake.net.scope;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.drake.brv.PageRefreshLayout;
import com.drake.net.NetConfig;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.t0;

/* loaded from: classes3.dex */
public final class PageCoroutineScope extends NetCoroutineScope {
    private final PageRefreshLayout page;

    public /* synthetic */ PageCoroutineScope(PageRefreshLayout pageRefreshLayout, CoroutineDispatcher coroutineDispatcher, int i8, o oVar) {
        this(pageRefreshLayout, (i8 & 2) != 0 ? t0.getMain() : coroutineDispatcher);
    }

    @Override // com.drake.net.scope.NetCoroutineScope, com.drake.net.scope.AndroidScope
    /* renamed from: catch */
    protected void mo147catch(Throwable e8) {
        s.checkNotNullParameter(e8, "e");
        super.mo147catch(e8);
        PageRefreshLayout.showError$default(this.page, e8, false, 2, (Object) null);
    }

    @Override // com.drake.net.scope.AndroidScope
    /* renamed from: finally */
    protected void mo149finally(Throwable th) {
        super.mo149finally(th);
        if (th == null || (th instanceof CancellationException)) {
            PageRefreshLayout.showContent$default(this.page, false, (Object) null, 3, (Object) null);
        }
        this.page.trigger();
    }

    public final int getIndex() {
        return this.page.getIndex();
    }

    public final PageRefreshLayout getPage() {
        return this.page;
    }

    @Override // com.drake.net.scope.NetCoroutineScope, com.drake.net.scope.AndroidScope
    public void handleError(Throwable e8) {
        s.checkNotNullParameter(e8, "e");
        if (this.page.getLoaded() || !this.page.getStateEnabled()) {
            NetConfig.INSTANCE.getErrorHandler().onError(e8);
        } else {
            NetConfig.INSTANCE.getErrorHandler().onStateError(e8, (View) this.page);
        }
    }

    @Override // com.drake.net.scope.NetCoroutineScope
    protected void previewFinish(boolean z7) {
        super.previewFinish(z7);
        if (z7 && getPreviewBreakLoading()) {
            PageRefreshLayout.showContent$default(this.page, false, (Object) null, 3, (Object) null);
        }
        this.page.setLoaded(z7);
    }

    @Override // com.drake.net.scope.NetCoroutineScope
    protected void start() {
        setPreviewEnabled(!this.page.getLoaded());
        this.page.trigger();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageCoroutineScope(PageRefreshLayout page, CoroutineDispatcher dispatcher) {
        super(null, null, dispatcher, 3, null);
        Lifecycle lifecycle;
        s.checkNotNullParameter(page, "page");
        s.checkNotNullParameter(dispatcher, "dispatcher");
        this.page = page;
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get((View) page);
        if (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
            return;
        }
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.drake.net.scope.PageCoroutineScope.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                s.checkNotNullParameter(source, "source");
                s.checkNotNullParameter(event, "event");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    AndroidScope.cancel$default(PageCoroutineScope.this, null, 1, null);
                }
            }
        });
    }
}
