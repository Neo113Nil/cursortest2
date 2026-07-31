package com.yandex.div.core.view2.errors;

import android.view.ViewGroup;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.ViewBindingProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class ErrorVisualMonitor {

    @NotNull
    private final ViewBindingProvider bindingProvider;
    private boolean enabled;

    @NotNull
    private final ErrorModel errorModel;

    @Nullable
    private ErrorView errorView;

    @Nullable
    private ViewGroup lastConnectionView;
    private final boolean showPermanently;
    private final boolean visualErrorsEnabled;

    public ErrorVisualMonitor(@NotNull ErrorCollectors errorCollectors, @NotNull Div2View divView, boolean z4, boolean z5, @NotNull ViewBindingProvider bindingProvider) {
        Intrinsics.checkNotNullParameter(errorCollectors, "errorCollectors");
        Intrinsics.checkNotNullParameter(divView, "divView");
        Intrinsics.checkNotNullParameter(bindingProvider, "bindingProvider");
        this.visualErrorsEnabled = z4;
        this.showPermanently = z5;
        this.bindingProvider = bindingProvider;
        this.enabled = z4 || z5;
        this.errorModel = new ErrorModel(errorCollectors, divView, z4);
        connectOrDisconnect();
    }

    private final void connectOrDisconnect() {
        if (!this.enabled) {
            ErrorView errorView = this.errorView;
            if (errorView != null) {
                errorView.close();
            }
            this.errorView = null;
            return;
        }
        this.bindingProvider.observeAndGet(new ErrorVisualMonitor$connectOrDisconnect$1(this));
        ViewGroup viewGroup = this.lastConnectionView;
        if (viewGroup != null) {
            connect(viewGroup);
        }
    }

    public final void connect(@NotNull ViewGroup root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.lastConnectionView = root;
        if (this.enabled) {
            ErrorView errorView = this.errorView;
            if (errorView != null) {
                errorView.close();
            }
            this.errorView = new ErrorView(root, this.errorModel, this.showPermanently);
        }
    }

    public final boolean getEnabled$div_release() {
        return this.enabled;
    }

    public final void setEnabled$div_release(boolean z4) {
        this.enabled = z4;
        connectOrDisconnect();
    }
}
