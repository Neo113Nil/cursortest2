package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
interface PatternCompiler {
    CommonPattern compile(String str);

    boolean isPcreLike();
}
