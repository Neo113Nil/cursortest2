package com.yandex.div.core.view2.divs.gallery;

import O1.C0970o6;
import W1.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class ScrollPositionKt {

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[C0970o6.e.values().length];
            try {
                iArr[C0970o6.e.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C0970o6.e.PAGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final ScrollPosition toScrollPosition(@NotNull C0970o6.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        int i4 = WhenMappings.$EnumSwitchMapping$0[eVar.ordinal()];
        if (i4 == 1) {
            return ScrollPosition.DEFAULT;
        }
        if (i4 == 2) {
            return ScrollPosition.CENTER;
        }
        throw new m();
    }
}
