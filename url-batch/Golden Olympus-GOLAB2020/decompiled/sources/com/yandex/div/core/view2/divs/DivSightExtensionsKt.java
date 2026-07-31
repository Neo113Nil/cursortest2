package com.yandex.div.core.view2.divs;

import O1.M4;
import O1.Wf;
import O1.Xb;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.json.expressions.Expression;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivSightExtensionsKt {
    @NotNull
    public static final Expression<Long> getDuration(@NotNull Xb xb) {
        Intrinsics.checkNotNullParameter(xb, "<this>");
        if (xb instanceof Wf) {
            return ((Wf) xb).f5186j;
        }
        if (xb instanceof M4) {
            return ((M4) xb).f3831a;
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("Trying to get duration field for unsupported DivSightAction class");
        }
        return Expression.Companion.constant(0L);
    }
}
