package com.yandex.div.core.view2;

import O1.EnumC0791e6;
import android.graphics.Typeface;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.div.core.font.DivTypefaceProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivTypefaceResolverKt {

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC0791e6.values().length];
            try {
                iArr[EnumC0791e6.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0791e6.REGULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0791e6.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC0791e6.BOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Typeface getTypeface(int i4, @NotNull DivTypefaceProvider typefaceProvider) {
        Intrinsics.checkNotNullParameter(typefaceProvider, "typefaceProvider");
        Typeface typefaceFor = typefaceProvider.getTypefaceFor(i4);
        return typefaceFor == null ? Typeface.DEFAULT : typefaceFor;
    }

    public static final int getTypefaceValue(@Nullable EnumC0791e6 enumC0791e6, @Nullable Integer num) {
        if (num != null) {
            return num.intValue();
        }
        int i4 = enumC0791e6 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[enumC0791e6.ordinal()];
        if (i4 == 1) {
            return 300;
        }
        if (i4 == 2) {
            return 400;
        }
        if (i4 == 3) {
            return 500;
        }
        if (i4 != 4) {
            return 400;
        }
        return IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED;
    }

    public static final Typeface getTypeface(@Nullable EnumC0791e6 enumC0791e6, @Nullable Integer num, @NotNull DivTypefaceProvider typefaceProvider) {
        Intrinsics.checkNotNullParameter(typefaceProvider, "typefaceProvider");
        return getTypeface(getTypefaceValue(enumC0791e6, num), typefaceProvider);
    }
}
