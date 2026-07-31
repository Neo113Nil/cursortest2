package com.yandex.div.evaluable;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class Function$toString$1 extends s implements Function1<FunctionArgument, CharSequence> {
    public static final Function$toString$1 INSTANCE = new Function$toString$1();

    Function$toString$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final CharSequence invoke(@NotNull FunctionArgument arg) {
        Intrinsics.checkNotNullParameter(arg, "arg");
        if (!arg.isVariadic()) {
            return arg.getType().toString();
        }
        return "vararg " + arg.getType();
    }
}
