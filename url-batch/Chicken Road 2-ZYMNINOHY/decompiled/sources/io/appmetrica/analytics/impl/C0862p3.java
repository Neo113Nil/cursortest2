package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import java.util.HashMap;
import java.util.Map;
import x.AbstractC1514c;

/* renamed from: io.appmetrica.analytics.impl.p3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0862p3 implements InterfaceC1097y5 {
    @Override // io.appmetrica.analytics.impl.InterfaceC1097y5, o3.InterfaceC1339l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, String> invoke(ContentValues contentValues) {
        String asString = contentValues.getAsString("clids");
        HashMap c4 = AbstractC0637gb.c(asString);
        if (Fm.a(c4)) {
            return c4;
        }
        AbstractC0619fj.a(AbstractC1514c.a("Passed clids (", asString, ") are invalid."), new Object[0]);
        return null;
    }
}
