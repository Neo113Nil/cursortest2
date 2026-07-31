package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.q3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0444q3 implements InterfaceC0670z5 {
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, String> invoke(ContentValues contentValues) {
        String asString = contentValues.getAsString("clids");
        HashMap c = AbstractC0224hb.c(asString);
        if (Gm.a(c)) {
            return c;
        }
        AbstractC0206gj.a("Passed clids (" + asString + ") are invalid.", new Object[0]);
        return null;
    }
}
