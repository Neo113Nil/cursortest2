package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import java.util.HashMap;
import java.util.Map;
import w0.AbstractC1234c;

/* renamed from: io.appmetrica.analytics.impl.x3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0947x3 implements F5 {
    @Override // io.appmetrica.analytics.impl.F5, l2.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, String> invoke(ContentValues contentValues) {
        String asString = contentValues.getAsString("clids");
        HashMap c3 = AbstractC0696nb.c(asString);
        if (Jm.a(c3)) {
            return c3;
        }
        AbstractC0626kj.a(AbstractC1234c.a("Passed clids (", asString, ") are invalid."), new Object[0]);
        return null;
    }
}
