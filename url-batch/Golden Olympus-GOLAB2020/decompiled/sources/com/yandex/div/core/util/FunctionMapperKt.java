package com.yandex.div.core.util;

import O1.C0809f6;
import O1.C0827g6;
import O1.EnumC0915l5;
import W1.m;
import com.yandex.div.core.expression.local.LocalFunction;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class FunctionMapperKt {

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC0915l5.values().length];
            try {
                iArr[EnumC0915l5.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0915l5.INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0915l5.NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC0915l5.BOOLEAN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC0915l5.DATETIME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC0915l5.COLOR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC0915l5.URL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC0915l5.DICT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC0915l5.ARRAY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final EvaluableType toEvaluableType(EnumC0915l5 enumC0915l5) {
        switch (WhenMappings.$EnumSwitchMapping$0[enumC0915l5.ordinal()]) {
            case 1:
                return EvaluableType.STRING;
            case 2:
                return EvaluableType.INTEGER;
            case 3:
                return EvaluableType.NUMBER;
            case 4:
                return EvaluableType.BOOLEAN;
            case 5:
                return EvaluableType.DATETIME;
            case 6:
                return EvaluableType.COLOR;
            case 7:
                return EvaluableType.URL;
            case 8:
                return EvaluableType.DICT;
            case 9:
                return EvaluableType.ARRAY;
            default:
                throw new m();
        }
    }

    @NotNull
    public static final List<LocalFunction> toLocalFunctions(@NotNull List<C0809f6> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<C0809f6> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (C0809f6 c0809f6 : list2) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (C0827g6 c0827g6 : c0809f6.f6175a) {
                arrayList2.add(c0827g6.f6228a);
                arrayList3.add(new FunctionArgument(toEvaluableType(c0827g6.f6229b), false, 2, null));
            }
            arrayList.add(new LocalFunction(c0809f6.f6177c, arrayList3, toEvaluableType(c0809f6.f6178d), arrayList2, c0809f6.f6176b));
        }
        return arrayList;
    }
}
