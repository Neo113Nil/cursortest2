package com.artillery.ctc.exts;

import androidx.annotation.Keep;
import f6.a;
import f6.l;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class CommontExtKt {
    @Keep
    public static final void tryCatch(l onError, a block) {
        s.checkNotNullParameter(onError, "onError");
        s.checkNotNullParameter(block, "block");
        try {
            block.invoke();
        } catch (Exception e8) {
            onError.invoke(e8);
        }
    }
}
