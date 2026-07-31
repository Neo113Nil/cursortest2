package com.yandex.div.core.view2.animations;

import O1.Bc;
import O1.C1165z4;
import O1.EnumC0979of;
import O1.EnumC0997pf;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivTransitionsKt {

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC0979of.values().length];
            try {
                iArr[EnumC0979of.DATA_CHANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0979of.ANY_CHANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0979of.STATE_CHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean allowsTransitionsOnDataChange(@NotNull EnumC0979of enumC0979of) {
        Intrinsics.checkNotNullParameter(enumC0979of, "<this>");
        int i4 = WhenMappings.$EnumSwitchMapping$0[enumC0979of.ordinal()];
        return i4 == 1 || i4 == 2;
    }

    public static final boolean allowsTransitionsOnStateChange(@NotNull EnumC0979of enumC0979of) {
        Intrinsics.checkNotNullParameter(enumC0979of, "<this>");
        int i4 = WhenMappings.$EnumSwitchMapping$0[enumC0979of.ordinal()];
        return i4 == 2 || i4 == 3;
    }

    public static final boolean allowsTransitionsOnVisibilityChange(@NotNull List<? extends EnumC0997pf> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.contains(EnumC0997pf.VISIBILITY_CHANGE);
    }

    public static final boolean allowsTransitionsOnDataChange(@NotNull List<? extends EnumC0997pf> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.contains(EnumC0997pf.DATA_CHANGE);
    }

    public static final boolean allowsTransitionsOnStateChange(@NotNull List<? extends EnumC0997pf> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.contains(EnumC0997pf.STATE_CHANGE);
    }

    public static final boolean allowsTransitionsOnDataChange(@NotNull C1165z4 c1165z4, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(c1165z4, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return allowsTransitionsOnDataChange((EnumC0979of) c1165z4.f8713e.evaluate(resolver));
    }

    public static final boolean allowsTransitionsOnStateChange(@NotNull Bc bc, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(bc, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return allowsTransitionsOnStateChange((EnumC0979of) bc.f1492B.evaluate(resolver));
    }
}
