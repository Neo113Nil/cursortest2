package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.types.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class ColorBlueComponentGetter extends ColorComponentGetter {

    @NotNull
    public static final ColorBlueComponentGetter INSTANCE = new ColorBlueComponentGetter();

    @NotNull
    private static final String name = "getColorBlue";

    @Metadata
    /* renamed from: com.yandex.div.evaluable.function.ColorBlueComponentGetter$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements Function1<Color, Integer> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m174invokecIhhviA(((Color) obj).m218unboximpl());
        }

        @NotNull
        /* renamed from: invoke-cIhhviA, reason: not valid java name */
        public final Integer m174invokecIhhviA(int i4) {
            return Integer.valueOf(Color.m209blueimpl(i4));
        }
    }

    private ColorBlueComponentGetter() {
        super(AnonymousClass1.INSTANCE);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
