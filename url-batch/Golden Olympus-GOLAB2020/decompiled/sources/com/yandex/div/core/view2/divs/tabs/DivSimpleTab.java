package com.yandex.div.core.view2.divs.tabs;

import O1.C0892k0;
import O1.C1013qd;
import O1.Yb;
import android.util.DisplayMetrics;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivSimpleTab implements BaseDivTabbedCardUi.Input.TabBase {

    @NotNull
    private final DisplayMetrics displayMetrics;

    @NotNull
    private final C1013qd.c item;

    @NotNull
    private final ExpressionResolver resolver;

    public DivSimpleTab(@NotNull C1013qd.c item, @NotNull DisplayMetrics displayMetrics, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        this.item = item;
        this.displayMetrics = displayMetrics;
        this.resolver = resolver;
    }

    @NotNull
    public C1013qd.c getItem() {
        return this.item;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input.TabBase
    @Nullable
    public Integer getTabHeight() {
        Yb height = this.item.f7643a.b().getHeight();
        if (height instanceof Yb.c) {
            return Integer.valueOf(BaseDivViewExtensionsKt.toLayoutParamsSize$default(height, this.displayMetrics, this.resolver, null, 4, null));
        }
        return null;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input.TabBase
    @NotNull
    public Integer getTabHeightLayoutParam() {
        return Integer.valueOf(BaseDivViewExtensionsKt.toLayoutParamsSize$default(this.item.f7643a.b().getHeight(), this.displayMetrics, this.resolver, null, 4, null));
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input.TabBase
    @NotNull
    public String getTitle() {
        return (String) this.item.f7644b.evaluate(this.resolver);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input.TabBase
    @Nullable
    public C0892k0 getActionable() {
        return this.item.f7645c;
    }
}
