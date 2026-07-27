package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import b2.AbstractC0279e;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.x3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1098x3 implements F5 {
    @Override // io.appmetrica.analytics.impl.F5, t4.InterfaceC1441l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, String> invoke(ContentValues contentValues) {
        String asString = contentValues.getAsString("clids");
        HashMap c2 = AbstractC0847nb.c(asString);
        if (Jm.a(c2)) {
            return c2;
        }
        AbstractC0777kj.a(AbstractC0279e.f("Passed clids (", asString, ") are invalid."), new Object[0]);
        return null;
    }
}
