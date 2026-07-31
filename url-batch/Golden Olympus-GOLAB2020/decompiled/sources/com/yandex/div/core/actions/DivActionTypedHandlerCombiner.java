package com.yandex.div.core.actions;

import O1.AbstractC0948n2;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.KLog;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivActionTypedHandlerCombiner {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Set<DivActionTypedHandler> handlers;

    @Metadata
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DivActionTypedHandlerCombiner(@NotNull Set<DivActionTypedHandler> handlers) {
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        this.handlers = handlers;
    }

    public final boolean handleAction(@Nullable String str, @NotNull AbstractC0948n2 action, @NotNull Div2View div2View, @NotNull ExpressionResolver resolver) {
        Object obj;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(div2View, "div2View");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Iterator<T> it = this.handlers.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((DivActionTypedHandler) obj).handleAction(str, action, div2View, resolver)) {
                break;
            }
        }
        boolean z4 = obj != null;
        if (!z4) {
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.DEBUG)) {
                kLog.print(3, "DivTypedActionHandlerCombiner", "Unexpected " + action.getClass() + " was not handled");
            }
        }
        return z4;
    }
}
