package com.yandex.div.core.util.mask;

import com.yandex.div.core.util.mask.BaseInputMask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public class FixedLengthInputMask extends BaseInputMask {

    @NotNull
    private final Function1<Exception, Unit> onError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FixedLengthInputMask(@NotNull BaseInputMask.MaskData initialMaskData, @NotNull Function1<? super Exception, Unit> onError) {
        super(initialMaskData);
        Intrinsics.checkNotNullParameter(initialMaskData, "initialMaskData");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.onError = onError;
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void onException(@NotNull Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.onError.invoke(exception);
    }
}
