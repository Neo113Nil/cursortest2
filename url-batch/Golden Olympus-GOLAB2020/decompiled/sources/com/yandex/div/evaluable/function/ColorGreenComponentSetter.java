package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.types.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class ColorGreenComponentSetter extends ColorComponentSetter {

    @NotNull
    public static final ColorGreenComponentSetter INSTANCE = new ColorGreenComponentSetter();

    @NotNull
    private static final String name = "setColorGreen";

    @Metadata
    /* renamed from: com.yandex.div.evaluable.function.ColorGreenComponentSetter$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements Function2<Color, Double, Color> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return Color.m210boximpl(m177invokeGnj5c28(((Color) obj).m218unboximpl(), ((Number) obj2).doubleValue()));
        }

        /* renamed from: invoke-Gnj5c28, reason: not valid java name */
        public final int m177invokeGnj5c28(int i4, double d4) {
            return Color.Companion.m219argbH0kstlE(Color.m208alphaimpl(i4), Color.m216redimpl(i4), ColorFunctionsKt.toColorIntComponentValue(d4), Color.m209blueimpl(i4));
        }
    }

    private ColorGreenComponentSetter() {
        super(AnonymousClass1.INSTANCE);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
