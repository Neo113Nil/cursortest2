package com.yandex.div.core.extension;

import O1.InterfaceC0752c3;
import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public class DivExtensionController {

    @NotNull
    private final List<DivExtensionHandler> extensionHandlers;

    /* JADX WARN: Multi-variable type inference failed */
    public DivExtensionController(@NotNull List<? extends DivExtensionHandler> extensionHandlers) {
        Intrinsics.checkNotNullParameter(extensionHandlers, "extensionHandlers");
        this.extensionHandlers = extensionHandlers;
    }

    private boolean hasExtensions(InterfaceC0752c3 interfaceC0752c3) {
        List extensions = interfaceC0752c3.getExtensions();
        return (extensions == null || extensions.isEmpty() || this.extensionHandlers.isEmpty()) ? false : true;
    }

    public void beforeBindView(@NotNull Div2View divView, @NotNull ExpressionResolver resolver, @NotNull View view, @NotNull InterfaceC0752c3 div) {
        Intrinsics.checkNotNullParameter(divView, "divView");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(div, "div");
        if (hasExtensions(div)) {
            for (DivExtensionHandler divExtensionHandler : this.extensionHandlers) {
                if (divExtensionHandler.matches(div)) {
                    divExtensionHandler.beforeBindView(divView, resolver, view, div);
                }
            }
        }
    }

    public void bindView(@NotNull Div2View divView, @NotNull ExpressionResolver resolver, @NotNull View view, @NotNull InterfaceC0752c3 div) {
        Intrinsics.checkNotNullParameter(divView, "divView");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(div, "div");
        if (hasExtensions(div)) {
            for (DivExtensionHandler divExtensionHandler : this.extensionHandlers) {
                if (divExtensionHandler.matches(div)) {
                    divExtensionHandler.bindView(divView, resolver, view, div);
                }
            }
        }
    }

    public void preprocessExtensions(@NotNull InterfaceC0752c3 div, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        if (hasExtensions(div)) {
            for (DivExtensionHandler divExtensionHandler : this.extensionHandlers) {
                if (divExtensionHandler.matches(div)) {
                    divExtensionHandler.preprocess(div, resolver);
                }
            }
        }
    }

    public void unbindView(@NotNull Div2View divView, @NotNull ExpressionResolver resolver, @NotNull View view, @NotNull InterfaceC0752c3 div) {
        Intrinsics.checkNotNullParameter(divView, "divView");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(div, "div");
        if (hasExtensions(div)) {
            for (DivExtensionHandler divExtensionHandler : this.extensionHandlers) {
                if (divExtensionHandler.matches(div)) {
                    divExtensionHandler.unbindView(divView, resolver, view, div);
                }
            }
        }
    }
}
