package com.yandex.div.core.actions;

import O1.AbstractC0948n2;
import O1.Q0;
import W1.m;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.net.Uri;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.Assert;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivActionTypedCopyToClipboardHandler implements DivActionTypedHandler {
    private final ClipData getClipData(Q0 q02, ExpressionResolver expressionResolver) {
        if (q02 instanceof Q0.c) {
            return getClipData((Q0.c) q02, expressionResolver);
        }
        if (q02 instanceof Q0.d) {
            return getClipData((Q0.d) q02, expressionResolver);
        }
        throw new m();
    }

    private final void handleCopyToClipboard(Q0 q02, Div2View div2View, ExpressionResolver expressionResolver) {
        Object systemService = div2View.getContext$div_release().getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            Assert.fail("Failed to access clipboard manager!");
        } else {
            clipboardManager.setPrimaryClip(getClipData(q02, expressionResolver));
        }
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String str, @NotNull AbstractC0948n2 action, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        if (!(action instanceof AbstractC0948n2.i)) {
            return false;
        }
        handleCopyToClipboard(((AbstractC0948n2.i) action).c().f4290a, view, resolver);
        return true;
    }

    private final ClipData getClipData(Q0.d dVar, ExpressionResolver expressionResolver) {
        return new ClipData("Copied url", new String[]{"text/uri-list"}, new ClipData.Item((Uri) dVar.c().f3289a.evaluate(expressionResolver)));
    }

    private final ClipData getClipData(Q0.c cVar, ExpressionResolver expressionResolver) {
        return new ClipData("Copied text", new String[]{"text/plain"}, new ClipData.Item((String) cVar.c().f2488a.evaluate(expressionResolver)));
    }
}
