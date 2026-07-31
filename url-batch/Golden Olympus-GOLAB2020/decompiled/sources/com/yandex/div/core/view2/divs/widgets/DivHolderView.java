package com.yandex.div.core.view2.divs.widgets;

import O1.Z;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.TransientView;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface DivHolderView<T extends Z> extends DivBorderSupports, TransientView, ExpressionSubscriber {
    @Nullable
    BindingContext getBindingContext();

    @Nullable
    T getDiv();

    default void release() {
        super.release();
        setDiv(null);
        setBindingContext(null);
        releaseBorderDrawer();
    }

    void setBindingContext(@Nullable BindingContext bindingContext);

    void setDiv(@Nullable T t4);
}
