package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class L3 implements U5 {
    @Override // io.appmetrica.analytics.impl.U5, kotlin.jvm.functions.Function1
    @Nullable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, String> invoke(@NotNull ContentValues contentValues) {
        String asString = contentValues.getAsString("clids");
        HashMap c4 = Bb.c(asString);
        if (Gm.a(c4)) {
            return c4;
        }
        AbstractC2967sj.a("Passed clids (" + asString + ") are invalid.", new Object[0]);
        return null;
    }
}
